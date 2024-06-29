import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class556 extends class196 {
   @OriginalMember(
      owner = "client!fd",
      name = "E",
      descriptor = "[B"
   )
   public byte[] field7982;
   @OriginalMember(
      owner = "client!fd",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7987 = new String[]{method3995(method3994("/t\u0000z\u0007")), method3995(method3994("/t\u0000\u0005F'yZ\u0007\u0007")), method3995(method3994("'eBU")), method3995(method3994("2>\u0000\u0017R")), method3995(method3994("/t\u0000x\u0007")), method3995(method3994("/t\u0000|\u0007")), method3995(method3994("/t\u0000}\u0007")), method3995(method3994("/t\u0000~\u0007")), method3995(method3994("/t\u0000{\u0007")), method3995(method3994("/t\u0000\u007f\u0007"))};
   @OriginalMember(
      owner = "client!fd",
      name = "K",
      descriptor = "I"
   )
   public int field7974;
   @OriginalMember(
      owner = "client!fd",
      name = "P",
      descriptor = "I"
   )
   public static int field7975;
   @OriginalMember(
      owner = "client!fd",
      name = "I",
      descriptor = "I"
   )
   public int field7976;
   @OriginalMember(
      owner = "client!fd",
      name = "D",
      descriptor = "I"
   )
   public static int field7978;
   @OriginalMember(
      owner = "client!fd",
      name = "M",
      descriptor = "I"
   )
   public static int field7979;
   @OriginalMember(
      owner = "client!fd",
      name = "G",
      descriptor = "I"
   )
   public int field7980;
   @OriginalMember(
      owner = "client!fd",
      name = "H",
      descriptor = "I"
   )
   public static int field7981;
   @OriginalMember(
      owner = "client!fd",
      name = "J",
      descriptor = "I"
   )
   public static int field7983;
   @OriginalMember(
      owner = "client!fd",
      name = "N",
      descriptor = "I"
   )
   public static int field7985;
   @OriginalMember(
      owner = "client!fd",
      name = "O",
      descriptor = "I"
   )
   public int field7986;
   @OriginalMember(
      owner = "client!fd",
      name = "L",
      descriptor = "Lnha;"
   )
   public static class342 field7984;
   @OriginalMember(
      owner = "client!fd",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field7977;

   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "(B)V",
      line = 6
   )
   public static final void method3987(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field7983;
         if (arg0 <= 10) {
            field7985 = 69;
         }

         label36: {
            if (!class383.field5543.method505()) {
               class42.method358(class300.field4107.field6419.method391(-54), -3, false);
               if (!var1) {
                  break label36;
               }
            }

            label25: {
               class383.field5543.method554(class557.field7990);
               class649.method4727(-1);
               if (class681.field10034) {
                  class384.method2912(class557.field7990, (byte)-98);
                  if (!var1) {
                     break label25;
                  }
               }

               Dimension var2 = class557.field7990.getSize();
               class383.field5543.method499(class557.field7990, var2.width, var2.height);
            }

            class383.field5543.method613(class557.field7990);
         }

         class88.method775((byte)125);
         class171.field2384 = true;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7987[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(II)I",
      line = 42
   )
   public static int method3988(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7987[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "e",
      descriptor = "(B)V",
      line = 51
   )
   public final void method3989(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field7975;
         int var3 = 55 / ((-82 - arg0) / 44);
         int var4 = -1;
         int var5 = this.field7982.length - 8;
         if (var2) {
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
            ++var4;
            this.field7982[var4] = 0;
         }

         while(true) {
            while(~var4 > ~var5) {
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
               ++var4;
               this.field7982[var4] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var4;
                  this.field7982[var4] = 0;
               }

               while(~var4 > ~(this.field7982.length + -1)) {
                  ++var4;
                  this.field7982[var4] = 0;
               }

               return;
            }

            ++var4;
            this.field7982[var4] = 0;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7987[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(Z)V",
      line = 82
   )
   public static void method3990(boolean arg0) {
      try {
         if (!arg0) {
            field7977 = null;
            field7984 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7987[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(IIIZIII)V",
      line = 94
   )
   public final void method3991(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field7978;
         int var9 = 0;
         if (~arg2 != ~arg6) {
            var9 = (-arg0 + arg4 << 16) / (-arg2 + arg6);
         }

         if (!arg3) {
            this.method3992((byte)1, -56, -18, 117, 60);
         }

         int var10 = 0;
         if (~arg1 != ~arg6) {
            var10 = (-arg4 + arg5 << 16) / (-arg6 + arg1);
         }

         int var11 = 0;
         if (arg1 != arg2) {
            var11 = (-arg5 + arg0 << 16) / (arg2 - arg1);
         }

         if (~arg2 >= ~arg6 && ~arg1 <= ~arg2) {
            if (~arg6 > ~arg1) {
               arg5 = arg0 <<= 16;
               arg4 <<= 16;
               if (~arg2 > -1) {
                  arg0 -= arg2 * var9;
                  arg5 -= arg2 * var11;
                  arg2 = 0;
               }

               if (~arg6 > -1) {
                  arg4 -= arg6 * var10;
                  arg6 = 0;
               }

               if (arg2 != arg6 && var11 < var9 || arg2 == arg6 && var11 > var10) {
                  arg1 -= arg6;
                  arg6 -= arg2;
                  arg2 = this.field7974 * arg2;
                  if (var8) {
                     class713.method5181(arg5 >> 16, arg0 >> 16, arg2, (byte)64, 0, this.field7982);
                     arg0 += var9;
                     arg5 += var11;
                     arg2 += this.field7974;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg5 >> 16, arg4 >> 16, arg2, (byte)72, 0, this.field7982);
                                 arg4 += var10;
                                 arg5 += var11;
                                 arg2 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (arg1 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += this.field7974;
                                    } else {
                                       class713.method5181(arg5 >> 16, arg4 >> 16, arg2, (byte)72, 0, this.field7982);
                                       arg4 += var10;
                                       arg5 += var11;
                                       arg2 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg2 += this.field7974;
                        } else {
                           class713.method5181(arg5 >> 16, arg0 >> 16, arg2, (byte)64, 0, this.field7982);
                           arg0 += var9;
                           arg5 += var11;
                           arg2 += this.field7974;
                        }
                     }
                  }
               } else {
                  arg1 -= arg6;
                  arg6 -= arg2;
                  arg2 = this.field7974 * arg2;
                  if (var8) {
                     class713.method5181(arg0 >> 16, arg5 >> 16, arg2, (byte)74, 0, this.field7982);
                     arg0 += var9;
                     arg2 += this.field7974;
                     arg5 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg6;
                        if (arg6 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg4 >> 16, arg5 >> 16, arg2, (byte)76, 0, this.field7982);
                                 arg4 += var10;
                                 arg5 += var11;
                                 arg2 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (arg1 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += this.field7974;
                                    } else {
                                       class713.method5181(arg4 >> 16, arg5 >> 16, arg2, (byte)76, 0, this.field7982);
                                       arg4 += var10;
                                       arg5 += var11;
                                       arg2 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg5 += var11;
                        } else {
                           class713.method5181(arg0 >> 16, arg5 >> 16, arg2, (byte)74, 0, this.field7982);
                           arg0 += var9;
                           arg2 += this.field7974;
                           arg5 += var11;
                        }
                     }
                  }
               }
            } else {
               arg4 = arg0 <<= 16;
               if (~arg2 > -1) {
                  arg0 -= arg2 * var9;
                  arg4 -= arg2 * var11;
                  arg2 = 0;
               }

               arg5 <<= 16;
               if (~arg1 > -1) {
                  arg5 -= arg1 * var10;
                  arg1 = 0;
               }

               if (arg1 != arg2 && ~var11 > ~var9 || ~arg1 == ~arg2 && ~var10 < ~var9) {
                  arg6 -= arg1;
                  arg1 -= arg2;
                  arg2 = this.field7974 * arg2;
                  if (var8) {
                     class713.method5181(arg4 >> 16, arg0 >> 16, arg2, (byte)76, 0, this.field7982);
                     arg0 += var9;
                     arg2 += this.field7974;
                     arg4 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (arg1 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg5 >> 16, arg0 >> 16, arg2, (byte)71, 0, this.field7982);
                                 arg5 += var10;
                                 arg0 += var9;
                                 arg2 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (~arg6 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg2 += this.field7974;
                                    } else {
                                       class713.method5181(arg5 >> 16, arg0 >> 16, arg2, (byte)71, 0, this.field7982);
                                       arg5 += var10;
                                       arg0 += var9;
                                       arg2 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg4 += var11;
                        } else {
                           class713.method5181(arg4 >> 16, arg0 >> 16, arg2, (byte)76, 0, this.field7982);
                           arg0 += var9;
                           arg2 += this.field7974;
                           arg4 += var11;
                        }
                     }
                  }
               } else {
                  arg6 -= arg1;
                  arg1 -= arg2;
                  arg2 = this.field7974 * arg2;
                  if (var8) {
                     class713.method5181(arg0 >> 16, arg4 >> 16, arg2, (byte)75, 0, this.field7982);
                     arg2 += this.field7974;
                     arg0 += var9;
                     arg4 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (arg1 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg0 >> 16, arg5 >> 16, arg2, (byte)124, 0, this.field7982);
                                 arg0 += var9;
                                 arg2 += this.field7974;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg6;
                                    if (arg6 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class713.method5181(arg0 >> 16, arg5 >> 16, arg2, (byte)124, 0, this.field7982);
                                       arg0 += var9;
                                       arg2 += this.field7974;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var11;
                        } else {
                           class713.method5181(arg0 >> 16, arg4 >> 16, arg2, (byte)75, 0, this.field7982);
                           arg2 += this.field7974;
                           arg0 += var9;
                           arg4 += var11;
                        }
                     }
                  }
               }
            }
         } else if (arg1 >= arg6) {
            if (arg2 > arg1) {
               arg0 = arg4 <<= 16;
               arg5 <<= 16;
               if (arg6 < 0) {
                  arg4 -= arg6 * var10;
                  arg0 -= arg6 * var9;
                  arg6 = 0;
               }

               if (~arg1 > -1) {
                  arg5 -= arg1 * var11;
                  arg1 = 0;
               }

               if (arg1 != arg6 && ~var10 < ~var9 || arg1 == arg6 && var9 > var11) {
                  arg2 -= arg1;
                  arg1 -= arg6;
                  arg6 = this.field7974 * arg6;
                  if (var8) {
                     class713.method5181(arg0 >> 16, arg4 >> 16, arg6, (byte)102, 0, this.field7982);
                     arg0 += var9;
                     arg4 += var10;
                     arg6 += this.field7974;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg0 >> 16, arg5 >> 16, arg6, (byte)68, 0, this.field7982);
                                 arg0 += var9;
                                 arg5 += var11;
                                 arg6 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field7974;
                                    } else {
                                       class713.method5181(arg0 >> 16, arg5 >> 16, arg6, (byte)68, 0, this.field7982);
                                       arg0 += var9;
                                       arg5 += var11;
                                       arg6 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg6 += this.field7974;
                        } else {
                           class713.method5181(arg0 >> 16, arg4 >> 16, arg6, (byte)102, 0, this.field7982);
                           arg0 += var9;
                           arg4 += var10;
                           arg6 += this.field7974;
                        }
                     }
                  }
               } else {
                  arg2 -= arg1;
                  arg1 -= arg6;
                  arg6 = this.field7974 * arg6;
                  if (var8) {
                     class713.method5181(arg4 >> 16, arg0 >> 16, arg6, (byte)105, 0, this.field7982);
                     arg6 += this.field7974;
                     arg0 += var9;
                     arg4 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg5 >> 16, arg0 >> 16, arg6, (byte)75, 0, this.field7982);
                                 arg0 += var9;
                                 arg5 += var11;
                                 arg6 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field7974;
                                    } else {
                                       class713.method5181(arg5 >> 16, arg0 >> 16, arg6, (byte)75, 0, this.field7982);
                                       arg0 += var9;
                                       arg5 += var11;
                                       arg6 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg4 += var10;
                        } else {
                           class713.method5181(arg4 >> 16, arg0 >> 16, arg6, (byte)105, 0, this.field7982);
                           arg6 += this.field7974;
                           arg0 += var9;
                           arg4 += var10;
                        }
                     }
                  }
               }
            } else {
               arg5 = arg4 <<= 16;
               arg0 <<= 16;
               if (arg6 < 0) {
                  arg4 -= arg6 * var10;
                  arg5 -= arg6 * var9;
                  arg6 = 0;
               }

               if (arg2 < 0) {
                  arg0 -= arg2 * var11;
                  arg2 = 0;
               }

               if (~var9 <= ~var10) {
                  arg1 -= arg2;
                  arg2 -= arg6;
                  arg6 = this.field7974 * arg6;
                  if (var8) {
                     class713.method5181(arg4 >> 16, arg5 >> 16, arg6, (byte)61, 0, this.field7982);
                     arg5 += var9;
                     arg6 += this.field7974;
                     arg4 += var10;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg4 >> 16, arg0 >> 16, arg6, (byte)61, 0, this.field7982);
                                 arg6 += this.field7974;
                                 arg4 += var10;
                                 arg0 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var11;
                                    } else {
                                       class713.method5181(arg4 >> 16, arg0 >> 16, arg6, (byte)61, 0, this.field7982);
                                       arg6 += this.field7974;
                                       arg4 += var10;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg4 += var10;
                        } else {
                           class713.method5181(arg4 >> 16, arg5 >> 16, arg6, (byte)61, 0, this.field7982);
                           arg5 += var9;
                           arg6 += this.field7974;
                           arg4 += var10;
                        }
                     }
                  }
               } else {
                  arg1 -= arg2;
                  arg2 -= arg6;
                  arg6 = this.field7974 * arg6;
                  if (var8) {
                     class713.method5181(arg5 >> 16, arg4 >> 16, arg6, (byte)65, 0, this.field7982);
                     arg6 += this.field7974;
                     arg4 += var10;
                     arg5 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class713.method5181(arg0 >> 16, arg4 >> 16, arg6, (byte)99, 0, this.field7982);
                                 arg4 += var10;
                                 arg0 += var11;
                                 arg6 += this.field7974;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (arg1 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg6 += this.field7974;
                                    } else {
                                       class713.method5181(arg0 >> 16, arg4 >> 16, arg6, (byte)99, 0, this.field7982);
                                       arg4 += var10;
                                       arg0 += var11;
                                       arg6 += this.field7974;
                                    }
                                 }
                              }
                           }

                           arg5 += var9;
                        } else {
                           class713.method5181(arg5 >> 16, arg4 >> 16, arg6, (byte)65, 0, this.field7982);
                           arg6 += this.field7974;
                           arg4 += var10;
                           arg5 += var9;
                        }
                     }
                  }
               }
            }
         } else if (arg6 <= arg2) {
            arg0 = arg5 <<= 16;
            if (arg1 < 0) {
               arg5 -= arg1 * var11;
               arg0 -= arg1 * var10;
               arg1 = 0;
            }

            arg4 <<= 16;
            if (~arg6 > -1) {
               arg4 -= arg6 * var9;
               arg6 = 0;
            }

            if (~var11 < ~var10) {
               arg2 -= arg6;
               arg6 -= arg1;
               arg1 = this.field7974 * arg1;
               if (var8) {
                  class713.method5181(arg0 >> 16, arg5 >> 16, arg1, (byte)95, 0, this.field7982);
                  arg0 += var10;
                  arg5 += var11;
                  arg1 += this.field7974;
               }

               while(true) {
                  while(true) {
                     --arg6;
                     if (arg6 < 0) {
                        if (!var8) {
                           if (var8) {
                              class713.method5181(arg4 >> 16, arg5 >> 16, arg1, (byte)102, 0, this.field7982);
                              arg5 += var11;
                              arg1 += this.field7974;
                              arg4 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg2;
                                 if (arg2 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg4 += var9;
                                 } else {
                                    class713.method5181(arg4 >> 16, arg5 >> 16, arg1, (byte)102, 0, this.field7982);
                                    arg5 += var11;
                                    arg1 += this.field7974;
                                    arg4 += var9;
                                 }
                              }
                           }
                        }

                        arg1 += this.field7974;
                     } else {
                        class713.method5181(arg0 >> 16, arg5 >> 16, arg1, (byte)95, 0, this.field7982);
                        arg0 += var10;
                        arg5 += var11;
                        arg1 += this.field7974;
                     }
                  }
               }
            } else {
               arg2 -= arg6;
               arg6 -= arg1;
               arg1 = this.field7974 * arg1;
               if (var8) {
                  class713.method5181(arg5 >> 16, arg0 >> 16, arg1, (byte)124, 0, this.field7982);
                  arg0 += var10;
                  arg1 += this.field7974;
                  arg5 += var11;
               }

               while(true) {
                  while(true) {
                     --arg6;
                     if (~arg6 > -1) {
                        if (!var8) {
                           if (var8) {
                              class713.method5181(arg5 >> 16, arg4 >> 16, arg1, (byte)125, 0, this.field7982);
                              arg5 += var11;
                              arg4 += var9;
                              arg1 += this.field7974;
                           }

                           while(true) {
                              while(true) {
                                 --arg2;
                                 if (~arg2 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg1 += this.field7974;
                                 } else {
                                    class713.method5181(arg5 >> 16, arg4 >> 16, arg1, (byte)125, 0, this.field7982);
                                    arg5 += var11;
                                    arg4 += var9;
                                    arg1 += this.field7974;
                                 }
                              }
                           }
                        }

                        arg5 += var11;
                     } else {
                        class713.method5181(arg5 >> 16, arg0 >> 16, arg1, (byte)124, 0, this.field7982);
                        arg0 += var10;
                        arg1 += this.field7974;
                        arg5 += var11;
                     }
                  }
               }
            }
         } else {
            arg4 = arg5 <<= 16;
            arg0 <<= 16;
            if (arg1 < 0) {
               arg4 -= arg1 * var10;
               arg5 -= arg1 * var11;
               arg1 = 0;
            }

            if (arg2 < 0) {
               arg0 -= arg2 * var9;
               arg2 = 0;
            }

            if (var11 > var10) {
               arg6 -= arg2;
               arg2 -= arg1;
               arg1 = this.field7974 * arg1;
               if (var8) {
                  class713.method5181(arg4 >> 16, arg5 >> 16, arg1, (byte)73, 0, this.field7982);
                  arg4 += var10;
                  arg1 += this.field7974;
                  arg5 += var11;
               }

               while(true) {
                  while(true) {
                     --arg2;
                     if (arg2 < 0) {
                        if (!var8) {
                           if (var8) {
                              class713.method5181(arg4 >> 16, arg0 >> 16, arg1, (byte)93, 0, this.field7982);
                              arg1 += this.field7974;
                              arg0 += var9;
                              arg4 += var10;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (arg6 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg4 += var10;
                                 } else {
                                    class713.method5181(arg4 >> 16, arg0 >> 16, arg1, (byte)93, 0, this.field7982);
                                    arg1 += this.field7974;
                                    arg0 += var9;
                                    arg4 += var10;
                                 }
                              }
                           }
                        }

                        arg5 += var11;
                     } else {
                        class713.method5181(arg4 >> 16, arg5 >> 16, arg1, (byte)73, 0, this.field7982);
                        arg4 += var10;
                        arg1 += this.field7974;
                        arg5 += var11;
                     }
                  }
               }
            } else {
               arg6 -= arg2;
               arg2 -= arg1;
               arg1 = this.field7974 * arg1;
               if (var8) {
                  class713.method5181(arg5 >> 16, arg4 >> 16, arg1, (byte)76, 0, this.field7982);
                  arg1 += this.field7974;
                  arg4 += var10;
                  arg5 += var11;
               }

               while(true) {
                  while(true) {
                     --arg2;
                     if (~arg2 > -1) {
                        if (!var8) {
                           if (var8) {
                              class713.method5181(arg0 >> 16, arg4 >> 16, arg1, (byte)117, 0, this.field7982);
                              arg4 += var10;
                              arg1 += this.field7974;
                              arg0 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg6;
                                 if (arg6 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg0 += var9;
                                 } else {
                                    class713.method5181(arg0 >> 16, arg4 >> 16, arg1, (byte)117, 0, this.field7982);
                                    arg4 += var10;
                                    arg1 += this.field7974;
                                    arg0 += var9;
                                 }
                              }
                           }
                        }

                        arg5 += var11;
                     } else {
                        class713.method5181(arg5 >> 16, arg4 >> 16, arg1, (byte)76, 0, this.field7982);
                        arg1 += this.field7974;
                        arg4 += var10;
                        arg5 += var11;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7987[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(BIIII)V",
      line = 530
   )
   public final void method3992(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field7980 = arg2;
         ++field7979;
         this.field7986 = arg1 - arg4;
         this.field7974 = -arg2 + arg3;
         this.field7976 = arg4;
         if (arg0 != -110) {
            this.field7976 = -46;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7987[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(III)Z",
      line = 551
   )
   public final boolean method3993(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -15425) {
            method3987((byte)67);
         }

         ++field7981;
         return this.field7982.length >= arg1 * arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7987[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "<init>",
      descriptor = "(Lsc;II)V",
      line = 564
   )
   public class556(class369 arg0, int arg1, int arg2) {
      try {
         this.field7982 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7987[1] + (arg0 != null ? field7987[3] : field7987[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3994(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3995(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
