import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class390 {
   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5452 = new String[]{method2970(method2969("m\u00135zT")), method2970(method2969("m\u00135|T")), method2970(method2969("m\u00135\u007fT"))};
   @OriginalMember(
      owner = "client!vk",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field5446 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!vk",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field5447 = new int[1];
   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field5450 = new class378(88, 6);
   @OriginalMember(
      owner = "client!vk",
      name = "c",
      descriptor = "I"
   )
   public static int field5448;
   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "I"
   )
   public static int field5449;
   @OriginalMember(
      owner = "client!vk",
      name = "e",
      descriptor = "I"
   )
   public static int field5451;

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(Liha;)V"
   )
   public static final void method2965(class32 arg0) {
      class46.field528 = arg0;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(IIBIIZ)V"
   )
   public static final void method2966(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method2967(boolean arg0, int arg1) {
      try {
         ++field5449;
         if (!arg0) {
            return false;
         } else {
            return ~arg1 == -4 || arg1 == 4 || ~arg1 == -6 || arg1 == 6;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5452[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2968(byte arg0) {
      try {
         if (arg0 < -32) {
            field5447 = null;
            field5450 = null;
            field5446 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5452[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2969(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2970(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
