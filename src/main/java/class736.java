import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class class736 {
   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10960 = new String[]{method5416(method5415("R[\u001a\u0010")), method5416(method5415("G\u0000XR4")), method5416(method5415("][X6a")), method5416(method5415("][X=a")), method5416(method5415("][X9a"))};
   @OriginalMember(
      owner = "client!au",
      name = "f",
      descriptor = "Ltv;"
   )
   public static class311 field10953 = new class311(method5416(method5415("[O\u001b\u0019}")), method5416(method5415("{O\u001b\u0019i\b")), 3);
   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "I"
   )
   public static int field10955 = -1;
   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field10956 = new class498(25, 2);
   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "[S"
   )
   public static short[] field10958 = new short[]{59, 15, 58, 12, 51, 13, 5, 16};
   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "I"
   )
   public static int field10954;
   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "I"
   )
   public static int field10957;
   @OriginalMember(
      owner = "client!au",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10959;

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static void method5412(byte arg0) {
      try {
         field10959 = null;
         field10958 = null;
         if (arg0 != -106) {
            field10953 = null;
         }

         field10956 = null;
         field10953 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10960[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I[B)Ljava/lang/String;",
      line = 19
   )
   public static final String method5413(int arg0, byte[] arg1) {
      try {
         ++field10954;
         if (arg0 != 16) {
            field10959 = null;
         }

         return class45.method326(arg1.length, true, arg1, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10960[2] + arg0 + ',' + (arg1 != null ? field10960[1] : field10960[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(B)Z",
      line = 36
   )
   public final boolean method5414(byte arg0) {
      try {
         ++field10957;
         if (arg0 <= 3) {
            return false;
         } else {
            return this.method2582((byte)-121) || this.method2573((byte)-7) || this.method2570(25);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10960[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method2577(int arg0);

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method2578(boolean arg0);

   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "(I)Luw;"
   )
   public abstract class670 method2576(int arg0);

   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method2573(byte arg0);

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method2579(int arg0);

   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "(B)Z"
   )
   public abstract boolean method2582(byte arg0);

   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "(I)I"
   )
   public abstract int method2571(int arg0);

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method2570(int arg0);

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
