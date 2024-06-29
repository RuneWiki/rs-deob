import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class262 {
   @OriginalMember(
      owner = "client!kw",
      name = "l",
      descriptor = "Lne;"
   )
   private class338 field3430;
   @OriginalMember(
      owner = "client!kw",
      name = "i",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field3427;
   @OriginalMember(
      owner = "client!kw",
      name = "j",
      descriptor = "Ljava/math/BigInteger;"
   )
   private BigInteger field3424;
   @OriginalMember(
      owner = "client!kw",
      name = "b",
      descriptor = "Lfv;"
   )
   private class131 field3422;
   @OriginalMember(
      owner = "client!kw",
      name = "h",
      descriptor = "Lhk;"
   )
   private class110 field3423;
   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3433 = new String[]{method2019(method2018("iX\u0017A=")), method2019(method2018("|\u0003U\u0003")), method2019(method2018("y\u0001\u0017S)|\u001fMQh")), method2019(method2018("y\u0001\u0017,h")), method2019(method2018("y\u0001\u0017.h")), method2019(method2018("y\u0001\u0017-h")), method2019(method2018("aLU\u001d")), method2019(method2018("y\u0001\u0017*h")), method2019(method2018("y\u0001\u0017+h"))};
   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "I"
   )
   public static int field3428 = 0;
   @OriginalMember(
      owner = "client!kw",
      name = "k",
      descriptor = "I"
   )
   public static int field3420;
   @OriginalMember(
      owner = "client!kw",
      name = "c",
      descriptor = "I"
   )
   public static int field3425;
   @OriginalMember(
      owner = "client!kw",
      name = "f",
      descriptor = "I"
   )
   public static int field3426;
   @OriginalMember(
      owner = "client!kw",
      name = "m",
      descriptor = "I"
   )
   public static int field3429;
   @OriginalMember(
      owner = "client!kw",
      name = "g",
      descriptor = "I"
   )
   public static int field3432;
   @OriginalMember(
      owner = "client!kw",
      name = "e",
      descriptor = "Lwm;"
   )
   private class594 field3421;
   @OriginalMember(
      owner = "client!kw",
      name = "d",
      descriptor = "[Lwfa;"
   )
   private class210[] field3431;

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2013(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Ltt;ILtt;ZI)Lwfa;"
   )
   private final class210 method2014(class100 arg0, int arg1, class100 arg2, boolean arg3, int arg4) {
      try {
         ++field3425;
         if (this.field3421 == null) {
            throw new RuntimeException();
         } else if (~arg4 <= -1 && ~this.field3431.length < ~arg4) {
            if (this.field3431[arg4] != null) {
               return this.field3431[arg4];
            } else {
               this.field3421.field8243 = arg4 * 72 + 6;
               int var6 = this.field3421.method4302(true);
               int var7 = this.field3421.method4302(true);
               byte[] var8 = new byte[64];
               this.field3421.method4276(var8, 64, 0, arg1);
               class210 var9 = new class210(arg4, arg2, arg0, this.field3422, this.field3430, var6, var8, var7, arg3);
               this.field3431[arg4] = var9;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3433[3] + (arg0 != null ? field3433[0] : field3433[1]) + ',' + arg1 + ',' + (arg2 != null ? field3433[0] : field3433[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Ltt;Ltt;IB)Lwfa;"
   )
   public final class210 method2015(class100 arg0, class100 arg1, int arg2, byte arg3) {
      try {
         if (arg3 <= 84) {
            this.field3421 = null;
         }

         ++field3420;
         return this.method2014(arg1, 0, arg0, true, arg2);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3433[7] + (arg0 != null ? field3433[0] : field3433[1]) + ',' + (arg1 != null ? field3433[0] : field3433[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2016(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3429;
         if (this.field3421 != null) {
            return true;
         } else {
            if (this.field3423 == null) {
               if (this.field3422.method1093(16905)) {
                  return false;
               }

               this.field3423 = this.field3422.method1095(255, (byte)0, (byte)102, 255, true);
            }

            if (this.field3423.field10819) {
               return false;
            } else {
               class594 var3;
               int var4;
               byte[] var5;
               byte[] var7;
               label80: {
                  var3 = new class594(this.field3423.method969(-71));
                  var3.field8243 = 5;
                  var4 = var3.method4288((byte)109);
                  var3.field8243 += var4 * 72;
                  var5 = new byte[var3.field8227.length - var3.field8243];
                  var3.method4276(var5, var5.length, 0, 0);
                  int var6 = 5 / ((arg0 - -67) / 52);
                  if (this.field3427 == null || this.field3424 == null) {
                     var7 = var5;
                     if (!var2) {
                        break label80;
                     }
                  }

                  BigInteger var8 = new BigInteger(var5);
                  BigInteger var9 = var8.modPow(this.field3427, this.field3424);
                  var7 = var9.toByteArray();
               }

               if (var7.length != 65) {
                  throw new RuntimeException();
               } else {
                  byte[] var10 = class32.method259(-var5.length + var3.field8243 + -5, 255, 5, var3.field8227);
                  int var11 = 0;
                  if (var2) {
                     if (~var10[var11] != ~var7[var11 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var11;
                  }

                  while(true) {
                     int var10000;
                     if (var11 >= 64) {
                        this.field3421 = var3;
                        this.field3431 = new class210[var4];
                        var10000 = 1;
                        if (!var2) {
                           return true;
                        }
                     } else {
                        var10000 = ~var10[var11];
                     }

                     if (var10000 != ~var7[var11 + 1]) {
                        throw new RuntimeException();
                     }

                     ++var11;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3433[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(ILme;B)V"
   )
   public static final void method2017(int arg0, class206 arg1, byte arg2) {
      boolean var3 = client.field4273;

      try {
         ++field3426;
         boolean var4 = arg1.method1566(1, -12869) == 1;
         if (var4) {
            class484.field6676[class173.field2159++] = arg0;
         }

         int var5 = arg1.method1566(2, -12869);
         class404 var6 = class136.field1773[arg0];
         if (~var5 == -1) {
            if (var4) {
               var6.field5659 = false;
            } else if (~class602.field8397 == ~arg0) {
               throw new RuntimeException(field3433[6]);
            } else {
               class662 var7;
               label191: {
                  var7 = class56.field608[arg0] = new class662();
                  var7.field9441 = (var6.field1001 << 28) + (var6.field7853[0] + class752.field10921 >> 6 << 14) + (var6.field7855[0] + class17.field237 >> 6);
                  if (var6.field5660 == -1) {
                     var7.field9437 = var6.field7829.method2333((byte)109);
                     if (!var3) {
                        break label191;
                     }
                  }

                  var7.field9437 = var6.field5660;
               }

               var7.field9438 = var6.field5689;
               var7.field9439 = var6.field5691;
               var7.field9440 = var6.field7780;
               if (var6.field5681 > 0) {
                  class602.method4393(var6, (byte)111);
               }

               class136.field1773[arg0] = null;
               if (~arg1.method1566(1, -12869) != -1) {
                  class647.method4658((byte)126, arg1, arg0);
               }

            }
         } else if (var5 == 1) {
            int var9;
            int var10;
            label300: {
               int var8 = arg1.method1566(3, -12869);
               var9 = var6.field7853[0];
               var10 = var6.field7855[0];
               if (var8 == 0) {
                  --var9;
                  --var10;
                  if (!var3) {
                     break label300;
                  }
               }

               if (var8 != 1) {
                  if (var8 != 2) {
                     if (~var8 != -4) {
                        if (~var8 != -5) {
                           if (var8 != 5) {
                              if (~var8 != -7) {
                                 if (var8 != 7) {
                                    break label300;
                                 }

                                 ++var10;
                                 ++var9;
                                 if (!var3) {
                                    break label300;
                                 }
                              }

                              ++var10;
                              if (!var3) {
                                 break label300;
                              }
                           }

                           --var9;
                           ++var10;
                           if (!var3) {
                              break label300;
                           }
                        }

                        ++var9;
                        if (!var3) {
                           break label300;
                        }
                     }

                     --var9;
                     if (!var3) {
                        break label300;
                     }
                  }

                  --var10;
                  ++var9;
                  if (!var3) {
                     break label300;
                  }
               }

               --var10;
            }

            if (!var4) {
               var6.method3057(var10, var9, -2, class394.field5562[arg0]);
            } else {
               var6.field5659 = true;
               var6.field5685 = var9;
               var6.field5671 = var10;
            }
         } else if (var5 == 2) {
            int var12;
            int var13;
            label302: {
               int var11 = arg1.method1566(4, -12869);
               var12 = var6.field7853[0];
               var13 = var6.field7855[0];
               if (var11 == 0) {
                  var12 -= 2;
                  var13 -= 2;
                  if (!var3) {
                     break label302;
                  }
               }

               if (~var11 != -2) {
                  if (~var11 != -3) {
                     if (var11 == 3) {
                        ++var12;
                        var13 -= 2;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (var11 == 4) {
                        var13 -= 2;
                        var12 += 2;
                        if (!var3) {
                           break label302;
                        }
                     }

                     if (~var11 != -6) {
                        if (~var11 != -7) {
                           if (var11 == 7) {
                              var12 -= 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           if (var11 == 8) {
                              var12 += 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           if (~var11 != -10) {
                              if (var11 != 10) {
                                 if (~var11 != -12) {
                                    if (~var11 == -13) {
                                       var13 += 2;
                                       --var12;
                                       if (!var3) {
                                          break label302;
                                       }
                                    }

                                    if (~var11 == -14) {
                                       var13 += 2;
                                       if (!var3) {
                                          break label302;
                                       }
                                    }

                                    if (var11 != 14) {
                                       if (~var11 != -16) {
                                          break label302;
                                       }

                                       var12 += 2;
                                       var13 += 2;
                                       if (!var3) {
                                          break label302;
                                       }
                                    }

                                    var13 += 2;
                                    ++var12;
                                    if (!var3) {
                                       break label302;
                                    }
                                 }

                                 var12 -= 2;
                                 var13 += 2;
                                 if (!var3) {
                                    break label302;
                                 }
                              }

                              ++var13;
                              var12 += 2;
                              if (!var3) {
                                 break label302;
                              }
                           }

                           var12 -= 2;
                           ++var13;
                           if (!var3) {
                              break label302;
                           }
                        }

                        var12 += 2;
                        --var13;
                        if (!var3) {
                           break label302;
                        }
                     }

                     --var13;
                     var12 -= 2;
                     if (!var3) {
                        break label302;
                     }
                  }

                  var13 -= 2;
                  if (!var3) {
                     break label302;
                  }
               }

               var13 -= 2;
               --var12;
            }

            if (!var4) {
               var6.method3057(var13, var12, -2, class394.field5562[arg0]);
            } else {
               var6.field5659 = true;
               var6.field5685 = var12;
               var6.field5671 = var13;
            }
         } else {
            int var14 = arg1.method1566(1, -12869);
            if (var14 == 0) {
               int var15 = arg1.method1566(12, -12869);
               int var16 = var15 >> 10;
               int var17 = 31 & var15 >> 5;
               if (var17 > 15) {
                  var17 -= 32;
               }

               int var18 = 31 & var15;
               if (var18 > 15) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label281: {
                  var19 = var6.field7853[0] + var17;
                  var20 = var6.field7855[0] - -var18;
                  if (!var4) {
                     var6.method3057(var20, var19, -2, class394.field5562[arg0]);
                     if (!var3) {
                        break label281;
                     }
                  }

                  var6.field5685 = var19;
                  var6.field5659 = true;
                  var6.field5671 = var20;
               }

               var6.field1001 = var6.field1005 = (byte)(var6.field1001 + var16 & 3);
               if (class407.method3090(var19, 1, var20)) {
                  ++var6.field1005;
               }

               if (class602.field8397 == arg0) {
                  if (class239.field2981 != var6.field1001) {
                     class591.field8180 = true;
                  }

                  class239.field2981 = var6.field1001;
               }

            } else {
               int var21 = arg1.method1566(30, -12869);
               if (arg2 >= 49) {
                  int var22;
                  int var25;
                  int var26;
                  label289: {
                     var22 = var21 >> 28;
                     int var23 = 16383 & var21 >> 14;
                     int var24 = 16383 & var21;
                     var25 = (16383 & class752.field10921 + var23 + var6.field7853[0]) + -class752.field10921;
                     var26 = (16383 & class17.field237 + var24 + var6.field7855[0]) + -class17.field237;
                     if (!var4) {
                        var6.method3057(var26, var25, -2, class394.field5562[arg0]);
                        if (!var3) {
                           break label289;
                        }
                     }

                     var6.field5685 = var25;
                     var6.field5659 = true;
                     var6.field5671 = var26;
                  }

                  var6.field1001 = var6.field1005 = (byte)(var6.field1001 + var22 & 3);
                  if (class407.method3090(var25, 1, var26)) {
                     ++var6.field1005;
                  }

                  if (~class602.field8397 == ~arg0) {
                     class239.field2981 = var6.field1001;
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class534.method3846(var28, field3433[5] + arg0 + ',' + (arg1 != null ? field3433[0] : field3433[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "<init>",
      descriptor = "(Lfv;Lne;Ljava/math/BigInteger;Ljava/math/BigInteger;)V"
   )
   public class262(class131 arg0, class338 arg1, BigInteger arg2, BigInteger arg3) {
      try {
         this.field3430 = arg1;
         this.field3427 = arg2;
         this.field3424 = arg3;
         this.field3422 = arg0;
         if (!this.field3422.method1093(16905)) {
            this.field3423 = this.field3422.method1095(255, (byte)0, (byte)118, 255, true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3433[2] + (arg0 != null ? field3433[0] : field3433[1]) + ',' + (arg1 != null ? field3433[0] : field3433[1]) + ',' + (arg2 != null ? field3433[0] : field3433[1]) + ',' + (arg3 != null ? field3433[0] : field3433[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2018(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2019(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
