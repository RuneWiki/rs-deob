import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class744 extends class483 {
   @OriginalMember(
      owner = "client!lu",
      name = "l",
      descriptor = "[I"
   )
   private int[] field10826;
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10828 = new String[]{method5382(method5381(".M,yL")), method5382(method5381("9\u0016,\u0016\u0019")), method5382(method5381(";\u0016n;")), method5382(method5381("9\u0016,\u0014\u0019")), method5382(method5381("9\u0016,kX;\nvi\u0019")), method5382(method5381("9\u0016,\u0015\u0019"))};
   @OriginalMember(
      owner = "client!lu",
      name = "j",
      descriptor = "[F"
   )
   public static float[] field10823 = new float[16];
   @OriginalMember(
      owner = "client!lu",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field10827 = false;
   @OriginalMember(
      owner = "client!lu",
      name = "k",
      descriptor = "I"
   )
   public static int field10824;
   @OriginalMember(
      owner = "client!lu",
      name = "h",
      descriptor = "I"
   )
   public static int field10825;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5379(byte arg0) {
      try {
         if (arg0 == -99) {
            field10823 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10828[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(B[SI)[S"
   )
   public static final short[] method5380(byte arg0, short[] arg1, int arg2) {
      try {
         if (arg0 <= 88) {
            field10823 = null;
         }

         ++field10824;
         short[] var3 = new short[arg2];
         class714.method5194(arg1, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10828[1] + arg0 + ',' + (arg1 != null ? field10828[0] : field10828[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(BIIIFFFIF[FI)V"
   )
   public final void method3514(byte arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7, float arg8, float[] arg9, int arg10) {
      boolean var12 = client.field4273;

      try {
         ++field10825;
         int var13 = (int)((float)arg10 * arg5 + -1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg1 * arg6 - 1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg3 * arg4 - 1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg2 * arg4;
         if (arg0 <= 78) {
            field10827 = false;
         }

         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = 1.0F - var22;
         int var24 = var20 & var18;
         int var25 = var21 & var18;
         float var26 = class444.method3299(var22, 6);
         int var27 = this.field10826[var24];
         int var28 = this.field10826[var25];
         int var29 = 0;
         if (var12 || ~var29 > ~arg1) {
            do {
               float var30 = (float)var29 * arg6;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = (float)(-var31) + var30;
               float var34 = 1.0F - var33;
               int var35 = var31 & var16;
               float var36 = class444.method3299(var33, 6);
               int var37 = var32 & var16;
               int var38 = this.field10826[var27 + var35];
               int var39 = this.field10826[var27 + var37];
               int var40 = this.field10826[var28 + var35];
               int var41 = this.field10826[var28 + var37];
               int var42 = 0;
               if (var12 || ~arg10 < ~var42) {
                  do {
                     float var43 = (float)var42 * arg5;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = var43 - (float)var44;
                     float var47 = 1.0F - var46;
                     int var48 = var44 & var14;
                     int var49 = var45 & var14;
                     float var50 = class444.method3299(var46, 6);
                     arg9[arg7++] = class740.method5361(class740.method5361(class740.method5361(class694.method5041(var23, var47, true, var34, class743.method5375(7, this.field10826[var38 + var48])), class694.method5041(var23, var46, true, var34, class743.method5375(7, this.field10826[var49 - -var38])), var50, 125), class740.method5361(class694.method5041(var23, var47, true, var33, class743.method5375(this.field10826[var39 + var48], 7)), class694.method5041(var23, var46, true, var33, class743.method5375(this.field10826[var39 + var49], 7)), var50, 93), var36, 97), class740.method5361(class740.method5361(class694.method5041(var22, var47, true, var34, class743.method5375(this.field10826[var40 + var48], 7)), class694.method5041(var22, var46, true, var34, class743.method5375(7, this.field10826[var40 + var49])), var50, 117), class740.method5361(class694.method5041(var22, var47, true, var33, class743.method5375(7, this.field10826[var41 + var48])), class694.method5041(var22, var46, true, var33, class743.method5375(7, this.field10826[var41 + var49])), var50, 112), var36, 99), var26, 88) * arg8;
                     ++var42;
                  } while(~arg10 < ~var42);
               }

               ++var29;
            } while(~var29 > ~arg1);

         }
      } catch (RuntimeException var52) {
         throw class534.method3846(var52, field10828[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field10828[0] : field10828[2]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class744(int arg0) {
      boolean var2 = client.field4273;
      super();
      this.field10826 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2) {
            this.field10826[var4] = this.field10826[var4 + 256] = var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -257) {
               this.field10826[var4] = this.field10826[var4 + 256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && ~var5 <= -257) {
                  return;
               } else {
                  do {
                     int var6 = var3.nextInt() & 255;
                     int var7 = this.field10826[var6];
                     this.field10826[var6] = this.field10826[var6 - -256] = this.field10826[var5];
                     this.field10826[var5] = this.field10826[var5 + 256] = var7;
                     ++var5;
                  } while(~var5 > -257);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10828[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5381(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5382(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
