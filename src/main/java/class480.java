import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class480 extends class500 {
   @OriginalMember(
      owner = "client!la",
      name = "m",
      descriptor = "Lod;"
   )
   public class536 field6636 = new class536();
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6639 = new String[]{method3501(method3500("&h\t\u001e&")), method3501(method3500("&h\t\u001f&")), method3501(method3500("&h\t\u001c&"))};
   @OriginalMember(
      owner = "client!la",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field6633 = true;
   @OriginalMember(
      owner = "client!la",
      name = "l",
      descriptor = "Lbga;"
   )
   public static class378 field6631 = new class378(114, 2);
   @OriginalMember(
      owner = "client!la",
      name = "n",
      descriptor = "[J"
   )
   public static long[] field6637 = new long[32];
   @OriginalMember(
      owner = "client!la",
      name = "p",
      descriptor = "Lafa;"
   )
   public static class365 field6638 = new class365(7, 2);
   @OriginalMember(
      owner = "client!la",
      name = "o",
      descriptor = "I"
   )
   public static int field6632;
   @OriginalMember(
      owner = "client!la",
      name = "q",
      descriptor = "I"
   )
   public static int field6634;
   @OriginalMember(
      owner = "client!la",
      name = "j",
      descriptor = "I"
   )
   public static int field6635;

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3497(int arg0) {
      try {
         field6631 = null;
         if (arg0 < -107) {
            field6637 = null;
            field6638 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6639[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3498(int arg0, int arg1) {
      try {
         ++field6635;
         if (arg0 < 0 || ~arg0 < -3) {
            arg0 = 0;
         }

         class366.field5166 = arg0;
         if (arg1 > -35) {
            field6633 = true;
         }

         class656.field9177 = new class672[class39.field455[class366.field5166] - -1];
         class456.field6252 = 0;
         class519.field7116 = 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6639[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3499(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         int var6 = arg1;
         if (!var5 && class739.field10765 <= arg1) {
            ++field6634;
            class534.method3842(0, arg2 + arg4, arg0 + arg3, arg3, arg2);
         } else {
            do {
               Rectangle var7 = class224.field2809[var6];
               if (var7.x - -var7.width > arg2 && ~var7.x > ~(arg2 + arg4) && ~(var7.y + var7.height) < ~arg3 && ~(arg0 + arg3) < ~var7.y) {
                  class244.field3057[var6] = true;
               }

               ++var6;
            } while(class739.field10765 > var6);

            ++field6634;
            class534.method3842(0, arg2 + arg4, arg0 + arg3, arg3, arg2);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6639[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
