import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class495 {
   @OriginalMember(
      owner = "client!cq",
      name = "i",
      descriptor = "I"
   )
   private int field7174;
   @OriginalMember(
      owner = "client!cq",
      name = "o",
      descriptor = "Z"
   )
   public boolean field7170;
   @OriginalMember(
      owner = "client!cq",
      name = "d",
      descriptor = "Lsc;"
   )
   private class369 field7183;
   @OriginalMember(
      owner = "client!cq",
      name = "c",
      descriptor = "I"
   )
   private int field7172;
   @OriginalMember(
      owner = "client!cq",
      name = "s",
      descriptor = "I"
   )
   private int field7182;
   @OriginalMember(
      owner = "client!cq",
      name = "p",
      descriptor = "Lcia;"
   )
   private class640 field7173;
   @OriginalMember(
      owner = "client!cq",
      name = "q",
      descriptor = "Lfc;"
   )
   private class272 field7184;
   @OriginalMember(
      owner = "client!cq",
      name = "n",
      descriptor = "I"
   )
   public int field7176;
   @OriginalMember(
      owner = "client!cq",
      name = "t",
      descriptor = "I"
   )
   private int field7180;
   @OriginalMember(
      owner = "client!cq",
      name = "v",
      descriptor = "I"
   )
   private int field7177;
   @OriginalMember(
      owner = "client!cq",
      name = "u",
      descriptor = "Llba;"
   )
   private class576 field7168;
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7188 = new String[]{method3605(method3604("=n\u0002#$")), method3605(method3604("%1\u0002Kq")), method3605(method3604("0j@\t")), method3605(method3604("=n\u0002\"$")), method3605(method3604("=n\u0002'$")), method3605(method3604("=n\u0002Ye0vX[$")), method3605(method3604("=n\u0002$$")), method3605(method3604("=n\u0002 $")), method3605(method3604("=n\u0002!$")), method3605(method3604("=n\u0002&$"))};
   @OriginalMember(
      owner = "client!cq",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7175 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   @OriginalMember(
      owner = "client!cq",
      name = "r",
      descriptor = "Leg;"
   )
   public static class118 field7181 = new class118(140, 1);
   @OriginalMember(
      owner = "client!cq",
      name = "e",
      descriptor = "F"
   )
   public static float field7167;
   @OriginalMember(
      owner = "client!cq",
      name = "l",
      descriptor = "I"
   )
   public static int field7166;
   @OriginalMember(
      owner = "client!cq",
      name = "g",
      descriptor = "I"
   )
   public static int field7171;
   @OriginalMember(
      owner = "client!cq",
      name = "k",
      descriptor = "I"
   )
   public static int field7178;
   @OriginalMember(
      owner = "client!cq",
      name = "j",
      descriptor = "I"
   )
   public static int field7179;
   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "I"
   )
   public static int field7185;
   @OriginalMember(
      owner = "client!cq",
      name = "f",
      descriptor = "I"
   )
   public static int field7186;
   @OriginalMember(
      owner = "client!cq",
      name = "m",
      descriptor = "Lkf;"
   )
   public static class266 field7187;
   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7169;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Loh;BLoh;)V",
      line = 16
   )
   public static final void method3597(class428 arg0, byte arg1, class428 arg2) {
      try {
         ++field7186;
         if (arg2.field6130 != null) {
            arg2.method3165(arg1 ^ 36);
         }

         arg2.field6126 = arg0;
         if (arg1 != 92) {
            method3601(127L, -26);
         }

         arg2.field6130 = arg0.field6130;
         arg2.field6130.field6126 = arg2;
         arg2.field6126.field6130 = arg2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7188[8] + (arg0 != null ? field7188[1] : field7188[2]) + ',' + arg1 + ',' + (arg2 != null ? field7188[1] : field7188[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "c",
      descriptor = "(I)V",
      line = 33
   )
   public static void method3598(int arg0) {
      try {
         field7181 = null;
         if (arg0 != -1) {
            method3599(-46);
         }

         field7187 = null;
         field7175 = null;
         field7169 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7188[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "d",
      descriptor = "(I)V",
      line = 47
   )
   public static final void method3599(int arg0) {
      try {
         ++class584.field8651;
         ++field7185;
         class447 var1 = class40.method350(class690.field10158, class430.field6150.field106, true);
         var1.field6359.method1186(class713.method5178(-120), 0);
         var1.field6359.method1185(class237.field3310, true);
         var1.field6359.method1185(class692.field10185, true);
         if (arg0 == 1140850688) {
            var1.field6359.method1186(class300.field4107.field6421.method3555(116), 0);
            class430.field6150.method55(13256, var1);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7188[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "<init>",
      descriptor = "(Lsc;Lcia;Ldj;IIIII)V",
      line = 299
   )
   public class495(class369 param1, class640 param2, class363 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Llba;II)V",
      line = 70
   )
   public final void method3600(class576 arg0, int arg1, int arg2) {
      try {
         if (arg2 > 0) {
            this.method3603(-122);
            this.field7183.method2804(this.field7184, -2);
            this.field7183.method2628(arg0, (byte)-77, class394.field5700, arg2, 0, this.field7180, -this.field7180 + this.field7177 + 1);
         }

         if (arg1 < -120) {
            ++field7178;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7188[3] + (arg0 != null ? field7188[1] : field7188[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(JI)I",
      line = 91
   )
   public static final int method3601(long arg0, int arg1) {
      try {
         class111.method907((byte)-83, arg0);
         ++field7179;
         if (arg1 >= -26) {
            field7169 = null;
         }

         return class176.field2442.get(1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7188[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "(I)V",
      line = 107
   )
   public final void method3602(int arg0) {
      try {
         ++field7171;
         this.method3600(this.field7168, arg0 ^ -252, this.field7176);
         if (arg0 != 128) {
            method3599(-123);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7188[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(I)V",
      line = 127
   )
   private final void method3603(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field7166;
         if (this.field7170) {
            this.field7170 = false;
            byte[] var3 = this.field7173.field9342;
            byte var4 = 0;
            int var5 = this.field7173.field9358;
            int var6 = this.field7173.field9358 * this.field7182 + this.field7172;
            int var7 = -128;
            int var8;
            int var9;
            int var10;
            byte[] var11;
            int var12;
            int var13;
            int var14;
            int[] var15;
            int var10000;
            int var16;
            int var10001;
            int var17;
            int var18;
            int var21;
            if (var2) {
               var21 = -var4 + (var4 << 8);
               var8 = -128;
               if (var2) {
                  if (var3[var6++] != 0) {
                     ++var21;
                  }

                  ++var8;
               }
            } else {
               if (~var7 <= -1) {
                  var10000 = arg0;
                  var10001 = -5;
                  if (!var2) {
                     if (arg0 > -5) {
                        this.field7170 = true;
                     }

                     if (this.field7184 != null && this.field7174 == var4) {
                        this.field7170 = false;
                        return;
                     }

                     this.field7174 = var4;
                     var9 = 0;
                     var10 = this.field7182 * var5 + this.field7172;
                     if (this.field7183.method2636(true, class301.field4117, class46.field621)) {
                        if (class284.field3930 == null) {
                           class284.field3930 = new byte[16384];
                        }

                        var11 = class284.field3930;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field7184 == null) {
                              this.field7184 = this.field7183.method2743(128, false, class46.field621, class284.field3930, -5, 128);
                              this.field7184.method277(true, false, false);
                              return;
                           }

                           this.field7184.method276(128, 128, class46.field621, -8262, 0, 0, class284.field3930, 128, 0);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var10] != 0) {
                                 var11[var9++] = 68;
                                 if (var2) {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 } else {
                                    ++var10;
                                    ++var13;
                                 }
                              } else {
                                 var14 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var10] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var5 + var10] != -1) {
                                    ++var14;
                                 }

                                 var11[var9++] = (byte)(var14 * 17);
                                 ++var10;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (var3[var10] != 0) {
                                    var11[var9++] = 68;
                                    if (var2) {
                                       var14 = 0;
                                       if (~var3[var10 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var10 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var10] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }

                                       var11[var9++] = (byte)(var14 * 17);
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              var10 += this.field7173.field9358 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var14 = 0;
                              if (~var3[var10 + -1] != -1) {
                                 ++var14;
                              }

                              if (var3[var10 + 1] != 0) {
                                 ++var14;
                              }

                              if (var3[-var5 + var10] != 0) {
                                 ++var14;
                              }

                              if (~var3[var5 + var10] != -1) {
                                 ++var14;
                              }

                              var11[var9++] = (byte)(var14 * 17);
                              ++var10;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field7184 == null) {
                           this.field7184 = this.field7183.method2743(128, false, class46.field621, class284.field3930, -5, 128);
                           this.field7184.method277(true, false, false);
                           return;
                        }

                        this.field7184.method276(128, 128, class46.field621, -8262, 0, 0, class284.field3930, 128, 0);
                        return;
                     }

                     if (class149.field2066 == null) {
                        class149.field2066 = new int[16384];
                     }

                     var15 = class149.field2066;
                     var16 = -128;
                     if (!var2 && ~var16 <= -1) {
                        if (this.field7184 == null) {
                           this.field7184 = this.field7183.method2759(false, 128, 0, class149.field2066, 128);
                           this.field7184.method277(true, false, false);
                           return;
                        }

                        this.field7184.method281((byte)-2, class149.field2066, 0, 128, 0, 0, 128, 128);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (var3[var10] == 0) {
                              var18 = 0;
                              if (~var3[var10 + -1] != -1) {
                                 ++var18;
                              }

                              if (~var3[var10 - -1] != -1) {
                                 ++var18;
                              }

                              if (var3[-var5 + var10] != 0) {
                                 ++var18;
                                 if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }
                              } else if (var3[var10 - -var5] != 0) {
                                 ++var18;
                              }

                              var15[var9++] = var18 * 17 << 24;
                              if (var2) {
                                 var15[var9++] = 1140850688;
                                 ++var10;
                                 ++var17;
                              } else {
                                 ++var10;
                                 ++var17;
                              }
                           } else {
                              var15[var9++] = 1140850688;
                              ++var10;
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var17 > -1) {
                              if (var3[var10] == 0) {
                                 var18 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[var10 - -1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var10] != 0) {
                                    ++var18;
                                    if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }

                                 var15[var9++] = var18 * 17 << 24;
                                 if (var2) {
                                    var15[var9++] = 1140850688;
                                    ++var10;
                                    ++var17;
                                 } else {
                                    ++var10;
                                    ++var17;
                                 }
                              } else {
                                 var15[var9++] = 1140850688;
                                 ++var10;
                                 ++var17;
                              }
                           }

                           var10 += this.field7173.field9358 - 128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var15[var9++] = 1140850688;
                           ++var10;
                           ++var17;
                        }
                     } while(~var16 > -1);

                     if (this.field7184 == null) {
                        this.field7184 = this.field7183.method2759(false, 128, 0, class149.field2066, 128);
                        this.field7184.method277(true, false, false);
                        return;
                     }

                     this.field7184.method281((byte)-2, class149.field2066, 0, 128, 0, 0, 128, 128);
                     return;
                  }
               } else {
                  var10000 = -var4;
                  var10001 = var4 << 8;
               }

               var21 = var10000 + var10001;
               var8 = -128;
               if (var2) {
                  if (var3[var6++] != 0) {
                     ++var21;
                  }

                  ++var8;
               }
            }

            while(true) {
               while(~var8 > -1) {
                  if (var3[var6++] != 0) {
                     ++var21;
                  }

                  ++var8;
               }

               var6 += var5 + -128;
               if (!var2) {
                  ++var7;
                  if (~var7 <= -1) {
                     var10000 = arg0;
                     var10001 = -5;
                     if (!var2) {
                        if (arg0 > -5) {
                           this.field7170 = true;
                        }

                        if (this.field7184 != null && this.field7174 == var21) {
                           this.field7170 = false;
                           return;
                        }

                        this.field7174 = var21;
                        var9 = 0;
                        var10 = this.field7182 * var5 + this.field7172;
                        if (this.field7183.method2636(true, class301.field4117, class46.field621)) {
                           if (class284.field3930 == null) {
                              class284.field3930 = new byte[16384];
                           }

                           var11 = class284.field3930;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field7184 == null) {
                                 this.field7184 = this.field7183.method2743(128, false, class46.field621, class284.field3930, -5, 128);
                                 this.field7184.method277(true, false, false);
                                 return;
                              }

                              this.field7184.method276(128, 128, class46.field621, -8262, 0, 0, class284.field3930, 128, 0);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (var3[var10] != 0) {
                                    var11[var9++] = 68;
                                    if (var2) {
                                       var14 = 0;
                                       if (~var3[var10 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var10 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var10] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }

                                       var11[var9++] = (byte)(var14 * 17);
                                       ++var10;
                                       ++var13;
                                    } else {
                                       ++var10;
                                       ++var13;
                                    }
                                 } else {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var10 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var10] != -1) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    ++var10;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(~var13 > -1) {
                                    if (var3[var10] != 0) {
                                       var11[var9++] = 68;
                                       if (var2) {
                                          var14 = 0;
                                          if (~var3[var10 + -1] != -1) {
                                             ++var14;
                                          }

                                          if (var3[var10 + 1] != 0) {
                                             ++var14;
                                          }

                                          if (var3[-var5 + var10] != 0) {
                                             ++var14;
                                          }

                                          if (~var3[var5 + var10] != -1) {
                                             ++var14;
                                          }

                                          var11[var9++] = (byte)(var14 * 17);
                                          ++var10;
                                          ++var13;
                                       } else {
                                          ++var10;
                                          ++var13;
                                       }
                                    } else {
                                       var14 = 0;
                                       if (~var3[var10 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var10 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var10] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var10] != -1) {
                                          ++var14;
                                       }

                                       var11[var9++] = (byte)(var14 * 17);
                                       ++var10;
                                       ++var13;
                                    }
                                 }

                                 var10 += this.field7173.field9358 + -128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var14 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[var10 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var10] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var5 + var10] != -1) {
                                    ++var14;
                                 }

                                 var11[var9++] = (byte)(var14 * 17);
                                 ++var10;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field7184 == null) {
                              this.field7184 = this.field7183.method2743(128, false, class46.field621, class284.field3930, -5, 128);
                              this.field7184.method277(true, false, false);
                              return;
                           }

                           this.field7184.method276(128, 128, class46.field621, -8262, 0, 0, class284.field3930, 128, 0);
                           return;
                        }

                        if (class149.field2066 == null) {
                           class149.field2066 = new int[16384];
                        }

                        var15 = class149.field2066;
                        var16 = -128;
                        if (!var2 && ~var16 <= -1) {
                           if (this.field7184 == null) {
                              this.field7184 = this.field7183.method2759(false, 128, 0, class149.field2066, 128);
                              this.field7184.method277(true, false, false);
                              return;
                           }

                           this.field7184.method281((byte)-2, class149.field2066, 0, 128, 0, 0, 128, 128);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (var3[var10] == 0) {
                                 var18 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[var10 - -1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var10] != 0) {
                                    ++var18;
                                    if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var10 - -var5] != 0) {
                                    ++var18;
                                 }

                                 var15[var9++] = var18 * 17 << 24;
                                 if (var2) {
                                    var15[var9++] = 1140850688;
                                    ++var10;
                                    ++var17;
                                 } else {
                                    ++var10;
                                    ++var17;
                                 }
                              } else {
                                 var15[var9++] = 1140850688;
                                 ++var10;
                                 ++var17;
                              }
                           }

                           while(true) {
                              while(~var17 > -1) {
                                 if (var3[var10] == 0) {
                                    var18 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var18;
                                    }

                                    if (~var3[var10 - -1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var10] != 0) {
                                       ++var18;
                                       if (var3[var10 - -var5] != 0) {
                                          ++var18;
                                       }
                                    } else if (var3[var10 - -var5] != 0) {
                                       ++var18;
                                    }

                                    var15[var9++] = var18 * 17 << 24;
                                    if (var2) {
                                       var15[var9++] = 1140850688;
                                       ++var10;
                                       ++var17;
                                    } else {
                                       ++var10;
                                       ++var17;
                                    }
                                 } else {
                                    var15[var9++] = 1140850688;
                                    ++var10;
                                    ++var17;
                                 }
                              }

                              var10 += this.field7173.field9358 - 128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var15[var9++] = 1140850688;
                              ++var10;
                              ++var17;
                           }
                        } while(~var16 > -1);

                        if (this.field7184 == null) {
                           this.field7184 = this.field7183.method2759(false, 128, 0, class149.field2066, 128);
                           this.field7184.method277(true, false, false);
                           return;
                        }

                        this.field7184.method281((byte)-2, class149.field2066, 0, 128, 0, 0, 128, 128);
                        return;
                     }
                  } else {
                     var10000 = -var21;
                     var10001 = var21 << 8;
                  }

                  var21 = var10000 + var10001;
                  var8 = -128;
                  if (var2) {
                     if (var3[var6++] != 0) {
                        ++var21;
                     }

                     ++var8;
                  }
               } else {
                  ++var8;
               }
            }
         }
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field7188[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3604(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3605(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
