import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class348 extends OutputStream {
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4999 = new String[]{method2751(method2750("Wb<_4Vfw\u0000")), method2751(method2750("Wb<jn")), method2751(method2750("Wb<in"))};
   @OriginalMember(
      owner = "client!hp",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field4995 = new class378(85, 4);
   @OriginalMember(
      owner = "client!hp",
      name = "c",
      descriptor = "I"
   )
   public static int field4994;
   @OriginalMember(
      owner = "client!hp",
      name = "d",
      descriptor = "I"
   )
   public static int field4996;
   @OriginalMember(
      owner = "client!hp",
      name = "b",
      descriptor = "I"
   )
   public static int field4997;
   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "Lsq;"
   )
   public static class190 field4998;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2748(int arg0) {
      try {
         field4998 = null;
         field4995 = null;
         int var1 = 77 % ((-44 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4999[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method2749(int arg0, int arg1, byte arg2) {
      try {
         ++field4996;
         if (arg2 != -72) {
            return 98;
         } else {
            int var3 = arg0 >> 31 & arg1 - 1;
            return ((arg0 >>> 31) + arg0) % arg1 - -var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4999[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field4994;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4999[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2750(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2751(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
