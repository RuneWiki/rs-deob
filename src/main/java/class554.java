import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class554 {
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8215 = new String[]{method4098(method4097("d\u001dMuS")), method4098(method4097("d\u001dMvS"))};
   @OriginalMember(
      owner = "client!hl",
      name = "h",
      descriptor = "Loi;"
   )
   public static class79 field8209 = new class79(1, 2);
   @OriginalMember(
      owner = "client!hl",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field8210 = true;
   @OriginalMember(
      owner = "client!hl",
      name = "e",
      descriptor = "Lsd;"
   )
   public static class101 field8211 = new class101(54, 6);
   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "Lpia;"
   )
   public static class102 field8213 = new class102("", 17);
   @OriginalMember(
      owner = "client!hl",
      name = "f",
      descriptor = "I"
   )
   public static int field8214 = 0;
   @OriginalMember(
      owner = "client!hl",
      name = "d",
      descriptor = "I"
   )
   public static int field8207;
   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "I"
   )
   public static int field8208;
   @OriginalMember(
      owner = "client!hl",
      name = "g",
      descriptor = "I"
   )
   public static int field8212;

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IFFIF)F",
      line = 8
   )
   public static final float method4095(int arg0, float arg1, float arg2, int arg3, float arg4) {
      try {
         int var5 = -76 % ((-76 - arg3) / 48);
         ++field8208;
         float[] var6 = class14.field171[arg0];
         return var6[2] * arg2 + var6[1] * arg1 + var6[0] * arg4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8215[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(Z)V",
      line = 24
   )
   public static void method4096(boolean arg0) {
      try {
         field8209 = null;
         field8213 = null;
         if (arg0) {
            field8214 = -110;
         }

         field8211 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8215[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4097(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4098(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
