import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 extends class76 {
   @OriginalMember(
      owner = "client!gs",
      name = "Q",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field654 = method404(method403("-tI!x"));
   @OriginalMember(
      owner = "client!gs",
      name = "F",
      descriptor = "[F"
   )
   public static float[] field641 = new float[4];
   @OriginalMember(
      owner = "client!gs",
      name = "L",
      descriptor = "I"
   )
   public int field637;
   @OriginalMember(
      owner = "client!gs",
      name = "B",
      descriptor = "I"
   )
   public static int field640;
   @OriginalMember(
      owner = "client!gs",
      name = "C",
      descriptor = "I"
   )
   public int field642;
   @OriginalMember(
      owner = "client!gs",
      name = "A",
      descriptor = "I"
   )
   public int field643;
   @OriginalMember(
      owner = "client!gs",
      name = "O",
      descriptor = "I"
   )
   public int field646;
   @OriginalMember(
      owner = "client!gs",
      name = "H",
      descriptor = "I"
   )
   public int field648;
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "I"
   )
   public int field652;
   @OriginalMember(
      owner = "client!gs",
      name = "P",
      descriptor = "Lkf;"
   )
   public static class266 field638;
   @OriginalMember(
      owner = "client!gs",
      name = "K",
      descriptor = "Lkf;"
   )
   public static class266 field653;
   @OriginalMember(
      owner = "client!gs",
      name = "E",
      descriptor = "Lqd;"
   )
   public class475 field645;
   @OriginalMember(
      owner = "client!gs",
      name = "N",
      descriptor = "Ljava/lang/String;"
   )
   public String field647;
   @OriginalMember(
      owner = "client!gs",
      name = "D",
      descriptor = "[I"
   )
   public int[] field639;
   @OriginalMember(
      owner = "client!gs",
      name = "G",
      descriptor = "[I"
   )
   public int[] field650;
   @OriginalMember(
      owner = "client!gs",
      name = "M",
      descriptor = "[J"
   )
   public long[] field651;
   @OriginalMember(
      owner = "client!gs",
      name = "J",
      descriptor = "[Lwv;"
   )
   public class37[] field649;
   @OriginalMember(
      owner = "client!gs",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field644;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method402(int arg0) {
      try {
         int var1 = -82 / ((arg0 - -74) / 42);
         field653 = null;
         field638 = null;
         field641 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field654 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method404(char[] arg0) {
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
            var10005 = 7;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
