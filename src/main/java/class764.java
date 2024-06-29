import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class764 extends class128 {
   @OriginalMember(
      owner = "client!eja",
      name = "Lb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11230 = new String[]{method5540(method5539("_MTg\u0004y\u000f")), method5540(method5539("_MTg\u0011x\u000f")), method5540(method5539("_MTg\u0007y\u000f"))};
   @OriginalMember(
      owner = "client!eja",
      name = "Fb",
      descriptor = "Z"
   )
   public static boolean field11226 = false;
   @OriginalMember(
      owner = "client!eja",
      name = "Eb",
      descriptor = "Lqo;"
   )
   public static class24 field11227 = new class24(method5540(method5539("]FX,u")), method5540(method5539("}FX,f\t")), 2);
   @OriginalMember(
      owner = "client!eja",
      name = "Jb",
      descriptor = "Lsd;"
   )
   public static class101 field11228 = new class101(15, 8);
   @OriginalMember(
      owner = "client!eja",
      name = "Hb",
      descriptor = "B"
   )
   public static byte field11229;
   @OriginalMember(
      owner = "client!eja",
      name = "Kb",
      descriptor = "I"
   )
   public static int field11223;
   @OriginalMember(
      owner = "client!eja",
      name = "F",
      descriptor = "I"
   )
   public static int field11224;
   @OriginalMember(
      owner = "client!eja",
      name = "Gb",
      descriptor = "J"
   )
   public static long field11225;
   @OriginalMember(
      owner = "client!eja",
      name = "Ib",
      descriptor = "[Lvs;"
   )
   public static class616[] field11222;

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(FZ)V",
      line = 5
   )
   public final void method5536(float arg0, boolean arg1) {
      try {
         if (!arg1) {
            field11229 = -89;
         }

         ++field11224;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field1552[super.field1590++] = (byte)var3;
         super.field1552[super.field1590++] = (byte)(var3 >> 8);
         super.field1552[super.field1590++] = (byte)(var3 >> 16);
         super.field1552[super.field1590++] = (byte)(var3 >> 24);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11230[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(FB)V",
      line = 22
   )
   public final void method5537(float arg0, byte arg1) {
      try {
         if (arg1 != -48) {
            method5538(1);
         }

         ++field11223;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field1552[super.field1590++] = (byte)(var3 >> 24);
         super.field1552[super.field1590++] = (byte)(var3 >> 16);
         super.field1552[super.field1590++] = (byte)(var3 >> 8);
         super.field1552[super.field1590++] = (byte)var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11230[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "<init>",
      descriptor = "(I)V",
      line = 41
   )
   public class764(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eja",
      name = "t",
      descriptor = "(I)V",
      line = 45
   )
   public static void method5538(int arg0) {
      try {
         if (arg0 > -52) {
            method5538(86);
         }

         field11227 = null;
         field11228 = null;
         field11222 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11230[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5539(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5540(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
