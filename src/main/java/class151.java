import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class151 extends class606 {
   @OriginalMember(
      owner = "client!mha",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2324 = new String[]{method1472(method1471("~/\u0010:q;")), method1472(method1471("~/\u0010:z;"))};
   @OriginalMember(
      owner = "client!mha",
      name = "D",
      descriptor = "Lhj;"
   )
   public static class670 field2323 = new class670();
   @OriginalMember(
      owner = "client!mha",
      name = "E",
      descriptor = "I"
   )
   public static int field2322;

   @OriginalMember(
      owner = "client!mha",
      name = "<init>",
      descriptor = "()V"
   )
   public class151() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mha",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method1470(byte arg0) {
      try {
         if (arg0 < -42) {
            field2323 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2324[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      try {
         ++field2322;
         int[] var3 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            method1470((byte)95);
         }

         if (super.field8645.field4884) {
            class474.method3643(var3, 0, class563.field8014, class693.field10001[arg1]);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2324[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
