import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class733 extends class247 {
   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10423 = new String[]{method5309(method5308("8\r\u001c<\u000b")), method5309(method5308("8\r\u001c9\u000b")), method5309(method5308("8\r\u001c>\u000b")), method5309(method5308("8\r\u001c?\u000b")), method5309(method5308("(@\u001cS^")), method5309(method5308("=\u001b^\u0011"))};
   @OriginalMember(
      owner = "client!kc",
      name = "j",
      descriptor = "[Leca;"
   )
   public static class590[] field10416 = new class590[4];
   @OriginalMember(
      owner = "client!kc",
      name = "n",
      descriptor = "[[I"
   )
   public static int[][] field10419 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!kc",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10420 = null;
   @OriginalMember(
      owner = "client!kc",
      name = "r",
      descriptor = "[[F"
   )
   public static float[][] field10422 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!kc",
      name = "k",
      descriptor = "I"
   )
   public static int field10414;
   @OriginalMember(
      owner = "client!kc",
      name = "p",
      descriptor = "I"
   )
   public static int field10415;
   @OriginalMember(
      owner = "client!kc",
      name = "q",
      descriptor = "I"
   )
   public int field10417;
   @OriginalMember(
      owner = "client!kc",
      name = "m",
      descriptor = "I"
   )
   public static int field10418;
   @OriginalMember(
      owner = "client!kc",
      name = "l",
      descriptor = "I"
   )
   public int field10421;

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5304(int arg0, int arg1, int arg2) {
      try {
         ++field10414;
         if (~arg2 == 0) {
            return 12345678;
         } else {
            label25: {
               arg0 = (127 & arg2) * arg0 >> 7;
               if (~arg0 <= -3) {
                  if (arg0 <= 126) {
                     break label25;
                  }

                  arg0 = 126;
                  if (!client.field10022) {
                     break label25;
                  }
               }

               arg0 = 2;
            }

            if (arg1 > -119) {
               method5307(1.0483693F, true);
            }

            return (arg2 & 65408) - -arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10423[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5305(byte arg0) {
      try {
         field10420 = null;
         if (arg0 != 105) {
            method5305((byte)-80);
         }

         field10416 = null;
         field10419 = null;
         field10422 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10423[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "([II[Ljava/lang/String;II)V"
   )
   public static final void method5306(int[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg3 > arg1) {
            int var6 = (arg1 + arg3) / 2;
            int var7 = arg1;
            String var8 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var8;
            int var9 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = arg1;
            String var11;
            int var12;
            if (var5) {
               if (var8 != null) {
                  if (arg2[arg1] != null) {
                     if (arg2[arg1].compareTo(var8) < (arg1 & 1)) {
                        var11 = arg2[arg1];
                        arg2[arg1] = arg2[arg1];
                        arg2[arg1] = var11;
                        var12 = arg0[arg1];
                        arg0[arg1] = arg0[arg1];
                        var7 = arg1 + 1;
                        arg0[arg1] = var12;
                        var10 = arg1 + 1;
                     } else {
                        var10 = arg1 + 1;
                     }
                  } else {
                     var10 = arg1 + 1;
                  }
               } else {
                  var11 = arg2[arg1];
                  arg2[arg1] = arg2[arg1];
                  arg2[arg1] = var11;
                  var12 = arg0[arg1];
                  arg0[arg1] = arg0[arg1];
                  var7 = arg1 + 1;
                  arg0[arg1] = var12;
                  var10 = arg1 + 1;
               }
            }

            while(true) {
               while(~var10 > ~arg3) {
                  if (var8 != null) {
                     if (arg2[var10] != null) {
                        if (arg2[var10].compareTo(var8) < (var10 & 1)) {
                           var11 = arg2[var10];
                           arg2[var10] = arg2[var7];
                           arg2[var7] = var11;
                           var12 = arg0[var10];
                           arg0[var10] = arg0[var7];
                           arg0[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg2[var10];
                     arg2[var10] = arg2[var7];
                     arg2[var7] = var11;
                     var12 = arg0[var10];
                     arg0[var10] = arg0[var7];
                     arg0[var7++] = var12;
                     ++var10;
                  }
               }

               arg2[arg3] = arg2[var7];
               arg2[var7] = var8;
               arg0[arg3] = arg0[var7];
               arg0[var7] = var9;
               method5306(arg0, arg1, arg2, var7 - 1, 52);
               if (!var5) {
                  method5306(arg0, var7 + 1, arg2, arg3, 121);
                  break;
               }

               var11 = arg2[var10];
               arg2[var10] = arg2[var7];
               arg2[var7] = var11;
               var12 = arg0[var10];
               arg0[var10] = arg0[var7];
               arg0[var7++] = var12;
               ++var10;
            }
         }

         if (arg4 > 35) {
            ++field10415;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field10423[3] + (arg0 != null ? field10423[4] : field10423[5]) + ',' + arg1 + ',' + (arg2 != null ? field10423[4] : field10423[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(FZ)F"
   )
   public static final float method5307(float arg0, boolean arg1) {
      try {
         if (arg1) {
            return 0.4387871F;
         } else {
            ++field10418;
            return arg0 * arg0 * arg0 * ((arg0 * 6.0F + -15.0F) * arg0 + 10.0F);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10423[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5308(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5309(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
