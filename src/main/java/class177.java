import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class177 implements class644 {
   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2776 = new String[]{method1620(method1619("s\"PLl")), method1620(method1619("i\u007fP#9")), method1620(method1619("|$\u0012a"))};
   @OriginalMember(
      owner = "client!as",
      name = "c",
      descriptor = "I"
   )
   public static int field2774 = -1;
   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "I"
   )
   public static int field2773;
   @OriginalMember(
      owner = "client!as",
      name = "b",
      descriptor = "I"
   )
   public static int field2775;

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(JB[ILjw;)Ljava/lang/String;",
      line = 14
   )
   public final String method1618(long arg0, byte arg1, int[] arg2, class779 arg3) {
      try {
         ++field2775;
         int var6 = 61 % (-arg1 / 63);
         if (class48.field624 == arg3) {
            class127 var7 = class684.field10178.method2486(-27622, arg2[0]);
            return var7.method1196((int)arg0, -101);
         } else if (class750.field11114 != arg3 && class111.field1536 != arg3) {
            return class361.field5603 != arg3 && class404.field6308 != arg3 && class793.field11581 != arg3 ? null : class684.field10178.method2486(-27622, arg2[0]).method1196((int)arg0, -115);
         } else {
            class136 var8 = class247.field3763.method2058(-11, (int)arg0);
            return var8.field1975;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2776[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2776[1] : field2776[2]) + ',' + (arg3 != null ? field2776[1] : field2776[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1619(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1620(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
