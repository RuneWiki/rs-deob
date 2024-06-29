import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class693 {
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10192 = new String[]{method5056(method5055("c\u0005Yi<\"")), method5056(method5055("c\u0005Yi?\""))};
   @OriginalMember(
      owner = "client!ica",
      name = "c",
      descriptor = "Lqd;"
   )
   public static class475 field10188 = new class475("", 15);
   @OriginalMember(
      owner = "client!ica",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10191 = false;
   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10190 = new int[4096];
   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "I"
   )
   public static int field10189;

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method5053(byte arg0) {
      try {
         ++field10189;
         if (arg0 < 94) {
            method5053((byte)-128);
         }

         return 16;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10192[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5054(int arg0) {
      try {
         field10188 = null;
         int var1 = 41 % ((-22 - arg0) / 55);
         field10190 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10192[1] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -4097; ++var0) {
         field10190[var0] = class478.method3489(var0, 4123);
      }

   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5055(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5056(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
