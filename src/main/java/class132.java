import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class132 {
   @OriginalMember(
      owner = "client!ej",
      name = "m",
      descriptor = "I"
   )
   public int field1653 = 1;
   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1658 = new String[]{method1136(method1135("\u0007\"\r\u00172")), method1136(method1135("\u0019f\rxg")), method1136(method1135("\u0012yOU")), method1136(method1135("\u0019f\r|g")), method1136(method1135("\u0019f\r}g")), method1136(method1135("\u0019f\r{g")), method1136(method1135("\u0019f\rzg")), method1136(method1135("\u0019f\r\u007fg"))};
   @OriginalMember(
      owner = "client!ej",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field1649 = new class101(12, 16);
   @OriginalMember(
      owner = "client!ej",
      name = "h",
      descriptor = "I"
   )
   public static int field1657 = 0;
   @OriginalMember(
      owner = "client!ej",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field1656 = false;
   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "C"
   )
   public char field1650;
   @OriginalMember(
      owner = "client!ej",
      name = "e",
      descriptor = "I"
   )
   public static int field1645;
   @OriginalMember(
      owner = "client!ej",
      name = "g",
      descriptor = "I"
   )
   public static int field1646;
   @OriginalMember(
      owner = "client!ej",
      name = "l",
      descriptor = "I"
   )
   public static int field1647;
   @OriginalMember(
      owner = "client!ej",
      name = "j",
      descriptor = "I"
   )
   public static int field1648;
   @OriginalMember(
      owner = "client!ej",
      name = "d",
      descriptor = "I"
   )
   public static int field1651;
   @OriginalMember(
      owner = "client!ej",
      name = "k",
      descriptor = "I"
   )
   public static int field1652;
   @OriginalMember(
      owner = "client!ej",
      name = "f",
      descriptor = "I"
   )
   public static int field1654;
   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "I"
   )
   public static int field1655;

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1129(int arg0, int arg1) {
      try {
         ++field1646;
         if (~arg0 != -31 && arg0 != 5 && ~arg0 != -16 && ~arg0 != -9 && arg0 != 1011) {
            if (arg1 > -39) {
               return true;
            } else {
               return arg0 == 49 || ~arg0 == -1010;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1658[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(BLln;)V"
   )
   public static final void method1130(byte arg0, class397 arg1) {
      try {
         ++field1654;
         int var2 = -class314.field4488 + arg1.field6086;
         int var3 = arg1.field6089 * 512 - -(arg1.method3046(110) * 256);
         int var4 = arg1.field6039 * 512 - -(256 * arg1.method3046(120));
         if (arg0 != 98) {
            method1129(-25, -15);
         }

         arg1.field9003 += (-arg1.field9003 + var3) / var2;
         arg1.field9007 += (-arg1.field9007 + var4) / var2;
         arg1.field6123 = 0;
         if (arg1.field6031 == 0) {
            arg1.method3045(8192, arg0 + -19050);
         }

         if (arg1.field6031 == 1) {
            arg1.method3045(12288, -18952);
         }

         if (arg1.field6031 == 2) {
            arg1.method3045(0, arg0 + -19050);
         }

         if (~arg1.field6031 == -4) {
            arg1.method3045(4096, -18952);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1658[3] + arg0 + ',' + (arg1 != null ? field1658[0] : field1658[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1131(boolean arg0) {
      try {
         class264.field3613.method5680(true);
         ++field1645;
         class309.field4394.method5680(!arg0);
         if (arg0) {
            method1131(true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1658[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1132(int arg0) {
      try {
         field1649 = null;
         if (arg0 != -16) {
            method1129(-18, -83);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1658[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Ljj;I)V"
   )
   public final void method1133(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field1651;
         if (arg1 != 49) {
            method1132(-114);
         }

         do {
            int var4 = arg0.method1104(255);
            if (var4 == 0) {
               break;
            }

            this.method1134(arg0, var4, arg1 + -49);
         } while(var3 == 0);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1658[1] + (arg0 != null ? field1658[0] : field1658[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Ljj;II)V"
   )
   private final void method1134(class128 arg0, int arg1, int arg2) {
      try {
         label30: {
            if (~arg1 == -2) {
               this.field1650 = class296.method2252(arg0.method1047((byte)52), 0);
               if (client.field4530 == 0) {
                  break label30;
               }
            }

            if (~arg1 == -3) {
               this.field1653 = 0;
            }
         }

         if (arg2 == 0) {
            ++field1648;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1658[6] + (arg0 != null ? field1658[0] : field1658[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
