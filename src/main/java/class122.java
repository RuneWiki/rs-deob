import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class122 extends class465 {
   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1491 = new String[]{method1012(method1011("V]Nlw")), method1012(method1011("V]Nmw")), method1012(method1011("V]Nnw")), method1012(method1011("V]Nhw")), method1012(method1011("V]Njw")), method1012(method1011("V]Niw")), method1012(method1011("V]Now"))};
   @OriginalMember(
      owner = "client!bm",
      name = "p",
      descriptor = "I"
   )
   public static int field1480 = 1408;
   @OriginalMember(
      owner = "client!bm",
      name = "m",
      descriptor = "I"
   )
   public static int field1488 = 0;
   @OriginalMember(
      owner = "client!bm",
      name = "l",
      descriptor = "Lsd;"
   )
   public static class101 field1483 = new class101(0, -1);
   @OriginalMember(
      owner = "client!bm",
      name = "k",
      descriptor = "Lma;"
   )
   public static class14 field1490 = new class14();
   @OriginalMember(
      owner = "client!bm",
      name = "n",
      descriptor = "I"
   )
   public static int field1481;
   @OriginalMember(
      owner = "client!bm",
      name = "i",
      descriptor = "I"
   )
   public static int field1482;
   @OriginalMember(
      owner = "client!bm",
      name = "j",
      descriptor = "I"
   )
   public static int field1484;
   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "I"
   )
   public static int field1485;
   @OriginalMember(
      owner = "client!bm",
      name = "g",
      descriptor = "I"
   )
   public static int field1486;
   @OriginalMember(
      owner = "client!bm",
      name = "o",
      descriptor = "I"
   )
   public static int field1487;
   @OriginalMember(
      owner = "client!bm",
      name = "h",
      descriptor = "I"
   )
   public static int field1489;

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(II)V",
      line = 3
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            this.method78(-11);
         }

         ++field1482;
         super.field6984 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1491[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(Z)V",
      line = 14
   )
   public final void method69(boolean arg0) {
      try {
         if (super.field6984 < 0 || ~super.field6984 < -5) {
            super.field6984 = this.method78(16726277);
         }

         ++field1485;
         if (arg0) {
            this.method78(7);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1491[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(I)I",
      line = 27
   )
   public final int method1008(int arg0) {
      try {
         if (arg0 <= 81) {
            return 51;
         } else {
            ++field1484;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1491[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(IB)I",
      line = 43
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 126 % ((arg1 - -51) / 60);
         ++field1481;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1491[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(I)I",
      line = 53
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field1488 = -8;
         }

         ++field1486;
         return 3;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1491[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 66
   )
   public class122(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(B)V",
      line = 71
   )
   public static void method1009(byte arg0) {
      try {
         int var1 = -105 / ((arg0 - 29) / 61);
         field1483 = null;
         field1490 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1491[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(IBI)Z",
      line = 84
   )
   public static final boolean method1010(int arg0, byte arg1, int arg2) {
      try {
         ++field1487;
         if (arg1 != -100) {
            field1488 = -105;
         }

         return class394.method3020(arg0, arg2, -1) | ~(arg2 & 458752) != -1 || class401.method3081(false, arg0, arg2);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1491[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 95
   )
   public class122(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1011(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1012(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
