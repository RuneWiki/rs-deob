import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 {
   @OriginalMember(
      owner = "client!cja",
      name = "j",
      descriptor = "[Z"
   )
   public boolean[] field512 = new boolean[256];
   @OriginalMember(
      owner = "client!cja",
      name = "w",
      descriptor = "[I"
   )
   public int[] field508 = new int[257];
   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "[I"
   )
   public int[] field507 = new int[256];
   @OriginalMember(
      owner = "client!cja",
      name = "F",
      descriptor = "[[I"
   )
   public int[][] field511 = new int[6][258];
   @OriginalMember(
      owner = "client!cja",
      name = "p",
      descriptor = "[[I"
   )
   public int[][] field513 = new int[6][258];
   @OriginalMember(
      owner = "client!cja",
      name = "K",
      descriptor = "I"
   )
   public int field506 = 0;
   @OriginalMember(
      owner = "client!cja",
      name = "k",
      descriptor = "[I"
   )
   public int[] field516 = new int[16];
   @OriginalMember(
      owner = "client!cja",
      name = "c",
      descriptor = "[[B"
   )
   public byte[][] field510 = new byte[6][258];
   @OriginalMember(
      owner = "client!cja",
      name = "C",
      descriptor = "[I"
   )
   public int[] field520 = new int[6];
   @OriginalMember(
      owner = "client!cja",
      name = "G",
      descriptor = "[B"
   )
   public byte[] field523 = new byte[18002];
   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "I"
   )
   public int field534 = 0;
   @OriginalMember(
      owner = "client!cja",
      name = "o",
      descriptor = "[[I"
   )
   public int[][] field521 = new int[6][258];
   @OriginalMember(
      owner = "client!cja",
      name = "x",
      descriptor = "[B"
   )
   public byte[] field537 = new byte[18002];
   @OriginalMember(
      owner = "client!cja",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field533 = new byte[4096];
   @OriginalMember(
      owner = "client!cja",
      name = "A",
      descriptor = "[Z"
   )
   public boolean[] field539 = new boolean[16];
   @OriginalMember(
      owner = "client!cja",
      name = "t",
      descriptor = "[B"
   )
   public byte[] field540 = new byte[256];
   @OriginalMember(
      owner = "client!cja",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field541 = new String[]{method364(method363("9]:,Lr")), method364(method363("!\u0019u,p")), method364(method363("4B7n")), method364(method363("9]:,Or"))};
   @OriginalMember(
      owner = "client!cja",
      name = "e",
      descriptor = "B"
   )
   public byte field527;
   @OriginalMember(
      owner = "client!cja",
      name = "D",
      descriptor = "I"
   )
   public static int field514;
   @OriginalMember(
      owner = "client!cja",
      name = "i",
      descriptor = "I"
   )
   public int field515;
   @OriginalMember(
      owner = "client!cja",
      name = "v",
      descriptor = "I"
   )
   public int field517;
   @OriginalMember(
      owner = "client!cja",
      name = "s",
      descriptor = "I"
   )
   public int field518;
   @OriginalMember(
      owner = "client!cja",
      name = "n",
      descriptor = "I"
   )
   public int field519;
   @OriginalMember(
      owner = "client!cja",
      name = "J",
      descriptor = "I"
   )
   public int field522;
   @OriginalMember(
      owner = "client!cja",
      name = "q",
      descriptor = "I"
   )
   public int field524;
   @OriginalMember(
      owner = "client!cja",
      name = "h",
      descriptor = "I"
   )
   public int field525;
   @OriginalMember(
      owner = "client!cja",
      name = "f",
      descriptor = "I"
   )
   public int field526;
   @OriginalMember(
      owner = "client!cja",
      name = "l",
      descriptor = "I"
   )
   public int field528;
   @OriginalMember(
      owner = "client!cja",
      name = "d",
      descriptor = "I"
   )
   public int field530;
   @OriginalMember(
      owner = "client!cja",
      name = "y",
      descriptor = "I"
   )
   public int field531;
   @OriginalMember(
      owner = "client!cja",
      name = "r",
      descriptor = "I"
   )
   public static int field532;
   @OriginalMember(
      owner = "client!cja",
      name = "g",
      descriptor = "I"
   )
   public int field535;
   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "I"
   )
   public int field536;
   @OriginalMember(
      owner = "client!cja",
      name = "u",
      descriptor = "I"
   )
   public static int field538;
   @OriginalMember(
      owner = "client!cja",
      name = "B",
      descriptor = "Lti;"
   )
   public static class464 field529;
   @OriginalMember(
      owner = "client!cja",
      name = "I",
      descriptor = "[B"
   )
   public byte[] field505;
   @OriginalMember(
      owner = "client!cja",
      name = "H",
      descriptor = "[B"
   )
   public byte[] field509;

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(I)V",
      line = 8
   )
   public static void method361(int arg0) {
      try {
         if (arg0 != 6) {
            field529 = null;
         }

         field529 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field541[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(IIBLck;I)Lfe;",
      line = 25
   )
   public static final class596 method362(int arg0, int arg1, byte arg2, class667 arg3, int arg4) {
      try {
         ++field514;
         if (arg2 <= 18) {
            return null;
         } else if (arg3.field10032 || class766.method5547(1008, arg1) && class766.method5547(1008, arg4)) {
            return new class596(arg3, 3553, arg0, arg1, arg4);
         } else {
            return !arg3.field9950 ? new class596(arg3, arg0, arg1, arg4, class7.method63(arg1, false), class7.method63(arg4, false)) : new class596(arg3, 34037, arg0, arg1, arg4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field541[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field541[1] : field541[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
