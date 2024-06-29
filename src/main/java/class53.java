import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class53 {
   @OriginalMember(
      owner = "client!hl",
      name = "b",
      descriptor = "I"
   )
   public int field653;
   @OriginalMember(
      owner = "client!hl",
      name = "f",
      descriptor = "I"
   )
   public int field656;
   @OriginalMember(
      owner = "client!hl",
      name = "g",
      descriptor = "S"
   )
   public short field652;
   @OriginalMember(
      owner = "client!hl",
      name = "e",
      descriptor = "B"
   )
   public byte field659;
   @OriginalMember(
      owner = "client!hl",
      name = "l",
      descriptor = "Z"
   )
   public boolean field650;
   @OriginalMember(
      owner = "client!hl",
      name = "j",
      descriptor = "B"
   )
   public byte field654;
   @OriginalMember(
      owner = "client!hl",
      name = "h",
      descriptor = "S"
   )
   public short field661;
   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "S"
   )
   public short field651;
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field662 = new String[]{method361(method360("$5y 7\"0#\"v")), method361(method360("$5y]v")), method361(method360("$5y^v"))};
   @OriginalMember(
      owner = "client!hl",
      name = "d",
      descriptor = "Lvv;"
   )
   public static class308 field655 = new class308();
   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "S"
   )
   public static short field658 = 256;
   @OriginalMember(
      owner = "client!hl",
      name = "i",
      descriptor = "I"
   )
   public static int field660 = 0;
   @OriginalMember(
      owner = "client!hl",
      name = "k",
      descriptor = "I"
   )
   public static int field657;

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field657;
         int var5 = class528.field8015;
         if (arg1 != 32601) {
            field660 = -40;
         }

         int var6 = class382.field6031;
         if (class281.field4472) {
            var5 += class600.method4443(0);
            var6 += class218.method1890(0);
         }

         if (class464.field7049 == 1) {
            class672 var7 = class634.field9183[class256.field3871 / 100];
            var7.method4959(var5 + -8, var6 + -8);
            class171.method1580(var5 - 8 + var7.method2106(), var6 + -8 + var7.method2108(), arg1 + -32703, var6 + -8, var5 + -8);
         }

         if (~class464.field7049 == -3) {
            class672 var8 = class634.field9183[class256.field3871 / 100 + 4];
            var8.method4959(var5 - 8, var6 + -8);
            class171.method1580(-8 + (var5 - -var8.method2106()), var6 - 8 - -var8.method2108(), -55, var6 + -8, var5 + -8);
         }

         class180.method1636((byte)47);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field662[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method359(int arg0) {
      try {
         if (arg0 != -6242) {
            method358(-51, -4, 59, 21, 76);
         }

         field655 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field662[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field653 = arg0;
         this.field656 = arg10;
         this.field652 = (short)arg5;
         this.field659 = (byte)arg8;
         this.field650 = arg9;
         this.field654 = (byte)arg7;
         this.field661 = (short)arg6;
         this.field651 = (short)arg4;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field662[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method360(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method361(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
