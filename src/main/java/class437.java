import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class437 {
   @OriginalMember(
      owner = "client!kn",
      name = "k",
      descriptor = "F"
   )
   public float field6397 = 1.0F;
   @OriginalMember(
      owner = "client!kn",
      name = "m",
      descriptor = "F"
   )
   public float field6401 = 0.25F;
   @OriginalMember(
      owner = "client!kn",
      name = "l",
      descriptor = "F"
   )
   public float field6407 = 1.0F;
   @OriginalMember(
      owner = "client!kn",
      name = "c",
      descriptor = "I"
   )
   public int field6403;
   @OriginalMember(
      owner = "client!kn",
      name = "r",
      descriptor = "Lns;"
   )
   public class382 field6404;
   @OriginalMember(
      owner = "client!kn",
      name = "j",
      descriptor = "I"
   )
   public int field6399;
   @OriginalMember(
      owner = "client!kn",
      name = "s",
      descriptor = "I"
   )
   public int field6405;
   @OriginalMember(
      owner = "client!kn",
      name = "i",
      descriptor = "I"
   )
   public int field6394;
   @OriginalMember(
      owner = "client!kn",
      name = "p",
      descriptor = "Lnf;"
   )
   public class773 field6411;
   @OriginalMember(
      owner = "client!kn",
      name = "q",
      descriptor = "I"
   )
   public int field6396;
   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "F"
   )
   public float field6393;
   @OriginalMember(
      owner = "client!kn",
      name = "h",
      descriptor = "F"
   )
   public float field6410;
   @OriginalMember(
      owner = "client!kn",
      name = "n",
      descriptor = "F"
   )
   public float field6398;
   @OriginalMember(
      owner = "client!kn",
      name = "w",
      descriptor = "I"
   )
   public int field6391;
   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6413 = new String[]{method3407(method3406("?\u0010D\u001b_")), method3407(method3406("/PD|\n")), method3407(method3406("*K\u0006Y")), method3407(method3406("/PDw\n")), method3407(method3406("\u0016}P\u0015")), method3407(method3406("/PDs\n")), method3407(method3406("/PD\tK*W\u001e\u000b\n")), method3407(method3406("/PDq\n")), method3407(method3406("/PDv\n")), method3407(method3406("/PD}\n")), method3407(method3406("/PDp\n")), method3407(method3406("/PDr\n")), method3407(method3406("/PDt\n"))};
   @OriginalMember(
      owner = "client!kn",
      name = "u",
      descriptor = "I"
   )
   public static int field6390;
   @OriginalMember(
      owner = "client!kn",
      name = "e",
      descriptor = "I"
   )
   public static int field6392;
   @OriginalMember(
      owner = "client!kn",
      name = "f",
      descriptor = "I"
   )
   public static int field6395;
   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "I"
   )
   public static int field6400;
   @OriginalMember(
      owner = "client!kn",
      name = "o",
      descriptor = "I"
   )
   public static int field6402;
   @OriginalMember(
      owner = "client!kn",
      name = "v",
      descriptor = "I"
   )
   public static int field6406;
   @OriginalMember(
      owner = "client!kn",
      name = "d",
      descriptor = "I"
   )
   public static int field6408;
   @OriginalMember(
      owner = "client!kn",
      name = "g",
      descriptor = "I"
   )
   public static int field6412;
   @OriginalMember(
      owner = "client!kn",
      name = "t",
      descriptor = "Lda;"
   )
   public static class216 field6409;

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Lkn;I)Z"
   )
   public final boolean method3397(class437 arg0, int arg1) {
      try {
         ++field6392;
         if (arg1 != 22580) {
            this.field6401 = -0.8355235F;
         }

         return this.field6399 == arg0.field6399 && this.field6410 == arg0.field6410 && this.field6398 == arg0.field6398 && this.field6393 == arg0.field6393 && this.field6401 == arg0.field6401 && this.field6397 == arg0.field6397 && this.field6407 == arg0.field6407 && this.field6391 == arg0.field6391 && this.field6394 == arg0.field6394 && this.field6404 == arg0.field6404 && this.field6411 == arg0.field6411;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6413[7] + (arg0 != null ? field6413[0] : field6413[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method3398(int arg0, byte arg1, int arg2, int arg3) {
      try {
         int var4 = 19 % ((arg1 - 40) / 37);
         ++field6402;
         if (arg2 < arg0) {
            return arg0;
         } else {
            return ~arg2 >= ~arg3 ? arg2 : arg3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6413[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method3399(int arg0, class65 arg1) {
      try {
         if (arg0 == 1) {
            this.field6397 = (float)(arg1.method665(false) * 8) / 255.0F;
            ++field6406;
            this.field6401 = (float)(8 * arg1.method665(false)) / 255.0F;
            this.field6407 = (float)(arg1.method665(false) * 8) / 255.0F;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6413[1] + arg0 + ',' + (arg1 != null ? field6413[0] : field6413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3400(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field6400;
         if (~class476.field6870.field9145.method3261(-110) == -3) {
            byte var2 = (byte)(class495.field7065 + -4 & 255);
            int var3 = class495.field7065 % class234.field3626;
            int var4 = 0;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var10000;
            int var16;
            int var10001;
            int var17;
            int var18;
            int var19;
            if (var1) {
               var5 = 0;
               if (var1) {
                  class643.field9050[var4][var3][var5] = var2;
                  ++var5;
               }
            } else {
               if (var4 >= 4) {
                  var10000 = class128.field2049;
                  if (!var1) {
                     if (var10000 == 3) {
                        return;
                     }

                     var6 = 0;
                     if (var1) {
                        class540.field7579[var6] = -1000000;
                        class171.field2567[var6] = 1000000;
                        class737.field10502[var6] = 0;
                        class393.field5710[var6] = 1000000;
                        class123.field1974[var6] = 0;
                        ++var6;
                     }

                     while(true) {
                        while(var6 < 2) {
                           class540.field7579[var6] = -1000000;
                           class171.field2567[var6] = 1000000;
                           class737.field10502[var6] = 0;
                           class393.field5710[var6] = 1000000;
                           class123.field1974[var6] = 0;
                           ++var6;
                        }

                        var7 = class117.field1849.field6832;
                        if (!var1) {
                           if (arg0 != 62) {
                              method3402(109);
                           }

                           var8 = class117.field1849.field6833;
                           if (~class306.field4639 != -2 && ~class555.field7892 == 0) {
                              var9 = class478.method3658(class128.field2049, class670.field9407, class222.field3158, (byte)-20);
                              if (-class576.field8141 + var9 < 3200 && (class644.field9070[class128.field2049][class670.field9407 >> 9][class222.field3158 >> 9] & 4) != 0) {
                                 class393.method3046(class324.field4826, 1, -62, false, class670.field9407 >> 9, class222.field3158 >> 9);
                                 return;
                              }

                              return;
                           } else {
                              if (class306.field4639 != 1) {
                                 var7 = class555.field7892;
                                 var8 = class27.field402;
                              }

                              if ((class644.field9070[class128.field2049][var7 >> 9][var8 >> 9] & 4) != 0) {
                                 class393.method3046(class324.field4826, 0, -47, false, var7 >> 9, var8 >> 9);
                              }

                              if (~class313.field4701 <= -2561) {
                                 return;
                              }

                              label354: {
                                 var10 = class670.field9407 >> 9;
                                 var11 = class222.field3158 >> 9;
                                 var12 = var7 >> 9;
                                 var13 = var8 >> 9;
                                 if (var12 > var10) {
                                    var14 = -var10 + var12;
                                    if (!var1) {
                                       break label354;
                                    }
                                 }

                                 var14 = -var12 + var10;
                              }

                              label364: {
                                 if (~var11 <= ~var13) {
                                    var15 = -var13 + var11;
                                    if (!var1) {
                                       break label364;
                                    }
                                 }

                                 var15 = var13 - var11;
                              }

                              if ((var14 != 0 || var15 != 0) && ~var14 < ~(-class234.field3626) && var14 < class234.field3626 && -class209.field2989 < var15 && class209.field2989 > var15) {
                                 if (var15 < var14) {
                                    var18 = var15 * 65536 / var14;
                                    var19 = 32768;
                                    if (var1) {
                                       var10000 = var10;
                                       var10001 = var12;
                                    } else {
                                       if (var10 == var12) {
                                          return;
                                       }

                                       var10000 = var10;
                                       var10001 = var12;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (var10000 >= var10001) {
                                             if (var10 > var12) {
                                                --var10;
                                                if (var1) {
                                                   ++var10;
                                                }
                                             }
                                          } else {
                                             ++var10;
                                          }

                                          if ((class644.field9070[class128.field2049][var10][var11] & 4) != 0) {
                                             class393.method3046(class324.field4826, 1, -92, false, var10, var11);
                                             return;
                                          }

                                          var19 += var18;
                                          if (var19 < 65536) {
                                             break;
                                          }

                                          var19 -= 65536;
                                          var10000 = var11;
                                          var10001 = var13;
                                          if (!var1) {
                                             if (var11 < var13) {
                                                ++var11;
                                                if (var1 && ~var11 < ~var13) {
                                                   --var11;
                                                }
                                             } else if (~var11 < ~var13) {
                                                --var11;
                                             }

                                             if ((4 & class644.field9070[class128.field2049][var10][var11]) != 0) {
                                                class393.method3046(class324.field4826, 1, arg0 ^ -83, false, var10, var11);
                                                return;
                                             }
                                             break;
                                          }
                                       }

                                       if (var10 == var12) {
                                          return;
                                       }

                                       var10000 = var10;
                                       var10001 = var12;
                                    }
                                 }

                                 var16 = var14 * 65536 / var15;
                                 var17 = 32768;
                                 if (var1) {
                                    var10000 = var11;
                                    var10001 = var13;
                                 } else {
                                    if (var11 == var13) {
                                       return;
                                    }

                                    var10000 = var11;
                                    var10001 = var13;
                                 }

                                 while(true) {
                                    while(true) {
                                       if (var10000 >= var10001) {
                                          if (~var11 < ~var13) {
                                             --var11;
                                             if (var1) {
                                                ++var11;
                                             }
                                          }
                                       } else {
                                          ++var11;
                                       }

                                       if ((4 & class644.field9070[class128.field2049][var10][var11]) != 0) {
                                          class393.method3046(class324.field4826, 1, arg0 + -159, false, var10, var11);
                                          return;
                                       }

                                       var17 += var16;
                                       if (var17 < 65536) {
                                          break;
                                       }

                                       var10000 = ~var12;
                                       var10001 = ~var10;
                                       if (!var1) {
                                          if (var10000 >= var10001) {
                                             if (var10 > var12) {
                                                --var10;
                                                if (var1) {
                                                   ++var10;
                                                }
                                             }
                                          } else {
                                             ++var10;
                                          }

                                          var17 -= 65536;
                                          if (~(class644.field9070[class128.field2049][var10][var11] & 4) != -1) {
                                             class393.method3046(class324.field4826, 1, arg0 ^ -98, false, var10, var11);
                                             return;
                                          }
                                          break;
                                       }
                                    }

                                    if (var11 == var13) {
                                       return;
                                    }

                                    var10000 = var11;
                                    var10001 = var13;
                                 }
                              }

                              class117.method1138(arg0 + 65, field6413[4] + var10 + "," + var11 + " " + var12 + "," + var13 + " " + class115.field1824 + "," + class480.field6903, (Throwable)null);
                              return;
                           }
                        }

                        ++var6;
                     }
                  }
               } else {
                  var10000 = 0;
               }

               var5 = var10000;
               if (var1) {
                  class643.field9050[var4][var3][var5] = var2;
                  ++var5;
               }
            }

            while(true) {
               while(class209.field2989 > var5) {
                  class643.field9050[var4][var3][var5] = var2;
                  ++var5;
               }

               if (!var1) {
                  ++var4;
                  if (var4 >= 4) {
                     var10000 = class128.field2049;
                     if (!var1) {
                        if (var10000 == 3) {
                           return;
                        }

                        var6 = 0;
                        if (var1) {
                           class540.field7579[var6] = -1000000;
                           class171.field2567[var6] = 1000000;
                           class737.field10502[var6] = 0;
                           class393.field5710[var6] = 1000000;
                           class123.field1974[var6] = 0;
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 2) {
                              class540.field7579[var6] = -1000000;
                              class171.field2567[var6] = 1000000;
                              class737.field10502[var6] = 0;
                              class393.field5710[var6] = 1000000;
                              class123.field1974[var6] = 0;
                              ++var6;
                           }

                           var7 = class117.field1849.field6832;
                           if (!var1) {
                              if (arg0 != 62) {
                                 method3402(109);
                              }

                              var8 = class117.field1849.field6833;
                              if (~class306.field4639 != -2 && ~class555.field7892 == 0) {
                                 var9 = class478.method3658(class128.field2049, class670.field9407, class222.field3158, (byte)-20);
                                 if (-class576.field8141 + var9 < 3200 && (class644.field9070[class128.field2049][class670.field9407 >> 9][class222.field3158 >> 9] & 4) != 0) {
                                    class393.method3046(class324.field4826, 1, -62, false, class670.field9407 >> 9, class222.field3158 >> 9);
                                    return;
                                 }

                                 return;
                              } else {
                                 if (class306.field4639 != 1) {
                                    var7 = class555.field7892;
                                    var8 = class27.field402;
                                 }

                                 if ((class644.field9070[class128.field2049][var7 >> 9][var8 >> 9] & 4) != 0) {
                                    class393.method3046(class324.field4826, 0, -47, false, var7 >> 9, var8 >> 9);
                                 }

                                 if (~class313.field4701 <= -2561) {
                                    return;
                                 }

                                 label212: {
                                    var10 = class670.field9407 >> 9;
                                    var11 = class222.field3158 >> 9;
                                    var12 = var7 >> 9;
                                    var13 = var8 >> 9;
                                    if (var12 > var10) {
                                       var14 = -var10 + var12;
                                       if (!var1) {
                                          break label212;
                                       }
                                    }

                                    var14 = -var12 + var10;
                                 }

                                 label207: {
                                    if (~var11 <= ~var13) {
                                       var15 = -var13 + var11;
                                       if (!var1) {
                                          break label207;
                                       }
                                    }

                                    var15 = var13 - var11;
                                 }

                                 if ((var14 != 0 || var15 != 0) && ~var14 < ~(-class234.field3626) && var14 < class234.field3626 && -class209.field2989 < var15 && class209.field2989 > var15) {
                                    if (var15 < var14) {
                                       var18 = var15 * 65536 / var14;
                                       var19 = 32768;
                                       if (var1) {
                                          var10000 = var10;
                                          var10001 = var12;
                                       } else {
                                          if (var10 == var12) {
                                             return;
                                          }

                                          var10000 = var10;
                                          var10001 = var12;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 >= var10001) {
                                                if (var10 > var12) {
                                                   --var10;
                                                   if (var1) {
                                                      ++var10;
                                                   }
                                                }
                                             } else {
                                                ++var10;
                                             }

                                             if ((class644.field9070[class128.field2049][var10][var11] & 4) != 0) {
                                                class393.method3046(class324.field4826, 1, -92, false, var10, var11);
                                                return;
                                             }

                                             var19 += var18;
                                             if (var19 < 65536) {
                                                break;
                                             }

                                             var19 -= 65536;
                                             var10000 = var11;
                                             var10001 = var13;
                                             if (!var1) {
                                                if (var11 < var13) {
                                                   ++var11;
                                                   if (var1 && ~var11 < ~var13) {
                                                      --var11;
                                                   }
                                                } else if (~var11 < ~var13) {
                                                   --var11;
                                                }

                                                if ((4 & class644.field9070[class128.field2049][var10][var11]) != 0) {
                                                   class393.method3046(class324.field4826, 1, arg0 ^ -83, false, var10, var11);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (var10 == var12) {
                                             return;
                                          }

                                          var10000 = var10;
                                          var10001 = var12;
                                       }
                                    }

                                    var16 = var14 * 65536 / var15;
                                    var17 = 32768;
                                    if (var1) {
                                       var10000 = var11;
                                       var10001 = var13;
                                    } else {
                                       if (var11 == var13) {
                                          return;
                                       }

                                       var10000 = var11;
                                       var10001 = var13;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (var10000 >= var10001) {
                                             if (~var11 < ~var13) {
                                                --var11;
                                                if (var1) {
                                                   ++var11;
                                                }
                                             }
                                          } else {
                                             ++var11;
                                          }

                                          if ((4 & class644.field9070[class128.field2049][var10][var11]) != 0) {
                                             class393.method3046(class324.field4826, 1, arg0 + -159, false, var10, var11);
                                             return;
                                          }

                                          var17 += var16;
                                          if (var17 < 65536) {
                                             break;
                                          }

                                          var10000 = ~var12;
                                          var10001 = ~var10;
                                          if (!var1) {
                                             if (var10000 >= var10001) {
                                                if (var10 > var12) {
                                                   --var10;
                                                   if (var1) {
                                                      ++var10;
                                                   }
                                                }
                                             } else {
                                                ++var10;
                                             }

                                             var17 -= 65536;
                                             if (~(class644.field9070[class128.field2049][var10][var11] & 4) != -1) {
                                                class393.method3046(class324.field4826, 1, arg0 ^ -98, false, var10, var11);
                                                return;
                                             }
                                             break;
                                          }
                                       }

                                       if (var11 == var13) {
                                          return;
                                       }

                                       var10000 = var11;
                                       var10001 = var13;
                                    }
                                 }

                                 class117.method1138(arg0 + 65, field6413[4] + var10 + "," + var11 + " " + var12 + "," + var13 + " " + class115.field1824 + "," + class480.field6903, (Throwable)null);
                                 return;
                              }
                           }

                           ++var6;
                        }
                     }
                  } else {
                     var10000 = 0;
                  }

                  var5 = var10000;
                  if (var1) {
                     class643.field9050[var4][var3][var5] = var2;
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field6413[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Lcu;Z)V"
   )
   public final void method3401(class65 arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         int var4;
         label118: {
            ++field6412;
            var4 = arg0.method665(false);
            if (class476.field6870.field9128.method2605(-107) == 1 && ~class513.field7285.method203() < -1) {
               label109: {
                  if ((var4 & 1) == 0) {
                     this.field6399 = class72.field1170;
                     if (!var3) {
                        break label109;
                     }
                  }

                  this.field6399 = arg0.method701(255);
               }

               label104: {
                  if ((var4 & 2) == 0) {
                     this.field6410 = 1.1523438F;
                     if (!var3) {
                        break label104;
                     }
                  }

                  this.field6410 = (float)arg0.method685(-2) / 256.0F;
               }

               label99: {
                  if ((var4 & 4) != 0) {
                     this.field6398 = (float)arg0.method685(-2) / 256.0F;
                     if (!var3) {
                        break label99;
                     }
                  }

                  this.field6398 = 0.69921875F;
               }

               if (~(8 & var4) != -1) {
                  this.field6393 = (float)arg0.method685(-2) / 256.0F;
                  if (!var3) {
                     break label118;
                  }
               }

               this.field6393 = 1.2F;
               if (!var3) {
                  break label118;
               }
            }

            if (~(1 & var4) != -1) {
               arg0.method701(255);
            }

            if ((var4 & 2) != 0) {
               arg0.method685(-2);
            }

            if ((4 & var4) != 0) {
               arg0.method685(-2);
            }

            if (~(var4 & 8) != -1) {
               arg0.method685(-2);
            }

            this.field6410 = 1.1523438F;
            this.field6399 = class72.field1170;
            this.field6393 = 1.2F;
            this.field6398 = 0.69921875F;
         }

         label89: {
            if (~(16 & var4) == -1) {
               this.field6405 = -50;
               this.field6403 = -60;
               this.field6396 = -50;
               if (!var3) {
                  break label89;
               }
            }

            this.field6405 = arg0.method655((byte)107);
            this.field6403 = arg0.method655((byte)85);
            this.field6396 = arg0.method655((byte)117);
         }

         label84: {
            if ((var4 & 32) != 0) {
               this.field6391 = arg0.method701(255);
               if (!var3) {
                  break label84;
               }
            }

            this.field6391 = class521.field7330;
         }

         label79: {
            if ((var4 & 64) != 0) {
               this.field6394 = arg0.method685(-2);
               if (!var3) {
                  break label79;
               }
            }

            this.field6394 = 0;
         }

         if (arg1) {
            if ((var4 & 128) == 0) {
               this.field6404 = class701.field10096;
            } else {
               int var5 = arg0.method685(-2);
               int var6 = arg0.method685(-2);
               int var7 = arg0.method685(-2);
               int var8 = arg0.method685(-2);
               int var9 = arg0.method685(-2);
               int var10 = arg0.method685(-2);
               this.field6404 = class700.method5115(var10, var5, var7, var8, (byte)-117, var6, var9);
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6413[9] + (arg0 != null ? field6413[0] : field6413[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3402(int arg0) {
      try {
         if (arg0 != 32) {
            field6409 = null;
         }

         field6409 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6413[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method3403(class65 arg0, int arg1) {
      try {
         ++field6395;
         int var3 = arg0.method685(-2);
         int var4 = arg0.method655((byte)93);
         if (arg1 > -48) {
            this.method3401((class65)null, true);
         }

         int var5 = arg0.method655((byte)93);
         int var6 = arg0.method655((byte)110);
         int var7 = arg0.method685(-2);
         class635.field8995 = var7;
         this.field6411 = class199.method1742(var4, var3, var6, (byte)-24, var5);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6413[8] + (arg0 != null ? field6413[0] : field6413[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3404(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3405(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kn",
      name = "<init>",
      descriptor = "()V"
   )
   public class437() {
      try {
         this.field6403 = -60;
         this.field6404 = class701.field10096;
         this.field6399 = class72.field1170;
         this.field6405 = -50;
         this.field6394 = 0;
         this.field6411 = class689.field9928;
         this.field6396 = -50;
         this.field6393 = 1.2F;
         this.field6410 = 1.1523438F;
         this.field6398 = 0.69921875F;
         this.field6391 = class521.field7330;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6413[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class437(class65 arg0) {
      try {
         this.method3401(arg0, true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6413[6] + (arg0 != null ? field6413[0] : field6413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3406(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3407(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
