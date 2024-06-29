import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class663 extends class726 {
   @OriginalMember(
      owner = "client!oj",
      name = "d",
      descriptor = "[I"
   )
   private int[] field9824;
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9830 = new String[]{method4848(method4847("I];r]")), method4848(method4847("]\u0019;\u001e\b")), method4848(method4847("HBy\\")), method4848(method4847("I];t]")), method4848(method4847("I];s]")), method4848(method4847("I];\f\u001cH^a\u000e]"))};
   @OriginalMember(
      owner = "client!oj",
      name = "f",
      descriptor = "I"
   )
   public static int field9827 = 0;
   @OriginalMember(
      owner = "client!oj",
      name = "g",
      descriptor = "I"
   )
   public static int field9825;
   @OriginalMember(
      owner = "client!oj",
      name = "i",
      descriptor = "I"
   )
   public static int field9826;
   @OriginalMember(
      owner = "client!oj",
      name = "h",
      descriptor = "I"
   )
   public static int field9828;
   @OriginalMember(
      owner = "client!oj",
      name = "e",
      descriptor = "I"
   )
   public static int field9829;

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(Lpia;Z)V"
   )
   public static final void method4843(class680 arg0, boolean arg1) {
      for(int var2 = arg0.field10010; var2 <= arg0.field10015; ++var2) {
         for(int var3 = arg0.field10011; var3 <= arg0.field10020; ++var3) {
            class731 var4 = class548.field8080[arg0.field10457][var2][var3];
            if (var4 != null) {
               class131 var5 = var4.field10654;
               class131 var6 = null;

               while(var5 != null) {
                  if (var5.field1676 == arg0) {
                     if (var6 != null) {
                        var6.field1670 = var5.field1670;
                     } else {
                        var4.field10654 = var5.field1670;
                     }

                     var5.method1111(true);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field1670;
               }
            }
         }
      }

      if (!arg1) {
         class676.method4946(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "(IIII)I"
   )
   public static final int method4844(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9826;
         if (~arg2 == ~arg3) {
            return arg2;
         } else {
            int var4 = -arg0 + 128;
            int var5 = (127 & arg2) * var4 + (127 & arg3) * arg0 >> 7;
            int var6 = (896 & arg2) * var4 - -((896 & arg3) * arg0) >> 7;
            int var7 = (arg3 & arg1) * arg0 + (64512 & arg2) * var4 >> 7;
            return var6 & 896 | 64512 & var7 | var5 & 127;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9830[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class663(int arg0) {
      boolean var2 = client.field1481;
      super();
      this.field9824 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2) {
            this.field9824[var4] = this.field9824[var4 - -256] = var4;
            ++var4;
         }

         while(true) {
            while(var4 < 256) {
               this.field9824[var4] = this.field9824[var4 - -256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && var5 >= 256) {
                  return;
               } else {
                  do {
                     int var6 = 255 & var3.nextInt();
                     int var7 = this.field9824[var6];
                     this.field9824[var6] = this.field9824[var6 + 256] = this.field9824[var5];
                     this.field9824[var5] = this.field9824[var5 - -256] = var7;
                     ++var5;
                  } while(var5 < 256);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9830[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(IIBFIF[FFFII)V"
   )
   public final void method4845(int arg0, int arg1, byte arg2, float arg3, int arg4, float arg5, float[] arg6, float arg7, float arg8, int arg9, int arg10) {
      boolean var12 = client.field1481;

      try {
         ++field9829;
         int var13 = (int)((float)arg1 * arg5 - 1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg0 * arg7 + -1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg9 * arg8 + -1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg4 * arg8;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = -var22 + 1.0F;
         int var24 = var20 & var18;
         float var25 = class119.method1045((byte)-108, var22);
         int var26 = var21 & var18;
         if (arg2 != 43) {
            field9827 = -97;
         }

         int var27 = this.field9824[var24];
         int var28 = this.field9824[var26];
         int var29 = 0;
         if (var12 || ~var29 > ~arg0) {
            do {
               float var30 = (float)var29 * arg7;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = (float)(-var31) + var30;
               float var34 = 1.0F - var33;
               int var35 = var32 & var16;
               int var36 = var31 & var16;
               float var37 = class119.method1045((byte)-114, var33);
               int var38 = this.field9824[var27 + var36];
               int var39 = this.field9824[var27 + var35];
               int var40 = this.field9824[var28 + var36];
               int var41 = this.field9824[var35 - -var28];
               int var42 = 0;
               if (var12 || ~arg1 < ~var42) {
                  do {
                     float var43 = (float)var42 * arg5;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = var43 - (float)var44;
                     float var47 = 1.0F - var46;
                     int var48 = var45 & var14;
                     int var49 = var44 & var14;
                     float var50 = class119.method1045((byte)-121, var46);
                     arg6[arg10++] = arg3 * class793.method5722(var25, class793.method5722(var37, class793.method5722(var50, class775.method5599(-76, var46, class109.method974(7, this.field9824[var41 + var48]), var33, var22), class775.method5599(arg2 + -138, var47, class109.method974(7, this.field9824[var41 + var49]), var33, var22), (byte)67), class793.method5722(var50, class775.method5599(class379.method3007(arg2, -77), var46, class109.method974(7, this.field9824[var48 - -var40]), var34, var22), class775.method5599(-89, var47, class109.method974(7, this.field9824[var40 + var49]), var34, var22), (byte)67), (byte)67), class793.method5722(var37, class793.method5722(var50, class775.method5599(class379.method3007(arg2, -70), var46, class109.method974(7, this.field9824[var39 + var48]), var33, var23), class775.method5599(-99, var47, class109.method974(7, this.field9824[var39 + var49]), var33, var23), (byte)67), class793.method5722(var50, class775.method5599(-98, var46, class109.method974(this.field9824[var38 + var48], 7), var34, var23), class775.method5599(-116, var47, class109.method974(7, this.field9824[var38 + var49]), var34, var23), (byte)67), (byte)67), (byte)67);
                     ++var42;
                  } while(~arg1 < ~var42);
               }

               ++var29;
            } while(~var29 > ~arg0);

         }
      } catch (RuntimeException var52) {
         throw class93.method866(var52, field9830[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9830[1] : field9830[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4846(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9828;
         int var4 = 255 - arg0;
         int var7 = (-16711936 & (arg2 & 16711935) * arg0 | arg3 & (65280 & arg2) * arg0) >>> 8;
         return ((16711680 & (arg1 & 65280) * var4 | -16711936 & (arg1 & 16711935) * var4) >>> 8) - -var7;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9830[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
