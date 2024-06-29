import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class398 {
   @OriginalMember(
      owner = "client!jf",
      name = "f",
      descriptor = "I"
   )
   private int field6246;
   @OriginalMember(
      owner = "client!jf",
      name = "g",
      descriptor = "I"
   )
   private int field6236;
   @OriginalMember(
      owner = "client!jf",
      name = "m",
      descriptor = "[[I"
   )
   private int[][] field6239;
   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6247 = new String[]{method3217(method3216("\u0015\rN\u00068")), method3217(method3216("\u0015\rN\u00008")), method3217(method3216("\u0004ENlm")), method3217(method3216("\u0011\u001e\f.")), method3217(method3216("\u0015\rN~y\u0011\u0002\u0014|8")), method3217(method3216("\u0015\rN\n8")), method3217(method3216("\u0015\rN\u00038")), method3217(method3216("\u0015\rN\u00048")), method3217(method3216("\u0015\rN\u00018")), method3217(method3216("\u0015\rN\u00078")), method3217(method3216("\u0015\rN\u00058"))};
   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "Lhka;"
   )
   public static class377 field6241 = new class377(8, 7);
   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field6245 = false;
   @OriginalMember(
      owner = "client!jf",
      name = "h",
      descriptor = "I"
   )
   public static int field6234;
   @OriginalMember(
      owner = "client!jf",
      name = "l",
      descriptor = "I"
   )
   public static int field6235;
   @OriginalMember(
      owner = "client!jf",
      name = "j",
      descriptor = "I"
   )
   public static int field6237;
   @OriginalMember(
      owner = "client!jf",
      name = "i",
      descriptor = "I"
   )
   public static int field6238;
   @OriginalMember(
      owner = "client!jf",
      name = "d",
      descriptor = "I"
   )
   public static int field6240;
   @OriginalMember(
      owner = "client!jf",
      name = "k",
      descriptor = "I"
   )
   public static int field6242;
   @OriginalMember(
      owner = "client!jf",
      name = "e",
      descriptor = "I"
   )
   public static int field6244;
   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "[[I"
   )
   public static int[][] field6243;

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3208(boolean arg0) {
      try {
         if (arg0) {
            field6243 = null;
            field6241 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6247[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(Z[S)[S"
   )
   public final short[] method3209(boolean arg0, short[] arg1) {
      boolean var3 = client.field1786;

      try {
         if (this.field6239 != null) {
            int var4;
            int[] var5;
            int var9;
            label105: {
               var4 = (int)((long)arg1.length * (long)this.field6246 / (long)this.field6236) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg1[var8];
               } else if (~arg1.length >= ~var8) {
                  arg1 = new short[var4];
                  var9 = 0;
                  if (!var3) {
                     break label105;
                  }
               } else {
                  var9 = arg1[var8];
               }

               label104:
               while(true) {
                  int[] var10 = this.field6239[var7];
                  int var11 = 0;
                  if (var3) {
                     var5[var6 - -var11] += var10[var11] * var9 >> 2;
                     ++var11;
                  }

                  while(true) {
                     while(var11 < 14) {
                        var5[var6 - -var11] += var10[var11] * var9 >> 2;
                        ++var11;
                     }

                     int var12 = this.field6246 + var7;
                     int var13 = var12 / this.field6236;
                     var7 = var12 - this.field6236 * var13;
                     var6 += var13;
                     if (!var3) {
                        ++var8;
                        if (~arg1.length >= ~var8) {
                           arg1 = new short[var4];
                           var9 = 0;
                           if (!var3) {
                              break label104;
                           }
                        } else {
                           var9 = arg1[var8];
                        }
                        break;
                     }

                     ++var11;
                  }
               }
            }

            if (var3 || var4 > var9) {
               do {
                  int var14 = var5[var9] + 8192 >> 14;
                  if (var14 >= -32768) {
                     if (var14 <= 32767) {
                        arg1[var9] = (short)var14;
                        if (!var3) {
                           ++var9;
                           continue;
                        }
                     }

                     arg1[var9] = 32767;
                     if (var3) {
                        arg1[var9] = -32768;
                        ++var9;
                     } else {
                        ++var9;
                     }
                  } else {
                     arg1[var9] = -32768;
                     ++var9;
                  }
               } while(var4 > var9);
            }
         }

         ++field6234;
         if (!arg0) {
            this.method3215(90, -30);
         }

         return arg1;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field6247[8] + arg0 + ',' + (arg1 != null ? field6247[2] : field6247[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(B[B)[B"
   )
   public final byte[] method3210(byte arg0, byte[] arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6242;
         if (this.field6239 != null) {
            int var4;
            int[] var5;
            int var9;
            label112: {
               var4 = (int)((long)arg1.length * (long)this.field6246 / (long)this.field6236) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg1[var8];
               } else if (~var8 <= ~arg1.length) {
                  arg1 = new byte[var4];
                  var9 = 0;
                  if (!var3) {
                     break label112;
                  }
               } else {
                  var9 = arg1[var8];
               }

               label111:
               while(true) {
                  int[] var10 = this.field6239[var7];
                  int var11 = 0;
                  if (var3) {
                     var5[var6 + var11] += var10[var11] * var9;
                     ++var11;
                  }

                  while(true) {
                     while(~var11 > -15) {
                        var5[var6 + var11] += var10[var11] * var9;
                        ++var11;
                     }

                     int var12 = this.field6246 + var7;
                     int var13 = var12 / this.field6236;
                     var7 = var12 - this.field6236 * var13;
                     var6 += var13;
                     if (!var3) {
                        ++var8;
                        if (~var8 <= ~arg1.length) {
                           arg1 = new byte[var4];
                           var9 = 0;
                           if (!var3) {
                              break label111;
                           }
                        } else {
                           var9 = arg1[var8];
                        }
                        break;
                     }

                     ++var11;
                  }
               }
            }

            if (var3 || ~var4 < ~var9) {
               do {
                  int var14 = var5[var9] + 32768 >> 16;
                  if (var14 >= -128) {
                     if (var14 > 127) {
                        arg1[var9] = 127;
                        if (var3) {
                           arg1[var9] = (byte)var14;
                           if (var3) {
                              arg1[var9] = -128;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        arg1[var9] = (byte)var14;
                        if (var3) {
                           arg1[var9] = -128;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     }
                  } else {
                     arg1[var9] = -128;
                     ++var9;
                  }
               } while(~var4 < ~var9);
            }
         }

         if (arg0 != -6) {
            method3212(-44, -4, false);
         }

         return arg1;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field6247[1] + arg0 + ',' + (arg1 != null ? field6247[2] : field6247[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "([SB)[S"
   )
   public static final short[] method3211(short[] arg0, byte arg1) {
      try {
         ++field6237;
         if (arg0 == null) {
            return null;
         } else {
            short[] var2 = new short[arg0.length];
            int var3 = -41 / ((23 - arg1) / 44);
            class107.method1024(arg0, 0, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6247[5] + (arg0 != null ? field6247[2] : field6247[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method3212(int arg0, int arg1, boolean arg2) {
      try {
         ++field6244;
         class566 var3 = class146.method1321((long)arg0, 12, -1428737160);
         var3.method4269((byte)-104);
         var3.field8394 = arg1;
         if (!arg2) {
            method3214(-107);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6247[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method3213(byte arg0, int arg1) {
      try {
         if (this.field6239 != null) {
            arg1 = (int)((long)this.field6246 * (long)arg1 / (long)this.field6236);
         }

         ++field6240;
         return arg0 != -39 ? -102 : arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6247[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3214(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field6238;
         int var2 = class728.field10861;
         int[] var3 = class17.field223;
         int var4 = 0;
         if (!var1 && var2 <= var4) {
            if (arg0 != 8214) {
               field6245 = true;
            }
         } else {
            do {
               class9 var5 = class484.field7370[var3[var4]];
               if (var5 != null) {
                  class705.method5201((byte)-98, var5.method61((byte)70), var5);
               }

               ++var4;
            } while(var2 > var4);

            if (arg0 != 8214) {
               field6245 = true;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6247[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method3215(int arg0, int arg1) {
      try {
         if (this.field6239 != null) {
            arg0 = 6 - -((int)((long)this.field6246 * (long)arg0 / (long)this.field6236));
         }

         if (arg1 != 6) {
            field6245 = true;
         }

         ++field6235;
         return arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6247[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class398(int arg0, int arg1) {
      boolean var3 = client.field1786;
      super();

      try {
         if (arg0 != arg1) {
            int var4 = class607.method4474(arg0, arg1, 17432);
            int var22 = arg1 / var4;
            int var21 = arg0 / var4;
            this.field6246 = var22;
            this.field6236 = var21;
            this.field6239 = new int[var21][14];
            int var5 = 0;
            if (var3 || var5 < var21) {
               do {
                  int[] var6 = this.field6239[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 + -7.0D + 1.0D);
                  if (var9 < 0) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (~var10 < -15) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 || ~var9 > ~var10) {
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
         throw class482.method3757(var20, field6247[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3216(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3217(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
