import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class491 {
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7432 = new String[]{method3806(method3805("Q5\u0002LA")), method3806(method3805("\ti\u0012(")), method3806(method3805("J1@d")), method3806(method3805("_j\u0002&\u0014")), method3806(method3805("Q5\u0002JA")), method3806(method3805("Q5\u0002KA")), method3806(method3805("Q5\u0002IA"))};
   @OriginalMember(
      owner = "client!uq",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field7427 = false;
   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field7431 = false;
   @OriginalMember(
      owner = "client!uq",
      name = "e",
      descriptor = "I"
   )
   public static int field7425;
   @OriginalMember(
      owner = "client!uq",
      name = "c",
      descriptor = "I"
   )
   public static int field7426;
   @OriginalMember(
      owner = "client!uq",
      name = "d",
      descriptor = "I"
   )
   public static int field7428;
   @OriginalMember(
      owner = "client!uq",
      name = "f",
      descriptor = "I"
   )
   public static int field7429;
   @OriginalMember(
      owner = "client!uq",
      name = "g",
      descriptor = "I"
   )
   public static int field7430;

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(IIILfq;)V"
   )
   public static final void method3801(int arg0, int arg1, int arg2, class374 arg3) {
      try {
         ++field7426;
         if (class358.field5551 == null && !class304.field4759) {
            if (arg3 != null && class576.method4319(arg3, 0) != null) {
               class358.field5551 = arg3;
               class432.field6655 = class576.method4319(arg3, 0);
               class17.field229 = arg0;
               class36.field427 = arg2;
               if (arg1 >= 16) {
                  class58.field719 = 0;
                  class412.field6412 = false;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7432[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7432[3] : field7432[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Lha;IIIIII)Lka;"
   )
   public static final class91 method3802(class610 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field7430;
         long var7 = (long)arg3;
         class91 var9 = (class91)class475.field7226.method2544(false, var7);
         short var10 = 2055;
         if (var9 == null) {
            class159 var11 = class489.method3795(class467.field7107, arg3, true, 0);
            if (var11 == null) {
               return null;
            }

            if (~var11.field2408 > -14) {
               var11.method1426(2, arg4 ^ -24374);
            }

            var9 = arg0.method614(var11, var10, class388.field6093, 64, 768);
            class475.field7226.method2545(var7, 126, var9);
         }

         class91 var12 = var9.method868((byte)2, var10, true);
         if (arg2 != 0) {
            var12.method888(arg2);
         }

         if (arg5 != 0) {
            var12.method878(arg5);
         }

         if (arg4 != -24374) {
            return null;
         } else {
            if (~arg6 != -1) {
               var12.method874(arg6);
            }

            if (arg1 != 0) {
               var12.method867(0, arg1, 0);
            }

            return var12;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7432[6] + (arg0 != null ? field7432[3] : field7432[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method3803(byte arg0, boolean arg1) {
      try {
         ++field7429;
         if (~class552.field8265.length() != -1) {
            int var2 = -106 % ((-73 - arg0) / 37);
            class120.method1111((byte)93, field7432[1] + class552.field8265);
            class121.method1120(false, class552.field8265, (byte)124, arg1);
            class590.field8700 = 0;
            if (!arg1) {
               class552.field8265 = "";
               class452.field6918 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7432[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method3804(boolean arg0, boolean arg1) {
      try {
         class687.field10213.method299(-17, 0, class687.field10213.field546);
         ++field7425;
         class687.field10213.method299(-17, 0, class687.field10213.field536);
         class687.field10213.method299(-17, 1, class687.field10213.field516);
         class687.field10213.method299(-17, 1, class687.field10213.field501);
         class687.field10213.method299(-17, 0, class687.field10213.field534);
         class687.field10213.method299(-17, 0, class687.field10213.field495);
         class687.field10213.method299(-17, 0, class687.field10213.field529);
         class687.field10213.method299(-17, 0, class687.field10213.field497);
         class687.field10213.method299(-17, 0, class687.field10213.field519);
         class687.field10213.method299(-17, 0, class687.field10213.field528);
         class687.field10213.method299(-17, 0, class687.field10213.field498);
         class687.field10213.method299(-17, 0, class687.field10213.field547);
         class687.field10213.method299(-17, 0, class687.field10213.field513);
         class687.field10213.method299(-17, 0, class687.field10213.field525);
         class687.field10213.method299(-17, 0, class687.field10213.field496);
         class687.field10213.method299(-17, 0, class687.field10213.field533);
         class687.field10213.method299(-17, 0, class687.field10213.field503);
         class687.field10213.method299(-17, 0, class687.field10213.field527);
         class687.field10213.method299(-17, 0, class687.field10213.field535);
         class687.field10213.method299(-17, 0, class687.field10213.field515);
         class176.method1609(-94);
         class687.field10213.method299(-17, 2, class687.field10213.field530);
         class687.field10213.method299(-17, 1, class687.field10213.field531);
         class698.method5133(90);
         class410.method3287(false);
         class741.field11026 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7432[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3805(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3806(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
