import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class545 extends class345 {
   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7896 = new String[]{method4076(method4075("<?[!\u0014")), method4076(method4075("<?[$\u0014")), method4076(method4075("<?[%\u0014")), method4076(method4075("<?[ \u0014")), method4076(method4075("<?['\u0014"))};
   @OriginalMember(
      owner = "client!ni",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7894 = false;
   @OriginalMember(
      owner = "client!ni",
      name = "n",
      descriptor = "I"
   )
   public static int field7895 = -1;
   @OriginalMember(
      owner = "client!ni",
      name = "i",
      descriptor = "I"
   )
   public static int field7892 = 0;
   @OriginalMember(
      owner = "client!ni",
      name = "m",
      descriptor = "I"
   )
   public static int field7888;
   @OriginalMember(
      owner = "client!ni",
      name = "o",
      descriptor = "I"
   )
   public static int field7889;
   @OriginalMember(
      owner = "client!ni",
      name = "p",
      descriptor = "I"
   )
   public static int field7890;
   @OriginalMember(
      owner = "client!ni",
      name = "j",
      descriptor = "I"
   )
   public static int field7891;
   @OriginalMember(
      owner = "client!ni",
      name = "k",
      descriptor = "I"
   )
   public static int field7893;

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field7889;
         if (arg0 >= -45) {
            field7892 = 60;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7896[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class545(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         ++field7891;
         if (arg1 < 99) {
            this.method53(true);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7896[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method4074(boolean arg0) {
      try {
         ++field7893;
         if (arg0) {
            this.method51(-68);
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7896[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         ++field7890;
         if (~super.field4914.method5554(-1).method1930(107) < -2) {
            return 4;
         } else {
            if (arg0) {
               this.method51(53);
            }

            return 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7896[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class545(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ni",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (super.field4913 < arg0 && ~super.field4913 < -5) {
            super.field4913 = this.method53(false);
         }

         ++field7888;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7896[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4075(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4076(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
