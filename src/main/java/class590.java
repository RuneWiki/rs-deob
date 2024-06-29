import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class590 {
   @OriginalMember(
      owner = "client!dw",
      name = "i",
      descriptor = "I"
   )
   public int field8685 = 0;
   @OriginalMember(
      owner = "client!dw",
      name = "g",
      descriptor = "I"
   )
   public int field8693 = 0;
   @OriginalMember(
      owner = "client!dw",
      name = "j",
      descriptor = "I"
   )
   public int field8686 = 2048;
   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "I"
   )
   public int field8694 = 2048;
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8697 = new String[]{method4397(method4396("?`TR\u0016")), method4397(method4396("?`TS\u0016")), method4397(method4396("?`TU\u0016")), method4397(method4396("5b\u0016{")), method4397(method4396(" 9T9C")), method4397(method4396("?`TT\u0016")), method4397(method4396("?`TQ\u0016")), method4397(method4396("?`TV\u0016"))};
   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "Ltia;"
   )
   public static class17 field8684 = new class17(2);
   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8689 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @OriginalMember(
      owner = "client!dw",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8696 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!dw",
      name = "m",
      descriptor = "I"
   )
   public static int field8687;
   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "I"
   )
   public static int field8688;
   @OriginalMember(
      owner = "client!dw",
      name = "e",
      descriptor = "I"
   )
   public static int field8690;
   @OriginalMember(
      owner = "client!dw",
      name = "l",
      descriptor = "I"
   )
   public static int field8692;
   @OriginalMember(
      owner = "client!dw",
      name = "h",
      descriptor = "I"
   )
   public static int field8695;
   @OriginalMember(
      owner = "client!dw",
      name = "f",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field8691;

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Lgea;II)V"
   )
   private final void method4390(class66 arg0, int arg1, int arg2) {
      try {
         if (arg1 == -1) {
            ++field8688;
            if (arg2 == 1) {
               this.field8693 = arg0.method640(255);
            } else if (arg2 == 2) {
               this.field8694 = arg0.method603(-2);
            } else if (~arg2 == -4) {
               this.field8686 = arg0.method603(-2);
            } else if (arg2 == 4) {
               this.field8685 = arg0.method652((byte)73);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8697[5] + (arg0 != null ? field8697[4] : field8697[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method4391(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg1.method640(255);
            if (var4 != 0) {
               this.method4390(arg1, -1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field8687;
            break;
         }

         if (arg0 >= -16) {
            method4395(94);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8697[6] + arg0 + ',' + (arg1 != null ? field8697[4] : field8697[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4392(boolean arg0) {
      try {
         class42.field551.method1809(arg0);
         ++field8692;
         class465.field6393.method5264(-128);
         class665.field9856.method5264(-116);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8697[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(I[IIIIIII)Z"
   )
   public static final boolean method4393(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         if (class277.field3541 < arg4) {
            arg4 = class277.field3541;
         }

         if (~arg7 > -1) {
            arg7 = 0;
         }

         ++field8690;
         if (~arg7 <= ~arg4) {
            return true;
         } else {
            arg6 += arg0 * arg7;
            if (arg3 != 65535) {
               field8684 = null;
            }

            int var10000;
            label213: {
               arg5 += arg7 - 1;
               arg2 = -arg7 + arg4 >> 2;
               int var11;
               int var12;
               if (~class535.field7836 == -2) {
                  label172: {
                     class516.field7237 += arg2;
                     if (var8) {
                        ++arg5;
                        if (arg1[arg5] > arg6) {
                           arg1[arg5] = arg6;
                        }

                        arg6 += arg0;
                     } else {
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = -arg7 + arg4 & 3;
                           if (!var8) {
                              break label172;
                           }
                        } else {
                           ++arg5;
                           if (arg1[arg5] > arg6) {
                              arg1[arg5] = arg6;
                           }

                           arg6 += arg0;
                        }
                     }

                     while(true) {
                        var10000 = ~arg6;
                        var11 = arg5 + 1;
                        if (var10000 > ~arg1[var11]) {
                           arg1[var11] = arg6;
                        }

                        var12 = arg0 + arg6;
                        var10000 = ~var12;
                        ++var11;
                        if (var10000 > ~arg1[var11]) {
                           arg1[var11] = var12;
                        }

                        var12 += arg0;
                        arg5 = var11 + 1;
                        if (var12 < arg1[arg5]) {
                           arg1[arg5] = var12;
                        }

                        arg6 = arg0 + var12;
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = -arg7 + arg4 & 3;
                           if (!var8) {
                              break;
                           }
                        } else {
                           ++arg5;
                           if (arg1[arg5] > arg6) {
                              arg1[arg5] = arg6;
                           }

                           arg6 += arg0;
                        }
                     }
                  }

                  if (var8) {
                     ++arg5;
                     if (arg1[arg5] > arg6) {
                        arg1[arg5] = arg6;
                     }

                     arg6 += arg0;
                  }

                  label142:
                  while(true) {
                     while(true) {
                        --arg2;
                        if (~arg2 > -1) {
                           if (!var8) {
                              if (!var8) {
                                 var10000 = 1;
                                 if (!var8) {
                                    return true;
                                 }
                                 break label213;
                              }
                              break label142;
                           }

                           arg6 += arg0;
                        } else {
                           ++arg5;
                           if (arg1[arg5] > arg6) {
                              arg1[arg5] = arg6;
                           }

                           arg6 += arg0;
                        }
                     }
                  }
               }

               label121: {
                  arg6 -= 38400;
                  if (var8) {
                     ++arg5;
                     if (arg1[arg5] > arg6) {
                        return false;
                     }

                     arg6 += arg0;
                  } else {
                     --arg2;
                     if (arg2 < 0) {
                        arg2 = 3 & -arg7 + arg4;
                        if (!var8) {
                           break label121;
                        }
                     } else {
                        ++arg5;
                        if (arg1[arg5] > arg6) {
                           return false;
                        }

                        arg6 += arg0;
                     }
                  }

                  while(true) {
                     var11 = arg5 + 1;
                     if (arg1[var11] > arg6) {
                        return false;
                     }

                     var12 = arg0 + arg6;
                     ++var11;
                     if (~arg1[var11] < ~var12) {
                        return false;
                     }

                     var12 += arg0;
                     arg5 = var11 + 1;
                     if (var12 < arg1[arg5]) {
                        return false;
                     }

                     arg6 = arg0 + var12;
                     --arg2;
                     if (arg2 < 0) {
                        arg2 = 3 & -arg7 + arg4;
                        if (!var8) {
                           break;
                        }
                     } else {
                        ++arg5;
                        if (arg1[arg5] > arg6) {
                           return false;
                        }

                        arg6 += arg0;
                     }
                  }
               }

               if (var8) {
                  ++arg5;
                  var10000 = ~arg1[arg5];
               } else {
                  --arg2;
                  if (arg2 < 0) {
                     var10000 = 1;
                     if (!var8) {
                        return true;
                     }
                  } else {
                     ++arg5;
                     var10000 = ~arg1[arg5];
                  }
               }
            }

            while(var10000 >= ~arg6) {
               arg6 += arg0;
               --arg2;
               if (arg2 < 0) {
                  var10000 = 1;
                  if (!var8) {
                     return true;
                  }
               } else {
                  ++arg5;
                  var10000 = ~arg1[arg5];
               }
            }

            return false;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8697[2] + arg0 + ',' + (arg1 != null ? field8697[4] : field8697[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4394(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != -17144) {
            method4393(-91, (int[])null, -20, -90, -111, 39, -29, 119);
         }

         ++field8695;
         if (arg1) {
            if (class661.field9817 != -1) {
               class108.method967((byte)-54, class661.field9817);
            }

            int var10000;
            label59: {
               class710 var3 = (class710)class397.field5473.method1817(-93);
               if (var2) {
                  var10000 = var3.method4926(0);
               } else if (var3 == null) {
                  class661.field9817 = -1;
                  class397.field5473 = new class227(8);
                  class486.method3691((byte)-98);
                  class661.field9817 = class69.field919;
                  class491.method3730(false, false);
                  class406.method3178((byte)117);
                  var10000 = class661.field9817;
                  if (!var2) {
                     break label59;
                  }
               } else {
                  var10000 = var3.method4926(0);
               }

               label58:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class710)class397.field5473.method1817(-86);
                        if (var3 == null) {
                           if (!var2) {
                              class661.field9817 = -1;
                              class397.field5473 = new class227(8);
                              class486.method3691((byte)-98);
                              class661.field9817 = class69.field919;
                              class491.method3730(false, false);
                              class406.method3178((byte)117);
                              var10000 = class661.field9817;
                              break;
                           }

                           class456.method3489(arg0 ^ -17141, var3, false, true);
                           var3 = (class710)class397.field5473.method1812(353);
                        } else {
                           class456.method3489(arg0 ^ -17141, var3, false, true);
                           var3 = (class710)class397.field5473.method1812(353);
                        }
                     } else {
                        class456.method3489(arg0 ^ -17141, var3, false, true);
                        var3 = (class710)class397.field5473.method1812(353);
                     }

                     if (var3 == null) {
                        class661.field9817 = -1;
                        class397.field5473 = new class227(8);
                        class486.method3691((byte)-98);
                        class661.field9817 = class69.field919;
                        class491.method3730(false, false);
                        class406.method3178((byte)117);
                        var10000 = class661.field9817;
                        if (!var2) {
                           break label58;
                        }
                     } else {
                        var10000 = var3.method4926(0);
                     }
                  }
               } while(var2);
            }

            class256.method2062(var10000);
         }

         class553.field8136 = true;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8697[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4395(int arg0) {
      try {
         field8689 = null;
         field8691 = null;
         field8696 = null;
         if (arg0 == 0) {
            field8684 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8697[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4396(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4397(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
