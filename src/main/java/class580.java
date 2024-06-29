import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class580 extends class192 {
   @OriginalMember(
      owner = "client!fi",
      name = "E",
      descriptor = "[B"
   )
   public byte[] field8325;
   @OriginalMember(
      owner = "client!fi",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8339 = new String[]{method4278(method4277("A%-/\u0004")), method4278(method4277("T~om")), method4278(method4277("\\b-=\u0010Tbw?Q")), method4278(method4277("\\b-MQ")), method4278(method4277("\\b-IQ")), method4278(method4277("\\b-GQ")), method4278(method4277("\\b-KQ")), method4278(method4277("\\b-JQ")), method4278(method4277("\\b-HQ")), method4278(method4277("\\b-FQ"))};
   @OriginalMember(
      owner = "client!fi",
      name = "L",
      descriptor = "J"
   )
   public static long field8335 = 0L;
   @OriginalMember(
      owner = "client!fi",
      name = "K",
      descriptor = "I"
   )
   public static int field8327 = -1;
   @OriginalMember(
      owner = "client!fi",
      name = "G",
      descriptor = "Lgh;"
   )
   public static class572 field8326 = new class572(122, 2);
   @OriginalMember(
      owner = "client!fi",
      name = "C",
      descriptor = "I"
   )
   public static int field8338 = -1;
   @OriginalMember(
      owner = "client!fi",
      name = "J",
      descriptor = "I"
   )
   public static int field8324;
   @OriginalMember(
      owner = "client!fi",
      name = "F",
      descriptor = "I"
   )
   public int field8328;
   @OriginalMember(
      owner = "client!fi",
      name = "B",
      descriptor = "I"
   )
   public static int field8329;
   @OriginalMember(
      owner = "client!fi",
      name = "D",
      descriptor = "I"
   )
   public int field8330;
   @OriginalMember(
      owner = "client!fi",
      name = "P",
      descriptor = "I"
   )
   public static int field8331;
   @OriginalMember(
      owner = "client!fi",
      name = "O",
      descriptor = "I"
   )
   public int field8332;
   @OriginalMember(
      owner = "client!fi",
      name = "I",
      descriptor = "I"
   )
   public static int field8333;
   @OriginalMember(
      owner = "client!fi",
      name = "M",
      descriptor = "I"
   )
   public int field8334;
   @OriginalMember(
      owner = "client!fi",
      name = "N",
      descriptor = "I"
   )
   public static int field8336;
   @OriginalMember(
      owner = "client!fi",
      name = "A",
      descriptor = "I"
   )
   public static int field8337;

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(B)V",
      line = 11
   )
   public final void method4270(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != 36) {
            field8338 = -123;
         }

         ++field8329;
         int var3 = -1;
         int var4 = this.field8325.length + -8;
         if (var2) {
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
            ++var3;
            this.field8325[var3] = 0;
         }

         while(true) {
            while(~var4 < ~var3) {
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
               ++var3;
               this.field8325[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field8325[var3] = 0;
               }

               while(var3 < this.field8325.length + -1) {
                  ++var3;
                  this.field8325[var3] = 0;
               }

               return;
            }

            ++var3;
            this.field8325[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8339[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(III)I",
      line = 40
   )
   public static final int method4271(int arg0, int arg1, int arg2) {
      try {
         ++field8331;
         int var3 = class145.method1370(arg1, (byte)-125, arg0 - -45365, arg2 + 91923) - (128 - (-128 + class145.method1370(2, (byte)-108, arg0 - -10294, arg2 - -37821) >> 1)) - -(-128 + class145.method1370(1, (byte)-80, arg0, arg2) >> 2);
         int var4 = (int)((double)var3 * 0.3D) + 35;
         if (var4 >= 10) {
            if (~var4 >= -61) {
               return var4;
            }

            var4 = 60;
            if (!client.field4564) {
               return var4;
            }
         }

         var4 = 10;
         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8339[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(B)V",
      line = 61
   )
   public static void method4272(byte arg0) {
      try {
         field8326 = null;
         if (arg0 >= -111) {
            method4273(-65);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8339[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "i",
      descriptor = "(I)V",
      line = 72
   )
   public static final void method4273(int arg0) {
      try {
         if (class241.field3483 != arg0) {
            if (class361.field5404 != null) {
               class361.field5404.method2045(arg0 ^ 907867169);
               class361.field5404 = null;
            }

            class701.method5109((byte)-110);
            class257.method2058((byte)-112);
         }

         ++field8336;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8339[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIIII)V",
      line = 98
   )
   public final void method4274(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6 = -57 % ((arg1 - 47) / 40);
         this.field8328 = arg4;
         this.field8334 = arg3 - arg2;
         this.field8332 = -arg4 + arg0;
         ++field8337;
         this.field8330 = arg2;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8339[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 115
   )
   public final void method4275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field8333;
         int var9 = 0;
         if (arg2 != arg4) {
            var9 = (-arg6 + arg5 << 16) / (-arg4 + arg2);
         }

         int var10 = 0;
         if (arg0 != arg2) {
            var10 = (-arg5 + arg3 << 16) / (-arg2 + arg0);
         }

         int var11 = 0;
         if (~arg0 != ~arg4) {
            var11 = (-arg3 + arg6 << 16) / (arg4 - arg0);
         }

         if (arg1 == 734) {
            if (arg4 <= arg2 && arg4 <= arg0) {
               if (arg2 < arg0) {
                  arg3 = arg6 <<= 16;
                  if (arg4 < 0) {
                     arg3 -= arg4 * var11;
                     arg6 -= arg4 * var9;
                     arg4 = 0;
                  }

                  arg5 <<= 16;
                  if (~arg2 > -1) {
                     arg5 -= arg2 * var10;
                     arg2 = 0;
                  }

                  if (~arg2 != ~arg4 && var9 > var11 || arg2 == arg4 && var10 < var11) {
                     arg0 -= arg2;
                     arg2 -= arg4;
                     arg4 = this.field8332 * arg4;
                     if (var8) {
                        class678.method4951(arg3 >> 16, (byte)106, arg6 >> 16, arg4, 0, this.field8325);
                        arg6 += var9;
                        arg3 += var11;
                        arg4 += this.field8332;
                     }

                     while(true) {
                        while(true) {
                           --arg2;
                           if (~arg2 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg3 >> 16, (byte)102, arg5 >> 16, arg4, 0, this.field8325);
                                    arg5 += var10;
                                    arg4 += this.field8332;
                                    arg3 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (~arg0 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var11;
                                       } else {
                                          class678.method4951(arg3 >> 16, (byte)102, arg5 >> 16, arg4, 0, this.field8325);
                                          arg5 += var10;
                                          arg4 += this.field8332;
                                          arg3 += var11;
                                       }
                                    }
                                 }
                              }

                              arg4 += this.field8332;
                           } else {
                              class678.method4951(arg3 >> 16, (byte)106, arg6 >> 16, arg4, 0, this.field8325);
                              arg6 += var9;
                              arg3 += var11;
                              arg4 += this.field8332;
                           }
                        }
                     }
                  } else {
                     arg0 -= arg2;
                     arg2 -= arg4;
                     arg4 = this.field8332 * arg4;
                     if (var8) {
                        class678.method4951(arg6 >> 16, (byte)92, arg3 >> 16, arg4, 0, this.field8325);
                        arg4 += this.field8332;
                        arg3 += var11;
                        arg6 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg2;
                           if (arg2 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg5 >> 16, (byte)97, arg3 >> 16, arg4, 0, this.field8325);
                                    arg4 += this.field8332;
                                    arg5 += var10;
                                    arg3 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg0;
                                       if (~arg0 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var11;
                                       } else {
                                          class678.method4951(arg5 >> 16, (byte)97, arg3 >> 16, arg4, 0, this.field8325);
                                          arg4 += this.field8332;
                                          arg5 += var10;
                                          arg3 += var11;
                                       }
                                    }
                                 }
                              }

                              arg6 += var9;
                           } else {
                              class678.method4951(arg6 >> 16, (byte)92, arg3 >> 16, arg4, 0, this.field8325);
                              arg4 += this.field8332;
                              arg3 += var11;
                              arg6 += var9;
                           }
                        }
                     }
                  }
               } else {
                  arg5 = arg6 <<= 16;
                  if (arg4 < 0) {
                     arg5 -= arg4 * var11;
                     arg6 -= arg4 * var9;
                     arg4 = 0;
                  }

                  arg3 <<= 16;
                  if (~arg0 > -1) {
                     arg3 -= arg0 * var10;
                     arg0 = 0;
                  }

                  if (~arg0 != ~arg4 && var9 > var11 || ~arg0 == ~arg4 && var10 > var9) {
                     arg2 -= arg0;
                     arg0 -= arg4;
                     arg4 = this.field8332 * arg4;
                     if (var8) {
                        class678.method4951(arg5 >> 16, (byte)95, arg6 >> 16, arg4, 0, this.field8325);
                        arg6 += var9;
                        arg4 += this.field8332;
                        arg5 += var11;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg3 >> 16, (byte)94, arg6 >> 16, arg4, 0, this.field8325);
                                    arg6 += var9;
                                    arg4 += this.field8332;
                                    arg3 += var10;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg2;
                                       if (~arg2 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var10;
                                       } else {
                                          class678.method4951(arg3 >> 16, (byte)94, arg6 >> 16, arg4, 0, this.field8325);
                                          arg6 += var9;
                                          arg4 += this.field8332;
                                          arg3 += var10;
                                       }
                                    }
                                 }
                              }

                              arg5 += var11;
                           } else {
                              class678.method4951(arg5 >> 16, (byte)95, arg6 >> 16, arg4, 0, this.field8325);
                              arg6 += var9;
                              arg4 += this.field8332;
                              arg5 += var11;
                           }
                        }
                     }
                  } else {
                     arg2 -= arg0;
                     arg0 -= arg4;
                     arg4 = this.field8332 * arg4;
                     if (var8) {
                        class678.method4951(arg6 >> 16, (byte)99, arg5 >> 16, arg4, 0, this.field8325);
                        arg5 += var11;
                        arg6 += var9;
                        arg4 += this.field8332;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg6 >> 16, (byte)115, arg3 >> 16, arg4, 0, this.field8325);
                                    arg4 += this.field8332;
                                    arg6 += var9;
                                    arg3 += var10;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg2;
                                       if (arg2 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var10;
                                       } else {
                                          class678.method4951(arg6 >> 16, (byte)115, arg3 >> 16, arg4, 0, this.field8325);
                                          arg4 += this.field8332;
                                          arg6 += var9;
                                          arg3 += var10;
                                       }
                                    }
                                 }
                              }

                              arg4 += this.field8332;
                           } else {
                              class678.method4951(arg6 >> 16, (byte)99, arg5 >> 16, arg4, 0, this.field8325);
                              arg5 += var11;
                              arg6 += var9;
                              arg4 += this.field8332;
                           }
                        }
                     }
                  }
               }
            } else if (~arg2 >= ~arg0) {
               if (arg4 > arg0) {
                  arg6 = arg5 <<= 16;
                  if (~arg2 > -1) {
                     arg5 -= arg2 * var10;
                     arg6 -= arg2 * var9;
                     arg2 = 0;
                  }

                  arg3 <<= 16;
                  if (~arg0 > -1) {
                     arg3 -= arg0 * var11;
                     arg0 = 0;
                  }

                  if (~arg0 != ~arg2 && var10 > var9 || arg0 == arg2 && var11 < var9) {
                     arg4 -= arg0;
                     arg0 -= arg2;
                     arg2 = this.field8332 * arg2;
                     if (var8) {
                        class678.method4951(arg6 >> 16, (byte)93, arg5 >> 16, arg2, 0, this.field8325);
                        arg6 += var9;
                        arg2 += this.field8332;
                        arg5 += var10;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (~arg0 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg6 >> 16, (byte)123, arg3 >> 16, arg2, 0, this.field8325);
                                    arg2 += this.field8332;
                                    arg6 += var9;
                                    arg3 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg4;
                                       if (~arg4 > -1) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var11;
                                       } else {
                                          class678.method4951(arg6 >> 16, (byte)123, arg3 >> 16, arg2, 0, this.field8325);
                                          arg2 += this.field8332;
                                          arg6 += var9;
                                          arg3 += var11;
                                       }
                                    }
                                 }
                              }

                              arg5 += var10;
                           } else {
                              class678.method4951(arg6 >> 16, (byte)93, arg5 >> 16, arg2, 0, this.field8325);
                              arg6 += var9;
                              arg2 += this.field8332;
                              arg5 += var10;
                           }
                        }
                     }
                  } else {
                     arg4 -= arg0;
                     arg0 -= arg2;
                     arg2 = this.field8332 * arg2;
                     if (var8) {
                        class678.method4951(arg5 >> 16, (byte)107, arg6 >> 16, arg2, 0, this.field8325);
                        arg2 += this.field8332;
                        arg5 += var10;
                        arg6 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg0;
                           if (arg0 < 0) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg3 >> 16, (byte)116, arg6 >> 16, arg2, 0, this.field8325);
                                    arg6 += var9;
                                    arg2 += this.field8332;
                                    arg3 += var11;
                                 }

                                 while(true) {
                                    while(true) {
                                       --arg4;
                                       if (arg4 < 0) {
                                          if (!var8) {
                                             return;
                                          }

                                          arg3 += var11;
                                       } else {
                                          class678.method4951(arg3 >> 16, (byte)116, arg6 >> 16, arg2, 0, this.field8325);
                                          arg6 += var9;
                                          arg2 += this.field8332;
                                          arg3 += var11;
                                       }
                                    }
                                 }
                              }

                              arg6 += var9;
                           } else {
                              class678.method4951(arg5 >> 16, (byte)107, arg6 >> 16, arg2, 0, this.field8325);
                              arg2 += this.field8332;
                              arg5 += var10;
                              arg6 += var9;
                           }
                        }
                     }
                  }
               } else {
                  arg3 = arg5 <<= 16;
                  arg6 <<= 16;
                  if (~arg2 > -1) {
                     arg5 -= arg2 * var10;
                     arg3 -= arg2 * var9;
                     arg2 = 0;
                  }

                  if (~arg4 > -1) {
                     arg6 -= arg4 * var11;
                     arg4 = 0;
                  }

                  if (var10 <= var9) {
                     arg0 -= arg4;
                     arg4 -= arg2;
                     arg2 = this.field8332 * arg2;
                     if (var8) {
                        class678.method4951(arg5 >> 16, (byte)90, arg3 >> 16, arg2, 0, this.field8325);
                        arg2 += this.field8332;
                        arg5 += var10;
                        arg3 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg4;
                           if (~arg4 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg5 >> 16, (byte)103, arg6 >> 16, arg2, 0, this.field8325);
                                    arg2 += this.field8332;
                                    arg6 += var11;
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
                                          class678.method4951(arg5 >> 16, (byte)103, arg6 >> 16, arg2, 0, this.field8325);
                                          arg2 += this.field8332;
                                          arg6 += var11;
                                          arg5 += var10;
                                       }
                                    }
                                 }
                              }

                              arg3 += var9;
                           } else {
                              class678.method4951(arg5 >> 16, (byte)90, arg3 >> 16, arg2, 0, this.field8325);
                              arg2 += this.field8332;
                              arg5 += var10;
                              arg3 += var9;
                           }
                        }
                     }
                  } else {
                     arg0 -= arg4;
                     arg4 -= arg2;
                     arg2 = this.field8332 * arg2;
                     if (var8) {
                        class678.method4951(arg3 >> 16, (byte)101, arg5 >> 16, arg2, 0, this.field8325);
                        arg5 += var10;
                        arg2 += this.field8332;
                        arg3 += var9;
                     }

                     while(true) {
                        while(true) {
                           --arg4;
                           if (~arg4 > -1) {
                              if (!var8) {
                                 if (var8) {
                                    class678.method4951(arg6 >> 16, (byte)111, arg5 >> 16, arg2, 0, this.field8325);
                                    arg6 += var11;
                                    arg2 += this.field8332;
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
                                          class678.method4951(arg6 >> 16, (byte)111, arg5 >> 16, arg2, 0, this.field8325);
                                          arg6 += var11;
                                          arg2 += this.field8332;
                                          arg5 += var10;
                                       }
                                    }
                                 }
                              }

                              arg3 += var9;
                           } else {
                              class678.method4951(arg3 >> 16, (byte)101, arg5 >> 16, arg2, 0, this.field8325);
                              arg5 += var10;
                              arg2 += this.field8332;
                              arg3 += var9;
                           }
                        }
                     }
                  }
               }
            } else if (~arg2 >= ~arg4) {
               arg6 = arg3 <<= 16;
               arg5 <<= 16;
               if (arg0 < 0) {
                  arg6 -= arg0 * var10;
                  arg3 -= arg0 * var11;
                  arg0 = 0;
               }

               if (arg2 < 0) {
                  arg5 -= arg2 * var9;
                  arg2 = 0;
               }

               if (var11 > var10) {
                  arg4 -= arg2;
                  arg2 -= arg0;
                  arg0 = this.field8332 * arg0;
                  if (var8) {
                     class678.method4951(arg6 >> 16, (byte)121, arg3 >> 16, arg0, 0, this.field8325);
                     arg3 += var11;
                     arg0 += this.field8332;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class678.method4951(arg5 >> 16, (byte)90, arg3 >> 16, arg0, 0, this.field8325);
                                 arg0 += this.field8332;
                                 arg5 += var9;
                                 arg3 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg4;
                                    if (arg4 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg3 += var11;
                                    } else {
                                       class678.method4951(arg5 >> 16, (byte)90, arg3 >> 16, arg0, 0, this.field8325);
                                       arg0 += this.field8332;
                                       arg5 += var9;
                                       arg3 += var11;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class678.method4951(arg6 >> 16, (byte)121, arg3 >> 16, arg0, 0, this.field8325);
                           arg3 += var11;
                           arg0 += this.field8332;
                           arg6 += var10;
                        }
                     }
                  }
               } else {
                  arg4 -= arg2;
                  arg2 -= arg0;
                  arg0 = this.field8332 * arg0;
                  if (var8) {
                     class678.method4951(arg3 >> 16, (byte)104, arg6 >> 16, arg0, 0, this.field8325);
                     arg3 += var11;
                     arg0 += this.field8332;
                     arg6 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class678.method4951(arg3 >> 16, (byte)93, arg5 >> 16, arg0, 0, this.field8325);
                                 arg0 += this.field8332;
                                 arg3 += var11;
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
                                       class678.method4951(arg3 >> 16, (byte)93, arg5 >> 16, arg0, 0, this.field8325);
                                       arg0 += this.field8332;
                                       arg3 += var11;
                                       arg5 += var9;
                                    }
                                 }
                              }
                           }

                           arg6 += var10;
                        } else {
                           class678.method4951(arg3 >> 16, (byte)104, arg6 >> 16, arg0, 0, this.field8325);
                           arg3 += var11;
                           arg0 += this.field8332;
                           arg6 += var10;
                        }
                     }
                  }
               }
            } else {
               arg5 = arg3 <<= 16;
               if (~arg0 > -1) {
                  arg3 -= arg0 * var11;
                  arg5 -= arg0 * var10;
                  arg0 = 0;
               }

               arg6 <<= 16;
               if (arg4 < 0) {
                  arg6 -= arg4 * var9;
                  arg4 = 0;
               }

               if (var11 > var10) {
                  arg2 -= arg4;
                  arg4 -= arg0;
                  arg0 = this.field8332 * arg0;
                  if (var8) {
                     class678.method4951(arg5 >> 16, (byte)108, arg3 >> 16, arg0, 0, this.field8325);
                     arg0 += this.field8332;
                     arg5 += var10;
                     arg3 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class678.method4951(arg5 >> 16, (byte)109, arg6 >> 16, arg0, 0, this.field8325);
                                 arg0 += this.field8332;
                                 arg5 += var10;
                                 arg6 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += var9;
                                    } else {
                                       class678.method4951(arg5 >> 16, (byte)109, arg6 >> 16, arg0, 0, this.field8325);
                                       arg0 += this.field8332;
                                       arg5 += var10;
                                       arg6 += var9;
                                    }
                                 }
                              }
                           }

                           arg3 += var11;
                        } else {
                           class678.method4951(arg5 >> 16, (byte)108, arg3 >> 16, arg0, 0, this.field8325);
                           arg0 += this.field8332;
                           arg5 += var10;
                           arg3 += var11;
                        }
                     }
                  }
               } else {
                  arg2 -= arg4;
                  arg4 -= arg0;
                  arg0 = this.field8332 * arg0;
                  if (var8) {
                     class678.method4951(arg3 >> 16, (byte)111, arg5 >> 16, arg0, 0, this.field8325);
                     arg3 += var11;
                     arg0 += this.field8332;
                     arg5 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg4;
                        if (~arg4 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class678.method4951(arg6 >> 16, (byte)91, arg5 >> 16, arg0, 0, this.field8325);
                                 arg5 += var10;
                                 arg6 += var9;
                                 arg0 += this.field8332;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += this.field8332;
                                    } else {
                                       class678.method4951(arg6 >> 16, (byte)91, arg5 >> 16, arg0, 0, this.field8325);
                                       arg5 += var10;
                                       arg6 += var9;
                                       arg0 += this.field8332;
                                    }
                                 }
                              }
                           }

                           arg5 += var10;
                        } else {
                           class678.method4951(arg3 >> 16, (byte)111, arg5 >> 16, arg0, 0, this.field8325);
                           arg3 += var11;
                           arg0 += this.field8332;
                           arg5 += var10;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8339[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "(Lrk;II)V",
      line = 553
   )
   public class580(class35 arg0, int arg1, int arg2) {
      try {
         this.field8325 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8339[2] + (arg0 != null ? field8339[0] : field8339[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(III)Z",
      line = 569
   )
   public final boolean method4276(int arg0, int arg1, int arg2) {
      try {
         ++field8324;
         if (arg1 < 75) {
            return false;
         } else {
            return this.field8325.length >= arg0 * arg2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8339[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4277(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4278(char[] arg0) {
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
            var10005 = 3;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
