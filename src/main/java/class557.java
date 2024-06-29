import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class557 {
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7993 = new String[]{method4000(method3999(",:gH!")), method4000(method3999(",:gJ!")), method4000(method3999("?xg't")), method4000(method3999("*#%e")), method4000(method3999(",:gK!"))};
   @OriginalMember(
      owner = "client!hl",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field7988 = new int[5];
   @OriginalMember(
      owner = "client!hl",
      name = "e",
      descriptor = "I"
   )
   public static int field7989;
   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "I"
   )
   public static int field7991;
   @OriginalMember(
      owner = "client!hl",
      name = "b",
      descriptor = "I"
   )
   public static int field7992;
   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field7990;

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(Lbl;Laa;ILha;IIIIB)V"
   )
   public static final void method3996(class678 arg0, class515 arg1, int arg2, class66 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
      boolean var9 = client.field4360;

      try {
         if (arg8 != 120) {
            field7988 = null;
         }

         ++field7989;
         class326 var10 = class61.field747.method5666(arg4, false);
         if (var10 != null && var10.field4451 && var10.method2418((byte)64, class21.field248)) {
            if (var10.field4428 != null) {
               int[] var11 = new int[var10.field4428.length];
               int var12 = 0;
               int var13;
               int var14;
               int var15;
               if (var9) {
                  if (~class380.field5481 == -5) {
                     var13 = (int)class117.field1467 & 16383;
                     if (var9) {
                        var13 = 16383 & (int)class117.field1467 - -class237.field3298;
                     }
                  } else {
                     var13 = 16383 & (int)class117.field1467 - -class237.field3298;
                  }

                  var14 = class363.field4956[var13];
                  var15 = class363.field4987[var13];
                  if (~class380.field5481 != -5) {
                     var14 = var14 * 256 / (class642.field9387 + 256);
                     var15 = var15 * 256 / (class642.field9387 - -256);
                  }

                  var11[var12 * 2] = arg5 - (-((var10.field4428[var12 * 2] * 4 + arg7) * var15 + (var10.field4428[var12 * 2 + 1] * 4 + arg2) * var14 >> 14) + -(arg0.field9904 / 2));
                  var11[var12 * 2 + 1] = arg0.field9980 / 2 + arg6 - ((var10.field4428[var12 * 2 + 1] * 4 + arg2) * var15 + -((var10.field4428[var12 * 2] * 4 + arg7) * var14) >> 14);
                  ++var12;
               }

               label198:
               while(true) {
                  int var10000;
                  byte var10001;
                  if (~(var11.length / 2) >= ~var12) {
                     class359.method2689(arg3, var11, var10.field4449, arg0.field9825, arg0.field9845);
                     var10000 = ~var10.field4424;
                     var10001 = -1;
                     if (!var9) {
                        int var34;
                        if (var10000 < -1) {
                           int var16 = 0;
                           int var17;
                           int var18;
                           int var19;
                           int var20;
                           int var21;
                           int var22;
                           int var23;
                           if (var9) {
                              var17 = var11[var16 * 2];
                              var18 = var11[var16 * 2 + 1];
                              var19 = var11[var16 * 2 + 2];
                              var20 = var11[(var16 + 1) * 2 + 1];
                              if (~var17 >= ~var19) {
                                 if (var17 == var19 && var18 > var20) {
                                    var21 = var18;
                                    var18 = var20;
                                    var20 = var21;
                                    if (var9) {
                                       var22 = var17;
                                       var17 = var19;
                                       var23 = var18;
                                       var18 = var21;
                                       var19 = var22;
                                       var20 = var23;
                                    }
                                 }
                              } else {
                                 var22 = var17;
                                 var17 = var19;
                                 var23 = var18;
                                 var18 = var20;
                                 var19 = var22;
                                 var20 = var23;
                              }

                              arg3.method586(var17, var18, var19, var20, var10.field4413[255 & var10.field4429[var16]], 1, arg1, arg5, arg6, var10.field4424, var10.field4439, var10.field4443);
                              ++var16;
                           }

                           while(true) {
                              if (var16 >= var11.length / 2 + -1) {
                                 var17 = var11[var11.length - 2];
                                 var18 = var11[var11.length + -1];
                                 var19 = var11[0];
                                 var20 = var11[1];
                                 var10000 = var17;
                                 var34 = var19;
                                 if (!var9) {
                                    label108: {
                                       if (var17 > var19) {
                                          int var24 = var17;
                                          int var25 = var18;
                                          var17 = var19;
                                          var19 = var24;
                                          var18 = var20;
                                          var20 = var25;
                                          if (!var9) {
                                             break label108;
                                          }
                                       }

                                       if (var17 == var19 && ~var18 < ~var20) {
                                          int var26 = var18;
                                          var18 = var20;
                                          var20 = var26;
                                       }
                                    }

                                    arg3.method586(var17, var18, var19, var20, var10.field4413[var10.field4429[var10.field4429.length + -1] & 255], 1, arg1, arg5, arg6, var10.field4424, var10.field4439, var10.field4443);
                                    if (!var9) {
                                       break label198;
                                    }
                                    break;
                                 }
                              } else {
                                 var17 = var11[var16 * 2];
                                 var18 = var11[var16 * 2 + 1];
                                 var19 = var11[var16 * 2 + 2];
                                 var20 = var11[(var16 + 1) * 2 + 1];
                                 var10000 = ~var17;
                                 var34 = ~var19;
                              }

                              if (var10000 >= var34) {
                                 if (var17 == var19 && var18 > var20) {
                                    var21 = var18;
                                    var18 = var20;
                                    var20 = var21;
                                    if (var9) {
                                       var22 = var17;
                                       var17 = var19;
                                       var23 = var18;
                                       var18 = var21;
                                       var19 = var22;
                                       var20 = var23;
                                    }
                                 }
                              } else {
                                 var22 = var17;
                                 var17 = var19;
                                 var23 = var18;
                                 var18 = var20;
                                 var19 = var22;
                                 var20 = var23;
                              }

                              arg3.method586(var17, var18, var19, var20, var10.field4413[255 & var10.field4429[var16]], 1, arg1, arg5, arg6, var10.field4424, var10.field4439, var10.field4443);
                              ++var16;
                           }
                        }

                        int var27 = 0;
                        if (var9) {
                           arg3.method580(var11[var27 * 2], var11[var27 * 2 - -1], var11[var27 * 2 + 2], var11[var27 * 2 + 3], var10.field4413[var10.field4429[var27] & 255], 1, arg1, arg5, arg6);
                           ++var27;
                        }

                        while(true) {
                           while(var27 < var11.length / 2 + -1) {
                              arg3.method580(var11[var27 * 2], var11[var27 * 2 - -1], var11[var27 * 2 + 2], var11[var27 * 2 + 3], var10.field4413[var10.field4429[var27] & 255], 1, arg1, arg5, arg6);
                              ++var27;
                           }

                           var34 = var11[var11.length - 2];
                           int var10002 = var11[var11.length + -1];
                           int var10003 = var11[0];
                           int var10004 = var11[1];
                           int var10005 = var10.field4413[var10.field4429[var10.field4429.length + -1] & 255];
                           if (!var9) {
                              arg3.method580(var34, var10002, var10003, var10004, var10005, 1, arg1, arg5, arg6);
                              break label198;
                           }

                           arg3.method580(var34, var10002, var10003, var10004, var10005, 1, arg1, arg5, arg6);
                           ++var27;
                        }
                     }
                  } else {
                     var10000 = ~class380.field5481;
                     var10001 = -5;
                  }

                  if (var10000 == var10001) {
                     var13 = (int)class117.field1467 & 16383;
                     if (var9) {
                        var13 = 16383 & (int)class117.field1467 - -class237.field3298;
                     }
                  } else {
                     var13 = 16383 & (int)class117.field1467 - -class237.field3298;
                  }

                  var14 = class363.field4956[var13];
                  var15 = class363.field4987[var13];
                  if (~class380.field5481 != -5) {
                     var14 = var14 * 256 / (class642.field9387 + 256);
                     var15 = var15 * 256 / (class642.field9387 - -256);
                  }

                  var11[var12 * 2] = arg5 - (-((var10.field4428[var12 * 2] * 4 + arg7) * var15 + (var10.field4428[var12 * 2 + 1] * 4 + arg2) * var14 >> 14) + -(arg0.field9904 / 2));
                  var11[var12 * 2 + 1] = arg0.field9980 / 2 + arg6 - ((var10.field4428[var12 * 2 + 1] * 4 + arg2) * var15 + -((var10.field4428[var12 * 2] * 4 + arg7) * var14) >> 14);
                  ++var12;
               }
            }

            class492 var28 = null;
            if (~var10.field4452 != 0) {
               var28 = var10.method2413(arg3, -4, false);
               if (var28 != null) {
                  class535.method3859(arg1, var28, arg7, arg0, arg5, (byte)125, arg6, arg2);
               }
            }

            if (var10.field4461 != null) {
               int var29 = 0;
               if (var28 != null) {
                  var29 = var28.method963();
               }

               class67 var30 = class215.field3075;
               class206 var31 = class705.field10283;
               if (var10.field4457 == 1) {
                  var30 = class427.field6124;
                  var31 = class347.field4690;
               }

               if (var10.field4457 == 2) {
                  var31 = class467.field6723;
                  var30 = class455.field6465;
               }

               class719.method5232(var10.field4461, arg1, arg7, var31, var30, var29, arg5, arg6, arg2, arg8 + -33, var10.field4418, arg0);
               return;
            }
         }

      } catch (RuntimeException var33) {
         throw class237.method1823(var33, field7993[1] + (arg0 != null ? field7993[2] : field7993[3]) + ',' + (arg1 != null ? field7993[2] : field7993[3]) + ',' + arg2 + ',' + (arg3 != null ? field7993[2] : field7993[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3997(int arg0) {
      try {
         int var1 = -38 / ((-47 - arg0) / 45);
         field7988 = null;
         field7990 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7993[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3998(byte arg0) {
      try {
         if (class660.field9618 != null) {
            class660.field9618.method5439((byte)80);
         }

         ++field7992;
         if (arg0 != 40) {
            field7988 = null;
         }

         if (class319.field4375 != null) {
            while(true) {
               try {
                  class319.field4375.join();
                  return;
               } catch (InterruptedException var2) {
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7993[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
