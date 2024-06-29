import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class217 extends class315 {
   @OriginalMember(
      owner = "client!pi",
      name = "m",
      descriptor = "I"
   )
   private int field3107;
   @OriginalMember(
      owner = "client!pi",
      name = "t",
      descriptor = "I"
   )
   private int field3104;
   @OriginalMember(
      owner = "client!pi",
      name = "o",
      descriptor = "I"
   )
   private int field3111;
   @OriginalMember(
      owner = "client!pi",
      name = "r",
      descriptor = "I"
   )
   private int field3105;
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3117 = new String[]{method1890(method1889("\"M\u001fll")), method1890(method1889("\"M\u001fml")), method1890(method1889("\"M\u001fkl")), method1890(method1889("\"M\u001fnl")), method1890(method1889(")\n\u001f\u00069")), method1890(method1889("<Q]D")), method1890(method1889("\"M\u001fjl")), method1890(method1889("\"M\u001f\u0014-<ME\u0016l")), method1890(method1889("\"M\u001fol")), method1890(method1889("\"M\u001fil"))};
   @OriginalMember(
      owner = "client!pi",
      name = "k",
      descriptor = "F"
   )
   public static float field3109;
   @OriginalMember(
      owner = "client!pi",
      name = "h",
      descriptor = "I"
   )
   public static int field3106;
   @OriginalMember(
      owner = "client!pi",
      name = "i",
      descriptor = "I"
   )
   public static int field3108;
   @OriginalMember(
      owner = "client!pi",
      name = "n",
      descriptor = "I"
   )
   public static int field3110;
   @OriginalMember(
      owner = "client!pi",
      name = "j",
      descriptor = "I"
   )
   public static int field3112;
   @OriginalMember(
      owner = "client!pi",
      name = "s",
      descriptor = "I"
   )
   public static int field3113;
   @OriginalMember(
      owner = "client!pi",
      name = "q",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!pi",
      name = "l",
      descriptor = "I"
   )
   public static int field3115;
   @OriginalMember(
      owner = "client!pi",
      name = "p",
      descriptor = "I"
   )
   public static int field3116;

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(I[FB)[F"
   )
   public static final float[] method1882(int arg0, float[] arg1, byte arg2) {
      try {
         ++field3110;
         float[] var3 = new float[arg0];
         class474.method3639(arg1, 0, var3, 0, arg0);
         int var4 = 122 % ((arg2 - -40) / 54);
         return var3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3117[6] + arg0 + ',' + (arg1 != null ? field3117[4] : field3117[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method1883(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            method1882(-17, (float[])null, (byte)-54);
         }

         ++field3116;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3117[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1884(int arg0) {
      try {
         ++field3106;
         class143 var1 = (class143)class614.field8732.method2245((byte)-94);
         boolean var2 = class696.field10048 != null || ~class436.field6387 < -1;
         int var3 = var1.method502(4);
         int var4 = var1.method503(true);
         if (var2) {
            class682.field9875 = 1;
         }

         if (arg0 != 18242) {
            method1885((byte)8);
         }

         if (!var2) {
            class508.method3829(var3, (byte)122, var4, class143.field2272);
         } else {
            class261.field4003 = class143.field2272;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3117[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field3107 = arg3;
         this.field3104 = arg0;
         this.field3111 = arg1;
         this.field3105 = arg2;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3117[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1885(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field3112;
         if (class54.field794 != null) {
            if (class563.field8012) {
               class639.method4657(118);
            }

            class416.field6098.method1567((byte)-110);
            class321.method2594();
            class762.method5498(arg0 ^ -105);
            class673.method4871((byte)-89);
            class546.method4093(-128);
            class457.method3540(-118);
            class483.method3686(false);
            class372.method2915((byte)35);
            class639.method4658(true);
            class192.method1696(-10075);
            class182.method1647(false, arg0 + -18242);
            int var2 = 0;
            if (var1 || ~var2 > -2049) {
               do {
                  class158 var3 = class501.field7137[var2];
                  if (var3 == null) {
                     ++var2;
                  } else {
                     int var4 = 0;
                     if (var1) {
                        var3.field5862[var4] = null;
                        ++var4;
                     }

                     while(~var4 > ~var3.field5862.length) {
                        var3.field5862[var4] = null;
                        ++var4;
                     }

                     ++var2;
                  }
               } while(~var2 > -2049);
            }

            int var5 = 0;
            if (var1 || class157.field2391 > var5) {
               do {
                  class799 var6 = class270.field4135[var5].field6345;
                  if (var6 == null) {
                     ++var5;
                  } else {
                     int var7 = 0;
                     if (var1) {
                        var6.field5862[var7] = null;
                        ++var7;
                     }

                     while(~var7 > ~var6.field5862.length) {
                        var6.field5862[var7] = null;
                        ++var7;
                     }

                     ++var5;
                  }
               } while(class157.field2391 > var5);
            }

            class686.field9905 = null;
            class178.field2626 = null;
            class54.field794.method181(true);
            class54.field794 = null;
         }

         if (arg0 != 14) {
            method1882(16, (float[])null, (byte)16);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3117[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1886(byte arg0, int arg1, int arg2) {
      try {
         ++field3108;
         if (arg0 > -114) {
            method1882(-86, (float[])null, (byte)87);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3117[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1887(int arg0, int arg1, int arg2) {
      try {
         ++field3115;
         int var4 = this.field3104 * arg2 >> 12;
         int var5 = this.field3105 * arg2 >> 12;
         if (arg0 != -1) {
            field3109 = -1.5881875F;
         }

         int var6 = this.field3111 * arg1 >> 12;
         int var7 = this.field3107 * arg1 >> 12;
         class228.method2029(var6, var5, var7, super.field4717, 126, var4);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3117[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(IIIIIIIBII)Z"
   )
   public static final boolean method1888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
      boolean var10 = client.field10022;

      try {
         ++field3114;
         if (~arg4 >= -2001 && arg2 <= 2000 && ~arg6 >= -2001 && arg9 <= 2000 && ~arg0 >= -2001 && ~arg5 >= -2001) {
            if (~arg4 <= 1999 && ~arg2 <= 1999 && arg6 >= -2000 && arg9 >= -2000 && arg0 >= -2000 && arg5 >= -2000) {
               if (class613.field8721 == 2) {
                  int var11 = class597.field8402 * arg4 + arg9;
                  if (var11 >= 0 && class595.field8383.length > var11 && class595.field8383[var11] > (arg8 << 8) + -38400) {
                     return false;
                  }

                  int var12 = class597.field8402 * arg2 + arg0;
                  if (~var12 <= -1 && ~class595.field8383.length < ~var12 && (arg1 << 8) + -38400 < class595.field8383[var12]) {
                     return false;
                  }

                  int var13 = class597.field8402 * arg6 + arg5;
                  if (var13 >= 0 && class595.field8383.length > var13 && class595.field8383[var13] > (arg3 << 8) + -38400) {
                     return false;
                  }
               }

               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               label1195: {
                  var14 = arg0 - arg9;
                  var15 = -arg4 + arg2;
                  var16 = -arg9 + arg5;
                  var17 = arg6 - arg4;
                  var18 = arg1 - arg8;
                  if (~arg2 >= ~arg4 || arg6 <= arg6) {
                     if (arg6 <= arg2) {
                        --arg6;
                        if (~arg4 >= ~arg2) {
                           ++arg2;
                           if (!var10) {
                              break label1195;
                           }
                        }

                        ++arg4;
                        if (!var10) {
                           break label1195;
                        }
                     }

                     label1088: {
                        if (arg6 < arg4) {
                           ++arg4;
                           if (!var10) {
                              break label1088;
                           }
                        }

                        ++arg6;
                     }

                     --arg2;
                     if (!var10) {
                        break label1195;
                     }
                  }

                  --arg4;
                  if (~arg2 >= ~arg6) {
                     ++arg6;
                     if (!var10) {
                        break label1195;
                     }
                  }

                  ++arg2;
               }

               int var19 = -arg8 + arg3;
               int var20 = 0;
               if (arg2 != arg4) {
                  var20 = (-arg9 + arg0 << 12) / (-arg4 + arg2);
               }

               int var21 = 0;
               if (~arg2 != ~arg6) {
                  var21 = (arg5 - arg0 << 12) / (-arg2 + arg6);
               }

               int var22 = 0;
               if (arg4 != arg6) {
                  var22 = (-arg5 + arg9 << 12) / (-arg6 + arg4);
               }

               int var23 = var14 * var17 - var15 * var16;
               if (arg7 >= -123) {
                  field3113 = -125;
               }

               if (var23 == 0) {
                  return false;
               } else {
                  int var24 = (var17 * var18 + -(var15 * var19) << 8) / var23;
                  int var25 = (var14 * var19 + -(var16 * var18) << 8) / var23;
                  boolean var10000;
                  if (~arg4 >= ~arg2 && ~arg4 >= ~arg6) {
                     if (arg4 >= class358.field5300) {
                        return true;
                     } else {
                        if (~class358.field5300 > ~arg2) {
                           arg2 = class358.field5300;
                        }

                        if (~arg6 < ~class358.field5300) {
                           arg6 = class358.field5300;
                        }

                        arg8 = (arg8 << 8) - arg9 * var24 + var24;
                        if (arg6 <= arg2) {
                           arg0 = arg9 <<= 12;
                           if (arg4 < 0) {
                              arg0 -= arg4 * var22;
                              arg9 -= arg4 * var20;
                              arg8 -= arg4 * var25;
                              arg4 = 0;
                           }

                           arg5 <<= 12;
                           if (~arg6 > -1) {
                              arg5 -= arg6 * var21;
                              arg6 = 0;
                           }

                           if (~arg4 != ~arg6 && var22 < var20 || arg4 == arg6 && ~var20 > ~var21) {
                              arg2 -= arg6;
                              arg6 -= arg4;
                              arg4 = class597.field8402 * arg4;
                              if (var10) {
                                 if (!class236.method2085((arg0 >> 12) + -1, arg8, 0, (arg9 >> 12) + 1, class595.field8383, var24, -52, arg4)) {
                                    return false;
                                 }

                                 arg8 += var25;
                                 arg4 += class597.field8402;
                                 arg0 += var22;
                                 arg9 += var20;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg9 >> 12) - -1, class595.field8383, var24, -38, arg4)) {
                                                return false;
                                             }

                                             arg8 += var25;
                                             arg4 += class597.field8402;
                                             arg9 += var20;
                                             arg5 += var21;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (~arg2 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg9 >> 12) - -1, class595.field8383, var24, -38, arg4);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg8 += var25;
                                             arg4 += class597.field8402;
                                             arg9 += var20;
                                             arg5 += var21;
                                          }
                                       }

                                       arg9 += var20;
                                    } else {
                                       if (!class236.method2085((arg0 >> 12) + -1, arg8, 0, (arg9 >> 12) + 1, class595.field8383, var24, -52, arg4)) {
                                          return false;
                                       }

                                       arg8 += var25;
                                       arg4 += class597.field8402;
                                       arg0 += var22;
                                       arg9 += var20;
                                    }
                                 }
                              }
                           } else {
                              arg2 -= arg6;
                              arg6 -= arg4;
                              arg4 = class597.field8402 * arg4;
                              if (var10) {
                                 if (!class236.method2085((arg9 >> 12) - 1, arg8, 0, (arg0 >> 12) + 1, class595.field8383, var24, -114, arg4)) {
                                    return false;
                                 }

                                 arg8 += var25;
                                 arg4 += class597.field8402;
                                 arg9 += var20;
                                 arg0 += var22;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg9 >> 12) + -1, arg8, 0, (arg5 >> 12) - -1, class595.field8383, var24, -61, arg4)) {
                                                return false;
                                             }

                                             arg9 += var20;
                                             arg4 += class597.field8402;
                                             arg8 += var25;
                                             arg5 += var21;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (arg2 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg9 >> 12) + -1, arg8, 0, (arg5 >> 12) - -1, class595.field8383, var24, -61, arg4);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg9 += var20;
                                             arg4 += class597.field8402;
                                             arg8 += var25;
                                             arg5 += var21;
                                          }
                                       }

                                       arg0 += var22;
                                    } else {
                                       if (!class236.method2085((arg9 >> 12) - 1, arg8, 0, (arg0 >> 12) + 1, class595.field8383, var24, -114, arg4)) {
                                          return false;
                                       }

                                       arg8 += var25;
                                       arg4 += class597.field8402;
                                       arg9 += var20;
                                       arg0 += var22;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg5 = arg9 <<= 12;
                           arg0 <<= 12;
                           if (~arg4 > -1) {
                              arg8 -= arg4 * var25;
                              arg5 -= arg4 * var22;
                              arg9 -= arg4 * var20;
                              arg4 = 0;
                           }

                           if (~arg2 > -1) {
                              arg0 -= arg2 * var21;
                              arg2 = 0;
                           }

                           if ((arg2 == arg4 || var20 <= var22) && (arg2 != arg4 || var21 >= var22)) {
                              arg6 -= arg2;
                              arg2 -= arg4;
                              arg4 = class597.field8402 * arg4;
                              if (var10) {
                                 if (!class236.method2085((arg9 >> 12) + -1, arg8, 0, (arg5 >> 12) + 1, class595.field8383, var24, -76, arg4)) {
                                    return false;
                                 }

                                 arg4 += class597.field8402;
                                 arg5 += var22;
                                 arg9 += var20;
                                 arg8 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg0 >> 12) + -1, arg8, 0, (arg5 >> 12) + 1, class595.field8383, var24, -40, arg4)) {
                                                return false;
                                             }

                                             arg8 += var25;
                                             arg0 += var21;
                                             arg5 += var22;
                                             arg4 += class597.field8402;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (~arg6 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg0 >> 12) + -1, arg8, 0, (arg5 >> 12) + 1, class595.field8383, var24, -40, arg4);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg8 += var25;
                                             arg0 += var21;
                                             arg5 += var22;
                                             arg4 += class597.field8402;
                                          }
                                       }

                                       arg8 += var25;
                                    } else {
                                       if (!class236.method2085((arg9 >> 12) + -1, arg8, 0, (arg5 >> 12) + 1, class595.field8383, var24, -76, arg4)) {
                                          return false;
                                       }

                                       arg4 += class597.field8402;
                                       arg5 += var22;
                                       arg9 += var20;
                                       arg8 += var25;
                                    }
                                 }
                              }
                           } else {
                              arg6 -= arg2;
                              arg2 -= arg4;
                              arg4 = class597.field8402 * arg4;
                              if (var10) {
                                 if (!class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg9 >> 12) + 1, class595.field8383, var24, -22, arg4)) {
                                    return false;
                                 }

                                 arg5 += var22;
                                 arg4 += class597.field8402;
                                 arg9 += var20;
                                 arg8 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg0 >> 12) + 1, class595.field8383, var24, -117, arg4)) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg0 += var21;
                                             arg4 += class597.field8402;
                                             arg8 += var25;
                                          }

                                          while(true) {
                                             --arg6;
                                             if (arg6 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg0 >> 12) + 1, class595.field8383, var24, -117, arg4);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg0 += var21;
                                             arg4 += class597.field8402;
                                             arg8 += var25;
                                          }
                                       }

                                       arg8 += var25;
                                    } else {
                                       if (!class236.method2085((arg5 >> 12) + -1, arg8, 0, (arg9 >> 12) + 1, class595.field8383, var24, -22, arg4)) {
                                          return false;
                                       }

                                       arg5 += var22;
                                       arg4 += class597.field8402;
                                       arg9 += var20;
                                       arg8 += var25;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (~arg6 > ~arg2) {
                     if (arg6 >= class358.field5300) {
                        return true;
                     } else {
                        if (~arg2 < ~class358.field5300) {
                           arg2 = class358.field5300;
                        }

                        arg3 = (arg3 << 8) - -var24 + -(arg5 * var24);
                        if (~arg4 < ~class358.field5300) {
                           arg4 = class358.field5300;
                        }

                        if (arg2 <= arg4) {
                           arg9 = arg5 <<= 12;
                           if (arg6 < 0) {
                              arg3 -= arg6 * var25;
                              arg5 -= arg6 * var22;
                              arg9 -= arg6 * var21;
                              arg6 = 0;
                           }

                           arg0 <<= 12;
                           if (~arg2 > -1) {
                              arg0 -= arg2 * var20;
                              arg2 = 0;
                           }

                           if (var22 > var21) {
                              arg4 -= arg2;
                              arg2 -= arg6;
                              arg6 = class597.field8402 * arg6;
                              if (var10) {
                                 if (!class236.method2085((arg9 >> 12) - 1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -89, arg6)) {
                                    return false;
                                 }

                                 arg9 += var21;
                                 arg3 += var25;
                                 arg6 += class597.field8402;
                                 arg5 += var22;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg0 >> 12) - 1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -28, arg6)) {
                                                return false;
                                             }

                                             arg6 += class597.field8402;
                                             arg5 += var22;
                                             arg0 += var20;
                                             arg3 += var25;
                                          }

                                          while(true) {
                                             --arg4;
                                             if (~arg4 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg0 >> 12) - 1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -28, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg6 += class597.field8402;
                                             arg5 += var22;
                                             arg0 += var20;
                                             arg3 += var25;
                                          }
                                       }

                                       arg5 += var22;
                                    } else {
                                       if (!class236.method2085((arg9 >> 12) - 1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -89, arg6)) {
                                          return false;
                                       }

                                       arg9 += var21;
                                       arg3 += var25;
                                       arg6 += class597.field8402;
                                       arg5 += var22;
                                    }
                                 }
                              }
                           } else {
                              arg4 -= arg2;
                              arg2 -= arg6;
                              arg6 = class597.field8402 * arg6;
                              if (var10) {
                                 if (!class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg9 >> 12) + 1, class595.field8383, var24, -91, arg6)) {
                                    return false;
                                 }

                                 arg6 += class597.field8402;
                                 arg5 += var22;
                                 arg9 += var21;
                                 arg3 += var25;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg0 >> 12) + 1, class595.field8383, var24, -121, arg6)) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg3 += var25;
                                             arg6 += class597.field8402;
                                             arg0 += var20;
                                          }

                                          while(true) {
                                             --arg4;
                                             if (~arg4 > -1) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg0 >> 12) + 1, class595.field8383, var24, -121, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg5 += var22;
                                             arg3 += var25;
                                             arg6 += class597.field8402;
                                             arg0 += var20;
                                          }
                                       }

                                       arg3 += var25;
                                    } else {
                                       if (!class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg9 >> 12) + 1, class595.field8383, var24, -91, arg6)) {
                                          return false;
                                       }

                                       arg6 += class597.field8402;
                                       arg5 += var22;
                                       arg9 += var21;
                                       arg3 += var25;
                                    }
                                 }
                              }
                           }
                        } else {
                           arg0 = arg5 <<= 12;
                           if (arg6 < 0) {
                              arg3 -= arg6 * var25;
                              arg0 -= arg6 * var21;
                              arg5 -= arg6 * var22;
                              arg6 = 0;
                           }

                           arg9 <<= 12;
                           if (arg4 < 0) {
                              arg9 -= arg4 * var20;
                              arg4 = 0;
                           }

                           if (var22 <= var21) {
                              arg2 -= arg4;
                              arg4 -= arg6;
                              arg6 = class597.field8402 * arg6;
                              if (var10) {
                                 if (!class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg0 >> 12) + 1, class595.field8383, var24, -97, arg6)) {
                                    return false;
                                 }

                                 arg3 += var25;
                                 arg0 += var21;
                                 arg6 += class597.field8402;
                                 arg5 += var22;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg9 >> 12) + -1, arg3, 0, (arg0 >> 12) - -1, class595.field8383, var24, -36, arg6)) {
                                                return false;
                                             }

                                             arg9 += var20;
                                             arg0 += var21;
                                             arg3 += var25;
                                             arg6 += class597.field8402;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (arg2 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg9 >> 12) + -1, arg3, 0, (arg0 >> 12) - -1, class595.field8383, var24, -36, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg9 += var20;
                                             arg0 += var21;
                                             arg3 += var25;
                                             arg6 += class597.field8402;
                                          }
                                       }

                                       arg5 += var22;
                                    } else {
                                       if (!class236.method2085((arg5 >> 12) + -1, arg3, 0, (arg0 >> 12) + 1, class595.field8383, var24, -97, arg6)) {
                                          return false;
                                       }

                                       arg3 += var25;
                                       arg0 += var21;
                                       arg6 += class597.field8402;
                                       arg5 += var22;
                                    }
                                 }
                              }
                           } else {
                              arg2 -= arg4;
                              arg4 -= arg6;
                              arg6 = class597.field8402 * arg6;
                              if (var10) {
                                 if (!class236.method2085((arg0 >> 12) + -1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -48, arg6)) {
                                    return false;
                                 }

                                 arg0 += var21;
                                 arg6 += class597.field8402;
                                 arg3 += var25;
                                 arg5 += var22;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var10) {
                                          if (var10) {
                                             if (!class236.method2085((arg0 >> 12) + -1, arg3, 0, (arg9 >> 12) + 1, class595.field8383, var24, -114, arg6)) {
                                                return false;
                                             }

                                             arg3 += var25;
                                             arg0 += var21;
                                             arg9 += var20;
                                             arg6 += class597.field8402;
                                          }

                                          while(true) {
                                             --arg2;
                                             if (arg2 < 0) {
                                                var10000 = true;
                                                if (!var10) {
                                                   return true;
                                                }
                                             } else {
                                                var10000 = class236.method2085((arg0 >> 12) + -1, arg3, 0, (arg9 >> 12) + 1, class595.field8383, var24, -114, arg6);
                                             }

                                             if (!var10000) {
                                                return false;
                                             }

                                             arg3 += var25;
                                             arg0 += var21;
                                             arg9 += var20;
                                             arg6 += class597.field8402;
                                          }
                                       }

                                       arg5 += var22;
                                    } else {
                                       if (!class236.method2085((arg0 >> 12) + -1, arg3, 0, (arg5 >> 12) + 1, class595.field8383, var24, -48, arg6)) {
                                          return false;
                                       }

                                       arg0 += var21;
                                       arg6 += class597.field8402;
                                       arg3 += var25;
                                       arg5 += var22;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (class358.field5300 <= arg2) {
                     return true;
                  } else {
                     if (~arg6 < ~class358.field5300) {
                        arg6 = class358.field5300;
                     }

                     arg1 = (arg1 << 8) + var24 - arg0 * var24;
                     if (~class358.field5300 > ~arg4) {
                        arg4 = class358.field5300;
                     }

                     if (~arg4 >= ~arg6) {
                        arg5 = arg0 <<= 12;
                        arg9 <<= 12;
                        if (arg2 < 0) {
                           arg0 -= arg2 * var21;
                           arg1 -= arg2 * var25;
                           arg5 -= arg2 * var20;
                           arg2 = 0;
                        }

                        if (arg4 < 0) {
                           arg9 -= arg4 * var22;
                           arg4 = 0;
                        }

                        if (var21 <= var20) {
                           arg6 -= arg4;
                           arg4 -= arg2;
                           arg2 = class597.field8402 * arg2;
                           if (var10) {
                              if (!class236.method2085((arg0 >> 12) - 1, arg1, 0, (arg5 >> 12) + 1, class595.field8383, var24, -80, arg2)) {
                                 return false;
                              }

                              arg5 += var20;
                              arg2 += class597.field8402;
                              arg1 += var25;
                              arg0 += var21;
                           }

                           while(true) {
                              while(true) {
                                 --arg4;
                                 if (~arg4 > -1) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class236.method2085((arg0 >> 12) + -1, arg1, 0, (arg9 >> 12) - -1, class595.field8383, var24, -74, arg2)) {
                                             return false;
                                          }

                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg9 += var22;
                                          arg0 += var21;
                                       }

                                       while(true) {
                                          --arg6;
                                          if (~arg6 > -1) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class236.method2085((arg0 >> 12) + -1, arg1, 0, (arg9 >> 12) - -1, class595.field8383, var24, -74, arg2);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg9 += var22;
                                          arg0 += var21;
                                       }
                                    }

                                    arg0 += var21;
                                 } else {
                                    if (!class236.method2085((arg0 >> 12) - 1, arg1, 0, (arg5 >> 12) + 1, class595.field8383, var24, -80, arg2)) {
                                       return false;
                                    }

                                    arg5 += var20;
                                    arg2 += class597.field8402;
                                    arg1 += var25;
                                    arg0 += var21;
                                 }
                              }
                           }
                        } else {
                           arg6 -= arg4;
                           arg4 -= arg2;
                           arg2 = class597.field8402 * arg2;
                           if (var10) {
                              if (!class236.method2085((arg5 >> 12) + -1, arg1, 0, (arg0 >> 12) + 1, class595.field8383, var24, -128, arg2)) {
                                 return false;
                              }

                              arg1 += var25;
                              arg2 += class597.field8402;
                              arg5 += var20;
                              arg0 += var21;
                           }

                           while(true) {
                              while(true) {
                                 --arg4;
                                 if (arg4 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg0 >> 12) - -1, class595.field8383, var24, -67, arg2)) {
                                             return false;
                                          }

                                          arg0 += var21;
                                          arg2 += class597.field8402;
                                          arg9 += var22;
                                          arg1 += var25;
                                       }

                                       while(true) {
                                          --arg6;
                                          if (arg6 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg0 >> 12) - -1, class595.field8383, var24, -67, arg2);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg0 += var21;
                                          arg2 += class597.field8402;
                                          arg9 += var22;
                                          arg1 += var25;
                                       }
                                    }

                                    arg0 += var21;
                                 } else {
                                    if (!class236.method2085((arg5 >> 12) + -1, arg1, 0, (arg0 >> 12) + 1, class595.field8383, var24, -128, arg2)) {
                                       return false;
                                    }

                                    arg1 += var25;
                                    arg2 += class597.field8402;
                                    arg5 += var20;
                                    arg0 += var21;
                                 }
                              }
                           }
                        }
                     } else {
                        arg9 = arg0 <<= 12;
                        if (arg2 < 0) {
                           arg9 -= arg2 * var20;
                           arg0 -= arg2 * var21;
                           arg1 -= arg2 * var25;
                           arg2 = 0;
                        }

                        arg5 <<= 12;
                        if (~arg6 > -1) {
                           arg5 -= arg6 * var22;
                           arg6 = 0;
                        }

                        if (arg2 != arg6 && ~var21 < ~var20 || ~arg2 == ~arg6 && var22 < var20) {
                           arg4 -= arg6;
                           arg6 -= arg2;
                           arg2 = class597.field8402 * arg2;
                           if (var10) {
                              if (!class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg0 >> 12) - -1, class595.field8383, var24, -59, arg2)) {
                                 return false;
                              }

                              arg1 += var25;
                              arg0 += var21;
                              arg2 += class597.field8402;
                              arg9 += var20;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (arg6 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg5 >> 12) + 1, class595.field8383, var24, -60, arg2)) {
                                             return false;
                                          }

                                          arg9 += var20;
                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg5 += var22;
                                       }

                                       while(true) {
                                          --arg4;
                                          if (arg4 < 0) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg5 >> 12) + 1, class595.field8383, var24, -60, arg2);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg9 += var20;
                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg5 += var22;
                                       }
                                    }

                                    arg9 += var20;
                                 } else {
                                    if (!class236.method2085((arg9 >> 12) + -1, arg1, 0, (arg0 >> 12) - -1, class595.field8383, var24, -59, arg2)) {
                                       return false;
                                    }

                                    arg1 += var25;
                                    arg0 += var21;
                                    arg2 += class597.field8402;
                                    arg9 += var20;
                                 }
                              }
                           }
                        } else {
                           arg4 -= arg6;
                           arg6 -= arg2;
                           arg2 = class597.field8402 * arg2;
                           if (var10) {
                              if (!class236.method2085((arg0 >> 12) - 1, arg1, 0, (arg9 >> 12) + 1, class595.field8383, var24, -25, arg2)) {
                                 return false;
                              }

                              arg2 += class597.field8402;
                              arg1 += var25;
                              arg0 += var21;
                              arg9 += var20;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (arg6 < 0) {
                                    if (!var10) {
                                       if (var10) {
                                          if (!class236.method2085((arg5 >> 12) + -1, arg1, 0, (arg9 >> 12) - -1, class595.field8383, var24, -33, arg2)) {
                                             return false;
                                          }

                                          arg9 += var20;
                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg5 += var22;
                                       }

                                       while(true) {
                                          --arg4;
                                          if (~arg4 > -1) {
                                             var10000 = true;
                                             if (!var10) {
                                                return true;
                                             }
                                          } else {
                                             var10000 = class236.method2085((arg5 >> 12) + -1, arg1, 0, (arg9 >> 12) - -1, class595.field8383, var24, -33, arg2);
                                          }

                                          if (!var10000) {
                                             return false;
                                          }

                                          arg9 += var20;
                                          arg2 += class597.field8402;
                                          arg1 += var25;
                                          arg5 += var22;
                                       }
                                    }

                                    arg9 += var20;
                                 } else {
                                    if (!class236.method2085((arg0 >> 12) - 1, arg1, 0, (arg9 >> 12) + 1, class595.field8383, var24, -25, arg2)) {
                                       return false;
                                    }

                                    arg2 += class597.field8402;
                                    arg1 += var25;
                                    arg0 += var21;
                                    arg9 += var20;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var27) {
         throw class612.method4503(var27, field3117[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1889(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1890(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
