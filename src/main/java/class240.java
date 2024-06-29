import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class240 {
   @OriginalMember(
      owner = "client!uu",
      name = "c",
      descriptor = "I"
   )
   public int field3699 = 1;
   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3700 = new String[]{method2109(method2108("6\u0006f\u0006")), method2109(method2108("-\u0006$+\u0010")), method2109(method2108("#]$DE")), method2109(method2108("-\u0006$)\u0010")), method2109(method2108("-\u0006$(\u0010")), method2109(method2108("-\u0006$.\u0010"))};
   @OriginalMember(
      owner = "client!uu",
      name = "g",
      descriptor = "I"
   )
   public static int field3693 = 1;
   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "C"
   )
   public char field3698;
   @OriginalMember(
      owner = "client!uu",
      name = "e",
      descriptor = "I"
   )
   public static int field3692;
   @OriginalMember(
      owner = "client!uu",
      name = "b",
      descriptor = "I"
   )
   public static int field3694;
   @OriginalMember(
      owner = "client!uu",
      name = "f",
      descriptor = "I"
   )
   public static int field3695;
   @OriginalMember(
      owner = "client!uu",
      name = "h",
      descriptor = "I"
   )
   public static int field3696;
   @OriginalMember(
      owner = "client!uu",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field3697;

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2104(int arg0, int arg1) {
      try {
         ++field3694;
         if (arg0 != 512) {
            method2107(-121, -15, false, -127, (byte)86);
         }

         return ~arg1 <= -1 && ~arg1 >= -4 || ~arg1 == -10;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3700[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(Lcu;BI)V"
   )
   private final void method2105(class65 arg0, byte arg1, int arg2) {
      try {
         label30: {
            if (~arg2 == -2) {
               this.field3698 = class571.method4230(arg0.method638(true), 73);
               if (!client.field10022) {
                  break label30;
               }
            }

            if (arg2 == 2) {
               this.field3699 = 0;
            }
         }

         ++field3696;
         if (arg1 >= -121) {
            this.method2106((class65)null, (byte)84);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3700[4] + (arg0 != null ? field3700[2] : field3700[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public final void method2106(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != -56) {
            this.field3699 = 124;
         }

         ++field3695;

         do {
            int var4 = arg0.method665(false);
            if (~var4 == -1) {
               break;
            }

            this.method2105(arg0, (byte)-123, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3700[1] + (arg0 != null ? field3700[2] : field3700[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(IIZIB)V"
   )
   public static final void method2107(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
      boolean var5 = client.field10022;

      try {
         ++field3692;
         if (arg2 || ~class2.field18 != ~arg0 || class130.field2098 != arg3 || ~class697.field10057 != ~class128.field2049 && ~class476.field6870.field9133.method2232(-75) != -2) {
            class2.field18 = arg0;
            class697.field10057 = class128.field2049;
            class130.field2098 = arg3;
            if (~class476.field6870.field9133.method2232(-77) == -2) {
               class697.field10057 = 0;
            }

            int var8;
            int var9;
            int var10000;
            label437: {
               class755.method5457(arg1, false);
               class644.method4685(class383.field5587, class765.field10915.method5512(-2, class777.field11340), (byte)-39, true, class510.field7243, class54.field794);
               int var6 = class115.field1824;
               int var7 = class480.field6903;
               class115.field1824 = (-(class234.field3626 >> 4) + class2.field18) * 8;
               class480.field6903 = (-(class209.field2989 >> 4) + class130.field2098) * 8;
               class290.field4331 = class651.method4766(class2.field18 * 8, class130.field2098 * 8);
               class378.field5525 = null;
               var8 = class115.field1824 - var6;
               var9 = class480.field6903 - var7;
               if (arg1 != 12) {
                  boolean var10 = false;
                  class261.field3995 = 0;
                  int var11 = (class234.field3626 + -1) * 512;
                  int var12 = (class209.field2989 + -1) * 512;
                  int var13 = 0;
                  if (var5 || var13 < class157.field2391) {
                     do {
                        class432 var14 = class270.field4135[var13];
                        if (var14 == null) {
                           ++var13;
                        } else {
                           class799 var15 = var14.field6345;
                           var15.field6832 -= var8 * 512;
                           var15.field6833 -= var9 * 512;
                           if (~var15.field6832 <= -1 && ~var15.field6832 >= ~var11 && var15.field6833 >= 0 && var12 >= var15.field6833) {
                              label405: {
                                 byte var16 = 1;
                                 int var17 = 0;
                                 if (var5) {
                                    var15.field5861[var17] -= var8;
                                    var15.field5865[var17] -= var9;
                                    var10000 = ~var15.field5861[var17];
                                 } else if (var17 >= 10) {
                                    var10000 = var16;
                                    if (!var5) {
                                       break label405;
                                    }
                                 } else {
                                    var15.field5861[var17] -= var8;
                                    var15.field5865[var17] -= var9;
                                    var10000 = ~var15.field5861[var17];
                                 }

                                 while(true) {
                                    if (var10000 <= -1) {
                                       if (~var15.field5861[var17] > ~class234.field3626) {
                                          if (~var15.field5865[var17] <= -1) {
                                             if (~var15.field5865[var17] <= ~class209.field2989) {
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

                                    if (var17 >= 10) {
                                       var10000 = var16;
                                       if (!var5) {
                                          break;
                                       }
                                    } else {
                                       var15.field5861[var17] -= var8;
                                       var15.field5865[var17] -= var9;
                                       var10000 = ~var15.field5861[var17];
                                    }
                                 }
                              }

                              if (var10000 != 0) {
                                 class344.field5068[class261.field3995++] = var15.field5826;
                                 if (!var5) {
                                    ++var13;
                                    continue;
                                 }
                              }

                              var15.method5757((class302)null, (byte)-90);
                              var10 = true;
                              var14.method2140((byte)90);
                              if (!var5) {
                                 ++var13;
                                 continue;
                              }
                           }

                           var15.method5757((class302)null, (byte)-90);
                           var14.method2140((byte)-84);
                           var10 = true;
                           ++var13;
                        }
                     } while(var13 < class157.field2391);
                  }

                  if (!var10) {
                     break label437;
                  }

                  class157.field2391 = class573.field8110.method3093(0);
                  class573.field8110.method3094(116, class270.field4135);
                  if (!var5) {
                     break label437;
                  }
               }

               int var18 = 0;
               if (var5 || var18 < class157.field2391) {
                  do {
                     class432 var19 = class270.field4135[var18];
                     if (var19 == null) {
                        ++var18;
                     } else {
                        class799 var20 = var19.field6345;
                        int var21 = 0;
                        if (var5) {
                           var20.field5861[var21] -= var8;
                           var20.field5865[var21] -= var9;
                           ++var21;
                        }

                        while(true) {
                           while(var21 < 10) {
                              var20.field5861[var21] -= var8;
                              var20.field5865[var21] -= var9;
                              ++var21;
                           }

                           var20.field6832 -= var8 * 512;
                           if (!var5) {
                              var20.field6833 -= var9 * 512;
                              ++var18;
                              break;
                           }

                           var20.field5865[var21] -= var9;
                           ++var21;
                        }
                     }
                  } while(var18 < class157.field2391);
               }
            }

            int var22 = 0;
            if (var5 || var22 < 2048) {
               do {
                  class158 var23 = class501.field7137[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5) {
                        var23.field5861[var24] -= var8;
                        var23.field5865[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(~var24 > -11) {
                           var23.field5861[var24] -= var8;
                           var23.field5865[var24] -= var9;
                           ++var24;
                        }

                        var23.field6833 -= var9 * 512;
                        if (!var5) {
                           var23.field6832 -= var8 * 512;
                           ++var22;
                           break;
                        }

                        var23.field5865[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(var22 < 2048);
            }

            class343[] var25 = class645.field9076;
            int var26 = 0;
            class343 var27;
            if (var5) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field5056 -= var9 * 512;
                  var27.field5053 -= var8 * 512;
               }

               ++var26;
            }

            while(~var25.length < ~var26) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field5056 -= var9 * 512;
                  var27.field5053 -= var8 * 512;
               }

               ++var26;
            }

            class523 var28;
            label210: {
               var28 = (class523)class637.field9006.method2245((byte)-94);
               if (var5) {
                  var28.field7399 -= var9;
                  var28.field7398 -= var8;
               } else if (var28 == null) {
                  var28 = (class523)class460.field6702.method2245((byte)-94);
                  if (!var5) {
                     break label210;
                  }
               } else {
                  var28.field7399 -= var9;
                  var28.field7398 -= var8;
               }

               while(true) {
                  if (~class22.field325 != -5) {
                     if (var28.field7398 >= 0) {
                        if (~var28.field7399 <= -1) {
                           if (~var28.field7398 > ~class234.field3626) {
                              if (~var28.field7399 <= ~class209.field2989) {
                                 var28.method2140((byte)121);
                              }
                           } else {
                              var28.method2140((byte)121);
                           }
                        } else {
                           var28.method2140((byte)121);
                        }
                     } else {
                        var28.method2140((byte)121);
                     }
                  }

                  var28 = (class523)class637.field9006.method2239((byte)112);
                  if (var28 == null) {
                     var28 = (class523)class460.field6702.method2245((byte)-94);
                     if (!var5) {
                        break;
                     }
                  } else {
                     var28.field7399 -= var9;
                     var28.field7398 -= var8;
                  }
               }
            }

            if (var5) {
               var28.field7399 -= var9;
               var28.field7398 -= var8;
               if (class22.field325 != 4) {
                  if (var28.field7398 >= 0) {
                     if (~var28.field7399 <= -1) {
                        if (~var28.field7398 > ~class234.field3626) {
                           if (~var28.field7399 <= ~class209.field2989) {
                              var28.method2140((byte)-79);
                           }
                        } else {
                           var28.method2140((byte)-79);
                        }
                     } else {
                        var28.method2140((byte)-79);
                     }
                  } else {
                     var28.method2140((byte)-79);
                  }
               }

               var28 = (class523)class460.field6702.method2239((byte)106);
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = ~class22.field325;
                  var10001 = -5;
                  if (!var5) {
                     if (var10000 != -5) {
                        class279 var29 = (class279)class216.field3081.method3102(121);
                        if (var5 || var29 != null) {
                           do {
                              int var30 = (int)(var29.field3777 & 16383L);
                              int var31 = var30 - class115.field1824;
                              int var32 = (int)(16383L & var29.field3777 >> 14);
                              int var33 = -class480.field6903 + var32;
                              if (~var31 > -1 || var33 < 0 || ~var31 <= ~class234.field3626 || class209.field2989 <= var33) {
                                 var29.method2140((byte)-108);
                              }

                              var29 = (class279)class216.field3081.method3095((byte)-118);
                           } while(var29 != null);
                        }
                     }

                     if (class269.field4123 != 0) {
                        class269.field4123 -= var8;
                        class522.field7355 -= var9;
                     }

                     class415.method3245((byte)-126);
                     if (arg4 < 4) {
                        method2107(57, 102, false, 44, (byte)-46);
                     }

                     label454: {
                        if (~arg1 == -13) {
                           if (~class306.field4639 != -5) {
                              class27.field402 = -1;
                              class555.field7892 = -1;
                              class306.field4639 = 1;
                              if (!var5) {
                                 break label454;
                              }
                           }

                           class779.field11378 -= var8 * 512;
                           class704.field10131 -= var8 * 512;
                           class576.field8140 -= var9 * 512;
                           class232.field3606 -= var9 * 512;
                           if (!var5) {
                              break label454;
                           }
                        }

                        class222.field3158 -= var9 * 512;
                        class670.field9407 -= var8 * 512;
                        class768.field11025 -= var9;
                        class155.field2379 -= var9;
                        class494.field7054 -= var8;
                        class268.field4118 -= var8;
                        if (~Math.abs(var8) < ~class234.field3626 || Math.abs(var9) > class209.field2989) {
                           class215.method1854((byte)-126);
                        }
                     }

                     class783.method5653((byte)14);
                     class762.method5498(-116);
                     class801.field11657.method2237(58);
                     class80.field1259.method2237(90);
                     class784.field11424.method3306(0);
                     class657.method4789(-30426);
                     return;
                  }
               } else {
                  var28.field7399 -= var9;
                  var28.field7398 -= var8;
                  var10000 = class22.field325;
                  var10001 = 4;
               }

               if (var10000 != var10001) {
                  if (var28.field7398 >= 0) {
                     if (~var28.field7399 <= -1) {
                        if (~var28.field7398 > ~class234.field3626) {
                           if (~var28.field7399 <= ~class209.field2989) {
                              var28.method2140((byte)-79);
                           }
                        } else {
                           var28.method2140((byte)-79);
                        }
                     } else {
                        var28.method2140((byte)-79);
                     }
                  } else {
                     var28.method2140((byte)-79);
                  }
               }

               var28 = (class523)class460.field6702.method2239((byte)106);
            }
         }
      } catch (RuntimeException var35) {
         throw class612.method4503(var35, field3700[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
