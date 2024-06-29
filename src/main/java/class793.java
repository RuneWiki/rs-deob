import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class793 extends class247 {
   @OriginalMember(
      owner = "client!as",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field11536;
   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11542 = new String[]{method5722(method5721("GjI\u00020")), method5722(method5721("GjI\u00030")), method5722(method5721("Hl\u000b-")), method5722(method5721("]7Ioe")), method5722(method5721("GjI\u00000")), method5722(method5721("GjI}qHp\u0013\u007f0"))};
   @OriginalMember(
      owner = "client!as",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11540 = null;
   @OriginalMember(
      owner = "client!as",
      name = "p",
      descriptor = "I"
   )
   public static int field11537;
   @OriginalMember(
      owner = "client!as",
      name = "l",
      descriptor = "I"
   )
   public static int field11538;
   @OriginalMember(
      owner = "client!as",
      name = "o",
      descriptor = "I"
   )
   public static int field11539;
   @OriginalMember(
      owner = "client!as",
      name = "n",
      descriptor = "I"
   )
   public static int field11541;
   @OriginalMember(
      owner = "client!as",
      name = "m",
      descriptor = "Lsa;"
   )
   public static class39 field11535;

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5718(byte arg0, int arg1) {
      try {
         class294.field4383 = arg1;
         if (arg0 == -30) {
            ++field11538;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11542[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(Ldba;Z)V"
   )
   public static final void method5719(class215 arg0, boolean arg1) {
      try {
         if (arg1) {
            field11540 = null;
         }

         arg0.field3067 = null;
         ++field11541;
         if (~class316.field4725 > -21) {
            class11.field177.method3310(0, arg0);
            ++class316.field4725;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11542[1] + (arg0 != null ? field11542[3] : field11542[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5720(byte arg0) {
      try {
         if (arg0 > -89) {
            method5720((byte)120);
         }

         field11540 = null;
         field11535 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11542[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class793(byte[] arg0) {
      try {
         this.field11536 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11542[5] + (arg0 != null ? field11542[3] : field11542[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!as",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
