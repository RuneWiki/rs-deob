import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class798 extends class70 {
   @OriginalMember(
      owner = "client!ai",
      name = "L",
      descriptor = "I"
   )
   public int field11612 = 0;
   @OriginalMember(
      owner = "client!ai",
      name = "Q",
      descriptor = "I"
   )
   public int field11604 = 4;
   @OriginalMember(
      owner = "client!ai",
      name = "V",
      descriptor = "I"
   )
   public int field11613 = 1638;
   @OriginalMember(
      owner = "client!ai",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field11606 = new byte[512];
   @OriginalMember(
      owner = "client!ai",
      name = "I",
      descriptor = "I"
   )
   public int field11607 = 4;
   @OriginalMember(
      owner = "client!ai",
      name = "S",
      descriptor = "Z"
   )
   public boolean field11609 = true;
   @OriginalMember(
      owner = "client!ai",
      name = "W",
      descriptor = "I"
   )
   public int field11617 = 4;
   @OriginalMember(
      owner = "client!ai",
      name = "X",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11621 = new String[]{method5756(method5755(":\u00137De")), method5756(method5755(":\u00137Fe")), method5756(method5755("5\u000fuo")), method5756(method5755(":\u00137Ee")), method5756(method5755(" T7-0")), method5756(method5755(":\u00137Ge")), method5756(method5755(":\u00137@e")), method5756(method5755(":\u00137Ae")), method5756(method5755(":\u00137Ke")), method5756(method5755(":\u00137Be"))};
   @OriginalMember(
      owner = "client!ai",
      name = "T",
      descriptor = "Luk;"
   )
   public static class498 field11620 = new class498(114, 3);
   @OriginalMember(
      owner = "client!ai",
      name = "J",
      descriptor = "I"
   )
   public static int field11603;
   @OriginalMember(
      owner = "client!ai",
      name = "P",
      descriptor = "I"
   )
   public static int field11605;
   @OriginalMember(
      owner = "client!ai",
      name = "H",
      descriptor = "I"
   )
   public static int field11608;
   @OriginalMember(
      owner = "client!ai",
      name = "N",
      descriptor = "I"
   )
   public static int field11610;
   @OriginalMember(
      owner = "client!ai",
      name = "R",
      descriptor = "I"
   )
   public static int field11611;
   @OriginalMember(
      owner = "client!ai",
      name = "F",
      descriptor = "I"
   )
   public static int field11614;
   @OriginalMember(
      owner = "client!ai",
      name = "U",
      descriptor = "I"
   )
   public static int field11618;
   @OriginalMember(
      owner = "client!ai",
      name = "O",
      descriptor = "Lclient;"
   )
   public static client field11616;
   @OriginalMember(
      owner = "client!ai",
      name = "G",
      descriptor = "[S"
   )
   private short[] field11615;
   @OriginalMember(
      owner = "client!ai",
      name = "M",
      descriptor = "[S"
   )
   private short[] field11619;

   @OriginalMember(
      owner = "client!ai",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method5750(int arg0) {
      boolean var2 = client.field1786;

      try {
         label64: {
            ++field11610;
            if (~this.field11613 < -1) {
               this.field11615 = new short[this.field11607];
               this.field11619 = new short[this.field11607];
               int var3 = 0;
               if (var2) {
                  this.field11619[var3] = (short)((int)(Math.pow((double)((float)this.field11613 / 4096.0F), (double)var3) * 4096.0D));
                  this.field11615[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                  ++var3;
               }

               while(true) {
                  while(~this.field11607 < ~var3) {
                     this.field11619[var3] = (short)((int)(Math.pow((double)((float)this.field11613 / 4096.0F), (double)var3) * 4096.0D));
                     this.field11615[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     ++var3;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label64;
                     }
                     break;
                  }

                  ++var3;
               }
            }

            if (this.field11619 != null && ~this.field11619.length == ~this.field11607) {
               this.field11615 = new short[this.field11607];
               int var4 = 0;
               if (var2 || ~this.field11607 < ~var4) {
                  do {
                     this.field11615[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                     ++var4;
                  } while(~this.field11607 < ~var4);
               }
            }
         }

         if (arg0 < 53) {
            this.field11606 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11621[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "<init>",
      descriptor = "()V"
   )
   public class798() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ai",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method5751(int arg0) {
      try {
         int var1 = -86 / ((67 - arg0) / 56);
         field11616 = null;
         field11620 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11621[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         this.field11606 = class486.method3780(this.field11612, (byte)46);
         ++field11608;
         this.method5750(85);
         if (arg0) {
            this.field11609 = false;
         }

         int var3 = this.field11607 - 1;
         if (var2 || var3 >= 1) {
            do {
               short var4 = this.field11619[var3];
               if (~var4 < -9) {
                  return;
               }

               if (var4 < -8) {
                  return;
               }

               --this.field11607;
               --var3;
            } while(var3 >= 1);

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11621[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      try {
         ++field11605;
         int[] var3 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            this.method5754(arg1, var3, 7194);
         }

         if (arg0 != 87) {
            this.field11615 = null;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11621[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method5752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field11618;
         int var9 = arg3 >> 12;
         int var10 = var9 - -1;
         int var28 = arg3 & 4095;
         if (arg6 <= var10) {
            var10 = 0;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         label100: {
            var11 = var9 & 255;
            var12 = var28 + -4096;
            var13 = var10 & 255;
            var14 = arg2 + -4096;
            var15 = class198.field3052[var28];
            int var16 = this.field11606[var11 - -arg0] & 3;
            if (var16 > 1) {
               var17 = ~var16 == -3 ? var28 - arg2 : -arg2 + -var28;
               if (!var8) {
                  break label100;
               }
            }

            var17 = var16 == 0 ? arg2 + var28 : -var28 + arg2;
         }

         int var19;
         label101: {
            int var18 = this.field11606[arg0 + var13] & 3;
            if (var18 <= 1) {
               var19 = var18 == 0 ? arg2 + var12 : -var12 + arg2;
               if (!var8) {
                  break label101;
               }
            }

            var19 = ~var18 == -3 ? var12 - arg2 : -arg2 + -var12;
         }

         int var21;
         int var22;
         label102: {
            int var20 = 3 & this.field11606[arg1 + var11];
            var21 = ((-var17 + var19) * var15 >> 12) + var17;
            if (var20 > 1) {
               var22 = ~var20 == -3 ? -var14 + var28 : -var28 + -var14;
               if (!var8) {
                  break label102;
               }
            }

            var22 = ~var20 != -1 ? -var28 + var14 : var28 + var14;
         }

         int var23 = this.field11606[arg1 + var13] & 3;
         if (arg5 != 30056) {
            this.method5750(61);
         }

         int var24;
         label103: {
            if (var23 > 1) {
               var24 = var23 == 2 ? -var14 + var12 : -var12 + -var14;
               if (!var8) {
                  break label103;
               }
            }

            var24 = ~var23 == -1 ? var12 + var14 : var14 - var12;
         }

         int var25 = ((-var22 + var24) * var15 >> 12) + var22;
         return var21 - -((var25 - var21) * arg4 >> 12);
      } catch (RuntimeException var27) {
         throw class482.method3757(var27, field11621[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method5753(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field11603;
         if (class228.field3503 == null) {
            class228.field3503 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + -0.015D + Math.random() * 0.03D;
               int var4 = arg0;
               if (!var1 && ~arg0 <= -65537) {
                  return;
               }

               do {
                  double var5 = (double)((65236 & var4) >> 10) / 64.0D + 0.0078125D;
                  double var7 = (double)((var4 & 982) >> 7) / 8.0D + 0.0625D;
                  double var9 = (double)(127 & var4) / 128.0D;
                  double var11 = var9;
                  double var13 = var9;
                  double var15 = var9;
                  if (var7 != 0.0D) {
                     label127: {
                        double var17;
                        label110: {
                           if (!(var9 < 0.5D)) {
                              var17 = var7 + var9 - var7 * var9;
                              if (!var1) {
                                 break label110;
                              }
                           }

                           var17 = (var7 + 1.0D) * var9;
                        }

                        double var19 = var9 * 2.0D - var17;
                        double var21 = var5 + 0.3333333333333333D;
                        if (var21 > 1.0D) {
                           --var21;
                        }

                        double var25;
                        label123: {
                           var25 = var5 - 0.3333333333333333D;
                           if (var5 * 6.0D < 1.0D) {
                              var13 = (var17 - var19) * 6.0D * var5 + var19;
                              if (!var1) {
                                 break label123;
                              }
                           }

                           if (var5 * 2.0D < 1.0D) {
                              var13 = var17;
                              if (!var1) {
                                 break label123;
                              }
                           }

                           if (!(var5 * 3.0D < 2.0D)) {
                              var13 = var19;
                              if (!var1) {
                                 break label123;
                              }
                           }

                           var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                        }

                        if (var25 < 0.0D) {
                           ++var25;
                        }

                        label90: {
                           if (var21 * 6.0D < 1.0D) {
                              var11 = (-var19 + var17) * 6.0D * var21 + var19;
                              if (!var1) {
                                 break label90;
                              }
                           }

                           if (!(var21 * 2.0D < 1.0D)) {
                              label85: {
                                 if (var21 * 3.0D < 2.0D) {
                                    var11 = (-var19 + var17) * (-var21 + 0.6666666666666666D) * 6.0D + var19;
                                    if (!var1) {
                                       break label85;
                                    }
                                 }

                                 var11 = var19;
                                 if (var1) {
                                    var11 = var17;
                                 }
                              }
                           } else {
                              var11 = var17;
                           }
                        }

                        if (!(var25 * 6.0D < 1.0D)) {
                           if (var25 * 2.0D < 1.0D) {
                              var15 = var17;
                              if (!var1) {
                                 break label127;
                              }
                           }

                           if (!(var25 * 3.0D < 2.0D)) {
                              var15 = var19;
                              if (!var1) {
                                 break label127;
                              }
                           }

                           var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                           if (!var1) {
                              break label127;
                           }
                        }

                        var15 = (-var19 + var17) * 6.0D * var25 + var19;
                     }
                  }

                  double var27 = Math.pow(var11, var2);
                  double var29 = Math.pow(var13, var2);
                  double var31 = Math.pow(var15, var2);
                  int var33 = (int)(var27 * 256.0D);
                  int var34 = (int)(var29 * 256.0D);
                  int var35 = (int)(var31 * 256.0D);
                  int var36 = (var33 << 16) - (-(var34 << 8) + -var35);
                  class228.field3503[var4] = var36;
                  ++var4;
               } while(~var4 > -65537);

               return;
            }
         }

      } catch (RuntimeException var38) {
         throw class482.method3757(var38, field11621[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label120: {
            label125: {
               label126: {
                  label117: {
                     label127: {
                        ++field11611;
                        if (arg1 != 0) {
                           if (arg1 == 1) {
                              break label127;
                           }

                           if (~arg1 == -3) {
                              break label117;
                           }

                           if (arg1 == 3) {
                              this.field11604 = this.field11617 = arg2.method2855(-31007);
                              if (!var4) {
                                 break label120;
                              }
                              break label126;
                           }

                           if (~arg1 == -5) {
                              break label126;
                           }

                           if (arg1 == 5) {
                              this.field11604 = arg2.method2855(-31007);
                              if (!var4) {
                                 break label120;
                              }
                              break label125;
                           }

                           if (arg1 != 6) {
                              break label120;
                           }

                           if (!var4) {
                              break label125;
                           }
                        }

                        this.field11609 = arg2.method2855(arg0 + -31006) == 1;
                        if (!var4) {
                           break label120;
                        }
                     }

                     this.field11607 = arg2.method2855(-31007);
                     if (!var4) {
                        break label120;
                     }
                  }

                  this.field11613 = arg2.method2869(false);
                  if (this.field11613 >= 0) {
                     break label120;
                  }

                  this.field11619 = new short[this.field11607];
                  int var6 = 0;
                  if (var4) {
                     this.field11619[var6] = (short)arg2.method2869(false);
                     ++var6;
                  }

                  while(true) {
                     while(this.field11607 > var6) {
                        this.field11619[var6] = (short)arg2.method2869(false);
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label120;
                        }

                        this.field11604 = this.field11617 = arg2.method2855(-31007);
                        if (!var4) {
                           break label120;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               this.field11612 = arg2.method2855(arg0 ^ 31006);
               if (!var4) {
                  break label120;
               }

               this.field11604 = arg2.method2855(-31007);
               if (!var4) {
                  break label120;
               }
            }

            this.field11617 = arg2.method2855(arg0 ^ 31006);
         }

         if (arg0 != -1) {
            field11616 = null;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11621[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11621[4] : field11621[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(I[II)V"
   )
   public final void method5754(int param1, int[] param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5755(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5756(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
