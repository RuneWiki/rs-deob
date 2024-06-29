import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class607 {
   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8658 = new String[]{method4477(method4476(".q^$O")), method4477(method4476(".q^%O")), method4477(method4476(".q^'O"))};
   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "I"
   )
   public static int field8656;
   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "I"
   )
   public static int field8657;

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method4473(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8658[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4474(int arg0) {
      try {
         if (arg0 != 12) {
            method4474(86);
         }

         class521.field7326.method1052(true);
         ++field8657;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8658[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4475(int arg0) {
      try {
         if (arg0 == -27046) {
            ++field8656;
            if (~class476.field6870.field9133.method2232(arg0 ^ 27119) == -1 && class697.field10057 != class128.field2049) {
               class240.method2107(class2.field18, 12, false, class130.field2098, (byte)103);
            } else {
               class394.method3054(class54.field794, (byte)29);
               if (class394.field5767 != class128.field2049) {
                  class670.method4857(true);
               }
            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8658[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4477(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
