import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class237 {
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3453 = new String[]{method1946(method1945("\u0005\u0002>ps")), method1946(method1945("\u0005\u0002>us")), method1946(method1945("\fX>\u001d&")), method1946(method1945("\u0005\u0002>vs")), method1946(method1945("\u0019\u0003|_")), method1946(method1945("\u0005\u0002>ws")), method1946(method1945("\u0005\u0002>qs")), method1946(method1945("\u0005\u0002>rs"))};
   @OriginalMember(
      owner = "client!rt",
      name = "l",
      descriptor = "I"
   )
   public static int field3439;
   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "I"
   )
   public int field3440;
   @OriginalMember(
      owner = "client!rt",
      name = "d",
      descriptor = "I"
   )
   public int field3441;
   @OriginalMember(
      owner = "client!rt",
      name = "i",
      descriptor = "I"
   )
   public int field3442;
   @OriginalMember(
      owner = "client!rt",
      name = "o",
      descriptor = "I"
   )
   public static int field3443;
   @OriginalMember(
      owner = "client!rt",
      name = "g",
      descriptor = "I"
   )
   public static int field3444;
   @OriginalMember(
      owner = "client!rt",
      name = "h",
      descriptor = "I"
   )
   public static int field3445;
   @OriginalMember(
      owner = "client!rt",
      name = "f",
      descriptor = "I"
   )
   public static int field3446;
   @OriginalMember(
      owner = "client!rt",
      name = "e",
      descriptor = "I"
   )
   public int field3447;
   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "I"
   )
   public int field3448;
   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "I"
   )
   public static int field3449;
   @OriginalMember(
      owner = "client!rt",
      name = "n",
      descriptor = "I"
   )
   public int field3450;
   @OriginalMember(
      owner = "client!rt",
      name = "j",
      descriptor = "I"
   )
   public int field3452;
   @OriginalMember(
      owner = "client!rt",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field3438;
   @OriginalMember(
      owner = "client!rt",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field3451;
   @OriginalMember(
      owner = "client!rt",
      name = "k",
      descriptor = "[Lfq;"
   )
   public static class211[] field3437;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(I)[Leb;"
   )
   public static final class650[] method1939(int arg0) {
      try {
         ++field3443;
         if (arg0 != 64) {
            method1943(77);
         }

         return new class650[]{class380.field5636, class490.field7147, class428.field6190, class554.field8034, class665.field9666, class383.field5660, class21.field341, class38.field925, class524.field7668, class315.field4535, class152.field2434, class282.field3946, class657.field9586, class150.field2408, class582.field8419};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3453[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1940(int arg0) {
      try {
         int var1 = -78 / ((74 - arg0) / 44);
         field3437 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3453[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "([[BLgha;Z)V"
   )
   public static final void method1941(byte[][] arg0, class363 arg1, boolean arg2) {
      boolean var3 = client.field4564;

      try {
         ++field3445;
         int[] var4 = new int[]{-1, 0, 0, 0, 0};
         int var5 = arg0.length;
         if (arg2) {
            method1942(79, -59);
         }

         int var6 = 0;
         if (var3 || ~var5 < ~var6) {
            do {
               byte[] var7 = arg0[var6];
               if (var7 != null) {
                  class473 var8 = new class473(var7);
                  int var9 = class733.field10553[var6] >> 8;
                  int var10 = class733.field10553[var6] & 255;
                  int var11 = var9 * 64 - class347.field4939;
                  int var12 = var10 * 64 - class753.field10887;
                  class743.method5393(4);
                  arg1.method1100(class218.field3299, class753.field10887, var11, var8, class347.field4939, 31686, var12);
                  arg1.method2848(var12, class444.field6473, 1, var4, var11, var8);
                  if (!arg1.field1904 && ~(class36.field883 / 8) == ~var9 && class375.field5579 / 8 == var10 && ~var4[0] != 0) {
                     class360.field5396 = class300.field4199.method4154(var4[0], var4[1], class29.field455, var4[2], var4[3], -19512);
                     class670.field9763 = var4[4];
                  }
               }

               ++var6;
            } while(~var5 < ~var6);
         }

         int var13 = 0;
         if (var3 || ~var5 < ~var13) {
            do {
               int var14 = (class733.field10553[var13] >> 8) * 64 + -class347.field4939;
               int var15 = (class733.field10553[var13] & 255) * 64 + -class753.field10887;
               byte[] var16 = arg0[var13];
               if (var16 == null && class375.field5579 < 800) {
                  class743.method5393(4);
                  arg1.method1096(64, 64, var14, -84, var15);
               }

               ++var13;
            } while(~var5 < ~var13);

         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field3453[6] + (arg0 != null ? field3453[2] : field3453[4]) + ',' + (arg1 != null ? field3453[2] : field3453[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1942(int arg0, int arg1) {
      try {
         if (arg0 != 1010) {
            field3437 = null;
         }

         ++field3444;
         if (arg1 != 18 && ~arg1 != -14 && ~arg1 != -12 && ~arg1 != -22 && ~arg1 != -1012) {
            return ~arg1 == -46 || arg1 == 1010;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3453[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1943(int arg0) {
      try {
         if (arg0 == 0) {
            if (class728.field10486 != null) {
               class728.field10486.method697(true);
               class100.field1663 = null;
               class728.field10486 = null;
            }

            ++field3439;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3453[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(Lvia;B)V"
   )
   public static final void method1944(class587 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1945(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1946(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
