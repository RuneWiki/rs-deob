import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class620 extends class25 {
   @OriginalMember(
      owner = "client!fi",
      name = "v",
      descriptor = "I"
   )
   public int field8874;
   @OriginalMember(
      owner = "client!fi",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public String field8876;
   @OriginalMember(
      owner = "client!fi",
      name = "x",
      descriptor = "S"
   )
   public short field8875;
   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8877 = new String[]{method4571(method4570("SPBl\\")), method4571(method4570("F\u000b\u0000.")), method4571(method4570("N\u0017B~HF\u0017\u0018|\t"))};

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class620(String arg0, int arg1) {
      try {
         this.field8874 = (int)(class604.method4452(-114) / 1000L);
         this.field8876 = arg0;
         this.field8875 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8877[2] + (arg0 != null ? field8877[0] : field8877[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4570(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4571(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
