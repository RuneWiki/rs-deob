import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class88 extends class555 {
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1131 = new String[]{method848(method847("mch\u0000B-")), method848(method847("mch\u0000C-")), method848(method847("mch\u0000@-")), method848(method847("mch\u0000A-")), method848(method847("mch\u0000E-")), method848(method847("kweB")), method848(method847("~,'\u0000z")), method848(method847("mch\u0000D-")), method848(method847("mch\u0000F-"))};
   @OriginalMember(
      owner = "client!haa",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1123 = null;
   @OriginalMember(
      owner = "client!haa",
      name = "h",
      descriptor = "I"
   )
   public static int field1122;
   @OriginalMember(
      owner = "client!haa",
      name = "l",
      descriptor = "I"
   )
   public static int field1125;
   @OriginalMember(
      owner = "client!haa",
      name = "j",
      descriptor = "I"
   )
   public static int field1126;
   @OriginalMember(
      owner = "client!haa",
      name = "m",
      descriptor = "I"
   )
   public static int field1127;
   @OriginalMember(
      owner = "client!haa",
      name = "k",
      descriptor = "I"
   )
   public static int field1128;
   @OriginalMember(
      owner = "client!haa",
      name = "g",
      descriptor = "I"
   )
   public static int field1129;
   @OriginalMember(
      owner = "client!haa",
      name = "n",
      descriptor = "I"
   )
   public static int field1130;
   @OriginalMember(
      owner = "client!haa",
      name = "i",
      descriptor = "Lkh;"
   )
   public static class17 field1124;

   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field1126;
         if (super.field7632 < 0 || ~super.field7632 < -5) {
            super.field7632 = this.method635(127);
         }

         if (arg0 != -13712) {
            this.method633(85, (byte)103);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1131[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            field1123 = null;
         }

         ++field1130;
         return 3;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1131[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class88(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method844(byte arg0) {
      try {
         ++field1122;
         return arg0 > -61 ? 68 : super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1131[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 42 / ((12 - arg1) / 47);
         ++field1128;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1131[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            field1124 = null;
         }

         ++field1129;
         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1131[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class88(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(IIILeb;)V"
   )
   public static final void method845(int arg0, int arg1, int arg2, class657 arg3) {
      try {
         ++field1127;
         if (class602.field8398 == null && !class666.field9473) {
            if (arg3 != null && class777.method5563(70, arg3) != null) {
               class602.field8398 = arg3;
               class611.field8543 = class777.method5563(arg1 ^ 71, arg3);
               class624.field8710 = arg1;
               class508.field7039 = arg2;
               class670.field9552 = arg0;
               class120.field1475 = false;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1131[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1131[6] : field1131[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method846(int arg0) {
      try {
         field1123 = null;
         field1124 = null;
         if (arg0 != -5) {
            field1124 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1131[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
