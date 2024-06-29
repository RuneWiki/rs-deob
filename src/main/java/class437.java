import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class437 {
   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6067 = new String[]{method3254(method3253("U\\[5~")), method3254(method3253("WN\u0019\u001b")), method3254(method3253("B\u0015[Y+")), method3254(method3253("U\\[6~"))};
   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6061 = new int[1000];
   @OriginalMember(
      owner = "client!lg",
      name = "c",
      descriptor = "Lnw;"
   )
   public static class616 field6064 = new class616(75, 3);
   @OriginalMember(
      owner = "client!lg",
      name = "b",
      descriptor = "[S"
   )
   public static short[] field6065 = new short[256];
   @OriginalMember(
      owner = "client!lg",
      name = "f",
      descriptor = "I"
   )
   public static int field6063;
   @OriginalMember(
      owner = "client!lg",
      name = "e",
      descriptor = "I"
   )
   public static int field6066;
   @OriginalMember(
      owner = "client!lg",
      name = "d",
      descriptor = "Ltc;"
   )
   public static class373 field6062;

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(IBZLaha;I)V"
   )
   public static final void method3251(int param0, byte param1, boolean param2, class404 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3252(int arg0) {
      try {
         field6065 = null;
         field6062 = null;
         field6061 = null;
         field6064 = null;
         if (arg0 != -19569) {
            field6065 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6067[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
