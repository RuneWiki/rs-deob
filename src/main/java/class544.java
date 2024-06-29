import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class544 {
   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7887 = new String[]{method4073(method4072(")p\u001bMq")), method4073(method4072(")p\u001bOq")), method4073(method4072(")p\u001bLq"))};
   @OriginalMember(
      owner = "client!cb",
      name = "f",
      descriptor = "[B"
   )
   public static byte[] field7883 = new byte[520];
   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "Lqi;"
   )
   public static class591 field7880 = new class591(2);
   @OriginalMember(
      owner = "client!cb",
      name = "g",
      descriptor = "[[Z"
   )
   public static boolean[][] field7884 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!cb",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field7885 = false;
   @OriginalMember(
      owner = "client!cb",
      name = "e",
      descriptor = "I"
   )
   public static int field7881;
   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "I"
   )
   public static int field7882;
   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field7886;

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(I)Z",
      line = 11
   )
   public static final boolean method4069(int arg0) {
      try {
         if (arg0 != 3) {
            method4069(-40);
         }

         ++field7881;
         return class527.field7681;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7887[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(II)V",
      line = 23
   )
   public static final void method4070(int arg0, int arg1) {
      try {
         ++field7882;
         int var2 = -124 / ((arg1 - 70) / 44);
         class536 var3 = class108.method1038((long)arg0, 104, 3);
         var3.method4013((byte)126);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7887[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(I)V",
      line = 36
   )
   public static void method4071(int arg0) {
      try {
         field7884 = null;
         field7886 = null;
         field7883 = null;
         field7880 = null;
         int var1 = -20 / ((37 - arg0) / 58);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7887[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
