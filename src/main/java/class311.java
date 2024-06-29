import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class311 implements Runnable {
   @OriginalMember(
      owner = "client!eo",
      name = "e",
      descriptor = "[Lwq;"
   )
   public volatile class176[] field4484 = new class176[2];
   @OriginalMember(
      owner = "client!eo",
      name = "c",
      descriptor = "Z"
   )
   public volatile boolean field4486 = false;
   @OriginalMember(
      owner = "client!eo",
      name = "d",
      descriptor = "Z"
   )
   public volatile boolean field4481 = false;
   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4487 = new String[]{method2424(method2423("I}a\u0006\u001b")), method2424(method2423("I}a5FB:"))};
   @OriginalMember(
      owner = "client!eo",
      name = "f",
      descriptor = "I"
   )
   public static int field4485;
   @OriginalMember(
      owner = "client!eo",
      name = "b",
      descriptor = "Lhw;"
   )
   public static class141 field4482;
   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "Loo;"
   )
   public class651 field4483;

   @OriginalMember(
      owner = "client!eo",
      name = "run",
      descriptor = "()V",
      line = 6
   )
   public final void run() {
      boolean var1 = client.field4564;

      try {
         ++field4485;
         this.field4481 = true;

         try {
            if (var1 || !this.field4486) {
               do {
                  int var2 = 0;
                  if (var1 || var2 < 2) {
                     do {
                        class176 var3 = this.field4484[var2];
                        if (var3 != null) {
                           var3.method1557(-102);
                        }

                        ++var2;
                     } while(var2 < 2);
                  }

                  class624.method4569((byte)98, 10L);
                  class126.method1224((byte)-128, (Object)null, this.field4483);
               } while(!this.field4486);
            }
         } catch (Exception var12) {
            class17.method127((byte)-99, var12, (String)null);
         } finally {
            Object var8 = null;
            this.field4481 = false;
         }

      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field4487[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "a",
      descriptor = "(B)V",
      line = 39
   )
   public static void method2422(byte arg0) {
      try {
         field4482 = null;
         int var1 = -98 % ((16 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4487[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2423(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2424(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
