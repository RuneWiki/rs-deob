import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class187 {
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2385 = new String[]{method1573(method1572("Eyz\u001d!\u000e")), method1573(method1572("Eyz\u001d\u0014ILoA\tHx3"))};
   @OriginalMember(
      owner = "client!cfa",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field2382 = false;
   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2380 = 100;
   @OriginalMember(
      owner = "client!cfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2381;
   @OriginalMember(
      owner = "client!cfa",
      name = "d",
      descriptor = "I"
   )
   public static int field2383;
   @OriginalMember(
      owner = "client!cfa",
      name = "b",
      descriptor = "I"
   )
   public static int field2384;

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public static final void method1571(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2384;
         int var5 = class238.field3009;
         int var6 = class233.field2898;
         if (class28.field416) {
            var5 += class356.method2825(0);
            var6 += class465.method3538(arg1 ^ 26505);
         }

         if (~class54.field739 == -2) {
            class648 var7 = class9.field199[class543.field7926 / 100];
            var7.method4760(var5 - 8, var6 + -8);
            class762.method5522(var7.method2406() + var5 + -8, var6 - 8, var7.method2396() + (var6 - 8), -120, var5 + -8);
         }

         if (arg1 != -1) {
            field2382 = false;
         }

         if (class54.field739 == 2) {
            class648 var8 = class9.field199[class543.field7926 / 100 + 4];
            var8.method4760(var5 + -8, var6 + -8);
            class762.method5522(var8.method2406() + var5 + -8, var6 + -8, -8 + var6 + var8.method2396(), arg1 ^ 80, var5 + -8);
         }

         class415.method3246(-124);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2385[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2383;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2385[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
