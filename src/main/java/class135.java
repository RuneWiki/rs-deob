import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class135 {
   @OriginalMember(
      owner = "client!ju",
      name = "g",
      descriptor = "I"
   )
   public int field1749;
   @OriginalMember(
      owner = "client!ju",
      name = "i",
      descriptor = "I"
   )
   public int field1750;
   @OriginalMember(
      owner = "client!ju",
      name = "f",
      descriptor = "I"
   )
   public int field1754;
   @OriginalMember(
      owner = "client!ju",
      name = "l",
      descriptor = "I"
   )
   public int field1755;
   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1761 = new String[]{method1137(method1136("/o\u0006\u001bj")), method1137(method1136("/o\u0006\u001ej")), method1137(method1136(">4\u0006q?")), method1137(method1136("+oD3")), method1137(method1136("/o\u0006\u001aj")), method1137(method1136("/o\u0006\u001dj")), method1137(method1136("/o\u0006\u001cj")), method1137(method1136("/o\u0006c++s\\aj"))};
   @OriginalMember(
      owner = "client!ju",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1751 = true;
   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "I"
   )
   public static int field1752;
   @OriginalMember(
      owner = "client!ju",
      name = "c",
      descriptor = "I"
   )
   public static int field1753;
   @OriginalMember(
      owner = "client!ju",
      name = "k",
      descriptor = "I"
   )
   public static int field1756;
   @OriginalMember(
      owner = "client!ju",
      name = "d",
      descriptor = "I"
   )
   public static int field1758;
   @OriginalMember(
      owner = "client!ju",
      name = "h",
      descriptor = "I"
   )
   public static int field1759;
   @OriginalMember(
      owner = "client!ju",
      name = "e",
      descriptor = "I"
   )
   public static int field1760;
   @OriginalMember(
      owner = "client!ju",
      name = "j",
      descriptor = "Lqh;"
   )
   public static class74 field1757;

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(ILha;IIILeb;)V"
   )
   public static final void method1131(int arg0, class65 arg1, int arg2, int arg3, int arg4, class657 arg5) {
      boolean var6 = client.field4273;

      try {
         ++field1759;
         if (arg0 == 860) {
            int var7 = 7;
            if (var6 || var7 >= 0) {
               do {
                  int var8 = 127;
                  if (var6 || var8 >= 0) {
                     do {
                        int var9 = 127 & var8 | (63 & arg4) << 10 | (7 & var7) << 7;
                        class593.method4269(-1, true, false);
                        int var10 = class661.field9422[var9];
                        class481.method3502(-1, false, true);
                        arg1.method508((arg5.field9379 * var8 >> 7) + arg3, ((-var7 + 7) * arg5.field9360 >> 3) + arg2, (arg5.field9379 >> 7) - -1, (arg5.field9360 >> 3) - -1, var10, 0);
                        --var8;
                     } while(var8 >= 0);
                  }

                  --var7;
               } while(var7 >= 0);

            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1761[4] + arg0 + ',' + (arg1 != null ? field1761[2] : field1761[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1761[2] : field1761[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1132(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 20) {
            return false;
         } else {
            ++field1752;
            return class301.method2267(2, arg2, arg0) | (458752 & arg2) != 0 || class430.method3224(arg0, arg2, 125);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1761[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1133(int arg0) {
      try {
         class674.field9907.method4407(class674.field9907.field8444, -2160, 1);
         ++field1758;
         class674.field9907.method4407(class674.field9907.field8458, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8427, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8421, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8424, -2160, arg0);
         class674.field9907.method4407(class674.field9907.field8461, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8423, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8445, arg0 + -2161, 1);
         class674.field9907.method4407(class674.field9907.field8443, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8447, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8448, arg0 + -2161, 2);
         class674.field9907.method4407(class674.field9907.field8457, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8450, -2160, 2);
         class674.field9907.method4407(class674.field9907.field8436, arg0 + -2161, 1);
         class674.field9907.method4407(class674.field9907.field8468, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8429, arg0 ^ -2159, 0);
         class674.field9907.method4407(class674.field9907.field8430, arg0 ^ -2159, 2);
         class674.field9907.method4407(class674.field9907.field8435, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8469, arg0 ^ -2159, 0);
         class721.method5244(arg0 ^ 11337);
         class674.field9907.method4407(class674.field9907.field8437, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8440, -2160, 4);
         class493.method3579((byte)-75);
         class300.method2261(15966);
         class343.field4915 = true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1761[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1134(byte arg0) {
      try {
         if (arg0 != 66) {
            field1756 = -74;
         }

         field1757 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1761[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class135(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field1749 = arg0;
         this.field1750 = arg2;
         this.field1754 = arg3;
         this.field1755 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1761[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(II)Lju;"
   )
   public final class135 method1135(int arg0, int arg1) {
      try {
         ++field1760;
         if (arg0 != -28380) {
            method1133(-123);
         }

         return new class135(this.field1749, arg1, this.field1750, this.field1754);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1761[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
