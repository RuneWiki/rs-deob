import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class446 extends class294 {
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6847 = new String[]{method3504(method3503("')d\u0018")), method3504(method3503("2r&Z3")), method3504(method3503("/>&3f")), method3504(method3503("/>&1f")), method3504(method3503("/>&0f")), method3504(method3503("/>&2f"))};
   @OriginalMember(
      owner = "client!fb",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field6844 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!fb",
      name = "q",
      descriptor = "I"
   )
   public static int field6842;
   @OriginalMember(
      owner = "client!fb",
      name = "o",
      descriptor = "I"
   )
   public static int field6843;
   @OriginalMember(
      owner = "client!fb",
      name = "n",
      descriptor = "I"
   )
   public static int field6845;
   @OriginalMember(
      owner = "client!fb",
      name = "p",
      descriptor = "I"
   )
   public static int field6846;

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3499(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6845;
         class566 var5 = class146.method1321((long)arg3 | (long)arg1 << 32, 18, -1428737160);
         var5.method4269((byte)-125);
         if (arg2 >= 122) {
            var5.field8398 = arg0;
            var5.field8394 = arg4;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6847[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(ILaka;)V"
   )
   public abstract void method810(int arg0, class637 arg1);

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3500(byte arg0) {
      try {
         field6844 = null;
         int var1 = 126 % ((arg0 - -32) / 57);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6847[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(BLds;)I"
   )
   public static final int method3501(byte arg0, class525 arg1) {
      try {
         ++field6846;
         if (arg0 != 111) {
            return 74;
         } else {
            String var2 = class639.method4664(arg1, 13241);
            return class355.field5457.method5119(var2, class610.field8880, (byte)127);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6847[4] + arg0 + ',' + (arg1 != null ? field6847[1] : field6847[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public abstract void method805(class354 arg0, int arg1);

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(IIIIIZ[F)V"
   )
   public static final void method3502(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6) {
      boolean var7 = client.field1786;

      try {
         ++field6842;
         if (arg4 > 0 && !class140.method1285(arg4, -11925)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 < -1 && !class140.method1285(arg3, -11925)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class357.method2920((byte)-51, arg0);
            int var9 = 0;
            int var10 = arg3 > arg4 ? arg4 : arg3;
            if (!arg5) {
               int var11 = arg4 >> 1;
               int var12 = arg3 >> 1;
               float[] var13 = arg6;
               float[] var14 = new float[var8 * var11 * var12];

               while(true) {
                  OpenGL.glTexImage2Df(arg2, var9, arg1, arg4, arg3, 0, arg0, 5126, var13, 0);
                  if (~var10 >= -2) {
                     return;
                  }

                  int var10000;
                  label91: {
                     int var15 = arg4 * var8;
                     int var16 = 0;
                     float[] var28;
                     if (var7) {
                        var10000 = var16;
                     } else if (~var8 >= ~var16) {
                        var28 = var14;
                        var14 = var13;
                        arg3 = var12;
                        var13 = var28;
                        arg4 = var11;
                        var11 >>= 1;
                        ++var9;
                        var12 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var7) {
                           break label91;
                        }
                     } else {
                        var10000 = var16;
                     }

                     while(true) {
                        int var17 = var10000;
                        int var18 = var16;
                        int var19 = var15 + var16;
                        int var20 = 0;
                        if (var7 || ~var12 < ~var20) {
                           do {
                              int var21 = 0;
                              if (var7 || ~var11 < ~var21) {
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
                                 } while(~var11 < ~var21);
                              }

                              var18 += var15;
                              var19 += var15;
                              ++var20;
                           } while(~var12 < ~var20);
                        }

                        ++var16;
                        if (~var8 >= ~var16) {
                           var28 = var14;
                           var14 = var13;
                           arg3 = var12;
                           var13 = var28;
                           arg4 = var11;
                           var11 >>= 1;
                           ++var9;
                           var12 >>= 1;
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
               }
            }
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field6847[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6847[1] : field6847[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3503(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3504(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
