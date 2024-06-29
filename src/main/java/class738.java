import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class738 {
   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10600 = new String[]{method5313(method5312("TJdl\u0011^~q0\f_J-")), method5313(method5312("TJdl&\u0019")), method5313(method5312("TJdl$\u0019")), method5313(method5312("TJdl!\u0019")), method5313(method5312("J\u0003+l\u0018")), method5313(method5312("TJdl'\u0019")), method5313(method5312("_Xi."))};
   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10598 = new int[4];
   @OriginalMember(
      owner = "client!ega",
      name = "f",
      descriptor = "Lgh;"
   )
   public static class572 field10597 = new class572(30, -1);
   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "I"
   )
   public static int field10594;
   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "I"
   )
   public static int field10595;
   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "I"
   )
   public static int field10596;
   @OriginalMember(
      owner = "client!ega",
      name = "e",
      descriptor = "I"
   )
   public static int field10599;

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V",
      line = 3
   )
   public static final void method5308(String arg0, boolean arg1, int arg2, String arg3, int arg4) {
      try {
         class782.method5648(arg0, arg1, arg3, (byte)-128, true, -1, arg2);
         ++field10594;
         if (arg4 > -93) {
            method5311(-41);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10600[5] + (arg0 != null ? field10600[4] : field10600[6]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10600[4] : field10600[6]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 15
   )
   public final String toString() {
      try {
         ++field10595;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10600[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(I)V",
      line = 28
   )
   public static final void method5309(int arg0) {
      try {
         ++field10596;
         class607.field8712 = null;
         if (class262.field3734 && ~class257.method2057(false) != -2) {
            class694.method5048(0, class662.method4844(1), class614.method4507(-41), 20629, 0, ~class376.field5588 == -4 || class376.field5588 == 7);
         }

         if (arg0 == -4913) {
            int var1 = 0;
            int var2 = 0;
            if (class262.field3734) {
               var1 = class124.method1174((byte)119);
               var2 = class745.method5410(101);
            }

            class167.method1516(class720.field10406 + var1, (byte)-69, var1, var1, -1, var2 - -class218.field3296, var2, class277.field3907, var2);
            if (class607.field8712 != null) {
               class639.method4677(class607.field8712, class246.field3538, class768.field11144.field4316, class218.field3296 + var2, class534.field7777, var1, class720.field10406 + var1, 114, -1412584499, var2, true);
               class607.field8712 = null;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10600[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(B)V",
      line = 63
   )
   public static final void method5310(byte arg0) {
      try {
         ++field10599;
         if (arg0 >= -91) {
            field10598 = null;
         }

         ++class114.field1847;
         class542 var1 = class549.method4093((byte)-113, class355.field5001, class126.field2108);
         var1.field7859.method3550(class718.field10372, 29620);
         class740.method5332(var1, (byte)77);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10600[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "(I)V",
      line = 85
   )
   public static void method5311(int arg0) {
      try {
         if (arg0 < 47) {
            field10598 = null;
         }

         field10598 = null;
         field10597 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10600[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
