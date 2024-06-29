import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class22 {
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field337 = new String[]{method172(method171("\u0002\u001f'XJ")), method172(method171("\u0002\u001f'YJ"))};
   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field336 = new int[4096];
   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "I"
   )
   public static int field335;

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method169(int arg0, int arg1) {
      try {
         ++field335;
         if (arg0 != 4096) {
            field336 = null;
         }

         return arg1 == 0 || ~arg1 == -3;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field337[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method170(int arg0) {
      try {
         if (arg0 <= 125) {
            method169(25, -103);
         }

         field336 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field337[1] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -4097; ++var0) {
         field336[var0] = class546.method4125(-731, var0);
      }

   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method171(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method172(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
