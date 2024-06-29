import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class505 extends class629 {
   @OriginalMember(
      owner = "client!cga",
      name = "I",
      descriptor = "[I"
   )
   private int[] field7346 = new int[3];
   @OriginalMember(
      owner = "client!cga",
      name = "D",
      descriptor = "I"
   )
   private int field7350 = 3216;
   @OriginalMember(
      owner = "client!cga",
      name = "L",
      descriptor = "I"
   )
   private int field7352 = 4096;
   @OriginalMember(
      owner = "client!cga",
      name = "J",
      descriptor = "I"
   )
   private int field7348 = 3216;
   @OriginalMember(
      owner = "client!cga",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7355 = new String[]{method3794(method3793("\u0006\u0004>0\u0003M")), method3794(method3793("\u0006\u0004>0\u0004M")), method3794(method3793("\u000b\u00163r")), method3794(method3793("\u001eMq04")), method3794(method3793("\u0006\u0004>0\fM")), method3794(method3793("\u0006\u0004>0\u0000M"))};
   @OriginalMember(
      owner = "client!cga",
      name = "H",
      descriptor = "I"
   )
   public static int field7351 = 0;
   @OriginalMember(
      owner = "client!cga",
      name = "G",
      descriptor = "I"
   )
   public static int field7345;
   @OriginalMember(
      owner = "client!cga",
      name = "K",
      descriptor = "I"
   )
   public static int field7347;
   @OriginalMember(
      owner = "client!cga",
      name = "E",
      descriptor = "I"
   )
   public static int field7349;
   @OriginalMember(
      owner = "client!cga",
      name = "F",
      descriptor = "I"
   )
   public static int field7353;
   @OriginalMember(
      owner = "client!cga",
      name = "M",
      descriptor = "I"
   )
   public static int field7354;

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field7345;
         if (arg1 != 0) {
            this.method241((class473)null, 11, 30);
         }

         if (~arg2 != -1) {
            if (arg2 == 1) {
               this.field7350 = arg0.method3565(true);
               return;
            }

            if (~arg2 != -3) {
               return;
            }

            if (!client.field4564) {
               this.field7348 = arg0.method3565(true);
               return;
            }
         }

         this.field7352 = arg0.method3565(true);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7355[4] + (arg0 != null ? field7355[3] : field7355[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      try {
         if (arg0 == 245880940) {
            this.method3792(-94);
            ++field7353;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7355[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "<init>",
      descriptor = "()V"
   )
   public class505() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field7349;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.method3792(51);
         }

         if (super.field9161.field7474) {
            int var5 = class39.field938 * this.field7352 >> 12;
            int[] var6 = this.method4622((byte)120, 0, arg0 - 1 & class37.field902);
            int[] var7 = this.method4622((byte)115, 0, arg0);
            int[] var8 = this.method4622((byte)122, 0, arg0 + 1 & class37.field902);
            int var9 = 0;
            if (var3 || ~var9 > ~class66.field1214) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[var9 - 1 & class704.field10259] + -var7[var9 + 1 & class704.field10259]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  int var13 = var10 >> 4;
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (~var12 < -256) {
                     var12 = 255;
                  }

                  if (~var13 < -256) {
                     var13 = 255;
                  }

                  int var14 = class93.field1493[((var13 + 1) * var13 >> 1) + var12] & 255;
                  int var15 = var10 * var14 >> 8;
                  int var16 = var11 * var14 >> 8;
                  int var17 = var14 * 4096 >> 8;
                  int var18 = this.field7346[2] * var17 >> 12;
                  int var19 = this.field7346[0] * var16 >> 12;
                  int var20 = this.field7346[1] * var15 >> 12;
                  var4[var9] = var18 + var19 - -var20;
                  ++var9;
               } while(~var9 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field7355[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method3792(int arg0) {
      try {
         ++field7347;
         double var2 = Math.cos((double)((float)this.field7348 / 4096.0F));
         this.field7346[0] = (int)(var2 * Math.sin((double)((float)this.field7350 / 4096.0F)) * 4096.0D);
         this.field7346[1] = (int)(4096.0D * var2 * Math.cos((double)((float)this.field7350 / 4096.0F)));
         this.field7346[2] = (int)(4096.0D * Math.sin((double)((float)this.field7348 / 4096.0F)));
         if (arg0 > -15) {
            this.field7350 = 122;
         }

         int var4 = this.field7346[0] * this.field7346[0] >> 12;
         int var5 = this.field7346[1] * this.field7346[1] >> 12;
         int var6 = this.field7346[2] * this.field7346[2] >> 12;
         int var7 = (int)(4096.0D * Math.sqrt((double)(var5 + var6 + var4 >> 12)));
         if (var7 != 0) {
            this.field7346[2] = (this.field7346[2] << 12) / var7;
            this.field7346[1] = (this.field7346[1] << 12) / var7;
            this.field7346[0] = (this.field7346[0] << 12) / var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7355[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
