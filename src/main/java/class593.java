import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class593 {
   @OriginalMember(
      owner = "client!hj",
      name = "l",
      descriptor = "[J"
   )
   private long[] field8540 = new long[8];
   @OriginalMember(
      owner = "client!hj",
      name = "t",
      descriptor = "[J"
   )
   private long[] field8543 = new long[8];
   @OriginalMember(
      owner = "client!hj",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field8550 = new byte[32];
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "[J"
   )
   private long[] field8546 = new long[8];
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "[J"
   )
   private long[] field8537 = new long[8];
   @OriginalMember(
      owner = "client!hj",
      name = "p",
      descriptor = "I"
   )
   private int field8549 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "q",
      descriptor = "[J"
   )
   private long[] field8551 = new long[8];
   @OriginalMember(
      owner = "client!hj",
      name = "m",
      descriptor = "I"
   )
   private int field8544 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "[B"
   )
   private byte[] field8555 = new byte[64];
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8557 = new String[]{method4383(method4382("\u000f0+\r1")), method4383(method4382("\t/i'")), method4383(method4382("\u000f0+\b1")), method4383(method4382("\u001ct+ed")), method4383(method4382("\u000f0+\f1")), method4383(method4382("$;g)x\u0000?")), method4383(method4382("\u000f0+\u000e1")), method4383(method4382("\u000f0+\u00031")), method4383(method4382("+\u0015B\u0002ZG\u001fW\u0019V5")), method4383(method4382("\u000f0+\t1")), method4383(method4382("\u000f0+\u000f1")), method4383(method4382("\u000f0+\n1"))};
   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field8538 = false;
   @OriginalMember(
      owner = "client!hj",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field8539 = new int[16384];
   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8548 = new int[16384];
   @OriginalMember(
      owner = "client!hj",
      name = "h",
      descriptor = "[S"
   )
   public static short[] field8556;
   @OriginalMember(
      owner = "client!hj",
      name = "r",
      descriptor = "I"
   )
   public static int field8541;
   @OriginalMember(
      owner = "client!hj",
      name = "j",
      descriptor = "I"
   )
   public static int field8542;
   @OriginalMember(
      owner = "client!hj",
      name = "n",
      descriptor = "I"
   )
   public static int field8545;
   @OriginalMember(
      owner = "client!hj",
      name = "s",
      descriptor = "I"
   )
   public static int field8547;
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "I"
   )
   public static int field8552;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "I"
   )
   public static int field8553;
   @OriginalMember(
      owner = "client!hj",
      name = "k",
      descriptor = "I"
   )
   public static int field8554;

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field8539[var2] = (int)(Math.sin((double)var2 * var0) * 16384.0D);
         field8548[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

      field8556 = new short[256];
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "([BZJ)V",
      line = 8
   )
   public final void method4374(byte[] arg0, boolean arg1, long arg2) {
      boolean var5 = client.field4564;

      try {
         ++field8542;
         int var6 = 0;
         int var7 = -(7 & (int)arg2) + 8 & 7;
         if (!arg1) {
            int var8 = 7 & this.field8544;
            long var9 = arg2;
            int var11 = 31;
            int var12 = 0;
            int var13;
            if (var5) {
               var13 = (255 & this.field8550[var11]) + ((int)arg2 & 255) + var12;
               this.field8550[var11] = (byte)var13;
               var9 = arg2 >>> 8;
               var12 = var13 >>> 8;
               --var11;
            }

            while(true) {
               while(~var11 <= -1) {
                  var13 = (255 & this.field8550[var11]) + ((int)var9 & 255) + var12;
                  this.field8550[var11] = (byte)var13;
                  var9 >>>= 8;
                  var12 = var13 >>> 8;
                  --var11;
               }

               if (!var5) {
                  int var14;
                  if (var5) {
                     var14 = 255 & arg0[var6] << var7 | (255 & arg0[var6 + 1]) >>> 8 - var7;
                     if (var14 < 0 || var14 >= 256) {
                        throw new RuntimeException(field8557[8]);
                     }

                     this.field8555[this.field8549] = (byte)class93.method899(this.field8555[this.field8549], var14 >>> var8);
                     this.field8544 += -var8 + 8;
                     ++this.field8549;
                     if (this.field8544 == 512) {
                        this.method4380(255);
                        this.field8544 = this.field8549 = 0;
                     }

                     this.field8555[this.field8549] = (byte)class66.method706(var14 << -var8 + 8, 255);
                     this.field8544 += var8;
                     arg2 -= 8L;
                     ++var6;
                  }

                  while(true) {
                     int var10000;
                     if (arg2 <= 8L) {
                        long var18;
                        var10000 = (var18 = ~arg2 - -1L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                        if (!var5) {
                           int var15;
                           label54: {
                              if (var10000 >= 0) {
                                 var15 = 0;
                                 if (!var5) {
                                    break label54;
                                 }
                              }

                              var15 = 255 & arg0[var6] << var7;
                              this.field8555[this.field8549] = (byte)class93.method899(this.field8555[this.field8549], var15 >>> var8);
                           }

                           if ((long)var8 + arg2 >= 8L) {
                              this.field8544 += -var8 + 8;
                              ++this.field8549;
                              arg2 -= (long)(-var8 + 8);
                              if (this.field8544 == 512) {
                                 this.method4380(255);
                                 this.field8544 = this.field8549 = 0;
                              }

                              this.field8555[this.field8549] = (byte)class66.method706(var15 << -var8 + 8, 255);
                              this.field8544 += (int)arg2;
                              return;
                           }

                           this.field8544 = (int)((long)this.field8544 + arg2);
                           return;
                        }
                     } else {
                        var10000 = 255 & arg0[var6] << var7 | (255 & arg0[var6 + 1]) >>> 8 - var7;
                     }

                     var14 = var10000;
                     if (var14 < 0 || var14 >= 256) {
                        throw new RuntimeException(field8557[8]);
                     }

                     this.field8555[this.field8549] = (byte)class93.method899(this.field8555[this.field8549], var14 >>> var8);
                     this.field8544 += -var8 + 8;
                     ++this.field8549;
                     if (this.field8544 == 512) {
                        this.method4380(255);
                        this.field8544 = this.field8549 = 0;
                     }

                     this.field8555[this.field8549] = (byte)class66.method706(var14 << -var8 + 8, 255);
                     this.field8544 += var8;
                     arg2 -= 8L;
                     ++var6;
                  }
               }

               --var11;
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field8557[7] + (arg0 != null ? field8557[3] : field8557[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
      line = 97
   )
   public static final void method4375(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
      boolean var9 = client.field4564;

      try {
         ++field8552;
         class313 var10 = class448.field6538[arg1];
         int var11 = 99;
         if (var9) {
            class448.field6538[var11] = class448.field6538[var11 + -1];
            --var11;
         }

         while(true) {
            while(var11 > 0) {
               class448.field6538[var11] = class448.field6538[var11 + -1];
               --var11;
            }

            if (!var9) {
               label50: {
                  if (var10 != null) {
                     var10.method2430(arg8, arg4, arg3, true, arg7, arg0, arg5, arg2, arg6);
                     if (!var9) {
                        break label50;
                     }
                  }

                  var10 = new class313(arg0, arg3, arg6, arg7, arg4, arg5, arg2, arg8);
               }

               ++class601.field8678;
               class636.field9267 = class660.field9612;
               class448.field6538[0] = var10;
               return;
            }

            --var11;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8557[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8557[3] : field8557[1]) + ',' + (arg5 != null ? field8557[3] : field8557[1]) + ',' + (arg6 != null ? field8557[3] : field8557[1]) + ',' + (arg7 != null ? field8557[3] : field8557[1]) + ',' + (arg8 != null ? field8557[3] : field8557[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "([BBI)V",
      line = 122
   )
   public final void method4376(byte[] arg0, byte arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         this.field8555[this.field8549] = (byte)class93.method899(this.field8555[this.field8549], 128 >>> class66.method706(7, this.field8544));
         ++field8545;
         ++this.field8549;
         class593 var10000;
         if (this.field8549 > 32) {
            if (var4) {
               this.field8555[this.field8549++] = 0;
            }

            while(true) {
               if (~this.field8549 <= -65) {
                  this.method4380(arg1 ^ -252);
                  var10000 = this;
                  if (!var4) {
                     this.field8549 = 0;
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field8555[this.field8549++] = 0;
            }
         }

         if (arg1 == -5) {
            while(true) {
               if (this.field8549 >= 32) {
                  class365.method2856(this.field8550, 0, this.field8555, 32, 32);
                  var10000 = this;
                  if (!var4) {
                     this.method4380(arg1 + 260);
                     int var5 = 0;
                     int var6 = arg2;
                     if (!var4 && ~var5 <= -9) {
                        return;
                     } else {
                        do {
                           long var7 = this.field8546[var5];
                           arg0[var6] = (byte)((int)(var7 >>> 56));
                           arg0[var6 + 1] = (byte)((int)(var7 >>> 48));
                           arg0[var6 - -2] = (byte)((int)(var7 >>> 40));
                           arg0[var6 + 3] = (byte)((int)(var7 >>> 32));
                           arg0[var6 - -4] = (byte)((int)(var7 >>> 24));
                           arg0[var6 + 5] = (byte)((int)(var7 >>> 16));
                           arg0[var6 + 6] = (byte)((int)(var7 >>> 8));
                           arg0[var6 - -7] = (byte)((int)var7);
                           var6 += 8;
                           ++var5;
                        } while(~var5 > -9);

                        return;
                     }
                  }
               } else {
                  var10000 = this;
               }

               var10000.field8555[this.field8549++] = 0;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8557[10] + (arg0 != null ? field8557[3] : field8557[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)V",
      line = 182
   )
   public static void method4377(int arg0) {
      try {
         field8539 = null;
         field8556 = null;
         if (arg0 != 8) {
            field8539 = null;
         }

         field8548 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8557[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(I)Z",
      line = 194
   )
   public static final boolean method4378(int arg0) {
      try {
         ++field8553;
         if (arg0 != 99) {
            field8539 = null;
         }

         return ~class203.field3034 != -1 ? true : class657.field9595.method4288(30244);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8557[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(B)V",
      line = 213
   )
   public final void method4379(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8547;
         int var3 = 0;
         if (var2) {
            this.field8550[var3] = 0;
            ++var3;
         }

         while(true) {
            while(var3 < 32) {
               this.field8550[var3] = 0;
               ++var3;
            }

            this.field8544 = this.field8549 = 0;
            this.field8555[0] = 0;
            int var4 = 0;
            if (!var2) {
               if (var2) {
                  this.field8546[var4] = 0L;
                  ++var4;
               }

               while(true) {
                  while(var4 < 8) {
                     this.field8546[var4] = 0L;
                     ++var4;
                  }

                  if (!var2) {
                     if (arg0 != 127) {
                        field8556 = null;
                        return;
                     }

                     return;
                  }

                  ++var4;
               }
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8557[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "(I)V",
      line = 248
   )
   private final void method4380(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(ILuda;I)Ljava/lang/String;",
      line = 365
   )
   public static final String method4381(int arg0, class473 arg1, int arg2) {
      try {
         ++field8541;

         try {
            int var3 = arg1.method3586(127);
            if (~var3 < ~arg0) {
               var3 = arg0;
            }

            byte[] var4 = new byte[var3];
            if (arg2 >= -86) {
               field8548 = null;
            }

            arg1.field6907 += class206.field3081.method3079((byte)-122, arg1.field6907, arg1.field6889, var4, var3, 0);
            return class493.method3716(-123, var4, var3, 0);
         } catch (Exception var7) {
            return field8557[5];
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8557[4] + arg0 + ',' + (arg1 != null ? field8557[3] : field8557[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
