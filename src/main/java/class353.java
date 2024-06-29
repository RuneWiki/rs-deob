import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class353 extends class191 {
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5234 = new String[]{method2782(method2781("*\u00078y~k")), method2782(method2781("-\u00155;")), method2782(method2781("8Nwy@")), method2782(method2781("*\u00078yyk")), method2782(method2781("*\u00078y\u007fk"))};
   @OriginalMember(
      owner = "client!iga",
      name = "o",
      descriptor = "Lsb;"
   )
   public static class261 field5233 = new class261();
   @OriginalMember(
      owner = "client!iga",
      name = "m",
      descriptor = "B"
   )
   private byte field5226;
   @OriginalMember(
      owner = "client!iga",
      name = "n",
      descriptor = "B"
   )
   private byte field5227;
   @OriginalMember(
      owner = "client!iga",
      name = "l",
      descriptor = "B"
   )
   private byte field5229;
   @OriginalMember(
      owner = "client!iga",
      name = "p",
      descriptor = "B"
   )
   private byte field5231;
   @OriginalMember(
      owner = "client!iga",
      name = "r",
      descriptor = "I"
   )
   public static int field5228;
   @OriginalMember(
      owner = "client!iga",
      name = "s",
      descriptor = "I"
   )
   public static int field5230;
   @OriginalMember(
      owner = "client!iga",
      name = "q",
      descriptor = "Z"
   )
   private boolean field5232;

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         ++field5230;
         if (arg0 > -106) {
            this.field5231 = 10;
         }

         arg1.field6622 = this.field5231;
         arg1.field6652 = this.field5227;
         arg1.field6625 = this.field5226;
         arg1.field6636 = this.field5232;
         arg1.field6668 = this.field5229;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5234[4] + arg0 + ',' + (arg1 != null ? field5234[2] : field5234[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2780(byte arg0) {
      try {
         if (arg0 != -81) {
            field5233 = null;
         }

         field5233 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5234[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         this.field5232 = arg0.method665(false) == 1;
         ++field5228;
         this.field5229 = arg0.method638(true);
         if (arg1 >= -97) {
            this.method342((byte)-88, (class456)null);
         }

         this.field5226 = arg0.method638(true);
         this.field5231 = arg0.method638(true);
         this.field5227 = arg0.method638(true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5234[0] + (arg0 != null ? field5234[2] : field5234[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2781(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2782(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
