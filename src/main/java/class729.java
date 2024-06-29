import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class729 {
   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "I"
   )
   public int field10679;
   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10682 = new String[]{method5318(method5317("E\u000f\"9x")), method5318(method5317("PT`{")), method5318(method5317("WB\"+lPHx)-")), method5318(method5317("WB\"V-")), method5318(method5317("WB\"cjmU~~kY\t")), method5318(method5317("WB\"U-"))};
   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "[[Z"
   )
   public static boolean[][] field10676 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "I"
   )
   public static int field10677;
   @OriginalMember(
      owner = "client!ic",
      name = "f",
      descriptor = "I"
   )
   public static int field10678;
   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "I"
   )
   public static int field10681;
   @OriginalMember(
      owner = "client!ic",
      name = "e",
      descriptor = "[[S"
   )
   public static short[][] field10680;

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I)I",
      line = 10
   )
   public final int method5315(int arg0) {
      try {
         ++field10678;
         if (arg0 <= 38) {
            method5316((byte)-116);
         }

         return this.field10679;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10682[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 21
   )
   public final String toString() {
      try {
         ++field10677;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10682[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(B)V",
      line = 37
   )
   public static void method5316(byte arg0) {
      try {
         field10680 = null;
         if (arg0 != 75) {
            field10676 = null;
         }

         field10676 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10682[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 48
   )
   public class729(String arg0, int arg1) {
      try {
         this.field10679 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10682[2] + (arg0 != null ? field10682[0] : field10682[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5317(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5318(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
