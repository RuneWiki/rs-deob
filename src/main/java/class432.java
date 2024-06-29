import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class432 extends class22 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6256 = new String[]{method3257(method3256("Th\u0018{\u0000")), method3257(method3256("@|ZS")), method3257(method3256("Th\u0018z\u0000")), method3257(method3256("U'\u0018\u0011U"))};
   @OriginalMember(
      owner = "client!za",
      name = "j",
      descriptor = "I"
   )
   public static int field6255 = 0;
   @OriginalMember(
      owner = "client!za",
      name = "m",
      descriptor = "I"
   )
   public static int field6252;
   @OriginalMember(
      owner = "client!za",
      name = "k",
      descriptor = "I"
   )
   public static int field6253;
   @OriginalMember(
      owner = "client!za",
      name = "l",
      descriptor = "I"
   )
   public static int field6254;

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(ZLvg;)V",
      line = 3
   )
   public static final void method3254(boolean arg0, class59 arg1) {
      boolean var2 = client.field4564;

      try {
         if (!arg0) {
            field6253 = -76;
         }

         ++field6252;
         arg1.method2385(117);
         boolean var3 = false;
         class59 var4 = (class59)class26.field398.method5680(false);
         boolean var10000;
         if (var2) {
            var10000 = class752.method5446(arg1.method658(-26507), var4.method658(-26507), (byte)-110);
         } else if (var4 == null) {
            var10000 = var3;
            if (!var2) {
               if (!var3) {
                  class26.field398.method5681(arg1, (byte)-39);
                  return;
               }

               return;
            }
         } else {
            var10000 = class752.method5446(arg1.method658(-26507), var4.method658(-26507), (byte)-110);
         }

         do {
            while(true) {
               if (var10000) {
                  class431.method3245(var4, arg1, 3);
                  var3 = true;
                  if (!var2) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class59)class26.field398.method5676(-13612);
               } else {
                  var4 = (class59)class26.field398.method5676(-13612);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (!var2) {
                     if (!var3) {
                        class26.field398.method5681(arg1, (byte)-39);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class752.method5446(arg1.method658(-26507), var4.method658(-26507), (byte)-110);
               }
            }
         } while(var2);

         if (!var3) {
            class26.field398.method5681(arg1, (byte)-39);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6256[2] + arg0 + ',' + (arg1 != null ? field6256[3] : field6256[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(I)V",
      line = 37
   )
   public static final void method3255(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field6254;
         if (class634.field9255 == null) {
            class634.field9255 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + -0.015D + Math.random() * 0.03D;
               int var4 = 0;
               int var5 = 0;
               if (!var1 && var5 >= 512) {
                  if (arg0 != 360) {
                     method3254(false, (class59)null);
                     return;
                  }

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
                        label102: {
                           float var9 = (float)var8 / 128.0F;
                           var10 = 0.0F;
                           var11 = 0.0F;
                           var12 = 0.0F;
                           float var13 = var6 / 60.0F;
                           int var14 = (int)var13;
                           int var15 = var14 % 6;
                           float var16 = (float)(-var14) + var13;
                           float var17 = (-var7 + 1.0F) * var9;
                           float var18 = (1.0F - var7 * var16) * var9;
                           float var19 = (-((1.0F - var16) * var7) + 1.0F) * var9;
                           if (~var15 == -1) {
                              var11 = var19;
                              var10 = var9;
                              var12 = var17;
                              if (!var1) {
                                 break label102;
                              }
                           }

                           if (var15 == 1) {
                              var11 = var9;
                              var12 = var17;
                              var10 = var18;
                              if (!var1) {
                                 break label102;
                              }
                           }

                           if (var15 != 2) {
                              label80: {
                                 if (var15 != 3) {
                                    if (var15 == 4) {
                                       var11 = var17;
                                       var12 = var9;
                                       var10 = var19;
                                       if (!var1) {
                                          break label80;
                                       }
                                    }

                                    if (var15 != 5) {
                                       break label80;
                                    }

                                    var12 = var18;
                                    var10 = var9;
                                    var11 = var17;
                                    if (!var1) {
                                       break label80;
                                    }
                                 }

                                 var11 = var18;
                                 var12 = var9;
                                 var10 = var17;
                                 if (var1) {
                                    var11 = var9;
                                    var10 = var17;
                                    var12 = var19;
                                 }
                              }
                           } else {
                              var11 = var9;
                              var10 = var17;
                              var12 = var19;
                           }
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var23 << 16) + (var24 << 8) + var25 + -16777216;
                        class634.field9255[var4++] = var26;
                        ++var8;
                     } while(~var8 > -129);
                  }

                  ++var5;
               } while(var5 < 512);

               if (arg0 != 360) {
                  method3254(false, (class59)null);
                  return;
               }

               return;
            }
         }

      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field6256[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
