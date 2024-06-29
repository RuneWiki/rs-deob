import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class308 extends class207 {
   @OriginalMember(
      owner = "client!tr",
      name = "o",
      descriptor = "I"
   )
   private int field4380 = -1;
   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4381 = new String[]{method2330(method2329("\u0011Q*\u000b")), method2330(method2329("\u000bVh$)")), method2330(method2329("\u0004\nhI|")), method2330(method2329("\u000bVh&)")), method2330(method2329("\u000bVh%)"))};
   @OriginalMember(
      owner = "client!tr",
      name = "t",
      descriptor = "I"
   )
   public static int field4376 = 0;
   @OriginalMember(
      owner = "client!tr",
      name = "n",
      descriptor = "B"
   )
   private byte field4377;
   @OriginalMember(
      owner = "client!tr",
      name = "p",
      descriptor = "I"
   )
   public static int field4374;
   @OriginalMember(
      owner = "client!tr",
      name = "q",
      descriptor = "I"
   )
   public static int field4375;
   @OriginalMember(
      owner = "client!tr",
      name = "s",
      descriptor = "I"
   )
   public static int field4378;
   @OriginalMember(
      owner = "client!tr",
      name = "r",
      descriptor = "I"
   )
   public static int field4379;

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 6
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.field4377 = 27;
         }

         arg0.method1816(this.field4380, this.field4377, -28731);
         ++field4378;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4381[4] + (arg0 != null ? field4381[2] : field4381[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(ZILha;)V",
      line = 18
   )
   public static final void method2328(boolean arg0, int arg1, class66 arg2) {
      int var3 = client.field4530;

      try {
         ++field4374;
         if (class554.field8210 && class333.field4773) {
            if (class67.field828) {
               class704.field10549 = class314.field4489.method740(109);
            }

            class556.field8259 = 0;
            class498.field7380 = 0;
            class411.field6308 = 0;
            int[] var4 = arg2.method576();
            class739.field10982 = (int)((float)var4[2] / 3.0F);
            class11.field150 = (int)((float)var4[3] / 3.0F);
            arg2.method610(class26.field294);
            if ((int)((float)class26.field294[0] / 3.0F) != class25.field261 || (int)((float)class26.field294[1] / 3.0F) != class40.field433) {
               class40.field433 = (int)((float)class26.field294[1] / 3.0F);
               class25.field261 = (int)((float)class26.field294[0] / 3.0F);
               class755.field11143 = new int[class40.field433 * class25.field261];
               class138.field1784 = class40.field433 >> 1;
               class528.field7693 = class25.field261 >> 1;
            }

            class169.field2101 = arg2.method656();
            class724.field10784 = 0;
            int var5 = 0;
            if (var3 != 0) {
               class548.method4054(arg1, arg2, class437.field6663[var5], (byte)104);
               ++var5;
            }

            while(true) {
               while(var5 < class486.field7191) {
                  class548.method4054(arg1, arg2, class437.field6663[var5], (byte)104);
                  ++var5;
               }

               int var6 = 0;
               if (var3 == 0) {
                  if (var3 != 0) {
                     class548.method4054(arg1, arg2, class604.field8885[var6], (byte)104);
                     ++var6;
                  }

                  while(true) {
                     int var10000;
                     if (~class57.field713 >= ~var6) {
                        int var7 = 0;
                        var10000 = arg0;
                        if (var3 == 0) {
                           if (arg0 != 1) {
                              return;
                           }

                           while(true) {
                              if (var7 >= class601.field8821) {
                                 class171.field2123 = 0;
                                 var10000 = ~class724.field10784;
                                 if (var3 == 0) {
                                    if (var10000 < -1) {
                                       int var8 = class755.field11143.length;
                                       int var9 = -var8 + var8 & 7;
                                       int var10 = 0;
                                       if (var3 != 0) {
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                       }

                                       while(true) {
                                          while(~var10 > ~var9) {
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                             class755.field11143[var10++] = Integer.MAX_VALUE;
                                          }

                                          if (var3 == 0) {
                                             if (var3 != 0) {
                                                class755.field11143[var10++] = Integer.MAX_VALUE;
                                             }

                                             while(~var10 > ~var8) {
                                                class755.field11143[var10++] = Integer.MAX_VALUE;
                                             }

                                             class637.field9265 = 1;
                                             int var11 = 0;
                                             if (var3 != 0 || var11 < class724.field10784) {
                                                do {
                                                   class246 var12 = class66.field819[var11];
                                                   class75.method733(var12.field3168[3], var12.field3172[0], var12.field3168[1], (byte)-37, var12.field3168[0], var12.field3174[3], var12.field3172[3], var12.field3174[0], var12.field3174[1], var12.field3172[1]);
                                                   class75.method733(var12.field3168[3], var12.field3172[1], var12.field3168[2], (byte)-37, var12.field3168[1], var12.field3174[3], var12.field3172[3], var12.field3174[1], var12.field3174[2], var12.field3172[2]);
                                                   ++var11;
                                                } while(var11 < class724.field10784);
                                             }

                                             class637.field9265 = 2;
                                             break;
                                          }

                                          class755.field11143[var10++] = Integer.MAX_VALUE;
                                       }
                                    }

                                    if (class67.field828) {
                                       class41.field442 = class314.field4489.method740(21) - class704.field10549;
                                       return;
                                    }

                                    return;
                                 }
                              } else {
                                 var10000 = arg1;
                              }

                              class548.method4054(var10000, arg2, class368.field5540[var7], (byte)104);
                              ++var7;
                           }
                        }
                     } else {
                        var10000 = arg1;
                     }

                     class548.method4054(var10000, arg2, class604.field8885[var6], (byte)104);
                     ++var6;
                  }
               }

               ++var5;
            }
         } else {
            class724.field10784 = 0;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field4381[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4381[2] : field4381[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 126
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field4380 = arg0.method1038((byte)-117);
         ++field4379;
         if (!arg1) {
            this.field4377 = -110;
         }

         this.field4377 = arg0.method1047((byte)-7);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4381[3] + (arg0 != null ? field4381[2] : field4381[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
