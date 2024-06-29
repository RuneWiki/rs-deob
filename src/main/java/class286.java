import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class286 extends class331 {
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "Z"
   )
   private boolean field4022;
   @OriginalMember(
      owner = "client!wd",
      name = "y",
      descriptor = "Z"
   )
   private boolean field4018;
   @OriginalMember(
      owner = "client!wd",
      name = "B",
      descriptor = "[Lcea;"
   )
   private class223[] field4016;
   @OriginalMember(
      owner = "client!wd",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4025 = new String[]{method2183(method2182("J\u0016e~A")), method2183(method2182("J\u0016etA")), method2183(method2182("J\u0016e}A")), method2183(method2182("J\u0016efA")), method2183(method2182("F\\e\u0018\u0014")), method2183(method2182("S\u0007'Z")), method2183(method2182("J\u0016epA")), method2183(method2182("J\u0016e{A")), method2183(method2182("J\u0016exA")), method2183(method2182("J\u0016e|A")), method2183(method2182("J\u0016eyA")), method2183(method2182("J\u0016e\u007fA")), method2183(method2182("J\u0016e\n\u0000S\u001b?\bA"))};
   @OriginalMember(
      owner = "client!wd",
      name = "p",
      descriptor = "[Lpl;"
   )
   public static class676[] field4012 = new class676[14];
   @OriginalMember(
      owner = "client!wd",
      name = "n",
      descriptor = "Lsd;"
   )
   public static class101 field4019 = new class101(66, -2);
   @OriginalMember(
      owner = "client!wd",
      name = "o",
      descriptor = "I"
   )
   public static int field4024 = 0;
   @OriginalMember(
      owner = "client!wd",
      name = "v",
      descriptor = "I"
   )
   public static int field4010;
   @OriginalMember(
      owner = "client!wd",
      name = "A",
      descriptor = "I"
   )
   public static int field4011;
   @OriginalMember(
      owner = "client!wd",
      name = "w",
      descriptor = "I"
   )
   public static int field4013;
   @OriginalMember(
      owner = "client!wd",
      name = "x",
      descriptor = "I"
   )
   public static int field4014;
   @OriginalMember(
      owner = "client!wd",
      name = "t",
      descriptor = "I"
   )
   public static int field4015;
   @OriginalMember(
      owner = "client!wd",
      name = "s",
      descriptor = "I"
   )
   public static int field4017;
   @OriginalMember(
      owner = "client!wd",
      name = "u",
      descriptor = "I"
   )
   public static int field4020;
   @OriginalMember(
      owner = "client!wd",
      name = "r",
      descriptor = "I"
   )
   public static int field4021;
   @OriginalMember(
      owner = "client!wd",
      name = "q",
      descriptor = "I"
   )
   public static int field4023;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IILuha;)V",
      line = 3
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         ++field4020;
         super.field4745.method2578(arg2, true);
         if (arg0 != 0) {
            field4024 = -108;
         }

         super.field4745.method2649((byte)119, arg1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4025[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4025[4] : field4025[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(BI)Lkga;",
      line = 19
   )
   public static final class571 method2178(byte arg0, int arg1) {
      try {
         ++field4015;
         class571 var2 = (class571)class222.field2845.method5454((long)arg1, arg0 ^ -18196);
         if (var2 != null) {
            return var2;
         } else {
            if (arg0 != -71) {
               method2179((byte)115);
            }

            byte[] var3 = class534.field7795.method3899(-58, arg1, 0);
            class571 var4 = new class571();
            if (var3 != null) {
               var4.method4235(arg1, 90, new class128(var3));
            }

            class222.field2845.method5455(-2049, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4025[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "(B)V",
      line = 51
   )
   public static void method2179(byte arg0) {
      try {
         int var1 = 55 / ((37 - arg0) / 63);
         field4019 = null;
         field4012 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4025[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "(I)V",
      line = 61
   )
   public final void method411(int arg0) {
      int var2 = client.field4530;

      try {
         ++field4021;
         if (arg0 <= -21) {
            label29: {
               if (this.field4022) {
                  label26: {
                     super.field4745.method2574(85, 1);
                     super.field4745.method2578((class254)null, true);
                     super.field4745.method2635(class50.field605, true);
                     super.field4745.method2652(-13410);
                     if (this.field4018) {
                        super.field4745.method2568(class556.field8257, class556.field8257, false);
                        super.field4745.method2636(-112, 0, class496.field7336);
                        super.field4745.method2662(true, class496.field7336, 0);
                        if (var2 == 0) {
                           break label26;
                        }
                     }

                     super.field4745.method2568(class556.field8257, class556.field8257, false);
                     super.field4745.method2636(-122, 0, class496.field7336);
                     super.field4745.method2574(122, 2);
                     super.field4745.method2568(class556.field8257, class556.field8257, false);
                     super.field4745.method2636(-116, 0, class496.field7336);
                     super.field4745.method2636(-102, 1, class309.field4402);
                     super.field4745.method2662(true, class496.field7336, 0);
                     super.field4745.method2578((class254)null, true);
                  }

                  super.field4745.method2574(67, 0);
                  this.field4022 = false;
                  if (var2 == 0) {
                     break label29;
                  }
               }

               super.field4745.method2662(true, class496.field7336, 0);
            }

            super.field4745.method2568(class556.field8257, class556.field8257, false);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4025[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "<init>",
      descriptor = "(Ldh;)V",
      line = 102
   )
   public class286(class338 arg0) {
      int var2 = client.field4530;
      super(arg0);
      this.field4022 = false;

      try {
         if (arg0.field5056) {
            this.field4018 = arg0.field5055 < 3;
            int var3 = this.field4018 ? 48 : 127;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (var2 == 0 && var8 >= 64) {
               this.field4016 = new class223[3];
               this.field4016[0] = super.field4745.method2580(64, false, var5, -4944);
               this.field4016[1] = super.field4745.method2580(64, false, var6, -4944);
               this.field4016[2] = super.field4745.method2580(64, false, var4, -4944);
            } else {
               do {
                  int var9 = 0;
                  if (var2 != 0 || ~var9 > -65) {
                     do {
                        label297: {
                           float var10 = (float)var8 * 2.0F / 64.0F - 1.0F;
                           float var11 = (float)var9 * 2.0F / 64.0F + -1.0F;
                           float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + 1.0F)));
                           float var13 = var10 * var12;
                           float var14 = var11 * var12;
                           int var15 = 0;
                           float var16;
                           if (var2 != 0) {
                              if (~var15 != -1) {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 != -4) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2 != 0) {
                                                var16 = -var12;
                                                if (var2 != 0) {
                                                   var16 = -var13;
                                                   if (var2 != 0) {
                                                      var16 = var13;
                                                      if (var2 != 0) {
                                                         var16 = var14;
                                                         if (var2 != 0) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                          if (var2 != 0) {
                                             var16 = var13;
                                             if (var2 != 0) {
                                                var16 = var14;
                                                if (var2 != 0) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2 != 0) {
                                          var16 = var14;
                                          if (var2 != 0) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                    if (var2 != 0) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = -var14;
                              }
                           } else if (var15 >= 6) {
                              ++var7;
                              if (var2 == 0) {
                                 break label297;
                              }

                              var16 = -var14;
                           } else if (~var15 != -1) {
                              if (~var15 != -2) {
                                 if (~var15 != -3) {
                                    if (~var15 != -4) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2 != 0) {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2 != 0) {
                                             var16 = -var13;
                                             if (var2 != 0) {
                                                var16 = var13;
                                                if (var2 != 0) {
                                                   var16 = var14;
                                                   if (var2 != 0) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                       if (var2 != 0) {
                                          var16 = var13;
                                          if (var2 != 0) {
                                             var16 = var14;
                                             if (var2 != 0) {
                                                var16 = -var14;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                    if (var2 != 0) {
                                       var16 = var14;
                                       if (var2 != 0) {
                                          var16 = -var14;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var14;
                                 if (var2 != 0) {
                                    var16 = -var14;
                                 }
                              }
                           } else {
                              var16 = -var14;
                           }

                           while(true) {
                              int var22;
                              int var23;
                              int var24;
                              if (!(var16 > 0.0F)) {
                                 byte var17 = 0;
                                 byte var18 = 0;
                                 byte var19 = 0;
                                 if (var2 != 0) {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 } else {
                                    var5[var15][var7] = var19 << 24;
                                    var6[var15][var7] = var18 << 24;
                                    var4[var15][var7] = var17 << 24;
                                    ++var15;
                                 }
                              } else {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              }

                              if (var15 >= 6) {
                                 ++var7;
                                 if (var2 == 0) {
                                    break;
                                 }

                                 var16 = -var14;
                              } else if (~var15 != -1) {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 != -4) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2 != 0) {
                                                var16 = -var12;
                                                if (var2 != 0) {
                                                   var16 = -var13;
                                                   if (var2 != 0) {
                                                      var16 = var13;
                                                      if (var2 != 0) {
                                                         var16 = var14;
                                                         if (var2 != 0) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                          if (var2 != 0) {
                                             var16 = var13;
                                             if (var2 != 0) {
                                                var16 = var14;
                                                if (var2 != 0) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2 != 0) {
                                          var16 = var14;
                                          if (var2 != 0) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                    if (var2 != 0) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = -var14;
                              }
                           }
                        }

                        ++var9;
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field4016 = new class223[3];
               this.field4016[0] = super.field4745.method2580(64, false, var5, -4944);
               this.field4016[1] = super.field4745.method2580(64, false, var6, -4944);
               this.field4016[2] = super.field4745.method2580(64, false, var4, -4944);
            }
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field4025[12] + (arg0 != null ? field4025[4] : field4025[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V",
      line = 214
   )
   public static final void method2180(String arg0, String arg1, String arg2, int arg3, int arg4, String arg5, int arg6) {
      try {
         ++field4010;
         class354.method2763(arg3, arg2, arg0, arg6, (String)null, arg1, true, arg5, -1);
         if (arg4 != 0) {
            field4012 = null;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4025[6] + (arg0 != null ? field4025[4] : field4025[5]) + ',' + (arg1 != null ? field4025[4] : field4025[5]) + ',' + (arg2 != null ? field4025[4] : field4025[5]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4025[4] : field4025[5]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(ZB)V",
      line = 227
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         ++field4017;
         if (arg1 != -102) {
            this.method412(8, 102, -41);
         }

         super.field4745.method2568(class556.field8257, class680.field10213, false);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4025[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(B)Z",
      line = 242
   )
   public final boolean method407(byte arg0) {
      try {
         ++field4014;
         if (arg0 <= 16) {
            method2178((byte)-54, 99);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4025[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(Lln;B)V",
      line = 254
   )
   public static final void method2181(class397 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IZ)V",
      line = 362
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         if (arg0 > 3) {
            ++field4023;
            if (this.field4016 != null && arg1) {
               label23: {
                  super.field4745.method2574(97, 1);
                  super.field4745.method2635(class448.field6808, true);
                  class495 var3 = super.field4745.method2616(-51);
                  var3.method1529(1024);
                  super.field4745.method2614(class180.field2210, 6);
                  if (!this.field4018) {
                     super.field4745.method2568(class680.field10213, class556.field8257, false);
                     super.field4745.method2636(-100, 0, class309.field4402);
                     super.field4745.method2574(107, 2);
                     super.field4745.method2568(class325.field4618, class680.field10213, false);
                     super.field4745.method2636(-106, 0, class309.field4402);
                     super.field4745.method2629(class309.field4402, -56, 1, false, true);
                     super.field4745.method2662(true, class219.field2784, 0);
                     super.field4745.method2578(super.field4745.field5042, true);
                     if (client.field4530 == 0) {
                        break label23;
                     }
                  }

                  super.field4745.method2568(class325.field4618, class680.field10213, false);
                  super.field4745.method2629(class496.field7336, -80, 0, false, true);
                  super.field4745.method2662(true, class219.field2784, 0);
               }

               super.field4745.method2574(125, 0);
               this.field4022 = true;
            } else {
               super.field4745.method2662(true, class219.field2784, 0);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4025[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(III)V",
      line = 408
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         ++field4013;
         if (this.field4022) {
            super.field4745.method2574(112, 1);
            super.field4745.method2578(this.field4016[arg0 + -1], true);
            super.field4745.method2574(42, 0);
         }

         if (arg1 != 9950) {
            method2178((byte)80, 93);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4025[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2182(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2183(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
