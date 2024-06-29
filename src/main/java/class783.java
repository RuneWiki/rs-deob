import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class783 extends class313 {
   @OriginalMember(
      owner = "client!fja",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11420 = new String[]{method5631(method5630("V-gZf\u0018")), method5631(method5630("V-gZg\u0018")), method5631(method5630("V-gZ`\u0018")), method5631(method5630("Ki(Z_")), method5631(method5630("V-gZc\u0018")), method5631(method5630("^2j\u0018")), method5631(method5630("V-gZa\u0018"))};
   @OriginalMember(
      owner = "client!fja",
      name = "J",
      descriptor = "Lsda;"
   )
   public static class269 field11414 = new class269(37, 8);
   @OriginalMember(
      owner = "client!fja",
      name = "L",
      descriptor = "Lhn;"
   )
   public static class751 field11418 = new class751(13, 7);
   @OriginalMember(
      owner = "client!fja",
      name = "O",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field11419 = new String[][]{{method5631(method5630("z&h")), method5631(method5630("v\"d")), method5631(method5630("}&t")), method5631(method5630("q7t")), method5631(method5630("}&\u007f")), method5631(method5630("z2h")), method5631(method5630("z2j")), method5631(method5630("q2a")), method5631(method5630("c\"v")), method5631(method5630("\u007f$r")), method5631(method5630("~(p")), method5631(method5630("t\"e"))}, {method5631(method5630("z&h")), method5631(method5630("v\"d")), method5631(method5630("}£t")), method5631(method5630("q7t")), method5631(method5630("}&o")), method5631(method5630("z2h")), method5631(method5630("z2j")), method5631(method5630("q2a")), method5631(method5630("c\"v")), method5631(method5630("\u007f,r")), method5631(method5630("~(p")), method5631(method5630("t\"|"))}, {method5631(method5630("Z&h")), method5631(method5630("V®p")), method5631(method5630("]&t\u0007")), method5631(method5630("Q1t")), method5631(method5630("]&o")), method5631(method5630("Z2o\u001a")), method5631(method5630("Z2o\u0018")), method5631(method5630("Q(ý\u0000")), method5631(method5630("C\"v\u0000")), method5631(method5630("_$r")), method5631(method5630("^(p")), method5631(method5630("T®e"))}, {method5631(method5630("Z&h")), method5631(method5630("V\"p")), method5631(method5630("]&t")), method5631(method5630("Q%t")), method5631(method5630("]&o")), method5631(method5630("Z2h")), method5631(method5630("Z2j")), method5631(method5630("Q i")), method5631(method5630("C\"r")), method5631(method5630("_2r")), method5631(method5630("^(p")), method5631(method5630("T\"|"))}, {method5631(method5630("Z&h")), method5631(method5630("V\"d")), method5631(method5630("]5r")), method5631(method5630("Q7t")), method5631(method5630("]\"o")), method5631(method5630("Z2h")), method5631(method5630("Z2j")), method5631(method5630("Q2a")), method5631(method5630("C\"v")), method5631(method5630("_,r")), method5631(method5630("^(p")), method5631(method5630("T\"e"))}};
   @OriginalMember(
      owner = "client!fja",
      name = "M",
      descriptor = "I"
   )
   public static int field11412;
   @OriginalMember(
      owner = "client!fja",
      name = "H",
      descriptor = "I"
   )
   public static int field11413;
   @OriginalMember(
      owner = "client!fja",
      name = "K",
      descriptor = "I"
   )
   public static int field11415;
   @OriginalMember(
      owner = "client!fja",
      name = "N",
      descriptor = "I"
   )
   public static int field11417;
   @OriginalMember(
      owner = "client!fja",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field11416;

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Lhv;ZI)V"
   )
   public static final void method5626(class544 arg0, boolean arg1, int arg2) {
      try {
         ++field11412;
         int var3 = ~arg0.field8028 != -1 ? arg0.field8028 : arg0.field7986;
         int var4 = ~arg0.field7971 == -1 ? arg0.field7954 : arg0.field7971;
         class553.method4091(false, arg0.field8054, var3, arg1, var4, class136.field1744[arg0.field8054 >> 16]);
         if (arg0.field8061 != null) {
            class553.method4091(false, arg0.field8054, var3, arg1, var4, arg0.field8061);
         }

         class624 var5 = (class624)class573.field8525.method5681((long)arg0.field8054, arg2 ^ 12724);
         if (arg2 != -12725) {
            method5629(102, -48, -8, 30, 54, -14, -87);
         }

         if (var5 != null) {
            class266.method2033(arg1, var5.field9087, var4, var3, -107);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11420[4] + (arg0 != null ? field11420[3] : field11420[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(BBI)V"
   )
   public final void method2359(byte arg0, byte arg1, int arg2) {
      try {
         ++field11417;
         int var4 = 44 % ((34 - arg1) / 41);
         int var5 = arg2 * 2;
         int var6 = arg0 & 255;
         int var10001 = var5;
         int var9 = var5 + 1;
         this.field11416[var10001] = -1;
         this.field11416[var9] = (byte)(var6 * 3 >> 5);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11420[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method5627(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 < 67) {
            return null;
         } else {
            this.field11416 = new byte[arg0 * arg2 * 2 * arg1];
            ++field11413;
            this.method3429(arg1, arg2, arg0, 26264);
            return this.field11416;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11420[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5628(int arg0) {
      try {
         field11419 = null;
         field11414 = null;
         int var1 = 33 % ((arg0 - -58) / 53);
         field11418 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11420[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IIIIIII)Z"
   )
   public static final boolean method5629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field11415;
         int var7 = arg0 + arg4;
         int var8 = arg5 + arg6;
         int var9 = arg2 + arg3;
         if (!class407.method3113(var9, var8, var7, true, arg0, arg2, var9, var8, arg0, var8)) {
            return false;
         } else if (!class407.method3113(arg2, var8, var7, true, arg0, arg2, var9, var8, var7, var8)) {
            return false;
         } else {
            if (arg1 != 2) {
               method5629(26, 122, 93, -120, 97, -54, -99);
            }

            if (arg0 >= class222.field2856) {
               if (!class407.method3113(arg2, var8, var7, true, var7, var9, var9, var8, var7, arg5)) {
                  return false;
               }

               if (!class407.method3113(arg2, var8, var7, true, var7, var9, arg2, arg5, var7, arg5)) {
                  return false;
               }
            } else {
               if (!class407.method3113(arg2, var8, arg0, true, arg0, var9, var9, var8, arg0, arg5)) {
                  return false;
               }

               if (!class407.method3113(arg2, var8, arg0, true, arg0, var9, arg2, arg5, arg0, arg5)) {
                  return false;
               }
            }

            if (class354.field5362 <= arg2) {
               if (!class407.method3113(var9, var8, var7, true, arg0, var9, var9, var8, arg0, arg5)) {
                  return false;
               }

               if (!class407.method3113(var9, var8, var7, true, arg0, var9, var9, arg5, var7, arg5)) {
                  return false;
               }
            } else {
               if (!class407.method3113(arg2, var8, var7, true, arg0, arg2, arg2, var8, arg0, arg5)) {
                  return false;
               }

               if (!class407.method3113(arg2, var8, var7, true, arg0, arg2, arg2, arg5, var7, arg5)) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11420[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "<init>",
      descriptor = "()V"
   )
   public class783() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5630(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5631(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
