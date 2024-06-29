import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class749 extends class70 {
   @OriginalMember(
      owner = "client!jp",
      name = "R",
      descriptor = "I"
   )
   private int field11099 = 0;
   @OriginalMember(
      owner = "client!jp",
      name = "K",
      descriptor = "I"
   )
   private int field11101 = 0;
   @OriginalMember(
      owner = "client!jp",
      name = "J",
      descriptor = "I"
   )
   private int field11098 = 0;
   @OriginalMember(
      owner = "client!jp",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11112 = new String[]{method5507(method5506("xm\u0014\u0006f")), method5507(method5506("xm\u0014\u0002f")), method5507(method5506("i3\u0014m3")), method5507(method5506("|hV/")), method5507(method5506("xm\u0014\u000bf")), method5507(method5506("xm\u0014\u0005f")), method5507(method5506("xm\u0014\tf"))};
   @OriginalMember(
      owner = "client!jp",
      name = "I",
      descriptor = "I"
   )
   public static int field11100;
   @OriginalMember(
      owner = "client!jp",
      name = "N",
      descriptor = "I"
   )
   private int field11102;
   @OriginalMember(
      owner = "client!jp",
      name = "H",
      descriptor = "I"
   )
   public static int field11103;
   @OriginalMember(
      owner = "client!jp",
      name = "S",
      descriptor = "I"
   )
   public static int field11104;
   @OriginalMember(
      owner = "client!jp",
      name = "L",
      descriptor = "I"
   )
   private int field11105;
   @OriginalMember(
      owner = "client!jp",
      name = "F",
      descriptor = "I"
   )
   public static int field11106;
   @OriginalMember(
      owner = "client!jp",
      name = "Q",
      descriptor = "I"
   )
   private int field11107;
   @OriginalMember(
      owner = "client!jp",
      name = "G",
      descriptor = "I"
   )
   private int field11108;
   @OriginalMember(
      owner = "client!jp",
      name = "O",
      descriptor = "I"
   )
   public static int field11109;
   @OriginalMember(
      owner = "client!jp",
      name = "P",
      descriptor = "I"
   )
   private int field11110;
   @OriginalMember(
      owner = "client!jp",
      name = "M",
      descriptor = "I"
   )
   private int field11111;

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg1 != -1) {
                     if (arg1 == 1) {
                        break label44;
                     }

                     if (arg1 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field11101 = arg2.method2869(false);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field11098 = (arg2.method2886((byte)88) << 12) / 100;
               if (!var4) {
                  break label46;
               }
            }

            this.field11099 = (arg2.method2886((byte)88) << 12) / 100;
         }

         if (arg0 != -1) {
            this.field11102 = 49;
         }

         ++field11109;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11112[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11112[2] : field11112[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11104;
         int[][] var4 = super.field918.method3276((byte)110, arg1);
         if (arg0 != 32) {
            this.method537(25, -122);
         }

         if (super.field918.field6361) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class678.field10127) {
               do {
                  this.method5503(var6[var12], var7[var12], false, var8[var12]);
                  this.field11110 += this.field11098;
                  this.field11108 += this.field11101;
                  this.field11102 += this.field11099;
                  if (var3) {
                     this.field11108 += 4096;
                  }

                  while(~this.field11108 > -1) {
                     this.field11108 += 4096;
                  }

                  if (var3) {
                     this.field11108 -= 4096;
                  }

                  while(true) {
                     class749 var10000;
                     if (this.field11108 <= 4096) {
                        var10000 = this;
                        if (!var3) {
                           if (~this.field11110 > -1) {
                              this.field11110 = 0;
                           }

                           if (this.field11110 > 4096) {
                              this.field11110 = 4096;
                           }

                           if (~this.field11102 > -1) {
                              this.field11102 = 0;
                           }

                           if (this.field11102 > 4096) {
                              this.field11102 = 4096;
                           }

                           this.method5502((byte)-116, this.field11108, this.field11110, this.field11102);
                           var9[var12] = this.field11105;
                           var10[var12] = this.field11111;
                           var11[var12] = this.field11107;
                           ++var12;
                           break;
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field11108 -= 4096;
                  }
               } while(var12 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field11112[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(BIII)V"
   )
   private final void method5502(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field11106;
         if (arg0 > -28) {
            this.field11111 = 102;
         }

         int var5;
         int var6;
         int var13;
         label50: {
            var5 = arg3 <= 2048 ? (arg2 + 4096) * arg3 >> 12 : -(arg2 * arg3 >> 12) + arg3 + arg2;
            if (var5 > 0) {
               int var18 = arg1 * 6;
               var6 = arg3 + arg3 + -var5;
               int var7 = (-var6 + var5 << 12) / var5;
               int var8 = var18 >> 12;
               int var9 = -(var8 << 12) + var18;
               int var11 = var7 * var5 >> 12;
               int var12 = var9 * var11 >> 12;
               var13 = var6 + var12;
               int var14 = var5 - var12;
               if (var8 == 0) {
                  break label50;
               }

               if (var8 == 1) {
                  this.field11107 = var6;
                  this.field11105 = var14;
                  this.field11111 = var5;
                  return;
               }

               if (~var8 == -3) {
                  this.field11111 = var5;
                  this.field11107 = var13;
                  this.field11105 = var6;
                  return;
               }

               if (~var8 == -4) {
                  this.field11105 = var6;
                  this.field11107 = var5;
                  this.field11111 = var14;
                  return;
               }

               if (var8 == 4) {
                  this.field11107 = var5;
                  this.field11105 = var13;
                  this.field11111 = var6;
                  return;
               }

               if (var8 == 5) {
                  if (!client.field1786) {
                     this.field11105 = var5;
                     this.field11111 = var6;
                     this.field11107 = var14;
                     return;
                  }
                  break label50;
               }
            } else {
               this.field11105 = this.field11111 = this.field11107 = arg3;
            }

            return;
         }

         this.field11111 = var13;
         this.field11105 = var5;
         this.field11107 = var6;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field11112[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IIZI)V"
   )
   private final void method5503(int arg0, int arg1, boolean arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field11100;
         if (arg2) {
            this.field11098 = -113;
         }

         int var7;
         int var9;
         int var10;
         label82: {
            int var6 = arg0 <= arg1 ? arg1 : arg0;
            var7 = ~var6 <= ~arg3 ? var6 : arg3;
            int var8 = ~arg0 > ~arg1 ? arg0 : arg1;
            var9 = var8 <= arg3 ? var8 : arg3;
            this.field11102 = (var7 + var9) / 2;
            var10 = -var9 + var7;
            if (~this.field11102 < -1 && this.field11102 < 4096) {
               this.field11110 = (var10 << 12) / (this.field11102 > 2048 ? 8192 - this.field11102 * 2 : this.field11102 * 2);
               if (!var5) {
                  break label82;
               }
            }

            this.field11110 = 0;
         }

         if (~var10 >= -1) {
            this.field11108 = 0;
         } else {
            label90: {
               int var11 = (-arg0 + var7 << 12) / var10;
               int var12 = (var7 - arg1 << 12) / var10;
               int var13 = (-arg3 + var7 << 12) / var10;
               if (arg0 != var7) {
                  if (arg1 != var7) {
                     this.field11108 = ~arg0 == ~var9 ? var12 + 12288 : -var11 + 20480;
                     if (!var5) {
                        break label90;
                     }
                  }

                  this.field11108 = ~arg3 == ~var9 ? var11 + 4096 : -var13 + 12288;
                  if (!var5) {
                     break label90;
                  }
               }

               this.field11108 = ~arg1 == ~var9 ? 20480 - -var13 : -var12 + 4096;
            }

            this.field11108 /= 6;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field11112[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method5504(int arg0) {
      try {
         ++field11103;
         ++class110.field1521;
         class29 var1 = class578.method4332((byte)-32);
         class577 var2 = class218.method1888(class775.field11388, 110, var1.field361);
         var2.field8531.method2864(-26110, arg0);
         var1.method211(var2, arg0 + 117);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11112[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "([Lbaa;II)V"
   )
   public static final void method5505(class109[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class109 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field1498;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field1498 < (var7 & 1) + var6) {
               class109 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method5505(arg0, arg1, var4 - 1);
         method5505(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!jp",
      name = "<init>",
      descriptor = "()V"
   )
   public class749() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5506(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5507(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
