import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class121 {
   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "I"
   )
   private int field1512;
   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "Z"
   )
   public boolean field1523;
   @OriginalMember(
      owner = "client!jr",
      name = "j",
      descriptor = "I"
   )
   private int field1529;
   @OriginalMember(
      owner = "client!jr",
      name = "g",
      descriptor = "I"
   )
   private int field1526;
   @OriginalMember(
      owner = "client!jr",
      name = "h",
      descriptor = "Lce;"
   )
   private class327 field1524;
   @OriginalMember(
      owner = "client!jr",
      name = "c",
      descriptor = "Loaa;"
   )
   private class304 field1514;
   @OriginalMember(
      owner = "client!jr",
      name = "e",
      descriptor = "I"
   )
   private int field1522;
   @OriginalMember(
      owner = "client!jr",
      name = "n",
      descriptor = "I"
   )
   private int field1521;
   @OriginalMember(
      owner = "client!jr",
      name = "m",
      descriptor = "Loia;"
   )
   private class96 field1513;
   @OriginalMember(
      owner = "client!jr",
      name = "d",
      descriptor = "I"
   )
   public int field1527;
   @OriginalMember(
      owner = "client!jr",
      name = "r",
      descriptor = "Lgu;"
   )
   private class610 field1520;
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1530 = new String[]{method1026(method1025("k~4~@")), method1026(method1025("k~4|@")), method1026(method1025("oyvS")), method1026(method1025("z\"4\u0011\u0015")), method1026(method1025("k~4{@")), method1026(method1025("k~4}@")), method1026(method1025("k~4\u0003\u0001oen\u0001@"))};
   @OriginalMember(
      owner = "client!jr",
      name = "p",
      descriptor = "[Luba;"
   )
   public static class457[] field1518 = new class457[6];
   @OriginalMember(
      owner = "client!jr",
      name = "i",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1528 = new String[5];
   @OriginalMember(
      owner = "client!jr",
      name = "f",
      descriptor = "I"
   )
   public static int field1515;
   @OriginalMember(
      owner = "client!jr",
      name = "o",
      descriptor = "I"
   )
   public static int field1517;
   @OriginalMember(
      owner = "client!jr",
      name = "k",
      descriptor = "I"
   )
   public static int field1519;
   @OriginalMember(
      owner = "client!jr",
      name = "q",
      descriptor = "I"
   )
   public static int field1525;
   @OriginalMember(
      owner = "client!jr",
      name = "l",
      descriptor = "J"
   )
   public static long field1516;

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1021(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field1515;
         if (this.field1523) {
            this.field1523 = false;
            if (arg0 > -31) {
               field1528 = null;
            }

            byte[] var3 = this.field1514.field4028;
            int var4 = 0;
            int var5 = this.field1514.field4032;
            int var6 = this.field1514.field4032 * this.field1529 + this.field1526;
            int var7 = -128;
            int var8;
            int var9;
            int var10;
            int[] var11;
            int var12;
            int var13;
            int var14;
            byte[] var15;
            int var16;
            int var17;
            int var18;
            if (var2) {
               var4 = (var4 << 8) + -var4;
               var8 = -128;
               if (var2) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }
            } else {
               if (var7 >= 0) {
                  if (!var2) {
                     if (this.field1520 != null && ~this.field1512 == ~var4) {
                        this.field1523 = false;
                        return;
                     }

                     this.field1512 = var4;
                     var9 = this.field1529 * var5 + this.field1526;
                     var10 = 0;
                     if (!this.field1524.method2594(class128.field1618, 15903, class335.field4803)) {
                        if (class443.field6152 == null) {
                           class443.field6152 = new int[16384];
                        }

                        var11 = class443.field6152;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field1520 != null) {
                              this.field1520.method35(0, 128, 128, 0, 0, class443.field6152, 128, -16856);
                              return;
                           }

                           this.field1520 = this.field1524.method2484(class443.field6152, false, 128, 128, (byte)2);
                           this.field1520.method36(10251, false, false);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var9] == 0) {
                                 var14 = 0;
                                 if (~var3[var9 - 1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var14;
                                    if (var3[var5 + var9] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var5 + var9] != 0) {
                                    ++var14;
                                 }

                                 var11[var10++] = var14 * 17 << 24;
                                 if (var2) {
                                    var11[var10++] = 1140850688;
                                    ++var9;
                                    ++var13;
                                 } else {
                                    ++var9;
                                    ++var13;
                                 }
                              } else {
                                 var11[var10++] = 1140850688;
                                 ++var9;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(var13 < 0) {
                                 if (var3[var9] == 0) {
                                    var14 = 0;
                                    if (~var3[var9 - 1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var14;
                                       if (var3[var5 + var9] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var5 + var9] != 0) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    if (var2) {
                                       var11[var10++] = 1140850688;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var10++] = 1140850688;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              var9 += this.field1514.field4032 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var11[var10++] = 1140850688;
                              ++var9;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field1520 != null) {
                           this.field1520.method35(0, 128, 128, 0, 0, class443.field6152, 128, -16856);
                           return;
                        }

                        this.field1520 = this.field1524.method2484(class443.field6152, false, 128, 128, (byte)2);
                        this.field1520.method36(10251, false, false);
                        return;
                     }

                     if (class359.field5119 == null) {
                        class359.field5119 = new byte[16384];
                     }

                     var15 = class359.field5119;
                     var16 = -128;
                     if (!var2 && var16 >= 0) {
                        if (this.field1520 == null) {
                           this.field1520 = this.field1524.method2475(true, 128, class359.field5119, class128.field1618, false, 128);
                           this.field1520.method36(10251, false, false);
                           return;
                        }

                        this.field1520.method38(0, 0, class359.field5119, class128.field1618, 128, 0, true, 128, 128);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (~var3[var9] != -1) {
                              var15[var10++] = 68;
                              if (var2) {
                                 var18 = 0;
                                 if (~var3[var9 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 - -var5] != -1) {
                                    ++var18;
                                 }

                                 var15[var10++] = (byte)(var18 * 17);
                                 ++var9;
                                 ++var17;
                              } else {
                                 ++var9;
                                 ++var17;
                              }
                           } else {
                              var18 = 0;
                              if (~var3[var9 - 1] != -1) {
                                 ++var18;
                              }

                              if (var3[var9 + 1] != 0) {
                                 ++var18;
                              }

                              if (var3[-var5 + var9] != 0) {
                                 ++var18;
                              }

                              if (~var3[var9 - -var5] != -1) {
                                 ++var18;
                              }

                              var15[var10++] = (byte)(var18 * 17);
                              ++var9;
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var17 > -1) {
                              if (~var3[var9] != -1) {
                                 var15[var10++] = 68;
                                 if (var2) {
                                    var18 = 0;
                                    if (~var3[var9 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
                                       ++var18;
                                    }

                                    var15[var10++] = (byte)(var18 * 17);
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var18 = 0;
                                 if (~var3[var9 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 - -var5] != -1) {
                                    ++var18;
                                 }

                                 var15[var10++] = (byte)(var18 * 17);
                                 ++var9;
                                 ++var17;
                              }
                           }

                           var9 += this.field1514.field4032 + -128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var18 = 0;
                           if (~var3[var9 - 1] != -1) {
                              ++var18;
                           }

                           if (var3[var9 + 1] != 0) {
                              ++var18;
                           }

                           if (var3[-var5 + var9] != 0) {
                              ++var18;
                           }

                           if (~var3[var9 - -var5] != -1) {
                              ++var18;
                           }

                           var15[var10++] = (byte)(var18 * 17);
                           ++var9;
                           ++var17;
                        }
                     } while(var16 < 0);

                     if (this.field1520 == null) {
                        this.field1520 = this.field1524.method2475(true, 128, class359.field5119, class128.field1618, false, 128);
                        this.field1520.method36(10251, false, false);
                        return;
                     }

                     this.field1520.method38(0, 0, class359.field5119, class128.field1618, 128, 0, true, 128, 128);
                     return;
                  }
               } else {
                  var4 = (var4 << 8) + -var4;
               }

               var8 = -128;
               if (var2) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }
            }

            while(true) {
               while(var8 < 0) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }

               var6 += var5 - 128;
               if (!var2) {
                  ++var7;
                  if (var7 >= 0) {
                     if (!var2) {
                        if (this.field1520 != null && ~this.field1512 == ~var4) {
                           this.field1523 = false;
                           return;
                        }

                        this.field1512 = var4;
                        var9 = this.field1529 * var5 + this.field1526;
                        var10 = 0;
                        if (!this.field1524.method2594(class128.field1618, 15903, class335.field4803)) {
                           if (class443.field6152 == null) {
                              class443.field6152 = new int[16384];
                           }

                           var11 = class443.field6152;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field1520 != null) {
                                 this.field1520.method35(0, 128, 128, 0, 0, class443.field6152, 128, -16856);
                                 return;
                              }

                              this.field1520 = this.field1524.method2484(class443.field6152, false, 128, 128, (byte)2);
                              this.field1520.method36(10251, false, false);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (var3[var9] == 0) {
                                    var14 = 0;
                                    if (~var3[var9 - 1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var14;
                                       if (var3[var5 + var9] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var5 + var9] != 0) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    if (var2) {
                                       var11[var10++] = 1140850688;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var10++] = 1140850688;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(var13 < 0) {
                                    if (var3[var9] == 0) {
                                       var14 = 0;
                                       if (~var3[var9 - 1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var9] != 0) {
                                          ++var14;
                                          if (var3[var5 + var9] != 0) {
                                             ++var14;
                                          }
                                       } else if (var3[var5 + var9] != 0) {
                                          ++var14;
                                       }

                                       var11[var10++] = var14 * 17 << 24;
                                       if (var2) {
                                          var11[var10++] = 1140850688;
                                          ++var9;
                                          ++var13;
                                       } else {
                                          ++var9;
                                          ++var13;
                                       }
                                    } else {
                                       var11[var10++] = 1140850688;
                                       ++var9;
                                       ++var13;
                                    }
                                 }

                                 var9 += this.field1514.field4032 + -128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var11[var10++] = 1140850688;
                                 ++var9;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field1520 != null) {
                              this.field1520.method35(0, 128, 128, 0, 0, class443.field6152, 128, -16856);
                              return;
                           }

                           this.field1520 = this.field1524.method2484(class443.field6152, false, 128, 128, (byte)2);
                           this.field1520.method36(10251, false, false);
                           return;
                        }

                        if (class359.field5119 == null) {
                           class359.field5119 = new byte[16384];
                        }

                        var15 = class359.field5119;
                        var16 = -128;
                        if (!var2 && var16 >= 0) {
                           if (this.field1520 == null) {
                              this.field1520 = this.field1524.method2475(true, 128, class359.field5119, class128.field1618, false, 128);
                              this.field1520.method36(10251, false, false);
                              return;
                           }

                           this.field1520.method38(0, 0, class359.field5119, class128.field1618, 128, 0, true, 128, 128);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (~var3[var9] != -1) {
                                 var15[var10++] = 68;
                                 if (var2) {
                                    var18 = 0;
                                    if (~var3[var9 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
                                       ++var18;
                                    }

                                    var15[var10++] = (byte)(var18 * 17);
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var18 = 0;
                                 if (~var3[var9 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 - -var5] != -1) {
                                    ++var18;
                                 }

                                 var15[var10++] = (byte)(var18 * 17);
                                 ++var9;
                                 ++var17;
                              }
                           }

                           while(true) {
                              while(~var17 > -1) {
                                 if (~var3[var9] != -1) {
                                    var15[var10++] = 68;
                                    if (var2) {
                                       var18 = 0;
                                       if (~var3[var9 - 1] != -1) {
                                          ++var18;
                                       }

                                       if (var3[var9 + 1] != 0) {
                                          ++var18;
                                       }

                                       if (var3[-var5 + var9] != 0) {
                                          ++var18;
                                       }

                                       if (~var3[var9 - -var5] != -1) {
                                          ++var18;
                                       }

                                       var15[var10++] = (byte)(var18 * 17);
                                       ++var9;
                                       ++var17;
                                    } else {
                                       ++var9;
                                       ++var17;
                                    }
                                 } else {
                                    var18 = 0;
                                    if (~var3[var9 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
                                       ++var18;
                                    }

                                    var15[var10++] = (byte)(var18 * 17);
                                    ++var9;
                                    ++var17;
                                 }
                              }

                              var9 += this.field1514.field4032 + -128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var18 = 0;
                              if (~var3[var9 - 1] != -1) {
                                 ++var18;
                              }

                              if (var3[var9 + 1] != 0) {
                                 ++var18;
                              }

                              if (var3[-var5 + var9] != 0) {
                                 ++var18;
                              }

                              if (~var3[var9 - -var5] != -1) {
                                 ++var18;
                              }

                              var15[var10++] = (byte)(var18 * 17);
                              ++var9;
                              ++var17;
                           }
                        } while(var16 < 0);

                        if (this.field1520 == null) {
                           this.field1520 = this.field1524.method2475(true, 128, class359.field5119, class128.field1618, false, 128);
                           this.field1520.method36(10251, false, false);
                           return;
                        }

                        this.field1520.method38(0, 0, class359.field5119, class128.field1618, 128, 0, true, 128, 128);
                        return;
                     }
                  } else {
                     var4 = (var4 << 8) + -var4;
                  }

                  var8 = -128;
                  if (var2) {
                     if (~var3[var6++] != -1) {
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
         throw class534.method3846(var20, field1530[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1022(int arg0) {
      try {
         ++field1519;
         if (arg0 != -128) {
            method1024((byte)98);
         }

         this.method1023(this.field1527, true, this.field1513);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1530[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(IZLoia;)V"
   )
   public final void method1023(int arg0, boolean arg1, class96 arg2) {
      try {
         if (arg0 > 0) {
            this.method1021(-73);
            this.field1524.method2581(this.field1520, -12);
            this.field1524.method2483(this.field1522 + 1 + -this.field1521, arg0, 0, this.field1521, 118, class631.field8832, arg2);
         }

         if (!arg1) {
            method1024((byte)88);
         }

         ++field1525;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1530[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1530[3] : field1530[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1024(byte arg0) {
      try {
         if (arg0 >= -31) {
            method1024((byte)3);
         }

         field1528 = null;
         field1518 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1530[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "<init>",
      descriptor = "(Lce;Loaa;Lio;IIIII)V"
   )
   public class121(class327 param1, class304 param2, class465 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1025(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1026(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
