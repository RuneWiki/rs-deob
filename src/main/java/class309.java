import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class309 extends class302 {
   @OriginalMember(
      owner = "client!tf",
      name = "R",
      descriptor = "I"
   )
   public int field4386 = 4;
   @OriginalMember(
      owner = "client!tf",
      name = "Y",
      descriptor = "I"
   )
   public int field4387 = 4;
   @OriginalMember(
      owner = "client!tf",
      name = "eb",
      descriptor = "I"
   )
   public int field4392 = 0;
   @OriginalMember(
      owner = "client!tf",
      name = "M",
      descriptor = "[B"
   )
   private byte[] field4385 = new byte[512];
   @OriginalMember(
      owner = "client!tf",
      name = "X",
      descriptor = "Z"
   )
   public boolean field4393 = true;
   @OriginalMember(
      owner = "client!tf",
      name = "P",
      descriptor = "I"
   )
   public int field4384 = 1638;
   @OriginalMember(
      owner = "client!tf",
      name = "J",
      descriptor = "I"
   )
   public int field4400 = 4;
   @OriginalMember(
      owner = "client!tf",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4405 = new String[]{method2339(method2338("%\nd\u00151")), method2339(method2338("?\u0019&<")), method2339(method2338("*Bd~d")), method2339(method2338("%\nd\u00141")), method2339(method2338("%\nd\u00171")), method2339(method2338("%\nd\u00011")), method2339(method2338("%\nd\u00131")), method2339(method2338("%\nd\u00111")), method2339(method2338("%\nd\u00021")), method2339(method2338("%\nd\u00031")), method2339(method2338(":\u0000")), method2339(method2338("%\nd\u00161"))};
   @OriginalMember(
      owner = "client!tf",
      name = "Z",
      descriptor = "Lwia;"
   )
   public static class791 field4394 = new class791(8);
   @OriginalMember(
      owner = "client!tf",
      name = "N",
      descriptor = "Lada;"
   )
   public static class173 field4402 = new class173();
   @OriginalMember(
      owner = "client!tf",
      name = "O",
      descriptor = "I"
   )
   public static int field4382;
   @OriginalMember(
      owner = "client!tf",
      name = "Q",
      descriptor = "I"
   )
   public static int field4383;
   @OriginalMember(
      owner = "client!tf",
      name = "db",
      descriptor = "I"
   )
   public static int field4389;
   @OriginalMember(
      owner = "client!tf",
      name = "U",
      descriptor = "I"
   )
   public static int field4390;
   @OriginalMember(
      owner = "client!tf",
      name = "S",
      descriptor = "I"
   )
   public static int field4391;
   @OriginalMember(
      owner = "client!tf",
      name = "cb",
      descriptor = "I"
   )
   public static int field4395;
   @OriginalMember(
      owner = "client!tf",
      name = "ab",
      descriptor = "I"
   )
   public static int field4396;
   @OriginalMember(
      owner = "client!tf",
      name = "L",
      descriptor = "I"
   )
   public static int field4397;
   @OriginalMember(
      owner = "client!tf",
      name = "V",
      descriptor = "I"
   )
   public static int field4399;
   @OriginalMember(
      owner = "client!tf",
      name = "H",
      descriptor = "I"
   )
   public static int field4401;
   @OriginalMember(
      owner = "client!tf",
      name = "W",
      descriptor = "I"
   )
   public static int field4403;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!tf",
      name = "T",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4404;
   @OriginalMember(
      owner = "client!tf",
      name = "bb",
      descriptor = "[S"
   )
   private short[] field4388;
   @OriginalMember(
      owner = "client!tf",
      name = "I",
      descriptor = "[S"
   )
   private short[] field4398;

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2331(boolean arg0) {
      try {
         if (arg0) {
            field4402 = null;
            field4394 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4405[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IIIIIIB)I"
   )
   private final int method2332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      int var8 = client.field4530;

      try {
         ++field4395;
         if (arg6 != 9) {
            this.method2333(78);
         }

         int var9 = arg3 >> 12;
         int var10 = var9 + 1;
         if (~var10 <= ~arg0) {
            var10 = 0;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var16;
         int var17;
         int var28;
         label100: {
            var28 = arg3 & 4095;
            var11 = var9 & 255;
            var12 = var10 & 255;
            var13 = arg1 + -4096;
            var14 = var28 - 4096;
            int var15 = this.field4385[var11 - -arg4] & 3;
            var16 = class354.field5364[var28];
            if (~var15 >= -2) {
               var17 = var15 == 0 ? arg1 + var28 : -var28 + arg1;
               if (var8 == 0) {
                  break label100;
               }
            }

            var17 = var15 != 2 ? -var28 - arg1 : var28 - arg1;
         }

         int var19;
         label101: {
            int var18 = this.field4385[arg4 + var12] & 3;
            if (~var18 < -2) {
               var19 = var18 != 2 ? -var14 - arg1 : -arg1 + var14;
               if (var8 == 0) {
                  break label101;
               }
            }

            var19 = var18 != 0 ? -var14 + arg1 : arg1 + var14;
         }

         int var21;
         int var22;
         label102: {
            int var20 = 3 & this.field4385[arg2 + var11];
            var21 = ((-var17 + var19) * var16 >> 12) + var17;
            if (~var20 >= -2) {
               var22 = var20 != 0 ? -var28 + var13 : var28 - -var13;
               if (var8 == 0) {
                  break label102;
               }
            }

            var22 = var20 == 2 ? -var13 + var28 : -var28 + -var13;
         }

         int var24;
         label103: {
            int var23 = 3 & this.field4385[arg2 + var12];
            if (var23 <= 1) {
               var24 = var23 == 0 ? var14 - -var13 : -var14 + var13;
               if (var8 == 0) {
                  break label103;
               }
            }

            var24 = var23 != 2 ? -var13 + -var14 : var14 - var13;
         }

         int var25 = ((-var22 + var24) * var16 >> 12) + var22;
         return ((-var21 + var25) * arg5 >> 12) + var21;
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field4405[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method2333(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != 0) {
            this.method2332(121, -2, -72, -91, 107, -34, (byte)-123);
         }

         ++field4396;
         if (~this.field4384 >= -1) {
            if (this.field4398 != null && ~this.field4398.length == ~this.field4400) {
               this.field4388 = new short[this.field4400];
               int var3 = 0;
               if (var2 != 0) {
                  this.field4388[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                  ++var3;
               }

               while(true) {
                  while(var3 < this.field4400) {
                     this.field4388[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     ++var3;
                  }

                  if (var2 == 0) {
                     return;
                  }

                  ++var3;
               }
            }
         } else {
            this.field4388 = new short[this.field4400];
            this.field4398 = new short[this.field4400];
            int var4 = 0;
            if (var2 != 0 || var4 < this.field4400) {
               do {
                  this.field4398[var4] = (short)((int)(Math.pow((double)((float)this.field4384 / 4096.0F), (double)var4) * 4096.0D));
                  this.field4388[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                  ++var4;
               } while(var4 < this.field4400);
            }
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4405[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label120: {
            label125: {
               label126: {
                  label117: {
                     label127: {
                        ++field4382;
                        if (arg0 != 0) {
                           if (~arg0 == -2) {
                              break label127;
                           }

                           if (arg0 == 2) {
                              break label117;
                           }

                           if (arg0 == 3) {
                              this.field4387 = this.field4386 = arg2.method1104(255);
                              if (var4 == 0) {
                                 break label120;
                              }
                              break label126;
                           }

                           if (~arg0 == -5) {
                              break label126;
                           }

                           if (~arg0 == -6) {
                              this.field4387 = arg2.method1104(255);
                              if (var4 == 0) {
                                 break label120;
                              }
                              break label125;
                           }

                           if (~arg0 != -7) {
                              break label120;
                           }

                           if (var4 == 0) {
                              break label125;
                           }
                        }

                        this.field4393 = arg2.method1104(arg1 + 255) == 1;
                        if (var4 == 0) {
                           break label120;
                        }
                     }

                     this.field4400 = arg2.method1104(255);
                     if (var4 == 0) {
                        break label120;
                     }
                  }

                  this.field4384 = arg2.method1066(32767);
                  if (~this.field4384 <= -1) {
                     break label120;
                  }

                  this.field4398 = new short[this.field4400];
                  int var6 = 0;
                  if (var4 != 0) {
                     this.field4398[var6] = (short)arg2.method1066(32767);
                     ++var6;
                  }

                  while(true) {
                     while(var6 < this.field4400) {
                        this.field4398[var6] = (short)arg2.method1066(32767);
                        ++var6;
                     }

                     if (var4 == 0) {
                        if (var4 == 0) {
                           break label120;
                        }

                        this.field4387 = this.field4386 = arg2.method1104(255);
                        if (var4 == 0) {
                           break label120;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               this.field4392 = arg2.method1104(255);
               if (var4 == 0) {
                  break label120;
               }

               this.field4387 = arg2.method1104(255);
               if (var4 == 0) {
                  break label120;
               }
            }

            this.field4386 = arg2.method1104(arg1 ^ 255);
         }

         if (arg1 != 0) {
            this.method401(24, 32);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4405[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4405[2] : field4405[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      int var2 = client.field4530;

      try {
         this.field4385 = class200.method1537(-113, this.field4392);
         ++field4383;
         this.method2333(0);
         if (arg0 <= -87) {
            int var3 = this.field4400 + -1;
            if (var2 != 0 || ~var3 <= -2) {
               do {
                  short var4 = this.field4398[var3];
                  if (var4 > 8 || var4 < -8) {
                     return;
                  }

                  --this.field4400;
                  --var3;
               } while(~var3 <= -2);

            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4405[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "<init>",
      descriptor = "()V"
   )
   public class309() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(ZLjava/lang/String;)[B"
   )
   public static final byte[] method2334(boolean arg0, String arg1) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field4391;
            int var2 = arg1.length();
            if (var2 == 0) {
               return new byte[0];
            } else {
               int var4;
               label53: {
                  int var3 = var2 + 3 & -4;
                  var4 = var3 / 4 * 3;
                  if (~var2 >= ~(var3 + -2) || class732.method5325(92, arg1.charAt(var3 + -2)) == -1) {
                     var4 -= 2;
                     if (client.field4530 == 0) {
                        break label53;
                     }
                  }

                  if (var2 <= var3 + -1 || class732.method5325(-103, arg1.charAt(var3 + -1)) == -1) {
                     --var4;
                  }
               }

               byte[] var5 = new byte[var4];
               class613.method4458(true, var5, 0, arg1);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4405[0] + arg0 + ',' + (arg1 != null ? field4405[2] : field4405[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "([IBI)V"
   )
   public final void method2335(int[] param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      try {
         ++field4390;
         int[] var3 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 > -37) {
            method2336(-14, -122, (class66)null);
         }

         if (super.field4298.field6356) {
            this.method2335(var3, (byte)81, arg0);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4405[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IILha;)Z"
   )
   public static final boolean method2336(int param0, int param1, class66 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2337(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
