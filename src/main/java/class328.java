import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class328 extends class29 {
   @OriginalMember(
      owner = "client!qja",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4710 = new String[]{method2617(method2616("v\u00069t(/")), method2617(method2616("i\u001946")), method2617(method2616("v\u00069t /")), method2617(method2616("|Bvt\u0014")), method2617(method2616("v\u00069t//")), method2617(method2616("v\u00069t-/")), method2617(method2616("v\u00069t*/")), method2617(method2616("v\u00069t'/")), method2617(method2616("v\u00069t,/")), method2617(method2616("T9\u001a")), method2617(method2616("v\u00069t$/")), method2617(method2616("v\u00069t!/")), method2617(method2616("v\u00069t./")), method2617(method2616("v\u00069t+/"))};
   @OriginalMember(
      owner = "client!qja",
      name = "D",
      descriptor = "F"
   )
   private float field4695;
   @OriginalMember(
      owner = "client!qja",
      name = "s",
      descriptor = "F"
   )
   private float field4703;
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "I"
   )
   public static int field4693;
   @OriginalMember(
      owner = "client!qja",
      name = "v",
      descriptor = "I"
   )
   public static int field4694;
   @OriginalMember(
      owner = "client!qja",
      name = "r",
      descriptor = "I"
   )
   public static int field4696;
   @OriginalMember(
      owner = "client!qja",
      name = "p",
      descriptor = "I"
   )
   private int field4697;
   @OriginalMember(
      owner = "client!qja",
      name = "y",
      descriptor = "I"
   )
   public static int field4699;
   @OriginalMember(
      owner = "client!qja",
      name = "q",
      descriptor = "I"
   )
   public static int field4700;
   @OriginalMember(
      owner = "client!qja",
      name = "E",
      descriptor = "I"
   )
   public static int field4701;
   @OriginalMember(
      owner = "client!qja",
      name = "F",
      descriptor = "I"
   )
   public static int field4702;
   @OriginalMember(
      owner = "client!qja",
      name = "G",
      descriptor = "I"
   )
   private int field4704;
   @OriginalMember(
      owner = "client!qja",
      name = "B",
      descriptor = "I"
   )
   public static int field4707;
   @OriginalMember(
      owner = "client!qja",
      name = "A",
      descriptor = "I"
   )
   public static int field4708;
   @OriginalMember(
      owner = "client!qja",
      name = "x",
      descriptor = "I"
   )
   public static int field4709;
   @OriginalMember(
      owner = "client!qja",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private String field4692;
   @OriginalMember(
      owner = "client!qja",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   private String field4705;
   @OriginalMember(
      owner = "client!qja",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field4706;
   @OriginalMember(
      owner = "client!qja",
      name = "u",
      descriptor = "[[[J"
   )
   public static long[][][] field4698;

   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2607(byte arg0) {
      try {
         if (arg0 >= -68) {
            field4698 = null;
         }

         field4698 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4710[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method242(int arg0, OggPacket arg1) {
      try {
         ++field4696;
         if (~super.field355 >= -1 || field4710[9].equals(this.field4706)) {
            class594 var3 = new class594(arg1.getData());
            int var4 = var3.method4288((byte)71);
            if (arg0 != 16) {
               method2613((class594)null, (byte)-31);
            }

            if (super.field355 <= 8) {
               if ((var4 | 128) == 0) {
                  throw new IllegalStateException();
               }

               if (~super.field355 == -1) {
                  var3.field8243 += 23;
                  this.field4704 = var3.method4322(-1165420232);
                  this.field4697 = var3.method4322(-1165420232);
                  if (~this.field4704 != -1 && ~this.field4697 != -1) {
                     class594 var5 = new class594(16);
                     var3.method4276(var5.field8227, 16, 0, 0);
                     this.field4705 = var5.method4291(arg0 + -35);
                     var5.field8243 = 0;
                     var3.method4276(var5.field8227, 16, arg0 ^ 16, 0);
                     this.field4706 = var5.method4291(arg0 ^ -124);
                     return;
                  }

                  throw new IllegalStateException();
               }
            } else {
               if (var4 == 0) {
                  long var6 = var3.method4289(-14);
                  long var8 = var3.method4289(-17);
                  long var10 = var3.method4289(arg0 ^ -125);
                  if (~var6 > -1L || var8 < 0L || var10 < 0L || var6 < var10) {
                     throw new IllegalStateException();
                  }

                  this.field4703 = (float)((var6 + var8) * (long)this.field4697) / (float)this.field4704;
                  this.field4695 = (float)((long)this.field4697 * var6) / (float)this.field4704;
                  int var12 = var3.method4322(-1165420232);
                  if (~var12 > -1 || var12 > var3.field8227.length + -var3.field8243) {
                     throw new IllegalStateException();
                  }

                  this.field4692 = class10.method85(var3.field8227, var12, var3.field8243, 0);
               }

               if ((var4 | 128) != 0) {
                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field4710[8] + arg0 + ',' + (arg1 != null ? field4710[3] : field4710[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "e",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method2608(byte arg0) {
      try {
         ++field4702;
         return arg0 != -1 ? null : this.field4705;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4710[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "(Z)Ljava/lang/String;"
   )
   public final String method2609(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field4707;
            return this.field4692;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4710[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method238(byte arg0) {
      try {
         if (arg0 != 112) {
            this.field4706 = null;
         }

         ++field4708;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4710[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ZLme;)V"
   )
   public static final void method2610(boolean arg0, class206 arg1) {
      try {
         arg1.method4337(class334.field4789.method739(-126), 1184007664);
         ++field4693;
         arg1.method4337(class41.field480.method739(-70), 1184007664);
         arg1.method4337(class532.field7277.method739(-78), 1184007664);
         arg1.method4337(class21.field261.method739(-96), 1184007664);
         arg1.method4337(class74.field943.method739(-101), 1184007664);
         arg1.method4337(class95.field1264.method739(-87), 1184007664);
         arg1.method4337(class590.field8143.method739(-91), 1184007664);
         arg1.method4337(class66.field763.method739(-103), 1184007664);
         arg1.method4337(class354.field5051.method739(-84), 1184007664);
         arg1.method4337(class316.field4231.method739(-56), 1184007664);
         arg1.method4337(class327.field4426.method739(-127), 1184007664);
         arg1.method4337(class711.field10432.method739(-56), 1184007664);
         arg1.method4337(class694.field10159.method739(-108), 1184007664);
         arg1.method4337(class194.field2365.method739(-47), 1184007664);
         arg1.method4337(class154.field1993.method739(-105), 1184007664);
         arg1.method4337(class237.field2935.method739(-59), 1184007664);
         arg1.method4337(class156.field2009.method739(-110), 1184007664);
         arg1.method4337(class335.field4809.method739(-121), 1184007664);
         arg1.method4337(class281.field3754.method739(-52), 1184007664);
         arg1.method4337(class737.field10752.method739(-45), 1184007664);
         arg1.method4337(class355.field5060.method739(-60), 1184007664);
         arg1.method4337(class310.field4108.method739(-51), 1184007664);
         arg1.method4337(class12.field144.method739(-120), 1184007664);
         arg1.method4337(class554.field7627.method739(-124), 1184007664);
         if (!arg0) {
            field4698 = null;
         }

         arg1.method4337(class771.field11128.method739(-85), 1184007664);
         arg1.method4337(class698.field10188.method739(-60), 1184007664);
         arg1.method4337(class462.field6334.method739(-97), 1184007664);
         arg1.method4337(class554.field7626.method739(-119), 1184007664);
         arg1.method4337(class150.field1959.method739(-64), 1184007664);
         arg1.method4337(class92.field1232.method739(-86), 1184007664);
         arg1.method4337(class111.field1405.method739(-81), 1184007664);
         arg1.method4337(class226.field2842.method739(-66), 1184007664);
         arg1.method4337(class526.method3796((byte)-117), 1184007664);
         arg1.method4337(class573.method4123((byte)65), 1184007664);
         arg1.method4337(class135.field1757.method739(-104), 1184007664);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4710[13] + arg0 + ',' + (arg1 != null ? field4710[3] : field4710[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public static final void method2611(class594 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field4700;
         byte[] var3 = new byte[24];
         if (arg1 != -36) {
            method2611((class594)null, (byte)-1);
         }

         if (class532.field7280 != null) {
            try {
               int var10000;
               byte var10001;
               label85: {
                  class532.field7280.method1977(6825, 0L);
                  class532.field7280.method1978(681, var3);
                  int var4 = 0;
                  if (var2) {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  } else if (var4 >= 24) {
                     var10000 = ~var4;
                     var10001 = -25;
                     if (!var2) {
                        break label85;
                     }
                  } else {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  }

                  label84:
                  do {
                     while(true) {
                        if (var10000 != var10001) {
                           if (!var2) {
                              var10000 = ~var4;
                              var10001 = -25;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (var4 >= 24) {
                           var10000 = ~var4;
                           var10001 = -25;
                           if (!var2) {
                              break label84;
                           }
                        } else {
                           var10000 = ~var3[var4];
                           var10001 = -1;
                        }
                     }
                  } while(var2);
               }

               if (var10000 <= var10001) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -25) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         arg0.method4321(24, 0, 110909448, var3);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4710[11] + (arg0 != null ? field4710[3] : field4710[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "d",
      descriptor = "(B)F"
   )
   public final float method2612(byte arg0) {
      try {
         ++field4699;
         int var2 = -85 / ((arg0 - 20) / 58);
         return this.field4703;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4710[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(Lwm;B)Ldp;"
   )
   public static final class3 method2613(class594 arg0, byte arg1) {
      try {
         ++field4709;
         class11 var2 = class764.method5490(-126, arg0);
         if (arg1 != 84) {
            field4698 = null;
         }

         int var3 = arg0.method4309((byte)85);
         return new class3(var2.field130, var2.field129, var2.field128, var2.field131, var2.field132, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4710[2] + (arg0 != null ? field4710[3] : field4710[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(I)F"
   )
   public final float method2614(int arg0) {
      try {
         ++field4694;
         if (arg0 != -29405) {
            this.method238((byte)69);
         }

         return this.field4695;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4710[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method2615(byte arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field4701;
         if (class221.field2764 && ~(24 & class32.field377) != -1) {
            boolean var3 = false;
            int var4 = class261.field3357;
            if (arg0 >= -47) {
               field4698 = null;
            }

            int[] var5 = class294.field3862;
            int var6 = 0;
            if (var2 || ~var4 < ~var6) {
               do {
                  class404 var7 = class136.field1773[var5[var6]];
                  if (var7.field5662 != null) {
                     if (!var7.field5662.equalsIgnoreCase(arg1)) {
                        ++var6;
                     } else {
                        if (class278.field3709 != var7 || ~(16 & class32.field377) == -1) {
                           if (var7 == null) {
                              ++var6;
                              continue;
                           }

                           if ((8 & class32.field377) == 0) {
                              ++var6;
                              continue;
                           }
                        }

                        ++class422.field5914;
                        class471 var8 = class133.method1118(class605.field8474.field2787, 2, class169.field2130);
                        var8.field6527.method4298(0, 128);
                        var8.field6527.method4308(true, class226.field2837);
                        var8.field6527.method4337(class593.field8208, 1184007664);
                        var8.field6527.method4314(-30, var5[var6]);
                        var8.field6527.method4284(class110.field1389, -31429);
                        class605.field8474.method1702((byte)-124, var8);
                        var3 = true;
                        class280.method2134(true, var7.field7853[0], 0, var7.method3060((byte)38), 60, var7.method3060((byte)38), 0, var7.field7855[0], -2);
                        if (!var2) {
                           break;
                        }

                        ++var6;
                     }
                  } else {
                     ++var6;
                  }
               } while(~var4 < ~var6);
            }

            if (!var3) {
               class545.method3938(-7764, 4, class551.field7542.method3980(class494.field6787, true) + arg1);
            }

            if (class221.field2764) {
               class239.method1790(67);
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4710[7] + arg0 + ',' + (arg1 != null ? field4710[3] : field4710[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qja",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class328(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
