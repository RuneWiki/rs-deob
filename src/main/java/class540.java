import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class540 {
   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7854 = new String[]{method4044(method4043("h\u0012ouS")), method4044(method4043("h\u0012otS")), method4044(method4043("h\u0012ovS"))};
   @OriginalMember(
      owner = "client!dn",
      name = "d",
      descriptor = "Llha;"
   )
   public static class649 field7850 = new class649();
   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field7852 = new class572(94, 28);
   @OriginalMember(
      owner = "client!dn",
      name = "c",
      descriptor = "I"
   )
   public static int field7851;
   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "I"
   )
   public static int field7853;

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4040(int arg0) {
      try {
         field7850 = null;
         int var1 = -24 % ((57 - arg0) / 33);
         field7852 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7854[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4041(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(IIIIIIIB)V"
   )
   public static final void method4042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      try {
         ++field7853;
         if (~arg2 == ~arg4) {
            class262.method2100(arg0, arg6, arg3, arg5, arg4, (byte)94, arg1);
         } else {
            if (arg7 > -45) {
               field7852 = null;
            }

            if (~class515.field7502 >= ~(arg5 - arg4) && ~(arg5 - -arg4) >= ~class130.field2163 && ~(arg0 - arg2) <= ~class3.field16 && class581.field8354 >= arg0 + arg2) {
               class564.method4201(arg2, arg3, arg1, arg0, 14, arg5, arg4, arg6);
            } else {
               class486.method3673(-1, arg3, arg4, arg1, arg5, arg0, arg6, arg2);
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7854[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
