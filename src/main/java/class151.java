import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class151 extends class411 {
   @OriginalMember(
      owner = "client!fea",
      name = "H",
      descriptor = "I"
   )
   public int field2419;
   @OriginalMember(
      owner = "client!fea",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2426 = new String[]{method1411(method1410("\u0014O\u000fQ\u0003Z")), method1411(method1410("\u0014O\u000fQ\u0001Z")), method1411(method1410("\u0014O\u000fQ\u0000Z")), method1411(method1410("\u0014O\u000fQ~\u001bD\u0007\u000b|Z")), method1411(method1410("\u001c_\u0002\u0013")), method1411(method1410("\t\u0004@Q?")), method1411(method1410("\u0014O\u000fQ\u0007Z")), method1411(method1410("\u0014O\u000fQ\u0006Z"))};
   @OriginalMember(
      owner = "client!fea",
      name = "I",
      descriptor = "I"
   )
   public static int field2420 = -1;
   @OriginalMember(
      owner = "client!fea",
      name = "J",
      descriptor = "I"
   )
   public static int field2424 = 100;
   @OriginalMember(
      owner = "client!fea",
      name = "D",
      descriptor = "I"
   )
   public static int field2418;
   @OriginalMember(
      owner = "client!fea",
      name = "F",
      descriptor = "I"
   )
   public static int field2421;
   @OriginalMember(
      owner = "client!fea",
      name = "G",
      descriptor = "I"
   )
   public static int field2422;
   @OriginalMember(
      owner = "client!fea",
      name = "B",
      descriptor = "I"
   )
   public static int field2425;
   @OriginalMember(
      owner = "client!fea",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field2423;

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(Lfk;Lqda;IIIIIIIIIIIIII)V",
      line = 6
   )
   public class151(class678 arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);

      try {
         this.field2419 = arg15;
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field2426[3] + (arg0 != null ? field2426[5] : field2426[4]) + ',' + (arg1 != null ? field2426[5] : field2426[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IB)Z",
      line = 15
   )
   public static final boolean method1406(int arg0, byte arg1) {
      try {
         if (arg1 <= 90) {
            method1406(38, (byte)42);
         }

         ++field2422;
         return ~arg0 <= -5 && ~arg0 >= -9;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2426[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(B)Lqg;",
      line = 27
   )
   public final class485 method672(byte arg0) {
      try {
         if (arg0 != 83) {
            field2423 = null;
         }

         ++field2425;
         return class477.field6955;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2426[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "(I)V",
      line = 38
   )
   public static void method1407(int arg0) {
      try {
         int var1 = -5 % ((-10 - arg0) / 57);
         field2423 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2426[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IIZ[B)I",
      line = 48
   )
   public static final int method1408(int arg0, int arg1, boolean arg2, byte[] arg3) {
      boolean var4 = client.field4564;

      try {
         ++field2421;
         int var5 = -1;
         if (!arg2) {
            return -10;
         } else {
            int var6 = arg0;
            if (var4) {
               var5 = class283.field3950[(arg3[arg0] ^ var5) & 255] ^ var5 >>> 8;
               var6 = arg0 + 1;
            }

            while(true) {
               while(~var6 > ~arg1) {
                  var5 = class283.field3950[(arg3[var6] ^ var5) & 255] ^ var5 >>> 8;
                  ++var6;
               }

               int var7 = ~var5;
               if (!var4) {
                  return var7;
               }

               var5 = var7;
               ++var6;
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2426[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2426[5] : field2426[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "(B)[Lqi;",
      line = 76
   )
   public static final class591[] method1409(byte arg0) {
      try {
         if (arg0 < 94) {
            method1409((byte)126);
         }

         ++field2418;
         return new class591[]{class48.field1042, class207.field3087, class544.field7880};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2426[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1410(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1411(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
