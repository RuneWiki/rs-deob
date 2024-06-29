import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public abstract class class566 extends class471 {
   @OriginalMember(
      owner = "client!waa",
      name = "J",
      descriptor = "S"
   )
   public short field8044;
   @OriginalMember(
      owner = "client!waa",
      name = "P",
      descriptor = "S"
   )
   public short field8045;
   @OriginalMember(
      owner = "client!waa",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8051 = new String[]{method4208(method4207("1\u001a4k")), method4208(method4207("(\u000e9)8w")), method4208(method4207("$Av)\u0003")), method4208(method4207("(\u000e9)?w")), method4208(method4207("+\n4b^")), method4208(method4207("(\u000e9)9w")), method4208(method4207("(\u000e9)=w")), method4208(method4207("(\u000e9):w")), method4208(method4207("(\u000e9)B6\u00011s@w")), method4208(method4207("(\u000e9)<w")), method4208(method4207("(\u000e9)6w")), method4208(method4207("(\u000e9);w")), method4208(method4207("(\u000e9).w"))};
   @OriginalMember(
      owner = "client!waa",
      name = "N",
      descriptor = "I"
   )
   public static int field8049 = 0;
   @OriginalMember(
      owner = "client!waa",
      name = "L",
      descriptor = "F"
   )
   public static float field8039;
   @OriginalMember(
      owner = "client!waa",
      name = "O",
      descriptor = "I"
   )
   public static int field8037;
   @OriginalMember(
      owner = "client!waa",
      name = "H",
      descriptor = "I"
   )
   public static int field8038;
   @OriginalMember(
      owner = "client!waa",
      name = "Q",
      descriptor = "I"
   )
   public static int field8040;
   @OriginalMember(
      owner = "client!waa",
      name = "R",
      descriptor = "I"
   )
   public static int field8041;
   @OriginalMember(
      owner = "client!waa",
      name = "I",
      descriptor = "I"
   )
   public static int field8042;
   @OriginalMember(
      owner = "client!waa",
      name = "M",
      descriptor = "I"
   )
   public static int field8043;
   @OriginalMember(
      owner = "client!waa",
      name = "G",
      descriptor = "I"
   )
   public static int field8047;
   @OriginalMember(
      owner = "client!waa",
      name = "F",
      descriptor = "I"
   )
   public static int field8048;
   @OriginalMember(
      owner = "client!waa",
      name = "K",
      descriptor = "I"
   )
   public static int field8050;
   @OriginalMember(
      owner = "client!waa",
      name = "E",
      descriptor = "[Z"
   )
   public static boolean[] field8046;

   @OriginalMember(
      owner = "client!waa",
      name = "l",
      descriptor = "(I)V"
   )
   public static void method4204(int arg0) {
      try {
         field8046 = null;
         if (arg0 != 0) {
            field8039 = -0.302053F;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8051[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1685(int arg0) {
      try {
         ++field8048;
         if (arg0 != -1) {
            field8046 = null;
         }

         return class232.field3602[(super.field6832 >> class313.field4707) - class507.field7207 - -class15.field214][(super.field6833 >> class313.field4707) + -class477.field6876 + class15.field214];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8051[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(ILjga;)V"
   )
   public static final void method4205(int arg0, class91 arg1) {
      try {
         if (class70.field1024 == arg1.field1465) {
            class417.field6107[arg1.field1427] = true;
         }

         if (arg0 == 1727005542) {
            ++field8037;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8051[3] + arg0 + ',' + (arg1 != null ? field8051[2] : field8051[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public final boolean method1682(class17 arg0, int arg1) {
      try {
         if (arg1 != 1) {
            this.field8044 = 6;
         }

         ++field8041;
         return class730.method5291(this.method728(0), super.field6832 >> class313.field4707, super.field6833 >> class313.field4707, false, super.field6826);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8051[7] + (arg0 != null ? field8051[2] : field8051[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method735(int arg0) {
      try {
         int var2 = -74 / ((-5 - arg0) / 62);
         ++field8050;
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8051[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method4206(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8047;
         int var4 = -128 / ((15 - arg0) / 41);
         String var5 = field8051[4] + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 63) + "," + (arg3 & 63);
         System.out.println(var5);
         class260.method2231(var5, 127, true, false);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8051[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method731(int arg0) {
      try {
         if (arg0 != 255) {
            this.method1685(109);
         }

         ++field8040;
         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8051[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public final int method1681(byte arg0, class757[] arg1) {
      try {
         ++field8042;
         if (arg0 != 39) {
            method4205(114, (class91)null);
         }

         return this.method3610(arg1, super.field6833 >> class313.field4707, 32764, super.field6832 >> class313.field4707);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8051[11] + arg0 + ',' + (arg1 != null ? field8051[2] : field8051[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(ILdea;IZLha;II)V"
   )
   public final void method719(int arg0, class471 arg1, int arg2, boolean arg3, class17 arg4, int arg5, int arg6) {
      try {
         if (arg6 == 0) {
            ++field8038;
            throw new IllegalStateException();
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8051[1] + arg0 + ',' + (arg1 != null ? field8051[2] : field8051[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8051[2] : field8051[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         super.field6833 = arg2;
         super.field6832 = arg0;
         super.field6824 = (byte)arg3;
         this.field8044 = (short)arg6;
         this.field8045 = (short)arg5;
         super.field6829 = arg1;
         super.field6826 = (byte)arg4;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8051[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4207(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4208(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
