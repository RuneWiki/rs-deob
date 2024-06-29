import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class350 extends class70 {
   @OriginalMember(
      owner = "client!bb",
      name = "F",
      descriptor = "Lhka;"
   )
   public class57 field5306;
   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "Ljf;"
   )
   public class225 field5312;
   @OriginalMember(
      owner = "client!bb",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5313 = new String[]{method2740(method2739("\u001b0\u001f~\u001a")), method2740(method2739("\u001b0\u001f\t[\u0017;E\u000b\u001a")), method2740(method2739("\u0002|\u001f\u001bO")), method2740(method2739("\u0017']Y")), method2740(method2739("\u001b0\u001fy\u001a")), method2740(method2739("\u001b0\u001f\u007f\u001a")), method2740(method2739("\u001b0\u001f|\u001a"))};
   @OriginalMember(
      owner = "client!bb",
      name = "B",
      descriptor = "I"
   )
   public static int field5301 = 0;
   @OriginalMember(
      owner = "client!bb",
      name = "y",
      descriptor = "I"
   )
   public int field5300;
   @OriginalMember(
      owner = "client!bb",
      name = "x",
      descriptor = "I"
   )
   public static int field5302;
   @OriginalMember(
      owner = "client!bb",
      name = "H",
      descriptor = "I"
   )
   public int field5303;
   @OriginalMember(
      owner = "client!bb",
      name = "J",
      descriptor = "I"
   )
   public int field5304;
   @OriginalMember(
      owner = "client!bb",
      name = "D",
      descriptor = "I"
   )
   public static int field5305;
   @OriginalMember(
      owner = "client!bb",
      name = "E",
      descriptor = "I"
   )
   public int field5307;
   @OriginalMember(
      owner = "client!bb",
      name = "G",
      descriptor = "I"
   )
   public static int field5308;
   @OriginalMember(
      owner = "client!bb",
      name = "I",
      descriptor = "I"
   )
   public int field5309;
   @OriginalMember(
      owner = "client!bb",
      name = "C",
      descriptor = "I"
   )
   public static int field5311;
   @OriginalMember(
      owner = "client!bb",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field5310;

   @OriginalMember(
      owner = "client!bb",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method2735(int arg0) {
      try {
         if (class623.field9082 != null) {
            class623.field9082.method3015((byte)80);
         }

         ++field5308;
         if (class753.field11134 != null) {
            while(true) {
               try {
                  class753.field11134.join();
                  break;
               } catch (InterruptedException var2) {
                  if (client.field4530 != 0) {
                     break;
                  }
               }
            }
         }

         if (arg0 < 5) {
            method2735(1);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5313[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method2736(int arg0) {
      try {
         this.field5303 = this.field5306.field720;
         this.field5304 = this.field5306.field715;
         ++field5311;
         this.field5300 = this.field5306.field725;
         if (this.field5306.field724 != null) {
            this.field5306.field724.method1526(this.field5312.field2875, this.field5312.field2876, this.field5312.field2892, class280.field3899);
         }

         if (arg0 != 1) {
            method2737(true);
         }

         this.field5309 = class280.field3899[0];
         this.field5307 = class280.field3899[2];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5313[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method2737(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field5302;
         if (class672.field10111 == null) {
            class672.field10111 = new int[65536];
            if (var1 == 0) {
               double var2 = Math.random() * 0.03D - 0.015D + 0.7D;
               int var4 = 0;
               if (arg0) {
                  field5301 = -42;
               }

               int var5 = 0;
               if (var1 == 0 && var5 >= 512) {
                  return;
               }

               do {
                  float var6 = ((float)(var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                  float var7 = (float)(var5 & 7) / 8.0F + 0.0625F;
                  int var8 = 0;
                  if (var1 != 0 || var8 < 128) {
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
                           float var18 = (1.0F - var7 * var16) * var9;
                           float var19 = (-((1.0F - var16) * var7) + 1.0F) * var9;
                           if (var15 != 0) {
                              if (var15 == 1) {
                                 var10 = var18;
                                 var11 = var9;
                                 var12 = var17;
                                 if (var1 == 0) {
                                    break label73;
                                 }
                              }

                              if (var15 == 2) {
                                 var12 = var19;
                                 var11 = var9;
                                 var10 = var17;
                                 if (var1 == 0) {
                                    break label73;
                                 }
                              }

                              if (var15 != 3) {
                                 if (var15 == 4) {
                                    var11 = var17;
                                    var12 = var9;
                                    var10 = var19;
                                    if (var1 == 0) {
                                       break label73;
                                    }
                                 }

                                 if (~var15 != -6) {
                                    break label73;
                                 }

                                 var12 = var18;
                                 var11 = var17;
                                 var10 = var9;
                                 if (var1 == 0) {
                                    break label73;
                                 }
                              }

                              var11 = var18;
                              var12 = var9;
                              var10 = var17;
                              if (var1 == 0) {
                                 break label73;
                              }
                           }

                           var12 = var17;
                           var10 = var9;
                           var11 = var19;
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var23 << 16) + (-16777216 - (-(var24 << 8) + -var25));
                        class672.field10111[var4++] = var26;
                        ++var8;
                     } while(var8 < 128);
                  }

                  ++var5;
               } while(var5 < 512);

               return;
            }
         }

      } catch (RuntimeException var28) {
         throw class670.method4877(var28, field5313[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2738(byte arg0) {
      try {
         field5310 = null;
         int var1 = -115 / ((arg0 - -7) / 39);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5313[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "<init>",
      descriptor = "(Lhka;Lge;)V"
   )
   public class350(class57 arg0, class737 arg1) {
      try {
         this.field5306 = arg0;
         this.field5312 = this.field5306.method474(-26464);
         this.method2736(1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5313[1] + (arg0 != null ? field5313[2] : field5313[3]) + ',' + (arg1 != null ? field5313[2] : field5313[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
