import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class135 extends class15 {
   @OriginalMember(
      owner = "client!jn",
      name = "y",
      descriptor = "[I"
   )
   private int[] field1710;
   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "[I"
   )
   private int[] field1711;
   @OriginalMember(
      owner = "client!jn",
      name = "B",
      descriptor = "Lsja;"
   )
   private class70 field1713;
   @OriginalMember(
      owner = "client!jn",
      name = "C",
      descriptor = "Lsja;"
   )
   private class70 field1709;
   @OriginalMember(
      owner = "client!jn",
      name = "s",
      descriptor = "Lsja;"
   )
   private class70 field1715;
   @OriginalMember(
      owner = "client!jn",
      name = "x",
      descriptor = "[Lsja;"
   )
   private class70[] field1718;
   @OriginalMember(
      owner = "client!jn",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1721 = new String[]{method1136(method1135("GVO\u0006l")), method1136(method1135("CM\r+")), method1136(method1135("V\u0016Oi9")), method1136(method1135("GVO{-CQ\u0015yl")), method1136(method1135("GVO\u0002l")), method1136(method1135("GVO\u0003l")), method1136(method1135("GVO\u0004l")), method1136(method1135("GVO\u0005l"))};
   @OriginalMember(
      owner = "client!jn",
      name = "w",
      descriptor = "Ll;"
   )
   public static class292 field1717 = new class292("", 16);
   @OriginalMember(
      owner = "client!jn",
      name = "E",
      descriptor = "[C"
   )
   public static char[] field1720 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @OriginalMember(
      owner = "client!jn",
      name = "u",
      descriptor = "I"
   )
   public static int field1712;
   @OriginalMember(
      owner = "client!jn",
      name = "t",
      descriptor = "I"
   )
   public static int field1714;
   @OriginalMember(
      owner = "client!jn",
      name = "v",
      descriptor = "I"
   )
   public static int field1716;
   @OriginalMember(
      owner = "client!jn",
      name = "A",
      descriptor = "I"
   )
   public static int field1719;

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(IDLd;ZILww;I)[I"
   )
   public final int[] method1130(int arg0, double arg1, class102 arg2, boolean arg3, int arg4, class339 arg5, int arg6) {
      boolean var9 = client.field1481;

      try {
         class593.field8747 = arg2;
         ++field1714;
         class14.field258 = arg5;
         int var10 = 0;
         if (var9) {
            this.field1718[var10].method693(32767, arg0, arg6);
            ++var10;
         }

         while(true) {
            while(var10 < this.field1718.length) {
               this.field1718[var10].method693(32767, arg0, arg6);
               ++var10;
            }

            class355.method2816(arg1, (byte)124);
            class670.method4888(114, arg0, arg6);
            int[] var11 = new int[arg0 * arg6];
            int var12 = 0;
            if (!var9) {
               if (arg4 <= 25) {
                  return null;
               }

               int var28;
               label453: {
                  int var13 = 0;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[][] var18;
                  int[] var19;
                  if (var9) {
                     if (this.field1709.field930) {
                        var14 = this.field1709.method331((byte)-63, var13);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field1709.method547(-6752, var13);
                           var15 = var18[0];
                           var17 = var18[2];
                           var16 = var18[1];
                        }
                     } else {
                        var18 = this.field1709.method547(-6752, var13);
                        var15 = var18[0];
                        var17 = var18[2];
                        var16 = var18[1];
                     }

                     if (!this.field1715.field930) {
                        var19 = this.field1715.method547(-6752, var13)[0];
                        if (var9) {
                           var19 = this.field1715.method331((byte)-63, var13);
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field1715.method331((byte)-63, var13);
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  } else if (~var13 <= ~arg6) {
                     var28 = 0;
                     if (!var9) {
                        break label453;
                     }

                     var18 = this.field1709.method547(-6752, var13);
                     var15 = var18[0];
                     var17 = var18[2];
                     var16 = var18[1];
                     if (!this.field1715.field930) {
                        var19 = this.field1715.method547(-6752, var13)[0];
                        if (var9) {
                           var19 = this.field1715.method331((byte)-63, var13);
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field1715.method331((byte)-63, var13);
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  } else {
                     if (this.field1709.field930) {
                        var14 = this.field1709.method331((byte)-63, var13);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field1709.method547(-6752, var13);
                           var15 = var18[0];
                           var17 = var18[2];
                           var16 = var18[1];
                        }
                     } else {
                        var18 = this.field1709.method547(-6752, var13);
                        var15 = var18[0];
                        var17 = var18[2];
                        var16 = var18[1];
                     }

                     if (!this.field1715.field930) {
                        var19 = this.field1715.method547(-6752, var13)[0];
                        if (var9) {
                           var19 = this.field1715.method331((byte)-63, var13);
                           if (arg3) {
                              var12 = var13;
                           }
                        } else if (arg3) {
                           var12 = var13;
                        }
                     } else {
                        var19 = this.field1715.method331((byte)-63, var13);
                        if (arg3) {
                           var12 = var13;
                        }
                     }
                  }

                  while(true) {
                     label450: {
                        int var20 = arg0 + -1;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        if (var9) {
                           var21 = var15[var20] >> 4;
                           if (~var21 < -256) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var16[var20] >> 4;
                           if (var22 > 255) {
                              var22 = 255;
                              if (var22 < 0) {
                                 var22 = 0;
                              }
                           } else if (var22 < 0) {
                              var22 = 0;
                           }

                           var23 = var17[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           }
                        } else {
                           if (var20 < 0) {
                              break label450;
                           }

                           var21 = var15[var20] >> 4;
                           if (~var21 < -256) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var16[var20] >> 4;
                           if (var22 > 255) {
                              var22 = 255;
                              if (var22 < 0) {
                                 var22 = 0;
                              }
                           } else if (var22 < 0) {
                              var22 = 0;
                           }

                           var23 = var17[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           }
                        }

                        while(true) {
                           int var25 = class268.field3431[var21];
                           int var26 = class268.field3431[var23];
                           int var27;
                           if (~var25 == -1) {
                              if (~var24 == -1) {
                                 if (var26 != 0) {
                                    var27 = var19[var20] >> 4;
                                    if (var27 > 255) {
                                       var27 = 255;
                                    }

                                    if (var27 < 0) {
                                       var27 = 0;
                                       if (var9) {
                                          var27 = 0;
                                       }
                                    }

                                    var11[var12++] = (var24 << 8) + (var27 << 24) - -(var25 << 16) + var26;
                                    if (arg3) {
                                       var12 += arg0 + -1;
                                    }

                                    --var20;
                                 } else {
                                    byte var31 = 0;
                                    var11[var12++] = (var24 << 8) + (var31 << 24) - -(var25 << 16) + var26;
                                    if (arg3) {
                                       var12 += arg0 + -1;
                                    }

                                    --var20;
                                 }
                              } else {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var24 << 8) + (var27 << 24) - -(var25 << 16) + var26;
                                 if (arg3) {
                                    var12 += arg0 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var24 << 8) + (var27 << 24) - -(var25 << 16) + var26;
                              if (arg3) {
                                 var12 += arg0 + -1;
                              }

                              --var20;
                           }

                           if (var20 < 0) {
                              break;
                           }

                           var21 = var15[var20] >> 4;
                           if (~var21 < -256) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var16[var20] >> 4;
                           if (var22 > 255) {
                              var22 = 255;
                              if (var22 < 0) {
                                 var22 = 0;
                              }
                           } else if (var22 < 0) {
                              var22 = 0;
                           }

                           var23 = var17[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class268.field3431[var22];
                              if (var23 < 0) {
                                 var23 = 0;
                              }
                           }
                        }
                     }

                     ++var13;
                     if (~var13 <= ~arg6) {
                        var28 = 0;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field1709.method547(-6752, var13);
                        var15 = var18[0];
                        var17 = var18[2];
                        var16 = var18[1];
                        if (!this.field1715.field930) {
                           var19 = this.field1715.method547(-6752, var13)[0];
                           if (var9) {
                              var19 = this.field1715.method331((byte)-63, var13);
                              if (arg3) {
                                 var12 = var13;
                              }
                           } else if (arg3) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field1715.method331((byte)-63, var13);
                           if (arg3) {
                              var12 = var13;
                           }
                        }
                     } else {
                        if (this.field1709.field930) {
                           var14 = this.field1709.method331((byte)-63, var13);
                           var15 = var14;
                           var16 = var14;
                           var17 = var14;
                           if (var9) {
                              var18 = this.field1709.method547(-6752, var13);
                              var15 = var18[0];
                              var17 = var18[2];
                              var16 = var18[1];
                           }
                        } else {
                           var18 = this.field1709.method547(-6752, var13);
                           var15 = var18[0];
                           var17 = var18[2];
                           var16 = var18[1];
                        }

                        if (!this.field1715.field930) {
                           var19 = this.field1715.method547(-6752, var13)[0];
                           if (var9) {
                              var19 = this.field1715.method331((byte)-63, var13);
                              if (arg3) {
                                 var12 = var13;
                              }
                           } else if (arg3) {
                              var12 = var13;
                           }
                        } else {
                           var19 = this.field1715.method331((byte)-63, var13);
                           if (arg3) {
                              var12 = var13;
                           }
                        }
                     }
                  }
               }

               if (var9) {
                  this.field1718[var28].method688(false);
                  ++var28;
               }

               while(true) {
                  while(~var28 > ~this.field1718.length) {
                     this.field1718[var28].method688(false);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class93.method866(var30, field1721[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1721[2] : field1721[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1721[2] : field1721[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(ZDILd;Lww;IIZ)[I"
   )
   public final int[] method1131(boolean arg0, double arg1, int arg2, class102 arg3, class339 arg4, int arg5, int arg6, boolean arg7) {
      boolean var10 = client.field1481;

      try {
         class593.field8747 = arg3;
         class14.field258 = arg4;
         ++field1716;
         int var11 = 0;
         if (var10) {
            this.field1718[var11].method693(32767, arg2, arg6);
            ++var11;
         }

         while(true) {
            while(this.field1718.length > var11) {
               this.field1718[var11].method693(32767, arg2, arg6);
               ++var11;
            }

            class355.method2816(arg1, (byte)102);
            class670.method4888(-95, arg2, arg6);
            int[] var12 = new int[arg2 * arg6];
            if (!var10) {
               int var13;
               int var14;
               byte var15;
               label148: {
                  if (arg7) {
                     var13 = -1;
                     var14 = arg2 + -1;
                     var15 = -1;
                     if (!var10) {
                        break label148;
                     }
                  }

                  var13 = arg2;
                  var15 = 1;
                  var14 = 0;
               }

               int var16 = 0;
               if (arg5 < 70) {
                  return null;
               }

               int var31;
               label123: {
                  int var17 = 0;
                  if (var10) {
                     if (arg0) {
                        var16 = var17;
                     }
                  } else if (~arg6 >= ~var17) {
                     var31 = 0;
                     if (!var10) {
                        break label123;
                     }
                  } else if (arg0) {
                     var16 = var17;
                  }

                  while(true) {
                     int[] var19;
                     int[] var20;
                     int[] var21;
                     label109: {
                        if (this.field1709.field930) {
                           int[] var18 = this.field1709.method331((byte)-63, var17);
                           var19 = var18;
                           var20 = var18;
                           var21 = var18;
                           if (!var10) {
                              break label109;
                           }
                        }

                        int[][] var22 = this.field1709.method547(-6752, var17);
                        var20 = var22[2];
                        var19 = var22[1];
                        var21 = var22[0];
                     }

                     int var23 = var14;
                     if (var10 || var13 != var14) {
                        do {
                           int var24 = var21[var23] >> 4;
                           if (var24 > 255) {
                              var24 = 255;
                           }

                           if (var24 < 0) {
                              var24 = 0;
                           }

                           int var25 = var19[var23] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (~var25 > -1) {
                              var25 = 0;
                           }

                           int var26 = var20[var23] >> 4;
                           if (var26 > 255) {
                              var26 = 255;
                           }

                           if (~var26 > -1) {
                              var26 = 0;
                           }

                           int var27 = class268.field3431[var24];
                           int var28 = class268.field3431[var25];
                           int var29 = class268.field3431[var26];
                           int var30 = (var27 << 16) + (var28 << 8) - -var29;
                           if (~var30 != -1) {
                              var30 |= -16777216;
                           }

                           var12[var16++] = var30;
                           if (arg0) {
                              var16 += arg2 - 1;
                           }

                           var23 += var15;
                        } while(var13 != var23);
                     }

                     ++var17;
                     if (~arg6 >= ~var17) {
                        var31 = 0;
                        if (!var10) {
                           break;
                        }
                     } else if (arg0) {
                        var16 = var17;
                     }
                  }
               }

               if (var10) {
                  this.field1718[var31].method688(false);
                  ++var31;
               }

               while(true) {
                  while(~var31 > ~this.field1718.length) {
                     this.field1718[var31].method688(false);
                     ++var31;
                  }

                  if (!var10) {
                     return var12;
                  }

                  ++var31;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var33) {
         throw class93.method866(var33, field1721[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1721[2] : field1721[1]) + ',' + (arg4 != null ? field1721[2] : field1721[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(ILww;Ld;)Z"
   )
   public final boolean method1132(int arg0, class339 arg1, class102 arg2) {
      boolean var4 = client.field1481;

      try {
         ++field1719;
         int var5;
         int var6;
         if (~class602.field8871 <= -1) {
            var5 = 0;
            if (var4) {
               if (!arg1.method2690(class602.field8871, this.field1711[var5], 123)) {
                  return false;
               }

               ++var5;
            }

            while(true) {
               while(var5 < this.field1711.length) {
                  if (!arg1.method2690(class602.field8871, this.field1711[var5], 123)) {
                     return false;
                  }

                  ++var5;
               }

               if (!var4) {
                  if (var4) {
                     var5 = 0;
                     if (var4) {
                        if (!arg1.method2681((byte)45, this.field1711[var5])) {
                           return false;
                        }

                        ++var5;
                     }
                  } else {
                     if (!var4) {
                        if (arg0 != 14033) {
                           field1717 = null;
                        }

                        var6 = 0;
                        if (var4) {
                           if (!arg2.method915(this.field1710[var6], arg0 + -13906)) {
                              return false;
                           }

                           ++var6;
                        }

                        while(true) {
                           while(var6 < this.field1710.length) {
                              if (!arg2.method915(this.field1710[var6], arg0 + -13906)) {
                                 return false;
                              }

                              ++var6;
                           }

                           if (!var4) {
                              return true;
                           }

                           if (false) {
                              return false;
                           }

                           ++var6;
                        }
                     }

                     if (arg0 == 0) {
                        return false;
                     }

                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var4) {
               if (!arg1.method2681((byte)45, this.field1711[var5])) {
                  return false;
               }

               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field1711.length) {
               if (!arg1.method2681((byte)45, this.field1711[var5])) {
                  return false;
               }

               ++var5;
            }

            if (!var4) {
               if (arg0 != 14033) {
                  field1717 = null;
               }

               var6 = 0;
               if (var4) {
                  if (!arg2.method915(this.field1710[var6], arg0 + -13906)) {
                     return false;
                  }

                  ++var6;
               }

               while(true) {
                  while(var6 < this.field1710.length) {
                     if (!arg2.method915(this.field1710[var6], arg0 + -13906)) {
                        return false;
                     }

                     ++var6;
                  }

                  if (!var4) {
                     return true;
                  }

                  if (false) {
                     return false;
                  }

                  ++var6;
               }
            }

            if (arg0 == 0) {
               return false;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1721[5] + arg0 + ',' + (arg1 != null ? field1721[2] : field1721[1]) + ',' + (arg2 != null ? field1721[2] : field1721[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(Lww;Ld;ZIII)[F"
   )
   public final float[] method1133(class339 arg0, class102 arg1, boolean arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1481;

      try {
         class14.field258 = arg0;
         ++field1712;
         class593.field8747 = arg1;
         int var8 = 0;
         if (var7) {
            this.field1718[var8].method693(32767, arg3, arg5);
            ++var8;
         }

         while(true) {
            while(~var8 > ~this.field1718.length) {
               this.field1718[var8].method693(32767, arg3, arg5);
               ++var8;
            }

            class670.method4888(-47, arg3, arg5);
            float[] var9 = new float[arg3 * 4 * arg5];
            int var10 = 0;
            if (!var7) {
               if (arg4 != 1) {
                  this.field1715 = null;
               }

               int var22;
               label261: {
                  int var11 = 0;
                  int[] var12;
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[][] var16;
                  int[] var17;
                  int[] var18;
                  int var19;
                  float var20;
                  float var21;
                  if (var7) {
                     if (this.field1709.field930) {
                        var12 = this.field1709.method331((byte)-63, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field1709.method547(-6752, var11);
                           var14 = var16[0];
                           var13 = var16[2];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field1709.method547(-6752, var11);
                        var14 = var16[0];
                        var13 = var16[2];
                        var15 = var16[1];
                     }

                     if (!this.field1715.field930) {
                        var17 = this.field1715.method547(-6752, var11)[0];
                        if (var7) {
                           var17 = this.field1715.method331((byte)-63, var11);
                        }
                     } else {
                        var17 = this.field1715.method331((byte)-63, var11);
                     }

                     if (arg2) {
                        var10 = var11 << 2;
                     }

                     if (this.field1713.field930) {
                        var18 = this.field1713.method331((byte)-63, var11);
                        if (var7) {
                           var18 = this.field1713.method547(-6752, var11)[0];
                        }
                     } else {
                        var18 = this.field1713.method547(-6752, var11)[0];
                     }

                     var19 = arg3 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = var20;
                        if (arg2) {
                           var10 += (arg3 << 2) + -4;
                        }

                        --var19;
                     }
                  } else {
                     if (~arg5 >= ~var11) {
                        var22 = 0;
                        if (!var7) {
                           break label261;
                        }

                        var16 = this.field1709.method547(-6752, var11);
                        var14 = var16[0];
                        var13 = var16[2];
                        var15 = var16[1];
                     } else if (this.field1709.field930) {
                        var12 = this.field1709.method331((byte)-63, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field1709.method547(-6752, var11);
                           var14 = var16[0];
                           var13 = var16[2];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field1709.method547(-6752, var11);
                        var14 = var16[0];
                        var13 = var16[2];
                        var15 = var16[1];
                     }

                     if (!this.field1715.field930) {
                        var17 = this.field1715.method547(-6752, var11)[0];
                        if (var7) {
                           var17 = this.field1715.method331((byte)-63, var11);
                        }
                     } else {
                        var17 = this.field1715.method331((byte)-63, var11);
                     }

                     if (arg2) {
                        var10 = var11 << 2;
                     }

                     if (this.field1713.field930) {
                        var18 = this.field1713.method331((byte)-63, var11);
                        if (var7) {
                           var18 = this.field1713.method547(-6752, var11)[0];
                        }
                     } else {
                        var18 = this.field1713.method547(-6752, var11)[0];
                     }

                     var19 = arg3 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = var20;
                        if (arg2) {
                           var10 += (arg3 << 2) + -4;
                        }

                        --var19;
                     }
                  }

                  while(true) {
                     while(~var19 <= -1) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = var20;
                        if (arg2) {
                           var10 += (arg3 << 2) + -4;
                        }

                        --var19;
                     }

                     ++var11;
                     if (~arg5 >= ~var11) {
                        var22 = 0;
                        if (!var7) {
                           break;
                        }

                        var16 = this.field1709.method547(-6752, var11);
                        var14 = var16[0];
                        var13 = var16[2];
                        var15 = var16[1];
                     } else if (this.field1709.field930) {
                        var12 = this.field1709.method331((byte)-63, var11);
                        var13 = var12;
                        var14 = var12;
                        var15 = var12;
                        if (var7) {
                           var16 = this.field1709.method547(-6752, var11);
                           var14 = var16[0];
                           var13 = var16[2];
                           var15 = var16[1];
                        }
                     } else {
                        var16 = this.field1709.method547(-6752, var11);
                        var14 = var16[0];
                        var13 = var16[2];
                        var15 = var16[1];
                     }

                     if (!this.field1715.field930) {
                        var17 = this.field1715.method547(-6752, var11)[0];
                        if (var7) {
                           var17 = this.field1715.method331((byte)-63, var11);
                        }
                     } else {
                        var17 = this.field1715.method331((byte)-63, var11);
                     }

                     if (arg2) {
                        var10 = var11 << 2;
                     }

                     if (this.field1713.field930) {
                        var18 = this.field1713.method331((byte)-63, var11);
                        if (var7) {
                           var18 = this.field1713.method547(-6752, var11)[0];
                        }
                     } else {
                        var18 = this.field1713.method547(-6752, var11)[0];
                     }

                     var19 = arg3 + -1;
                     if (var7) {
                        var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = var20;
                        if (arg2) {
                           var10 += (arg3 << 2) + -4;
                        }

                        --var19;
                     }
                  }
               }

               if (var7) {
                  this.field1718[var22].method688(false);
                  ++var22;
               }

               while(true) {
                  while(~this.field1718.length < ~var22) {
                     this.field1718[var22].method688(false);
                     ++var22;
                  }

                  if (!var7) {
                     return var9;
                  }

                  ++var22;
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field1721[0] + (arg0 != null ? field1721[2] : field1721[1]) + ',' + (arg1 != null ? field1721[2] : field1721[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1134(int arg0) {
      try {
         field1720 = null;
         field1717 = null;
         if (arg0 != -256) {
            field1717 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1721[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "<init>",
      descriptor = "()V"
   )
   public class135() {
      try {
         this.field1710 = new int[0];
         this.field1711 = new int[0];
         this.field1713 = new class390(0);
         this.field1713.field938 = 1;
         this.field1709 = new class390();
         this.field1709.field938 = 1;
         this.field1715 = new class390();
         this.field1715.field938 = 1;
         this.field1718 = new class70[]{this.field1709, this.field1715, this.field1713};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1721[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   public class135(class66 arg0) {
      boolean var2 = client.field1481;
      super();

      try {
         int var3;
         int var4;
         int var5;
         int[][] var6;
         byte var10000;
         label97: {
            var3 = arg0.method640(255);
            var4 = 0;
            var5 = 0;
            var6 = new int[var3][];
            this.field1718 = new class70[var3];
            int var7 = 0;
            if (var2) {
               var10000 = 51;
            } else if (var7 >= var3) {
               this.field1711 = new int[var4];
               this.field1710 = new int[var5];
               var4 = 0;
               var5 = 0;
               var10000 = 0;
               if (!var2) {
                  break label97;
               }
            } else {
               var10000 = 51;
            }

            label96:
            while(true) {
               class70 var8 = class779.method5625(var10000, arg0);
               if (~var8.method689(false) <= -1) {
                  ++var4;
                  if (~var8.method687(0) <= -1) {
                     ++var5;
                  }
               } else if (~var8.method687(0) <= -1) {
                  ++var5;
               }

               int var9 = var8.field935.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method640(255);
                  ++var10;
               }

               while(true) {
                  while(~var10 > ~var9) {
                     var6[var7][var10] = arg0.method640(255);
                     ++var10;
                  }

                  this.field1718[var7] = var8;
                  if (!var2) {
                     ++var7;
                     if (var7 >= var3) {
                        this.field1711 = new int[var4];
                        this.field1710 = new int[var5];
                        var4 = 0;
                        var5 = 0;
                        var10000 = 0;
                        if (!var2) {
                           break label96;
                        }
                     } else {
                        var10000 = 51;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }

         int var11 = var10000;
         class70 var12;
         int var13;
         int var14;
         Object var17;
         class135 var20;
         if (var2) {
            var12 = this.field1718[var11];
            var13 = var12.field935.length;
            var14 = 0;
            if (var2) {
               var12.field935[var14] = this.field1718[var6[var11][var14]];
               ++var14;
            }
         } else {
            if (var3 <= var11) {
               this.field1709 = this.field1718[arg0.method640(255)];
               this.field1715 = this.field1718[arg0.method640(255)];
               var20 = this;
               if (!var2) {
                  this.field1713 = this.field1718[arg0.method640(255)];
                  var17 = null;
                  return;
               }
            } else {
               var20 = this;
            }

            var12 = var20.field1718[var11];
            var13 = var12.field935.length;
            var14 = 0;
            if (var2) {
               var12.field935[var14] = this.field1718[var6[var11][var14]];
               ++var14;
            }
         }

         while(true) {
            while(var13 > var14) {
               var12.field935[var14] = this.field1718[var6[var11][var14]];
               ++var14;
            }

            int var15 = var12.method689(false);
            int var16 = var12.method687(0);
            if (!var2) {
               if (var15 > 0) {
                  this.field1711[var4++] = var15;
               }

               if (var16 > 0) {
                  this.field1710[var5++] = var16;
               }

               var6[var11] = null;
               ++var11;
               if (var3 <= var11) {
                  this.field1709 = this.field1718[arg0.method640(255)];
                  this.field1715 = this.field1718[arg0.method640(255)];
                  var20 = this;
                  if (!var2) {
                     this.field1713 = this.field1718[arg0.method640(255)];
                     var17 = null;
                     return;
                  }
               } else {
                  var20 = this;
               }

               var12 = var20.field1718[var11];
               var13 = var12.field935.length;
               var14 = 0;
               if (var2) {
                  var12.field935[var14] = this.field1718[var6[var11][var14]];
                  ++var14;
               }
            } else {
               ++var14;
            }
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field1721[3] + (arg0 != null ? field1721[2] : field1721[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
