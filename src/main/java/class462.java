import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class462 extends class546 {
   @OriginalMember(
      owner = "client!gr",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6338 = new String[]{method3397(method3396("EXa\u0007_")), method3397(method3396("EXa\u0006_")), method3397(method3396("EXa\u0005_"))};
   @OriginalMember(
      owner = "client!gr",
      name = "M",
      descriptor = "Lbga;"
   )
   public static class378 field6332 = new class378(66, 10);
   @OriginalMember(
      owner = "client!gr",
      name = "N",
      descriptor = "I"
   )
   public int field6319;
   @OriginalMember(
      owner = "client!gr",
      name = "F",
      descriptor = "I"
   )
   public static int field6323;
   @OriginalMember(
      owner = "client!gr",
      name = "H",
      descriptor = "I"
   )
   public int field6326;
   @OriginalMember(
      owner = "client!gr",
      name = "t",
      descriptor = "I"
   )
   public int field6327;
   @OriginalMember(
      owner = "client!gr",
      name = "u",
      descriptor = "I"
   )
   public int field6328;
   @OriginalMember(
      owner = "client!gr",
      name = "A",
      descriptor = "I"
   )
   public int field6329;
   @OriginalMember(
      owner = "client!gr",
      name = "v",
      descriptor = "I"
   )
   public static int field6330;
   @OriginalMember(
      owner = "client!gr",
      name = "L",
      descriptor = "I"
   )
   public int field6331;
   @OriginalMember(
      owner = "client!gr",
      name = "y",
      descriptor = "I"
   )
   public static int field6337;
   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "Lgka;"
   )
   public class394 field6320;
   @OriginalMember(
      owner = "client!gr",
      name = "x",
      descriptor = "Llia;"
   )
   public static class507 field6335;
   @OriginalMember(
      owner = "client!gr",
      name = "G",
      descriptor = "Lqh;"
   )
   public static class74 field6334;
   @OriginalMember(
      owner = "client!gr",
      name = "K",
      descriptor = "Ljava/lang/String;"
   )
   public String field6336;
   @OriginalMember(
      owner = "client!gr",
      name = "J",
      descriptor = "[I"
   )
   public int[] field6322;
   @OriginalMember(
      owner = "client!gr",
      name = "I",
      descriptor = "[I"
   )
   public int[] field6325;
   @OriginalMember(
      owner = "client!gr",
      name = "B",
      descriptor = "[J"
   )
   public long[] field6324;
   @OriginalMember(
      owner = "client!gr",
      name = "D",
      descriptor = "[Ldia;"
   )
   public class245[] field6321;
   @OriginalMember(
      owner = "client!gr",
      name = "E",
      descriptor = "[Lbo;"
   )
   public static class763[] field6333;
   @OriginalMember(
      owner = "client!gr",
      name = "w",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field6318;

   @OriginalMember(
      owner = "client!gr",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3393(boolean arg0) {
      try {
         field6332 = null;
         field6335 = null;
         field6334 = null;
         if (arg0) {
            field6332 = null;
         }

         field6333 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6338[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3394(byte arg0, int arg1) {
      try {
         ++field6330;
         class17.field235.method4234(arg0 ^ 124, arg1);
         if (arg0 != 126) {
            method3393(true);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6338[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3395(int arg0) {
      try {
         ++field6323;
         if (arg0 > -106) {
            field6332 = null;
         }

         class183.method1400(6);
         class223.method1696(22050, -48001, 2, ~class674.field9907.field8428.method5225((byte)-119) == -2);
         class614.field8576 = class205.method1549(22050, 0, class61.field671, (byte)120, class204.field2515);
         class175.method1358(48, true, class114.method991((class69)null, (byte)-107));
         class7.field62 = class205.method1549(2048, 1, class61.field671, (byte)127, class204.field2515);
         class7.field62.method61(83, class717.field10509);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6338[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3396(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3397(char[] arg0) {
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
            var10005 = 42;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
