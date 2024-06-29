import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class196 {
   @OriginalMember(
      owner = "client!ffa",
      name = "i",
      descriptor = "Ldw;"
   )
   private class748 field2429 = new class748(64);
   @OriginalMember(
      owner = "client!ffa",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field2434;
   @OriginalMember(
      owner = "client!ffa",
      name = "e",
      descriptor = "Leaa;"
   )
   private class526 field2431;
   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2438 = new String[]{method1501(method1500("h!\u001f',&")), method1501(method1500("h!\u001f'.&")), method1501(method1500("l(")), method1501(method1500("h!\u001f'/&")), method1501(method1500("h!\u001f'Qg)\u0017}S&")), method1501(method1500("`2\u0012e")), method1501(method1500("uiP'\u0010"))};
   @OriginalMember(
      owner = "client!ffa",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field2432 = new class101(88, 11);
   @OriginalMember(
      owner = "client!ffa",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field2435 = false;
   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "I"
   )
   public static int field2437 = -1;
   @OriginalMember(
      owner = "client!ffa",
      name = "b",
      descriptor = "I"
   )
   public static int field2430;
   @OriginalMember(
      owner = "client!ffa",
      name = "d",
      descriptor = "I"
   )
   public static int field2433;
   @OriginalMember(
      owner = "client!ffa",
      name = "c",
      descriptor = "J"
   )
   public static long field2436;

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(II)Lcm;",
      line = 6
   )
   public final class759 method1497(int arg0, int arg1) {
      try {
         ++field2430;
         class759 var3 = (class759)this.field2429.method5454((long)arg1, arg0 + 18261);
         if (var3 != null) {
            return var3;
         } else {
            if (arg0 != 0) {
               field2432 = null;
            }

            byte[] var4;
            label27: {
               if (~arg1 > -32769) {
                  var4 = this.field2434.method3899(-62, arg1, 0);
                  if (client.field4530 == 0) {
                     break label27;
                  }
               }

               var4 = this.field2431.method3899(-69, arg1 & 32767, 0);
            }

            class759 var5 = new class759();
            if (var4 != null) {
               var5.method5503(arg0 + -126, new class128(var4));
            }

            if (~arg1 <= -32769) {
               var5.method5507(0);
            }

            this.field2429.method5455(-2049, var5, (long)arg1);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2438[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "b",
      descriptor = "(Z)V",
      line = 43
   )
   public static void method1498(boolean arg0) {
      try {
         field2432 = null;
         if (!arg0) {
            method1499(true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2438[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "<init>",
      descriptor = "(ILeaa;Leaa;)V",
      line = 64
   )
   public class196(int arg0, class526 arg1, class526 arg2) {
      try {
         this.field2434 = arg1;
         this.field2431 = arg2;
         if (this.field2434 != null) {
            this.field2434.method3875(0, 0);
         }

         if (this.field2431 != null) {
            this.field2431.method3875(0, 0);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2438[4] + arg0 + ',' + (arg1 != null ? field2438[6] : field2438[5]) + ',' + (arg2 != null ? field2438[6] : field2438[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(Z)Lnea;",
      line = 99
   )
   public static final class743 method1499(boolean arg0) {
      try {
         ++field2433;

         try {
            return arg0 ? null : (class743)Class.forName(field2438[2]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2438[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
