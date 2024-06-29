import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class322 extends class348 {
   @OriginalMember(
      owner = "client!le",
      name = "l",
      descriptor = "[I"
   )
   private int[] field4591;
   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4594 = new String[]{method2438(method2437("no\u0017\u0006x")), method2438(method2437("y$\u0017j-")), method2438(method2437("l\u007fU(")), method2438(method2437("no\u0017\u0005x")), method2438(method2437("no\u0017x9lcMzx"))};
   @OriginalMember(
      owner = "client!le",
      name = "k",
      descriptor = "Lsda;"
   )
   public static class269 field4592 = new class269(88, 3);
   @OriginalMember(
      owner = "client!le",
      name = "j",
      descriptor = "I"
   )
   public static int field4593;

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method2435(int arg0) {
      try {
         if (arg0 != 29036) {
            field4592 = null;
         }

         field4592 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4594[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(FIFI[FIIFFII)V",
      line = 15
   )
   public final void method2436(float arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, float arg7, float arg8, int arg9, int arg10) {
      int var12 = client.field4530;

      try {
         ++field4593;
         int var13 = (int)((float)arg10 * arg0 + (float)arg9);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg6 * arg7 + -1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg3 * arg8 - 1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg1 * arg8;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = 1.0F - var22;
         int var24 = var20 & var18;
         int var25 = var21 & var18;
         float var26 = class5.method48(true, var22);
         int var27 = this.field4591[var24];
         int var28 = this.field4591[var25];
         int var29 = 0;
         if (var12 != 0 || ~var29 > ~arg6) {
            do {
               float var30 = (float)var29 * arg7;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = var30 - (float)var31;
               float var34 = -var33 + 1.0F;
               int var35 = var32 & var16;
               int var36 = var31 & var16;
               float var37 = class5.method48(true, var33);
               int var38 = this.field4591[var27 + var36];
               int var39 = this.field4591[var35 - -var27];
               int var40 = this.field4591[var28 + var36];
               int var41 = this.field4591[var35 - -var28];
               int var42 = 0;
               if (var12 != 0 || var42 < arg10) {
                  do {
                     float var43 = (float)var42 * arg0;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = var43 - (float)var44;
                     float var47 = -var46 + 1.0F;
                     int var48 = var44 & var14;
                     int var49 = var45 & var14;
                     float var50 = class5.method48(true, var46);
                     arg4[arg5++] = class261.method1979((byte)-125, var26, class261.method1979((byte)-125, var37, class261.method1979((byte)-125, var50, class554.method4095(class153.method1262(7, this.field4591[var41 + var49]), var33, var22, 55, var46), class554.method4095(class153.method1262(this.field4591[var48 - -var41], 7), var33, var22, -3, var47)), class261.method1979((byte)-125, var50, class554.method4095(class153.method1262(this.field4591[var49 - -var40], 7), var34, var22, 83, var46), class554.method4095(class153.method1262(7, this.field4591[var40 + var48]), var34, var22, class774.method5578(arg9, -15), var47))), class261.method1979((byte)-125, var37, class261.method1979((byte)-125, var50, class554.method4095(class153.method1262(this.field4591[var39 + var49], 7), var33, var23, 83, var46), class554.method4095(class153.method1262(this.field4591[var39 + var48], 7), var33, var23, -126, var47)), class261.method1979((byte)-125, var50, class554.method4095(class153.method1262(7, this.field4591[var38 + var49]), var34, var23, 19, var46), class554.method4095(class153.method1262(this.field4591[var38 + var48], 7), var34, var23, -127, var47)))) * arg2;
                     ++var42;
                  } while(var42 < arg10);
               }

               ++var29;
            } while(~var29 > ~arg6);

         }
      } catch (RuntimeException var52) {
         throw class670.method4877(var52, field4594[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4594[1] : field4594[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "<init>",
      descriptor = "(I)V",
      line = 105
   )
   public class322(int arg0) {
      int var2 = client.field4530;
      super();
      this.field4591 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2 != 0) {
            this.field4591[var4] = this.field4591[var4 + 256] = var4;
            ++var4;
         }

         while(true) {
            while(var4 < 256) {
               this.field4591[var4] = this.field4591[var4 + 256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (var2 == 0) {
               if (var2 == 0 && ~var5 <= -257) {
                  return;
               } else {
                  do {
                     int var6 = var3.nextInt() & 255;
                     int var7 = this.field4591[var6];
                     this.field4591[var6] = this.field4591[var6 + 256] = this.field4591[var5];
                     this.field4591[var5] = this.field4591[var5 + 256] = var7;
                     ++var5;
                  } while(~var5 > -257);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4594[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
