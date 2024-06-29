import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class306 {
   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4789 = new String[]{method2569(method2568("cz\u001f\r_")), method2569(method2568("cz\u001f\f_"))};
   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "I"
   )
   public static int field4786 = 0;
   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4785 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!ki",
      name = "d",
      descriptor = "I"
   )
   public static int field4788 = -1;
   @OriginalMember(
      owner = "client!ki",
      name = "c",
      descriptor = "I"
   )
   public static int field4787;

   @OriginalMember(
      owner = "client!ki",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2563(byte arg0) {
      try {
         field4785 = null;
         if (arg0 != -66) {
            field4785 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4789[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(B)V",
      line = 17
   )
   public static final void method2564(byte arg0) {
      try {
         if (arg0 != -119) {
            field4786 = -45;
         }

         class79.field1054 = 0;
         class745.field11066 = -1;
         ++field4787;
         class581.field8579 = -1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4789[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(III)[B"
   )
   public abstract byte[] method2565(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Z[B)V"
   )
   public abstract void method2566(boolean arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method2567(int arg0);

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2568(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2569(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
