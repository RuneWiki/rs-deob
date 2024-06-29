import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class759 {
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11228 = new String[]{method5567(method5566("^\n\u000f*j")), method5567(method5566("^\n\u000f)j"))};
   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "Lbda;"
   )
   public static class783 field11226 = new class783(6, 1);
   @OriginalMember(
      owner = "client!ks",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field11227 = new class498(83, -2);
   @OriginalMember(
      owner = "client!ks",
      name = "b",
      descriptor = "I"
   )
   public static int field11225;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static final void method5564(int arg0) {
      boolean var1 = client.field1786;

      try {
         class249.field3781 = 0;
         ++field11225;
         int var2 = 75 % ((arg0 - -43) / 63);
         class25.field321 = 0;
         int var3 = 0;
         if (var1 || class395.field6185 > var3) {
            do {
               int var4 = class13.field166 * var3;
               int var5 = 0;
               if (var1 || var5 < class13.field166) {
                  do {
                     int var6 = var4 + var5;
                     class35.field423[var6].method1289(class155.field2316 * var5, class37.field444 * var3, class155.field2316, class37.field444, 0, 0, true, true);
                     ++var5;
                  } while(var5 < class13.field166);
               }

               ++var3;
            } while(class395.field6185 > var3);

         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11228[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(Z)V",
      line = 37
   )
   public static void method5565(boolean arg0) {
      try {
         field11226 = null;
         field11227 = null;
         if (!arg0) {
            method5565(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11228[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5566(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5567(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
