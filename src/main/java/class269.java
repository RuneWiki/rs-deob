import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class269 extends class96 {
   @OriginalMember(
      owner = "client!qt",
      name = "r",
      descriptor = "[[S"
   )
   public short[][] field4124;
   @OriginalMember(
      owner = "client!qt",
      name = "t",
      descriptor = "D"
   )
   public double field4127;
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4128 = new String[]{method2298(method2297("{H$B.")), method2298(method2297("{H$@.")), method2298(method2297("{H$?odU~=.")), method2298(method2297("dIfo")), method2298(method2297("q\u0012$-{")), method2298(method2297("{H$A."))};
   @OriginalMember(
      owner = "client!qt",
      name = "s",
      descriptor = "I"
   )
   public static int field4123 = -1;
   @OriginalMember(
      owner = "client!qt",
      name = "w",
      descriptor = "Lbu;"
   )
   public static class234 field4126 = new class234(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!qt",
      name = "v",
      descriptor = "I"
   )
   public static int field4122;
   @OriginalMember(
      owner = "client!qt",
      name = "u",
      descriptor = "I"
   )
   public static int field4125;
   @OriginalMember(
      owner = "client!qt",
      name = "q",
      descriptor = "[[B"
   )
   public static byte[][] field4121;

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2294(int arg0) {
      try {
         field4126 = null;
         if (arg0 < 87) {
            method2295(true, -16, -128, 22, 38, -104, -37, -30);
         }

         field4121 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4128[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(ZIIIIIII)V"
   )
   public static final void method2295(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qt",
      name = "b",
      descriptor = "(Z)J"
   )
   public final long method2296(boolean arg0) {
      try {
         ++field4125;
         if (arg0) {
            field4121 = null;
         }

         return (long)(this.field4124[0].length | this.field4124.length << 0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4128[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class269(short[][] arg0, double arg1) {
      try {
         this.field4124 = arg0;
         this.field4127 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4128[2] + (arg0 != null ? field4128[4] : field4128[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
