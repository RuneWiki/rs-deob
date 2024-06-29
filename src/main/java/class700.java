import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class700 {
   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10443 = new String[]{method5159(method5158("5#v\u001cK")), method5159(method5158("5#v\u001fK")), method5159(method5158("6%41")), method5159(method5158("#~vs\u001e")), method5159(method5158("5#v\u001eK"))};
   @OriginalMember(
      owner = "client!ms",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field10438 = new class113(28, -1);
   @OriginalMember(
      owner = "client!ms",
      name = "e",
      descriptor = "Lvv;"
   )
   public static class308 field10441 = new class308();
   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "I"
   )
   public static int field10442 = -1;
   @OriginalMember(
      owner = "client!ms",
      name = "d",
      descriptor = "I"
   )
   public static int field10437;
   @OriginalMember(
      owner = "client!ms",
      name = "c",
      descriptor = "I"
   )
   public static int field10439;
   @OriginalMember(
      owner = "client!ms",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field10440;

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5155(int arg0) {
      try {
         if (arg0 != -20221) {
            field10440 = null;
         }

         field10441 = null;
         field10438 = null;
         field10440 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10443[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(Lfq;B)V"
   )
   public static final void method5156(class374 arg0, byte arg1) {
      try {
         int var2 = -50 % ((18 - arg1) / 53);
         if (arg0.field5910 == 5 && ~arg0.field5927 != 0) {
            class639.method4668((byte)92, arg0, class351.field5356);
         }

         ++field10437;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10443[1] + (arg0 != null ? field10443[3] : field10443[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(B)Lah;"
   )
   public static final class626 method5157(byte arg0) {
      try {
         ++field10439;
         class626 var1 = (class626)class774.field11381.method1812(0);
         int var2 = 44 / ((29 - arg0) / 59);
         if (var1 != null) {
            --class789.field11550;
            return var1;
         } else {
            return new class626();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10443[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
