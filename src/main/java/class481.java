import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class481 {
   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6893 = new String[]{method3500(method3499("S\u0002p\u001c\u0003")), method3500(method3499("S\u0002p\u001f\u0003"))};
   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "I"
   )
   public static int field6892 = 0;
   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "Lek;"
   )
   public static class536 field6891 = new class536(81, -1);
   @OriginalMember(
      owner = "client!td",
      name = "d",
      descriptor = "I"
   )
   public static int field6889;
   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "I"
   )
   public static int field6890;

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3497(int arg0) {
      try {
         int var1 = 109 % ((arg0 - 36) / 37);
         field6891 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IBIII)I",
      line = 12
   )
   public static final int method3498(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6889;
         int var5 = 15 & arg3;
         int var6 = var5 < 8 ? arg2 : arg4;
         int var7 = 46 % ((76 - arg1) / 48);
         int var8 = ~var5 <= -5 ? (~var5 != -13 && var5 != 14 ? arg0 : arg2) : arg4;
         return ((2 & var5) != 0 ? -var8 : var8) + ((var5 & 1) == 0 ? var6 : -var6);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6893[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
