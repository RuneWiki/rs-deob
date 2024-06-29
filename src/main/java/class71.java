import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class71 extends class449 {
   @OriginalMember(
      owner = "client!qr",
      name = "w",
      descriptor = "I"
   )
   public int field1264;
   @OriginalMember(
      owner = "client!qr",
      name = "s",
      descriptor = "I"
   )
   public int field1262;
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1265 = new String[]{method755(method754(";@vt")), method755(method754(".\u001b46(")), method755(method754("$G4$<;\\n&}")), method755(method754("$G4[}")), method755(method754("$G4\\}")), method755(method754("$G4Y}")), method755(method754("$G4Z}")), method755(method754("$G4]}"))};
   @OriginalMember(
      owner = "client!qr",
      name = "u",
      descriptor = "I"
   )
   public static int field1258;
   @OriginalMember(
      owner = "client!qr",
      name = "v",
      descriptor = "I"
   )
   public static int field1259;
   @OriginalMember(
      owner = "client!qr",
      name = "r",
      descriptor = "I"
   )
   public static int field1260;
   @OriginalMember(
      owner = "client!qr",
      name = "x",
      descriptor = "I"
   )
   public static int field1261;
   @OriginalMember(
      owner = "client!qr",
      name = "t",
      descriptor = "I"
   )
   public static int field1263;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public final class485 method672(byte arg0) {
      try {
         if (arg0 != 83) {
            method752(9, true);
         }

         ++field1263;
         return class722.field10450;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1265[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method750(int arg0, int arg1) {
      try {
         ++field1259;
         if (arg0 != -1381022974) {
            method750(-127, -53);
         }

         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1265[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IIII)Lhv;"
   )
   public static final class542 method751(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1258;
         class542 var4 = null;
         if (~arg3 == -1) {
            ++class249.field3579;
            var4 = class549.method4093((byte)-113, class482.field7005, class126.field2108);
         }

         if (arg3 == 1) {
            var4 = class549.method4093((byte)-113, class34.field510, class126.field2108);
            ++class133.field2202;
         }

         var4.field7859.method3550(class753.field10887 + arg1, 29620);
         var4.field7859.method3555(class347.field4939 + arg2, (byte)79);
         var4.field7859.method3580(class292.field4073.method2913(82, (byte)-114) ? 1 : 0, -87);
         if (arg0 > -30) {
            return null;
         } else {
            class344.field4901 = arg1;
            class770.field11213 = arg2;
            class626.field9115 = false;
            class176.method1561(0);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1265[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method752(int arg0, boolean arg1) {
      try {
         ++field1261;
         int var4 = arg0 - 1;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         int var9 = var8 | var8 >>> 16;
         return !arg1 ? 112 : var9 + 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1265[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(Lfk;Lqda;IIIIIIIIII)V"
   )
   public class71(class678 arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field1264 = arg10;
         this.field1262 = arg11;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field1265[2] + (arg0 != null ? field1265[1] : field1265[0]) + ',' + (arg1 != null ? field1265[1] : field1265[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "(B)I"
   )
   public static final int method753(byte arg0) {
      try {
         ++field1260;
         if ((double)class370.field5484 == 3.0D) {
            return 37;
         } else {
            int var1 = -82 / ((70 - arg0) / 45);
            if ((double)class370.field5484 == 4.0D) {
               return 50;
            } else if ((double)class370.field5484 == 6.0D) {
               return 75;
            } else {
               return (double)class370.field5484 == 8.0D ? 100 : 200;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1265[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method754(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method755(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
