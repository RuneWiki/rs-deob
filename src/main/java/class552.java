import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class552 {
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7599 = new String[]{method3989(method3988("\u001eI]1:T")), method3989(method3988("\u0012]Ps")), method3989(method3988("\u0007\u0006\u00121\u0005")), method3989(method3988("\u001eI]1<T")), method3989(method3988("\u001eI]1;T")), method3989(method3988("\u001eI]19T"))};
   @OriginalMember(
      owner = "client!baa",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field7593 = false;
   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "Lnm;"
   )
   public static class502 field7592 = new class502();
   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class378 field7596 = new class378(81, 0);
   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "I"
   )
   public static int field7590;
   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "I"
   )
   public static int field7591;
   @OriginalMember(
      owner = "client!baa",
      name = "i",
      descriptor = "I"
   )
   public static int field7594;
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "I"
   )
   public static int field7595;
   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "I"
   )
   public static int field7597;
   @OriginalMember(
      owner = "client!baa",
      name = "g",
      descriptor = "I"
   )
   public static int field7598;

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ILjava/lang/String;)[B"
   )
   public static final byte[] method3984(int arg0, String arg1) {
      try {
         ++field7590;
         int var2 = arg1.length();
         if (var2 == 0) {
            return new byte[0];
         } else {
            int var3 = -127 % ((41 - arg0) / 43);
            int var4 = var2 - -3 & -4;
            int var5 = var4 / 4 * 3;
            if (var2 > var4 + -2 && ~class558.method4014(-891902748, arg1.charAt(var4 + -2)) != 0) {
               if (~var2 >= ~(var4 + -1) || class558.method4014(-891902748, arg1.charAt(var4 - 1)) == -1) {
                  --var5;
               }
            } else {
               var5 -= 2;
            }

            byte[] var6 = new byte[var5];
            class739.method5355(arg1, 0, var6, (byte)-109);
            return var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7599[3] + arg0 + ',' + (arg1 != null ? field7599[2] : field7599[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method3985(boolean arg0, int arg1) {
      try {
         ++field7594;
         int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
         if (arg0) {
            method3984(-120, (String)null);
         }

         int var3 = arg1 * 6 + -61440;
         int var4 = (arg1 * var3 >> 12) + 40960;
         return var2 * var4 >> 12;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7599[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Lsf;B)V"
   )
   public static final void method3986(class553 arg0, byte arg1) {
      try {
         if (arg1 > -103) {
            field7593 = true;
         }

         class343.field4907 = arg0;
         ++field7591;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7599[5] + (arg0 != null ? field7599[2] : field7599[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3987(int arg0) {
      try {
         if (arg0 >= 12) {
            field7592 = null;
            field7596 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7599[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3988(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3989(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
