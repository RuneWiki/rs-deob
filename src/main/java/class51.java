import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class51 {
   @OriginalMember(
      owner = "client!kaa",
      name = "i",
      descriptor = "I"
   )
   private int field1057;
   @OriginalMember(
      owner = "client!kaa",
      name = "c",
      descriptor = "I"
   )
   private int field1054;
   @OriginalMember(
      owner = "client!kaa",
      name = "j",
      descriptor = "[[I"
   )
   private int[][] field1053;
   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1066 = new String[]{method620(method619("3\"\u0002\"~")), method620(method619("#mM\"E`")), method620(method619("&y@`")), method620(method619("#mM\"D`")), method620(method619("#mM\"K`")), method620(method619("#mM\"A`")), method620(method619("#mM\"?!bEx=`")), method620(method619("#mM\"F`")), method620(method619("#mM\"B`")), method620(method619("#mM\"@`")), method620(method619("#mM\"G`"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "d",
      descriptor = "Lrw;"
   )
   public static class788 field1055 = new class788();
   @OriginalMember(
      owner = "client!kaa",
      name = "m",
      descriptor = "Luw;"
   )
   public static class435 field1062 = new class435(60, 4);
   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1064 = false;
   @OriginalMember(
      owner = "client!kaa",
      name = "n",
      descriptor = "I"
   )
   public static int field1065 = 0;
   @OriginalMember(
      owner = "client!kaa",
      name = "k",
      descriptor = "I"
   )
   public static int field1052;
   @OriginalMember(
      owner = "client!kaa",
      name = "f",
      descriptor = "I"
   )
   public static int field1056;
   @OriginalMember(
      owner = "client!kaa",
      name = "h",
      descriptor = "I"
   )
   public static int field1058;
   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "I"
   )
   public static int field1059;
   @OriginalMember(
      owner = "client!kaa",
      name = "l",
      descriptor = "I"
   )
   public static int field1060;
   @OriginalMember(
      owner = "client!kaa",
      name = "e",
      descriptor = "I"
   )
   public static int field1061;
   @OriginalMember(
      owner = "client!kaa",
      name = "g",
      descriptor = "I"
   )
   public static int field1063;

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method611(int arg0) {
      try {
         field1055 = null;
         field1062 = null;
         if (arg0 != 0) {
            field1064 = true;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1066[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method612(boolean arg0, int arg1) {
      try {
         if (this.field1053 != null) {
            arg1 = 6 - -((int)((long)this.field1054 * (long)arg1 / (long)this.field1057));
         }

         if (arg0) {
            return -83;
         } else {
            ++field1060;
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1066[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method613(int arg0, int arg1) {
      try {
         ++field1058;
         if (arg0 != 29375) {
            return 55;
         } else {
            if (this.field1053 != null) {
               arg1 = (int)((long)this.field1054 * (long)arg1 / (long)this.field1057);
            }

            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1066[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(B[B)[B"
   )
   public final byte[] method614(byte arg0, byte[] arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1059;
         int var4 = -29 % ((-54 - arg0) / 63);
         if (this.field1053 != null) {
            int var5;
            int[] var6;
            int var10;
            label107: {
               var5 = (int)((long)arg1.length * (long)this.field1054 / (long)this.field1057) + 14;
               var6 = new int[var5];
               int var7 = 0;
               int var8 = 0;
               int var9 = 0;
               if (var3) {
                  var10 = arg1[var9];
               } else if (~var9 <= ~arg1.length) {
                  arg1 = new byte[var5];
                  var10 = 0;
                  if (!var3) {
                     break label107;
                  }
               } else {
                  var10 = arg1[var9];
               }

               label106:
               while(true) {
                  int[] var11 = this.field1053[var8];
                  int var12 = 0;
                  if (var3) {
                     var6[var7 - -var12] += var11[var12] * var10;
                     ++var12;
                  }

                  while(true) {
                     while(~var12 > -15) {
                        var6[var7 - -var12] += var11[var12] * var10;
                        ++var12;
                     }

                     int var13 = this.field1054 + var8;
                     int var14 = var13 / this.field1057;
                     var8 = var13 - this.field1057 * var14;
                     var7 += var14;
                     if (!var3) {
                        ++var9;
                        if (~var9 <= ~arg1.length) {
                           arg1 = new byte[var5];
                           var10 = 0;
                           if (!var3) {
                              break label106;
                           }
                        } else {
                           var10 = arg1[var9];
                        }
                        break;
                     }

                     ++var12;
                  }
               }
            }

            if (var3 || ~var5 < ~var10) {
               do {
                  int var15 = var6[var10] - -32768 >> 16;
                  if (~var15 <= 127) {
                     if (~var15 < -128) {
                        arg1[var10] = 127;
                        if (var3) {
                           arg1[var10] = (byte)var15;
                           if (var3) {
                              arg1[var10] = -128;
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           ++var10;
                        }
                     } else {
                        arg1[var10] = (byte)var15;
                        if (var3) {
                           arg1[var10] = -128;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     }
                  } else {
                     arg1[var10] = -128;
                     ++var10;
                  }
               } while(~var5 < ~var10);
            }
         }

         return arg1;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field1066[7] + arg0 + ',' + (arg1 != null ? field1066[0] : field1066[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method615(int arg0, int arg1, int arg2) {
      try {
         ++field1061;
         if (arg2 != 32768) {
            method616(35, (byte[])null);
         }

         return (32768 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1066[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method616(int arg0, byte[] arg1) {
      try {
         ++field1052;
         class473 var2 = new class473(arg1);
         int var3 = var2.method3564((byte)-79);
         if (arg0 >= -81) {
            method618(-27, -124, -107, false, (class141)null, false, -14);
         }

         int var4 = var2.method3567(31871);
         if (var4 < 0 || ~class447.field6524 != -1 && ~var4 < ~class447.field6524) {
            throw new RuntimeException();
         } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method3562(0, var5, -126, var4);
            return var5;
         } else {
            int var6 = var2.method3567(31871);
            if (~var6 <= -1 && (class447.field6524 == 0 || ~class447.field6524 <= ~var6)) {
               byte[] var7 = new byte[var6];
               if (~var3 == -2) {
                  class541.method4045(var7, var6, arg1, var4, 9);
                  if (!client.field4564) {
                     return var7;
                  }
               }

               class498 var8 = class607.field8722;
               synchronized(class607.field8722) {
                  class607.field8722.method3752(var7, var2, 31);
               }

               return var7;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1066[1] + arg0 + ',' + (arg1 != null ? field1066[0] : field1066[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class51(int arg0, int arg1) {
      boolean var3 = client.field4564;
      super();

      try {
         if (~arg0 != ~arg1) {
            int var4 = class776.method5606(arg1, 1, arg0);
            int var21 = arg0 / var4;
            int var22 = arg1 / var4;
            this.field1057 = var21;
            this.field1054 = var22;
            this.field1053 = new int[var21][14];
            int var5 = 0;
            if (var3 || var5 < var21) {
               do {
                  int[] var6 = this.field1053[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 + -7.0D + 1.0D);
                  if (var9 < 0) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (var10 > 14) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 || ~var9 > ~var10) {
                     do {
                        double var13 = ((double)var9 - var7) * 3.141592653589793D;
                        double var15 = var11;
                        if (var13 < -1.0E-4D || var13 > 1.0E-4D) {
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
         throw class608.method4462(var20, field1066[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I[S)[S"
   )
   public final short[] method617(int arg0, short[] arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1063;
         if (arg0 >= -56) {
            this.field1054 = 20;
         }

         if (this.field1053 != null) {
            int var4;
            int[] var5;
            int var9;
            label103: {
               var4 = (int)((long)arg1.length * (long)this.field1054 / (long)this.field1057) + 14;
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
                     break label103;
                  }
               } else {
                  var9 = arg1[var8];
               }

               label102:
               while(true) {
                  int[] var10 = this.field1053[var7];
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

                     int var12 = this.field1054 + var7;
                     int var13 = var12 / this.field1057;
                     var6 += var13;
                     var7 = var12 - this.field1057 * var13;
                     if (!var3) {
                        ++var8;
                        if (~arg1.length >= ~var8) {
                           arg1 = new short[var4];
                           var9 = 0;
                           if (!var3) {
                              break label102;
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
                  int var14 = var5[var9] - -8192 >> 14;
                  if (var14 >= -32768) {
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

         return arg1;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field1066[9] + arg0 + ',' + (arg1 != null ? field1066[0] : field1066[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IIIZLhw;ZI)V"
   )
   public static final void method618(int arg0, int arg1, int arg2, boolean arg3, class141 arg4, boolean arg5, int arg6) {
      try {
         label31: {
            ++field1056;
            if (~arg2 < -1) {
               class203.field3034 = 1;
               class537.field7822 = arg0;
               class233.field3405 = arg5;
               class548.field7918 = null;
               class167.field2626 = arg1;
               class710.field10318 = arg4;
               class435.field6292 = arg6;
               class217.field3288 = class657.field9595.method4302(-20607) / arg2;
               if (class217.field3288 >= 1) {
                  break label31;
               }

               class217.field3288 = 1;
               if (!client.field4564) {
                  break label31;
               }
            }

            class126.method1225(arg0, arg5, arg1, -7529, arg4, arg6);
         }

         if (arg3) {
            field1064 = false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1066[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1066[0] : field1066[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method619(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method620(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
