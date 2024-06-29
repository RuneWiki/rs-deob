import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class615 extends class22 {
   @OriginalMember(
      owner = "client!vs",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8948 = new String[]{method4516(method4515("?>\u001ev-")), method4516(method4515("?>\u001eu-"))};
   @OriginalMember(
      owner = "client!vs",
      name = "q",
      descriptor = "I"
   )
   public static int field8937 = 1407;
   @OriginalMember(
      owner = "client!vs",
      name = "y",
      descriptor = "I"
   )
   public int field8923;
   @OriginalMember(
      owner = "client!vs",
      name = "v",
      descriptor = "I"
   )
   public int field8924;
   @OriginalMember(
      owner = "client!vs",
      name = "j",
      descriptor = "I"
   )
   public int field8925;
   @OriginalMember(
      owner = "client!vs",
      name = "H",
      descriptor = "I"
   )
   public int field8926;
   @OriginalMember(
      owner = "client!vs",
      name = "m",
      descriptor = "I"
   )
   public int field8927;
   @OriginalMember(
      owner = "client!vs",
      name = "F",
      descriptor = "I"
   )
   public int field8928;
   @OriginalMember(
      owner = "client!vs",
      name = "r",
      descriptor = "I"
   )
   public int field8929;
   @OriginalMember(
      owner = "client!vs",
      name = "w",
      descriptor = "I"
   )
   public int field8930;
   @OriginalMember(
      owner = "client!vs",
      name = "s",
      descriptor = "I"
   )
   public int field8932;
   @OriginalMember(
      owner = "client!vs",
      name = "t",
      descriptor = "I"
   )
   public int field8933;
   @OriginalMember(
      owner = "client!vs",
      name = "l",
      descriptor = "I"
   )
   public int field8934;
   @OriginalMember(
      owner = "client!vs",
      name = "n",
      descriptor = "I"
   )
   public int field8935;
   @OriginalMember(
      owner = "client!vs",
      name = "B",
      descriptor = "I"
   )
   public int field8936;
   @OriginalMember(
      owner = "client!vs",
      name = "x",
      descriptor = "I"
   )
   public static int field8939;
   @OriginalMember(
      owner = "client!vs",
      name = "C",
      descriptor = "I"
   )
   public int field8940;
   @OriginalMember(
      owner = "client!vs",
      name = "G",
      descriptor = "I"
   )
   public int field8941;
   @OriginalMember(
      owner = "client!vs",
      name = "p",
      descriptor = "I"
   )
   public int field8944;
   @OriginalMember(
      owner = "client!vs",
      name = "A",
      descriptor = "I"
   )
   public static int field8945;
   @OriginalMember(
      owner = "client!vs",
      name = "k",
      descriptor = "I"
   )
   public int field8946;
   @OriginalMember(
      owner = "client!vs",
      name = "D",
      descriptor = "I"
   )
   public static int field8947;
   @OriginalMember(
      owner = "client!vs",
      name = "E",
      descriptor = "Lri;"
   )
   public class122 field8938;
   @OriginalMember(
      owner = "client!vs",
      name = "u",
      descriptor = "Lrt;"
   )
   public class237 field8942;
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "Lnea;"
   )
   public class742 field8943;
   @OriginalMember(
      owner = "client!vs",
      name = "o",
      descriptor = "Ldr;"
   )
   public class749 field8931;

   @OriginalMember(
      owner = "client!vs",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method4512(boolean arg0) {
      try {
         if (!arg0) {
            field8945 = -25;
         }

         this.field8942 = null;
         this.field8943 = null;
         this.field8931 = null;
         this.field8938 = null;
         ++field8947;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8948[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4513(byte arg0) {
      boolean var1 = client.field4564;

      try {
         class504.field7338 = 0;
         class663.field9648 = 0;
         ++field8939;
         if (arg0 < -9) {
            int var2 = 0;
            if (var1 || class124.field2039 > var2) {
               do {
                  int var3 = class547.field7911 * var2;
                  int var4 = 0;
                  if (var1 || ~class547.field7911 < ~var4) {
                     do {
                        int var5 = var3 + var4;
                        class80.field1360[var5].method4466(class438.field6324 * var4, class335.field4788 * var2, class438.field6324, class335.field4788, 0, 0, true, true);
                        ++var4;
                     } while(~class547.field7911 < ~var4);
                  }

                  ++var2;
               } while(class124.field2039 > var2);

            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8948[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(III)Lmn;"
   )
   public static final class383 method4514(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      return var3 == null ? null : var3.field8658;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4515(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4516(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
