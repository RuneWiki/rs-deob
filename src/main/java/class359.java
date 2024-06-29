import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class359 {
   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5558 = new String[]{method2947(method2946("h% gR")), method2947(method2946("h% bR")), method2947(method2946("h% `R")), method2947(method2946("d bO")), method2947(method2946("q{ \r\u0007")), method2947(method2946("h% aR"))};
   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field5556 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "I"
   )
   public static int field5557 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "I"
   )
   public static int field5553;
   @OriginalMember(
      owner = "client!bp",
      name = "d",
      descriptor = "I"
   )
   public static int field5554;
   @OriginalMember(
      owner = "client!bp",
      name = "e",
      descriptor = "I"
   )
   public static int field5555;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IILha;ILfq;ILaa;BI)V"
   )
   public static final void method2942(int arg0, int arg1, class610 arg2, int arg3, class374 arg4, int arg5, class96 arg6, byte arg7, int arg8) {
      boolean var9 = client.field1786;

      try {
         if (arg7 > -41) {
            field5557 = 68;
         }

         ++field5555;
         class77 var10 = class508.field7776.method133(arg1, 36);
         if (var10 != null && var10.field989 && var10.method725(class45.field599, true)) {
            if (var10.field1010 != null) {
               int[] var11 = new int[var10.field1010.length];
               int var12 = 0;
               int var13;
               int var14;
               int var15;
               if (var9) {
                  if (class648.field9340 == 4) {
                     var13 = 16383 & (int)class417.field6456;
                     if (var9) {
                        var13 = (int)class417.field6456 - -class438.field6710 & 16383;
                     }
                  } else {
                     var13 = (int)class417.field6456 - -class438.field6710 & 16383;
                  }

                  var14 = class83.field1196[var13];
                  var15 = class83.field1194[var13];
                  if (class648.field9340 != 4) {
                     var15 = var15 * 256 / (class243.field3683 + 256);
                     var14 = var14 * 256 / (class243.field3683 - -256);
                  }

                  var11[var12 * 2] = ((var10.field1010[var12 * 2 + 1] * 4 + arg3) * var14 - -((arg0 - -(var10.field1010[var12 * 2] * 4)) * var15) >> 14) + arg4.field5849 / 2 + arg8;
                  var11[var12 * 2 + 1] = arg4.field5915 / 2 + arg5 - ((var10.field1010[var12 * 2 + 1] * 4 + arg3) * var15 + -((arg0 - -(var10.field1010[var12 * 2] * 4)) * var14) >> 14);
                  ++var12;
               }

               label198:
               while(true) {
                  int var10000;
                  if (~var12 <= ~(var11.length / 2)) {
                     class551.method4183(arg2, var11, var10.field986, arg4.field5843, arg4.field5874);
                     var10000 = var10.field1006;
                     if (!var9) {
                        int var10001;
                        if (var10000 > 0) {
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
                              var19 = var11[(var16 - -1) * 2];
                              var20 = var11[(var16 + 1) * 2 + 1];
                              if (~var17 >= ~var19) {
                                 if (var17 == var19 && ~var20 > ~var18) {
                                    var21 = var18;
                                    var18 = var20;
                                    var20 = var21;
                                    if (var9) {
                                       var22 = var17;
                                       var23 = var18;
                                       var17 = var19;
                                       var18 = var21;
                                       var19 = var22;
                                       var20 = var23;
                                    }
                                 }
                              } else {
                                 var22 = var17;
                                 var23 = var18;
                                 var17 = var19;
                                 var18 = var20;
                                 var19 = var22;
                                 var20 = var23;
                              }

                              arg2.method636(var17, var18, var19, var20, var10.field991[var10.field1014[var16] & 255], 1, arg6, arg8, arg5, var10.field1006, var10.field1027, var10.field994);
                              ++var16;
                           }

                           while(true) {
                              if (var11.length / 2 + -1 <= var16) {
                                 var17 = var11[var11.length + -2];
                                 var18 = var11[var11.length - 1];
                                 var19 = var11[0];
                                 var20 = var11[1];
                                 var10000 = var17;
                                 var10001 = var19;
                                 if (!var9) {
                                    label108: {
                                       if (var17 > var19) {
                                          int var24 = var17;
                                          int var25 = var18;
                                          var17 = var19;
                                          var18 = var20;
                                          var19 = var24;
                                          var20 = var25;
                                          if (!var9) {
                                             break label108;
                                          }
                                       }

                                       if (~var17 == ~var19 && ~var18 < ~var20) {
                                          int var26 = var18;
                                          var18 = var20;
                                          var20 = var26;
                                       }
                                    }

                                    arg2.method636(var17, var18, var19, var20, var10.field991[var10.field1014[var10.field1014.length + -1] & 255], 1, arg6, arg8, arg5, var10.field1006, var10.field1027, var10.field994);
                                    if (!var9) {
                                       break label198;
                                    }
                                    break;
                                 }
                              } else {
                                 var17 = var11[var16 * 2];
                                 var18 = var11[var16 * 2 + 1];
                                 var19 = var11[(var16 - -1) * 2];
                                 var20 = var11[(var16 + 1) * 2 + 1];
                                 var10000 = ~var17;
                                 var10001 = ~var19;
                              }

                              if (var10000 >= var10001) {
                                 if (var17 == var19 && ~var20 > ~var18) {
                                    var21 = var18;
                                    var18 = var20;
                                    var20 = var21;
                                    if (var9) {
                                       var22 = var17;
                                       var23 = var18;
                                       var17 = var19;
                                       var18 = var21;
                                       var19 = var22;
                                       var20 = var23;
                                    }
                                 }
                              } else {
                                 var22 = var17;
                                 var23 = var18;
                                 var17 = var19;
                                 var18 = var20;
                                 var19 = var22;
                                 var20 = var23;
                              }

                              arg2.method636(var17, var18, var19, var20, var10.field991[var10.field1014[var16] & 255], 1, arg6, arg8, arg5, var10.field1006, var10.field1027, var10.field994);
                              ++var16;
                           }
                        }

                        int var27 = 0;
                        if (var9) {
                           arg2.method597(var11[var27 * 2], var11[var27 * 2 - -1], var11[var27 * 2 + 2], var11[(var27 - -1) * 2 - -1], var10.field991[255 & var10.field1014[var27]], 1, arg6, arg8, arg5);
                           ++var27;
                        }

                        while(true) {
                           while(~var27 > ~(var11.length / 2 + -1)) {
                              arg2.method597(var11[var27 * 2], var11[var27 * 2 - -1], var11[var27 * 2 + 2], var11[(var27 - -1) * 2 - -1], var10.field991[255 & var10.field1014[var27]], 1, arg6, arg8, arg5);
                              ++var27;
                           }

                           var10001 = var11[var11.length + -2];
                           int var10002 = var11[var11.length + -1];
                           int var10003 = var11[0];
                           int var10004 = var11[1];
                           int var10005 = var10.field991[255 & var10.field1014[var10.field1014.length + -1]];
                           if (!var9) {
                              arg2.method597(var10001, var10002, var10003, var10004, var10005, 1, arg6, arg8, arg5);
                              break label198;
                           }

                           arg2.method597(var10001, var10002, var10003, var10004, var10005, 1, arg6, arg8, arg5);
                           ++var27;
                        }
                     }
                  } else {
                     var10000 = class648.field9340;
                  }

                  if (var10000 == 4) {
                     var13 = 16383 & (int)class417.field6456;
                     if (var9) {
                        var13 = (int)class417.field6456 - -class438.field6710 & 16383;
                     }
                  } else {
                     var13 = (int)class417.field6456 - -class438.field6710 & 16383;
                  }

                  var14 = class83.field1196[var13];
                  var15 = class83.field1194[var13];
                  if (class648.field9340 != 4) {
                     var15 = var15 * 256 / (class243.field3683 + 256);
                     var14 = var14 * 256 / (class243.field3683 - -256);
                  }

                  var11[var12 * 2] = ((var10.field1010[var12 * 2 + 1] * 4 + arg3) * var14 - -((arg0 - -(var10.field1010[var12 * 2] * 4)) * var15) >> 14) + arg4.field5849 / 2 + arg8;
                  var11[var12 * 2 + 1] = arg4.field5915 / 2 + arg5 - ((var10.field1010[var12 * 2 + 1] * 4 + arg3) * var15 + -((arg0 - -(var10.field1010[var12 * 2] * 4)) * var14) >> 14);
                  ++var12;
               }
            }

            class672 var28 = null;
            if (~var10.field1009 != 0) {
               var28 = var10.method727(118, false, arg2);
               if (var28 != null) {
                  class391.method3156(arg4, arg8, arg0, var28, arg3, (byte)76, arg6, arg5);
               }
            }

            if (var10.field1013 != null) {
               int var29 = 0;
               if (var28 != null) {
                  var29 = var28.method2095();
               }

               class288 var30 = class722.field10805;
               class697 var31 = class632.field9131;
               if (~var10.field1021 == -2) {
                  var31 = class564.field8381;
                  var30 = class577.field8538;
               }

               if (var10.field1021 == 2) {
                  var30 = class156.field2324;
                  var31 = class355.field5457;
               }

               class381.method3098(arg0, arg4, var10.field1029, arg3, var29, var31, (byte)17, arg5, var10.field1013, arg8, arg6, var30);
               return;
            }
         }

      } catch (RuntimeException var33) {
         throw class482.method3757(var33, field5558[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5558[4] : field5558[3]) + ',' + arg3 + ',' + (arg4 != null ? field5558[4] : field5558[3]) + ',' + arg5 + ',' + (arg6 != null ? field5558[4] : field5558[3]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method2943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         if (arg7 != 2) {
            method2944(-105, -70, (byte)-76, true);
         }

         ++field5554;
         if (~class443.field6806 >= ~arg4 && ~class182.field2833 <= ~arg4 && arg9 >= class443.field6806 && class182.field2833 >= arg9 && arg8 >= class443.field6806 && arg8 <= class182.field2833 && ~arg6 <= ~class443.field6806 && ~arg6 >= ~class182.field2833 && arg3 >= class368.field5724 && class84.field1212 >= arg3 && ~arg1 <= ~class368.field5724 && class84.field1212 >= arg1 && class368.field5724 <= arg2 && arg2 <= class84.field1212 && arg5 >= class368.field5724 && ~arg5 >= ~class84.field1212) {
            class400.method3235(arg8, arg3, arg2, arg0, arg4, arg6, arg9, arg5, (byte)2, arg1);
         } else {
            class105.method1011(arg8, arg5, arg0, arg9, arg3, arg4, (byte)-94, arg6, arg2, arg1);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field5558[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IIBZ)I"
   )
   public static final int method2944(int arg0, int arg1, byte arg2, boolean arg3) {
      try {
         if (arg2 != -42) {
            method2945(-99);
         }

         ++field5553;
         class503 var4 = class291.method2454(arg3, (byte)-26, arg0);
         if (var4 == null) {
            return -1;
         } else {
            return arg1 >= 0 && ~arg1 > ~var4.field7680.length ? var4.field7680[arg1] : -1;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5558[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2945(int arg0) {
      try {
         if (arg0 != -13779) {
            field5557 = 29;
         }

         field5556 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5558[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
