import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class666 extends class331 {
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9681 = new String[]{method4771(method4770("5+k?\u0002")), method4771(method4770("5+k>\u0002")), method4771(method4770("5+k6\u0002")), method4771(method4770("5+k<\u0002")), method4771(method4770("5+k2\u0002")), method4771(method4770("!wkZW")), method4771(method4770("4,)\u0018")), method4771(method4770("5+k:\u0002")), method4771(method4770("5+k9\u0002")), method4771(method4770("5+k=\u0002"))};
   @OriginalMember(
      owner = "client!or",
      name = "t",
      descriptor = "I"
   )
   public static int field9677 = 0;
   @OriginalMember(
      owner = "client!or",
      name = "o",
      descriptor = "I"
   )
   public static int field9672;
   @OriginalMember(
      owner = "client!or",
      name = "r",
      descriptor = "I"
   )
   public static int field9673;
   @OriginalMember(
      owner = "client!or",
      name = "v",
      descriptor = "I"
   )
   public static int field9674;
   @OriginalMember(
      owner = "client!or",
      name = "p",
      descriptor = "I"
   )
   public static int field9675;
   @OriginalMember(
      owner = "client!or",
      name = "s",
      descriptor = "I"
   )
   public static int field9676;
   @OriginalMember(
      owner = "client!or",
      name = "u",
      descriptor = "I"
   )
   public static int field9678;
   @OriginalMember(
      owner = "client!or",
      name = "n",
      descriptor = "I"
   )
   public static int field9679;
   @OriginalMember(
      owner = "client!or",
      name = "q",
      descriptor = "I"
   )
   public static int field9680;

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      try {
         ++field9675;
         if (arg0 < 16) {
            this.method412(-89, 53, -76);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9681[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      try {
         super.field4745.method2578(arg2, true);
         ++field9680;
         if (arg0 == 0) {
            super.field4745.method2649((byte)119, arg1);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9681[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9681[5] : field9681[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4768(int arg0, int arg1) {
      try {
         ++field9678;
         if (~arg0 > arg1) {
            return 0;
         } else {
            return ~arg0 > -129 ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9681[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      try {
         ++field9676;
         if (arg0 > -21) {
            method4768(56, 1);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9681[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "<init>",
      descriptor = "(Ldh;)V"
   )
   public class666(class338 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == 9950) {
            ++field9672;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9681[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      try {
         if (arg1 != -102) {
            this.method412(6, -30, -54);
         }

         ++field9674;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9681[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method4769(String arg0, int arg1) {
      try {
         ++field9679;
         class286.method2180("", "", "", 0, 0, arg0, 0);
         int var2 = -17 / ((arg1 - 36) / 36);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9681[4] + (arg0 != null ? field9681[5] : field9681[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      try {
         if (arg0 <= 3) {
            field9677 = -82;
         }

         ++field9673;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9681[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4770(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4771(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
