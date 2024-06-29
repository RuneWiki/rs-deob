import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class711 {
   @OriginalMember(
      owner = "client!ag",
      name = "q",
      descriptor = "I"
   )
   private int field10607;
   @OriginalMember(
      owner = "client!ag",
      name = "k",
      descriptor = "Z"
   )
   public boolean field10616;
   @OriginalMember(
      owner = "client!ag",
      name = "j",
      descriptor = "Lsb;"
   )
   private class305 field10610;
   @OriginalMember(
      owner = "client!ag",
      name = "o",
      descriptor = "I"
   )
   private int field10605;
   @OriginalMember(
      owner = "client!ag",
      name = "e",
      descriptor = "I"
   )
   private int field10612;
   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "Ldh;"
   )
   private class338 field10606;
   @OriginalMember(
      owner = "client!ag",
      name = "i",
      descriptor = "I"
   )
   private int field10620;
   @OriginalMember(
      owner = "client!ag",
      name = "g",
      descriptor = "I"
   )
   private int field10613;
   @OriginalMember(
      owner = "client!ag",
      name = "c",
      descriptor = "Lhi;"
   )
   private class215 field10608;
   @OriginalMember(
      owner = "client!ag",
      name = "h",
      descriptor = "I"
   )
   public int field10615;
   @OriginalMember(
      owner = "client!ag",
      name = "l",
      descriptor = "Loia;"
   )
   private class95 field10611;
   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10621 = new String[]{method5157(method5156("p\u00031z\u0018")), method5157(method5156("p\u00031}\u0018")), method5157(method5156("p\u00031\u0005Y\u007f\rk\u0007\u0018")), method5157(method5156("jJ1\u0017M")), method5157(method5156("\u007f\u0011sU")), method5157(method5156("p\u00031x\u0018")), method5157(method5156("p\u00031{\u0018"))};
   @OriginalMember(
      owner = "client!ag",
      name = "m",
      descriptor = "Lsda;"
   )
   public static class269 field10604 = new class269(36, 4);
   @OriginalMember(
      owner = "client!ag",
      name = "p",
      descriptor = "Luh;"
   )
   public static class176 field10617 = new class176();
   @OriginalMember(
      owner = "client!ag",
      name = "n",
      descriptor = "I"
   )
   public static int field10609;
   @OriginalMember(
      owner = "client!ag",
      name = "f",
      descriptor = "I"
   )
   public static int field10614;
   @OriginalMember(
      owner = "client!ag",
      name = "d",
      descriptor = "I"
   )
   public static int field10618;
   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "I"
   )
   public static int field10619;

   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "(B)V",
      line = 8
   )
   public final void method5152(byte arg0) {
      try {
         this.method5155(this.field10615, this.field10608, arg0 + -123);
         ++field10618;
         if (arg0 != 123) {
            this.method5153(101);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10621[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(I)V",
      line = 28
   )
   private final void method5153(int arg0) {
      int var2 = client.field4530;

      try {
         ++field10619;
         if (this.field10616) {
            this.field10616 = false;
            byte[] var3 = this.field10610.field4346;
            int var4 = 0;
            int var5 = this.field10610.field4357;
            int var6 = this.field10610.field4357 * this.field10605 + this.field10612;
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
            if (var2 != 0) {
               var4 = (var4 << 8) - var4;
               var8 = -128;
               if (var2 != 0) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }
            } else {
               if (~var7 <= -1) {
                  var8 = 27 / ((arg0 - 29) / 43);
                  if (var2 == 0) {
                     if (this.field10611 != null && this.field10607 == var4) {
                        this.field10616 = false;
                        return;
                     }

                     this.field10607 = var4;
                     var9 = 0;
                     var10 = this.field10605 * var5 + this.field10612;
                     if (this.field10606.method2597(class513.field7519, class740.field10984, (byte)-109)) {
                        if (class790.field11480 == null) {
                           class790.field11480 = new byte[16384];
                        }

                        var11 = class790.field11480;
                        var12 = -128;
                        if (var2 == 0 && var12 >= 0) {
                           if (this.field10611 != null) {
                              this.field10611.method498(class790.field11480, 776, class740.field10984, 128, 128, 0, 128, 0, 0);
                              return;
                           }

                           this.field10611 = this.field10606.method2671(128, class740.field10984, 13197, 128, false, class790.field11480);
                           this.field10611.method502(118, false, false);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2 != 0) {
                              if (~var3[var10] == -1) {
                                 var14 = 0;
                                 if (~var3[var10 + -1] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[var10 - -1] != -1) {
                                    ++var14;
                                 }

                                 if (~var3[-var5 + var10] != -1) {
                                    ++var14;
                                    if (var3[var5 + var10] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var5 + var10] != 0) {
                                    ++var14;
                                 }

                                 var11[var9++] = (byte)(var14 * 17);
                                 if (var2 != 0) {
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
                                 if (~var3[var10] == -1) {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var10 - -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[-var5 + var10] != -1) {
                                       ++var14;
                                       if (var3[var5 + var10] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var5 + var10] != 0) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    if (var2 != 0) {
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

                              var10 += this.field10610.field4357 + -128;
                              if (var2 == 0) {
                                 ++var12;
                                 break;
                              }

                              var11[var9++] = 68;
                              ++var10;
                              ++var13;
                           }
                        } while(var12 < 0);

                        if (this.field10611 != null) {
                           this.field10611.method498(class790.field11480, 776, class740.field10984, 128, 128, 0, 128, 0, 0);
                           return;
                        }

                        this.field10611 = this.field10606.method2671(128, class740.field10984, 13197, 128, false, class790.field11480);
                        this.field10611.method502(118, false, false);
                        return;
                     }

                     if (class74.field941 == null) {
                        class74.field941 = new int[16384];
                     }

                     var15 = class74.field941;
                     var16 = -128;
                     if (var2 == 0 && ~var16 <= -1) {
                        if (this.field10611 == null) {
                           this.field10611 = this.field10606.method2577(false, 128, class74.field941, 128, 2);
                           this.field10611.method502(109, false, false);
                           return;
                        }

                        this.field10611.method508(128, 0, 128, class74.field941, -126, 0, 0, 128);
                        return;
                     }

                     do {
                        var17 = -128;
                        if (var2 != 0) {
                           if (~var3[var10] != -1) {
                              var15[var9++] = 1140850688;
                              if (var2 != 0) {
                                 var18 = 0;
                                 if (~var3[var10 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[var10 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var10] != 0) {
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
                              if (~var3[var10 - 1] != -1) {
                                 ++var18;
                              }

                              if (~var3[var10 + 1] != -1) {
                                 ++var18;
                              }

                              if (var3[-var5 + var10] != 0) {
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
                              if (~var3[var10] != -1) {
                                 var15[var9++] = 1140850688;
                                 if (var2 != 0) {
                                    var18 = 0;
                                    if (~var3[var10 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (~var3[var10 + 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var10] != 0) {
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
                                 if (~var3[var10 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[var10 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var10] != 0) {
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

                           var10 += this.field10610.field4357 + -128;
                           if (var2 == 0) {
                              ++var16;
                              break;
                           }

                           var18 = 0;
                           if (~var3[var10 - 1] != -1) {
                              ++var18;
                           }

                           if (~var3[var10 + 1] != -1) {
                              ++var18;
                           }

                           if (var3[-var5 + var10] != 0) {
                              ++var18;
                           }

                           if (var3[var10 - -var5] != 0) {
                              ++var18;
                           }

                           var15[var9++] = var18 * 17 << 24;
                           ++var10;
                           ++var17;
                        }
                     } while(~var16 > -1);

                     if (this.field10611 == null) {
                        this.field10611 = this.field10606.method2577(false, 128, class74.field941, 128, 2);
                        this.field10611.method502(109, false, false);
                        return;
                     }

                     this.field10611.method508(128, 0, 128, class74.field941, -126, 0, 0, 128);
                     return;
                  }
               } else {
                  var4 = (var4 << 8) - var4;
                  var8 = -128;
               }

               if (var2 != 0) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }
            }

            while(true) {
               while(~var8 > -1) {
                  if (~var3[var6++] != -1) {
                     ++var4;
                  }

                  ++var8;
               }

               var6 += var5 + -128;
               if (var2 == 0) {
                  ++var7;
                  if (~var7 <= -1) {
                     var8 = 27 / ((arg0 - 29) / 43);
                     if (var2 == 0) {
                        if (this.field10611 != null && this.field10607 == var4) {
                           this.field10616 = false;
                           return;
                        }

                        this.field10607 = var4;
                        var9 = 0;
                        var10 = this.field10605 * var5 + this.field10612;
                        if (this.field10606.method2597(class513.field7519, class740.field10984, (byte)-109)) {
                           if (class790.field11480 == null) {
                              class790.field11480 = new byte[16384];
                           }

                           var11 = class790.field11480;
                           var12 = -128;
                           if (var2 == 0 && var12 >= 0) {
                              if (this.field10611 != null) {
                                 this.field10611.method498(class790.field11480, 776, class740.field10984, 128, 128, 0, 128, 0, 0);
                                 return;
                              }

                              this.field10611 = this.field10606.method2671(128, class740.field10984, 13197, 128, false, class790.field11480);
                              this.field10611.method502(118, false, false);
                              return;
                           }

                           do {
                              var13 = -128;
                              if (var2 != 0) {
                                 if (~var3[var10] == -1) {
                                    var14 = 0;
                                    if (~var3[var10 + -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[var10 - -1] != -1) {
                                       ++var14;
                                    }

                                    if (~var3[-var5 + var10] != -1) {
                                       ++var14;
                                       if (var3[var5 + var10] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var5 + var10] != 0) {
                                       ++var14;
                                    }

                                    var11[var9++] = (byte)(var14 * 17);
                                    if (var2 != 0) {
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
                                    if (~var3[var10] == -1) {
                                       var14 = 0;
                                       if (~var3[var10 + -1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[var10 - -1] != -1) {
                                          ++var14;
                                       }

                                       if (~var3[-var5 + var10] != -1) {
                                          ++var14;
                                          if (var3[var5 + var10] != 0) {
                                             ++var14;
                                          }
                                       } else if (var3[var5 + var10] != 0) {
                                          ++var14;
                                       }

                                       var11[var9++] = (byte)(var14 * 17);
                                       if (var2 != 0) {
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

                                 var10 += this.field10610.field4357 + -128;
                                 if (var2 == 0) {
                                    ++var12;
                                    break;
                                 }

                                 var11[var9++] = 68;
                                 ++var10;
                                 ++var13;
                              }
                           } while(var12 < 0);

                           if (this.field10611 != null) {
                              this.field10611.method498(class790.field11480, 776, class740.field10984, 128, 128, 0, 128, 0, 0);
                              return;
                           }

                           this.field10611 = this.field10606.method2671(128, class740.field10984, 13197, 128, false, class790.field11480);
                           this.field10611.method502(118, false, false);
                           return;
                        }

                        if (class74.field941 == null) {
                           class74.field941 = new int[16384];
                        }

                        var15 = class74.field941;
                        var16 = -128;
                        if (var2 == 0 && ~var16 <= -1) {
                           if (this.field10611 == null) {
                              this.field10611 = this.field10606.method2577(false, 128, class74.field941, 128, 2);
                              this.field10611.method502(109, false, false);
                              return;
                           }

                           this.field10611.method508(128, 0, 128, class74.field941, -126, 0, 0, 128);
                           return;
                        }

                        do {
                           var17 = -128;
                           if (var2 != 0) {
                              if (~var3[var10] != -1) {
                                 var15[var9++] = 1140850688;
                                 if (var2 != 0) {
                                    var18 = 0;
                                    if (~var3[var10 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (~var3[var10 + 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var10] != 0) {
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
                                 if (~var3[var10 - 1] != -1) {
                                    ++var18;
                                 }

                                 if (~var3[var10 + 1] != -1) {
                                    ++var18;
                                 }

                                 if (var3[-var5 + var10] != 0) {
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
                                 if (~var3[var10] != -1) {
                                    var15[var9++] = 1140850688;
                                    if (var2 != 0) {
                                       var18 = 0;
                                       if (~var3[var10 - 1] != -1) {
                                          ++var18;
                                       }

                                       if (~var3[var10 + 1] != -1) {
                                          ++var18;
                                       }

                                       if (var3[-var5 + var10] != 0) {
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
                                    if (~var3[var10 - 1] != -1) {
                                       ++var18;
                                    }

                                    if (~var3[var10 + 1] != -1) {
                                       ++var18;
                                    }

                                    if (var3[-var5 + var10] != 0) {
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

                              var10 += this.field10610.field4357 + -128;
                              if (var2 == 0) {
                                 ++var16;
                                 break;
                              }

                              var18 = 0;
                              if (~var3[var10 - 1] != -1) {
                                 ++var18;
                              }

                              if (~var3[var10 + 1] != -1) {
                                 ++var18;
                              }

                              if (var3[-var5 + var10] != 0) {
                                 ++var18;
                              }

                              if (var3[var10 - -var5] != 0) {
                                 ++var18;
                              }

                              var15[var9++] = var18 * 17 << 24;
                              ++var10;
                              ++var17;
                           }
                        } while(~var16 > -1);

                        if (this.field10611 == null) {
                           this.field10611 = this.field10606.method2577(false, 128, class74.field941, 128, 2);
                           this.field10611.method502(109, false, false);
                           return;
                        }

                        this.field10611.method508(128, 0, 128, class74.field941, -126, 0, 0, 128);
                        return;
                     }
                  } else {
                     var4 = (var4 << 8) - var4;
                     var8 = -128;
                  }

                  if (var2 != 0) {
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
         throw class670.method4877(var20, field10621[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(B)V",
      line = 202
   )
   public static void method5154(byte arg0) {
      try {
         if (arg0 >= 78) {
            field10604 = null;
            field10617 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10621[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "(Ldh;Lsb;Lvda;IIIII)V",
      line = 246
   )
   public class711(class338 param1, class305 param2, class192 param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(ILhi;I)V",
      line = 227
   )
   public final void method5155(int arg0, class215 arg1, int arg2) {
      try {
         if (~arg0 < -1) {
            this.method5153(96);
            this.field10606.method2578(this.field10611, true);
            this.field10606.method2628(-this.field10620 + this.field10613 + 1, 0, this.field10620, 16, class260.field3546, arg0, arg1);
         }

         ++field10609;
         if (arg2 != 0) {
            method5154((byte)76);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10621[6] + arg0 + ',' + (arg1 != null ? field10621[3] : field10621[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5156(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5157(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
