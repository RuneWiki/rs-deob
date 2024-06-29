import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class313 {
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4349 = new String[]{method2492(method2491("\u0018qV\u0003s")), method2492(method2491("\n7Vi&")), method2492(method2491("\r*\u0014A")), method2492(method2491("\n7Vn&")), method2492(method2491("\n7Vo&")), method2492(method2491("\n7Vl&"))};
   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field4343 = new int[128][128];
   @OriginalMember(
      owner = "client!ih",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field4346 = new int[3];
   @OriginalMember(
      owner = "client!ih",
      name = "b",
      descriptor = "I"
   )
   public static int field4348 = 1;
   @OriginalMember(
      owner = "client!ih",
      name = "g",
      descriptor = "I"
   )
   public static int field4342;
   @OriginalMember(
      owner = "client!ih",
      name = "d",
      descriptor = "I"
   )
   public static int field4344;
   @OriginalMember(
      owner = "client!ih",
      name = "e",
      descriptor = "I"
   )
   public static int field4345;
   @OriginalMember(
      owner = "client!ih",
      name = "c",
      descriptor = "I"
   )
   public static int field4347;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static final void method2487(int arg0, int arg1, String arg2) {
      try {
         ++field4347;
         int var3 = 58 % ((-72 - arg0) / 40);
         class487 var4 = class2.method12((long)arg1, 3, (byte)43);
         var4.method3694(-21792);
         var4.field6800 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4349[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4349[0] : field4349[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIIIIIIII)Z"
   )
   public static final boolean method2488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field4342;
         if (arg7 <= 57) {
            field4348 = -8;
         }

         if (arg5 < arg0 + arg4 && ~arg0 > ~(arg5 - -arg6)) {
            return arg8 < arg1 + arg3 && arg3 < arg8 - -arg2;
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4349[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(ILiu;[III[I)Leh;"
   )
   public static final class229 method2489(int arg0, class530 arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
      boolean var6 = client.field1481;

      try {
         if (arg4 != 7050) {
            field4346 = null;
         }

         ++field4345;
         byte[] var7 = new byte[arg0 * arg3];
         int var8 = 0;
         if (!var6 && ~var8 <= ~arg0) {
            return new class229(arg1, arg3, arg0, var7);
         } else {
            do {
               int var9 = arg3 * var8 + arg2[var8];
               int var10 = 0;
               if (var6) {
                  var7[var9++] = -1;
                  ++var10;
               }

               while(true) {
                  while(arg5[var8] > var10) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  if (!var6) {
                     ++var8;
                     break;
                  }

                  ++var10;
               }
            } while(~var8 > ~arg0);

            return new class229(arg1, arg3, arg0, var7);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field4349[5] + arg0 + ',' + (arg1 != null ? field4349[0] : field4349[2]) + ',' + (arg2 != null ? field4349[0] : field4349[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4349[0] : field4349[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2490(byte arg0) {
      try {
         field4346 = null;
         int var1 = -46 / ((60 - arg0) / 40);
         field4343 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4349[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
