import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class242 {
   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3055 = new String[]{method1925(method1924("zAv9L")), method1925(method1924("zAv<L")), method1925(method1924("zAv;L")), method1925(method1924("zAv:L"))};
   @OriginalMember(
      owner = "client!hm",
      name = "i",
      descriptor = "Lse;"
   )
   public static class6 field3048 = new class6(47, 3);
   @OriginalMember(
      owner = "client!hm",
      name = "e",
      descriptor = "I"
   )
   public static int field3053 = 2;
   @OriginalMember(
      owner = "client!hm",
      name = "h",
      descriptor = "Lvv;"
   )
   public static class467 field3052 = new class467();
   @OriginalMember(
      owner = "client!hm",
      name = "f",
      descriptor = "I"
   )
   public static int field3046;
   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "I"
   )
   public static int field3049;
   @OriginalMember(
      owner = "client!hm",
      name = "c",
      descriptor = "I"
   )
   public static int field3050;
   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "I"
   )
   public static int field3051;
   @OriginalMember(
      owner = "client!hm",
      name = "d",
      descriptor = "I"
   )
   public static int field3054;
   @OriginalMember(
      owner = "client!hm",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3047;

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(IB)[I"
   )
   public static final int[] method1920(int arg0, byte arg1) {
      try {
         ++field3050;
         if (arg1 != -46) {
            return null;
         } else {
            class30.method243(arg1 ^ 90, class184.method1546((byte)-41, arg0));
            return new int[]{class585.field8631.get(5), class585.field8631.get(2), class585.field8631.get(1)};
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3055[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1921(int arg0, int arg1, int arg2) {
      try {
         ++field3051;
         if (arg0 != 30695) {
            method1923((byte)-102, -69, false);
         }

         return class201.method1666(false, arg2, arg1) || class401.method3144(arg1, (byte)125, arg2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3055[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1922(int arg0) {
      try {
         field3052 = null;
         field3047 = null;
         field3048 = null;
         if (arg0 != 27603) {
            field3052 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3055[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(BIZ)V"
   )
   public static final void method1923(byte arg0, int arg1, boolean arg2) {
      try {
         ++field3049;
         if (arg0 > -95) {
            method1923((byte)-47, 115, false);
         }

         class657 var3 = class733.method5295(arg1, arg2, (byte)118);
         if (var3 != null) {
            var3.method4924(-2970);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3055[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1924(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1925(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
