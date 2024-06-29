import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class407 implements class26 {
   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "I"
   )
   public int field6342;
   @OriginalMember(
      owner = "client!tda",
      name = "f",
      descriptor = "Lgea;"
   )
   public class750 field6334;
   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "I"
   )
   public int field6337;
   @OriginalMember(
      owner = "client!tda",
      name = "i",
      descriptor = "Lrga;"
   )
   public class694 field6345;
   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "I"
   )
   public int field6344;
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6346 = new String[]{method3270(method3269("*$v*/v")), method3270(method3269("*$v*-v")), method3270(method3269("*$v*R7.~pPv")), method3270(method3269("05{h")), method3270(method3269("%n9*\u0013")), method3270(method3269("*$v*+v")), method3270(method3269("*$v*,v")), method3270(method3269("*$v**v"))};
   @OriginalMember(
      owner = "client!tda",
      name = "g",
      descriptor = "I"
   )
   public static int field6335 = 0;
   @OriginalMember(
      owner = "client!tda",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field6343 = new class113(3, -1);
   @OriginalMember(
      owner = "client!tda",
      name = "h",
      descriptor = "I"
   )
   public static int field6336;
   @OriginalMember(
      owner = "client!tda",
      name = "j",
      descriptor = "I"
   )
   public static int field6338;
   @OriginalMember(
      owner = "client!tda",
      name = "d",
      descriptor = "I"
   )
   public static int field6339;
   @OriginalMember(
      owner = "client!tda",
      name = "l",
      descriptor = "I"
   )
   public static int field6340;
   @OriginalMember(
      owner = "client!tda",
      name = "k",
      descriptor = "I"
   )
   public static int field6341;

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public class783 method193(int arg0) {
      try {
         if (arg0 != -1) {
            this.field6337 = -32;
         }

         ++field6338;
         return class82.field1164;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6346[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(IFIZIIII)[I"
   )
   public static final int[] method3265(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field6341;
         int[] var8 = new int[arg0];
         class798 var9 = new class798();
         var9.field11609 = arg3;
         var9.field11607 = arg6;
         var9.field11604 = arg4;
         var9.field11617 = arg2;
         var9.field11612 = arg7;
         if (arg5 > -35) {
            return null;
         } else {
            var9.field11613 = (int)(arg1 * 4096.0F);
            var9.method275(false);
            class689.method5073(-1, arg0, 1);
            var9.method5754(0, var8, 7194);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6346[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(ILti;Z)V"
   )
   public static final void method3266(int arg0, class80 arg1, boolean arg2) {
      try {
         ++field6339;
         class218.field3290.method5574((byte)34, arg1);
         if (arg2) {
            class308.method2584(class218.field3290, class633.field9157, arg1, 27, class450.field6891, class329.field4989);
         }

         if (arg0 != 0) {
            field6343 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6346[6] + arg0 + ',' + (arg1 != null ? field6346[4] : field6346[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method3267(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6340;
         class109.field1508.method1550(arg2, arg0, arg1, class481.field7319);
         int var4 = class481.field7319[2];
         if (arg3 != 29310) {
            return true;
         } else if (~var4 > -51) {
            return false;
         } else {
            class481.field7319[2] = var4;
            class481.field7319[1] = class106.field1480 - -(class481.field7319[1] * class799.field11632 / var4);
            class481.field7319[0] = class481.field7319[0] * class5.field24 / var4 + class56.field686;
            return true;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6346[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3268(int arg0) {
      try {
         if (arg0 == -15251) {
            field6343 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6346[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "(ILrga;Lgea;II)V"
   )
   public class407(int arg0, class694 arg1, class750 arg2, int arg3, int arg4) {
      try {
         this.field6342 = arg3;
         this.field6334 = arg2;
         this.field6337 = arg4;
         this.field6345 = arg1;
         this.field6344 = arg0;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6346[2] + arg0 + ',' + (arg1 != null ? field6346[4] : field6346[3]) + ',' + (arg2 != null ? field6346[4] : field6346[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
