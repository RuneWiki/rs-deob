import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class100 {
   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1322 = new String[]{method907(method906(">c<T2")), method907(method906(">c<U2")), method907(method906(">c<W2"))};
   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "[[Z"
   )
   public static boolean[][] field1317 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!ud",
      name = "d",
      descriptor = "I"
   )
   public static int field1319 = 1406;
   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "I"
   )
   public static int field1321 = 1;
   @OriginalMember(
      owner = "client!ud",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field1320 = false;
   @OriginalMember(
      owner = "client!ud",
      name = "c",
      descriptor = "I"
   )
   public static int field1316;
   @OriginalMember(
      owner = "client!ud",
      name = "f",
      descriptor = "I"
   )
   public static int field1318;

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method903(byte arg0, int arg1) {
      try {
         ++field1316;
         if (arg0 >= -112) {
            method905(-65, (byte)61, -35, 124, -3, -9, 3, 96);
         }

         return arg1 & 255;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1322[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method904(byte arg0) {
      try {
         if (arg0 > -5) {
            field1317 = null;
         }

         field1317 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1322[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(IBIIIIII)V"
   )
   public static final void method905(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         int var8;
         label30: {
            ++field1318;
            var8 = arg2 + -334;
            if (var8 < 0) {
               var8 = 0;
               if (!client.field1481) {
                  break label30;
               }
            }

            if (var8 > 100) {
               var8 = 100;
            }
         }

         int var9 = (-class198.field2529 + class147.field1841) * var8 / 100 + class198.field2529;
         class629.field9293 = class629.field9295 * var9 >> 8;
         int var17 = arg3 * var9 >> 8;
         int var10 = -arg0 + 16384 & 16383;
         int var11 = 16383 & -arg6 + 16384;
         int var12 = 0;
         int var13 = 0;
         if (arg1 == -72) {
            int var14 = var17;
            if (var10 != 0) {
               var13 = class746.field10907[var10] * -var17 >> 14;
               var14 = class746.field10897[var10] * var17 >> 14;
            }

            if (~var11 != -1) {
               var12 = class746.field10907[var11] * var14 >> 14;
               var14 = class746.field10897[var11] * var14 >> 14;
            }

            class168.field2195 = arg7 - var14;
            class160.field2051 = arg4 - var12;
            class546.field8031 = -var13 + arg5;
            class242.field3054 = arg6;
            class673.field9969 = 0;
            class653.field9755 = arg0;
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field1322[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method906(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method907(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
