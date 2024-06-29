import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class111 extends class566 {
   @OriginalMember(
      owner = "client!tk",
      name = "v",
      descriptor = "I"
   )
   public int field1483 = -1;
   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1493 = new String[]{method1006(method1005("N/\u007fn&")), method1006(method1005("N/\u007fm&"))};
   @OriginalMember(
      owner = "client!tk",
      name = "q",
      descriptor = "Lpo;"
   )
   public static class372 field1486 = new class372(16);
   @OriginalMember(
      owner = "client!tk",
      name = "n",
      descriptor = "J"
   )
   public static long field1492 = 20000000L;
   @OriginalMember(
      owner = "client!tk",
      name = "s",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field1491 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @OriginalMember(
      owner = "client!tk",
      name = "p",
      descriptor = "I"
   )
   public static int field1484;
   @OriginalMember(
      owner = "client!tk",
      name = "o",
      descriptor = "I"
   )
   public int field1488;
   @OriginalMember(
      owner = "client!tk",
      name = "r",
      descriptor = "I"
   )
   public static int field1490;
   @OriginalMember(
      owner = "client!tk",
      name = "u",
      descriptor = "J"
   )
   public static long field1489;
   @OriginalMember(
      owner = "client!tk",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public String field1485;
   @OriginalMember(
      owner = "client!tk",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field1487;

   @OriginalMember(
      owner = "client!tk",
      name = "f",
      descriptor = "(I)Lfga;"
   )
   public final class379 method1003(int arg0) {
      try {
         ++field1484;
         if (arg0 != -1) {
            this.method1003(-114);
         }

         return class602.field8870[super.field8337];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1493[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1004(byte arg0) {
      try {
         if (arg0 != 17) {
            field1486 = null;
         }

         field1486 = null;
         field1491 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1493[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
