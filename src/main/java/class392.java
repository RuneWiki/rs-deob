import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class392 {
   @OriginalMember(
      owner = "client!tb",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field5702;
   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "I"
   )
   public int field5700;
   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5704 = new String[]{method3045(method3044("ZEeAT}S9\\UI\u000f")), method3045(method3044("ZEew\u0013")), method3045(method3044("@R'Y")), method3045(method3044("ZEe\tR@N?\u000b\u0013")), method3045(method3044("U\te\u001bF")), method3045(method3044("ZEet\u0013")), method3045(method3044("ZEev\u0013"))};
   @OriginalMember(
      owner = "client!tb",
      name = "h",
      descriptor = "I"
   )
   public static int field5696 = 0;
   @OriginalMember(
      owner = "client!tb",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field5701 = new float[4];
   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field5703 = false;
   @OriginalMember(
      owner = "client!tb",
      name = "e",
      descriptor = "I"
   )
   public static int field5697;
   @OriginalMember(
      owner = "client!tb",
      name = "g",
      descriptor = "I"
   )
   public static int field5698;
   @OriginalMember(
      owner = "client!tb",
      name = "d",
      descriptor = "I"
   )
   public static int field5699;

   @OriginalMember(
      owner = "client!tb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5699;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5704[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3041(int arg0) {
      try {
         field5701 = null;
         if (arg0 >= -9) {
            field5701 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5704[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method3042(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field5697;
         if (~(2 & class644.field9070[0][arg3][arg4]) != -1) {
            return true;
         } else if ((class644.field9070[arg2][arg3][arg4] & 16) != arg0) {
            return false;
         } else {
            return ~class90.method913(arg3, arg4, true, arg2) == ~arg1;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5704[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3043(int arg0, int arg1) {
      try {
         ++field5698;
         if (arg1 != 0) {
            field5703 = true;
         }

         return arg0 == 0 || ~arg0 == -3;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5704[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class392(String arg0, String arg1, int arg2) {
      try {
         this.field5702 = arg0;
         this.field5700 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5704[3] + (arg0 != null ? field5704[4] : field5704[2]) + ',' + (arg1 != null ? field5704[4] : field5704[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3044(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3045(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
