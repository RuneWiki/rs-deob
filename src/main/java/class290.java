import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class290 extends class193 {
   @OriginalMember(
      owner = "client!gf",
      name = "G",
      descriptor = "[B"
   )
   public byte[] field4058;
   @OriginalMember(
      owner = "client!gf",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4072 = new String[]{method2210(method2209("\t/Wb\\")), method2210(method2209("\t/We\\")), method2210(method2209("\t/Wg\\")), method2210(method2209("\t/Wd\\")), method2210(method2209("\u0015gW\u0000\t")), method2210(method2209("\t/W\u0012\u001d\u0000 \r\u0010\\")), method2210(method2209("\u0000<\u0015B")), method2210(method2209("\t/Wc\\")), method2210(method2209("\t/W`\\"))};
   @OriginalMember(
      owner = "client!gf",
      name = "M",
      descriptor = "Lum;"
   )
   public static class550 field4059 = new class550();
   @OriginalMember(
      owner = "client!gf",
      name = "B",
      descriptor = "I"
   )
   public int field4060;
   @OriginalMember(
      owner = "client!gf",
      name = "L",
      descriptor = "I"
   )
   public static int field4061;
   @OriginalMember(
      owner = "client!gf",
      name = "J",
      descriptor = "I"
   )
   public static int field4062;
   @OriginalMember(
      owner = "client!gf",
      name = "A",
      descriptor = "I"
   )
   public int field4063;
   @OriginalMember(
      owner = "client!gf",
      name = "F",
      descriptor = "I"
   )
   public int field4064;
   @OriginalMember(
      owner = "client!gf",
      name = "N",
      descriptor = "I"
   )
   public static int field4065;
   @OriginalMember(
      owner = "client!gf",
      name = "H",
      descriptor = "I"
   )
   public static int field4066;
   @OriginalMember(
      owner = "client!gf",
      name = "C",
      descriptor = "I"
   )
   public static int field4067;
   @OriginalMember(
      owner = "client!gf",
      name = "E",
      descriptor = "I"
   )
   public int field4068;
   @OriginalMember(
      owner = "client!gf",
      name = "I",
      descriptor = "I"
   )
   public static int field4069;
   @OriginalMember(
      owner = "client!gf",
      name = "K",
      descriptor = "I"
   )
   public static int field4070;
   @OriginalMember(
      owner = "client!gf",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field4071;

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method2203(int arg0, int arg1) {
      try {
         class729.field10834 = arg0;
         class82.field999 = -1;
         ++field4066;
         class303.field4325 = arg1;
         class351.method2743(-1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4072[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2204(byte arg0) {
      try {
         field4059 = null;
         field4071 = null;
         int var1 = 10 % ((18 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4072[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(IIIIZ)V"
   )
   public final void method2205(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         if (!arg4) {
            field4071 = null;
         }

         this.field4068 = arg1;
         this.field4064 = arg2 - arg0;
         this.field4063 = arg0;
         this.field4060 = -arg1 + arg3;
         ++field4065;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4072[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method2206(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field4067;
         int var3 = -1;
         int var4 = this.field4058.length - 8;
         if (var2 != 0) {
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
            ++var3;
            this.field4058[var3] = 0;
         }

         while(true) {
            while(var3 < var4) {
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
               ++var3;
               this.field4058[var3] = 0;
            }

            if (var2 == 0) {
               if (arg0 != 103) {
                  this.method2208(-51, (byte)-22, -48, -57, 48, -93, 91);
                  if (var2 != 0) {
                     ++var3;
                     this.field4058[var3] = 0;
                  }
               }

               while(var3 < this.field4058.length - 1) {
                  ++var3;
                  this.field4058[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field4058[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4072[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "c",
      descriptor = "(III)Z"
   )
   public final boolean method2207(int arg0, int arg1, int arg2) {
      try {
         ++field4070;
         if (arg2 != 19280) {
            this.field4063 = -124;
         }

         return ~(arg0 * arg1) >= ~this.field4058.length;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4072[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(IBIIIII)V"
   )
   public final void method2208(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field4061;
         int var9 = 0;
         if (arg3 != arg5) {
            var9 = (-arg2 + arg0 << 16) / (arg3 - arg5);
         }

         int var10 = 0;
         if (arg1 < 95) {
            this.field4060 = -112;
         }

         if (~arg3 != ~arg6) {
            var10 = (-arg0 + arg4 << 16) / (arg6 - arg3);
         }

         int var11 = 0;
         if (~arg5 != ~arg6) {
            var11 = (-arg4 + arg2 << 16) / (-arg6 + arg5);
         }

         if (~arg5 >= ~arg3 && ~arg5 >= ~arg6) {
            if (arg6 > arg3) {
               arg4 = arg2 <<= 16;
               if (~arg5 > -1) {
                  arg4 -= arg5 * var11;
                  arg2 -= arg5 * var9;
                  arg5 = 0;
               }

               arg0 <<= 16;
               if (~arg3 > -1) {
                  arg0 -= arg3 * var10;
                  arg3 = 0;
               }

               if (arg3 != arg5 && ~var9 < ~var11 || ~arg3 == ~arg5 && ~var10 > ~var11) {
                  arg6 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field4060 * arg5;
                  if (var8 != 0) {
                     class483.method3591(arg4 >> 16, (byte)-48, arg2 >> 16, this.field4058, arg5, 0);
                     arg2 += var9;
                     arg4 += var11;
                     arg5 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg4 >> 16, (byte)-81, arg0 >> 16, this.field4058, arg5, 0);
                                 arg4 += var11;
                                 arg0 += var10;
                                 arg5 += this.field4060;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg5 += this.field4060;
                                    } else {
                                       class483.method3591(arg4 >> 16, (byte)-81, arg0 >> 16, this.field4058, arg5, 0);
                                       arg4 += var11;
                                       arg0 += var10;
                                       arg5 += this.field4060;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field4060;
                        } else {
                           class483.method3591(arg4 >> 16, (byte)-48, arg2 >> 16, this.field4058, arg5, 0);
                           arg2 += var9;
                           arg4 += var11;
                           arg5 += this.field4060;
                        }
                     }
                  }
               } else {
                  arg6 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field4060 * arg5;
                  if (var8 != 0) {
                     class483.method3591(arg2 >> 16, (byte)-111, arg4 >> 16, this.field4058, arg5, 0);
                     arg2 += var9;
                     arg4 += var11;
                     arg5 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg0 >> 16, (byte)-58, arg4 >> 16, this.field4058, arg5, 0);
                                 arg5 += this.field4060;
                                 arg4 += var11;
                                 arg0 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg0 += var10;
                                    } else {
                                       class483.method3591(arg0 >> 16, (byte)-58, arg4 >> 16, this.field4058, arg5, 0);
                                       arg5 += this.field4060;
                                       arg4 += var11;
                                       arg0 += var10;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field4060;
                        } else {
                           class483.method3591(arg2 >> 16, (byte)-111, arg4 >> 16, this.field4058, arg5, 0);
                           arg2 += var9;
                           arg4 += var11;
                           arg5 += this.field4060;
                        }
                     }
                  }
               }
            } else {
               arg0 = arg2 <<= 16;
               if (~arg5 > -1) {
                  arg0 -= arg5 * var11;
                  arg2 -= arg5 * var9;
                  arg5 = 0;
               }

               arg4 <<= 16;
               if (~arg6 > -1) {
                  arg4 -= arg6 * var10;
                  arg6 = 0;
               }

               if (arg5 != arg6 && var9 > var11 || arg5 == arg6 && ~var9 > ~var10) {
                  arg3 -= arg6;
                  arg6 -= arg5;
                  arg5 = this.field4060 * arg5;
                  if (var8 != 0) {
                     class483.method3591(arg0 >> 16, (byte)-98, arg2 >> 16, this.field4058, arg5, 0);
                     arg5 += this.field4060;
                     arg2 += var9;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg4 >> 16, (byte)-127, arg2 >> 16, this.field4058, arg5, 0);
                                 arg2 += var9;
                                 arg4 += var10;
                                 arg5 += this.field4060;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg5 += this.field4060;
                                    } else {
                                       class483.method3591(arg4 >> 16, (byte)-127, arg2 >> 16, this.field4058, arg5, 0);
                                       arg2 += var9;
                                       arg4 += var10;
                                       arg5 += this.field4060;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class483.method3591(arg0 >> 16, (byte)-98, arg2 >> 16, this.field4058, arg5, 0);
                           arg5 += this.field4060;
                           arg2 += var9;
                           arg0 += var11;
                        }
                     }
                  }
               } else {
                  arg3 -= arg6;
                  arg6 -= arg5;
                  arg5 = this.field4060 * arg5;
                  if (var8 != 0) {
                     class483.method3591(arg2 >> 16, (byte)-125, arg0 >> 16, this.field4058, arg5, 0);
                     arg5 += this.field4060;
                     arg2 += var9;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (~arg6 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg2 >> 16, (byte)-125, arg4 >> 16, this.field4058, arg5, 0);
                                 arg2 += var9;
                                 arg5 += this.field4060;
                                 arg4 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg4 += var10;
                                    } else {
                                       class483.method3591(arg2 >> 16, (byte)-125, arg4 >> 16, this.field4058, arg5, 0);
                                       arg2 += var9;
                                       arg5 += this.field4060;
                                       arg4 += var10;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class483.method3591(arg2 >> 16, (byte)-125, arg0 >> 16, this.field4058, arg5, 0);
                           arg5 += this.field4060;
                           arg2 += var9;
                           arg0 += var11;
                        }
                     }
                  }
               }
            }
         } else if (arg3 <= arg6) {
            if (~arg6 > ~arg5) {
               arg2 = arg0 <<= 16;
               if (~arg3 > -1) {
                  arg2 -= arg3 * var9;
                  arg0 -= arg3 * var10;
                  arg3 = 0;
               }

               arg4 <<= 16;
               if (~arg6 > -1) {
                  arg4 -= arg6 * var11;
                  arg6 = 0;
               }

               if (arg3 != arg6 && ~var9 > ~var10 || arg3 == arg6 && ~var9 < ~var11) {
                  arg5 -= arg6;
                  arg6 -= arg3;
                  arg3 = this.field4060 * arg3;
                  if (var8 != 0) {
                     class483.method3591(arg2 >> 16, (byte)-65, arg0 >> 16, this.field4058, arg3, 0);
                     arg0 += var10;
                     arg2 += var9;
                     arg3 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg2 >> 16, (byte)-118, arg4 >> 16, this.field4058, arg3, 0);
                                 arg3 += this.field4060;
                                 arg4 += var11;
                                 arg2 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg2 += var9;
                                    } else {
                                       class483.method3591(arg2 >> 16, (byte)-118, arg4 >> 16, this.field4058, arg3, 0);
                                       arg3 += this.field4060;
                                       arg4 += var11;
                                       arg2 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field4060;
                        } else {
                           class483.method3591(arg2 >> 16, (byte)-65, arg0 >> 16, this.field4058, arg3, 0);
                           arg0 += var10;
                           arg2 += var9;
                           arg3 += this.field4060;
                        }
                     }
                  }
               } else {
                  arg5 -= arg6;
                  arg6 -= arg3;
                  arg3 = this.field4060 * arg3;
                  if (var8 != 0) {
                     class483.method3591(arg0 >> 16, (byte)-51, arg2 >> 16, this.field4058, arg3, 0);
                     arg0 += var10;
                     arg2 += var9;
                     arg3 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg4 >> 16, (byte)-94, arg2 >> 16, this.field4058, arg3, 0);
                                 arg3 += this.field4060;
                                 arg4 += var11;
                                 arg2 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg2 += var9;
                                    } else {
                                       class483.method3591(arg4 >> 16, (byte)-94, arg2 >> 16, this.field4058, arg3, 0);
                                       arg3 += this.field4060;
                                       arg4 += var11;
                                       arg2 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field4060;
                        } else {
                           class483.method3591(arg0 >> 16, (byte)-51, arg2 >> 16, this.field4058, arg3, 0);
                           arg0 += var10;
                           arg2 += var9;
                           arg3 += this.field4060;
                        }
                     }
                  }
               }
            } else {
               arg4 = arg0 <<= 16;
               arg2 <<= 16;
               if (arg3 < 0) {
                  arg0 -= arg3 * var10;
                  arg4 -= arg3 * var9;
                  arg3 = 0;
               }

               if (arg5 < 0) {
                  arg2 -= arg5 * var11;
                  arg5 = 0;
               }

               if (var9 < var10) {
                  arg6 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field4060 * arg3;
                  if (var8 != 0) {
                     class483.method3591(arg4 >> 16, (byte)-58, arg0 >> 16, this.field4058, arg3, 0);
                     arg4 += var9;
                     arg0 += var10;
                     arg3 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (arg5 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg2 >> 16, (byte)-122, arg0 >> 16, this.field4058, arg3, 0);
                                 arg3 += this.field4060;
                                 arg2 += var11;
                                 arg0 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg0 += var10;
                                    } else {
                                       class483.method3591(arg2 >> 16, (byte)-122, arg0 >> 16, this.field4058, arg3, 0);
                                       arg3 += this.field4060;
                                       arg2 += var11;
                                       arg0 += var10;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field4060;
                        } else {
                           class483.method3591(arg4 >> 16, (byte)-58, arg0 >> 16, this.field4058, arg3, 0);
                           arg4 += var9;
                           arg0 += var10;
                           arg3 += this.field4060;
                        }
                     }
                  }
               } else {
                  arg6 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field4060 * arg3;
                  if (var8 != 0) {
                     class483.method3591(arg0 >> 16, (byte)-119, arg4 >> 16, this.field4058, arg3, 0);
                     arg4 += var9;
                     arg0 += var10;
                     arg3 += this.field4060;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class483.method3591(arg0 >> 16, (byte)-87, arg2 >> 16, this.field4058, arg3, 0);
                                 arg3 += this.field4060;
                                 arg2 += var11;
                                 arg0 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg0 += var10;
                                    } else {
                                       class483.method3591(arg0 >> 16, (byte)-87, arg2 >> 16, this.field4058, arg3, 0);
                                       arg3 += this.field4060;
                                       arg2 += var11;
                                       arg0 += var10;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field4060;
                        } else {
                           class483.method3591(arg0 >> 16, (byte)-119, arg4 >> 16, this.field4058, arg3, 0);
                           arg4 += var9;
                           arg0 += var10;
                           arg3 += this.field4060;
                        }
                     }
                  }
               }
            }
         } else if (~arg3 < ~arg5) {
            arg0 = arg4 <<= 16;
            arg2 <<= 16;
            if (arg6 < 0) {
               arg0 -= arg6 * var10;
               arg4 -= arg6 * var11;
               arg6 = 0;
            }

            if (arg5 < 0) {
               arg2 -= arg5 * var9;
               arg5 = 0;
            }

            if (~var10 <= ~var11) {
               arg3 -= arg5;
               arg5 -= arg6;
               arg6 = this.field4060 * arg6;
               if (var8 != 0) {
                  class483.method3591(arg4 >> 16, (byte)-63, arg0 >> 16, this.field4058, arg6, 0);
                  arg4 += var11;
                  arg0 += var10;
                  arg6 += this.field4060;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class483.method3591(arg2 >> 16, (byte)-122, arg0 >> 16, this.field4058, arg6, 0);
                              arg0 += var10;
                              arg6 += this.field4060;
                              arg2 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg2 += var9;
                                 } else {
                                    class483.method3591(arg2 >> 16, (byte)-122, arg0 >> 16, this.field4058, arg6, 0);
                                    arg0 += var10;
                                    arg6 += this.field4060;
                                    arg2 += var9;
                                 }
                              }
                           }
                        }

                        arg6 += this.field4060;
                     } else {
                        class483.method3591(arg4 >> 16, (byte)-63, arg0 >> 16, this.field4058, arg6, 0);
                        arg4 += var11;
                        arg0 += var10;
                        arg6 += this.field4060;
                     }
                  }
               }
            } else {
               arg3 -= arg5;
               arg5 -= arg6;
               arg6 = this.field4060 * arg6;
               if (var8 != 0) {
                  class483.method3591(arg0 >> 16, (byte)-110, arg4 >> 16, this.field4058, arg6, 0);
                  arg4 += var11;
                  arg6 += this.field4060;
                  arg0 += var10;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class483.method3591(arg0 >> 16, (byte)-54, arg2 >> 16, this.field4058, arg6, 0);
                              arg2 += var9;
                              arg0 += var10;
                              arg6 += this.field4060;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg6 += this.field4060;
                                 } else {
                                    class483.method3591(arg0 >> 16, (byte)-54, arg2 >> 16, this.field4058, arg6, 0);
                                    arg2 += var9;
                                    arg0 += var10;
                                    arg6 += this.field4060;
                                 }
                              }
                           }
                        }

                        arg0 += var10;
                     } else {
                        class483.method3591(arg0 >> 16, (byte)-110, arg4 >> 16, this.field4058, arg6, 0);
                        arg4 += var11;
                        arg6 += this.field4060;
                        arg0 += var10;
                     }
                  }
               }
            }
         } else {
            arg2 = arg4 <<= 16;
            if (arg6 < 0) {
               arg4 -= arg6 * var11;
               arg2 -= arg6 * var10;
               arg6 = 0;
            }

            arg0 <<= 16;
            if (~arg3 > -1) {
               arg0 -= arg3 * var9;
               arg3 = 0;
            }

            if (var11 > var10) {
               arg5 -= arg3;
               arg3 -= arg6;
               arg6 = this.field4060 * arg6;
               if (var8 != 0) {
                  class483.method3591(arg2 >> 16, (byte)-51, arg4 >> 16, this.field4058, arg6, 0);
                  arg6 += this.field4060;
                  arg4 += var11;
                  arg2 += var10;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class483.method3591(arg0 >> 16, (byte)-113, arg4 >> 16, this.field4058, arg6, 0);
                              arg4 += var11;
                              arg6 += this.field4060;
                              arg0 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg0 += var9;
                                 } else {
                                    class483.method3591(arg0 >> 16, (byte)-113, arg4 >> 16, this.field4058, arg6, 0);
                                    arg4 += var11;
                                    arg6 += this.field4060;
                                    arg0 += var9;
                                 }
                              }
                           }
                        }

                        arg2 += var10;
                     } else {
                        class483.method3591(arg2 >> 16, (byte)-51, arg4 >> 16, this.field4058, arg6, 0);
                        arg6 += this.field4060;
                        arg4 += var11;
                        arg2 += var10;
                     }
                  }
               }
            } else {
               arg5 -= arg3;
               arg3 -= arg6;
               arg6 = this.field4060 * arg6;
               if (var8 != 0) {
                  class483.method3591(arg4 >> 16, (byte)-56, arg2 >> 16, this.field4058, arg6, 0);
                  arg4 += var11;
                  arg6 += this.field4060;
                  arg2 += var10;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class483.method3591(arg4 >> 16, (byte)-61, arg0 >> 16, this.field4058, arg6, 0);
                              arg6 += this.field4060;
                              arg4 += var11;
                              arg0 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg0 += var9;
                                 } else {
                                    class483.method3591(arg4 >> 16, (byte)-61, arg0 >> 16, this.field4058, arg6, 0);
                                    arg6 += this.field4060;
                                    arg4 += var11;
                                    arg0 += var9;
                                 }
                              }
                           }
                        }

                        arg2 += var10;
                     } else {
                        class483.method3591(arg4 >> 16, (byte)-56, arg2 >> 16, this.field4058, arg6, 0);
                        arg4 += var11;
                        arg6 += this.field4060;
                        arg2 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field4072[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "<init>",
      descriptor = "(Lck;II)V"
   )
   public class290(class667 arg0, int arg1, int arg2) {
      try {
         this.field4058 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4072[5] + (arg0 != null ? field4072[4] : field4072[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2209(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2210(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
