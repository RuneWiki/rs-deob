import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class601 extends class302 {
   @OriginalMember(
      owner = "client!fia",
      name = "R",
      descriptor = "[S"
   )
   private short[] field8817 = new short[512];
   @OriginalMember(
      owner = "client!fia",
      name = "T",
      descriptor = "I"
   )
   private int field8822 = 5;
   @OriginalMember(
      owner = "client!fia",
      name = "S",
      descriptor = "I"
   )
   private int field8816 = 0;
   @OriginalMember(
      owner = "client!fia",
      name = "O",
      descriptor = "I"
   )
   private int field8826 = 2;
   @OriginalMember(
      owner = "client!fia",
      name = "M",
      descriptor = "I"
   )
   private int field8824 = 1;
   @OriginalMember(
      owner = "client!fia",
      name = "P",
      descriptor = "[B"
   )
   private byte[] field8820 = new byte[512];
   @OriginalMember(
      owner = "client!fia",
      name = "J",
      descriptor = "I"
   )
   private int field8827 = 2048;
   @OriginalMember(
      owner = "client!fia",
      name = "W",
      descriptor = "I"
   )
   private int field8832 = 5;
   @OriginalMember(
      owner = "client!fia",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8833 = new String[]{method4398(method4397("\t^O\u0007&G")), method4398(method4397("\t^O\u0007$G")), method4398(method4397("\t^O\u0007\"G")), method4398(method4397("\u0001BBE")), method4398(method4397("\u0014\u0019\u0000\u0007\u001c")), method4398(method4397("\t^O\u00073G")), method4398(method4397("\t^O\u0007 G")), method4398(method4397("\t^O\u0007'G")), method4398(method4397("\t^O\u0007%G")), method4398(method4397("\t^O\u00070G"))};
   @OriginalMember(
      owner = "client!fia",
      name = "N",
      descriptor = "I"
   )
   public static int field8818;
   @OriginalMember(
      owner = "client!fia",
      name = "U",
      descriptor = "I"
   )
   public static int field8819;
   @OriginalMember(
      owner = "client!fia",
      name = "Q",
      descriptor = "I"
   )
   public static int field8821;
   @OriginalMember(
      owner = "client!fia",
      name = "I",
      descriptor = "I"
   )
   public static int field8823;
   @OriginalMember(
      owner = "client!fia",
      name = "H",
      descriptor = "I"
   )
   public static int field8825;
   @OriginalMember(
      owner = "client!fia",
      name = "X",
      descriptor = "I"
   )
   public static int field8829;
   @OriginalMember(
      owner = "client!fia",
      name = "V",
      descriptor = "I"
   )
   public static int field8830;
   @OriginalMember(
      owner = "client!fia",
      name = "K",
      descriptor = "I"
   )
   public static int field8831;
   @OriginalMember(
      owner = "client!fia",
      name = "L",
      descriptor = "Lti;"
   )
   public static class464 field8828;

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(ZJBI)Ljava/lang/String;"
   )
   public static final String method4392(boolean arg0, long arg1, byte arg2, int arg3) {
      try {
         Calendar var5;
         label22: {
            ++field8823;
            if (arg0) {
               class237.method1769(-1, arg1);
               var5 = class447.field6795;
               if (client.field4530 == 0) {
                  break label22;
               }
            }

            class500.method3735(arg1, (byte)-92);
            var5 = class447.field6798;
         }

         int var6 = var5.get(5);
         if (arg2 != -103) {
            field8828 = null;
         }

         int var7 = var5.get(2);
         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return ~arg3 == -4 ? class18.method128(arg3, (byte)3, arg0, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class783.field11419[arg3][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field8833[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4393(int arg0) {
      try {
         field8828 = null;
         if (arg0 != -377) {
            method4395(-15, (char)65443);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8833[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         if (arg1 != 0) {
            this.field8826 = 51;
         }

         ++field8818;
         if (~arg0 != -1) {
            if (arg0 == 1) {
               this.field8816 = arg2.method1104(arg1 + 255);
               return;
            }

            if (arg0 == 2) {
               this.field8827 = arg2.method1038((byte)-118);
               return;
            }

            if (arg0 == 3) {
               this.field8826 = arg2.method1104(255);
               return;
            }

            if (~arg0 == -5) {
               this.field8824 = arg2.method1104(255);
               return;
            }

            if (arg0 == 5) {
               this.field8822 = arg2.method1104(255);
               return;
            }

            if (arg0 != 6) {
               return;
            }

            if (client.field4530 == 0) {
               this.field8832 = arg2.method1104(255);
               return;
            }
         }

         this.field8822 = this.field8832 = arg2.method1104(255);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8833[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8833[4] : field8833[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4394(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field8819;
         Random var3 = new Random((long)this.field8816);
         this.field8817 = new short[512];
         if (~this.field8827 < -1) {
            int var4 = 0;
            if (var2 != 0 || ~var4 > -513) {
               do {
                  this.field8817[var4] = (short)class413.method3157(var3, this.field8827, (byte)54);
                  ++var4;
               } while(~var4 > -513);
            }
         }

         if (arg0 != -96) {
            this.field8827 = -84;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8833[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         ++field8829;
         this.field8820 = class200.method1537(-106, this.field8816);
         this.method4394((byte)-96);
         if (arg0 > -87) {
            this.method4394((byte)55);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8833[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8830;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 > -37) {
            return null;
         } else {
            if (super.field4298.field6356) {
               int var5 = class23.field241[arg0] * this.field8832 + 2048;
               int var6 = var5 >> 12;
               int var7 = var6 - -1;
               int var8 = 0;
               if (var3 != 0 || class344.field5238 > var8) {
                  do {
                     int var10000;
                     short var10001;
                     int var21;
                     label312: {
                        class148.field1855 = Integer.MAX_VALUE;
                        class2.field58 = Integer.MAX_VALUE;
                        class306.field4361 = Integer.MAX_VALUE;
                        class251.field3366 = Integer.MAX_VALUE;
                        int var9 = class757.field11167[var8] * this.field8822 + 2048;
                        int var10 = var9 >> 12;
                        int var11 = var10 - -1;
                        int var12 = var6 + -1;
                        if (var3 != 0) {
                           var10000 = this.field8820[255 & (this.field8832 > var12 ? var12 : -this.field8832 + var12)];
                           var10001 = 255;
                        } else if (var12 > var7) {
                           var21 = this.field8826;
                           var10000 = ~var21;
                           var10001 = -1;
                           if (var3 == 0) {
                              break label312;
                           }
                        } else {
                           var10000 = this.field8820[255 & (this.field8832 > var12 ? var12 : -this.field8832 + var12)];
                           var10001 = 255;
                        }

                        while(true) {
                           label309: {
                              int var13 = var10000 & var10001;
                              int var14 = var10 + -1;
                              byte[] var10002;
                              short var10003;
                              int var10004;
                              byte var25;
                              short var26;
                              if (var3 != 0) {
                                 var25 = 2;
                                 var26 = 255;
                                 var10002 = this.field8820;
                                 var10003 = 255;
                                 var10004 = var14 >= this.field8822 ? -this.field8822 + var14 : var14;
                              } else {
                                 if (var14 > var11) {
                                    break label309;
                                 }

                                 var25 = 2;
                                 var26 = 255;
                                 var10002 = this.field8820;
                                 var10003 = 255;
                                 var10004 = var14 >= this.field8822 ? -this.field8822 + var14 : var14;
                              }

                              while(true) {
                                 int var19;
                                 label301: {
                                    int var16;
                                    int var17;
                                    label300: {
                                       label350: {
                                          label351: {
                                             int var15 = var25 * (var26 & var10002[var10003 & var10004 + var13]);
                                             var10000 = -(var14 << 12);
                                             int var24 = var15 + 1;
                                             var16 = var10000 - (this.field8817[var15] - var9);
                                             var17 = -this.field8817[var24] + var5 + -(var12 << 12);
                                             int var18 = this.field8824;
                                             if (~var18 != -2) {
                                                if (~var18 == -4) {
                                                   var17 = var17 < 0 ? -var17 : var17;
                                                   var16 = var16 >= 0 ? var16 : -var16;
                                                   var10000 = ~var17 <= ~var16 ? var17 : var16;
                                                   break label351;
                                                }

                                                if (var18 == 4) {
                                                   var16 = (int)(4096.0D * Math.sqrt((double)((float)(~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                                   var10000 = ~var17 <= -1 ? var17 : -var17;
                                                   break label350;
                                                }

                                                if (~var18 == -6) {
                                                   break label300;
                                                }

                                                if (var18 != 2) {
                                                   var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                                   break label301;
                                                }

                                                if (var3 == 0) {
                                                   var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                                   if (var3 != 0) {
                                                      var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                                   }
                                                   break label301;
                                                }
                                             }

                                             var19 = var16 * var16 + var17 * var17 >> 12;
                                             if (var3 == 0) {
                                                break label301;
                                             }

                                             var17 = var17 < 0 ? -var17 : var17;
                                             var16 = var16 >= 0 ? var16 : -var16;
                                             var10000 = ~var17 <= ~var16 ? var17 : var16;
                                          }

                                          var19 = var10000;
                                          if (var3 == 0) {
                                             break label301;
                                          }

                                          var16 = (int)(4096.0D * Math.sqrt((double)((float)(~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                          var10000 = ~var17 <= -1 ? var17 : -var17;
                                       }

                                       var17 = (int)(Math.sqrt((double)((float)var10000 / 4096.0F)) * 4096.0D);
                                       int var20 = var16 + var17;
                                       var19 = var20 * var20 >> 12;
                                       if (var3 == 0) {
                                          break label301;
                                       }
                                    }

                                    var16 *= var16;
                                    var17 *= var17;
                                    var19 = (int)(4096.0D * Math.sqrt(Math.sqrt((double)((float)(var16 + var17) / 1.6777216E7F))));
                                    if (var3 != 0) {
                                       var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                       if (var3 != 0) {
                                          var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                       }
                                    }
                                 }

                                 label305: {
                                    if (class251.field3366 > var19) {
                                       class148.field1855 = class2.field58;
                                       class2.field58 = class306.field4361;
                                       class306.field4361 = class251.field3366;
                                       class251.field3366 = var19;
                                       if (var3 == 0) {
                                          ++var14;
                                          break label305;
                                       }
                                    }

                                    if (class306.field4361 <= var19) {
                                       if (~class2.field58 < ~var19) {
                                          class148.field1855 = class2.field58;
                                          class2.field58 = var19;
                                          if (var3 != 0) {
                                             if (var19 < class148.field1855) {
                                                class148.field1855 = var19;
                                                if (var3 != 0) {
                                                   class148.field1855 = class2.field58;
                                                   class2.field58 = class306.field4361;
                                                   class306.field4361 = var19;
                                                   ++var14;
                                                } else {
                                                   ++var14;
                                                }
                                             } else {
                                                ++var14;
                                             }
                                          } else {
                                             ++var14;
                                          }
                                       } else if (var19 < class148.field1855) {
                                          class148.field1855 = var19;
                                          if (var3 != 0) {
                                             class148.field1855 = class2.field58;
                                             class2.field58 = class306.field4361;
                                             class306.field4361 = var19;
                                             ++var14;
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else {
                                       class148.field1855 = class2.field58;
                                       class2.field58 = class306.field4361;
                                       class306.field4361 = var19;
                                       ++var14;
                                    }
                                 }

                                 if (var14 > var11) {
                                    break;
                                 }

                                 var25 = 2;
                                 var26 = 255;
                                 var10002 = this.field8820;
                                 var10003 = 255;
                                 var10004 = var14 >= this.field8822 ? -this.field8822 + var14 : var14;
                              }
                           }

                           ++var12;
                           if (var12 > var7) {
                              var21 = this.field8826;
                              var10000 = ~var21;
                              var10001 = -1;
                              if (var3 == 0) {
                                 break;
                              }
                           } else {
                              var10000 = this.field8820[255 & (this.field8832 > var12 ? var12 : -this.field8832 + var12)];
                              var10001 = 255;
                           }
                        }
                     }

                     label336: {
                        label335: {
                           label334: {
                              label333: {
                                 label332: {
                                    if (var10000 != var10001) {
                                       if (var21 == 1) {
                                          break label332;
                                       }

                                       if (var21 == 3) {
                                          break label333;
                                       }

                                       if (~var21 == -5) {
                                          break label334;
                                       }

                                       if (var21 != 2) {
                                          break label336;
                                       }

                                       if (var3 == 0) {
                                          break label335;
                                       }
                                    }

                                    var4[var8] = class251.field3366;
                                    if (var3 == 0) {
                                       break label336;
                                    }
                                 }

                                 var4[var8] = class306.field4361;
                                 if (var3 == 0) {
                                    break label336;
                                 }
                              }

                              var4[var8] = class2.field58;
                              if (var3 == 0) {
                                 break label336;
                              }
                           }

                           var4[var8] = class148.field1855;
                           if (var3 == 0) {
                              break label336;
                           }
                        }

                        var4[var8] = -class251.field3366 + class306.field4361;
                     }

                     ++var8;
                  } while(class344.field5238 > var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field8833[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "<init>",
      descriptor = "()V"
   )
   public class601() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fia",
      name = "b",
      descriptor = "(IC)B"
   )
   public static final byte method4395(int arg0, char arg1) {
      int var2 = client.field4530;

      try {
         ++field8825;
         if (arg0 >= -33) {
            field8821 = 28;
         }

         byte var3;
         if ((arg1 <= 0 || arg1 >= 128) && (~arg1 > -161 || ~arg1 < -256)) {
            if (~arg1 == -8365) {
               var3 = -128;
               if (var2 == 0) {
                  return var3;
               }
            }

            if (~arg1 == -8219) {
               var3 = -126;
               if (var2 == 0) {
                  return var3;
               }
            }

            if (arg1 == 402) {
               var3 = -125;
               if (var2 == 0) {
                  return var3;
               }
            }

            if (arg1 != 8222) {
               if (arg1 == 8230) {
                  var3 = -123;
                  if (var2 == 0) {
                     return var3;
                  }
               }

               if (~arg1 != -8225) {
                  if (~arg1 == -8226) {
                     var3 = -121;
                     if (var2 == 0) {
                        return var3;
                     }
                  }

                  if (arg1 == 710) {
                     var3 = -120;
                     if (var2 == 0) {
                        return var3;
                     }
                  }

                  if (arg1 == 8240) {
                     var3 = -119;
                     if (var2 == 0) {
                        return var3;
                     }
                  }

                  if (arg1 != 352) {
                     if (arg1 != 8249) {
                        if (arg1 != 338) {
                           if (arg1 == 381) {
                              var3 = -114;
                              if (var2 == 0) {
                                 return var3;
                              }
                           }

                           if (~arg1 != -8217) {
                              if (arg1 == 8217) {
                                 var3 = -110;
                                 if (var2 == 0) {
                                    return var3;
                                 }
                              }

                              if (arg1 != 8220) {
                                 if (~arg1 != -8222) {
                                    if (~arg1 != -8227) {
                                       if (arg1 != 8211) {
                                          if (arg1 == 8212) {
                                             var3 = -105;
                                             if (var2 == 0) {
                                                return var3;
                                             }
                                          }

                                          if (arg1 != 732) {
                                             if (~arg1 == -8483) {
                                                var3 = -103;
                                                if (var2 == 0) {
                                                   return var3;
                                                }
                                             }

                                             if (arg1 == 353) {
                                                var3 = -102;
                                                if (var2 == 0) {
                                                   return var3;
                                                }
                                             }

                                             if (arg1 == 8250) {
                                                var3 = -101;
                                                if (var2 == 0) {
                                                   return var3;
                                                }
                                             }

                                             if (~arg1 != -340) {
                                                if (arg1 != 382) {
                                                   if (~arg1 == -377) {
                                                      var3 = -97;
                                                      if (var2 == 0) {
                                                         return var3;
                                                      }
                                                   }

                                                   var3 = 63;
                                                   if (var2 == 0) {
                                                      return var3;
                                                   }
                                                }

                                                var3 = -98;
                                                if (var2 == 0) {
                                                   return var3;
                                                }
                                             }

                                             var3 = -100;
                                             if (var2 == 0) {
                                                return var3;
                                             }
                                          }

                                          var3 = -104;
                                          if (var2 == 0) {
                                             return var3;
                                          }
                                       }

                                       var3 = -106;
                                       if (var2 == 0) {
                                          return var3;
                                       }
                                    }

                                    var3 = -107;
                                    if (var2 == 0) {
                                       return var3;
                                    }
                                 }

                                 var3 = -108;
                                 if (var2 == 0) {
                                    return var3;
                                 }
                              }

                              var3 = -109;
                              if (var2 == 0) {
                                 return var3;
                              }
                           }

                           var3 = -111;
                           if (var2 == 0) {
                              return var3;
                           }
                        }

                        var3 = -116;
                        if (var2 == 0) {
                           return var3;
                        }
                     }

                     var3 = -117;
                     if (var2 == 0) {
                        return var3;
                     }
                  }

                  var3 = -118;
                  if (var2 == 0) {
                     return var3;
                  }
               }

               var3 = -122;
               if (var2 == 0) {
                  return var3;
               }
            }

            var3 = -124;
            if (var2 == 0) {
               return var3;
            }
         }

         var3 = (byte)arg1;
         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8833[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(B[B[[B[II[I[[BI)I"
   )
   public static final int method4396(byte arg0, byte[] arg1, byte[][] arg2, int[] arg3, int arg4, int[] arg5, byte[][] arg6, int arg7) {
      int var8 = client.field4530;

      try {
         ++field8831;
         int var9 = arg5[arg7];
         if (arg0 != -106) {
            method4396((byte)37, (byte[])null, (byte[][])null, (int[])null, 74, (int[])null, (byte[][])null, 2);
         }

         int var10 = arg3[arg7] + var9;
         int var11 = arg5[arg4];
         int var12 = var11 - -arg3[arg4];
         int var13 = var9;
         if (~var11 < ~var9) {
            var13 = var11;
         }

         int var14 = var10;
         if (var10 > var12) {
            var14 = var12;
         }

         int var15 = arg1[arg7] & 255;
         if (var15 > (255 & arg1[arg4])) {
            var15 = 255 & arg1[arg4];
         }

         byte[] var16 = arg2[arg7];
         byte[] var17 = arg6[arg4];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8 != 0) {
            var21 = var16[var18++] + var17[var19++];
            if (var15 > var21) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(var20 < var14) {
               var21 = var16[var18++] + var17[var19++];
               if (var15 > var21) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (var8 == 0) {
               return var24;
            }

            var21 = var24;
            if (var15 > var21) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field8833[5] + arg0 + ',' + (arg1 != null ? field8833[4] : field8833[3]) + ',' + (arg2 != null ? field8833[4] : field8833[3]) + ',' + (arg3 != null ? field8833[4] : field8833[3]) + ',' + arg4 + ',' + (arg5 != null ? field8833[4] : field8833[3]) + ',' + (arg6 != null ? field8833[4] : field8833[3]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4397(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4398(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
