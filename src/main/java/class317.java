import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class317 extends class247 {
   @OriginalMember(
      owner = "client!hea",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4755 = new String[]{method2573(method2572("~?\nDm>")), method2573(method2572("~?\nDn>")), method2573(method2572("~?\nDo>"))};
   @OriginalMember(
      owner = "client!hea",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field4742 = false;
   @OriginalMember(
      owner = "client!hea",
      name = "l",
      descriptor = "[[Z"
   )
   public static boolean[][] field4728 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!hea",
      name = "p",
      descriptor = "I"
   )
   public static int field4734 = 0;
   @OriginalMember(
      owner = "client!hea",
      name = "r",
      descriptor = "Lsr;"
   )
   public static class78 field4744 = new class78(3);
   @OriginalMember(
      owner = "client!hea",
      name = "q",
      descriptor = "I"
   )
   public int field4729;
   @OriginalMember(
      owner = "client!hea",
      name = "y",
      descriptor = "I"
   )
   public static int field4730;
   @OriginalMember(
      owner = "client!hea",
      name = "J",
      descriptor = "I"
   )
   public int field4731;
   @OriginalMember(
      owner = "client!hea",
      name = "C",
      descriptor = "I"
   )
   public int field4732;
   @OriginalMember(
      owner = "client!hea",
      name = "H",
      descriptor = "I"
   )
   public int field4733;
   @OriginalMember(
      owner = "client!hea",
      name = "w",
      descriptor = "I"
   )
   public int field4735;
   @OriginalMember(
      owner = "client!hea",
      name = "s",
      descriptor = "I"
   )
   public int field4737;
   @OriginalMember(
      owner = "client!hea",
      name = "B",
      descriptor = "I"
   )
   public int field4738;
   @OriginalMember(
      owner = "client!hea",
      name = "A",
      descriptor = "I"
   )
   public static int field4741;
   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "I"
   )
   public int field4743;
   @OriginalMember(
      owner = "client!hea",
      name = "E",
      descriptor = "I"
   )
   public int field4745;
   @OriginalMember(
      owner = "client!hea",
      name = "F",
      descriptor = "I"
   )
   public int field4746;
   @OriginalMember(
      owner = "client!hea",
      name = "u",
      descriptor = "I"
   )
   public int field4747;
   @OriginalMember(
      owner = "client!hea",
      name = "m",
      descriptor = "I"
   )
   public int field4749;
   @OriginalMember(
      owner = "client!hea",
      name = "n",
      descriptor = "I"
   )
   public int field4750;
   @OriginalMember(
      owner = "client!hea",
      name = "x",
      descriptor = "I"
   )
   public int field4751;
   @OriginalMember(
      owner = "client!hea",
      name = "j",
      descriptor = "I"
   )
   public int field4752;
   @OriginalMember(
      owner = "client!hea",
      name = "o",
      descriptor = "I"
   )
   public int field4753;
   @OriginalMember(
      owner = "client!hea",
      name = "D",
      descriptor = "I"
   )
   public int field4754;
   @OriginalMember(
      owner = "client!hea",
      name = "G",
      descriptor = "Lum;"
   )
   public class23 field4740;
   @OriginalMember(
      owner = "client!hea",
      name = "I",
      descriptor = "Lcba;"
   )
   public class254 field4748;
   @OriginalMember(
      owner = "client!hea",
      name = "k",
      descriptor = "Lqb;"
   )
   public class291 field4739;
   @OriginalMember(
      owner = "client!hea",
      name = "v",
      descriptor = "Laia;"
   )
   public class301 field4736;

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2569(int arg0) {
      try {
         if (arg0 != 3) {
            field4742 = false;
         }

         field4744 = null;
         field4728 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4755[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2570(int arg0) {
      try {
         if (arg0 <= 43) {
            field4744 = null;
         }

         ++field4730;
         return class556.field7901 == null ? 0 : class556.field7901.length * 2;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4755[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2571(byte arg0) {
      try {
         this.field4736 = null;
         ++field4741;
         this.field4740 = null;
         if (arg0 != -71) {
            this.field4729 = -70;
         }

         this.field4748 = null;
         this.field4739 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4755[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
