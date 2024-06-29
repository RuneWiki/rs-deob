import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class717 {
   @OriginalMember(
      owner = "client!ql",
      name = "h",
      descriptor = "Lsh;"
   )
   private class207 field10282 = null;
   @OriginalMember(
      owner = "client!ql",
      name = "j",
      descriptor = "I"
   )
   private int field10279 = 65000;
   @OriginalMember(
      owner = "client!ql",
      name = "i",
      descriptor = "Lsh;"
   )
   private class207 field10281 = null;
   @OriginalMember(
      owner = "client!ql",
      name = "c",
      descriptor = "I"
   )
   private int field10278;
   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10286 = new String[]{method5201(method5200("u\u00188\u0006\u0010")), method5201(method5200("u\u00188\u0001\u0010")), method5201(method5200("j\u0001z(")), method5201(method5200("\u007fZ8jE")), method5201(method5200("u\u00188\u0005\u0010")), method5201(method5200("u\u00188\u0000\u0010")), method5201(method5200("G\u0015u,]>")), method5201(method5200("u\u001880WW\u0000d-Vc\\")), method5201(method5200("u\u00188\u0007\u0010")), method5201(method5200("u\u00188xQj\u001dbz\u0010"))};
   @OriginalMember(
      owner = "client!ql",
      name = "d",
      descriptor = "Lgq;"
   )
   public static class200 field10280 = new class200();
   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field10283 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!ql",
      name = "b",
      descriptor = "I"
   )
   public static int field10274;
   @OriginalMember(
      owner = "client!ql",
      name = "e",
      descriptor = "I"
   )
   public static int field10275;
   @OriginalMember(
      owner = "client!ql",
      name = "l",
      descriptor = "I"
   )
   public static int field10276;
   @OriginalMember(
      owner = "client!ql",
      name = "k",
      descriptor = "I"
   )
   public static int field10277;
   @OriginalMember(
      owner = "client!ql",
      name = "f",
      descriptor = "I"
   )
   public static int field10284;
   @OriginalMember(
      owner = "client!ql",
      name = "g",
      descriptor = "I"
   )
   public static int field10285;

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(FIFF)F"
   )
   public static final float method5195(float arg0, int arg1, float arg2, float arg3) {
      try {
         ++field10285;
         return arg1 != -1925579256 ? 0.86048573F : (-arg3 + arg0) * arg2 + arg3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10286[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5196(byte arg0) {
      try {
         int var1 = -91 / ((arg0 - 12) / 44);
         field10280 = null;
         field10283 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10286[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(II)[B"
   )
   public final byte[] method5197(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10274;
         class207 var4 = this.field10281;
         synchronized(this.field10281) {
            try {
               if (~this.field10282.method1790(-3) > ~((long)(arg0 * 6 - -6))) {
                  return null;
               } else {
                  this.field10282.method1788((long)(arg0 * 6), 0);
                  this.field10282.method1787(0, -23385, class238.field3672, 6);
                  int var6 = (class238.field3672[2] & 255) + (class238.field3672[0] << 16 & 16711680) + (class238.field3672[1] << 8 & 65280);
                  int var7 = ((class238.field3672[4] & 255) << 8) + (((class238.field3672[3] & 255) << 16) - -(255 & class238.field3672[5]));
                  if (arg1 <= 9) {
                     return null;
                  } else if (var6 >= 0 && ~var6 >= ~this.field10279) {
                     if (~var7 < -1 && (long)var7 <= this.field10281.method1790(-3) / 520L) {
                        byte[] var11 = new byte[var6];
                        int var12 = 0;
                        int var13 = 0;
                        if (var3) {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field10281.method1788((long)(var7 * 520), 0);
                        } else if (~var6 >= ~var12) {
                           if (!var3) {
                              return var11;
                           }
                        } else {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field10281.method1788((long)(var7 * 520), 0);
                        }

                        while(true) {
                           int var15 = -var12 + var6;
                           if (~var15 < -513) {
                              var15 = 512;
                           }

                           this.field10281.method1787(0, -23385, class238.field3672, var15 + 8);
                           int var16 = ((255 & class238.field3672[0]) << 8) + (class238.field3672[1] & 255);
                           int var17 = ((class238.field3672[2] & 255) << 8) - -(255 & class238.field3672[3]);
                           int var18 = ((class238.field3672[5] & 255) << 8) + ((255 & class238.field3672[4]) << 16) + (class238.field3672[6] & 255);
                           int var19 = 255 & class238.field3672[7];
                           if (arg0 != var16 || ~var13 != ~var17 || ~this.field10278 != ~var19) {
                              return null;
                           }

                           if (var18 < 0 || this.field10281.method1790(-3) / 520L < (long)var18) {
                              return null;
                           }

                           ++var13;
                           int var22 = 0;
                           if (var3) {
                              var11[var12++] = class238.field3672[var22 - -8];
                              ++var22;
                           }

                           while(true) {
                              while(~var22 > ~var15) {
                                 var11[var12++] = class238.field3672[var22 - -8];
                                 ++var22;
                              }

                              if (!var3) {
                                 if (~var6 >= ~var12) {
                                    if (!var3) {
                                       return var11;
                                    }
                                 } else {
                                    if (var18 == 0) {
                                       return null;
                                    }

                                    this.field10281.method1788((long)(var18 * 520), 0);
                                 }
                                 break;
                              }

                              ++var22;
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
      } catch (RuntimeException var46) {
         throw class612.method4503(var46, field10286[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(IIB[B)Z"
   )
   public final boolean method5198(int arg0, int arg1, byte arg2, byte[] arg3) {
      try {
         ++field10276;
         class207 var5 = this.field10281;
         synchronized(this.field10281) {
            if (arg2 != -84) {
               field10283 = null;
            }

            if (~arg1 <= -1 && ~arg1 >= ~this.field10279) {
               boolean var6 = this.method5199(arg0, (byte)77, arg3, true, arg1);
               if (!var6) {
                  var6 = this.method5199(arg0, (byte)94, arg3, false, arg1);
               }

               return var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10286[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10286[3] : field10286[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10277;
         return field10286[6] + this.field10278;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10286[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "a",
      descriptor = "(IB[BZI)Z"
   )
   private final boolean method5199(int param1, byte param2, byte[] param3, boolean param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ql",
      name = "<init>",
      descriptor = "(ILsh;Lsh;I)V"
   )
   public class717(int arg0, class207 arg1, class207 arg2, int arg3) {
      try {
         this.field10278 = arg0;
         this.field10279 = arg3;
         this.field10282 = arg2;
         this.field10281 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10286[9] + arg0 + ',' + (arg1 != null ? field10286[3] : field10286[2]) + ',' + (arg2 != null ? field10286[3] : field10286[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5200(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ql",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5201(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
