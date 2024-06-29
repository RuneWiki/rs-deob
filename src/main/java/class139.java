import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class139 {
   @OriginalMember(
      owner = "client!fg",
      name = "d",
      descriptor = "Lrw;"
   )
   private class788 field2266 = new class788();
   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "Lrw;"
   )
   private class788 field2267 = new class788();
   @OriginalMember(
      owner = "client!fg",
      name = "q",
      descriptor = "Lrw;"
   )
   private class788 field2269 = new class788();
   @OriginalMember(
      owner = "client!fg",
      name = "k",
      descriptor = "Lrw;"
   )
   private class788 field2270 = new class788();
   @OriginalMember(
      owner = "client!fg",
      name = "v",
      descriptor = "Luda;"
   )
   private class473 field2273 = new class473(4);
   @OriginalMember(
      owner = "client!fg",
      name = "w",
      descriptor = "I"
   )
   public volatile int field2275 = 0;
   @OriginalMember(
      owner = "client!fg",
      name = "p",
      descriptor = "B"
   )
   private byte field2277 = 0;
   @OriginalMember(
      owner = "client!fg",
      name = "s",
      descriptor = "I"
   )
   public volatile int field2278 = 0;
   @OriginalMember(
      owner = "client!fg",
      name = "m",
      descriptor = "Luda;"
   )
   private class473 field2276 = new class473(8);
   @OriginalMember(
      owner = "client!fg",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2280 = new String[]{method1308(method1307("ZVR&<")), method1308(method1307("ZVR,<")), method1308(method1307("ZVR.<")), method1308(method1307("ZVR/<")), method1308(method1307("ZVR$<")), method1308(method1307("ZVR!<")), method1308(method1307("RD\u0010\u0006")), method1308(method1307("G\u001fRDi")), method1308(method1307("ZVR\"<")), method1308(method1307("ZVR(<")), method1308(method1307("ZVR <")), method1308(method1307("ZVR)<")), method1308(method1307("ZVR%<")), method1308(method1307("ZVR'<")), method1308(method1307("ZVR:<")), method1308(method1307("ZVR#<")), method1308(method1307("ZVR+<")), method1308(method1307("ZVR-<"))};
   @OriginalMember(
      owner = "client!fg",
      name = "j",
      descriptor = "I"
   )
   public static int field2250;
   @OriginalMember(
      owner = "client!fg",
      name = "i",
      descriptor = "I"
   )
   public static int field2251;
   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "I"
   )
   public static int field2252;
   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "I"
   )
   public static int field2253;
   @OriginalMember(
      owner = "client!fg",
      name = "B",
      descriptor = "I"
   )
   public static int field2254;
   @OriginalMember(
      owner = "client!fg",
      name = "h",
      descriptor = "I"
   )
   public static int field2255;
   @OriginalMember(
      owner = "client!fg",
      name = "n",
      descriptor = "I"
   )
   public static int field2256;
   @OriginalMember(
      owner = "client!fg",
      name = "r",
      descriptor = "I"
   )
   public static int field2257;
   @OriginalMember(
      owner = "client!fg",
      name = "o",
      descriptor = "I"
   )
   public static int field2258;
   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "I"
   )
   public static int field2259;
   @OriginalMember(
      owner = "client!fg",
      name = "t",
      descriptor = "I"
   )
   public static int field2260;
   @OriginalMember(
      owner = "client!fg",
      name = "g",
      descriptor = "I"
   )
   public static int field2261;
   @OriginalMember(
      owner = "client!fg",
      name = "y",
      descriptor = "I"
   )
   public static int field2262;
   @OriginalMember(
      owner = "client!fg",
      name = "D",
      descriptor = "I"
   )
   public static int field2263;
   @OriginalMember(
      owner = "client!fg",
      name = "u",
      descriptor = "I"
   )
   public static int field2264;
   @OriginalMember(
      owner = "client!fg",
      name = "l",
      descriptor = "I"
   )
   public static int field2265;
   @OriginalMember(
      owner = "client!fg",
      name = "C",
      descriptor = "I"
   )
   public static int field2268;
   @OriginalMember(
      owner = "client!fg",
      name = "x",
      descriptor = "I"
   )
   private int field2272;
   @OriginalMember(
      owner = "client!fg",
      name = "e",
      descriptor = "J"
   )
   private long field2274;
   @OriginalMember(
      owner = "client!fg",
      name = "f",
      descriptor = "Lgf;"
   )
   private class290 field2279;
   @OriginalMember(
      owner = "client!fg",
      name = "A",
      descriptor = "Lft;"
   )
   private class4 field2271;

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(ZI)V",
      line = 6
   )
   public final void method1291(boolean arg0, int arg1) {
      try {
         ++field2253;
         if (this.field2271 != null) {
            if (arg1 == 3) {
               try {
                  this.field2273.field6907 = 0;
                  this.field2273.method3571(255, arg0 ? 2 : 3);
                  this.field2273.method3573(-97, 0);
                  this.field2271.method30(4, 0, this.field2273.field6889, (byte)-68);
               } catch (IOException var5) {
                  try {
                     this.field2271.method29(1);
                  } catch (Exception var4) {
                  }

                  ++this.field2275;
                  this.field2278 = -2;
                  this.field2271 = null;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2280[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IZLft;)V",
      line = 35
   )
   public final void method1292(int arg0, boolean arg1, class4 arg2) {
      boolean var4 = client.field4564;

      try {
         if (this.field2271 != null) {
            try {
               this.field2271.method29(arg0 + 1);
            } catch (Exception var9) {
            }

            this.field2271 = null;
         }

         ++field2252;
         this.field2271 = arg2;
         this.method1302((byte)-55);
         this.method1291(arg1, 3);
         this.field2279 = null;
         this.field2276.field6907 = 0;

         label78:
         while(true) {
            class290 var5 = (class290)this.field2267.method5679((byte)66);
            if (var5 != null) {
               this.field2266.method5681(var5, (byte)-111);
               if (!var4) {
                  if (!var4) {
                     continue;
                  }
               } else {
                  if (var5 == null) {
                     break;
                  }

                  this.field2269.method5681(var5, (byte)-47);
                  if (var4) {
                     return;
                  }

                  if (var4) {
                     break;
                  }
               }
            }

            while(true) {
               var5 = (class290)this.field2270.method5679((byte)124);
               if (var5 == null) {
                  break label78;
               }

               this.field2269.method5681(var5, (byte)-47);
               if (var4) {
                  return;
               }

               if (var4) {
                  break label78;
               }
            }
         }

         if (~this.field2277 != -1) {
            try {
               this.field2273.field6907 = 0;
               this.field2273.method3571(255, 4);
               this.field2273.method3571(arg0 ^ 255, this.field2277);
               this.field2273.method3550(0, arg0 ^ 29620);
               this.field2271.method30(4, 0, this.field2273.field6889, (byte)-68);
            } catch (IOException var8) {
               try {
                  this.field2271.method29(1);
               } catch (Exception var7) {
               }

               ++this.field2275;
               this.field2278 = -2;
               this.field2271 = null;
            }
         }

         this.field2272 = arg0;
         this.field2274 = class57.method650(110);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2280[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2280[7] : field2280[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "(I)I",
      line = 103
   )
   private final int method1293(int arg0) {
      try {
         ++field2260;
         if (arg0 != 0) {
            this.method1302((byte)-61);
         }

         return this.field2269.method5674(125) + this.field2270.method5674(126);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "d",
      descriptor = "(I)Z",
      line = 116
   )
   public final boolean method1294(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(Z)I",
      line = 392
   )
   public final int method1295(boolean arg0) {
      try {
         ++field2259;
         return arg0 ? -67 : this.field2266.method5674(126) + this.field2267.method5674(125);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(I)Z",
      line = 403
   )
   public final boolean method1296(int arg0) {
      try {
         ++field2268;
         if (arg0 != 0) {
            return true;
         } else {
            return this.method1295(false) >= 20;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IIIIFZII)[I",
      line = 416
   )
   public static final int[] method1297(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7) {
      try {
         ++field2262;
         int[] var8 = new int[arg2];
         class573 var9 = new class573();
         if (arg7 != -29551) {
            field2258 = 82;
         }

         var9.field8283 = (int)(arg4 * 4096.0F);
         var9.field8293 = arg5;
         var9.field8285 = arg1;
         var9.field8289 = arg6;
         var9.field8290 = arg0;
         var9.field8278 = arg3;
         var9.method901(245880940);
         class558.method4168(1, 0, arg2);
         var9.method4244(0, var8, 0);
         return var8;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2280[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(BII)Z",
      line = 440
   )
   public static final boolean method1298(byte arg0, int arg1, int arg2) {
      try {
         ++field2251;
         if (arg0 != -123) {
            method1297(34, 28, 95, 108, 0.7137644F, true, 52, -78);
         }

         return class577.method4262(arg1, 0, arg2) & ((arg1 & 8192) != 0 | class4.method28(arg1, (byte)-43, arg2) | class520.method3925(89, arg2, arg1));
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2280[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "(I)Z",
      line = 453
   )
   public final boolean method1299(int arg0) {
      try {
         ++field2265;
         if (arg0 != 20) {
            method1297(-65, 113, -31, 31, -0.6526282F, true, 80, -5);
         }

         return this.method1293(0) >= 20;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "d",
      descriptor = "(B)V",
      line = 464
   )
   public final void method1300(byte arg0) {
      try {
         ++field2264;
         if (this.field2271 != null) {
            this.field2271.method23(0);
         }

         if (arg0 > -44) {
            this.field2267 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V",
      line = 479
   )
   public static final void method1301(String arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         ++field2250;
         if (arg0 != null) {
            if (arg0.startsWith("*")) {
               arg0 = arg0.substring(1);
            }

            String var3 = class496.method3743(arg0, false);
            if (var3 != null) {
               int var4 = 0;
               if (var2 || var4 < class128.field2146) {
                  label84:
                  do {
                     String var5 = class670.field9809[var4];
                     if (var5.startsWith("*")) {
                        var5 = var5.substring(1);
                     }

                     String var6 = class496.method3743(var5, false);
                     if (var6 != null) {
                        if (!var6.equals(var3)) {
                           ++var4;
                        } else {
                           --class128.field2146;
                           int var7 = var4;
                           if (var2) {
                              class670.field9809[var4] = class670.field9809[var4 + 1];
                              class269.field3809[var4] = class269.field3809[var4 - -1];
                              class289.field4052[var4] = class289.field4052[var4 + 1];
                              class510.field7452[var4] = class510.field7452[var4 - -1];
                              class206.field3067[var4] = class206.field3067[var4 + 1];
                              class170.field2649[var4] = class170.field2649[var4 + 1];
                              var7 = var4 + 1;
                           }

                           while(true) {
                              while(class128.field2146 > var7) {
                                 class670.field9809[var7] = class670.field9809[var7 + 1];
                                 class269.field3809[var7] = class269.field3809[var7 - -1];
                                 class289.field4052[var7] = class289.field4052[var7 + 1];
                                 class510.field7452[var7] = class510.field7452[var7 - -1];
                                 class206.field3067[var7] = class206.field3067[var7 + 1];
                                 class170.field2649[var7] = class170.field2649[var7 + 1];
                                 ++var7;
                              }

                              ++class449.field6552;
                              class447.field6528 = class660.field9612;
                              class542 var8 = class549.method4093((byte)-113, class6.field64, class126.field2108);
                              var8.field7859.method3571(255, class70.method747(arg0, -9));
                              var8.field7859.method3546((byte)-95, arg0);
                              class740.method5332(var8, (byte)77);
                              if (!var2) {
                                 if (!var2) {
                                    break label84;
                                 }

                                 ++var4;
                                 break;
                              }

                              ++var7;
                           }
                        }
                     } else {
                        ++var4;
                     }
                  } while(var4 < class128.field2146);
               }

               if (arg1 >= -21) {
                  field2258 = 90;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2280[5] + (arg0 != null ? field2280[7] : field2280[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "(B)V",
      line = 548
   )
   private final void method1302(byte arg0) {
      try {
         ++field2257;
         if (this.field2271 != null) {
            try {
               this.field2273.field6907 = 0;
               this.field2273.method3571(255, 6);
               if (arg0 == -55) {
                  this.field2273.method3573(-51, 3);
                  this.field2271.method30(4, 0, this.field2273.field6889, (byte)-68);
               }
            } catch (IOException var4) {
               try {
                  this.field2271.method29(1);
               } catch (Exception var3) {
               }

               this.field2271 = null;
               ++this.field2275;
               this.field2278 = -2;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2280[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(B)V",
      line = 575
   )
   public final void method1303(byte arg0) {
      try {
         ++field2261;

         try {
            this.field2271.method29(1);
         } catch (Exception var3) {
         }

         this.field2278 = -1;
         this.field2277 = (byte)((int)(Math.random() * 255.0D + 1.0D));
         if (arg0 > -115) {
            method1298((byte)-30, -88, 80);
         }

         ++this.field2275;
         this.field2271 = null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2280[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IZIBB)Lgf;",
      line = 593
   )
   public final class290 method1304(int arg0, boolean arg1, int arg2, byte arg3, byte arg4) {
      try {
         ++field2254;
         long var6 = (long)((arg2 << 16) + arg0);
         class290 var8 = new class290();
         var8.field4061 = arg4;
         var8.field4416 = var6;
         var8.field6321 = arg1;
         if (arg3 != -23) {
            return null;
         } else {
            if (arg1) {
               if (this.method1295(false) >= 20) {
                  throw new RuntimeException();
               }

               this.field2266.method5681(var8, (byte)-48);
               if (!client.field4564) {
                  return var8;
               }
            }

            if (this.method1293(0) >= 20) {
               throw new RuntimeException();
            } else {
               this.field2269.method5681(var8, (byte)-100);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2280[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "e",
      descriptor = "(I)V",
      line = 639
   )
   public final void method1305(int arg0) {
      try {
         ++field2256;
         if (this.field2271 != null) {
            try {
               this.field2273.field6907 = 0;
               this.field2273.method3571(255, 7);
               this.field2273.method3573(arg0 + -41, 0);
               this.field2271.method30(4, arg0, this.field2273.field6889, (byte)-68);
            } catch (IOException var4) {
               try {
                  this.field2271.method29(1);
               } catch (Exception var3) {
               }

               this.field2278 = -2;
               ++this.field2275;
               this.field2271 = null;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2280[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "(B)V",
      line = 663
   )
   public final void method1306(byte arg0) {
      try {
         if (this.field2271 != null) {
            this.field2271.method29(1);
         }

         if (arg0 <= 56) {
            this.field2273 = null;
         }

         ++field2263;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2280[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1307(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1308(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
