import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class88 extends class624 {
   @OriginalMember(
      owner = "client!rda",
      name = "w",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field1277;
   @OriginalMember(
      owner = "client!rda",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1280 = new String[]{method851(method850("~P5\rb$")), method851(method850("~P5\re$")), method851(method850("~P5\r`$")), method851(method850("w\u001az\rY")), method851(method850("bA8O")), method851(method850("~P5\rf$")), method851(method850("~P5\r\u0018eZ=W\u001a$")), method851(method850("~P5\ra$"))};
   @OriginalMember(
      owner = "client!rda",
      name = "v",
      descriptor = "I"
   )
   public static int field1273;
   @OriginalMember(
      owner = "client!rda",
      name = "u",
      descriptor = "I"
   )
   public static int field1275;
   @OriginalMember(
      owner = "client!rda",
      name = "y",
      descriptor = "I"
   )
   public static int field1278;
   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "I"
   )
   public static int field1279;
   @OriginalMember(
      owner = "client!rda",
      name = "x",
      descriptor = "Loja;"
   )
   public static class238 field1274;
   @OriginalMember(
      owner = "client!rda",
      name = "t",
      descriptor = "[Lhja;"
   )
   public static class330[] field1276;

   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "(B)V",
      line = 9
   )
   public static void method844(byte arg0) {
      try {
         field1276 = null;
         if (arg0 <= 53) {
            field1274 = null;
         }

         field1274 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1280[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "(II)I",
      line = 20
   )
   public static final int method845(int arg0, int arg1) {
      try {
         ++field1275;
         int var2 = 63 & arg0;
         if (arg1 != 1) {
            return -101;
         } else {
            int var3 = (arg0 & 226) >> 6;
            if (~var2 != -19) {
               if (~var2 == -20 || ~var2 == -22) {
                  if (~var3 == -1) {
                     return 16;
                  }

                  if (~var3 == -2) {
                     return 32;
                  }

                  if (~var3 == -3) {
                     return 64;
                  }

                  if (~var3 == -4) {
                     return 128;
                  }
               }
            } else {
               if (~var3 == -1) {
                  return 1;
               }

               if (var3 == 1) {
                  return 2;
               }

               if (~var3 == -3) {
                  return 4;
               }

               if (~var3 == -4) {
                  return 8;
               }
            }

            return 0;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1280[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(Luaa;Luaa;IIIIIIII)V",
      line = 73
   )
   public static final void method846(class119 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field1273;
         int var10 = arg1.method51(arg3 + 17);
         if (~var10 != 0) {
            Object var11 = null;
            class672 var12 = (class672)class384.field6050.method2544(false, (long)var10);
            if (var12 == null) {
               class776[] var13 = class776.method5647(class316.field4879, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class351.field5356.method606(var13[0], true);
               class384.field6050.method2545((long)var10, 127, var12);
            }

            class724.method5348(arg0.field1505, arg0.field1494, (byte)-102, arg6 >> 1, 0, arg8, arg4 >> 1, arg0.field1506, arg9, 256 * arg0.method61((byte)70));
            int var14 = class532.field8077[0] + arg5 + -18;
            int var15 = arg7 / 4 * 18 + var14;
            int var16 = class532.field8077[1] + -16 + arg2 + -54;
            int var17 = arg7 % 4 * 18 + var16;
            var12.method4959(var15, var17);
            if (arg0 == arg1) {
               class351.field5356.method4500(arg3 + 19, 18, var15 - 1, var17 - 1, 18, -256);
            }

            class171.method1580(var15 - arg3, var17 + 18, arg3 + -48, var17 + -1, var15 - 1);
            class626 var18 = class700.method5157((byte)114);
            var18.field9078 = var17 + 16;
            var18.field9074 = var15 + 16;
            var18.field9071 = var15;
            var18.field9076 = var17;
            var18.field9072 = arg1;
            class481.field7315.method1813(var18, 0);
         }
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field1280[2] + (arg0 != null ? field1280[3] : field1280[4]) + ',' + (arg1 != null ? field1280[3] : field1280[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(Lda;)V",
      line = 124
   )
   public static final void method847(class288 arg0) {
      class451.field6894 = arg0;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(B)V",
      line = 127
   )
   public final void method848(byte arg0) {
      try {
         this.field1277.method5237();
         ++field1278;
         int var2 = 11 % ((arg0 - 83) / 36);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1280[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "<init>",
      descriptor = "(I)V",
      line = 136
   )
   public class88(int arg0) {
      try {
         this.field1277 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1280[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(IIIIIIILqu;Lka;IILha;I)Lka;",
      line = 144
   )
   public static final class91 method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class366 arg7, class91 arg8, int arg9, int arg10, class610 arg11, int arg12) {
      boolean var13 = client.field1786;

      try {
         ++field1279;
         if (arg8 == null) {
            return null;
         } else {
            int var14 = 2055;
            if (arg7 != null) {
               int var15 = var14 | arg7.method2985(79);
               var14 = var15 & -513;
            }

            long var16 = ((long)arg5 << 48) + (long)((arg0 << 24) + (arg2 - -(arg6 << 16))) - -((long)arg4 << 32);
            class304 var18 = class594.field8740;
            class91 var19;
            synchronized(class594.field8740) {
               var19 = (class91)class594.field8740.method2544(false, var16);
               if (arg3 >= -102) {
                  method844((byte)108);
               }
            }

            if (var19 == null || ~arg11.method690(var19.method906(), var14) != -1) {
               if (var19 != null) {
                  var14 = arg11.method584(var14, var19.method906());
               }

               byte var20;
               if (~arg2 != -2) {
                  if (arg2 != 2) {
                     if (~arg2 != -4) {
                        if (~arg2 != -5) {
                           var20 = 21;
                        } else {
                           var20 = 18;
                        }
                     } else {
                        var20 = 15;
                     }
                  } else {
                     var20 = 12;
                  }
               } else {
                  var20 = 9;
               }

               byte var21;
               class159 var23;
               int var24;
               int[][] var25;
               int var27;
               label198: {
                  var21 = 3;
                  int[] var22 = new int[]{64, 96, 128};
                  var23 = new class159(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
                  var24 = var23.method1436(0, 0, false, 0);
                  var25 = new int[var21][var20];
                  int var26 = 0;
                  if (var13) {
                     var27 = var22[var26];
                  } else if (~var21 >= ~var26) {
                     var27 = 0;
                     if (!var13) {
                        break label198;
                     }
                  } else {
                     var27 = var22[var26];
                  }

                  while(true) {
                     int var28 = var22[var26];
                     int var29 = 0;
                     if (var13 || var29 < var20) {
                        do {
                           int var30 = (var29 << 14) / var20;
                           int var31 = class83.field1196[var30] * var27 >> 14;
                           int var32 = class83.field1194[var30] * var28 >> 14;
                           var25[var26][var29] = var23.method1436(0, var31, false, var32);
                           ++var29;
                        } while(var29 < var20);
                     }

                     ++var26;
                     if (~var21 >= ~var26) {
                        var27 = 0;
                        if (!var13) {
                           break;
                        }
                     } else {
                        var27 = var22[var26];
                     }
                  }
               }

               if (var13 || ~var21 < ~var27) {
                  do {
                     int var33 = (var27 * 256 + 128) / var21;
                     int var34 = 256 - var33;
                     byte var35 = (byte)(arg0 * var33 + arg6 * var34 >> 8);
                     short var36 = (short)((32512 & (arg4 & 127) * var34 + (arg5 & 127) * var33) + (16515072 & (arg4 & 64512) * var34 + (arg5 & 64512) * var33) + (229376 & (arg4 & 896) * var34 + (arg5 & 896) * var33) >> 8);
                     int var37 = 0;
                     if (var13) {
                        if (var27 == 0) {
                           var23.method1427((byte)-1, var24, var35, (byte)-77, (short)-1, (byte)1, var25[0][var37], var25[0][(var37 + 1) % var20], var36);
                           if (var13) {
                              var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)127, (short)-1, (byte)1, var25[var27][(var37 + 1) % var20], var25[var27 + -1][(var37 + 1) % var20], var36);
                              var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)123, (short)-1, (byte)1, var25[var27][var37], var25[var27][(var37 + 1) % var20], var36);
                              ++var37;
                           } else {
                              ++var37;
                           }
                        } else {
                           var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)127, (short)-1, (byte)1, var25[var27][(var37 + 1) % var20], var25[var27 + -1][(var37 + 1) % var20], var36);
                           var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)123, (short)-1, (byte)1, var25[var27][var37], var25[var27][(var37 + 1) % var20], var36);
                           ++var37;
                        }
                     }

                     while(true) {
                        while(var20 > var37) {
                           if (var27 == 0) {
                              var23.method1427((byte)-1, var24, var35, (byte)-77, (short)-1, (byte)1, var25[0][var37], var25[0][(var37 + 1) % var20], var36);
                              if (var13) {
                                 var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)127, (short)-1, (byte)1, var25[var27][(var37 + 1) % var20], var25[var27 + -1][(var37 + 1) % var20], var36);
                                 var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)123, (short)-1, (byte)1, var25[var27][var37], var25[var27][(var37 + 1) % var20], var36);
                                 ++var37;
                              } else {
                                 ++var37;
                              }
                           } else {
                              var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)127, (short)-1, (byte)1, var25[var27][(var37 + 1) % var20], var25[var27 + -1][(var37 + 1) % var20], var36);
                              var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)123, (short)-1, (byte)1, var25[var27][var37], var25[var27][(var37 + 1) % var20], var36);
                              ++var37;
                           }
                        }

                        if (!var13) {
                           ++var27;
                           break;
                        }

                        var23.method1427((byte)-1, var25[var27 + -1][var37], var35, (byte)123, (short)-1, (byte)1, var25[var27][var37], var25[var27][(var37 + 1) % var20], var36);
                        ++var37;
                     }
                  } while(~var21 < ~var27);
               }

               var19 = arg11.method614(var23, var14, class83.field1199, 64, 768);
               class304 var38 = class594.field8740;
               synchronized(class594.field8740) {
                  class594.field8740.method2545(var16, 118, var19);
               }
            }

            label105: {
               int var39 = arg8.method902();
               int var40 = arg8.method876();
               int var41 = arg8.method918();
               int var42 = arg8.method866();
               if (arg7 == null) {
                  var19 = var19.method868((byte)3, var14, true);
                  var19.method872(-var39 + var40 >> 1, 128, -var41 + var42 >> 1);
                  var19.method867(var39 + var40 >> 1, 0, var41 + var42 >> 1);
                  if (!var13) {
                     break label105;
                  }
               }

               var19 = var19.method868((byte)3, var14, true);
               var19.method872(-var39 + var40 >> 1, 128, -var41 + var42 >> 1);
               var19.method867(var39 + var40 >> 1, 0, var41 - -var42 >> 1);
               arg7.method2997(var19, 4);
            }

            if (arg1 != 0) {
               var19.method878(arg1);
            }

            if (~arg10 != -1) {
               var19.method874(arg10);
            }

            if (arg9 != 0) {
               var19.method867(0, arg9, 0);
            }

            return var19;
         }
      } catch (RuntimeException var46) {
         throw class482.method3757(var46, field1280[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1280[3] : field1280[4]) + ',' + (arg8 != null ? field1280[3] : field1280[4]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field1280[3] : field1280[4]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
