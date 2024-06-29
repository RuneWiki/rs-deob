import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class373 extends class67 {
   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5776 = new String[]{method3045(method3044("\"2|o\u001f")), method3045(method3044("\"2|m\u001f")), method3045(method3044("\"2|j\u001f")), method3045(method3044("\"2|`\u001f")), method3045(method3044("\"2|k\u001f")), method3045(method3044("\"2|i\u001f")), method3045(method3044("\"2|l\u001f"))};
   @OriginalMember(
      owner = "client!vr",
      name = "k",
      descriptor = "Luk;"
   )
   public static class498 field5767 = new class498(19, -1);
   @OriginalMember(
      owner = "client!vr",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field5769 = new int[1];
   @OriginalMember(
      owner = "client!vr",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field5773 = false;
   @OriginalMember(
      owner = "client!vr",
      name = "s",
      descriptor = "I"
   )
   public static int field5768;
   @OriginalMember(
      owner = "client!vr",
      name = "r",
      descriptor = "I"
   )
   public static int field5770;
   @OriginalMember(
      owner = "client!vr",
      name = "o",
      descriptor = "I"
   )
   public static int field5771;
   @OriginalMember(
      owner = "client!vr",
      name = "l",
      descriptor = "I"
   )
   public static int field5772;
   @OriginalMember(
      owner = "client!vr",
      name = "m",
      descriptor = "I"
   )
   public static int field5774;
   @OriginalMember(
      owner = "client!vr",
      name = "n",
      descriptor = "I"
   )
   public static int field5775;

   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3041(int arg0, int arg1) {
      try {
         int var2 = -28 % ((arg1 - -11) / 59);
         ++field5772;
         if (class225.method1954(-110)) {
            if (class727.field10854 != arg0) {
               class654.field9782 = "";
            }

            class727.field10854 = arg0;
            class510.field7800.method204((byte)119);
            class69.method532(1, 5);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5776[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class373(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field5773 = false;
         }

         ++field5770;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5776[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (~super.field877 > -1 || ~super.field877 < -5) {
            super.field877 = this.method162(0);
         }

         if (arg0 == -69) {
            ++field5774;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5776[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         ++field5768;
         if (!arg1) {
            field5773 = false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5776[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class373(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!vr",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method3042(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -29;
         } else {
            ++field5775;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3043(int arg0) {
      try {
         field5767 = null;
         if (arg0 != -6498) {
            field5769 = null;
         }

         field5769 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5776[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            this.method165(-77, true);
         }

         ++field5771;
         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5776[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3044(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3045(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
