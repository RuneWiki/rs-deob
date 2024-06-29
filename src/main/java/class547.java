import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class547 {
   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8203 = new String[]{method4163(method4162("\u0005x\u0018\u001dw")), method4163(method4162("\u0005x\u0018\u001fw")), method4163(method4162("\u0005x\u0018\u001cw"))};
   @OriginalMember(
      owner = "client!jj",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8201 = new int[2];
   @OriginalMember(
      owner = "client!jj",
      name = "d",
      descriptor = "I"
   )
   public static int field8197;
   @OriginalMember(
      owner = "client!jj",
      name = "e",
      descriptor = "I"
   )
   public static int field8200;
   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "I"
   )
   public static int field8202;
   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "Ljq;"
   )
   public static class672 field8198;
   @OriginalMember(
      owner = "client!jj",
      name = "c",
      descriptor = "[Ljq;"
   )
   public static class672[] field8199;

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(IZI)I",
      line = 5
   )
   public static final int method4159(int arg0, boolean arg1, int arg2) {
      try {
         ++field8202;
         if (arg0 != 1 && ~arg0 != -4) {
            if (!arg1) {
               field8198 = null;
            }

            return class682.field10160[arg2 & 3];
         } else {
            return class642.field9294[arg2 & 3];
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8203[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(I)V",
      line = 21
   )
   public static void method4160(int arg0) {
      try {
         field8199 = null;
         if (arg0 == -4) {
            field8201 = null;
            field8198 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8203[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(IIIII)V",
      line = 45
   )
   public static final void method4161(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         int var6 = arg2;
         if (!var5 && arg2 >= class169.field2594) {
            ++field8200;
            class171.method1580(arg1 - -arg3, arg0 - -arg4, arg2 ^ -81, arg0, arg1);
         } else {
            do {
               Rectangle var7 = class640.field9275[var6];
               if (var7.x + var7.width > arg1 && ~(arg1 - -arg3) < ~var7.x && arg0 < var7.y - -var7.height && ~var7.y > ~(arg0 + arg4)) {
                  class730.field10897[var6] = true;
               }

               ++var6;
            } while(var6 < class169.field2594);

            ++field8200;
            class171.method1580(arg1 - -arg3, arg0 - -arg4, arg2 ^ -81, arg0, arg1);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8203[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
