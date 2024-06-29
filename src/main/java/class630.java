import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class630 {
   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9167 = new String[]{method4544(method4543("P=o`)")), method4544(method4543("P=of)")), method4544(method4543("Q=-N")), method4544(method4543("Dfo\f|")), method4544(method4543("P=og)")), method4544(method4543("\u001fea")), method4544(method4543("kza\u000f!")), method4544(method4543("P=oc)")), method4544(method4543("P=oa)"))};
   @OriginalMember(
      owner = "client!ou",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field9159 = true;
   @OriginalMember(
      owner = "client!ou",
      name = "i",
      descriptor = "I"
   )
   public static int field9166 = 0;
   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field9165 = new class101(44, 7);
   @OriginalMember(
      owner = "client!ou",
      name = "e",
      descriptor = "I"
   )
   public static int field9158;
   @OriginalMember(
      owner = "client!ou",
      name = "d",
      descriptor = "I"
   )
   public static int field9160;
   @OriginalMember(
      owner = "client!ou",
      name = "c",
      descriptor = "I"
   )
   public static int field9162;
   @OriginalMember(
      owner = "client!ou",
      name = "f",
      descriptor = "I"
   )
   public static int field9163;
   @OriginalMember(
      owner = "client!ou",
      name = "g",
      descriptor = "Lr;"
   )
   public class193 field9164;
   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "Lka;"
   )
   public class497 field9161;

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Laa;Lhv;JIIIIII)V"
   )
   public static final void method4538(class512 arg0, class544 arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field9160;
         int var10 = arg3 * arg3 + arg6 * arg6;
         if (~arg2 <= ~((long)var10)) {
            int var11 = Math.min(arg1.field7986 / 2, arg1.field7954 / arg5);
            if (var10 <= var11 * var11) {
               class22.method147(arg3, (byte)-97, arg0, arg7, class387.field5918[arg4], arg1, arg8, arg6);
            } else {
               int var12;
               label37: {
                  var11 -= 10;
                  if (~class675.field10142 != -5) {
                     var12 = (int)class56.field706 + class241.field3071 & 16383;
                     if (client.field4530 == 0) {
                        break label37;
                     }
                  }

                  var12 = (int)class56.field706 & 16383;
               }

               int var13 = class689.field10389[var12];
               int var14 = class689.field10391[var12];
               if (~class675.field10142 != -5) {
                  var13 = var13 * 256 / (class606.field8898 + 256);
                  var14 = var14 * 256 / (class606.field8898 + 256);
               }

               int var15 = arg3 * var14 + arg6 * var13 >> 14;
               int var16 = arg6 * var14 + -(arg3 * var13) >> 14;
               double var17 = Math.atan2((double)var15, (double)var16);
               int var19 = (int)((double)var11 * Math.sin(var17));
               int var20 = (int)(Math.cos(var17) * (double)var11);
               class159.field2016[arg4].method3029((float)arg1.field7986 / 2.0F + (float)arg7 + (float)var19, (float)arg1.field7954 / 2.0F + (float)arg8 - (float)var20, 4096, (int)(-var17 / 6.283185307179586D * 65535.0D));
            }
         }
      } catch (RuntimeException var22) {
         throw class670.method4877(var22, field9167[1] + (arg0 != null ? field9167[3] : field9167[2]) + ',' + (arg1 != null ? field9167[3] : field9167[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4539(int arg0, int arg1) {
      try {
         ++field9158;
         if (~arg0 > -1 || arg0 > 2) {
            arg0 = 0;
         }

         class467.field7001 = arg0;
         class659.field9557 = new class737[class124.field1513[class467.field7001] + 1];
         int var2 = 103 / ((-9 - arg1) / 42);
         class497.field7371 = 0;
         class621.field9053 = 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9167[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method4540(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (!arg0) {
            return true;
         } else {
            ++field9163;

            try {
               return class454.method3416(-2);
            } catch (IOException var6) {
               class365.method2833((byte)95);
               return true;
            } catch (Exception var7) {
               int var10000;
               byte var10001;
               label58: {
                  String var3;
                  label57: {
                     var3 = field9167[6] + (class239.field3045 == null ? -1 : class239.field3045.method883((byte)-25)) + "," + (class610.field8937 != null ? class610.field8937.method883((byte)-25) : -1) + "," + (class128.field1600 == null ? -1 : class128.field1600.method883((byte)-25)) + field9167[5] + class61.field759 + "," + (class718.field10676 - -class693.field10418.field6114[0]) + "," + (class693.field10418.field6116[0] + class669.field10064) + field9167[5];
                     int var4 = 0;
                     if (var1 == 0) {
                        if (~var4 <= ~class61.field759) {
                           break label57;
                        }

                        var10000 = ~var4;
                        var10001 = -51;
                        if (var1 != 0) {
                           break label58;
                        }

                        if (var10000 <= -51) {
                           break label57;
                        }
                     }

                     do {
                        var3 = var3 + class401.field6163.field1552[var4] + ",";
                        ++var4;
                        if (~var4 <= ~class61.field759) {
                           break;
                        }

                        var10000 = ~var4;
                        var10001 = -51;
                        if (var1 != 0) {
                           break label58;
                        }
                     } while(var10000 > -51);
                  }

                  class238.method1776(-15, var7, var3);
                  var10000 = 0;
                  var10001 = 0;
               }

               class434.method3301((boolean)var10000, var10001);
               return true;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9167[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4541(int arg0) {
      try {
         field9165 = null;
         if (arg0 != 32) {
            field9159 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9167[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(ZLjava/lang/String;IZ)V"
   )
   public static final void method4542(boolean arg0, String arg1, int arg2, boolean arg3) {
      int var4 = client.field4530;

      try {
         label266: {
            ++field9162;
            class559.method4144(55);
            if (~arg2 == -1) {
               class786.field11439 = class745.method5429(class204.field2629, 0, class552.field8190, class769.field11271, 2 * class261.field3566.field9435.method72(98), false);
               if (arg1 == null) {
                  break label266;
               }

               class786.field11439.method597(0);
               class763 var5 = class560.method4147(0, false, class712.field10625, class78.field979);
               class67 var6 = class786.field11439.method570(var5, class671.method4881(class521.field7580, class78.field979, 0), true);
               class415.method3172(-1);
               class183.method1433(var6, class786.field11439, 0, true, var5, arg1);
               if (var4 == 0) {
                  break label266;
               }
            }

            class66 var7 = null;
            if (arg1 != null) {
               var7 = class745.method5429(class204.field2629, 0, class552.field8190, class769.field11271, 0, false);
               var7.method597(0);
               class763 var8 = class560.method4147(0, !arg3, class712.field10625, class78.field979);
               class67 var9 = var7.method570(var8, class671.method4881(class521.field7580, class78.field979, 0), true);
               class415.method3172(-1);
               class183.method1433(var9, var7, 0, true, var8, arg1);
            }

            boolean var27 = false;

            label267: {
               try {
                  var27 = true;
                  class786.field11439 = class745.method5429(class204.field2629, arg2, class552.field8190, class769.field11271, 2 * class261.field3566.field9435.method72(99), false);
                  if (arg1 != null) {
                     var7.method597(0);
                     class763 var10 = class560.method4147(0, false, class712.field10625, class78.field979);
                     class67 var11 = var7.method570(var10, class671.method4881(class521.field7580, class78.field979, 0), true);
                     class415.method3172(-1);
                     class183.method1433(var11, var7, 0, true, var10, arg1);
                  }

                  if (class786.field11439.method544()) {
                     boolean var12 = true;

                     try {
                        var12 = ~class488.field7219.field9191 < -257;
                     } catch (Throwable var31) {
                     }

                     class434 var13;
                     label241: {
                        if (var12) {
                           var13 = class786.field11439.method592(146800640);
                           if (var4 == 0) {
                              break label241;
                           }
                        }

                        var13 = class786.field11439.method592(104857600);
                     }

                     class786.field11439.method596(var13);
                     var27 = false;
                  } else {
                     var27 = false;
                  }
                  break label267;
               } catch (Throwable var32) {
                  int var14 = class261.field3566.field9464.method4225(84);
                  if (var14 == 2) {
                     class255.field3392 = true;
                  }

                  class261.field3566.method4677(class261.field3566.field9464, 108, 0);
                  method4542(arg0, arg1, var14, arg3);
                  Object var10000 = null;
                  var27 = false;
               } finally {
                  if (var27) {
                     Object var19 = null;
                     if (var7 != null) {
                        try {
                           var7.method653(-120);
                        } catch (Throwable var29) {
                        }
                     }

                  }
               }

               if (var7 != null) {
                  try {
                     var7.method653(-120);
                  } catch (Throwable var28) {
                  }
               }

               return;
            }

            Object var18 = null;
            if (var7 != null) {
               try {
                  var7.method653(-120);
               } catch (Throwable var30) {
               }
            }
         }

         class261.field3566.field9464.method4227(!arg0, 104);
         class261.field3566.method4677(class261.field3566.field9464, 70, arg2);
         class674.method4918((byte)93);
         class786.field11439.method574(10000);
         class786.field11439.method646(32);
         class332.field4754 = class786.field11439.method559();
         class706.field10567 = class786.field11439.method559();
         class269.method2080((byte)82);
         class786.field11439.method582(class261.field3566.field9459.method1901(115) == 1);
         if (class786.field11439.method604()) {
            class241.method1794(27217, ~class261.field3566.field9443.method3922(99) == -2);
         }

         class429.method3270(1, class786.field11439, class323.field4603 >> 3, class178.field2197 >> 3);
         class239.method1784(1);
         class455.field6907 = false;
         class87.field1051 = null;
         class352.field5349 = arg3;
         class219.method1653((byte)23);
      } catch (RuntimeException var34) {
         throw class670.method4877(var34, field9167[8] + arg0 + ',' + (arg1 != null ? field9167[3] : field9167[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4543(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4544(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
