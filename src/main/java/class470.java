import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class470 extends class644 {
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6474 = new String[]{method3570(method3569("\u0001:8/KM")), method3570(method3569("\u001evw/s")), method3570(method3569("\u000b-5m")), method3570(method3569("\u0001:8/LM"))};
   @OriginalMember(
      owner = "client!dba",
      name = "v",
      descriptor = "I"
   )
   public static int field6470;
   @OriginalMember(
      owner = "client!dba",
      name = "s",
      descriptor = "I"
   )
   public static int field6471;
   @OriginalMember(
      owner = "client!dba",
      name = "t",
      descriptor = "I"
   )
   public static int field6472;
   @OriginalMember(
      owner = "client!dba",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field6473;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field6472;
         arg1.field11514 = this.field6473;
         if (arg0 != 19163) {
            field6471 = -127;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6474[3] + arg0 + ',' + (arg1 != null ? field6474[1] : field6474[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field6470;
         this.field6473 = arg1.method606(arg0 ^ 11867);
         arg1.method610(127);
         if (arg0 != 11) {
            this.field6473 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6474[0] + arg0 + ',' + (arg1 != null ? field6474[1] : field6474[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3569(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3570(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
