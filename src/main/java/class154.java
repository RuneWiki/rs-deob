import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class154 extends class465 {
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1946 = new String[]{method1276(method1275("-SZ\u001a4")), method1276(method1275("-SZ\u001c4")), method1276(method1275("-SZ\u00194")), method1276(method1275("-SZ\u001b4")), method1276(method1275("-SZ\u001e4")), method1276(method1275("-SZ\u001d4")), method1276(method1275("-SZ\u001f4")), method1276(method1275("2K\u00184")), method1276(method1275("'\u0010Zva")), method1276(method1275("-SZ\u00104"))};
   @OriginalMember(
      owner = "client!qm",
      name = "o",
      descriptor = "I"
   )
   public static int field1940 = 0;
   @OriginalMember(
      owner = "client!qm",
      name = "h",
      descriptor = "I"
   )
   public static int field1936;
   @OriginalMember(
      owner = "client!qm",
      name = "j",
      descriptor = "I"
   )
   public static int field1937;
   @OriginalMember(
      owner = "client!qm",
      name = "m",
      descriptor = "I"
   )
   public static int field1938;
   @OriginalMember(
      owner = "client!qm",
      name = "l",
      descriptor = "I"
   )
   public static int field1939;
   @OriginalMember(
      owner = "client!qm",
      name = "g",
      descriptor = "I"
   )
   public static int field1941;
   @OriginalMember(
      owner = "client!qm",
      name = "f",
      descriptor = "I"
   )
   public static int field1943;
   @OriginalMember(
      owner = "client!qm",
      name = "k",
      descriptor = "I"
   )
   public static int field1944;
   @OriginalMember(
      owner = "client!qm",
      name = "n",
      descriptor = "I"
   )
   public static int field1945;
   @OriginalMember(
      owner = "client!qm",
      name = "i",
      descriptor = "Lnia;"
   )
   public static class671 field1942;

   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "(I)I",
      line = 6
   )
   public final int method1271(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method77(-94, 11);
         }

         ++field1944;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1946[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 17
   )
   public class154(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "(Z)Z",
      line = 20
   )
   public static final boolean method1272(boolean arg0) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field1945;
            if (class589.field8716 == null) {
               return false;
            } else {
               if (~class589.field8716.field4333 <= -2001) {
                  class589.field8716.field4333 -= 2000;
               }

               return class589.field8716.field4333 == 1003;
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1946[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "(II)V",
      line = 42
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            this.method77(63, -119);
         }

         super.field6984 = arg1;
         ++field1943;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1946[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(Z)V",
      line = 53
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            this.method78(-32);
         }

         ++field1938;
         if (~super.field6984 > -1 && super.field6984 > 127) {
            super.field6984 = this.method78(16726277);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1946[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;IILd;)Lha;",
      line = 67
   )
   public static final class66 method1273(int arg0, Canvas arg1, int arg2, int arg3, class160 arg4) {
      try {
         ++field1937;
         if (arg2 >= -52) {
            field1942 = null;
         }

         return new class531(arg1, arg4, arg0, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1946[6] + arg0 + ',' + (arg1 != null ? field1946[8] : field1946[7]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1946[8] : field1946[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "(I)V",
      line = 79
   )
   public static void method1274(int arg0) {
      try {
         if (arg0 != 28618) {
            field1940 = 122;
         }

         field1942 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1946[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 92
   )
   public class154(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(IB)I",
      line = 95
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field1941;
         int var3 = -108 / ((-51 - arg1) / 60);
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1946[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(I)I",
      line = 110
   )
   public final int method78(int arg0) {
      try {
         ++field1939;
         if (arg0 != 16726277) {
            field1942 = null;
         }

         return 127;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1946[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1275(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1276(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
