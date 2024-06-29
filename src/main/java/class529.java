import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class529 extends class22 {
   @OriginalMember(
      owner = "client!bda",
      name = "n",
      descriptor = "I"
   )
   public int field7700;
   @OriginalMember(
      owner = "client!bda",
      name = "m",
      descriptor = "I"
   )
   public int field7702;
   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7704 = new String[]{method3964(method3963("\u0002\u0018Ig0H")), method3964(method3963("\u0002\u0018Ig2H")), method3964(method3963("\u0002\u0018Ig1H")), method3964(method3963("\u0002\u0018IgO\t\u0012A=MH"))};
   @OriginalMember(
      owner = "client!bda",
      name = "o",
      descriptor = "Luw;"
   )
   public static class435 field7703 = new class435(67, 7);
   @OriginalMember(
      owner = "client!bda",
      name = "j",
      descriptor = "I"
   )
   public static int field7699;
   @OriginalMember(
      owner = "client!bda",
      name = "l",
      descriptor = "I"
   )
   public static int field7701;
   @OriginalMember(
      owner = "client!bda",
      name = "k",
      descriptor = "[Lvca;"
   )
   public static class294[] field7698;

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(I)Lir;",
      line = 3
   )
   public static final class28 method3960(int arg0) {
      try {
         if (arg0 != 8000) {
            method3961(40, -100, 103, false);
         }

         ++field7701;
         return class370.field5477;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7704[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 17
   )
   public static final void method3961(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field7699;
         if (arg2 >= 8000 && ~arg2 >= -48001) {
            class483.field7024 = arg3;
            if (arg1 == -48001) {
               class397.field5840 = arg0;
               class755.field10967 = arg2;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7704[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(Z)V",
      line = 34
   )
   public static void method3962(boolean arg0) {
      try {
         field7703 = null;
         field7698 = null;
         if (!arg0) {
            method3962(false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7704[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(II)V",
      line = 46
   )
   public class529(int arg0, int arg1) {
      try {
         this.field7700 = arg0;
         this.field7702 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7704[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
