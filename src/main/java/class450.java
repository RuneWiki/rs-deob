import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class450 extends class143 {
   @OriginalMember(
      owner = "client!mea",
      name = "n",
      descriptor = "I"
   )
   private int field6575 = -1;
   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6576 = new String[]{method3394(method3393("@y\u0013R")), method3394(method3393("Ci\u001e\u0010\\\u0006")), method3394(method3393("U\"Q\u0010`")), method3394(method3393("Ci\u001e\u0010Y\u0006")), method3394(method3393("Ci\u001e\u0010[\u0006")), method3394(method3393("Ci\u001e\u0010X\u0006")), method3394(method3393("Ci\u001e\u0010_\u0006")), method3394(method3393("Ci\u001e\u0010^\u0006"))};
   @OriginalMember(
      owner = "client!mea",
      name = "l",
      descriptor = "I"
   )
   public static int field6573 = 0;
   @OriginalMember(
      owner = "client!mea",
      name = "q",
      descriptor = "I"
   )
   public static int field6568;
   @OriginalMember(
      owner = "client!mea",
      name = "s",
      descriptor = "I"
   )
   public static int field6569;
   @OriginalMember(
      owner = "client!mea",
      name = "r",
      descriptor = "I"
   )
   public static int field6570;
   @OriginalMember(
      owner = "client!mea",
      name = "m",
      descriptor = "I"
   )
   public static int field6571;
   @OriginalMember(
      owner = "client!mea",
      name = "o",
      descriptor = "I"
   )
   public static int field6574;
   @OriginalMember(
      owner = "client!mea",
      name = "p",
      descriptor = "Lvia;"
   )
   public static class587 field6572;

   @OriginalMember(
      owner = "client!mea",
      name = "b",
      descriptor = "(I)V",
      line = 5
   )
   public static final void method3389(int arg0) {
      try {
         ++field6569;
         class292.field4073.method2916(false);
         class315.field4531.method1636(arg0 + 4924);
         class490.field7150.method2456(arg0 ^ -14037);
         class386.field5692.setBackground(Color.black);
         class20.field328 = -1;
         if (arg0 != -4925) {
            method3390(84, (byte)69, (short[])null);
         }

         class292.field4073 = class683.method4986(false, class386.field5692);
         class315.field4531 = class787.method5669(true, 0, class386.field5692);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6576[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(IB[S)[S",
      line = 23
   )
   public static final short[] method3390(int arg0, byte arg1, short[] arg2) {
      try {
         ++field6570;
         short[] var3 = new short[arg0];
         class365.method2859(arg2, 0, var3, 0, arg0);
         int var4 = -32 % ((82 - arg1) / 44);
         return var3;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6576[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6576[2] : field6576[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(Lan;I)V",
      line = 39
   )
   public final void method456(class25 arg0, int arg1) {
      try {
         arg0.method172(this.field6575, (byte)113);
         ++field6574;
         if (arg1 != 117) {
            method3390(-128, (byte)-16, (short[])null);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6576[6] + (arg0 != null ? field6576[2] : field6576[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(B)V",
      line = 58
   )
   public static void method3391(byte arg0) {
      try {
         if (arg0 == 28) {
            field6572 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6576[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(Luda;B)V",
      line = 68
   )
   public final void method457(class473 arg0, byte arg1) {
      try {
         this.field6575 = arg0.method3565(true);
         if (arg1 >= -81) {
            field6573 = 115;
         }

         ++field6571;
         arg0.method3564((byte)-45);
         if (arg0.method3564((byte)-52) != 255) {
            --arg0.field6907;
            arg0.method3523(-116);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6576[3] + (arg0 != null ? field6576[2] : field6576[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(BII)Z",
      line = 96
   )
   public static final boolean method3392(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != -61) {
            return false;
         } else {
            ++field6568;
            return (arg1 & 544) == 544 | ~(arg1 & 24) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6576[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3393(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3394(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
