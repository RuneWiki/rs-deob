import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class679 extends class242 {
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9964 = new String[]{method4959(method4958("|`\u0002}\u0003")), method4959(method4958("|`\u0002{\u0003")), method4959(method4958("|`\u0002x\u0003")), method4959(method4958("|`\u0002t\u0003")), method4959(method4958("|`\u0002q\u0003")), method4959(method4958("|`\u0002r\u0003")), method4959(method4958("j$\u0002\u0012V")), method4959(method4958("|`\u0002u\u0003")), method4959(method4958("\u007f\u007f@P")), method4959(method4958("|`\u0002~\u0003"))};
   @OriginalMember(
      owner = "client!mj",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field9952 = new class572(2, -2);
   @OriginalMember(
      owner = "client!mj",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field9962 = false;
   @OriginalMember(
      owner = "client!mj",
      name = "x",
      descriptor = "Lgh;"
   )
   public static class572 field9961 = new class572(67, -1);
   @OriginalMember(
      owner = "client!mj",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field9963 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!mj",
      name = "y",
      descriptor = "I"
   )
   public static int field9953;
   @OriginalMember(
      owner = "client!mj",
      name = "p",
      descriptor = "I"
   )
   public static int field9954;
   @OriginalMember(
      owner = "client!mj",
      name = "r",
      descriptor = "I"
   )
   public static int field9955;
   @OriginalMember(
      owner = "client!mj",
      name = "w",
      descriptor = "I"
   )
   public static int field9956;
   @OriginalMember(
      owner = "client!mj",
      name = "o",
      descriptor = "I"
   )
   public static int field9958;
   @OriginalMember(
      owner = "client!mj",
      name = "n",
      descriptor = "I"
   )
   public static int field9959;
   @OriginalMember(
      owner = "client!mj",
      name = "q",
      descriptor = "I"
   )
   public static int field9960;
   @OriginalMember(
      owner = "client!mj",
      name = "u",
      descriptor = "[[Z"
   )
   public static boolean[][] field9957;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(ZZ)V",
      line = 5
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         ++field9954;
         if (!arg0) {
            this.method69(107);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9964[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(III)Z",
      line = 16
   )
   public static final boolean method4956(int arg0, int arg1, int arg2) {
      try {
         ++field9956;
         return arg1 > -88 ? false : class641.method4695(arg0, -2, arg2) & class238.method1950(55, arg0, arg2);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9964[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(Z)V",
      line = 29
   )
   public static void method4957(boolean arg0) {
      try {
         if (!arg0) {
            method4956(14, 117, 82);
         }

         field9961 = null;
         field9963 = null;
         field9952 = null;
         field9957 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9964[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lcs;)V",
      line = 44
   )
   public class679(class357 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mj",
      name = "f",
      descriptor = "(I)V",
      line = 48
   )
   public final void method68(int arg0) {
      try {
         int var2 = 34 / ((arg0 - 27) / 34);
         ++field9959;
         super.field3498.method2803((byte)49, false);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9964[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(ZI)V",
      line = 59
   )
   public final void method72(boolean arg0, int arg1) {
      try {
         if (arg1 != -29461) {
            field9957 = null;
         }

         ++field9958;
         super.field3498.method2803((byte)85, true);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9964[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IIB)V",
      line = 70
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      try {
         ++field9960;
         if (arg2 > -64) {
            this.method70(false, false);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9964[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 81
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         super.field3498.method2806(false, arg2);
         if (arg1 > 12) {
            ++field9953;
            super.field3498.method2738(-78, arg0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9964[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9964[6] : field9964[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "e",
      descriptor = "(I)Z",
      line = 97
   )
   public final boolean method69(int arg0) {
      try {
         ++field9955;
         return arg0 == 30453;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9964[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4958(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4959(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
