import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class710 extends class555 {
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10431 = new String[]{method5184(method5183("\u0010_uq3V")), method5184(method5183("\u0010_uq4V")), method5184(method5183("\u0010_uq5V")), method5184(method5183("\u0010_uq0V")), method5184(method5183("\u0010_uq6V")), method5184(method5183("\u0010_uq2V")), method5184(method5183("\u0010_uq1V"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field10422 = false;
   @OriginalMember(
      owner = "client!nfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10423 = 0;
   @OriginalMember(
      owner = "client!nfa",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10421 = new String[100];
   @OriginalMember(
      owner = "client!nfa",
      name = "f",
      descriptor = "[Lvp;"
   )
   public static class200[] field10429 = new class200[4];
   @OriginalMember(
      owner = "client!nfa",
      name = "l",
      descriptor = "I"
   )
   public static int field10420;
   @OriginalMember(
      owner = "client!nfa",
      name = "m",
      descriptor = "I"
   )
   public static int field10424;
   @OriginalMember(
      owner = "client!nfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10426;
   @OriginalMember(
      owner = "client!nfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10427;
   @OriginalMember(
      owner = "client!nfa",
      name = "h",
      descriptor = "I"
   )
   public static int field10428;
   @OriginalMember(
      owner = "client!nfa",
      name = "i",
      descriptor = "I"
   )
   public static int field10430;
   @OriginalMember(
      owner = "client!nfa",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field10425;

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            return -51;
         } else {
            ++field10427;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10431[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method5180(byte arg0) {
      try {
         ++field10430;
         if (arg0 >= -61) {
            field10425 = null;
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10431[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class710(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field10426;
         int var3 = -101 / ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10431[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class710(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5181(byte arg0) {
      try {
         field10421 = null;
         if (arg0 != 41) {
            method5181((byte)102);
         }

         field10429 = null;
         field10425 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10431[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field10420;
         int var3 = super.field7633.method4408(-117).method1282((byte)-79);
         if (var3 < 96) {
            return 3;
         } else if (arg1 < 36) {
            return 64;
         } else if (arg0 > 1 && ~var3 > -129) {
            return 3;
         } else {
            return ~arg0 < -4 && var3 < 192 ? 3 : 1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10431[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field10428;
         int var2 = super.field7633.method4408(-128).method1282((byte)-79);
         if (~var2 > -97) {
            super.field7632 = 0;
         }

         if (~super.field7632 < -2 && ~var2 > -129) {
            super.field7632 = 1;
         }

         if (~super.field7632 < -3 && ~var2 > -193) {
            super.field7632 = 2;
         }

         if (super.field7632 < 0 || super.field7632 > 3) {
            super.field7632 = this.method635(125);
         }

         if (arg0 != -13712) {
            this.method633(43, (byte)75);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10431[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method5182(byte arg0) {
      try {
         ++field10424;
         int var2 = super.field7633.method4408(-116).method1282((byte)-79);
         if (var2 < 96) {
            return false;
         } else {
            if (arg0 != -107) {
               this.method5180((byte)-114);
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10431[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
