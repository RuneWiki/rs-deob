import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class96 extends class247 {
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1554 = new String[]{method965(method964("\u0006QcKO")), method965(method964("\u001b\u0011c*\u001a")), method965(method964("\u0013\n!\t")), method965(method964("\u001b\u0011c+\u001a")), method965(method964("\u001b\u0011c)\u001a")), method965(method964("\u001b\u0011c(\u001a"))};
   @OriginalMember(
      owner = "client!fn",
      name = "k",
      descriptor = "Lou;"
   )
   public static class299 field1551 = new class299();
   @OriginalMember(
      owner = "client!fn",
      name = "m",
      descriptor = "I"
   )
   public static int field1549;
   @OriginalMember(
      owner = "client!fn",
      name = "j",
      descriptor = "I"
   )
   public static int field1550;
   @OriginalMember(
      owner = "client!fn",
      name = "o",
      descriptor = "I"
   )
   public static int field1552;
   @OriginalMember(
      owner = "client!fn",
      name = "l",
      descriptor = "J"
   )
   public long field1548;
   @OriginalMember(
      owner = "client!fn",
      name = "n",
      descriptor = "Lfn;"
   )
   public class96 field1547;
   @OriginalMember(
      owner = "client!fn",
      name = "p",
      descriptor = "Lfn;"
   )
   public class96 field1553;

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static final void method960(int arg0, int arg1, String arg2) {
      try {
         ++field1552;
         ++class382.field5574;
         class242 var3 = class735.method5318(-121);
         class381 var4 = class801.method5775(class225.field3193, 0, var3.field3718);
         var4.field5570.method656((byte)-108, class519.method3880(false, arg2) + arg0);
         var4.field5570.method658(arg2, -112);
         var4.field5570.method689((byte)-115, arg1);
         var3.method2111(14024, var4);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1554[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1554[0] : field1554[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method961(int arg0) {
      try {
         if (arg0 != 1) {
            method960(-93, -114, (String)null);
         }

         field1551 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1554[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method962(boolean arg0) {
      try {
         ++field1550;
         if (this.field1547 != null) {
            this.field1547.field1553 = this.field1553;
            if (arg0) {
               field1551 = null;
            }

            this.field1553.field1547 = this.field1547;
            this.field1553 = null;
            this.field1547 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1554[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method963(byte arg0) {
      try {
         ++field1549;
         if (this.field1547 == null) {
            return false;
         } else {
            return arg0 > -99 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1554[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method965(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
