import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class576 {
   @OriginalMember(
      owner = "client!wn",
      name = "b",
      descriptor = "I"
   )
   public int field8536;
   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8548 = new String[]{method4320(method4319("\u001a2f:?")), method4320(method4319("\u001a2fG~\u00035<E?")), method4320(method4319("\u001a2f\u000fx>(:\u0012y\nt"))};
   @OriginalMember(
      owner = "client!wn",
      name = "c",
      descriptor = "Lwn;"
   )
   public static class576 field8537 = new class576(1);
   @OriginalMember(
      owner = "client!wn",
      name = "d",
      descriptor = "Lwn;"
   )
   public static class576 field8539 = new class576(2);
   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "Lwn;"
   )
   public static class576 field8540 = new class576(4);
   @OriginalMember(
      owner = "client!wn",
      name = "g",
      descriptor = "Lwn;"
   )
   public static class576 field8541 = new class576(1);
   @OriginalMember(
      owner = "client!wn",
      name = "j",
      descriptor = "Lwn;"
   )
   public static class576 field8542 = new class576(2);
   @OriginalMember(
      owner = "client!wn",
      name = "h",
      descriptor = "Lwn;"
   )
   public static class576 field8543 = new class576(4);
   @OriginalMember(
      owner = "client!wn",
      name = "l",
      descriptor = "Lwn;"
   )
   public static class576 field8544 = new class576(2);
   @OriginalMember(
      owner = "client!wn",
      name = "f",
      descriptor = "Lwn;"
   )
   public static class576 field8545 = new class576(4);
   @OriginalMember(
      owner = "client!wn",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8546 = new int[2];
   @OriginalMember(
      owner = "client!wn",
      name = "i",
      descriptor = "Lifa;"
   )
   public static class75 field8547 = new class75(11, 4);
   @OriginalMember(
      owner = "client!wn",
      name = "e",
      descriptor = "I"
   )
   public static int field8538;

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class576(int arg0) {
      try {
         this.field8536 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8548[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4318(byte arg0) {
      try {
         if (arg0 > -85) {
            field8545 = null;
         }

         field8541 = null;
         field8540 = null;
         field8542 = null;
         field8539 = null;
         field8537 = null;
         field8544 = null;
         field8543 = null;
         field8546 = null;
         field8547 = null;
         field8545 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8548[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8538;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8548[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
