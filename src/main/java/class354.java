import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class354 extends class703 {
   @OriginalMember(
      owner = "client!hl",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4950 = new String[]{method2813(method2812("l\"$'z")), method2813(method2812("l\"$$z"))};
   @OriginalMember(
      owner = "client!hl",
      name = "I",
      descriptor = "Lcfa;"
   )
   public static class187 field4945 = new class187();
   @OriginalMember(
      owner = "client!hl",
      name = "J",
      descriptor = "Lwk;"
   )
   public static class255 field4947 = new class255();
   @OriginalMember(
      owner = "client!hl",
      name = "F",
      descriptor = "Laka;"
   )
   public static class418 field4948 = new class418(11, 2);
   @OriginalMember(
      owner = "client!hl",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field4949 = new int[3];
   @OriginalMember(
      owner = "client!hl",
      name = "H",
      descriptor = "I"
   )
   public static int field4946;

   @OriginalMember(
      owner = "client!hl",
      name = "<init>",
      descriptor = "(Lww;Lww;Lip;)V"
   )
   public class354(class339 arg0, class339 arg1, class598 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!hl",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2810(int arg0) {
      try {
         field4945 = null;
         if (arg0 == -26058) {
            field4948 = null;
            field4949 = null;
            field4947 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4950[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public final void method2811(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field4946;
         if (arg3 < 126) {
            field4949 = null;
         }

         int var6 = super.field10277.method2406();
         int var7 = ((class598)super.field11086).field8833 * class539.method4088(3) / 10 % var6;
         super.field10277.method4762(-var6 + var7 + arg1, arg4, -var7 + arg2 - -var6, arg0);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4950[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2812(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2813(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
