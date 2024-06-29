import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class631 {
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9314 = new String[]{method4661(method4660("HMBLb")), method4661(method4660("W\u0011B 7")), method4661(method4660("]\u0016\u0000\u000e")), method4661(method4660("W\u0011B#7"))};
   @OriginalMember(
      owner = "client!dr",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9308 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!dr",
      name = "e",
      descriptor = "I"
   )
   public static int field9309 = 1;
   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "I"
   )
   public static int field9310 = 2;
   @OriginalMember(
      owner = "client!dr",
      name = "c",
      descriptor = "Lrca;"
   )
   public static class37 field9305 = new class37();
   @OriginalMember(
      owner = "client!dr",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field9311 = false;
   @OriginalMember(
      owner = "client!dr",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field9313 = new class418(25, 8);
   @OriginalMember(
      owner = "client!dr",
      name = "h",
      descriptor = "I"
   )
   public static int field9306;
   @OriginalMember(
      owner = "client!dr",
      name = "f",
      descriptor = "Lwc;"
   )
   public static class394 field9312;
   @OriginalMember(
      owner = "client!dr",
      name = "i",
      descriptor = "Lfu;"
   )
   public static class80 field9307;

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(ILhg;Lha;Z)V"
   )
   public static final void method4658(int param0, class529 param1, class479 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4659(int arg0) {
      try {
         field9313 = null;
         field9308 = null;
         if (arg0 == -27235) {
            field9307 = null;
            field9312 = null;
            field9305 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9314[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4660(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4661(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
