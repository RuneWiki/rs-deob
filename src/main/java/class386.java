import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class386 {
   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5699 = new String[]{method2999(method2998("OKLM\u0005")), method2999(method2998("OKLJ\u0005"))};
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5693 = "";
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field5695 = new class435(80, 1);
   @OriginalMember(
      owner = "client!pa",
      name = "d",
      descriptor = "I"
   )
   public static int field5698 = -2;
   @OriginalMember(
      owner = "client!pa",
      name = "g",
      descriptor = "Lpda;"
   )
   public static class654 field5697 = new class654();
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "I"
   )
   public static int field5694;
   @OriginalMember(
      owner = "client!pa",
      name = "e",
      descriptor = "I"
   )
   public static int field5696;
   @OriginalMember(
      owner = "client!pa",
      name = "f",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field5692;

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method2996(int arg0, int arg1, byte arg2) {
      try {
         ++field5694;
         if (arg2 < 19) {
            method2997((byte)-24);
         }

         return ~(458752 & arg1) != -1 | class498.method3753(-72, arg0, arg1) || class417.method3182(arg1, true, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5699[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2997(byte arg0) {
      try {
         field5695 = null;
         field5692 = null;
         field5693 = null;
         field5697 = null;
         if (arg0 <= 80) {
            field5692 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5699[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2998(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2999(char[] arg0) {
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
            var10005 = 42;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
