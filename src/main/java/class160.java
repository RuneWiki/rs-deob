import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class160 extends class673 {
   @OriginalMember(
      owner = "client!ija",
      name = "r",
      descriptor = "Z"
   )
   public boolean field2047 = false;
   @OriginalMember(
      owner = "client!ija",
      name = "l",
      descriptor = "I"
   )
   public int field2052 = -1;
   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2055 = new String[]{method1343(method1342("\u0007[DU=F")), method1343(method1342("\u0007[DUB\u0007_L\u000f@F")), method1343(method1342("\u0007[DU?F")), method1343(method1342("\u0007[DU<F"))};
   @OriginalMember(
      owner = "client!ija",
      name = "t",
      descriptor = "I"
   )
   public int field2045;
   @OriginalMember(
      owner = "client!ija",
      name = "m",
      descriptor = "I"
   )
   public int field2046;
   @OriginalMember(
      owner = "client!ija",
      name = "q",
      descriptor = "I"
   )
   public int field2048;
   @OriginalMember(
      owner = "client!ija",
      name = "o",
      descriptor = "I"
   )
   public int field2049;
   @OriginalMember(
      owner = "client!ija",
      name = "u",
      descriptor = "I"
   )
   public int field2050;
   @OriginalMember(
      owner = "client!ija",
      name = "v",
      descriptor = "I"
   )
   public static int field2051;
   @OriginalMember(
      owner = "client!ija",
      name = "n",
      descriptor = "I"
   )
   public static int field2053;
   @OriginalMember(
      owner = "client!ija",
      name = "s",
      descriptor = "I"
   )
   public static int field2054;
   @OriginalMember(
      owner = "client!ija",
      name = "p",
      descriptor = "Lww;"
   )
   public static class339 field2044;

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method1339(byte arg0) {
      try {
         ++field2054;
         int var1 = 52 / ((59 - arg0) / 33);
         return ~class455.field6279 < -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2055[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1340(int arg0) {
      try {
         field2044 = null;
         if (arg0 != -1) {
            field2044 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2055[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method1341(int arg0, byte arg1) {
      try {
         if (arg1 >= 82) {
            ++field2053;
            class487 var2 = class2.method12((long)arg0, 14, (byte)43);
            var2.method3696(-11118);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2055[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class160(int arg0) {
      try {
         this.field2052 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2055[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1342(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1343(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
