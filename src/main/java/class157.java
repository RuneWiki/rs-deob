import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class157 {
   @OriginalMember(
      owner = "client!wh",
      name = "d",
      descriptor = "I"
   )
   private int field2000;
   @OriginalMember(
      owner = "client!wh",
      name = "k",
      descriptor = "[[I"
   )
   private int[][] field1996;
   @OriginalMember(
      owner = "client!wh",
      name = "j",
      descriptor = "I"
   )
   private int field1995;
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2001 = new String[]{method1308(method1307("88\u0018A\u0007")), method1308(method1307("88\u0018F\u0007")), method1308(method1307("4~\u0018-R")), method1308(method1307("88\u0018J\u0007")), method1308(method1307("!%Zo")), method1308(method1307("88\u0018B\u0007")), method1308(method1307("88\u0018?F!9B=\u0007")), method1308(method1307("88\u0018K\u0007")), method1308(method1307("88\u0018G\u0007")), method1308(method1307("88\u0018E\u0007")), method1308(method1307("88\u0018@\u0007")), method1308(method1307("88\u0018D\u0007"))};
   @OriginalMember(
      owner = "client!wh",
      name = "f",
      descriptor = "Lsd;"
   )
   public static class101 field1991 = new class101(78, 0);
   @OriginalMember(
      owner = "client!wh",
      name = "h",
      descriptor = "I"
   )
   public static int field1989;
   @OriginalMember(
      owner = "client!wh",
      name = "e",
      descriptor = "I"
   )
   public static int field1990;
   @OriginalMember(
      owner = "client!wh",
      name = "l",
      descriptor = "I"
   )
   public static int field1992;
   @OriginalMember(
      owner = "client!wh",
      name = "g",
      descriptor = "I"
   )
   public static int field1993;
   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "I"
   )
   public static int field1994;
   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "I"
   )
   public static int field1997;
   @OriginalMember(
      owner = "client!wh",
      name = "i",
      descriptor = "I"
   )
   public static int field1998;
   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "I"
   )
   public static int field1999;

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "([BB)[B"
   )
   public final byte[] method1298(byte[] arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         if (this.field1996 != null) {
            int var4;
            int[] var5;
            int var9;
            label112: {
               var4 = (int)((long)arg0.length * (long)this.field1995 / (long)this.field2000) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3 != 0) {
                  var9 = arg0[var8];
               } else if (var8 >= arg0.length) {
                  arg0 = new byte[var4];
                  var9 = 0;
                  if (var3 == 0) {
                     break label112;
                  }
               } else {
                  var9 = arg0[var8];
               }

               label111:
               while(true) {
                  int[] var10 = this.field1996[var7];
                  int var11 = 0;
                  if (var3 != 0) {
                     var5[var6 + var11] += var10[var11] * var9;
                     ++var11;
                  }

                  while(true) {
                     while(var11 < 14) {
                        var5[var6 + var11] += var10[var11] * var9;
                        ++var11;
                     }

                     int var12 = this.field1995 + var7;
                     int var13 = var12 / this.field2000;
                     var7 = var12 - this.field2000 * var13;
                     var6 += var13;
                     if (var3 == 0) {
                        ++var8;
                        if (var8 >= arg0.length) {
                           arg0 = new byte[var4];
                           var9 = 0;
                           if (var3 == 0) {
                              break label111;
                           }
                        } else {
                           var9 = arg0[var8];
                        }
                        break;
                     }

                     ++var11;
                  }
               }
            }

            if (var3 != 0 || ~var9 > ~var4) {
               do {
                  int var14 = var5[var9] + 32768 >> 16;
                  if (~var14 <= 127) {
                     if (~var14 < -128) {
                        arg0[var9] = 127;
                        if (var3 != 0) {
                           arg0[var9] = (byte)var14;
                           if (var3 != 0) {
                              arg0[var9] = -128;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        arg0[var9] = (byte)var14;
                        if (var3 != 0) {
                           arg0[var9] = -128;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     }
                  } else {
                     arg0[var9] = -128;
                     ++var9;
                  }
               } while(~var9 > ~var4);
            }
         }

         ++field1994;
         return arg1 > -70 ? null : arg0;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field2001[10] + (arg0 != null ? field2001[2] : field2001[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(Lwba;ZB)V"
   )
   public static final void method1299(class55 arg0, boolean arg1, byte arg2) {
      try {
         ++field1989;
         class336.field4807.method1663(-122, arg0);
         if (arg1) {
            class686.method4988(class491.field7266, class251.field3357, (byte)88, arg0, class604.field8882, class336.field4807);
         }

         int var3 = 55 % ((arg2 - -15) / 53);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2001[8] + (arg0 != null ? field2001[2] : field2001[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1300(int arg0) {
      try {
         if (arg0 > 29) {
            field1991 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2001[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "(II)Z"
   )
   public static final boolean method1301(int arg0, int arg1) {
      try {
         if (arg0 <= 19) {
            field1991 = null;
         }

         ++field1992;
         return ~arg1 == -4 || ~arg1 == -8 || ~arg1 == -11;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2001[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1302(int arg0, int arg1) {
      try {
         if (this.field1996 != null) {
            arg0 = (int)((long)this.field1995 * (long)arg0 / (long)this.field2000);
         }

         ++field1990;
         if (arg1 <= 28) {
            this.field2000 = 61;
         }

         return arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2001[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method1303(int arg0, int arg1) {
      try {
         if (this.field1996 != null) {
            arg0 = (int)((long)this.field1995 * (long)arg0 / (long)this.field2000) + 6;
         }

         ++field1999;
         int var3 = 122 / ((arg1 - -13) / 48);
         return arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2001[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1304(int arg0) {
      try {
         ++field1997;
         int var1 = 0;
         if (~class261.field3566.field9431.method2469(116) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (~class261.field3566.field9467.method2369(100) == -1) {
            var1 |= 64;
         }

         class635.method4573(false, var1);
         class151.field1896.method5076(var1, true);
         class54.field616.method1686(var1, true);
         if (arg0 >= -64) {
            method1299((class55)null, true, (byte)123);
         }

         class536.field7845.method3362(var1, 29221);
         class619.field9029.method3634(var1, (byte)-126);
         class220.method1671(var1, 8);
         class478.method3544(true, var1);
         class61.method509(var1, 3553);
         class789.method5663(var1, -25083);
         class298.method2274(-125);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2001[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "([SB)[S"
   )
   public final short[] method1305(short[] arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         int var4 = 28 % ((34 - arg1) / 47);
         if (this.field1996 != null) {
            int var5;
            int[] var6;
            int var10;
            label99: {
               var5 = (int)((long)arg0.length * (long)this.field1995 / (long)this.field2000) + 14;
               var6 = new int[var5];
               int var7 = 0;
               int var8 = 0;
               int var9 = 0;
               if (var3 != 0) {
                  var10 = arg0[var9];
               } else if (arg0.length <= var9) {
                  arg0 = new short[var5];
                  var10 = 0;
                  if (var3 == 0) {
                     break label99;
                  }
               } else {
                  var10 = arg0[var9];
               }

               label98:
               while(true) {
                  int[] var11 = this.field1996[var8];
                  int var12 = 0;
                  if (var3 != 0) {
                     var6[var7 + var12] += var11[var12] * var10 >> 2;
                     ++var12;
                  }

                  while(true) {
                     while(~var12 > -15) {
                        var6[var7 + var12] += var11[var12] * var10 >> 2;
                        ++var12;
                     }

                     int var13 = this.field1995 + var8;
                     int var14 = var13 / this.field2000;
                     var7 += var14;
                     var8 = var13 - this.field2000 * var14;
                     if (var3 == 0) {
                        ++var9;
                        if (arg0.length <= var9) {
                           arg0 = new short[var5];
                           var10 = 0;
                           if (var3 == 0) {
                              break label98;
                           }
                        } else {
                           var10 = arg0[var9];
                        }
                        break;
                     }

                     ++var12;
                  }
               }
            }

            if (var3 != 0 || ~var10 > ~var5) {
               do {
                  int var15 = var6[var10] + 8192 >> 14;
                  if (var15 < -32768) {
                     arg0[var10] = -32768;
                     if (var3 == 0) {
                        ++var10;
                        continue;
                     }
                  }

                  if (var15 > 32767) {
                     arg0[var10] = 32767;
                     if (var3 != 0) {
                        arg0[var10] = (short)var15;
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     arg0[var10] = (short)var15;
                     ++var10;
                  }
               } while(~var10 > ~var5);
            }
         }

         ++field1993;
         return arg0;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field2001[9] + (arg0 != null ? field2001[2] : field2001[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(IIILch;)V"
   )
   public static final void method1306(int arg0, int arg1, int arg2, class488 arg3) {
      int var4 = client.field4530;

      try {
         ++field1998;
         if (class750.field11111) {
            int var5 = 0;
            class303 var6 = (class303)arg3.field7218.method5158(0);
            int var7;
            if (var4 != 0) {
               var7 = class570.method4226(var6, true);
               if (var7 > var5) {
                  var5 = var7;
               }

               var6 = (class303)arg3.field7218.method5163((byte)120);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var5 += 8;
                  var10000 = arg3.field7211 * 16;
                  if (var4 == 0) {
                     class164.field2062 = var10000 - -(class382.field5859 ? 26 : 22);
                     int var8 = arg3.field7211 * 16 - -21;
                     int var9 = class319.field4561 - -class712.field10630;
                     if (~class207.field2647 > ~(var5 + var9)) {
                        var9 = -var5 + class319.field4561;
                     }

                     if (var9 < 0) {
                        var9 = 0;
                     }

                     int var10 = !class382.field5859 ? 31 : 33;
                     int var11 = arg2 + 13 + -var10;
                     if (~(var11 - -var8) < ~class411.field6305) {
                        var11 = class411.field6305 - var8;
                     }

                     class501.field7452 = var9;
                     if (~var11 > -1) {
                        var11 = 0;
                     }

                     class707.field10582 = var5;
                     if (arg1 >= -111) {
                        return;
                     }

                     class276.field3848 = var11;
                     class352.field5348 = arg3;
                     return;
                  }
               } else {
                  var10000 = class570.method4226(var6, true);
               }

               var7 = var10000;
               if (var7 > var5) {
                  var5 = var7;
               }

               var6 = (class303)arg3.field7218.method5163((byte)120);
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field2001[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2001[2] : field2001[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class157(int arg0, int arg1) {
      int var3 = client.field4530;
      super();

      try {
         if (~arg0 != ~arg1) {
            int var4 = class170.method1365(4096, arg0, arg1);
            int var22 = arg1 / var4;
            int var21 = arg0 / var4;
            this.field2000 = var21;
            this.field1996 = new int[var21][14];
            this.field1995 = var22;
            int var5 = 0;
            if (var3 != 0 || var5 < var21) {
               do {
                  int[] var6 = this.field1996[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 - 7.0D + 1.0D);
                  if (var9 < 0) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (var10 > 14) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 != 0 || ~var9 > ~var10) {
                     do {
                        double var13 = ((double)var9 + -var7) * 3.141592653589793D;
                        double var15 = var11;
                        if (!(var13 < -1.0E-4D)) {
                           if (var13 > 1.0E-4D) {
                              var15 = var11 * (Math.sin(var13) / var13);
                           }
                        } else {
                           var15 = var11 * (Math.sin(var13) / var13);
                        }

                        double var17 = var15 * (0.54D + Math.cos(((double)var9 + -var7) * 0.2243994752564138D) * 0.46D);
                        var6[var9] = (int)Math.floor(var17 * 65536.0D + 0.5D);
                        ++var9;
                     } while(~var9 > ~var10);
                  }

                  ++var5;
               } while(var5 < var21);

            }
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field2001[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1307(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1308(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
