import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class649 {
   @OriginalMember(
      owner = "client!baa",
      name = "i",
      descriptor = "Lsia;"
   )
   private class407 field9689 = new class407(128);
   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "Lww;"
   )
   private class339 field9696;
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9698 = new String[]{method4775(method4774("}\u001e33X")), method4775(method4774("dQ|3\u0019o^ti\u001b.")), method4775(method4774("hEqq")), method4775(method4774("dQ|3f.")), method4775(method4774("dQ|3a.")), method4775(method4774("dQ|3d.")), method4775(method4774("dQ|3g."))};
   @OriginalMember(
      owner = "client!baa",
      name = "h",
      descriptor = "Lfea;"
   )
   public static class681 field9692 = new class681(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!baa",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9694 = null;
   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "[[Z"
   )
   public static boolean[][] field9693 = new boolean[][]{new boolean[4], new boolean[4], {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "I"
   )
   public static int field9688;
   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "I"
   )
   public static int field9690;
   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "I"
   )
   public static int field9691;
   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "I"
   )
   public static int field9695;
   @OriginalMember(
      owner = "client!baa",
      name = "j",
      descriptor = "I"
   )
   public static int field9697;

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(II)Lmga;"
   )
   public final class380 method4770(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            field9694 = null;
         }

         ++field9691;
         class407 var3 = this.field9689;
         class380 var4;
         synchronized(this.field9689) {
            var4 = (class380)this.field9689.method3192((long)arg0, (byte)-106);
         }

         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field9696.method2697(class562.method4231(arg0, (byte)115), class503.method3803(arg0, arg1 + 122), false);
            class380 var6 = new class380();
            if (var5 != null) {
               var6.method3020(-112, new class66(var5));
            }

            class407 var7 = this.field9689;
            synchronized(this.field9689) {
               this.field9689.method3190(var6, (long)arg0, 8);
               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field9698[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4771(int arg0) {
      try {
         field9693 = null;
         if (arg0 == 0) {
            field9694 = null;
            field9692 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9698[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(II[FIIII)V"
   )
   public static final void method4772(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         ++field9688;
         if (~arg5 < -1 && !class181.method1525((byte)-20, arg5)) {
            throw new IllegalArgumentException("");
         } else if (arg4 > arg1 && !class181.method1525((byte)-59, arg4)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class697.method5076(arg6, -1);
            int var9 = 0;
            int var10 = arg5 < arg4 ? arg5 : arg4;
            int var11 = arg5 >> 1;
            int var12 = arg4 >> 1;
            float[] var13 = arg2;
            float[] var14 = new float[var11 * var12 * var8];

            while(true) {
               OpenGL.glTexImage2Df(arg0, var9, arg3, arg5, arg4, 0, arg6, 5126, var13, 0);
               if (~var10 >= -2) {
                  return;
               }

               int var10000;
               label87: {
                  int var15 = arg5 * var8;
                  int var16 = 0;
                  float[] var28;
                  if (var7) {
                     var10000 = var16;
                  } else if (var8 <= var16) {
                     var28 = var14;
                     var14 = var13;
                     var13 = var28;
                     arg5 = var11;
                     arg4 = var12;
                     var12 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var7) {
                        break label87;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var15 + var16;
                     int var20 = 0;
                     if (var7 || ~var20 > ~var12) {
                        do {
                           int var21 = 0;
                           if (var7 || var21 < var11) {
                              do {
                                 float var22 = var13[var18];
                                 int var23 = var8 + var18;
                                 float var24 = var13[var23] + var22;
                                 float var25 = var13[var19] + var24;
                                 var18 = var8 + var23;
                                 int var26 = var8 + var19;
                                 float var27 = var13[var26] + var25;
                                 var19 = var8 + var26;
                                 var14[var17] = var27 * 0.25F;
                                 var17 += var8;
                                 ++var21;
                              } while(var21 < var11);
                           }

                           var19 += var15;
                           var18 += var15;
                           ++var20;
                        } while(~var20 > ~var12);
                     }

                     ++var16;
                     if (var8 <= var16) {
                        var28 = var14;
                        var14 = var13;
                        var13 = var28;
                        arg5 = var11;
                        arg4 = var12;
                        var12 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var10 = var10000;
               ++var9;
            }
         }
      } catch (RuntimeException var30) {
         throw class93.method866(var30, field9698[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9698[0] : field9698[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIIIII)V"
   )
   public static final void method4773(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9690;
         class560 var8 = new class560();
         var8.field8203 = class413.field5678 + arg4;
         var8.field8202 = arg2;
         var8.field8204 = arg5;
         var8.field8201 = arg3;
         var8.field8197 = arg6;
         var8.field8198 = arg1;
         var8.field8205 = arg0;
         class94.field1271.method4637(var8, (byte)92);
         if (arg7 >= -77) {
            field9692 = null;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9698[3] + (arg0 != null ? field9698[0] : field9698[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class649(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field9696 = arg2;
         if (this.field9696 != null) {
            int var4 = -1 + this.field9696.method2703((byte)126);
            this.field9696.method2691(var4, -123);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9698[1] + (arg0 != null ? field9698[0] : field9698[2]) + ',' + arg1 + ',' + (arg2 != null ? field9698[0] : field9698[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4774(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4775(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
