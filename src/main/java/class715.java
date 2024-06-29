import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class715 {
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10723 = new String[]{method5298(method5297("\u007f\u0000\"G&")), method5298(method5297("\u007f\u0000\"D&"))};
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10718 = false;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "I"
   )
   public static int field10720 = -1;
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "Let;"
   )
   public static class389 field10719 = new class389(16);
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "Lnaa;"
   )
   public static class113 field10722 = new class113(48, 0);
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "I"
   )
   public static int field10721;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(B)V",
      line = 11
   )
   public static void method5295(byte arg0) {
      try {
         field10719 = null;
         if (arg0 == -11) {
            field10722 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10723[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(II)Lsl;",
      line = 23
   )
   public static final class242 method5296(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field10721;
         class242[] var3 = class630.method4613(-365997584);
         int var4 = 0;
         class242 var5;
         if (var2) {
            var5 = var3[var4];
            if (~var5.field3676 == ~arg1) {
               return var5;
            }

            ++var4;
         }

         while(~var3.length < ~var4) {
            var5 = var3[var4];
            if (~var5.field3676 == ~arg1) {
               return var5;
            }

            ++var4;
         }

         if (arg0 != 14046) {
            method5295((byte)-16);
         }

         return null;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10723[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
