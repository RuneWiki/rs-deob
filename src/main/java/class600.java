import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class600 extends class393 implements class732 {
   @OriginalMember(
      owner = "client!fe",
      name = "x",
      descriptor = "I"
   )
   private int field8376;
   @OriginalMember(
      owner = "client!fe",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8380 = new String[]{method4383(method4382("1Y&fn")), method4383(method4382("1Y&mn")), method4383(method4382(",\u0012&\u000e;")), method4383(method4382("9IdL")), method4383(method4382("1Y&on")), method4383(method4382("1Y&hn")), method4383(method4382("1Y&\u001c/9U|\u001en")), method4383(method4382("1Y&jn")), method4383(method4382("1Y&nn")), method4383(method4382("1Y&in")), method4383(method4382("1Y&ln")), method4383(method4382("1Y&kn"))};
   @OriginalMember(
      owner = "client!fe",
      name = "q",
      descriptor = "I"
   )
   public static int field8375 = 0;
   @OriginalMember(
      owner = "client!fe",
      name = "o",
      descriptor = "[[I"
   )
   public static int[][] field8377 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field8378 = new int[4];
   @OriginalMember(
      owner = "client!fe",
      name = "v",
      descriptor = "D"
   )
   public static double field8374;
   @OriginalMember(
      owner = "client!fe",
      name = "r",
      descriptor = "I"
   )
   public static int field8366;
   @OriginalMember(
      owner = "client!fe",
      name = "s",
      descriptor = "I"
   )
   public static int field8367;
   @OriginalMember(
      owner = "client!fe",
      name = "p",
      descriptor = "I"
   )
   public static int field8368;
   @OriginalMember(
      owner = "client!fe",
      name = "A",
      descriptor = "I"
   )
   public static int field8369;
   @OriginalMember(
      owner = "client!fe",
      name = "B",
      descriptor = "I"
   )
   public static int field8371;
   @OriginalMember(
      owner = "client!fe",
      name = "u",
      descriptor = "I"
   )
   public static int field8372;
   @OriginalMember(
      owner = "client!fe",
      name = "w",
      descriptor = "I"
   )
   public static int field8373;
   @OriginalMember(
      owner = "client!fe",
      name = "t",
      descriptor = "I"
   )
   public static int field8379;
   @OriginalMember(
      owner = "client!fe",
      name = "y",
      descriptor = "Lda;"
   )
   public static class66 field8370;

   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "(I)I"
   )
   public static final int method4374(int arg0) {
      try {
         ++field8367;
         if (class85.field1098 != null) {
            return 3;
         } else {
            if (arg0 < 101) {
               method4380((byte)-97);
            }

            return class435.field6049 ? 2 : 1;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8380[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method4375(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         ++field8368;
         this.method2994(arg0, (byte)-80, arg2);
         this.field8376 = arg1;
         if (arg3 != -21583) {
            this.method4376((byte)54);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8380[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8380[2] : field8380[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4376(byte arg0) {
      try {
         ++field8379;
         int var2 = -113 / ((arg0 - -21) / 59);
         return this.field8376;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8380[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method4377(int arg0) {
      try {
         ++field8369;
         if (arg0 < 42) {
            field8375 = 94;
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8380[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(ILha;IIIII)V"
   )
   public static final void method4378(int param0, class65 param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field8366;
         int var8 = class138.method1159(arg0, class313.field4171, (byte)-44, class478.field6604);
         int var9 = class138.method1159(arg5, class313.field4171, (byte)-44, class478.field6604);
         int var10 = class138.method1159(arg2, class663.field9442, (byte)-44, class265.field3451);
         int var11 = class138.method1159(arg3, class663.field9442, (byte)-44, class265.field3451);
         int var12 = class138.method1159(arg0 - -arg1, class313.field4171, (byte)-44, class478.field6604);
         int var13 = class138.method1159(-arg1 + arg5, class313.field4171, (byte)-44, class478.field6604);
         int var14 = var8;
         if (var7) {
            class125.method1046(-23355, var11, class17.field236[var8], arg4, var10);
            var14 = var8 + 1;
         }

         while(true) {
            int var10000;
            int var10001;
            if (~var12 >= ~var14) {
               var10000 = arg6;
               var10001 = 49;
               if (!var7) {
                  if (arg6 < 49) {
                     field8375 = 49;
                  }

                  int var15 = var9;
                  if (var7) {
                     class125.method1046(-23355, var11, class17.field236[var9], arg4, var10);
                     var15 = var9 - 1;
                  }

                  while(true) {
                     while(~var15 < ~var13) {
                        class125.method1046(-23355, var11, class17.field236[var15], arg4, var10);
                        --var15;
                     }

                     int var16 = class138.method1159(arg1 + arg2, class663.field9442, (byte)-44, class265.field3451);
                     int var17 = class138.method1159(-arg1 + arg3, class663.field9442, (byte)-44, class265.field3451);
                     int var18 = var12;
                     if (!var7) {
                        if (!var7 && var13 < var12) {
                           return;
                        }

                        do {
                           int[] var19 = class17.field236[var18];
                           class125.method1046(-23355, var16, var19, arg4, var10);
                           class125.method1046(-23355, var11, var19, arg4, var17);
                           ++var18;
                        } while(var13 >= var18);

                        return;
                     }

                     --var15;
                  }
               }
            } else {
               var10000 = -23355;
               var10001 = var11;
            }

            class125.method1046(var10000, var10001, class17.field236[var14], arg4, var10);
            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field8380[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4380(byte arg0) {
      try {
         field8378 = null;
         if (arg0 != 5) {
            method4374(14);
         }

         field8370 = null;
         field8377 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8380[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lor;I[BIZ)V"
   )
   public class600(class670 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field8376 = arg1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8380[6] + (arg0 != null ? field8380[2] : field8380[3]) + ',' + arg1 + ',' + (arg2 != null ? field8380[2] : field8380[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method4381(int arg0) {
      try {
         ++field8371;
         return arg0 != 29894 ? -122 : super.field5556;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8380[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method751(boolean arg0) {
      try {
         super.field5557.method4845(this, (byte)93);
         if (!arg0) {
            ++field8373;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8380[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
