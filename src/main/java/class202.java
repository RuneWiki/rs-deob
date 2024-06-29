import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class202 extends class465 {
   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2546 = new String[]{method1557(method1556("Pu\u0005\u0015")), method1557(method1556("Pu\u0007\u0015")), method1557(method1556("Pu\u0006\u0015")), method1557(method1556("Pu\u0004\u0015")), method1557(method1556("Pu\u0001\u0015")), method1557(method1556("Pu\u0003\u0015")), method1557(method1556("Pu\u0000\u0015"))};
   @OriginalMember(
      owner = "client!m",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field2543 = false;
   @OriginalMember(
      owner = "client!m",
      name = "l",
      descriptor = "I"
   )
   public static int field2537 = -1;
   @OriginalMember(
      owner = "client!m",
      name = "n",
      descriptor = "I"
   )
   public static int field2538;
   @OriginalMember(
      owner = "client!m",
      name = "i",
      descriptor = "I"
   )
   public static int field2539;
   @OriginalMember(
      owner = "client!m",
      name = "m",
      descriptor = "I"
   )
   public static int field2540;
   @OriginalMember(
      owner = "client!m",
      name = "j",
      descriptor = "I"
   )
   public static int field2541;
   @OriginalMember(
      owner = "client!m",
      name = "f",
      descriptor = "I"
   )
   public static int field2542;
   @OriginalMember(
      owner = "client!m",
      name = "h",
      descriptor = "I"
   )
   public static int field2544;
   @OriginalMember(
      owner = "client!m",
      name = "g",
      descriptor = "I"
   )
   public static int field2545;

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         ++field2540;
         if (arg0 != 16726277) {
            this.method1554(false);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2546[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class202(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1553(byte arg0) {
      try {
         if (arg0 != -69) {
            method1553((byte)33);
         }

         ++field2545;
         class298.field4137.method5445(697465426);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2546[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class202(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 26 % ((arg1 - -51) / 60);
         ++field2542;
         return arg0 != 0 && ~super.field6980.field9451.method3262(90) != -2 ? 2 : 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2546[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         super.field6984 = arg1;
         if (arg0 != -14812) {
            field2537 = 106;
         }

         ++field2544;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2546[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         ++field2541;
         if (super.field6984 != 0 && super.field6980.field9451.method3262(97) != 1) {
            super.field6984 = 0;
         }

         if (super.field6984 < 0 || ~super.field6984 < -2) {
            super.field6984 = this.method78(16726277);
         }

         if (arg0) {
            field2543 = false;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2546[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method1554(boolean arg0) {
      try {
         ++field2538;
         return arg0 ? true : true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2546[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1555(int arg0) {
      try {
         if (arg0 <= 81) {
            return 3;
         } else {
            ++field2539;
            return super.field6984;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2546[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1556(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1557(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
