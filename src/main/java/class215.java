import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class215 extends class213 {
   @OriginalMember(
      owner = "client!oc",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2670 = new String[]{method1637(method1636("bf\u0015wf")), method1637(method1636("bf\u0015rf")), method1637(method1636("bf\u0015qf")), method1637(method1636("bf\u0015pf"))};
   @OriginalMember(
      owner = "client!oc",
      name = "K",
      descriptor = "I"
   )
   public static int field2664 = -1;
   @OriginalMember(
      owner = "client!oc",
      name = "M",
      descriptor = "[Ldja;"
   )
   public static class326[] field2665 = new class326[75];
   @OriginalMember(
      owner = "client!oc",
      name = "I",
      descriptor = "I"
   )
   public static int field2667 = 104;
   @OriginalMember(
      owner = "client!oc",
      name = "H",
      descriptor = "[[I"
   )
   public static int[][] field2662 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!oc",
      name = "F",
      descriptor = "I"
   )
   public static int field2663;
   @OriginalMember(
      owner = "client!oc",
      name = "E",
      descriptor = "I"
   )
   public static int field2666;
   @OriginalMember(
      owner = "client!oc",
      name = "J",
      descriptor = "I"
   )
   public static int field2668;
   @OriginalMember(
      owner = "client!oc",
      name = "L",
      descriptor = "I"
   )
   public static int field2669;
   @OriginalMember(
      owner = "client!oc",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field2661;

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "()V"
   )
   public class215() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "(B)I"
   )
   public static final int method1633(byte arg0) {
      try {
         ++field2663;
         if ((double)class618.field8618 == 3.0D) {
            return 37;
         } else if (arg0 != -88) {
            return 4;
         } else if ((double)class618.field8618 == 4.0D) {
            return 50;
         } else if ((double)class618.field8618 == 6.0D) {
            return 75;
         } else {
            return (double)class618.field8618 == 8.0D ? 100 : 200;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2670[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1634(int arg0) {
      try {
         field2662 = null;
         field2661 = null;
         field2665 = null;
         if (arg0 <= 125) {
            field2664 = -101;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2670[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      try {
         ++field2666;
         int[] var3 = super.field2650.method3769(arg0, -4);
         if (arg1 != 2064866508) {
            method1634(-15);
         }

         if (super.field2650.field7140) {
            class714.method5196(var3, 0, class576.field7916, class551.field7586[arg0]);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2670[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1635(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field2668;
         if (class757.field10972 == null) {
            class757.field10972 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + (Math.random() * 0.03D - 0.015D);
               int var4 = 0;
               int var5 = 0;
               int var27;
               if (!var1 && ~var5 <= -513) {
                  var27 = 46 / ((-61 - arg0) / 59);
                  return;
               }

               do {
                  float var6 = ((float)(var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                  float var7 = (float)(var5 & 7) / 8.0F + 0.0625F;
                  int var8 = 0;
                  if (var1 || var8 < 128) {
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
                           float var16 = var13 - (float)var14;
                           float var17 = (1.0F - var7) * var9;
                           float var18 = (-(var7 * var16) + 1.0F) * var9;
                           float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                           if (var15 == 0) {
                              var11 = var19;
                              var10 = var9;
                              var12 = var17;
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

                           if (~var15 != -3) {
                              label69: {
                                 if (var15 != 3) {
                                    if (var15 == 4) {
                                       var10 = var19;
                                       var12 = var9;
                                       var11 = var17;
                                       if (!var1) {
                                          break label69;
                                       }
                                    }

                                    if (var15 != 5) {
                                       break label69;
                                    }

                                    var10 = var9;
                                    var12 = var18;
                                    var11 = var17;
                                    if (!var1) {
                                       break label69;
                                    }
                                 }

                                 var10 = var17;
                                 var12 = var9;
                                 var11 = var18;
                                 if (var1) {
                                    var10 = var17;
                                    var11 = var9;
                                    var12 = var19;
                                 }
                              }
                           } else {
                              var10 = var17;
                              var11 = var9;
                              var12 = var19;
                           }
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var24 << 8) + (var23 << 16) + -16777216 - -var25;
                        class757.field10972[var4++] = var26;
                        ++var8;
                     } while(var8 < 128);
                  }

                  ++var5;
               } while(~var5 > -513);

               var27 = 46 / ((-61 - arg0) / 59);
               return;
            }
         }

      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field2670[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1636(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1637(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
