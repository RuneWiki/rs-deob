import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class487 {
   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "[I"
   )
   public int[] field6951;
   @OriginalMember(
      owner = "client!jt",
      name = "i",
      descriptor = "[I"
   )
   public int[] field6956;
   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "[I"
   )
   public int[] field6952;
   @OriginalMember(
      owner = "client!jt",
      name = "k",
      descriptor = "[I"
   )
   public int[] field6947;
   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "[S"
   )
   public short[] field6948;
   @OriginalMember(
      owner = "client!jt",
      name = "h",
      descriptor = "[S"
   )
   public short[] field6953;
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6957 = new String[]{method3709(method3708("k\u001dR_'")), method3709(method3708("~F\u0010\u001d")), method3709(method3708("zGR5r")), method3709(method3708("zGR2r")), method3709(method3708("zGR0r")), method3709(method3708("zGR3r")), method3709(method3708("zGRM3~Z\bOr"))};
   @OriginalMember(
      owner = "client!jt",
      name = "j",
      descriptor = "I"
   )
   public static int field6949 = 0;
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "I"
   )
   public static int field6950;
   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "I"
   )
   public static int field6954;
   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "I"
   )
   public static int field6955;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "[Ldea;"
   )
   public static class471[] field6946;

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(ILjga;Lha;II)V"
   )
   public static final void method3704(int arg0, class91 arg1, class17 arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field6950;
         byte var6 = 63;
         byte var7 = 7;
         int var8 = arg3;
         if (var5 || ~arg3 <= -1) {
            do {
               int var9 = (var7 & 7) << 7 | (var8 & 63) << 10 | var6 & 127;
               class274.method2317(true, false, (byte)24);
               int var10 = class744.field10589[var9];
               class130.method1327(false, true, 127);
               arg2.method226(arg4, ((-var8 + 63) * arg1.field1452 >> 6) + arg0, arg1.field1513, (arg1.field1452 >> 6) + 1, var10, 0);
               --var8;
            } while(~var8 <= -1);

         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6957[4] + arg0 + ',' + (arg1 != null ? field6957[0] : field6957[1]) + ',' + (arg2 != null ? field6957[0] : field6957[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(Lcu;B)Lbb;"
   )
   public static final class616 method3705(class65 arg0, byte arg1) {
      try {
         ++field6955;
         class612 var2 = class399.method3110(arg0, false);
         int var3 = -40 % ((arg1 - 4) / 52);
         int var4 = arg0.method701(255);
         int var5 = arg0.method701(255);
         int var6 = arg0.method685(-2);
         return new class616(var2.field8705, var2.field8709, var2.field8712, var2.field8703, var2.field8701, var2.field8708, var2.field8707, var2.field8706, var2.field8704, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6957[2] + (arg0 != null ? field6957[0] : field6957[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3706(int arg0) {
      try {
         field6946 = null;
         if (arg0 > -53) {
            method3706(-76);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6957[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method3707(int arg0, boolean arg1) {
      try {
         if (arg0 != 1) {
            field6949 = 35;
         }

         ++field6954;
         class588.method4314(class140.field2243, class7.field130, class557.field7909, -54, arg1);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6957[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "<init>",
      descriptor = "(Lva;)V"
   )
   public class487(class618 arg0) {
      try {
         this.field6951 = new int[2];
         this.field6956 = new int[2];
         this.field6952 = new int[3];
         this.field6947 = new int[3];
         this.field6952[2] = arg0.field8797;
         this.field6952[0] = arg0.field8814;
         this.field6952[1] = arg0.field8824;
         this.field6947[1] = arg0.field8780;
         this.field6947[0] = arg0.field8832;
         this.field6947[2] = arg0.field8794;
         this.field6951[0] = arg0.field8798;
         this.field6951[1] = arg0.field8801;
         this.field6956[1] = arg0.field8816;
         this.field6956[0] = arg0.field8852;
         if (arg0.field8844 != null) {
            this.field6948 = new short[arg0.field8844.length];
            class474.method3637(arg0.field8844, 0, this.field6948, 0, this.field6948.length);
         }

         if (arg0.field8785 != null) {
            this.field6953 = new short[arg0.field8785.length];
            class474.method3637(arg0.field8785, 0, this.field6953, 0, this.field6953.length);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6957[6] + (arg0 != null ? field6957[0] : field6957[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
