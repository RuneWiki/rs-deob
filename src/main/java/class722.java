import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class722 extends class775 {
   @OriginalMember(
      owner = "client!rd",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10814 = new String[]{method5341(method5340("!xq\u001eq")), method5341(method5340("=i30")), method5341(method5340("(2qr$")), method5341(method5340("!xq\u001fq")), method5341(method5340("!xq\u001dq")), method5341(method5340("!xq\u0019q")), method5341(method5340("!xq\u0018q"))};
   @OriginalMember(
      owner = "client!rd",
      name = "y",
      descriptor = "Luk;"
   )
   public static class498 field10801 = new class498(121, 5);
   @OriginalMember(
      owner = "client!rd",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10813 = "";
   @OriginalMember(
      owner = "client!rd",
      name = "B",
      descriptor = "I"
   )
   public static int field10802;
   @OriginalMember(
      owner = "client!rd",
      name = "A",
      descriptor = "I"
   )
   private int field10803;
   @OriginalMember(
      owner = "client!rd",
      name = "D",
      descriptor = "I"
   )
   public static int field10806;
   @OriginalMember(
      owner = "client!rd",
      name = "w",
      descriptor = "I"
   )
   public static int field10807;
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "I"
   )
   public static int field10808;
   @OriginalMember(
      owner = "client!rd",
      name = "F",
      descriptor = "I"
   )
   private int field10809;
   @OriginalMember(
      owner = "client!rd",
      name = "G",
      descriptor = "I"
   )
   private int field10810;
   @OriginalMember(
      owner = "client!rd",
      name = "v",
      descriptor = "I"
   )
   public static int field10811;
   @OriginalMember(
      owner = "client!rd",
      name = "t",
      descriptor = "I"
   )
   private int field10812;
   @OriginalMember(
      owner = "client!rd",
      name = "u",
      descriptor = "Lda;"
   )
   public static class288 field10805;
   @OriginalMember(
      owner = "client!rd",
      name = "E",
      descriptor = "Liba;"
   )
   public static class343 field10804;

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 7
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         int var3 = 27 % ((-84 - arg1) / 34);
         this.field10803 = arg0.method2894(127);
         ++field10802;
         this.field10812 = arg0.method2894(108);
         this.field10809 = arg0.method2855(-31007);
         this.field10810 = arg0.method2855(-31007);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10814[3] + (arg0 != null ? field10814[2] : field10814[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public static final void method5337(int arg0) {
      try {
         ++field10811;
         if (arg0 <= 110) {
            field10805 = null;
         }

         if (class298.method2502(class342.field5204, (byte)-35)) {
            if (class510.field7800.field355 == null) {
               class69.method532(1, 5);
            } else {
               class69.method532(1, 7);
            }
         } else {
            if (class342.field5204 != 5 && ~class342.field5204 != -7) {
               if (~class342.field5204 == -14) {
                  class69.method532(1, 3);
                  return;
               }
            } else {
               class69.method532(1, 3);
            }

         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10814[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 64
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         int var3 = -13 / ((-23 - arg1) / 45);
         ++field10806;
         arg0.method1930(this.field10809, (byte)124, this.field10803, this.field10812, this.field10810);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10814[4] + (arg0 != null ? field10814[2] : field10814[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "(I)V",
      line = 74
   )
   public static void method5338(int arg0) {
      try {
         field10804 = null;
         field10813 = null;
         field10805 = null;
         if (arg0 == -26756) {
            field10801 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10814[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "a",
      descriptor = "(II)I",
      line = 88
   )
   public static final int method5339(int arg0, int arg1) {
      try {
         ++field10807;
         if (arg0 > -101) {
            field10801 = null;
         }

         int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
         int var3 = arg1 * 6 + -61440;
         int var4 = (arg1 * var3 >> 12) + 40960;
         return var2 * var4 >> 12;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10814[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5340(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5341(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
