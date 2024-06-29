import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class690 {
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10139 = new String[]{method5028(method5027("`\\\u0006\"b!")), method5028(method5027("`\\\u0006\"f!")), method5028(method5027("`\\\u0006\"e!")), method5028(method5027("gJ\u000b`")), method5028(method5027("r\u0011I\"^")), method5028(method5027("`\\\u0006\"a!")), method5028(method5027("`\\\u0006\"`!"))};
   @OriginalMember(
      owner = "client!ica",
      name = "f",
      descriptor = "I"
   )
   public static int field10136 = 0;
   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "I"
   )
   public static int field10133;
   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "I"
   )
   public static int field10134;
   @OriginalMember(
      owner = "client!ica",
      name = "e",
      descriptor = "I"
   )
   public static int field10135;
   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "I"
   )
   public static int field10138;
   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "Lwga;"
   )
   public static class778 field10137;

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 3
   )
   public static final void method5021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg3 != -19897) {
            field10137 = null;
         }

         ++field10138;
         if (arg4 >= 1 && ~arg2 <= -2 && arg4 <= class209.field3112 + -2 && class1.field3 + -2 >= arg2) {
            int var9 = arg5;
            if (arg5 < 3 && class561.method4189(arg4, arg3 ^ 12457, arg2)) {
               var9 = arg5 + 1;
            }

            if (~class510.field7454.field11159.method1137(false) == -1 && !class554.method4139(arg2, class359.field5371, (byte)82, var9, arg4)) {
               return;
            }

            if (class90.field1473 == null) {
               return;
            }

            class358.field5362.method2840(3106, class444.field6473, arg0, arg5, arg4, class218.field3299[arg5], arg2);
            if (~arg8 <= -1) {
               int var10 = class510.field7454.field11188.method3669(false);
               class510.field7454.method5552(1, -115, class510.field7454.field11188);
               class358.field5362.method2837(arg7, arg1, class218.field3299[arg5], arg2, class444.field6473, arg6, arg4, var9, arg8, arg5, arg3 ^ 19924);
               class510.field7454.method5552(var10, -122, class510.field7454.field11188);
               return;
            }
         }

      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10139[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(B)V",
      line = 46
   )
   public static void method5022(byte arg0) {
      try {
         field10137 = null;
         if (arg0 > -78) {
            field10136 = -48;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10139[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(ILd;Ljava/awt/Canvas;I)Lha;",
      line = 60
   )
   public static final class65 method5023(int arg0, class160 arg1, Canvas arg2, int arg3) {
      try {
         ++field10133;
         if (arg0 > -61) {
            field10136 = -43;
         }

         return new class35(arg2, arg1, arg3);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10139[2] + arg0 + ',' + (arg1 != null ? field10139[4] : field10139[3]) + ',' + (arg2 != null ? field10139[4] : field10139[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)V",
      line = 76
   )
   public static final void method5024(int arg0) {
      class626.field9116 = arg0;

      for(int var1 = 0; var1 < class479.field6989; ++var1) {
         for(int var2 = 0; var2 < class357.field5100; ++var2) {
            if (class90.field1473[arg0][var1][var2] == null) {
               class90.field1473[arg0][var1][var2] = new class600(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(IZ)V",
      line = 101
   )
   public static final void method5025(int arg0, boolean arg1) {
      try {
         class56.field1115.method982(class393.field5787.method398());
         ++field10134;
         int[] var2 = class393.field5787.method278();
         class650.field9425 = var2[3];
         class725.field10458 = var2[arg0];
         class618.field8982 = var2[1];
         class309.field4461 = var2[0];
         if (arg1) {
            class393.field5787.method429(class672.field9868, class113.field1826, class4.field41, class546.field7900);
            class641.method4696(class504.field7337, 0);
         } else {
            class393.field5787.method429(class343.field4876, class697.field10216, class17.field304, class536.field7810);
            class641.method4696(class727.field10463, 0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10139[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(ILrk;II[BIIZ)Lpe;",
      line = 127
   )
   public static final class633 method5026(int arg0, class35 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7) {
      try {
         ++field10135;
         int var8 = 58 % ((12 - arg0) / 61);
         if (!arg1.field831 && (!class756.method5476((byte)-63, arg6) || !class756.method5476((byte)-63, arg2))) {
            return arg1.field802 ? new class633(arg1, 34037, arg3, arg6, arg2, arg7, arg4, arg5) : new class633(arg1, arg3, arg6, arg2, class71.method752(arg6, true), class71.method752(arg2, true), arg4, arg5);
         } else {
            return new class633(arg1, 3553, arg3, arg6, arg2, arg7, arg4, arg5);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field10139[5] + arg0 + ',' + (arg1 != null ? field10139[4] : field10139[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10139[4] : field10139[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5027(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5028(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
