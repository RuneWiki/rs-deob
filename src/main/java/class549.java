import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class549 {
   @OriginalMember(
      owner = "client!wv",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field7825 = new byte[18002];
   @OriginalMember(
      owner = "client!wv",
      name = "k",
      descriptor = "[I"
   )
   public int[] field7822 = new int[256];
   @OriginalMember(
      owner = "client!wv",
      name = "q",
      descriptor = "[I"
   )
   public int[] field7828 = new int[16];
   @OriginalMember(
      owner = "client!wv",
      name = "H",
      descriptor = "[I"
   )
   public int[] field7832 = new int[6];
   @OriginalMember(
      owner = "client!wv",
      name = "d",
      descriptor = "[[I"
   )
   public int[][] field7842 = new int[6][258];
   @OriginalMember(
      owner = "client!wv",
      name = "A",
      descriptor = "[[B"
   )
   public byte[][] field7843 = new byte[6][258];
   @OriginalMember(
      owner = "client!wv",
      name = "f",
      descriptor = "I"
   )
   public int field7836 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "E",
      descriptor = "[B"
   )
   public byte[] field7848 = new byte[256];
   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "[[I"
   )
   public int[][] field7846 = new int[6][258];
   @OriginalMember(
      owner = "client!wv",
      name = "o",
      descriptor = "[I"
   )
   public int[] field7823 = new int[257];
   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "[[I"
   )
   public int[][] field7844 = new int[6][258];
   @OriginalMember(
      owner = "client!wv",
      name = "i",
      descriptor = "[Z"
   )
   public boolean[] field7824 = new boolean[16];
   @OriginalMember(
      owner = "client!wv",
      name = "D",
      descriptor = "[B"
   )
   public byte[] field7851 = new byte[18002];
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "[B"
   )
   public byte[] field7838 = new byte[4096];
   @OriginalMember(
      owner = "client!wv",
      name = "j",
      descriptor = "I"
   )
   public int field7853 = 0;
   @OriginalMember(
      owner = "client!wv",
      name = "l",
      descriptor = "[Z"
   )
   public boolean[] field7854 = new boolean[256];
   @OriginalMember(
      owner = "client!wv",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7855 = method4121(method4120("\nU\u0003&\u0000"));
   @OriginalMember(
      owner = "client!wv",
      name = "B",
      descriptor = "B"
   )
   public byte field7835;
   @OriginalMember(
      owner = "client!wv",
      name = "t",
      descriptor = "I"
   )
   public int field7826;
   @OriginalMember(
      owner = "client!wv",
      name = "v",
      descriptor = "I"
   )
   public int field7827;
   @OriginalMember(
      owner = "client!wv",
      name = "G",
      descriptor = "I"
   )
   public int field7830;
   @OriginalMember(
      owner = "client!wv",
      name = "h",
      descriptor = "I"
   )
   public int field7831;
   @OriginalMember(
      owner = "client!wv",
      name = "C",
      descriptor = "I"
   )
   public int field7833;
   @OriginalMember(
      owner = "client!wv",
      name = "u",
      descriptor = "I"
   )
   public int field7839;
   @OriginalMember(
      owner = "client!wv",
      name = "x",
      descriptor = "I"
   )
   public int field7840;
   @OriginalMember(
      owner = "client!wv",
      name = "r",
      descriptor = "I"
   )
   public int field7841;
   @OriginalMember(
      owner = "client!wv",
      name = "p",
      descriptor = "I"
   )
   public int field7845;
   @OriginalMember(
      owner = "client!wv",
      name = "e",
      descriptor = "I"
   )
   public int field7847;
   @OriginalMember(
      owner = "client!wv",
      name = "s",
      descriptor = "I"
   )
   public int field7849;
   @OriginalMember(
      owner = "client!wv",
      name = "g",
      descriptor = "I"
   )
   public int field7850;
   @OriginalMember(
      owner = "client!wv",
      name = "y",
      descriptor = "I"
   )
   public int field7852;
   @OriginalMember(
      owner = "client!wv",
      name = "c",
      descriptor = "Llo;"
   )
   public static class511 field7834;
   @OriginalMember(
      owner = "client!wv",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field7829;
   @OriginalMember(
      owner = "client!wv",
      name = "w",
      descriptor = "[B"
   )
   public byte[] field7837;

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4119(boolean arg0) {
      try {
         if (arg0) {
            field7834 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7855 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4120(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4121(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
