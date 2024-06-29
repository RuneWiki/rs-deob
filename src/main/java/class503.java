import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class503 implements class603 {
   @OriginalMember(
      owner = "client!bca",
      name = "k",
      descriptor = "Lww;"
   )
   private class339 field6986;
   @OriginalMember(
      owner = "client!bca",
      name = "i",
      descriptor = "Lwga;"
   )
   private class533 field6985;
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6995 = new String[]{method3805(method3804("4\u000eT\u0000|")), method3805(method3804("!U\u0016B")), method3805(method3804("-C\u001b\u0000=&N\u0013Z?g")), method3805(method3804("-C\u001b\u0000Dg")), method3805(method3804("-C\u001b\u0000Gg")), method3805(method3804("-C\u001b\u0000Fg")), method3805(method3804("-C\u001b\u0000Bg")), method3805(method3804("-C\u001b\u0000Ig")), method3805(method3804("-C\u001b\u0000Eg"))};
   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "[Z"
   )
   public static boolean[] field6987 = new boolean[100];
   @OriginalMember(
      owner = "client!bca",
      name = "j",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6983 = new String[200];
   @OriginalMember(
      owner = "client!bca",
      name = "d",
      descriptor = "F"
   )
   public static float field6991;
   @OriginalMember(
      owner = "client!bca",
      name = "l",
      descriptor = "I"
   )
   public static int field6984;
   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "I"
   )
   public static int field6988;
   @OriginalMember(
      owner = "client!bca",
      name = "h",
      descriptor = "I"
   )
   public static int field6990;
   @OriginalMember(
      owner = "client!bca",
      name = "e",
      descriptor = "I"
   )
   public static int field6992;
   @OriginalMember(
      owner = "client!bca",
      name = "f",
      descriptor = "I"
   )
   public static int field6993;
   @OriginalMember(
      owner = "client!bca",
      name = "g",
      descriptor = "I"
   )
   public static int field6994;
   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "Lpd;"
   )
   private class648 field6989;

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         if (arg1) {
            int var3 = class204.field2605 > class286.field3961 ? class204.field2605 : class286.field3961;
            int var4 = ~class91.field1242 >= ~class627.field9254 ? class627.field9254 : class91.field1242;
            int var5 = this.field6989.method2406();
            int var6 = this.field6989.method2396();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (-var9 + var4) / 2;
            if (~var9 < ~var4) {
               var9 = var4;
               var10 = 0;
               var8 = var4 * var5 / var6;
               var7 = (-var8 + var3) / 2;
            }

            this.field6989.method4766(var7, var10, var8, var9);
         }

         ++field6988;
         if (arg0 != -22493) {
            this.method222(-91, false);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field6995[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method223(int arg0) {
      try {
         ++field6993;
         if (arg0 != -28722) {
            field6991 = -0.27332747F;
         }

         this.field6989 = class13.method110(this.field6986, this.field6985.field7826, arg0 ^ -28879);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6995[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method221(int arg0) {
      try {
         ++field6990;
         if (arg0 != -10439) {
            this.field6989 = null;
         }

         return this.field6986.method2681((byte)101, this.field6985.field7826);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6995[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3801(int arg0) {
      try {
         field6987 = null;
         field6983 = null;
         if (arg0 < 57) {
            field6992 = -95;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6995[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "<init>",
      descriptor = "(Lww;Lwga;)V"
   )
   public class503(class339 arg0, class533 arg1) {
      try {
         this.field6986 = arg0;
         this.field6985 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6995[2] + (arg0 != null ? field6995[0] : field6995[1]) + ',' + (arg1 != null ? field6995[0] : field6995[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Lha;ILoca;IB)V"
   )
   public static final void method3802(class479 param0, int param1, class642 param2, int param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3803(int arg0, int arg1) {
      try {
         ++field6994;
         int var2 = -25 % ((arg1 - 61) / 59);
         return arg0 >>> 8;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6995[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3804(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3805(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
