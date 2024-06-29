import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class332 {
   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "I"
   )
   private int field4756 = 65000;
   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "Ldk;"
   )
   private class536 field4763 = null;
   @OriginalMember(
      owner = "client!iw",
      name = "h",
      descriptor = "Ldk;"
   )
   private class536 field4759 = null;
   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "I"
   )
   private int field4761;
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4765 = new String[]{method2525(method2524("\u0010\u0016<\u0010\u001ei")), method2525(method2524(":\u0000q\f\u0014\u0000\u0003-\u0011\u00154_")), method2525(method2524(":\u0000q9S")), method2525(method2524(":\u0000q;S")), method2525(method2524("(YqV\u0006")), method2525(method2524("=\u00023\u0014")), method2525(method2524(":\u0000q:S")), method2525(method2524(":\u0000qD\u0012=\u001e+FS")), method2525(method2524(":\u0000q>S")), method2525(method2524(":\u0000q<S")), method2525(method2524(":\u0000q=S"))};
   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "F"
   )
   public static float field4760;
   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "I"
   )
   public static int field4752;
   @OriginalMember(
      owner = "client!iw",
      name = "i",
      descriptor = "I"
   )
   public static int field4753;
   @OriginalMember(
      owner = "client!iw",
      name = "k",
      descriptor = "I"
   )
   public static int field4755;
   @OriginalMember(
      owner = "client!iw",
      name = "l",
      descriptor = "I"
   )
   public static int field4757;
   @OriginalMember(
      owner = "client!iw",
      name = "j",
      descriptor = "I"
   )
   public static int field4758;
   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "I"
   )
   public static int field4762;
   @OriginalMember(
      owner = "client!iw",
      name = "m",
      descriptor = "I"
   )
   public static int field4764;
   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "Lgq;"
   )
   public static class540 field4754;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2518(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IZI[BZ)Z"
   )
   private final boolean method2519(int param1, boolean param2, int param3, byte[] param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "([BIII)Z"
   )
   public final boolean method2520(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4757;
         class536 var5 = this.field4763;
         synchronized(this.field4763) {
            if (arg2 >= 0 && ~this.field4756 <= ~arg2) {
               boolean var6 = this.method2519(arg2, true, arg1, arg0, true);
               int var7 = 6 % ((arg3 - 4) / 33);
               if (!var6) {
                  var6 = this.method2519(arg2, false, arg1, arg0, true);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field4765[3] + (arg0 != null ? field4765[4] : field4765[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2521(boolean arg0) {
      try {
         if (!arg0) {
            field4760 = -0.3353138F;
         }

         field4754 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4765[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZZIBLbu;ILbu;)I"
   )
   public static final int method2522(boolean arg0, boolean arg1, int arg2, byte arg3, class21 arg4, int arg5, class21 arg6) {
      try {
         ++field4752;
         int var7 = class283.method2159(arg2, true, arg6, arg0, arg4);
         if (~var7 != -1) {
            return !arg0 ? var7 : -var7;
         } else if (arg5 == -1) {
            return 0;
         } else {
            if (arg3 != -47) {
               method2522(true, true, -117, (byte)111, (class21)null, 92, (class21)null);
            }

            int var8 = class283.method2159(arg5, true, arg6, arg1, arg4);
            return !arg1 ? var8 : -var8;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field4765[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4765[4] : field4765[5]) + ',' + arg5 + ',' + (arg6 != null ? field4765[4] : field4765[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4753;
         return field4765[0] + this.field4761;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4765[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IB)[B"
   )
   public final byte[] method2523(int arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field4755;
         class536 var4 = this.field4763;
         synchronized(this.field4763) {
            if (arg1 != -69) {
               return null;
            } else {
               try {
                  if (this.field4759.method3976((byte)-106) < (long)(arg0 * 6 + 6)) {
                     return null;
                  } else {
                     this.field4759.method3968(arg1 + -55, (long)(arg0 * 6));
                     this.field4759.method3974((byte)106, 6, 0, class777.field11354);
                     int var7 = (class777.field11354[1] << 8 & 65280) + ((255 & class777.field11354[0]) << 16) + (255 & class777.field11354[2]);
                     int var8 = ((class777.field11354[3] & 255) << 16) - (-((class777.field11354[4] & 255) << 8) - (class777.field11354[5] & 255));
                     if (var7 >= 0 && var7 <= this.field4756) {
                        if (~var8 < -1 && ~((long)var8) >= ~(this.field4763.method3976((byte)-96) / 520L)) {
                           byte[] var11 = new byte[var7];
                           int var12 = 0;
                           int var13 = 0;
                           if (var3 != 0) {
                              if (~var8 == -1) {
                                 return null;
                              }

                              this.field4763.method3968(-87, (long)(var8 * 520));
                           } else if (var12 >= var7) {
                              if (var3 == 0) {
                                 return var11;
                              }
                           } else {
                              if (~var8 == -1) {
                                 return null;
                              }

                              this.field4763.method3968(-87, (long)(var8 * 520));
                           }

                           while(true) {
                              int var15 = var7 - var12;
                              if (var15 > 512) {
                                 var15 = 512;
                              }

                              this.field4763.method3974((byte)64, var15 + 8, 0, class777.field11354);
                              int var16 = (65280 & class777.field11354[0] << 8) + (255 & class777.field11354[1]);
                              int var17 = ((255 & class777.field11354[2]) << 8) + (255 & class777.field11354[3]);
                              int var18 = ((class777.field11354[5] & 255) << 8) + (class777.field11354[4] << 16 & 16711680) + (class777.field11354[6] & 255);
                              int var19 = 255 & class777.field11354[7];
                              if (~arg0 != ~var16 || var13 != var17 || ~this.field4761 != ~var19) {
                                 return null;
                              }

                              if (var18 < 0 || ~(this.field4763.method3976((byte)-124) / 520L) > ~((long)var18)) {
                                 return null;
                              }

                              ++var13;
                              int var22 = 0;
                              if (var3 != 0) {
                                 var11[var12++] = class777.field11354[var22 + 8];
                                 ++var22;
                              }

                              while(var15 > var22) {
                                 var11[var12++] = class777.field11354[var22 + 8];
                                 ++var22;
                              }

                              if (var12 >= var7) {
                                 if (var3 == 0) {
                                    return var11;
                                 }
                              } else {
                                 if (~var18 == -1) {
                                    return null;
                                 }

                                 this.field4763.method3968(-87, (long)(var18 * 520));
                              }
                           }
                        } else {
                           return null;
                        }
                     } else {
                        return null;
                     }
                  }
               } catch (IOException var44) {
                  return null;
               }
            }
         }
      } catch (RuntimeException var46) {
         throw class670.method4877(var46, field4765[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(ILdk;Ldk;I)V"
   )
   public class332(int arg0, class536 arg1, class536 arg2, int arg3) {
      try {
         this.field4756 = arg3;
         this.field4763 = arg1;
         this.field4759 = arg2;
         this.field4761 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4765[7] + arg0 + ',' + (arg1 != null ? field4765[4] : field4765[5]) + ',' + (arg2 != null ? field4765[4] : field4765[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2524(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2525(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
