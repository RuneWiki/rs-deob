import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public abstract class class329 extends class331 {
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4995 = new String[]{method2687(method2686("\u0013\u001ei-iU")), method2687(method2686("\u0013\u001ei-nU")), method2687(method2686("\u0013\u001ei-hU"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4994 = new int[64];
   @OriginalMember(
      owner = "client!nfa",
      name = "i",
      descriptor = "I"
   )
   public static int field4992;
   @OriginalMember(
      owner = "client!nfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4993;
   @OriginalMember(
      owner = "client!nfa",
      name = "f",
      descriptor = "J"
   )
   public static long field4990;
   @OriginalMember(
      owner = "client!nfa",
      name = "k",
      descriptor = "Lria;"
   )
   public static class185 field4991;
   @OriginalMember(
      owner = "client!nfa",
      name = "j",
      descriptor = "Lrr;"
   )
   public static class678 field4989;

   @OriginalMember(
      owner = "client!nfa",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2682(int arg0) {
      try {
         field4994 = null;
         if (arg0 != 0) {
            method2685(117, 49);
         }

         field4991 = null;
         field4989 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4995[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "c",
      descriptor = "(I)Lps;"
   )
   public abstract class553 method2683(int arg0);

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(ZI)[[[B"
   )
   public static final byte[][][] method2684(boolean param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2685(int arg0, int arg1) {
      try {
         ++field4992;
         if (arg0 != 11027) {
            field4994 = null;
         }

         return arg1 != 1 && arg1 != 7;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4995[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2686(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2687(char[] arg0) {
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
            var10005 = 120;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
