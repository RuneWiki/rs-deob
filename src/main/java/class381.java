import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class381 extends IOException {
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5306 = new String[]{method3028(method3027("\u0019T\b>RE")), method3028(method3027("\u0019T\b>QE"))};
   @OriginalMember(
      owner = "client!tda",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field5299 = new int[8];
   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "Liba;"
   )
   public static class237 field5300 = new class237();
   @OriginalMember(
      owner = "client!tda",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field5305 = new float[4];
   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "[Lvia;"
   )
   public static class627[] field5304 = new class627[5];
   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "I"
   )
   public static int field5301;
   @OriginalMember(
      owner = "client!tda",
      name = "f",
      descriptor = "I"
   )
   public static int field5302;
   @OriginalMember(
      owner = "client!tda",
      name = "g",
      descriptor = "I"
   )
   public static int field5303;
   @OriginalMember(
      owner = "client!tda",
      name = "e",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field5298;

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3025(boolean arg0) {
      try {
         field5299 = null;
         field5298 = null;
         field5305 = null;
         if (arg0) {
            method3025(true);
         }

         field5304 = null;
         field5300 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5306[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method3026(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 > -62) {
            method3025(false);
         }

         class491.field6864 = arg1 - class326.field4499;
         class227.field2847 = -class326.field4502 + arg2;
         ++field5301;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5306[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class381(String arg0) {
      super(arg0);
   }

   static {
      for(int var0 = 0; ~field5304.length < ~var0; ++var0) {
         field5304[var0] = new class627();
      }

   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3027(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3028(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
