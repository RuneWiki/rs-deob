import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class448 implements class191 {
   @OriginalMember(
      owner = "client!wg",
      name = "g",
      descriptor = "I"
   )
   public int field6809;
   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6810 = new String[]{method3381(method3380("a\u001b/ys")), method3381(method3380("a\u001b/|s")), method3381(method3380("a\u001b/{s")), method3381(method3380("a\u001b/\u00042x\u0015u\u0006s")), method3381(method3380("a\u001b/zs"))};
   @OriginalMember(
      owner = "client!wg",
      name = "e",
      descriptor = "B"
   )
   public static byte field6806 = -6;
   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "Lvha;"
   )
   public static class713 field6808 = new class713();
   @OriginalMember(
      owner = "client!wg",
      name = "d",
      descriptor = "I"
   )
   public static int field6803;
   @OriginalMember(
      owner = "client!wg",
      name = "c",
      descriptor = "I"
   )
   public static int field6804;
   @OriginalMember(
      owner = "client!wg",
      name = "f",
      descriptor = "I"
   )
   public static int field6805;
   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "I"
   )
   public static int field6807;

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(IIII)I",
      line = 6
   )
   public static final int method3377(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6804;
         int var6 = arg3 & 3;
         if (~var6 == -1) {
            return arg0;
         } else {
            if (arg2 != 7) {
               method3378(118, 4, -117);
            }

            if (~var6 == -2) {
               return arg1;
            } else {
               return var6 == 2 ? -arg0 + 7 : 7 - arg1;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6810[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(III)Z",
      line = 31
   )
   public static final boolean method3378(int arg0, int arg1, int arg2) {
      try {
         ++field6803;
         if (arg0 != -16513) {
            return true;
         } else {
            return class499.method3726(arg2, -1, arg1) | ~(arg2 & 393216) != -1 || class653.method4706(arg1, arg2, 2497);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6810[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(I)Loi;",
      line = 46
   )
   public final class79 method1311(int arg0) {
      try {
         if (arg0 >= -106) {
            method3378(20, -33, 31);
         }

         ++field6807;
         return class55.field686;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6810[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "(I)V",
      line = 62
   )
   public static void method3379(int arg0) {
      try {
         if (arg0 > -111) {
            method3378(-92, -100, 78);
         }

         field6808 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6810[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "<init>",
      descriptor = "(I)V",
      line = 72
   )
   public class448(int arg0) {
      try {
         this.field6809 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6810[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3380(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3381(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 1;
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
