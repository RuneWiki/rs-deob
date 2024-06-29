import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class365 extends class55 {
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5013 = new String[]{method2727(method2726("@\u000e5'@\t")), method2727(method2726("@\u000e5'C\t")), method2727(method2726("@\u000e5'D\t")), method2727(method2726("@\u000e5'G\t")), method2727(method2726("@\u000e5'N\t")), method2727(method2726("@\u000e5'B\t")), method2727(method2726("ZFz'{")), method2727(method2726("O\u001d8e")), method2727(method2726("@\u000e5'L\t")), method2727(method2726("@\u000e5'O\t")), method2727(method2726("@\u000e5'A\t")), method2727(method2726("@\u000e5'E\t"))};
   @OriginalMember(
      owner = "client!afa",
      name = "e",
      descriptor = "I"
   )
   public static int field5003;
   @OriginalMember(
      owner = "client!afa",
      name = "l",
      descriptor = "I"
   )
   public static int field5004;
   @OriginalMember(
      owner = "client!afa",
      name = "k",
      descriptor = "I"
   )
   public static int field5005;
   @OriginalMember(
      owner = "client!afa",
      name = "m",
      descriptor = "I"
   )
   public static int field5007;
   @OriginalMember(
      owner = "client!afa",
      name = "h",
      descriptor = "I"
   )
   public static int field5008;
   @OriginalMember(
      owner = "client!afa",
      name = "j",
      descriptor = "I"
   )
   public static int field5009;
   @OriginalMember(
      owner = "client!afa",
      name = "f",
      descriptor = "I"
   )
   public static int field5010;
   @OriginalMember(
      owner = "client!afa",
      name = "n",
      descriptor = "I"
   )
   public static int field5011;
   @OriginalMember(
      owner = "client!afa",
      name = "i",
      descriptor = "I"
   )
   public static int field5012;
   @OriginalMember(
      owner = "client!afa",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5006;

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(IIIILha;ZII)V",
      line = 7
   )
   public static final void method2720(int arg0, int arg1, int arg2, int arg3, class66 arg4, boolean arg5, int arg6, int arg7) {
      try {
         ++field5007;
         if (arg5) {
            field5006 = null;
         }

         arg4.method533(arg7, arg2, arg6, arg0, (byte)91, arg3);
         arg4.method533(arg1, arg2 + 1, arg6 + 1, arg0 + -2, (byte)117, 16);
         arg4.method566(arg6 + 18, (byte)-119, arg2 - -1, arg0 + -2, arg1, arg3 + -19);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5013[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5013[6] : field5013[7]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 20
   )
   public class365(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 23
   )
   public class365(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(I)I",
      line = 27
   )
   public final int method101(int arg0) {
      try {
         ++field5011;
         if (arg0 > -116) {
            return -62;
         } else {
            return !super.field683.method3307(false).method4357(1) ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5013[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(ZB)I",
      line = 38
   )
   public static final int method2721(boolean arg0, byte arg1) {
      try {
         if (arg1 != 124) {
            return -90;
         } else {
            ++field5008;
            int var2 = class614.field9025;
            if (var2 != 0) {
               if (~var2 == -2) {
                  return class532.field7589;
               }

               if (~var2 != -3) {
                  return 0;
               }

               if (!client.field4360) {
                  return 0;
               }
            }

            return arg0 ? 0 : class532.field7589;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5013[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "d",
      descriptor = "(I)V",
      line = 82
   )
   public static final void method2722(int arg0) {
      try {
         class140.field1791 = -1;
         class755.field11185 = -1;
         ++field5012;
         if (arg0 == 11686) {
            class95.field1226 = 0;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5013[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(Lha;Z)V",
      line = 98
   )
   public static final void method2723(class66 arg0, boolean arg1) {
      try {
         label27: {
            ++field5003;
            if (class131.field1677) {
               class94.method811(3, arg0);
               if (!client.field4360) {
                  break label27;
               }
            }

            class274.method2092(-5132, arg0);
         }

         if (!arg1) {
            method2722(87);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5013[8] + (arg0 != null ? field5013[6] : field5013[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(IB)V",
      line = 113
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 87 % ((47 - arg1) / 46);
         super.field680 = arg0;
         ++field5009;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5013[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(IB)I",
      line = 123
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field5010;
         if (arg1 != 105) {
            method2723((class66)null, true);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5013[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(I)V",
      line = 135
   )
   public final void method98(int arg0) {
      try {
         ++field5004;
         if (super.field680 < 1 || super.field680 > 3) {
            super.field680 = this.method101(-118);
         }

         if (arg0 != 0) {
            field5006 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5013[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(B)V",
      line = 151
   )
   public static void method2724(byte arg0) {
      try {
         field5006 = null;
         if (arg0 != -102) {
            field5006 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5013[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "c",
      descriptor = "(I)I",
      line = 162
   )
   public final int method2725(int arg0) {
      try {
         ++field5005;
         int var2 = -107 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5013[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2726(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2727(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
