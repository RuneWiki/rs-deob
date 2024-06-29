import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class534 {
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7302 = new String[]{method3849(method3848("\u001bT7Ky")), method3849(method3848("\u001bT7Hy")), method3849(method3848("\u001bT7Jy")), method3849(method3848("\u001bT7Oy")), method3849(method3848("\u001bT7Ly"))};
   @OriginalMember(
      owner = "client!ko",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field7298 = new class378(116, 2);
   @OriginalMember(
      owner = "client!ko",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field7299 = new class616(82, 3);
   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "I"
   )
   public static int field7293;
   @OriginalMember(
      owner = "client!ko",
      name = "c",
      descriptor = "I"
   )
   public static int field7294;
   @OriginalMember(
      owner = "client!ko",
      name = "d",
      descriptor = "I"
   )
   public static int field7295;
   @OriginalMember(
      owner = "client!ko",
      name = "b",
      descriptor = "I"
   )
   public static int field7296;
   @OriginalMember(
      owner = "client!ko",
      name = "g",
      descriptor = "I"
   )
   public static int field7297;
   @OriginalMember(
      owner = "client!ko",
      name = "h",
      descriptor = "I"
   )
   public static int field7300;
   @OriginalMember(
      owner = "client!ko",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field7301;

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3842(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         ++field7296;
         if (class616.field8588 == 1) {
            int var6 = arg4 / class477.field6599;
            int var7 = arg1 / class477.field6599;
            int var8 = arg3 / class182.field2249;
            int var9 = arg2 / class182.field2249;
            if (class498.field6856 > var6 && var7 >= 0 && ~var8 > ~class124.field1540 && var9 >= 0) {
               if (var8 < arg0) {
                  var8 = 0;
               }

               if (~var6 > -1) {
                  var6 = 0;
               }

               if (~class498.field6856 >= ~var7) {
                  var7 = class498.field6856 + -1;
               }

               if (~var9 <= ~class124.field1540) {
                  var9 = class124.field1540 + -1;
               }

               int var10 = var8;
               if (var5 || ~var9 <= ~var8) {
                  do {
                     int var11 = class348.method2749(class671.field9871 + var10, class124.field1540, (byte)-72) * class498.field6856;
                     int var12 = var6;
                     if (var5 || var6 <= var7) {
                        do {
                           int var13 = class348.method2749(class458.field6280 + var12, class498.field6856, (byte)-72) + var11;
                           class302.field4001[var13] = class492.field6769;
                           ++var12;
                        } while(var12 <= var7);
                     }

                     ++var10;
                  } while(~var9 <= ~var10);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw method3846(var15, field7302[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3843(boolean arg0) {
      try {
         class590 var1 = class588.field8104;
         synchronized(class588.field8104) {
            class588.field8104.method4245(arg0);
         }

         ++field7297;
      } catch (RuntimeException var4) {
         throw method3846(var4, field7302[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3844(int arg0, int arg1) {
      try {
         if (arg0 == -8347) {
            class619.field8658 = 2;
            class604.field8418 = class605.field8474;
            class766.field11046 = arg1;
            ++field7293;
            class396.method3008(class762.field11020.equals(""), class762.field11020, (byte)-86, true, "");
         }
      } catch (RuntimeException var3) {
         throw method3846(var3, field7302[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3845(int arg0, int arg1, int arg2) {
      try {
         ++field7295;
         if (arg2 != 11576) {
            field7298 = null;
         }

         return class470.method3447(8, arg1, arg0) | ~(arg0 & 458752) != -1 || class625.method4545(arg0, arg1, (byte)-111);
      } catch (RuntimeException var4) {
         throw method3846(var4, field7302[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhf;"
   )
   public static final class419 method3846(Throwable arg0, String arg1) {
      ++field7294;
      class419 var2;
      if (!(arg0 instanceof class419)) {
         var2 = new class419(arg0, arg1);
      } else {
         var2 = (class419)arg0;
         var2.field5879 = var2.field5879 + ' ' + arg1;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3847(int arg0) {
      try {
         field7301 = null;
         field7298 = null;
         if (arg0 == 458752) {
            field7299 = null;
         }
      } catch (RuntimeException var2) {
         throw method3846(var2, field7302[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3848(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3849(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
