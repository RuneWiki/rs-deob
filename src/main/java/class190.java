import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class190 extends OutputStream {
   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2792 = new String[]{method1691(method1690("-\rm\nS")), method1691(method1690("-\rm\tS")), method1691(method1690("-\rm?\t!\u001e&`"))};
   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "I"
   )
   public static int field2788 = 0;
   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field2789 = new class724(53, 6);
   @OriginalMember(
      owner = "client!eg",
      name = "d",
      descriptor = "I"
   )
   public static int field2790;
   @OriginalMember(
      owner = "client!eg",
      name = "c",
      descriptor = "I"
   )
   public static int field2791;

   @OriginalMember(
      owner = "client!eg",
      name = "write",
      descriptor = "(I)V"
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field2791;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2792[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1688(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 22296) {
            return true;
         } else {
            ++field2790;
            return (class129.method1322(arg1, arg2, (byte)116) | class237.method2091(arg1, arg2, -19540) | class445.method3451(arg1, -29018, arg2)) & class367.method2890(arg2, 113, arg1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2792[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1689(byte arg0) {
      try {
         if (arg0 != 57) {
            field2789 = null;
         }

         field2789 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2792[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1690(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1691(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
