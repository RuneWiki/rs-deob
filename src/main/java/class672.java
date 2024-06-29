import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class672 extends class302 {
   @OriginalMember(
      owner = "client!it",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10113 = new String[]{method4899(method4898("3ewU\b")), method4899(method4898("3ewP\b")), method4899(method4898("3ewV\b")), method4899(method4898("4d5{")), method4899(method4898("!?w9]")), method4899(method4898("3ewQ\b")), method4899(method4898("3ewR\b")), method4899(method4898("3ewT\b"))};
   @OriginalMember(
      owner = "client!it",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field10106 = new int[1];
   @OriginalMember(
      owner = "client!it",
      name = "M",
      descriptor = "Lhn;"
   )
   public static class751 field10110 = new class751(8, 5);
   @OriginalMember(
      owner = "client!it",
      name = "H",
      descriptor = "I"
   )
   public static int field10112 = 0;
   @OriginalMember(
      owner = "client!it",
      name = "I",
      descriptor = "I"
   )
   public static int field10104;
   @OriginalMember(
      owner = "client!it",
      name = "K",
      descriptor = "I"
   )
   public static int field10105;
   @OriginalMember(
      owner = "client!it",
      name = "O",
      descriptor = "I"
   )
   public static int field10107;
   @OriginalMember(
      owner = "client!it",
      name = "N",
      descriptor = "I"
   )
   public static int field10108;
   @OriginalMember(
      owner = "client!it",
      name = "P",
      descriptor = "I"
   )
   public static int field10109;
   @OriginalMember(
      owner = "client!it",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field10111;

   @OriginalMember(
      owner = "client!it",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method4895(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -18045) {
            field10112 = 125;
         }

         ++field10109;
         if (!class372.method2892(arg1, 2048, arg2)) {
            return false;
         } else {
            return class498.method3713(arg2, arg0 + 18161, arg1) | ~(36864 & arg2) != -1 | class436.method3306(arg2, 83, arg1) ? true : (class3.method32(arg1, (byte)-111, arg2) | (8192 & arg2) != 0 | class587.method4330(arg2, arg1, -69)) & (55 & arg1) == 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10113[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "<init>",
      descriptor = "()V"
   )
   public class672() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field10104;
         if (arg1 >= -37) {
            field10112 = -17;
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int[] var6 = this.method2299(arg0, false, 1);
            int[] var7 = this.method2299(arg0, false, 2);
            int var8 = 0;
            if (var3 != 0 || ~var8 > ~class344.field5238) {
               do {
                  int var9 = var7[var8];
                  if (var9 != 4096) {
                     if (var9 != 0) {
                        var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                        if (var3 != 0) {
                           var4[var8] = var6[var8];
                           if (var3 != 0) {
                              var4[var8] = var5[var8];
                              ++var8;
                           } else {
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else {
                        var4[var8] = var6[var8];
                        if (var3 != 0) {
                           var4[var8] = var5[var8];
                           ++var8;
                        } else {
                           ++var8;
                        }
                     }
                  } else {
                     var4[var8] = var5[var8];
                     ++var8;
                  }
               } while(~var8 > ~class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10113[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            this.method245((byte)87, 97);
         }

         ++field10108;
         int[][] var4 = super.field4292.method3409(arg1, arg0 ^ -90);
         if (super.field4292.field6892) {
            int[] var5 = this.method2299(arg1, false, 2);
            int[][] var6 = this.method2297(0, arg1, 0);
            int[][] var7 = this.method2297(1, arg1, arg0 + 90);
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
            if (var3 != 0 || var17 < class344.field5238) {
               do {
                  int var18 = var5[var17];
                  if (~var18 != -4097) {
                     if (~var18 == -1) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                        if (var3 == 0) {
                           ++var17;
                           continue;
                        }
                     }

                     int var19 = -var18 + 4096;
                     var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                     var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                     var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                     if (var3 == 0) {
                        ++var17;
                        continue;
                     }
                  }

                  var8[var17] = var11[var17];
                  var9[var17] = var12[var17];
                  var10[var17] = var13[var17];
                  ++var17;
               } while(var17 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field10113[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4896(byte arg0) {
      try {
         field10106 = null;
         field10111 = null;
         field10110 = null;
         if (arg0 != -86) {
            field10112 = -120;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10113[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         if (arg0 == arg1) {
            super.field4313 = ~arg2.method1104(255) == -2;
         }

         ++field10107;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10113[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10113[4] : field10113[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method4897(boolean arg0) {
      try {
         ++field10105;
         class776.field11341 = null;
         class524.field7616 = null;
         class288.field4045 = null;
         class134.field1717 = null;
         class178.field2198 = null;
         class506.field7476 = null;
         class280.field3896 = null;
         class486.field7194 = null;
         class57.field721 = null;
         class689.field10392 = null;
         class570.field8495 = null;
         class387.field5918 = null;
         class5.field98 = null;
         class159.field2016 = null;
         class766.field11241 = null;
         class41.field445 = null;
         class744.field11042 = null;
         if (!arg0) {
            method4897(false);
         }

         class471.field7051 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10113[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4898(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4899(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
