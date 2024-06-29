import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ska")
public class class225 {
   @OriginalMember(
      owner = "client!ska",
      name = "h",
      descriptor = "J"
   )
   public long field3196;
   @OriginalMember(
      owner = "client!ska",
      name = "d",
      descriptor = "Lqs;"
   )
   private class771 field3190;
   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3200 = new String[]{method1934(method1933("8H\u00199b\"M\u0019{m1FP")), method1934(method1933("8H\u001998\"M\u0011c:c")), method1934(method1933("%V\u0014{")), method1934(method1933("0\rV9y")), method1934(method1933("8H\u00199Fc")), method1934(method1933("8H\u00199Ec"))};
   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field3193 = new class164(51, -1);
   @OriginalMember(
      owner = "client!ska",
      name = "k",
      descriptor = "Ljm;"
   )
   public static class483 field3195 = new class483(1);
   @OriginalMember(
      owner = "client!ska",
      name = "j",
      descriptor = "[[B"
   )
   public static byte[][] field3198 = new byte[1000][];
   @OriginalMember(
      owner = "client!ska",
      name = "c",
      descriptor = "I"
   )
   public static int field3199 = 0;
   @OriginalMember(
      owner = "client!ska",
      name = "e",
      descriptor = "I"
   )
   public static int field3189;
   @OriginalMember(
      owner = "client!ska",
      name = "f",
      descriptor = "I"
   )
   public static int field3191;
   @OriginalMember(
      owner = "client!ska",
      name = "g",
      descriptor = "I"
   )
   public static int field3192;
   @OriginalMember(
      owner = "client!ska",
      name = "i",
      descriptor = "Lkda;"
   )
   public static class341 field3194;
   @OriginalMember(
      owner = "client!ska",
      name = "b",
      descriptor = "[Ls;"
   )
   public static class751[] field3197;

   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "(B)Lcu;"
   )
   public static final class65 method1931(byte arg0) {
      try {
         ++field3189;
         class65 var1 = class228.method2028(false);
         var1.method686(-1927998584, 0L);
         var1.method658(class492.field7022, -88);
         if (arg0 < 18) {
            method1931((byte)35);
         }

         var1.method686(-1927998584, class396.field5869);
         var1.method686(-1927998584, class297.field4414);
         var1.method662(false, class719.field10294, class702.field10115);
         return var1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3200[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1932(int arg0) {
      try {
         field3198 = null;
         field3193 = null;
         int var1 = 60 / ((arg0 - -65) / 32);
         field3194 = null;
         field3195 = null;
         field3197 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3200[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field3191;
         this.field3190.method5547(this.field3196, -27403);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3200[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "<init>",
      descriptor = "(Lqs;J[Lqo;)V"
   )
   public class225(class771 arg0, long arg1, class170[] arg2) {
      try {
         this.field3196 = arg1;
         this.field3190 = arg0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3200[1] + (arg0 != null ? field3200[3] : field3200[2]) + ',' + arg1 + ',' + (arg2 != null ? field3200[3] : field3200[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1933(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1934(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
