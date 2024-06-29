import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class478 extends class347 {
   @OriginalMember(
      owner = "client!td",
      name = "j",
      descriptor = "I"
   )
   public int field7103;
   @OriginalMember(
      owner = "client!td",
      name = "o",
      descriptor = "I"
   )
   public int field7097;
   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7107 = new String[]{method3552(method3551("\u0003\u0006\u000b&x")), method3552(method3551("\u0003\u0006\u000b,x")), method3552(method3551("\u0003\u0006\u000b-x")), method3552(method3551("\u0003\u0006\u000bY9\u0019\u000bQ[x")), method3552(method3551("\u0003\u0006\u000b x")), method3552(method3551("\u0003\u0006\u000b#x")), method3552(method3551("\u0003\u0006\u000b$x")), method3552(method3551("\u0003\u0006\u000b!x")), method3552(method3551("\u0003\u0006\u000b'x")), method3552(method3551("\u0003\u0006\u000b\"x"))};
   @OriginalMember(
      owner = "client!td",
      name = "l",
      descriptor = "I"
   )
   public static int field7096;
   @OriginalMember(
      owner = "client!td",
      name = "n",
      descriptor = "I"
   )
   public static int field7098;
   @OriginalMember(
      owner = "client!td",
      name = "i",
      descriptor = "I"
   )
   public static int field7099;
   @OriginalMember(
      owner = "client!td",
      name = "k",
      descriptor = "I"
   )
   public static int field7100;
   @OriginalMember(
      owner = "client!td",
      name = "p",
      descriptor = "I"
   )
   public static int field7101;
   @OriginalMember(
      owner = "client!td",
      name = "s",
      descriptor = "I"
   )
   public static int field7102;
   @OriginalMember(
      owner = "client!td",
      name = "m",
      descriptor = "I"
   )
   public static int field7104;
   @OriginalMember(
      owner = "client!td",
      name = "q",
      descriptor = "I"
   )
   public static int field7105;
   @OriginalMember(
      owner = "client!td",
      name = "r",
      descriptor = "Lua;"
   )
   public static class693 field7106;

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(B)Z",
      line = 6
   )
   public final boolean method3542(byte arg0) {
      try {
         ++field7105;
         if (arg0 != -111) {
            this.field7097 = 68;
         }

         return (this.field7097 & 3579931) >> 21 != 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7107[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "f",
      descriptor = "(I)V",
      line = 18
   )
   public static final void method3543(int arg0) {
      try {
         if (class755.field11144.field10710 && class732.field10859.field10414 != -1) {
            class148.method1221(class732.field10859.field10414, class732.field10859.field10410, arg0 ^ -19066);
         }

         if (arg0 != -1) {
            method3543(-10);
         }

         ++field7096;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7107[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(ZI)V",
      line = 31
   )
   public static final void method3544(boolean arg0, int arg1) {
      try {
         ++field7100;
         class728.field10825 = arg1;
         class748 var2 = class413.field6322;
         synchronized(class413.field6322) {
            class413.field6322.method5451(-127);
            if (!arg0) {
               method3544(false, 83);
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7107[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "e",
      descriptor = "(I)Z",
      line = 45
   )
   public final boolean method3545(int arg0) {
      try {
         if (arg0 != -25551) {
            return true;
         } else {
            ++field7099;
            return (this.field7097 & 1) != 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7107[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(I)I",
      line = 57
   )
   public final int method3546(int arg0) {
      try {
         if (arg0 != -2220) {
            this.method3547((byte)-86);
         }

         ++field7104;
         return class75.method730(arg0 ^ -12397, this.field7097);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7107[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "(B)I",
      line = 71
   )
   public final int method3547(byte arg0) {
      try {
         ++field7102;
         if (arg0 != -96) {
            this.field7097 = -62;
         }

         return (2069371 & this.field7097) >> 18;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7107[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(I)Z",
      line = 84
   )
   public final boolean method3548(int arg0) {
      try {
         ++field7101;
         if (arg0 != 2372) {
            return true;
         } else {
            return ~(this.field7097 >> 22 & 1) != -1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7107[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(II)Z",
      line = 95
   )
   public final boolean method3549(int arg0, int arg1) {
      try {
         ++field7098;
         if (arg1 >= -117) {
            return true;
         } else {
            return ~(this.field7097 >> arg0 - -1 & 1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7107[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "<init>",
      descriptor = "(II)V",
      line = 105
   )
   public class478(int arg0, int arg1) {
      try {
         this.field7103 = arg1;
         this.field7097 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7107[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(B)V",
      line = 114
   )
   public static void method3550(byte arg0) {
      try {
         if (arg0 == -76) {
            field7106 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7107[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3551(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3552(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
