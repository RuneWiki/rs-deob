import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class377 {
   @OriginalMember(
      owner = "client!du",
      name = "e",
      descriptor = "[[I"
   )
   private int[][] field5285;
   @OriginalMember(
      owner = "client!du",
      name = "j",
      descriptor = "I"
   )
   private int field5292;
   @OriginalMember(
      owner = "client!du",
      name = "i",
      descriptor = "I"
   )
   private int field5283;
   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5293 = new String[]{method2912(method2911("SE/0F")), method2912(method2911("SE/1F")), method2912(method2911("SE/O\u0007YYuMF")), method2912(method2911("SE/6F")), method2912(method2911("L\u001e/]\u0013")), method2912(method2911("SE/2F")), method2912(method2911("YEm\u001f")), method2912(method2911("SE/7F"))};
   @OriginalMember(
      owner = "client!du",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field5289 = false;
   @OriginalMember(
      owner = "client!du",
      name = "k",
      descriptor = "I"
   )
   public static int field5282;
   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "I"
   )
   public static int field5284;
   @OriginalMember(
      owner = "client!du",
      name = "f",
      descriptor = "I"
   )
   public static int field5286;
   @OriginalMember(
      owner = "client!du",
      name = "d",
      descriptor = "I"
   )
   public static int field5287;
   @OriginalMember(
      owner = "client!du",
      name = "h",
      descriptor = "I"
   )
   public static int field5288;
   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "I"
   )
   public static int field5290;
   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "I"
   )
   public static int field5291;

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2906(int arg0, int arg1, int arg2) {
      try {
         if (arg1 < 112) {
            field5286 = -84;
         }

         ++field5290;
         class446 var3 = class635.method4607(124, (long)arg0, 12);
         var3.method3311(true);
         var3.field6167 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5293[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(I[S)[S"
   )
   public final short[] method2907(int arg0, short[] arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5287;
         if (this.field5285 != null) {
            int var4;
            int[] var5;
            int var9;
            label100: {
               var4 = (int)((long)arg1.length * (long)this.field5292 / (long)this.field5283) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg1[var8];
               } else if (var8 >= arg1.length) {
                  arg1 = new short[var4];
                  var9 = 0;
                  if (!var3) {
                     break label100;
                  }
               } else {
                  var9 = arg1[var8];
               }

               label99:
               while(true) {
                  int[] var10 = this.field5285[var7];
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

                     int var12 = this.field5292 + var7;
                     int var13 = var12 / this.field5283;
                     var7 = var12 - this.field5283 * var13;
                     var6 += var13;
                     if (!var3) {
                        ++var8;
                        if (var8 >= arg1.length) {
                           arg1 = new short[var4];
                           var9 = 0;
                           if (!var3) {
                              break label99;
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
                  if (~var14 <= 32767) {
                     if (var14 > 32767) {
                        arg1[var9] = 32767;
                        if (!var3) {
                           ++var9;
                           continue;
                        }
                     }

                     arg1[var9] = (short)var14;
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

         int var15 = 119 / ((arg0 - -73) / 32);
         return arg1;
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field5293[5] + arg0 + ',' + (arg1 != null ? field5293[4] : field5293[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "([BI)[B"
   )
   public final byte[] method2908(byte[] arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 0) {
            this.method2908((byte[])null, 4);
         }

         ++field5282;
         if (this.field5285 != null) {
            int var4;
            int[] var5;
            int var9;
            label110: {
               var4 = (int)((long)arg0.length * (long)this.field5292 / (long)this.field5283) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg0[var8];
               } else if (var8 >= arg0.length) {
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
                  int[] var10 = this.field5285[var7];
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

                     int var12 = this.field5292 + var7;
                     int var13 = var12 / this.field5283;
                     var7 = var12 - this.field5283 * var13;
                     var6 += var13;
                     if (!var3) {
                        ++var8;
                        if (var8 >= arg0.length) {
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
                     if (var14 > 127) {
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

         return arg0;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field5293[7] + (arg0 != null ? field5293[4] : field5293[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method2909(int arg0, int arg1) {
      try {
         ++field5291;
         if (arg1 > -28) {
            this.method2908((byte[])null, 48);
         }

         if (this.field5285 != null) {
            arg0 = 6 - -((int)((long)this.field5292 * (long)arg0 / (long)this.field5283));
         }

         return arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5293[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method2910(int arg0, byte arg1) {
      try {
         ++field5288;
         if (this.field5285 != null) {
            arg0 = (int)((long)this.field5292 * (long)arg0 / (long)this.field5283);
         }

         int var3 = 28 % ((arg1 - -55) / 58);
         return arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5293[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class377(int arg0, int arg1) {
      boolean var3 = client.field4273;
      super();

      try {
         if (arg0 != arg1) {
            int var4 = class547.method3951(arg1, false, arg0);
            int var21 = arg0 / var4;
            int var22 = arg1 / var4;
            this.field5285 = new int[var21][14];
            this.field5292 = var22;
            this.field5283 = var21;
            int var5 = 0;
            if (var3 || var5 < var21) {
               do {
                  int[] var6 = this.field5285[var5];
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
                  if (var3 || var10 > var9) {
                     do {
                        double var13 = ((double)var9 - var7) * 3.141592653589793D;
                        double var15 = var11;
                        if (var13 < -1.0E-4D || var13 > 1.0E-4D) {
                           var15 = var11 * (Math.sin(var13) / var13);
                        }

                        double var17 = var15 * (0.54D + 0.46D * Math.cos(((double)var9 + -var7) * 0.2243994752564138D));
                        var6[var9] = (int)Math.floor(var17 * 65536.0D + 0.5D);
                        ++var9;
                     } while(var10 > var9);
                  }

                  ++var5;
               } while(var5 < var21);

            }
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field5293[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2911(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2912(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
