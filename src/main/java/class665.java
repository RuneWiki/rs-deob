import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class665 {
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9670 = new String[]{method4864(method4863("%D, [")), method4864(method4863("%D,#["))};
   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9663 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "Ljfa;"
   )
   public static class303 field9664 = null;
   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "Leb;"
   )
   public static class650 field9666 = new class650(4, 16);
   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field9668 = new int[4];
   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "I"
   )
   public static int field9665;
   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "Lqj;"
   )
   public static class533 field9669;
   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "[[[I"
   )
   public static int[][][] field9667;

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIIII)V",
      line = 9
   )
   public static final void method4861(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9665;
         class536 var5 = class108.method1038((long)arg4 | (long)arg2 << 32, 77, 19);
         if (arg0 != 4) {
            method4861(91, -56, -79, -105, 25);
         }

         var5.method4017(24076);
         var5.field7800 = arg3;
         var5.field7798 = arg1;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9670[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(B)V",
      line = 28
   )
   public static void method4862(byte arg0) {
      try {
         field9664 = null;
         field9668 = null;
         field9669 = null;
         field9667 = null;
         field9663 = null;
         if (arg0 > 110) {
            field9666 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9670[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4864(char[] arg0) {
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
            var10005 = 54;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
