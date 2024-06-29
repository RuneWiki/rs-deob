import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class561 {
   @OriginalMember(
      owner = "client!ts",
      name = "d",
      descriptor = "Ldw;"
   )
   private class748 field8390 = new class748(64);
   @OriginalMember(
      owner = "client!ts",
      name = "f",
      descriptor = "Ldw;"
   )
   public class748 field8394 = new class748(64);
   @OriginalMember(
      owner = "client!ts",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field8382;
   @OriginalMember(
      owner = "client!ts",
      name = "k",
      descriptor = "Leaa;"
   )
   public class526 field8392;
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8396 = new String[]{method4159(method4158("\u0007%8+I")), method4159(method4158("\u0007%8-I")), method4159(method4158("\u0007%8)I")), method4159(method4158("\u0007%8,I")), method4159(method4158("\u0007%8*I")), method4159(method4158("\u001d#z\u0004")), method4159(method4158("\u0007%8T\b\u001d?bVI")), method4159(method4158("\bx8F\u001c")), method4159(method4158("\u0007%8 I")), method4159(method4158("\u0007%8/I")), method4159(method4158("\u0007%8.I"))};
   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "Loi;"
   )
   public static class79 field8388 = new class79(4, 1);
   @OriginalMember(
      owner = "client!ts",
      name = "e",
      descriptor = "Lwia;"
   )
   public static class791 field8393 = new class791(64);
   @OriginalMember(
      owner = "client!ts",
      name = "i",
      descriptor = "I"
   )
   public static int field8383;
   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "I"
   )
   public static int field8384;
   @OriginalMember(
      owner = "client!ts",
      name = "n",
      descriptor = "I"
   )
   public static int field8385;
   @OriginalMember(
      owner = "client!ts",
      name = "l",
      descriptor = "I"
   )
   public static int field8386;
   @OriginalMember(
      owner = "client!ts",
      name = "m",
      descriptor = "I"
   )
   public static int field8387;
   @OriginalMember(
      owner = "client!ts",
      name = "j",
      descriptor = "I"
   )
   public static int field8389;
   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "I"
   )
   public static int field8391;
   @OriginalMember(
      owner = "client!ts",
      name = "h",
      descriptor = "Ldk;"
   )
   public static class536 field8395;

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(BLjava/lang/String;)I",
      line = 7
   )
   public static final int method4150(byte arg0, String arg1) {
      try {
         if (arg0 != 27) {
            field8393 = null;
         }

         ++field8384;
         return class513.method3809(true, 10, arg1, (byte)69);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8396[9] + arg0 + ',' + (arg1 != null ? field8396[7] : field8396[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public final void method4151(int arg0) {
      try {
         if (arg0 == 10) {
            ++field8386;
            class748 var2 = this.field8390;
            synchronized(this.field8390) {
               this.field8390.method5445(697465426);
            }

            class748 var3 = this.field8394;
            synchronized(this.field8394) {
               this.field8394.method5445(697465426);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8396[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(Z)V",
      line = 36
   )
   public static void method4152(boolean arg0) {
      try {
         if (!arg0) {
            field8393 = null;
         }

         field8395 = null;
         field8393 = null;
         field8388 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8396[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(B)V",
      line = 50
   )
   public final void method4153(byte arg0) {
      try {
         if (arg0 == 123) {
            class748 var2 = this.field8390;
            synchronized(this.field8390) {
               this.field8390.method5451(arg0 + -238);
            }

            ++field8389;
            class748 var3 = this.field8394;
            synchronized(this.field8394) {
               this.field8394.method5451(arg0 + -250);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8396[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(III)V",
      line = 68
   )
   public final void method4154(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 64) {
            this.field8392 = null;
         }

         this.field8390 = new class748(arg0);
         ++field8383;
         this.field8394 = new class748(arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8396[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(ZIB)V",
      line = 89
   )
   public static final void method4155(boolean arg0, int arg1, byte arg2) {
      try {
         ++field8385;
         class5 var3 = class289.method2200(arg1, 0, arg0);
         if (var3 != null) {
            if (arg2 != -112) {
               field8393 = null;
            }

            var3.method2720(0);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8396[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "(ZI)V",
      line = 107
   )
   public final void method4156(boolean arg0, int arg1) {
      try {
         ++field8391;
         class748 var3 = this.field8390;
         synchronized(this.field8390) {
            this.field8390.method5453(arg1, arg0);
         }

         class748 var4 = this.field8394;
         synchronized(this.field8394) {
            this.field8394.method5453(arg1, false);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8396[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(ZI)Lgh;",
      line = 124
   )
   public final class574 method4157(boolean arg0, int arg1) {
      try {
         ++field8387;
         class748 var3 = this.field8390;
         class574 var4;
         synchronized(this.field8390) {
            var4 = (class574)this.field8390.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field8382;
            byte[] var6;
            synchronized(this.field8382) {
               var6 = this.field8382.method3899(-99, arg1, 34);
            }

            class574 var7 = new class574();
            var7.field8537 = this;
            if (arg0) {
               field8393 = null;
            }

            if (var6 != null) {
               var7.method4247(new class128(var6), (byte)-42);
            }

            class748 var8 = this.field8390;
            synchronized(this.field8390) {
               this.field8390.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8396[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V",
      line = 169
   )
   public class561(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field8382 = arg2;
         this.field8392 = arg3;
         this.field8382.method3875(0, 34);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8396[6] + (arg0 != null ? field8396[7] : field8396[5]) + ',' + arg1 + ',' + (arg2 != null ? field8396[7] : field8396[5]) + ',' + (arg3 != null ? field8396[7] : field8396[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
