import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class273 {
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4170 = new String[]{method2316(method2315("\u0011Yf\u0019&")), method2316(method2315("\u0011Yf\u001a&"))};
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "Ljga;"
   )
   public static class91 field4169 = null;
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "I"
   )
   public static int field4168;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2313(int arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field4168;
         if (class643.field9050 == null) {
            class643.field9050 = new byte[4][class234.field3626][class209.field2989];
         }

         if (arg0 > -116) {
            method2313(-17, (byte)14);
         }

         int var3 = 0;
         if (var2 || ~var3 > -5) {
            do {
               int var4 = 0;
               if (var2 || class234.field3626 > var4) {
                  do {
                     int var5 = 0;
                     if (var2) {
                        class643.field9050[var3][var4][var5] = arg1;
                        ++var5;
                     }

                     while(true) {
                        while(class209.field2989 > var5) {
                           class643.field9050[var3][var4][var5] = arg1;
                           ++var5;
                        }

                        if (!var2) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(class234.field3626 > var4);
               }

               ++var3;
            } while(~var3 > -5);

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4170[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2314(byte arg0) {
      try {
         field4169 = null;
         if (arg0 <= 59) {
            field4169 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4170[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2315(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2316(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
