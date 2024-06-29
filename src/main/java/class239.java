import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class239 implements Runnable {
   @OriginalMember(
      owner = "client!ui",
      name = "p",
      descriptor = "I"
   )
   private int field3034 = 0;
   @OriginalMember(
      owner = "client!ui",
      name = "n",
      descriptor = "I"
   )
   private int field3042 = 0;
   @OriginalMember(
      owner = "client!ui",
      name = "g",
      descriptor = "I"
   )
   private int field3033;
   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field3032;
   @OriginalMember(
      owner = "client!ui",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field3043;
   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field3039;
   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3046 = new String[]{method1787(method1786("\u001a>bR\u0016\u0001\u007f")), method1787(method1786("\u001a>bcK")), method1787(method1786("\u0001\" L")), method1787(method1786("\u0014yb\u000e\u001e")), method1787(method1786("\u001a>b\u001c\n\u0001>8\u001eK")), method1787(method1786("\u001a>bfK")), method1787(method1786("\u001a>beK")), method1787(method1786("\u001a>bbK")), method1787(method1786("\u001a>bdK")), method1787(method1786("\u001a>baK"))};
   @OriginalMember(
      owner = "client!ui",
      name = "m",
      descriptor = "I"
   )
   public static int field3041 = 1;
   @OriginalMember(
      owner = "client!ui",
      name = "q",
      descriptor = "Lsd;"
   )
   public static class101 field3045 = null;
   @OriginalMember(
      owner = "client!ui",
      name = "e",
      descriptor = "I"
   )
   public static int field3031;
   @OriginalMember(
      owner = "client!ui",
      name = "j",
      descriptor = "I"
   )
   public static int field3035;
   @OriginalMember(
      owner = "client!ui",
      name = "k",
      descriptor = "I"
   )
   public static int field3036;
   @OriginalMember(
      owner = "client!ui",
      name = "i",
      descriptor = "I"
   )
   public static int field3037;
   @OriginalMember(
      owner = "client!ui",
      name = "l",
      descriptor = "I"
   )
   public static int field3038;
   @OriginalMember(
      owner = "client!ui",
      name = "b",
      descriptor = "I"
   )
   public static int field3040;
   @OriginalMember(
      owner = "client!ui",
      name = "d",
      descriptor = "I"
   )
   public static int field3044;
   @OriginalMember(
      owner = "client!ui",
      name = "f",
      descriptor = "Leaa;"
   )
   public static class526 field3030;
   @OriginalMember(
      owner = "client!ui",
      name = "h",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field3029;

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(Z)V",
      line = 6
   )
   public final void method1780(boolean arg0) {
      try {
         this.field3032 = new class271();
         ++field3035;
         if (!arg0) {
            this.method1782(-45);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3046[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "run",
      descriptor = "()V",
      line = 25
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         ++field3038;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label63: {
                     if (this.field3029 != null) {
                        if (var1 == 0) {
                           return;
                        }
                     } else if (~this.field3042 >= ~this.field3034) {
                        var3 = this.field3034 - this.field3042;
                        if (var1 == 0) {
                           break label63;
                        }
                     }

                     var3 = this.field3033 - this.field3042 + this.field3034;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.field3032.flush();
                  } catch (IOException var19) {
                     this.field3029 = var19;
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var20) {
                     if (var1 != 0) {
                        break;
                     }
                  }
               }
            }

            try {
               if (~this.field3033 > ~(this.field3042 + var3)) {
                  int var5 = -this.field3042 + this.field3033;
                  this.field3032.write(this.field3043, this.field3042, var5);
                  this.field3032.write(this.field3043, 0, -var5 + var3);
               } else {
                  this.field3032.write(this.field3043, this.field3042, var3);
               }
            } catch (IOException var18) {
               IOException var6 = var18;
               synchronized(this) {
                  this.field3029 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field3042 = (this.field3042 + var3) % this.field3033;
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field3046[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V",
      line = 548
   )
   public class239(OutputStream arg0, int arg1) {
      try {
         this.field3033 = arg1 + 1;
         this.field3032 = arg0;
         this.field3043 = new byte[this.field3033];
         this.field3039 = new Thread(this);
         this.field3039.setDaemon(true);
         this.field3039.start();
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3046[4] + (arg0 != null ? field3046[3] : field3046[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(IIIIBIIILega;II)Z",
      line = 98
   )
   public static final boolean method1781(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, class739 arg8, int arg9, int arg10) {
      int var11 = client.field4530;

      try {
         ++field3031;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg2;
         class213.field2700[var14][var15] = 99;
         int var17 = arg3 - var15;
         class130.field1621[var14][var15] = 0;
         byte var18 = 0;
         class473.field7063[var18] = arg2;
         int var19 = 0;
         byte var10001 = var18;
         int var28 = var18 + 1;
         class427.field6526[var10001] = arg3;
         int[][] var20 = arg8.field10979;
         if (var11 == 0 && ~var28 == ~var19) {
            class751.field11116 = arg3;
            if (arg4 != -59) {
               return false;
            } else {
               class260.field3535 = arg2;
               return false;
            }
         } else {
            int var12;
            int var13;
            label236:
            do {
               var13 = class427.field6526[var19];
               var12 = class473.field7063[var19];
               int var21 = -var17 + var13;
               int var22 = var12 - var16;
               var19 = var19 + 1 & 4095;
               int var23 = -arg8.field10981 + var12;
               int var24 = -arg8.field10962 + var13;
               int var25 = arg10;
               int var10000 = ~arg10;
               byte var29 = 3;

               do {
                  if (var10000 != var29) {
                     if (var25 != -3) {
                        if (var25 != -2) {
                           if (var25 != -1) {
                              label223: {
                                 if (var25 != 0 && var25 != 1 && ~var25 != -3 && ~var25 != -4) {
                                    if (~var25 != -10) {
                                       if (arg8.method5378(var12, 2, arg5, arg6, var13, arg4 + 58, arg10, arg9)) {
                                          class751.field11116 = var13;
                                          class260.field3535 = var12;
                                          return true;
                                       }
                                       break label223;
                                    }

                                    if (var11 != 0) {
                                       if (~arg9 == ~var12 && ~arg6 == ~var13) {
                                          class260.field3535 = var12;
                                          class751.field11116 = var13;
                                          return true;
                                       }
                                       break label223;
                                    }
                                 }

                                 if (arg8.method5391(arg5, arg9, 2, var13, arg6, arg10, 2, var12)) {
                                    class260.field3535 = var12;
                                    class751.field11116 = var13;
                                    return true;
                                 }
                              }
                           } else if (arg8.method5393(arg6, var13, arg0, arg1, arg7, var12, 2, arg9, arg4 ^ 5266)) {
                              class260.field3535 = var12;
                              class751.field11116 = var13;
                              return true;
                           }
                        } else if (arg8.method5386(2, arg7, arg0, 2, arg6, var13, (byte)101, var12, arg9, arg1)) {
                           class751.field11116 = var13;
                           class260.field3535 = var12;
                           return true;
                        }
                     } else if (class568.method4207((byte)-4, arg6, 2, arg9, var12, arg1, 2, arg7, var13)) {
                        class751.field11116 = var13;
                        class260.field3535 = var12;
                        return true;
                     }
                  } else if (~arg9 == ~var12 && ~arg6 == ~var13) {
                     class260.field3535 = var12;
                     class751.field11116 = var13;
                     return true;
                  }

                  var25 = class130.field1621[var22][var21] - -1;
                  if (var22 > 0 && ~class213.field2700[var22 + -1][var21] == -1 && (1134821376 & var20[var23 + -1][var24]) == 0 && (var20[var23 - 1][var24 + 1] & 1310982144) == 0) {
                     class473.field7063[var28] = var12 + -1;
                     class427.field6526[var28] = var13;
                     class213.field2700[var22 + -1][var21] = 2;
                     var28 = 4095 & var28 + 1;
                     class130.field1621[var22 + -1][var21] = var25;
                  }

                  if (var22 < 126 && ~class213.field2700[var22 - -1][var21] == -1 && ~(var20[var23 - -2][var24] & 1625554944) == -1 && (var20[var23 + 2][var24 + 1] & 2015625216) == 0) {
                     class473.field7063[var28] = var12 + 1;
                     class427.field6526[var28] = var13;
                     var28 = 4095 & var28 + 1;
                     class213.field2700[var22 + 1][var21] = 8;
                     class130.field1621[var22 + 1][var21] = var25;
                  }

                  if (var21 > 0 && class213.field2700[var22][var21 - 1] == 0 && ~(var20[var23][var24 - 1] & 1134821376) == -1 && (var20[var23 + 1][var24 - 1] & 1625554944) == 0) {
                     class473.field7063[var28] = var12;
                     class427.field6526[var28] = var13 - 1;
                     var28 = var28 + 1 & 4095;
                     class213.field2700[var22][var21 + -1] = 1;
                     class130.field1621[var22][var21 + -1] = var25;
                  }

                  if (var21 < 126 && ~class213.field2700[var22][var21 - -1] == -1 && (1310982144 & var20[var23][var24 + 2]) == 0 && (var20[var23 - -1][var24 + 2] & 2015625216) == 0) {
                     class473.field7063[var28] = var12;
                     class427.field6526[var28] = var13 + 1;
                     class213.field2700[var22][var21 + 1] = 4;
                     var28 = 4095 & var28 + 1;
                     class130.field1621[var22][var21 - -1] = var25;
                  }

                  if (var22 > 0 && ~var21 < -1 && ~class213.field2700[var22 - 1][var21 - 1] == -1 && (1336147968 & var20[var23 - 1][var24]) == 0 && (var20[var23 - 1][var24 + -1] & 1134821376) == 0 && ~(1675886592 & var20[var23][var24 - 1]) == -1) {
                     class473.field7063[var28] = var12 + -1;
                     class427.field6526[var28] = var13 + -1;
                     var28 = var28 + 1 & 4095;
                     class213.field2700[var22 + -1][var21 - 1] = 3;
                     class130.field1621[var22 + -1][var21 + -1] = var25;
                  }

                  if (var22 < 126 && ~var21 < -1 && class213.field2700[var22 + 1][var21 - 1] == 0 && ~(var20[var23 + 1][var24 + -1] & 1675886592) == -1 && (var20[var23 - -2][var24 - 1] & 1625554944) == 0 && (var20[var23 + 2][var24] & 2028208128) == 0) {
                     class473.field7063[var28] = var12 + 1;
                     class427.field6526[var28] = var13 - 1;
                     class213.field2700[var22 + 1][var21 - 1] = 9;
                     var28 = var28 - -1 & 4095;
                     class130.field1621[var22 + 1][var21 - 1] = var25;
                  }

                  if (~var22 < -1 && var21 < 126 && class213.field2700[var22 + -1][var21 + 1] == 0 && (1336147968 & var20[var23 + -1][var24 + 1]) == 0 && ~(1310982144 & var20[var23 - 1][var24 + 2]) == -1 && (2116288512 & var20[var23][var24 + 2]) == 0) {
                     class473.field7063[var28] = var12 + -1;
                     class427.field6526[var28] = var13 + 1;
                     class213.field2700[var22 + -1][var21 + 1] = 6;
                     var28 = var28 + 1 & 4095;
                     class130.field1621[var22 + -1][var21 + 1] = var25;
                  }

                  if (~var22 <= -127) {
                     continue label236;
                  }

                  var10000 = ~var21;
                  var29 = -127;
               } while(var11 != 0);

               if (var10000 > -127 && ~class213.field2700[var22 + 1][var21 + 1] == -1 && (2116288512 & var20[var23 + 1][var24 + 2]) == 0 && (var20[var23 + 2][var24 - -2] & 2015625216) == 0 && (2028208128 & var20[var23 + 2][var24 + 1]) == 0) {
                  class473.field7063[var28] = var12 - -1;
                  class427.field6526[var28] = var13 + 1;
                  class213.field2700[var22 + 1][var21 + 1] = 12;
                  var28 = 4095 & var28 + 1;
                  class130.field1621[var22 - -1][var21 + 1] = var25;
               }
            } while(~var28 != ~var19);

            class751.field11116 = var13;
            if (arg4 != -59) {
               return false;
            } else {
               class260.field3535 = var12;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field3046[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field3046[3] : field3046[2]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(I)V",
      line = 451
   )
   public final void method1782(int arg0) {
      try {
         int var2 = 39 % ((37 - arg0) / 53);
         ++field3044;
         synchronized(this) {
            if (this.field3029 == null) {
               this.field3029 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field3039.join();
         } catch (InterruptedException var5) {
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3046[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "b",
      descriptor = "(I)V",
      line = 470
   )
   public static void method1783(int arg0) {
      try {
         field3045 = null;
         if (arg0 == -28831) {
            field3030 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3046[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "(I)V",
      line = 487
   )
   public static final void method1784(int arg0) {
      try {
         if (arg0 == 1) {
            class445.field6769 = true;
            ++field3037;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3046[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(II[BI)V",
      line = 500
   )
   public final void method1785(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field3040;
         if (~arg0 <= -1 && arg3 >= 0 && ~arg2.length <= ~(arg0 + arg3)) {
            synchronized(this) {
               if (this.field3029 != null) {
                  throw new IOException(this.field3029.toString());
               } else {
                  int var7;
                  label50: {
                     if (this.field3034 < this.field3042) {
                        var7 = -this.field3034 + -1 + this.field3042;
                        if (var5 == 0) {
                           break label50;
                        }
                     }

                     var7 = -this.field3034 + this.field3033 + this.field3042 - 1;
                  }

                  if (arg0 > var7) {
                     throw new IOException("");
                  } else {
                     if (arg1 != 0) {
                        method1781(74, 102, -121, -100, (byte)-10, 36, 34, 113, (class739)null, -94, 59);
                     }

                     label42: {
                        if (this.field3033 < this.field3034 + arg0) {
                           int var8 = this.field3033 - this.field3034;
                           class195.method1492(arg2, arg3, this.field3043, this.field3034, var8);
                           class195.method1492(arg2, arg3 + var8, this.field3043, 0, arg0 - var8);
                           if (var5 == 0) {
                              break label42;
                           }
                        }

                        class195.method1492(arg2, arg3, this.field3043, this.field3034, arg0);
                     }

                     this.field3034 = (this.field3034 - -arg0) % this.field3033;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3046[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3046[3] : field3046[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1786(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1787(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
