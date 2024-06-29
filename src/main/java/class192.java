import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class192 extends class194 {
   @OriginalMember(
      owner = "client!cw",
      name = "Q",
      descriptor = "[B"
   )
   public byte[] field2340;
   @OriginalMember(
      owner = "client!cw",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2348 = new String[]{method1452(method1451("9&Y:\u001c")), method1452(method1451("9&YB]48\u0003@\u001c")), method1452(method1451("4$\u001b\u0012")), method1452(method1451("!\u007fYPI")), method1452(method1451("9&Y8\u001c")), method1452(method1451("9&Y?\u001c")), method1452(method1451("9&Y=\u001c")), method1452(method1451("9&Y;\u001c")), method1452(method1451("9&Y<\u001c"))};
   @OriginalMember(
      owner = "client!cw",
      name = "C",
      descriptor = "Lbga;"
   )
   public static class378 field2338 = new class378(92, -1);
   @OriginalMember(
      owner = "client!cw",
      name = "B",
      descriptor = "Lbga;"
   )
   public static class378 field2339 = new class378(26, -1);
   @OriginalMember(
      owner = "client!cw",
      name = "R",
      descriptor = "[I"
   )
   public static int[] field2341 = new int[16384];
   @OriginalMember(
      owner = "client!cw",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field2342 = new int[16384];
   @OriginalMember(
      owner = "client!cw",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field2344 = new int[3];
   @OriginalMember(
      owner = "client!cw",
      name = "N",
      descriptor = "Ldd;"
   )
   public static class735 field2345;
   @OriginalMember(
      owner = "client!cw",
      name = "L",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field2346;
   @OriginalMember(
      owner = "client!cw",
      name = "M",
      descriptor = "I"
   )
   public static int field2347;
   @OriginalMember(
      owner = "client!cw",
      name = "S",
      descriptor = "I"
   )
   public int field2329;
   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "I"
   )
   public static int field2330;
   @OriginalMember(
      owner = "client!cw",
      name = "I",
      descriptor = "I"
   )
   public static int field2331;
   @OriginalMember(
      owner = "client!cw",
      name = "E",
      descriptor = "I"
   )
   public static int field2332;
   @OriginalMember(
      owner = "client!cw",
      name = "F",
      descriptor = "I"
   )
   public int field2333;
   @OriginalMember(
      owner = "client!cw",
      name = "D",
      descriptor = "I"
   )
   public static int field2334;
   @OriginalMember(
      owner = "client!cw",
      name = "G",
      descriptor = "I"
   )
   public int field2335;
   @OriginalMember(
      owner = "client!cw",
      name = "T",
      descriptor = "I"
   )
   public int field2336;
   @OriginalMember(
      owner = "client!cw",
      name = "K",
      descriptor = "I"
   )
   public static int field2337;
   @OriginalMember(
      owner = "client!cw",
      name = "H",
      descriptor = "I"
   )
   public static int field2343;

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method1445(byte arg0, int arg1, int arg2) {
      try {
         ++field2334;
         if (arg0 != 5) {
            method1450(false);
         }

         return class527.method3801(arg1, arg2, 1523) || class302.method2276(arg2, (byte)52, arg1);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2348[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field2333 = arg0;
         ++field2337;
         this.field2329 = arg2 - arg0;
         this.field2335 = arg1;
         if (arg3 != 1145) {
            field2344 = null;
         }

         this.field2336 = -arg1 + arg4;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2348[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1447(int arg0) {
      boolean var2 = client.field4273;

      try {
         int var3 = 73 / ((47 - arg0) / 51);
         ++field2330;
         int var4 = -1;
         int var5 = this.field2340.length + -8;
         if (var2) {
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
            ++var4;
            this.field2340[var4] = 0;
         }

         while(true) {
            while(~var5 < ~var4) {
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
               ++var4;
               this.field2340[var4] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var4;
                  this.field2340[var4] = 0;
               }

               while(~(this.field2340.length - 1) < ~var4) {
                  ++var4;
                  this.field2340[var4] = 0;
               }

               return;
            }

            ++var4;
            this.field2340[var4] = 0;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2348[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public final boolean method1448(int arg0, byte arg1, int arg2) {
      try {
         int var4 = 103 / ((-72 - arg1) / 51);
         ++field2332;
         return ~(arg0 * arg2) >= ~this.field2340.length;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2348[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IIBIIII)V"
   )
   public final void method1449(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field2331;
         int var9 = 0;
         if (arg0 != arg1) {
            var9 = (-arg6 + arg5 << 16) / (-arg1 + arg0);
         }

         if (arg2 >= 101) {
            int var10 = 0;
            if (arg0 != arg3) {
               var10 = (arg4 - arg5 << 16) / (-arg0 + arg3);
            }

            int var11 = 0;
            if (arg1 != arg3) {
               var11 = (arg6 - arg4 << 16) / (arg1 - arg3);
            }

            if (arg1 <= arg0 && arg3 >= arg1) {
               if (arg0 < arg3) {
                  arg4 = arg6 <<= 16;
                  arg5 <<= 16;
                  if (arg1 < 0) {
                     arg6 -= arg1 * var9;
                     arg4 -= arg1 * var11;
                     arg1 = 0;
                  }

                  if (arg0 < 0) {
                     arg5 -= arg0 * var10;
                     arg0 = 0;
                  }

                  if (arg0 != arg1 && ~var9 < ~var11 || arg0 == arg1 && var11 > var10) {
                     arg3 -= arg0;
                     arg0 -= arg1;
                     arg1 = this.field2329 * arg1;
                     if (var8) {
                        class540.method3906(arg6 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-116);
                        arg6 += var9;
                        arg1 += this.field2329;
                        arg4 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg5 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-117);
                                    arg4 += var11;
                                    arg1 += this.field2329;
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
                                          class540.method3906(arg5 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-117);
                                          arg4 += var11;
                                          arg1 += this.field2329;
                                          arg5 += var10;
                                       }
                                    }
                                 }
                              }

                              arg4 += var11;
                           } else {
                              class540.method3906(arg6 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-116);
                              arg6 += var9;
                              arg1 += this.field2329;
                              arg4 += var11;
                           }
                        }
                     }
                  } else {
                     arg3 -= arg0;
                     arg0 -= arg1;
                     arg1 = this.field2329 * arg1;
                     if (var8) {
                        class540.method3906(arg4 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-93);
                        arg6 += var9;
                        arg4 += var11;
                        arg1 += this.field2329;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg4 >> 16, 0, arg1, arg5 >> 16, this.field2340, (byte)-68);
                                    arg4 += var11;
                                    arg5 += var10;
                                    arg1 += this.field2329;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg3;
                                       if (~arg3 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg1 += this.field2329;
                                       } else {
                                          class540.method3906(arg4 >> 16, 0, arg1, arg5 >> 16, this.field2340, (byte)-68);
                                          arg4 += var11;
                                          arg5 += var10;
                                          arg1 += this.field2329;
                                       }
                                    }
                                 }
                              }

                              arg1 += this.field2329;
                           } else {
                              class540.method3906(arg4 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-93);
                              arg6 += var9;
                              arg4 += var11;
                              arg1 += this.field2329;
                           }
                        }
                     }
                  }
               } else {
                  arg5 = arg6 <<= 16;
                  arg4 <<= 16;
                  if (arg1 < 0) {
                     arg5 -= arg1 * var11;
                     arg6 -= arg1 * var9;
                     arg1 = 0;
                  }

                  if (arg3 < 0) {
                     arg4 -= arg3 * var10;
                     arg3 = 0;
                  }

                  if (~arg1 != ~arg3 && var11 < var9 || ~arg1 == ~arg3 && ~var9 > ~var10) {
                     arg0 -= arg3;
                     arg3 -= arg1;
                     arg1 = this.field2329 * arg1;
                     if (var8) {
                        class540.method3906(arg6 >> 16, 0, arg1, arg5 >> 16, this.field2340, (byte)-70);
                        arg1 += this.field2329;
                        arg6 += var9;
                        arg5 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (arg3 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg6 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-85);
                                    arg1 += this.field2329;
                                    arg4 += var10;
                                    arg6 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (~arg0 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg6 += var9;
                                       } else {
                                          class540.method3906(arg6 >> 16, 0, arg1, arg4 >> 16, this.field2340, (byte)-85);
                                          arg1 += this.field2329;
                                          arg4 += var10;
                                          arg6 += var9;
                                       }
                                    }
                                 }
                              }

                              arg5 += var11;
                           } else {
                              class540.method3906(arg6 >> 16, 0, arg1, arg5 >> 16, this.field2340, (byte)-70);
                              arg1 += this.field2329;
                              arg6 += var9;
                              arg5 += var11;
                           }
                        }
                     }
                  } else {
                     arg0 -= arg3;
                     arg3 -= arg1;
                     arg1 = this.field2329 * arg1;
                     if (var8) {
                        class540.method3906(arg5 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-106);
                        arg6 += var9;
                        arg1 += this.field2329;
                        arg5 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (arg3 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg4 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-54);
                                    arg4 += var10;
                                    arg6 += var9;
                                    arg1 += this.field2329;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (~arg0 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg1 += this.field2329;
                                       } else {
                                          class540.method3906(arg4 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-54);
                                          arg4 += var10;
                                          arg6 += var9;
                                          arg1 += this.field2329;
                                       }
                                    }
                                 }
                              }

                              arg5 += var11;
                           } else {
                              class540.method3906(arg5 >> 16, 0, arg1, arg6 >> 16, this.field2340, (byte)-106);
                              arg6 += var9;
                              arg1 += this.field2329;
                              arg5 += var11;
                           }
                        }
                     }
                  }
               }
            } else if (~arg3 <= ~arg0) {
               if (~arg3 <= ~arg1) {
                  arg4 = arg5 <<= 16;
                  if (arg0 < 0) {
                     arg4 -= arg0 * var9;
                     arg5 -= arg0 * var10;
                     arg0 = 0;
                  }

                  arg6 <<= 16;
                  if (~arg1 > -1) {
                     arg6 -= arg1 * var11;
                     arg1 = 0;
                  }

                  if (~var10 >= ~var9) {
                     arg3 -= arg1;
                     arg1 -= arg0;
                     arg0 = this.field2329 * arg0;
                     if (var8) {
                        class540.method3906(arg4 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-53);
                        arg4 += var9;
                        arg5 += var10;
                        arg0 += this.field2329;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (arg1 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg6 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-94);
                                    arg6 += var11;
                                    arg0 += this.field2329;
                                    arg5 += var10;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg3;
                                       if (arg3 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg5 += var10;
                                       } else {
                                          class540.method3906(arg6 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-94);
                                          arg6 += var11;
                                          arg0 += this.field2329;
                                          arg5 += var10;
                                       }
                                    }
                                 }
                              }

                              arg0 += this.field2329;
                           } else {
                              class540.method3906(arg4 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-53);
                              arg4 += var9;
                              arg5 += var10;
                              arg0 += this.field2329;
                           }
                        }
                     }
                  } else {
                     arg3 -= arg1;
                     arg1 -= arg0;
                     arg0 = this.field2329 * arg0;
                     if (var8) {
                        class540.method3906(arg5 >> 16, 0, arg0, arg4 >> 16, this.field2340, (byte)-51);
                        arg0 += this.field2329;
                        arg5 += var10;
                        arg4 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg1;
                           if (~arg1 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg5 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-103);
                                    arg5 += var10;
                                    arg0 += this.field2329;
                                    arg6 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg3;
                                       if (arg3 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg6 += var11;
                                       } else {
                                          class540.method3906(arg5 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-103);
                                          arg5 += var10;
                                          arg0 += this.field2329;
                                          arg6 += var11;
                                       }
                                    }
                                 }
                              }

                              arg4 += var9;
                           } else {
                              class540.method3906(arg5 >> 16, 0, arg0, arg4 >> 16, this.field2340, (byte)-51);
                              arg0 += this.field2329;
                              arg5 += var10;
                              arg4 += var9;
                           }
                        }
                     }
                  }
               } else {
                  arg6 = arg5 <<= 16;
                  arg4 <<= 16;
                  if (arg0 < 0) {
                     arg6 -= arg0 * var9;
                     arg5 -= arg0 * var10;
                     arg0 = 0;
                  }

                  if (~arg3 > -1) {
                     arg4 -= arg3 * var11;
                     arg3 = 0;
                  }

                  if ((~arg0 == ~arg3 || ~var10 >= ~var9) && (~arg0 != ~arg3 || var11 >= var9)) {
                     arg1 -= arg3;
                     arg3 -= arg0;
                     arg0 = this.field2329 * arg0;
                     if (var8) {
                        class540.method3906(arg6 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-92);
                        arg0 += this.field2329;
                        arg5 += var10;
                        arg6 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (~arg3 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg6 >> 16, 0, arg0, arg4 >> 16, this.field2340, (byte)-65);
                                    arg4 += var11;
                                    arg0 += this.field2329;
                                    arg6 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (arg1 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg6 += var9;
                                       } else {
                                          class540.method3906(arg6 >> 16, 0, arg0, arg4 >> 16, this.field2340, (byte)-65);
                                          arg4 += var11;
                                          arg0 += this.field2329;
                                          arg6 += var9;
                                       }
                                    }
                                 }
                              }

                              arg6 += var9;
                           } else {
                              class540.method3906(arg6 >> 16, 0, arg0, arg5 >> 16, this.field2340, (byte)-92);
                              arg0 += this.field2329;
                              arg5 += var10;
                              arg6 += var9;
                           }
                        }
                     }
                  } else {
                     arg1 -= arg3;
                     arg3 -= arg0;
                     arg0 = this.field2329 * arg0;
                     if (var8) {
                        class540.method3906(arg5 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-77);
                        arg5 += var10;
                        arg0 += this.field2329;
                        arg6 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg3;
                           if (~arg3 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class540.method3906(arg4 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-128);
                                    arg4 += var11;
                                    arg0 += this.field2329;
                                    arg6 += var9;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg1;
                                       if (~arg1 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg6 += var9;
                                       } else {
                                          class540.method3906(arg4 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-128);
                                          arg4 += var11;
                                          arg0 += this.field2329;
                                          arg6 += var9;
                                       }
                                    }
                                 }
                              }

                              arg6 += var9;
                           } else {
                              class540.method3906(arg5 >> 16, 0, arg0, arg6 >> 16, this.field2340, (byte)-77);
                              arg5 += var10;
                              arg0 += this.field2329;
                              arg6 += var9;
                           }
                        }
                     }
                  }
               }
            } else if (~arg1 > ~arg0) {
               arg5 = arg4 <<= 16;
               if (arg3 < 0) {
                  arg4 -= arg3 * var11;
                  arg5 -= arg3 * var10;
                  arg3 = 0;
               }

               arg6 <<= 16;
               if (arg1 < 0) {
                  arg6 -= arg1 * var9;
                  arg1 = 0;
               }

               if (var10 < var11) {
                  arg0 -= arg1;
                  arg1 -= arg3;
                  arg3 = this.field2329 * arg3;
                  if (var8) {
                     class540.method3906(arg4 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-94);
                     arg5 += var10;
                     arg4 += var11;
                     arg3 += this.field2329;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (arg1 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class540.method3906(arg6 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-102);
                                 arg5 += var10;
                                 arg3 += this.field2329;
                                 arg6 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (arg0 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var9;
                                    } else {
                                       class540.method3906(arg6 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-102);
                                       arg5 += var10;
                                       arg3 += this.field2329;
                                       arg6 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += this.field2329;
                        } else {
                           class540.method3906(arg4 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-94);
                           arg5 += var10;
                           arg4 += var11;
                           arg3 += this.field2329;
                        }
                     }
                  }
               } else {
                  arg0 -= arg1;
                  arg1 -= arg3;
                  arg3 = this.field2329 * arg3;
                  if (var8) {
                     class540.method3906(arg5 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-71);
                     arg3 += this.field2329;
                     arg5 += var10;
                     arg4 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class540.method3906(arg5 >> 16, 0, arg3, arg6 >> 16, this.field2340, (byte)-69);
                                 arg6 += var9;
                                 arg3 += this.field2329;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg0;
                                    if (~arg0 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class540.method3906(arg5 >> 16, 0, arg3, arg6 >> 16, this.field2340, (byte)-69);
                                       arg6 += var9;
                                       arg3 += this.field2329;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var11;
                        } else {
                           class540.method3906(arg5 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-71);
                           arg3 += this.field2329;
                           arg5 += var10;
                           arg4 += var11;
                        }
                     }
                  }
               }
            } else {
               arg6 = arg4 <<= 16;
               if (~arg3 > -1) {
                  arg4 -= arg3 * var11;
                  arg6 -= arg3 * var10;
                  arg3 = 0;
               }

               arg5 <<= 16;
               if (arg0 < 0) {
                  arg5 -= arg0 * var9;
                  arg0 = 0;
               }

               if (var10 >= var11) {
                  arg1 -= arg0;
                  arg0 -= arg3;
                  arg3 = this.field2329 * arg3;
                  if (var8) {
                     class540.method3906(arg6 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-101);
                     arg6 += var10;
                     arg3 += this.field2329;
                     arg4 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class540.method3906(arg5 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-81);
                                 arg4 += var11;
                                 arg3 += this.field2329;
                                 arg5 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (arg1 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var9;
                                    } else {
                                       class540.method3906(arg5 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-81);
                                       arg4 += var11;
                                       arg3 += this.field2329;
                                       arg5 += var9;
                                    }
                                 }
                              }
                           }

                           arg4 += var11;
                        } else {
                           class540.method3906(arg6 >> 16, 0, arg3, arg4 >> 16, this.field2340, (byte)-101);
                           arg6 += var10;
                           arg3 += this.field2329;
                           arg4 += var11;
                        }
                     }
                  }
               } else {
                  arg1 -= arg0;
                  arg0 -= arg3;
                  arg3 = this.field2329 * arg3;
                  if (var8) {
                     class540.method3906(arg4 >> 16, 0, arg3, arg6 >> 16, this.field2340, (byte)-69);
                     arg3 += this.field2329;
                     arg4 += var11;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg0;
                        if (arg0 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class540.method3906(arg4 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-74);
                                 arg3 += this.field2329;
                                 arg5 += var9;
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
                                       class540.method3906(arg4 >> 16, 0, arg3, arg5 >> 16, this.field2340, (byte)-74);
                                       arg3 += this.field2329;
                                       arg5 += var9;
                                       arg4 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class540.method3906(arg4 >> 16, 0, arg3, arg6 >> 16, this.field2340, (byte)-69);
                           arg3 += this.field2329;
                           arg4 += var11;
                           arg6 += var10;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2348[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1450(boolean arg0) {
      try {
         field2346 = null;
         field2344 = null;
         if (arg0) {
            field2341 = null;
            field2338 = null;
            field2342 = null;
            field2345 = null;
            field2339 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2348[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "<init>",
      descriptor = "(Lce;II)V"
   )
   public class192(class327 arg0, int arg1, int arg2) {
      try {
         this.field2340 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2348[1] + (arg0 != null ? field2348[3] : field2348[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field2342[var2] = (int)(Math.sin((double)var2 * var0) * 16384.0D);
         field2341[var2] = (int)(Math.cos((double)var2 * var0) * 16384.0D);
      }

      field2345 = new class735(8, 0, 4, 1);
      field2346 = new Hashtable();
      field2347 = 0;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1452(char[] arg0) {
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
            var10005 = 81;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
