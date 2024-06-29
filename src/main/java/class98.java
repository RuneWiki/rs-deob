import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class98 extends class70 {
   @OriginalMember(
      owner = "client!aja",
      name = "E",
      descriptor = "[I"
   )
   private int[] field1202;
   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "[I"
   )
   private int[] field1201;
   @OriginalMember(
      owner = "client!aja",
      name = "H",
      descriptor = "Loaa;"
   )
   private class302 field1208;
   @OriginalMember(
      owner = "client!aja",
      name = "C",
      descriptor = "Loaa;"
   )
   private class302 field1206;
   @OriginalMember(
      owner = "client!aja",
      name = "B",
      descriptor = "Loaa;"
   )
   private class302 field1203;
   @OriginalMember(
      owner = "client!aja",
      name = "x",
      descriptor = "[Loaa;"
   )
   private class302[] field1207;
   @OriginalMember(
      owner = "client!aja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1211 = new String[]{method865(method864("l[[\u0006}%")), method865(method864("cDVD")), method865(method864("v\u001f\u0014\u0006I")), method865(method864("l[[\u0006\bd_S\\\n%")), method865(method864("l[[\u0006x%")), method865(method864("l[[\u0006y%")), method865(method864("l[[\u0006\u007f%"))};
   @OriginalMember(
      owner = "client!aja",
      name = "F",
      descriptor = "I"
   )
   public static int field1200;
   @OriginalMember(
      owner = "client!aja",
      name = "y",
      descriptor = "I"
   )
   public static int field1204;
   @OriginalMember(
      owner = "client!aja",
      name = "A",
      descriptor = "I"
   )
   public static int field1205;
   @OriginalMember(
      owner = "client!aja",
      name = "G",
      descriptor = "I"
   )
   public static int field1209;
   @OriginalMember(
      owner = "client!aja",
      name = "D",
      descriptor = "I"
   )
   public static int field1210;

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(Ld;DIIZILeaa;)[I",
      line = 13
   )
   public final int[] method859(class160 arg0, double arg1, int arg2, int arg3, boolean arg4, int arg5, class526 arg6) {
      int var9 = client.field4530;

      try {
         ++field1210;
         class556.field8260 = arg6;
         class704.field10551 = arg0;
         int var10 = 0;
         if (var9 != 0) {
            this.field1207[var10].method242(arg5, arg2, true);
            ++var10;
         }

         while(true) {
            while(~var10 > ~this.field1207.length) {
               this.field1207[var10].method242(arg5, arg2, true);
               ++var10;
            }

            class757.method5499(arg1, 255);
            class92.method845(arg2, -1115237556, arg5);
            int[] var11 = new int[arg2 * arg5];
            int var12 = 0;
            int var13 = 0;
            if (var9 == 0) {
               int var28;
               label431: {
                  int[][] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[] var18;
                  int[] var19;
                  if (var9 != 0) {
                     if (!this.field1206.field4313) {
                        var14 = this.field1206.method245((byte)-90, var13);
                        var15 = var14[0];
                        var16 = var14[2];
                        var17 = var14[1];
                        if (var9 != 0) {
                           var18 = this.field1206.method401(var13, -58);
                           var15 = var18;
                           var17 = var18;
                           var16 = var18;
                           if (arg4) {
                              var12 = var13;
                           }

                           if (!this.field1203.field4313) {
                              var19 = this.field1203.method245((byte)-90, var13)[0];
                              if (var9 != 0) {
                                 var19 = this.field1203.method401(var13, -63);
                              }
                           } else {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           if (arg4) {
                              var12 = var13;
                           }

                           if (!this.field1203.field4313) {
                              var19 = this.field1203.method245((byte)-90, var13)[0];
                              if (var9 != 0) {
                                 var19 = this.field1203.method401(var13, -63);
                              }
                           } else {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        }
                     } else {
                        var18 = this.field1206.method401(var13, -58);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                        if (arg4) {
                           var12 = var13;
                        }

                        if (!this.field1203.field4313) {
                           var19 = this.field1203.method245((byte)-90, var13)[0];
                           if (var9 != 0) {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     }
                  } else if (~var13 <= ~arg2) {
                     var28 = 0;
                     if (var9 == 0) {
                        break label431;
                     }

                     var18 = this.field1206.method401(var13, -58);
                     var15 = var18;
                     var17 = var18;
                     var16 = var18;
                     if (arg4) {
                        var12 = var13;
                     }

                     if (!this.field1203.field4313) {
                        var19 = this.field1203.method245((byte)-90, var13)[0];
                        if (var9 != 0) {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     } else {
                        var19 = this.field1203.method401(var13, -63);
                     }
                  } else if (!this.field1206.field4313) {
                     var14 = this.field1206.method245((byte)-90, var13);
                     var15 = var14[0];
                     var16 = var14[2];
                     var17 = var14[1];
                     if (var9 != 0) {
                        var18 = this.field1206.method401(var13, -58);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                        if (arg4) {
                           var12 = var13;
                        }

                        if (!this.field1203.field4313) {
                           var19 = this.field1203.method245((byte)-90, var13)[0];
                           if (var9 != 0) {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     } else {
                        if (arg4) {
                           var12 = var13;
                        }

                        if (!this.field1203.field4313) {
                           var19 = this.field1203.method245((byte)-90, var13)[0];
                           if (var9 != 0) {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     }
                  } else {
                     var18 = this.field1206.method401(var13, -58);
                     var15 = var18;
                     var17 = var18;
                     var16 = var18;
                     if (arg4) {
                        var12 = var13;
                     }

                     if (!this.field1203.field4313) {
                        var19 = this.field1203.method245((byte)-90, var13)[0];
                        if (var9 != 0) {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     } else {
                        var19 = this.field1203.method401(var13, -63);
                     }
                  }

                  while(true) {
                     int var20 = arg5 + -1;
                     if (var9 != 0 || ~var20 <= -1) {
                        do {
                           int var21 = var15[var20] >> 4;
                           int var22;
                           int var23;
                           if (var21 > 255) {
                              var21 = 255;
                              if (~var21 > -1) {
                                 var21 = 0;
                              }

                              var22 = var17[var20] >> 4;
                              if (var22 > 255) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var16[var20] >> 4;
                              if (var23 > 255) {
                                 var23 = 255;
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              } else if (var23 < 0) {
                                 var23 = 0;
                              }
                           } else {
                              if (~var21 > -1) {
                                 var21 = 0;
                              }

                              var22 = var17[var20] >> 4;
                              if (var22 > 255) {
                                 var22 = 255;
                                 if (var22 < 0) {
                                    var22 = 0;
                                 }
                              } else if (var22 < 0) {
                                 var22 = 0;
                              }

                              var23 = var16[var20] >> 4;
                              if (var23 > 255) {
                                 var23 = 255;
                                 if (var23 < 0) {
                                    var23 = 0;
                                 }
                              } else if (var23 < 0) {
                                 var23 = 0;
                              }
                           }

                           int var24 = class638.field9286[var22];
                           int var25 = class638.field9286[var21];
                           int var26 = class638.field9286[var23];
                           int var27;
                           if (var25 == 0) {
                              if (var24 == 0) {
                                 if (~var26 != -1) {
                                    var27 = var19[var20] >> 4;
                                    if (var27 > 255) {
                                       var27 = 255;
                                    }

                                    if (~var27 > -1) {
                                       var27 = 0;
                                       if (var9 != 0) {
                                          var27 = 0;
                                       }
                                    }

                                    var11[var12++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                                    if (arg4) {
                                       var12 += arg5 + -1;
                                    }

                                    --var20;
                                 } else {
                                    byte var31 = 0;
                                    var11[var12++] = (var24 << 8) + var26 + (var25 << 16) + (var31 << 24);
                                    if (arg4) {
                                       var12 += arg5 + -1;
                                    }

                                    --var20;
                                 }
                              } else {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (~var27 > -1) {
                                    var27 = 0;
                                    if (var9 != 0) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                                 if (arg4) {
                                    var12 += arg5 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (~var27 > -1) {
                                 var27 = 0;
                                 if (var9 != 0) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                              if (arg4) {
                                 var12 += arg5 + -1;
                              }

                              --var20;
                           }
                        } while(~var20 <= -1);
                     }

                     ++var13;
                     if (~var13 <= ~arg2) {
                        var28 = 0;
                        if (var9 == 0) {
                           break;
                        }

                        var18 = this.field1206.method401(var13, -58);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                        if (arg4) {
                           var12 = var13;
                        }

                        if (!this.field1203.field4313) {
                           var19 = this.field1203.method245((byte)-90, var13)[0];
                           if (var9 != 0) {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     } else if (!this.field1206.field4313) {
                        var14 = this.field1206.method245((byte)-90, var13);
                        var15 = var14[0];
                        var16 = var14[2];
                        var17 = var14[1];
                        if (var9 != 0) {
                           var18 = this.field1206.method401(var13, -58);
                           var15 = var18;
                           var17 = var18;
                           var16 = var18;
                           if (arg4) {
                              var12 = var13;
                           }

                           if (!this.field1203.field4313) {
                              var19 = this.field1203.method245((byte)-90, var13)[0];
                              if (var9 != 0) {
                                 var19 = this.field1203.method401(var13, -63);
                              }
                           } else {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           if (arg4) {
                              var12 = var13;
                           }

                           if (!this.field1203.field4313) {
                              var19 = this.field1203.method245((byte)-90, var13)[0];
                              if (var9 != 0) {
                                 var19 = this.field1203.method401(var13, -63);
                              }
                           } else {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        }
                     } else {
                        var18 = this.field1206.method401(var13, -58);
                        var15 = var18;
                        var17 = var18;
                        var16 = var18;
                        if (arg4) {
                           var12 = var13;
                        }

                        if (!this.field1203.field4313) {
                           var19 = this.field1203.method245((byte)-90, var13)[0];
                           if (var9 != 0) {
                              var19 = this.field1203.method401(var13, -63);
                           }
                        } else {
                           var19 = this.field1203.method401(var13, -63);
                        }
                     }
                  }
               }

               if (var9 != 0) {
                  this.field1207[var28].method241(false);
                  ++var28;
               }

               while(true) {
                  while(~var28 > ~this.field1207.length) {
                     this.field1207[var28].method241(false);
                     ++var28;
                  }

                  if (var9 == 0) {
                     if (arg3 > -61) {
                        return null;
                     }

                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field1211[0] + (arg0 != null ? field1211[2] : field1211[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1211[2] : field1211[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(ZBILd;Leaa;I)[F",
      line = 153
   )
   public final float[] method860(boolean arg0, byte arg1, int arg2, class160 arg3, class526 arg4, int arg5) {
      int var7 = client.field4530;

      try {
         class556.field8260 = arg4;
         class704.field10551 = arg3;
         ++field1200;
         int var8 = 0;
         if (var7 != 0) {
            this.field1207[var8].method242(arg5, arg2, true);
            ++var8;
         }

         while(true) {
            while(~this.field1207.length < ~var8) {
               this.field1207[var8].method242(arg5, arg2, true);
               ++var8;
            }

            class92.method845(arg2, -1115237556, arg5);
            float[] var9 = new float[arg2 * 4 * arg5];
            int var10 = 0;
            int var11 = 0;
            if (var7 == 0) {
               byte var10000;
               int var22;
               if (var7 != 0) {
                  var10000 = this.field1206.field4313;
               } else if (~var11 <= ~arg2) {
                  var10000 = arg1;
                  if (var7 == 0) {
                     if (arg1 <= 114) {
                        return null;
                     }

                     var22 = 0;
                     if (var7 != 0) {
                        this.field1207[var22].method241(false);
                        ++var22;
                     }

                     while(true) {
                        while(~this.field1207.length < ~var22) {
                           this.field1207[var22].method241(false);
                           ++var22;
                        }

                        if (var7 == 0) {
                           return var9;
                        }

                        ++var22;
                     }
                  }
               } else {
                  var10000 = this.field1206.field4313;
               }

               while(true) {
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  if (var10000 == 0) {
                     int[][] var12 = this.field1206.method245((byte)-90, var11);
                     var13 = var12[2];
                     var14 = var12[0];
                     var15 = var12[1];
                     if (var7 != 0) {
                        var16 = this.field1206.method401(var11, -54);
                        var13 = var16;
                        var14 = var16;
                        var15 = var16;
                     }
                  } else {
                     var16 = this.field1206.method401(var11, -54);
                     var13 = var16;
                     var14 = var16;
                     var15 = var16;
                  }

                  int[] var17;
                  if (!this.field1203.field4313) {
                     var17 = this.field1203.method245((byte)-90, var11)[0];
                     if (var7 != 0) {
                        var17 = this.field1203.method401(var11, -56);
                     }
                  } else {
                     var17 = this.field1203.method401(var11, -56);
                  }

                  int[] var18;
                  if (this.field1208.field4313) {
                     var18 = this.field1208.method401(var11, -59);
                     if (var7 != 0) {
                        var18 = this.field1208.method245((byte)-90, var11)[0];
                        if (arg0) {
                           var10 = var11 << 2;
                        }
                     } else if (arg0) {
                        var10 = var11 << 2;
                     }
                  } else {
                     var18 = this.field1208.method245((byte)-90, var11)[0];
                     if (arg0) {
                        var10 = var11 << 2;
                     }
                  }

                  int var19 = arg5 - 1;
                  if (var7 != 0 || ~var19 <= -1) {
                     do {
                        float var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7 != 0) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        float var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = var20;
                        if (arg0) {
                           var10 += (arg5 << 2) + -4;
                        }

                        --var19;
                     } while(~var19 <= -1);
                  }

                  ++var11;
                  if (~var11 <= ~arg2) {
                     var10000 = arg1;
                     if (var7 == 0) {
                        if (arg1 <= 114) {
                           return null;
                        }

                        var22 = 0;
                        if (var7 != 0) {
                           this.field1207[var22].method241(false);
                           ++var22;
                        }

                        while(true) {
                           while(~this.field1207.length < ~var22) {
                              this.field1207[var22].method241(false);
                              ++var22;
                           }

                           if (var7 == 0) {
                              return var9;
                           }

                           ++var22;
                        }
                     }
                  } else {
                     var10000 = this.field1206.field4313;
                  }
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field1211[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1211[2] : field1211[1]) + ',' + (arg4 != null ? field1211[2] : field1211[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(ZLd;Leaa;)Z",
      line = 268
   )
   public final boolean method861(boolean arg0, class160 arg1, class526 arg2) {
      int var4 = client.field4530;

      try {
         ++field1204;
         int var5;
         int var6;
         if (~class467.field7000 > -1) {
            var5 = 0;
            if (var4 != 0) {
               if (!arg2.method3884((byte)-99, this.field1201[var5])) {
                  return false;
               }

               ++var5;
            }

            while(true) {
               while(this.field1201.length > var5) {
                  if (!arg2.method3884((byte)-99, this.field1201[var5])) {
                     return false;
                  }

                  ++var5;
               }

               if (var4 == 0) {
                  if (var4 != 0) {
                     var5 = 0;
                     if (var4 != 0) {
                        if (!arg2.method3889(this.field1201[var5], -123, class467.field7000)) {
                           return false;
                        }

                        ++var5;
                     }
                  } else {
                     if (var4 == 0) {
                        if (!arg0) {
                           return false;
                        }

                        var6 = 0;
                        if (var4 != 0) {
                           if (!arg1.method1165(this.field1202[var6], -23239)) {
                              return false;
                           }

                           ++var6;
                        }

                        while(true) {
                           while(var6 < this.field1202.length) {
                              if (!arg1.method1165(this.field1202[var6], -23239)) {
                                 return false;
                              }

                              ++var6;
                           }

                           if (var4 == 0) {
                              return true;
                           }

                           if (false) {
                              return false;
                           }

                           ++var6;
                        }
                     }

                     if (!arg0) {
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
            if (var4 != 0) {
               if (!arg2.method3889(this.field1201[var5], -123, class467.field7000)) {
                  return false;
               }

               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field1201.length) {
               if (!arg2.method3889(this.field1201[var5], -123, class467.field7000)) {
                  return false;
               }

               ++var5;
            }

            if (var4 == 0) {
               if (!arg0) {
                  return false;
               }

               var6 = 0;
               if (var4 != 0) {
                  if (!arg1.method1165(this.field1202[var6], -23239)) {
                     return false;
                  }

                  ++var6;
               }

               while(true) {
                  while(var6 < this.field1202.length) {
                     if (!arg1.method1165(this.field1202[var6], -23239)) {
                        return false;
                     }

                     ++var6;
                  }

                  if (var4 == 0) {
                     return true;
                  }

                  if (false) {
                     return false;
                  }

                  ++var6;
               }
            }

            if (!arg0) {
               return false;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1211[6] + arg0 + ',' + (arg1 != null ? field1211[2] : field1211[1]) + ',' + (arg2 != null ? field1211[2] : field1211[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "()V",
      line = 323
   )
   public class98() {
      try {
         this.field1202 = new int[0];
         this.field1201 = new int[0];
         this.field1208 = new class60(0);
         this.field1208.field4312 = 1;
         this.field1206 = new class60();
         this.field1206.field4312 = 1;
         this.field1203 = new class60();
         this.field1207 = new class302[]{this.field1206, this.field1203, this.field1208};
         this.field1203.field4312 = 1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1211[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(Ljj;)V",
      line = 339
   )
   public class98(class128 arg0) {
      int var2 = client.field4530;
      super();

      try {
         int var3;
         int var4;
         int var5;
         int[][] var6;
         byte var10000;
         label97: {
            var3 = arg0.method1104(255);
            var4 = 0;
            var5 = 0;
            this.field1207 = new class302[var3];
            var6 = new int[var3][];
            int var7 = 0;
            if (var2 != 0) {
               var10000 = 0;
            } else if (~var7 <= ~var3) {
               this.field1201 = new int[var4];
               var4 = 0;
               this.field1202 = new int[var5];
               var5 = 0;
               var10000 = 0;
               if (var2 == 0) {
                  break label97;
               }
            } else {
               var10000 = 0;
            }

            label96:
            while(true) {
               class302 var8 = class782.method5622(var10000, arg0);
               if (~var8.method1224(-1) <= -1) {
                  ++var4;
                  if (~var8.method243(-1) <= -1) {
                     ++var5;
                  }
               } else if (~var8.method243(-1) <= -1) {
                  ++var5;
               }

               int var9 = var8.field4303.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2 != 0) {
                  var6[var7][var10] = arg0.method1104(255);
                  ++var10;
               }

               while(true) {
                  while(~var9 < ~var10) {
                     var6[var7][var10] = arg0.method1104(255);
                     ++var10;
                  }

                  this.field1207[var7] = var8;
                  if (var2 == 0) {
                     ++var7;
                     if (~var7 <= ~var3) {
                        this.field1201 = new int[var4];
                        var4 = 0;
                        this.field1202 = new int[var5];
                        var5 = 0;
                        var10000 = 0;
                        if (var2 == 0) {
                           break label96;
                        }
                     } else {
                        var10000 = 0;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }

         int var11 = var10000;
         class302 var12;
         int var13;
         int var14;
         Object var17;
         class98 var20;
         if (var2 != 0) {
            var12 = this.field1207[var11];
            var13 = var12.field4303.length;
            var14 = 0;
            if (var2 != 0) {
               var12.field4303[var14] = this.field1207[var6[var11][var14]];
               ++var14;
            }
         } else {
            if (~var3 >= ~var11) {
               this.field1206 = this.field1207[arg0.method1104(255)];
               this.field1203 = this.field1207[arg0.method1104(255)];
               var20 = this;
               if (var2 == 0) {
                  this.field1208 = this.field1207[arg0.method1104(255)];
                  var17 = null;
                  return;
               }
            } else {
               var20 = this;
            }

            var12 = var20.field1207[var11];
            var13 = var12.field4303.length;
            var14 = 0;
            if (var2 != 0) {
               var12.field4303[var14] = this.field1207[var6[var11][var14]];
               ++var14;
            }
         }

         while(true) {
            while(var14 < var13) {
               var12.field4303[var14] = this.field1207[var6[var11][var14]];
               ++var14;
            }

            int var15 = var12.method1224(-1);
            int var16 = var12.method243(-1);
            if (var2 == 0) {
               if (~var15 < -1) {
                  this.field1201[var4++] = var15;
               }

               if (var16 > 0) {
                  this.field1202[var5++] = var16;
               }

               var6[var11] = null;
               ++var11;
               if (~var3 >= ~var11) {
                  this.field1206 = this.field1207[arg0.method1104(255)];
                  this.field1203 = this.field1207[arg0.method1104(255)];
                  var20 = this;
                  if (var2 == 0) {
                     this.field1208 = this.field1207[arg0.method1104(255)];
                     var17 = null;
                     return;
                  }
               } else {
                  var20 = this;
               }

               var12 = var20.field1207[var11];
               var13 = var12.field4303.length;
               var14 = 0;
               if (var2 != 0) {
                  var12.field4303[var14] = this.field1207[var6[var11][var14]];
                  ++var14;
               }
            } else {
               ++var14;
            }
         }
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field1211[3] + (arg0 != null ? field1211[2] : field1211[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V",
      line = 429
   )
   public static final void method862(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class333.field4773 = true;
      class177.field2183 = class261.field3550.method586() > 0;
      class377.field5713 = arg15;
      class681.field10228 = arg1 >> class459.field6950;
      class518.field7555 = arg3 >> class459.field6950;
      class222.field2856 = arg1;
      class354.field5362 = arg3;
      class554.field8207 = arg2;
      class598.field8800 = class681.field10228 - class488.field7212;
      if (class598.field8800 < 0) {
         class507.field7486 = -class598.field8800;
         class598.field8800 = 0;
      } else {
         class507.field7486 = 0;
      }

      class774.field11330 = class518.field7555 - class488.field7212;
      if (class774.field11330 < 0) {
         class617.field9013 = -class774.field11330;
         class774.field11330 = 0;
      } else {
         class617.field9013 = 0;
      }

      class662.field9587 = class681.field10228 + class488.field7212;
      if (class662.field9587 > class239.field3036) {
         class662.field9587 = class239.field3036;
      }

      class393.field5964 = class518.field7555 + class488.field7212;
      if (class393.field5964 > class220.field2796) {
         class393.field5964 = class220.field2796;
      }

      boolean[][] var19 = class569.field8487;
      boolean[][] var20 = class374.field5674;
      if (class377.field5713) {
         for(int var21 = 0; var21 < class488.field7212 + class488.field7212 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class488.field7212 + class488.field7212 + 2; ++var24) {
               if (var24 > 1) {
                  class190.field2372[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class681.field10228 - class488.field7212 + var21;
               int var26 = class518.field7555 - class488.field7212 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class239.field3036 && var26 < class220.field2796) {
                  int var27 = var25 << class459.field6950;
                  int var28 = var26 << class459.field6950;
                  int var29 = class147.field1843[class147.field1843.length - 1].method2235(var26, 2116912585, var25) - (1000 << class459.field6950 - 7);
                  int var30 = class650.field9484 != null ? class650.field9484[0].method2235(var26, 2116912585, var25) + class768.field11264 : class147.field1843[0].method2235(var26, 2116912585, var25) + class768.field11264;
                  var23 = arg16 >= 0 ? class261.field3550.method590(var27, var29, var28, var27, var30, var28, arg16) : class261.field3550.method612(var27, var29, var28, var27, var30, var28);
                  class374.field5674[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class374.field5674[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class190.field2372[var24 - 1] & class190.field2372[var24] & var22 & var23;
                  class569.field8487[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class190.field2372[class488.field7212 + class488.field7212] = var22;
            class190.field2372[class488.field7212 + class488.field7212 + 1] = var23;
         }

         if (arg16 >= 0) {
            class333.field4773 = false;
         } else {
            class290.field4071 = arg5;
            class534.field7796 = arg6;
            class327.field4637 = arg7;
            class112.field1363 = arg8;
            class3.field65 = arg9;
            class308.method2328(true, arg10, class261.field3550);
         }
      } else {
         if (class555.field8248 == null) {
            class555.field8248 = new boolean[class239.field3036 + class239.field3036 + 1][class239.field3036 + class220.field2796 + 1];
         }

         for(int var32 = 0; var32 < class555.field8248.length; ++var32) {
            for(int var42 = 0; var42 < class555.field8248[0].length; ++var42) {
               class555.field8248[var32][var42] = true;
            }
         }

         class374.field5674 = class555.field8248;
         class569.field8487 = class555.field8248;
         class598.field8800 = 0;
         class774.field11330 = 0;
         class662.field9587 = class239.field3036;
         class393.field5964 = class220.field2796;
         class333.field4773 = false;
      }

      class581.method4279(-1, class261.field3550);
      if (!class499.field7394.field10601) {
         class14 var33 = class499.field7394.field10598;

         for(class319 var34 = (class319)var33.method102(19230); var34 != null; var34 = (class319)var33.method95((byte)110)) {
            var34.method4413((byte)60);
            class326.method2462(-201, var34);
         }
      }

      if (class177.field2183) {
         for(int var35 = 0; var35 < class48.field579; ++var35) {
            class535.field7812[var35].method230(arg14, -44, arg0);
         }
      }

      if (class667.field9877) {
         class729.field10835 = class261.field3550.method576();
         class261.field3550.method618(class262.field3585);
         int var36 = (class262.field3585[2] - class262.field3585[0]) / class705.field10556;

         for(int var37 = 0; var37 < class705.field10556 - 1; ++var37) {
            class2.field60[var37] = (var37 + 1) * var36 + class68.field861[var37];
         }

         for(int var38 = 0; var38 < class102.field1244.length; ++var38) {
            class102.field1244[var38].method1730();
         }
      }

      if (class91.field1171 != null) {
         if (class667.field9877) {
            class226.method1709(0);
         }

         class284.method2172(true);
         class261.field3550.method558(-1, 1583160, 40, 127);
         class379.method2930(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class667.field9877) {
            class682.method4968();
         }

         class261.field3550.method648();
         class284.method2172(false);
      }

      class379.method2930(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class667.field9877) {
         for(int var39 = 0; var39 < class424.field6437; ++var39) {
            class18.field207[var39] = class243.field3107[var39];
         }

         class226.method1709(0);

         for(int var40 = 0; var40 < class102.field1244.length; ++var40) {
            class102.field1244[var40].method1730();
         }
      }

      if (class667.field9877) {
         class682.method4968();

         for(int var41 = 0; var41 < class424.field6437; ++var41) {
            class243.field3107[var41] = class18.field207[var41];
         }

         if (class259.field3510 == 2) {
            int var10002;
            if (class231.field2939[0] < class231.field2939[1]) {
               if (class68.field861[0] + class2.field60[0] > class262.field3585[0]) {
                  var10002 = class68.field861[0]++;
               }
            } else if (class231.field2939[0] > class231.field2939[1] && class68.field861[0] + class2.field60[0] < class262.field3585[2]) {
               var10002 = class68.field861[0]--;
            }
         }
      }

      if (!class377.field5713) {
         class569.field8487 = var19;
         class374.field5674 = var20;
      }

      class491.method3637();
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(Leaa;IZZIDLd;I)[I",
      line = 709
   )
   public final int[] method863(class526 arg0, int arg1, boolean arg2, boolean arg3, int arg4, double arg5, class160 arg6, int arg7) {
      int var10 = client.field4530;

      try {
         ++field1209;
         class556.field8260 = arg0;
         class704.field10551 = arg6;
         int var11 = 0;
         if (var10 != 0) {
            this.field1207[var11].method242(arg7, arg4, true);
            ++var11;
         }

         while(true) {
            while(~this.field1207.length < ~var11) {
               this.field1207[var11].method242(arg7, arg4, true);
               ++var11;
            }

            if (var10 == 0) {
               if (arg1 != -6580) {
                  this.field1208 = null;
               }

               int[] var12;
               int var13;
               byte var14;
               int var15;
               label220: {
                  class757.method5499(arg5, 255);
                  class92.method845(arg4, -1115237556, arg7);
                  var12 = new int[arg4 * arg7];
                  if (arg3) {
                     var13 = -1;
                     var14 = -1;
                     var15 = arg7 + -1;
                     if (var10 == 0) {
                        break label220;
                     }
                  }

                  var14 = 1;
                  var15 = 0;
                  var13 = arg7;
               }

               int var31;
               label196: {
                  int var16 = 0;
                  int var17 = 0;
                  int[][] var18;
                  int[] var19;
                  int[] var20;
                  int[] var21;
                  int[] var22;
                  if (var10 != 0) {
                     if (!this.field1206.field4313) {
                        var18 = this.field1206.method245((byte)-90, var17);
                        var19 = var18[2];
                        var20 = var18[1];
                        var21 = var18[0];
                        if (var10 != 0) {
                           var22 = this.field1206.method401(var17, arg1 ^ 6558);
                           var19 = var22;
                           var20 = var22;
                           var21 = var22;
                           if (arg2) {
                              var16 = var17;
                           }
                        } else if (arg2) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field1206.method401(var17, arg1 ^ 6558);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg2) {
                           var16 = var17;
                        }
                     }
                  } else if (arg4 <= var17) {
                     var31 = 0;
                     if (var10 == 0) {
                        break label196;
                     }

                     var22 = this.field1206.method401(var17, arg1 ^ 6558);
                     var19 = var22;
                     var20 = var22;
                     var21 = var22;
                     if (arg2) {
                        var16 = var17;
                     }
                  } else if (!this.field1206.field4313) {
                     var18 = this.field1206.method245((byte)-90, var17);
                     var19 = var18[2];
                     var20 = var18[1];
                     var21 = var18[0];
                     if (var10 != 0) {
                        var22 = this.field1206.method401(var17, arg1 ^ 6558);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg2) {
                           var16 = var17;
                        }
                     } else if (arg2) {
                        var16 = var17;
                     }
                  } else {
                     var22 = this.field1206.method401(var17, arg1 ^ 6558);
                     var19 = var22;
                     var20 = var22;
                     var21 = var22;
                     if (arg2) {
                        var16 = var17;
                     }
                  }

                  while(true) {
                     int var23 = var15;
                     if (var10 != 0 || var13 != var15) {
                        do {
                           int var24 = var21[var23] >> 4;
                           if (~var24 < -256) {
                              var24 = 255;
                           }

                           if (var24 < 0) {
                              var24 = 0;
                           }

                           int var25 = var20[var23] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (var25 < 0) {
                              var25 = 0;
                           }

                           int var26 = var19[var23] >> 4;
                           if (var26 > 255) {
                              var26 = 255;
                           }

                           int var27 = class638.field9286[var24];
                           int var28 = class638.field9286[var25];
                           if (~var26 > -1) {
                              var26 = 0;
                           }

                           int var29 = class638.field9286[var26];
                           int var30 = (var27 << 16) + (var28 << 8) - -var29;
                           if (var30 != 0) {
                              var30 |= -16777216;
                           }

                           var12[var16++] = var30;
                           if (arg2) {
                              var16 += arg7 + -1;
                           }

                           var23 += var14;
                        } while(var13 != var23);
                     }

                     ++var17;
                     if (arg4 <= var17) {
                        var31 = 0;
                        if (var10 == 0) {
                           break;
                        }

                        var22 = this.field1206.method401(var17, arg1 ^ 6558);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg2) {
                           var16 = var17;
                        }
                     } else if (!this.field1206.field4313) {
                        var18 = this.field1206.method245((byte)-90, var17);
                        var19 = var18[2];
                        var20 = var18[1];
                        var21 = var18[0];
                        if (var10 != 0) {
                           var22 = this.field1206.method401(var17, arg1 ^ 6558);
                           var19 = var22;
                           var20 = var22;
                           var21 = var22;
                           if (arg2) {
                              var16 = var17;
                           }
                        } else if (arg2) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field1206.method401(var17, arg1 ^ 6558);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg2) {
                           var16 = var17;
                        }
                     }
                  }
               }

               if (var10 != 0) {
                  this.field1207[var31].method241(false);
                  ++var31;
               }

               while(true) {
                  while(var31 < this.field1207.length) {
                     this.field1207[var31].method241(false);
                     ++var31;
                  }

                  if (var10 == 0) {
                     return var12;
                  }

                  ++var31;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var33) {
         throw class670.method4877(var33, field1211[5] + (arg0 != null ? field1211[2] : field1211[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1211[2] : field1211[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method864(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method865(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
