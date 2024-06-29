import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class229 extends class87 {
   @OriginalMember(
      owner = "client!eh",
      name = "j",
      descriptor = "Lik;"
   )
   public class124 field2864;
   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2868 = new String[]{method1827(method1826("vso2")), method1827(method1826("c(-p2")), method1827(method1826("}n-\u001cg")), method1827(method1826("}n-\u001fg")), method1827(method1826("}n-b&vow`g"))};
   @OriginalMember(
      owner = "client!eh",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2865 = new int[1];
   @OriginalMember(
      owner = "client!eh",
      name = "i",
      descriptor = "I"
   )
   public static int field2866;
   @OriginalMember(
      owner = "client!eh",
      name = "h",
      descriptor = "[Lu;"
   )
   public static class65[] field2867;

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1824(boolean arg0) {
      try {
         if (arg0) {
            field2865 = null;
         }

         field2867 = null;
         field2865 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2868[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Z[B)Ljava/lang/String;"
   )
   public static final String method1825(boolean arg0, byte[] arg1) {
      try {
         ++field2866;
         return !arg0 ? null : class271.method2154((byte)65, arg1, 0, arg1.length);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2868[2] + arg0 + ',' + (arg1 != null ? field2868[1] : field2868[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "<init>",
      descriptor = "(Liu;II[B)V"
   )
   public class229(class530 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field2864 = class598.method4449(arg2, 6406, false, arg0, 3553, 6406, arg1, arg3);
         this.field2864.method2121(0, false, false);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2868[4] + (arg0 != null ? field2868[1] : field2868[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2868[1] : field2868[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1826(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1827(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
