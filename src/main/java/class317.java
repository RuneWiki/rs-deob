import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class317 {
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4379 = new String[]{method2510(method2509("pb\u00125m")), method2510(method2509("ml")), method2510(method2509("mm")), method2510(method2509("pb\u00126m"))};
   @OriginalMember(
      owner = "client!hc",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field4372 = new class418(52, 9);
   @OriginalMember(
      owner = "client!hc",
      name = "e",
      descriptor = "I"
   )
   public static int field4374 = -1;
   @OriginalMember(
      owner = "client!hc",
      name = "f",
      descriptor = "Laka;"
   )
   public static class418 field4376 = new class418(120, 3);
   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field4377 = false;
   @OriginalMember(
      owner = "client!hc",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field4378 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "I"
   )
   public static int field4373;
   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field4375;

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2507(int arg0) {
      try {
         field4376 = null;
         field4378 = null;
         if (arg0 != 264438404) {
            field4374 = -53;
         }

         field4372 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4379[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2508(int arg0) {
      boolean var1 = client.field1481;

      try {
         int var2;
         int var3;
         int var8;
         label78: {
            ++field4373;
            class73.method711(class757.field11093.field11009.method3497(-18033), (byte)-115);
            var2 = (class539.field7889 >> 3) + (class160.field2051 >> 12);
            var3 = (class353.field4940 >> 3) + (class168.field2195 >> 12);
            class674.field9984 = class204.field2593.field10457 = 0;
            class204.field2593.method5651((byte)-114, 8, 8);
            byte var4 = 18;
            class640.field9381 = new byte[var4][];
            class640.field9391 = new byte[var4][];
            class708.field10405 = new int[var4];
            class123.field1614 = new byte[var4][];
            class141.field1781 = new int[var4];
            class455.field6280 = new int[var4];
            class772.field11242 = new byte[var4][];
            class118.field1543 = new int[var4];
            class383.field5321 = new int[var4];
            class359.field5005 = new byte[var4][];
            class108.field1437 = new int[var4];
            class288.field3982 = new int[var4][4];
            int var5 = 0;
            int var6 = -82 / ((arg0 - 68) / 48);
            int var7 = (-(class273.field3491 >> 4) + var2) / 8;
            if (var1) {
               var8 = (var3 - (class211.field2689 >> 4)) / 8;
            } else if (~(((class273.field3491 >> 4) + var2) / 8) > ~var7) {
               var8 = var5;
               if (!var1) {
                  break label78;
               }
            } else {
               var8 = (var3 - (class211.field2689 >> 4)) / 8;
            }

            while(true) {
               if (var1 || ~(((class211.field2689 >> 4) + var3) / 8) <= ~var8) {
                  do {
                     int var9 = (var7 << 8) + var8;
                     class383.field5321[var5] = var9;
                     class141.field1781[var5] = class657.field9803.method2712("m" + var7 + "_" + var8, (byte)-92);
                     class708.field10405[var5] = class657.field9803.method2712("l" + var7 + "_" + var8, (byte)78);
                     class108.field1437[var5] = class657.field9803.method2712("n" + var7 + "_" + var8, (byte)-84);
                     class455.field6280[var5] = class657.field9803.method2712(field4379[1] + var7 + "_" + var8, (byte)-91);
                     class118.field1543[var5] = class657.field9803.method2712(field4379[2] + var7 + "_" + var8, (byte)58);
                     if (~class108.field1437[var5] == 0) {
                        class141.field1781[var5] = -1;
                        class708.field10405[var5] = -1;
                        class455.field6280[var5] = -1;
                        class118.field1543[var5] = -1;
                     }

                     ++var5;
                     ++var8;
                  } while(~(((class211.field2689 >> 4) + var3) / 8) <= ~var8);
               }

               ++var7;
               if (~(((class273.field3491 >> 4) + var2) / 8) > ~var7) {
                  var8 = var5;
                  if (!var1) {
                     break;
                  }
               } else {
                  var8 = (var3 - (class211.field2689 >> 4)) / 8;
               }
            }
         }

         if (var1) {
            class108.field1437[var8] = -1;
            class141.field1781[var8] = -1;
            class708.field10405[var8] = -1;
            class455.field6280[var8] = -1;
            class118.field1543[var8] = -1;
            ++var8;
         }

         while(true) {
            while(class108.field1437.length > var8) {
               class108.field1437[var8] = -1;
               class141.field1781[var8] = -1;
               class708.field10405[var8] = -1;
               class455.field6280[var8] = -1;
               class118.field1543[var8] = -1;
               ++var8;
            }

            if (!var1) {
               byte var10;
               label106: {
                  if (class157.field2022 == 3) {
                     var10 = 4;
                     if (!var1) {
                        break label106;
                     }
                  }

                  if (class157.field2022 == 9) {
                     var10 = 10;
                     if (!var1) {
                        break label106;
                     }
                  }

                  if (~class157.field2022 != -8) {
                     throw new RuntimeException("");
                  }

                  var10 = 8;
                  if (var1) {
                     throw new RuntimeException("");
                  }
               }

               class637.method4698(-119, var3, false, var2, var10);
               return;
            }

            ++var8;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field4379[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2509(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2510(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
