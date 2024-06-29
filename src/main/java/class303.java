import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class303 extends class191 {
   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4588 = new String[]{method2510(method2509("j\nSRO/")), method2510(method2509("i\u0015^\u0010")), method2510(method2509("|N\u001cRp")), method2510(method2509("j\nSRN/")), method2510(method2509("j\nSRI/"))};
   @OriginalMember(
      owner = "client!mja",
      name = "o",
      descriptor = "Lhha;"
   )
   public static class724 field4577 = new class724(8, 0);
   @OriginalMember(
      owner = "client!mja",
      name = "r",
      descriptor = "I"
   )
   public static int field4581 = class682.method4979(1600, true);
   @OriginalMember(
      owner = "client!mja",
      name = "w",
      descriptor = "I"
   )
   public static int field4586 = -1;
   @OriginalMember(
      owner = "client!mja",
      name = "q",
      descriptor = "[Z"
   )
   public static boolean[] field4583 = new boolean[8];
   @OriginalMember(
      owner = "client!mja",
      name = "l",
      descriptor = "[[I"
   )
   public static int[][] field4585 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!mja",
      name = "m",
      descriptor = "Lef;"
   )
   public static class171 field4584 = new class171();
   @OriginalMember(
      owner = "client!mja",
      name = "s",
      descriptor = "I"
   )
   public static int field4576;
   @OriginalMember(
      owner = "client!mja",
      name = "v",
      descriptor = "I"
   )
   private int field4578;
   @OriginalMember(
      owner = "client!mja",
      name = "t",
      descriptor = "I"
   )
   private int field4579;
   @OriginalMember(
      owner = "client!mja",
      name = "n",
      descriptor = "I"
   )
   private int field4580;
   @OriginalMember(
      owner = "client!mja",
      name = "u",
      descriptor = "I"
   )
   private int field4582;
   @OriginalMember(
      owner = "client!mja",
      name = "p",
      descriptor = "I"
   )
   public static int field4587;

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field4587;
         this.field4579 = arg0.method701(255);
         if (arg1 > -97) {
            this.method346((class65)null, -61);
         }

         this.field4580 = arg0.method701(255);
         this.field4578 = arg0.method665(false);
         this.field4582 = arg0.method665(false);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4588[3] + (arg0 != null ? field4588[2] : field4588[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         if (arg0 > -106) {
            this.method346((class65)null, -87);
         }

         arg1.method3534((byte)85, this.field4578, this.field4582, this.field4579, this.field4580);
         ++field4576;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4588[0] + arg0 + ',' + (arg1 != null ? field4588[2] : field4588[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2508(int arg0) {
      try {
         field4585 = null;
         field4577 = null;
         if (arg0 != 29460) {
            field4577 = null;
         }

         field4583 = null;
         field4584 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4588[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2509(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2510(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
