import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class86 extends class70 {
   @OriginalMember(
      owner = "client!gw",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1187 = new String[]{method818(method817("x'8w\u001c")), method818(method817("d~8\u001aI")), method818(method817("q%zX")), method818(method817("x'8s\u001c")), method818(method817("x'8|\u001c")), method818(method817("x'8v\u001c")), method818(method817("x'8p\u001c")), method818(method817("x'8q\u001c")), method818(method817("x'8{\u001c"))};
   @OriginalMember(
      owner = "client!gw",
      name = "O",
      descriptor = "I"
   )
   public static int field1176 = 0;
   @OriginalMember(
      owner = "client!gw",
      name = "J",
      descriptor = "I"
   )
   public static int field1177;
   @OriginalMember(
      owner = "client!gw",
      name = "Q",
      descriptor = "I"
   )
   public static int field1178;
   @OriginalMember(
      owner = "client!gw",
      name = "M",
      descriptor = "I"
   )
   public static int field1179;
   @OriginalMember(
      owner = "client!gw",
      name = "P",
      descriptor = "I"
   )
   public static int field1181;
   @OriginalMember(
      owner = "client!gw",
      name = "T",
      descriptor = "I"
   )
   public static int field1182;
   @OriginalMember(
      owner = "client!gw",
      name = "R",
      descriptor = "I"
   )
   public static int field1184;
   @OriginalMember(
      owner = "client!gw",
      name = "L",
      descriptor = "I"
   )
   public static int field1186;
   @OriginalMember(
      owner = "client!gw",
      name = "S",
      descriptor = "[I"
   )
   public static int[] field1180;
   @OriginalMember(
      owner = "client!gw",
      name = "N",
      descriptor = "[Lpd;"
   )
   public static class648[] field1183;
   @OriginalMember(
      owner = "client!gw",
      name = "I",
      descriptor = "[[Z"
   )
   public static boolean[][] field1185;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1178;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            return null;
         } else {
            if (super.field926.field5048) {
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int var8 = 0;
               if (var3 || class262.field3328 > var8) {
                  do {
                     this.method816(107, arg1, var8);
                     int[][] var9 = this.method696(class233.field2894, 0, 32767);
                     var5[var8] = var9[0][class492.field6879];
                     var6[var8] = var9[1][class492.field6879];
                     var7[var8] = var9[2][class492.field6879];
                     ++var8;
                  } while(class262.field3328 > var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field1187[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILd;Ljava/awt/Canvas;II)Lha;"
   )
   public static final class479 method813(int arg0, class102 arg1, Canvas arg2, int arg3, int arg4) {
      try {
         int var5 = -62 / ((62 - arg0) / 36);
         ++field1177;
         return new class53(arg2, arg1, arg4, arg3);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1187[4] + arg0 + ',' + (arg1 != null ? field1187[1] : field1187[2]) + ',' + (arg2 != null ? field1187[1] : field1187[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method814(byte arg0) {
      try {
         if (arg0 != 56) {
            method813(48, (class102)null, (Canvas)null, 56, 16);
         }

         field1185 = null;
         field1180 = null;
         field1183 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1187[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 <= -34) {
            if (arg2 == 0) {
               super.field930 = ~arg1.method640(255) == -2;
            }

            ++field1184;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1187[0] + arg0 + ',' + (arg1 != null ? field1187[1] : field1187[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1181;
         if (arg0 != -63) {
            field1183 = null;
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = 0;
            if (var3 || ~var5 > ~class262.field3328) {
               do {
                  this.method816(arg0 ^ -59, arg1, var5);
                  int[] var6 = this.method690(-48, 0, class233.field2894);
                  var4[var5] = var6[class492.field6879];
                  ++var5;
               } while(~var5 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1187[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method815(int arg0) {
      try {
         ++field1179;
         if (class359.field5014 != null) {
            if (arg0 >= -96) {
               field1185 = null;
            }

            class532.field7800 = new class76();
            class532.field7800.method734(class359.field5014.field8233.method4490(class782.field11389, -16777216), class359.field5014.field8235, class612.field9013, -1, class359.field5014);
            class511.field7135 = new Thread(class532.field7800, "");
            class511.field7135.start();
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1187[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "()V"
   )
   public class86() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "(III)V"
   )
   private final void method816(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label104: {
            ++field1182;
            int var5 = -60 / ((arg0 - 56) / 39);
            int var6 = class17.field290[arg2];
            int var7 = class502.field6979[arg1];
            float var8 = (float)Math.atan2((double)(var6 + -2048), (double)(var7 - 2048));
            if (!((double)var8 >= -3.141592653589793D) || !((double)var8 <= -2.356194490192345D)) {
               if ((double)var8 <= -1.5707963267948966D && (double)var8 >= -2.356194490192345D) {
                  class492.field6879 = arg1;
                  class233.field2894 = arg2;
                  if (!var4) {
                     break label104;
                  }
               }

               if ((double)var8 <= -0.7853981633974483D && (double)var8 >= -1.5707963267948966D) {
                  class492.field6879 = -arg1 + class262.field3328;
                  class233.field2894 = arg2;
                  if (!var4) {
                     break label104;
                  }
               }

               if (var8 <= 0.0F && (double)var8 >= -0.7853981633974483D) {
                  class233.field2894 = class99.field1313 - arg1;
                  class492.field6879 = arg2;
                  if (!var4) {
                     break label104;
                  }
               }

               if (!(var8 >= 0.0F) || !((double)var8 <= 0.7853981633974483D)) {
                  if (!((double)var8 >= 0.7853981633974483D) || !((double)var8 <= 1.5707963267948966D)) {
                     if ((double)var8 >= 1.5707963267948966D && (double)var8 <= 2.356194490192345D) {
                        class233.field2894 = class99.field1313 - arg2;
                        class492.field6879 = arg1;
                        if (!var4) {
                           break label104;
                        }
                     }

                     if (!((double)var8 >= 2.356194490192345D) || !((double)var8 <= 3.141592653589793D)) {
                        break label104;
                     }

                     class233.field2894 = arg1;
                     class492.field6879 = -arg2 + class262.field3328;
                     if (!var4) {
                        break label104;
                     }
                  }

                  class233.field2894 = class99.field1313 - arg2;
                  class492.field6879 = -arg1 + class262.field3328;
                  if (!var4) {
                     break label104;
                  }
               }

               class233.field2894 = -arg1 + class99.field1313;
               class492.field6879 = -arg2 + class262.field3328;
               if (!var4) {
                  break label104;
               }
            }

            class492.field6879 = arg2;
            class233.field2894 = arg1;
         }

         class492.field6879 &= class174.field2249;
         class233.field2894 &= class623.field9205;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1187[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method817(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method818(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
