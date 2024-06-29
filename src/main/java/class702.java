import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class702 extends class539 {
   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10121 = new String[]{method5130(method5129("(Y\u0017XX")), method5130(method5129(".YUv")), method5130(method5129(";\u0002\u00174\r")), method5130(method5129("(Y\u0017[X")), method5130(method5129("(Y\u0017^X")), method5130(method5129("(Y\u0017YX"))};
   @OriginalMember(
      owner = "client!hu",
      name = "f",
      descriptor = "I"
   )
   public static int field10113 = 0;
   @OriginalMember(
      owner = "client!hu",
      name = "j",
      descriptor = "I"
   )
   public static int field10118 = 0;
   @OriginalMember(
      owner = "client!hu",
      name = "h",
      descriptor = "[S"
   )
   public static short[] field10112 = new short[256];
   @OriginalMember(
      owner = "client!hu",
      name = "g",
      descriptor = "J"
   )
   public static long field10119 = 0L;
   @OriginalMember(
      owner = "client!hu",
      name = "m",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field10115 = new BigInteger(method5130(method5129("!\u001a\u000f)\u0016x\u0014\u0001|Bv\u001a\r+\u0014u\u0019\r)C&N[.H!\u001a[~C%J\u0000#HtH\b|\u0016s\u001b\u000f{\u0011vO[{\u0012uOX\"\u0011%\u001b\f\u007fC#\u0015_xIv\u001c\f+\u0013xN\u0001\"Ay\u001d\\.\u0012u\u001f\u000e\u007fDv\u001a\u000f(\u0016q\u001e\f,Ey\u0014\\)Fx\u001b[xB$\u0015\n#G%N\n)B%I\u000e\"\u0013t\u001e\u0001(\u0015#O_")), 16);
   @OriginalMember(
      owner = "client!hu",
      name = "k",
      descriptor = "I"
   )
   public static int field10114;
   @OriginalMember(
      owner = "client!hu",
      name = "i",
      descriptor = "I"
   )
   public static int field10116;
   @OriginalMember(
      owner = "client!hu",
      name = "n",
      descriptor = "I"
   )
   public static int field10117;
   @OriginalMember(
      owner = "client!hu",
      name = "l",
      descriptor = "I"
   )
   public static int field10120;

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(ILha;ZZ)Lda;"
   )
   public static final class216 method5125(int arg0, class17 arg1, boolean arg2, boolean arg3) {
      try {
         ++field10116;
         if (arg3) {
            field10119 = -89L;
         }

         class24 var4 = class368.method2897(arg0, arg1, arg2, -570166910);
         return var4 == null ? null : var4.field347;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10121[3] + arg0 + ',' + (arg1 != null ? field10121[2] : field10121[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(Lcu;I)Lbia;"
   )
   public static final class745 method5126(class65 arg0, int arg1) {
      try {
         if (arg1 != 19506) {
            return null;
         } else {
            ++field10117;
            return new class745(arg0.method655((byte)66), arg0.method655((byte)55), arg0.method655((byte)125), arg0.method655((byte)118), arg0.method691((byte)-126), arg0.method691((byte)-126), arg0.method665(false));
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10121[5] + (arg0 != null ? field10121[2] : field10121[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5127(int arg0) {
      try {
         if (arg0 > 54) {
            field10112 = null;
            field10115 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10121[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(Lva;Lcu;B)Ljt;"
   )
   public static final class487 method5128(class618 arg0, class65 arg1, byte arg2) {
      boolean var3 = client.field10022;

      try {
         ++field10114;
         class487 var4 = new class487(arg0);
         if (arg2 <= 120) {
            field10120 = -43;
         }

         int var5 = arg1.method665(false);
         boolean var6 = (1 & var5) != 0;
         boolean var7 = (var5 & 2) != 0;
         boolean var8 = ~(var5 & 4) != -1;
         if (var6) {
            var4.field6952[0] = arg1.method681((byte)78);
            var4.field6947[0] = arg1.method681((byte)121);
            if (arg0.field8824 != -1 || ~arg0.field8780 != 0) {
               var4.field6952[1] = arg1.method681((byte)-97);
               var4.field6947[1] = arg1.method681((byte)-75);
            }

            if (~arg0.field8797 != 0 || arg0.field8794 != -1) {
               var4.field6952[2] = arg1.method681((byte)-85);
               var4.field6947[2] = arg1.method681((byte)-84);
            }
         }

         boolean var9 = ~(var5 & 8) != -1;
         if (var7) {
            var4.field6951[0] = arg1.method681((byte)120);
            var4.field6956[0] = arg1.method681((byte)76);
            if (~arg0.field8801 != 0 || ~arg0.field8816 != 0) {
               var4.field6951[1] = arg1.method681((byte)78);
               var4.field6956[1] = arg1.method681((byte)-44);
            }
         }

         if (var8) {
            int var10 = arg1.method685(-2);
            int[] var11 = new int[]{class697.method5101(15, var10), class697.method5101(15, var10 >> 4), class697.method5101(15, var10 >> 8), class697.method5101(62160, var10) >> 12};
            int var12 = 0;
            if (var3 || ~var12 > -5) {
               do {
                  if (var11[var12] != 15) {
                     var4.field6948[var11[var12]] = (short)arg1.method685(-2);
                  }

                  ++var12;
               } while(~var12 > -5);
            }
         }

         if (var9) {
            int var13 = arg1.method665(false);
            int[] var14 = new int[]{class697.method5101(var13, 15), class697.method5101(var13 >> 4, 15)};
            int var15 = 0;
            if (var3 || ~var15 > -3) {
               do {
                  if (var14[var15] != 15) {
                     var4.field6953[var14[var15]] = (short)arg1.method685(-2);
                  }

                  ++var15;
               } while(~var15 > -3);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field10121[0] + (arg0 != null ? field10121[2] : field10121[1]) + ',' + (arg1 != null ? field10121[2] : field10121[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5129(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5130(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
