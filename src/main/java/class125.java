import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class125 extends class192 {
   @OriginalMember(
      owner = "client!lfa",
      name = "C",
      descriptor = "[B"
   )
   public byte[] field2097;
   @OriginalMember(
      owner = "client!lfa",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2106 = new String[]{method1223(method1222("\u000bXs]RO")), method1223(method1222("\u000bXs]_O")), method1223(method1222("\tK~\u001f")), method1223(method1222("\u001c\u0010<]e")), method1223(method1222("\u000bXs]SO")), method1223(method1222("\u000bXs]TO")), method1223(method1222("\u000bXs]$\u000eP{\u0007&O")), method1223(method1222("\u000bXs]^O")), method1223(method1222("\u000bXs]PO"))};
   @OriginalMember(
      owner = "client!lfa",
      name = "E",
      descriptor = "I"
   )
   public static int field2095;
   @OriginalMember(
      owner = "client!lfa",
      name = "B",
      descriptor = "I"
   )
   public static int field2096;
   @OriginalMember(
      owner = "client!lfa",
      name = "I",
      descriptor = "I"
   )
   public int field2098;
   @OriginalMember(
      owner = "client!lfa",
      name = "F",
      descriptor = "I"
   )
   public static int field2099;
   @OriginalMember(
      owner = "client!lfa",
      name = "L",
      descriptor = "I"
   )
   public static int field2100;
   @OriginalMember(
      owner = "client!lfa",
      name = "H",
      descriptor = "I"
   )
   public int field2101;
   @OriginalMember(
      owner = "client!lfa",
      name = "A",
      descriptor = "I"
   )
   public int field2102;
   @OriginalMember(
      owner = "client!lfa",
      name = "D",
      descriptor = "I"
   )
   public static int field2103;
   @OriginalMember(
      owner = "client!lfa",
      name = "J",
      descriptor = "I"
   )
   public static int field2104;
   @OriginalMember(
      owner = "client!lfa",
      name = "G",
      descriptor = "I"
   )
   public int field2105;

   @OriginalMember(
      owner = "client!lfa",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method1215(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2099;
         int var3 = arg0;
         int var4 = this.field2097.length + -8;
         if (var2) {
            var3 = arg0 + 1;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
            ++var3;
            this.field2097[var3] = 0;
         }

         while(true) {
            while(~var4 < ~var3) {
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
               ++var3;
               this.field2097[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field2097[var3] = 0;
               }

               while(var3 < this.field2097.length - 1) {
                  ++var3;
                  this.field2097[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field2097[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2106[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(BII)Z"
   )
   public final boolean method1216(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 41) {
            this.field2105 = 52;
         }

         ++field2103;
         return ~(arg1 * arg2) >= ~this.field2097.length;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2106[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Ljfa;I)V"
   )
   public static final void method1217(class303 arg0, int arg1) {
      try {
         if (arg1 >= 79) {
            ++field2095;
            if (class341.field4853 == arg0.field4364) {
               if (class304.field4398.field6665 == null) {
                  arg0.field4231 = 0;
                  arg0.field4306 = 0;
               } else {
                  arg0.field4369 = 150;
                  arg0.field4222 = 2047 & (int)(Math.sin((double)class29.field458 / 40.0D) * 256.0D);
                  arg0.field4231 = class20.field324;
                  arg0.field4278 = 5;
                  arg0.field4306 = class393.method3046(class304.field4398.field6665, 125);
                  arg0.field4247 = class304.field4398.field11284;
                  arg0.field4366 = class304.field4398.field11304;
                  arg0.field4272 = 0;
                  arg0.field4334 = class304.field4398.field11261;
                  class295 var2 = arg0.field4247 == -1 ? null : class588.field8496.method3781(5, arg0.field4247);
                  if (var2 != null) {
                     class494.method3727(var2, -1845, arg0.field4334);
                  }

               }
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2106[4] + (arg0 != null ? field2106[3] : field2106[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(FIFFI)F"
   )
   public static final float method1218(float arg0, int arg1, float arg2, float arg3, int arg4) {
      try {
         ++field2100;
         if (arg1 != 1482) {
            method1218(0.4793838F, 56, 0.5605869F, -0.1774795F, 64);
         }

         float[] var5 = class587.field8478[arg4];
         return var5[2] * arg3 + var5[0] * arg0 + var5[1] * arg2;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2106[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2104;
         int var6 = -116 / ((arg4 - 25) / 55);
         this.field2098 = -arg0 + arg3;
         this.field2105 = -arg2 + arg1;
         this.field2102 = arg0;
         this.field2101 = arg2;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2106[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field2096;
         if (arg5 >= -66) {
            method1217((class303)null, -91);
         }

         int var9 = 0;
         if (arg3 != arg6) {
            var9 = (-arg2 + arg1 << 16) / (arg3 - arg6);
         }

         int var10 = 0;
         if (~arg3 != ~arg4) {
            var10 = (-arg1 + arg0 << 16) / (-arg3 + arg4);
         }

         int var11 = 0;
         if (arg4 != arg6) {
            var11 = (-arg0 + arg2 << 16) / (arg6 - arg4);
         }

         if (arg6 <= arg3 && arg4 >= arg6) {
            if (arg3 < arg4) {
               arg0 = arg2 <<= 16;
               if (arg6 < 0) {
                  arg0 -= arg6 * var11;
                  arg2 -= arg6 * var9;
                  arg6 = 0;
               }

               arg1 <<= 16;
               if (arg3 < 0) {
                  arg1 -= arg3 * var10;
                  arg3 = 0;
               }

               if (arg3 != arg6 && var9 > var11 || ~arg3 == ~arg6 && ~var10 > ~var11) {
                  arg4 -= arg3;
                  arg3 -= arg6;
                  arg6 = this.field2098 * arg6;
                  if (var8) {
                     class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-128, arg6, arg2 >> 16);
                     arg0 += var11;
                     arg2 += var9;
                     arg6 += this.field2098;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg0 >> 16, 0, this.field2097, (byte)24, arg6, arg1 >> 16);
                                 arg6 += this.field2098;
                                 arg1 += var10;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class109.method1042(arg0 >> 16, 0, this.field2097, (byte)24, arg6, arg1 >> 16);
                                       arg6 += this.field2098;
                                       arg1 += var10;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += this.field2098;
                        } else {
                           class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-128, arg6, arg2 >> 16);
                           arg0 += var11;
                           arg2 += var9;
                           arg6 += this.field2098;
                        }
                     }
                  }
               } else {
                  arg4 -= arg3;
                  arg3 -= arg6;
                  arg6 = this.field2098 * arg6;
                  if (var8) {
                     class109.method1042(arg2 >> 16, 0, this.field2097, (byte)112, arg6, arg0 >> 16);
                     arg6 += this.field2098;
                     arg2 += var9;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-126, arg6, arg0 >> 16);
                                 arg0 += var11;
                                 arg6 += this.field2098;
                                 arg1 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg1 += var10;
                                    } else {
                                       class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-126, arg6, arg0 >> 16);
                                       arg0 += var11;
                                       arg6 += this.field2098;
                                       arg1 += var10;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class109.method1042(arg2 >> 16, 0, this.field2097, (byte)112, arg6, arg0 >> 16);
                           arg6 += this.field2098;
                           arg2 += var9;
                           arg0 += var11;
                        }
                     }
                  }
               }
            } else {
               arg1 = arg2 <<= 16;
               if (arg6 < 0) {
                  arg2 -= arg6 * var9;
                  arg1 -= arg6 * var11;
                  arg6 = 0;
               }

               arg0 <<= 16;
               if (~arg4 > -1) {
                  arg0 -= arg4 * var10;
                  arg4 = 0;
               }

               if (~arg4 != ~arg6 && var11 < var9 || ~arg4 == ~arg6 && ~var9 > ~var10) {
                  arg3 -= arg4;
                  arg4 -= arg6;
                  arg6 = this.field2098 * arg6;
                  if (var8) {
                     class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-17, arg6, arg2 >> 16);
                     arg6 += this.field2098;
                     arg1 += var11;
                     arg2 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (arg4 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg0 >> 16, 0, this.field2097, (byte)3, arg6, arg2 >> 16);
                                 arg0 += var10;
                                 arg2 += var9;
                                 arg6 += this.field2098;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field2098;
                                    } else {
                                       class109.method1042(arg0 >> 16, 0, this.field2097, (byte)3, arg6, arg2 >> 16);
                                       arg0 += var10;
                                       arg2 += var9;
                                       arg6 += this.field2098;
                                    }
                                 }
                              }
                           }

                           arg2 += var9;
                        } else {
                           class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-17, arg6, arg2 >> 16);
                           arg6 += this.field2098;
                           arg1 += var11;
                           arg2 += var9;
                        }
                     }
                  }
               } else {
                  arg3 -= arg4;
                  arg4 -= arg6;
                  arg6 = this.field2098 * arg6;
                  if (var8) {
                     class109.method1042(arg2 >> 16, 0, this.field2097, (byte)88, arg6, arg1 >> 16);
                     arg6 += this.field2098;
                     arg2 += var9;
                     arg1 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-122, arg6, arg0 >> 16);
                                 arg6 += this.field2098;
                                 arg0 += var10;
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
                                       class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-122, arg6, arg0 >> 16);
                                       arg6 += this.field2098;
                                       arg0 += var10;
                                       arg2 += var9;
                                    }
                                 }
                              }
                           }

                           arg1 += var11;
                        } else {
                           class109.method1042(arg2 >> 16, 0, this.field2097, (byte)88, arg6, arg1 >> 16);
                           arg6 += this.field2098;
                           arg2 += var9;
                           arg1 += var11;
                        }
                     }
                  }
               }
            }
         } else if (arg4 < arg3) {
            if (arg6 < arg3) {
               arg1 = arg0 <<= 16;
               if (~arg4 > -1) {
                  arg1 -= arg4 * var10;
                  arg0 -= arg4 * var11;
                  arg4 = 0;
               }

               arg2 <<= 16;
               if (arg6 < 0) {
                  arg2 -= arg6 * var9;
                  arg6 = 0;
               }

               if (var10 < var11) {
                  arg3 -= arg6;
                  arg6 -= arg4;
                  arg4 = this.field2098 * arg4;
                  if (var8) {
                     class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-121, arg4, arg0 >> 16);
                     arg4 += this.field2098;
                     arg0 += var11;
                     arg1 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-128, arg4, arg2 >> 16);
                                 arg1 += var10;
                                 arg2 += var9;
                                 arg4 += this.field2098;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (~arg3 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += this.field2098;
                                    } else {
                                       class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-128, arg4, arg2 >> 16);
                                       arg1 += var10;
                                       arg2 += var9;
                                       arg4 += this.field2098;
                                    }
                                 }
                              }
                           }

                           arg1 += var10;
                        } else {
                           class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-121, arg4, arg0 >> 16);
                           arg4 += this.field2098;
                           arg0 += var11;
                           arg1 += var10;
                        }
                     }
                  }
               } else {
                  arg3 -= arg6;
                  arg6 -= arg4;
                  arg4 = this.field2098 * arg4;
                  if (var8) {
                     class109.method1042(arg0 >> 16, 0, this.field2097, (byte)66, arg4, arg1 >> 16);
                     arg1 += var10;
                     arg4 += this.field2098;
                     arg0 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (~arg6 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-14, arg4, arg1 >> 16);
                                 arg1 += var10;
                                 arg2 += var9;
                                 arg4 += this.field2098;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += this.field2098;
                                    } else {
                                       class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-14, arg4, arg1 >> 16);
                                       arg1 += var10;
                                       arg2 += var9;
                                       arg4 += this.field2098;
                                    }
                                 }
                              }
                           }

                           arg0 += var11;
                        } else {
                           class109.method1042(arg0 >> 16, 0, this.field2097, (byte)66, arg4, arg1 >> 16);
                           arg1 += var10;
                           arg4 += this.field2098;
                           arg0 += var11;
                        }
                     }
                  }
               }
            } else {
               arg2 = arg0 <<= 16;
               if (~arg4 > -1) {
                  arg0 -= arg4 * var11;
                  arg2 -= arg4 * var10;
                  arg4 = 0;
               }

               arg1 <<= 16;
               if (arg3 < 0) {
                  arg1 -= arg3 * var9;
                  arg3 = 0;
               }

               if (~var11 >= ~var10) {
                  arg6 -= arg3;
                  arg3 -= arg4;
                  arg4 = this.field2098 * arg4;
                  if (var8) {
                     class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-124, arg4, arg2 >> 16);
                     arg4 += this.field2098;
                     arg0 += var11;
                     arg2 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg0 >> 16, 0, this.field2097, (byte)81, arg4, arg1 >> 16);
                                 arg1 += var9;
                                 arg4 += this.field2098;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class109.method1042(arg0 >> 16, 0, this.field2097, (byte)81, arg4, arg1 >> 16);
                                       arg1 += var9;
                                       arg4 += this.field2098;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg2 += var10;
                        } else {
                           class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-124, arg4, arg2 >> 16);
                           arg4 += this.field2098;
                           arg0 += var11;
                           arg2 += var10;
                        }
                     }
                  }
               } else {
                  arg6 -= arg3;
                  arg3 -= arg4;
                  arg4 = this.field2098 * arg4;
                  if (var8) {
                     class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-122, arg4, arg0 >> 16);
                     arg2 += var10;
                     arg0 += var11;
                     arg4 += this.field2098;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class109.method1042(arg1 >> 16, 0, this.field2097, (byte)33, arg4, arg0 >> 16);
                                 arg1 += var9;
                                 arg4 += this.field2098;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class109.method1042(arg1 >> 16, 0, this.field2097, (byte)33, arg4, arg0 >> 16);
                                       arg1 += var9;
                                       arg4 += this.field2098;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg4 += this.field2098;
                        } else {
                           class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-122, arg4, arg0 >> 16);
                           arg2 += var10;
                           arg0 += var11;
                           arg4 += this.field2098;
                        }
                     }
                  }
               }
            }
         } else if (arg4 >= arg6) {
            arg0 = arg1 <<= 16;
            if (arg3 < 0) {
               arg1 -= arg3 * var10;
               arg0 -= arg3 * var9;
               arg3 = 0;
            }

            arg2 <<= 16;
            if (~arg6 > -1) {
               arg2 -= arg6 * var11;
               arg6 = 0;
            }

            if (var10 > var9) {
               arg4 -= arg6;
               arg6 -= arg3;
               arg3 = this.field2098 * arg3;
               if (var8) {
                  class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-125, arg3, arg1 >> 16);
                  arg3 += this.field2098;
                  arg1 += var10;
                  arg0 += var9;
               }

               while(true) {
                  while(true) {
                     --arg6;
                     if (~arg6 > -1) {
                        if (!var8) {
                           if (var8) {
                              class109.method1042(arg2 >> 16, 0, this.field2097, (byte)111, arg3, arg1 >> 16);
                              arg3 += this.field2098;
                              arg2 += var11;
                              arg1 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg4;
                                 if (arg4 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg1 += var10;
                                 } else {
                                    class109.method1042(arg2 >> 16, 0, this.field2097, (byte)111, arg3, arg1 >> 16);
                                    arg3 += this.field2098;
                                    arg2 += var11;
                                    arg1 += var10;
                                 }
                              }
                           }
                        }

                        arg0 += var9;
                     } else {
                        class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-125, arg3, arg1 >> 16);
                        arg3 += this.field2098;
                        arg1 += var10;
                        arg0 += var9;
                     }
                  }
               }
            } else {
               arg4 -= arg6;
               arg6 -= arg3;
               arg3 = this.field2098 * arg3;
               if (var8) {
                  class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-126, arg3, arg0 >> 16);
                  arg1 += var10;
                  arg0 += var9;
                  arg3 += this.field2098;
               }

               while(true) {
                  while(true) {
                     --arg6;
                     if (~arg6 > -1) {
                        if (!var8) {
                           if (var8) {
                              class109.method1042(arg1 >> 16, 0, this.field2097, (byte)9, arg3, arg2 >> 16);
                              arg1 += var10;
                              arg3 += this.field2098;
                              arg2 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg4;
                                 if (arg4 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg2 += var11;
                                 } else {
                                    class109.method1042(arg1 >> 16, 0, this.field2097, (byte)9, arg3, arg2 >> 16);
                                    arg1 += var10;
                                    arg3 += this.field2098;
                                    arg2 += var11;
                                 }
                              }
                           }
                        }

                        arg3 += this.field2098;
                     } else {
                        class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-126, arg3, arg0 >> 16);
                        arg1 += var10;
                        arg0 += var9;
                        arg3 += this.field2098;
                     }
                  }
               }
            }
         } else {
            arg2 = arg1 <<= 16;
            arg0 <<= 16;
            if (~arg3 > -1) {
               arg1 -= arg3 * var10;
               arg2 -= arg3 * var9;
               arg3 = 0;
            }

            if (~arg4 > -1) {
               arg0 -= arg4 * var11;
               arg4 = 0;
            }

            if (~arg3 != ~arg4 && var9 < var10 || arg3 == arg4 && ~var11 > ~var9) {
               arg6 -= arg4;
               arg4 -= arg3;
               arg3 = this.field2098 * arg3;
               if (var8) {
                  class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-126, arg3, arg1 >> 16);
                  arg2 += var9;
                  arg3 += this.field2098;
                  arg1 += var10;
               }

               while(true) {
                  while(true) {
                     --arg4;
                     if (~arg4 > -1) {
                        if (!var8) {
                           if (var8) {
                              class109.method1042(arg2 >> 16, 0, this.field2097, (byte)47, arg3, arg0 >> 16);
                              arg3 += this.field2098;
                              arg2 += var9;
                              arg0 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (arg6 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg0 += var11;
                                 } else {
                                    class109.method1042(arg2 >> 16, 0, this.field2097, (byte)47, arg3, arg0 >> 16);
                                    arg3 += this.field2098;
                                    arg2 += var9;
                                    arg0 += var11;
                                 }
                              }
                           }
                        }

                        arg1 += var10;
                     } else {
                        class109.method1042(arg2 >> 16, 0, this.field2097, (byte)-126, arg3, arg1 >> 16);
                        arg2 += var9;
                        arg3 += this.field2098;
                        arg1 += var10;
                     }
                  }
               }
            } else {
               arg6 -= arg4;
               arg4 -= arg3;
               arg3 = this.field2098 * arg3;
               if (var8) {
                  class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-7, arg3, arg2 >> 16);
                  arg2 += var9;
                  arg3 += this.field2098;
                  arg1 += var10;
               }

               while(true) {
                  while(true) {
                     --arg4;
                     if (~arg4 > -1) {
                        if (!var8) {
                           if (var8) {
                              class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-127, arg3, arg2 >> 16);
                              arg3 += this.field2098;
                              arg2 += var9;
                              arg0 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (~arg6 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg0 += var11;
                                 } else {
                                    class109.method1042(arg0 >> 16, 0, this.field2097, (byte)-127, arg3, arg2 >> 16);
                                    arg3 += this.field2098;
                                    arg2 += var9;
                                    arg0 += var11;
                                 }
                              }
                           }
                        }

                        arg1 += var10;
                     } else {
                        class109.method1042(arg1 >> 16, 0, this.field2097, (byte)-7, arg3, arg2 >> 16);
                        arg2 += var9;
                        arg3 += this.field2098;
                        arg1 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2106[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Lwp;)V"
   )
   public static final void method1221(class189 arg0) {
      class458.field6722 = arg0;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "<init>",
      descriptor = "(Lcs;II)V"
   )
   public class125(class357 arg0, int arg1, int arg2) {
      try {
         this.field2097 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2106[6] + (arg0 != null ? field2106[3] : field2106[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1223(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
