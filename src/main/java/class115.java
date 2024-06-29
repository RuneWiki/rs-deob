import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class115 extends class438 {
   @OriginalMember(
      owner = "client!rja",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1868 = new String[]{method1093(method1092("4\u001e@\u0010]n")), method1093(method1092("4\u001e@\u0010Zn")), method1093(method1092("4\u001e@\u0010Xn")), method1093(method1092("fHBQs{\u0012GXy \u0012\u001f\u0000")), method1093(method1092("(\u0001MR")), method1093(method1092("4\u001e@\u0010Wn")), method1093(method1092("=Z\u000f\u0010b"))};
   @OriginalMember(
      owner = "client!rja",
      name = "J",
      descriptor = "[[I"
   )
   public static int[][] field1857 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!rja",
      name = "G",
      descriptor = "Lgw;"
   )
   public static class179 field1862 = new class179(128, 4);
   @OriginalMember(
      owner = "client!rja",
      name = "I",
      descriptor = "Lgh;"
   )
   public static class572 field1867 = new class572(32, 4);
   @OriginalMember(
      owner = "client!rja",
      name = "Q",
      descriptor = "I"
   )
   public static int field1858;
   @OriginalMember(
      owner = "client!rja",
      name = "K",
      descriptor = "I"
   )
   public static int field1861;
   @OriginalMember(
      owner = "client!rja",
      name = "H",
      descriptor = "I"
   )
   public static int field1863;
   @OriginalMember(
      owner = "client!rja",
      name = "L",
      descriptor = "I"
   )
   public static int field1864;
   @OriginalMember(
      owner = "client!rja",
      name = "N",
      descriptor = "I"
   )
   public int field1866;
   @OriginalMember(
      owner = "client!rja",
      name = "C",
      descriptor = "Lhw;"
   )
   public static class141 field1859;
   @OriginalMember(
      owner = "client!rja",
      name = "M",
      descriptor = "Ltq;"
   )
   public class653 field1860;
   @OriginalMember(
      owner = "client!rja",
      name = "O",
      descriptor = "[B"
   )
   public byte[] field1865;

   @OriginalMember(
      owner = "client!rja",
      name = "j",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1088(int arg0) {
      try {
         field1862 = null;
         field1859 = null;
         if (arg0 != 0) {
            field1864 = -91;
         }

         field1867 = null;
         field1857 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1868[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "h",
      descriptor = "(I)I",
      line = 20
   )
   public final int method1089(int arg0) {
      try {
         if (arg0 != 1) {
            method1090(false, (class59)null);
         }

         ++field1858;
         return super.field6322 ? 0 : 100;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1868[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(ZLvg;)Ljava/lang/String;",
      line = 35
   )
   public static final String method1090(boolean arg0, class59 arg1) {
      try {
         ++field1861;
         if (arg0) {
            field1867 = null;
         }

         return arg1.field1132 + field1868[3];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1868[5] + arg0 + ',' + (arg1 != null ? field1868[6] : field1868[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(I)[B",
      line = 48
   )
   public final byte[] method1091(int arg0) {
      try {
         ++field1863;
         if (super.field6322) {
            throw new RuntimeException();
         } else {
            if (arg0 != 0) {
               method1090(false, (class59)null);
            }

            return this.field1865;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1868[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1092(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1093(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
