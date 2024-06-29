import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class194 extends class444 {
   @OriginalMember(
      owner = "client!ar",
      name = "s",
      descriptor = "B"
   )
   public byte field3010 = 5;
   @OriginalMember(
      owner = "client!ar",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3019 = new String[]{method1722(method1721("/\u00165Y\u000e")), method1722(method1721(" \u0011ws")), method1722(method1721("/\u00165W\u000e")), method1722(method1721("5J51[")), method1722(method1721("/\u00165V\u000e")), method1722(method1721("/\u00165X\u000e"))};
   @OriginalMember(
      owner = "client!ar",
      name = "A",
      descriptor = "Lnaa;"
   )
   public static class113 field3006 = new class113(73, 4);
   @OriginalMember(
      owner = "client!ar",
      name = "y",
      descriptor = "Lsn;"
   )
   public static class675 field3016 = new class675();
   @OriginalMember(
      owner = "client!ar",
      name = "C",
      descriptor = "Lfq;"
   )
   public static class374 field3017 = null;
   @OriginalMember(
      owner = "client!ar",
      name = "t",
      descriptor = "Luk;"
   )
   public static class498 field3018 = new class498(51, 6);
   @OriginalMember(
      owner = "client!ar",
      name = "D",
      descriptor = "I"
   )
   public int field3005;
   @OriginalMember(
      owner = "client!ar",
      name = "r",
      descriptor = "I"
   )
   public int field3007;
   @OriginalMember(
      owner = "client!ar",
      name = "v",
      descriptor = "I"
   )
   public static int field3008;
   @OriginalMember(
      owner = "client!ar",
      name = "u",
      descriptor = "I"
   )
   public int field3009;
   @OriginalMember(
      owner = "client!ar",
      name = "x",
      descriptor = "I"
   )
   public int field3011;
   @OriginalMember(
      owner = "client!ar",
      name = "B",
      descriptor = "I"
   )
   public static int field3012;
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "I"
   )
   public int field3013;
   @OriginalMember(
      owner = "client!ar",
      name = "w",
      descriptor = "I"
   )
   public int field3014;
   @OriginalMember(
      owner = "client!ar",
      name = "E",
      descriptor = "I"
   )
   public static int field3015;
   @OriginalMember(
      owner = "client!ar",
      name = "F",
      descriptor = "Z"
   )
   public boolean field3004;

   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method1717(int arg0) {
      try {
         field3018 = null;
         field3016 = null;
         if (arg0 != 15467) {
            field3017 = null;
         }

         field3017 = null;
         field3006 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3019[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(II[BIII)V",
      line = 19
   )
   public static final void method1718(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field3015;
         if (~arg3 < ~arg4) {
            int var15 = arg3 - arg4 >> 2;
            arg5 += arg4;
            int var9;
            if (var6) {
               var9 = arg5 + 1;
               arg2[arg5] = 1;
               int var10 = var9 + 1;
               arg2[var9] = 1;
               int var11 = var10 + 1;
               arg2[var10] = 1;
               arg5 = var11 + 1;
               arg2[var11] = 1;
            }

            while(true) {
               while(true) {
                  --var15;
                  if (~var15 > -1) {
                     if (!var6) {
                        if (arg1 != 0) {
                           method1718(-124, -56, (byte[])null, 12, -36, 123);
                        }

                        var15 = -arg4 + arg3 & 3;
                        if (!var6) {
                           --var15;
                           if (var15 < 0) {
                              return;
                           }
                        }

                        do {
                           arg2[arg5++] = 1;
                           --var15;
                        } while(var15 >= 0);

                        return;
                     }

                     arg2[arg5++] = 1;
                  } else {
                     var9 = arg5 + 1;
                     arg2[arg5] = 1;
                     arg2[var9++] = 1;
                     arg2[var9++] = 1;
                     arg5 = var9 + 1;
                     arg2[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3019[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3019[3] : field3019[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(II)V",
      line = 53
   )
   public static final void method1719(int arg0, int arg1) {
      try {
         ++field3012;
         class304 var2 = class670.field9994;
         synchronized(class670.field9994) {
            class670.field9994.method2552(arg1, 21533);
         }

         int var3 = 31 / ((arg0 - 52) / 48);
         class304 var4 = class357.field5503;
         synchronized(class357.field5503) {
            class357.field5503.method2552(arg1, 21533);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3019[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(B)V",
      line = 99
   )
   public static final void method1720(byte arg0) {
      try {
         if (arg0 != -117) {
            method1719(-62, -85);
         }

         ++field3008;
         if (~class687.field10213.field536.method5531(480102311) == -1 && class464.field7054 != class426.field6582) {
            class510.method3965(false, class294.field4663, 12, class335.field5146, (byte)72);
         } else {
            class399.method3219(-19, class351.field5356);
            if (class780.field11438 != class464.field7054) {
               class462.method3586(arg0 ^ -140);
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3019[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
