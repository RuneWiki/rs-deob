import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class247 extends class80 {
   @OriginalMember(
      owner = "client!ec",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3109 = new String[]{method1865(method1864("\"b\u0018NL")), method1865(method1864("\"b\u00185\r)hB7L")), method1865(method1864("\"b\u0018K%o")), method1865(method1864("\"b\u0018BL")), method1865(method1864("\"b\u0018ML")), method1865(method1864("</\u0018'\u0019")), method1865(method1864(")tZe")), method1865(method1864("\"b\u0018CL")), method1865(method1864("\"b\u0018LL")), method1865(method1864("\"b\u0018L%o")), method1865(method1864("\"b\u0018J%o"))};
   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "Lro;"
   )
   public static class2 field3097 = new class2(0);
   @OriginalMember(
      owner = "client!ec",
      name = "B",
      descriptor = "Lo;"
   )
   public static class31 field3105 = new class31(11, 3);
   @OriginalMember(
      owner = "client!ec",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field3106 = new int[14];
   @OriginalMember(
      owner = "client!ec",
      name = "G",
      descriptor = "I"
   )
   public static int field3098;
   @OriginalMember(
      owner = "client!ec",
      name = "y",
      descriptor = "I"
   )
   public static int field3100;
   @OriginalMember(
      owner = "client!ec",
      name = "x",
      descriptor = "I"
   )
   public static int field3101;
   @OriginalMember(
      owner = "client!ec",
      name = "A",
      descriptor = "I"
   )
   public static int field3102;
   @OriginalMember(
      owner = "client!ec",
      name = "F",
      descriptor = "I"
   )
   public static int field3103;
   @OriginalMember(
      owner = "client!ec",
      name = "w",
      descriptor = "I"
   )
   public static int field3104;
   @OriginalMember(
      owner = "client!ec",
      name = "E",
      descriptor = "I"
   )
   public static int field3107;
   @OriginalMember(
      owner = "client!ec",
      name = "C",
      descriptor = "I"
   )
   public static int field3108;
   @OriginalMember(
      owner = "client!ec",
      name = "v",
      descriptor = "[Lifa;"
   )
   public static class453[] field3099;

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1861(int arg0) {
      try {
         field3106 = null;
         if (arg0 != 0) {
            field3108 = 1;
         }

         field3099 = null;
         field3097 = null;
         field3105 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3109[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method768(int arg0) {
      try {
         if (arg0 <= 110) {
            this.method401((class127[])null, 61);
         }

         ++field3100;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3109[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(ILu;IIZILha;)V"
   )
   public final void method783(int arg0, class80 arg1, int arg2, int arg3, boolean arg4, int arg5, class65 arg6) {
      try {
         if (arg3 != -1) {
            field3106 = null;
         }

         ++field3104;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3109[7] + arg0 + ',' + (arg1 != null ? field3109[5] : field3109[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3109[5] : field3109[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class247(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field1001 = (byte)arg3;
         super.field1003 = arg2;
         super.field998 = arg1;
         super.field1005 = (byte)arg4;
         super.field999 = arg0;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3109[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1862() {
      for(int var0 = 0; var0 < class450.field6222; ++var0) {
         class47 var1 = class422.field5939[var0];
         class367.method2835(var1, true);
         class422.field5939[var0] = null;
      }

      class450.field6222 = 0;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method1863(int arg0, int arg1, boolean arg2) {
      try {
         ++field3102;
         if (!arg2) {
            method1862();
         }

         return (2048 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3109[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public final int method401(class127[] arg0, int arg1) {
      try {
         if (arg1 != 1) {
            field3108 = -14;
         }

         ++field3098;
         return this.method781(arg0, super.field999 >> class76.field965, (byte)-18, super.field1003 >> class76.field965);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3109[10] + (arg0 != null ? field3109[5] : field3109[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method771(int arg0) {
      try {
         if (arg0 < 24) {
            field3105 = null;
         }

         ++field3103;
         return false;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3109[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method397(int arg0) {
      try {
         if (arg0 != 0) {
            method1863(35, -17, false);
         }

         ++field3101;
         return class426.field5961[(super.field999 >> class76.field965) + -class367.field5174 - -class224.field2812][(super.field1003 >> class76.field965) + -class406.field5720 + class224.field2812];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3109[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method402(boolean arg0, class65 arg1) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field3107;
            class752 var3 = class576.method4143(super.field1001, super.field999 >> class76.field965, super.field1003 >> class76.field965);
            return var3 != null && var3.field10922.field542 ? class239.method1794(super.field1001, super.field999 >> class76.field965, var3.field10922.method782(119) - -this.method782(115), super.field1003 >> class76.field965, -14401) : class486.method3534(super.field999 >> class76.field965, super.field1003 >> class76.field965, -17319, super.field1001);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3109[9] + arg0 + ',' + (arg1 != null ? field3109[5] : field3109[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1864(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1865(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
