import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class645 extends class393 {
   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9674 = new String[]{method4748(method4747("z\u0010R9~")), method4748(method4747("z\u0010R5~")), method4748(method4747("z\u0010R;~")), method4748(method4747("p\u0011\u0010\u001e")), method4748(method4747("z\u0010R8~")), method4748(method4747("eJR\\+")), method4748(method4747("z\u0010R7~")), method4748(method4747("z\u0010R1~"))};
   @OriginalMember(
      owner = "client!dt",
      name = "k",
      descriptor = "I"
   )
   public static int field9669 = 0;
   @OriginalMember(
      owner = "client!dt",
      name = "p",
      descriptor = "I"
   )
   public static int field9667;
   @OriginalMember(
      owner = "client!dt",
      name = "l",
      descriptor = "I"
   )
   public static int field9668;
   @OriginalMember(
      owner = "client!dt",
      name = "o",
      descriptor = "I"
   )
   public static int field9670;
   @OriginalMember(
      owner = "client!dt",
      name = "m",
      descriptor = "I"
   )
   public static int field9671;
   @OriginalMember(
      owner = "client!dt",
      name = "j",
      descriptor = "I"
   )
   public static int field9672;
   @OriginalMember(
      owner = "client!dt",
      name = "n",
      descriptor = "I"
   )
   public static int field9673;

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         if (arg0) {
            this.method1457((byte)-119);
         }

         ++field9667;
         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9674[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class645(class281 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         if (arg1 >= 84) {
            ++field9668;
            super.field5438.method2265(arg0, (byte)-90);
            super.field5438.method2240(-4, arg2);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9674[4] + (arg0 != null ? field9674[5] : field9674[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         if (arg0 != 29404) {
            field9669 = 38;
         }

         ++field9670;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9674[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      try {
         int var2 = -125 % ((22 - arg0) / 63);
         ++field9673;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9674[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 7313) {
            field9669 = -36;
         }

         ++field9671;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9674[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      try {
         ++field9672;
         if (arg1 != 32) {
            field9669 = 59;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9674[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
