import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class188 extends class471 {
   @OriginalMember(
      owner = "client!ft",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2780 = new String[]{method1687(method1686("\u000f^+V\u001e")), method1687(method1686("\u0007_i~")), method1687(method1686("\u0012\u0004+<K")), method1687(method1686("\u000f^+S\u001e")), method1687(method1686("\u000f^+P\u001e")), method1687(method1686("\u000f^+._\u0007Cq,\u001e")), method1687(method1686("\u000f^+W\u001e")), method1687(method1686("\u000f^+[\u001e")), method1687(method1686("\u000f^+Q\u001e")), method1687(method1686("\u000f^+Z\u001e")), method1687(method1686("\u000f^+U\u001e")), method1687(method1686("\u000f^+T\u001e"))};
   @OriginalMember(
      owner = "client!ft",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field2772 = new int[8];
   @OriginalMember(
      owner = "client!ft",
      name = "O",
      descriptor = "I"
   )
   public static int field2770;
   @OriginalMember(
      owner = "client!ft",
      name = "E",
      descriptor = "I"
   )
   public static int field2771;
   @OriginalMember(
      owner = "client!ft",
      name = "I",
      descriptor = "I"
   )
   public static int field2773;
   @OriginalMember(
      owner = "client!ft",
      name = "N",
      descriptor = "I"
   )
   public static int field2774;
   @OriginalMember(
      owner = "client!ft",
      name = "K",
      descriptor = "I"
   )
   public static int field2775;
   @OriginalMember(
      owner = "client!ft",
      name = "L",
      descriptor = "I"
   )
   public static int field2776;
   @OriginalMember(
      owner = "client!ft",
      name = "H",
      descriptor = "I"
   )
   public static int field2777;
   @OriginalMember(
      owner = "client!ft",
      name = "M",
      descriptor = "I"
   )
   public static int field2778;
   @OriginalMember(
      owner = "client!ft",
      name = "J",
      descriptor = "I"
   )
   public static int field2779;

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1680(int arg0, int arg1) {
      try {
         ++field2779;
         class111 var2 = class796.method5734(arg0, (long)arg1, (byte)-120);
         var2.method1083(-62);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2780[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public final int method1681(byte arg0, class757[] arg1) {
      try {
         if (arg0 != 39) {
            this.method1685(-117);
         }

         ++field2777;
         return this.method3610(arg1, super.field6833 >> class313.field4707, 32764, super.field6832 >> class313.field4707);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2780[6] + arg0 + ',' + (arg1 != null ? field2780[2] : field2780[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public final boolean method1682(class17 arg0, int arg1) {
      try {
         if (arg1 != 1) {
            this.method719(103, (class471)null, -76, false, (class17)null, 24, 80);
         }

         ++field2776;
         class84 var3 = class40.method476(super.field6824, super.field6832 >> class313.field4707, super.field6833 >> class313.field4707);
         return var3 != null && var3.field1299.field8163 ? class730.method5291(var3.field1299.method728(arg1 + -1) - -this.method728(0), super.field6832 >> class313.field4707, super.field6833 >> class313.field4707, false, super.field6824) : class767.method5521(super.field6832 >> class313.field4707, (byte)-78, super.field6824, super.field6833 >> class313.field4707);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2780[0] + (arg0 != null ? field2780[2] : field2780[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method1683(int arg0, boolean arg1, String arg2, String arg3) {
      try {
         ++field2775;
         if (arg3.length() <= 320) {
            if (class613.method4509(119)) {
               class261.method2247(-101);
               class585.field8203 = arg0;
               class492.field7022 = arg2;
               class226.field3216 = arg3;
               class755.method5457(6, false);
               if (!arg1) {
                  method1683(-19, false, (String)null, (String)null);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2780[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2780[2] : field2780[1]) + ',' + (arg3 != null ? field2780[2] : field2780[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method731(int arg0) {
      try {
         ++field2778;
         if (arg0 != 255) {
            field2771 = 99;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2780[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method735(int arg0) {
      try {
         ++field2770;
         int var2 = 5 % ((arg0 - -5) / 62);
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2780[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1684(byte arg0) {
      try {
         field2772 = null;
         if (arg0 != 55) {
            method1683(-41, false, (String)null, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2780[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(ILdea;IZLha;II)V"
   )
   public final void method719(int arg0, class471 arg1, int arg2, boolean arg3, class17 arg4, int arg5, int arg6) {
      try {
         ++field2774;
         if (arg6 == 0) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2780[11] + arg0 + ',' + (arg1 != null ? field2780[2] : field2780[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2780[2] : field2780[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class188(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field6832 = arg0;
         super.field6824 = (byte)arg3;
         super.field6826 = (byte)arg4;
         super.field6833 = arg2;
         super.field6829 = arg1;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2780[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1685(int arg0) {
      try {
         ++field2773;
         return arg0 != -1 ? false : class232.field3602[(super.field6832 >> class313.field4707) + -class507.field7207 + class15.field214][(super.field6833 >> class313.field4707) - -class15.field214 + -class477.field6876];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2780[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1686(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1687(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
