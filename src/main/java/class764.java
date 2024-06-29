import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class764 extends class795 {
   @OriginalMember(
      owner = "client!bf",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11190 = new String[]{method5538(method5537("\f\u0017\nY ")), method5538(method5537("\f\u0017\nX ")), method5538(method5537("\f\u0017\nZ "))};
   @OriginalMember(
      owner = "client!bf",
      name = "J",
      descriptor = "Lse;"
   )
   public static class6 field11184 = new class6(14, 3);
   @OriginalMember(
      owner = "client!bf",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field11189 = new int[5];
   @OriginalMember(
      owner = "client!bf",
      name = "H",
      descriptor = "B"
   )
   public byte field11188;
   @OriginalMember(
      owner = "client!bf",
      name = "G",
      descriptor = "I"
   )
   public int field11182;
   @OriginalMember(
      owner = "client!bf",
      name = "B",
      descriptor = "I"
   )
   public static int field11183;
   @OriginalMember(
      owner = "client!bf",
      name = "I",
      descriptor = "I"
   )
   public static int field11185;
   @OriginalMember(
      owner = "client!bf",
      name = "C",
      descriptor = "I"
   )
   public static int field11187;
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "Lgea;"
   )
   public class66 field11186;

   @OriginalMember(
      owner = "client!bf",
      name = "d",
      descriptor = "(I)[B"
   )
   public final byte[] method4356(int arg0) {
      try {
         ++field11185;
         if (!super.field11623 && this.field11186.field859.length + -this.field11188 <= this.field11186.field864) {
            return arg0 != -2 ? null : this.field11186.field859;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11190[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method5536(int arg0) {
      try {
         if (arg0 <= 72) {
            method5536(67);
         }

         field11184 = null;
         field11189 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11190[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4354(int arg0) {
      try {
         if (arg0 < 63) {
            return 46;
         } else {
            ++field11187;
            return this.field11186 == null ? 0 : this.field11186.field864 * 100 / (this.field11186.field859.length + -this.field11188);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11190[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
