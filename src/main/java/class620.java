import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class620 extends class426 {
   @OriginalMember(
      owner = "client!ot",
      name = "r",
      descriptor = "I"
   )
   private int field8663;
   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "I"
   )
   private int field8671;
   @OriginalMember(
      owner = "client!ot",
      name = "i",
      descriptor = "I"
   )
   private int field8660;
   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "I"
   )
   private int field8666;
   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8673 = new String[]{method4514(method4513("\u0019X(>M")), method4514(method4513("\u0019X(?M")), method4514(method4513("\u0019X(8M")), method4514(method4513("\u0019X(G\f\u0018ErEM")), method4514(method4513("\u0019X(:M")), method4514(method4513("\u0019X(9M"))};
   @OriginalMember(
      owner = "client!ot",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field8667 = new int[4096];
   @OriginalMember(
      owner = "client!ot",
      name = "q",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8669 = new String[]{method4514(method4513("<Mh")), method4514(method4513("0Id")), method4514(method4513(";Mt")), method4514(method4513("7\\t")), method4514(method4513(";M\u007f")), method4514(method4513("<Yh")), method4514(method4513("<Yj")), method4514(method4513("7Ya")), method4514(method4513("%Iv")), method4514(method4513("9Or")), method4514(method4513("8Cp")), method4514(method4513("2Ie"))};
   @OriginalMember(
      owner = "client!ot",
      name = "n",
      descriptor = "F"
   )
   public static float field8661;
   @OriginalMember(
      owner = "client!ot",
      name = "m",
      descriptor = "I"
   )
   public static int field8664;
   @OriginalMember(
      owner = "client!ot",
      name = "k",
      descriptor = "I"
   )
   public static int field8665;
   @OriginalMember(
      owner = "client!ot",
      name = "o",
      descriptor = "I"
   )
   public static int field8668;
   @OriginalMember(
      owner = "client!ot",
      name = "p",
      descriptor = "I"
   )
   public static int field8670;
   @OriginalMember(
      owner = "client!ot",
      name = "l",
      descriptor = "I"
   )
   public static int field8672;
   @OriginalMember(
      owner = "client!ot",
      name = "j",
      descriptor = "Lrq;"
   )
   public static class372 field8662;

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method2689(int arg0, int arg1, byte arg2) {
      try {
         ++field8665;
         int var4 = this.field8666 * arg0 >> 12;
         int var5 = this.field8671 * arg0 >> 12;
         int var6 = this.field8660 * arg1 >> 12;
         if (arg2 != 109) {
            this.field8671 = -73;
         }

         int var7 = this.field8663 * arg1 >> 12;
         class446.method3308(super.field5959, -27647, var7, var6, var4, super.field5957, var5);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8673[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4511(int arg0) {
      try {
         field8662 = null;
         if (arg0 != 0) {
            field8661 = -0.5414457F;
         }

         field8667 = null;
         field8669 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8673[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4512(int arg0) {
      try {
         ++field8670;
         int var1 = 52 / ((-19 - arg0) / 33);
         int var2 = 0;
         if (class674.field9907 != null) {
            var2 = class674.field9907.field8437.method3800((byte)-62);
         }

         if (var2 == 2) {
            int var3 = ~class682.field10003 >= -801 ? class682.field10003 : 800;
            class252.field3194 = var3;
            class322.field4298 = (-var3 + class682.field10003) / 2;
            int var4 = class434.field6038 <= 600 ? class434.field6038 : 600;
            class41.field479 = var4;
            class682.field10009 = 0;
         } else if (~var2 == -2) {
            int var5 = class682.field10003 <= 1024 ? class682.field10003 : 1024;
            class322.field4298 = (-var5 + class682.field10003) / 2;
            int var6 = ~class434.field6038 >= -769 ? class434.field6038 : 768;
            class252.field3194 = var5;
            class41.field479 = var6;
            class682.field10009 = 0;
         } else {
            class41.field479 = class434.field6038;
            class682.field10009 = 0;
            class322.field4298 = 0;
            class252.field3194 = class682.field10003;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8673[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2688(byte arg0, int arg1, int arg2) {
      try {
         ++field8664;
         int var4 = this.field8666 * arg1 >> 12;
         int var5 = this.field8671 * arg1 >> 12;
         int var6 = this.field8660 * arg2 >> 12;
         if (arg0 != 41) {
            field8662 = null;
         }

         int var7 = this.field8663 * arg2 >> 12;
         class401.method3028(var7, var4, var5, -1, super.field5958, var6);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8673[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2691(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 553) {
            this.method2689(91, 15, (byte)93);
         }

         ++field8672;
         int var4 = this.field8666 * arg1 >> 12;
         int var5 = this.field8671 * arg1 >> 12;
         int var6 = this.field8660 * arg0 >> 12;
         int var7 = this.field8663 * arg0 >> 12;
         class666.method4819(super.field5957, var6, var5, (byte)-96, super.field5959, var7, super.field5958, var4);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8673[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field8663 = arg3;
         this.field8671 = arg2;
         this.field8660 = arg1;
         this.field8666 = arg0;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8673[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4514(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
