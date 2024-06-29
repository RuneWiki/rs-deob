import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class630 extends class273 {
   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "[B"
   )
   public byte[] field9120;
   @OriginalMember(
      owner = "client!oda",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9122 = new String[]{method4619(method4618("\u0002a$=")), method4619(method4618("\u0003p)\u007fS\u0005z!%QD")), method4619(method4618("\u0017:f\u007f\u0012")), method4619(method4618("\u0003p)\u007f-D")), method4619(method4618("\u0003p)\u007f,D")), method4619(method4618("\u0003p)\u007f*D")), method4619(method4618("\u0003p)\u007f)D")), method4619(method4618("\u0003p)\u007f.D")), method4619(method4618("\u0003p)\u007f+D"))};
   @OriginalMember(
      owner = "client!oda",
      name = "D",
      descriptor = "Llj;"
   )
   public static class304 field9113 = new class304(30);
   @OriginalMember(
      owner = "client!oda",
      name = "B",
      descriptor = "Llj;"
   )
   public static class304 field9118 = new class304(50);
   @OriginalMember(
      owner = "client!oda",
      name = "C",
      descriptor = "I"
   )
   public int field9109;
   @OriginalMember(
      owner = "client!oda",
      name = "I",
      descriptor = "I"
   )
   public static int field9110;
   @OriginalMember(
      owner = "client!oda",
      name = "A",
      descriptor = "I"
   )
   public static int field9111;
   @OriginalMember(
      owner = "client!oda",
      name = "E",
      descriptor = "I"
   )
   public int field9112;
   @OriginalMember(
      owner = "client!oda",
      name = "G",
      descriptor = "I"
   )
   public static int field9115;
   @OriginalMember(
      owner = "client!oda",
      name = "x",
      descriptor = "I"
   )
   public int field9116;
   @OriginalMember(
      owner = "client!oda",
      name = "H",
      descriptor = "I"
   )
   public int field9117;
   @OriginalMember(
      owner = "client!oda",
      name = "w",
      descriptor = "I"
   )
   public static int field9119;
   @OriginalMember(
      owner = "client!oda",
      name = "y",
      descriptor = "I"
   )
   public static int field9121;
   @OriginalMember(
      owner = "client!oda",
      name = "F",
      descriptor = "[Ljq;"
   )
   public static class672[] field9114;

   @OriginalMember(
      owner = "client!oda",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4612(int arg0) {
      try {
         field9113 = null;
         field9118 = null;
         field9114 = null;
         if (arg0 < 96) {
            field9114 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9122[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "g",
      descriptor = "(I)[Lsl;",
      line = 16
   )
   public static final class242[] method4613(int arg0) {
      try {
         ++field9115;
         return arg0 != -365997584 ? null : new class242[]{class12.field155, class208.field3170, class727.field10855};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9122[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(BII)Z",
      line = 34
   )
   public final boolean method4614(byte arg0, int arg1, int arg2) {
      try {
         ++field9121;
         if (arg0 > -52) {
            return true;
         } else {
            return this.field9120.length >= arg1 * arg2;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9122[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(IIZII)V",
      line = 45
   )
   public final void method4615(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         this.field9116 = arg1 - arg3;
         if (arg2) {
            this.field9109 = -108;
         }

         this.field9112 = arg0 - arg4;
         ++field9119;
         this.field9109 = arg4;
         this.field9117 = arg3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9122[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 66
   )
   public final void method4616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field9111;
         int var9 = 0;
         if (arg0 != -1) {
            this.method4616(46, 0, 104, 45, -91, 48, 97);
         }

         if (arg2 != arg4) {
            var9 = (-arg1 + arg5 << 16) / (-arg2 + arg4);
         }

         int var10 = 0;
         if (~arg3 != ~arg4) {
            var10 = (-arg5 + arg6 << 16) / (-arg4 + arg3);
         }

         int var11 = 0;
         if (arg2 != arg3) {
            var11 = (-arg6 + arg1 << 16) / (arg2 - arg3);
         }

         if (~arg2 >= ~arg4 && ~arg2 >= ~arg3) {
            if (arg3 <= arg4) {
               arg5 = arg1 <<= 16;
               if (arg2 < 0) {
                  arg1 -= arg2 * var9;
                  arg5 -= arg2 * var11;
                  arg2 = 0;
               }

               arg6 <<= 16;
               if (arg3 < 0) {
                  arg6 -= arg3 * var10;
                  arg3 = 0;
               }

               if (~arg2 != ~arg3 && var11 < var9 || ~arg2 == ~arg3 && ~var10 < ~var9) {
                  arg4 -= arg3;
                  arg3 -= arg2;
                  arg2 = this.field9116 * arg2;
                  if (var8) {
                     class727.method5364((byte)61, arg5 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                     arg1 += var9;
                     arg2 += this.field9116;
                     arg5 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)85, arg6 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                                 arg1 += var9;
                                 arg2 += this.field9116;
                                 arg6 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var10;
                                    } else {
                                       class727.method5364((byte)85, arg6 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                                       arg1 += var9;
                                       arg2 += this.field9116;
                                       arg6 += var10;
                                    }
                                 }
                              }
                           }

                           arg5 += var11;
                        } else {
                           class727.method5364((byte)61, arg5 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                           arg1 += var9;
                           arg2 += this.field9116;
                           arg5 += var11;
                        }
                     }
                  }
               } else {
                  arg4 -= arg3;
                  arg3 -= arg2;
                  arg2 = this.field9116 * arg2;
                  if (var8) {
                     class727.method5364((byte)-78, arg1 >> 16, this.field9120, arg2, arg5 >> 16, 0);
                     arg1 += var9;
                     arg2 += this.field9116;
                     arg5 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)-118, arg1 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                                 arg1 += var9;
                                 arg2 += this.field9116;
                                 arg6 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var10;
                                    } else {
                                       class727.method5364((byte)-118, arg1 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                                       arg1 += var9;
                                       arg2 += this.field9116;
                                       arg6 += var10;
                                    }
                                 }
                              }
                           }

                           arg5 += var11;
                        } else {
                           class727.method5364((byte)-78, arg1 >> 16, this.field9120, arg2, arg5 >> 16, 0);
                           arg1 += var9;
                           arg2 += this.field9116;
                           arg5 += var11;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg1 <<= 16;
               arg5 <<= 16;
               if (arg2 < 0) {
                  arg1 -= arg2 * var9;
                  arg6 -= arg2 * var11;
                  arg2 = 0;
               }

               if (arg4 < 0) {
                  arg5 -= arg4 * var10;
                  arg4 = 0;
               }

               if (arg2 != arg4 && var9 > var11 || arg2 == arg4 && ~var11 < ~var10) {
                  arg3 -= arg4;
                  arg4 -= arg2;
                  arg2 = this.field9116 * arg2;
                  if (var8) {
                     class727.method5364((byte)57, arg6 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                     arg1 += var9;
                     arg2 += this.field9116;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)12, arg6 >> 16, this.field9120, arg2, arg5 >> 16, 0);
                                 arg5 += var10;
                                 arg2 += this.field9116;
                                 arg6 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var11;
                                    } else {
                                       class727.method5364((byte)12, arg6 >> 16, this.field9120, arg2, arg5 >> 16, 0);
                                       arg5 += var10;
                                       arg2 += this.field9116;
                                       arg6 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class727.method5364((byte)57, arg6 >> 16, this.field9120, arg2, arg1 >> 16, 0);
                           arg1 += var9;
                           arg2 += this.field9116;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg3 -= arg4;
                  arg4 -= arg2;
                  arg2 = this.field9116 * arg2;
                  if (var8) {
                     class727.method5364((byte)123, arg1 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                     arg2 += this.field9116;
                     arg6 += var11;
                     arg1 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)32, arg5 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                                 arg2 += this.field9116;
                                 arg6 += var11;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class727.method5364((byte)32, arg5 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                                       arg2 += this.field9116;
                                       arg6 += var11;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg1 += var9;
                        } else {
                           class727.method5364((byte)123, arg1 >> 16, this.field9120, arg2, arg6 >> 16, 0);
                           arg2 += this.field9116;
                           arg6 += var11;
                           arg1 += var9;
                        }
                     }
                  }
               }
            }
         } else if (arg4 > arg3) {
            if (arg2 < arg4) {
               arg5 = arg6 <<= 16;
               arg1 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var10;
                  arg6 -= arg3 * var11;
                  arg3 = 0;
               }

               if (arg2 < 0) {
                  arg1 -= arg2 * var9;
                  arg2 = 0;
               }

               if (~var10 > ~var11) {
                  arg4 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field9116 * arg3;
                  if (var8) {
                     class727.method5364((byte)23, arg5 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                     arg3 += this.field9116;
                     arg5 += var10;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)110, arg5 >> 16, this.field9120, arg3, arg1 >> 16, 0);
                                 arg3 += this.field9116;
                                 arg1 += var9;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class727.method5364((byte)110, arg5 >> 16, this.field9120, arg3, arg1 >> 16, 0);
                                       arg3 += this.field9116;
                                       arg1 += var9;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class727.method5364((byte)23, arg5 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                           arg3 += this.field9116;
                           arg5 += var10;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg4 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field9116 * arg3;
                  if (var8) {
                     class727.method5364((byte)-77, arg6 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                     arg3 += this.field9116;
                     arg6 += var11;
                     arg5 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)102, arg1 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                                 arg3 += this.field9116;
                                 arg5 += var10;
                                 arg1 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg1 += var9;
                                    } else {
                                       class727.method5364((byte)102, arg1 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                                       arg3 += this.field9116;
                                       arg5 += var10;
                                       arg1 += var9;
                                    }
                                 }
                              }
                           }

                           arg5 += var10;
                        } else {
                           class727.method5364((byte)-77, arg6 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                           arg3 += this.field9116;
                           arg6 += var11;
                           arg5 += var10;
                        }
                     }
                  }
               }
            } else {
               arg1 = arg6 <<= 16;
               if (~arg3 > -1) {
                  arg6 -= arg3 * var11;
                  arg1 -= arg3 * var10;
                  arg3 = 0;
               }

               arg5 <<= 16;
               if (arg4 < 0) {
                  arg5 -= arg4 * var9;
                  arg4 = 0;
               }

               if (~var11 < ~var10) {
                  arg2 -= arg4;
                  arg4 -= arg3;
                  arg3 = this.field9116 * arg3;
                  if (var8) {
                     class727.method5364((byte)48, arg1 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                     arg1 += var10;
                     arg3 += this.field9116;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (arg4 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)-75, arg5 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                                 arg3 += this.field9116;
                                 arg5 += var9;
                                 arg6 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var11;
                                    } else {
                                       class727.method5364((byte)-75, arg5 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                                       arg3 += this.field9116;
                                       arg5 += var9;
                                       arg6 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class727.method5364((byte)48, arg1 >> 16, this.field9120, arg3, arg6 >> 16, 0);
                           arg1 += var10;
                           arg3 += this.field9116;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg2 -= arg4;
                  arg4 -= arg3;
                  arg3 = this.field9116 * arg3;
                  if (var8) {
                     class727.method5364((byte)103, arg6 >> 16, this.field9120, arg3, arg1 >> 16, 0);
                     arg1 += var10;
                     arg6 += var11;
                     arg3 += this.field9116;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (arg4 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class727.method5364((byte)-105, arg6 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                                 arg3 += this.field9116;
                                 arg6 += var11;
                                 arg5 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var9;
                                    } else {
                                       class727.method5364((byte)-105, arg6 >> 16, this.field9120, arg3, arg5 >> 16, 0);
                                       arg3 += this.field9116;
                                       arg6 += var11;
                                       arg5 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field9116;
                        } else {
                           class727.method5364((byte)103, arg6 >> 16, this.field9120, arg3, arg1 >> 16, 0);
                           arg1 += var10;
                           arg6 += var11;
                           arg3 += this.field9116;
                        }
                     }
                  }
               }
            }
         } else if (arg3 >= arg2) {
            arg6 = arg5 <<= 16;
            arg1 <<= 16;
            if (arg4 < 0) {
               arg5 -= arg4 * var10;
               arg6 -= arg4 * var9;
               arg4 = 0;
            }

            if (arg2 < 0) {
               arg1 -= arg2 * var11;
               arg2 = 0;
            }

            if (~var9 > ~var10) {
               arg3 -= arg2;
               arg2 -= arg4;
               arg4 = this.field9116 * arg4;
               if (var8) {
                  class727.method5364((byte)-94, arg6 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                  arg4 += this.field9116;
                  arg5 += var10;
                  arg6 += var9;
               }

               while(true) {
                  while(true) {
                     --arg2;
                     if (arg2 < 0) {
                        if (!var8) {
                           if (var8) {
                              class727.method5364((byte)-108, arg1 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                              arg1 += var11;
                              arg4 += this.field9116;
                              arg5 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg5 += var10;
                                 } else {
                                    class727.method5364((byte)-108, arg1 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                                    arg1 += var11;
                                    arg4 += this.field9116;
                                    arg5 += var10;
                                 }
                              }
                           }
                        }

                        arg6 += var9;
                     } else {
                        class727.method5364((byte)-94, arg6 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                        arg4 += this.field9116;
                        arg5 += var10;
                        arg6 += var9;
                     }
                  }
               }
            } else {
               arg3 -= arg2;
               arg2 -= arg4;
               arg4 = this.field9116 * arg4;
               if (var8) {
                  class727.method5364((byte)45, arg5 >> 16, this.field9120, arg4, arg6 >> 16, 0);
                  arg5 += var10;
                  arg4 += this.field9116;
                  arg6 += var9;
               }

               while(true) {
                  while(true) {
                     --arg2;
                     if (~arg2 > -1) {
                        if (!var8) {
                           if (var8) {
                              class727.method5364((byte)-114, arg5 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                              arg5 += var10;
                              arg1 += var11;
                              arg4 += this.field9116;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg4 += this.field9116;
                                 } else {
                                    class727.method5364((byte)-114, arg5 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                                    arg5 += var10;
                                    arg1 += var11;
                                    arg4 += this.field9116;
                                 }
                              }
                           }
                        }

                        arg6 += var9;
                     } else {
                        class727.method5364((byte)45, arg5 >> 16, this.field9120, arg4, arg6 >> 16, 0);
                        arg5 += var10;
                        arg4 += this.field9116;
                        arg6 += var9;
                     }
                  }
               }
            }
         } else {
            arg1 = arg5 <<= 16;
            if (arg4 < 0) {
               arg5 -= arg4 * var10;
               arg1 -= arg4 * var9;
               arg4 = 0;
            }

            arg6 <<= 16;
            if (arg3 < 0) {
               arg6 -= arg3 * var11;
               arg3 = 0;
            }

            if (~arg3 != ~arg4 && var9 < var10 || arg3 == arg4 && ~var11 > ~var9) {
               arg2 -= arg3;
               arg3 -= arg4;
               arg4 = this.field9116 * arg4;
               if (var8) {
                  class727.method5364((byte)-128, arg1 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                  arg4 += this.field9116;
                  arg1 += var9;
                  arg5 += var10;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class727.method5364((byte)117, arg1 >> 16, this.field9120, arg4, arg6 >> 16, 0);
                              arg1 += var9;
                              arg4 += this.field9116;
                              arg6 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg2;
                                 if (arg2 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg6 += var11;
                                 } else {
                                    class727.method5364((byte)117, arg1 >> 16, this.field9120, arg4, arg6 >> 16, 0);
                                    arg1 += var9;
                                    arg4 += this.field9116;
                                    arg6 += var11;
                                 }
                              }
                           }
                        }

                        arg5 += var10;
                     } else {
                        class727.method5364((byte)-128, arg1 >> 16, this.field9120, arg4, arg5 >> 16, 0);
                        arg4 += this.field9116;
                        arg1 += var9;
                        arg5 += var10;
                     }
                  }
               }
            } else {
               arg2 -= arg3;
               arg3 -= arg4;
               arg4 = this.field9116 * arg4;
               if (var8) {
                  class727.method5364((byte)15, arg5 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                  arg5 += var10;
                  arg1 += var9;
                  arg4 += this.field9116;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class727.method5364((byte)75, arg6 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                              arg4 += this.field9116;
                              arg1 += var9;
                              arg6 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg2;
                                 if (~arg2 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg6 += var11;
                                 } else {
                                    class727.method5364((byte)75, arg6 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                                    arg4 += this.field9116;
                                    arg1 += var9;
                                    arg6 += var11;
                                 }
                              }
                           }
                        }

                        arg4 += this.field9116;
                     } else {
                        class727.method5364((byte)15, arg5 >> 16, this.field9120, arg4, arg1 >> 16, 0);
                        arg5 += var10;
                        arg1 += var9;
                        arg4 += this.field9116;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9122[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(B)V",
      line = 516
   )
   public final void method4617(byte arg0) {
      boolean var2 = client.field1786;

      try {
         if (arg0 != 0) {
            this.field9109 = -2;
         }

         ++field9110;
         int var3 = -1;
         int var4 = this.field9120.length - 8;
         if (var2) {
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
            ++var3;
            this.field9120[var3] = 0;
         }

         while(true) {
            while(~var3 > ~var4) {
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
               ++var3;
               this.field9120[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field9120[var3] = 0;
               }

               while(~var3 > ~(this.field9120.length + -1)) {
                  ++var3;
                  this.field9120[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field9120[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9122[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "<init>",
      descriptor = "(Lc;II)V",
      line = 545
   )
   public class630(class652 arg0, int arg1, int arg2) {
      try {
         this.field9120 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9122[1] + (arg0 != null ? field9122[2] : field9122[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4618(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4619(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
