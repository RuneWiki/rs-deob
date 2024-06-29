import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class755 extends class537 {
   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11147 = new String[]{method5488(method5487("&\u001d1i\u001f~")), method5488(method5487("8\r<+")), method5488(method5487("&\u001d1i\u001d~")), method5488(method5487("-V~i%")), method5488(method5487("&\u001d1i\u0019~"))};
   @OriginalMember(
      owner = "client!pea",
      name = "t",
      descriptor = "I"
   )
   public static int field11145;
   @OriginalMember(
      owner = "client!pea",
      name = "r",
      descriptor = "I"
   )
   public static int field11146;
   @OriginalMember(
      owner = "client!pea",
      name = "v",
      descriptor = "Lhg;"
   )
   public static class719 field11144;
   @OriginalMember(
      owner = "client!pea",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field11143;
   @OriginalMember(
      owner = "client!pea",
      name = "s",
      descriptor = "[J"
   )
   public static long[] field11142;

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1468(OggPacket arg0, int arg1) {
      try {
         ++field11145;
         if (arg1 != 0) {
            field11144 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11147[2] + (arg0 != null ? field11147[3] : field11147[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class755(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1467(int arg0) {
      try {
         if (arg0 != -25083) {
            field11144 = null;
         }

         ++field11146;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11147[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5486(int arg0) {
      try {
         field11143 = null;
         if (arg0 == -12066) {
            field11142 = null;
            field11144 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11147[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
