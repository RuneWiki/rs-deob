import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class393 {
   @OriginalMember(
      owner = "client!he",
      name = "g",
      descriptor = "I"
   )
   private int field5690;
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "[[I"
   )
   private int[][] field5681;
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "I"
   )
   private int field5687;
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5691 = new String[]{method2987(method2986("\u007f]*]\u0001")), method2987(method2986("\u007f]*Z\u0001")), method2987(method2986("\u007f]*\\\u0001")), method2987(method2986("l\u0016*7T")), method2987(method2986("yMhu")), method2987(method2986("\u007f]*X\u0001")), method2987(method2986("\u007f]*%@yQp'\u0001")), method2987(method2986("\u007f]*[\u0001"))};
   @OriginalMember(
      owner = "client!he",
      name = "j",
      descriptor = "I"
   )
   public static int field5684 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "I"
   )
   public static int field5682;
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "I"
   )
   public static int field5683;
   @OriginalMember(
      owner = "client!he",
      name = "i",
      descriptor = "I"
   )
   public static int field5685;
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "I"
   )
   public static int field5686;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "Lefa;"
   )
   public static class197 field5688;
   @OriginalMember(
      owner = "client!he",
      name = "h",
      descriptor = "Lwe;"
   )
   public static class431 field5689;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "([SI)[S"
   )
   public final short[] method2981(short[] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (this.field5681 != null) {
            int var4;
            int[] var5;
            int var9;
            label107: {
               var4 = (int)((long)arg0.length * (long)this.field5687 / (long)this.field5690) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg0[var8];
               } else if (~arg0.length >= ~var8) {
                  arg0 = new short[var4];
                  var9 = 0;
                  if (!var3) {
                     break label107;
                  }
               } else {
                  var9 = arg0[var8];
               }

               label106:
               while(true) {
                  int[] var10 = this.field5681[var7];
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

                     int var12 = this.field5687 + var7;
                     int var13 = var12 / this.field5690;
                     var6 += var13;
                     var7 = var12 - this.field5690 * var13;
                     if (!var3) {
                        ++var8;
                        if (~arg0.length >= ~var8) {
                           arg0 = new short[var4];
                           var9 = 0;
                           if (!var3) {
                              break label106;
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
                  if (~var14 <= 32767) {
                     if (var14 > 32767) {
                        arg0[var9] = 32767;
                        if (var3) {
                           arg0[var9] = (short)var14;
                           if (var3) {
                              arg0[var9] = -32768;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        arg0[var9] = (short)var14;
                        if (var3) {
                           arg0[var9] = -32768;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     }
                  } else {
                     arg0[var9] = -32768;
                     ++var9;
                  }
               } while(~var9 > ~var4);
            }
         }

         ++field5686;
         int var15 = -23 % ((arg1 - -39) / 60);
         return arg0;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field5691[7] + (arg0 != null ? field5691[3] : field5691[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "([BI)[B"
   )
   public final byte[] method2982(byte[] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (this.field5681 != null) {
            int var4;
            int[] var5;
            int var9;
            label112: {
               var4 = (int)((long)arg0.length * (long)this.field5687 / (long)this.field5690) + 14;
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
                     break label112;
                  }
               } else {
                  var9 = arg0[var8];
               }

               label111:
               while(true) {
                  int[] var10 = this.field5681[var7];
                  int var11 = 0;
                  if (var3) {
                     var5[var6 + var11] += var10[var11] * var9;
                     ++var11;
                  }

                  while(true) {
                     while(var11 < 14) {
                        var5[var6 + var11] += var10[var11] * var9;
                        ++var11;
                     }

                     int var12 = this.field5687 + var7;
                     int var13 = var12 / this.field5690;
                     var6 += var13;
                     var7 = var12 - this.field5690 * var13;
                     if (!var3) {
                        ++var8;
                        if (~var8 <= ~arg0.length) {
                           arg0 = new byte[var4];
                           var9 = 0;
                           if (!var3) {
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

            if (var3 || ~var9 > ~var4) {
               do {
                  int var14 = var5[var9] + 32768 >> 16;
                  if (var14 >= -128) {
                     if (var14 <= 127) {
                        arg0[var9] = (byte)var14;
                        if (var3) {
                           arg0[var9] = 127;
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
                        arg0[var9] = 127;
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
               } while(~var9 > ~var4);
            }
         }

         if (arg1 < 93) {
            this.method2984(false, -88);
         }

         ++field5683;
         return arg0;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field5691[5] + (arg0 != null ? field5691[3] : field5691[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2983(boolean arg0) {
      try {
         field5688 = null;
         if (arg0) {
            method2983(true);
         }

         field5689 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5691[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method2984(boolean arg0, int arg1) {
      try {
         ++field5682;
         if (arg0) {
            this.method2981((short[])null, -121);
         }

         if (this.field5681 != null) {
            arg1 = (int)((long)this.field5687 * (long)arg1 / (long)this.field5690) + 6;
         }

         return arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5691[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method2985(int arg0, int arg1) {
      try {
         if (this.field5681 != null) {
            arg1 = (int)((long)this.field5687 * (long)arg1 / (long)this.field5690);
         }

         if (arg0 > -14) {
            return 53;
         } else {
            ++field5685;
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5691[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class393(int arg0, int arg1) {
      boolean var3 = client.field4360;
      super();

      try {
         if (~arg0 != ~arg1) {
            int var4 = class572.method4089(arg0, 119, arg1);
            int var22 = arg1 / var4;
            int var21 = arg0 / var4;
            this.field5690 = var21;
            this.field5681 = new int[var21][14];
            this.field5687 = var22;
            int var5 = 0;
            if (var3 || ~var5 > ~var21) {
               do {
                  int[] var6 = this.field5681[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 + -7.0D + 1.0D);
                  if (~var9 > -1) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (var10 > 14) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 || var10 > var9) {
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

                        double var17 = var15 * (Math.cos(((double)var9 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                        var6[var9] = (int)Math.floor(var17 * 65536.0D + 0.5D);
                        ++var9;
                     } while(var10 > var9);
                  }

                  ++var5;
               } while(~var5 > ~var21);

            }
         }
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field5691[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2986(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2987(char[] arg0) {
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
            var10005 = 56;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
