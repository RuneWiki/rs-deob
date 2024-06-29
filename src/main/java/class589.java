import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class589 extends class302 {
   @OriginalMember(
      owner = "client!via",
      name = "S",
      descriptor = "I"
   )
   private int field8711 = 3216;
   @OriginalMember(
      owner = "client!via",
      name = "L",
      descriptor = "I"
   )
   private int field8719 = 4096;
   @OriginalMember(
      owner = "client!via",
      name = "Q",
      descriptor = "I"
   )
   private int field8718 = 3216;
   @OriginalMember(
      owner = "client!via",
      name = "J",
      descriptor = "[I"
   )
   private int[] field8721 = new int[3];
   @OriginalMember(
      owner = "client!via",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8724 = new String[]{method4341(method4340("Q6O,q\u000f")), method4341(method4340("O(\u001df")), method4341(method4340("M>Mn]E")), method4341(method4340("Q6O,g\u000f")), method4341(method4340("Q6O,p\u000f")), method4341(method4340("Q6O,u\u000f")), method4341(method4340("Q6O,e\u000f")), method4341(method4340("I*Bn")), method4341(method4340("Q6O,r\u000f")), method4341(method4340("\\q\u0000,I")), method4341(method4340("Q6O,w\u000f")), method4341(method4340("Q6O,s\u000f")), method4341(method4340("Q6O,f\u000f"))};
   @OriginalMember(
      owner = "client!via",
      name = "H",
      descriptor = "Lsd;"
   )
   public static class101 field8712 = new class101(65, -2);
   @OriginalMember(
      owner = "client!via",
      name = "N",
      descriptor = "I"
   )
   public static int field8709;
   @OriginalMember(
      owner = "client!via",
      name = "P",
      descriptor = "I"
   )
   public static int field8710;
   @OriginalMember(
      owner = "client!via",
      name = "K",
      descriptor = "I"
   )
   public static int field8713;
   @OriginalMember(
      owner = "client!via",
      name = "V",
      descriptor = "I"
   )
   public static int field8714;
   @OriginalMember(
      owner = "client!via",
      name = "U",
      descriptor = "I"
   )
   public static int field8715;
   @OriginalMember(
      owner = "client!via",
      name = "I",
      descriptor = "I"
   )
   public static int field8717;
   @OriginalMember(
      owner = "client!via",
      name = "M",
      descriptor = "I"
   )
   public static int field8720;
   @OriginalMember(
      owner = "client!via",
      name = "R",
      descriptor = "I"
   )
   public static int field8722;
   @OriginalMember(
      owner = "client!via",
      name = "O",
      descriptor = "Ljfa;"
   )
   public static class303 field8716;
   @OriginalMember(
      owner = "client!via",
      name = "T",
      descriptor = "[Lnia;"
   )
   public static class671[] field8723;

   @OriginalMember(
      owner = "client!via",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method4334(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method4335(int arg0, int arg1) {
      try {
         ++field8714;
         if (~arg1 != -6408 && arg1 != 34843 && arg1 != 34837) {
            if (arg0 > -70) {
               return 65;
            } else if (~arg1 != -6409 && arg1 != 34842 && ~arg1 != -34837) {
               if (arg1 != 6406 && ~arg1 != -34845) {
                  if (arg1 != 6409 && ~arg1 != -34847) {
                     if (arg1 != 6410 && arg1 != 34847) {
                        if (arg1 == 6402) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8724[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IIIIIBII)V"
   )
   public static final void method4336(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field8720;
         if (arg5 >= 8) {
            int var9 = class768.method5559(arg6, class22.field234, class506.field7472, 71);
            int var10 = class768.method5559(arg3, class22.field234, class506.field7472, 71);
            int var11 = class768.method5559(arg1, class100.field1232, class197.field2442, 71);
            int var12 = class768.method5559(arg7, class100.field1232, class197.field2442, 71);
            int var13 = class768.method5559(arg0 + arg6, class22.field234, class506.field7472, 71);
            int var14 = class768.method5559(-arg0 + arg3, class22.field234, class506.field7472, 71);
            int var15 = var9;
            if (var8 != 0) {
               class47.method372(var12, class292.field4077[var9], arg4, (byte)102, var11);
               var15 = var9 + 1;
            }

            while(true) {
               while(~var15 > ~var13) {
                  class47.method372(var12, class292.field4077[var15], arg4, (byte)102, var11);
                  ++var15;
               }

               int var16 = var10;
               if (var8 == 0) {
                  if (var8 != 0) {
                     class47.method372(var12, class292.field4077[var10], arg4, (byte)124, var11);
                     var16 = var10 - 1;
                  }

                  while(true) {
                     while(~var16 < ~var14) {
                        class47.method372(var12, class292.field4077[var16], arg4, (byte)124, var11);
                        --var16;
                     }

                     int var17 = class768.method5559(arg0 + arg1, class100.field1232, class197.field2442, 71);
                     int var18 = class768.method5559(arg7 - arg0, class100.field1232, class197.field2442, 71);
                     int var19 = var13;
                     if (var8 == 0) {
                        if (var8 == 0 && var13 > var14) {
                           return;
                        }

                        do {
                           int[] var20 = class292.field4077[var19];
                           class47.method372(var17, var20, arg4, (byte)106, var11);
                           class47.method372(var18, var20, arg2, (byte)105, var17);
                           class47.method372(var12, var20, arg4, (byte)107, var18);
                           ++var19;
                        } while(var19 <= var14);

                        return;
                     }

                     --var16;
                  }
               }

               ++var15;
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field8724[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "<init>",
      descriptor = "()V"
   )
   public class589() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8717;
         if (arg1 > -37) {
            method4337(true);
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int var5 = class1.field52 * this.field8719 >> 12;
            int[] var6 = this.method2299(class275.field3837 & arg0 + -1, false, 0);
            int[] var7 = this.method2299(arg0, false, 0);
            int[] var8 = this.method2299(arg0 - -1 & class275.field3837, false, 0);
            int var9 = 0;
            if (var3 != 0 || ~var9 > ~class344.field5238) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[var9 + -1 & class264.field3612] + -var7[class264.field3612 & var9 + 1]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  int var13 = var10 >> 4;
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (~var13 > -1) {
                     var13 = -var13;
                  }

                  if (~var12 < -256) {
                     var12 = 255;
                  }

                  if (var13 > 255) {
                     var13 = 255;
                  }

                  int var14 = 255 & class244.field3112[((var13 - -1) * var13 >> 1) + var12];
                  int var15 = var11 * var14 >> 8;
                  int var16 = var14 * 4096 >> 8;
                  int var17 = var10 * var14 >> 8;
                  int var18 = this.field8721[2] * var16 >> 12;
                  int var19 = this.field8721[1] * var17 >> 12;
                  int var20 = this.field8721[0] * var15 >> 12;
                  var4[var9] = var18 + var19 + var20;
                  ++var9;
               } while(~var9 > ~class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field8724[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label46: {
            label45: {
               label44: {
                  ++field8715;
                  if (~arg0 != -1) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (arg0 != 2) {
                        break label46;
                     }

                     if (var4 == 0) {
                        break label45;
                     }
                  }

                  this.field8719 = arg2.method1038((byte)-122);
                  if (var4 == 0) {
                     break label46;
                  }
               }

               this.field8711 = arg2.method1038((byte)-107);
               if (var4 == 0) {
                  break label46;
               }
            }

            this.field8718 = arg2.method1038((byte)-98);
         }

         if (arg1 != 0) {
            this.method244(-64, 69, (class128)null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8724[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8724[9] : field8724[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(Z)Z"
   )
   public static final boolean method4337(boolean arg0) {
      try {
         if (!arg0) {
            field8716 = null;
         }

         ++field8710;
         return !class298.method2280(0, field8724[2]) ? false : class298.method2280(0, field8724[1]);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8724[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         if (arg0 <= -87) {
            ++field8709;
            this.method4338((byte)-113);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8724[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4338(byte arg0) {
      try {
         ++field8713;
         double var2 = Math.cos((double)((float)this.field8718 / 4096.0F));
         this.field8721[0] = (int)(Math.sin((double)((float)this.field8711 / 4096.0F)) * var2 * 4096.0D);
         this.field8721[1] = (int)(4096.0D * var2 * Math.cos((double)((float)this.field8711 / 4096.0F)));
         this.field8721[2] = (int)(4096.0D * Math.sin((double)((float)this.field8718 / 4096.0F)));
         int var4 = this.field8721[0] * this.field8721[0] >> 12;
         if (arg0 == -113) {
            int var5 = this.field8721[1] * this.field8721[1] >> 12;
            int var6 = this.field8721[2] * this.field8721[2] >> 12;
            int var7 = (int)(4096.0D * Math.sqrt((double)(var4 + var5 + var6 >> 12)));
            if (~var7 != -1) {
               this.field8721[0] = (this.field8721[0] << 12) / var7;
               this.field8721[1] = (this.field8721[1] << 12) / var7;
               this.field8721[2] = (this.field8721[2] << 12) / var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8724[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4339(int arg0) {
      try {
         if (arg0 != 0) {
            field8723 = null;
         }

         field8716 = null;
         field8723 = null;
         field8712 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8724[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4340(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4341(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
