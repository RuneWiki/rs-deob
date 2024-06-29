import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class429 extends class246 {
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6202 = new String[]{method3243(method3242("'E[\u0017[")), method3243(method3242(":\u0019[v\u000e")), method3243(method3242("/B\u00194")), method3243(method3242("'E[\u0016[")), method3243(method3242("'E[\u0014[")), method3243(method3242("'E[\u0015["))};
   @OriginalMember(
      owner = "client!fr",
      name = "j",
      descriptor = "Lgh;"
   )
   public static class572 field6198 = new class572(119, 6);
   @OriginalMember(
      owner = "client!fr",
      name = "m",
      descriptor = "I"
   )
   public static int field6195;
   @OriginalMember(
      owner = "client!fr",
      name = "l",
      descriptor = "I"
   )
   public static int field6199;
   @OriginalMember(
      owner = "client!fr",
      name = "p",
      descriptor = "I"
   )
   public static int field6200;
   @OriginalMember(
      owner = "client!fr",
      name = "o",
      descriptor = "Lfr;"
   )
   public class429 field6196;
   @OriginalMember(
      owner = "client!fr",
      name = "k",
      descriptor = "Lfr;"
   )
   public class429 field6197;
   @OriginalMember(
      owner = "client!fr",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field6201;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(JI)Ljava/lang/String;",
      line = 4
   )
   public static final String method3238(long arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field6195;
         if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg0;
               if (var3) {
                  ++var4;
                  var5 = arg0 / 37L;
               }

               while(true) {
                  if (~var5 == -1L) {
                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3) {
                        if (!var3 && ~arg0 == -1L) {
                           var7.reverse();
                           var7.setCharAt(arg1, Character.toUpperCase(var7.charAt(0)));
                           return var7.toString();
                        } else {
                           do {
                              long var8 = arg0;
                              arg0 /= 37L;
                              char var10 = class128.field2143[(int)(-(arg0 * 37L) + var8)];
                              if (var10 == '_') {
                                 int var11 = -1 + var7.length();
                                 var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                                 var10 = 160;
                              }

                              var7.append(var10);
                           } while(~arg0 != -1L);

                           var7.reverse();
                           var7.setCharAt(arg1, Character.toUpperCase(var7.charAt(0)));
                           return var7.toString();
                        }
                     }
                  } else {
                     ++var4;
                  }

                  var5 /= 37L;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6202[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(ILaa;BLha;Ljfa;IIII)V",
      line = 55
   )
   public static final void method3239(int arg0, class510 arg1, byte arg2, class65 arg3, class303 arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         int var10 = -66 / ((79 - arg2) / 44);
         ++field6199;
         class155 var11 = class542.field7856.method3207(arg6, 36);
         if (var11 != null && var11.field2487 && var11.method1433(class616.field8951, -21)) {
            if (var11.field2494 != null) {
               int[] var12 = new int[var11.field2494.length];
               int var13 = 0;
               int var14;
               int var15;
               int var16;
               if (var9) {
                  if (~class590.field8514 != -5) {
                     var14 = (int)class756.field10975 + class395.field5809 & 16383;
                     if (var9) {
                        var14 = (int)class756.field10975 & 16383;
                     }
                  } else {
                     var14 = (int)class756.field10975 & 16383;
                  }

                  var15 = class593.field8539[var14];
                  var16 = class593.field8548[var14];
                  if (~class590.field8514 != -5) {
                     var16 = var16 * 256 / (class449.field6559 + 256);
                     var15 = var15 * 256 / (class449.field6559 + 256);
                  }

                  var12[var13 * 2] = ((var11.field2494[var13 * 2] * 4 + arg8) * var16 + (var11.field2494[var13 * 2 + 1] * 4 + arg7) * var15 >> 14) + arg4.field4308 / 2 + arg5;
                  var12[var13 * 2 + 1] = arg4.field4226 / 2 + arg0 + -((var11.field2494[var13 * 2 + 1] * 4 + arg7) * var16 + -((var11.field2494[var13 * 2] * 4 + arg8) * var15) >> 14);
                  ++var13;
               }

               label197:
               while(true) {
                  int var10000;
                  if (var12.length / 2 <= var13) {
                     class2.method8(arg3, var12, var11.field2480, arg4.field4219, arg4.field4368);
                     var10000 = var11.field2500;
                     if (!var9) {
                        if (var10000 <= 0) {
                           int var17 = 0;
                           if (var9) {
                              arg3.method359(var12[var17 * 2], var12[var17 * 2 + 1], var12[var17 * 2 + 2], var12[var17 * 2 + 2 + 1], var11.field2484[255 & var11.field2475[var17]], 1, arg1, arg5, arg0);
                              ++var17;
                           }

                           while(true) {
                              while(~var17 > ~(var12.length / 2 + -1)) {
                                 arg3.method359(var12[var17 * 2], var12[var17 * 2 + 1], var12[var17 * 2 + 2], var12[var17 * 2 + 2 + 1], var11.field2484[255 & var11.field2475[var17]], 1, arg1, arg5, arg0);
                                 ++var17;
                              }

                              arg3.method359(var12[var12.length + -2], var12[var12.length + -1], var12[0], var12[1], var11.field2484[255 & var11.field2475[var11.field2475.length + -1]], 1, arg1, arg5, arg0);
                              if (!var9) {
                                 if (!var9) {
                                    break label197;
                                 }
                                 break;
                              }

                              ++var17;
                           }
                        }

                        int var18 = 0;
                        int var19;
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var9) {
                           var19 = var12[var18 * 2];
                           var20 = var12[var18 * 2 + 1];
                           var21 = var12[var18 * 2 + 2];
                           var22 = var12[(var18 + 1) * 2 + 1];
                           if (var21 >= var19) {
                              if (var19 == var21 && var22 < var20) {
                                 var23 = var20;
                                 var20 = var22;
                                 var22 = var23;
                                 if (var9) {
                                    var24 = var19;
                                    var25 = var20;
                                    var19 = var21;
                                    var21 = var24;
                                    var20 = var23;
                                    var22 = var25;
                                 }
                              }
                           } else {
                              var24 = var19;
                              var25 = var20;
                              var19 = var21;
                              var21 = var24;
                              var20 = var22;
                              var22 = var25;
                           }

                           arg3.method395(var19, var20, var21, var22, var11.field2484[255 & var11.field2475[var18]], 1, arg1, arg5, arg0, var11.field2500, var11.field2483, var11.field2493);
                           ++var18;
                        }

                        while(true) {
                           int var10001;
                           if (var12.length / 2 + -1 <= var18) {
                              var19 = var12[var12.length + -2];
                              var20 = var12[var12.length + -1];
                              var21 = var12[0];
                              var22 = var12[1];
                              var10000 = ~var21;
                              var10001 = ~var19;
                              if (!var9) {
                                 label106: {
                                    if (var10000 <= var10001) {
                                       if (~var19 != ~var21 || ~var20 >= ~var22) {
                                          break label106;
                                       }

                                       int var26 = var20;
                                       var20 = var22;
                                       var22 = var26;
                                       if (!var9) {
                                          break label106;
                                       }
                                    }

                                    int var27 = var19;
                                    int var28 = var20;
                                    var19 = var21;
                                    var20 = var22;
                                    var21 = var27;
                                    var22 = var28;
                                 }

                                 arg3.method395(var19, var20, var21, var22, var11.field2484[var11.field2475[var11.field2475.length + -1] & 255], 1, arg1, arg5, arg0, var11.field2500, var11.field2483, var11.field2493);
                                 break label197;
                              }
                           } else {
                              var19 = var12[var18 * 2];
                              var20 = var12[var18 * 2 + 1];
                              var21 = var12[var18 * 2 + 2];
                              var22 = var12[(var18 + 1) * 2 + 1];
                              var10000 = var21;
                              var10001 = var19;
                           }

                           if (var10000 >= var10001) {
                              if (var19 == var21 && var22 < var20) {
                                 var23 = var20;
                                 var20 = var22;
                                 var22 = var23;
                                 if (var9) {
                                    var24 = var19;
                                    var25 = var20;
                                    var19 = var21;
                                    var21 = var24;
                                    var20 = var23;
                                    var22 = var25;
                                 }
                              }
                           } else {
                              var24 = var19;
                              var25 = var20;
                              var19 = var21;
                              var21 = var24;
                              var20 = var22;
                              var22 = var25;
                           }

                           arg3.method395(var19, var20, var21, var22, var11.field2484[255 & var11.field2475[var18]], 1, arg1, arg5, arg0, var11.field2500, var11.field2483, var11.field2493);
                           ++var18;
                        }
                     }
                  } else {
                     var10000 = ~class590.field8514;
                  }

                  if (var10000 != -5) {
                     var14 = (int)class756.field10975 + class395.field5809 & 16383;
                     if (var9) {
                        var14 = (int)class756.field10975 & 16383;
                     }
                  } else {
                     var14 = (int)class756.field10975 & 16383;
                  }

                  var15 = class593.field8539[var14];
                  var16 = class593.field8548[var14];
                  if (~class590.field8514 != -5) {
                     var16 = var16 * 256 / (class449.field6559 + 256);
                     var15 = var15 * 256 / (class449.field6559 + 256);
                  }

                  var12[var13 * 2] = ((var11.field2494[var13 * 2] * 4 + arg8) * var16 + (var11.field2494[var13 * 2 + 1] * 4 + arg7) * var15 >> 14) + arg4.field4308 / 2 + arg5;
                  var12[var13 * 2 + 1] = arg4.field4226 / 2 + arg0 + -((var11.field2494[var13 * 2 + 1] * 4 + arg7) * var16 + -((var11.field2494[var13 * 2] * 4 + arg8) * var15) >> 14);
                  ++var13;
               }
            }

            class476 var29 = null;
            if (~var11.field2504 != 0) {
               var29 = var11.method1430(arg3, -90, false);
               if (var29 != null) {
                  class462.method3465(arg7, arg0, arg8, arg5, true, arg1, arg4, var29);
               }
            }

            if (var11.field2501 != null) {
               int var30 = 0;
               if (var29 != null) {
                  var30 = var29.method3005();
               }

               class66 var31 = class193.field2920;
               class445 var32 = class4.field45;
               if (~var11.field2463 == -2) {
                  var31 = class678.field9949;
                  var32 = class141.field2309;
               }

               if (var11.field2463 == 2) {
                  var31 = class296.field4151;
                  var32 = class511.field7461;
               }

               class231.method1913(arg8, arg5, -74, var31, arg4, var30, arg0, arg1, var11.field2501, var32, arg7, var11.field2499);
               return;
            }
         }

      } catch (RuntimeException var34) {
         throw class608.method4462(var34, field6202[3] + arg0 + ',' + (arg1 != null ? field6202[1] : field6202[2]) + ',' + arg2 + ',' + (arg3 != null ? field6202[1] : field6202[2]) + ',' + (arg4 != null ? field6202[1] : field6202[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(I)V",
      line = 237
   )
   public static void method3240(int arg0) {
      try {
         field6201 = null;
         field6198 = null;
         if (arg0 != 25810) {
            field6198 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6202[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "(I)V",
      line = 254
   )
   public final void method3241(int arg0) {
      try {
         ++field6200;
         if (this.field6196 != null) {
            this.field6196.field6197 = this.field6197;
            this.field6197.field6196 = this.field6196;
            if (arg0 == 2) {
               this.field6197 = null;
               this.field6196 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6202[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
