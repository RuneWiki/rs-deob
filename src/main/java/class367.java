import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class367 extends class791 {
   @OriginalMember(
      owner = "client!gha",
      name = "e",
      descriptor = "[I"
   )
   private int[] field5024;
   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5028 = new String[]{method2736(method2735("M\u00176/EC\u0011>uG\u0002")), method2736(method2735("M\u00176/;\u0002")), method2736(method2735("M\u00176/8\u0002")), method2736(method2735("D\n;m")), method2736(method2735("QQy/\u0004"))};
   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "I"
   )
   public static int field5025;
   @OriginalMember(
      owner = "client!gha",
      name = "c",
      descriptor = "I"
   )
   public static int field5026;
   @OriginalMember(
      owner = "client!gha",
      name = "d",
      descriptor = "I"
   )
   public static int field5027;

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(II)[[[B"
   )
   public static final byte[][][] method2733(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "([FZIIIFIFFIF)V"
   )
   public final void method2734(float[] arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float arg10) {
      boolean var12 = client.field4360;

      try {
         ++field5025;
         int var13 = (int)((float)arg2 * arg8 + -1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg3 * arg7 - 1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg9 * arg5 + -1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg6 * arg5;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = var19 - (float)var20;
         float var23 = 1.0F - var22;
         int var24 = var20 & var18;
         int var25 = var21 & var18;
         float var26 = class608.method4426(-122, var22);
         int var27 = this.field5024[var24];
         int var28 = this.field5024[var25];
         if (arg1) {
            field5026 = -96;
         }

         int var29 = 0;
         if (var12 || ~var29 > ~arg3) {
            do {
               float var30 = (float)var29 * arg7;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = var30 - (float)var31;
               float var34 = -var33 + 1.0F;
               int var35 = var32 & var16;
               int var36 = var31 & var16;
               float var37 = class608.method4426(57, var33);
               int var38 = this.field5024[var27 + var36];
               int var39 = this.field5024[var27 + var35];
               int var40 = this.field5024[var28 + var36];
               int var41 = this.field5024[var28 + var35];
               int var42 = 0;
               if (var12 || ~var42 > ~arg2) {
                  do {
                     float var43 = (float)var42 * arg8;
                     int var44 = (int)var43;
                     int var45 = var44 + 1;
                     float var46 = var43 - (float)var44;
                     float var47 = 1.0F - var46;
                     int var48 = var44 & var14;
                     float var49 = class608.method4426(-98, var46);
                     int var50 = var45 & var14;
                     arg0[arg4++] = class709.method5159(class709.method5159(class709.method5159(class551.method3955(!arg1, var47, class556.method3988(this.field5024[var38 + var48], 7), var23, var34), var49, 117, class551.method3955(!arg1, var46, class556.method3988(7, this.field5024[var50 - -var38]), var23, var34)), var37, 92, class709.method5159(class551.method3955(true, var47, class556.method3988(7, this.field5024[var39 + var48]), var23, var33), var49, 107, class551.method3955(true, var46, class556.method3988(this.field5024[var39 + var50], 7), var23, var33))), var26, 89, class709.method5159(class709.method5159(class551.method3955(true, var47, class556.method3988(7, this.field5024[var40 + var48]), var22, var34), var49, 107, class551.method3955(true, var46, class556.method3988(7, this.field5024[var50 - -var40]), var22, var34)), var37, 82, class709.method5159(class551.method3955(true, var47, class556.method3988(this.field5024[var48 - -var41], 7), var22, var33), var49, 109, class551.method3955(!arg1, var46, class556.method3988(7, this.field5024[var41 + var50]), var22, var33)))) * arg10;
                     ++var42;
                  } while(~var42 > ~arg2);
               }

               ++var29;
            } while(~var29 > ~arg3);

         }
      } catch (RuntimeException var52) {
         throw class237.method1823(var52, field5028[2] + (arg0 != null ? field5028[4] : field5028[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class367(int arg0) {
      boolean var2 = client.field4360;
      super();
      this.field5024 = new int[512];

      try {
         Random var3 = new Random((long)arg0);
         int var4 = 0;
         if (var2) {
            this.field5024[var4] = this.field5024[var4 + 256] = var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -257) {
               this.field5024[var4] = this.field5024[var4 + 256] = var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && ~var5 <= -257) {
                  return;
               } else {
                  do {
                     int var6 = var3.nextInt() & 255;
                     int var7 = this.field5024[var6];
                     this.field5024[var6] = this.field5024[var6 + 256] = this.field5024[var5];
                     this.field5024[var5] = this.field5024[var5 + 256] = var7;
                     ++var5;
                  } while(~var5 > -257);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5028[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2735(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2736(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
