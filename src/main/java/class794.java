import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class794 {
   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "I"
   )
   public int field11587;
   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "[I"
   )
   public int[] field11585;
   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "[I"
   )
   public int[] field11583;
   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11589 = new String[]{method5740(method5739("y\"\u0015 n")), method5740(method5739("y\"\u0015#n")), method5740(method5739("y\"\u0015]/t!O_n"))};
   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field11586 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!cj",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field11584 = new class113(6, 7);
   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "I"
   )
   public static int field11588;

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5737(int arg0) {
      try {
         field11586 = null;
         if (arg0 != 9) {
            method5737(109);
         }

         field11584 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11589[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class794(int arg0) {
      try {
         this.field11587 = arg0;
         this.field11585 = new int[this.field11587];
         this.field11583 = new int[this.field11587];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11589[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5738(boolean arg0) {
      try {
         ++field11588;
         if (~class519.field7897 == -11) {
            class519.field7897 = 11;
            if (arg0) {
               method5738(false);
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11589[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
