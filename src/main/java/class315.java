import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class315 extends class70 {
   @OriginalMember(
      owner = "client!qu",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4366 = new String[]{method2501(method2500("!UP.9")), method2501(method2500("!UP/9")), method2501(method2500("+\u000ePDl")), method2501(method2500(">U\u0012\u0006")), method2501(method2500("!UP)9")), method2501(method2500("!UP%9")), method2501(method2500("!UP(9"))};
   @OriginalMember(
      owner = "client!qu",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field4363 = new int[4];
   @OriginalMember(
      owner = "client!qu",
      name = "I",
      descriptor = "I"
   )
   public static int field4362 = 0;
   @OriginalMember(
      owner = "client!qu",
      name = "L",
      descriptor = "I"
   )
   public static int field4358;
   @OriginalMember(
      owner = "client!qu",
      name = "P",
      descriptor = "I"
   )
   public static int field4359;
   @OriginalMember(
      owner = "client!qu",
      name = "M",
      descriptor = "I"
   )
   public static int field4360;
   @OriginalMember(
      owner = "client!qu",
      name = "J",
      descriptor = "I"
   )
   public static int field4361;
   @OriginalMember(
      owner = "client!qu",
      name = "O",
      descriptor = "I"
   )
   public static int field4365;
   @OriginalMember(
      owner = "client!qu",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field4364;

   @OriginalMember(
      owner = "client!qu",
      name = "<init>",
      descriptor = "()V"
   )
   public class315() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field4361;
         int[] var4 = super.field940.method119(false, arg1);
         if (arg0 != -63) {
            method2498((byte)-102);
         }

         if (super.field940.field270) {
            int[] var5 = this.method690(-83, 0, arg1);
            int[] var6 = this.method690(43, 1, arg1);
            int[] var7 = this.method690(-60, 2, arg1);
            int var8 = 0;
            if (var3 || var8 < class262.field3328) {
               do {
                  int var9 = var7[var8];
                  if (var9 != 4096) {
                     if (~var9 == -1) {
                        var4[var8] = var6[var8];
                        if (!var3) {
                           ++var8;
                           continue;
                        }
                     }

                     var4[var8] = var5[var8] * var9 - -((4096 - var9) * var6[var8]) >> 12;
                     if (var3) {
                        var4[var8] = var5[var8];
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var4[var8] = var5[var8];
                     ++var8;
                  }
               } while(var8 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4366[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2498(byte arg0) {
      try {
         ++field4359;
         if (arg0 >= 0) {
            if (~class100.field1321 >= -2) {
               class757.field11093.method5438(true, class757.field11093.field10965, 2);
            } else {
               class757.field11093.method5438(true, class757.field11093.field10965, 4);
            }
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4366[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2499(boolean arg0) {
      try {
         field4363 = null;
         field4364 = null;
         if (arg0) {
            method2499(true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4366[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field4365;
         int[][] var4 = super.field926.method2860(arg0 ^ arg0, arg1);
         if (super.field926.field5048) {
            int[] var5 = this.method690(arg0 + 6682, 2, arg1);
            int[][] var6 = this.method696(arg1, 0, 32767);
            int[][] var7 = this.method696(arg1, 1, 32767);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            int var17 = 0;
            if (var3 || ~class262.field3328 < ~var17) {
               do {
                  int var18 = var5[var17];
                  if (~var18 == -4097) {
                     var8[var17] = var11[var17];
                     var9[var17] = var12[var17];
                     var10[var17] = var13[var17];
                     if (!var3) {
                        ++var17;
                        continue;
                     }
                  }

                  if (~var18 != -1) {
                     int var19 = -var18 + 4096;
                     var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                     var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                     var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                     if (var3) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                        ++var17;
                     } else {
                        ++var17;
                     }
                  } else {
                     var8[var17] = var14[var17];
                     var9[var17] = var15[var17];
                     var10[var17] = var16[var17];
                     ++var17;
                  }
               } while(~class262.field3328 < ~var17);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field4366[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg0 >= -34) {
            method2498((byte)-123);
         }

         if (~arg2 == -1) {
            super.field930 = ~arg1.method640(255) == -2;
         }

         ++field4360;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4366[4] + arg0 + ',' + (arg1 != null ? field4366[2] : field4366[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
