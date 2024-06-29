import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class484 extends class412 {
   @OriginalMember(
      owner = "client!o",
      name = "y",
      descriptor = "[B"
   )
   public byte[] field6935;
   @OriginalMember(
      owner = "client!o",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6938 = new String[]{method3699(method3698("_\u001ce~")), method3699(method3698("_\u001c\u001d?:YF\u001f~")), method3699(method3698("^GM:")), method3699(method3698("K\u001c\u000fx)")), method3699(method3698("_\u001cf~")), method3699(method3698("_\u001c`~")), method3699(method3698("_\u001cg~")), method3699(method3698("_\u001cc~")), method3699(method3698("_\u001cb~")), method3699(method3698("_\u001cd~"))};
   @OriginalMember(
      owner = "client!o",
      name = "x",
      descriptor = "I"
   )
   public static int field6932 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "F",
      descriptor = "I"
   )
   public static int field6925 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "A",
      descriptor = "I"
   )
   public static int field6924;
   @OriginalMember(
      owner = "client!o",
      name = "H",
      descriptor = "I"
   )
   public static int field6926;
   @OriginalMember(
      owner = "client!o",
      name = "B",
      descriptor = "I"
   )
   public static int field6927;
   @OriginalMember(
      owner = "client!o",
      name = "u",
      descriptor = "I"
   )
   public int field6928;
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "I"
   )
   public static int field6929;
   @OriginalMember(
      owner = "client!o",
      name = "w",
      descriptor = "I"
   )
   public static int field6930;
   @OriginalMember(
      owner = "client!o",
      name = "G",
      descriptor = "I"
   )
   public int field6931;
   @OriginalMember(
      owner = "client!o",
      name = "v",
      descriptor = "I"
   )
   public static int field6933;
   @OriginalMember(
      owner = "client!o",
      name = "E",
      descriptor = "I"
   )
   public int field6934;
   @OriginalMember(
      owner = "client!o",
      name = "D",
      descriptor = "I"
   )
   public static int field6936;
   @OriginalMember(
      owner = "client!o",
      name = "C",
      descriptor = "I"
   )
   public int field6937;

   @OriginalMember(
      owner = "client!o",
      name = "e",
      descriptor = "(B)V"
   )
   public static final void method3691(byte arg0) {
      try {
         if (arg0 == 101) {
            ++field6924;
            class674.field9447 = (int)((double)class234.field3626 * 34.46D);
            class778.field11358 = 200;
            class674.field9447 <<= 2;
            if (class54.field794.method200()) {
               class674.field9447 += 512;
            }

            class560.method4167((byte)-68, false);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6938[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method3692(int arg0, char arg1) {
      try {
         int var2 = -121 % ((arg0 - 76) / 36);
         ++field6930;
         return ~arg1 <= -49 && ~arg1 >= -58 || arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6938[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method3693(byte arg0) {
      try {
         if (arg0 < 39) {
            method3692(-42, '_');
         }

         ++field6929;
         if (class678.field9669) {
            return 6;
         } else if (class143.field2272 == null) {
            return 0;
         } else {
            int var1 = class143.field2272.field4159;
            if (class455.method3507(-47, var1)) {
               return 1;
            } else if (class536.method3997(127, var1)) {
               return 2;
            } else if (class77.method849(120, var1)) {
               return 3;
            } else if (class220.method1904(0, var1)) {
               return 4;
            } else if (class774.method5589((byte)95, var1)) {
               return 7;
            } else {
               return ~var1 == -10 ? 8 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6938[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method3694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field6927;
         int var9 = 0;
         if (arg0 != arg3) {
            var9 = (-arg2 + arg6 << 16) / (-arg3 + arg0);
         }

         int var10 = 0;
         if (arg5 > 122) {
            if (~arg0 != ~arg1) {
               var10 = (-arg6 + arg4 << 16) / (-arg0 + arg1);
            }

            int var11 = 0;
            if (~arg1 != ~arg3) {
               var11 = (arg2 - arg4 << 16) / (-arg1 + arg3);
            }

            if (~arg0 <= ~arg3 && arg3 <= arg1) {
               if (arg1 > arg0) {
                  arg4 = arg2 <<= 16;
                  if (arg3 < 0) {
                     arg4 -= arg3 * var11;
                     arg2 -= arg3 * var9;
                     arg3 = 0;
                  }

                  arg6 <<= 16;
                  if (~arg0 > -1) {
                     arg6 -= arg0 * var10;
                     arg0 = 0;
                  }

                  if (arg0 != arg3 && ~var9 < ~var11 || arg0 == arg3 && var11 > var10) {
                     arg1 -= arg0;
                     arg0 -= arg3;
                     arg3 = this.field6931 * arg3;
                     if (var8) {
                        class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                        arg3 += this.field6931;
                        arg4 += var11;
                        arg2 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg3, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                    arg6 += var10;
                                    arg3 += this.field6931;
                                    arg4 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (~arg1 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg4 += var11;
                                       } else {
                                          class37.method419(arg3, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                          arg6 += var10;
                                          arg3 += this.field6931;
                                          arg4 += var11;
                                       }
                                    }
                                 }
                              }

                              arg2 += var9;
                           } else {
                              class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                              arg3 += this.field6931;
                              arg4 += var11;
                              arg2 += var9;
                           }
                        }
                     }
                  } else {
                     arg1 -= arg0;
                     arg0 -= arg3;
                     arg3 = this.field6931 * arg3;
                     if (var8) {
                        class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                        arg4 += var11;
                        arg3 += this.field6931;
                        arg2 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                    arg4 += var11;
                                    arg6 += var10;
                                    arg3 += this.field6931;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (~arg1 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += this.field6931;
                                       } else {
                                          class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                          arg4 += var11;
                                          arg6 += var10;
                                          arg3 += this.field6931;
                                       }
                                    }
                                 }
                              }

                              arg2 += var9;
                           } else {
                              class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                              arg4 += var11;
                              arg3 += this.field6931;
                              arg2 += var9;
                           }
                        }
                     }
                  }
               } else {
                  arg6 = arg2 <<= 16;
                  arg4 <<= 16;
                  if (arg3 < 0) {
                     arg6 -= arg3 * var11;
                     arg2 -= arg3 * var9;
                     arg3 = 0;
                  }

                  if (~arg1 > -1) {
                     arg4 -= arg1 * var10;
                     arg1 = 0;
                  }

                  if (~arg1 != ~arg3 && var11 < var9 || ~arg1 == ~arg3 && var9 < var10) {
                     arg0 -= arg1;
                     arg1 -= arg3;
                     arg3 = this.field6931 * arg3;
                     if (var8) {
                        class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                        arg3 += this.field6931;
                        arg2 += var9;
                        arg6 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (arg1 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                    arg2 += var9;
                                    arg4 += var10;
                                    arg3 += this.field6931;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (arg0 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += this.field6931;
                                       } else {
                                          class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                          arg2 += var9;
                                          arg4 += var10;
                                          arg3 += this.field6931;
                                       }
                                    }
                                 }
                              }

                              arg6 += var11;
                           } else {
                              class37.method419(arg3, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                              arg3 += this.field6931;
                              arg2 += var9;
                              arg6 += var11;
                           }
                        }
                     }
                  } else {
                     arg0 -= arg1;
                     arg1 -= arg3;
                     arg3 = this.field6931 * arg3;
                     if (var8) {
                        class37.method419(arg3, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                        arg3 += this.field6931;
                        arg2 += var9;
                        arg6 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (~arg1 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                    arg3 += this.field6931;
                                    arg4 += var10;
                                    arg2 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (arg0 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg2 += var9;
                                       } else {
                                          class37.method419(arg3, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                          arg3 += this.field6931;
                                          arg4 += var10;
                                          arg2 += var9;
                                       }
                                    }
                                 }
                              }

                              arg6 += var11;
                           } else {
                              class37.method419(arg3, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                              arg3 += this.field6931;
                              arg2 += var9;
                              arg6 += var11;
                           }
                        }
                     }
                  }
               }
            } else if (arg1 >= arg0) {
               if (~arg1 <= ~arg3) {
                  arg4 = arg6 <<= 16;
                  if (~arg0 > -1) {
                     arg6 -= arg0 * var10;
                     arg4 -= arg0 * var9;
                     arg0 = 0;
                  }

                  arg2 <<= 16;
                  if (arg3 < 0) {
                     arg2 -= arg3 * var11;
                     arg3 = 0;
                  }

                  if (var10 > var9) {
                     arg1 -= arg3;
                     arg3 -= arg0;
                     arg0 = this.field6931 * arg0;
                     if (var8) {
                        class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                        arg0 += this.field6931;
                        arg4 += var9;
                        arg6 += var10;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (arg3 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                    arg0 += this.field6931;
                                    arg2 += var11;
                                    arg6 += var10;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (~arg1 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg6 += var10;
                                       } else {
                                          class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                          arg0 += this.field6931;
                                          arg2 += var11;
                                          arg6 += var10;
                                       }
                                    }
                                 }
                              }

                              arg6 += var10;
                           } else {
                              class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                              arg0 += this.field6931;
                              arg4 += var9;
                              arg6 += var10;
                           }
                        }
                     }
                  } else {
                     arg1 -= arg3;
                     arg3 -= arg0;
                     arg0 = this.field6931 * arg0;
                     if (var8) {
                        class37.method419(arg0, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                        arg0 += this.field6931;
                        arg6 += var10;
                        arg4 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (arg3 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                    arg2 += var11;
                                    arg6 += var10;
                                    arg0 += this.field6931;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (~arg1 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg0 += this.field6931;
                                       } else {
                                          class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                          arg2 += var11;
                                          arg6 += var10;
                                          arg0 += this.field6931;
                                       }
                                    }
                                 }
                              }

                              arg4 += var9;
                           } else {
                              class37.method419(arg0, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                              arg0 += this.field6931;
                              arg6 += var10;
                              arg4 += var9;
                           }
                        }
                     }
                  }
               } else {
                  arg2 = arg6 <<= 16;
                  arg4 <<= 16;
                  if (arg0 < 0) {
                     arg6 -= arg0 * var10;
                     arg2 -= arg0 * var9;
                     arg0 = 0;
                  }

                  if (~arg1 > -1) {
                     arg4 -= arg1 * var11;
                     arg1 = 0;
                  }

                  if ((~arg0 == ~arg1 || var10 <= var9) && (arg0 != arg1 || var11 >= var9)) {
                     arg3 -= arg1;
                     arg1 -= arg0;
                     arg0 = this.field6931 * arg0;
                     if (var8) {
                        class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                        arg2 += var9;
                        arg6 += var10;
                        arg0 += this.field6931;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (~arg1 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                    arg4 += var11;
                                    arg0 += this.field6931;
                                    arg2 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg3;
                                       if (~arg3 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg2 += var9;
                                       } else {
                                          class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                          arg4 += var11;
                                          arg0 += this.field6931;
                                          arg2 += var9;
                                       }
                                    }
                                 }
                              }

                              arg0 += this.field6931;
                           } else {
                              class37.method419(arg0, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                              arg2 += var9;
                              arg6 += var10;
                              arg0 += this.field6931;
                           }
                        }
                     }
                  } else {
                     arg3 -= arg1;
                     arg1 -= arg0;
                     arg0 = this.field6931 * arg0;
                     if (var8) {
                        class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                        arg2 += var9;
                        arg0 += this.field6931;
                        arg6 += var10;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (~arg1 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class37.method419(arg0, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                    arg2 += var9;
                                    arg4 += var11;
                                    arg0 += this.field6931;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg3;
                                       if (~arg3 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg0 += this.field6931;
                                       } else {
                                          class37.method419(arg0, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                          arg2 += var9;
                                          arg4 += var11;
                                          arg0 += this.field6931;
                                       }
                                    }
                                 }
                              }

                              arg6 += var10;
                           } else {
                              class37.method419(arg0, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                              arg2 += var9;
                              arg0 += this.field6931;
                              arg6 += var10;
                           }
                        }
                     }
                  }
               }
            } else if (arg0 <= arg3) {
               arg2 = arg4 <<= 16;
               if (arg1 < 0) {
                  arg4 -= arg1 * var11;
                  arg2 -= arg1 * var10;
                  arg1 = 0;
               }

               arg6 <<= 16;
               if (arg0 < 0) {
                  arg6 -= arg0 * var9;
                  arg0 = 0;
               }

               if (var10 >= var11) {
                  arg3 -= arg0;
                  arg0 -= arg1;
                  arg1 = this.field6931 * arg1;
                  if (var8) {
                     class37.method419(arg1, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                     arg4 += var11;
                     arg1 += this.field6931;
                     arg2 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (~arg0 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                 arg1 += this.field6931;
                                 arg4 += var11;
                                 arg6 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var9;
                                    } else {
                                       class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                                       arg1 += this.field6931;
                                       arg4 += var11;
                                       arg6 += var9;
                                    }
                                 }
                              }
                           }

                           arg2 += var10;
                        } else {
                           class37.method419(arg1, arg2 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                           arg4 += var11;
                           arg1 += this.field6931;
                           arg2 += var10;
                        }
                     }
                  }
               } else {
                  arg3 -= arg0;
                  arg0 -= arg1;
                  arg1 = this.field6931 * arg1;
                  if (var8) {
                     class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                     arg1 += this.field6931;
                     arg4 += var11;
                     arg2 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (~arg0 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                 arg1 += this.field6931;
                                 arg6 += var9;
                                 arg4 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var11;
                                    } else {
                                       class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                       arg1 += this.field6931;
                                       arg6 += var9;
                                       arg4 += var11;
                                    }
                                 }
                              }
                           }

                           arg2 += var10;
                        } else {
                           class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                           arg1 += this.field6931;
                           arg4 += var11;
                           arg2 += var10;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg4 <<= 16;
               if (~arg1 > -1) {
                  arg6 -= arg1 * var10;
                  arg4 -= arg1 * var11;
                  arg1 = 0;
               }

               arg2 <<= 16;
               if (~arg3 > -1) {
                  arg2 -= arg3 * var9;
                  arg3 = 0;
               }

               if (~var10 > ~var11) {
                  arg0 -= arg3;
                  arg3 -= arg1;
                  arg1 = this.field6931 * arg1;
                  if (var8) {
                     class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                     arg1 += this.field6931;
                     arg4 += var11;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class37.method419(arg1, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                 arg1 += this.field6931;
                                 arg2 += var9;
                                 arg6 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var10;
                                    } else {
                                       class37.method419(arg1, arg2 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                                       arg1 += this.field6931;
                                       arg2 += var9;
                                       arg6 += var10;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class37.method419(arg1, arg4 >> 16, -937127742, 0, this.field6935, arg6 >> 16);
                           arg1 += this.field6931;
                           arg4 += var11;
                           arg6 += var10;
                        }
                     }
                  }
               } else {
                  arg0 -= arg3;
                  arg3 -= arg1;
                  arg1 = this.field6931 * arg1;
                  if (var8) {
                     class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                     arg4 += var11;
                     arg6 += var10;
                     arg1 += this.field6931;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                 arg2 += var9;
                                 arg6 += var10;
                                 arg1 += this.field6931;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg1 += this.field6931;
                                    } else {
                                       class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg2 >> 16);
                                       arg2 += var9;
                                       arg6 += var10;
                                       arg1 += this.field6931;
                                    }
                                 }
                              }
                           }

                           arg1 += this.field6931;
                        } else {
                           class37.method419(arg1, arg6 >> 16, -937127742, 0, this.field6935, arg4 >> 16);
                           arg4 += var11;
                           arg6 += var10;
                           arg1 += this.field6931;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6938[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method3695(int arg0, int arg1, int arg2) {
      try {
         ++field6933;
         int var4 = 71 / ((arg0 - -17) / 46);
         return this.field6935.length >= arg1 * arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6938[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3696(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field6936;
         int var3 = -1;
         int var4 = this.field6935.length + -8;
         if (var2) {
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
            ++var3;
            this.field6935[var3] = 0;
         }

         while(true) {
            while(~var3 > ~var4) {
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
               ++var3;
               this.field6935[var3] = 0;
            }

            if (!var2) {
               if (arg0 <= 109) {
                  method3692(87, '^');
                  if (var2) {
                     ++var3;
                     this.field6935[var3] = 0;
                  }
               }

               while(this.field6935.length + -1 > var3) {
                  ++var3;
                  this.field6935[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field6935[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6938[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Ldaa;II)V"
   )
   public class484(class226 arg0, int arg1, int arg2) {
      try {
         this.field6935 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6938[1] + (arg0 != null ? field6938[3] : field6938[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method3697(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field6931 = -arg4 + arg2;
         this.field6928 = arg3;
         this.field6934 = arg4;
         ++field6926;
         this.field6937 = -arg3 + arg0;
         if (arg1 != 0) {
            this.field6931 = -101;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6938[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3699(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
