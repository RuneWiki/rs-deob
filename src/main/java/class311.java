import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class311 extends class247 {
   @OriginalMember(
      owner = "client!sba",
      name = "l",
      descriptor = "I"
   )
   public int field4669;
   @OriginalMember(
      owner = "client!sba",
      name = "m",
      descriptor = "I"
   )
   public int field4666;
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4673 = new String[]{method2543(method2542("E$}Yh_(u\u0003j\u001e")), method2543(method2542("E$}Y\u0016\u001e"))};
   @OriginalMember(
      owner = "client!sba",
      name = "o",
      descriptor = "Lhha;"
   )
   public static class724 field4667 = new class724(97, -2);
   @OriginalMember(
      owner = "client!sba",
      name = "j",
      descriptor = "I"
   )
   public static int field4670 = 0;
   @OriginalMember(
      owner = "client!sba",
      name = "p",
      descriptor = "I"
   )
   public static int field4671 = 0;
   @OriginalMember(
      owner = "client!sba",
      name = "n",
      descriptor = "I"
   )
   public static int field4668;
   @OriginalMember(
      owner = "client!sba",
      name = "k",
      descriptor = "I"
   )
   public static int field4672;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2540(boolean arg0) {
      try {
         if (arg0) {
            field4672 = -100;
         }

         field4667 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4673[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
   )
   public static final String method2541(String arg0, boolean arg1, String arg2, String arg3) {
      boolean var4 = client.field10022;
      if (!arg1) {
         return null;
      } else {
         ++field4668;
         int var5 = arg2.indexOf(arg0);
         if (var4) {
            arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(arg0.length() + var5);
            var5 = arg2.indexOf(arg0, arg3.length() + var5);
         }

         while(true) {
            while(~var5 != 0) {
               arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(arg0.length() + var5);
               var5 = arg2.indexOf(arg0, arg3.length() + var5);
            }

            if (!var4) {
               return arg2;
            }

            var5 = arg2.indexOf(arg0, arg3.length() + var5);
         }
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class311(int arg0, int arg1) {
      try {
         this.field4669 = arg1;
         this.field4666 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4673[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2543(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
