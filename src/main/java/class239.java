import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class239 {
   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3346 = new String[]{method1839(method1838("mn0c")), method1839(method1838("i\u007f=!|+")), method1839(method1838("x5r!C")), method1839(method1838("i\u007f=!}+")), method1839(method1838("i\u007f=!\u007f+"))};
   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "I"
   )
   public static int field3342;
   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "I"
   )
   public static int field3343;
   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "I"
   )
   public static int field3344;
   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "I"
   )
   public static int field3345;

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZLcl;)V",
      line = 5
   )
   public static final void method1835(boolean param0, class279 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ILim;)I",
      line = 113
   )
   public static final int method1836(int arg0, class598 arg1) {
      try {
         ++field3343;
         if (arg0 != -256) {
            field3344 = 65;
         }

         String var2 = class774.method5591(arg1, (byte)102);
         return class467.field6723.method1639(class352.field4735, var2, 60);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3346[4] + arg0 + ',' + (arg1 != null ? field3346[2] : field3346[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(II[IIIIIB)Z",
      line = 126
   )
   public static final boolean method1837(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      boolean var8 = client.field4360;

      try {
         if (arg3 < 0) {
            arg3 = 0;
         }

         int var9 = -104 % ((arg7 - -49) / 41);
         if (~arg5 < ~class533.field7596) {
            arg5 = class533.field7596;
         }

         ++field3345;
         if (~arg5 >= ~arg3) {
            return true;
         } else {
            int var10000;
            label209: {
               arg4 += arg3 + -1;
               arg6 += arg1 * arg3;
               arg0 = -arg3 + arg5 >> 2;
               int var12;
               int var13;
               if (class73.field903 == 1) {
                  label170: {
                     class330.field4497 += arg0;
                     if (var8) {
                        var10000 = ~arg6;
                        ++arg4;
                        if (var10000 > ~arg2[arg4]) {
                           arg2[arg4] = arg6;
                        }

                        arg6 += arg1;
                     } else {
                        --arg0;
                        if (arg0 < 0) {
                           arg0 = -arg3 + arg5 & 3;
                           if (!var8) {
                              break label170;
                           }
                        } else {
                           var10000 = ~arg6;
                           ++arg4;
                           if (var10000 > ~arg2[arg4]) {
                              arg2[arg4] = arg6;
                           }

                           arg6 += arg1;
                        }
                     }

                     while(true) {
                        var12 = arg4 + 1;
                        if (~arg2[var12] < ~arg6) {
                           arg2[var12] = arg6;
                        }

                        var13 = arg1 + arg6;
                        ++var12;
                        if (var13 < arg2[var12]) {
                           arg2[var12] = var13;
                        }

                        var13 += arg1;
                        arg4 = var12 + 1;
                        if (arg2[arg4] > var13) {
                           arg2[arg4] = var13;
                        }

                        arg6 = arg1 + var13;
                        --arg0;
                        if (arg0 < 0) {
                           arg0 = -arg3 + arg5 & 3;
                           if (!var8) {
                              break;
                           }
                        } else {
                           var10000 = ~arg6;
                           ++arg4;
                           if (var10000 > ~arg2[arg4]) {
                              arg2[arg4] = arg6;
                           }

                           arg6 += arg1;
                        }
                     }
                  }

                  if (var8) {
                     ++arg4;
                     if (~arg2[arg4] < ~arg6) {
                        arg2[arg4] = arg6;
                     }

                     arg6 += arg1;
                  }

                  label140:
                  while(true) {
                     while(true) {
                        --arg0;
                        if (~arg0 > -1) {
                           if (!var8) {
                              if (!var8) {
                                 var10000 = 1;
                                 if (!var8) {
                                    return true;
                                 }
                                 break label209;
                              }
                              break label140;
                           }

                           arg6 += arg1;
                        } else {
                           ++arg4;
                           if (~arg2[arg4] < ~arg6) {
                              arg2[arg4] = arg6;
                           }

                           arg6 += arg1;
                        }
                     }
                  }
               }

               label119: {
                  arg6 -= 38400;
                  if (var8) {
                     var10000 = ~arg6;
                     ++arg4;
                     if (var10000 > ~arg2[arg4]) {
                        return false;
                     }

                     arg6 += arg1;
                  } else {
                     --arg0;
                     if (arg0 < 0) {
                        arg0 = 3 & -arg3 + arg5;
                        if (!var8) {
                           break label119;
                        }
                     } else {
                        var10000 = ~arg6;
                        ++arg4;
                        if (var10000 > ~arg2[arg4]) {
                           return false;
                        }

                        arg6 += arg1;
                     }
                  }

                  while(true) {
                     var12 = arg4 + 1;
                     if (arg6 < arg2[var12]) {
                        return false;
                     }

                     var13 = arg1 + arg6;
                     ++var12;
                     if (var13 < arg2[var12]) {
                        return false;
                     }

                     var13 += arg1;
                     var10000 = ~var13;
                     arg4 = var12 + 1;
                     if (var10000 > ~arg2[arg4]) {
                        return false;
                     }

                     arg6 = arg1 + var13;
                     --arg0;
                     if (arg0 < 0) {
                        arg0 = 3 & -arg3 + arg5;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = ~arg6;
                        ++arg4;
                        if (var10000 > ~arg2[arg4]) {
                           return false;
                        }

                        arg6 += arg1;
                     }
                  }
               }

               if (var8) {
                  ++arg4;
                  var10000 = ~arg2[arg4];
               } else {
                  --arg0;
                  if (~arg0 > -1) {
                     var10000 = 1;
                     if (!var8) {
                        return true;
                     }
                  } else {
                     ++arg4;
                     var10000 = ~arg2[arg4];
                  }
               }
            }

            while(var10000 >= ~arg6) {
               arg6 += arg1;
               --arg0;
               if (~arg0 > -1) {
                  var10000 = 1;
                  if (!var8) {
                     return true;
                  }
               } else {
                  ++arg4;
                  var10000 = ~arg2[arg4];
               }
            }

            return false;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field3346[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3346[2] : field3346[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1838(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1839(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
