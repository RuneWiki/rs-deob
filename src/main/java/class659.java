import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class659 implements class726 {
   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private String field9606;
   @OriginalMember(
      owner = "client!gj",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field9609;
   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9611 = new String[]{method4839(method4838("R31r")), method4839(method4838("Ghs0l")), method4839(method4838("[,s\"xR/) 9")), method4839(method4838("[,s]9")), method4839(method4838("[,s_9")), method4839(method4838("[,s\\9"))};
   @OriginalMember(
      owner = "client!gj",
      name = "e",
      descriptor = "I"
   )
   public static int field9607;
   @OriginalMember(
      owner = "client!gj",
      name = "d",
      descriptor = "I"
   )
   public static int field9608;
   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "I"
   )
   public static int field9610;

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(B)Lpu;",
      line = 3
   )
   public final class586 method1382(byte arg0) {
      try {
         ++field9608;
         return arg0 != 79 ? null : class586.field8471;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9611[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(BI)V",
      line = 16
   )
   public static final void method4837(byte arg0, int arg1) {
      try {
         ++field9607;
         class719.field10380.method1579(85, arg1);
         class388.field5733.method1579(arg0 ^ 42, arg1);
         class402.field5910.method1579(-72, arg1);
         class414.field6070.method1579(-48, arg1);
         if (arg0 == -21) {
            ;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9611[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "(B)I",
      line = 32
   )
   public final int method1379(byte arg0) {
      try {
         ++field9610;
         if (arg0 <= 52) {
            this.field9606 = null;
         }

         return this.field9609.method1332(this.field9606, 0) ? 100 : 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9611[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "<init>",
      descriptor = "(Lhw;Ljava/lang/String;)V",
      line = 48
   )
   public class659(class141 arg0, String arg1) {
      try {
         this.field9606 = arg1;
         this.field9609 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9611[2] + (arg0 != null ? field9611[1] : field9611[0]) + ',' + (arg1 != null ? field9611[1] : field9611[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4838(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4839(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
