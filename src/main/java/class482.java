import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class482 extends class555 {
   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6655 = new String[]{method3512(method3511("Lpn%)")), method3512(method3511("Lpn )")), method3512(method3511("Lpn')")), method3512(method3511("Va,\u000f")), method3512(method3511("C:nM|")), method3512(method3511("Lpn$)")), method3512(method3511("Lpn&)")), method3512(method3511("Lpn\")")), method3512(method3511("Lpn!)"))};
   @OriginalMember(
      owner = "client!td",
      name = "k",
      descriptor = "I"
   )
   public static int field6648;
   @OriginalMember(
      owner = "client!td",
      name = "j",
      descriptor = "I"
   )
   public static int field6649;
   @OriginalMember(
      owner = "client!td",
      name = "l",
      descriptor = "I"
   )
   public static int field6650;
   @OriginalMember(
      owner = "client!td",
      name = "h",
      descriptor = "I"
   )
   public static int field6651;
   @OriginalMember(
      owner = "client!td",
      name = "f",
      descriptor = "I"
   )
   public static int field6652;
   @OriginalMember(
      owner = "client!td",
      name = "i",
      descriptor = "I"
   )
   public static int field6653;
   @OriginalMember(
      owner = "client!td",
      name = "g",
      descriptor = "I"
   )
   public static int field6654;

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (super.field7633.method4414(0)) {
            super.field7632 = 0;
         }

         if (arg0 == -13712) {
            ++field6649;
            if (~super.field7633.field8447.method4066((byte)-83) == -1) {
               super.field7632 = 0;
            }

            if (~super.field7632 > -1 || super.field7632 > 2) {
               super.field7632 = this.method635(126);
            }

         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6655[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class482(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            return 78;
         } else {
            ++field6652;
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6655[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIIII[IBI)Z"
   )
   public static final boolean method3508(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         if (arg0 < 0) {
            arg0 = 0;
         }

         if (~arg1 < ~class243.field3041) {
            arg1 = class243.field3041;
         }

         ++field6651;
         if (arg6 != 125) {
            method3508(-119, 24, 39, 72, -49, (int[])null, (byte)40, 106);
         }

         if (arg1 <= arg0) {
            return true;
         } else {
            int var10000;
            label213: {
               arg2 = arg1 - arg0 >> 2;
               arg3 += arg0 + -1;
               arg7 += arg0 * arg4;
               int var11;
               int var12;
               if (class100.field1286 != 1) {
                  label172: {
                     arg7 -= 38400;
                     if (var8) {
                        var10000 = ~arg7;
                        ++arg3;
                        if (var10000 > ~arg5[arg3]) {
                           return false;
                        }

                        arg7 += arg4;
                     } else {
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = 3 & -arg0 + arg1;
                           if (!var8) {
                              break label172;
                           }
                        } else {
                           var10000 = ~arg7;
                           ++arg3;
                           if (var10000 > ~arg5[arg3]) {
                              return false;
                           }

                           arg7 += arg4;
                        }
                     }

                     while(true) {
                        var11 = arg3 + 1;
                        if (arg5[var11] > arg7) {
                           return false;
                        }

                        var12 = arg4 + arg7;
                        ++var11;
                        if (arg5[var11] > var12) {
                           return false;
                        }

                        var12 += arg4;
                        arg3 = var11 + 1;
                        if (~arg5[arg3] < ~var12) {
                           return false;
                        }

                        arg7 = arg4 + var12;
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = 3 & -arg0 + arg1;
                           if (!var8) {
                              break;
                           }
                        } else {
                           var10000 = ~arg7;
                           ++arg3;
                           if (var10000 > ~arg5[arg3]) {
                              return false;
                           }

                           arg7 += arg4;
                        }
                     }
                  }

                  if (var8) {
                     ++arg3;
                     if (arg7 < arg5[arg3]) {
                        return false;
                     }

                     arg7 += arg4;
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

                           arg7 += arg4;
                        } else {
                           ++arg3;
                           if (arg7 < arg5[arg3]) {
                              return false;
                           }

                           arg7 += arg4;
                        }
                     }
                  }
               }

               label121: {
                  class111.field1406 += arg2;
                  if (var8) {
                     var10000 = ~arg7;
                     ++arg3;
                     if (var10000 > ~arg5[arg3]) {
                        arg5[arg3] = arg7;
                     }

                     arg7 += arg4;
                  } else {
                     --arg2;
                     if (~arg2 > -1) {
                        arg2 = -arg0 + arg1 & 3;
                        if (!var8) {
                           break label121;
                        }
                     } else {
                        var10000 = ~arg7;
                        ++arg3;
                        if (var10000 > ~arg5[arg3]) {
                           arg5[arg3] = arg7;
                        }

                        arg7 += arg4;
                     }
                  }

                  while(true) {
                     var11 = arg3 + 1;
                     if (arg5[var11] > arg7) {
                        arg5[var11] = arg7;
                     }

                     var12 = arg4 + arg7;
                     ++var11;
                     if (arg5[var11] > var12) {
                        arg5[var11] = var12;
                     }

                     var12 += arg4;
                     arg3 = var11 + 1;
                     if (arg5[arg3] > var12) {
                        arg5[arg3] = var12;
                     }

                     arg7 = arg4 + var12;
                     --arg2;
                     if (~arg2 > -1) {
                        arg2 = -arg0 + arg1 & 3;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = ~arg7;
                        ++arg3;
                        if (var10000 > ~arg5[arg3]) {
                           arg5[arg3] = arg7;
                        }

                        arg7 += arg4;
                     }
                  }
               }

               if (var8) {
                  ++arg3;
                  var10000 = arg5[arg3];
               } else {
                  --arg2;
                  if (arg2 < 0) {
                     var10000 = 1;
                     if (!var8) {
                        return true;
                     }
                  } else {
                     ++arg3;
                     var10000 = arg5[arg3];
                  }
               }
            }

            while(true) {
               if (var10000 > arg7) {
                  arg5[arg3] = arg7;
               }

               arg7 += arg4;
               --arg2;
               if (arg2 < 0) {
                  var10000 = 1;
                  if (!var8) {
                     return true;
                  }
               } else {
                  ++arg3;
                  var10000 = arg5[arg3];
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6655[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6655[4] : field6655[3]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class482(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         int var3 = -112 / ((12 - arg1) / 47);
         ++field6650;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6655[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method3509(byte arg0) {
      try {
         if (arg0 >= -61) {
            return -17;
         } else {
            ++field6648;
            return super.field7632;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6655[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3510(byte arg0) {
      try {
         ++field6653;
         if (arg0 != -107) {
            this.method635(76);
         }

         if (super.field7633.method4414(0)) {
            return false;
         } else {
            return super.field7633.field8447.method4066((byte)-70) != 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6655[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field6654;
         if (super.field7633.method4414(0)) {
            return 3;
         } else if (super.field7633.field8447.method4066((byte)-111) == 0) {
            return 3;
         } else {
            if (arg1 < 36) {
               this.method3509((byte)84);
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6655[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
