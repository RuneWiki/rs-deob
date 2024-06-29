import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class702 {
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10216 = new String[]{method5095(method5094("8P\u0001>")), method5095(method5094(" C\f|\n~")), method5095(method5094("-\u000bC|5")), method5095(method5094(" C\f|\t~"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "I"
   )
   public static int field10213 = 0;
   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "I"
   )
   public static int field10214;
   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "I"
   )
   public static int field10215;

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(I[BIIIII)V"
   )
   public static final void method5092(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field10215;
         if (~arg4 < -1 && !class685.method5005(arg4, (byte)112)) {
            throw new IllegalArgumentException("");
         } else if (arg2 > 0 && !class685.method5005(arg2, (byte)126)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class341.method2702(53, arg6);
            int var9 = 0;
            int var10 = ~arg2 >= ~arg4 ? arg2 : arg4;
            int var11 = arg4 >> 1;
            int var12 = arg2 >> 1;
            byte[] var13 = arg1;
            byte[] var14 = new byte[var11 * var12 * var8];
            if (arg0 < -15) {
               while(true) {
                  OpenGL.glTexImage2Dub(arg5, var9, arg3, arg4, arg2, 0, arg6, 5121, var13, 0);
                  if (var10 <= 1) {
                     return;
                  }

                  int var10000;
                  label99: {
                     int var15 = arg4 * var8;
                     byte[] var16 = var14;
                     int var17 = 0;
                     if (var7) {
                        var10000 = var17;
                     } else if (var8 <= var17) {
                        var14 = var13;
                        var13 = var16;
                        arg2 = var12;
                        arg4 = var11;
                        var10 >>= 1;
                        ++var9;
                        var12 >>= 1;
                        var10000 = var11 >> 1;
                        if (!var7) {
                           break label99;
                        }
                     } else {
                        var10000 = var17;
                     }

                     while(true) {
                        int var18 = var10000;
                        int var19 = var17;
                        int var20 = var15 + var17;
                        int var21 = 0;
                        if (var7 || ~var12 < ~var21) {
                           do {
                              label93: {
                                 int var22 = 0;
                                 if (var7) {
                                    var10000 = var13[var19];
                                 } else if (~var22 <= ~var11) {
                                    var20 += var15;
                                    var10000 = var15 + var19;
                                    if (!var7) {
                                       break label93;
                                    }
                                 } else {
                                    var10000 = var13[var19];
                                 }

                                 while(true) {
                                    int var23 = var10000;
                                    int var24 = var8 + var19;
                                    int var25 = var13[var24] + var23;
                                    var19 = var8 + var24;
                                    int var26 = var13[var20] + var25;
                                    int var27 = var8 + var20;
                                    int var28 = var13[var27] + var26;
                                    var14[var18] = (byte)(var28 >> 2);
                                    var20 = var8 + var27;
                                    var18 += var8;
                                    ++var22;
                                    if (~var22 <= ~var11) {
                                       var20 += var15;
                                       var10000 = var15 + var19;
                                       if (!var7) {
                                          break;
                                       }
                                    } else {
                                       var10000 = var13[var19];
                                    }
                                 }
                              }

                              var19 = var10000;
                              ++var21;
                           } while(~var12 < ~var21);
                        }

                        ++var17;
                        if (var8 <= var17) {
                           var14 = var13;
                           var13 = var16;
                           arg2 = var12;
                           arg4 = var11;
                           var10 >>= 1;
                           ++var9;
                           var12 >>= 1;
                           var10000 = var11 >> 1;
                           if (!var7) {
                              break;
                           }
                        } else {
                           var10000 = var17;
                        }
                     }
                  }

                  var11 = var10000;
               }
            }
         }
      } catch (RuntimeException var30) {
         throw class534.method3846(var30, field10216[1] + arg0 + ',' + (arg1 != null ? field10216[2] : field10216[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IIILeb;)V"
   )
   public static final void method5093(int arg0, int arg1, int arg2, class657 arg3) {
      try {
         ++field10214;
         class516 var4 = arg3.method4774(class338.field4832, (byte)-41);
         if (var4 != null) {
            label30: {
               class338.field4832.method577(arg2, arg1, arg3.field9379 + arg2, arg3.field9360 + arg1);
               if (~class666.field9474 <= -4) {
                  class338.field4832.method516(-16777216, var4, arg2, arg1);
                  if (!client.field4273) {
                     break label30;
                  }
               }

               class150.field1961.method5481((float)arg3.field9379 / 2.0F + (float)arg2, (float)arg3.field9360 / 2.0F + (float)arg1, 4096, (int)(-class363.field5142) << 2 & 65532, var4, arg2, arg1);
            }

            if (arg0 > -1) {
               method5093(-50, -81, -34, (class657)null);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10216[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10216[2] : field10216[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
