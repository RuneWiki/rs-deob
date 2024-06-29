import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class548 {
   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "I"
   )
   public int field7915;
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7921 = new String[]{method4091(method4090("C%\"M?X!xO~")), method4091(method4090("C%\"\u00059e<~\u00188Q`")), method4091(method4090("C%\"3~")), method4091(method4090("C%\"0~"))};
   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field7917 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!um",
      name = "e",
      descriptor = "I"
   )
   public static int field7919 = 1;
   @OriginalMember(
      owner = "client!um",
      name = "d",
      descriptor = "I"
   )
   public static int field7916 = 100;
   @OriginalMember(
      owner = "client!um",
      name = "f",
      descriptor = "I"
   )
   public static int field7914;
   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "I"
   )
   public static int field7920;
   @OriginalMember(
      owner = "client!um",
      name = "g",
      descriptor = "Lpo;"
   )
   public static class582 field7918;

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(IIIZ)I"
   )
   public static final int method4088(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field7914;
         class349 var4 = class190.method1656((byte)78, arg3, arg2);
         if (arg0 != -1) {
            method4089(true);
         }

         if (var4 == null) {
            return -1;
         } else {
            return arg1 >= 0 && ~var4.field4963.length < ~arg1 ? var4.field4963[arg1] : -1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7921[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7920;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7921[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4089(boolean arg0) {
      try {
         field7917 = null;
         if (!arg0) {
            method4089(true);
         }

         field7918 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7921[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class548(int arg0, int arg1) {
      try {
         this.field7915 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7921[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
