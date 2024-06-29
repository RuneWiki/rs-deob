import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class236 extends class664 implements class516 {
   @OriginalMember(
      owner = "client!gn",
      name = "x",
      descriptor = "I"
   )
   private int field3653;
   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3661 = new String[]{method2088(method2087("lYg\u0002b")), method2088(method2087("lYg\u0007b")), method2088(method2087("lYg\u0006b")), method2088(method2087("lYg\u0004b")), method2088(method2087("p\u0019gn7")), method2088(method2087("eB%,")), method2088(method2087("lYg|#e^=~b")), method2088(method2087("lYg\u0003b")), method2088(method2087("lYg\bb")), method2088(method2087("lYg\u0005b"))};
   @OriginalMember(
      owner = "client!gn",
      name = "n",
      descriptor = "Lom;"
   )
   public static class722 field3650 = new class722();
   @OriginalMember(
      owner = "client!gn",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field3655 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!gn",
      name = "t",
      descriptor = "F"
   )
   public static float field3656;
   @OriginalMember(
      owner = "client!gn",
      name = "p",
      descriptor = "I"
   )
   public static int field3651;
   @OriginalMember(
      owner = "client!gn",
      name = "o",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!gn",
      name = "w",
      descriptor = "I"
   )
   public static int field3654;
   @OriginalMember(
      owner = "client!gn",
      name = "u",
      descriptor = "I"
   )
   public static int field3657;
   @OriginalMember(
      owner = "client!gn",
      name = "q",
      descriptor = "I"
   )
   public static int field3658;
   @OriginalMember(
      owner = "client!gn",
      name = "r",
      descriptor = "I"
   )
   public static int field3659;
   @OriginalMember(
      owner = "client!gn",
      name = "s",
      descriptor = "I"
   )
   public static int field3660;

   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2084(byte arg0) {
      try {
         super.field9357.method4884(this, arg0 ^ 40);
         ++field3659;
         if (arg0 != 17) {
            field3655 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3661[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1397(int arg0) {
      try {
         ++field3657;
         if (arg0 != -28824) {
            this.field3653 = -1;
         }

         return this.field3653;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3661[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "<init>",
      descriptor = "(Laea;I[BIZ)V"
   )
   public class236(class678 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field3653 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3661[6] + (arg0 != null ? field3661[4] : field3661[5]) + ',' + arg1 + ',' + (arg2 != null ? field3661[4] : field3661[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method1396(int arg0) {
      try {
         if (arg0 != 17378) {
            field3650 = null;
         }

         ++field3660;
         return 0L;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3661[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IIII[IIII)Z"
   )
   public static final boolean method2085(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         if (arg0 < 0) {
            arg0 = 0;
         }

         ++field3651;
         if (class597.field8402 < arg3) {
            arg3 = class597.field8402;
         }

         if (~arg3 >= ~arg0) {
            return true;
         } else {
            arg7 += arg0 + -1;
            arg1 += arg0 * arg5;
            arg2 = -arg0 + arg3 >> 2;
            if (arg6 >= -16) {
               method2085(110, 57, -56, -31, (int[])null, -92, -63, -29);
            }

            int var10000;
            label213: {
               int var11;
               int var12;
               if (class613.field8721 != 1) {
                  label172: {
                     arg1 -= 38400;
                     if (var8) {
                        ++arg7;
                        if (~arg4[arg7] < ~arg1) {
                           return false;
                        }

                        arg1 += arg5;
                     } else {
                        --arg2;
                        if (~arg2 > -1) {
                           arg2 = 3 & -arg0 + arg3;
                           if (!var8) {
                              break label172;
                           }
                        } else {
                           ++arg7;
                           if (~arg4[arg7] < ~arg1) {
                              return false;
                           }

                           arg1 += arg5;
                        }
                     }

                     while(true) {
                        var12 = arg7 + 1;
                        if (~arg4[var12] < ~arg1) {
                           return false;
                        }

                        var11 = arg1 + arg5;
                        ++var12;
                        if (arg4[var12] > var11) {
                           return false;
                        }

                        var11 += arg5;
                        arg7 = var12 + 1;
                        if (arg4[arg7] > var11) {
                           return false;
                        }

                        arg1 = var11 + arg5;
                        --arg2;
                        if (~arg2 > -1) {
                           arg2 = 3 & -arg0 + arg3;
                           if (!var8) {
                              break;
                           }
                        } else {
                           ++arg7;
                           if (~arg4[arg7] < ~arg1) {
                              return false;
                           }

                           arg1 += arg5;
                        }
                     }
                  }

                  if (var8) {
                     ++arg7;
                     if (arg4[arg7] > arg1) {
                        return false;
                     }

                     arg1 += arg5;
                  }

                  label142:
                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
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

                           arg1 += arg5;
                        } else {
                           ++arg7;
                           if (arg4[arg7] > arg1) {
                              return false;
                           }

                           arg1 += arg5;
                        }
                     }
                  }
               }

               label121: {
                  class526.field7443 += arg2;
                  if (var8) {
                     var10000 = ~arg1;
                     ++arg7;
                     if (var10000 > ~arg4[arg7]) {
                        arg4[arg7] = arg1;
                     }

                     arg1 += arg5;
                  } else {
                     --arg2;
                     if (~arg2 > -1) {
                        arg2 = 3 & -arg0 + arg3;
                        if (!var8) {
                           break label121;
                        }
                     } else {
                        var10000 = ~arg1;
                        ++arg7;
                        if (var10000 > ~arg4[arg7]) {
                           arg4[arg7] = arg1;
                        }

                        arg1 += arg5;
                     }
                  }

                  while(true) {
                     var12 = arg7 + 1;
                     if (arg4[var12] > arg1) {
                        arg4[var12] = arg1;
                     }

                     var11 = arg1 + arg5;
                     ++var12;
                     if (arg4[var12] > var11) {
                        arg4[var12] = var11;
                     }

                     var11 += arg5;
                     arg7 = var12 + 1;
                     if (arg4[arg7] > var11) {
                        arg4[arg7] = var11;
                     }

                     arg1 = var11 + arg5;
                     --arg2;
                     if (~arg2 > -1) {
                        arg2 = 3 & -arg0 + arg3;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = ~arg1;
                        ++arg7;
                        if (var10000 > ~arg4[arg7]) {
                           arg4[arg7] = arg1;
                        }

                        arg1 += arg5;
                     }
                  }
               }

               if (var8) {
                  ++arg7;
                  var10000 = ~arg4[arg7];
               } else {
                  --arg2;
                  if (arg2 < 0) {
                     var10000 = 1;
                     if (!var8) {
                        return true;
                     }
                  } else {
                     ++arg7;
                     var10000 = ~arg4[arg7];
                  }
               }
            }

            while(true) {
               if (var10000 < ~arg1) {
                  arg4[arg7] = arg1;
               }

               arg1 += arg5;
               --arg2;
               if (arg2 < 0) {
                  var10000 = 1;
                  if (!var8) {
                     return true;
                  }
               } else {
                  ++arg7;
                  var10000 = ~arg4[arg7];
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3661[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3661[4] : field3661[5]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method1402(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         if (arg1 != 8680) {
            this.method2084((byte)-1);
         }

         this.method4829(1, arg2, arg3);
         ++field3658;
         this.field3653 = arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3661[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3661[4] : field3661[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "<init>",
      descriptor = "(Laea;ILjaclib/memory/Buffer;IZ)V"
   )
   public class236(class678 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field3653 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3661[6] + (arg0 != null ? field3661[4] : field3661[5]) + ',' + arg1 + ',' + (arg2 != null ? field3661[4] : field3661[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1399(boolean arg0) {
      try {
         if (arg0) {
            field3655 = null;
         }

         ++field3654;
         return super.field9358;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3661[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2086(int arg0) {
      try {
         field3655 = null;
         if (arg0 != -17811) {
            field3655 = null;
         }

         field3650 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3661[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2087(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2088(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
