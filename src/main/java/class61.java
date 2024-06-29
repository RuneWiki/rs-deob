import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class61 extends class684 {
   @OriginalMember(
      owner = "client!ru",
      name = "h",
      descriptor = "Lefa;"
   )
   public class436 field869;
   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field877 = new String[]{method624(method623("6v\\2-")), method624(method623("*v\u001e\u001c")), method624(method623("?-\\^x")), method624(method623("6v\\Ll*j\u0006N-")), method624(method623("6v\\1-")), method624(method623("6v\\4-")), method624(method623("6v\\3-"))};
   @OriginalMember(
      owner = "client!ru",
      name = "d",
      descriptor = "Ldb;"
   )
   public static class685 field871 = new class685(1, 3);
   @OriginalMember(
      owner = "client!ru",
      name = "g",
      descriptor = "[Ljg;"
   )
   public static class24[] field873 = null;
   @OriginalMember(
      owner = "client!ru",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field876 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!ru",
      name = "f",
      descriptor = "I"
   )
   public static int field870;
   @OriginalMember(
      owner = "client!ru",
      name = "e",
      descriptor = "I"
   )
   public static int field874;
   @OriginalMember(
      owner = "client!ru",
      name = "k",
      descriptor = "I"
   )
   public static int field875;
   @OriginalMember(
      owner = "client!ru",
      name = "j",
      descriptor = "J"
   )
   public static long field872;

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method618(int arg0, String arg1) {
      try {
         if (arg0 < 1) {
            method619((class471)null, false, true);
         }

         ++field870;
         return 2 + arg1.length();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field877[6] + arg0 + ',' + (arg1 != null ? field877[2] : field877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Ldea;ZZ)V"
   )
   public static final void method619(class471 arg0, boolean arg1, boolean arg2) {
      arg0.field6838 = arg2;
      if (class684.field9885) {
         if (arg1) {
            class164.field2483[class164.field2483.length - 1].method5102(28856, arg0);
         } else {
            int var3 = class755.method5456(arg0.field6825);
            int var4 = class674.field9449[2] * arg0.method720((byte)-83) / arg0.field6837;
            int var5 = class755.method5456(arg0.field6825 - var4);
            int var6 = class755.method5456(arg0.field6825 + var4);
            if (var5 == var6) {
               class164.field2483[var3].method5102(28856, arg0);
            } else if (var6 - var5 == 1) {
               class164.field2483[class14.field198 + var5].method5102(28856, arg0);
            } else {
               class164.field2483[class164.field2483.length - 1].method5102(28856, arg0);
            }
         }
      } else {
         class479.method3663(arg0, class729.field10383);
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method620(byte arg0) {
      try {
         field873 = null;
         field876 = null;
         int var1 = -23 / ((-50 - arg0) / 43);
         field871 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field877[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static final void method621(int arg0, int arg1, String arg2) {
      try {
         ++field874;
         class111 var3 = class796.method5734(3, (long)arg0, (byte)-104);
         if (arg1 >= -73) {
            method622(53, -59, true, (class17)null, 86, 8, -60);
         }

         var3.method1087(0);
         var3.field1736 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field877[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field877[2] : field877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IIZLha;III)V"
   )
   public static final void method622(int param0, int param1, boolean param2, class17 param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "(Laea;II[B)V"
   )
   public class61(class678 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field869 = class432.method3367(arg0, 6406, 6406, arg1, arg2, false, 3553, arg3);
         this.field869.method67(false, 89, false);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field877[3] + (arg0 != null ? field877[2] : field877[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field877[2] : field877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method623(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method624(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
