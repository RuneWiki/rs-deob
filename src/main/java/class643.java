import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class643 {
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9371 = new String[]{method4622(method4621("#H\"\n\u0018")), method4622(method4621("2\u000fm\n'p")), method4622(method4621("6\u0013`H")), method4622(method4621("2\u000fm\n$p")), method4622(method4621("2\u000fm\n&p"))};
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "I"
   )
   public static int field9369 = 0;
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field9367 = new class101(55, -2);
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "I"
   )
   public static int field9368;
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "I"
   )
   public static int field9370;

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public static final void method4618(boolean arg0, boolean arg1, int arg2) {
      int var3 = client.field4530;

      RuntimeException var10000;
      label37: {
         boolean var10001;
         class5 var4;
         int var5;
         try {
            ++field9368;
            var4 = class289.method2200(arg2, 0, arg0);
            if (var4 == null) {
               return;
            }

            var5 = 0;
            if (!arg1) {
               return;
            }
         } catch (RuntimeException var9) {
            var10000 = var9;
            var10001 = false;
            break label37;
         }

         while(true) {
            label32: {
               try {
                  if (var4.field88.length > var5) {
                     var4.field88[var5] = -1;
                     var4.field87[var5] = 0;
                     break label32;
                  }
               } catch (RuntimeException var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }

               if (var3 == 0) {
                  return;
               }
            }

            try {
               ++var5;
            } catch (RuntimeException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var6 = var10000;
      throw class670.method4877(var6, field9371[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method4619(int arg0, byte[] arg1) {
      try {
         ++field9370;
         if (arg0 != 9788) {
            field9369 = 107;
         }

         if (arg1 == null) {
            return null;
         } else {
            byte[] var2 = new byte[arg1.length];
            class195.method1492(arg1, 0, var2, 0, arg1.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9371[1] + arg0 + ',' + (arg1 != null ? field9371[0] : field9371[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4620(int arg0) {
      try {
         if (arg0 < -101) {
            field9367 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9371[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4621(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4622(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
