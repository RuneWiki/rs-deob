import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class561 {
   @OriginalMember(
      owner = "client!ur",
      name = "k",
      descriptor = "Z"
   )
   public boolean field8157;
   @OriginalMember(
      owner = "client!ur",
      name = "o",
      descriptor = "I"
   )
   private int field8163;
   @OriginalMember(
      owner = "client!ur",
      name = "g",
      descriptor = "I"
   )
   private int field8162;
   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "Lcs;"
   )
   private class357 field8161;
   @OriginalMember(
      owner = "client!ur",
      name = "j",
      descriptor = "Lvda;"
   )
   private class191 field8164;
   @OriginalMember(
      owner = "client!ur",
      name = "h",
      descriptor = "I"
   )
   private int field8167;
   @OriginalMember(
      owner = "client!ur",
      name = "p",
      descriptor = "Lnfa;"
   )
   private class706 field8160;
   @OriginalMember(
      owner = "client!ur",
      name = "e",
      descriptor = "I"
   )
   public int field8154;
   @OriginalMember(
      owner = "client!ur",
      name = "d",
      descriptor = "I"
   )
   private int field8166;
   @OriginalMember(
      owner = "client!ur",
      name = "i",
      descriptor = "I"
   )
   private int field8169;
   @OriginalMember(
      owner = "client!ur",
      name = "c",
      descriptor = "Lrn;"
   )
   private class280 field8165;
   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8170 = new String[]{method4191(method4190("\u0003v\u000b\n\u001e")), method4191(method4190("\u0018qI'")), method4191(method4190("\r*\u000beK")), method4191(method4190("\u0003v\u000b\b\u001e")), method4191(method4190("\u0003v\u000bw_\u0018mQu\u001e")), method4191(method4190("\u0003v\u000b\t\u001e")), method4191(method4190("\u0003v\u000b\u000f\u001e")), method4191(method4190("\u0003v\u000b\u000e\u001e"))};
   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "I"
   )
   public static int field8155;
   @OriginalMember(
      owner = "client!ur",
      name = "f",
      descriptor = "I"
   )
   public static int field8156;
   @OriginalMember(
      owner = "client!ur",
      name = "l",
      descriptor = "I"
   )
   public static int field8158;
   @OriginalMember(
      owner = "client!ur",
      name = "n",
      descriptor = "I"
   )
   public static int field8159;
   @OriginalMember(
      owner = "client!ur",
      name = "m",
      descriptor = "I"
   )
   public static int field8168;

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(BLuda;)Lli;",
      line = 4
   )
   public static final class449 method4185(byte arg0, class473 arg1) {
      try {
         if (arg0 != 10) {
            return null;
         } else {
            ++field8155;
            class678 var2 = class405.method3115(arg0 ^ 92)[arg1.method3564((byte)-113)];
            class112 var3 = class213.method1811(false)[arg1.method3564((byte)-104)];
            int var4 = arg1.method3538(-128);
            int var5 = arg1.method3538(-128);
            int var6 = arg1.method3565(true);
            int var7 = arg1.method3565(true);
            int var8 = arg1.method3538(arg0 ^ -118);
            int var9 = arg1.method3567(31871);
            int var10 = arg1.method3567(31871);
            return new class449(var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field8170[3] + arg0 + ',' + (arg1 != null ? field8170[2] : field8170[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(I)V",
      line = 33
   )
   private final void method4186(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8159;
         if (this.field8157) {
            this.field8157 = false;
            byte[] var3 = this.field8164.field2882;
            int var4 = 0;
            int var5 = this.field8164.field2877;
            int var6 = this.field8164.field2877 * this.field8162 + this.field8167;
            int var7 = arg0;
            int var8;
            int var9;
            int var10;
            byte[] var11;
            int var12;
            int var13;
            int var14;
            int[] var15;
            int var16;
            int var17;
            int var18;
            if (var2) {
               var4 = (var4 << 8) + -var4;
               var8 = -128;
               if (var2) {
                  if (var3[var6++] != 0) {
                     ++var4;
                  }

                  ++var8;
               }
            } else {
               if (arg0 >= 0) {
                  if (!var2) {
                     if (this.field8160 != null && ~this.field8163 == ~var4) {
                        this.field8157 = false;
                        return;
                     }

                     this.field8163 = var4;
                     var9 = 0;
                     var10 = this.field8167 - -(this.field8162 * var5);
                     if (this.field8161.method1190(class776.field11354, -77, class209.field3106)) {
                        if (class217.field3279 == null) {
                           class217.field3279 = new byte[16384];
                        }

                        var11 = class217.field3279;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field8160 == null) {
                              this.field8160 = this.field8161.method2790(class217.field3279, arg0 + 172, false, 128, class776.field11354, 128);
                              this.field8160.method884(false, arg0 ^ 58, false);
                              return;
                           }

                           this.field8160.method885(128, class776.field11354, 128, 0, 128, (byte)18, class217.field3279, 0, 0);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var10] == 0) {
                                 var14 = 0;
                                 if (~var3[var10 - 1] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var10 + 1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var10] != 0) {
                                    ++var14;
                                    if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var5 + var10] != -1) {
                                    ++var14;
                                 }

                                 var11[var9++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var11[var9++] = 68;
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var11[var9++] = 68;
                                 ++var10;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (var3[var10] == 0) {
                                    var14 = 0;
                                    if (~var3[var10 - 1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var10 + 1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var14;
                                       if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var11[var9++] = 68;
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var9++] = 68;
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              var10 += this.field8164.field2877 - 128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var11[var9++] = 68;
                              ++var10;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field8160 == null) {
                           this.field8160 = this.field8161.method2790(class217.field3279, arg0 + 172, false, 128, class776.field11354, 128);
                           this.field8160.method884(false, arg0 ^ 58, false);
                           return;
                        }

                        this.field8160.method885(128, class776.field11354, 128, 0, 128, (byte)18, class217.field3279, 0, 0);
                        return;
                     }

                     if (class359.field5372 == null) {
                        class359.field5372 = new int[16384];
                     }

                     var15 = class359.field5372;
                     var16 = -128;
                     if (!var2 && var16 >= 0) {
                        if (this.field8160 != null) {
                           this.field8160.method887(0, class359.field5372, 128, 0, 128, 0, false, 128);
                           return;
                        }

                        this.field8160 = this.field8161.method2766(false, 128, 128, (byte)104, class359.field5372);
                        this.field8160.method884(false, -114, false);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (var3[var10] != 0) {
                              var15[var9++] = 1140850688;
                              if (var2) {
                                 var18 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[-var5 + var10] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }

                                 var15[var9++] = var18 * 17 << 24;
                                 ++var10;
                                 ++var17;
                              } else {
                                 ++var10;
                                 ++var17;
                              }
                           } else {
                              var18 = 0;
                              if (~var3[var10 + -1] != -1) {
                                 ++var18;
                              }

                              if (var3[var10 + 1] != 0) {
                                 ++var18;
                              }

                              if (~var3[-var5 + var10] != -1) {
                                 ++var18;
                              }

                              if (var3[var10 - -var5] != 0) {
                                 ++var18;
                              }

                              var15[var9++] = var18 * 17 << 24;
                              ++var10;
                              ++var17;
                           }
                        }

                        while(true) {
                           while(var17 < 0) {
                              if (var3[var10] != 0) {
                                 var15[var9++] = 1140850688;
                                 if (var2) {
                                    var18 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[-var5 + var10] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }

                                    var15[var9++] = var18 * 17 << 24;
                                    ++var10;
                                    ++var17;
                                 } else {
                                    ++var10;
                                    ++var17;
                                 }
                              } else {
                                 var18 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[-var5 + var10] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }

                                 var15[var9++] = var18 * 17 << 24;
                                 ++var10;
                                 ++var17;
                              }
                           }

                           var10 += this.field8164.field2877 + -128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var18 = 0;
                           if (~var3[var10 + -1] != -1) {
                              ++var18;
                           }

                           if (var3[var10 + 1] != 0) {
                              ++var18;
                           }

                           if (~var3[-var5 + var10] != -1) {
                              ++var18;
                           }

                           if (var3[var10 - -var5] != 0) {
                              ++var18;
                           }

                           var15[var9++] = var18 * 17 << 24;
                           ++var10;
                           ++var17;
                        }
                     } while(var16 < 0);

                     if (this.field8160 != null) {
                        this.field8160.method887(0, class359.field5372, 128, 0, 128, 0, false, 128);
                        return;
                     }

                     this.field8160 = this.field8161.method2766(false, 128, 128, (byte)104, class359.field5372);
                     this.field8160.method884(false, -114, false);
                     return;
                  }
               } else {
                  var4 = (var4 << 8) + -var4;
               }

               var8 = -128;
               if (var2) {
                  if (var3[var6++] != 0) {
                     ++var4;
                  }

                  ++var8;
               }
            }

            while(true) {
               while(var8 < 0) {
                  if (var3[var6++] != 0) {
                     ++var4;
                  }

                  ++var8;
               }

               var6 += var5 + -128;
               if (!var2) {
                  ++var7;
                  if (var7 >= 0) {
                     if (!var2) {
                        if (this.field8160 != null && ~this.field8163 == ~var4) {
                           this.field8157 = false;
                           return;
                        }

                        this.field8163 = var4;
                        var9 = 0;
                        var10 = this.field8167 - -(this.field8162 * var5);
                        if (this.field8161.method1190(class776.field11354, -77, class209.field3106)) {
                           if (class217.field3279 == null) {
                              class217.field3279 = new byte[16384];
                           }

                           var11 = class217.field3279;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field8160 == null) {
                                 this.field8160 = this.field8161.method2790(class217.field3279, arg0 + 172, false, 128, class776.field11354, 128);
                                 this.field8160.method884(false, arg0 ^ 58, false);
                                 return;
                              }

                              this.field8160.method885(128, class776.field11354, 128, 0, 128, (byte)18, class217.field3279, 0, 0);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (var3[var10] == 0) {
                                    var14 = 0;
                                    if (~var3[var10 - 1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var10 + 1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var14;
                                       if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var11[var9++] = 68;
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var9++] = 68;
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(~var13 > -1) {
                                    if (var3[var10] == 0) {
                                       var14 = 0;
                                       if (~var3[var10 - 1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var10 + 1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var10] != 0) {
                                          ++var14;
                                          if (~var3[var5 + var10] != -1) {
                                             ++var14;
                                          }
                                       } else if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }

                                       var11[var9++] = (byte)(var14 * 17);
                                       if (var2) {
                                          var11[var9++] = 68;
                                          ++var10;
                                          ++var13;
                                       } else {
                                          ++var10;
                                          ++var13;
                                       }
                                    } else {
                                       var11[var9++] = 68;
                                       ++var10;
                                       ++var13;
                                    }
                                 }

                                 var10 += this.field8164.field2877 - 128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var11[var9++] = 68;
                                 ++var10;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field8160 == null) {
                              this.field8160 = this.field8161.method2790(class217.field3279, arg0 + 172, false, 128, class776.field11354, 128);
                              this.field8160.method884(false, arg0 ^ 58, false);
                              return;
                           }

                           this.field8160.method885(128, class776.field11354, 128, 0, 128, (byte)18, class217.field3279, 0, 0);
                           return;
                        }

                        if (class359.field5372 == null) {
                           class359.field5372 = new int[16384];
                        }

                        var15 = class359.field5372;
                        var16 = -128;
                        if (!var2 && var16 >= 0) {
                           if (this.field8160 != null) {
                              this.field8160.method887(0, class359.field5372, 128, 0, 128, 0, false, 128);
                              return;
                           }

                           this.field8160 = this.field8161.method2766(false, 128, 128, (byte)104, class359.field5372);
                           this.field8160.method884(false, -114, false);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (var3[var10] != 0) {
                                 var15[var9++] = 1140850688;
                                 if (var2) {
                                    var18 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[-var5 + var10] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }

                                    var15[var9++] = var18 * 17 << 24;
                                    ++var10;
                                    ++var17;
                                 } else {
                                    ++var10;
                                    ++var17;
                                 }
                              } else {
                                 var18 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[-var5 + var10] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }

                                 var15[var9++] = var18 * 17 << 24;
                                 ++var10;
                                 ++var17;
                              }
                           }

                           while(true) {
                              while(var17 < 0) {
                                 if (var3[var10] != 0) {
                                    var15[var9++] = 1140850688;
                                    if (var2) {
                                       var18 = 0;
                                       if (~var3[var10 + -1] != -1) {
                                          ++var18;
                                       }

                                       if (var3[var10 + 1] != 0) {
                                          ++var18;
                                       }

                                       if (~var3[-var5 + var10] != -1) {
                                          ++var18;
                                       }

                                       if (var3[var10 - -var5] != 0) {
                                          ++var18;
                                       }

                                       var15[var9++] = var18 * 17 << 24;
                                       ++var10;
                                       ++var17;
                                    } else {
                                       ++var10;
                                       ++var17;
                                    }
                                 } else {
                                    var18 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[-var5 + var10] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }

                                    var15[var9++] = var18 * 17 << 24;
                                    ++var10;
                                    ++var17;
                                 }
                              }

                              var10 += this.field8164.field2877 + -128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var18 = 0;
                              if (~var3[var10 + -1] != -1) {
                                 ++var18;
                              }

                              if (var3[var10 + 1] != 0) {
                                 ++var18;
                              }

                              if (~var3[-var5 + var10] != -1) {
                                 ++var18;
                              }

                              if (var3[var10 - -var5] != 0) {
                                 ++var18;
                              }

                              var15[var9++] = var18 * 17 << 24;
                              ++var10;
                              ++var17;
                           }
                        } while(var16 < 0);

                        if (this.field8160 != null) {
                           this.field8160.method887(0, class359.field5372, 128, 0, 128, 0, false, 128);
                           return;
                        }

                        this.field8160 = this.field8161.method2766(false, 128, 128, (byte)104, class359.field5372);
                        this.field8160.method884(false, -114, false);
                        return;
                     }
                  } else {
                     var4 = (var4 << 8) + -var4;
                  }

                  var8 = -128;
                  if (var2) {
                     if (var3[var6++] != 0) {
                        ++var4;
                     }

                     ++var8;
                  }
               } else {
                  ++var8;
               }
            }
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field8170[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(Lrn;II)V",
      line = 201
   )
   public final void method4187(class280 arg0, int arg1, int arg2) {
      try {
         ++field8156;
         if (arg2 <= -42) {
            if (arg1 > 0) {
               this.method4186(-128);
               this.field8161.method2806(false, this.field8160);
               this.field8161.method1175(this.field8166, 0, arg0, 0, arg1, class421.field6132, this.field8169 + 1 + -this.field8166);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8170[5] + (arg0 != null ? field8170[2] : field8170[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "b",
      descriptor = "(I)V",
      line = 224
   )
   public final void method4188(int arg0) {
      try {
         this.method4187(this.field8165, this.field8154, arg0 ^ -65421);
         if (arg0 != 65535) {
            this.method4186(100);
         }

         ++field8158;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8170[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "<init>",
      descriptor = "(Lcs;Lvda;Lmaa;IIIII)V",
      line = 268
   )
   public class561(class357 param1, class191 param2, class494 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ur",
      name = "a",
      descriptor = "(III)Z",
      line = 246
   )
   public static final boolean method4189(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -32018) {
            method4189(-79, -13, 57);
         }

         ++field8168;
         if (~arg0 <= -1 && ~arg2 <= -1 && ~arg0 > ~class608.field8732[1].length && class608.field8732[1][arg0].length > arg2) {
            return ~(2 & class608.field8732[1][arg0][arg2]) != -1;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8170[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4190(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ur",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4191(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
