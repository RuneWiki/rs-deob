import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field23 = new String[]{method22(method21("w#q%b")), method22(method21("w#q\"b")), method22(method21("}&3\r")), method22(method21("h}qO7")), method22(method21("w#q#b"))};
   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "I"
   )
   public static int field22 = -1;
   @OriginalMember(
      owner = "client!dp",
      name = "g",
      descriptor = "I"
   )
   public static int field16 = 0;
   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "I"
   )
   public static int field18;
   @OriginalMember(
      owner = "client!dp",
      name = "f",
      descriptor = "I"
   )
   public static int field19;
   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "I"
   )
   public static int field21;
   @OriginalMember(
      owner = "client!dp",
      name = "d",
      descriptor = "Lr;"
   )
   public class192 field17;
   @OriginalMember(
      owner = "client!dp",
      name = "e",
      descriptor = "Lka;"
   )
   public class495 field20;

   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "(III)V",
      line = 8
   )
   public static final void method17(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 27826) {
            method20(68, -17);
         }

         ++field21;
         class536 var3 = class108.method1038((long)arg1 | (long)arg0 << 32, arg2 + -27751, 18);
         var3.method4013((byte)126);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field23[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 21
   )
   public static final void method18(String arg0, int arg1) {
      try {
         ++field19;
         if (!arg0.equals("")) {
            ++class415.field6077;
            if (arg1 > -17) {
               field22 = -78;
            }

            class542 var2 = class549.method4093((byte)-113, class537.field7820, class126.field2108);
            var2.field7859.method3571(255, class70.method747(arg0, -9));
            var2.field7859.method3546((byte)-107, arg0);
            class740.method5332(var2, (byte)77);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field23[4] + (arg0 != null ? field23[3] : field23[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(III)I",
      line = 42
   )
   public static final int method19(int arg0, int arg1, int arg2) {
      try {
         if (arg1 > -67) {
            field22 = -88;
         }

         ++field18;
         return arg2 != 1 && ~arg2 != -4 ? class205.field3052[3 & arg0] : class768.field11170[arg0 & 3];
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field23[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(II)V",
      line = 58
   )
   public static final void method20(int arg0, int arg1) {
      class600 var2 = class90.field1473[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class600 var4 = class90.field1473[var3][arg0][arg1] = class90.field1473[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class533 var5 = var4.field8653; var5 != null; var5 = var5.field7763) {
               class144 var6 = var5.field7766;
               if (var6.field2354 == arg0 && var6.field2347 == arg1) {
                  --var6.field4090;
               }
            }

            if (var4.field8654 != null) {
               --var4.field8654.field4090;
            }

            if (var4.field8659 != null) {
               --var4.field8659.field4090;
            }

            if (var4.field8661 != null) {
               --var4.field8661.field4090;
            }

            if (var4.field8658 != null) {
               --var4.field8658.field4090;
            }

            if (var4.field8660 != null) {
               --var4.field8660.field4090;
            }
         }
      }

      if (class90.field1473[0][arg0][arg1] == null) {
         class90.field1473[0][arg0][arg1] = new class600(0);
         class90.field1473[0][arg0][arg1].field8664 = 1;
      }

      class90.field1473[0][arg0][arg1].field8656 = var2;
      class90.field1473[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method21(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method22(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
