import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class431 {
   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "[I"
   )
   private int[] field6643;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "[B"
   )
   private byte[] field6648;
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "[I"
   )
   private int[] field6644;
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6653 = new String[]{method3412(method3411("Bh\r^h\u0001")), method3412(method3411("Bh\r^o\u0001")), method3412(method3411("gcL\u0013AMi\u001b\u001f\\M,\n\u001f\\\th\r\u0004O\tz\r\u001c[L,")), method3412(method3411("R\"B^S")), method3412(method3411("Gy\u0000\u001c")), method3412(method3411("Bh\r^m\u0001")), method3412(method3411("Bh\r^\u0012@b\u0005\u0004\u0010\u0001")), method3412(method3411("Bh\r^j\u0001")), method3412(method3411("Bh\r^k\u0001")), method3412(method3411("Bh\r^l\u0001")), method3412(method3411("ae\b\u0014KG!"))};
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "I"
   )
   public static int field6649 = 1338;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "I"
   )
   public static int field6642;
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "I"
   )
   public static int field6645;
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "I"
   )
   public static int field6647;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "I"
   )
   public static int field6650;
   @OriginalMember(
      owner = "client!kda",
      name = "k",
      descriptor = "I"
   )
   public static int field6651;
   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "Ljo;"
   )
   public static class507 field6652;
   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "Loo;"
   )
   public static class508 field6646;

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "([BIIII[B)I",
      line = 5
   )
   public final int method3405(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      boolean var7 = client.field1786;

      try {
         ++field6642;
         int var8 = 0;
         int var9 = -68 / ((arg1 - -23) / 46);
         int var10 = arg2 << 3;
         int var20 = arg3 + arg4;
         int var10000;
         if (var7) {
            var10000 = arg5[arg4] & 255;
         } else if (~var20 >= ~arg4) {
            var10000 = (var10 - -7 >> 3) + -arg2;
            if (!var7) {
               return var10000;
            }
         } else {
            var10000 = arg5[arg4] & 255;
         }

         while(true) {
            int var11 = var10000;
            int var12 = this.field6643[var11];
            byte var13 = this.field6648[var11];
            if (var13 == 0) {
               throw new RuntimeException(field6653[2] + var11);
            }

            int var14 = var10 >> 3;
            int var15 = 7 & var10;
            int var16 = var8 & -var15 >> 31;
            int var17 = (var13 + var15 + -1 >> 3) + var14;
            int var21 = var15 + 24;
            arg0[var14] = (byte)(var8 = class119.method1087(var16, var12 >>> var21));
            if (var17 > var14) {
               ++var14;
               var15 = var21 - 8;
               arg0[var14] = (byte)(var8 = var12 >>> var15);
               if (var17 > var14) {
                  var15 -= 8;
                  ++var14;
                  arg0[var14] = (byte)(var8 = var12 >>> var15);
                  if (var17 > var14) {
                     var15 -= 8;
                     ++var14;
                     arg0[var14] = (byte)(var8 = var12 >>> var15);
                     if (~var17 < ~var14) {
                        var15 -= 8;
                        ++var14;
                        arg0[var14] = (byte)(var8 = var12 << -var15);
                     }
                  }
               }
            }

            var10 += var13;
            ++arg4;
            if (~var20 >= ~arg4) {
               var10000 = (var10 - -7 >> 3) + -arg2;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = arg5[arg4] & 255;
            }
         }
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field6653[1] + (arg0 != null ? field6653[3] : field6653[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6653[3] : field6653[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)Lkb;",
      line = 75
   )
   public static final class28 method3406(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field6645;
         if (class60.field747 != null && class125.field1799 != null) {
            class28 var2 = (class28)class125.field1799.method4451(true);
            if (arg0 != 25710) {
               field6652 = null;
               if (!var1 && var2 == null) {
                  return null;
               }
            } else if (var2 == null) {
               return null;
            }

            do {
               class77 var3 = class60.field744.method133(var2.field332, 36);
               if (var3 != null && var3.field987 && var3.method725(class60.field741, true)) {
                  return var2;
               }

               var2 = (class28)class125.field1799.method4451(true);
            } while(var2 != null);

            return null;
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6653[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(B)V",
      line = 107
   )
   public static void method3407(byte arg0) {
      try {
         int var1 = 84 % ((arg0 - 60) / 56);
         field6652 = null;
         field6646 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6653[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(FIIIFFII)[F",
      line = 117
   )
   public static final float[] method3408(float arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7) {
      try {
         ++field6651;
         float[] var8 = new float[9];
         float[] var9 = new float[9];
         float var10 = (float)Math.cos((double)((float)arg6 * 0.024543693F));
         float var11 = (float)Math.sin((double)((float)arg6 * 0.024543693F));
         var8[8] = var10;
         float var12 = -var10 + 1.0F;
         var8[4] = 1.0F;
         var8[5] = 0.0F;
         var8[7] = 0.0F;
         var8[2] = var11;
         var8[0] = var10;
         var8[6] = -var11;
         var8[3] = 0.0F;
         var8[1] = 0.0F;
         float[] var13 = new float[9];
         float var14 = 1.0F;
         float var15 = (float)arg1 / 32767.0F;
         float var16 = 0.0F;
         float var17 = -((float)Math.sqrt((double)(1.0F - var15 * var15)));
         float var18 = -var15 + 1.0F;
         float var19 = (float)Math.sqrt((double)(arg2 * arg2 + arg3 * arg3));
         if (arg7 != -530) {
            return null;
         } else {
            label35: {
               if (var19 != 0.0F || var15 != 0.0F) {
                  if (var19 != 0.0F) {
                     var16 = (float)arg2 / var19;
                     var14 = (float)(-arg3) / var19;
                  }

                  var13[0] = var14 * var14 * var18 + var15;
                  var13[8] = var16 * var16 * var18 + var15;
                  var13[2] = var14 * var16 * var18;
                  var13[1] = var16 * var17;
                  var13[3] = -var16 * var17;
                  var13[4] = var15;
                  var13[5] = var14 * var17;
                  var13[6] = var14 * var16 * var18;
                  var13[7] = -var14 * var17;
                  var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
                  var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
                  var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
                  var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
                  var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
                  var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
                  var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
                  var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
                  var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
                  if (!client.field1786) {
                     break label35;
                  }
               }

               var9 = var8;
            }

            var9[1] *= arg4;
            var9[5] *= arg5;
            var9[3] *= arg5;
            var9[0] *= arg4;
            var9[2] *= arg4;
            var9[7] *= arg0;
            var9[4] *= arg5;
            var9[6] *= arg0;
            var9[8] *= arg0;
            return var9;
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field6653[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "([B[BIIBI)I",
      line = 200
   )
   public final int method3409(byte[] arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         ++field6647;
         if (~arg5 == -1) {
            return 0;
         } else {
            int var21 = arg3 + arg5;
            int var8 = 0;
            int var9 = arg2;

            do {
               byte var10;
               label97: {
                  var10 = arg0[var9];
                  if (var10 >= 0) {
                     ++var8;
                     if (var7 || !var7) {
                        break label97;
                     }
                  }

                  var8 = this.field6644[var8];
               }

               int var11;
               if ((var11 = this.field6644[var8]) < 0) {
                  arg1[arg3++] = (byte)(~var11);
                  if (var21 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label165: {
                  if (~(var10 & 64) == -1) {
                     ++var8;
                     if (!var7) {
                        break label165;
                     }
                  }

                  var8 = this.field6644[var8];
               }

               int var12;
               if (~(var12 = this.field6644[var8]) > -1) {
                  arg1[arg3++] = (byte)(~var12);
                  if (var21 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label159: {
                  if ((32 & var10) == 0) {
                     ++var8;
                     if (!var7) {
                        break label159;
                     }
                  }

                  var8 = this.field6644[var8];
               }

               int var13;
               if ((var13 = this.field6644[var8]) < 0) {
                  arg1[arg3++] = (byte)(~var13);
                  if (~var21 >= ~arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label153: {
                  if (~(16 & var10) != -1) {
                     var8 = this.field6644[var8];
                     if (!var7) {
                        break label153;
                     }
                  }

                  ++var8;
               }

               int var14;
               if ((var14 = this.field6644[var8]) < 0) {
                  arg1[arg3++] = (byte)(~var14);
                  if (~var21 >= ~arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label147: {
                  if (~(var10 & 8) != -1) {
                     var8 = this.field6644[var8];
                     if (!var7) {
                        break label147;
                     }
                  }

                  ++var8;
               }

               int var15;
               if (~(var15 = this.field6644[var8]) > -1) {
                  arg1[arg3++] = (byte)(~var15);
                  if (var21 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label141: {
                  if ((4 & var10) != 0) {
                     var8 = this.field6644[var8];
                     if (!var7) {
                        break label141;
                     }
                  }

                  ++var8;
               }

               int var16;
               if ((var16 = this.field6644[var8]) < 0) {
                  arg1[arg3++] = (byte)(~var16);
                  if (arg3 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label135: {
                  if ((2 & var10) != 0) {
                     var8 = this.field6644[var8];
                     if (!var7) {
                        break label135;
                     }
                  }

                  ++var8;
               }

               int var17;
               if (~(var17 = this.field6644[var8]) > -1) {
                  arg1[arg3++] = (byte)(~var17);
                  if (~var21 >= ~arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label129: {
                  if (~(1 & var10) == -1) {
                     ++var8;
                     if (!var7) {
                        break label129;
                     }
                  }

                  var8 = this.field6644[var8];
               }

               int var18;
               if (~(var18 = this.field6644[var8]) > -1) {
                  arg1[arg3++] = (byte)(~var18);
                  if (~arg3 <= ~var21) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(!var7);

            if (arg4 != 64) {
               this.field6648 = null;
            }

            return var9 + 1 + -arg2;
         }
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field6653[8] + (arg0 != null ? field6653[3] : field6653[4]) + ',' + (arg1 != null ? field6653[3] : field6653[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "([B)V",
      line = 351
   )
   public class431(byte[] arg0) {
      boolean var2 = client.field1786;
      super();

      try {
         int var3 = arg0.length;
         this.field6643 = new int[var3];
         this.field6648 = arg0;
         this.field6644 = new int[8];
         int[] var4 = new int[33];
         int var5 = 0;
         int var6 = 0;
         if (var2 || var6 < var3) {
            label263:
            do {
               byte var7 = arg0[var6];
               if (var7 == 0) {
                  ++var6;
               } else {
                  int var8 = 1 << 32 - var7;
                  int var9 = var4[var7];
                  this.field6643[var6] = var9;
                  int var13;
                  int var10000;
                  if (~(var8 & var9) == -1) {
                     label257: {
                        int var10 = var7 + -1;
                        if (var2) {
                           var10000 = var4[var10];
                        } else if (var10 < 1) {
                           var10000 = var8 | var9;
                           if (!var2) {
                              break label257;
                           }
                        } else {
                           var10000 = var4[var10];
                        }

                        label256:
                        do {
                           while(true) {
                              int var11 = var10000;
                              if (var9 != var11 && !var2) {
                                 var10000 = var8 | var9;
                                 break;
                              }

                              label269: {
                                 int var12 = 1 << -var10 + 32;
                                 if (~(var12 & var11) == -1) {
                                    var4[var10] = class119.method1087(var12, var11);
                                    if (!var2) {
                                       --var10;
                                       break label269;
                                    }
                                 }

                                 var4[var10] = var4[var10 + -1];
                                 if (!var2) {
                                    var10000 = var8 | var9;
                                    if (!var2) {
                                       break label256;
                                    }
                                    continue;
                                 }

                                 --var10;
                              }

                              if (var10 < 1) {
                                 var10000 = var8 | var9;
                                 if (!var2) {
                                    break label256;
                                 }
                              } else {
                                 var10000 = var4[var10];
                              }
                           }
                        } while(var2);
                     }

                     var13 = var10000;
                     if (var2) {
                        var13 = var4[var7 + -1];
                     }
                  } else {
                     var13 = var4[var7 + -1];
                  }

                  var4[var7] = var13;
                  int var14 = var7 + 1;
                  if (var2) {
                     if (~var4[var14] == ~var9) {
                        var4[var14] = var13;
                     }

                     ++var14;
                  }

                  while(true) {
                     while(~var14 >= -33) {
                        if (~var4[var14] == ~var9) {
                           var4[var14] = var13;
                        }

                        ++var14;
                     }

                     byte var15 = 0;
                     int var16 = 0;
                     if (!var2) {
                        int var17;
                        int var10001;
                        int var23;
                        if (var2) {
                           var17 = Integer.MIN_VALUE >>> var16;
                           if ((var9 & var17) == 0) {
                              var23 = var15 + 1;
                              if (var2) {
                                 if (this.field6644[var23] == 0) {
                                    this.field6644[var23] = var5;
                                 }

                                 var23 = this.field6644[var23];
                              }
                           } else {
                              if (this.field6644[var15] == 0) {
                                 this.field6644[var15] = var5;
                              }

                              var23 = this.field6644[var15];
                           }
                        } else {
                           if (~var16 <= ~var7) {
                              var10000 = ~var15;
                              var10001 = ~var5;
                              if (!var2) {
                                 if (var10000 <= var10001) {
                                    var5 = var15 + 1;
                                 }

                                 this.field6644[var15] = ~var6;
                                 ++var6;
                                 break;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if ((var9 & var17) == 0) {
                              var23 = var15 + 1;
                              if (var2) {
                                 if (this.field6644[var23] == 0) {
                                    this.field6644[var23] = var5;
                                 }

                                 var23 = this.field6644[var23];
                              }
                           } else {
                              if (this.field6644[var15] == 0) {
                                 this.field6644[var15] = var5;
                              }

                              var23 = this.field6644[var15];
                           }
                        }

                        while(true) {
                           int var18 = var17 >>> 1;
                           if (this.field6644.length > var23) {
                              ++var16;
                           } else {
                              int[] var19 = new int[this.field6644.length * 2];
                              int var20 = 0;
                              if (var2) {
                                 var19[var20] = this.field6644[var20];
                                 ++var20;
                              }

                              while(true) {
                                 while(~this.field6644.length < ~var20) {
                                    var19[var20] = this.field6644[var20];
                                    ++var20;
                                 }

                                 if (!var2) {
                                    this.field6644 = var19;
                                    ++var16;
                                    break;
                                 }

                                 ++var20;
                              }
                           }

                           if (~var16 <= ~var7) {
                              var10000 = ~var23;
                              var10001 = ~var5;
                              if (!var2) {
                                 if (var10000 <= var10001) {
                                    var5 = var23 + 1;
                                 }

                                 this.field6644[var23] = ~var6;
                                 ++var6;
                                 continue label263;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if ((var9 & var17) == 0) {
                              ++var23;
                              if (var2) {
                                 if (this.field6644[var23] == 0) {
                                    this.field6644[var23] = var5;
                                 }

                                 var23 = this.field6644[var23];
                              }
                           } else {
                              if (this.field6644[var23] == 0) {
                                 this.field6644[var23] = var5;
                              }

                              var23 = this.field6644[var23];
                           }
                        }
                     }

                     ++var14;
                  }
               }
            } while(var6 < var3);

         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field6653[6] + (arg0 != null ? field6653[3] : field6653[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IILfq;)Ljava/lang/String;",
      line = 475
   )
   public static final String method3410(int arg0, int arg1, class374 arg2) {
      try {
         if (arg1 != 5) {
            return null;
         } else {
            ++field6650;
            if (!client.method1148(arg2).method526(arg0, (byte)-61) && arg2.field5914 == null) {
               return null;
            } else if (arg2.field5924 != null && arg0 < arg2.field5924.length && arg2.field5924[arg0] != null && ~arg2.field5924[arg0].trim().length() != -1) {
               return arg2.field5924[arg0];
            } else {
               return class351.field5351 ? field6653[10] + arg0 : null;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6653[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6653[3] : field6653[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3411(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3412(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
