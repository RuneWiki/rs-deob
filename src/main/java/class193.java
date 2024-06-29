import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class193 extends class213 {
   @OriginalMember(
      owner = "client!vda",
      name = "H",
      descriptor = "I"
   )
   private int field2349 = 3216;
   @OriginalMember(
      owner = "client!vda",
      name = "I",
      descriptor = "I"
   )
   private int field2351 = 4096;
   @OriginalMember(
      owner = "client!vda",
      name = "E",
      descriptor = "[I"
   )
   private int[] field2352 = new int[3];
   @OriginalMember(
      owner = "client!vda",
      name = "L",
      descriptor = "I"
   )
   private int field2359 = 3216;
   @OriginalMember(
      owner = "client!vda",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2361 = new String[]{method1459(method1458("\na1^3T")), method1459(method1458("\na1^9T")), method1459(method1458("\na1^=T")), method1459(method1458("\na1^<T")), method1459(method1458("\na1^:T")), method1459(method1458("\u0012p<\u001c")), method1459(method1458("\u0007+~^\u0005")), method1459(method1458("\na1^?T")), method1459(method1458("\na1^;T"))};
   @OriginalMember(
      owner = "client!vda",
      name = "G",
      descriptor = "Lhha;"
   )
   public static class549 field2360 = new class549();
   @OriginalMember(
      owner = "client!vda",
      name = "O",
      descriptor = "I"
   )
   public static int field2350;
   @OriginalMember(
      owner = "client!vda",
      name = "F",
      descriptor = "I"
   )
   public static int field2353;
   @OriginalMember(
      owner = "client!vda",
      name = "D",
      descriptor = "I"
   )
   public static int field2354;
   @OriginalMember(
      owner = "client!vda",
      name = "M",
      descriptor = "I"
   )
   public static int field2355;
   @OriginalMember(
      owner = "client!vda",
      name = "N",
      descriptor = "I"
   )
   public static int field2356;
   @OriginalMember(
      owner = "client!vda",
      name = "K",
      descriptor = "I"
   )
   public static int field2358;
   @OriginalMember(
      owner = "client!vda",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field2357;

   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "(IB)I"
   )
   public static final int method1453(int arg0, byte arg1) {
      try {
         if (arg1 != -23) {
            field2360 = null;
         }

         ++field2354;
         return arg0 & 255;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2361[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label42: {
            label41: {
               label40: {
                  if (~arg2 != -1) {
                     if (arg2 == 1) {
                        break label40;
                     }

                     if (arg2 != 2) {
                        break label42;
                     }

                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field2351 = arg0.method4280(-19104);
                  if (!var4) {
                     break label42;
                  }
               }

               this.field2359 = arg0.method4280(-19104);
               if (!var4) {
                  break label42;
               }
            }

            this.field2349 = arg0.method4280(-19104);
         }

         int var6 = 18 / ((68 - arg1) / 48);
         ++field2356;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2361[7] + (arg0 != null ? field2361[6] : field2361[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "<init>",
      descriptor = "()V"
   )
   public class193() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1454(byte arg0) {
      try {
         ++field2350;
         double var2 = Math.cos((double)((float)this.field2349 / 4096.0F));
         this.field2352[0] = (int)(Math.sin((double)((float)this.field2359 / 4096.0F)) * var2 * 4096.0D);
         this.field2352[1] = (int)(var2 * Math.cos((double)((float)this.field2359 / 4096.0F)) * 4096.0D);
         this.field2352[2] = (int)(Math.sin((double)((float)this.field2349 / 4096.0F)) * 4096.0D);
         int var4 = this.field2352[0] * this.field2352[0] >> 12;
         if (arg0 > -111) {
            method1456(-48);
         }

         int var5 = this.field2352[1] * this.field2352[1] >> 12;
         int var6 = this.field2352[2] * this.field2352[2] >> 12;
         int var7 = (int)(4096.0D * Math.sqrt((double)(var4 + var6 + var5 >> 12)));
         if (~var7 != -1) {
            this.field2352[1] = (this.field2352[1] << 12) / var7;
            this.field2352[2] = (this.field2352[2] << 12) / var7;
            this.field2352[0] = (this.field2352[0] << 12) / var7;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field2361[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1455(int arg0) {
      try {
         field2360 = null;
         if (arg0 > -49) {
            field2357 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2361[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method1456(int arg0) {
      boolean var1 = client.field4273;

      try {
         class85 var2 = (class85)field2360.method3964((byte)-126);
         if (var1) {
            if (var2.field1099 > 1) {
               var2.field1099 = 0;
               class501.field6886.method4238(69, var2, ((class241)var2.field1105.field7496.field7453).field3003);
               var2.field1105.method3970(-16);
            }

            var2 = (class85)field2360.method3965(true);
         }

         while(true) {
            int var10000;
            short var10001;
            if (var2 == null) {
               ++field2355;
               class234.field2899 = 0;
               class432.field6026 = 0;
               class280.field3738.method3861(72);
               class183.field2257.method1851(70);
               var10000 = arg0;
               var10001 = 11311;
               if (!var1) {
                  if (arg0 != 11311) {
                     return;
                  }

                  field2360.method3970(114);
                  class749.method5414(26066, class613.field8573);
                  return;
               }
            } else {
               var10000 = var2.field1099;
               var10001 = 1;
            }

            if (var10000 > var10001) {
               var2.field1099 = 0;
               class501.field6886.method4238(69, var2, ((class241)var2.field1105.field7496.field7453).field3003);
               var2.field1105.method3970(-16);
            }

            var2 = (class85)field2360.method3965(true);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2361[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         this.method1454((byte)-116);
         ++field2358;
         if (arg0 != 28274) {
            field2357 = true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2361[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            this.field2359 = -75;
         }

         ++field2353;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = class162.field2043 * this.field2351 >> 12;
            int[] var6 = this.method1619((byte)77, arg0 + -1 & class40.field468, 0);
            int[] var7 = this.method1619((byte)124, arg0, 0);
            int[] var8 = this.method1619((byte)91, arg0 + 1 & class40.field468, 0);
            int var9 = 0;
            if (var3 || class576.field7916 > var9) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[class676.field9924 & var9 - 1] + -var7[class676.field9924 & var9 + 1]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  if (~var12 > -1) {
                     var12 = -var12;
                  }

                  int var13 = var10 >> 4;
                  if (~var12 < -256) {
                     var12 = 255;
                  }

                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (~var13 < -256) {
                     var13 = 255;
                  }

                  int var14 = 255 & class282.field3766[((var13 + 1) * var13 >> 1) + var12];
                  int var15 = var14 * 4096 >> 8;
                  int var16 = var11 * var14 >> 8;
                  int var17 = var10 * var14 >> 8;
                  int var18 = this.field2352[2] * var15 >> 12;
                  int var19 = this.field2352[1] * var17 >> 12;
                  int var20 = this.field2352[0] * var16 >> 12;
                  var4[var9] = var18 + var19 + var20;
                  ++var9;
               } while(class576.field7916 > var9);
            }
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field2361[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1459(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
