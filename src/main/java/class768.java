import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class768 {
   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "[I"
   )
   public int[] field11266;
   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "[[F"
   )
   public float[][] field11262;
   @OriginalMember(
      owner = "client!au",
      name = "g",
      descriptor = "[I"
   )
   public int[] field11259;
   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "[I"
   )
   public int[] field11260;
   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11268 = new String[]{method5561(method5560("\u001bt$\f")), method5561(method5560("\u0014tf\\\r\u001bh<^L")), method5561(method5560("\u000e/fN\u0019")), method5561(method5560("\u0014tf\"L")), method5561(method5560("\u0014tf!L"))};
   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field11263 = new class101(71, 7);
   @OriginalMember(
      owner = "client!au",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field11267 = false;
   @OriginalMember(
      owner = "client!au",
      name = "i",
      descriptor = "J"
   )
   public static long field11265 = 0L;
   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "I"
   )
   public static int field11261;
   @OriginalMember(
      owner = "client!au",
      name = "h",
      descriptor = "I"
   )
   public static int field11264;

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5558(int arg0) {
      try {
         if (arg0 != 71) {
            method5559(-28, 49, 13, 116);
         }

         field11263 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11268[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(IIII)I",
      line = 18
   )
   public static final int method5559(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11261;
         if (arg3 != 71) {
            return -113;
         } else if (arg2 > arg0) {
            return arg2;
         } else {
            return ~arg0 < ~arg1 ? arg1 : arg0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11268[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "<init>",
      descriptor = "([I[I[I[[F)V",
      line = 38
   )
   public class768(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field11266 = arg2;
         this.field11262 = arg3;
         this.field11259 = arg0;
         this.field11260 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11268[1] + (arg0 != null ? field11268[2] : field11268[0]) + ',' + (arg1 != null ? field11268[2] : field11268[0]) + ',' + (arg2 != null ? field11268[2] : field11268[0]) + ',' + (arg3 != null ? field11268[2] : field11268[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5560(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5561(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
