import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class305 extends class297 {
   @OriginalMember(
      owner = "client!eq",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4784 = new String[]{method2562(method2561("\u001c\u0016F`Y")), method2562(method2561("\u001c\u0016FcY"))};
   @OriginalMember(
      owner = "client!eq",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field4774 = new int[2];
   @OriginalMember(
      owner = "client!eq",
      name = "v",
      descriptor = "I"
   )
   public int field4768;
   @OriginalMember(
      owner = "client!eq",
      name = "G",
      descriptor = "I"
   )
   public int field4769;
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "I"
   )
   public int field4771;
   @OriginalMember(
      owner = "client!eq",
      name = "A",
      descriptor = "I"
   )
   public static int field4772;
   @OriginalMember(
      owner = "client!eq",
      name = "I",
      descriptor = "I"
   )
   public int field4777;
   @OriginalMember(
      owner = "client!eq",
      name = "E",
      descriptor = "I"
   )
   public int field4778;
   @OriginalMember(
      owner = "client!eq",
      name = "u",
      descriptor = "I"
   )
   public int field4783;
   @OriginalMember(
      owner = "client!eq",
      name = "x",
      descriptor = "Lria;"
   )
   public static class185 field4780;
   @OriginalMember(
      owner = "client!eq",
      name = "J",
      descriptor = "Ldha;"
   )
   public class642 field4782;
   @OriginalMember(
      owner = "client!eq",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public String field4770;
   @OriginalMember(
      owner = "client!eq",
      name = "H",
      descriptor = "[I"
   )
   public int[] field4775;
   @OriginalMember(
      owner = "client!eq",
      name = "y",
      descriptor = "[I"
   )
   public int[] field4781;
   @OriginalMember(
      owner = "client!eq",
      name = "C",
      descriptor = "[J"
   )
   public long[] field4779;
   @OriginalMember(
      owner = "client!eq",
      name = "B",
      descriptor = "[Let;"
   )
   public class389[] field4773;
   @OriginalMember(
      owner = "client!eq",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field4776;

   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2559(int arg0) {
      try {
         class630.field9114 = null;
         if (arg0 <= 80) {
            method2560(-91);
         }

         class529.field8024 = null;
         class634.field9183 = null;
         class577.field8538 = null;
         class12.field152 = null;
         class563.field8367 = null;
         class547.field8199 = null;
         class156.field2324 = null;
         class241.field3667 = null;
         class492.field7446 = null;
         class117.field1572 = null;
         class722.field10805 = null;
         class539.field8131 = null;
         class547.field8198 = null;
         class302.field4725 = null;
         ++field4772;
         class127.field1828 = null;
         class637.field9224 = null;
         class2.field13 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4784[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2560(int arg0) {
      try {
         if (arg0 != 2) {
            method2559(-85);
         }

         field4780 = null;
         field4774 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4784[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2561(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2562(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
