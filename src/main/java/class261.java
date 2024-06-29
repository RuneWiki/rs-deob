import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class261 {
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public int field3554 = 1190717;
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "I"
   )
   public int field3561 = 64;
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "I"
   )
   public int field3565 = 127;
   @OriginalMember(
      owner = "client!gca",
      name = "p",
      descriptor = "Z"
   )
   public boolean field3555 = true;
   @OriginalMember(
      owner = "client!gca",
      name = "l",
      descriptor = "I"
   )
   public int field3551 = 8;
   @OriginalMember(
      owner = "client!gca",
      name = "r",
      descriptor = "Z"
   )
   public boolean field3552 = true;
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "I"
   )
   public int field3559 = 0;
   @OriginalMember(
      owner = "client!gca",
      name = "q",
      descriptor = "Z"
   )
   public boolean field3558 = false;
   @OriginalMember(
      owner = "client!gca",
      name = "v",
      descriptor = "I"
   )
   public int field3567 = -1;
   @OriginalMember(
      owner = "client!gca",
      name = "j",
      descriptor = "I"
   )
   public int field3573 = -1;
   @OriginalMember(
      owner = "client!gca",
      name = "y",
      descriptor = "I"
   )
   public int field3556 = 512;
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3574 = new String[]{method1988(method1987("pTM=\\?")), method1988(method1987("l\u0019\u0002=d")), method1988(method1987("yB@\u007f")), method1988(method1987("pTM=X?")), method1988(method1987("pTM=[?")), method1988(method1987("pTM=^?")), method1988(method1987("pTM=Z?")), method1988(method1987("pTM=]?")), method1988(method1987("pTM=Q?")), method1988(method1987("pTM=_?"))};
   @OriginalMember(
      owner = "client!gca",
      name = "u",
      descriptor = "I"
   )
   public static int field3553;
   @OriginalMember(
      owner = "client!gca",
      name = "n",
      descriptor = "I"
   )
   public static int field3560;
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "I"
   )
   public static int field3562;
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "I"
   )
   public static int field3563;
   @OriginalMember(
      owner = "client!gca",
      name = "w",
      descriptor = "I"
   )
   public static int field3564;
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "I"
   )
   public static int field3568;
   @OriginalMember(
      owner = "client!gca",
      name = "t",
      descriptor = "I"
   )
   public int field3569;
   @OriginalMember(
      owner = "client!gca",
      name = "m",
      descriptor = "I"
   )
   public static int field3571;
   @OriginalMember(
      owner = "client!gca",
      name = "o",
      descriptor = "I"
   )
   public static int field3572;
   @OriginalMember(
      owner = "client!gca",
      name = "k",
      descriptor = "Leaa;"
   )
   public static class526 field3549;
   @OriginalMember(
      owner = "client!gca",
      name = "s",
      descriptor = "Leaa;"
   )
   public static class526 field3570;
   @OriginalMember(
      owner = "client!gca",
      name = "x",
      descriptor = "Lsk;"
   )
   public static class648 field3566;
   @OriginalMember(
      owner = "client!gca",
      name = "i",
      descriptor = "Lha;"
   )
   public static class66 field3550;
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "Lsfa;"
   )
   public class724 field3557;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(BFFF)F",
      line = 4
   )
   public static final float method1979(byte arg0, float arg1, float arg2, float arg3) {
      try {
         if (arg0 != -125) {
            method1982(-115, 125);
         }

         ++field3553;
         return (-arg3 + arg2) * arg1 + arg3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3574[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 25
   )
   public final void method1980(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != -1) {
            this.method1986(27, (class128)null, 126);
         }

         ++field3571;

         do {
            int var4 = arg0.method1104(255);
            if (~var4 == -1) {
               break;
            }

            this.method1986(arg1 ^ 125, arg0, var4);
         } while(var3 == 0);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3574[0] + (arg0 != null ? field3574[1] : field3574[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Lha;BLhja;Lad;)V",
      line = 46
   )
   public static final void method1981(class66 arg0, byte arg1, class426 arg2, class446 arg3) {
      int var4 = client.field4530;

      try {
         ++field3562;
         class396 var5 = arg2.method3241(arg1 ^ -98, arg0);
         if (var5 != null) {
            int var6 = var5.method1965();
            if (var5.method1967() > var6) {
               var6 = var5.method1967();
            }

            byte var7 = 10;
            int var8 = arg3.field6784;
            int var9 = arg3.field6782;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg2.field6485 != null) {
               var10 = class595.field8772.method5525(false, arg2.field6485, (int[])null, class288.field4046, (class396[])null);
               int var13 = 0;
               if (var4 != 0 || ~var13 > ~var10) {
                  do {
                     String var14 = class288.field4046[var13];
                     if (var13 < var10 + -1) {
                        var14 = var14.substring(0, var14.length() + -4);
                     }

                     int var15 = class189.field2359.method3471(var14);
                     if (var11 < var15) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(~var13 > ~var10);
               }

               var12 = var10 * class189.field2359.method3466() + class189.field2359.method3469() / 2;
            }

            int var16;
            label105: {
               var16 = var6 / 2 + arg3.field6784;
               if (class329.field4695 + var6 > var8) {
                  var16 = var11 / 2 + var6 / 2 + class329.field4695 + var7 + 5;
                  var8 = class329.field4695;
                  if (var4 == 0) {
                     break label105;
                  }
               }

               if (var8 > -var6 + class329.field4694) {
                  var8 = -var6 + class329.field4694;
                  var16 = -(var6 / 2) + class329.field4694 + -(var11 / 2) + -var7 + -5;
               }
            }

            int var17;
            label100: {
               var17 = arg3.field6782;
               if (class329.field4691 + var6 > var9) {
                  var17 = class329.field4691 - -(var6 / 2) + var7;
                  var9 = class329.field4691;
                  if (var4 == 0) {
                     break label100;
                  }
               }

               if (var9 > class329.field4692 - var6) {
                  var17 = -(var6 / 2) + class329.field4692 - (var7 + var12);
                  var9 = -var6 + class329.field4692;
               }
            }

            int var18 = (int)(Math.atan2((double)(var8 - arg3.field6784), (double)(-arg3.field6782 + var9)) / 3.141592653589793D * 32767.0D) & 65535;
            var5.method3029((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            if (arg1 != 11) {
               method1981((class66)null, (byte)38, (class426)null, (class446)null);
            }

            int var21 = -2;
            int var22 = -2;
            if (arg2.field6485 != null) {
               var19 = var16 + -5 + -(var11 / 2);
               var20 = var17;
               var21 = var11 + 10 + var19;
               var22 = var17 + 3 + var10 * class189.field2359.method3466();
               if (arg2.field6499 != 0) {
                  arg0.method609(1, -var17 + var22, var19, -var19 + var21, var17, arg2.field6499);
               }

               if (arg2.field6486 != 0) {
                  arg0.method637(var19, -var19 + var21, arg2.field6486, var17, 1, -var17 + var22);
               }

               int var23 = 0;
               if (var4 != 0 || ~var10 < ~var23) {
                  do {
                     String var24 = class288.field4046[var23];
                     if (var10 + -1 > var23) {
                        var24 = var24.substring(0, -4 + var24.length());
                     }

                     class189.field2359.method3465(arg0, var24, var16, var17, arg2.field6488, true);
                     var17 += class189.field2359.method3466();
                     ++var23;
                  } while(~var10 < ~var23);
               }
            }

            if (~arg2.field6515 != 0 || arg2.field6485 != null) {
               class476 var25 = new class476(arg3);
               int var26 = var6 >> 1;
               var25.field7080 = -var26 + var8;
               var25.field7076 = -var26 + var9;
               var25.field7083 = var22;
               var25.field7082 = var21;
               var25.field7081 = var20;
               var25.field7075 = var19;
               var25.field7077 = var9 - -var26;
               var25.field7079 = var8 + var26;
               class100.field1216.method4060(23, var25);
            }

         }
      } catch (RuntimeException var28) {
         throw class670.method4877(var28, field3574[9] + (arg0 != null ? field3574[1] : field3574[2]) + ',' + arg1 + ',' + (arg2 != null ? field3574[1] : field3574[2]) + ',' + (arg3 != null ? field3574[1] : field3574[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(II)V",
      line = 197
   )
   public static final void method1982(int arg0, int arg1) {
      try {
         ++field3568;
         class403 var2 = class453.method3410((long)arg1, true, 12);
         var2.method3096((byte)84);
         if (arg0 != 30604) {
            field3570 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3574[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "(I)[Lqb;",
      line = 220
   )
   public static final class234[] method1983(int arg0) {
      try {
         int var1 = -8 % ((arg0 - -17) / 63);
         ++field3560;
         return new class234[]{class299.field4270, class534.field7792, class355.field5382};
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3574[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(I)V",
      line = 233
   )
   public final void method1984(int arg0) {
      try {
         if (arg0 != 0) {
            this.field3554 = -106;
         }

         ++field3572;
         this.field3551 = this.field3569 | this.field3551 << 8;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3574[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V",
      line = 248
   )
   public static void method1985(byte arg0) {
      try {
         if (arg0 < -61) {
            field3566 = null;
            field3570 = null;
            field3549 = null;
            field3550 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3574[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(ILjj;I)V",
      line = 273
   )
   private final void method1986(int arg0, class128 arg1, int arg2) {
      try {
         ++field3564;
         if (arg0 > -98) {
            method1981((class66)null, (byte)-66, (class426)null, (class446)null);
         }

         if (~arg2 != -2) {
            if (~arg2 == -3) {
               this.field3567 = arg1.method1104(255);
            } else {
               if (arg2 == 3) {
                  this.field3567 = arg1.method1038((byte)-124);
                  if (this.field3567 == 65535) {
                     this.field3567 = -1;
                     return;
                  }
               } else {
                  if (arg2 != 5) {
                     if (~arg2 != -8) {
                        if (arg2 != 8) {
                           if (arg2 == 9) {
                              this.field3556 = arg1.method1038((byte)-119) << 2;
                              return;
                           }

                           if (arg2 != 10) {
                              if (~arg2 != -12) {
                                 if (arg2 == 12) {
                                    this.field3558 = true;
                                    return;
                                 }

                                 if (arg2 == 13) {
                                    this.field3554 = arg1.method1077(-33);
                                    return;
                                 }

                                 if (~arg2 != -15) {
                                    if (~arg2 == -17) {
                                       this.field3565 = arg1.method1104(255);
                                       return;
                                    }
                                 } else {
                                    this.field3561 = arg1.method1104(255) << 2;
                                 }

                                 return;
                              }

                              this.field3551 = arg1.method1104(255);
                              return;
                           }

                           this.field3555 = false;
                           return;
                        }

                        this.field3557.field10786 = this.field3569;
                        return;
                     }

                     this.field3573 = class502.method3746(0, arg1.method1077(-33));
                     return;
                  }

                  this.field3552 = false;
               }

            }
         } else {
            this.field3559 = class502.method3746(0, arg1.method1077(-33));
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3574[8] + arg0 + ',' + (arg1 != null ? field3574[1] : field3574[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1987(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1988(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
