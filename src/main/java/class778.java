import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class778 implements Runnable {
   @OriginalMember(
      owner = "client!wo",
      name = "r",
      descriptor = "Lmq;"
   )
   private class538 field11329 = new class779();
   @OriginalMember(
      owner = "client!wo",
      name = "h",
      descriptor = "Lmq;"
   )
   private class538 field11339 = null;
   @OriginalMember(
      owner = "client!wo",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11340 = new String[]{method5583(method5582("m\u001b8QH")), method5583(method5582("m\u001b8ZH")), method5583(method5582("m\u001b8SH")), method5583(method5582("m\u001b8\\H")), method5583(method5582("m\u001b8_H")), method5583(method5582("m\u001b8PH")), method5583(method5582("m\u001b8RH")), method5583(method5582("m\u001b8UH")), method5583(method5582("m\u001b8[H")), method5583(method5582("m\u001b8XH")), method5583(method5582("m\u001b8]H")), method5583(method5582("t\u0001zr")), method5583(method5582("m\u001b8WH")), method5583(method5582("aZ80\u001d")), method5583(method5582("m\u001b8TH")), method5583(method5582("m\u001b8YH")), method5583(method5582(":\\D{\u0003u\u0002sl\u0005~]6")), method5583(method5582("m\u001b8l\u0015t\\")), method5583(method5582("m\u001b8VH"))};
   @OriginalMember(
      owner = "client!wo",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field11316 = new int[32];
   @OriginalMember(
      owner = "client!wo",
      name = "n",
      descriptor = "I"
   )
   public static int field11314;
   @OriginalMember(
      owner = "client!wo",
      name = "l",
      descriptor = "I"
   )
   public static int field11315;
   @OriginalMember(
      owner = "client!wo",
      name = "t",
      descriptor = "I"
   )
   public static int field11317;
   @OriginalMember(
      owner = "client!wo",
      name = "s",
      descriptor = "I"
   )
   public static int field11318;
   @OriginalMember(
      owner = "client!wo",
      name = "d",
      descriptor = "I"
   )
   public static int field11319;
   @OriginalMember(
      owner = "client!wo",
      name = "x",
      descriptor = "I"
   )
   public static int field11320;
   @OriginalMember(
      owner = "client!wo",
      name = "i",
      descriptor = "I"
   )
   public static int field11321;
   @OriginalMember(
      owner = "client!wo",
      name = "f",
      descriptor = "I"
   )
   public static int field11322;
   @OriginalMember(
      owner = "client!wo",
      name = "e",
      descriptor = "I"
   )
   public static int field11323;
   @OriginalMember(
      owner = "client!wo",
      name = "v",
      descriptor = "I"
   )
   public static int field11324;
   @OriginalMember(
      owner = "client!wo",
      name = "w",
      descriptor = "I"
   )
   public static int field11325;
   @OriginalMember(
      owner = "client!wo",
      name = "m",
      descriptor = "I"
   )
   public static int field11326;
   @OriginalMember(
      owner = "client!wo",
      name = "p",
      descriptor = "I"
   )
   public static int field11327;
   @OriginalMember(
      owner = "client!wo",
      name = "y",
      descriptor = "I"
   )
   public static int field11328;
   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "I"
   )
   public static int field11331;
   @OriginalMember(
      owner = "client!wo",
      name = "q",
      descriptor = "I"
   )
   private int field11334;
   @OriginalMember(
      owner = "client!wo",
      name = "j",
      descriptor = "I"
   )
   private int field11336;
   @OriginalMember(
      owner = "client!wo",
      name = "o",
      descriptor = "J"
   )
   private long field11335;
   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "J"
   )
   private long field11337;
   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "Ljba;"
   )
   private class422 field11333;
   @OriginalMember(
      owner = "client!wo",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   private String field11338;
   @OriginalMember(
      owner = "client!wo",
      name = "u",
      descriptor = "Z"
   )
   private volatile boolean field11330;
   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "Z"
   )
   private boolean field11332;

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5567(boolean arg0) {
      try {
         field11316 = null;
         if (arg0) {
            method5571(64, false, -29, 122, true);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11340[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5568(int arg0) {
      try {
         ++field11325;
         if (arg0 != 512) {
            this.field11334 = 112;
         }

         return this.field11334;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(BLmq;)V"
   )
   public final synchronized void method5569(byte arg0, class538 arg1) {
      try {
         ++field11318;
         this.field11339 = this.field11329;
         int var3 = 68 / ((arg0 - -8) / 55);
         this.field11329 = arg1;
         this.field11337 = class792.method5708(-25005);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11340[14] + arg0 + ',' + (arg1 != null ? field11340[13] : field11340[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method5570(int arg0) {
      try {
         ++field11322;
         this.field11330 = true;
         int var2 = 50 / ((29 - arg0) / 43);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11340[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(IZIIZ)V"
   )
   public static final void method5571(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
      boolean var5 = client.field4273;

      try {
         ++field11326;
         if (arg4 || ~class446.field6176 != ~arg3 || class270.field3503 != arg0 || ~class316.field4223 != ~class239.field2981 && ~class674.field9907.field8458.method2628((byte)-100) != -2) {
            class446.field6176 = arg3;
            class316.field4223 = class239.field2981;
            class270.field3503 = arg0;
            if (~class674.field9907.field8458.method2628((byte)-77) == -2) {
               class316.field4223 = 0;
            }

            int var8;
            int var9;
            int var10000;
            label433: {
               class397.method3019(98, arg2);
               class134.method1128(class551.field7533.method3980(class494.field6787, true), arg1, class163.field2095, class22.field281, class338.field4832, true);
               int var6 = class752.field10921;
               class752.field10921 = (class446.field6176 - (class507.field7030 >> 4)) * 8;
               int var7 = class17.field237;
               class17.field237 = (-(class215.field2667 >> 4) + class270.field3503) * 8;
               class29.field360 = class618.method4494(class446.field6176 * 8, class270.field3503 * 8);
               class222.field2768 = null;
               var8 = -var6 + class752.field10921;
               var9 = class17.field237 - var7;
               if (arg2 != 12) {
                  boolean var10 = false;
                  class741.field10800 = 0;
                  int var11 = (class507.field7030 - 1) * 512;
                  int var12 = class215.field2667 * 512 + -512;
                  int var13 = 0;
                  if (var5 || ~var13 > ~class667.field9489) {
                     do {
                        class243 var14 = class270.field3519[var13];
                        if (var14 == null) {
                           ++var13;
                        } else {
                           class680 var15 = var14.field3043;
                           var15.field1003 -= var9 * 512;
                           var15.field999 -= var8 * 512;
                           if (~var15.field999 <= -1 && var15.field999 <= var11 && ~var15.field1003 <= -1 && var12 >= var15.field1003) {
                              label401: {
                                 byte var16 = 1;
                                 int var17 = 0;
                                 if (var5) {
                                    var15.field7853[var17] -= var8;
                                    var15.field7855[var17] -= var9;
                                    var10000 = var15.field7853[var17];
                                 } else if (~var17 <= -11) {
                                    var10000 = var16;
                                    if (!var5) {
                                       break label401;
                                    }
                                 } else {
                                    var15.field7853[var17] -= var8;
                                    var15.field7855[var17] -= var9;
                                    var10000 = var15.field7853[var17];
                                 }

                                 while(true) {
                                    if (var10000 >= 0) {
                                       if (class507.field7030 > var15.field7853[var17]) {
                                          if (~var15.field7855[var17] <= -1) {
                                             if (~var15.field7855[var17] <= ~class215.field2667) {
                                                var16 = 0;
                                                ++var17;
                                             } else {
                                                ++var17;
                                             }
                                          } else {
                                             var16 = 0;
                                             ++var17;
                                          }
                                       } else {
                                          var16 = 0;
                                          ++var17;
                                       }
                                    } else {
                                       var16 = 0;
                                       ++var17;
                                    }

                                    if (~var17 <= -11) {
                                       var10000 = var16;
                                       if (!var5) {
                                          break;
                                       }
                                    } else {
                                       var15.field7853[var17] -= var8;
                                       var15.field7855[var17] -= var9;
                                       var10000 = var15.field7853[var17];
                                    }
                                 }
                              }

                              if (var10000 == 0) {
                                 var15.method4975((class392)null, 44);
                                 var14.method3609(100);
                                 var10 = true;
                                 if (!var5) {
                                    ++var13;
                                    continue;
                                 }
                              }

                              class285.field3785[class741.field10800++] = var15.field7843;
                              if (!var5) {
                                 ++var13;
                                 continue;
                              }
                           }

                           var15.method4975((class392)null, 44);
                           var10 = true;
                           var14.method3609(95);
                           ++var13;
                        }
                     } while(~var13 > ~class667.field9489);
                  }

                  if (!var10) {
                     break label433;
                  }

                  class667.field9489 = class335.field4808.method1843(-123);
                  class335.field4808.method1849(80, class270.field3519);
                  if (!var5) {
                     break label433;
                  }
               }

               int var18 = 0;
               if (var5 || class667.field9489 > var18) {
                  do {
                     class243 var19 = class270.field3519[var18];
                     if (var19 == null) {
                        ++var18;
                     } else {
                        class680 var20 = var19.field3043;
                        int var21 = 0;
                        if (var5) {
                           var20.field7853[var21] -= var8;
                           var20.field7855[var21] -= var9;
                           ++var21;
                        }

                        while(true) {
                           while(var21 < 10) {
                              var20.field7853[var21] -= var8;
                              var20.field7855[var21] -= var9;
                              ++var21;
                           }

                           var20.field1003 -= var9 * 512;
                           if (!var5) {
                              var20.field999 -= var8 * 512;
                              ++var18;
                              break;
                           }

                           var20.field7855[var21] -= var9;
                           ++var21;
                        }
                     }
                  } while(class667.field9489 > var18);
               }
            }

            int var22 = 0;
            if (var5 || var22 < 2048) {
               do {
                  class404 var23 = class136.field1773[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5) {
                        var23.field7853[var24] -= var8;
                        var23.field7855[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(~var24 > -11) {
                           var23.field7853[var24] -= var8;
                           var23.field7855[var24] -= var9;
                           ++var24;
                        }

                        var23.field1003 -= var9 * 512;
                        if (!var5) {
                           var23.field999 -= var8 * 512;
                           ++var22;
                           break;
                        }

                        var23.field7855[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(var22 < 2048);
            }

            class565[] var25 = class708.field10278;
            int var26 = 0;
            class565 var27;
            if (var5) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field7714 -= var9 * 512;
                  var27.field7704 -= var8 * 512;
               }

               ++var26;
            }

            while(~var25.length < ~var26) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field7714 -= var9 * 512;
                  var27.field7704 -= var8 * 512;
               }

               ++var26;
            }

            class158 var28;
            label206: {
               var28 = (class158)class719.field10527.method3855(126);
               if (var5) {
                  var28.field2038 -= var8;
                  var28.field2039 -= var9;
               } else if (var28 == null) {
                  var28 = (class158)class717.field10510.method3855(-104);
                  if (!var5) {
                     break label206;
                  }
               } else {
                  var28.field2038 -= var8;
                  var28.field2039 -= var9;
               }

               while(true) {
                  if (~class677.field9944 != -5) {
                     if (var28.field2038 >= 0) {
                        if (~var28.field2039 <= -1) {
                           if (class507.field7030 > var28.field2038) {
                              if (~class215.field2667 >= ~var28.field2039) {
                                 var28.method3609(113);
                              }
                           } else {
                              var28.method3609(113);
                           }
                        } else {
                           var28.method3609(113);
                        }
                     } else {
                        var28.method3609(113);
                     }
                  }

                  var28 = (class158)class719.field10527.method3866((byte)119);
                  if (var28 == null) {
                     var28 = (class158)class717.field10510.method3855(-104);
                     if (!var5) {
                        break;
                     }
                  } else {
                     var28.field2038 -= var8;
                     var28.field2039 -= var9;
                  }
               }
            }

            if (var5) {
               var28.field2038 -= var8;
               var28.field2039 -= var9;
               if (~class677.field9944 != -5) {
                  if (var28.field2038 >= 0) {
                     if (var28.field2039 >= 0) {
                        if (class507.field7030 > var28.field2038) {
                           if (var28.field2039 >= class215.field2667) {
                              var28.method3609(93);
                           }
                        } else {
                           var28.method3609(93);
                        }
                     } else {
                        var28.method3609(93);
                     }
                  } else {
                     var28.method3609(93);
                  }
               }

               var28 = (class158)class717.field10510.method3866((byte)113);
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = class677.field9944;
                  var10001 = 4;
                  if (!var5) {
                     if (var10000 != 4) {
                        class480 var29 = (class480)class2.field7.method1850(0);
                        if (var5 || var29 != null) {
                           do {
                              int var30 = (int)(var29.field6862 & 16383L);
                              int var31 = -class752.field10921 + var30;
                              int var32 = (int)(var29.field6862 >> 14 & 16383L);
                              int var33 = -class17.field237 + var32;
                              if (~var31 > -1 || var33 < 0 || class507.field7030 <= var31 || class215.field2667 <= var33) {
                                 var29.method3609(96);
                              }

                              var29 = (class480)class2.field7.method1847(121);
                           } while(var29 != null);
                        }
                     }

                     if (class529.field7262 != 0) {
                        class529.field7262 -= var8;
                        class196.field2380 -= var9;
                     }

                     label450: {
                        class307.method2309(-1);
                        if (arg2 == 12) {
                           if (~class635.field8977 != -5) {
                              class635.field8977 = 1;
                              class552.field7597 = -1;
                              class721.field10567 = -1;
                              if (!var5) {
                                 break label450;
                              }
                           }

                           class109.field1383 -= var8 * 512;
                           class221.field2763 -= var9 * 512;
                           class682.field10004 -= var9 * 512;
                           class338.field4839 -= var8 * 512;
                           if (!var5) {
                              break label450;
                           }
                        }

                        class27.field338 -= var8;
                        class772.field11146 -= var9;
                        class532.field7284 -= var9 * 512;
                        class612.field8550 -= var9;
                        class737.field10747 -= var8 * 512;
                        class484.field6672 -= var8;
                        if (~Math.abs(var8) < ~class507.field7030 || Math.abs(var9) > class215.field2667) {
                           class300.method2261(15966);
                        }
                     }

                     class46.method384((byte)0);
                     class217.method1653(-1);
                     class532.field7281.method3861(116);
                     class167.field2109.method3861(90);
                     class266.field3457.method3113(125);
                     class711.method5185(128);
                     return;
                  }
               } else {
                  var28.field2038 -= var8;
                  var28.field2039 -= var9;
                  var10000 = ~class677.field9944;
                  var10001 = -5;
               }

               if (var10000 != var10001) {
                  if (var28.field2038 >= 0) {
                     if (var28.field2039 >= 0) {
                        if (class507.field7030 > var28.field2038) {
                           if (var28.field2039 >= class215.field2667) {
                              var28.method3609(93);
                           }
                        } else {
                           var28.method3609(93);
                        }
                     } else {
                        var28.method3609(93);
                     }
                  } else {
                     var28.method3609(93);
                  }
               }

               var28 = (class158)class717.field10510.method3866((byte)113);
            }
         }
      } catch (RuntimeException var35) {
         throw class534.method3846(var35, field11340[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(JILjba;ZLjava/lang/String;)V"
   )
   public final synchronized void method5572(long arg0, int arg1, class422 arg2, boolean arg3, String arg4) {
      try {
         if (!arg3) {
            this.field11335 = -61L;
         }

         this.field11333 = arg2;
         this.field11338 = arg4;
         ++field11320;
         this.field11334 = arg1;
         this.field11335 = arg0;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11340[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11340[13] : field11340[11]) + ',' + arg3 + ',' + (arg4 != null ? field11340[13] : field11340[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5573(int arg0) {
      try {
         ++field11315;
         if (arg0 != -274460264) {
            this.field11332 = false;
         }

         return this.field11336;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "d",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method5574(int arg0) {
      try {
         ++field11328;
         return arg0 != -1312090738 ? null : this.field11338;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5575(boolean arg0) {
      try {
         ++field11327;
         if (this.field11333 == null) {
            return 0;
         } else {
            int var2 = this.field11333.method3187((byte)113);
            if (this.field11333.field5910 && this.field11334 < this.field11333.field5916) {
               return this.field11334 + 1;
            } else if (var2 >= 0 && ~(class378.field5302.length + -1) < ~var2) {
               if (arg0) {
                  this.field11337 = 50L;
               }

               return ~this.field11333.field5919 == ~this.field11334 ? this.field11333.field5916 : this.field11333.field5919;
            } else {
               return 100;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11340[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method5576(String arg0, int arg1) {
      try {
         ++field11319;
         if (!arg0.equals("")) {
            int var2 = 86 / ((56 - arg1) / 52);
            ++class123.field1534;
            class223 var3 = class355.method2790(13111);
            class471 var4 = class133.method1118(var3.field2787, 2, class350.field5011);
            var4.field6527.method4318(class190.method1432(10524, arg0), 0);
            var4.field6527.method4332((byte)-94, arg0);
            var3.method1702((byte)-91, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11340[15] + (arg0 != null ? field11340[13] : field11340[11]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method5577(byte arg0) {
      try {
         int var2 = 118 % ((arg0 - -62) / 57);
         ++field11323;
         return this.field11335;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11340[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5578(byte arg0) {
      boolean var1 = client.field4273;

      try {
         if (class625.field8733 != null) {
            int var2 = 0;
            if (var1) {
               class625.field8733[var2] = null;
               ++var2;
            }

            while(true) {
               while(class642.field9026 > var2) {
                  class625.field8733[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class625.field8733 = null;
                  break;
               }

               ++var2;
            }
         }

         if (arg0 > 99) {
            ++field11331;
            if (class795.field11617 != null) {
               int var3 = 0;
               if (var1) {
                  class795.field11617[var3] = null;
                  ++var3;
               }

               while(true) {
                  while(class623.field8695 > var3) {
                     class795.field11617[var3] = null;
                     ++var3;
                  }

                  if (!var1) {
                     class795.field11617 = null;
                     break;
                  }

                  ++var3;
               }
            }

            if (class397.field5579 != null) {
               int var4 = 0;
               if (var1) {
                  class397.field5579[var4] = null;
                  ++var4;
               }

               while(true) {
                  while(~var4 > ~class28.field350) {
                     class397.field5579[var4] = null;
                     ++var4;
                  }

                  if (!var1) {
                     class397.field5579 = null;
                     break;
                  }

                  ++var4;
               }
            }

            class24.field312 = null;
            class793.field11583 = null;
            class696.field10168 = -1;
            class243.field3041 = -1;
            class614.field8580 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11340[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "(I)Z"
   )
   public final synchronized boolean method5579(int arg0) {
      try {
         ++field11324;
         return arg0 != 0 ? true : this.field11329.method3886(126, this.field11337);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(B)V"
   )
   public final synchronized void method5580(byte arg0) {
      try {
         ++field11321;
         this.field11332 = true;
         if (arg0 != -41) {
            this.field11335 = 75L;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(B)Ljba;"
   )
   public final class422 method5581(byte arg0) {
      try {
         ++field11314;
         if (arg0 != -45) {
            this.method5572(64L, -112, (class422)null, true, (String)null);
         }

         return this.field11333;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11340[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5582(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5583(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
