import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class115 extends class555 {
   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1427 = new String[]{method998(method997("x_ud{\"")), method998(method997("x_ud}\"")), method998(method997("x_ud|\"")), method998(method997("x_udz\"")), method998(method997("x_udx\"")), method998(method997("x_ud\u007f\""))};
   @OriginalMember(
      owner = "client!rja",
      name = "i",
      descriptor = "Lbga;"
   )
   public static class378 field1422 = new class378(35, 16);
   @OriginalMember(
      owner = "client!rja",
      name = "f",
      descriptor = "I"
   )
   public static int field1421;
   @OriginalMember(
      owner = "client!rja",
      name = "h",
      descriptor = "I"
   )
   public static int field1423;
   @OriginalMember(
      owner = "client!rja",
      name = "g",
      descriptor = "I"
   )
   public static int field1424;
   @OriginalMember(
      owner = "client!rja",
      name = "k",
      descriptor = "I"
   )
   public static int field1425;
   @OriginalMember(
      owner = "client!rja",
      name = "j",
      descriptor = "I"
   )
   public static int field1426;

   @OriginalMember(
      owner = "client!rja",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method995(byte arg0) {
      try {
         if (arg0 != 58) {
            field1422 = null;
         }

         field1422 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1427[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field1424;
         if (super.field7632 < 1 || ~super.field7632 < -4) {
            super.field7632 = this.method635(125);
         }

         if (arg0 != -13712) {
            this.method635(7);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1427[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field1421;
         if (arg1 <= 36) {
            this.method635(77);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1427[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field1426;
         int var3 = 27 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1427[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method996(byte arg0) {
      try {
         if (arg0 > -61) {
            return -22;
         } else {
            ++field1425;
            return super.field7632;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1427[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class115(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field1423;
         if (arg0 <= 124) {
            return 106;
         } else {
            return super.field7633.method4408(-115).method1278(88) ? 3 : 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1427[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class115(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method997(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method998(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
