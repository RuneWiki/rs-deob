import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class429 {
   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "Liu;"
   )
   private class530 field5826;
   @OriginalMember(
      owner = "client!du",
      name = "l",
      descriptor = "I"
   )
   public int field5825;
   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5837 = new String[]{method3322(method3321("dT\u0010\bO")), method3322(method3321("{\u000f\u0010\u001a[q\u0013J\u0018\u001a")), method3322(method3321("q\u000fRJ")), method3322(method3321("{\u000f\u0010e\u001a")), method3322(method3321("{\u000f\u0010b\u001a")), method3322(method3321("{\u000f\u0010@[q\u001bROHzR")), method3322(method3321("{\u000f\u0010g\u001a")), method3322(method3321("{\u000f\u0010d\u001a"))};
   @OriginalMember(
      owner = "client!du",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field5831 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!du",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field5828 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!du",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field5830 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field5835 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!du",
      name = "j",
      descriptor = "[[S"
   )
   public static short[][] field5824 = new short[][]{field5830, field5835, field5828};
   @OriginalMember(
      owner = "client!du",
      name = "d",
      descriptor = "I"
   )
   public static int field5827;
   @OriginalMember(
      owner = "client!du",
      name = "i",
      descriptor = "I"
   )
   public static int field5829;
   @OriginalMember(
      owner = "client!du",
      name = "k",
      descriptor = "I"
   )
   public static int field5832;
   @OriginalMember(
      owner = "client!du",
      name = "f",
      descriptor = "I"
   )
   public static int field5833;
   @OriginalMember(
      owner = "client!du",
      name = "h",
      descriptor = "I"
   )
   public static int field5834;
   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "I"
   )
   public static int field5836;

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "([[SB[[F)[[S"
   )
   public static final short[][] method3317(short[][] arg0, byte arg1, float[][] arg2) {
      boolean var3 = client.field1481;

      try {
         ++field5834;
         if (arg1 < 118) {
            return null;
         } else {
            int var4 = 0;
            if (!var3 && arg2.length <= var4) {
               return arg0;
            } else {
               do {
                  int var5 = 0;
                  if (var3) {
                     arg0[var4][var5] = (short)((int)(arg2[var4][var5] * 16383.0F));
                     ++var5;
                  }

                  while(true) {
                     while(~var5 > ~arg0[var4].length) {
                        arg0[var4][var5] = (short)((int)(arg2[var4][var5] * 16383.0F));
                        ++var5;
                     }

                     if (!var3) {
                        ++var4;
                        break;
                     }

                     ++var5;
                  }
               } while(arg2.length > var4);

               return arg0;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5837[6] + (arg0 != null ? field5837[0] : field5837[2]) + ',' + arg1 + ',' + (arg2 != null ? field5837[0] : field5837[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(BI)Lgv;"
   )
   public static final class48 method3318(byte arg0, int arg1) {
      try {
         ++field5827;
         class48 var2 = (class48)class696.field10205.method3192((long)arg1, (byte)-113);
         if (var2 != null) {
            return var2;
         } else if (arg0 < 0) {
            return null;
         } else {
            byte[] var3 = class475.field6616.method2697(arg1, 0, false);
            class48 var4 = new class48();
            if (var3 != null) {
               var4.method357(new class66(var3), 9541);
            }

            var4.method356(28);
            class696.field10205.method3190(var4, (long)arg1, 8);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5837[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field5826.method3972(this.field5825, (byte)97);
         ++field5836;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5837[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3319(byte arg0) {
      try {
         field5831 = null;
         field5835 = null;
         field5830 = null;
         if (arg0 != -109) {
            method3319((byte)114);
         }

         field5828 = null;
         field5824 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5837[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(IIIFFIFI)[F"
   )
   public static final float[] method3320(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, float arg6, int arg7) {
      try {
         float[] var9;
         label29: {
            ++field5833;
            float[] var8 = new float[9];
            var9 = new float[9];
            float var10 = (float)Math.cos((double)((float)arg0 * 0.024543693F));
            float var11 = (float)Math.sin((double)((float)arg0 * 0.024543693F));
            float var12 = -var10 + 1.0F;
            var8[3] = 0.0F;
            var8[5] = 0.0F;
            var8[1] = 0.0F;
            var8[0] = var10;
            var8[8] = var10;
            var8[7] = 0.0F;
            var8[6] = -var11;
            var8[4] = 1.0F;
            var8[2] = var11;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            int var15 = -107 % ((-4 - arg5) / 58);
            float var16 = 0.0F;
            float var17 = (float)arg1 / 32767.0F;
            float var18 = -((float)Math.sqrt((double)(-(var17 * var17) + 1.0F)));
            float var19 = 1.0F - var17;
            float var20 = (float)Math.sqrt((double)(arg2 * arg2 - -(arg7 * arg7)));
            if (var20 != 0.0F || var17 != 0.0F) {
               if (var20 != 0.0F) {
                  var16 = (float)arg2 / var20;
                  var14 = (float)(-arg7) / var20;
               }

               var13[2] = var14 * var16 * var19;
               var13[6] = var14 * var16 * var19;
               var13[0] = var14 * var14 * var19 + var17;
               var13[7] = -var14 * var18;
               var13[1] = var16 * var18;
               var13[4] = var17;
               var13[8] = var16 * var16 * var19 + var17;
               var13[5] = var14 * var18;
               var13[3] = -var16 * var18;
               var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
               var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
               var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
               var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
               var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
               var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
               var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
               var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
               var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
               if (!client.field1481) {
                  break label29;
               }
            }

            var9 = var8;
         }

         var9[8] *= arg6;
         var9[1] *= arg3;
         var9[3] *= arg4;
         var9[6] *= arg6;
         var9[4] *= arg4;
         var9[5] *= arg4;
         var9[0] *= arg3;
         var9[2] *= arg3;
         var9[7] *= arg6;
         return var9;
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field5837[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "<init>",
      descriptor = "(Liu;II)V"
   )
   public class429(class530 arg0, int arg1, int arg2) {
      try {
         this.field5826 = arg0;
         this.field5825 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5837[1] + (arg0 != null ? field5837[0] : field5837[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3321(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3322(char[] arg0) {
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
            var10005 = 122;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
