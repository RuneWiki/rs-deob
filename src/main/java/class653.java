import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class653 {
   @OriginalMember(
      owner = "client!paa",
      name = "p",
      descriptor = "I"
   )
   private int field9750;
   @OriginalMember(
      owner = "client!paa",
      name = "g",
      descriptor = "Z"
   )
   public boolean field9759;
   @OriginalMember(
      owner = "client!paa",
      name = "s",
      descriptor = "I"
   )
   private int field9746;
   @OriginalMember(
      owner = "client!paa",
      name = "j",
      descriptor = "I"
   )
   private int field9744;
   @OriginalMember(
      owner = "client!paa",
      name = "m",
      descriptor = "Lfm;"
   )
   private class281 field9760;
   @OriginalMember(
      owner = "client!paa",
      name = "n",
      descriptor = "Lqk;"
   )
   private class1 field9751;
   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "Lcb;"
   )
   private class177 field9762;
   @OriginalMember(
      owner = "client!paa",
      name = "o",
      descriptor = "I"
   )
   public int field9754;
   @OriginalMember(
      owner = "client!paa",
      name = "h",
      descriptor = "I"
   )
   private int field9749;
   @OriginalMember(
      owner = "client!paa",
      name = "e",
      descriptor = "I"
   )
   private int field9745;
   @OriginalMember(
      owner = "client!paa",
      name = "i",
      descriptor = "Lfi;"
   )
   private class265 field9761;
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9764 = new String[]{method4802(method4801("!S\u0018\r\u001e")), method4802(method4801("*\u001cW\r!r")), method4802(method4801("4\bZO")), method4802(method4801("*\u001cW\r%r")), method4802(method4801("*\u001cW\r&r")), method4802(method4801("*\u001cW\r_3\u0013_W]r")), method4802(method4801("*\u001cW\r r")), method4802(method4801("*\u001cW\r\"r")), method4802(method4801("*\u001cW\r'r"))};
   @OriginalMember(
      owner = "client!paa",
      name = "l",
      descriptor = "[[B"
   )
   public static byte[][] field9753 = new byte[1000][];
   @OriginalMember(
      owner = "client!paa",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9757 = new int[4];
   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field9748 = new class6(40, 8);
   @OriginalMember(
      owner = "client!paa",
      name = "t",
      descriptor = "I"
   )
   public static int field9747;
   @OriginalMember(
      owner = "client!paa",
      name = "r",
      descriptor = "I"
   )
   public static int field9752;
   @OriginalMember(
      owner = "client!paa",
      name = "f",
      descriptor = "I"
   )
   public static int field9755;
   @OriginalMember(
      owner = "client!paa",
      name = "q",
      descriptor = "I"
   )
   public static int field9756;
   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "I"
   )
   public static int field9758;
   @OriginalMember(
      owner = "client!paa",
      name = "k",
      descriptor = "I"
   )
   public static int field9763;

   @OriginalMember(
      owner = "client!paa",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4795(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(Lwf;I)I"
   )
   public static final int method4796(class541 arg0, int arg1) {
      try {
         ++field9752;
         String var2 = class406.method3183(-18170, arg0);
         if (arg1 != -1) {
            return 43;
         } else {
            int[] var3 = null;
            if (!class505.method3816(112, arg0.field7909)) {
               if (arg0.field7913 != -1) {
                  var3 = class166.field2126.method5576(arg0.field7913, (byte)-92).field7999;
               } else if (!class141.method1161(arg0.field7909, false)) {
                  if (class258.method2080(arg0.field7909, 25161)) {
                     Object var4 = null;
                     class294 var5;
                     if (arg0.field7909 != 1010) {
                        var5 = class438.field5967.method929((byte)-80, (int)(arg0.field7912 >>> 32 & 2147483647L));
                     } else {
                        var5 = class438.field5967.method929((byte)-94, (int)arg0.field7912);
                     }

                     if (var5.field4036 != null) {
                        var5 = var5.method2362(class175.field2266, true);
                     }

                     if (var5 != null) {
                        var3 = var5.field4103;
                     }
                  }
               } else {
                  class411 var6 = (class411)class35.field493.method1818(arg1, (long)((int)arg0.field7912));
                  if (var6 != null) {
                     class81 var7 = var6.field5654;
                     class473 var8 = var7.field1135;
                     if (var8.field6583 != null) {
                        var8 = var8.method3603(class175.field2266, 4764);
                     }

                     if (var8 != null) {
                        var3 = var8.field6564;
                     }
                  }
               }
            } else {
               var3 = class166.field2126.method5576((int)arg0.field7912, (byte)-76).field7999;
            }

            if (var3 != null) {
               var2 = var2 + class432.method3345(var3, true);
            }

            int var9 = class492.field6871.method146(class476.field6643, var2, (byte)100);
            if (arg0.field7906) {
               var9 += class258.field3259.method2394() - -4;
            }

            return var9;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field9764[1] + (arg0 != null ? field9764[0] : field9764[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4797(int arg0) {
      try {
         if (arg0 != 6729) {
            this.field9745 = -31;
         }

         ++field9763;
         this.method4798(this.field9754, (byte)-41, this.field9761);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9764[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(IBLfi;)V"
   )
   public final void method4798(int arg0, byte arg1, class265 arg2) {
      try {
         ++field9747;
         if (~arg0 < -1) {
            this.method4799(128);
            this.field9760.method2265(this.field9762, (byte)-115);
            this.field9760.method1419(this.field9745, 0, 22, class629.field9286, arg0, this.field9749 - -1 + -this.field9745, arg2);
         }

         if (arg1 != -41) {
            this.method4799(-28);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9764[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9764[0] : field9764[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4799(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field9758;
         if (this.field9759) {
            this.field9759 = false;
            byte[] var3 = this.field9751.field9;
            int var4 = 0;
            int var5 = this.field9751.field8;
            int var6 = this.field9751.field8 * this.field9746 + this.field9744;
            if (arg0 != 128) {
               this.method4799(-105);
            }

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
                     if (this.field9762 != null && this.field9750 == var4) {
                        this.field9759 = false;
                        return;
                     }

                     this.field9750 = var4;
                     var9 = this.field9744 - -(this.field9746 * var5);
                     var10 = 0;
                     if (!this.field9760.method1407(class576.field8541, -2, class673.field9968)) {
                        if (class4.field64 == null) {
                           class4.field64 = new int[16384];
                        }

                        var11 = class4.field64;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field9762 != null) {
                              this.field9762.method1512(128, class4.field64, 128, 0, arg0 ^ -29133, 128, 0, 0);
                              return;
                           }

                           this.field9762 = this.field9760.method2283((byte)-53, 128, false, 128, class4.field64);
                           this.field9762.method1516(false, false, 13852);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (~var3[var9] != -1) {
                                 var11[var10++] = 1140850688;
                                 if (var2) {
                                    var14 = 0;
                                    if (~var3[var9 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    ++var9;
                                    ++var13;
                                 } else {
                                    ++var9;
                                    ++var13;
                                 }
                              } else {
                                 var14 = 0;
                                 if (~var3[var9 + -1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var5 + var9] != -1) {
                                    ++var14;
                                 }

                                 var11[var10++] = var14 * 17 << 24;
                                 ++var9;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (~var3[var9] != -1) {
                                    var11[var10++] = 1140850688;
                                    if (var2) {
                                       var14 = 0;
                                       if (~var3[var9 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var9] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }

                                       var11[var10++] = var14 * 17 << 24;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var14 = 0;
                                    if (~var3[var9 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              var9 += this.field9751.field8 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var14 = 0;
                              if (~var3[var9 + -1] != -1) {
                                 ++var14;
                              }

                              if (var3[var9 + 1] != 0) {
                                 ++var14;
                              }

                              if (var3[-var5 + var9] != 0) {
                                 ++var14;
                              }

                              if (~var3[var5 + var9] != -1) {
                                 ++var14;
                              }

                              var11[var10++] = var14 * 17 << 24;
                              ++var9;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field9762 != null) {
                           this.field9762.method1512(128, class4.field64, 128, 0, arg0 ^ -29133, 128, 0, 0);
                           return;
                        }

                        this.field9762 = this.field9760.method2283((byte)-53, 128, false, 128, class4.field64);
                        this.field9762.method1516(false, false, 13852);
                        return;
                     }

                     if (class62.field792 == null) {
                        class62.field792 = new byte[16384];
                     }

                     var15 = class62.field792;
                     var16 = -128;
                     if (!var2 && var16 >= 0) {
                        if (this.field9762 == null) {
                           this.field9762 = this.field9760.method2253(class62.field792, arg0 ^ -206, false, 128, 128, class673.field9968);
                           this.field9762.method1516(false, false, 13852);
                           return;
                        }

                        this.field9762.method1515(0, 0, 128, class62.field792, class673.field9968, 128, 0, 128, -116);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (~var3[var9] == -1) {
                              var18 = 0;
                              if (var3[var9 + -1] != 0) {
                                 ++var18;
                              }

                              if (~var3[var9 + 1] != -1) {
                                 ++var18;
                              }

                              if (var3[-var5 + var9] != 0) {
                                 ++var18;
                                 if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }
                              } else if (var3[var5 + var9] != 0) {
                                 ++var18;
                              }

                              var15[var10++] = (byte)(var18 * 17);
                              if (var2) {
                                 var15[var10++] = 68;
                                 ++var9;
                                 ++var17;
                              } else {
                                 ++var9;
                                 ++var17;
                              }
                           } else {
                              var15[var10++] = 68;
                              ++var9;
                              ++var17;
                           }
                        }

                        while(true) {
                           while(~var17 > -1) {
                              if (~var3[var9] == -1) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                    if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 var15[var10++] = (byte)(var18 * 17);
                                 if (var2) {
                                    var15[var10++] = 68;
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var15[var10++] = 68;
                                 ++var9;
                                 ++var17;
                              }
                           }

                           var9 += this.field9751.field8 + -128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var15[var10++] = 68;
                           ++var9;
                           ++var17;
                        }
                     } while(var16 < 0);

                     if (this.field9762 == null) {
                        this.field9762 = this.field9760.method2253(class62.field792, arg0 ^ -206, false, 128, 128, class673.field9968);
                        this.field9762.method1516(false, false, 13852);
                        return;
                     }

                     this.field9762.method1515(0, 0, 128, class62.field792, class673.field9968, 128, 0, 128, -116);
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
                        if (this.field9762 != null && this.field9750 == var4) {
                           this.field9759 = false;
                           return;
                        }

                        this.field9750 = var4;
                        var9 = this.field9744 - -(this.field9746 * var5);
                        var10 = 0;
                        if (!this.field9760.method1407(class576.field8541, -2, class673.field9968)) {
                           if (class4.field64 == null) {
                              class4.field64 = new int[16384];
                           }

                           var11 = class4.field64;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field9762 != null) {
                                 this.field9762.method1512(128, class4.field64, 128, 0, arg0 ^ -29133, 128, 0, 0);
                                 return;
                              }

                              this.field9762 = this.field9760.method2283((byte)-53, 128, false, 128, class4.field64);
                              this.field9762.method1516(false, false, 13852);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (~var3[var9] != -1) {
                                    var11[var10++] = 1140850688;
                                    if (var2) {
                                       var14 = 0;
                                       if (~var3[var9 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var9] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }

                                       var11[var10++] = var14 * 17 << 24;
                                       ++var9;
                                       ++var13;
                                    } else {
                                       ++var9;
                                       ++var13;
                                    }
                                 } else {
                                    var14 = 0;
                                    if (~var3[var9 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[var9 + 1] != 0) {
                                       ++var14;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var5 + var9] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(~var13 > -1) {
                                    if (~var3[var9] != -1) {
                                       var11[var10++] = 1140850688;
                                       if (var2) {
                                          var14 = 0;
                                          if (~var3[var9 + -1] != -1) {
                                             ++var14;
                                          }

                                          if (var3[var9 + 1] != 0) {
                                             ++var14;
                                          }

                                          if (var3[-var5 + var9] != 0) {
                                             ++var14;
                                          }

                                          if (~var3[var5 + var9] != -1) {
                                             ++var14;
                                          }

                                          var11[var10++] = var14 * 17 << 24;
                                          ++var9;
                                          ++var13;
                                       } else {
                                          ++var9;
                                          ++var13;
                                       }
                                    } else {
                                       var14 = 0;
                                       if (~var3[var9 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (var3[var9 + 1] != 0) {
                                          ++var14;
                                       }

                                       if (var3[-var5 + var9] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var5 + var9] != -1) {
                                          ++var14;
                                       }

                                       var11[var10++] = var14 * 17 << 24;
                                       ++var9;
                                       ++var13;
                                    }
                                 }

                                 var9 += this.field9751.field8 + -128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var14 = 0;
                                 if (~var3[var9 + -1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[var9 + 1] != 0) {
                                    ++var14;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var5 + var9] != -1) {
                                    ++var14;
                                 }

                                 var11[var10++] = var14 * 17 << 24;
                                 ++var9;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field9762 != null) {
                              this.field9762.method1512(128, class4.field64, 128, 0, arg0 ^ -29133, 128, 0, 0);
                              return;
                           }

                           this.field9762 = this.field9760.method2283((byte)-53, 128, false, 128, class4.field64);
                           this.field9762.method1516(false, false, 13852);
                           return;
                        }

                        if (class62.field792 == null) {
                           class62.field792 = new byte[16384];
                        }

                        var15 = class62.field792;
                        var16 = -128;
                        if (!var2 && var16 >= 0) {
                           if (this.field9762 == null) {
                              this.field9762 = this.field9760.method2253(class62.field792, arg0 ^ -206, false, 128, 128, class673.field9968);
                              this.field9762.method1516(false, false, 13852);
                              return;
                           }

                           this.field9762.method1515(0, 0, 128, class62.field792, class673.field9968, 128, 0, 128, -116);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (~var3[var9] == -1) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                 }

                                 if (~var3[var9 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                    if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var5 + var9] != 0) {
                                    ++var18;
                                 }

                                 var15[var10++] = (byte)(var18 * 17);
                                 if (var2) {
                                    var15[var10++] = 68;
                                    ++var9;
                                    ++var17;
                                 } else {
                                    ++var9;
                                    ++var17;
                                 }
                              } else {
                                 var15[var10++] = 68;
                                 ++var9;
                                 ++var17;
                              }
                           }

                           while(true) {
                              while(~var17 > -1) {
                                 if (~var3[var9] == -1) {
                                    var18 = 0;
                                    if (var3[var9 + -1] != 0) {
                                       ++var18;
                                    }

                                    if (~var3[var9 + 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var18;
                                       if (var3[var5 + var9] != 0) {
                                          ++var18;
                                       }
                                    } else if (var3[var5 + var9] != 0) {
                                       ++var18;
                                    }

                                    var15[var10++] = (byte)(var18 * 17);
                                    if (var2) {
                                       var15[var10++] = 68;
                                       ++var9;
                                       ++var17;
                                    } else {
                                       ++var9;
                                       ++var17;
                                    }
                                 } else {
                                    var15[var10++] = 68;
                                    ++var9;
                                    ++var17;
                                 }
                              }

                              var9 += this.field9751.field8 + -128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var15[var10++] = 68;
                              ++var9;
                              ++var17;
                           }
                        } while(var16 < 0);

                        if (this.field9762 == null) {
                           this.field9762 = this.field9760.method2253(class62.field792, arg0 ^ -206, false, 128, 128, class673.field9968);
                           this.field9762.method1516(false, false, 13852);
                           return;
                        }

                        this.field9762.method1515(0, 0, 128, class62.field792, class673.field9968, 128, 0, 128, -116);
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
         throw class93.method866(var20, field9764[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4800(int arg0) {
      try {
         field9757 = null;
         field9748 = null;
         field9753 = null;
         int var1 = 14 % ((-16 - arg0) / 38);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9764[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Lfm;Lqk;Laja;IIIII)V"
   )
   public class653(class281 param1, class1 param2, class106 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
