import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class553 {
   @OriginalMember(
      owner = "client!sf",
      name = "u",
      descriptor = "[B"
   )
   private byte[] field7607;
   @OriginalMember(
      owner = "client!sf",
      name = "o",
      descriptor = "[I"
   )
   private int[] field7605;
   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "[I"
   )
   private int[] field7608;
   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7623 = new String[]{method3997(method3996("]0ZN")), method3997(method3996("Hk\u0018\fT")), method3997(method3996("}*\u0016AFW AM[WePM[\u0013!WVH\u00133WN\\Ve")), method3997(method3996("@#\u0018f\u0001")), method3997(method3996("@#\u0018d\u0001")), method3997(method3996("@#\u0018\u001e@],B\u001c\u0001")), method3997(method3996("@#\u0018c\u0001")), method3997(method3996("@#\u0018`\u0001")), method3997(method3996("@#\u0018g\u0001")), method3997(method3996("@#\u0018a\u0001"))};
   @OriginalMember(
      owner = "client!sf",
      name = "p",
      descriptor = "Lgf;"
   )
   public static class292 field7604 = new class292(14, 0);
   @OriginalMember(
      owner = "client!sf",
      name = "g",
      descriptor = "Lgf;"
   )
   public static class292 field7610 = new class292(15, 4);
   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "Lgf;"
   )
   public static class292 field7611 = new class292(16, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "d",
      descriptor = "Lgf;"
   )
   public static class292 field7612 = new class292(17, 0);
   @OriginalMember(
      owner = "client!sf",
      name = "n",
      descriptor = "Lgf;"
   )
   public static class292 field7613 = new class292(19, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "v",
      descriptor = "Lgf;"
   )
   public static class292 field7614 = new class292(22, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "t",
      descriptor = "Lgf;"
   )
   public static class292 field7615 = new class292(23, 4);
   @OriginalMember(
      owner = "client!sf",
      name = "f",
      descriptor = "Lgf;"
   )
   public static class292 field7616 = new class292(24, -1);
   @OriginalMember(
      owner = "client!sf",
      name = "i",
      descriptor = "Lgf;"
   )
   public static class292 field7617 = new class292(26, 0);
   @OriginalMember(
      owner = "client!sf",
      name = "w",
      descriptor = "Lgf;"
   )
   public static class292 field7618 = new class292(27, 0);
   @OriginalMember(
      owner = "client!sf",
      name = "s",
      descriptor = "Lgf;"
   )
   public static class292 field7619 = new class292(28, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "r",
      descriptor = "Lgf;"
   )
   public static class292 field7620 = new class292(29, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "l",
      descriptor = "Lgf;"
   )
   public static class292 field7621 = new class292(30, -2);
   @OriginalMember(
      owner = "client!sf",
      name = "q",
      descriptor = "[Lgf;"
   )
   private static class292[] field7622 = new class292[32];
   @OriginalMember(
      owner = "client!sf",
      name = "h",
      descriptor = "F"
   )
   public static float field7609;
   @OriginalMember(
      owner = "client!sf",
      name = "c",
      descriptor = "I"
   )
   public static int field7600;
   @OriginalMember(
      owner = "client!sf",
      name = "k",
      descriptor = "I"
   )
   public static int field7601;
   @OriginalMember(
      owner = "client!sf",
      name = "e",
      descriptor = "I"
   )
   public static int field7602;
   @OriginalMember(
      owner = "client!sf",
      name = "j",
      descriptor = "I"
   )
   public static int field7603;
   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "I"
   )
   public static int field7606;

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IFIIF[BIFIFLrca;FII)V"
   )
   public static final void method3990(int param0, float param1, int param2, int param3, float param4, byte[] param5, int param6, float param7, int param8, float param9, class483 param10, float param11, int param12, int param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method3991(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7602;
         int var4 = arg0 / arg3;
         int var5 = arg3 + -1 & arg0;
         int var6 = arg2 / arg3;
         int var7 = arg2 & arg3 + -1;
         int var8 = class528.method3815(var6, (byte)106, var4);
         int var9 = class528.method3815(var6, (byte)114, var4 + 1);
         int var10 = class528.method3815(var6 + 1, (byte)104, var4);
         int var11 = class528.method3815(var6 + 1, (byte)126, var4 - arg1);
         int var12 = class26.method223(var9, var5, arg3, (byte)-98, var8);
         int var13 = class26.method223(var11, var5, arg3, (byte)-98, var10);
         return class26.method223(var13, var7, arg3, (byte)-125, var12);
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field7623[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(III[BI[B)I"
   )
   public final int method3992(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
      boolean var7 = client.field4273;

      try {
         ++field7601;
         int var8 = 0;
         int var9 = arg4 << 3;
         int var20 = arg1 + arg2;
         int var10 = -84 % ((arg0 - 26) / 52);
         int var10000;
         if (var7) {
            var10000 = 255 & arg5[arg2];
         } else if (~arg2 <= ~var20) {
            var10000 = (var9 + 7 >> 3) + -arg4;
            if (!var7) {
               return var10000;
            }
         } else {
            var10000 = 255 & arg5[arg2];
         }

         while(true) {
            int var11 = var10000;
            int var12 = this.field7605[var11];
            byte var13 = this.field7607[var11];
            if (~var13 == -1) {
               throw new RuntimeException(field7623[2] + var11);
            }

            int var14 = var9 >> 3;
            int var15 = 7 & var9;
            int var16 = var8 & -var15 >> 31;
            int var17 = (var15 - 1 + var13 >> 3) + var14;
            int var21 = var15 + 24;
            arg3[var14] = (byte)(var8 = class283.method2155(var16, var12 >>> var21));
            if (var14 < var17) {
               ++var14;
               var15 = var21 - 8;
               arg3[var14] = (byte)(var8 = var12 >>> var15);
               if (var14 < var17) {
                  ++var14;
                  var15 -= 8;
                  arg3[var14] = (byte)(var8 = var12 >>> var15);
                  if (var17 > var14) {
                     var15 -= 8;
                     ++var14;
                     arg3[var14] = (byte)(var8 = var12 >>> var15);
                     if (var14 < var17) {
                        ++var14;
                        var15 -= 8;
                        arg3[var14] = (byte)(var8 = var12 << -var15);
                     }
                  }
               }
            }

            var9 += var13;
            ++arg2;
            if (~arg2 <= ~var20) {
               var10000 = (var9 + 7 >> 3) + -arg4;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = 255 & arg5[arg2];
            }
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field7623[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7623[1] : field7623[0]) + ',' + arg4 + ',' + (arg5 != null ? field7623[1] : field7623[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method3993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         label71: {
            ++field7606;
            if (arg8 < class265.field3451 || ~arg8 < ~class663.field9442 || arg2 < class265.field3451 || class663.field9442 < arg2 || arg9 < class265.field3451 || ~class663.field9442 > ~arg9 || ~arg3 > ~class265.field3451 || class663.field9442 < arg3 || arg5 < class478.field6604 || ~arg5 < ~class313.field4171 || arg4 < class478.field6604 || ~class313.field4171 > ~arg4 || ~arg1 > ~class478.field6604 || arg1 > class313.field4171 || ~arg6 > ~class478.field6604 || class313.field4171 < arg6) {
               class106.method939(arg9, arg0 + 8590, arg6, arg5, arg4, arg3, arg8, arg7, arg2, arg1);
               if (!client.field4273) {
                  break label71;
               }
            }

            class635.method4606(arg8, arg2, arg3, arg5, arg9, arg6, arg1, arg7, 111, arg4);
         }

         if (arg0 != -8475) {
            method3994(-29);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field7623[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3994(int arg0) {
      try {
         field7616 = null;
         field7613 = null;
         field7615 = null;
         field7614 = null;
         field7619 = null;
         field7621 = null;
         field7620 = null;
         field7618 = null;
         if (arg0 != -685350845) {
            field7604 = null;
         }

         field7622 = null;
         field7610 = null;
         field7611 = null;
         field7617 = null;
         field7604 = null;
         field7612 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7623[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "([BI[BIII)I"
   )
   public final int method3995(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4273;

      try {
         ++field7600;
         if (arg5 == 0) {
            return 0;
         } else {
            int var22 = arg3 + arg5;
            int var8 = 0;
            int var9 = arg1;
            int var10 = 65 / ((22 - arg4) / 42);

            do {
               byte var11;
               label94: {
                  var11 = arg0[var9];
                  if (~var11 <= -1) {
                     ++var8;
                     if (var7 || !var7) {
                        break label94;
                     }
                  }

                  var8 = this.field7608[var8];
               }

               int var12;
               if (~(var12 = this.field7608[var8]) > -1) {
                  arg2[arg3++] = (byte)(~var12);
                  if (arg3 >= var22) {
                     break;
                  }

                  var8 = 0;
               }

               label162: {
                  if ((64 & var11) == 0) {
                     ++var8;
                     if (!var7) {
                        break label162;
                     }
                  }

                  var8 = this.field7608[var8];
               }

               int var13;
               if ((var13 = this.field7608[var8]) < 0) {
                  arg2[arg3++] = (byte)(~var13);
                  if (var22 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label156: {
                  if ((32 & var11) == 0) {
                     ++var8;
                     if (!var7) {
                        break label156;
                     }
                  }

                  var8 = this.field7608[var8];
               }

               int var14;
               if (~(var14 = this.field7608[var8]) > -1) {
                  arg2[arg3++] = (byte)(~var14);
                  if (var22 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label150: {
                  if ((var11 & 16) == 0) {
                     ++var8;
                     if (!var7) {
                        break label150;
                     }
                  }

                  var8 = this.field7608[var8];
               }

               int var15;
               if (~(var15 = this.field7608[var8]) > -1) {
                  arg2[arg3++] = (byte)(~var15);
                  if (arg3 >= var22) {
                     break;
                  }

                  var8 = 0;
               }

               label144: {
                  if (~(8 & var11) != -1) {
                     var8 = this.field7608[var8];
                     if (!var7) {
                        break label144;
                     }
                  }

                  ++var8;
               }

               int var16;
               if (~(var16 = this.field7608[var8]) > -1) {
                  arg2[arg3++] = (byte)(~var16);
                  if (~var22 >= ~arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label138: {
                  if ((var11 & 4) == 0) {
                     ++var8;
                     if (!var7) {
                        break label138;
                     }
                  }

                  var8 = this.field7608[var8];
               }

               int var17;
               if ((var17 = this.field7608[var8]) < 0) {
                  arg2[arg3++] = (byte)(~var17);
                  if (~var22 >= ~arg3) {
                     break;
                  }

                  var8 = 0;
               }

               label132: {
                  if ((var11 & 2) != 0) {
                     var8 = this.field7608[var8];
                     if (!var7) {
                        break label132;
                     }
                  }

                  ++var8;
               }

               int var18;
               if (~(var18 = this.field7608[var8]) > -1) {
                  arg2[arg3++] = (byte)(~var18);
                  if (arg3 >= var22) {
                     break;
                  }

                  var8 = 0;
               }

               label126: {
                  if ((1 & var11) != 0) {
                     var8 = this.field7608[var8];
                     if (!var7) {
                        break label126;
                     }
                  }

                  ++var8;
               }

               int var19;
               if ((var19 = this.field7608[var8]) < 0) {
                  arg2[arg3++] = (byte)(~var19);
                  if (var22 <= arg3) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(!var7);

            return var9 + 1 + -arg1;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field7623[9] + (arg0 != null ? field7623[1] : field7623[0]) + ',' + arg1 + ',' + (arg2 != null ? field7623[1] : field7623[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class553(byte[] arg0) {
      boolean var2 = client.field4273;
      super();

      try {
         int var3 = arg0.length;
         this.field7607 = arg0;
         this.field7605 = new int[var3];
         this.field7608 = new int[8];
         int[] var4 = new int[33];
         int var5 = 0;
         int var6 = 0;
         if (var2 || var3 > var6) {
            label244:
            do {
               byte var7 = arg0[var6];
               if (~var7 == -1) {
                  ++var6;
               } else {
                  int var8 = 1 << -var7 + 32;
                  int var9 = var4[var7];
                  this.field7605[var6] = var9;
                  int var13;
                  int var10000;
                  if ((var9 & var8) == 0) {
                     label238: {
                        int var10 = var7 + -1;
                        if (var2) {
                           var10000 = var4[var10];
                        } else if (~var10 > -2) {
                           var10000 = var9 | var8;
                           if (!var2) {
                              break label238;
                           }
                        } else {
                           var10000 = var4[var10];
                        }

                        label237:
                        do {
                           while(true) {
                              int var11 = var10000;
                              if (~var9 != ~var11 && !var2) {
                                 var10000 = var9 | var8;
                                 break;
                              }

                              label250: {
                                 int var12 = 1 << -var10 + 32;
                                 if ((var12 & var11) == 0) {
                                    var4[var10] = class283.method2155(var12, var11);
                                    if (!var2) {
                                       --var10;
                                       break label250;
                                    }
                                 }

                                 var4[var10] = var4[var10 - 1];
                                 if (!var2) {
                                    var10000 = var9 | var8;
                                    if (!var2) {
                                       break label237;
                                    }
                                    continue;
                                 }

                                 --var10;
                              }

                              if (~var10 > -2) {
                                 var10000 = var9 | var8;
                                 if (!var2) {
                                    break label237;
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
                     if (var4[var14] == var9) {
                        var4[var14] = var13;
                     }

                     ++var14;
                  }

                  while(true) {
                     while(var14 <= 32) {
                        if (var4[var14] == var9) {
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
                           if (~(var17 & var9) != -1) {
                              if (this.field7608[var15] == 0) {
                                 this.field7608[var15] = var5;
                              }

                              var23 = this.field7608[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        } else {
                           if (~var7 >= ~var16) {
                              var10000 = var5;
                              var10001 = var15;
                              if (!var2) {
                                 if (var5 <= var15) {
                                    var5 = var15 - -1;
                                 }

                                 this.field7608[var15] = ~var6;
                                 ++var6;
                                 break;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if (~(var17 & var9) != -1) {
                              if (this.field7608[var15] == 0) {
                                 this.field7608[var15] = var5;
                              }

                              var23 = this.field7608[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        }

                        while(true) {
                           int var20;
                           if (var23 < this.field7608.length) {
                              var20 = var17 >>> 1;
                              ++var16;
                           } else {
                              int[] var18 = new int[this.field7608.length * 2];
                              int var19 = 0;
                              if (var2) {
                                 var18[var19] = this.field7608[var19];
                                 ++var19;
                              }

                              while(true) {
                                 while(~this.field7608.length < ~var19) {
                                    var18[var19] = this.field7608[var19];
                                    ++var19;
                                 }

                                 if (!var2) {
                                    this.field7608 = var18;
                                    var20 = var17 >>> 1;
                                    ++var16;
                                    break;
                                 }

                                 ++var19;
                              }
                           }

                           if (~var7 >= ~var16) {
                              var10000 = var5;
                              var10001 = var23;
                              if (!var2) {
                                 if (var5 <= var23) {
                                    var5 = var23 - -1;
                                 }

                                 this.field7608[var23] = ~var6;
                                 ++var6;
                                 continue label244;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if (~(var17 & var9) != -1) {
                              if (this.field7608[var23] == 0) {
                                 this.field7608[var23] = var5;
                              }

                              var23 = this.field7608[var23];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              ++var23;
                           }
                        }
                     }

                     ++var14;
                  }
               }
            } while(var3 > var6);

         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field7623[5] + (arg0 != null ? field7623[1] : field7623[0]) + ')');
      }
   }

   static {
      class292[] var0 = class173.method1346(0);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field7622[var0[var1].field3850] = var0[var1];
      }

   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3996(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3997(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
