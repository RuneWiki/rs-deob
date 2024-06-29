import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class224 {
   @OriginalMember(
      owner = "client!tl",
      name = "k",
      descriptor = "Lsa;"
   )
   private class39 field3187;
   @OriginalMember(
      owner = "client!tl",
      name = "m",
      descriptor = "I"
   )
   private int field3180;
   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "[[I"
   )
   private int[][] field3179;
   @OriginalMember(
      owner = "client!tl",
      name = "f",
      descriptor = "[Z"
   )
   private boolean[] field3184;
   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3188 = new String[]{method1930(method1929("\u0001fKE}")), method1930(method1929("\u0001fKA}")), method1930(method1929("\u0001fKC}")), method1930(method1929("\u0001fK@}")), method1930(method1929("\u0001fKF}")), method1930(method1929("\u001b\u007f\th")), method1930(method1929("\u000e$K*(")), method1930(method1929("\u0001fK8<\u001bc\u0011:}")), method1930(method1929("\u0001fKB}")), method1930(method1929("\u0001fKG}"))};
   @OriginalMember(
      owner = "client!tl",
      name = "l",
      descriptor = "I"
   )
   public static int field3175 = 0;
   @OriginalMember(
      owner = "client!tl",
      name = "j",
      descriptor = "I"
   )
   public static int field3176;
   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "I"
   )
   public static int field3178;
   @OriginalMember(
      owner = "client!tl",
      name = "g",
      descriptor = "I"
   )
   public static int field3181;
   @OriginalMember(
      owner = "client!tl",
      name = "d",
      descriptor = "I"
   )
   public static int field3182;
   @OriginalMember(
      owner = "client!tl",
      name = "i",
      descriptor = "I"
   )
   public static int field3183;
   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "I"
   )
   public static int field3185;
   @OriginalMember(
      owner = "client!tl",
      name = "e",
      descriptor = "I"
   )
   public static int field3186;
   @OriginalMember(
      owner = "client!tl",
      name = "h",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field3177;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(IILha;)Lma;"
   )
   public static final class148 method1922(int arg0, int arg1, class17 arg2) {
      try {
         ++field3176;
         if (arg1 > -59) {
            return null;
         } else {
            class452 var3 = (class452)class704.field10127.method3101(-1, (long)arg0);
            if (var3 != null) {
               class40 var4 = var3.field6590.method4102(-52);
               var3.field6585 = true;
               if (var4 != null) {
                  return var4.method472(arg2, (byte)-90);
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3188[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3188[6] : field3188[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1923(byte arg0) {
      try {
         if (arg0 == 52) {
            field3177 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3188[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method1924(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field3185;
         class380 var4 = class231.method2056(arg3, arg0, Integer.MIN_VALUE);
         if (var4 == null) {
            return -1;
         } else if (arg2 >= 0 && ~var4.field5559.length < ~arg2) {
            int var5 = 12 / ((arg1 - 71) / 49);
            return var4.field5559[arg2];
         } else {
            return -1;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3188[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "(II)Lpea;"
   )
   public static final class455 method1925(int arg0, int arg1) {
      try {
         if (arg0 > -49) {
            field3177 = null;
         }

         ++field3181;
         return new class455(arg1, false);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3188[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "(II)Lke;"
   )
   public final class333 method1926(int arg0, int arg1) {
      try {
         ++field3182;
         byte[] var3 = this.field3187.method460((byte)-11, arg0, arg1);
         class333 var4 = new class333();
         var4.method2665(-1, new class65(var3));
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3188[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method1927(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field3178;
         if (~arg1 <= -1 && ~arg1 > ~this.field3179.length) {
            if (this.field3184[arg1] && this.field3179[arg1].length > 1) {
               int var4 = ~this.field3180 == 0 ? 0 : 1;
               Random var5 = new Random();
               int[] var6 = new int[this.field3179[arg1].length];
               class474.method3641(this.field3179[arg1], 0, var6, 0, var6.length);
               int var7 = var4;
               int var8;
               int var9;
               if (var3) {
                  var8 = class633.method4632(12, var5, var6.length + -var4) + var4;
                  var9 = var6[var4];
                  var6[var4] = var6[var8];
                  var6[var8] = var9;
                  var7 = var4 + 1;
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (~var7 <= ~var6.length) {
                     var10000 = arg0;
                     var10001 = -29760;
                     if (!var3) {
                        if (arg0 != -29760) {
                           method1925(31, -122);
                        }

                        return var6;
                     }
                  } else {
                     var10000 = class633.method4632(12, var5, var6.length + -var4);
                     var10001 = var4;
                  }

                  var8 = var10000 + var10001;
                  var9 = var6[var7];
                  var6[var7] = var6[var8];
                  var6[var8] = var9;
                  ++var7;
               }
            } else {
               return this.field3179[arg1];
            }
         } else {
            return this.field3180 == -1 ? new int[0] : new int[]{this.field3180};
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3188[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1928(byte arg0) {
      try {
         ++field3186;
         if (arg0 <= 41) {
            return true;
         } else {
            return ~this.field3180 != 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class224(class392 param1, int param2, class39 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
