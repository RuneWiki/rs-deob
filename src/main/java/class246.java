import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class246 {
   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "[Lgu;"
   )
   public class610[] field3084;
   @OriginalMember(
      owner = "client!fa",
      name = "c",
      descriptor = "[Lgu;"
   )
   private class610[] field3090;
   @OriginalMember(
      owner = "client!fa",
      name = "d",
      descriptor = "Lfd;"
   )
   public class557 field3088;
   @OriginalMember(
      owner = "client!fa",
      name = "g",
      descriptor = "Lfd;"
   )
   public class557 field3085;
   @OriginalMember(
      owner = "client!fa",
      name = "h",
      descriptor = "Lce;"
   )
   private class327 field3093;
   @OriginalMember(
      owner = "client!fa",
      name = "e",
      descriptor = "Z"
   )
   public boolean field3087;
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3096 = new String[]{method1860(method1859("g&.,")), method1860(method1859("S\u0004:IQ")), method1860(method1859("C\u0003")), method1860(method1859("S\u0004:MQ")), method1860(method1859("S\u0004:NQ")), method1860(method1859("[\u0010x`")), method1860(method1859("NK:\"\u0004")), method1860(method1859("S\u0004:HQ")), method1860(method1859("S\u0004:OQ")), method1860(method1859("S\u0004:0\u0010[\f`2Q"))};
   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "I"
   )
   public static int field3094 = 0;
   @OriginalMember(
      owner = "client!fa",
      name = "i",
      descriptor = "I"
   )
   public static int field3086;
   @OriginalMember(
      owner = "client!fa",
      name = "j",
      descriptor = "I"
   )
   public static int field3089;
   @OriginalMember(
      owner = "client!fa",
      name = "f",
      descriptor = "I"
   )
   public static int field3091;
   @OriginalMember(
      owner = "client!fa",
      name = "l",
      descriptor = "I"
   )
   public static int field3092;
   @OriginalMember(
      owner = "client!fa",
      name = "k",
      descriptor = "I"
   )
   public static int field3095;

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(ZILqh;I)Lvp;"
   )
   public static final class200 method1854(boolean arg0, int arg1, class74 arg2, int arg3) {
      try {
         ++field3095;
         if (!arg0) {
            method1857((byte)-78);
         }

         byte[] var4 = arg2.method732(arg3, arg1, (byte)101);
         return var4 == null ? null : new class200(var4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3096[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3096[6] : field3096[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "(B)Lve;"
   )
   public static final class533 method1855(byte arg0) {
      try {
         ++field3089;

         try {
            if (arg0 != 66) {
               method1854(true, -24, (class74)null, 53);
            }

            return (class533)Class.forName(field3096[2]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3096[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1856(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (this.field3085 == null) {
            if (class171.field2145 == null) {
               byte[] var3 = class191.method1441(0.5F, new class744(419684), 4.0F, 4.0F, 8, 0.6F, 16.0F, 128, (byte)-127, 16, 128);
               class171.field2145 = class622.method4524(var3, false, 97);
            }

            byte[] var4 = class324.method2442(class171.field2145, -43, false);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            int var7 = 0;
            if (var2 || ~var7 > -17) {
               do {
                  int var8 = var7 * 128 * 128;
                  int var9 = var8;
                  int var10 = 0;
                  if (var2 || ~var10 > -129) {
                     do {
                        int var11 = var10 * 128 + var9;
                        int var12 = (127 & var10 + -1) * 128 + var9;
                        int var13 = var9 - -((127 & var10 + 1) * 128);
                        int var14 = 0;
                        if (var2 || ~var14 > -129) {
                           do {
                              float var15 = (float)((255 & var4[var12 + var14]) + -(var4[var13 + var14] & 255));
                              float var16 = (float)((var4[(127 & var14 + -1) + var11] & 255) + -(var4[(127 & var14 - -1) + var11] & 255));
                              float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                              var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                              var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                              var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                              var5[var6++] = var4[var8++];
                              ++var14;
                           } while(~var14 > -129);
                        }

                        ++var10;
                     } while(~var10 > -129);
                  }

                  ++var7;
               } while(~var7 > -17);
            }

            this.field3085 = this.field3093.method2490(16, 128, 128, var5, class622.field8682, (byte)6);
         }

         ++field3092;
         int var18 = -80 / ((arg0 - -48) / 56);
         return this.field3085 != null;
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field3096[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1857(byte arg0) {
      try {
         ++field3091;
         if (~class674.field9907.field8421.method4193((byte)-108) == -3) {
            byte var1 = (byte)(255 & class766.field11053 + -4);
            int var2 = class766.field11053 % class507.field7030;

            for(int var3 = 0; var3 < 4; ++var3) {
               for(int var4 = 0; var4 < class215.field2667; ++var4) {
                  class737.field10749[var3][var2][var4] = var1;
               }
            }

            if (arg0 <= 119) {
               method1854(true, 119, (class74)null, -18);
            }

            if (~class239.field2981 != -4) {
               for(int var5 = 0; ~var5 > -3; ++var5) {
                  class329.field4719[var5] = -1000000;
                  class779.field11372[var5] = 1000000;
                  class540.field7380[var5] = 0;
                  class53.field579[var5] = 1000000;
                  class441.field6116[var5] = 0;
               }

               int var6 = class278.field3709.field999;
               int var7 = class278.field3709.field1003;
               if (class635.field8977 != 1 && class721.field10567 == -1) {
                  int var18 = class687.method5016(class737.field10747, class239.field2981, class532.field7284, 2);
                  if (var18 - class331.field4733 < 3200 && ~(4 & class100.field1295[class239.field2981][class737.field10747 >> 9][class532.field7284 >> 9]) != -1) {
                     class420.method3177(class737.field10747 >> 9, class532.field7284 >> 9, -18734, 1, false, class111.field1404);
                     return;
                  }
               } else {
                  if (~class635.field8977 != -2) {
                     var6 = class721.field10567;
                     var7 = class552.field7597;
                  }

                  if ((4 & class100.field1295[class239.field2981][var6 >> 9][var7 >> 9]) != 0) {
                     class420.method3177(var6 >> 9, var7 >> 9, -18734, 0, false, class111.field1404);
                  }

                  if (~class171.field2144 > -2561) {
                     int var8 = class737.field10747 >> 9;
                     int var9 = class532.field7284 >> 9;
                     int var10 = var6 >> 9;
                     int var11 = var7 >> 9;
                     int var12;
                     if (~var10 >= ~var8) {
                        var12 = -var10 + var8;
                     } else {
                        var12 = -var8 + var10;
                     }

                     int var13;
                     if (var9 >= var11) {
                        var13 = -var11 + var9;
                     } else {
                        var13 = var11 - var9;
                     }

                     if ((var12 != 0 || ~var13 != -1) && var12 > -class507.field7030 && ~class507.field7030 < ~var12 && ~var13 < ~(-class215.field2667) && class215.field2667 > var13) {
                        if (var13 >= var12) {
                           int var14 = var12 * 65536 / var13;
                           int var15 = 32768;

                           while(var9 != var11) {
                              if (~var9 > ~var11) {
                                 ++var9;
                              } else if (var9 > var11) {
                                 --var9;
                              }

                              if ((4 & class100.field1295[class239.field2981][var8][var9]) != 0) {
                                 class420.method3177(var8, var9, -18734, 1, false, class111.field1404);
                                 return;
                              }

                              var15 += var14;
                              if (var15 >= 65536) {
                                 if (~var8 > ~var10) {
                                    ++var8;
                                 } else if (var10 < var8) {
                                    --var8;
                                 }

                                 var15 -= 65536;
                                 if ((class100.field1295[class239.field2981][var8][var9] & 4) != 0) {
                                    class420.method3177(var8, var9, -18734, 1, false, class111.field1404);
                                    return;
                                 }
                              }
                           }

                           return;
                        }

                        int var16 = var13 * 65536 / var12;
                        int var17 = 32768;

                        while(var8 != var10) {
                           if (var10 > var8) {
                              ++var8;
                           } else if (var10 < var8) {
                              --var8;
                           }

                           if ((4 & class100.field1295[class239.field2981][var8][var9]) != 0) {
                              class420.method3177(var8, var9, -18734, 1, false, class111.field1404);
                              return;
                           }

                           var17 += var16;
                           if (~var17 <= -65537) {
                              if (var11 > var9) {
                                 ++var9;
                              } else if (~var9 < ~var11) {
                                 --var9;
                              }

                              var17 -= 65536;
                              if ((class100.field1295[class239.field2981][var8][var9] & 4) != 0) {
                                 class420.method3177(var8, var9, -18734, 1, false, class111.field1404);
                                 return;
                              }
                           }
                        }

                        return;
                     }

                     class106.method940(field3096[0] + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class752.field10921 + "," + class17.field237, (Throwable)null, (byte)-33);
                     return;
                  }
               }

            }
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field3096[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1858(int arg0) {
      try {
         ++field3086;
         if (arg0 != 572) {
            return false;
         } else if (!this.field3087) {
            return this.field3084 != null;
         } else {
            return this.field3088 != null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3096[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class246(class327 arg0) {
      boolean var2 = client.field4273;
      super();
      this.field3084 = null;
      this.field3090 = null;
      this.field3088 = null;
      this.field3085 = null;

      try {
         this.field3093 = arg0;
         this.field3087 = this.field3093.field4666;
         if (this.field3087 && !this.field3093.method2493(class335.field4803, -90, class630.field8824)) {
            this.field3087 = false;
         }

         if (this.field3087 || this.field3093.method2594(class630.field8824, 15903, class335.field4803)) {
            class414.method3134(false);
            if (this.field3087) {
               byte[] var3 = class324.method2442(class356.field5079, 127, false);
               this.field3088 = this.field3093.method2490(16, 128, 128, var3, class630.field8824, (byte)-128);
               byte[] var4 = class324.method2442(class771.field11117, 120, false);
               this.field3093.method2490(16, 128, 128, var4, class630.field8824, (byte)-108);
            } else {
               Object var10000;
               byte var10001;
               label55: {
                  this.field3084 = new class610[16];
                  int var5 = 0;
                  if (var2) {
                     var10000 = class356.field5079;
                     var10001 = -69;
                  } else if (~var5 <= -17) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break label55;
                     }
                  } else {
                     var10000 = class356.field5079;
                     var10001 = -69;
                  }

                  while(true) {
                     byte[] var6 = class718.method5221(var10000, var10001, var5 * 16384 * 2, 32768);
                     this.field3084[var5] = this.field3093.method2475(true, 128, var6, class630.field8824, true, 128);
                     ++var5;
                     if (~var5 <= -17) {
                        var10000 = this;
                        var10001 = 16;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class356.field5079;
                        var10001 = -69;
                     }
                  }
               }

               ((class246)var10000).field3090 = new class610[var10001];
               int var7 = 0;
               if (var2 || var7 < 16) {
                  do {
                     byte[] var8 = class718.method5221(class771.field11117, (byte)-69, var7 * 128 * 256, 32768);
                     this.field3090[var7] = this.field3093.method2475(true, 128, var8, class630.field8824, true, 128);
                     ++var7;
                  } while(var7 < 16);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field3096[9] + (arg0 != null ? field3096[6] : field3096[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1859(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1860(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
