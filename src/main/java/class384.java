import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class384 extends class444 {
   @OriginalMember(
      owner = "client!dka",
      name = "u",
      descriptor = "I"
   )
   public int field6046;
   @OriginalMember(
      owner = "client!dka",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field6045;
   @OriginalMember(
      owner = "client!dka",
      name = "v",
      descriptor = "S"
   )
   public short field6048;
   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6051 = new String[]{method3114(method3113("0IzZ")), method3114(method3113(":Ww\u0018\b7R\u007fB\nv")), method3114(method3113("%\u00128\u0018I")), method3114(method3113(":Ww\u0018uv"))};
   @OriginalMember(
      owner = "client!dka",
      name = "s",
      descriptor = "Lnaa;"
   )
   public static class113 field6047 = new class113(67, -1);
   @OriginalMember(
      owner = "client!dka",
      name = "w",
      descriptor = "I"
   )
   public static int field6049 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "r",
      descriptor = "Llj;"
   )
   public static class304 field6050 = new class304(8);

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method3112(byte arg0) {
      try {
         if (arg0 >= -21) {
            field6050 = null;
         }

         field6047 = null;
         field6050 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6051[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 22
   )
   public class384(String arg0, int arg1) {
      try {
         this.field6046 = (int)(class162.method1442(14080) / 1000L);
         this.field6045 = arg0;
         this.field6048 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6051[1] + (arg0 != null ? field6051[2] : field6051[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3113(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3114(char[] arg0) {
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
            var10005 = 60;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
