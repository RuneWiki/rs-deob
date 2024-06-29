import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class150 {
   @OriginalMember(
      owner = "client!hc",
      name = "k",
      descriptor = "Lida;"
   )
   private class246 field2412 = new class246();
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2417 = new String[]{method1405(method1404("\u0001!Q\u001a'")), method1405(method1404("\u0001!Q\u0016'")), method1405(method1404("\u0001!Q\u0014'")), method1405(method1404("\u0001!Q\u001d'")), method1405(method1404("\u0001!Q\u001e'")), method1405(method1404("\u0001!Q\u0019'")), method1405(method1404("\u0012lQrr")), method1405(method1404("\u0001!Q\u0018'")), method1405(method1404("\u00077\u00130")), method1405(method1404("\u0001!Q\u001b'")), method1405(method1404("\u0001!Q`f\u0007+\u000bb'")), method1405(method1404("\u0001!Q\u001f'")), method1405(method1404("\u0001!Q\u0015'"))};
   @OriginalMember(
      owner = "client!hc",
      name = "f",
      descriptor = "[[I"
   )
   public static int[][] field2406 = new int[6][];
   @OriginalMember(
      owner = "client!hc",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field2400 = new int[1];
   @OriginalMember(
      owner = "client!hc",
      name = "n",
      descriptor = "Leb;"
   )
   public static class650 field2408 = new class650(13, 5);
   @OriginalMember(
      owner = "client!hc",
      name = "i",
      descriptor = "I"
   )
   public static int field2416 = 0;
   @OriginalMember(
      owner = "client!hc",
      name = "j",
      descriptor = "I"
   )
   public static int field2401;
   @OriginalMember(
      owner = "client!hc",
      name = "h",
      descriptor = "I"
   )
   public static int field2402;
   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "I"
   )
   public static int field2403;
   @OriginalMember(
      owner = "client!hc",
      name = "g",
      descriptor = "I"
   )
   public static int field2404;
   @OriginalMember(
      owner = "client!hc",
      name = "o",
      descriptor = "I"
   )
   public static int field2405;
   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "I"
   )
   public static int field2407;
   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "I"
   )
   public static int field2409;
   @OriginalMember(
      owner = "client!hc",
      name = "l",
      descriptor = "I"
   )
   public static int field2410;
   @OriginalMember(
      owner = "client!hc",
      name = "e",
      descriptor = "I"
   )
   public static int field2411;
   @OriginalMember(
      owner = "client!hc",
      name = "d",
      descriptor = "I"
   )
   public static int field2413;
   @OriginalMember(
      owner = "client!hc",
      name = "p",
      descriptor = "Lida;"
   )
   private class246 field2415;
   @OriginalMember(
      owner = "client!hc",
      name = "q",
      descriptor = "[Ltd;"
   )
   public static class476[] field2414;

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(B)Lida;",
      line = 3
   )
   public final class246 method1394(byte arg0) {
      try {
         ++field2405;
         class246 var2 = this.field2412.field3536;
         if (this.field2412 == var2) {
            this.field2415 = null;
            return null;
         } else if (arg0 >= -112) {
            return null;
         } else {
            this.field2415 = var2.field3536;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2417[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public final void method1395(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 >= 0) {
            while(true) {
               class246 var3 = this.field2412.field3536;
               if (this.field2412 != var3) {
                  var3.method1995((byte)35);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }
               }

               ++field2410;
               this.field2415 = null;
               break;
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2417[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "(B)I",
      line = 51
   )
   public final int method1396(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2403;
         int var3 = 0;
         class246 var4 = this.field2412.field3536;
         if (arg0 >= -103) {
            this.method1395(-60);
            if (var2) {
               ++var3;
               var4 = var4.field3536;
            }
         }

         while(true) {
            if (this.field2412 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field3536;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2417[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(I)Lida;",
      line = 80
   )
   public final class246 method1397(int arg0) {
      try {
         ++field2411;
         class246 var2 = this.field2412.field3536;
         if (this.field2412 == var2) {
            return null;
         } else {
            var2.method1995((byte)35);
            return arg0 != 22527 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2417[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(ZLida;)V",
      line = 98
   )
   public final void method1398(boolean arg0, class246 arg1) {
      try {
         if (arg0) {
            if (arg1.field3534 != null) {
               arg1.method1995((byte)35);
            }

            ++field2407;
            arg1.field3534 = this.field2412.field3534;
            arg1.field3536 = this.field2412;
            arg1.field3534.field3536 = arg1;
            arg1.field3536.field3534 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2417[7] + arg0 + ',' + (arg1 != null ? field2417[6] : field2417[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIIZ)Lhw;",
      line = 116
   )
   public static final class141 method1399(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field2402;
         class653 var4 = null;
         if (class326.field4680 != null) {
            var4 = new class653(arg2, class326.field4680, class296.field4153[arg2], 1000000);
         }

         class478.field6964[arg2] = class775.field11347.method3379(arg2, var4, -123, class550.field7940);
         class478.field6964[arg2].method756((byte)-1);
         if (arg1 >= -52) {
            field2408 = null;
         }

         return new class141(class478.field6964[arg2], arg3, arg0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2417[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(Z)Lida;",
      line = 138
   )
   public final class246 method1400(boolean arg0) {
      try {
         ++field2404;
         class246 var2 = this.field2415;
         if (arg0) {
            return null;
         } else if (this.field2412 == var2) {
            this.field2415 = null;
            return null;
         } else {
            this.field2415 = var2.field3536;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2417[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "(I)V",
      line = 158
   )
   public static void method1401(int arg0) {
      try {
         field2400 = null;
         field2408 = null;
         if (arg0 != 6) {
            method1399(-44, 64, 77, false);
         }

         field2406 = null;
         field2414 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2417[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Z)Z",
      line = 173
   )
   public final boolean method1402(boolean arg0) {
      try {
         ++field2409;
         if (arg0) {
            return false;
         } else {
            return this.field2412.field3536 == this.field2412;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2417[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(B)Lida;",
      line = 185
   )
   public final class246 method1403(byte arg0) {
      try {
         ++field2401;
         class246 var2 = this.field2412.field3534;
         if (arg0 != 35) {
            field2406 = null;
         }

         if (this.field2412 == var2) {
            this.field2415 = null;
            return null;
         } else {
            this.field2415 = var2.field3534;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2417[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "<init>",
      descriptor = "()V",
      line = 221
   )
   public class150() {
      try {
         this.field2412.field3534 = this.field2412;
         this.field2412.field3536 = this.field2412;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2417[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1404(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1405(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
