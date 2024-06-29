import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class684 extends class114 {
   @OriginalMember(
      owner = "client!gr",
      name = "E",
      descriptor = "[B"
   )
   public byte[] field10076;
   @OriginalMember(
      owner = "client!gr",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10088 = new String[]{method4987(method4986("\u0018bE0X")), method4987(method4986("\u0018bE4X")), method4987(method4986("\u0018bE5X")), method4987(method4986("\u0018bE?X")), method4987(method4986("\u0018bE1X")), method4987(method4986("\u0018bE>X")), method4987(method4986("Cs\u0004\u001fM\u001cs\b\u0010\u0013\u001c.")), method4987(method4986("\u0011e\u0007\u001f")), method4987(method4986("_=USL\u001c\u007f\u0007N\u0016\u0019v\r\u0015\u0016A")), method4987(method4986("\u0004>E]\r")), method4987(method4986("Cs\u0004\u001fM\u0019v\r\u0015\u0016\u0019.")), method4987(method4986("_8")), method4987(method4986("\u0018bE6X")), method4987(method4986("\u0018bE=X")), method4987(method4986("\u0018bE;X")), method4987(method4986("\u0018bEO\u0019\u0011y\u001fMX")), method4987(method4986("\u0018bE7X"))};
   @OriginalMember(
      owner = "client!gr",
      name = "H",
      descriptor = "Lifa;"
   )
   public static class75 field10075 = new class75(13, 3);
   @OriginalMember(
      owner = "client!gr",
      name = "K",
      descriptor = "Lse;"
   )
   public static class6 field10086 = new class6(50, 3);
   @OriginalMember(
      owner = "client!gr",
      name = "C",
      descriptor = "I"
   )
   public static int field10071;
   @OriginalMember(
      owner = "client!gr",
      name = "D",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!gr",
      name = "G",
      descriptor = "I"
   )
   public static int field10074;
   @OriginalMember(
      owner = "client!gr",
      name = "F",
      descriptor = "I"
   )
   public int field10077;
   @OriginalMember(
      owner = "client!gr",
      name = "I",
      descriptor = "I"
   )
   public static int field10078;
   @OriginalMember(
      owner = "client!gr",
      name = "w",
      descriptor = "I"
   )
   public static int field10079;
   @OriginalMember(
      owner = "client!gr",
      name = "u",
      descriptor = "I"
   )
   public int field10080;
   @OriginalMember(
      owner = "client!gr",
      name = "B",
      descriptor = "I"
   )
   public static int field10081;
   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "I"
   )
   public static int field10082;
   @OriginalMember(
      owner = "client!gr",
      name = "v",
      descriptor = "I"
   )
   public static int field10083;
   @OriginalMember(
      owner = "client!gr",
      name = "x",
      descriptor = "I"
   )
   public int field10084;
   @OriginalMember(
      owner = "client!gr",
      name = "A",
      descriptor = "I"
   )
   public static int field10085;
   @OriginalMember(
      owner = "client!gr",
      name = "y",
      descriptor = "I"
   )
   public int field10087;
   @OriginalMember(
      owner = "client!gr",
      name = "J",
      descriptor = "[[B"
   )
   public static byte[][] field10073;

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4976(byte arg0) {
      try {
         class223.field2792 = class387.field5363;
         class139.field1755 = -1;
         class413.field5674 = 1;
         ++field10071;
         class670.method4886(class368.field5134, (byte)92, "", true, class368.field5134.equals(""));
         if (arg0 <= 55) {
            method4977(87, -108, -82, -60, 76);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10088[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method4977(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10082;
         if (~(2 & class245.field3092[0][arg4][arg2]) != -1) {
            return true;
         } else if ((16 & class245.field3092[arg3][arg4][arg2]) != 0) {
            return false;
         } else {
            int var5 = 13 / ((arg1 - -18) / 42);
            return ~class183.method1535(arg4, arg2, 0, arg3) == ~arg0;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10088[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(ZZLsa;)V"
   )
   public static final void method4978(boolean param0, boolean param1, class783 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public final void method4979(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         ++field10081;
         this.field10080 = arg1;
         this.field10077 = -arg0 + arg3;
         this.field10087 = arg0;
         this.field10084 = arg2 - arg1;
         if (arg4 != -79) {
            this.field10080 = 74;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10088[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4980(int arg0) {
      try {
         ++field10085;
         class497.field6954.method397(class37.field522);
         class497.field6954.method504(class792.field11592, class410.field5647, class543.field7941, class113.field1506);
         if (arg0 != 0) {
            field10075 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10088[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public final boolean method4981(int arg0, int arg1, byte arg2) {
      try {
         ++field10074;
         if (arg2 != -42) {
            this.field10084 = 123;
         }

         return ~(arg0 * arg1) >= ~this.field10076.length;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10088[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method4982(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10079;
         int var3 = -1;
         int var4 = this.field10076.length + -8;
         if (var2) {
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
            ++var3;
            this.field10076[var3] = 0;
         }

         while(true) {
            while(var4 > var3) {
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
               ++var3;
               this.field10076[var3] = 0;
            }

            if (!var2) {
               if (var2) {
                  ++var3;
                  this.field10076[var3] = 0;
               }

               while(var3 < this.field10076.length + -1) {
                  ++var3;
                  this.field10076[var3] = 0;
               }

               if (arg0 != -1013146369) {
                  this.field10087 = 63;
                  return;
               } else {
                  return;
               }
            }

            ++var3;
            this.field10076[var3] = 0;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10088[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method4983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field10072;
         int var9 = 0;
         if (arg1 != arg3) {
            var9 = (arg5 - arg4 << 16) / (-arg1 + arg3);
         }

         int var10 = arg6;
         if (~arg2 != ~arg3) {
            var10 = (-arg5 + arg0 << 16) / (-arg3 + arg2);
         }

         int var11 = 0;
         if (~arg1 != ~arg2) {
            var11 = (-arg0 + arg4 << 16) / (arg1 - arg2);
         }

         if (~arg1 >= ~arg3 && arg2 >= arg1) {
            if (arg2 <= arg3) {
               arg5 = arg4 <<= 16;
               arg0 <<= 16;
               if (~arg1 > -1) {
                  arg5 -= arg1 * var11;
                  arg4 -= arg1 * var9;
                  arg1 = 0;
               }

               if (arg2 < 0) {
                  arg0 -= arg2 * var10;
                  arg2 = 0;
               }

               if (~arg1 != ~arg2 && var9 > var11 || ~arg1 == ~arg2 && ~var9 > ~var10) {
                  arg3 -= arg2;
                  arg2 -= arg1;
                  arg1 = this.field10077 * arg1;
                  if (var8) {
                     class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg5 >> 16, arg6 + 6);
                     arg1 += this.field10077;
                     arg4 += var9;
                     arg5 += var11;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg0 >> 16, arg6 ^ 6);
                                 arg0 += var10;
                                 arg1 += this.field10077;
                                 arg4 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var9;
                                    } else {
                                       class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg0 >> 16, arg6 ^ 6);
                                       arg0 += var10;
                                       arg1 += this.field10077;
                                       arg4 += var9;
                                    }
                                 }
                              }
                           }

                           arg5 += var11;
                        } else {
                           class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg5 >> 16, arg6 + 6);
                           arg1 += this.field10077;
                           arg4 += var9;
                           arg5 += var11;
                        }
                     }
                  }
               } else {
                  arg3 -= arg2;
                  arg2 -= arg1;
                  arg1 = this.field10077 * arg1;
                  if (var8) {
                     class750.method5427(arg5 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                     arg4 += var9;
                     arg5 += var11;
                     arg1 += this.field10077;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                                 arg1 += this.field10077;
                                 arg4 += var9;
                                 arg0 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg3;
                                    if (arg3 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg0 += var10;
                                    } else {
                                       class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                                       arg1 += this.field10077;
                                       arg4 += var9;
                                       arg0 += var10;
                                    }
                                 }
                              }
                           }

                           arg1 += this.field10077;
                        } else {
                           class750.method5427(arg5 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                           arg4 += var9;
                           arg5 += var11;
                           arg1 += this.field10077;
                        }
                     }
                  }
               }
            } else {
               arg0 = arg4 <<= 16;
               if (~arg1 > -1) {
                  arg4 -= arg1 * var9;
                  arg0 -= arg1 * var11;
                  arg1 = 0;
               }

               arg5 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var10;
                  arg3 = 0;
               }

               if (arg1 != arg3 && var11 < var9 || ~arg1 == ~arg3 && var11 > var10) {
                  arg2 -= arg3;
                  arg3 -= arg1;
                  arg1 = this.field10077 * arg1;
                  if (var8) {
                     class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg0 >> 16, 6);
                     arg0 += var11;
                     arg1 += this.field10077;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (~arg3 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg5 >> 16, this.field10076, arg1, 0, arg0 >> 16, arg6 ^ 6);
                                 arg0 += var11;
                                 arg1 += this.field10077;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class750.method5427(arg5 >> 16, this.field10076, arg1, 0, arg0 >> 16, arg6 ^ 6);
                                       arg0 += var11;
                                       arg1 += this.field10077;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class750.method5427(arg4 >> 16, this.field10076, arg1, 0, arg0 >> 16, 6);
                           arg0 += var11;
                           arg1 += this.field10077;
                           arg4 += var9;
                        }
                     }
                  }
               } else {
                  arg2 -= arg3;
                  arg3 -= arg1;
                  arg1 = this.field10077 * arg1;
                  if (var8) {
                     class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                     arg1 += this.field10077;
                     arg0 += var11;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg3;
                        if (arg3 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg5 >> 16, 6);
                                 arg1 += this.field10077;
                                 arg5 += var10;
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
                                       class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg5 >> 16, 6);
                                       arg1 += this.field10077;
                                       arg5 += var10;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class750.method5427(arg0 >> 16, this.field10076, arg1, 0, arg4 >> 16, 6);
                           arg1 += this.field10077;
                           arg0 += var11;
                           arg4 += var9;
                        }
                     }
                  }
               }
            }
         } else if (~arg2 <= ~arg3) {
            if (~arg1 < ~arg2) {
               arg4 = arg5 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var10;
                  arg4 -= arg3 * var9;
                  arg3 = 0;
               }

               arg0 <<= 16;
               if (~arg2 > -1) {
                  arg0 -= arg2 * var11;
                  arg2 = 0;
               }

               if (~arg2 != ~arg3 && ~var10 < ~var9 || arg2 == arg3 && var9 > var11) {
                  arg1 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field10077 * arg3;
                  if (var8) {
                     class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg4 >> 16, arg6 + 6);
                     arg5 += var10;
                     arg3 += this.field10077;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg0 >> 16, this.field10076, arg3, 0, arg4 >> 16, arg6 ^ 6);
                                 arg0 += var11;
                                 arg3 += this.field10077;
                                 arg4 += var9;
                              }

                              while(true) {
                                 while(true) {
                                    --arg1;
                                    if (~arg1 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var9;
                                    } else {
                                       class750.method5427(arg0 >> 16, this.field10076, arg3, 0, arg4 >> 16, arg6 ^ 6);
                                       arg0 += var11;
                                       arg3 += this.field10077;
                                       arg4 += var9;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg4 >> 16, arg6 + 6);
                           arg5 += var10;
                           arg3 += this.field10077;
                           arg4 += var9;
                        }
                     }
                  }
               } else {
                  arg1 -= arg2;
                  arg2 -= arg3;
                  arg3 = this.field10077 * arg3;
                  if (var8) {
                     class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg5 >> 16, 6);
                     arg5 += var10;
                     arg3 += this.field10077;
                     arg4 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg0 >> 16, arg6 + 6);
                                 arg3 += this.field10077;
                                 arg4 += var9;
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
                                       class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg0 >> 16, arg6 + 6);
                                       arg3 += this.field10077;
                                       arg4 += var9;
                                       arg0 += var11;
                                    }
                                 }
                              }
                           }

                           arg4 += var9;
                        } else {
                           class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg5 >> 16, 6);
                           arg5 += var10;
                           arg3 += this.field10077;
                           arg4 += var9;
                        }
                     }
                  }
               }
            } else {
               arg0 = arg5 <<= 16;
               if (arg3 < 0) {
                  arg5 -= arg3 * var10;
                  arg0 -= arg3 * var9;
                  arg3 = 0;
               }

               arg4 <<= 16;
               if (arg1 < 0) {
                  arg4 -= arg1 * var11;
                  arg1 = 0;
               }

               if (~var9 <= ~var10) {
                  arg2 -= arg1;
                  arg1 -= arg3;
                  arg3 = this.field10077 * arg3;
                  if (var8) {
                     class750.method5427(arg0 >> 16, this.field10076, arg3, 0, arg5 >> 16, 6);
                     arg3 += this.field10077;
                     arg5 += var10;
                     arg0 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg5 >> 16, arg6 ^ 6);
                                 arg5 += var10;
                                 arg3 += this.field10077;
                                 arg4 += var11;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (~arg2 > -1) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg4 += var11;
                                    } else {
                                       class750.method5427(arg4 >> 16, this.field10076, arg3, 0, arg5 >> 16, arg6 ^ 6);
                                       arg5 += var10;
                                       arg3 += this.field10077;
                                       arg4 += var11;
                                    }
                                 }
                              }
                           }

                           arg0 += var9;
                        } else {
                           class750.method5427(arg0 >> 16, this.field10076, arg3, 0, arg5 >> 16, 6);
                           arg3 += this.field10077;
                           arg5 += var10;
                           arg0 += var9;
                        }
                     }
                  }
               } else {
                  arg2 -= arg1;
                  arg1 -= arg3;
                  arg3 = this.field10077 * arg3;
                  if (var8) {
                     class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg0 >> 16, 6);
                     arg5 += var10;
                     arg3 += this.field10077;
                     arg0 += var9;
                  }

                  while(true) {
                     while(true) {
                        --arg1;
                        if (~arg1 > -1) {
                           if (!var8) {
                              if (var8) {
                                 class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg4 >> 16, 6);
                                 arg4 += var11;
                                 arg3 += this.field10077;
                                 arg5 += var10;
                              }

                              while(true) {
                                 while(true) {
                                    --arg2;
                                    if (arg2 < 0) {
                                       if (!var8) {
                                          return;
                                       }

                                       arg5 += var10;
                                    } else {
                                       class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg4 >> 16, 6);
                                       arg4 += var11;
                                       arg3 += this.field10077;
                                       arg5 += var10;
                                    }
                                 }
                              }
                           }

                           arg0 += var9;
                        } else {
                           class750.method5427(arg5 >> 16, this.field10076, arg3, 0, arg0 >> 16, 6);
                           arg5 += var10;
                           arg3 += this.field10077;
                           arg0 += var9;
                        }
                     }
                  }
               }
            }
         } else if (arg1 >= arg3) {
            arg4 = arg0 <<= 16;
            if (~arg2 > -1) {
               arg4 -= arg2 * var10;
               arg0 -= arg2 * var11;
               arg2 = 0;
            }

            arg5 <<= 16;
            if (~arg3 > -1) {
               arg5 -= arg3 * var9;
               arg3 = 0;
            }

            if (var11 > var10) {
               arg1 -= arg3;
               arg3 -= arg2;
               arg2 = this.field10077 * arg2;
               if (var8) {
                  class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg4 >> 16, 6);
                  arg4 += var10;
                  arg0 += var11;
                  arg2 += this.field10077;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (arg3 < 0) {
                        if (!var8) {
                           if (var8) {
                              class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                              arg2 += this.field10077;
                              arg5 += var9;
                              arg0 += var11;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (arg1 < 0) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg0 += var11;
                                 } else {
                                    class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                                    arg2 += this.field10077;
                                    arg5 += var9;
                                    arg0 += var11;
                                 }
                              }
                           }
                        }

                        arg2 += this.field10077;
                     } else {
                        class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg4 >> 16, 6);
                        arg4 += var10;
                        arg0 += var11;
                        arg2 += this.field10077;
                     }
                  }
               }
            } else {
               arg1 -= arg3;
               arg3 -= arg2;
               arg2 = this.field10077 * arg2;
               if (var8) {
                  class750.method5427(arg4 >> 16, this.field10076, arg2, 0, arg0 >> 16, arg6 + 6);
                  arg4 += var10;
                  arg0 += var11;
                  arg2 += this.field10077;
               }

               while(true) {
                  while(true) {
                     --arg3;
                     if (~arg3 > -1) {
                        if (!var8) {
                           if (var8) {
                              class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg0 >> 16, arg6 ^ 6);
                              arg2 += this.field10077;
                              arg0 += var11;
                              arg5 += var9;
                           }

                           while(true) {
                              while(true) {
                                 --arg1;
                                 if (~arg1 > -1) {
                                    if (!var8) {
                                       return;
                                    }

                                    arg5 += var9;
                                 } else {
                                    class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg0 >> 16, arg6 ^ 6);
                                    arg2 += this.field10077;
                                    arg0 += var11;
                                    arg5 += var9;
                                 }
                              }
                           }
                        }

                        arg2 += this.field10077;
                     } else {
                        class750.method5427(arg4 >> 16, this.field10076, arg2, 0, arg0 >> 16, arg6 + 6);
                        arg4 += var10;
                        arg0 += var11;
                        arg2 += this.field10077;
                     }
                  }
               }
            }
         } else {
            arg5 = arg0 <<= 16;
            if (~arg2 > -1) {
               arg5 -= arg2 * var10;
               arg0 -= arg2 * var11;
               arg2 = 0;
            }

            arg4 <<= 16;
            if (arg1 < 0) {
               arg4 -= arg1 * var9;
               arg1 = 0;
            }

            if (~var10 <= ~var11) {
               arg3 -= arg1;
               arg1 -= arg2;
               arg2 = this.field10077 * arg2;
               if (var8) {
                  class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg0 >> 16, 6);
                  arg0 += var11;
                  arg2 += this.field10077;
                  arg5 += var10;
               }

               while(true) {
                  while(true) {
                     --arg1;
                     if (arg1 < 0) {
                        if (!var8) {
                           if (var8) {
                              class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg4 >> 16, arg6 ^ 6);
                              arg2 += this.field10077;
                              arg4 += var9;
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
                                    class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg4 >> 16, arg6 ^ 6);
                                    arg2 += this.field10077;
                                    arg4 += var9;
                                    arg5 += var10;
                                 }
                              }
                           }
                        }

                        arg5 += var10;
                     } else {
                        class750.method5427(arg5 >> 16, this.field10076, arg2, 0, arg0 >> 16, 6);
                        arg0 += var11;
                        arg2 += this.field10077;
                        arg5 += var10;
                     }
                  }
               }
            } else {
               arg3 -= arg1;
               arg1 -= arg2;
               arg2 = this.field10077 * arg2;
               if (var8) {
                  class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                  arg0 += var11;
                  arg2 += this.field10077;
                  arg5 += var10;
               }

               while(true) {
                  while(true) {
                     --arg1;
                     if (arg1 < 0) {
                        if (!var8) {
                           if (var8) {
                              class750.method5427(arg4 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                              arg4 += var9;
                              arg2 += this.field10077;
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
                                    class750.method5427(arg4 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                                    arg4 += var9;
                                    arg2 += this.field10077;
                                    arg5 += var10;
                                 }
                              }
                           }
                        }

                        arg5 += var10;
                     } else {
                        class750.method5427(arg0 >> 16, this.field10076, arg2, 0, arg5 >> 16, 6);
                        arg0 += var11;
                        arg2 += this.field10077;
                        arg5 += var10;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10088[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4984(int arg0) {
      try {
         if (arg0 != -3329) {
            field10073 = null;
         }

         field10073 = null;
         field10086 = null;
         field10075 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10088[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method4985(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 110) {
            field10086 = null;
         }

         ++field10078;
         int var3 = arg1 + -1 & arg2 >> 31;
         return ((arg2 >>> 31) + arg2) % arg1 + var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10088[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "<init>",
      descriptor = "(Liu;II)V"
   )
   public class684(class530 arg0, int arg1, int arg2) {
      try {
         this.field10076 = new byte[arg1 * arg2];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10088[15] + (arg0 != null ? field10088[9] : field10088[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4986(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4987(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
