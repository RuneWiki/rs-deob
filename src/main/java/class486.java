import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class486 extends class345 {
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7074 = new String[]{method3677(method3676("nYL*C")), method3677(method3676("nYL-C")), method3677(method3676("nYL/C")), method3677(method3676("nYL.C")), method3677(method3676("v\u001fLE\u0016")), method3677(method3676("cD\u000e\u0007")), method3677(method3676("nYL\"C")), method3677(method3676("nYL)C")), method3677(method3676("nYL(C")), method3677(method3676("nYL!C")), method3677(method3676("nYL#C")), method3677(method3676("nYL,C")), method3677(method3676("nYL C"))};
   @OriginalMember(
      owner = "client!ch",
      name = "i",
      descriptor = "Lgw;"
   )
   public static class179 field7067 = new class179(8);
   @OriginalMember(
      owner = "client!ch",
      name = "q",
      descriptor = "I"
   )
   public static int field7062;
   @OriginalMember(
      owner = "client!ch",
      name = "t",
      descriptor = "I"
   )
   public static int field7063;
   @OriginalMember(
      owner = "client!ch",
      name = "o",
      descriptor = "I"
   )
   public static int field7064;
   @OriginalMember(
      owner = "client!ch",
      name = "k",
      descriptor = "I"
   )
   public static int field7065;
   @OriginalMember(
      owner = "client!ch",
      name = "m",
      descriptor = "I"
   )
   public static int field7066;
   @OriginalMember(
      owner = "client!ch",
      name = "j",
      descriptor = "I"
   )
   public static int field7068;
   @OriginalMember(
      owner = "client!ch",
      name = "s",
      descriptor = "I"
   )
   public static int field7069;
   @OriginalMember(
      owner = "client!ch",
      name = "n",
      descriptor = "I"
   )
   public static int field7070;
   @OriginalMember(
      owner = "client!ch",
      name = "l",
      descriptor = "I"
   )
   public static int field7071;
   @OriginalMember(
      owner = "client!ch",
      name = "r",
      descriptor = "I"
   )
   public static int field7072;
   @OriginalMember(
      owner = "client!ch",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field7073;

   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3669(boolean arg0) {
      try {
         ++field7070;
         if (arg0) {
            method3674(true, 36);
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7074[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return -11;
         } else {
            ++field7068;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7074[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3670(byte arg0) {
      try {
         if (arg0 > -127) {
            this.method3670((byte)24);
         }

         ++field7065;
         if (super.field4914.method5560(13750)) {
            return false;
         } else {
            return super.field4914.method5561(0) == class459.field6730;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7074[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class486(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ch",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3671(int arg0) {
      try {
         if (arg0 == -2) {
            field7067 = null;
            field7073 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7074[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field7071;
         if (super.field4914.method5560(13750)) {
            return 3;
         } else if (super.field4914.method5561(0) == class459.field6730) {
            return 1;
         } else {
            if (arg0 > -45) {
               method3674(false, 13);
            }

            return 3;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7074[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(Ljava/io/File;Z)[B"
   )
   public static final byte[] method3672(File arg0, boolean arg1) {
      try {
         ++field7063;
         if (arg1) {
            method3675((String)null, 'U', (String)null, -75);
         }

         return class584.method4332(arg0, true, (int)arg0.length());
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7074[10] + (arg0 != null ? field7074[4] : field7074[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4564;

      try {
         ++field7064;
         int var9 = 0;
         int var10 = arg7;
         int var11 = 0;
         int var12 = -arg1 + arg2;
         int var13 = -arg1 + arg7;
         int var14 = arg2 * arg2;
         int var15 = arg7 * arg7;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg7 << 1;
         int var23 = var13 << 1;
         int var24 = (1 - var22) * var14 + var18;
         int var25 = var15 - (var22 - 1) * var19;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = -((var23 + -1) * var21) + var17;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 - 3) * var21;
         int var36 = var29;
         int var37 = (arg0 + arg7) * var28;
         int var38 = var31;
         int var39 = (var13 + -1) * var30;
         int var10000;
         if (~arg5 <= ~class3.field16) {
            if (class581.field8354 >= arg5) {
               int[] var40 = class448.field6542[arg5];
               int var41 = class741.method5346(-arg2 + arg4, class515.field7502, class130.field2163, -1);
               int var42 = class741.method5346(arg2 + arg4, class515.field7502, class130.field2163, -1);
               int var43 = class741.method5346(-var12 + arg4, class515.field7502, class130.field2163, -1);
               int var44 = class741.method5346(arg4 - -var12, class515.field7502, class130.field2163, -1);
               class18.method132(false, var41, var43, arg3, var40);
               class18.method132(false, var43, var44, arg6, var40);
               class18.method132(false, var44, var42, arg3, var40);
               if (var8) {
                  var10000 = ~arg7 < ~var13 ? 0 : 1;
               } else {
                  if (~arg7 >= -1) {
                     return;
                  }

                  var10000 = ~arg7 < ~var13 ? 0 : 1;
               }
            } else {
               if (~arg7 >= -1) {
                  return;
               }

               var10000 = ~arg7 < ~var13 ? 0 : 1;
            }
         } else {
            if (~arg7 >= -1) {
               return;
            }

            var10000 = ~arg7 < ~var13 ? 0 : 1;
         }

         while(true) {
            while(true) {
               int var45;
               label191: {
                  var45 = var10000;
                  if (~var24 > -1) {
                     if (var8) {
                        var25 += var36;
                        var24 += var32;
                        var32 += var29;
                        var36 += var29;
                        ++var9;
                     }
                  } else {
                     var10000 = var45;
                     if (!var8) {
                        break label191;
                     }

                     var36 = var45;
                     ++var9;
                  }

                  while(true) {
                     while(var24 < 0) {
                        var25 += var36;
                        var24 += var32;
                        var32 += var29;
                        var36 += var29;
                        ++var9;
                     }

                     var10000 = var45;
                     if (!var8) {
                        break;
                     }

                     var36 = var45;
                     ++var9;
                  }
               }

               if (var10000 == 0) {
                  if (~var25 > -1) {
                     var25 += var36;
                     var24 += var32;
                     var36 += var29;
                     ++var9;
                     var32 += var29;
                  }
               } else {
                  label258: {
                     if (~var26 > -1) {
                        if (var8) {
                           var27 += var38;
                           var26 += var34;
                           var34 += var31;
                           var38 += var31;
                           ++var11;
                        }
                     } else {
                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           if (~var25 > -1) {
                              var25 += var36;
                              var24 += var32;
                              var36 += var29;
                              ++var9;
                              var32 += var29;
                           }
                           break label258;
                        }

                        var38 = var27;
                        ++var11;
                     }

                     while(true) {
                        while(var26 < 0) {
                           var27 += var38;
                           var26 += var34;
                           var34 += var31;
                           var38 += var31;
                           ++var11;
                        }

                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              var38 += var31;
                              ++var11;
                              var34 += var31;
                           }

                           var27 += -var35;
                           var26 += -var39;
                           var35 -= var30;
                           var39 -= var30;
                           if (~var25 > -1) {
                              var25 += var36;
                              var24 += var32;
                              var36 += var29;
                              ++var9;
                              var32 += var29;
                           }
                           break;
                        }

                        var38 = var27;
                        ++var11;
                     }
                  }
               }

               var24 += -var37;
               var25 += -var33;
               var37 -= var28;
               var33 -= var28;
               --var10;
               int var46 = -var10 + arg5;
               int var47 = arg5 + var10;
               if (var47 >= class3.field16) {
                  var10000 = ~class581.field8354;
                  int var10001 = ~var46;
                  if (var8) {
                     var10000 = var10000 < var10001 ? 0 : 1;
                     continue;
                  }

                  if (var10000 <= var10001) {
                     int var48 = class741.method5346(arg4 + var9, class515.field7502, class130.field2163, -1);
                     int var49 = class741.method5346(arg4 - var9, class515.field7502, class130.field2163, -1);
                     int var50;
                     int var51;
                     int[] var52;
                     int[] var53;
                     if (var45 == 0) {
                        if (~var46 <= ~class3.field16) {
                           class18.method132(false, var49, var48, arg3, class448.field6542[var46]);
                        }

                        if (~var47 >= ~class581.field8354) {
                           class18.method132(false, var49, var48, arg3, class448.field6542[var47]);
                           if (var8) {
                              var50 = class741.method5346(arg4 + var11, class515.field7502, class130.field2163, -1);
                              var51 = class741.method5346(-var11 + arg4, class515.field7502, class130.field2163, arg0);
                              if (class3.field16 <= var46) {
                                 var52 = class448.field6542[var46];
                                 class18.method132(false, var49, var51, arg3, var52);
                                 class18.method132(false, var51, var50, arg6, var52);
                                 class18.method132(false, var50, var48, arg3, var52);
                              }

                              if (class581.field8354 >= var47) {
                                 var53 = class448.field6542[var47];
                                 class18.method132(false, var49, var51, arg3, var53);
                                 class18.method132(false, var51, var50, arg6, var53);
                                 class18.method132(false, var50, var48, arg3, var53);
                              }
                           }
                        }
                     } else {
                        var50 = class741.method5346(arg4 + var11, class515.field7502, class130.field2163, -1);
                        var51 = class741.method5346(-var11 + arg4, class515.field7502, class130.field2163, arg0);
                        if (class3.field16 <= var46) {
                           var52 = class448.field6542[var46];
                           class18.method132(false, var49, var51, arg3, var52);
                           class18.method132(false, var51, var50, arg6, var52);
                           class18.method132(false, var50, var48, arg3, var52);
                        }

                        if (class581.field8354 >= var47) {
                           var53 = class448.field6542[var47];
                           class18.method132(false, var49, var51, arg3, var53);
                           class18.method132(false, var51, var50, arg6, var53);
                           class18.method132(false, var50, var48, arg3, var53);
                        }
                     }
                  }
               }

               if (~var10 >= -1) {
                  return;
               }

               var10000 = ~var10 < ~var13 ? 0 : 1;
            }
         }
      } catch (RuntimeException var55) {
         throw class608.method4462(var55, field7074[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field7069;
         super.field4913 = arg0;
         if (arg1 <= 99) {
            field7067 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7074[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         label26: {
            ++field7072;
            if (super.field4914.method5561(arg0 + arg0) != class459.field6730) {
               super.field4913 = 1;
               if (!client.field4564) {
                  break label26;
               }
            }

            if (super.field4914.method5560(arg0 ^ 13750)) {
               super.field4913 = 0;
            }
         }

         if (~super.field4913 != -1 && ~super.field4913 != -2) {
            super.field4913 = this.method53(false);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7074[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method3674(boolean arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7062;
         if (arg0) {
            if (~class277.field3907 != 0) {
               class17.method128((byte)49, class277.field3907);
            }

            int var10000;
            label69: {
               class719 var3 = (class719)class520.field7582.method1567((byte)-44);
               if (var2) {
                  var10000 = var3.method156(false);
               } else if (var3 == null) {
                  class277.field3907 = -1;
                  class520.field7582 = new class178(8);
                  class17.method121(false);
                  class277.field3907 = class5.field56;
                  class715.method5185(false, arg1 + 755203468);
                  class585.method4337((byte)-20);
                  var10000 = class277.field3907;
                  if (!var2) {
                     break label69;
                  }
               } else {
                  var10000 = var3.method156(false);
               }

               label68:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class719)class520.field7582.method1567((byte)-44);
                        if (var3 == null) {
                           if (!var2) {
                              class277.field3907 = -1;
                              class520.field7582 = new class178(8);
                              class17.method121(false);
                              class277.field3907 = class5.field56;
                              class715.method5185(false, arg1 + 755203468);
                              class585.method4337((byte)-20);
                              var10000 = class277.field3907;
                              break;
                           }

                           class242.method1970((byte)118, var3, true, false);
                           var3 = (class719)class520.field7582.method1575((byte)-118);
                        } else {
                           class242.method1970((byte)118, var3, true, false);
                           var3 = (class719)class520.field7582.method1575((byte)-118);
                        }
                     } else {
                        class242.method1970((byte)118, var3, true, false);
                        var3 = (class719)class520.field7582.method1575((byte)-118);
                     }

                     if (var3 == null) {
                        class277.field3907 = -1;
                        class520.field7582 = new class178(8);
                        class17.method121(false);
                        class277.field3907 = class5.field56;
                        class715.method5185(false, arg1 + 755203468);
                        class585.method4337((byte)-20);
                        var10000 = class277.field3907;
                        if (!var2) {
                           break label68;
                        }
                     } else {
                        var10000 = var3.method156(false);
                     }
                  }
               } while(var2);
            }

            class161.method1468(var10000);
         }

         class242.method1973((byte)-126);
         if (arg1 != -755203543) {
            field7067 = null;
         }

         label36: {
            class533.field7764 = false;
            class551.method4108((byte)61);
            class135.field2225 = -1;
            class250.method2027(class396.field5817, 0);
            class304.field4398 = new class457();
            class304.field4398.field4101 = class209.field3112 * 512 / 2;
            class304.field4398.field11313[0] = class209.field3112 / 2;
            class304.field4398.field4096 = class1.field3 * 512 / 2;
            class304.field4398.field11322[0] = class1.field3 / 2;
            class677.field9932 = 0;
            class583.field8442 = 0;
            if (class590.field8514 != 2) {
               class106.method1028(3);
               if (!var2) {
                  break label36;
               }
            }

            class677.field9932 = class39.field931 << 9;
            class583.field8442 = class417.field6103 << 9;
         }

         class681.method4967(-1);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7074[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method3675(String arg0, char arg1, String arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field7066;
         int var5 = arg0.length();
         int var6 = arg2.length();
         int var7 = var5;
         int var8 = var6 - 1;
         if (~var8 != -1) {
            int var9 = 0;

            do {
               var9 = arg0.indexOf(arg1, var9);
               if (~var9 > -1) {
                  break;
               }

               var7 += var8;
               ++var9;
            } while(!var4);
         }

         StringBuffer var10 = new StringBuffer(var7);
         int var11 = arg3;

         while(true) {
            int var12 = arg0.indexOf(arg1, var11);
            if (var12 >= 0) {
               var10.append(arg0.substring(var11, var12));
               var11 = var12 + 1;
               var10.append(arg2);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            var10.append(arg0.substring(var11));
            break;
         }

         return var10.toString();
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7074[6] + (arg0 != null ? field7074[4] : field7074[5]) + ',' + arg1 + ',' + (arg2 != null ? field7074[4] : field7074[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class486(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3676(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3677(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
