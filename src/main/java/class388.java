import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class388 {
   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5658 = new String[]{method3028(method3027("1q$0\u0012")), method3028(method3027("1q$1\u0012")), method3028(method3027("1q$7\u0012")), method3028(method3027("1q$2\u0012"))};
   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class724 field5655 = new class724(136, 17);
   @OriginalMember(
      owner = "client!nh",
      name = "f",
      descriptor = "Ldb;"
   )
   public static class685 field5656 = new class685(2, 5);
   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "I"
   )
   public static int field5652;
   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "I"
   )
   public static int field5653;
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "I"
   )
   public static int field5654;
   @OriginalMember(
      owner = "client!nh",
      name = "e",
      descriptor = "J"
   )
   public static long field5657;

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3023(int arg0, int arg1, byte arg2) {
      try {
         ++field5654;
         if (!class34.method389(arg0, (byte)66, arg1)) {
            return false;
         } else {
            if (arg2 < 35) {
               method3025(53);
            }

            return class249.method2152(arg0, (byte)66, arg1) | ~(arg1 & 36864) != -1 | class642.method4672(arg0, arg1, -1416) ? true : (class294.method2458(arg1, false, arg0) | (8192 & arg1) != 0 | class197.method1734((byte)1, arg1, arg0)) & (55 & arg0) == 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5658[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3024(int arg0, int arg1, byte arg2) {
      try {
         ++field5652;
         if (arg2 != 2) {
            method3025(55);
         }

         return ~(34 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5658[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3025(int arg0) {
      try {
         int var1 = -124 % ((arg0 - -59) / 46);
         field5655 = null;
         field5656 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5658[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3026(byte arg0) {
      try {
         ++field5653;
         class173.field2582 = null;
         if (class563.field8012 && ~class40.method477(false) != -2) {
            class358.method2812(0, 16777215, ~class394.field5712 == -4 || class394.field5712 == 7, class144.method1428((byte)85), 0, class521.method3886(-2));
         }

         if (arg0 == -2) {
            int var1 = 0;
            int var2 = 0;
            if (class563.field8012) {
               var1 = class425.method3319(0);
               var2 = class630.method4620((byte)85);
            }

            class725.method5249(class140.field2243 + var2, class557.field7909 + var1, var1, class7.field130, 0, var1, var2, var2, -1);
            if (class173.field2582 != null) {
               class86.method901(class138.field2224.field1427, var1, var2, class100.field1591, var2 - -class140.field2243, class536.field7525, class173.field2582, class557.field7909 + var1, true, -96255198, -1412584499);
               class173.field2582 = null;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5658[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3027(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3028(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
