import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class741 extends InputStream {
   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10812 = new String[]{method5374(method5373("Mo>Hl\u0000")), method5374(method5373("Mo>H_Mi;N")), method5374(method5373("Mo>Hn\u0000")), method5374(method5373("F}3\n")), method5374(method5373("Mo>Ho\u0000")), method5374(method5373("S&qHP"))};
   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "I"
   )
   public static int field10808 = -1;
   @OriginalMember(
      owner = "client!ega",
      name = "e",
      descriptor = "I"
   )
   public static int field10809 = 0;
   @OriginalMember(
      owner = "client!ega",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field10811 = false;
   @OriginalMember(
      owner = "client!ega",
      name = "h",
      descriptor = "I"
   )
   public static int field10804;
   @OriginalMember(
      owner = "client!ega",
      name = "f",
      descriptor = "I"
   )
   public static int field10805;
   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "I"
   )
   public static int field10806;
   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "I"
   )
   public static int field10807;
   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "Luea;"
   )
   public static class336 field10810;

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "([I[Ljava/lang/String;B)V"
   )
   public static final void method5370(int[] arg0, String[] arg1, byte arg2) {
      try {
         class69.method647(0, arg0, arg1.length + -1, arg2 ^ 7, arg1);
         if (arg2 == -98) {
            ++field10804;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10812[4] + (arg0 != null ? field10812[5] : field10812[3]) + ',' + (arg1 != null ? field10812[5] : field10812[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5371(int arg0, byte arg1) {
      try {
         class18.field206 = new int[arg0];
         int var2 = 80 / ((40 - arg1) / 60);
         class457.field6526 = new int[arg0];
         class441.field6283 = new int[arg0];
         class115.field1427 = new int[arg0];
         ++field10806;
         class336.field4576 = new int[arg0];
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10812[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field10807;
         class661.method4825(0, 30000L);
         return -1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10812[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5372(boolean arg0) {
      try {
         if (!arg0) {
            field10810 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10812[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5373(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5374(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
