import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class366 extends class193 {
   @OriginalMember(
      owner = "client!sc",
      name = "D",
      descriptor = "[B"
   )
   public byte[] field5510;
   @OriginalMember(
      owner = "client!sc",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5512 = new String[]{method2847(method2846("Ih2\u001b9")), method2847(method2846("\u001a#")), method2847(method2846("Ih2\u001f9")), method2847(method2846("\u001a7\u007f>}\u0007mz7w\n;\"")), method2847(method2846("\u0006$\u007f>}\u0004")), method2847(method2846("\u0013732~V5")), method2847(method2846("\u001a7\u007f>}\u0007;,7w\u0002;\"")), method2847(method2846("\u001a7\u007f>}\u0007mz7w\\m\"")), method2847(method2846("Ih2\u001d9")), method2847(method2846("Ih2\u00189")), method2847(method2846("Ih2\u001e9")), method2847(method2846("A%2\u007fl")), method2847(method2846("Ih2\u00019")), method2847(method2846("T~p=")), method2847(method2846("Ih2\u001c9")), method2847(method2846("Ih2mxTbho9")), method2847(method2846("Ih2\u001a9"))};
   @OriginalMember(
      owner = "client!sc",
      name = "I",
      descriptor = "Lnn;"
   )
   public static class436 field5503 = new class436(method2847(method2846("m_K\u0018A")), method2847(method2846("Umz8r_")), method2847(method2846("e|u!")), 3);
   @OriginalMember(
      owner = "client!sc",
      name = "M",
      descriptor = "Lar;"
   )
   public static class710 field5511 = new class710(true);
   @OriginalMember(
      owner = "client!sc",
      name = "K",
      descriptor = "I"
   )
   public static int field5497;
   @OriginalMember(
      owner = "client!sc",
      name = "H",
      descriptor = "I"
   )
   public static int field5498;
   @OriginalMember(
      owner = "client!sc",
      name = "F",
      descriptor = "I"
   )
   public int field5499;
   @OriginalMember(
      owner = "client!sc",
      name = "B",
      descriptor = "I"
   )
   public int field5500;
   @OriginalMember(
      owner = "client!sc",
      name = "A",
      descriptor = "I"
   )
   public int field5501;
   @OriginalMember(
      owner = "client!sc",
      name = "C",
      descriptor = "I"
   )
   public int field5502;
   @OriginalMember(
      owner = "client!sc",
      name = "G",
      descriptor = "I"
   )
   public static int field5504;
   @OriginalMember(
      owner = "client!sc",
      name = "L",
      descriptor = "I"
   )
   public static int field5505;
   @OriginalMember(
      owner = "client!sc",
      name = "O",
      descriptor = "I"
   )
   public static int field5506;
   @OriginalMember(
      owner = "client!sc",
      name = "N",
      descriptor = "I"
   )
   public static int field5507;
   @OriginalMember(
      owner = "client!sc",
      name = "E",
      descriptor = "I"
   )
   public static int field5508;
   @OriginalMember(
      owner = "client!sc",
      name = "J",
      descriptor = "I"
   )
   public static int field5509;

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BII)Z"
   )
   public final boolean method2838(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -108) {
            this.method2844((byte)-126);
         }

         ++field5504;
         return ~this.field5510.length <= ~(arg1 * arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5512[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([SZI)[S"
   )
   public static final short[] method2839(short[] arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            return null;
         } else {
            ++field5508;
            short[] var3 = new short[arg2];
            class195.method1489(arg0, 0, var3, 0, arg2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5512[12] + (arg0 != null ? field5512[11] : field5512[13]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   public final void method2840(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         ++field5506;
         int var9 = 0;
         if (arg0 != arg5) {
            var9 = (-arg3 + arg2 << 16) / (arg5 - arg0);
         }

         int var10 = 0;
         if (~arg1 != ~arg5) {
            var10 = (-arg2 + arg6 << 16) / (arg1 - arg5);
         }

         if (arg4 <= 86) {
            this.method2840(17, 42, -15, -17, (byte)70, -44, -42);
         }

         int var11 = 0;
         if (arg0 != arg1) {
            var11 = (-arg6 + arg3 << 16) / (-arg1 + arg0);
         }

         if (~arg0 >= ~arg5 && arg1 >= arg0) {
            if (arg5 >= arg1) {
               arg2 = arg3 <<= 16;
               arg6 <<= 16;
               if (arg0 < 0) {
                  arg3 -= arg0 * var9;
                  arg2 -= arg0 * var11;
                  arg0 = 0;
               }

               if (~arg1 > -1) {
                  arg6 -= arg1 * var10;
                  arg1 = 0;
               }

               if (arg0 != arg1 && var11 < var9 || arg0 == arg1 && var10 > var9) {
                  arg5 -= arg1;
                  arg1 -= arg0;
                  arg0 = this.field5502 * arg0;
                  if (var8 != 0) {
                     class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                     arg0 += this.field5502;
                     arg3 += var9;
                     arg2 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                                 arg6 += var10;
                                 arg0 += this.field5502;
                                 arg3 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg3 += var9;
                                    } else {
                                       class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                                       arg6 += var10;
                                       arg0 += this.field5502;
                                       arg3 += var9;
                                    }
                                 }
                              }
                           }

                           arg2 += var11;
                        } else {
                           class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                           arg0 += this.field5502;
                           arg3 += var9;
                           arg2 += var11;
                        }
                     }
                  }
               } else {
                  arg5 -= arg1;
                  arg1 -= arg0;
                  arg0 = this.field5502 * arg0;
                  if (var8 != 0) {
                     class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg0, (byte)113);
                     arg2 += var11;
                     arg0 += this.field5502;
                     arg3 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (arg1 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                                 arg6 += var10;
                                 arg0 += this.field5502;
                                 arg3 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (arg5 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg3 += var9;
                                    } else {
                                       class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                                       arg6 += var10;
                                       arg0 += this.field5502;
                                       arg3 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += var9;
                        } else {
                           class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg0, (byte)113);
                           arg2 += var11;
                           arg0 += this.field5502;
                           arg3 += var9;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg3 <<= 16;
               if (~arg0 > -1) {
                  arg3 -= arg0 * var9;
                  arg6 -= arg0 * var11;
                  arg0 = 0;
               }

               arg2 <<= 16;
               if (~arg5 > -1) {
                  arg2 -= arg5 * var10;
                  arg5 = 0;
               }

               if (arg0 != arg5 && ~var11 > ~var9 || arg0 == arg5 && ~var11 < ~var10) {
                  arg1 -= arg5;
                  arg5 -= arg0;
                  arg0 = this.field5502 * arg0;
                  if (var8 != 0) {
                     class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                     arg3 += var9;
                     arg0 += this.field5502;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg0, (byte)113);
                                 arg0 += this.field5502;
                                 arg2 += var10;
                                 arg6 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (arg1 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg6 += var11;
                                    } else {
                                       class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg0, (byte)113);
                                       arg0 += this.field5502;
                                       arg2 += var10;
                                       arg6 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg0, (byte)113);
                           arg3 += var9;
                           arg0 += this.field5502;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg1 -= arg5;
                  arg5 -= arg0;
                  arg0 = this.field5502 * arg0;
                  if (var8 != 0) {
                     class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                     arg0 += this.field5502;
                     arg6 += var11;
                     arg3 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                                 arg2 += var10;
                                 arg6 += var11;
                                 arg0 += this.field5502;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg0 += this.field5502;
                                    } else {
                                       class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                                       arg2 += var10;
                                       arg6 += var11;
                                       arg0 += this.field5502;
                                    }
                                 }
                              }
                           }

                           arg3 += var9;
                        } else {
                           class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg0, (byte)113);
                           arg0 += this.field5502;
                           arg6 += var11;
                           arg3 += var9;
                        }
                     }
                  }
               }
            }
         } else if (~arg1 > ~arg5) {
            if (arg5 <= arg0) {
               arg3 = arg6 <<= 16;
               if (~arg1 > -1) {
                  arg3 -= arg1 * var10;
                  arg6 -= arg1 * var11;
                  arg1 = 0;
               }

               arg2 <<= 16;
               if (~arg5 > -1) {
                  arg2 -= arg5 * var9;
                  arg5 = 0;
               }

               if (~var11 < ~var10) {
                  arg0 -= arg5;
                  arg5 -= arg1;
                  arg1 = this.field5502 * arg1;
                  if (var8 != 0) {
                     class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                     arg1 += this.field5502;
                     arg3 += var10;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                                 arg1 += this.field5502;
                                 arg2 += var9;
                                 arg6 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg6 += var11;
                                    } else {
                                       class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                                       arg1 += this.field5502;
                                       arg2 += var9;
                                       arg6 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                           arg1 += this.field5502;
                           arg3 += var10;
                           arg6 += var11;
                        }
                     }
                  }
               } else {
                  arg0 -= arg5;
                  arg5 -= arg1;
                  arg1 = this.field5502 * arg1;
                  if (var8 != 0) {
                     class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg1, (byte)113);
                     arg1 += this.field5502;
                     arg6 += var11;
                     arg3 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg5;
                        if (~arg5 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                                 arg1 += this.field5502;
                                 arg6 += var11;
                                 arg2 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg2 += var9;
                                    } else {
                                       class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                                       arg1 += this.field5502;
                                       arg6 += var11;
                                       arg2 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += var10;
                        } else {
                           class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg1, (byte)113);
                           arg1 += this.field5502;
                           arg6 += var11;
                           arg3 += var10;
                        }
                     }
                  }
               }
            } else {
               arg2 = arg6 <<= 16;
               if (arg1 < 0) {
                  arg6 -= arg1 * var11;
                  arg2 -= arg1 * var10;
                  arg1 = 0;
               }

               arg3 <<= 16;
               if (~arg0 > -1) {
                  arg3 -= arg0 * var9;
                  arg0 = 0;
               }

               if (var10 < var11) {
                  arg5 -= arg0;
                  arg0 -= arg1;
                  arg1 = this.field5502 * arg1;
                  if (var8 != 0) {
                     class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                     arg6 += var11;
                     arg2 += var10;
                     arg1 += this.field5502;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (~arg0 > -1) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg1, (byte)113);
                                 arg1 += this.field5502;
                                 arg2 += var10;
                                 arg3 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg3 += var9;
                                    } else {
                                       class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg1, (byte)113);
                                       arg1 += this.field5502;
                                       arg2 += var10;
                                       arg3 += var9;
                                    }
                                 }
                              }
                           }

                           arg1 += this.field5502;
                        } else {
                           class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg1, (byte)113);
                           arg6 += var11;
                           arg2 += var10;
                           arg1 += this.field5502;
                        }
                     }
                  }
               } else {
                  arg5 -= arg0;
                  arg0 -= arg1;
                  arg1 = this.field5502 * arg1;
                  if (var8 != 0) {
                     class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                     arg1 += this.field5502;
                     arg2 += var10;
                     arg6 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (var8 == 0) {
                              if (var8 != 0) {
                                 class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                                 arg3 += var9;
                                 arg1 += this.field5502;
                                 arg2 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg5;
                                    if (~arg5 > -1) {
                                       if (var8 == 0) {
                                          return;
                                       }

                                       arg2 += var10;
                                    } else {
                                       class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                                       arg3 += var9;
                                       arg1 += this.field5502;
                                       arg2 += var10;
                                    }
                                 }
                              }
                           }

                           arg6 += var11;
                        } else {
                           class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg1, (byte)113);
                           arg1 += this.field5502;
                           arg2 += var10;
                           arg6 += var11;
                        }
                     }
                  }
               }
            }
         } else if (~arg0 >= ~arg1) {
            arg6 = arg2 <<= 16;
            arg3 <<= 16;
            if (arg5 < 0) {
               arg2 -= arg5 * var10;
               arg6 -= arg5 * var9;
               arg5 = 0;
            }

            if (~arg0 > -1) {
               arg3 -= arg0 * var11;
               arg0 = 0;
            }

            if (var9 >= var10) {
               arg1 -= arg0;
               arg0 -= arg5;
               arg5 = this.field5502 * arg5;
               if (var8 != 0) {
                  class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg5, (byte)113);
                  arg6 += var9;
                  arg5 += this.field5502;
                  arg2 += var10;
               }

               while(true) {
                  while(true) {
                     --arg0;
                     if (~arg0 > -1) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                              arg3 += var11;
                              arg5 += this.field5502;
                              arg2 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (~arg1 > -1) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg2 += var10;
                                 } else {
                                    class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                                    arg3 += var11;
                                    arg5 += this.field5502;
                                    arg2 += var10;
                                 }
                              }
                           }
                        }

                        arg2 += var10;
                     } else {
                        class6.method55(arg2 >> 16, arg6 >> 16, this.field5510, 0, arg5, (byte)113);
                        arg6 += var9;
                        arg5 += this.field5502;
                        arg2 += var10;
                     }
                  }
               }
            } else {
               arg1 -= arg0;
               arg0 -= arg5;
               arg5 = this.field5502 * arg5;
               if (var8 != 0) {
                  class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                  arg2 += var10;
                  arg5 += this.field5502;
                  arg6 += var9;
               }

               while(true) {
                  while(true) {
                     --arg0;
                     if (arg0 < 0) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                              arg5 += this.field5502;
                              arg3 += var11;
                              arg2 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (arg1 < 0) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg2 += var10;
                                 } else {
                                    class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                                    arg5 += this.field5502;
                                    arg3 += var11;
                                    arg2 += var10;
                                 }
                              }
                           }
                        }

                        arg6 += var9;
                     } else {
                        class6.method55(arg6 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                        arg2 += var10;
                        arg5 += this.field5502;
                        arg6 += var9;
                     }
                  }
               }
            }
         } else {
            arg3 = arg2 <<= 16;
            arg6 <<= 16;
            if (arg5 < 0) {
               arg3 -= arg5 * var9;
               arg2 -= arg5 * var10;
               arg5 = 0;
            }

            if (arg1 < 0) {
               arg6 -= arg1 * var11;
               arg1 = 0;
            }

            if (~arg1 != ~arg5 && ~var9 > ~var10 || ~arg1 == ~arg5 && var9 > var11) {
               arg0 -= arg1;
               arg1 -= arg5;
               arg5 = this.field5502 * arg5;
               if (var8 != 0) {
                  class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                  arg2 += var10;
                  arg3 += var9;
                  arg5 += this.field5502;
               }

               while(true) {
                  while(true) {
                     --arg1;
                     if (~arg1 > -1) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg5, (byte)113);
                              arg3 += var9;
                              arg5 += this.field5502;
                              arg6 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg0;
                                 if (arg0 < 0) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg6 += var11;
                                 } else {
                                    class6.method55(arg3 >> 16, arg6 >> 16, this.field5510, 0, arg5, (byte)113);
                                    arg3 += var9;
                                    arg5 += this.field5502;
                                    arg6 += var11;
                                 }
                              }
                           }
                        }

                        arg5 += this.field5502;
                     } else {
                        class6.method55(arg3 >> 16, arg2 >> 16, this.field5510, 0, arg5, (byte)113);
                        arg2 += var10;
                        arg3 += var9;
                        arg5 += this.field5502;
                     }
                  }
               }
            } else {
               arg0 -= arg1;
               arg1 -= arg5;
               arg5 = this.field5502 * arg5;
               if (var8 != 0) {
                  class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                  arg5 += this.field5502;
                  arg3 += var9;
                  arg2 += var10;
               }

               while(true) {
                  while(true) {
                     --arg1;
                     if (arg1 < 0) {
                        if (var8 == 0) {
                           if (var8 != 0) {
                              class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                              arg3 += var9;
                              arg5 += this.field5502;
                              arg6 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg0;
                                 if (arg0 < 0) {
                                    if (var8 == 0) {
                                       return;
                                    }

                                    arg6 += var11;
                                 } else {
                                    class6.method55(arg6 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                                    arg3 += var9;
                                    arg5 += this.field5502;
                                    arg6 += var11;
                                 }
                              }
                           }
                        }

                        arg2 += var10;
                     } else {
                        class6.method55(arg2 >> 16, arg3 >> 16, this.field5510, 0, arg5, (byte)113);
                        arg5 += this.field5502;
                        arg3 += var9;
                        arg2 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5512[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "([IIIIIIII)Z"
   )
   public static final boolean method2841(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      int var8 = client.field4530;

      try {
         if (arg1 < 0) {
            arg1 = 0;
         }

         if (arg3 > class25.field261) {
            arg3 = class25.field261;
         }

         ++field5509;
         if (~arg1 <= ~arg3) {
            return true;
         } else {
            if (arg2 >= -60) {
               field5503 = null;
            }

            int var10000;
            label213: {
               arg7 += arg1 + -1;
               arg5 += arg1 * arg6;
               arg4 = -arg1 + arg3 >> 2;
               int var11;
               int var12;
               if (~class637.field9265 == -2) {
                  label172: {
                     class171.field2123 += arg4;
                     if (var8 != 0) {
                        ++arg7;
                        if (arg0[arg7] > arg5) {
                           arg0[arg7] = arg5;
                        }

                        arg5 += arg6;
                     } else {
                        --arg4;
                        if (~arg4 > -1) {
                           arg4 = 3 & -arg1 + arg3;
                           if (var8 == 0) {
                              break label172;
                           }
                        } else {
                           ++arg7;
                           if (arg0[arg7] > arg5) {
                              arg0[arg7] = arg5;
                           }

                           arg5 += arg6;
                        }
                     }

                     while(true) {
                        var12 = arg7 + 1;
                        if (arg5 < arg0[var12]) {
                           arg0[var12] = arg5;
                        }

                        var11 = arg5 + arg6;
                        var10000 = ~var11;
                        ++var12;
                        if (var10000 > ~arg0[var12]) {
                           arg0[var12] = var11;
                        }

                        var11 += arg6;
                        arg7 = var12 + 1;
                        if (~arg0[arg7] < ~var11) {
                           arg0[arg7] = var11;
                        }

                        arg5 = var11 + arg6;
                        --arg4;
                        if (~arg4 > -1) {
                           arg4 = 3 & -arg1 + arg3;
                           if (var8 == 0) {
                              break;
                           }
                        } else {
                           ++arg7;
                           if (arg0[arg7] > arg5) {
                              arg0[arg7] = arg5;
                           }

                           arg5 += arg6;
                        }
                     }
                  }

                  if (var8 != 0) {
                     var10000 = ~arg5;
                     ++arg7;
                     if (var10000 > ~arg0[arg7]) {
                        arg0[arg7] = arg5;
                     }

                     arg5 += arg6;
                  }

                  label142:
                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (var8 == 0) {
                              if (var8 == 0) {
                                 var10000 = 1;
                                 if (var8 == 0) {
                                    return true;
                                 }
                                 break label213;
                              }
                              break label142;
                           }

                           arg5 += arg6;
                        } else {
                           var10000 = ~arg5;
                           ++arg7;
                           if (var10000 > ~arg0[arg7]) {
                              arg0[arg7] = arg5;
                           }

                           arg5 += arg6;
                        }
                     }
                  }
               }

               label121: {
                  arg5 -= 38400;
                  if (var8 != 0) {
                     var10000 = ~arg5;
                     ++arg7;
                     if (var10000 > ~arg0[arg7]) {
                        return false;
                     }

                     arg5 += arg6;
                  } else {
                     --arg4;
                     if (~arg4 > -1) {
                        arg4 = -arg1 + arg3 & 3;
                        if (var8 == 0) {
                           break label121;
                        }
                     } else {
                        var10000 = ~arg5;
                        ++arg7;
                        if (var10000 > ~arg0[arg7]) {
                           return false;
                        }

                        arg5 += arg6;
                     }
                  }

                  while(true) {
                     var10000 = ~arg5;
                     var12 = arg7 + 1;
                     if (var10000 > ~arg0[var12]) {
                        return false;
                     }

                     var11 = arg5 + arg6;
                     ++var12;
                     if (arg0[var12] > var11) {
                        return false;
                     }

                     var11 += arg6;
                     arg7 = var12 + 1;
                     if (~arg0[arg7] < ~var11) {
                        return false;
                     }

                     arg5 = var11 + arg6;
                     --arg4;
                     if (~arg4 > -1) {
                        arg4 = -arg1 + arg3 & 3;
                        if (var8 == 0) {
                           break;
                        }
                     } else {
                        var10000 = ~arg5;
                        ++arg7;
                        if (var10000 > ~arg0[arg7]) {
                           return false;
                        }

                        arg5 += arg6;
                     }
                  }
               }

               if (var8 != 0) {
                  ++arg7;
                  var10000 = arg0[arg7];
               } else {
                  --arg4;
                  if (~arg4 > -1) {
                     var10000 = 1;
                     if (var8 == 0) {
                        return true;
                     }
                  } else {
                     ++arg7;
                     var10000 = arg0[arg7];
                  }
               }
            }

            while(var10000 <= arg5) {
               arg5 += arg6;
               --arg4;
               if (~arg4 > -1) {
                  var10000 = 1;
                  if (var8 == 0) {
                     return true;
                  }
               } else {
                  ++arg7;
                  var10000 = arg0[arg7];
               }
            }

            return false;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5512[16] + (arg0 != null ? field5512[11] : field5512[13]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2842(boolean arg0) {
      try {
         if (!arg0) {
            field5511 = null;
            field5503 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5512[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method2843(int arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field5497;
         String var3 = Integer.toString(arg0);
         int var4 = -3 + var3.length();
         if (arg1 != -1) {
            method2843(-75, 24);
            if (var2 != 0) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }
         }

         while(true) {
            while(~var4 < -1) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            if (var2 == 0) {
               if (var3.length() > 9) {
                  return field5512[6] + var3.substring(0, var3.length() + -8) + class204.field2597.method1562((byte)-81, class728.field10827) + field5512[1] + var3 + field5512[5];
               }

               if (var3.length() > 6) {
                  return field5512[7] + var3.substring(0, var3.length() + -4) + class204.field2599.method1562((byte)-119, class728.field10827) + field5512[1] + var3 + field5512[5];
               }

               return field5512[3] + var3 + field5512[4];
            }

            var3 = var3;
            var4 -= 3;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5512[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2844(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field5505;
         if (arg0 != 21) {
            field5511 = null;
         }

         int var3 = -1;
         int var4 = this.field5510.length - 8;
         if (var2 != 0) {
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
            ++var3;
            this.field5510[var3] = 0;
         }

         while(true) {
            while(var3 < var4) {
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
               ++var3;
               this.field5510[var3] = 0;
            }

            if (var2 == 0) {
               if (var2 != 0) {
                  ++var3;
                  this.field5510[var3] = 0;
               }

               while(~var3 > ~(this.field5510.length - 1)) {
                  ++var3;
                  this.field5510[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field5510[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5512[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public final void method2845(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5500 = arg2;
         if (arg0 <= 62) {
            this.method2844((byte)-36);
         }

         this.field5501 = -arg2 + arg3;
         ++field5498;
         this.field5499 = arg1;
         this.field5502 = arg4 - arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5512[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "<init>",
      descriptor = "(Ldh;II)V"
   )
   public class366(class338 arg0, int arg1, int arg2) {
      try {
         this.field5510 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5512[15] + (arg0 != null ? field5512[11] : field5512[13]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2846(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2847(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
