import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class277 {
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4419 = new String[]{method2334(method2333("O\u000bg)>")), method2334(method2333("O\u000bg*>"))};
   @OriginalMember(
      owner = "client!ae",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field4414 = new int[1000];
   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "[B"
   )
   public static byte[] field4416;
   @OriginalMember(
      owner = "client!ae",
      name = "e",
      descriptor = "B"
   )
   public byte field4412;
   @OriginalMember(
      owner = "client!ae",
      name = "g",
      descriptor = "I"
   )
   public int field4413;
   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "I"
   )
   public static int field4415;
   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field4417;
   @OriginalMember(
      owner = "client!ae",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4418;

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method2331(int arg0, byte arg1) {
      try {
         ++field4415;
         int var2 = 0;
         if (arg0 < 0 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
         }

         if (arg0 >= 256) {
            arg0 >>>= 8;
            var2 += 8;
         }

         if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 4;
         }

         if (arg1 != 124) {
            return -43;
         } else {
            if (arg0 >= 4) {
               var2 += 2;
               arg0 >>>= 2;
            }

            if (~arg0 <= -2) {
               ++var2;
               arg0 >>>= 1;
            }

            return arg0 + var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4419[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2332(int arg0) {
      try {
         field4414 = null;
         field4418 = null;
         field4416 = null;
         if (arg0 != 16) {
            method2331(-14, (byte)126);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4419[0] + arg0 + ')');
      }
   }

   static {
      int var0 = 0;
      field4416 = new byte[32896];

      for(int var1 = 0; ~var1 > -257; ++var1) {
         for(int var2 = 0; var2 <= var1; ++var2) {
            field4416[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
         }
      }

   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2333(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2334(char[] arg0) {
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
            var10005 = 110;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
