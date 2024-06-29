import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class624 extends class390 {
   @OriginalMember(
      owner = "client!oea",
      name = "A",
      descriptor = "B"
   )
   public byte field9170 = 5;
   @OriginalMember(
      owner = "client!oea",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9183 = new String[]{method4538(method4537("nS\u001c2\u001a)")), method4538(method4537("nS\u001c2\u0015)")), method4538(method4537("nS\u001c2\u0014)"))};
   @OriginalMember(
      owner = "client!oea",
      name = "t",
      descriptor = "Leg;"
   )
   public static class118 field9176 = new class118(1, 6);
   @OriginalMember(
      owner = "client!oea",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field9182 = new int[200];
   @OriginalMember(
      owner = "client!oea",
      name = "B",
      descriptor = "F"
   )
   public static float field9177;
   @OriginalMember(
      owner = "client!oea",
      name = "C",
      descriptor = "I"
   )
   public static int field9171;
   @OriginalMember(
      owner = "client!oea",
      name = "D",
      descriptor = "I"
   )
   public int field9172;
   @OriginalMember(
      owner = "client!oea",
      name = "y",
      descriptor = "I"
   )
   public int field9174;
   @OriginalMember(
      owner = "client!oea",
      name = "x",
      descriptor = "I"
   )
   public int field9175;
   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "I"
   )
   public static int field9178;
   @OriginalMember(
      owner = "client!oea",
      name = "w",
      descriptor = "I"
   )
   public int field9179;
   @OriginalMember(
      owner = "client!oea",
      name = "u",
      descriptor = "I"
   )
   public int field9180;
   @OriginalMember(
      owner = "client!oea",
      name = "s",
      descriptor = "I"
   )
   public int field9181;
   @OriginalMember(
      owner = "client!oea",
      name = "E",
      descriptor = "Z"
   )
   public boolean field9173;

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(IIII)Lij;"
   )
   public static final class447 method4534(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9171;
         class447 var4 = null;
         if (arg2 == 0) {
            var4 = class40.method350(class237.field3295, class430.field6150.field106, true);
            ++class49.field640;
         }

         if (~arg2 == -2) {
            var4 = class40.method350(class685.field10086, class430.field6150.field106, true);
            ++class400.field5799;
         }

         var4.field6359.method1200(class195.field2767.method1779(82, arg0 ^ 3219) ? 1 : 0, -12649);
         var4.field6359.method1190(arg0 ^ 10496, class672.field9740 + arg1);
         var4.field6359.method1163((byte)-99, class533.field7595 + arg3);
         class140.field1791 = arg3;
         class755.field11185 = arg1;
         if (arg0 != -3320) {
            method4534(-99, -6, 64, 70);
         }

         class651.field9542 = false;
         class561.method4013(arg0 + -11634);
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9183[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4535(int arg0) {
      try {
         field9182 = null;
         field9176 = null;
         if (arg0 <= 118) {
            method4535(-11);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9183[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4536(int arg0) {
      try {
         ++field9178;
         if (arg0 <= -107) {
            class67.field826.method731(0);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9183[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
