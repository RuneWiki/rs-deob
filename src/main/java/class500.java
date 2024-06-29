import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class500 {
   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6871 = new String[]{method3613(method3612("6~\nDI\u00197")), method3613(method3612("5j\u0007\u0006")), method3613(method3612(" 1EDv")), method3613(method3612("6~\nDH\u00197")), method3613(method3612("6~\nDN\u00197")), method3613(method3612("6~\nDO\u00197"))};
   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6869 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "S"
   )
   public static short field6865 = 1;
   @OriginalMember(
      owner = "client!maa",
      name = "h",
      descriptor = "I"
   )
   public static int field6864;
   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "I"
   )
   public static int field6866;
   @OriginalMember(
      owner = "client!maa",
      name = "g",
      descriptor = "I"
   )
   public static int field6868;
   @OriginalMember(
      owner = "client!maa",
      name = "e",
      descriptor = "J"
   )
   public long field6862;
   @OriginalMember(
      owner = "client!maa",
      name = "f",
      descriptor = "Lmaa;"
   )
   public class500 field6863;
   @OriginalMember(
      owner = "client!maa",
      name = "i",
      descriptor = "Lmaa;"
   )
   public class500 field6867;
   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "Lcr;"
   )
   public static class603 field6870;

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3608(boolean arg0) {
      try {
         if (!arg0) {
            field6869 = null;
            field6870 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6871[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3609(int arg0) {
      try {
         ++field6864;
         if (arg0 > 79) {
            if (this.field6863 != null) {
               this.field6863.field6867 = this.field6867;
               this.field6867.field6863 = this.field6863;
               this.field6867 = null;
               this.field6863 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6871[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method3610(int arg0) {
      try {
         if (arg0 != 536870911) {
            return false;
         } else {
            ++field6868;
            return this.field6863 != null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6871[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(BLqh;)V"
   )
   public static final void method3611(byte arg0, class74 arg1) {
      try {
         class20.field249 = arg1;
         if (arg0 < -85) {
            ++field6866;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6871[0] + arg0 + ',' + (arg1 != null ? field6871[2] : field6871[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
