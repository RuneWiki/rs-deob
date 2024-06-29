import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class150 {
   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "Liw;"
   )
   private class107 field2317 = new class107(16);
   @OriginalMember(
      owner = "client!rba",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field2309;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2321 = new String[]{method1469(method1468("\u000f\u0014Q\u00127U")), method1469(method1468("\u0006X\u001e\u0012\b")), method1469(method1468("\u0013\u0003\\P")), method1469(method1468("\u000f\u0014Q\u0012I\u0014\u0018YHKU")), method1469(method1468("\u000f\u0014Q\u00121U")), method1469(method1468("\u0017\u0017F][\u0011\u0017^[[/\u0003^H\u001c\u0010\u0013")), method1469(method1468("\u0010\u0017Hq\u0010\u0010\u0019BE")), method1469(method1468("\u000f\u0014Q\u00122U")), method1469(method1468("\u000f\u0014Q\u00124U")), method1469(method1468("\u000f\u0014Q\u00126U")), method1469(method1468("\u000f\u0014Q\u0012<U")), method1469(method1468("\u000f\u0014Q\u00123U")), method1469(method1468("\u000f\u0014Q\u00120U")), method1469(method1468("\u000f\u0014Q\u0012?U")), method1469(method1468("\u000f\u0014Q\u0012=U"))};
   @OriginalMember(
      owner = "client!rba",
      name = "e",
      descriptor = "I"
   )
   public static int field2313 = 0;
   @OriginalMember(
      owner = "client!rba",
      name = "j",
      descriptor = "Lfm;"
   )
   public static class164 field2308 = new class164(14, 15);
   @OriginalMember(
      owner = "client!rba",
      name = "n",
      descriptor = "I"
   )
   public static int field2307;
   @OriginalMember(
      owner = "client!rba",
      name = "h",
      descriptor = "I"
   )
   public static int field2310;
   @OriginalMember(
      owner = "client!rba",
      name = "m",
      descriptor = "I"
   )
   public static int field2311;
   @OriginalMember(
      owner = "client!rba",
      name = "l",
      descriptor = "I"
   )
   public static int field2312;
   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "I"
   )
   public static int field2314;
   @OriginalMember(
      owner = "client!rba",
      name = "f",
      descriptor = "I"
   )
   public static int field2315;
   @OriginalMember(
      owner = "client!rba",
      name = "d",
      descriptor = "I"
   )
   public static int field2316;
   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "I"
   )
   public static int field2318;
   @OriginalMember(
      owner = "client!rba",
      name = "k",
      descriptor = "I"
   )
   public static int field2319;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!rba",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2320;

   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "(II)Leb;"
   )
   private final class230 method1457(int arg0, int arg1) {
      try {
         ++field2312;
         class107 var3 = this.field2317;
         class230 var4;
         synchronized(this.field2317) {
            var4 = (class230)this.field2317.method1041((long)arg1, 8);
            if (arg0 != -23666) {
               this.field2317 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field2309;
            byte[] var6;
            synchronized(this.field2309) {
               var6 = this.field2309.method460((byte)-11, arg1, 29);
            }

            class230 var7 = new class230();
            if (var6 != null) {
               var7.method2047(new class65(var6), -1);
            }

            class107 var8 = this.field2317;
            synchronized(this.field2317) {
               this.field2317.method1050(-89, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2321[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(Lafa;IIIII)Lnf;"
   )
   public final class773 method1458(class619 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field2315;
         class754[] var8 = null;
         if (arg4 != 0) {
            return null;
         } else {
            class230 var9 = this.method1457(-23666, arg1);
            if (var9.field3572 != null) {
               var8 = new class754[var9.field3572.length];
               int var10 = 0;
               if (var7 || ~var10 > ~var8.length) {
                  do {
                     class320 var11 = arg0.method4567(var9.field3572[var10], -73);
                     var8[var10] = new class754(var11.field4787, var11.field4782, var11.field4780, var11.field4786, var11.field4778, var11.field4789, var11.field4788, var11.field4775, var11.field4784, var11.field4785, var11.field4781);
                     ++var10;
                  } while(~var10 > ~var8.length);
               }
            }

            return new class773(var9.field3573, var8, var9.field3574, arg5, arg2, arg3, var9.field3581, var9.field3578);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2321[13] + (arg0 != null ? field2321[1] : field2321[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1459(byte arg0) {
      try {
         ++field2310;
         if (arg0 > -73) {
            this.method1457(-121, 59);
         }

         class107 var2 = this.field2317;
         synchronized(this.field2317) {
            this.field2317.method1045(3);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2321[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1460(byte arg0) {
      try {
         field2308 = null;
         if (arg0 <= 19) {
            method1463(-3, 9, -59);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2321[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(IILjava/net/Socket;)Lup;"
   )
   public static final class533 method1461(int arg0, int arg1, Socket arg2) throws IOException {
      try {
         if (arg0 != 0) {
            field2308 = null;
         }

         ++field2316;
         return new class313(arg2, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2321[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2321[1] : field2321[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1462(int arg0, int arg1) {
      try {
         ++field2307;
         if (arg0 == 0) {
            class107 var3 = this.field2317;
            synchronized(this.field2317) {
               this.field2317.method1048(arg1, -8543);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2321[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1463(int arg0, int arg1, int arg2) {
      try {
         ++field2311;
         if (arg1 != -1) {
            method1466(98, (class82)null);
         }

         return ~(55 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2321[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1464(int arg0) {
      try {
         ++field2318;
         class107 var2 = this.field2317;
         synchronized(this.field2317) {
            if (arg0 == 0) {
               this.field2317.method1052(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2321[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1465(byte arg0) {
      try {
         label34: {
            ++field2319;
            if (class720.field10318.field1291) {
               class654.field9274 = 96;
               if (!client.field10022) {
                  break label34;
               }
            }

            try {
               Method var1 = (field2320 != null ? field2320 : (field2320 = method1467(field2321[5]))).getMethod(field2321[6]);
               if (var1 != null) {
                  try {
                     Runtime var2 = Runtime.getRuntime();
                     Long var3 = (Long)var1.invoke(var2, (Object[])null);
                     class654.field9274 = (int)(var3 / 1048576L) - -1;
                  } catch (Throwable var5) {
                  }
               }
            } catch (Exception var6) {
            }
         }

         if (arg0 != 76) {
            method1465((byte)-9);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2321[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILfea;)[Llg;"
   )
   public static final class655[] method1466(int arg0, class82 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2314;
         if (!arg1.method867(false)) {
            return new class655[0];
         } else {
            class92 var3 = arg1.method868((byte)-127);
            if (var2) {
               class97.method968(32353, 10L);
            }

            while(true) {
               int var10000;
               if (var3.field1526 != 0) {
                  var10000 = ~var3.field1526;
                  if (!var2) {
                     if (var10000 == -3) {
                        return new class655[0];
                     }

                     int[] var4 = (int[])var3.field1525;
                     class655[] var5 = new class655[var4.length >> 2];
                     if (arg0 <= 117) {
                        field2308 = null;
                     }

                     int var6 = 0;
                     if (!var2 && var6 >= var5.length) {
                        return var5;
                     }

                     do {
                        class655 var7 = new class655();
                        var5[var6] = var7;
                        var7.field9282 = var4[var6 << 2];
                        var7.field9281 = var4[(var6 << 2) - -1];
                        var7.field9283 = var4[(var6 << 2) + 2];
                        var7.field9284 = var4[(var6 << 2) + 3];
                        ++var6;
                     } while(var6 < var5.length);

                     return var5;
                  }
               } else {
                  var10000 = 32353;
               }

               class97.method968(var10000, 10L);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2321[7] + arg0 + ',' + (arg1 != null ? field2321[1] : field2321[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class150(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field2309 = arg2;
         this.field2309.method434((byte)-106, 29);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2321[3] + (arg0 != null ? field2321[1] : field2321[2]) + ',' + arg1 + ',' + (arg2 != null ? field2321[1] : field2321[2]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1467(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
