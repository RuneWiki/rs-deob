import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class221 {
   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3331 = new String[]{method1914(method1913("\f[Kj\u0018")), method1914(method1913("\f[Kl\u0018")), method1914(method1913("\f[Ko\u0018")), method1914(method1913("\f[Km\u0018"))};
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "[Lfr;"
   )
   public static class482[] field3326 = new class482[4];
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "I"
   )
   public static int field3327;
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "I"
   )
   public static int field3328;
   @OriginalMember(
      owner = "client!pa",
      name = "d",
      descriptor = "I"
   )
   public static int field3329;
   @OriginalMember(
      owner = "client!pa",
      name = "e",
      descriptor = "I"
   )
   public static int field3330;

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(BI)S",
      line = 3
   )
   public static final short method1909(byte arg0, int arg1) {
      try {
         ++field3329;
         int var2 = (64613 & arg1) >> 10;
         int var3 = arg1 >> 3 & 112;
         int var4 = 127 & arg1;
         int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
         if (arg0 > -1) {
            field3326 = null;
         }

         int var6 = var4 + var5;
         int var7;
         if (~var6 == -1) {
            var7 = var5 << 1;
            if (!client.field1786) {
               return (short)(var6 | var7 >> 4 << 7 | var2 << 10);
            }
         }

         var7 = (var5 << 8) / var6;
         return (short)(var6 | var7 >> 4 << 7 | var2 << 10);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3331[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public static void method1910(int arg0) {
      try {
         if (arg0 != 16572) {
            method1912(5, 4, 7);
         }

         field3326 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3331[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(III)Z",
      line = 45
   )
   public static final boolean method1911(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -2526) {
            return true;
         } else {
            ++field3328;
            return ~(arg0 & 384) != -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3331[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "(III)Lfq;",
      line = 56
   )
   public static final class374 method1912(int arg0, int arg1, int arg2) {
      try {
         ++field3327;
         int var3 = -99 / ((arg1 - 30) / 54);
         class374 var4 = class183.method1658(arg0, 115);
         if (~arg2 == 0) {
            return var4;
         } else {
            return var4 != null && var4.field5789 != null && ~var4.field5789.length < ~arg2 ? var4.field5789[arg2] : null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3331[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
