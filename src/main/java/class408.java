import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class408 extends class246 {
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6002 = new String[]{method3133(method3132("&.6HC")), method3133(method3132("..te")), method3133(method3132("&.6KC")), method3133(method3132(";u6'\u0016"))};
   @OriginalMember(
      owner = "client!fu",
      name = "p",
      descriptor = "Lgh;"
   )
   public static class572 field5994 = new class572(55, -2);
   @OriginalMember(
      owner = "client!fu",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field6000 = false;
   @OriginalMember(
      owner = "client!fu",
      name = "q",
      descriptor = "I"
   )
   public int field5990;
   @OriginalMember(
      owner = "client!fu",
      name = "n",
      descriptor = "I"
   )
   public int field5991;
   @OriginalMember(
      owner = "client!fu",
      name = "m",
      descriptor = "I"
   )
   public static int field5995;
   @OriginalMember(
      owner = "client!fu",
      name = "u",
      descriptor = "I"
   )
   public int field5996;
   @OriginalMember(
      owner = "client!fu",
      name = "t",
      descriptor = "I"
   )
   public int field5997;
   @OriginalMember(
      owner = "client!fu",
      name = "s",
      descriptor = "I"
   )
   public int field5998;
   @OriginalMember(
      owner = "client!fu",
      name = "k",
      descriptor = "I"
   )
   public static int field5999;
   @OriginalMember(
      owner = "client!fu",
      name = "o",
      descriptor = "I"
   )
   public int field6001;
   @OriginalMember(
      owner = "client!fu",
      name = "j",
      descriptor = "Laka;"
   )
   public static class85 field5993;
   @OriginalMember(
      owner = "client!fu",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field5992;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(ILha;Ljfa;)V"
   )
   public static final void method3130(int arg0, class65 arg1, class303 arg2) {
      try {
         ++field5999;
         boolean var3 = field5993.method837(arg2.field4346, arg2.field4348 | arg0, arg2.field4365 ? class304.field4398.field6676 : null, arg2.field4315, arg2.field4351, arg1, arg2.field4276, arg0 ^ -16777107) == null;
         if (var3) {
            class624.field9090.method2585(new class26(arg2.field4346, arg2.field4351, arg2.field4315, arg2.field4348 | -16777216, arg2.field4276, arg2.field4365), 54);
            class322.method2512(arg0 ^ -16777200, arg2);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6002[2] + arg0 + ',' + (arg1 != null ? field6002[3] : field6002[1]) + ',' + (arg2 != null ? field6002[3] : field6002[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3131(byte arg0) {
      try {
         field5994 = null;
         field5993 = null;
         if (arg0 < 25) {
            field5994 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6002[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3132(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3133(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
