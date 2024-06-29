import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class559 extends class575 {
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8016 = new String[]{method4011(method4010("S\u0010hT")), method4011(method4010("FK*\u0016&")), method4011(method4010("M\u0011*{s")), method4011(method4010("M\u0011*ys")), method4011(method4010("M\u0011*zs"))};
   @OriginalMember(
      owner = "client!pt",
      name = "g",
      descriptor = "I"
   )
   public static int field8015 = 0;
   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "I"
   )
   public static int field8010;
   @OriginalMember(
      owner = "client!pt",
      name = "e",
      descriptor = "I"
   )
   public static int field8011;
   @OriginalMember(
      owner = "client!pt",
      name = "h",
      descriptor = "I"
   )
   public static int field8013;
   @OriginalMember(
      owner = "client!pt",
      name = "c",
      descriptor = "I"
   )
   public static int field8014;
   @OriginalMember(
      owner = "client!pt",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8012;
   @OriginalMember(
      owner = "client!pt",
      name = "d",
      descriptor = "[[B"
   )
   public static byte[][] field8009;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(JZ)V",
      line = 6
   )
   public static final void method4007(long arg0, boolean arg1) {
      try {
         class176.field2431.setTime(new Date(arg0));
         if (arg1) {
            field8015 = -87;
         }

         ++field8014;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8016[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IIILrw;F[BFIFFIFI)V",
      line = 20
   )
   public static final void method4008(int param0, int param1, int param2, class791 param3, float param4, byte[] param5, float param6, int param7, float param8, float param9, int param10, float param11, int param12) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(B)V",
      line = 47
   )
   public static void method4009(byte arg0) {
      try {
         if (arg0 <= 21) {
            field8015 = 74;
         }

         field8009 = null;
         field8012 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8016[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4010(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4011(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
