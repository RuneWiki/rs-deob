import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class762 extends class302 {
   @OriginalMember(
      owner = "client!ww",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11200 = new String[]{method5521(method5520("\flQ\u0001n")), method5521(method5520("\flQ\u0003n")), method5521(method5520("\flQ\u0007n"))};
   @OriginalMember(
      owner = "client!ww",
      name = "M",
      descriptor = "Lhn;"
   )
   public static class751 field11193 = new class751(6, 19);
   @OriginalMember(
      owner = "client!ww",
      name = "H",
      descriptor = "Lcj;"
   )
   public static class721 field11198 = new class721(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!ww",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field11199 = true;
   @OriginalMember(
      owner = "client!ww",
      name = "K",
      descriptor = "I"
   )
   public static int field11194;
   @OriginalMember(
      owner = "client!ww",
      name = "I",
      descriptor = "I"
   )
   public static int field11195;
   @OriginalMember(
      owner = "client!ww",
      name = "L",
      descriptor = "I"
   )
   public static int field11196;
   @OriginalMember(
      owner = "client!ww",
      name = "N",
      descriptor = "J"
   )
   public static long field11197;

   @OriginalMember(
      owner = "client!ww",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5518(int arg0) {
      try {
         field11198 = null;
         field11193 = null;
         if (arg0 < 91) {
            field11197 = 51L;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11200[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method5519(int arg0) {
      try {
         ++field11196;
         class198.field2459 = null;
         int var1 = 6 % ((arg0 - -31) / 50);
         class140.field1802 = null;
         class707.field10584 = null;
         class647.field9425 = null;
         class497.field7359 = false;
         class320.field4571 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11200[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      try {
         ++field11194;
         if (arg1 >= -37) {
            method5518(-15);
         }

         int[] var3 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            class195.method1494(var3, 0, class344.field5238, class23.field241[arg0]);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11200[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "<init>",
      descriptor = "()V"
   )
   public class762() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5520(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5521(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
