import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class79 extends class326 {
   @OriginalMember(
      owner = "client!qv",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1099 = new String[]{method771(method770("`DNx\t")), method771(method770("\u007fG\fV")), method771(method770("j\u001cN\u0014\\")), method771(method770("`DNy\t")), method771(method770("`DN{\t")), method771(method770("`DN~\t"))};
   @OriginalMember(
      owner = "client!qv",
      name = "U",
      descriptor = "Laka;"
   )
   public static class418 field1094 = new class418(104, 0);
   @OriginalMember(
      owner = "client!qv",
      name = "Q",
      descriptor = "F"
   )
   public static float field1097;
   @OriginalMember(
      owner = "client!qv",
      name = "P",
      descriptor = "I"
   )
   public static int field1093;
   @OriginalMember(
      owner = "client!qv",
      name = "S",
      descriptor = "I"
   )
   public static int field1095;
   @OriginalMember(
      owner = "client!qv",
      name = "R",
      descriptor = "I"
   )
   public static int field1096;
   @OriginalMember(
      owner = "client!qv",
      name = "T",
      descriptor = "I"
   )
   public static int field1098;

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IBIIIZ)V"
   )
   public static final void method766(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field1481;

      try {
         if (arg2 < 1) {
            arg2 = 1;
         }

         ++field1098;
         if (~arg3 > -2) {
            arg3 = 1;
         }

         int var7;
         label65: {
            var7 = arg2 + -334;
            if (var7 < 0) {
               var7 = 0;
               if (!var6) {
                  break label65;
               }
            }

            if (~var7 < -101) {
               var7 = 100;
            }
         }

         int var8;
         label60: {
            var8 = class62.field793 - -((-class62.field793 + class664.field9851) * var7 / 100);
            if (class238.field3036 <= var8) {
               if (var8 <= class311.field4334) {
                  break label60;
               }

               var8 = class311.field4334;
               if (!var6) {
                  break label60;
               }
            }

            var8 = class238.field3036;
         }

         label53: {
            int var9 = arg2 * var8 * 512 / (arg3 * 334);
            if (~var9 <= ~class1.field18) {
               if (~var9 >= ~class423.field5774) {
                  break label53;
               }

               short var10 = class423.field5774;
               var8 = arg3 * var10 * 334 / (arg2 * 512);
               if (var8 >= class238.field3036) {
                  break label53;
               }

               var8 = class238.field3036;
               int var11 = arg3 * 334 * var10 / (var8 * 512);
               int var12 = (-var11 + arg2) / 2;
               if (arg5) {
                  class629.field9294.method443();
                  class629.field9294.method3643(false, arg4, -16777216, arg0, arg3, var12);
                  class629.field9294.method3643(false, arg4 - -arg2 - var12, -16777216, arg0, arg3, var12);
               }

               arg4 += var12;
               arg2 -= var12 * 2;
               if (!var6) {
                  break label53;
               }
            }

            short var13 = class1.field18;
            var8 = arg3 * var13 * 334 / (arg2 * 512);
            if (~var8 < ~class311.field4334) {
               var8 = class311.field4334;
               int var14 = arg2 * var8 * 512 / (var13 * 334);
               int var15 = (-var14 + arg3) / 2;
               if (arg5) {
                  class629.field9294.method443();
                  class629.field9294.method3643(false, arg4, -16777216, arg0, var15, arg2);
                  class629.field9294.method3643(false, arg4, -16777216, arg0 - (-arg3 + var15), var15, arg2);
               }

               arg0 += var15;
               arg3 -= var15 * 2;
            }
         }

         if (arg1 == 116) {
            class92.field1248 = (short)arg3;
            class142.field1788 = (short)arg2;
            class344.field4724 = arg4;
            class546.field8039 = arg0;
            class484.field6740 = arg2 * var8 / 334;
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field1099[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(IZ)Ljava/lang/String;"
   )
   public static final String method767(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method766(-122, (byte)-106, 8, -50, 52, true);
         }

         ++field1093;
         return (arg0 >> 24 & 255) + "." + ((16775761 & arg0) >> 16) + "." + (arg0 >> 8 & 255) + "." + (255 & arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1099[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method768(int arg0) {
      try {
         if (arg0 != -101) {
            method766(-18, (byte)95, 47, -49, 13, true);
         }

         field1094 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1099[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Lkw;I)V"
   )
   public static final void method769(class9 arg0, int arg1) {
      try {
         ++field1096;
         int var2 = -class413.field5678 + arg0.field181;
         if (arg1 > 11) {
            int var3 = arg0.field156 * 512 + arg0.method78(0) * 256;
            int var4 = arg0.field188 * 512 - -(256 * arg0.method78(0));
            arg0.field206 = 0;
            arg0.field10467 += (-arg0.field10467 + var3) / var2;
            arg0.field10468 += (-arg0.field10468 + var4) / var2;
            if (~arg0.field189 == -1) {
               arg0.method82(0, 8192);
            }

            if (arg0.field189 == 1) {
               arg0.method82(0, 12288);
            }

            if (~arg0.field189 == -3) {
               arg0.method82(0, 0);
            }

            if (~arg0.field189 == -4) {
               arg0.method82(0, 4096);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1099[0] + (arg0 != null ? field1099[2] : field1099[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method770(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method771(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
