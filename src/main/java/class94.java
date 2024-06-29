import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class94 extends class70 {
   @OriginalMember(
      owner = "client!qe",
      name = "V",
      descriptor = "I"
   )
   private int field1264 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "W",
      descriptor = "I"
   )
   private int field1268 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "X",
      descriptor = "I"
   )
   private int field1272 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "ab",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1282 = new String[]{method881(method880("><$C.")), method881(method880("!,fm")), method881(method880("><$B.")), method881(method880("4w$/{")), method881(method880("><$F.")), method881(method880("><$D.")), method881(method880("><$E."))};
   @OriginalMember(
      owner = "client!qe",
      name = "Q",
      descriptor = "Lvia;"
   )
   public static class627 field1271 = new class627();
   @OriginalMember(
      owner = "client!qe",
      name = "L",
      descriptor = "I"
   )
   public static int field1281 = 0;
   @OriginalMember(
      owner = "client!qe",
      name = "K",
      descriptor = "I"
   )
   public static int field1265;
   @OriginalMember(
      owner = "client!qe",
      name = "Z",
      descriptor = "I"
   )
   private int field1266;
   @OriginalMember(
      owner = "client!qe",
      name = "S",
      descriptor = "I"
   )
   public static int field1267;
   @OriginalMember(
      owner = "client!qe",
      name = "T",
      descriptor = "I"
   )
   public static int field1269;
   @OriginalMember(
      owner = "client!qe",
      name = "P",
      descriptor = "I"
   )
   private int field1270;
   @OriginalMember(
      owner = "client!qe",
      name = "Y",
      descriptor = "I"
   )
   public static int field1274;
   @OriginalMember(
      owner = "client!qe",
      name = "M",
      descriptor = "I"
   )
   private int field1275;
   @OriginalMember(
      owner = "client!qe",
      name = "O",
      descriptor = "I"
   )
   private int field1277;
   @OriginalMember(
      owner = "client!qe",
      name = "N",
      descriptor = "I"
   )
   private int field1278;
   @OriginalMember(
      owner = "client!qe",
      name = "R",
      descriptor = "I"
   )
   private int field1279;
   @OriginalMember(
      owner = "client!qe",
      name = "J",
      descriptor = "I"
   )
   public static int field1280;
   @OriginalMember(
      owner = "client!qe",
      name = "I",
      descriptor = "Lww;"
   )
   public static class339 field1276;
   @OriginalMember(
      owner = "client!qe",
      name = "U",
      descriptor = "Lwf;"
   )
   public static class541 field1273;

   @OriginalMember(
      owner = "client!qe",
      name = "<init>",
      descriptor = "()V"
   )
   public class94() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!qe",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method877(boolean arg0) {
      try {
         field1276 = null;
         field1271 = null;
         if (arg0) {
            method877(true);
         }

         field1273 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1282[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method878(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field1274;
         int var6 = ~arg1 >= ~arg3 ? arg3 : arg1;
         int var7 = var6 < arg2 ? arg2 : var6;
         int var8 = arg3 > arg1 ? arg1 : arg3;
         int var9 = var8 > arg2 ? arg2 : var8;
         this.field1278 = (var7 + var9) / 2;
         int var10 = var7 - var9;
         if (arg0 != -1316820308) {
            method877(false);
         }

         label84: {
            if (this.field1278 > 0 && this.field1278 < 4096) {
               this.field1266 = (var10 << 12) / (this.field1278 <= 2048 ? this.field1278 * 2 : -(this.field1278 * 2) + 8192);
               if (!var5) {
                  break label84;
               }
            }

            this.field1266 = 0;
         }

         if (~var10 >= -1) {
            this.field1275 = 0;
         } else {
            label90: {
               int var11 = (-arg1 + var7 << 12) / var10;
               int var12 = (-arg3 + var7 << 12) / var10;
               int var13 = (-arg2 + var7 << 12) / var10;
               if (~arg1 != ~var7) {
                  if (arg3 == var7) {
                     this.field1275 = ~arg2 != ~var9 ? -var13 + 12288 : 4096 - -var11;
                     if (!var5) {
                        break label90;
                     }
                  }

                  this.field1275 = ~arg1 == ~var9 ? var12 + 12288 : -var11 + 20480;
                  if (!var5) {
                     break label90;
                  }
               }

               this.field1275 = ~arg3 == ~var9 ? var13 + 20480 : -var12 + 4096;
            }

            this.field1275 /= 6;
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field1282[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg2 != -1) {
                     if (~arg2 == -2) {
                        break label44;
                     }

                     if (~arg2 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field1272 = arg1.method652((byte)57);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field1268 = (arg1.method628((byte)-12) << 12) / 100;
               if (!var4) {
                  break label46;
               }
            }

            this.field1264 = (arg1.method628((byte)-12) << 12) / 100;
         }

         if (arg0 > -34) {
            this.method547(49, 94);
         }

         ++field1265;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1282[2] + arg0 + ',' + (arg1 != null ? field1282[3] : field1282[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(IIBI)V"
   )
   private final void method879(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field1267;
         int var5 = ~arg3 < -2049 ? -(arg1 * arg3 >> 12) + arg1 + arg3 : (arg1 + 4096) * arg3 >> 12;
         if (arg2 <= -69) {
            if (var5 <= 0) {
               this.field1277 = this.field1270 = this.field1279 = arg3;
            } else {
               int var18 = arg0 * 6;
               int var6 = arg3 + arg3 - var5;
               int var7 = (-var6 + var5 << 12) / var5;
               int var8 = var18 >> 12;
               int var9 = -(var8 << 12) + var18;
               int var11 = var7 * var5 >> 12;
               int var12 = var9 * var11 >> 12;
               int var13 = var6 - -var12;
               int var14 = -var12 + var5;
               if (~var8 != -1) {
                  if (~var8 == -2) {
                     this.field1279 = var6;
                     this.field1277 = var14;
                     this.field1270 = var5;
                     return;
                  }

                  if (var8 == 2) {
                     this.field1279 = var13;
                     this.field1270 = var5;
                     this.field1277 = var6;
                     return;
                  }

                  if (var8 == 3) {
                     this.field1270 = var14;
                     this.field1277 = var6;
                     this.field1279 = var5;
                     return;
                  }

                  if (var8 == 4) {
                     this.field1277 = var13;
                     this.field1279 = var5;
                     this.field1270 = var6;
                     return;
                  }

                  if (~var8 != -6) {
                     return;
                  }

                  if (!client.field1481) {
                     this.field1270 = var6;
                     this.field1277 = var5;
                     this.field1279 = var14;
                     return;
                  }
               }

               this.field1277 = var5;
               this.field1270 = var13;
               this.field1279 = var6;
            }
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field1282[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -6752) {
            return null;
         } else {
            ++field1269;
            int[][] var4 = super.field926.method2860(0, arg1);
            if (super.field926.field5048) {
               int[][] var5 = this.method696(arg1, 0, arg0 + 39519);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || ~var12 > ~class262.field3328) {
                  label78:
                  do {
                     this.method878(-1316820308, var6[var12], var8[var12], var7[var12]);
                     this.field1266 += this.field1268;
                     this.field1275 += this.field1272;
                     this.field1278 += this.field1264;
                     if (var3) {
                        this.field1275 += 4096;
                     }

                     while(true) {
                        class94 var10000;
                        if (~this.field1275 <= -1) {
                           var10000 = this;
                           if (!var3) {
                              if (this.field1266 < 0) {
                                 this.field1266 = 0;
                                 if (var3) {
                                    this.field1275 -= 4096;
                                 }
                              }

                              while(true) {
                                 if (this.field1275 <= 4096) {
                                    var10000 = this;
                                    if (!var3) {
                                       if (this.field1278 < 0) {
                                          this.field1278 = 0;
                                       }

                                       if (~this.field1266 < -4097) {
                                          this.field1266 = 4096;
                                       }

                                       if (~this.field1278 < -4097) {
                                          this.field1278 = 4096;
                                       }

                                       this.method879(this.field1275, this.field1266, (byte)-121, this.field1278);
                                       var9[var12] = this.field1277;
                                       var10[var12] = this.field1270;
                                       var11[var12] = this.field1279;
                                       ++var12;
                                       continue label78;
                                    }
                                 } else {
                                    var10000 = this;
                                 }

                                 var10000.field1275 -= 4096;
                              }
                           }
                        } else {
                           var10000 = this;
                        }

                        var10000.field1275 += 4096;
                     }
                  } while(~var12 > ~class262.field3328);
               }
            }

            return var4;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1282[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method880(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method881(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
