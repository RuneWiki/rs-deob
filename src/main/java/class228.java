import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class228 implements class110 {
   @OriginalMember(
      owner = "client!iq",
      name = "h",
      descriptor = "Liba;"
   )
   public class237 field2861;
   @OriginalMember(
      owner = "client!iq",
      name = "k",
      descriptor = "I"
   )
   public int field2853;
   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "I"
   )
   public int field2855;
   @OriginalMember(
      owner = "client!iq",
      name = "c",
      descriptor = "I"
   )
   public int field2862;
   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "I"
   )
   public int field2850;
   @OriginalMember(
      owner = "client!iq",
      name = "m",
      descriptor = "I"
   )
   public int field2859;
   @OriginalMember(
      owner = "client!iq",
      name = "e",
      descriptor = "Lbu;"
   )
   public class596 field2857;
   @OriginalMember(
      owner = "client!iq",
      name = "l",
      descriptor = "I"
   )
   public int field2854;
   @OriginalMember(
      owner = "client!iq",
      name = "d",
      descriptor = "I"
   )
   public int field2856;
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2863 = new String[]{method1823(method1822(";j\u001d\u0017\u0011")), method1823(method1822(")5\u001d{D")), method1823(method1822(";j\u001diP<rGk\u0011")), method1823(method1822("<n_9")), method1823(method1822(";j\u001d\u001d\u0011"))};
   @OriginalMember(
      owner = "client!iq",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2852 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!iq",
      name = "i",
      descriptor = "[Lls;"
   )
   public static class167[] field2851 = new class167[4];
   @OriginalMember(
      owner = "client!iq",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field2860 = true;
   @OriginalMember(
      owner = "client!iq",
      name = "g",
      descriptor = "I"
   )
   public static int field2858;

   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1821(byte arg0) {
      try {
         field2852 = null;
         field2851 = null;
         int var1 = 109 % ((-32 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2863[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(Liba;Lbu;IIIIIII)V"
   )
   public class228(class237 arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field2861 = arg0;
         this.field2853 = arg4;
         this.field2855 = arg2;
         this.field2862 = arg8;
         this.field2850 = arg5;
         this.field2859 = arg7;
         this.field2857 = arg1;
         this.field2854 = arg3;
         this.field2856 = arg6;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2863[2] + (arg0 != null ? field2863[1] : field2863[3]) + ',' + (arg1 != null ? field2863[1] : field2863[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public class499 method842(byte arg0) {
      try {
         ++field2858;
         int var2 = 76 % ((4 - arg0) / 37);
         return null;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2863[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1822(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1823(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
