import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public abstract class class698 {
   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10226 = new String[]{method5089(method5088("vj]\u0001/")), method5089(method5088("c3]fz")), method5089(method5088("vh\u001f$")), method5089(method5088("vj]\u0002/"))};
   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "Lifa;"
   )
   public static class75 field10225 = new class75(9, -1);
   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "I"
   )
   public static int field10224;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method1044(int arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1050(int arg0);

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(BII[B)I"
   )
   public abstract int method1046(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method5086(String arg0, int arg1) {
      try {
         ++field10224;
         int var2 = -108 / ((arg1 - -60) / 49);
         class198.field2525 = arg0;
         class433.field5908 = class198.field2525.length();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10226[0] + (arg0 != null ? field10226[1] : field10226[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5087(byte arg0) {
      try {
         if (arg0 != 61) {
            field10225 = null;
         }

         field10225 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10226[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1051(byte arg0);

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "([BIII)V"
   )
   public abstract void method1048(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5088(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5089(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
