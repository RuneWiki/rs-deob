import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class305 extends class22 {
   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4420 = new String[]{method2393(method2392("\u00020\u001eDv")), method2393(method2392("\u001b3Fhp\u001d3^np#'^}7\u001c7")), method2393(method2392("\u00020\u001eXv")), method2393(method2392("\u0010$Q`2\u00100\\l\u000e\u0003=Sl-\u0002=Bz")), method2393(method2392("\u00020\u001eFv")), method2393(method2392("\u00020\u001eGv")), method2393(method2392("\u00020\u001e[v")), method2393(method2392("\u00020\u001eYv"))};
   @OriginalMember(
      owner = "client!sb",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field4411 = new class572(84, -1);
   @OriginalMember(
      owner = "client!sb",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field4415 = new class572(47, 6);
   @OriginalMember(
      owner = "client!sb",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field4418 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!sb",
      name = "n",
      descriptor = "I"
   )
   public static int field4409;
   @OriginalMember(
      owner = "client!sb",
      name = "p",
      descriptor = "I"
   )
   public static int field4410;
   @OriginalMember(
      owner = "client!sb",
      name = "l",
      descriptor = "I"
   )
   public static int field4413;
   @OriginalMember(
      owner = "client!sb",
      name = "o",
      descriptor = "I"
   )
   public static int field4414;
   @OriginalMember(
      owner = "client!sb",
      name = "k",
      descriptor = "I"
   )
   public static int field4417;
   @OriginalMember(
      owner = "client!sb",
      name = "q",
      descriptor = "J"
   )
   public long field4416;
   @OriginalMember(
      owner = "client!sb",
      name = "j",
      descriptor = "Lsb;"
   )
   public class305 field4408;
   @OriginalMember(
      owner = "client!sb",
      name = "r",
      descriptor = "Lsb;"
   )
   public class305 field4412;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!sb",
      name = "u",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4419;

   @OriginalMember(
      owner = "client!sb",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method2385(int arg0) {
      try {
         ++field4410;
         if (this.field4408 != null) {
            if (arg0 != 117) {
               method2388(-111);
            }

            this.field4408.field4412 = this.field4412;
            this.field4412.field4408 = this.field4408;
            this.field4412 = null;
            this.field4408 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4420[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(BI)V"
   )
   public static final void method2386(byte arg0, int arg1) {
      try {
         if (arg0 < 94) {
            method2390(21);
         }

         class637.field9300 = arg1;
         ++field4413;
         class283.field3959.method1589((byte)69);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4420[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(CBI)C"
   )
   public static final char method2387(char arg0, byte arg1, int arg2) {
      try {
         ++field4414;
         if (arg1 != 18) {
            field4418 = null;
         }

         if (arg0 >= 192 && arg0 <= 255) {
            if (~arg0 <= -193 && arg0 <= 198) {
               return 'A';
            }

            if (~arg0 == -200) {
               return 'C';
            }

            if (arg0 >= 200 && ~arg0 >= -204) {
               return 'E';
            }

            if (arg0 >= 204 && arg0 <= 207) {
               return 'I';
            }

            if (~arg0 <= -211 && arg0 <= 214) {
               return 'O';
            }

            if (~arg0 <= -218 && ~arg0 >= -221) {
               return 'U';
            }

            if (arg0 == 221) {
               return 'Y';
            }

            if (~arg0 == -224) {
               return 's';
            }

            if (arg0 >= 224 && arg0 <= 230) {
               return 'a';
            }

            if (~arg0 == -232) {
               return 'c';
            }

            if (arg0 >= 232 && ~arg0 >= -236) {
               return 'e';
            }

            if (arg0 >= 236 && ~arg0 >= -240) {
               return 'i';
            }

            if (arg0 >= 242 && arg0 <= 246) {
               return 'o';
            }

            if (~arg0 <= -250 && arg0 <= 252) {
               return 'u';
            }

            if (arg0 == 253 || arg0 == 255) {
               return 'y';
            }
         }

         if (~arg0 == -339) {
            return 'O';
         } else if (arg0 == 339) {
            return 'o';
         } else if (arg0 == 376) {
            return 'Y';
         } else {
            return arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4420[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2388(int arg0) {
      try {
         if (arg0 != 207) {
            field4418 = null;
         }

         field4411 = null;
         field4415 = null;
         field4418 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4420[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method2389(int arg0) {
      try {
         ++field4417;
         if (this.field4408 == null) {
            return false;
         } else {
            return arg0 <= -9;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4420[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method2390(int arg0) {
      try {
         try {
            Method var1 = (field4419 != null ? field4419 : (field4419 = method2391(field4420[1]))).getMethod(field4420[3]);
            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class463.field6773 = var3;
               } catch (Throwable var5) {
               }
            }
         } catch (Exception var6) {
         }

         ++field4409;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4420[2] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2391(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2392(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2393(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
