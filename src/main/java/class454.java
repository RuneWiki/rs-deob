import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class454 {
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6902 = new String[]{method3423(method3422("s{\u001b[S~,")), method3423(method3422("o?V")), method3423(method3422("s{\u001b[S\u007f,")), method3423(method3422("!g\u001aP")), method3423(method3422("&|\u0000ST")), method3423(method3422(" b\u0013R\u001d!")), method3423(method3422("<aX{F")), method3423(method3422("\u001b#V\u0011N")), method3423(method3422("o{\u0006\u0006")), method3423(method3422("4<X\u0012\u0013")), method3423(method3422("<aX~F")), method3423(method3422("<aX\u007fF")), method3423(method3422("<aXxF")), method3423(method3422("<aXzF")), method3423(method3422("<aX}F")), method3423(method3422("<aXyF"))};
   @OriginalMember(
      owner = "client!ss",
      name = "f",
      descriptor = "I"
   )
   public static int field6894;
   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "I"
   )
   public static int field6895;
   @OriginalMember(
      owner = "client!ss",
      name = "h",
      descriptor = "I"
   )
   public static int field6896;
   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "I"
   )
   public static int field6897;
   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "I"
   )
   public static int field6898;
   @OriginalMember(
      owner = "client!ss",
      name = "g",
      descriptor = "I"
   )
   public static int field6899;
   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "I"
   )
   public static int field6900;
   @OriginalMember(
      owner = "client!ss",
      name = "d",
      descriptor = "I"
   )
   public static int field6901;

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method3415(String arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field6894;
         if (arg0 == null) {
            return -1;
         } else if (arg1 != -1) {
            return -6;
         } else {
            int var3 = 0;
            if (var2 != 0) {
               if (arg0.equalsIgnoreCase(class751.field11119[var3])) {
                  return var3;
               }

               ++var3;
            }

            while(true) {
               while(class423.field6418 > var3) {
                  if (arg0.equalsIgnoreCase(class751.field11119[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (var2 == 0) {
                  return -1;
               }

               if (-1 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6902[10] + (arg0 != null ? field6902[9] : field6902[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method3416(int param0) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3417(byte arg0) {
      try {
         ++field6895;
         class225.method1705(-1, 255, 62);
         if (arg0 >= -42) {
            field6898 = 45;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6902[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3418(byte arg0, int arg1) {
      try {
         ++field6900;
         class403 var2 = class453.method3410((long)arg1, true, 4);
         if (arg0 >= -68) {
            method3420(104, -39, (class512)null, (class66)null, 123, -6, (class544)null, 120, 111);
         }

         var2.method3096((byte)-76);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6902[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3419(int arg0) {
      int var1 = client.field4530;

      try {
         if (arg0 == -2230) {
            if (class208.field2653 != null) {
               int var2 = 0;
               if (var1 != 0 || ~class208.field2653.length < ~var2) {
                  do {
                     int var3 = 0;
                     if (var1 != 0) {
                        class208.field2653[var2][var3] = class550.field8130;
                        ++var3;
                     }

                     while(true) {
                        while(~class208.field2653[var2].length < ~var3) {
                           class208.field2653[var2][var3] = class550.field8130;
                           ++var3;
                        }

                        if (var1 == 0) {
                           ++var2;
                           break;
                        }

                        ++var3;
                     }
                  } while(~class208.field2653.length < ~var2);
               }
            }

            ++field6897;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6902[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(IILaa;Lha;IILhv;II)V"
   )
   public static final void method3420(int arg0, int arg1, class512 arg2, class66 arg3, int arg4, int arg5, class544 arg6, int arg7, int arg8) {
      int var9 = client.field4530;

      try {
         if (arg8 != 1) {
            field6898 = 109;
         }

         ++field6896;
         class426 var10 = class536.field7828.method3293(27767, arg4);
         if (var10 != null && var10.field6500 && var10.method3244(13923, class597.field8793)) {
            if (var10.field6493 != null) {
               int[] var11 = new int[var10.field6493.length];
               int var12 = 0;
               int var13;
               int var14;
               int var15;
               if (var9 != 0) {
                  if (~class675.field10142 == -5) {
                     var13 = (int)class56.field706 & 16383;
                     if (var9 != 0) {
                        var13 = 16383 & (int)class56.field706 + class241.field3071;
                     }
                  } else {
                     var13 = 16383 & (int)class56.field706 + class241.field3071;
                  }

                  var14 = class689.field10389[var13];
                  var15 = class689.field10391[var13];
                  if (class675.field10142 != 4) {
                     var15 = var15 * 256 / (class606.field8898 - -256);
                     var14 = var14 * 256 / (class606.field8898 + 256);
                  }

                  var11[var12 * 2] = ((arg7 - -(var10.field6493[var12 * 2 + 1] * 4)) * var14 + (var10.field6493[var12 * 2] * 4 + arg0) * var15 >> 14) + arg6.field7986 / 2 + arg1;
                  var11[var12 * 2 + 1] = arg6.field7954 / 2 + arg5 + -((var10.field6493[var12 * 2 + 1] * 4 + arg7) * var15 + -((var10.field6493[var12 * 2] * 4 + arg0) * var14) >> 14);
                  ++var12;
               }

               label198:
               while(true) {
                  int var10000;
                  if (~var12 <= ~(var11.length / 2)) {
                     class493.method3658(arg3, var11, var10.field6468, arg6.field8026, arg6.field7976);
                     var10000 = var10.field6469;
                     if (var9 == 0) {
                        if (var10000 <= 0) {
                           int var16 = 0;
                           if (var9 != 0) {
                              arg3.method606(var11[var16 * 2], var11[var16 * 2 + 1], var11[var16 * 2 + 2], var11[var16 * 2 - -2 + 1], var10.field6487[255 & var10.field6492[var16]], 1, arg2, arg1, arg5);
                              ++var16;
                           }

                           while(true) {
                              while(~var16 > ~(var11.length / 2 - 1)) {
                                 arg3.method606(var11[var16 * 2], var11[var16 * 2 + 1], var11[var16 * 2 + 2], var11[var16 * 2 - -2 + 1], var10.field6487[255 & var10.field6492[var16]], 1, arg2, arg1, arg5);
                                 ++var16;
                              }

                              arg3.method606(var11[var11.length + -2], var11[var11.length + -1], var11[0], var11[1], var10.field6487[var10.field6492[var10.field6492.length + -1] & 255], 1, arg2, arg1, arg5);
                              if (var9 == 0) {
                                 if (var9 == 0) {
                                    break label198;
                                 }
                                 break;
                              }

                              ++var16;
                           }
                        }

                        int var17 = 0;
                        int var18;
                        int var19;
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        if (var9 != 0) {
                           var18 = var11[var17 * 2];
                           var19 = var11[var17 * 2 + 1];
                           var20 = var11[var17 * 2 - -2];
                           var21 = var11[(var17 + 1) * 2 + 1];
                           if (~var18 >= ~var20) {
                              if (var18 == var20 && var19 > var21) {
                                 var22 = var19;
                                 var19 = var21;
                                 var21 = var22;
                                 if (var9 != 0) {
                                    var23 = var18;
                                    var24 = var19;
                                    var18 = var20;
                                    var19 = var22;
                                    var20 = var23;
                                    var21 = var24;
                                 }
                              }
                           } else {
                              var23 = var18;
                              var24 = var19;
                              var18 = var20;
                              var19 = var21;
                              var20 = var23;
                              var21 = var24;
                           }

                           arg3.method600(var18, var19, var20, var21, var10.field6487[255 & var10.field6492[var17]], 1, arg2, arg1, arg5, var10.field6469, var10.field6498, var10.field6507);
                           ++var17;
                        }

                        while(true) {
                           int var10001;
                           if (~var17 <= ~(var11.length / 2 + -1)) {
                              var18 = var11[var11.length + -2];
                              var19 = var11[var11.length + -1];
                              var20 = var11[0];
                              var21 = var11[1];
                              var10000 = ~var18;
                              var10001 = ~var20;
                              if (var9 == 0) {
                                 label107: {
                                    if (var10000 < var10001) {
                                       int var25 = var18;
                                       var18 = var20;
                                       int var26 = var19;
                                       var20 = var25;
                                       var19 = var21;
                                       var21 = var26;
                                       if (var9 == 0) {
                                          break label107;
                                       }
                                    }

                                    if (~var18 == ~var20 && var19 > var21) {
                                       int var27 = var19;
                                       var19 = var21;
                                       var21 = var27;
                                    }
                                 }

                                 arg3.method600(var18, var19, var20, var21, var10.field6487[var10.field6492[var10.field6492.length + -1] & 255], 1, arg2, arg1, arg5, var10.field6469, var10.field6498, var10.field6507);
                                 break label198;
                              }
                           } else {
                              var18 = var11[var17 * 2];
                              var19 = var11[var17 * 2 + 1];
                              var20 = var11[var17 * 2 - -2];
                              var21 = var11[(var17 + 1) * 2 + 1];
                              var10000 = ~var18;
                              var10001 = ~var20;
                           }

                           if (var10000 >= var10001) {
                              if (var18 == var20 && var19 > var21) {
                                 var22 = var19;
                                 var19 = var21;
                                 var21 = var22;
                                 if (var9 != 0) {
                                    var23 = var18;
                                    var24 = var19;
                                    var18 = var20;
                                    var19 = var22;
                                    var20 = var23;
                                    var21 = var24;
                                 }
                              }
                           } else {
                              var23 = var18;
                              var24 = var19;
                              var18 = var20;
                              var19 = var21;
                              var20 = var23;
                              var21 = var24;
                           }

                           arg3.method600(var18, var19, var20, var21, var10.field6487[255 & var10.field6492[var17]], 1, arg2, arg1, arg5, var10.field6469, var10.field6498, var10.field6507);
                           ++var17;
                        }
                     }
                  } else {
                     var10000 = ~class675.field10142;
                  }

                  if (var10000 == -5) {
                     var13 = (int)class56.field706 & 16383;
                     if (var9 != 0) {
                        var13 = 16383 & (int)class56.field706 + class241.field3071;
                     }
                  } else {
                     var13 = 16383 & (int)class56.field706 + class241.field3071;
                  }

                  var14 = class689.field10389[var13];
                  var15 = class689.field10391[var13];
                  if (class675.field10142 != 4) {
                     var15 = var15 * 256 / (class606.field8898 - -256);
                     var14 = var14 * 256 / (class606.field8898 + 256);
                  }

                  var11[var12 * 2] = ((arg7 - -(var10.field6493[var12 * 2 + 1] * 4)) * var14 + (var10.field6493[var12 * 2] * 4 + arg0) * var15 >> 14) + arg6.field7986 / 2 + arg1;
                  var11[var12 * 2 + 1] = arg6.field7954 / 2 + arg5 + -((var10.field6493[var12 * 2 + 1] * 4 + arg7) * var15 + -((var10.field6493[var12 * 2] * 4 + arg0) * var14) >> 14);
                  ++var12;
               }
            }

            class396 var28 = null;
            if (~var10.field6515 != 0) {
               var28 = var10.method3237(-74, arg3, false);
               if (var28 != null) {
                  class22.method147(arg0, (byte)-97, arg2, arg1, var28, arg6, arg5, arg7);
               }
            }

            if (var10.field6485 != null) {
               int var29 = 0;
               if (var28 != null) {
                  var29 = var28.method1967();
               }

               class67 var30 = class57.field721;
               class763 var31 = class595.field8772;
               if (~var10.field6502 == -2) {
                  var30 = class288.field4045;
                  var31 = class417.field6389;
               }

               if (~var10.field6502 == -3) {
                  var31 = class173.field2160;
                  var30 = class524.field7616;
               }

               class551.method4078(-2, var10.field6485, var31, var30, arg1, arg7, arg6, arg2, arg0, var29, arg5, var10.field6488);
               return;
            }
         }

      } catch (RuntimeException var33) {
         throw class670.method4877(var33, field6902[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6902[9] : field6902[3]) + ',' + (arg3 != null ? field6902[9] : field6902[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6902[9] : field6902[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(III)V"
   )
   private static final void method3421(int arg0, int arg1, int arg2) {
      try {
         ++field6901;
         int var3 = 125 % ((arg1 - -69) / 44);
         class225.method1705(arg2, arg0, -100);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6902[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3422(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3423(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
