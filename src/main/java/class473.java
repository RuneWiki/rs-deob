import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class473 {
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6817 = new String[]{method3447(method3446("IY\u000fr")), method3447(method3446("W^M\\1")), method3447(method3446("\\\u0002M0d"))};
   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "I"
   )
   public static int field6816;
   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "J"
   )
   public static long field6815;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)V"
   )
   public static final void method3444(String arg0, int arg1, String arg2) {
      try {
         class686.field10122 = -1;
         class136.field1737 = class430.field6143;
         ++field6816;
         if (arg1 < 91) {
            field6815 = 80L;
         }

         class235.field3273 = 1;
         class506.method3675(false, false, arg0, arg2, 0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6817[1] + (arg0 != null ? field6817[2] : field6817[0]) + ',' + arg1 + ',' + (arg2 != null ? field6817[2] : field6817[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3445(int arg0) {
      if (arg0 == 0) {
         if (class140.field1792 == 2) {
            class314.field4294[0].method3770(class390.field5654[0]);
            class314.field4294[1].method3770(class390.field5654[1]);
         } else if (class140.field1792 == 3) {
            class314.field4294[0].method3770(class390.field5654[0]);
            class314.field4294[1].method3770(class390.field5654[1]);
            class314.field4294[2].method3770(class390.field5654[2]);
         } else {
            class314.field4294[0].method3770(class390.field5654[0]);
            class314.field4294[1].method3770(class390.field5654[1]);
            class314.field4294[2].method3770(class390.field5654[2]);
            class314.field4294[3].method3770(class390.field5654[3]);
         }
      } else if (arg0 == 1) {
         if (class140.field1792 == 2) {
            class314.field4294[0].method3770(class390.field5654[2]);
         } else if (class140.field1792 == 3) {
            class314.field4294[0].method3770(class390.field5654[3]);
            class314.field4294[1].method3770(class390.field5654[4]);
         } else {
            class314.field4294[0].method3770(class390.field5654[4]);
            class314.field4294[1].method3770(class390.field5654[5]);
            class314.field4294[2].method3770(class390.field5654[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class140.field1792 == 2) {
               class314.field4294[0].method3770(class390.field5654[3]);
               return;
            }

            if (class140.field1792 == 3) {
               class314.field4294[0].method3770(class390.field5654[5]);
               return;
            }

            class314.field4294[0].method3770(class390.field5654[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
