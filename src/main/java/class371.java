import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class371 {
   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5759 = new String[]{method3034(method3033("D#\u0002\u0006\u0010")), method3034(method3033("\\?@(")), method3034(method3033("Id\u0002jE")), method3034(method3033("D#\u0002\u0005\u0010"))};
   @OriginalMember(
      owner = "client!vi",
      name = "e",
      descriptor = "Lgh;"
   )
   public static class346 field5753 = class435.method3427((byte)80);
   @OriginalMember(
      owner = "client!vi",
      name = "f",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field5755 = new BigInteger(method3034(method3033("\u000b,Ju^P)Ow\t\u0000z\u001b ^Q}M\"\b\u0003\u007f\u001et\u000bWyO!]Sr\u001aq\tS+\u001b&\u000e\n~OrYV(\u001cw\n\u0002}Hu\f\u0005.\u0018q\nT+\u001cs\\\u0004/\u001esY\u0003s\u0014t\u000bQ{\u001er\t\n+Nw^\u0007)\u001a}YP}\u0018p\u000f\u0003(\u0018\"\u000b\u0002)Hv\u000f\u0007{\u001f'\u0001W/H!ZV~M'\u000eW\u007fM|\u0000Q\u007f\u0019")), 16);
   @OriginalMember(
      owner = "client!vi",
      name = "c",
      descriptor = "Lhf;"
   )
   public static class588 field5756 = new class588();
   @OriginalMember(
      owner = "client!vi",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field5757 = new float[4];
   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "Ljw;"
   )
   public static class779 field5758 = new class779(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "I"
   )
   public static int field5754;

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method3031(byte arg0) {
      try {
         field5755 = null;
         if (arg0 != -107) {
            method3031((byte)-22);
         }

         field5756 = null;
         field5757 = null;
         field5753 = null;
         field5758 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5759[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
      line = 30
   )
   public static final Class method3032(String arg0, byte arg1) throws ClassNotFoundException {
      try {
         ++field5754;
         if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg1 <= 3) {
            return null;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else if (arg0.equals("J")) {
            return Long.TYPE;
         } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
         } else if (arg0.equals("F")) {
            return Float.TYPE;
         } else if (arg0.equals("D")) {
            return Double.TYPE;
         } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5759[0] + (arg0 != null ? field5759[2] : field5759[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3033(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3034(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
