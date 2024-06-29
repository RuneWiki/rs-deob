import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class334 extends class629 {
   @OriginalMember(
      owner = "client!vc",
      name = "L",
      descriptor = "I"
   )
   private int field4776 = 1;
   @OriginalMember(
      owner = "client!vc",
      name = "G",
      descriptor = "I"
   )
   private int field4777 = 1;
   @OriginalMember(
      owner = "client!vc",
      name = "H",
      descriptor = "I"
   )
   private int field4781 = 204;
   @OriginalMember(
      owner = "client!vc",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4783 = new String[]{method2599(method2598("~=\u0007@\u0019")), method2599(method2598("sp\u0007 L")), method2599(method2598("f+Eb")), method2599(method2598("~=\u0007A\u0019")), method2599(method2598("~=\u0007K\u0019")), method2599(method2598("~=\u0007^\u0019")), method2599(method2598("~=\u0007D\u0019")), method2599(method2598("~=\u0007C\u0019"))};
   @OriginalMember(
      owner = "client!vc",
      name = "F",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field4773 = new CRC32();
   @OriginalMember(
      owner = "client!vc",
      name = "I",
      descriptor = "[Loba;"
   )
   public static class272[] field4782 = new class272[1024];
   @OriginalMember(
      owner = "client!vc",
      name = "D",
      descriptor = "I"
   )
   public static int field4772;
   @OriginalMember(
      owner = "client!vc",
      name = "M",
      descriptor = "I"
   )
   public static int field4774;
   @OriginalMember(
      owner = "client!vc",
      name = "J",
      descriptor = "I"
   )
   public static int field4775;
   @OriginalMember(
      owner = "client!vc",
      name = "K",
      descriptor = "I"
   )
   public static int field4778;
   @OriginalMember(
      owner = "client!vc",
      name = "N",
      descriptor = "I"
   )
   public static int field4779;
   @OriginalMember(
      owner = "client!vc",
      name = "E",
      descriptor = "Lhw;"
   )
   public static class141 field4780;

   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method2594(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field4779;
         class731 var2 = (class731)class344.field4908.method1397(22527);
         if (var1) {
            class207.method1765(127, var2);
            var2 = (class731)class344.field4908.method1397(22527);
         }

         while(true) {
            int var10000;
            if (var2 == null) {
               var10000 = class510.field7454.field11159.method1137(false);
               if (!var1) {
                  int var3;
                  int var4;
                  label33: {
                     if (var10000 != 1) {
                        var3 = class359.field5371;
                        var4 = class359.field5371;
                        if (!var1) {
                           break label33;
                        }
                     }

                     var4 = 0;
                     var3 = 3;
                  }

                  client.method2453();
                  int var5 = var4;
                  if (var1) {
                     client.method2465();
                     client.method2458(var4);
                     client.method2449(var4);
                     var5 = var4 + 1;
                  }

                  while(true) {
                     while(var5 <= var3) {
                        client.method2465();
                        client.method2458(var5);
                        client.method2449(var5);
                        ++var5;
                     }

                     if (!var1) {
                        if (arg0 > -113) {
                           return;
                        }

                        client.method2463();
                        client.method2448();
                        return;
                     }

                     client.method2449(arg0);
                     ++var5;
                  }
               }
            } else {
               var10000 = 127;
            }

            class207.method1765(var10000, var2);
            var2 = (class731)class344.field4908.method1397(22527);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4783[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(IILha;IILka;Lkd;IIIIIII)Lka;",
      line = 47
   )
   public static final class495 method2595(int arg0, int arg1, class65 arg2, int arg3, int arg4, class495 arg5, class295 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
      boolean var14 = client.field4564;

      try {
         ++field4778;
         if (arg5 == null) {
            return null;
         } else {
            int var15 = 2055;
            if (arg6 != null) {
               int var16 = var15 | arg6.method2304(false, (byte)-123, arg10, -1);
               var15 = var16 & -513;
            }

            long var17 = ((long)arg4 << 32) + ((long)arg1 << 48) + (long)((arg3 << 24) + (arg12 - -(arg13 << 16)));
            if (arg0 != 18) {
               return null;
            } else {
               class179 var19 = class774.field11334;
               class495 var20;
               synchronized(class774.field11334) {
                  var20 = (class495)class774.field11334.method1584(var17, arg0 ^ 19);
               }

               if (var20 == null || ~arg2.method269(var20.method510(), var15) != -1) {
                  if (var20 != null) {
                     var15 = arg2.method354(var15, var20.method510());
                  }

                  byte var21;
                  if (~arg12 != -2) {
                     if (~arg12 != -3) {
                        if (~arg12 == -4) {
                           var21 = 15;
                        } else if (~arg12 == -5) {
                           var21 = 18;
                        } else {
                           var21 = 21;
                        }
                     } else {
                        var21 = 12;
                     }
                  } else {
                     var21 = 9;
                  }

                  byte var22;
                  class668 var24;
                  int var25;
                  int[][] var26;
                  int var28;
                  label192: {
                     var22 = 3;
                     int[] var23 = new int[]{64, 96, 128};
                     var24 = new class668(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                     var25 = var24.method4874(0, (byte)-118, 0, 0);
                     var26 = new int[var22][var21];
                     int var27 = 0;
                     if (var14) {
                        var28 = var23[var27];
                     } else if (~var27 <= ~var22) {
                        var28 = 0;
                        if (!var14) {
                           break label192;
                        }
                     } else {
                        var28 = var23[var27];
                     }

                     while(true) {
                        int var29 = var23[var27];
                        int var30 = 0;
                        if (var14 || ~var21 < ~var30) {
                           do {
                              int var31 = (var30 << 14) / var21;
                              int var32 = class593.field8539[var31] * var28 >> 14;
                              int var33 = class593.field8548[var31] * var29 >> 14;
                              var26[var27][var30] = var24.method4874(var32, (byte)-118, var33, 0);
                              ++var30;
                           } while(~var21 < ~var30);
                        }

                        ++var27;
                        if (~var27 <= ~var22) {
                           var28 = 0;
                           if (!var14) {
                              break;
                           }
                        } else {
                           var28 = var23[var27];
                        }
                     }
                  }

                  if (var14 || var28 < var22) {
                     do {
                        int var34 = (var28 * 256 + 128) / var22;
                        int var35 = -var34 + 256;
                        byte var36 = (byte)(arg3 * var34 + arg13 * var35 >> 8);
                        short var37 = (short)(((arg1 & 127) * var34 + (arg4 & 127) * var35 & 32512) + ((64512 & arg1) * var34 + (64512 & arg4) * var35 & 16515072) + ((arg1 & 896) * var34 + (arg4 & 896) * var35 & 229376) >> 8);
                        int var38 = 0;
                        if (var14) {
                           if (var28 != 0) {
                              var24.method4880(var26[var28][(var38 + 1) % var21], var26[var28 + -1][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var26[var28 - 1][var38]);
                              var24.method4880(var26[var28][var38], var26[var28][(var38 + 1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var26[var28 + -1][var38]);
                              if (var14) {
                                 var24.method4880(var26[0][var38], var26[0][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var25);
                                 ++var38;
                              } else {
                                 ++var38;
                              }
                           } else {
                              var24.method4880(var26[0][var38], var26[0][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var25);
                              ++var38;
                           }
                        }

                        while(true) {
                           while(~var38 > ~var21) {
                              if (var28 != 0) {
                                 var24.method4880(var26[var28][(var38 + 1) % var21], var26[var28 + -1][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var26[var28 - 1][var38]);
                                 var24.method4880(var26[var28][var38], var26[var28][(var38 + 1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var26[var28 + -1][var38]);
                                 if (var14) {
                                    var24.method4880(var26[0][var38], var26[0][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var25);
                                    ++var38;
                                 } else {
                                    ++var38;
                                 }
                              } else {
                                 var24.method4880(var26[0][var38], var26[0][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var25);
                                 ++var38;
                              }
                           }

                           if (!var14) {
                              ++var28;
                              break;
                           }

                           var24.method4880(var26[0][var38], var26[0][(var38 - -1) % var21], var37, (byte)-1, (short)-1, (byte)1, 1508, var36, var25);
                           ++var38;
                        }
                     } while(var28 < var22);
                  }

                  var20 = arg2.method352(var24, var15, class320.field4615, 64, 768);
                  class179 var39 = class774.field11334;
                  synchronized(class774.field11334) {
                     class774.field11334.method1581(var17, 0, var20);
                  }
               }

               int var40 = arg5.method528();
               int var41 = arg5.method531();
               int var42 = arg5.method517();
               int var43 = arg5.method546();
               class513 var44 = null;
               if (arg6 != null) {
                  int var49 = arg6.field4136[arg10];
                  var44 = class588.field8496.method3776(var49 >> 16, 18);
                  arg10 = var49 & 65535;
               }

               label108: {
                  if (var44 != null) {
                     var20 = var20.method549((byte)3, var15, true);
                     var20.method512(-var40 + var41 >> 1, 128, var43 - var42 >> 1);
                     var20.method514(var40 - -var41 >> 1, 0, var42 - -var43 >> 1);
                     var20.method3739(arg0 + 101, arg10, var44);
                     if (!var14) {
                        break label108;
                     }
                  }

                  var20 = var20.method549((byte)3, var15, true);
                  var20.method512(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                  var20.method514(var40 - -var41 >> 1, 0, var42 + var43 >> 1);
               }

               if (arg8 != 0) {
                  var20.method524(arg8);
               }

               if (~arg11 != -1) {
                  var20.method538(arg11);
               }

               if (~arg9 != -1) {
                  var20.method514(0, arg9, 0);
               }

               return var20;
            }
         }
      } catch (RuntimeException var48) {
         throw class608.method4462(var48, field4783[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4783[1] : field4783[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4783[1] : field4783[2]) + ',' + (arg6 != null ? field4783[1] : field4783[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "(II)[I",
      line = 217
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field4775;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int var5 = 0;
            if (var3 || ~class66.field1214 < ~var5) {
               do {
                  int var6 = class429.field6201[var5];
                  int var7 = class442.field6448[arg0];
                  int var8 = this.field4776 * var6 >> 12;
                  int var9 = this.field4777 * var7 >> 12;
                  int var10 = var6 % (4096 / this.field4776) * this.field4776;
                  int var11 = var7 % (4096 / this.field4777) * this.field4777;
                  if (var11 < this.field4781) {
                     var8 -= var9;
                     if (var3) {
                        var8 += 4;
                     }

                     while(var8 < 0) {
                        var8 += 4;
                     }

                     if (var3) {
                        var8 -= 4;
                     }

                     while(~var8 < -4) {
                        var8 -= 4;
                     }

                     if (var8 != 1) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }

                     if (var10 < this.field4781) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }
                  }

                  if (this.field4781 <= var10) {
                     var4[var5] = 4096;
                     ++var5;
                  } else {
                     int var12 = var8 - var9;
                     if (var3) {
                        var12 += 4;
                     }

                     while(~var12 > -1) {
                        var12 += 4;
                     }

                     if (var3) {
                        var12 -= 4;
                     }

                     while(var12 > 3) {
                        var12 -= 4;
                     }

                     if (~var12 < -1) {
                        var4[var5] = 0;
                        if (var3) {
                           var4[var5] = 4096;
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        var4[var5] = 4096;
                        ++var5;
                     }
                  }
               } while(~class66.field1214 < ~var5);
            }
         }

         if (arg1 != 2048) {
            this.field4781 = 48;
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field4783[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 302
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label46: {
            label45: {
               label44: {
                  ++field4772;
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label44;
                     }

                     if (~arg2 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field4776 = arg0.method3564((byte)-97);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field4777 = arg0.method3564((byte)-102);
               if (!var4) {
                  break label46;
               }
            }

            this.field4781 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            method2595(-52, 32, (class65)null, 125, 71, (class495)null, (class295)null, -6, 48, 56, 7, -40, 58, 26);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4783[4] + (arg0 != null ? field4783[1] : field4783[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "<init>",
      descriptor = "()V",
      line = 390
   )
   public class334() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!vc",
      name = "g",
      descriptor = "(I)V",
      line = 353
   )
   public static void method2596(int arg0) {
      try {
         field4780 = null;
         field4773 = null;
         if (arg0 != -1061802271) {
            method2594((byte)3);
         }

         field4782 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4783[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "(II)I",
      line = 374
   )
   public static final int method2597(int arg0, int arg1) {
      try {
         ++field4774;
         if (arg1 != 255) {
            method2594((byte)-12);
         }

         return arg0 & 255;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4783[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2598(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2599(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
