import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class68 extends class629 {
   @OriginalMember(
      owner = "client!mia",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1240 = new String[]{method741(method740("W#YY!\u0012")), method741(method740("T?T\u001b")), method741(method740("Ad\u0016Y\u0016")), method741(method740("W#YY;\u0012")), method741(method740("W#YY%\u0012")), method741(method740("W#YY&\u0012")), method741(method740("W#YY$\u0012"))};
   @OriginalMember(
      owner = "client!mia",
      name = "H",
      descriptor = "I"
   )
   public static int field1235;
   @OriginalMember(
      owner = "client!mia",
      name = "G",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!mia",
      name = "E",
      descriptor = "I"
   )
   public static int field1237;
   @OriginalMember(
      owner = "client!mia",
      name = "D",
      descriptor = "I"
   )
   public static int field1238;
   @OriginalMember(
      owner = "client!mia",
      name = "F",
      descriptor = "I"
   )
   public static int field1239;

   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method736(int arg0, int arg1, int arg2) {
      try {
         ++field1237;
         class536 var3 = class108.method1038((long)arg2, arg0 ^ 70, arg0);
         var3.method4017(24076);
         var3.field7800 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1240[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1238;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            return null;
         } else {
            if (super.field9161.field7474) {
               int[][] var5 = this.method4621(arg1 ^ -2163, 0, arg0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int var9 = 0;
               if (var3 || ~class66.field1214 < ~var9) {
                  do {
                     var4[var9] = (var6[var9] - (-var7[var9] - var8[var9])) / 3;
                     ++var9;
                  } while(~class66.field1214 < ~var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1240[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "<init>",
      descriptor = "()V"
   )
   public class68() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(B)Lof;"
   )
   public static final class646 method737(byte arg0) {
      try {
         if (arg0 > -125) {
            return null;
         } else {
            ++field1235;
            return class244.method1985(3222, 1);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1240[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "a",
      descriptor = "(Ljava/lang/String;II)I"
   )
   public static final int method738(String arg0, int arg1, int arg2) {
      try {
         ++field1236;
         return arg1 < 107 ? -67 : class683.method4987(true, arg2, arg0, 30012);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1240[3] + (arg0 != null ? field1240[2] : field1240[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method739(byte arg0) {
      try {
         ++field1239;
         if (!class332.field4754) {
            if (arg0 <= -81) {
               class261.field3714 = true;
               class332.field4754 = true;
               class348.field4948 += (-12.0F - class348.field4948) / 2.0F;
            }
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1240[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method740(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method741(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
