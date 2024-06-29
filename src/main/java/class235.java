import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class235 {
   @OriginalMember(
      owner = "client!q",
      name = "u",
      descriptor = "Z"
   )
   public boolean field3648;
   @OriginalMember(
      owner = "client!q",
      name = "k",
      descriptor = "I"
   )
   private int field3642;
   @OriginalMember(
      owner = "client!q",
      name = "q",
      descriptor = "I"
   )
   private int field3629;
   @OriginalMember(
      owner = "client!q",
      name = "p",
      descriptor = "I"
   )
   private int field3643;
   @OriginalMember(
      owner = "client!q",
      name = "t",
      descriptor = "Ldaa;"
   )
   private class226 field3640;
   @OriginalMember(
      owner = "client!q",
      name = "m",
      descriptor = "Lcm;"
   )
   private class525 field3633;
   @OriginalMember(
      owner = "client!q",
      name = "j",
      descriptor = "I"
   )
   private int field3644;
   @OriginalMember(
      owner = "client!q",
      name = "g",
      descriptor = "I"
   )
   private int field3631;
   @OriginalMember(
      owner = "client!q",
      name = "r",
      descriptor = "Lida;"
   )
   private class99 field3632;
   @OriginalMember(
      owner = "client!q",
      name = "n",
      descriptor = "I"
   )
   public int field3628;
   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "Lpga;"
   )
   private class371 field3647;
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3649 = new String[]{method2083(method2082("Y<y\b")), method2083(method2082("FgWL")), method2083(method2082("Y<\u0007IBAf\u0005\b")), method2083(method2082("S<\u0015\u000eQ")), method2083(method2082("Y<\u007f\b")), method2083(method2082("Y<~\b")), method2083(method2082("Y<x\b")), method2083(method2082("Y<z\b"))};
   @OriginalMember(
      owner = "client!q",
      name = "i",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field3630 = new Hashtable();
   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "I"
   )
   public static int field3634;
   @OriginalMember(
      owner = "client!q",
      name = "o",
      descriptor = "I"
   )
   public static int field3635;
   @OriginalMember(
      owner = "client!q",
      name = "s",
      descriptor = "I"
   )
   public static int field3636;
   @OriginalMember(
      owner = "client!q",
      name = "l",
      descriptor = "I"
   )
   public static int field3639;
   @OriginalMember(
      owner = "client!q",
      name = "e",
      descriptor = "I"
   )
   public static int field3641;
   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "I"
   )
   public static int field3646;
   @OriginalMember(
      owner = "client!q",
      name = "h",
      descriptor = "Lma;"
   )
   public static class148 field3637;
   @OriginalMember(
      owner = "client!q",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field3645;
   @OriginalMember(
      owner = "client!q",
      name = "d",
      descriptor = "[S"
   )
   public static short[] field3638;

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(IILida;)V"
   )
   public final void method2077(int arg0, int arg1, class99 arg2) {
      try {
         ++field3635;
         int var4 = 12 % ((arg1 - 27) / 52);
         if (~arg0 < -1) {
            this.method2078(-1);
            this.field3640.method1943(0, this.field3647);
            this.field3640.method1230(-this.field3644 + this.field3631 + 1, arg0, arg2, (byte)92, class482.field6912, this.field3644, 0);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3649[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3649[3] : field3649[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method2078(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field3646;
         if (this.field3648) {
            this.field3648 = false;
            byte[] var3 = this.field3633.field7422;
            int var4 = 0;
            int var5 = this.field3633.field7432;
            int var6 = this.field3633.field7432 * this.field3629 + this.field3643;
            if (arg0 != -1) {
               this.method2078(7);
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
               var4 = (var4 << 8) - var4;
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
                     if (this.field3647 != null && ~this.field3642 == ~var4) {
                        this.field3648 = false;
                        return;
                     }

                     this.field3642 = var4;
                     var9 = this.field3643 - -(this.field3629 * var5);
                     var10 = 0;
                     if (!this.field3640.method1229(arg0 + 1, class106.field1654, class779.field11371)) {
                        if (class66.field964 == null) {
                           class66.field964 = new int[16384];
                        }

                        var11 = class66.field964;
                        var12 = -128;
                        if (!var2 && var12 >= 0) {
                           if (this.field3647 != null) {
                              this.field3647.method25(0, 0, -20998, 128, 128, 128, class66.field964, 0);
                              return;
                           }

                           this.field3647 = this.field3640.method2017(false, 128, 0, 128, class66.field964);
                           this.field3647.method31(false, false, false);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var9] != 0) {
                                 var11[var10++] = 1140850688;
                                 if (var2) {
                                    var14 = 0;
                                    if (var3[var9 + -1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - var5] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
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
                                 if (var3[var9 + -1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - -1] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - var5] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - -var5] != -1) {
                                    ++var14;
                                 }

                                 var11[var10++] = var14 * 17 << 24;
                                 ++var9;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (var3[var9] != 0) {
                                    var11[var10++] = 1140850688;
                                    if (var2) {
                                       var14 = 0;
                                       if (var3[var9 + -1] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - var5] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -var5] != -1) {
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
                                    if (var3[var9 + -1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - var5] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              var9 += this.field3633.field7432 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var14 = 0;
                              if (var3[var9 + -1] != 0) {
                                 ++var14;
                              }

                              if (~var3[var9 - -1] != -1) {
                                 ++var14;
                              }

                              if (~var3[var9 - var5] != -1) {
                                 ++var14;
                              }

                              if (~var3[var9 - -var5] != -1) {
                                 ++var14;
                              }

                              var11[var10++] = var14 * 17 << 24;
                              ++var9;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field3647 != null) {
                           this.field3647.method25(0, 0, -20998, 128, 128, 128, class66.field964, 0);
                           return;
                        }

                        this.field3647 = this.field3640.method2017(false, 128, 0, 128, class66.field964);
                        this.field3647.method31(false, false, false);
                        return;
                     }

                     if (class220.field3145 == null) {
                        class220.field3145 = new byte[16384];
                     }

                     var15 = class220.field3145;
                     var16 = -128;
                     if (!var2 && ~var16 <= -1) {
                        if (this.field3647 != null) {
                           this.field3647.method22(128, 0, -41, class106.field1654, 0, 128, 0, 128, class220.field3145);
                           return;
                        }

                        this.field3647 = this.field3640.method1997(class220.field3145, class106.field1654, 128, 128, 0, false);
                        this.field3647.method31(false, false, false);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2) {
                           if (var3[var9] == 0) {
                              var18 = 0;
                              if (var3[var9 + -1] != 0) {
                                 ++var18;
                                 if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }
                              } else if (var3[var9 + 1] != 0) {
                                 ++var18;
                              }

                              if (var3[-var5 + var9] != 0) {
                                 ++var18;
                                 if (~var3[var9 - -var5] != -1) {
                                    ++var18;
                                 }
                              } else if (~var3[var9 - -var5] != -1) {
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
                           while(var17 < 0) {
                              if (var3[var9] == 0) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                    if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                    if (~var3[var9 - -var5] != -1) {
                                       ++var18;
                                    }
                                 } else if (~var3[var9 - -var5] != -1) {
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

                           var9 += this.field3633.field7432 + -128;
                           if (!var2) {
                              ++var16;
                              break;
                           }

                           var15[var10++] = 68;
                           ++var9;
                           ++var17;
                        }
                     } while(~var16 > -1);

                     if (this.field3647 != null) {
                        this.field3647.method22(128, 0, -41, class106.field1654, 0, 128, 0, 128, class220.field3145);
                        return;
                     }

                     this.field3647 = this.field3640.method1997(class220.field3145, class106.field1654, 128, 128, 0, false);
                     this.field3647.method31(false, false, false);
                     return;
                  }
               } else {
                  var4 = (var4 << 8) - var4;
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
                        if (this.field3647 != null && ~this.field3642 == ~var4) {
                           this.field3648 = false;
                           return;
                        }

                        this.field3642 = var4;
                        var9 = this.field3643 - -(this.field3629 * var5);
                        var10 = 0;
                        if (!this.field3640.method1229(arg0 + 1, class106.field1654, class779.field11371)) {
                           if (class66.field964 == null) {
                              class66.field964 = new int[16384];
                           }

                           var11 = class66.field964;
                           var12 = -128;
                           if (!var2 && var12 >= 0) {
                              if (this.field3647 != null) {
                                 this.field3647.method25(0, 0, -20998, 128, 128, 128, class66.field964, 0);
                                 return;
                              }

                              this.field3647 = this.field3640.method2017(false, 128, 0, 128, class66.field964);
                              this.field3647.method31(false, false, false);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2) {
                                 if (var3[var9] != 0) {
                                    var11[var10++] = 1140850688;
                                    if (var2) {
                                       var14 = 0;
                                       if (var3[var9 + -1] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - var5] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -var5] != -1) {
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
                                    if (var3[var9 + -1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - var5] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var9 - -var5] != -1) {
                                       ++var14;
                                    }

                                    var11[var10++] = var14 * 17 << 24;
                                    ++var9;
                                    ++var13;
                                 }
                              }

                              while(true) {
                                 while(~var13 > -1) {
                                    if (var3[var9] != 0) {
                                       var11[var10++] = 1140850688;
                                       if (var2) {
                                          var14 = 0;
                                          if (var3[var9 + -1] != 0) {
                                             ++var14;
                                          }

                                          if (~var3[var9 - -1] != -1) {
                                             ++var14;
                                          }

                                          if (~var3[var9 - var5] != -1) {
                                             ++var14;
                                          }

                                          if (~var3[var9 - -var5] != -1) {
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
                                       if (var3[var9 + -1] != 0) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - var5] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var9 - -var5] != -1) {
                                          ++var14;
                                       }

                                       var11[var10++] = var14 * 17 << 24;
                                       ++var9;
                                       ++var13;
                                    }
                                 }

                                 var9 += this.field3633.field7432 + -128;
                                 if (!var2) {
                                    ++var12;
                                    break;
                                 }

                                 var14 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - -1] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - var5] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var9 - -var5] != -1) {
                                    ++var14;
                                 }

                                 var11[var10++] = var14 * 17 << 24;
                                 ++var9;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field3647 != null) {
                              this.field3647.method25(0, 0, -20998, 128, 128, 128, class66.field964, 0);
                              return;
                           }

                           this.field3647 = this.field3640.method2017(false, 128, 0, 128, class66.field964);
                           this.field3647.method31(false, false, false);
                           return;
                        }

                        if (class220.field3145 == null) {
                           class220.field3145 = new byte[16384];
                        }

                        var15 = class220.field3145;
                        var16 = -128;
                        if (!var2 && ~var16 <= -1) {
                           if (this.field3647 != null) {
                              this.field3647.method22(128, 0, -41, class106.field1654, 0, 128, 0, 128, class220.field3145);
                              return;
                           }

                           this.field3647 = this.field3640.method1997(class220.field3145, class106.field1654, 128, 128, 0, false);
                           this.field3647.method31(false, false, false);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2) {
                              if (var3[var9] == 0) {
                                 var18 = 0;
                                 if (var3[var9 + -1] != 0) {
                                    ++var18;
                                    if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }
                                 } else if (var3[var9 + 1] != 0) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var9] != 0) {
                                    ++var18;
                                    if (~var3[var9 - -var5] != -1) {
                                       ++var18;
                                    }
                                 } else if (~var3[var9 - -var5] != -1) {
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
                              while(var17 < 0) {
                                 if (var3[var9] == 0) {
                                    var18 = 0;
                                    if (var3[var9 + -1] != 0) {
                                       ++var18;
                                       if (var3[var9 + 1] != 0) {
                                          ++var18;
                                       }
                                    } else if (var3[var9 + 1] != 0) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var9] != 0) {
                                       ++var18;
                                       if (~var3[var9 - -var5] != -1) {
                                          ++var18;
                                       }
                                    } else if (~var3[var9 - -var5] != -1) {
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

                              var9 += this.field3633.field7432 + -128;
                              if (!var2) {
                                 ++var16;
                                 break;
                              }

                              var15[var10++] = 68;
                              ++var9;
                              ++var17;
                           }
                        } while(~var16 > -1);

                        if (this.field3647 != null) {
                           this.field3647.method22(128, 0, -41, class106.field1654, 0, 128, 0, 128, class220.field3145);
                           return;
                        }

                        this.field3647 = this.field3640.method1997(class220.field3145, class106.field1654, 128, 128, 0, false);
                        this.field3647.method31(false, false, false);
                        return;
                     }
                  } else {
                     var4 = (var4 << 8) - var4;
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
         throw class612.method4503(var20, field3649[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2079(int arg0) {
      try {
         this.method2077(this.field3628, -98, this.field3632);
         ++field3634;
         if (arg0 != -6661) {
            this.method2079(-107);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3649[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2080(int arg0) {
      try {
         field3630 = null;
         field3638 = null;
         if (arg0 == -504) {
            field3637 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3649[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method2081(int arg0, byte arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field3636;
         if (class712.field10231 != null) {
            int var4 = class590.field8352;
            int var5 = class701.field10102;
            if (arg1 != 119) {
               method2080(105);
            }

            label62: {
               class14.method114(arg2, arg0, -124);
               if (~class217.field3113 == -1) {
                  class697.field10061 = null;
                  class697.field10061 = class712.field10231.method261(class712.field10231.method216(class690.field9938, class515.field7310), class712.field10231.method236(class690.field9938, class515.field7310));
                  if (!var3) {
                     break label62;
                  }
               }

               if (class217.field3113 == 1 && (class558.field7928 == null || ~class590.field8352 != ~var4 || class701.field10102 != var5)) {
                  class558.field7928 = new class758[class701.field10102 * class590.field8352];
                  int var6 = 0;
                  if (var3) {
                     class558.field7928[var6] = class712.field10231.method261(class712.field10231.method216(class502.field7168, class466.field6765), class712.field10231.method236(class502.field7168, class466.field6765));
                     ++var6;
                  }

                  while(true) {
                     while(~class558.field7928.length < ~var6) {
                        class558.field7928[var6] = class712.field10231.method261(class712.field10231.method216(class502.field7168, class466.field6765), class712.field10231.method236(class502.field7168, class466.field6765));
                        ++var6;
                     }

                     class599.field8520 = 1;
                     if (!var3) {
                        class614.field8733 = new int[class701.field10102 * class590.field8352];
                        break;
                     }

                     ++var6;
                  }
               }
            }

            class248.field3804 = true;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3649[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "<init>",
      descriptor = "(Ldaa;Lcm;Lpj;IIIII)V"
   )
   public class235(class226 param1, class525 param2, class423 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2082(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2083(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
