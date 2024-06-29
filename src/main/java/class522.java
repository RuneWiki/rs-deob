import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class522 extends InputStream {
   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7509 = new String[]{method3794(method3793("\u0004=\"}\n")), method3794(method3793("\u0004=\"z\n")), method3794(method3793("\u0015q\"\u0017_")), method3794(method3793("\u0000*`U")), method3794(method3793("\u0004=\"x\n")), method3794(method3793("\u00009")), method3794(method3793("\u0004=\"KG\u000f;$")), method3794(method3793("\u0004=\"{\n")), method3794(method3793("&6h]G\u0000r")), method3794(method3793("\u0004=\"|\n"))};
   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "Lll;"
   )
   public static class387 field7503 = new class387();
   @OriginalMember(
      owner = "client!jb",
      name = "d",
      descriptor = "I"
   )
   public static int field7500;
   @OriginalMember(
      owner = "client!jb",
      name = "g",
      descriptor = "I"
   )
   public static int field7501;
   @OriginalMember(
      owner = "client!jb",
      name = "i",
      descriptor = "I"
   )
   public static int field7504;
   @OriginalMember(
      owner = "client!jb",
      name = "h",
      descriptor = "I"
   )
   public static int field7505;
   @OriginalMember(
      owner = "client!jb",
      name = "f",
      descriptor = "I"
   )
   public static int field7506;
   @OriginalMember(
      owner = "client!jb",
      name = "c",
      descriptor = "I"
   )
   public static int field7507;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jb",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7508;
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7502;

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(IBIIIIIILha;)V"
   )
   public static final void method3787(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class66 arg8) {
      boolean var9 = client.field4360;

      try {
         ++field7501;
         class604 var10 = (class604)class45.method381(arg3, arg4, arg2);
         if (var10 != null) {
            label188: {
               class259 var11 = class387.field5618.method3977(var10.method236(28154), (byte)75);
               int var12 = 3 & var10.method252((byte)6);
               int var13 = var10.method237(114);
               if (~var11.field3554 != 0) {
                  class106.method867(arg8, arg0, var11, arg5, var12, 27040);
                  if (!var9) {
                     break label188;
                  }
               }

               int var14 = arg7;
               if (var11.field3587 > 0) {
                  var14 = arg6;
               }

               if (~var13 == -1 || var13 == 2) {
                  label183: {
                     if (~var12 == -1) {
                        arg8.method585(arg0, arg5, true, 4, var14);
                        if (!var9) {
                           break label183;
                        }
                     }

                     if (var12 != 1) {
                        if (var12 == 2) {
                           arg8.method585(arg0, arg5 + 3, true, 4, var14);
                           if (!var9) {
                              break label183;
                           }
                        }

                        if (~var12 != -4) {
                           break label183;
                        }

                        arg8.method603(4, var14, 1, arg5, arg0 - -3);
                        if (!var9) {
                           break label183;
                        }
                     }

                     arg8.method603(4, var14, 1, arg5, arg0);
                  }
               }

               if (var13 == 3) {
                  label180: {
                     if (~var12 != -1) {
                        if (var12 == 1) {
                           arg8.method533(var14, arg5 + 3, arg0, 1, (byte)121, 1);
                           if (!var9) {
                              break label180;
                           }
                        }

                        if (var12 != 2) {
                           if (var12 != 3) {
                              break label180;
                           }

                           arg8.method533(var14, arg5, arg0 + 3, 1, (byte)56, 1);
                           if (!var9) {
                              break label180;
                           }
                        }

                        arg8.method533(var14, arg5 - -3, arg0 - -3, 1, (byte)35, 1);
                        if (!var9) {
                           break label180;
                        }
                     }

                     arg8.method533(var14, arg5, arg0, 1, (byte)44, 1);
                  }
               }

               if (var13 == 2) {
                  label178: {
                     if (var12 == 0) {
                        arg8.method603(4, var14, 1, arg5, arg0);
                        if (!var9) {
                           break label178;
                        }
                     }

                     if (var12 == 1) {
                        arg8.method585(arg0, arg5 + 3, true, 4, var14);
                        if (!var9) {
                           break label178;
                        }
                     }

                     if (~var12 != -3) {
                        if (var12 != 3) {
                           break label178;
                        }

                        arg8.method585(arg0, arg5, true, 4, var14);
                        if (!var9) {
                           break label178;
                        }
                     }

                     arg8.method603(4, var14, 1, arg5, arg0 + 3);
                  }
               }
            }
         }

         class604 var15 = (class604)class691.method5042(arg3, arg4, arg2, field7508 != null ? field7508 : (field7508 = method3792(field7509[5])));
         if (arg1 < 31) {
            field7503 = null;
         }

         if (var15 != null) {
            label113: {
               class259 var16 = class387.field5618.method3977(var15.method236(28154), (byte)75);
               int var17 = var15.method252((byte)6) & 3;
               int var18 = var15.method237(107);
               if (~var16.field3554 != 0) {
                  class106.method867(arg8, arg0, var16, arg5, var17, 27040);
                  if (!var9) {
                     break label113;
                  }
               }

               if (var18 == 9) {
                  label179: {
                     int var19 = -1118482;
                     if (var16.field3587 > 0) {
                        var19 = -1179648;
                     }

                     if (~var17 != -1 && ~var17 != -3) {
                        arg8.method568((byte)-6, var19, arg0 + 3, arg5, arg5 + 3, arg0);
                        if (!var9) {
                           break label179;
                        }
                     }

                     arg8.method568((byte)-6, var19, arg0, arg5, arg5 - -3, arg0 + 3);
                  }
               }
            }
         }

         class604 var20 = (class604)class216.method1708(arg3, arg4, arg2);
         if (var20 != null) {
            class259 var21 = class387.field5618.method3977(var20.method236(28154), (byte)75);
            int var22 = var20.method252((byte)6) & 3;
            if (var21.field3554 != -1) {
               class106.method867(arg8, arg0, var21, arg5, var22, 27040);
               return;
            }
         }

      } catch (RuntimeException var24) {
         throw class237.method1823(var24, field7509[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7509[2] : field7509[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Lbl;BI)Ljava/lang/String;"
   )
   public static final String method3788(class678 arg0, byte arg1, int arg2) {
      try {
         ++field7504;
         if (arg1 >= -60) {
            field7503 = null;
         }

         if (!client.method2351(arg0).method2169(-1, arg2) && arg0.field9975 == null) {
            return null;
         } else if (arg0.field9938 != null && ~arg2 > ~arg0.field9938.length && arg0.field9938[arg2] != null && ~arg0.field9938[arg2].trim().length() != -1) {
            return arg0.field9938[arg2];
         } else {
            return class661.field9629 ? field7509[8] + arg2 : null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7509[9] + (arg0 != null ? field7509[2] : field7509[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3789(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field7505;
         if (arg0 != 4) {
            method3788((class678)null, (byte)123, -50);
         }

         int var2 = class390.field5657;
         int[] var3 = class254.field3459;
         int var4 = 0;
         if (var1 || var2 > var4) {
            do {
               class121 var5 = class380.field5483[var3[var4]];
               if (var5 != null) {
                  class336.method2473(-91, var5, var5.method972(-1));
               }

               ++var4;
            } while(var2 > var4);

         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7509[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(I[FZ)[F"
   )
   public static final float[] method3790(int arg0, float[] arg1, boolean arg2) {
      try {
         ++field7500;
         float[] var3 = new float[arg0];
         class242.method1852(arg1, 0, var3, 0, arg0);
         if (!arg2) {
            field7502 = null;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7509[1] + arg0 + ',' + (arg1 != null ? field7509[2] : field7509[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         class661.method4825(0, 30000L);
         ++field7507;
         return -1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7509[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3791(int arg0) {
      try {
         field7502 = null;
         int var1 = 4 % ((arg0 - -57) / 52);
         field7503 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7509[7] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jb",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3792(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
