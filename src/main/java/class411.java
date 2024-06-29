import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class411 extends class616 {
   @OriginalMember(
      owner = "client!lp",
      name = "F",
      descriptor = "S"
   )
   public short field6309;
   @OriginalMember(
      owner = "client!lp",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6311 = new String[]{method3146(method3145("\u0019M\u000e\\J")), method3146(method3145("\u000e\u0013\u000e3\u001f")), method3146(method3145("\f\u0016L\u001e")), method3146(method3145("\u000e\u0013\u000eN^\f\nTL\u001f")), method3146(method3145("\u000e\u0013\u000e6\u001f")), method3146(method3145("\u000e\u0013\u000e1\u001f")), method3146(method3145("\u000e\u0013\u000e:\u001f")), method3146(method3145("\u000e\u0013\u000e7\u001f"))};
   @OriginalMember(
      owner = "client!lp",
      name = "J",
      descriptor = "Lsda;"
   )
   public static class269 field6301 = new class269(73, 4);
   @OriginalMember(
      owner = "client!lp",
      name = "G",
      descriptor = "[[I"
   )
   public static int[][] field6307 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!lp",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field6310 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!lp",
      name = "D",
      descriptor = "I"
   )
   public static int field6300;
   @OriginalMember(
      owner = "client!lp",
      name = "B",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!lp",
      name = "E",
      descriptor = "I"
   )
   public static int field6303;
   @OriginalMember(
      owner = "client!lp",
      name = "A",
      descriptor = "I"
   )
   public static int field6304;
   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "I"
   )
   public static int field6305;
   @OriginalMember(
      owner = "client!lp",
      name = "y",
      descriptor = "I"
   )
   public static int field6308;
   @OriginalMember(
      owner = "client!lp",
      name = "I",
      descriptor = "J"
   )
   public static long field6306;

   @OriginalMember(
      owner = "client!lp",
      name = "m",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3143(int arg0) {
      try {
         field6301 = null;
         field6307 = null;
         if (arg0 != -9608) {
            method3144(50, -69);
         }

         field6310 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6311[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(BLha;)Z",
      line = 18
   )
   public final boolean method1880(byte arg0, class66 arg1) {
      try {
         ++field6304;
         if (arg0 <= 63) {
            this.field6309 = 89;
         }

         return class220.method1673(this, -61, super.field9003 >> class459.field6950, super.field9005, super.field9007 >> class459.field6950);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6311[1] + arg0 + ',' + (arg1 != null ? field6311[0] : field6311[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(II)Z",
      line = 30
   )
   public static final boolean method3144(int arg0, int arg1) {
      try {
         if (arg1 != -4) {
            field6306 = -67L;
         }

         ++field6302;
         return ~arg0 == -4 || ~arg0 == -6 || ~arg0 == -7;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6311[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "([Llja;I)I",
      line = 43
   )
   public final int method1881(class744[] arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != -52) {
            this.method1883(true);
         }

         int var4;
         int var5;
         int var6;
         label114: {
            ++field6303;
            var4 = super.field9003 >> class459.field6950;
            var5 = super.field9007 >> class459.field6950;
            var6 = 0;
            if (class681.field10228 == var4) {
               ++var6;
               if (var3 == 0) {
                  break label114;
               }
            }

            if (~class681.field10228 > ~var4) {
               var6 += 2;
            }
         }

         label109: {
            if (class518.field7555 != var5) {
               if (var5 >= class518.field7555) {
                  break label109;
               }

               var6 += 6;
               if (var3 == 0) {
                  break label109;
               }
            }

            var6 += 3;
         }

         int var7 = class603.field8840[var6];
         if ((var7 & this.field6309) != 0) {
            return this.method4469(var4, arg0, var5, (byte)-5);
         } else if (this.field6309 == 1 && var4 > 0) {
            return this.method4469(var4 + -1, arg0, var5, (byte)-5);
         } else if (this.field6309 == 4 && class239.field3036 >= var4) {
            return this.method4469(var4 + 1, arg0, var5, (byte)-5);
         } else if (~this.field6309 == -9 && var5 > 0) {
            return this.method4469(var4, arg0, var5 + -1, (byte)-5);
         } else if (~this.field6309 == -3 && class220.field2796 >= var5) {
            return this.method4469(var4, arg0, var5 + 1, (byte)-5);
         } else if (~this.field6309 == -17 && var4 > 0 && ~class220.field2796 <= ~var5) {
            return this.method4469(var4 + -1, arg0, var5 - -1, (byte)-5);
         } else if (this.field6309 == 32 && ~var4 >= ~class239.field3036 && var5 <= class220.field2796) {
            return this.method4469(var4 + 1, arg0, var5 + 1, (byte)-5);
         } else if (~this.field6309 == -129 && var4 > 0 && var5 > 0) {
            return this.method4469(var4 - 1, arg0, var5 + -1, (byte)-5);
         } else if (this.field6309 == 64 && class239.field3036 >= var4 && var5 > 0) {
            return this.method4469(var4 + 1, arg0, var5 + -1, (byte)-5);
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6311[7] + (arg0 != null ? field6311[0] : field6311[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(Z)Z",
      line = 126
   )
   public final boolean method1883(boolean arg0) {
      try {
         ++field6300;
         return arg0 ? true : class569.field8487[(super.field9003 >> class459.field6950) + class488.field7212 + -class681.field10228][(super.field9007 >> class459.field6950) + class488.field7212 - class518.field7555];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6311[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 144
   )
   public class411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field6309 = (short)arg5;
         super.field9007 = arg2;
         super.field9005 = (byte)arg4;
         super.field8998 = arg1;
         super.field9003 = arg0;
         super.field9010 = (byte)arg3;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6311[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
