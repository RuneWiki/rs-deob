import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class88 extends class223 {
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "I"
   )
   private int field1440;
   @OriginalMember(
      owner = "client!haa",
      name = "B",
      descriptor = "Lcs;"
   )
   private class357 field1438;
   @OriginalMember(
      owner = "client!haa",
      name = "n",
      descriptor = "I"
   )
   private int field1434;
   @OriginalMember(
      owner = "client!haa",
      name = "t",
      descriptor = "I"
   )
   private int field1442;
   @OriginalMember(
      owner = "client!haa",
      name = "v",
      descriptor = "I"
   )
   private int field1435;
   @OriginalMember(
      owner = "client!haa",
      name = "s",
      descriptor = "I"
   )
   private int field1430;
   @OriginalMember(
      owner = "client!haa",
      name = "w",
      descriptor = "I"
   )
   private int field1433;
   @OriginalMember(
      owner = "client!haa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1445 = new String[]{method864(method863("K(\u000e@Q\u000b")), method864(method863("K(\u000e@W\u000b")), method864(method863("M<\u0003\u0002")), method864(method863("XgA@`")), method864(method863("K(\u000e@V\u000b")), method864(method863("K(\u000e@[\u000b")), method864(method863("K(\u000e@T\u000b")), method864(method863("K(\u000e@!J'\u0006\u001a#\u000b")), method864(method863("K(\u000e@U\u000b"))};
   @OriginalMember(
      owner = "client!haa",
      name = "x",
      descriptor = "[[I"
   )
   public static int[][] field1431 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   @OriginalMember(
      owner = "client!haa",
      name = "y",
      descriptor = "I"
   )
   public static int field1429;
   @OriginalMember(
      owner = "client!haa",
      name = "u",
      descriptor = "I"
   )
   public static int field1432;
   @OriginalMember(
      owner = "client!haa",
      name = "A",
      descriptor = "I"
   )
   public static int field1437;
   @OriginalMember(
      owner = "client!haa",
      name = "p",
      descriptor = "I"
   )
   public static int field1441;
   @OriginalMember(
      owner = "client!haa",
      name = "q",
      descriptor = "I"
   )
   public static int field1443;
   @OriginalMember(
      owner = "client!haa",
      name = "r",
      descriptor = "I"
   )
   public static int field1444;
   @OriginalMember(
      owner = "client!haa",
      name = "C",
      descriptor = "Ldfa;"
   )
   public static class173 field1436;
   @OriginalMember(
      owner = "client!haa",
      name = "o",
      descriptor = "Lnd;"
   )
   private class568 field1439;

   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public static void method857(byte arg0) {
      try {
         field1436 = null;
         field1431 = null;
         if (arg0 >= -49) {
            field1437 = 12;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1445[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(ILida;Lida;)V",
      line = 17
   )
   public static final void method858(int arg0, class246 arg1, class246 arg2) {
      try {
         if (arg1.field3534 != null) {
            arg1.method1995((byte)35);
         }

         ++field1429;
         if (arg0 < 89) {
            field1436 = null;
         }

         arg1.field3536 = arg2;
         arg1.field3534 = arg2.field3534;
         arg1.field3534.field3536 = arg1;
         arg1.field3536.field3534 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1445[8] + arg0 + ',' + (arg1 != null ? field1445[3] : field1445[2]) + ',' + (arg2 != null ? field1445[3] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "(B)V",
      line = 43
   )
   public static final void method859(byte arg0) {
      try {
         ++field1444;
         if (~class487.field7080 != -1) {
            try {
               if (arg0 <= 12) {
                  field1436 = null;
               }

               if (++class608.field8731 > 2000) {
                  label78: {
                     if (class361.field5404 != null) {
                        class361.field5404.method2045(907867169);
                        class361.field5404 = null;
                     }

                     if (~class518.field7548 > -3) {
                        class37.field903.method4822(43594);
                        class487.field7080 = 1;
                        ++class518.field7548;
                        class608.field8731 = 0;
                        if (!client.field4564) {
                           break label78;
                        }
                     }

                     class487.field7080 = 0;
                     class349.field4968 = -5;
                     return;
                  }
               }

               if (class487.field7080 == 1) {
                  class356.field5015 = class37.field903.method4821(class412.field6033, (byte)123);
                  class487.field7080 = 2;
               }

               if (class487.field7080 == 2) {
                  if (~class356.field5015.field11542 == -3) {
                     throw new IOException();
                  }

                  if (~class356.field5015.field11542 != -2) {
                     return;
                  }

                  class361.field5404 = class48.method592((Socket)class356.field5015.field11537, 15000, (byte)71);
                  class356.field5015 = null;
                  class349.method2694(-1);
                  class487.field7080 = 4;
               }

               if (~class487.field7080 == -5) {
                  if (class361.field5404.method2046(1, 3)) {
                     class361.field5404.method2049(1, class346.field4923.field6889, 0, (byte)116);
                     int var1 = 255 & class346.field4923.field6889[0];
                     class349.field4968 = var1;
                     class487.field7080 = 0;
                     class361.field5404.method2045(907867169);
                     class361.field5404 = null;
                  }
               }
            } catch (IOException var3) {
               if (class361.field5404 != null) {
                  class361.field5404.method2045(907867169);
                  class361.field5404 = null;
               }

               if (class518.field7548 >= 2) {
                  class487.field7080 = 0;
                  class349.field4968 = -4;
               } else {
                  class37.field903.method4822(43594);
                  ++class518.field7548;
                  class487.field7080 = 1;
                  class608.field8731 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1445[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(I)Lnd;",
      line = 143
   )
   public final class568 method860(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -8602) {
            field1436 = null;
         }

         ++field1441;
         if (this.field1439 == null) {
            class160 var3;
            boolean var4;
            int var5;
            int var9;
            label88: {
               var3 = this.field1438.field1192;
               class449.field6565[2] = this.field1430;
               class449.field6565[3] = this.field1442;
               class449.field6565[5] = this.field1440;
               class449.field6565[1] = this.field1434;
               class449.field6565[4] = this.field1435;
               class449.field6565[0] = this.field1433;
               var4 = false;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1455(class449.field6565[var6], 9777)) {
                     return null;
                  }
               } else if (var6 >= 6) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1455(class449.field6565[var6], 9777)) {
                  return null;
               }

               while(true) {
                  class693 var7 = var3.method1456(-8988, class449.field6565[var6]);
                  int var8 = !var7.field10153 ? 128 : 64;
                  if (var5 < var8) {
                     var5 = var8;
                  }

                  if (var7.field10161 > 0) {
                     var4 = true;
                  }

                  ++var6;
                  if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1455(class449.field6565[var6], 9777)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class295.field4140[var9] = var3.method1459(1.0F, false, var5, class449.field6565[var9], 115, var5);
               ++var9;
            }

            while(true) {
               while(var9 < 6) {
                  class295.field4140[var9] = var3.method1459(1.0F, false, var5, class449.field6565[var9], 115, var5);
                  ++var9;
               }

               if (!var2) {
                  this.field1439 = this.field1438.method1209(var5, arg0 + 8603, var4, class295.field4140);
                  break;
               }

               ++var9;
            }
         }

         return this.field1439;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1445[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(IIIIIII[I)Z",
      line = 203
   )
   public static final boolean method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
      boolean var8 = client.field4564;

      try {
         ++field1432;
         if (~arg6 > -1) {
            arg6 = 0;
         }

         if (class580.field8327 < arg5) {
            arg5 = class580.field8327;
         }

         if (arg6 >= arg5) {
            return true;
         } else {
            int var10000;
            label227: {
               arg0 += arg4 * arg6;
               arg2 = arg5 - arg6 >> 2;
               arg1 += arg6 + -1;
               int var11;
               int var12;
               if (~class289.field4045 == -2) {
                  label174: {
                     class771.field11305 += arg2;
                     if (var8) {
                        ++arg1;
                        if (~arg7[arg1] < ~arg0) {
                           arg7[arg1] = arg0;
                        }

                        arg0 += arg4;
                     } else {
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = 3 & -arg6 + arg5;
                           if (!var8) {
                              break label174;
                           }
                        } else {
                           ++arg1;
                           if (~arg7[arg1] < ~arg0) {
                              arg7[arg1] = arg0;
                           }

                           arg0 += arg4;
                        }
                     }

                     while(true) {
                        var12 = arg1 + 1;
                        if (arg0 < arg7[var12]) {
                           arg7[var12] = arg0;
                        }

                        var11 = arg0 + arg4;
                        ++var12;
                        if (var11 < arg7[var12]) {
                           arg7[var12] = var11;
                        }

                        var11 += arg4;
                        arg1 = var12 + 1;
                        if (arg7[arg1] > var11) {
                           arg7[arg1] = var11;
                        }

                        arg0 = var11 + arg4;
                        --arg2;
                        if (arg2 < 0) {
                           arg2 = 3 & -arg6 + arg5;
                           if (!var8) {
                              break;
                           }
                        } else {
                           ++arg1;
                           if (~arg7[arg1] < ~arg0) {
                              arg7[arg1] = arg0;
                           }

                           arg0 += arg4;
                        }
                     }
                  }

                  if (var8) {
                     ++arg1;
                     if (~arg7[arg1] < ~arg0) {
                        arg7[arg1] = arg0;
                     }

                     arg0 += arg4;
                  }

                  label144:
                  while(true) {
                     while(true) {
                        --arg2;
                        if (arg2 < 0) {
                           if (!var8) {
                              if (!var8) {
                                 if (!var8) {
                                    if (arg3 != 1) {
                                       method858(33, (class246)null, (class246)null);
                                    }

                                    return true;
                                 }

                                 if (arg3 < 1) {
                                    return false;
                                 }

                                 arg0 += arg4;
                                 break label227;
                              }
                              break label144;
                           }

                           arg0 += arg4;
                        } else {
                           ++arg1;
                           if (~arg7[arg1] < ~arg0) {
                              arg7[arg1] = arg0;
                           }

                           arg0 += arg4;
                        }
                     }
                  }
               }

               label123: {
                  arg0 -= 38400;
                  if (var8) {
                     var10000 = ~arg0;
                     ++arg1;
                     if (var10000 > ~arg7[arg1]) {
                        return false;
                     }

                     arg0 += arg4;
                  } else {
                     --arg2;
                     if (arg2 < 0) {
                        arg2 = 3 & arg5 - arg6;
                        if (!var8) {
                           break label123;
                        }
                     } else {
                        var10000 = ~arg0;
                        ++arg1;
                        if (var10000 > ~arg7[arg1]) {
                           return false;
                        }

                        arg0 += arg4;
                     }
                  }

                  while(true) {
                     var12 = arg1 + 1;
                     if (~arg7[var12] < ~arg0) {
                        return false;
                     }

                     var11 = arg0 + arg4;
                     ++var12;
                     if (~arg7[var12] < ~var11) {
                        return false;
                     }

                     var11 += arg4;
                     arg1 = var12 + 1;
                     if (~arg7[arg1] < ~var11) {
                        return false;
                     }

                     arg0 = var11 + arg4;
                     --arg2;
                     if (arg2 < 0) {
                        arg2 = 3 & arg5 - arg6;
                        if (!var8) {
                           break;
                        }
                     } else {
                        var10000 = ~arg0;
                        ++arg1;
                        if (var10000 > ~arg7[arg1]) {
                           return false;
                        }

                        arg0 += arg4;
                     }
                  }
               }

               if (var8) {
                  ++arg1;
                  if (arg0 < arg7[arg1]) {
                     return false;
                  }

                  arg0 += arg4;
               }
            }

            while(true) {
               --arg2;
               int var10001;
               if (~arg2 > -1) {
                  var10000 = arg3;
                  var10001 = 1;
                  if (!var8) {
                     if (arg3 != 1) {
                        method858(33, (class246)null, (class246)null);
                     }

                     return true;
                  }
               } else {
                  var10000 = arg0;
                  ++arg1;
                  var10001 = arg7[arg1];
               }

               if (var10000 < var10001) {
                  return false;
               }

               arg0 += arg4;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field1445[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1445[3] : field1445[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "<init>",
      descriptor = "(Lcs;IIIIII)V",
      line = 304
   )
   public class88(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field1440 = arg6;
         this.field1438 = arg0;
         this.field1434 = arg2;
         this.field1442 = arg4;
         this.field1435 = arg5;
         this.field1430 = arg3;
         this.field1433 = arg1;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1445[7] + (arg0 != null ? field1445[3] : field1445[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(III)I",
      line = 320
   )
   public static final int method862(int arg0, int arg1, int arg2) {
      try {
         ++field1443;
         if (arg2 != -127) {
            field1437 = 106;
         }

         arg1 = (arg0 & 127) * arg1 >> 7;
         if (~arg1 <= -3) {
            if (~arg1 >= -127) {
               return (65408 & arg0) - -arg1;
            }

            arg1 = 126;
            if (!client.field4564) {
               return (65408 & arg0) - -arg1;
            }
         }

         arg1 = 2;
         return (65408 & arg0) - -arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1445[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method864(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
