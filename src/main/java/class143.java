import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class143 extends class555 {
   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1901 = new String[]{method1214(method1213("\tf2,\u0016")), method1214(method1213("\tf2.\u0016")), method1214(method1213("\tf2/\u0016")), method1214(method1213("\tf2*\u0016")), method1214(method1213("\tf2+\u0016")), method1214(method1213("\tf2(\u0016")), method1214(method1213("\tf2-\u0016"))};
   @OriginalMember(
      owner = "client!kc",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1895 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!kc",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field1897 = false;
   @OriginalMember(
      owner = "client!kc",
      name = "l",
      descriptor = "I"
   )
   public static int field1893;
   @OriginalMember(
      owner = "client!kc",
      name = "i",
      descriptor = "I"
   )
   public static int field1894;
   @OriginalMember(
      owner = "client!kc",
      name = "m",
      descriptor = "I"
   )
   public static int field1896;
   @OriginalMember(
      owner = "client!kc",
      name = "f",
      descriptor = "I"
   )
   public static int field1898;
   @OriginalMember(
      owner = "client!kc",
      name = "h",
      descriptor = "I"
   )
   public static int field1899;
   @OriginalMember(
      owner = "client!kc",
      name = "g",
      descriptor = "I"
   )
   public static int field1900;

   @OriginalMember(
      owner = "client!kc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (super.field7633.field8451.method2771(3) && !class288.method2180(super.field7633.field8451.method2770((byte)-80), arg0 + 13706)) {
            super.field7632 = 0;
         }

         ++field1894;
         if (super.field7632 < 0 || ~super.field7632 < -3) {
            super.field7632 = this.method635(arg0 ^ -13810);
         }

         if (arg0 != -13712) {
            field1895 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1901[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            this.method635(-83);
         }

         ++field1900;
         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1901[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1210(int arg0) {
      try {
         field1895 = null;
         if (arg0 <= 44) {
            field1897 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1901[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field1899;
         if (arg1 <= 36) {
            return 77;
         } else {
            return !class288.method2180(super.field7633.field8451.method2770((byte)-69), -6) ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1901[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class143(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 94 / ((arg1 - 12) / 47);
         super.field7632 = arg0;
         ++field1893;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1901[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1211(byte arg0) {
      try {
         if (arg0 > -61) {
            this.method635(14);
         }

         ++field1896;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1901[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method1212(byte arg0) {
      try {
         if (arg0 != -107) {
            return true;
         } else {
            ++field1898;
            return class288.method2180(super.field7633.field8451.method2770((byte)-67), -6);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1901[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class143(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1213(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1214(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
