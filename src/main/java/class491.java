import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class491 {
   @OriginalMember(
      owner = "client!ul",
      name = "i",
      descriptor = "[[I"
   )
   private int[][] field6859;
   @OriginalMember(
      owner = "client!ul",
      name = "e",
      descriptor = "I"
   )
   private int field6858;
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "I"
   )
   private int field6856;
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6865 = new String[]{method3738(method3737("*\u0001?\u001c\u001c")), method3738(method3737("$C?sI")), method3738(method3737("1\u0018}1")), method3738(method3737("*\u0001?\u001f\u001c")), method3738(method3737("*\u0001?\u001e\u001c")), method3738(method3737("*\u0001?\u001b\u001c")), method3738(method3737("*\u0001?a]1\u0004ec\u001c")), method3738(method3737("*\u0001?\u0018\u001c")), method3738(method3737("*\u0001?\u001a\u001c")), method3738(method3737("*\u0001?\u0019\u001c"))};
   @OriginalMember(
      owner = "client!ul",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field6863 = new class418(46, 0);
   @OriginalMember(
      owner = "client!ul",
      name = "f",
      descriptor = "I"
   )
   public static int field6864 = -1;
   @OriginalMember(
      owner = "client!ul",
      name = "k",
      descriptor = "I"
   )
   public static int field6854;
   @OriginalMember(
      owner = "client!ul",
      name = "j",
      descriptor = "I"
   )
   public static int field6855;
   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "I"
   )
   public static int field6857;
   @OriginalMember(
      owner = "client!ul",
      name = "h",
      descriptor = "I"
   )
   public static int field6860;
   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "I"
   )
   public static int field6861;
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "I"
   )
   public static int field6862;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method3730(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            field6864 = -25;
         }

         ++field6861;
         class410.method3217(class661.field9817, -1, arg0, class204.field2605, class91.field1242);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6865[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class491(int arg0, int arg1) {
      boolean var3 = client.field1481;
      super();

      try {
         if (~arg0 != ~arg1) {
            int var4 = class500.method3789(arg1, arg0, (byte)111);
            int var21 = arg0 / var4;
            int var22 = arg1 / var4;
            this.field6859 = new int[var21][14];
            this.field6858 = var22;
            this.field6856 = var21;
            int var5 = 0;
            if (var3 || ~var21 < ~var5) {
               do {
                  int[] var6 = this.field6859[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 - 7.0D + 1.0D);
                  if (var9 < 0) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (~var10 < -15) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 || var9 < var10) {
                     do {
                        double var13 = ((double)var9 - var7) * 3.141592653589793D;
                        double var15 = var11;
                        if (!(var13 < -1.0E-4D)) {
                           if (var13 > 1.0E-4D) {
                              var15 = var11 * (Math.sin(var13) / var13);
                           }
                        } else {
                           var15 = var11 * (Math.sin(var13) / var13);
                        }

                        double var17 = var15 * (Math.cos(((double)var9 + -var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                        var6[var9] = (int)Math.floor(var17 * 65536.0D + 0.5D);
                        ++var9;
                     } while(var9 < var10);
                  }

                  ++var5;
               } while(~var21 < ~var5);

            }
         }
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field6865[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method3731(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6857;
         if (arg0 == -36) {
            if (~arg2 <= ~class577.field8561 && arg2 <= class586.field8647) {
               int var8 = class180.method1522(25495, class415.field5689, class282.field3921, arg4);
               int var7 = class180.method1522(25495, class415.field5689, class282.field3921, arg3);
               class732.method5288(arg1, var7, arg2, -127, var8);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6865[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method3732(int arg0, int arg1) {
      try {
         if (this.field6859 != null) {
            arg1 = (int)((long)this.field6858 * (long)arg1 / (long)this.field6856) + 6;
         }

         if (arg0 != 29558) {
            field6863 = null;
         }

         ++field6862;
         return arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6865[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method3733(int arg0, boolean arg1) {
      try {
         ++field6855;
         if (!arg1) {
            return -56;
         } else {
            if (this.field6859 != null) {
               arg0 = (int)((long)this.field6858 * (long)arg0 / (long)this.field6856);
            }

            return arg0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6865[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "([SZ)[S"
   )
   public final short[] method3734(short[] arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         if (this.field6859 != null) {
            int var4;
            int[] var5;
            int var9;
            label104: {
               var4 = (int)((long)arg0.length * (long)this.field6858 / (long)this.field6856) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg0[var8];
               } else if (var8 >= arg0.length) {
                  arg0 = new short[var4];
                  var9 = 0;
                  if (!var3) {
                     break label104;
                  }
               } else {
                  var9 = arg0[var8];
               }

               label103:
               while(true) {
                  int[] var10 = this.field6859[var7];
                  int var11 = 0;
                  if (var3) {
                     var5[var6 + var11] += var10[var11] * var9 >> 2;
                     ++var11;
                  }

                  while(true) {
                     while(~var11 > -15) {
                        var5[var6 + var11] += var10[var11] * var9 >> 2;
                        ++var11;
                     }

                     int var12 = this.field6858 + var7;
                     int var13 = var12 / this.field6856;
                     var6 += var13;
                     var7 = var12 - this.field6856 * var13;
                     if (!var3) {
                        ++var8;
                        if (var8 >= arg0.length) {
                           arg0 = new short[var4];
                           var9 = 0;
                           if (!var3) {
                              break label103;
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

            if (var3 || ~var9 > ~var4) {
               do {
                  int var14 = var5[var9] + 8192 >> 14;
                  if (~var14 > 32767) {
                     arg0[var9] = -32768;
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  if (var14 > 32767) {
                     arg0[var9] = 32767;
                     if (var3) {
                        arg0[var9] = (short)var14;
                        ++var9;
                     } else {
                        ++var9;
                     }
                  } else {
                     arg0[var9] = (short)var14;
                     ++var9;
                  }
               } while(~var9 > ~var4);
            }
         }

         ++field6854;
         if (!arg1) {
            this.method3734((short[])null, false);
         }

         return arg0;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field6865[8] + (arg0 != null ? field6865[1] : field6865[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "([BZ)[B"
   )
   public final byte[] method3735(byte[] arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg1) {
            method3730(false, true);
         }

         if (this.field6859 != null) {
            int var4;
            int[] var5;
            int var9;
            label110: {
               var4 = (int)((long)arg0.length * (long)this.field6858 / (long)this.field6856) - -14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg0[var8];
               } else if (~var8 <= ~arg0.length) {
                  arg0 = new byte[var4];
                  var9 = 0;
                  if (!var3) {
                     break label110;
                  }
               } else {
                  var9 = arg0[var8];
               }

               label109:
               while(true) {
                  int[] var10 = this.field6859[var7];
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

                     int var12 = this.field6858 + var7;
                     int var13 = var12 / this.field6856;
                     var6 += var13;
                     var7 = var12 - this.field6856 * var13;
                     if (!var3) {
                        ++var8;
                        if (~var8 <= ~arg0.length) {
                           arg0 = new byte[var4];
                           var9 = 0;
                           if (!var3) {
                              break label109;
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

            if (var3 || ~var4 < ~var9) {
               do {
                  int var14 = var5[var9] + 32768 >> 16;
                  if (~var14 <= 127) {
                     if (~var14 < -128) {
                        arg0[var9] = 127;
                        if (var3) {
                           arg0[var9] = (byte)var14;
                           if (var3) {
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
                        if (var3) {
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
               } while(~var4 < ~var9);
            }
         }

         ++field6860;
         return arg0;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field6865[3] + (arg0 != null ? field6865[1] : field6865[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3736(int arg0) {
      try {
         if (arg0 == 21065) {
            field6863 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6865[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3737(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3738(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
