import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class352 extends class588 {
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4985 = new String[]{method2710(method2709("E\td-H")), method2710(method2709("E\td+H")), method2710(method2709("D\u0012&\u0005")), method2710(method2709("QIdG\u001d")), method2710(method2709("E\td(H")), method2710(method2709("E\td!H")), method2710(method2709("E\td,H"))};
   @OriginalMember(
      owner = "client!on",
      name = "w",
      descriptor = "I"
   )
   public static int field4977;
   @OriginalMember(
      owner = "client!on",
      name = "q",
      descriptor = "I"
   )
   public static int field4980;
   @OriginalMember(
      owner = "client!on",
      name = "t",
      descriptor = "I"
   )
   public static int field4981;
   @OriginalMember(
      owner = "client!on",
      name = "v",
      descriptor = "I"
   )
   private int field4982;
   @OriginalMember(
      owner = "client!on",
      name = "u",
      descriptor = "I"
   )
   public static int field4983;
   @OriginalMember(
      owner = "client!on",
      name = "s",
      descriptor = "I"
   )
   public static int field4984;
   @OriginalMember(
      owner = "client!on",
      name = "p",
      descriptor = "J"
   )
   private long field4978;
   @OriginalMember(
      owner = "client!on",
      name = "r",
      descriptor = "[[[I"
   )
   public static int[][][] field4979;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2705(int arg0, int arg1) {
      return class544.field7886 != null ? class544.field7886[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         ++field4983;
         this.field4982 = arg1.method3567(31871);
         int var3 = -113 % ((-26 - arg0) / 33);
         this.field4978 = arg1.method3523(-126);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4985[5] + arg0 + ',' + (arg1 != null ? field4985[3] : field4985[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "e",
      descriptor = "(I)[I"
   )
   public static final int[] method2706(int arg0) {
      try {
         if (arg0 != 9) {
            method2706(-31);
         }

         ++field4984;
         return new int[]{class550.field7946, class422.field6146, class247.field3558};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4985[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2707(int arg0) {
      try {
         field4979 = null;
         if (arg0 <= 56) {
            field4979 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4985[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5623(90, this.field4982, this.field4978);
         if (arg1 > -120) {
            field4979 = null;
         }

         ++field4981;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4985[1] + (arg0 != null ? field4985[3] : field4985[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method2708(int arg0) {
      try {
         ++field4980;
         if (~class376.field5588 != -4) {
            return false;
         } else if (arg0 < 39) {
            return false;
         } else {
            return ~class241.field3483 == -1 && class487.field7080 == 0;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4985[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2709(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2710(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
