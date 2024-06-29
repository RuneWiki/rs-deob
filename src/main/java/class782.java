import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class782 extends class428 implements class386 {
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11471 = new String[]{method5637(method5636("O?mK4")), method5637(method5636("O?mL4")), method5637(method5636("O?mI4")), method5637(method5636("O?mM4")), method5637(method5636("O?mJ4")), method5637(method5636("O?mN4"))};
   @OriginalMember(
      owner = "client!mo",
      name = "x",
      descriptor = "C"
   )
   public char field11467;
   @OriginalMember(
      owner = "client!mo",
      name = "m",
      descriptor = "I"
   )
   public static int field11458;
   @OriginalMember(
      owner = "client!mo",
      name = "r",
      descriptor = "I"
   )
   public int field11459;
   @OriginalMember(
      owner = "client!mo",
      name = "u",
      descriptor = "I"
   )
   public static int field11461;
   @OriginalMember(
      owner = "client!mo",
      name = "p",
      descriptor = "I"
   )
   public static int field11462;
   @OriginalMember(
      owner = "client!mo",
      name = "s",
      descriptor = "I"
   )
   public static int field11464;
   @OriginalMember(
      owner = "client!mo",
      name = "q",
      descriptor = "I"
   )
   public static int field11465;
   @OriginalMember(
      owner = "client!mo",
      name = "o",
      descriptor = "I"
   )
   public int field11466;
   @OriginalMember(
      owner = "client!mo",
      name = "w",
      descriptor = "I"
   )
   public static int field11468;
   @OriginalMember(
      owner = "client!mo",
      name = "v",
      descriptor = "I"
   )
   public int field11469;
   @OriginalMember(
      owner = "client!mo",
      name = "t",
      descriptor = "I"
   )
   public static int field11470;
   @OriginalMember(
      owner = "client!mo",
      name = "n",
      descriptor = "J"
   )
   public long field11460;
   @OriginalMember(
      owner = "client!mo",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field11463;

   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "(I)I",
      line = 5
   )
   public final int method2924(int arg0) {
      try {
         ++field11464;
         int var2 = -71 % ((65 - arg0) / 39);
         return this.field11466;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11471[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(I)I",
      line = 18
   )
   public final int method2925(int arg0) {
      try {
         ++field11461;
         return arg0 <= 74 ? -45 : this.field11469;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11471[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(Z)J",
      line = 31
   )
   public final long method2923(boolean arg0) {
      try {
         ++field11468;
         return !arg0 ? 74L : this.field11460;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11471[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "(I)V",
      line = 43
   )
   public static void method5635(int arg0) {
      try {
         if (arg0 != -11873) {
            method5635(83);
         }

         field11463 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11471[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I)I",
      line = 59
   )
   public final int method2927(int arg0) {
      try {
         if (arg0 <= 79) {
            return -37;
         } else {
            ++field11462;
            return this.field11459;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11471[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(I)C",
      line = 72
   )
   public final char method2926(int arg0) {
      try {
         if (arg0 <= 72) {
            return (char)65522;
         } else {
            ++field11458;
            return this.field11467;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11471[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5636(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5637(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
