import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class191 extends class673 {
   @OriginalMember(
      owner = "client!hh",
      name = "n",
      descriptor = "I"
   )
   public int field2425;
   @OriginalMember(
      owner = "client!hh",
      name = "m",
      descriptor = "I"
   )
   public int field2427;
   @OriginalMember(
      owner = "client!hh",
      name = "q",
      descriptor = "Z"
   )
   public boolean field2429;
   @OriginalMember(
      owner = "client!hh",
      name = "s",
      descriptor = "Ljc;"
   )
   public class524 field2423;
   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2430 = new String[]{method1593(method1592("6\u0007#\u001cC")), method1593(method1592("6\u0007#\u001fC")), method1593(method1592("6\u0007#b\u00020\u0006y`C")), method1593(method1592("0\u001aa2")), method1593(method1592("%A#p\u0016"))};
   @OriginalMember(
      owner = "client!hh",
      name = "o",
      descriptor = "I"
   )
   public static int field2421;
   @OriginalMember(
      owner = "client!hh",
      name = "r",
      descriptor = "Lem;"
   )
   public static class639 field2428;
   @OriginalMember(
      owner = "client!hh",
      name = "l",
      descriptor = "Z"
   )
   public boolean field2422;
   @OriginalMember(
      owner = "client!hh",
      name = "p",
      descriptor = "Z"
   )
   public boolean field2424;
   @OriginalMember(
      owner = "client!hh",
      name = "t",
      descriptor = "Z"
   )
   public boolean field2426;

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1590(int arg0) {
      try {
         if (arg0 != 0) {
            method1591(55);
         }

         field2428 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2430[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(I)Ltk;"
   )
   public static final class111 method1591(int arg0) {
      try {
         ++field2421;
         if (arg0 != -22559) {
            return null;
         } else {
            class586.field8649 = 0;
            return class403.method3162((byte)5);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2430[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(ILjc;IZ)V"
   )
   public class191(int arg0, class524 arg1, int arg2, boolean arg3) {
      try {
         this.field2425 = arg2;
         this.field2427 = arg0;
         this.field2429 = arg3;
         this.field2423 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2430[2] + arg0 + ',' + (arg1 != null ? field2430[4] : field2430[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1592(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1593(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
