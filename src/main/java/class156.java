import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class156 extends class114 {
   @OriginalMember(
      owner = "client!pda",
      name = "F",
      descriptor = "[B"
   )
   public byte[] field2018;
   @OriginalMember(
      owner = "client!pda",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2020 = new String[]{method1324(method1323("CFK\u0007'\u001b")), method1324(method1323("CFK\u0007!\u001b")), method1324(method1323("CFK\u0007 \u001b")), method1324(method1323("CFK\u0007_ZLC]]\u001b")), method1324(method1323("]WFE")), method1324(method1323("H\f\u0004\u0007\u001e")), method1324(method1323("CFK\u0007&\u001b")), method1324(method1323("CFK\u0007%\u001b"))};
   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "Laka;"
   )
   public static class418 field2010 = new class418(109, 7);
   @OriginalMember(
      owner = "client!pda",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field2019 = new int[2];
   @OriginalMember(
      owner = "client!pda",
      name = "w",
      descriptor = "D"
   )
   public static double field2016 = -1.0D;
   @OriginalMember(
      owner = "client!pda",
      name = "C",
      descriptor = "I"
   )
   public int field2007;
   @OriginalMember(
      owner = "client!pda",
      name = "y",
      descriptor = "I"
   )
   public static int field2008;
   @OriginalMember(
      owner = "client!pda",
      name = "A",
      descriptor = "I"
   )
   public int field2009;
   @OriginalMember(
      owner = "client!pda",
      name = "B",
      descriptor = "I"
   )
   public int field2011;
   @OriginalMember(
      owner = "client!pda",
      name = "x",
      descriptor = "I"
   )
   public static int field2012;
   @OriginalMember(
      owner = "client!pda",
      name = "v",
      descriptor = "I"
   )
   public static int field2013;
   @OriginalMember(
      owner = "client!pda",
      name = "D",
      descriptor = "I"
   )
   public int field2014;
   @OriginalMember(
      owner = "client!pda",
      name = "u",
      descriptor = "I"
   )
   public static int field2015;
   @OriginalMember(
      owner = "client!pda",
      name = "G",
      descriptor = "[Lpia;"
   )
   public static class680[] field2017;

   @OriginalMember(
      owner = "client!pda",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1318(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field2013;
         if (arg0 != -10243) {
            this.field2007 = -68;
         }

         int var3 = -1;
         int var4 = this.field2018.length + -8;
         if (var2) {
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
            ++var3;
            this.field2018[var3] = 0;
         }

         while(true) {
            while(~var4 < ~var3) {
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
               ++var3;
               this.field2018[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field2018[var3] = 0;
               }

               while(this.field2018.length + -1 > var3) {
                  ++var3;
                  this.field2018[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field2018[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2020[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(BIIIIII)V"
   )
   public final void method1319(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field2015;
         int var9 = 0;
         if (arg0 > -1) {
            method1320((byte)-83);
         }

         if (~arg3 != ~arg5) {
            var9 = (arg4 - arg1 << 16) / (-arg5 + arg3);
         }

         int var10 = 0;
         if (~arg3 != ~arg6) {
            var10 = (-arg4 + arg2 << 16) / (-arg3 + arg6);
         }

         int var11 = 0;
         if (~arg5 != ~arg6) {
            var11 = (-arg2 + arg1 << 16) / (-arg6 + arg5);
         }

         if (arg5 <= arg3 && ~arg6 <= ~arg5) {
            if (~arg6 < ~arg3) {
               arg2 = arg1 <<= 16;
               if (~arg5 > -1) {
                  arg2 -= arg5 * var11;
                  arg1 -= arg5 * var9;
                  arg5 = 0;
               }

               arg4 <<= 16;
               if (~arg3 > -1) {
                  arg4 -= arg3 * var10;
                  arg3 = 0;
               }

               if (arg3 != arg5 && var9 > var11 || ~arg3 == ~arg5 && var10 < var11) {
                  arg6 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field2007 * arg5;
                  if (var8) {
                     class539.method4083(arg1 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                     arg5 += this.field2007;
                     arg2 += var11;
                     arg1 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg4 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                                 arg2 += var11;
                                 arg4 += var10;
                                 arg5 += this.field2007;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field2007;
                                    } else {
                                       class539.method4083(arg4 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                                       arg2 += var11;
                                       arg4 += var10;
                                       arg5 += this.field2007;
                                    }
                                 }
                              }
                           }

                           arg1 += var9;
                        } else {
                           class539.method4083(arg1 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                           arg5 += this.field2007;
                           arg2 += var11;
                           arg1 += var9;
                        }
                     }
                  }
               } else {
                  arg6 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field2007 * arg5;
                  if (var8) {
                     class539.method4083(arg2 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                     arg5 += this.field2007;
                     arg1 += var9;
                     arg2 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg2 >> 16, 3, arg5, 0, arg4 >> 16, this.field2018);
                                 arg2 += var11;
                                 arg4 += var10;
                                 arg5 += this.field2007;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field2007;
                                    } else {
                                       class539.method4083(arg2 >> 16, 3, arg5, 0, arg4 >> 16, this.field2018);
                                       arg2 += var11;
                                       arg4 += var10;
                                       arg5 += this.field2007;
                                    }
                                 }
                              }
                           }

                           arg2 += var11;
                        } else {
                           class539.method4083(arg2 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                           arg5 += this.field2007;
                           arg1 += var9;
                           arg2 += var11;
                        }
                     }
                  }
               }
            } else {
               arg4 = arg1 <<= 16;
               if (~arg5 > -1) {
                  arg1 -= arg5 * var9;
                  arg4 -= arg5 * var11;
                  arg5 = 0;
               }

               arg2 <<= 16;
               if (arg6 < 0) {
                  arg2 -= arg6 * var10;
                  arg6 = 0;
               }

               if (~arg5 != ~arg6 && ~var9 < ~var11 || arg5 == arg6 && var10 > var9) {
                  arg3 -= arg6;
                  arg6 -= arg5;
                  arg5 = this.field2007 * arg5;
                  if (var8) {
                     class539.method4083(arg1 >> 16, 3, arg5, 0, arg4 >> 16, this.field2018);
                     arg4 += var11;
                     arg1 += var9;
                     arg5 += this.field2007;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg1 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                                 arg1 += var9;
                                 arg5 += this.field2007;
                                 arg2 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += var10;
                                    } else {
                                       class539.method4083(arg1 >> 16, 3, arg5, 0, arg2 >> 16, this.field2018);
                                       arg1 += var9;
                                       arg5 += this.field2007;
                                       arg2 += var10;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field2007;
                        } else {
                           class539.method4083(arg1 >> 16, 3, arg5, 0, arg4 >> 16, this.field2018);
                           arg4 += var11;
                           arg1 += var9;
                           arg5 += this.field2007;
                        }
                     }
                  }
               } else {
                  arg3 -= arg6;
                  arg6 -= arg5;
                  arg5 = this.field2007 * arg5;
                  if (var8) {
                     class539.method4083(arg4 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                     arg1 += var9;
                     arg5 += this.field2007;
                     arg4 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg2 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                                 arg1 += var9;
                                 arg5 += this.field2007;
                                 arg2 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += var10;
                                    } else {
                                       class539.method4083(arg2 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                                       arg1 += var9;
                                       arg5 += this.field2007;
                                       arg2 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var11;
                        } else {
                           class539.method4083(arg4 >> 16, 3, arg5, 0, arg1 >> 16, this.field2018);
                           arg1 += var9;
                           arg5 += this.field2007;
                           arg4 += var11;
                        }
                     }
                  }
               }
            }
         } else if (arg3 <= arg6) {
            if (arg5 > arg6) {
               arg1 = arg4 <<= 16;
               if (arg3 < 0) {
                  arg1 -= arg3 * var9;
                  arg4 -= arg3 * var10;
                  arg3 = 0;
               }

               arg2 <<= 16;
               if (arg6 < 0) {
                  arg2 -= arg6 * var11;
                  arg6 = 0;
               }

               if (arg3 != arg6 && var9 < var10 || arg3 == arg6 && ~var9 < ~var11) {
                  arg5 -= arg6;
                  arg6 -= arg3;
                  arg3 = this.field2007 * arg3;
                  if (var8) {
                     class539.method4083(arg4 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                     arg1 += var9;
                     arg4 += var10;
                     arg3 += this.field2007;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (~arg6 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg2 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                                 arg2 += var11;
                                 arg3 += this.field2007;
                                 arg1 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg1 += var9;
                                    } else {
                                       class539.method4083(arg2 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                                       arg2 += var11;
                                       arg3 += this.field2007;
                                       arg1 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field2007;
                        } else {
                           class539.method4083(arg4 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                           arg1 += var9;
                           arg4 += var10;
                           arg3 += this.field2007;
                        }
                     }
                  }
               } else {
                  arg5 -= arg6;
                  arg6 -= arg3;
                  arg3 = this.field2007 * arg3;
                  if (var8) {
                     class539.method4083(arg1 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                     arg3 += this.field2007;
                     arg1 += var9;
                     arg4 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (~arg6 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg1 >> 16, 3, arg3, 0, arg2 >> 16, this.field2018);
                                 arg1 += var9;
                                 arg2 += var11;
                                 arg3 += this.field2007;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg3 += this.field2007;
                                    } else {
                                       class539.method4083(arg1 >> 16, 3, arg3, 0, arg2 >> 16, this.field2018);
                                       arg1 += var9;
                                       arg2 += var11;
                                       arg3 += this.field2007;
                                    }
                                 }
                              }
                           }

                           arg4 += var10;
                        } else {
                           class539.method4083(arg1 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                           arg3 += this.field2007;
                           arg1 += var9;
                           arg4 += var10;
                        }
                     }
                  }
               }
            } else {
               arg2 = arg4 <<= 16;
               arg1 <<= 16;
               if (arg3 < 0) {
                  arg4 -= arg3 * var10;
                  arg2 -= arg3 * var9;
                  arg3 = 0;
               }

               if (~arg5 > -1) {
                  arg1 -= arg5 * var11;
                  arg5 = 0;
               }

               if (var10 > var9) {
                  arg6 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field2007 * arg3;
                  if (var8) {
                     class539.method4083(arg4 >> 16, 3, arg3, 0, arg2 >> 16, this.field2018);
                     arg3 += this.field2007;
                     arg4 += var10;
                     arg2 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg4 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                                 arg1 += var11;
                                 arg4 += var10;
                                 arg3 += this.field2007;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg3 += this.field2007;
                                    } else {
                                       class539.method4083(arg4 >> 16, 3, arg3, 0, arg1 >> 16, this.field2018);
                                       arg1 += var11;
                                       arg4 += var10;
                                       arg3 += this.field2007;
                                    }
                                 }
                              }
                           }

                           arg2 += var9;
                        } else {
                           class539.method4083(arg4 >> 16, 3, arg3, 0, arg2 >> 16, this.field2018);
                           arg3 += this.field2007;
                           arg4 += var10;
                           arg2 += var9;
                        }
                     }
                  }
               } else {
                  arg6 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field2007 * arg3;
                  if (var8) {
                     class539.method4083(arg2 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                     arg4 += var10;
                     arg3 += this.field2007;
                     arg2 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (arg5 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class539.method4083(arg1 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                                 arg3 += this.field2007;
                                 arg1 += var11;
                                 arg4 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var10;
                                    } else {
                                       class539.method4083(arg1 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                                       arg3 += this.field2007;
                                       arg1 += var11;
                                       arg4 += var10;
                                    }
                                 }
                              }
                           }

                           arg2 += var9;
                        } else {
                           class539.method4083(arg2 >> 16, 3, arg3, 0, arg4 >> 16, this.field2018);
                           arg4 += var10;
                           arg3 += this.field2007;
                           arg2 += var9;
                        }
                     }
                  }
               }
            }
         } else if (~arg3 < ~arg5) {
            arg4 = arg2 <<= 16;
            arg1 <<= 16;
            if (arg6 < 0) {
               arg4 -= arg6 * var10;
               arg2 -= arg6 * var11;
               arg6 = 0;
            }

            if (arg5 < 0) {
               arg1 -= arg5 * var9;
               arg5 = 0;
            }

            if (~var11 < ~var10) {
               arg3 -= arg5;
               arg5 -= arg6;
               arg6 = this.field2007 * arg6;
               if (var8) {
                  class539.method4083(arg2 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                  arg2 += var11;
                  arg6 += this.field2007;
                  arg4 += var10;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (!var8) {
                           if (var8) {
                              class539.method4083(arg1 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                              arg6 += this.field2007;
                              arg4 += var10;
                              arg1 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (arg3 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg1 += var9;
                                 } else {
                                    class539.method4083(arg1 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                                    arg6 += this.field2007;
                                    arg4 += var10;
                                    arg1 += var9;
                                 }
                              }
                           }
                        }

                        arg4 += var10;
                     } else {
                        class539.method4083(arg2 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                        arg2 += var11;
                        arg6 += this.field2007;
                        arg4 += var10;
                     }
                  }
               }
            } else {
               arg3 -= arg5;
               arg5 -= arg6;
               arg6 = this.field2007 * arg6;
               if (var8) {
                  class539.method4083(arg4 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                  arg6 += this.field2007;
                  arg4 += var10;
                  arg2 += var11;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (arg5 < 0) {
                        if (!var8) {
                           if (var8) {
                              class539.method4083(arg4 >> 16, 3, arg6, 0, arg1 >> 16, this.field2018);
                              arg6 += this.field2007;
                              arg4 += var10;
                              arg1 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg1 += var9;
                                 } else {
                                    class539.method4083(arg4 >> 16, 3, arg6, 0, arg1 >> 16, this.field2018);
                                    arg6 += this.field2007;
                                    arg4 += var10;
                                    arg1 += var9;
                                 }
                              }
                           }
                        }

                        arg2 += var11;
                     } else {
                        class539.method4083(arg4 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                        arg6 += this.field2007;
                        arg4 += var10;
                        arg2 += var11;
                     }
                  }
               }
            }
         } else {
            arg1 = arg2 <<= 16;
            arg4 <<= 16;
            if (arg6 < 0) {
               arg1 -= arg6 * var10;
               arg2 -= arg6 * var11;
               arg6 = 0;
            }

            if (~arg3 > -1) {
               arg4 -= arg3 * var9;
               arg3 = 0;
            }

            if (var10 < var11) {
               arg5 -= arg3;
               arg3 -= arg6;
               arg6 = this.field2007 * arg6;
               if (var8) {
                  class539.method4083(arg2 >> 16, 3, arg6, 0, arg1 >> 16, this.field2018);
                  arg6 += this.field2007;
                  arg1 += var10;
                  arg2 += var11;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class539.method4083(arg2 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                              arg6 += this.field2007;
                              arg4 += var9;
                              arg2 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (arg5 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var11;
                                 } else {
                                    class539.method4083(arg2 >> 16, 3, arg6, 0, arg4 >> 16, this.field2018);
                                    arg6 += this.field2007;
                                    arg4 += var9;
                                    arg2 += var11;
                                 }
                              }
                           }
                        }

                        arg2 += var11;
                     } else {
                        class539.method4083(arg2 >> 16, 3, arg6, 0, arg1 >> 16, this.field2018);
                        arg6 += this.field2007;
                        arg1 += var10;
                        arg2 += var11;
                     }
                  }
               }
            } else {
               arg5 -= arg3;
               arg3 -= arg6;
               arg6 = this.field2007 * arg6;
               if (var8) {
                  class539.method4083(arg1 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                  arg6 += this.field2007;
                  arg2 += var11;
                  arg1 += var10;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (~arg3 > -1) {
                        if (!var8) {
                           if (var8) {
                              class539.method4083(arg4 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                              arg6 += this.field2007;
                              arg4 += var9;
                              arg2 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (arg5 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var11;
                                 } else {
                                    class539.method4083(arg4 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                                    arg6 += this.field2007;
                                    arg4 += var9;
                                    arg2 += var11;
                                 }
                              }
                           }
                        }

                        arg1 += var10;
                     } else {
                        class539.method4083(arg1 >> 16, 3, arg6, 0, arg2 >> 16, this.field2018);
                        arg6 += this.field2007;
                        arg2 += var11;
                        arg1 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field2020[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1320(byte arg0) {
      try {
         field2019 = null;
         if (arg0 >= -50) {
            field2017 = null;
         }

         field2010 = null;
         field2017 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2020[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2012;
         this.field2011 = -arg3 + arg0;
         this.field2009 = arg3;
         this.field2007 = -arg1 + arg2;
         this.field2014 = arg1;
         if (arg4 != 2) {
            this.method1318(-45);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2020[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "(III)Z"
   )
   public final boolean method1322(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 1026542608) {
            this.field2009 = -69;
         }

         ++field2008;
         return ~(arg0 * arg1) >= ~this.field2018.length;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2020[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "<init>",
      descriptor = "(Lfm;II)V"
   )
   public class156(class281 arg0, int arg1, int arg2) {
      try {
         this.field2018 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2020[3] + (arg0 != null ? field2020[5] : field2020[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
