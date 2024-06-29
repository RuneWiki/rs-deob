import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class673 {
   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9876 = new String[]{method4924(method4923("\u0010LMAS")), method4924(method4923("\u0010LMBS"))};
   @OriginalMember(
      owner = "client!og",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9872 = new int[1000];
   @OriginalMember(
      owner = "client!og",
      name = "f",
      descriptor = "Lgh;"
   )
   public static class572 field9870 = new class572(105, 4);
   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "I"
   )
   public static int field9874 = -1;
   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field9875 = new class572(116, -1);
   @OriginalMember(
      owner = "client!og",
      name = "c",
      descriptor = "I"
   )
   public static int field9871;
   @OriginalMember(
      owner = "client!og",
      name = "e",
      descriptor = "Ljava/lang/Thread;"
   )
   public static Thread field9873;

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4921(int arg0) {
      try {
         class769.field11205.method1589((byte)51);
         ++field9871;
         if (arg0 < 104) {
            method4922((byte)8);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9876[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4922(byte arg0) {
      try {
         field9875 = null;
         field9873 = null;
         field9872 = null;
         field9870 = null;
         if (arg0 > -34) {
            field9874 = -118;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9876[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4923(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4924(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
