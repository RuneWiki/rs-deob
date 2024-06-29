import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class681 extends class485 {
   @OriginalMember(
      owner = "client!mf",
      name = "eb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10159 = new String[]{method5044(method5043("{z/~W")), method5044(method5043("{z/}W"))};
   @OriginalMember(
      owner = "client!mf",
      name = "Y",
      descriptor = "Luk;"
   )
   public static class498 field10154 = new class498(1, 3);
   @OriginalMember(
      owner = "client!mf",
      name = "cb",
      descriptor = "Leh;"
   )
   public static class19 field10155 = new class19(2);
   @OriginalMember(
      owner = "client!mf",
      name = "db",
      descriptor = "Lsf;"
   )
   public static class475 field10158 = new class475();
   @OriginalMember(
      owner = "client!mf",
      name = "bb",
      descriptor = "I"
   )
   public static int field10153;
   @OriginalMember(
      owner = "client!mf",
      name = "ab",
      descriptor = "I"
   )
   public int field10156;
   @OriginalMember(
      owner = "client!mf",
      name = "Z",
      descriptor = "[Lvl;"
   )
   public static class409[] field10157;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5041(int arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -22) {
            field10158 = null;
         }

         ++field10153;
         return ~(65536 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10159[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "<init>",
      descriptor = "(Lbaa;)V"
   )
   public class681(class109 arg0) {
      super(arg0, false);
   }

   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5042(byte arg0) {
      try {
         field10155 = null;
         field10154 = null;
         field10157 = null;
         int var1 = -78 / ((-36 - arg0) / 54);
         field10158 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10159[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
