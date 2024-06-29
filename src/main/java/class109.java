import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class109 extends class70 {
   @OriginalMember(
      owner = "client!lca",
      name = "Q",
      descriptor = "I"
   )
   private int field1447 = 3216;
   @OriginalMember(
      owner = "client!lca",
      name = "M",
      descriptor = "I"
   )
   private int field1448 = 4096;
   @OriginalMember(
      owner = "client!lca",
      name = "O",
      descriptor = "I"
   )
   private int field1453 = 3216;
   @OriginalMember(
      owner = "client!lca",
      name = "I",
      descriptor = "[I"
   )
   private int[] field1454 = new int[3];
   @OriginalMember(
      owner = "client!lca",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1459 = new String[]{method981(method980("]Z[nR\u0019")), method981(method980("_LV,")), method981(method980("]Z[nZ\u0019")), method981(method980("J\u0017\u0014nd")), method981(method980("]Z[n\\\u0019")), method981(method980("]Z[n]\u0019")), method981(method980("]Z[nV\u0019")), method981(method980("]Z[nU\u0019")), method981(method980("]Z[nS\u0019")), method981(method980("]Z[n^\u0019")), method981(method980("]Z[nQ\u0019"))};
   @OriginalMember(
      owner = "client!lca",
      name = "R",
      descriptor = "Lrca;"
   )
   public static class37 field1456 = new class37();
   @OriginalMember(
      owner = "client!lca",
      name = "U",
      descriptor = "F"
   )
   public static float field1458;
   @OriginalMember(
      owner = "client!lca",
      name = "V",
      descriptor = "I"
   )
   public static int field1445;
   @OriginalMember(
      owner = "client!lca",
      name = "T",
      descriptor = "I"
   )
   public static int field1446;
   @OriginalMember(
      owner = "client!lca",
      name = "N",
      descriptor = "I"
   )
   public static int field1449;
   @OriginalMember(
      owner = "client!lca",
      name = "J",
      descriptor = "I"
   )
   public static int field1450;
   @OriginalMember(
      owner = "client!lca",
      name = "S",
      descriptor = "I"
   )
   public static int field1451;
   @OriginalMember(
      owner = "client!lca",
      name = "P",
      descriptor = "I"
   )
   public static int field1452;
   @OriginalMember(
      owner = "client!lca",
      name = "L",
      descriptor = "I"
   )
   public static int field1455;
   @OriginalMember(
      owner = "client!lca",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field1457;

   @OriginalMember(
      owner = "client!lca",
      name = "<init>",
      descriptor = "()V"
   )
   public class109() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!lca",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         this.method977(2);
         ++field1446;
         if (arg0 > -36) {
            this.method552(93);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1459[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(II)I"
   )
   public static int method974(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1459[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method975(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field1445;
         if (class193.field2445 == null) {
            class193.field2445 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + -0.015D + Math.random() * 0.03D;
               int var4 = 0;
               int var5 = 0;
               int var27;
               if (!var1 && var5 >= 512) {
                  var27 = -46 % ((arg0 - -30) / 52);
                  return;
               }

               do {
                  float var6 = ((float)(var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                  float var7 = (float)(var5 & 7) / 8.0F + 0.0625F;
                  int var8 = 0;
                  if (var1 || ~var8 > -129) {
                     do {
                        float var10;
                        float var11;
                        float var12;
                        label91: {
                           float var9 = (float)var8 / 128.0F;
                           var10 = 0.0F;
                           var11 = 0.0F;
                           var12 = 0.0F;
                           float var13 = var6 / 60.0F;
                           int var14 = (int)var13;
                           int var15 = var14 % 6;
                           float var16 = (float)(-var14) + var13;
                           float var17 = (1.0F - var7) * var9;
                           float var18 = (-(var7 * var16) + 1.0F) * var9;
                           float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                           if (~var15 == -1) {
                              var12 = var17;
                              var10 = var9;
                              var11 = var19;
                              if (!var1) {
                                 break label91;
                              }
                           }

                           if (var15 == 1) {
                              var11 = var9;
                              var12 = var17;
                              var10 = var18;
                              if (!var1) {
                                 break label91;
                              }
                           }

                           if (var15 != 2) {
                              label69: {
                                 if (var15 != 3) {
                                    if (var15 == 4) {
                                       var11 = var17;
                                       var12 = var9;
                                       var10 = var19;
                                       if (!var1) {
                                          break label69;
                                       }
                                    }

                                    if (~var15 != -6) {
                                       break label69;
                                    }

                                    var11 = var17;
                                    var12 = var18;
                                    var10 = var9;
                                    if (!var1) {
                                       break label69;
                                    }
                                 }

                                 var10 = var17;
                                 var11 = var18;
                                 var12 = var9;
                                 if (var1) {
                                    var12 = var19;
                                    var10 = var17;
                                    var11 = var9;
                                 }
                              }
                           } else {
                              var12 = var19;
                              var10 = var17;
                              var11 = var9;
                           }
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var23 << 16) + (var24 << 8) + var25 + -16777216;
                        class193.field2445[var4++] = var26;
                        ++var8;
                     } while(~var8 > -129);
                  }

                  ++var5;
               } while(var5 < 512);

               var27 = -46 % ((arg0 - -30) / 52);
               return;
            }
         }

      } catch (RuntimeException var29) {
         throw class93.method866(var29, field1459[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method976(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lca",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method977(int arg0) {
      try {
         ++field1452;
         double var2 = Math.cos((double)((float)this.field1453 / 4096.0F));
         this.field1454[0] = (int)(Math.sin((double)((float)this.field1447 / 4096.0F)) * var2 * 4096.0D);
         this.field1454[1] = (int)(Math.cos((double)((float)this.field1447 / 4096.0F)) * var2 * 4096.0D);
         this.field1454[2] = (int)(4096.0D * Math.sin((double)((float)this.field1453 / 4096.0F)));
         int var4 = this.field1454[0] * this.field1454[0] >> 12;
         int var5 = this.field1454[1] * this.field1454[1] >> 12;
         int var6 = this.field1454[arg0] * this.field1454[2] >> 12;
         int var7 = (int)(Math.sqrt((double)(var4 - -var6 + var5 >> 12)) * 4096.0D);
         if (~var7 != -1) {
            this.field1454[2] = (this.field1454[2] << 12) / var7;
            this.field1454[0] = (this.field1454[0] << 12) / var7;
            this.field1454[1] = (this.field1454[1] << 12) / var7;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1459[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label46: {
            label45: {
               label44: {
                  ++field1450;
                  if (~arg2 != -1) {
                     if (arg2 == 1) {
                        break label44;
                     }

                     if (~arg2 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field1448 = arg1.method603(-2);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field1447 = arg1.method603(-2);
               if (!var4) {
                  break label46;
               }
            }

            this.field1453 = arg1.method603(-2);
         }

         if (arg0 >= -34) {
            field1457 = null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1459[2] + arg0 + ',' + (arg1 != null ? field1459[3] : field1459[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field1451;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = class696.field10206 * this.field1448 >> 12;
            int[] var6 = this.method690(-75, 0, class623.field9205 & arg1 + -1);
            int[] var7 = this.method690(-78, 0, arg1);
            int[] var8 = this.method690(-103, 0, arg1 + 1 & class623.field9205);
            int var9 = 0;
            if (var3 || ~class262.field3328 < ~var9) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[class174.field2249 & var9 + -1] + -var7[var9 + 1 & class174.field2249]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  int var13 = var10 >> 4;
                  if (var12 > 255) {
                     var12 = 255;
                  }

                  if (~var13 > -1) {
                     var13 = -var13;
                  }

                  if (~var13 < -256) {
                     var13 = 255;
                  }

                  int var14 = 255 & class792.field11587[((var13 + 1) * var13 >> 1) + var12];
                  int var15 = var11 * var14 >> 8;
                  int var16 = var10 * var14 >> 8;
                  int var17 = var14 * 4096 >> 8;
                  int var18 = this.field1454[0] * var15 >> 12;
                  int var19 = this.field1454[1] * var16 >> 12;
                  int var20 = this.field1454[2] * var17 >> 12;
                  var4[var9] = var19 + var20 + var18;
                  ++var9;
               } while(~class262.field3328 < ~var9);
            }
         }

         if (arg0 != -63) {
            field1456 = null;
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field1459[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method978(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            field1456 = null;
         }

         ++field1455;
         int var4 = arg1 - 1;
         int var5 = var4 | var4 >>> 1;
         int var6 = var5 | var5 >>> 2;
         int var7 = var6 | var6 >>> 4;
         int var8 = var7 | var7 >>> 8;
         int var9 = var8 | var8 >>> 16;
         return var9 - -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1459[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method979(int arg0) {
      try {
         field1457 = null;
         if (arg0 == -19427) {
            field1456 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1459[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method981(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
