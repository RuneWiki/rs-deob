import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class516 extends class273 {
   @OriginalMember(
      owner = "client!ii",
      name = "A",
      descriptor = "[B"
   )
   public byte[] field7848;
   @OriginalMember(
      owner = "client!ii",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7853 = new String[]{method3996(method3995("\u0000\tAh\u0010")), method3996(method3995("\u0000\tAo\u0010")), method3996(method3995("\u0000\tAn\u0010")), method3996(method3995("\u0000\tA\u0011Q\u0007\t\u001b\u0013\u0010")), method3996(method3995("\u0007\u0015\u0003A")), method3996(method3995("\u0012NA\u0003E")), method3996(method3995("\u0000\tAl\u0010")), method3996(method3995("\u0000\tAi\u0010"))};
   @OriginalMember(
      owner = "client!ii",
      name = "H",
      descriptor = "[Ltia;"
   )
   public static class208[] field7846 = new class208[5];
   @OriginalMember(
      owner = "client!ii",
      name = "L",
      descriptor = "Lfs;"
   )
   public static class68 field7850;
   @OriginalMember(
      owner = "client!ii",
      name = "J",
      descriptor = "I"
   )
   public static int field7839;
   @OriginalMember(
      owner = "client!ii",
      name = "x",
      descriptor = "I"
   )
   public int field7840;
   @OriginalMember(
      owner = "client!ii",
      name = "y",
      descriptor = "I"
   )
   public int field7841;
   @OriginalMember(
      owner = "client!ii",
      name = "w",
      descriptor = "I"
   )
   public static int field7842;
   @OriginalMember(
      owner = "client!ii",
      name = "B",
      descriptor = "I"
   )
   public static int field7843;
   @OriginalMember(
      owner = "client!ii",
      name = "D",
      descriptor = "I"
   )
   public static int field7844;
   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "I"
   )
   public int field7845;
   @OriginalMember(
      owner = "client!ii",
      name = "C",
      descriptor = "I"
   )
   public static int field7849;
   @OriginalMember(
      owner = "client!ii",
      name = "K",
      descriptor = "I"
   )
   public int field7851;
   @OriginalMember(
      owner = "client!ii",
      name = "F",
      descriptor = "I"
   )
   public static int field7852;
   @OriginalMember(
      owner = "client!ii",
      name = "I",
      descriptor = "Ljq;"
   )
   public static class672 field7847;

   static {
      for(int var0 = 0; ~field7846.length < ~var0; ++var0) {
         field7846[var0] = new class208();
      }

      field7850 = new class68(0, -1);
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(B)V",
      line = 7
   )
   public final void method3990(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field7842;
         int var3 = -1;
         if (arg0 == 103) {
            int var4 = this.field7848.length + -8;
            if (var2) {
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
               ++var3;
               this.field7848[var3] = 0;
            }

            while(true) {
               while(var3 < var4) {
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
                  ++var3;
                  this.field7848[var3] = 0;
               }

               if (!var2) {
                  if (var2) {
                     ++var3;
                     this.field7848[var3] = 0;
                  }

                  while(~var3 > ~(this.field7848.length + -1)) {
                     ++var3;
                     this.field7848[var3] = 0;
                  }

                  return;
               }

               ++var3;
               this.field7848[var3] = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7853[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 36
   )
   public final void method3991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field7844;
         if (arg0 != -1811582416) {
            this.method3990((byte)59);
         }

         int var9 = 0;
         if (~arg2 != ~arg5) {
            var9 = (-arg1 + arg4 << 16) / (-arg5 + arg2);
         }

         int var10 = 0;
         if (~arg2 != ~arg3) {
            var10 = (-arg4 + arg6 << 16) / (-arg2 + arg3);
         }

         int var11 = 0;
         if (arg3 != arg5) {
            var11 = (-arg6 + arg1 << 16) / (-arg3 + arg5);
         }

         if (arg2 >= arg5 && ~arg5 >= ~arg3) {
            if (arg2 < arg3) {
               arg6 = arg1 <<= 16;
               if (arg5 < 0) {
                  arg6 -= arg5 * var11;
                  arg1 -= arg5 * var9;
                  arg5 = 0;
               }

               arg4 <<= 16;
               if (arg2 < 0) {
                  arg4 -= arg2 * var10;
                  arg2 = 0;
               }

               if (arg2 != arg5 && var9 > var11 || ~arg2 == ~arg5 && ~var11 < ~var10) {
                  arg3 -= arg2;
                  arg2 -= arg5;
                  arg5 = this.field7851 * arg5;
                  if (var8) {
                     class194.method1718(0, 0, this.field7848, arg1 >> 16, arg6 >> 16, arg5);
                     arg6 += var11;
                     arg5 += this.field7851;
                     arg1 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg5);
                                 arg4 += var10;
                                 arg6 += var11;
                                 arg5 += this.field7851;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field7851;
                                    } else {
                                       class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg5);
                                       arg4 += var10;
                                       arg6 += var11;
                                       arg5 += this.field7851;
                                    }
                                 }
                              }
                           }

                           arg1 += var9;
                        } else {
                           class194.method1718(0, 0, this.field7848, arg1 >> 16, arg6 >> 16, arg5);
                           arg6 += var11;
                           arg5 += this.field7851;
                           arg1 += var9;
                        }
                     }
                  }
               } else {
                  arg3 -= arg2;
                  arg2 -= arg5;
                  arg5 = this.field7851 * arg5;
                  if (var8) {
                     class194.method1718(0, 0, this.field7848, arg6 >> 16, arg1 >> 16, arg5);
                     arg6 += var11;
                     arg1 += var9;
                     arg5 += this.field7851;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg4 >> 16, arg5);
                                 arg6 += var11;
                                 arg4 += var10;
                                 arg5 += this.field7851;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field7851;
                                    } else {
                                       class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg4 >> 16, arg5);
                                       arg6 += var11;
                                       arg4 += var10;
                                       arg5 += this.field7851;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field7851;
                        } else {
                           class194.method1718(0, 0, this.field7848, arg6 >> 16, arg1 >> 16, arg5);
                           arg6 += var11;
                           arg1 += var9;
                           arg5 += this.field7851;
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

               arg6 <<= 16;
               if (~arg3 > -1) {
                  arg6 -= arg3 * var10;
                  arg3 = 0;
               }

               if (~arg3 != ~arg5 && var11 < var9 || ~arg3 == ~arg5 && ~var10 < ~var9) {
                  arg2 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field7851 * arg5;
                  if (var8) {
                     class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg5);
                     arg1 += var9;
                     arg4 += var11;
                     arg5 += this.field7851;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg6 >> 16, arg5);
                                 arg6 += var10;
                                 arg1 += var9;
                                 arg5 += this.field7851;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += this.field7851;
                                    } else {
                                       class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg6 >> 16, arg5);
                                       arg6 += var10;
                                       arg1 += var9;
                                       arg5 += this.field7851;
                                    }
                                 }
                              }
                           }

                           arg5 += this.field7851;
                        } else {
                           class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg5);
                           arg1 += var9;
                           arg4 += var11;
                           arg5 += this.field7851;
                        }
                     }
                  }
               } else {
                  arg2 -= arg3;
                  arg3 -= arg5;
                  arg5 = this.field7851 * arg5;
                  if (var8) {
                     class194.method1718(0, arg0 + 1811582416, this.field7848, arg4 >> 16, arg1 >> 16, arg5);
                     arg5 += this.field7851;
                     arg4 += var11;
                     arg1 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg1 >> 16, arg5);
                                 arg1 += var9;
                                 arg5 += this.field7851;
                                 arg6 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var10;
                                    } else {
                                       class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg1 >> 16, arg5);
                                       arg1 += var9;
                                       arg5 += this.field7851;
                                       arg6 += var10;
                                    }
                                 }
                              }
                           }

                           arg1 += var9;
                        } else {
                           class194.method1718(0, arg0 + 1811582416, this.field7848, arg4 >> 16, arg1 >> 16, arg5);
                           arg5 += this.field7851;
                           arg4 += var11;
                           arg1 += var9;
                        }
                     }
                  }
               }
            }
         } else if (arg2 > arg3) {
            if (arg5 >= arg2) {
               arg1 = arg6 <<= 16;
               arg4 <<= 16;
               if (arg3 < 0) {
                  arg1 -= arg3 * var10;
                  arg6 -= arg3 * var11;
                  arg3 = 0;
               }

               if (~arg2 > -1) {
                  arg4 -= arg2 * var9;
                  arg2 = 0;
               }

               if (var10 < var11) {
                  arg5 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field7851 * arg3;
                  if (var8) {
                     class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg1 >> 16, arg3);
                     arg1 += var10;
                     arg3 += this.field7851;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, 0, this.field7848, arg6 >> 16, arg4 >> 16, arg3);
                                 arg3 += this.field7851;
                                 arg4 += var9;
                                 arg6 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var11;
                                    } else {
                                       class194.method1718(0, 0, this.field7848, arg6 >> 16, arg4 >> 16, arg3);
                                       arg3 += this.field7851;
                                       arg4 += var9;
                                       arg6 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg6 >> 16, arg1 >> 16, arg3);
                           arg1 += var10;
                           arg3 += this.field7851;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg5 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field7851 * arg3;
                  if (var8) {
                     class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg6 >> 16, arg3);
                     arg3 += this.field7851;
                     arg6 += var11;
                     arg1 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg3);
                                 arg6 += var11;
                                 arg3 += this.field7851;
                                 arg4 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var9;
                                    } else {
                                       class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg3);
                                       arg6 += var11;
                                       arg3 += this.field7851;
                                       arg4 += var9;
                                    }
                                 }
                              }
                           }

                           arg1 += var10;
                        } else {
                           class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg6 >> 16, arg3);
                           arg3 += this.field7851;
                           arg6 += var11;
                           arg1 += var10;
                        }
                     }
                  }
               }
            } else {
               arg4 = arg6 <<= 16;
               if (~arg3 > -1) {
                  arg6 -= arg3 * var11;
                  arg4 -= arg3 * var10;
                  arg3 = 0;
               }

               arg1 <<= 16;
               if (arg5 < 0) {
                  arg1 -= arg5 * var9;
                  arg5 = 0;
               }

               if (var11 > var10) {
                  arg2 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field7851 * arg3;
                  if (var8) {
                     class194.method1718(0, 0, this.field7848, arg6 >> 16, arg4 >> 16, arg3);
                     arg6 += var11;
                     arg3 += this.field7851;
                     arg4 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (arg5 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg3);
                                 arg3 += this.field7851;
                                 arg1 += var9;
                                 arg4 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var10;
                                    } else {
                                       class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg3);
                                       arg3 += this.field7851;
                                       arg1 += var9;
                                       arg4 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var10;
                        } else {
                           class194.method1718(0, 0, this.field7848, arg6 >> 16, arg4 >> 16, arg3);
                           arg6 += var11;
                           arg3 += this.field7851;
                           arg4 += var10;
                        }
                     }
                  }
               } else {
                  arg2 -= arg5;
                  arg5 -= arg3;
                  arg3 = this.field7851 * arg3;
                  if (var8) {
                     class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg3);
                     arg4 += var10;
                     arg3 += this.field7851;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg4 >> 16, arg1 >> 16, arg3);
                                 arg1 += var9;
                                 arg3 += this.field7851;
                                 arg4 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var10;
                                    } else {
                                       class194.method1718(0, arg0 ^ -1811582416, this.field7848, arg4 >> 16, arg1 >> 16, arg3);
                                       arg1 += var9;
                                       arg3 += this.field7851;
                                       arg4 += var10;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class194.method1718(0, 0, this.field7848, arg4 >> 16, arg6 >> 16, arg3);
                           arg4 += var10;
                           arg3 += this.field7851;
                           arg6 += var11;
                        }
                     }
                  }
               }
            }
         } else if (arg5 > arg3) {
            arg1 = arg4 <<= 16;
            if (~arg2 > -1) {
               arg4 -= arg2 * var10;
               arg1 -= arg2 * var9;
               arg2 = 0;
            }

            arg6 <<= 16;
            if (arg3 < 0) {
               arg6 -= arg3 * var11;
               arg3 = 0;
            }

            if ((~arg2 == ~arg3 || var9 >= var10) && (arg2 != arg3 || var9 <= var11)) {
               arg5 -= arg3;
               arg3 -= arg2;
               arg2 = this.field7851 * arg2;
               if (var8) {
                  class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg2);
                  arg4 += var10;
                  arg2 += this.field7851;
                  arg1 += var9;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class194.method1718(0, 0, this.field7848, arg1 >> 16, arg6 >> 16, arg2);
                              arg1 += var9;
                              arg2 += this.field7851;
                              arg6 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg6 += var11;
                                 } else {
                                    class194.method1718(0, 0, this.field7848, arg1 >> 16, arg6 >> 16, arg2);
                                    arg1 += var9;
                                    arg2 += this.field7851;
                                    arg6 += var11;
                                 }
                              }
                           }
                        }

                        arg1 += var9;
                     } else {
                        class194.method1718(0, 0, this.field7848, arg1 >> 16, arg4 >> 16, arg2);
                        arg4 += var10;
                        arg2 += this.field7851;
                        arg1 += var9;
                     }
                  }
               }
            } else {
               arg5 -= arg3;
               arg3 -= arg2;
               arg2 = this.field7851 * arg2;
               if (var8) {
                  class194.method1718(0, 0, this.field7848, arg4 >> 16, arg1 >> 16, arg2);
                  arg4 += var10;
                  arg2 += this.field7851;
                  arg1 += var9;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class194.method1718(0, 0, this.field7848, arg6 >> 16, arg1 >> 16, arg2);
                              arg6 += var11;
                              arg1 += var9;
                              arg2 += this.field7851;
                           }

                           while(true) {
                              while(true) {
                                 --arg5;
                                 if (~arg5 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += this.field7851;
                                 } else {
                                    class194.method1718(0, 0, this.field7848, arg6 >> 16, arg1 >> 16, arg2);
                                    arg6 += var11;
                                    arg1 += var9;
                                    arg2 += this.field7851;
                                 }
                              }
                           }
                        }

                        arg1 += var9;
                     } else {
                        class194.method1718(0, 0, this.field7848, arg4 >> 16, arg1 >> 16, arg2);
                        arg4 += var10;
                        arg2 += this.field7851;
                        arg1 += var9;
                     }
                  }
               }
            }
         } else {
            arg6 = arg4 <<= 16;
            arg1 <<= 16;
            if (arg2 < 0) {
               arg6 -= arg2 * var9;
               arg4 -= arg2 * var10;
               arg2 = 0;
            }

            if (~arg5 > -1) {
               arg1 -= arg5 * var11;
               arg5 = 0;
            }

            if (var9 >= var10) {
               arg3 -= arg5;
               arg5 -= arg2;
               arg2 = this.field7851 * arg2;
               if (var8) {
                  class194.method1718(0, arg0 + 1811582416, this.field7848, arg6 >> 16, arg4 >> 16, arg2);
                  arg4 += var10;
                  arg6 += var9;
                  arg2 += this.field7851;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (!var8) {
                           if (var8) {
                              class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg4 >> 16, arg2);
                              arg4 += var10;
                              arg1 += var11;
                              arg2 += this.field7851;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += this.field7851;
                                 } else {
                                    class194.method1718(0, arg0 + 1811582416, this.field7848, arg1 >> 16, arg4 >> 16, arg2);
                                    arg4 += var10;
                                    arg1 += var11;
                                    arg2 += this.field7851;
                                 }
                              }
                           }
                        }

                        arg2 += this.field7851;
                     } else {
                        class194.method1718(0, arg0 + 1811582416, this.field7848, arg6 >> 16, arg4 >> 16, arg2);
                        arg4 += var10;
                        arg6 += var9;
                        arg2 += this.field7851;
                     }
                  }
               }
            } else {
               arg3 -= arg5;
               arg5 -= arg2;
               arg2 = this.field7851 * arg2;
               if (var8) {
                  class194.method1718(0, arg0 + 1811582416, this.field7848, arg4 >> 16, arg6 >> 16, arg2);
                  arg6 += var9;
                  arg2 += this.field7851;
                  arg4 += var10;
               }

               while(true) {
                  while(true) {
                     --arg5;
                     if (~arg5 > -1) {
                        if (!var8) {
                           if (var8) {
                              class194.method1718(0, 0, this.field7848, arg4 >> 16, arg1 >> 16, arg2);
                              arg2 += this.field7851;
                              arg4 += var10;
                              arg1 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (arg3 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg1 += var11;
                                 } else {
                                    class194.method1718(0, 0, this.field7848, arg4 >> 16, arg1 >> 16, arg2);
                                    arg2 += this.field7851;
                                    arg4 += var10;
                                    arg1 += var11;
                                 }
                              }
                           }
                        }

                        arg4 += var10;
                     } else {
                        class194.method1718(0, arg0 + 1811582416, this.field7848, arg4 >> 16, arg6 >> 16, arg2);
                        arg6 += var9;
                        arg2 += this.field7851;
                        arg4 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7853[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(IBI)Z",
      line = 474
   )
   public final boolean method3992(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 98) {
            this.method3991(-109, -76, 89, 39, 121, 32, 41);
         }

         ++field7839;
         return ~(arg0 * arg2) >= ~this.field7848.length;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7853[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(IIIII)V",
      line = 488
   )
   public final void method3993(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 == 0) {
            ++field7849;
            this.field7851 = -arg3 + arg4;
            this.field7845 = -arg1 + arg2;
            this.field7841 = arg3;
            this.field7840 = arg1;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7853[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "(I)V",
      line = 509
   )
   public static void method3994(int arg0) {
      try {
         if (arg0 != -1) {
            field7850 = null;
         }

         field7847 = null;
         field7846 = null;
         field7850 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7853[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "(Lmu;II)V",
      line = 542
   )
   public class516(class258 arg0, int arg1, int arg2) {
      try {
         this.field7848 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7853[3] + (arg0 != null ? field7853[5] : field7853[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3995(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3996(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
