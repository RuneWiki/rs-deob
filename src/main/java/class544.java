import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class544 {
   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7432 = new String[]{method3935(method3934("\u00025wa\u0012")), method3935(method3934("\u00025w`\u0012")), method3935(method3934("\u00025wc\u0012")), method3935(method3934("\u00025wk\u0012")), method3935(method3934("\u00025wh\u0012"))};
   @OriginalMember(
      owner = "client!gq",
      name = "b",
      descriptor = "Lgka;"
   )
   public static class394 field7428 = new class394("", 11);
   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "Lol;"
   )
   public static class300 field7429 = new class300();
   @OriginalMember(
      owner = "client!gq",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field7431 = new class378(30, 6);
   @OriginalMember(
      owner = "client!gq",
      name = "f",
      descriptor = "I"
   )
   public static int field7425;
   @OriginalMember(
      owner = "client!gq",
      name = "e",
      descriptor = "I"
   )
   public static int field7426;
   @OriginalMember(
      owner = "client!gq",
      name = "d",
      descriptor = "I"
   )
   public static int field7427;
   @OriginalMember(
      owner = "client!gq",
      name = "g",
      descriptor = "I"
   )
   public static int field7430;

   @OriginalMember(
      owner = "client!gq",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method1575(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "h",
      descriptor = "(I)I"
   )
   public abstract int method1581(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3929(int arg0, int arg1, int arg2) {
      try {
         if (arg2 < 13) {
            method3929(33, -95, -76);
         }

         ++field7426;
         return (1048832 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7432[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method1572(boolean arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method3930(int arg0) {
      try {
         if (arg0 >= -17) {
            return false;
         } else {
            ++field7430;
            return this.method1576(82) || this.method1574(-16009) || this.method1582(-86);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7432[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method3931(int arg0) {
      try {
         ++field7427;
         class590 var1 = class305.field4046;
         synchronized(class305.field4046) {
            class305.field4046.method4245(true);
            if (arg0 != -5176) {
               method3933(-121);
            }
         }

         class590 var2 = class468.field6450;
         synchronized(class468.field6450) {
            class468.field6450.method4245(true);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7432[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "c",
      descriptor = "(I)Z"
   )
   public abstract boolean method1582(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(ICB)C"
   )
   public static final char method3932(int arg0, char arg1, byte arg2) {
      try {
         ++field7425;
         if (arg1 >= 192 && arg1 <= 255) {
            if (~arg1 <= -193 && arg1 <= 198) {
               return 'A';
            }

            if (arg1 == 199) {
               return 'C';
            }

            if (~arg1 <= -201 && arg1 <= 203) {
               return 'E';
            }

            if (arg1 >= 204 && arg1 <= 207) {
               return 'I';
            }

            if (arg1 >= 210 && arg1 <= 214) {
               return 'O';
            }

            if (~arg1 <= -218 && arg1 <= 220) {
               return 'U';
            }

            if (~arg1 == -222) {
               return 'Y';
            }

            if (arg1 == 223) {
               return 's';
            }

            if (arg1 >= 224 && ~arg1 >= -231) {
               return 'a';
            }

            if (~arg1 == -232) {
               return 'c';
            }

            if (arg1 >= 232 && arg1 <= 235) {
               return 'e';
            }

            if (arg1 >= 236 && arg1 <= 239) {
               return 'i';
            }

            if (~arg1 <= -243 && arg1 <= 246) {
               return 'o';
            }

            if (~arg1 <= -250 && ~arg1 >= -253) {
               return 'u';
            }

            if (~arg1 == -254 || ~arg1 == -256) {
               return 'y';
            }
         }

         if (arg1 == 338) {
            return 'O';
         } else if (~arg1 == -340) {
            return 'o';
         } else if (arg1 == 376) {
            return 'Y';
         } else if (arg2 != 122) {
            return (char)65455;
         } else {
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7432[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3933(int arg0) {
      try {
         field7429 = null;
         field7428 = null;
         if (arg0 > 11) {
            field7431 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7432[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gq",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method1579(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "d",
      descriptor = "(I)Z"
   )
   public abstract boolean method1576(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method1574(int arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "a",
      descriptor = "(B)Lum;"
   )
   public abstract class554 method1573(byte arg0);

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3934(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3935(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
