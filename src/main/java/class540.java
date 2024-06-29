import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class540 {
   @OriginalMember(
      owner = "client!dk",
      name = "k",
      descriptor = "Ltv;"
   )
   private class590 field7375 = new class590(256);
   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "Lqh;"
   )
   private class74 field7378;
   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7384 = new String[]{method3908(method3907("n@\u001e\"=")), method3908(method3907("d^\\\n")), method3908(method3907("q\u0005\u001eHh")), method3908(method3907("n@\u001eZ|dBDX=")), method3908(method3907("n@\u001e!=")), method3908(method3907("n@\u001e =")), method3908(method3907("n@\u001e%=")), method3908(method3907("n@\u001e/=")), method3908(method3907("n@\u001e'=")), method3908(method3907("n@\u001e,=")), method3908(method3907("n@\u001e$=")), method3908(method3907("n@\u001e.="))};
   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field7380 = new int[2];
   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "I"
   )
   public static int field7373;
   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "I"
   )
   public static int field7374;
   @OriginalMember(
      owner = "client!dk",
      name = "h",
      descriptor = "I"
   )
   public static int field7376;
   @OriginalMember(
      owner = "client!dk",
      name = "g",
      descriptor = "I"
   )
   public static int field7377;
   @OriginalMember(
      owner = "client!dk",
      name = "j",
      descriptor = "I"
   )
   public static int field7379;
   @OriginalMember(
      owner = "client!dk",
      name = "f",
      descriptor = "I"
   )
   public static int field7381;
   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "I"
   )
   public static int field7382;
   @OriginalMember(
      owner = "client!dk",
      name = "i",
      descriptor = "I"
   )
   public static int field7383;

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3897(byte arg0) {
      try {
         if (arg0 != 1) {
            method3902(-73);
         }

         field7380 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7384[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(II)Lpe;"
   )
   public final class639 method3898(int arg0, int arg1) {
      try {
         ++field7374;
         class590 var3 = this.field7375;
         class639 var4;
         synchronized(this.field7375) {
            var4 = (class639)this.field7375.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field7378;
            byte[] var7;
            synchronized(this.field7378) {
               int var6 = -13 % ((-80 - arg0) / 42);
               var7 = this.field7378.method732(arg1, 26, (byte)96);
            }

            class639 var8 = new class639();
            if (var7 != null) {
               var8.method4626(99, new class594(var7));
            }

            class590 var9 = this.field7375;
            synchronized(this.field7375) {
               this.field7375.method4238(39, var8, (long)arg1);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7384[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3899(byte arg0) {
      try {
         if (arg0 != -15) {
            method3904(-66L, -34, -20, false);
         }

         class590 var2 = this.field7375;
         synchronized(this.field7375) {
            this.field7375.method4244(true);
         }

         ++field7377;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7384[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3900(byte arg0) {
      try {
         ++field7376;
         class590 var2 = this.field7375;
         synchronized(this.field7375) {
            this.field7375.method4245(true);
         }

         int var3 = 87 % ((arg0 - -48) / 33);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7384[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(ZIZ)V"
   )
   public static final void method3901(boolean arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            field7380 = null;
         }

         ++field7383;
         if (!arg0) {
            class16.method126(class579.field7940, arg1, -1);
         } else {
            class471 var3 = class133.method1118(class605.field8474.field2787, 2, class194.field2362);
            var3.field6527.method4284(arg1, -31429);
            class605.field8474.method1702((byte)-83, var3);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7384[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method3902(int arg0) {
      try {
         ++field7381;
         if (arg0 != 1) {
            method3897((byte)35);
         }

         return class134.field1746;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7384[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method3903(int arg0, int arg1) {
      class194 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class295 var4 = class144.field1906[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class304.field4042; ++var5) {
               for(int var6 = 0; var6 < class635.field8973; ++var6) {
                  var2 = var4.method1678(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class76.field965;
                     int var8 = var5 << class76.field965;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class295 var10 = class144.field1906[var9];
                        if (var10 != null) {
                           int var11 = var4.method2221(false, var5, var6) - var10.method2221(false, var5, var6);
                           int var12 = var4.method2221(false, var5, var6 + 1) - var10.method2221(false, var5, var6 + 1);
                           int var13 = var4.method2221(false, var5 + 1, var6 + 1) - var10.method2221(false, var5 + 1, var6 + 1);
                           int var14 = var4.method2221(false, var5 + 1, var6) - var10.method2221(false, var5 + 1, var6);
                           var10.method1683(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(JIIZ)Ljava/lang/String;"
   )
   public static final String method3904(long arg0, int arg1, int arg2, boolean arg3) {
      try {
         Calendar var5;
         label14: {
            ++field7382;
            if (arg3) {
               class168.method1322(arg0, arg2 ^ 115);
               var5 = class624.field8715;
               if (!client.field4273) {
                  break label14;
               }
            }

            class621.method4518((byte)-2, arg0);
            var5 = class624.field8714;
         }

         int var6 = var5.get(arg2);
         int var7 = var5.get(2) + 1;
         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field7384[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3905(int arg0, int arg1) {
      try {
         ++field7373;
         class590 var3 = this.field7375;
         synchronized(this.field7375) {
            this.field7375.method4234(2, arg0);
            int var4 = 25 / ((-53 - arg1) / 40);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7384[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IIII[BB)V"
   )
   public static final void method3906(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
      boolean var6 = client.field4273;

      try {
         ++field7379;
         if (arg3 < arg0) {
            arg1 = arg0 - arg3 >> 2;
            arg2 += arg3;
            int var9;
            if (var6) {
               var9 = arg2 + 1;
               arg4[arg2] = 1;
               int var10 = var9 + 1;
               arg4[var9] = 1;
               int var11 = var10 + 1;
               arg4[var10] = 1;
               arg2 = var11 + 1;
               arg4[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg1;
                  if (arg1 < 0) {
                     arg1 = 3 & -arg3 + arg0;
                     if (!var6) {
                        if (var6) {
                           arg4[arg2++] = 1;
                        }

                        while(true) {
                           --arg1;
                           if (arg1 < 0) {
                              if (arg5 > -49) {
                                 field7380 = null;
                                 return;
                              }

                              return;
                           }

                           arg4[arg2++] = 1;
                        }
                     }

                     arg4[arg2++] = 1;
                  } else {
                     var9 = arg2 + 1;
                     arg4[arg2] = 1;
                     arg4[var9++] = 1;
                     arg4[var9++] = 1;
                     arg2 = var9 + 1;
                     arg4[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7384[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7384[2] : field7384[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class540(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field7378 = arg2;
         this.field7378.method727(26, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7384[3] + (arg0 != null ? field7384[2] : field7384[1]) + ',' + arg1 + ',' + (arg2 != null ? field7384[2] : field7384[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3907(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3908(char[] arg0) {
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
            var10005 = 43;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
