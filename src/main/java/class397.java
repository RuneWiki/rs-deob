import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class397 extends InputStream {
   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5586 = new String[]{method3021(method3020("\u0007\u001b\u0006E&")), method3021(method3020("\u0007\u001b\u0006uk\u000b\t\u0000")), method3021(method3020("\u0007\u001b\u0006F&")), method3021(method3020("\u0007\u001b\u0006D&"))};
   @OriginalMember(
      owner = "client!mv",
      name = "e",
      descriptor = "Lnw;"
   )
   public static class616 field5578 = new class616(66, 7);
   @OriginalMember(
      owner = "client!mv",
      name = "d",
      descriptor = "Ldd;"
   )
   public static class735 field5583 = new class735(9, 0, 4, 1);
   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field5585 = new int[6];
   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "I"
   )
   public static int field5584 = 0;
   @OriginalMember(
      owner = "client!mv",
      name = "g",
      descriptor = "I"
   )
   public static int field5580;
   @OriginalMember(
      owner = "client!mv",
      name = "f",
      descriptor = "I"
   )
   public static int field5581;
   @OriginalMember(
      owner = "client!mv",
      name = "h",
      descriptor = "I"
   )
   public static int field5582;
   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "[Lqc;"
   )
   public static class777[] field5579;

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3017(byte arg0) {
      try {
         field5578 = null;
         field5583 = null;
         field5579 = null;
         if (arg0 != -126) {
            field5578 = null;
         }

         field5585 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5586[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3018(int arg0, int arg1) {
      try {
         ++field5580;
         if (arg0 >= -73) {
            field5584 = -71;
         }

         if (class603.method4400(2, arg1)) {
            class771.method5517(-1, -1, class468.field6451[arg1]);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5586[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3019(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5582;
         if (class445.field6162 != arg1) {
            if (~arg1 == -15 || ~arg1 == -16) {
               class204.method1542((byte)100);
            }

            if (arg1 != 14 && class613.field8572 != null) {
               class613.field8572.method1031(0);
               class613.field8572 = null;
            }

            if (~arg1 == -4) {
               class238.method1783(true, class709.field10352 != class366.field5168);
            }

            if (~arg1 == -8) {
               class284.method2160(0, class366.field5168 != class149.field1945);
            }

            label138: {
               if (~arg1 != -6 && ~arg1 != -14) {
                  if (~arg1 != -7 && arg1 != 9) {
                     break label138;
                  }

                  class204.method1542((byte)103);
                  if (!var2) {
                     break label138;
                  }
               }

               class369.method2847(-13697);
            }

            int var3 = -52 / ((arg0 - -13) / 34);
            if (class434.method3239(7469, class445.field6162)) {
               class532.field7277.field920 = 2;
               class335.field4809.field920 = 2;
               class156.field2009.field920 = 2;
               class281.field3754.field920 = 2;
               class737.field10752.field920 = 2;
               class355.field5060.field920 = 2;
               class310.field4108.field920 = 2;
            }

            if (class434.method3239(7469, arg1)) {
               class76.field957 = 0;
               class12.field145 = 0;
               class133.field1728 = 1;
               class14.field170 = 1;
               class256.field3272 = 0;
               class179.method1380(true, 41);
               class532.field7277.field920 = 1;
               class335.field4809.field920 = 1;
               class156.field2009.field920 = 1;
               class281.field3754.field920 = 1;
               class737.field10752.field920 = 1;
               class355.field5060.field920 = 1;
               class310.field4108.field920 = 1;
            }

            if (arg1 == 12 || arg1 == 3) {
               class472.method3458((byte)118);
            }

            boolean var4 = ~arg1 == -3 || class390.method2967(true, arg1) || class265.method2032(116, arg1);
            boolean var5 = ~class445.field6162 == -3 || class390.method2967(true, class445.field6162) || class265.method2032(48, class445.field6162);
            if (var5 == !var4) {
               label107: {
                  if (var4) {
                     label104: {
                        class215.field2664 = class548.field7494;
                        if (class674.field9907.field8426.method5190((byte)-64) == 0) {
                           class109.method964(2, 17818);
                           if (!var2) {
                              break label104;
                           }
                        }

                        class250.method1879((byte)-18, 2, false, 0, class590.field8143, class674.field9907.field8426.method5190((byte)-69), class548.field7494);
                        class191.method1437((byte)116);
                     }

                     class73.field896.method1089(false, -30001);
                     if (!var2) {
                        break label107;
                     }
                  }

                  class109.method964(2, 17818);
                  class73.field896.method1089(true, -30001);
               }
            }

            if (class434.method3239(7469, arg1) || ~arg1 == -15 || arg1 == 15) {
               class338.field4832.method560();
            }

            class445.field6162 = arg1;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5586[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         class173.method1347(-71, 30000L);
         ++field5581;
         return -1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5586[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
