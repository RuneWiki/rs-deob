import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class659 {
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9559 = new String[]{method4739(method4738("\u0001r+a\u0017")), method4739(method4738("\u0001r+b\u0017"))};
   @OriginalMember(
      owner = "client!jk",
      name = "e",
      descriptor = "Ldw;"
   )
   public static class748 field9554 = new class748(8);
   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "Ldw;"
   )
   public static class748 field9558 = new class748(30);
   @OriginalMember(
      owner = "client!jk",
      name = "c",
      descriptor = "I"
   )
   public static int field9555;
   @OriginalMember(
      owner = "client!jk",
      name = "b",
      descriptor = "I"
   )
   public static int field9556;
   @OriginalMember(
      owner = "client!jk",
      name = "d",
      descriptor = "[Lge;"
   )
   public static class737[] field9557;

   @OriginalMember(
      owner = "client!jk",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4736(int arg0) {
      int var1 = client.field4530;

      try {
         ++field9556;
         int var2 = class287.field4026;
         int[] var3 = class33.field372;
         int var4 = 0;
         if (var1 == 0 && ~var2 >= ~var4) {
            if (arg0 != 8) {
               method4736(16);
            }
         } else {
            do {
               class687 var5 = class661.field9578[var3[var4]];
               if (var5 != null) {
                  class707.method5134(-1, var5.method3046(arg0 ^ -100), var5);
               }

               ++var4;
            } while(~var2 < ~var4);

            if (arg0 != 8) {
               method4736(16);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9559[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4737(int arg0) {
      try {
         field9557 = null;
         field9558 = null;
         if (arg0 != 0) {
            method4737(70);
         }

         field9554 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9559[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
