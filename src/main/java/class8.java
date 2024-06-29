import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class8 {
   @OriginalMember(
      owner = "client!pd",
      name = "e",
      descriptor = "Z"
   )
   public boolean field58;
   @OriginalMember(
      owner = "client!pd",
      name = "q",
      descriptor = "I"
   )
   private int field63;
   @OriginalMember(
      owner = "client!pd",
      name = "p",
      descriptor = "Lcc;"
   )
   private class585 field47;
   @OriginalMember(
      owner = "client!pd",
      name = "o",
      descriptor = "I"
   )
   private int field52;
   @OriginalMember(
      owner = "client!pd",
      name = "s",
      descriptor = "I"
   )
   private int field45;
   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "Lmu;"
   )
   private class258 field50;
   @OriginalMember(
      owner = "client!pd",
      name = "l",
      descriptor = "I"
   )
   private int field51;
   @OriginalMember(
      owner = "client!pd",
      name = "f",
      descriptor = "I"
   )
   private int field55;
   @OriginalMember(
      owner = "client!pd",
      name = "k",
      descriptor = "Lqq;"
   )
   private class800 field60;
   @OriginalMember(
      owner = "client!pd",
      name = "i",
      descriptor = "I"
   )
   public int field54;
   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "Lbc;"
   )
   private class282 field48;
   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field64 = new String[]{method40(method39("\u0015z\u001aQ\u001c")), method40(method39("\u0015z\u001aS\u001c")), method40(method39("\u0015z\u001aV\u001c")), method40(method39("\u001e0\u001a<I")), method40(method39("\u0015z\u001aT\u001c")), method40(method39("\u000bkX~")), method40(method39("\u0015z\u001aP\u001c")), method40(method39("\u0015z\u001a.]\u000bw@,\u001c")), method40(method39("\u0015z\u001aW\u001c"))};
   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field57 = new class498(27, -2);
   @OriginalMember(
      owner = "client!pd",
      name = "h",
      descriptor = "I"
   )
   public static int field46;
   @OriginalMember(
      owner = "client!pd",
      name = "r",
      descriptor = "I"
   )
   public static int field49;
   @OriginalMember(
      owner = "client!pd",
      name = "n",
      descriptor = "I"
   )
   public static int field53;
   @OriginalMember(
      owner = "client!pd",
      name = "d",
      descriptor = "I"
   )
   public static int field56;
   @OriginalMember(
      owner = "client!pd",
      name = "g",
      descriptor = "I"
   )
   public static int field59;
   @OriginalMember(
      owner = "client!pd",
      name = "j",
      descriptor = "I"
   )
   public static int field61;
   @OriginalMember(
      owner = "client!pd",
      name = "m",
      descriptor = "Lrr;"
   )
   public static class678 field62;

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(Lll;Lha;I)I",
      line = 8
   )
   public static final int method33(class634 arg0, class610 arg1, int arg2) {
      try {
         ++field56;
         if (arg2 != 0) {
            method36(50);
         }

         if (arg0.field9169 != -1) {
            return arg0.field9169;
         } else {
            if (arg0.field9167 != -1) {
               class453 var3 = arg1.field8891.method1373(arg0.field9167, (byte)-54);
               if (!var3.field6934) {
                  return var3.field6922;
               }
            }

            return arg0.field9180;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field64[4] + (arg0 != null ? field64[3] : field64[5]) + ',' + (arg1 != null ? field64[3] : field64[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(III)Z",
      line = 40
   )
   public static final boolean method34(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 0) {
            method33((class634)null, (class610)null, -98);
         }

         ++field53;
         return (class309.method2587(arg0, (byte)-103, arg2) | class639.method4662(arg2, arg0, 7371) | class378.method3088((byte)-127, arg2, arg0)) & class20.method148(arg2, arg0, 2048);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field64[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(I)V",
      line = 51
   )
   public final void method35(int arg0) {
      try {
         ++field49;
         this.method38(-29622, this.field54, this.field60);
         int var2 = -89 / ((arg0 - -9) / 39);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field64[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(I)V",
      line = 61
   )
   public static void method36(int arg0) {
      try {
         field62 = null;
         if (arg0 != 1356126136) {
            field62 = null;
         }

         field57 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field64[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "<init>",
      descriptor = "(Lmu;Lcc;Lnd;IIIII)V",
      line = 279
   )
   public class8(class258 param1, class585 param2, class121 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(Z)V",
      line = 81
   )
   private final void method37(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         if (!arg0) {
            this.field45 = 25;
         }

         ++field59;
         if (this.field58) {
            this.field58 = false;
            byte[] var3 = this.field47.field8651;
            int var4 = 0;
            int var5 = this.field47.field8642;
            int var6 = this.field47.field8642 * this.field52 + this.field45;
            int var7 = -128;
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
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }
            } else {
               if (~var7 <= -1) {
                  if (!var2) {
                     if (this.field48 != null && ~this.field63 == ~var4) {
                        this.field58 = false;
                        return;
                     }

                     this.field63 = var4;
                     var9 = this.field52 * var5 + this.field45;
                     var10 = 0;
                     if (this.field50.method1453(class342.field5203, class650.field9371, (byte)-75)) {
                        if (class117.field1573 == null) {
                           class117.field1573 = new byte[16384];
                        }

                        var11 = class117.field1573;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field48 == null) {
                              this.field48 = this.field50.method2214(128, false, 128, class342.field5203, (byte)75, class117.field1573);
                              this.field48.method2358(-3545, false, false);
                              return;
                           }

                           this.field48.method2360((byte)-21, 128, 128, 0, 0, class342.field5203, 128, 0, class117.field1573);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (~var3[var9] == -1) {
                                 var14 = 0;
                                 if (~var3[var9 + -1] != -1) {
                                    ++var14;
                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var9 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - var5] != -1) {
                                    ++var14;
                                    if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var5 + var9] != -1) {
                                    ++var14;
                                 }

                                 var11[var10++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var11[var10++] = 68;
                                    ++var9;
                                    ++var13;
                                 } else {
                                    ++var9;
                                    ++var13;
                                 }
                              } else {
                                 var11[var10++] = 68;
                                 ++var9;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (~var3[var9] == -1) {
                                    var14 = 0;
                                    if (~var3[var9 + -1] != -1) {
                                       ++var14;
                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - var5] != -1) {
                                       ++var14;
                                       if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var11[var10++] = 68;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var10++] = 68;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              var9 += this.field47.field8642 - 128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var11[var10++] = 68;
                              ++var9;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field48 == null) {
                           this.field48 = this.field50.method2214(128, false, 128, class342.field5203, (byte)75, class117.field1573);
                           this.field48.method2358(-3545, false, false);
                           return;
                        }

                        this.field48.method2360((byte)-21, 128, 128, 0, 0, class342.field5203, 128, 0, class117.field1573);
                        return;
                     }

                     if (class181.field2812 == null) {
                        class181.field2812 = new int[16384];
                     }

                     var15 = class181.field2812;
                     var16 = -128;
                     if (!var2 && var16 >= 0) {
                        if (this.field48 == null) {
                           this.field48 = this.field50.method2177(false, -1, 128, class181.field2812, 128);
                           this.field48.method2358(-3545, false, false);
                           return;
                        }

                        this.field48.method2357(0, -24773, 0, 128, 128, class181.field2812, 128, 0);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (var3[var9] == 0) {
                              var18 = 0;
                              if (var3[var9 + -1] != 0) {
                                 ++var18;
                              }

                              if (~var3[var9 + 1] != -1) {
                                 ++var18;
                              }

                              if (~var3[-var5 + var9] != -1) {
                                 ++var18;
                                 if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }
                              } else if (var3[var5 + var9] != 0) {
                                 ++var18;
                              }

                              var15[var10++] = var18 * 17 << 24;
                              if (var2) {
                                 var15[var10++] = 1140850688;
                                 ++var9;
                                 ++var17;
                              } else {
                                 ++var9;
                                 ++var17;
                              }
                           } else {
                              var15[var10++] = 1140850688;
                              ++var9;
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var17 > -1) {
                              if (var3[var9] == 0) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[-var5 + var9] != -1) {
                                    ++var18;
                                    if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 var15[var10++] = var18 * 17 << 24;
                                 if (var2) {
                                    var15[var10++] = 1140850688;
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var15[var10++] = 1140850688;
                                 ++var9;
                                 ++var17;
                              }
                           }

                           var9 += this.field47.field8642 + -128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var15[var10++] = 1140850688;
                           ++var9;
                           ++var17;
                        }
                     } while(var16 < 0);

                     if (this.field48 == null) {
                        this.field48 = this.field50.method2177(false, -1, 128, class181.field2812, 128);
                        this.field48.method2358(-3545, false, false);
                        return;
                     }

                     this.field48.method2357(0, -24773, 0, 128, 128, class181.field2812, 128, 0);
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

               var6 += var5 + -128;
               if (!var2) {
                  ++var7;
                  if (~var7 <= -1) {
                     if (!var2) {
                        if (this.field48 != null && ~this.field63 == ~var4) {
                           this.field58 = false;
                           return;
                        }

                        this.field63 = var4;
                        var9 = this.field52 * var5 + this.field45;
                        var10 = 0;
                        if (this.field50.method1453(class342.field5203, class650.field9371, (byte)-75)) {
                           if (class117.field1573 == null) {
                              class117.field1573 = new byte[16384];
                           }

                           var11 = class117.field1573;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field48 == null) {
                                 this.field48 = this.field50.method2214(128, false, 128, class342.field5203, (byte)75, class117.field1573);
                                 this.field48.method2358(-3545, false, false);
                                 return;
                              }

                              this.field48.method2360((byte)-21, 128, 128, 0, 0, class342.field5203, 128, 0, class117.field1573);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (~var3[var9] == -1) {
                                    var14 = 0;
                                    if (~var3[var9 + -1] != -1) {
                                       ++var14;
                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - var5] != -1) {
                                       ++var14;
                                       if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var11[var10++] = 68;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var11[var10++] = 68;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(~var13 > -1) {
                                    if (~var3[var9] == -1) {
                                       var14 = 0;
                                       if (~var3[var9 + -1] != -1) {
                                          ++var14;
                                          if (var3[var9 + 1] != 0) {
                                             ++var14;
                                          }
                                       } else if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - var5] != -1) {
                                          ++var14;
                                          if (~var3[var5 + var9] != -1) {
                                             ++var14;
                                          }
                                       } else if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }

                                       var11[var10++] = (byte)(var14 * 17);
                                       if (var2) {
                                          var11[var10++] = 68;
                                          ++var9;
                                          ++var13;
                                       } else {
                                          ++var9;
                                          ++var13;
                                       }
                                    } else {
                                       var11[var10++] = 68;
                                       ++var9;
                                       ++var13;
                                    }
                                 }

                                 var9 += this.field47.field8642 - 128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var11[var10++] = 68;
                                 ++var9;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field48 == null) {
                              this.field48 = this.field50.method2214(128, false, 128, class342.field5203, (byte)75, class117.field1573);
                              this.field48.method2358(-3545, false, false);
                              return;
                           }

                           this.field48.method2360((byte)-21, 128, 128, 0, 0, class342.field5203, 128, 0, class117.field1573);
                           return;
                        }

                        if (class181.field2812 == null) {
                           class181.field2812 = new int[16384];
                        }

                        var15 = class181.field2812;
                        var16 = -128;
                        if (!var2 && var16 >= 0) {
                           if (this.field48 == null) {
                              this.field48 = this.field50.method2177(false, -1, 128, class181.field2812, 128);
                              this.field48.method2358(-3545, false, false);
                              return;
                           }

                           this.field48.method2357(0, -24773, 0, 128, 128, class181.field2812, 128, 0);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (var3[var9] == 0) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[-var5 + var9] != -1) {
                                    ++var18;
                                    if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 var15[var10++] = var18 * 17 << 24;
                                 if (var2) {
                                    var15[var10++] = 1140850688;
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var15[var10++] = 1140850688;
                                 ++var9;
                                 ++var17;
                              }
                           }

                           while(true) {
                              while(~var17 > -1) {
                                 if (var3[var9] == 0) {
                                    var18 = 0;
                                    if (var3[var9 + -1] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[var9 + 1] != -1) {
                                       ++var18;
                                    }

                                    if (~var3[-var5 + var9] != -1) {
                                       ++var18;
                                       if (var3[var5 + var9] != 0) {
                                          ++var18;
                                       }
                                    } else if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }

                                    var15[var10++] = var18 * 17 << 24;
                                    if (var2) {
                                       var15[var10++] = 1140850688;
                                       ++var9;
                                       ++var17;
                                    } else {
                                       ++var9;
                                       ++var17;
                                    }
                                 } else {
                                    var15[var10++] = 1140850688;
                                    ++var9;
                                    ++var17;
                                 }
                              }

                              var9 += this.field47.field8642 + -128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var15[var10++] = 1140850688;
                              ++var9;
                              ++var17;
                           }
                        } while(var16 < 0);

                        if (this.field48 == null) {
                           this.field48 = this.field50.method2177(false, -1, 128, class181.field2812, 128);
                           this.field48.method2358(-3545, false, false);
                           return;
                        }

                        this.field48.method2357(0, -24773, 0, 128, 128, class181.field2812, 128, 0);
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
         throw class482.method3757(var20, field64[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IILqq;)V",
      line = 254
   )
   public final void method38(int arg0, int arg1, class800 arg2) {
      try {
         if (arg0 == -29622) {
            if (arg1 > 0) {
               this.method37(true);
               this.field50.method2193(this.field48, (byte)-19);
               this.field50.method1493((byte)-97, arg1, this.field51, 0, arg2, class331.field5019, this.field55 + 1 + -this.field51);
            }

            ++field61;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field64[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field64[3] : field64[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method39(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method40(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
