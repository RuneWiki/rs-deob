import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class297 extends class294 {
   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4685 = new String[]{method2498(method2497("\u000eO%,pR")), method2498(method2497("\u000eO%,qR")), method2498(method2497("\u000eO%,sR")), method2498(method2497("\u000eO%,vR"))};
   @OriginalMember(
      owner = "client!tha",
      name = "p",
      descriptor = "[[I"
   )
   public static int[][] field4677 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!tha",
      name = "s",
      descriptor = "I"
   )
   public static int field4681 = 0;
   @OriginalMember(
      owner = "client!tha",
      name = "o",
      descriptor = "I"
   )
   public static int field4678;
   @OriginalMember(
      owner = "client!tha",
      name = "t",
      descriptor = "I"
   )
   public static int field4680;
   @OriginalMember(
      owner = "client!tha",
      name = "r",
      descriptor = "I"
   )
   public static int field4683;
   @OriginalMember(
      owner = "client!tha",
      name = "n",
      descriptor = "J"
   )
   public long field4684;
   @OriginalMember(
      owner = "client!tha",
      name = "q",
      descriptor = "Ltha;"
   )
   public class297 field4679;
   @OriginalMember(
      owner = "client!tha",
      name = "m",
      descriptor = "Ltha;"
   )
   public class297 field4682;

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(B)V",
      line = 6
   )
   public static final void method2493(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field4683;
         if (class77.field1028 == null) {
            class77.field1028 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + -0.015D + 0.03D * Math.random();
               int var4 = 0;
               if (arg0 > -55) {
                  method2493((byte)85);
               }

               int var5 = 0;
               if (!var1 && var5 >= 512) {
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
                        label73: {
                           float var9 = (float)var8 / 128.0F;
                           var10 = 0.0F;
                           var11 = 0.0F;
                           var12 = 0.0F;
                           float var13 = var6 / 60.0F;
                           int var14 = (int)var13;
                           int var15 = var14 % 6;
                           float var16 = var13 - (float)var14;
                           float var17 = (-var7 + 1.0F) * var9;
                           float var18 = (-(var7 * var16) + 1.0F) * var9;
                           float var19 = (1.0F - (-var16 + 1.0F) * var7) * var9;
                           if (var15 != 0) {
                              if (~var15 == -2) {
                                 var12 = var17;
                                 var11 = var9;
                                 var10 = var18;
                                 if (!var1) {
                                    break label73;
                                 }
                              }

                              if (~var15 == -3) {
                                 var10 = var17;
                                 var12 = var19;
                                 var11 = var9;
                                 if (!var1) {
                                    break label73;
                                 }
                              }

                              if (~var15 != -4) {
                                 if (~var15 != -5) {
                                    if (~var15 != -6) {
                                       break label73;
                                    }

                                    var10 = var9;
                                    var11 = var17;
                                    var12 = var18;
                                    if (!var1) {
                                       break label73;
                                    }
                                 }

                                 var10 = var19;
                                 var11 = var17;
                                 var12 = var9;
                                 if (!var1) {
                                    break label73;
                                 }
                              }

                              var12 = var9;
                              var11 = var18;
                              var10 = var17;
                              if (!var1) {
                                 break label73;
                              }
                           }

                           var12 = var17;
                           var11 = var19;
                           var10 = var9;
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var24 << 8) + (var23 << 16) + -16777216 + var25;
                        class77.field1028[var4++] = var26;
                        ++var8;
                     } while(var8 < 128);
                  }

                  ++var5;
               } while(var5 < 512);

               return;
            }
         }

      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field4685[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)Z",
      line = 136
   )
   public final boolean method2494(int arg0) {
      try {
         ++field4678;
         if (this.field4679 == null) {
            return false;
         } else {
            if (arg0 != 0) {
               this.field4684 = 60L;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4685[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(I)V",
      line = 152
   )
   public final void method2495(int arg0) {
      try {
         ++field4680;
         if (this.field4679 != null) {
            this.field4679.field4682 = this.field4682;
            this.field4682.field4679 = this.field4679;
            this.field4682 = null;
            if (arg0 == -24134) {
               this.field4679 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4685[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "(B)V",
      line = 174
   )
   public static void method2496(byte arg0) {
      try {
         field4677 = null;
         if (arg0 != -84) {
            method2493((byte)-31);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4685[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2497(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2498(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
