import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class663 {
   @OriginalMember(
      owner = "client!jk",
      name = "q",
      descriptor = "[B"
   )
   private byte[] field9445;
   @OriginalMember(
      owner = "client!jk",
      name = "b",
      descriptor = "[[B"
   )
   private byte[][] field9456;
   @OriginalMember(
      owner = "client!jk",
      name = "d",
      descriptor = "I"
   )
   public int field9459;
   @OriginalMember(
      owner = "client!jk",
      name = "p",
      descriptor = "I"
   )
   public int field9452;
   @OriginalMember(
      owner = "client!jk",
      name = "o",
      descriptor = "I"
   )
   public int field9444;
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9464 = new String[]{method4813(method4812("N\u0007")), method4813(method4812("A\u001c\u0013W")), method4813(method4812("\f]M")), method4813(method4812("V\u001a\u000eKb")), method4813(method4812("Q\u001b\u001a")), method4813(method4812("K\u001e\u0004\u0013")), method4813(method4812("Y]M\u0000l")), method4813(method4812("P\u0016\u0004")), method4813(method4812("L\u0011\u0010^")), method4813(method4812("E\u0007")), method4813(method4812("H\u0018Ml9")), method4813(method4812("G\u0006\u0011A")), method4813(method4812("L\u0006\u000fB")), method4813(method4812("H\u0018Mk9")), method4813(method4812("H\u0018Mh9")), method4813(method4812("H\u0018Mo9")), method4813(method4812("H\u0018Mf9")), method4813(method4812("H\u0018Me9")), method4813(method4812("H\u0018Mg9")), method4813(method4812("H\u0018Mi9")), method4813(method4812("H\u0018Md9")), method4813(method4812("@\u0001")), method4813(method4812("H\u0018Mm9")), method4813(method4812("H\u0018Mb9")), method4813(method4812("H\u0018M\u0012xL\u001a\u0017\u00109")), method4813(method4812("H\u0018Mj9"))};
   @OriginalMember(
      owner = "client!jk",
      name = "i",
      descriptor = "I"
   )
   public static int field9442 = 100;
   @OriginalMember(
      owner = "client!jk",
      name = "g",
      descriptor = "I"
   )
   public static int field9443 = 1406;
   @OriginalMember(
      owner = "client!jk",
      name = "n",
      descriptor = "Ltv;"
   )
   public static class590 field9447 = new class590(50);
   @OriginalMember(
      owner = "client!jk",
      name = "m",
      descriptor = "F"
   )
   public static float field9458;
   @OriginalMember(
      owner = "client!jk",
      name = "s",
      descriptor = "I"
   )
   public static int field9446;
   @OriginalMember(
      owner = "client!jk",
      name = "h",
      descriptor = "I"
   )
   public static int field9448;
   @OriginalMember(
      owner = "client!jk",
      name = "f",
      descriptor = "I"
   )
   public static int field9449;
   @OriginalMember(
      owner = "client!jk",
      name = "r",
      descriptor = "I"
   )
   public static int field9451;
   @OriginalMember(
      owner = "client!jk",
      name = "l",
      descriptor = "I"
   )
   public static int field9453;
   @OriginalMember(
      owner = "client!jk",
      name = "u",
      descriptor = "I"
   )
   public static int field9454;
   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "I"
   )
   public static int field9455;
   @OriginalMember(
      owner = "client!jk",
      name = "j",
      descriptor = "I"
   )
   public static int field9457;
   @OriginalMember(
      owner = "client!jk",
      name = "t",
      descriptor = "I"
   )
   public static int field9460;
   @OriginalMember(
      owner = "client!jk",
      name = "k",
      descriptor = "I"
   )
   public static int field9461;
   @OriginalMember(
      owner = "client!jk",
      name = "v",
      descriptor = "I"
   )
   public static int field9462;
   @OriginalMember(
      owner = "client!jk",
      name = "c",
      descriptor = "I"
   )
   public static int field9463;
   @OriginalMember(
      owner = "client!jk",
      name = "e",
      descriptor = "J"
   )
   public static long field9450;

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "([II[Ljava/lang/String;Ljava/lang/String;[Lbo;)I"
   )
   public final int method4800(int[] param1, int param2, String[] param3, String param4, class763[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4801(boolean arg0) {
      try {
         if (!arg0) {
            field9446 = -98;
         }

         ++field9448;
         class347.field4992.method4244(arg0);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9464[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4802(byte arg0) {
      try {
         if (arg0 == 0) {
            field9447 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9464[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I"
   )
   public final int method4803(String arg0, byte arg1) {
      try {
         int var3 = 109 % ((-74 - arg1) / 48);
         ++field9449;
         return this.method4810(48, (class763[])null, arg0);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9464[14] + (arg0 != null ? field9464[6] : field9464[12]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(II[FIII[FIFBI)V"
   )
   public static final void method4804(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, byte arg9, int arg10) {
      boolean var11 = client.field4273;

      try {
         int var24 = arg10 - arg0;
         int var23 = arg7 - arg3;
         ++field9451;
         int var22 = arg1 - arg4;
         float var12 = arg2[2] * (float)var22 + arg2[0] * (float)var24 + arg2[1] * (float)var23;
         if (arg9 > -41) {
            method4802((byte)29);
         }

         float var16;
         float var17;
         label41: {
            float var13 = arg2[5] * (float)var22 + arg2[4] * (float)var23 + arg2[3] * (float)var24;
            float var14 = arg2[8] * (float)var22 + arg2[7] * (float)var23 + arg2[6] * (float)var24;
            float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
            var16 = 0.5F + (float)Math.atan2((double)var12, (double)var14) / 6.2831855F;
            var17 = 0.5F + (float)Math.asin((double)(var13 / var15)) / 3.1415927F + arg8;
            if (~arg5 != -2) {
               if (~arg5 == -3) {
                  var16 = -var16;
                  var17 = -var17;
                  if (!var11) {
                     break label41;
                  }
               }

               if (arg5 != 3) {
                  break label41;
               }

               float var18 = var16;
               var16 = var17;
               var17 = -var18;
               if (!var11) {
                  break label41;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         arg6[0] = var16;
         arg6[1] = var17;
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field9464[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9464[6] : field9464[12]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9464[6] : field9464[12]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "([Lbo;IIILjava/lang/String;)I"
   )
   public final int method4805(class763[] arg0, int arg1, int arg2, int arg3, String arg4) {
      try {
         ++field9457;
         if (arg2 < 71) {
            return 57;
         } else {
            if (arg3 == 0) {
               arg3 = this.field9459;
            }

            int var6 = this.method4800(new int[]{arg1}, 18619, class734.field10725, arg4, arg0);
            int var7 = (var6 + -1) * arg3;
            return this.field9452 + var7 + this.field9444;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9464[23] + (arg0 != null ? field9464[6] : field9464[12]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9464[6] : field9464[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IIC)I"
   )
   public final int method4806(int arg0, int arg1, char arg2) {
      try {
         if (arg1 != -30348) {
            field9442 = 11;
         }

         ++field9460;
         return this.field9456 != null ? this.field9456[arg0][arg2] : 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9464[25] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method4807(int arg0, byte arg1) {
      try {
         ++field9453;
         int var3 = 40 % ((arg1 - 12) / 44);
         return 255 & this.field9445[arg0];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9464[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Ljava/lang/String;IB[Lbo;)I"
   )
   public final int method4808(String arg0, int arg1, byte arg2, class763[] arg3) {
      boolean var5 = client.field4273;

      try {
         ++field9463;
         int var6 = this.method4800(new int[]{arg1}, 18619, class734.field10725, arg0, arg3);
         int var7 = 0;
         if (arg2 != 77) {
            this.field9459 = -26;
         }

         int var8 = 0;
         int var9;
         if (var5) {
            var9 = this.method4810(108, arg3, class734.field10725[var8]);
            if (~var9 < ~var7) {
               var7 = var9;
            }

            ++var8;
         }

         while(true) {
            int var10000;
            if (var6 <= var8) {
               var10000 = var7;
               if (!var5) {
                  return var7;
               }
            } else {
               var10000 = this.method4810(108, arg3, class734.field10725[var8]);
            }

            var9 = var10000;
            if (~var9 < ~var7) {
               var7 = var9;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field9464[17] + (arg0 != null ? field9464[6] : field9464[12]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9464[6] : field9464[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(B[Lbo;ILjava/lang/String;)I"
   )
   public final int method4809(byte arg0, class763[] arg1, int arg2, String arg3) {
      try {
         if (arg0 > -46) {
            this.field9444 = -95;
         }

         ++field9461;
         return this.method4800(new int[]{arg2}, 18619, class734.field10725, arg3, arg1);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9464[22] + arg0 + ',' + (arg1 != null ? field9464[6] : field9464[12]) + ',' + arg2 + ',' + (arg3 != null ? field9464[6] : field9464[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(I[Lbo;Ljava/lang/String;)I"
   )
   public final int method4810(int param1, class763[] param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jk",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class663(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Ljava/lang/String;I[Lbo;B)Ljava/lang/String;"
   )
   public final String method4811(String param1, int param2, class763[] param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4812(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4813(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
