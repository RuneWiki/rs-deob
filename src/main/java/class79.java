import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class79 {
   @OriginalMember(
      owner = "client!wd",
      name = "d",
      descriptor = "I"
   )
   public int field1249;
   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "Lqs;"
   )
   private class771 field1251;
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1255 = new String[]{method858(method857("UB)MO")), method858(method857("UB)3\u000eLOs1O")), method858(method857("Y\b)!\u001a")), method858(method857("LSkc")), method858(method857("UB)i\u000eLGkf\u001dG\u000e")), method858(method857("UB)NO"))};
   @OriginalMember(
      owner = "client!wd",
      name = "f",
      descriptor = "I"
   )
   public static int field1250 = 0;
   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "I"
   )
   public static int field1248;
   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "I"
   )
   public static int field1253;
   @OriginalMember(
      owner = "client!wd",
      name = "e",
      descriptor = "I"
   )
   public static int field1254;
   @OriginalMember(
      owner = "client!wd",
      name = "g",
      descriptor = "Lsga;"
   )
   public static class106 field1252;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(II)Ljm;"
   )
   public static final class483 method855(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field1248;
         class483[] var3 = class144.method1431(99);
         int var4 = arg0;
         if (!var2 && ~var3.length >= ~arg0) {
            return null;
         } else {
            do {
               class483 var5 = var3[var4];
               if (var5.field6919 == arg1) {
                  return var5;
               }

               ++var4;
            } while(~var3.length < ~var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1255[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field1251.method5548(5126, this.field1249);
         ++field1254;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1255[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method856(int arg0) {
      try {
         field1252 = null;
         if (arg0 < 113) {
            field1253 = -69;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1255[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "<init>",
      descriptor = "(Lqs;II)V"
   )
   public class79(class771 arg0, int arg1, int arg2) {
      try {
         this.field1249 = arg2;
         this.field1251 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1255[1] + (arg0 != null ? field1255[2] : field1255[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method857(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method858(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
