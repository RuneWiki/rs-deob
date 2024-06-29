import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class431 {
   @OriginalMember(
      owner = "client!fr",
      name = "e",
      descriptor = "I"
   )
   public int field6586 = -1;
   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "I"
   )
   public int field6591 = -1;
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6593 = new String[]{method3287(method3286("U\"n$O")), method3287(method3286("@y,f")), method3287(method3286("H~nI\u001a")), method3287(method3286("H~nH\u001a")), method3287(method3286("H~nN\u001a")), method3287(method3286("H~nK\u001a"))};
   @OriginalMember(
      owner = "client!fr",
      name = "g",
      descriptor = "Lhn;"
   )
   public static class751 field6590 = new class751(14, 3);
   @OriginalMember(
      owner = "client!fr",
      name = "h",
      descriptor = "I"
   )
   public static int field6592 = 0;
   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "I"
   )
   public static int field6585;
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "I"
   )
   public static int field6588;
   @OriginalMember(
      owner = "client!fr",
      name = "d",
      descriptor = "I"
   )
   public static int field6589;
   @OriginalMember(
      owner = "client!fr",
      name = "f",
      descriptor = "[I"
   )
   public int[] field6587;

   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method3282(boolean arg0) {
      try {
         class515.field7537 = null;
         class175.field2176 = -1;
         ++field6588;
         if (arg0) {
            method3284(false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6593[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   private final void method3283(int param1, int param2, class128 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3284(boolean arg0) {
      try {
         if (!arg0) {
            field6592 = 47;
         }

         field6590 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6593[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Ljj;I)V"
   )
   public final void method3285(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 < 119) {
            field6592 = 34;
         }

         while(true) {
            int var4 = arg0.method1104(255);
            if (var4 != 0) {
               this.method3283(80, var4, arg0);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            ++field6589;
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6593[3] + (arg0 != null ? field6593[0] : field6593[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3286(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3287(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
