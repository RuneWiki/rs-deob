import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class534 extends class62 {
   @OriginalMember(
      owner = "client!el",
      name = "e",
      descriptor = "[I"
   )
   private int[] field8099 = new int[512];
   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8104 = new String[]{method4110(method4109("G`wS")), method4110(method4109("R;5\u0011\u0015")), method4110(method4109("Ly5y@")), method4110(method4109("Ly5z@")), method4110(method4109("Ly5\u0003\u0001G|o\u0001@")), method4110(method4109("Ly5|@"))};
   @OriginalMember(
      owner = "client!el",
      name = "g",
      descriptor = "[[B"
   )
   public static byte[][] field8101 = new byte[50][];
   @OriginalMember(
      owner = "client!el",
      name = "d",
      descriptor = "I"
   )
   public static int field8100;
   @OriginalMember(
      owner = "client!el",
      name = "h",
      descriptor = "I"
   )
   public static int field8102;
   @OriginalMember(
      owner = "client!el",
      name = "f",
      descriptor = "I"
   )
   public static int field8103;

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4107(int arg0) {
      try {
         if (arg0 <= 6) {
            method4108(79, (class78)null);
         }

         field8101 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8104[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(ILdn;)Lija;"
   )
   public static final class605 method4108(int arg0, class78 arg1) {
      try {
         ++field8100;
         if (arg0 != 1) {
            return null;
         } else {
            class605 var2;
            label24: {
               if (class583.field8607 != null) {
                  var2 = class583.field8607;
                  class583.field8607 = class583.field8607.field8840;
                  --class99.field1391;
                  var2.field8840 = null;
                  if (!client.field1786) {
                     break label24;
                  }
               }

               var2 = new class605();
            }

            var2.field8839 = arg1;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8104[2] + arg0 + ',' + (arg1 != null ? field8104[1] : field8104[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(IFIIIFFFII[F)V"
   )
   public final void method478(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, int arg8, int arg9, float[] arg10) {
      boolean var12 = client.field1786;

      try {
         ++field8102;
         int var13 = (int)((float)arg9 * arg1 - 1.0F);
         int var14 = var13 & 255;
         int var15 = (int)((float)arg0 * arg7 + -1.0F);
         int var16 = var15 & 255;
         int var17 = (int)((float)arg4 * arg5 + -1.0F);
         int var18 = var17 & 255;
         float var19 = (float)arg3 * arg5;
         int var20 = (int)var19;
         int var21 = var20 + 1;
         float var22 = (float)(-var20) + var19;
         float var23 = 1.0F - var22;
         if (arg2 >= -46) {
            this.method478(5, 0.59799683F, 127, -104, 34, 0.05715552F, -0.75353545F, 0.34945437F, 92, -45, (float[])null);
         }

         float var24 = class35.method254(var22, (byte)-71);
         int var25 = var21 & var18;
         int var26 = var20 & var18;
         int var27 = this.field8099[var26];
         int var28 = this.field8099[var25];
         int var29 = 0;
         if (var12 || arg0 > var29) {
            do {
               float var30 = (float)var29 * arg7;
               int var31 = (int)var30;
               int var32 = var31 + 1;
               float var33 = var30 - (float)var31;
               float var34 = 1.0F - var33;
               int var35 = var32 & var16;
               int var36 = var31 & var16;
               float var37 = class35.method254(var33, (byte)99);
               int var38 = this.field8099[var27 + var36];
               int var39 = this.field8099[var27 + var35];
               int var40 = this.field8099[var28 + var36];
               int var41 = this.field8099[var28 + var35];
               int var42 = 0;
               if (var12 || arg9 > var42) {
                  do {
                     float var43 = (float)var42 * arg1;
                     int var44 = (int)var43;
                     int var45 = var44 - -1;
                     float var46 = (float)(-var44) + var43;
                     float var47 = 1.0F - var46;
                     int var48 = var44 & var14;
                     float var49 = class35.method254(var46, (byte)81);
                     int var50 = var45 & var14;
                     arg10[arg8++] = arg6 * class660.method4864(class660.method4864(class660.method4864(class353.method2828(var47, var23, class408.method3277(this.field8099[var38 + var48], 7), var34, -4264), var49, class353.method2828(var46, var23, class408.method3277(this.field8099[var38 + var50], 7), var34, -4264), (byte)-32), var37, class660.method4864(class353.method2828(var47, var23, class408.method3277(this.field8099[var39 + var48], 7), var33, -4264), var49, class353.method2828(var46, var23, class408.method3277(7, this.field8099[var39 + var50]), var33, -4264), (byte)112), (byte)94), var24, class660.method4864(class660.method4864(class353.method2828(var47, var22, class408.method3277(7, this.field8099[var40 + var48]), var34, -4264), var49, class353.method2828(var46, var22, class408.method3277(7, this.field8099[var40 + var50]), var34, -4264), (byte)113), var37, class660.method4864(class353.method2828(var47, var22, class408.method3277(this.field8099[var41 + var48], 7), var33, -4264), var49, class353.method2828(var46, var22, class408.method3277(7, this.field8099[var50 - -var41]), var33, -4264), (byte)-89), (byte)-43), (byte)-26);
                     ++var42;
                  } while(arg9 > var42);
               }

               ++var29;
            } while(arg0 > var29);

         }
      } catch (RuntimeException var52) {
         throw class482.method3757(var52, field8104[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field8104[1] : field8104[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class534(int arg0) {
      try {
         Random var2 = new Random((long)arg0);

         for(int var3 = 0; ~var3 > -257; ++var3) {
            this.field8099[var3] = this.field8099[var3 + 256] = var3;
         }

         for(int var4 = 0; ~var4 > -257; ++var4) {
            int var5 = 255 & var2.nextInt();
            int var6 = this.field8099[var5];
            this.field8099[var5] = this.field8099[var5 - -256] = this.field8099[var4];
            this.field8099[var4] = this.field8099[var4 + 256] = var6;
         }

      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8104[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4109(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4110(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
