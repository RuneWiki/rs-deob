import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class251 extends class315 {
   @OriginalMember(
      owner = "client!ui",
      name = "m",
      descriptor = "I"
   )
   private int field3824;
   @OriginalMember(
      owner = "client!ui",
      name = "h",
      descriptor = "I"
   )
   private int field3827;
   @OriginalMember(
      owner = "client!ui",
      name = "i",
      descriptor = "I"
   )
   private int field3822;
   @OriginalMember(
      owner = "client!ui",
      name = "k",
      descriptor = "I"
   )
   private int field3828;
   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3830 = new String[]{method2162(method2161("@?Y\u001f\u0007")), method2162(method2161("@?Y\u001a\u0007")), method2162(method2161("@?Y\u001d\u0007")), method2162(method2161("@?Y`F[?\u0003b\u0007")), method2162(method2161("@?Y\u001e\u0007"))};
   @OriginalMember(
      owner = "client!ui",
      name = "l",
      descriptor = "[Lsh;"
   )
   public static class207[] field3821 = new class207[37];
   @OriginalMember(
      owner = "client!ui",
      name = "o",
      descriptor = "I"
   )
   public static int field3823;
   @OriginalMember(
      owner = "client!ui",
      name = "p",
      descriptor = "I"
   )
   public static int field3826;
   @OriginalMember(
      owner = "client!ui",
      name = "j",
      descriptor = "I"
   )
   public static int field3829;
   @OriginalMember(
      owner = "client!ui",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field3825;

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method1883(int arg0, int arg1, boolean arg2) {
      try {
         ++field3829;
         int var4 = this.field3824 * arg1 >> 12;
         int var5 = this.field3822 * arg1 >> 12;
         int var6 = this.field3827 * arg0 >> 12;
         int var7 = this.field3828 * arg0 >> 12;
         class781.method5642(var4, var7, var6, var5, super.field4717, 8849, super.field4718, super.field4715);
         if (arg2) {
            field3825 = null;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3830[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field3824 = arg0;
         this.field3827 = arg1;
         this.field3822 = arg2;
         this.field3828 = arg3;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3830[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1887(int arg0, int arg1, int arg2) {
      try {
         ++field3826;
         if (arg0 != -1) {
            this.method1883(114, 17, true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3830[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1886(byte arg0, int arg1, int arg2) {
      try {
         ++field3823;
         int var4 = this.field3824 * arg1 >> 12;
         int var5 = this.field3822 * arg1 >> 12;
         int var6 = this.field3827 * arg2 >> 12;
         if (arg0 >= -114) {
            field3821 = null;
         }

         int var7 = this.field3828 * arg2 >> 12;
         class556.method4144(var6, (byte)-66, var5, super.field4718, var4, var7);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field3830[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2160(byte arg0) {
      try {
         field3821 = null;
         if (arg0 < 45) {
            method2160((byte)42);
         }

         field3825 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3830[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2161(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2162(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
