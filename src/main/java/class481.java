import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class481 extends class454 {
   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6690 = new String[]{method3661(method3660("\u001b\u0000m\u0011D")), method3661(method3660("\u000e[/S")), method3661(method3660("\u000fHm|\u0011")), method3661(method3660("\u000fHm~\u0011")), method3661(method3660("\u000fHmx\u0011")), method3661(method3660("\u000fHmq\u0011")), method3661(method3660("\u000fHm}\u0011")), method3661(method3660("\u000fHm\u0003P\u000eG7\u0001\u0011")), method3661(method3660("\u000fHmy\u0011")), method3661(method3660("\u000fHmz\u0011")), method3661(method3660("\u000fHm{\u0011")), method3661(method3660("\u000fHmw\u0011"))};
   @OriginalMember(
      owner = "client!of",
      name = "i",
      descriptor = "I"
   )
   public static int field6681;
   @OriginalMember(
      owner = "client!of",
      name = "n",
      descriptor = "I"
   )
   public static int field6682;
   @OriginalMember(
      owner = "client!of",
      name = "p",
      descriptor = "I"
   )
   public static int field6683;
   @OriginalMember(
      owner = "client!of",
      name = "o",
      descriptor = "I"
   )
   public static int field6684;
   @OriginalMember(
      owner = "client!of",
      name = "q",
      descriptor = "I"
   )
   public static int field6685;
   @OriginalMember(
      owner = "client!of",
      name = "j",
      descriptor = "I"
   )
   public static int field6686;
   @OriginalMember(
      owner = "client!of",
      name = "k",
      descriptor = "I"
   )
   public static int field6688;
   @OriginalMember(
      owner = "client!of",
      name = "l",
      descriptor = "I"
   )
   public static int field6689;
   @OriginalMember(
      owner = "client!of",
      name = "m",
      descriptor = "[Ljava/lang/Object;"
   )
   public static Object[] field6687;

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field6684;
         if (super.field6259.method5445(true).method2419(-1) < 96) {
            return 0;
         } else {
            return arg0 != 1 ? -112 : 2;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field6689;
         if (!arg0) {
            method3655((class339)null, 119, -119);
         }

         if (super.field6259.method5445(arg0).method2419(-1) < 96) {
            super.field6263 = 0;
         }

         if (super.field6263 < 0 || super.field6263 > 2) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Lww;II)Lkv;"
   )
   public static final class19 method3655(class339 arg0, int arg1, int arg2) {
      try {
         int var3 = -79 / ((-41 - arg1) / 55);
         ++field6688;
         byte[] var4 = arg0.method2700(arg2, -2);
         return var4 == null ? null : new class19(var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6690[2] + (arg0 != null ? field6690[0] : field6690[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field6681;
         if (arg1) {
            this.method23(25);
         }

         return super.field6259.method5445(!arg1).method2419(-1) < 96 ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6690[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class481(class752 arg0) {
      super(arg0);

      try {
         class400.method3138(10, super.field6263);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[7] + (arg0 != null ? field6690[0] : field6690[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method3656(boolean arg0, int arg1, int arg2) {
      try {
         ++field6686;
         if (!arg0) {
            field6687 = null;
         }

         if (!class92.method850((byte)49, arg1, arg2)) {
            return false;
         } else {
            return class277.method2189(arg1, (byte)-123, arg2) | (45056 & arg2) != 0 | class516.method3886((byte)-112, arg2, arg1) ? true : (class52.method386(arg1, arg2, 0) | class401.method3148(arg2, arg1, 123)) & (55 & arg1) == 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6690[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3657(boolean arg0) {
      try {
         ++field6685;
         if (super.field6259.method5445(true).method2419(-1) < 96) {
            return false;
         } else {
            if (arg0) {
               field6687 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3658(int arg0) {
      try {
         if (arg0 != -18033) {
            return 125;
         } else {
            ++field6683;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class481(int arg0, class752 arg1) {
      super(arg0, arg1);

      try {
         class400.method3138(10, super.field6263);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6690[7] + arg0 + ',' + (arg1 != null ? field6690[0] : field6690[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3659(int arg0) {
      try {
         field6687 = null;
         int var1 = -56 % ((35 - arg0) / 44);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6690[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field6682;
         super.field6263 = arg1;
         class400.method3138(10, super.field6263);
         if (arg0 > -46) {
            field6687 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6690[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3660(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3661(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
