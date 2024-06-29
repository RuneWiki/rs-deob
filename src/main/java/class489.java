import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class489 extends class302 {
   @OriginalMember(
      owner = "client!bg",
      name = "J",
      descriptor = "I"
   )
   private int field7225 = 1;
   @OriginalMember(
      owner = "client!bg",
      name = "N",
      descriptor = "I"
   )
   private int field7234 = 1;
   @OriginalMember(
      owner = "client!bg",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7237 = new String[]{method3630(method3629("\\L\u0017-_")), method3630(method3629("E\u0005\u0017A\n")), method3630(method3629("\\L\u0017*_")), method3630(method3629("VJO\n\u0011WY\\\t\u0018F")), method3630(method3629("P^U\u0003")), method3630(method3629("SJZ")), method3630(method3629("VJO\n\u001e[\u001d")), method3630(method3629("IBW")), method3630(method3629("UG")), method3630(method3629("\\L\u0017(_")), method3630(method3629("\\L\u0017._")), method3630(method3629("\\L\u0017,_")), method3630(method3629("\\L\u0017)_"))};
   @OriginalMember(
      owner = "client!bg",
      name = "Q",
      descriptor = "I"
   )
   public static int field7223 = 0;
   @OriginalMember(
      owner = "client!bg",
      name = "S",
      descriptor = "Lqo;"
   )
   public static class24 field7224 = null;
   @OriginalMember(
      owner = "client!bg",
      name = "H",
      descriptor = "I"
   )
   public static int field7228 = 0;
   @OriginalMember(
      owner = "client!bg",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field7235 = new int[14];
   @OriginalMember(
      owner = "client!bg",
      name = "I",
      descriptor = "I"
   )
   public static int field7226;
   @OriginalMember(
      owner = "client!bg",
      name = "R",
      descriptor = "I"
   )
   public static int field7227;
   @OriginalMember(
      owner = "client!bg",
      name = "T",
      descriptor = "I"
   )
   public static int field7229;
   @OriginalMember(
      owner = "client!bg",
      name = "P",
      descriptor = "I"
   )
   public static int field7230;
   @OriginalMember(
      owner = "client!bg",
      name = "O",
      descriptor = "I"
   )
   public static int field7231;
   @OriginalMember(
      owner = "client!bg",
      name = "K",
      descriptor = "I"
   )
   public static int field7232;
   @OriginalMember(
      owner = "client!bg",
      name = "U",
      descriptor = "I"
   )
   public static int field7233;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bg",
      name = "L",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7236;

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            method3627(81);
         }

         ++field7229;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int var5;
            int var6;
            int[][][] var9;
            int[][] var10000;
            int[] var30;
            int[] var31;
            label102: {
               var5 = this.field7234 - -1 + this.field7234;
               var6 = 65536 / var5;
               int var7 = this.field7225 + 1 + this.field7225;
               int var8 = 65536 / var7;
               var9 = new int[var5][][];
               int var10 = -this.field7234 + arg1;
               if (var3 != 0) {
                  var10000 = this.method2297(0, var10 & class275.field3837, arg0 + 90);
               } else if (var10 > this.field7234 + arg1) {
                  var30 = var4[0];
                  var31 = var4[1];
                  var10000 = var4;
                  if (var3 == 0) {
                     break label102;
                  }
               } else {
                  var10000 = this.method2297(0, var10 & class275.field3837, arg0 + 90);
               }

               label101:
               while(true) {
                  int[][] var11 = var10000;
                  int[][] var12 = new int[3][class344.field5238];
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  int[] var16 = var11[0];
                  int[] var17 = var11[1];
                  int[] var18 = var11[2];
                  int var19 = -this.field7225;
                  int var20;
                  if (var3 != 0) {
                     var20 = var19 & class264.field3612;
                     var13 += var16[var20];
                     var14 += var17[var20];
                     var15 += var18[var20];
                     ++var19;
                  }

                  while(true) {
                     int var41;
                     if (var19 > this.field7225) {
                        int[] var21 = var12[0];
                        int[] var22 = var12[1];
                        int[] var23 = var12[2];
                        var41 = 0;
                        if (var3 == 0) {
                           label98: {
                              int var24 = 0;
                              if (var3 != 0) {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              } else if (~var24 <= ~class344.field5238) {
                                 var9[var10 - arg1 + this.field7234] = var12;
                                 if (var3 == 0) {
                                    break label98;
                                 }
                              } else {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              }

                              while(true) {
                                 int var25 = var24 - this.field7225 & class264.field3612;
                                 int var26 = var15 - var18[var25];
                                 int var27 = var14 - var17[var25];
                                 ++var24;
                                 int var28 = var13 - var16[var25];
                                 int var29 = class264.field3612 & this.field7225 + var24;
                                 var13 = var16[var29] + var28;
                                 var15 = var18[var29] + var26;
                                 var14 = var17[var29] + var27;
                                 if (~var24 <= ~class344.field5238) {
                                    var9[var10 - arg1 + this.field7234] = var12;
                                    if (var3 == 0) {
                                       break;
                                    }
                                 } else {
                                    var21[var24] = var8 * var13 >> 16;
                                    var22[var24] = var8 * var14 >> 16;
                                    var23[var24] = var8 * var15 >> 16;
                                 }
                              }
                           }

                           ++var10;
                           if (var10 > this.field7234 + arg1) {
                              var30 = var4[0];
                              var31 = var4[1];
                              var10000 = var4;
                              if (var3 == 0) {
                                 break label101;
                              }
                           } else {
                              var10000 = this.method2297(0, var10 & class275.field3837, arg0 + 90);
                           }
                           break;
                        }
                     } else {
                        var41 = var19 & class264.field3612;
                     }

                     var20 = var41;
                     var13 += var16[var20];
                     var14 += var17[var20];
                     var15 += var18[var20];
                     ++var19;
                  }
               }
            }

            int[] var32 = var10000[2];
            int var33 = 0;
            if (var3 != 0 || var33 < class344.field5238) {
               do {
                  int var34 = 0;
                  int var35 = 0;
                  int var36 = 0;
                  int var37 = 0;
                  if (var3 != 0 || ~var37 > ~var5) {
                     do {
                        int[][] var38 = var9[var37];
                        var36 += var38[2][var33];
                        var35 += var38[1][var33];
                        var34 += var38[0][var33];
                        ++var37;
                     } while(~var37 > ~var5);
                  }

                  var30[var33] = var6 * var34 >> 16;
                  var31[var33] = var6 * var35 >> 16;
                  var32[var33] = var6 * var36 >> 16;
                  ++var33;
               } while(var33 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var40) {
         throw class670.method4877(var40, field7237[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7227;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 >= -37) {
            return null;
         } else {
            if (super.field4298.field6356) {
               int var5 = this.field7234 + this.field7234 + 1;
               int var6 = 65536 / var5;
               int var7 = this.field7225 + this.field7225 + 1;
               int var8 = 65536 / var7;
               int[][] var9 = new int[var5][];
               int var10 = -this.field7234 + arg0;
               if (var3 != 0 || ~var10 >= ~(this.field7234 + arg0)) {
                  label113:
                  do {
                     int[] var11 = this.method2299(class275.field3837 & var10, false, 0);
                     int[] var12 = new int[class344.field5238];
                     int var13 = 0;
                     int var14 = -this.field7225;
                     if (var3 != 0) {
                        var13 += var11[var14 & class264.field3612];
                        ++var14;
                     }

                     while(true) {
                        while(~this.field7225 <= ~var14) {
                           var13 += var11[var14 & class264.field3612];
                           ++var14;
                        }

                        int var15 = 0;
                        if (var3 == 0) {
                           if (var3 != 0) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[class264.field3612 & -this.field7225 + var15];
                              ++var15;
                              var13 += var11[var15 - -this.field7225 & class264.field3612];
                           }

                           while(true) {
                              while(~class344.field5238 < ~var15) {
                                 var12[var15] = var8 * var13 >> 16;
                                 var13 -= var11[class264.field3612 & -this.field7225 + var15];
                                 ++var15;
                                 var13 += var11[var15 - -this.field7225 & class264.field3612];
                              }

                              var9[var10 - -this.field7234 + -arg0] = var12;
                              if (var3 == 0) {
                                 ++var10;
                                 continue label113;
                              }

                              var13 += var11[var15 - -this.field7225 & class264.field3612];
                           }
                        }

                        ++var14;
                     }
                  } while(~var10 >= ~(this.field7234 + arg0));
               }

               int var16 = 0;
               if (var3 != 0 || class344.field5238 > var16) {
                  do {
                     int var17 = 0;
                     int var18 = 0;
                     if (var3 != 0) {
                        var17 += var9[var18][var16];
                        ++var18;
                     }

                     while(true) {
                        while(~var18 > ~var5) {
                           var17 += var9[var18][var16];
                           ++var18;
                        }

                        var4[var16] = var6 * var17 >> 16;
                        if (var3 == 0) {
                           ++var16;
                           break;
                        }

                        ++var18;
                     }
                  } while(class344.field5238 > var16);
               }
            }

            return var4;
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field7237[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method3625(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7233;
         int var4 = 23 % ((arg2 - 31) / 54);
         class86 var5 = (class86)class29.method203(arg3, arg0, arg1);
         boolean var6 = true;
         if (var5 != null) {
            var6 &= class603.method4407(38, var5);
         }

         class86 var7 = (class86)class660.method4742(arg3, arg0, arg1, field7236 != null ? field7236 : (field7236 = method3628(field7237[8])));
         if (var7 != null) {
            var6 &= class603.method4407(38, var7);
         }

         class86 var8 = (class86)class97.method856(arg3, arg0, arg1);
         if (var8 != null) {
            var6 &= class603.method4407(38, var8);
         }

         return var6;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7237[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "()V"
   )
   public class489() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLhg;Z)V"
   )
   public static final void method3626(String arg0, String arg1, int arg2, boolean arg3, class719 arg4, boolean arg5) {
      try {
         label72: {
            ++field7226;
            if (arg3) {
               if (class719.field10719.startsWith(field7237[7]) && arg4.field10710) {
                  String var6 = null;
                  if (class238.field3003 != null) {
                     var6 = class238.field3003.getParameter(field7237[6]);
                  }

                  if (var6 == null || !var6.equals("1")) {
                     class12 var7 = class417.method3190(0, -87, arg0, arg4);
                     class653.field9513 = arg0;
                     class689.field10372 = arg4;
                     class236.field2997 = var7;
                     return;
                  }
               }

               if (class719.field10719.startsWith(field7237[5])) {
                  String var8 = null;
                  if (class238.field3003 != null) {
                     var8 = class238.field3003.getParameter(field7237[3]);
                  }

                  if (var8 != null && var8.equals("1") && arg5) {
                     class106.method917(arg0, (byte)116, arg4, 1, arg1);
                     return;
                  }
               }

               class417.method3190(2, 109, arg0, arg4);
               if (client.field4530 == 0) {
                  break label72;
               }
            }

            class417.method3190(3, 92, arg0, arg4);
         }

         if (arg2 != 0) {
            field7223 = 119;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7237[2] + (arg0 != null ? field7237[1] : field7237[4]) + ',' + (arg1 != null ? field7237[1] : field7237[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7237[1] : field7237[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3627(int arg0) {
      try {
         field7235 = null;
         field7224 = null;
         if (arg0 != -2528) {
            field7228 = 23;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7237[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label57: {
            label51: {
               label50: {
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label50;
                     }

                     if (arg0 != 2) {
                        break label57;
                     }

                     if (var4 == 0) {
                        break label51;
                     }
                  }

                  this.field7225 = arg2.method1104(255);
                  if (var4 == 0) {
                     break label57;
                  }
               }

               this.field7234 = arg2.method1104(255);
               if (var4 == 0) {
                  break label57;
               }
            }

            super.field4313 = ~arg2.method1104(arg1 ^ 255) == -2;
         }

         if (arg1 != 0) {
            method3627(9);
         }

         ++field7231;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7237[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7237[1] : field7237[4]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3628(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
