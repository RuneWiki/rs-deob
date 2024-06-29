import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class679 extends class570 {
   @OriginalMember(
      owner = "client!md",
      name = "k",
      descriptor = "[I"
   )
   private int[] field9838;
   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9843 = new String[]{method4971(method4970("E\r\u0015i")), method4971(method4970("PVW+9")), method4971(method4970("F\u001cWAl")), method4971(method4970("F\u001cWBl")), method4971(method4970("F\u001cWMl")), method4971(method4970("F\u001cW9-E\u0011\r;l"))};
   @OriginalMember(
      owner = "client!md",
      name = "i",
      descriptor = "[[S"
   )
   private static short[][] field9836 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!md",
      name = "j",
      descriptor = "I"
   )
   public static int field9837 = 2;
   @OriginalMember(
      owner = "client!md",
      name = "o",
      descriptor = "[[S"
   )
   private static short[][] field9839 = new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
   @OriginalMember(
      owner = "client!md",
      name = "m",
      descriptor = "[[S"
   )
   private static short[][] field9841 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!md",
      name = "h",
      descriptor = "[[[S"
   )
   public static short[][][] field9835 = new short[][][]{field9839, field9841, field9836};
   @OriginalMember(
      owner = "client!md",
      name = "l",
      descriptor = "I"
   )
   public static int field9840;
   @OriginalMember(
      owner = "client!md",
      name = "n",
      descriptor = "I"
   )
   public static int field9842;

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IFFFIIIIB[FF)V"
   )
   public final void method4227(int arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, float[] arg9, float arg10) {
      boolean var12 = client.field10022;

      try {
         ++field9842;
         int var13 = (int)((float)arg7 * arg1 + -1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg4 * arg2 + -1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg5 * arg3 + -1.0F);
         int var18 = var17 & 255;
         if (arg8 > -46) {
            method4968(4, false, 49);
         }

         float var19 = (float)arg6 * arg3;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = 1.0F - var22;
         int var24 = var21 & var18;
         int var25 = var20 & var18;
         float var26 = class733.method5307(var22, false);
         int var27 = this.field9838[var25];
         int var28 = this.field9838[var24];
         int var29 = 0;
         if (var12 || ~var29 > ~arg4) {
            do {
               float var30 = (float)var29 * arg2;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = var30 - (float)var31;
               float var34 = -var33 + 1.0F;
               int var35 = var32 & var16;
               int var36 = var31 & var16;
               float var37 = class733.method5307(var33, false);
               int var38 = this.field9838[var27 + var36];
               int var39 = this.field9838[var35 - -var27];
               int var40 = this.field9838[var28 + var36];
               int var41 = this.field9838[var35 - -var28];
               int var42 = 0;
               if (var12 || arg7 > var42) {
                  do {
                     float var43 = (float)var42 * arg1;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = var43 - (float)var44;
                     float var47 = -var46 + 1.0F;
                     int var48 = var44 & var14;
                     float var49 = class733.method5307(var46, false);
                     int var50 = var45 & var14;
                     arg9[arg0++] = arg10 * class717.method5195(class717.method5195(class717.method5195(class796.method5727(var22, var33, (byte)-128, var46, class697.method5101(7, this.field9838[var41 + var50])), -1925579256, var49, class796.method5727(var22, var33, (byte)-93, var47, class697.method5101(this.field9838[var41 + var48], 7))), -1925579256, var37, class717.method5195(class796.method5727(var22, var34, (byte)89, var46, class697.method5101(7, this.field9838[var40 + var50])), -1925579256, var49, class796.method5727(var22, var34, (byte)81, var47, class697.method5101(this.field9838[var48 - -var40], 7)))), -1925579256, var26, class717.method5195(class717.method5195(class796.method5727(var23, var33, (byte)106, var46, class697.method5101(7, this.field9838[var39 + var50])), -1925579256, var49, class796.method5727(var23, var33, (byte)-93, var47, class697.method5101(this.field9838[var48 - -var39], 7))), -1925579256, var37, class717.method5195(class796.method5727(var23, var34, (byte)-120, var46, class697.method5101(this.field9838[var50 - -var38], 7)), -1925579256, var49, class796.method5727(var23, var34, (byte)-102, var47, class697.method5101(7, this.field9838[var38 + var48])))));
                     ++var42;
                  } while(arg7 > var42);
               }

               ++var29;
            } while(~var29 > ~arg4);

         }
      } catch (RuntimeException var52) {
         throw class612.method4503(var52, field9843[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field9843[1] : field9843[0]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method4968(int arg0, boolean arg1, int arg2) {
      try {
         ++field9840;
         if (!arg1) {
            field9835 = null;
         }

         return class318.method2574(arg0, arg2, 3452) || class377.method2943(arg0, !arg1, arg2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9843[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4969(byte arg0) {
      try {
         field9836 = null;
         int var1 = -91 % ((-19 - arg0) / 39);
         field9839 = null;
         field9841 = null;
         field9835 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9843[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class679(int arg0) {
      boolean var2 = client.field10022;
      super();
      this.field9838 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2) {
            this.field9838[var4] = this.field9838[var4 + 256] = var4;
            ++var4;
         }

         while(true) {
            while(var4 < 256) {
               this.field9838[var4] = this.field9838[var4 + 256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && ~var5 <= -257) {
                  return;
               } else {
                  do {
                     int var6 = var3.nextInt() & 255;
                     int var7 = this.field9838[var6];
                     this.field9838[var6] = this.field9838[var6 + 256] = this.field9838[var5];
                     this.field9838[var5] = this.field9838[var5 + 256] = var7;
                     ++var5;
                  } while(~var5 > -257);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9843[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
