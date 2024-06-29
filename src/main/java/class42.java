import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class42 extends class302 {
   @OriginalMember(
      owner = "client!vd",
      name = "O",
      descriptor = "Z"
   )
   private boolean field455 = true;
   @OriginalMember(
      owner = "client!vd",
      name = "P",
      descriptor = "I"
   )
   private int field452 = 4096;
   @OriginalMember(
      owner = "client!vd",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field459 = new String[]{method292(method291("\u0011W\\\".")), method292(method291("\u0011W\\#.")), method292(method291("\u001c\u001d\\O{")), method292(method291("\u0011W\\'.")), method292(method291("\tF\u001e\r")), method292(method291("\u0011W\\$."))};
   @OriginalMember(
      owner = "client!vd",
      name = "Q",
      descriptor = "Lsd;"
   )
   public static class101 field450 = new class101(19, 6);
   @OriginalMember(
      owner = "client!vd",
      name = "J",
      descriptor = "I"
   )
   public static int field458 = 0;
   @OriginalMember(
      owner = "client!vd",
      name = "H",
      descriptor = "Lcj;"
   )
   public static class721 field454 = new class721(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!vd",
      name = "K",
      descriptor = "I"
   )
   public static int field451;
   @OriginalMember(
      owner = "client!vd",
      name = "L",
      descriptor = "I"
   )
   public static int field453;
   @OriginalMember(
      owner = "client!vd",
      name = "M",
      descriptor = "I"
   )
   public static int field456;
   @OriginalMember(
      owner = "client!vd",
      name = "N",
      descriptor = "I"
   )
   public static int field457;

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(BI)[[I",
      line = 5
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field456;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (arg0 != -90) {
            return null;
         } else {
            if (super.field4292.field6892) {
               int[] var5 = this.method2299(arg1 + -1 & class275.field3837, false, 0);
               int[] var6 = this.method2299(arg1, false, 0);
               int[] var7 = this.method2299(arg1 - -1 & class275.field3837, false, 0);
               int[] var8 = var4[0];
               int[] var9 = var4[1];
               int[] var10 = var4[2];
               int var11 = 0;
               if (var3 != 0 || var11 < class344.field5238) {
                  do {
                     int var19;
                     int var20;
                     int var21;
                     label33: {
                        int var12 = (var7[var11] + -var5[var11]) * this.field452;
                        int var13 = (var6[var11 + 1 & class264.field3612] - var6[var11 - 1 & class264.field3612]) * this.field452;
                        int var14 = var13 >> 12;
                        int var15 = var12 >> 12;
                        int var16 = var14 * var14 >> 12;
                        int var17 = var15 * var15 >> 12;
                        int var18 = (int)(Math.sqrt((double)((float)(var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                        if (~var18 == -1) {
                           var19 = 0;
                           var20 = 0;
                           var21 = 0;
                           if (var3 == 0) {
                              break label33;
                           }
                        }

                        var20 = var13 / var18;
                        var19 = 16777216 / var18;
                        var21 = var12 / var18;
                     }

                     if (this.field455) {
                        var20 = (var20 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                        var21 = 2048 - -(var21 >> 1);
                     }

                     var8[var11] = var20;
                     var9[var11] = var21;
                     var10[var11] = var19;
                     ++var11;
                  } while(var11 < class344.field5238);
               }
            }

            return var4;
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field459[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "(B)V",
      line = 88
   )
   public static void method289(byte arg0) {
      try {
         field450 = null;
         int var1 = -57 / ((76 - arg0) / 35);
         field454 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field459[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(I[II[FIIII[FI[IIB)V",
      line = 98
   )
   public static final void method290(int arg0, int[] arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, int[] arg10, int arg11, byte arg12) {
      int var13 = client.field4530;

      try {
         ++field451;
         int var14 = arg2 * arg4 + arg9;
         int var15 = arg7 * arg11 + arg0;
         int var16 = -arg5 + arg4;
         int var17 = -arg5 + arg7;
         if (arg12 >= -25) {
            method290(-102, (int[])null, -5, (float[])null, -60, -79, 5, -2, (float[])null, -120, (int[])null, -97, (byte)-93);
         }

         if (arg10 != null) {
            if (arg8 != null) {
               int var20 = 0;
               if (var13 != 0 || ~arg6 < ~var20) {
                  do {
                     int var21 = arg5 + var14;
                     if (var13 != 0) {
                        arg1[var15] = arg10[var14];
                        arg3[var15++] = arg8[var14++];
                     }

                     while(true) {
                        if (~var21 >= ~var14) {
                           var14 += var16;
                           var15 += var17;
                           if (var13 == 0) {
                              ++var20;
                              break;
                           }
                        } else {
                           arg1[var15] = arg10[var14];
                        }

                        arg3[var15++] = arg8[var14++];
                     }
                  } while(~arg6 < ~var20);

               }
            } else {
               int var18 = 0;
               if (var13 != 0 || arg6 > var18) {
                  do {
                     int var19 = arg5 + var14;
                     if (var13 != 0 || ~var19 < ~var14) {
                        do {
                           arg1[var15++] = arg10[var14++];
                        } while(~var19 < ~var14);
                     }

                     var15 += var17;
                     var14 += var16;
                     ++var18;
                  } while(arg6 > var18);

               }
            }
         } else {
            int var22 = 0;
            if (var13 != 0 || var22 < arg6) {
               do {
                  int var23 = var14 - -arg5;
                  if (var13 != 0 || var14 < var23) {
                     do {
                        arg3[var15++] = arg8[var14++];
                     } while(var14 < var23);
                  }

                  var14 += var16;
                  var15 += var17;
                  ++var22;
               } while(var22 < arg6);

            }
         }
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field459[5] + arg0 + ',' + (arg1 != null ? field459[2] : field459[4]) + ',' + arg2 + ',' + (arg3 != null ? field459[2] : field459[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field459[2] : field459[4]) + ',' + arg9 + ',' + (arg10 != null ? field459[2] : field459[4]) + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "()V",
      line = 185
   )
   public class42() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 199
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field457;
         if (arg1 == 0) {
            if (arg0 != 0) {
               if (arg0 != 1) {
                  return;
               }

               if (client.field4530 == 0) {
                  this.field455 = ~arg2.method1104(arg1 + 255) == -2;
                  return;
               }
            }

            this.field452 = arg2.method1038((byte)-123);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field459[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field459[2] : field459[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method291(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method292(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
