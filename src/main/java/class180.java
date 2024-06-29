import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class180 {
   @OriginalMember(
      owner = "client!ol",
      name = "j",
      descriptor = "I"
   )
   public int field2646;
   @OriginalMember(
      owner = "client!ol",
      name = "d",
      descriptor = "I"
   )
   public int field2644;
   @OriginalMember(
      owner = "client!ol",
      name = "l",
      descriptor = "B"
   )
   public byte field2642;
   @OriginalMember(
      owner = "client!ol",
      name = "f",
      descriptor = "I"
   )
   public int field2647;
   @OriginalMember(
      owner = "client!ol",
      name = "e",
      descriptor = "I"
   )
   public int field2649;
   @OriginalMember(
      owner = "client!ol",
      name = "k",
      descriptor = "I"
   )
   public int field2635;
   @OriginalMember(
      owner = "client!ol",
      name = "p",
      descriptor = "Ldea;"
   )
   public class471 field2640;
   @OriginalMember(
      owner = "client!ol",
      name = "m",
      descriptor = "I"
   )
   public int field2636;
   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2650 = new String[]{method1631(method1630("\rH\u0019\u000b\u001d")), method1631(method1630("\fQ[#")), method1631(method1630("\rH\u0019s\\\fMCq\u001d")), method1631(method1630("\u0019\n\u0019aH")), method1631(method1630("\rH\u0019\u000e\u001d")), method1631(method1630("\rH\u0019\f\u001d")), method1631(method1630("\rH\u0019\r\u001d"))};
   @OriginalMember(
      owner = "client!ol",
      name = "i",
      descriptor = "Lhha;"
   )
   public static class724 field2643 = new class724(118, -1);
   @OriginalMember(
      owner = "client!ol",
      name = "o",
      descriptor = "I"
   )
   public static int field2634;
   @OriginalMember(
      owner = "client!ol",
      name = "n",
      descriptor = "I"
   )
   public static int field2638;
   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "I"
   )
   public static int field2641;
   @OriginalMember(
      owner = "client!ol",
      name = "b",
      descriptor = "Luc;"
   )
   public class120 field2637;
   @OriginalMember(
      owner = "client!ol",
      name = "c",
      descriptor = "Lqb;"
   )
   public class291 field2648;
   @OriginalMember(
      owner = "client!ol",
      name = "g",
      descriptor = "Laia;"
   )
   public class301 field2645;
   @OriginalMember(
      owner = "client!ol",
      name = "h",
      descriptor = "Lica;"
   )
   public class469 field2639;

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1626(int arg0) {
      try {
         ++field2638;
         if (arg0 != -3) {
            this.field2640 = null;
         }

         return ~this.field2642 == -3 || this.field2642 == 3;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2650[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1627(byte arg0) {
      try {
         int var1 = -63 % ((33 - arg0) / 43);
         class183.field2683.method518(57);
         ++field2641;
         class527.field7461.method2110((byte)48);
         class527.field7461.field3728 = null;
         class527.field7461.field3720 = null;
         class527.field7461.field3730 = 0;
         class527.field7461.field3719.field945 = 0;
         class527.field7461.field3722 = null;
         class34.field515 = 0;
         class437.method3404((byte)35);
         class670.field9404 = null;
         class428.field6272 = 0;
         class49.field747 = null;
         class734.field10438 = 0;
         class793.field11540 = null;
         class755.field10799 = 0;
         class361.field5338 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2650[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1628(boolean arg0) {
      try {
         if (arg0) {
            field2643 = null;
         }

         field2643 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2650[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(IBLjava/lang/String;)V"
   )
   public static final void method1629(int arg0, byte arg1, String arg2) {
      try {
         if (arg1 != -31) {
            field2643 = null;
         }

         ++field2634;
         class111 var3 = class796.method5734(2, (long)arg0, (byte)-117);
         var3.method1087(0);
         var3.field1736 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2650[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2650[3] : field2650[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "<init>",
      descriptor = "(BIIIIIILdea;)V"
   )
   public class180(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class471 arg7) {
      try {
         this.field2646 = arg3;
         this.field2644 = arg4;
         this.field2642 = arg0;
         this.field2647 = arg1;
         this.field2649 = arg2;
         this.field2635 = arg5;
         this.field2640 = arg7;
         this.field2636 = arg6;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2650[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2650[3] : field2650[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1630(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1631(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
