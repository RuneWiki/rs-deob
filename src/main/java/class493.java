import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class493 extends class629 {
   @OriginalMember(
      owner = "client!so",
      name = "S",
      descriptor = "I"
   )
   private int field7184 = 0;
   @OriginalMember(
      owner = "client!so",
      name = "J",
      descriptor = "I"
   )
   private int field7186 = 0;
   @OriginalMember(
      owner = "client!so",
      name = "U",
      descriptor = "I"
   )
   private int field7187 = 0;
   @OriginalMember(
      owner = "client!so",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7189 = new String[]{method3721(method3720("QDv8 ")), method3721(method3720("D\u001f4z")), method3721(method3720("Y\u0005v[u")), method3721(method3720("Y\u0005vFu")), method3721(method3720("Y\u0005vXu")), method3721(method3720("Y\u0005vZu")), method3721(method3720("Y\u0005vGu")), method3721(method3720("Y\u0005vYu")), method3721(method3720("Y\u0005vSu"))};
   @OriginalMember(
      owner = "client!so",
      name = "N",
      descriptor = "I"
   )
   public static int field7171 = -1;
   @OriginalMember(
      owner = "client!so",
      name = "P",
      descriptor = "I"
   )
   public static int field7185 = -1;
   @OriginalMember(
      owner = "client!so",
      name = "W",
      descriptor = "I"
   )
   public static int field7169;
   @OriginalMember(
      owner = "client!so",
      name = "O",
      descriptor = "I"
   )
   public static int field7170;
   @OriginalMember(
      owner = "client!so",
      name = "M",
      descriptor = "I"
   )
   public static int field7172;
   @OriginalMember(
      owner = "client!so",
      name = "K",
      descriptor = "I"
   )
   public static int field7173;
   @OriginalMember(
      owner = "client!so",
      name = "X",
      descriptor = "I"
   )
   public static int field7174;
   @OriginalMember(
      owner = "client!so",
      name = "T",
      descriptor = "I"
   )
   private int field7175;
   @OriginalMember(
      owner = "client!so",
      name = "D",
      descriptor = "I"
   )
   private int field7176;
   @OriginalMember(
      owner = "client!so",
      name = "G",
      descriptor = "I"
   )
   private int field7177;
   @OriginalMember(
      owner = "client!so",
      name = "I",
      descriptor = "I"
   )
   public static int field7178;
   @OriginalMember(
      owner = "client!so",
      name = "E",
      descriptor = "I"
   )
   public static int field7179;
   @OriginalMember(
      owner = "client!so",
      name = "R",
      descriptor = "I"
   )
   private int field7180;
   @OriginalMember(
      owner = "client!so",
      name = "Q",
      descriptor = "I"
   )
   private int field7181;
   @OriginalMember(
      owner = "client!so",
      name = "L",
      descriptor = "I"
   )
   public static int field7182;
   @OriginalMember(
      owner = "client!so",
      name = "F",
      descriptor = "I"
   )
   private int field7183;
   @OriginalMember(
      owner = "client!so",
      name = "H",
      descriptor = "I"
   )
   public static int field7188;

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IIII)V",
      line = 3
   )
   private final void method3715(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != 100) {
            this.method3715(5, -20, 38, 64);
         }

         int var5;
         int var6;
         int var13;
         label50: {
            ++field7182;
            var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : arg2 + arg3 + -(arg2 * arg3 >> 12);
            if (~var5 < -1) {
               int var18 = arg0 * 6;
               var6 = -var5 + arg2 + arg2;
               int var7 = (-var6 + var5 << 12) / var5;
               int var8 = var18 >> 12;
               int var9 = var18 - (var8 << 12);
               int var11 = var7 * var5 >> 12;
               int var12 = var9 * var11 >> 12;
               var13 = var6 + var12;
               int var14 = var5 - var12;
               if (var8 == 0) {
                  break label50;
               }

               if (var8 == 1) {
                  this.field7180 = var6;
                  this.field7175 = var5;
                  this.field7181 = var14;
                  return;
               }

               if (var8 == 2) {
                  this.field7181 = var6;
                  this.field7180 = var13;
                  this.field7175 = var5;
                  return;
               }

               if (~var8 == -4) {
                  this.field7181 = var6;
                  this.field7180 = var5;
                  this.field7175 = var14;
                  return;
               }

               if (var8 == 4) {
                  this.field7175 = var6;
                  this.field7180 = var5;
                  this.field7181 = var13;
                  return;
               }

               if (~var8 == -6) {
                  if (!client.field4564) {
                     this.field7175 = var6;
                     this.field7181 = var5;
                     this.field7180 = var14;
                     return;
                  }
                  break label50;
               }
            } else {
               this.field7181 = this.field7175 = this.field7180 = arg2;
            }

            return;
         }

         this.field7175 = var13;
         this.field7181 = var5;
         this.field7180 = var6;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field7189[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(I[BII)Ljava/lang/String;",
      line = 111
   )
   public static final String method3716(int arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field7169;
         char[] var5 = new char[arg2];
         int var6 = 0;
         if (arg0 > 0) {
            field7174 = -62;
         }

         int var7 = 0;
         if (!var4 && ~arg2 >= ~var7) {
            return new String(var5, 0, var6);
         } else {
            do {
               int var8 = arg1[arg3 + var7] & 255;
               if (var8 != 0) {
                  if (var8 >= 128 && var8 < 160) {
                     char var9 = class685.field10078[var8 - 128];
                     if (~var9 == -1) {
                        var9 = '?';
                     }

                     var8 = var9;
                  }

                  var5[var6++] = (char)var8;
               }

               ++var7;
            } while(~arg2 < ~var7);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7189[3] + arg0 + ',' + (arg1 != null ? field7189[0] : field7189[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "<init>",
      descriptor = "()V",
      line = 156
   )
   public class493() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(II)[[I",
      line = 161
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 0) {
            method3719(3, -55, 12, 22, 12);
         }

         ++field7172;
         int[][] var4 = super.field9169.method785((byte)36, arg0);
         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(arg1 + 91, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class66.field1214 > var12) {
               do {
                  this.method3717(var8[var12], var6[var12], var7[var12], (byte)-51);
                  this.field7183 += this.field7184;
                  this.field7177 += this.field7186;
                  this.field7176 += this.field7187;
                  if (var3 || this.field7183 < 0) {
                     do {
                        this.field7183 += 4096;
                     } while(this.field7183 < 0);
                  }

                  if (var3) {
                     this.field7183 -= 4096;
                  }

                  while(true) {
                     class493 var10000;
                     if (this.field7183 <= 4096) {
                        var10000 = this;
                        if (!var3) {
                           if (~this.field7176 > -1) {
                              this.field7176 = 0;
                           }

                           if (~this.field7176 < -4097) {
                              this.field7176 = 4096;
                           }

                           if (~this.field7177 > -1) {
                              this.field7177 = 0;
                           }

                           if (~this.field7177 < -4097) {
                              this.field7177 = 4096;
                           }

                           this.method3715(this.field7183, 100, this.field7177, this.field7176);
                           var9[var12] = this.field7181;
                           var10[var12] = this.field7175;
                           var11[var12] = this.field7180;
                           ++var12;
                           break;
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field7183 -= 4096;
                  }
               } while(class66.field1214 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7189[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IIIB)V",
      line = 237
   )
   private final void method3717(int arg0, int arg1, int arg2, byte arg3) {
      boolean var5 = client.field4564;

      try {
         ++field7179;
         int var6 = ~arg1 < ~arg2 ? arg1 : arg2;
         int var7 = arg0 <= var6 ? var6 : arg0;
         if (arg3 != -51) {
            method3716(-111, (byte[])null, 94, 49);
         }

         int var9;
         int var10;
         label113: {
            int var8 = ~arg1 > ~arg2 ? arg1 : arg2;
            var9 = var8 > arg0 ? arg0 : var8;
            this.field7177 = (var7 + var9) / 2;
            var10 = -var9 + var7;
            if (~this.field7177 >= -1 || ~this.field7177 <= -4097) {
               this.field7176 = 0;
               if (!var5) {
                  break label113;
               }
            }

            this.field7176 = (var10 << 12) / (~this.field7177 < -2049 ? -(this.field7177 * 2) + 8192 : this.field7177 * 2);
         }

         if (~var10 >= -1) {
            this.field7183 = 0;
         } else {
            label95: {
               int var11 = (-arg1 + var7 << 12) / var10;
               int var12 = (-arg2 + var7 << 12) / var10;
               int var13 = (var7 - arg0 << 12) / var10;
               if (arg1 == var7) {
                  this.field7183 = arg2 != var9 ? -var12 + 4096 : var13 + 20480;
                  if (!var5) {
                     break label95;
                  }
               }

               if (~arg2 == ~var7) {
                  this.field7183 = ~arg0 != ~var9 ? -var13 + 12288 : var11 + 4096;
                  if (!var5) {
                     break label95;
                  }
               }

               this.field7183 = arg1 != var9 ? -var11 + 20480 : 12288 - -var12;
            }

            this.field7183 /= 6;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field7189[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(Lhw;Z)I",
      line = 292
   )
   public static final int method3718(class141 arg0, boolean arg1) {
      try {
         ++field7188;
         int var2 = 0;
         if (arg0.method1335((byte)115, class233.field3404)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class615.field8945)) {
            ++var2;
         }

         if (arg1) {
            field7185 = 54;
         }

         if (arg0.method1335((byte)115, class638.field9307)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class219.field3304)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class452.field6610)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class511.field7462)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class397.field5846)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class412.field6032)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class88.field1437)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class782.field11451)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class238.field3455)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class171.field2653)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class116.field1899)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class220.field3318)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class538.field7831)) {
            ++var2;
         }

         if (arg0.method1335((byte)115, class15.field213)) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7189[2] + (arg0 != null ? field7189[0] : field7189[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 370
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg2 != 0) {
                     if (arg2 == 1) {
                        break label44;
                     }

                     if (arg2 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field7184 = arg0.method3538(-128);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field7187 = (arg0.method3543(-1132613840) << 12) / 100;
               if (!var4) {
                  break label46;
               }
            }

            this.field7186 = (arg0.method3543(-1132613840) << 12) / 100;
         }

         if (arg1 != 0) {
            this.field7181 = -3;
         }

         ++field7178;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7189[8] + (arg0 != null ? field7189[0] : field7189[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IIIII)V",
      line = 420
   )
   public static final void method3719(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class581.field8354 = arg3;
         ++field7173;
         class3.field16 = arg0;
         if (arg2 != -12234) {
            field7174 = -61;
         }

         class515.field7502 = arg4;
         class130.field2163 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7189[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3720(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3721(char[] arg0) {
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
            var10005 = 106;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
