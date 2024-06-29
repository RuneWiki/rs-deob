import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class381 extends class196 {
   @OriginalMember(
      owner = "client!vh",
      name = "F",
      descriptor = "[B"
   )
   public byte[] field5491;
   @OriginalMember(
      owner = "client!vh",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5494 = new String[]{method2883(method2882("Z,\u001bk{")), method2883(method2882("Z,\u001bl{")), method2883(method2882("Z,\u001b\u0014:B-A\u0016{")), method2883(method2882("B1YD")), method2883(method2882("Wj\u001b\u0006.")), method2883(method2882("Z,\u001bi{")), method2883(method2882("Z,\u001bj{"))};
   @OriginalMember(
      owner = "client!vh",
      name = "I",
      descriptor = "I"
   )
   public int field5485;
   @OriginalMember(
      owner = "client!vh",
      name = "L",
      descriptor = "I"
   )
   public static int field5486;
   @OriginalMember(
      owner = "client!vh",
      name = "H",
      descriptor = "I"
   )
   public static int field5487;
   @OriginalMember(
      owner = "client!vh",
      name = "G",
      descriptor = "I"
   )
   public static int field5488;
   @OriginalMember(
      owner = "client!vh",
      name = "K",
      descriptor = "I"
   )
   public static int field5489;
   @OriginalMember(
      owner = "client!vh",
      name = "D",
      descriptor = "I"
   )
   public int field5490;
   @OriginalMember(
      owner = "client!vh",
      name = "J",
      descriptor = "I"
   )
   public int field5492;
   @OriginalMember(
      owner = "client!vh",
      name = "E",
      descriptor = "I"
   )
   public int field5493;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method2878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         if (arg1 <= 115) {
            this.field5493 = 24;
         }

         ++field5489;
         int var9 = 0;
         if (~arg3 != ~arg4) {
            var9 = (-arg5 + arg6 << 16) / (arg4 - arg3);
         }

         int var10 = 0;
         if (~arg2 != ~arg4) {
            var10 = (arg0 - arg6 << 16) / (-arg4 + arg2);
         }

         int var11 = 0;
         if (arg2 != arg3) {
            var11 = (-arg0 + arg5 << 16) / (-arg2 + arg3);
         }

         if (arg3 <= arg4 && ~arg3 >= ~arg2) {
            if (~arg2 >= ~arg4) {
               arg6 = arg5 <<= 16;
               if (~arg3 > -1) {
                  arg6 -= arg3 * var11;
                  arg5 -= arg3 * var9;
                  arg3 = 0;
               }

               arg0 <<= 16;
               if (~arg2 > -1) {
                  arg0 -= arg2 * var10;
                  arg2 = 0;
               }

               if (~arg2 != ~arg3 && var11 < var9 || arg2 == arg3 && var9 < var10) {
                  arg4 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field5490 * arg3;
                  if (var8) {
                     class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                     arg6 += var11;
                     arg5 += var9;
                     arg3 += this.field5490;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                 arg0 += var10;
                                 arg3 += this.field5490;
                                 arg5 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var9;
                                    } else {
                                       class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                       arg0 += var10;
                                       arg3 += this.field5490;
                                       arg5 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field5490;
                        } else {
                           class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                           arg6 += var11;
                           arg5 += var9;
                           arg3 += this.field5490;
                        }
                     }
                  }
               } else {
                  arg4 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field5490 * arg3;
                  if (var8) {
                     class688.method5022(arg3, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                     arg5 += var9;
                     arg6 += var11;
                     arg3 += this.field5490;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                 arg5 += var9;
                                 arg3 += this.field5490;
                                 arg0 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (~arg4 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var10;
                                    } else {
                                       class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                       arg5 += var9;
                                       arg3 += this.field5490;
                                       arg0 += var10;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field5490;
                        } else {
                           class688.method5022(arg3, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                           arg5 += var9;
                           arg6 += var11;
                           arg3 += this.field5490;
                        }
                     }
                  }
               }
            } else {
               arg0 = arg5 <<= 16;
               arg6 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var9;
                  arg0 -= arg3 * var11;
                  arg3 = 0;
               }

               if (~arg4 > -1) {
                  arg6 -= arg4 * var10;
                  arg4 = 0;
               }

               if (arg3 != arg4 && ~var9 < ~var11 || arg3 == arg4 && ~var10 > ~var11) {
                  arg2 -= arg4;
                  arg4 -= arg3;
                  arg3 = this.field5490 * arg3;
                  if (var8) {
                     class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                     arg5 += var9;
                     arg3 += this.field5490;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg3, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                 arg3 += this.field5490;
                                 arg6 += var10;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class688.method5022(arg3, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                       arg3 += this.field5490;
                                       arg6 += var10;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class688.method5022(arg3, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                           arg5 += var9;
                           arg3 += this.field5490;
                           arg0 += var11;
                        }
                     }
                  }
               } else {
                  arg2 -= arg4;
                  arg4 -= arg3;
                  arg3 = this.field5490 * arg3;
                  if (var8) {
                     class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                     arg5 += var9;
                     arg3 += this.field5490;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (arg4 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                 arg0 += var11;
                                 arg3 += this.field5490;
                                 arg6 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var10;
                                    } else {
                                       class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                       arg0 += var11;
                                       arg3 += this.field5490;
                                       arg6 += var10;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class688.method5022(arg3, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                           arg5 += var9;
                           arg3 += this.field5490;
                           arg0 += var11;
                        }
                     }
                  }
               }
            }
         } else if (~arg2 <= ~arg4) {
            if (arg2 >= arg3) {
               arg0 = arg6 <<= 16;
               if (~arg4 > -1) {
                  arg0 -= arg4 * var9;
                  arg6 -= arg4 * var10;
                  arg4 = 0;
               }

               arg5 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var11;
                  arg3 = 0;
               }

               if (~var9 <= ~var10) {
                  arg2 -= arg3;
                  arg3 -= arg4;
                  arg4 = this.field5490 * arg4;
                  if (var8) {
                     class688.method5022(arg4, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                     arg6 += var10;
                     arg0 += var9;
                     arg4 += this.field5490;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                 arg5 += var11;
                                 arg6 += var10;
                                 arg4 += this.field5490;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += this.field5490;
                                    } else {
                                       class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                       arg5 += var11;
                                       arg6 += var10;
                                       arg4 += this.field5490;
                                    }
                                 }
                              }
                           }

                           arg4 += this.field5490;
                        } else {
                           class688.method5022(arg4, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                           arg6 += var10;
                           arg0 += var9;
                           arg4 += this.field5490;
                        }
                     }
                  }
               } else {
                  arg2 -= arg3;
                  arg3 -= arg4;
                  arg4 = this.field5490 * arg4;
                  if (var8) {
                     class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                     arg4 += this.field5490;
                     arg0 += var9;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                 arg6 += var10;
                                 arg5 += var11;
                                 arg4 += this.field5490;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += this.field5490;
                                    } else {
                                       class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                       arg6 += var10;
                                       arg5 += var11;
                                       arg4 += this.field5490;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                           arg4 += this.field5490;
                           arg0 += var9;
                           arg6 += var10;
                        }
                     }
                  }
               }
            } else {
               arg5 = arg6 <<= 16;
               if (~arg4 > -1) {
                  arg6 -= arg4 * var10;
                  arg5 -= arg4 * var9;
                  arg4 = 0;
               }

               arg0 <<= 16;
               if (~arg2 > -1) {
                  arg0 -= arg2 * var11;
                  arg2 = 0;
               }

               if ((arg2 == arg4 || ~var10 >= ~var9) && (arg2 != arg4 || var9 <= var11)) {
                  arg3 -= arg2;
                  arg2 -= arg4;
                  arg4 = this.field5490 * arg4;
                  if (var8) {
                     class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                     arg6 += var10;
                     arg5 += var9;
                     arg4 += this.field5490;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                 arg0 += var11;
                                 arg5 += var9;
                                 arg4 += this.field5490;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += this.field5490;
                                    } else {
                                       class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                       arg0 += var11;
                                       arg5 += var9;
                                       arg4 += this.field5490;
                                    }
                                 }
                              }
                           }

                           arg4 += this.field5490;
                        } else {
                           class688.method5022(arg4, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                           arg6 += var10;
                           arg5 += var9;
                           arg4 += this.field5490;
                        }
                     }
                  }
               } else {
                  arg3 -= arg2;
                  arg2 -= arg4;
                  arg4 = this.field5490 * arg4;
                  if (var8) {
                     class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                     arg5 += var9;
                     arg4 += this.field5490;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class688.method5022(arg4, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                 arg4 += this.field5490;
                                 arg5 += var9;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class688.method5022(arg4, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                       arg4 += this.field5490;
                                       arg5 += var9;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class688.method5022(arg4, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                           arg5 += var9;
                           arg4 += this.field5490;
                           arg6 += var10;
                        }
                     }
                  }
               }
            }
         } else if (arg4 > arg3) {
            arg6 = arg0 <<= 16;
            arg5 <<= 16;
            if (~arg2 > -1) {
               arg6 -= arg2 * var10;
               arg0 -= arg2 * var11;
               arg2 = 0;
            }

            if (~arg3 > -1) {
               arg5 -= arg3 * var9;
               arg3 = 0;
            }

            if (var10 >= var11) {
               arg4 -= arg3;
               arg3 -= arg2;
               arg2 = this.field5490 * arg2;
               if (var8) {
                  class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                  arg6 += var10;
                  arg0 += var11;
                  arg2 += this.field5490;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                              arg2 += this.field5490;
                              arg5 += var9;
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
                                    class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg5 >> 16, this.field5491);
                                    arg2 += this.field5490;
                                    arg5 += var9;
                                    arg6 += var10;
                                 }
                              }
                           }
                        }

                        arg2 += this.field5490;
                     } else {
                        class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                        arg6 += var10;
                        arg0 += var11;
                        arg2 += this.field5490;
                     }
                  }
               }
            } else {
               arg4 -= arg3;
               arg3 -= arg2;
               arg2 = this.field5490 * arg2;
               if (var8) {
                  class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                  arg2 += this.field5490;
                  arg0 += var11;
                  arg6 += var10;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class688.method5022(arg2, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                              arg6 += var10;
                              arg5 += var9;
                              arg2 += this.field5490;
                           }

                           while(true) {
                              while(true) {
                                 --arg4;
                                 if (arg4 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += this.field5490;
                                 } else {
                                    class688.method5022(arg2, 0, arg5 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                    arg6 += var10;
                                    arg5 += var9;
                                    arg2 += this.field5490;
                                 }
                              }
                           }
                        }

                        arg6 += var10;
                     } else {
                        class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                        arg2 += this.field5490;
                        arg0 += var11;
                        arg6 += var10;
                     }
                  }
               }
            }
         } else {
            arg5 = arg0 <<= 16;
            arg6 <<= 16;
            if (arg2 < 0) {
               arg0 -= arg2 * var11;
               arg5 -= arg2 * var10;
               arg2 = 0;
            }

            if (~arg4 > -1) {
               arg6 -= arg4 * var9;
               arg4 = 0;
            }

            if (~var11 >= ~var10) {
               arg3 -= arg4;
               arg4 -= arg2;
               arg2 = this.field5490 * arg2;
               if (var8) {
                  class688.method5022(arg2, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                  arg5 += var10;
                  arg0 += var11;
                  arg2 += this.field5490;
               }

               while(true) {
                  while(true) {
                     --arg4;
                     if (~arg4 > -1) {
                        if (!var8) {
                           if (var8) {
                              class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                              arg6 += var9;
                              arg0 += var11;
                              arg2 += this.field5490;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (arg3 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += this.field5490;
                                 } else {
                                    class688.method5022(arg2, 0, arg6 >> 16, (byte)74, arg0 >> 16, this.field5491);
                                    arg6 += var9;
                                    arg0 += var11;
                                    arg2 += this.field5490;
                                 }
                              }
                           }
                        }

                        arg2 += this.field5490;
                     } else {
                        class688.method5022(arg2, 0, arg5 >> 16, (byte)74, arg0 >> 16, this.field5491);
                        arg5 += var10;
                        arg0 += var11;
                        arg2 += this.field5490;
                     }
                  }
               }
            } else {
               arg3 -= arg4;
               arg4 -= arg2;
               arg2 = this.field5490 * arg2;
               if (var8) {
                  class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                  arg0 += var11;
                  arg5 += var10;
                  arg2 += this.field5490;
               }

               while(true) {
                  while(true) {
                     --arg4;
                     if (arg4 < 0) {
                        if (!var8) {
                           if (var8) {
                              class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                              arg0 += var11;
                              arg2 += this.field5490;
                              arg6 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg3;
                                 if (~arg3 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg6 += var9;
                                 } else {
                                    class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg6 >> 16, this.field5491);
                                    arg0 += var11;
                                    arg2 += this.field5490;
                                    arg6 += var9;
                                 }
                              }
                           }
                        }

                        arg2 += this.field5490;
                     } else {
                        class688.method5022(arg2, 0, arg0 >> 16, (byte)74, arg5 >> 16, this.field5491);
                        arg0 += var11;
                        arg5 += var10;
                        arg2 += this.field5490;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field5494[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public final void method2879(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         this.field5485 = arg1 - arg0;
         ++field5487;
         this.field5492 = arg0;
         this.field5493 = arg4;
         this.field5490 = -arg4 + arg2;
         int var6 = -87 / ((arg3 - 67) / 56);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5494[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method2880(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5488;
         int var3 = -1;
         if (arg0 > -118) {
            this.method2881(-89, -120, 80);
         }

         int var4 = this.field5491.length + -8;
         if (var2) {
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
            ++var3;
            this.field5491[var3] = 0;
         }

         while(true) {
            while(var4 > var3) {
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
               ++var3;
               this.field5491[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field5491[var3] = 0;
               }

               while(var3 < this.field5491.length + -1) {
                  ++var3;
                  this.field5491[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field5491[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5494[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method2881(int arg0, int arg1, int arg2) {
      try {
         int var4 = -3 / ((arg2 - -37) / 33);
         ++field5486;
         return ~this.field5491.length <= ~(arg0 * arg1);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5494[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "<init>",
      descriptor = "(Lea;II)V"
   )
   public class381(class573 arg0, int arg1, int arg2) {
      try {
         this.field5491 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5494[2] + (arg0 != null ? field5494[4] : field5494[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2882(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2883(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
