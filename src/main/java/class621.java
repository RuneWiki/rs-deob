import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class621 {
   @OriginalMember(
      owner = "client!et",
      name = "g",
      descriptor = "I"
   )
   private int field9152 = -1;
   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "Lll;"
   )
   private class387 field9149 = new class387();
   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9153 = new String[]{method4522(method4521("YE\u00002l")), method4522(method4521("L\u001eBp")), method4522(method4521("G\u001f\u0000 xL\u0002Z\"9")), method4522(method4521("G\u001f\u0000^9")), method4522(method4521("G\u001f\u0000]9")), method4522(method4521("VQ")), method4522(method4521("G\u001f\u0000_9")), method4522(method4521("w\u0005\\yrM\f@ubG\u000f\u000e_}C\u0005}yeV\u0002@{bf\u000eBhp\u0002\u001fWlt\u0002\u0002@<uG\bAxt\nB")), method4522(method4521("G\u001f\u0000Z9")), method4522(method4521("T\u001b")), method4522(method4521("G\u001f\u0000X9")), method4522(method4521("\u0002\u000fKpeCEAk\u007fG\u0019\u0014")), method4522(method4521("\u0002\u001e^xpV\u000e`i|\u0018")), method4522(method4521("a\u0007OrBG\u001fZu\u007fE\u0018jy}V\n\u0000}aR\u0007WH~a\u0007OrBG\u001fZu\u007fE\u0018\u00065+\u0002(\\yuG\u0005ZupN\u0018\u000ex~\u0002\u0005Ah1O\nZ\u007fy\u0003K}yeV\u0002@{b\f\u0004YrtPQ")), method4522(method4521("G\u001f\u0000Y9"))};
   @OriginalMember(
      owner = "client!et",
      name = "d",
      descriptor = "Lqd;"
   )
   public static class475 field9144 = new class475("", 14);
   @OriginalMember(
      owner = "client!et",
      name = "f",
      descriptor = "I"
   )
   public static int field9145;
   @OriginalMember(
      owner = "client!et",
      name = "c",
      descriptor = "I"
   )
   public static int field9146;
   @OriginalMember(
      owner = "client!et",
      name = "b",
      descriptor = "I"
   )
   public static int field9147;
   @OriginalMember(
      owner = "client!et",
      name = "h",
      descriptor = "I"
   )
   public static int field9148;
   @OriginalMember(
      owner = "client!et",
      name = "e",
      descriptor = "I"
   )
   public static int field9151;
   @OriginalMember(
      owner = "client!et",
      name = "j",
      descriptor = "J"
   )
   private long field9150;
   @OriginalMember(
      owner = "client!et",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field9143;

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(Lnu;IIILjava/awt/Component;)Lefa;"
   )
   public static final class197 method4515(class619 arg0, int arg1, int arg2, int arg3, Component arg4) {
      try {
         ++field9147;
         if (class83.field1082 == 0) {
            throw new IllegalStateException();
         } else if (~arg2 <= -1 && arg2 < 2) {
            if (~arg3 > -257) {
               arg3 = 256;
            }

            try {
               class197 var5 = (class197)Class.forName(field9153[9]).newInstance();
               var5.field2778 = new int[(!class65.field790 ? 1 : 2) * 256];
               var5.field2796 = arg3;
               var5.method1540(arg4);
               var5.field2797 = (arg3 & -1024) + 1024;
               if (~var5.field2797 < -16385) {
                  var5.field2797 = 16384;
               }

               if (arg1 != -28746) {
                  return null;
               } else {
                  var5.method1550(var5.field2797);
                  if (class598.field8790 > 0 && class14.field159 == null) {
                     class14.field159 = new class237();
                     class14.field159.field3296 = arg0;
                     arg0.method4504(class14.field159, class598.field8790, 0);
                  }

                  if (class14.field159 != null) {
                     if (class14.field159.field3302[arg2] != null) {
                        throw new IllegalArgumentException();
                     }

                     class14.field159.field3302[arg2] = var5;
                  }

                  return var5;
               }
            } catch (Throwable var9) {
               try {
                  class671 var6 = new class671(arg0, arg2);
                  var6.field2778 = new int[(!class65.field790 ? 1 : 2) * 256];
                  var6.field2796 = arg3;
                  var6.method1540(arg4);
                  var6.field2797 = 16384;
                  var6.method1550(var6.field2797);
                  if (class598.field8790 > 0 && class14.field159 == null) {
                     class14.field159 = new class237();
                     class14.field159.field3296 = arg0;
                     arg0.method4504(class14.field159, class598.field8790, arg1 ^ -28746);
                  }

                  if (class14.field159 != null) {
                     if (class14.field159.field3302[arg2] != null) {
                        throw new IllegalArgumentException();
                     }

                     class14.field159.field3302[arg2] = var6;
                  }

                  return var6;
               } catch (Throwable var8) {
                  return new class197();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field9153[8] + (arg0 != null ? field9153[0] : field9153[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9153[0] : field9153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4516(int arg0) {
      try {
         if (arg0 == 19916) {
            field9144 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9153[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(ZLwf;)V"
   )
   private final void method4517(boolean param1, class147 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(ILha;Lrd;Ldja;)V"
   )
   public static final void method4518(int arg0, class66 arg1, class357 arg2, class326 arg3) {
      boolean var4 = client.field4360;

      try {
         if (arg0 != 5) {
            method4519((byte)95);
         }

         ++field9146;
         class492 var5 = arg3.method2417(arg1, 5987);
         if (var5 != null) {
            int var6 = var5.method958();
            if (~var6 > ~var5.method963()) {
               var6 = var5.method963();
            }

            byte var7 = 10;
            int var8 = arg2.field4800;
            int var9 = arg2.field4802;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg3.field4461 != null) {
               var10 = class705.field10283.method1629(false, class305.field4181, (class492[])null, arg3.field4461, (int[])null);
               int var13 = 0;
               if (var4 || var13 < var10) {
                  do {
                     String var14 = class305.field4181[var13];
                     if (~var13 > ~(var10 - 1)) {
                        var14 = var14.substring(0, var14.length() + -4);
                     }

                     int var15 = class12.field132.method3461(var14);
                     if (~var11 > ~var15) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(var13 < var10);
               }

               var12 = class12.field132.method3463() * var10 - -(class12.field132.method3465() / 2);
            }

            int var16;
            int var17;
            label105: {
               var16 = var6 / 2 + arg2.field4800;
               var17 = arg2.field4802;
               if (~(class650.field9507 + var6) >= ~var8) {
                  if (-var6 + class650.field9510 >= var8) {
                     break label105;
                  }

                  var8 = -var6 + class650.field9510;
                  var16 = -(var6 / 2) + -(var11 / 2) + -5 + -var7 + class650.field9510;
                  if (!var4) {
                     break label105;
                  }
               }

               var8 = class650.field9507;
               var16 = class650.field9507 + var7 - -(var6 / 2) - (-(var11 / 2) + -5);
            }

            label98: {
               if (~var9 > ~(class650.field9521 + var6)) {
                  var9 = class650.field9521;
                  var17 = var6 / 2 + (class650.field9521 - -var7);
                  if (!var4) {
                     break label98;
                  }
               }

               if (~(-var6 + class650.field9508) > ~var9) {
                  var9 = -var6 + class650.field9508;
                  var17 = -(var6 / 2) + class650.field9508 - (var7 + var12);
               }
            }

            int var18 = 65535 & (int)(32767.0D * (Math.atan2((double)(-arg2.field4800 + var8), (double)(-arg2.field4802 + var9)) / 3.141592653589793D));
            var5.method3579((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            if (arg3.field4461 != null) {
               var19 = -(var11 / 2) + var16 - 5;
               var20 = var17;
               var22 = var17 + 3 - -(class12.field132.method3463() * var10);
               var21 = var11 + var19 + 10;
               if (arg3.field4417 != 0) {
                  arg1.method533(arg3.field4417, var19, var17, var21 - var19, (byte)118, -var17 + var22);
               }

               if (~arg3.field4458 != -1) {
                  arg1.method566(var17, (byte)-124, var19, -var19 + var21, arg3.field4458, -var17 + var22);
               }

               int var23 = 0;
               if (var4 || var10 > var23) {
                  do {
                     String var24 = class305.field4181[var23];
                     if (~var23 > ~(var10 + -1)) {
                        var24 = var24.substring(0, -4 + var24.length());
                     }

                     class12.field132.method3460(arg1, var24, var16, var17, arg3.field4418, true);
                     var17 += class12.field132.method3463();
                     ++var23;
                  } while(var10 > var23);
               }
            }

            if (arg3.field4452 != -1 || arg3.field4461 != null) {
               class586 var25 = new class586(arg2);
               int var26 = var6 >> 1;
               var25.field8660 = var21;
               var25.field8669 = var22;
               var25.field8659 = var20;
               var25.field8667 = var19;
               var25.field8664 = var9 - -var26;
               var25.field8663 = var8 - var26;
               var25.field8668 = var8 - -var26;
               var25.field8661 = -var26 + var9;
               class792.field11613.method2930((byte)-49, var25);
            }

         }
      } catch (RuntimeException var28) {
         throw class237.method1823(var28, field9153[4] + arg0 + ',' + (arg1 != null ? field9153[0] : field9153[1]) + ',' + (arg2 != null ? field9153[0] : field9153[1]) + ',' + (arg3 != null ? field9153[0] : field9153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4519(byte arg0) {
      try {
         ++field9145;
         if (arg0 != 125) {
            method4518(14, (class66)null, (class357)null, (class326)null);
         }

         class662.field9637 = null;
         if (class681.field10034 && ~class713.method5178(23) != -2) {
            class153.method1281(class45.method377((byte)-37), 0, class121.method976(false), -1, 0, ~class622.field9156 == -4 || class622.field9156 == 7);
         }

         int var1 = 0;
         int var2 = 0;
         if (class681.field10034) {
            var1 = class85.method755((byte)50);
            var2 = class592.method4305((byte)99);
         }

         class397.method3000(-1, var2, var2, class692.field10185 + var2, class185.field2623, var1, var1, class237.field3310 + var1, (byte)39);
         if (class662.field9637 != null) {
            class382.method2886(var1, -1412584499, class237.field3310 + var1, class662.field9637, true, class368.field5038.field9950, class692.field10185 + var2, class555.field7972, class442.field6305, 8822, var2);
            class662.field9637 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9153[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method4520(class472 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!et",
      name = "<init>",
      descriptor = "(Lwf;)V"
   )
   public class621(class147 arg0) {
      try {
         this.method4517(false, arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9153[2] + (arg0 != null ? field9153[0] : field9153[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
