import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class240 extends class555 {
   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2991 = new String[]{method1802(method1801("s\u000e\u001fP&:")), method1802(method1801("s\u000e\u001fP$:")), method1802(method1801("s\u000e\u001fP :")), method1802(method1801("s\u000e\u001fP\":")), method1802(method1801("s\u000e\u001fP!:")), method1802(method1801("s\u000e\u001fP%:")), method1802(method1801("s\u000e\u001fP':"))};
   @OriginalMember(
      owner = "client!aia",
      name = "h",
      descriptor = "I"
   )
   public static int field2984;
   @OriginalMember(
      owner = "client!aia",
      name = "f",
      descriptor = "I"
   )
   public static int field2985;
   @OriginalMember(
      owner = "client!aia",
      name = "g",
      descriptor = "I"
   )
   public static int field2986;
   @OriginalMember(
      owner = "client!aia",
      name = "j",
      descriptor = "I"
   )
   public static int field2988;
   @OriginalMember(
      owner = "client!aia",
      name = "k",
      descriptor = "I"
   )
   public static int field2989;
   @OriginalMember(
      owner = "client!aia",
      name = "i",
      descriptor = "I"
   )
   public static int field2990;
   @OriginalMember(
      owner = "client!aia",
      name = "l",
      descriptor = "Lqh;"
   )
   public static class74 field2987;

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class240(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field2985;
         if (arg1 < 36) {
            this.method1798((byte)-125);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2991[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class240(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field2988;
         if (arg0 <= 124) {
            field2987 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2991[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1798(byte arg0) {
      try {
         ++field2990;
         return arg0 > -61 ? 85 : super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2991[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method1799(byte arg0, int arg1) {
      try {
         ++field2986;
         class149 var2 = (class149)class109.field1381.method1839(-127, (long)arg1);
         int var3 = 98 / ((arg0 - 17) / 58);
         if (var2 != null) {
            var2.field1949.method5406(1);
            class540.method3901(var2.field1940, var2.field1946, false);
            var2.method3609(116);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2991[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field2989;
         if (super.field7632 != 1 && ~super.field7632 != -1) {
            super.field7632 = this.method635(127);
         }

         if (arg0 != -13712) {
            field2987 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2991[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field2984;
         super.field7632 = arg0;
         int var3 = -12 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2991[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1800(int arg0) {
      try {
         field2987 = null;
         if (arg0 > -50) {
            field2987 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2991[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
