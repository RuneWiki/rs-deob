import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class84 {
   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1306 = new String[]{method894(method893("A\\J/\u0001")), method894(method893("K\u0007JCT")), method894(method893("^\\\b\u0001")), method894(method893("A\\J)\u0001")), method894(method893("A\\J,\u0001")), method894(method893("A\\J.\u0001"))};
   @OriginalMember(
      owner = "client!qu",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field1301 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!qu",
      name = "g",
      descriptor = "D"
   )
   public static double field1298;
   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "I"
   )
   public static int field1297;
   @OriginalMember(
      owner = "client!qu",
      name = "d",
      descriptor = "I"
   )
   public static int field1300;
   @OriginalMember(
      owner = "client!qu",
      name = "e",
      descriptor = "I"
   )
   public static int field1303;
   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "Lua;"
   )
   public static class569 field1304;
   @OriginalMember(
      owner = "client!qu",
      name = "h",
      descriptor = "Lwb;"
   )
   public class578 field1299;
   @OriginalMember(
      owner = "client!qu",
      name = "i",
      descriptor = "Lqu;"
   )
   public class84 field1305;
   @OriginalMember(
      owner = "client!qu",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1302;

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method889(byte arg0) {
      try {
         field1304 = null;
         field1302 = null;
         int var1 = -73 % ((-21 - arg0) / 62);
         field1301 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1306[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method890(int arg0) {
      try {
         ++field1303;
         if (~class171.field2568 > -501) {
            if (arg0 != 26325) {
               field1298 = 0.0664206370914983D;
            }

            this.field1299 = null;
            this.field1305 = class62.field878;
            ++class171.field2568;
            class62.field878 = this;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1306[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(ZIILkaa;Llw;)V"
   )
   public static final void method891(boolean arg0, int arg1, int arg2, class158 arg3, class408 arg4) {
      boolean var5 = client.field10022;

      try {
         ++field1300;
         byte var6 = -1;
         if (~(2048 & arg2) != -1) {
            var6 = arg4.method652(255);
         }

         if (~(arg2 & 4096) != -1) {
            label292: {
               arg3.field5811 = arg4.method640((byte)51);
               if (arg3.field5811.charAt(0) != '~') {
                  if (class117.field1849 != arg3) {
                     break label292;
                  }

                  class203.method1764(0, (byte)-7, arg3.field2414, arg3.method1509(-256, true), 2, arg3.method1500(false, (byte)-110), arg3.field5811);
                  if (!var5) {
                     break label292;
                  }
               }

               arg3.field5811 = arg3.field5811.substring(1);
               class203.method1764(0, (byte)-7, arg3.field2414, arg3.method1509(-256, true), 2, arg3.method1500(false, (byte)-128), arg3.field5811);
            }

            arg3.field5783 = 0;
            arg3.field5818 = 0;
            arg3.field5817 = 150;
         }

         if ((64 & arg2) != 0) {
            int var7 = arg4.method651(-1);
            if (~var7 == -65536) {
               var7 = -1;
            }

            int var8 = arg4.method666((byte)28);
            int var9 = arg4.method665(arg0);
            int var10 = 7 & var9;
            int var11 = var9 >> 3 & 15;
            if (var11 == 15) {
               var11 = -1;
            }

            arg3.method3070(var10, (byte)40, 0, false, var11, var8, var7);
         }

         if (~(arg2 & 2) != -1) {
            int var12 = arg4.method693((byte)114);
            if (var12 > 0) {
               int var13 = 0;
               if (var5 || var13 < var12) {
                  do {
                     int var14;
                     int var15;
                     int var16;
                     int var17;
                     label302: {
                        var14 = -1;
                        var15 = -1;
                        var16 = -1;
                        var17 = arg4.method682(-103);
                        if (~var17 == -32768) {
                           var17 = arg4.method682(-115);
                           var15 = arg4.method682(-81);
                           var14 = arg4.method682(-112);
                           var16 = arg4.method682(-115);
                           if (!var5) {
                              break label302;
                           }
                        }

                        if (var17 == 32766) {
                           var17 = -1;
                           if (!var5) {
                              break label302;
                           }
                        }

                        var15 = arg4.method682(-64);
                     }

                     int var18 = arg4.method682(-92);
                     int var19 = arg4.method647((byte)117);
                     arg3.method3066(false, var18, var16, var15, class51.field770, var19, var17, var14);
                     ++var13;
                  } while(var13 < var12);
               }
            }
         }

         if (~(arg2 & 65536) != -1) {
            arg3.field2399 = arg4.method688(-19476) == 1;
         }

         if (~(1 & arg2) != -1) {
            arg3.field2419 = arg4.method651(-1);
            if (~arg3.field5860 == -1) {
               arg3.method3071(arg3.field2419, 16384);
               arg3.field2419 = -1;
            }
         }

         if ((arg2 & 1024) != 0) {
            int var20 = arg4.method697(2);
            arg3.field5774 = arg4.method693((byte)114);
            arg3.field5806 = arg4.method665(arg0);
            arg3.field5822 = ~(32768 & var20) != -1;
            arg3.field5802 = 32767 & var20;
            arg3.field5830 = arg3.field5802 + arg3.field5774 + class51.field770;
         }

         if (~(arg2 & 512) != -1) {
            int var21 = arg4.method647((byte)119);
            int[] var22 = new int[var21];
            int[] var23 = new int[var21];
            int[] var24 = new int[var21];
            int var25 = 0;
            if (var5 || ~var25 > ~var21) {
               do {
                  int var26 = arg4.method697(2);
                  if (~var26 == -65536) {
                     var26 = -1;
                  }

                  var22[var25] = var26;
                  var23[var25] = arg4.method647((byte)120);
                  var24[var25] = arg4.method685(-2);
                  ++var25;
               } while(~var25 > ~var21);
            }

            class644.method4686(arg3, var24, var22, -31133, var23);
         }

         if ((4 & arg2) != 0) {
            int var27 = arg4.method651(-1);
            if (~var27 == -65536) {
               var27 = -1;
            }

            arg3.field5798 = var27;
         }

         if (~(arg2 & 16) != -1) {
            int var28 = arg4.method693((byte)114);
            byte[] var29 = new byte[var28];
            class65 var30 = new class65(var29);
            arg4.method668(var28, 0, (byte)-121, var29);
            class756.field10814[arg1] = var30;
            arg3.method1502(var30, 102);
         }

         if ((16384 & arg2) != 0) {
            arg3.field2394 = ~arg4.method688(-19476) == -2;
         }

         if (~(8192 & arg2) != -1) {
            label242: {
               arg3.field5849 = arg4.method673((byte)-108);
               arg3.field5848 = arg4.method638(true);
               arg3.field5832 = arg4.method638(true);
               arg3.field5840 = arg4.method673((byte)-108);
               arg3.field5837 = arg4.method685(-2) - -class51.field770;
               arg3.field5836 = arg4.method697(2) + class51.field770;
               arg3.field5850 = arg4.method647((byte)114);
               if (arg3.field2397) {
                  arg3.field5832 += arg3.field2417;
                  arg3.field5860 = 0;
                  arg3.field5840 += arg3.field2412;
                  arg3.field5849 += arg3.field2417;
                  arg3.field5848 += arg3.field2412;
                  if (!var5) {
                     break label242;
                  }
               }

               arg3.field5848 += arg3.field5865[0];
               arg3.field5860 = 1;
               arg3.field5840 += arg3.field5865[0];
               arg3.field5849 += arg3.field5861[0];
               arg3.field5832 += arg3.field5861[0];
            }

            arg3.field5856 = 0;
         }

         if (arg0) {
            field1301 = null;
         }

         if ((arg2 & 128) != 0) {
            class466.field6768[arg1] = arg4.method659(128);
         }

         if (~(arg2 & 256) != -1) {
            int var31 = arg4.method651(-1);
            if (var31 == 65535) {
               var31 = -1;
            }

            int var32 = arg4.method690(-31106);
            int var33 = arg4.method647((byte)119);
            int var34 = var33 & 7;
            int var35 = 15 & var33 >> 3;
            if (var35 == 15) {
               var35 = -1;
            }

            arg3.method3070(var34, (byte)40, 1, false, var35, var32, var31);
         }

         if ((arg2 & 262144) != 0) {
            int var36 = arg4.method665(arg0);
            int[] var37 = new int[var36];
            int[] var38 = new int[var36];
            int var39 = 0;
            if (var5 || ~var36 < ~var39) {
               do {
                  int var40 = arg4.method685(-2);
                  if ((49152 & var40) != 49152) {
                     var37[var39] = var40;
                     if (!var5) {
                        var38[var39] = arg4.method637(65535);
                        ++var39;
                        continue;
                     }
                  }

                  int var41 = arg4.method637(65535);
                  var37[var39] = class91.method932(var41, var40 << 16);
                  var38[var39] = arg4.method637(65535);
                  ++var39;
               } while(~var36 < ~var39);
            }

            arg3.method3065((byte)126, var38, var37);
         }

         if (~(524288 & arg2) != -1) {
            int var42 = arg4.method651(-1);
            int var43 = arg4.method690(-31106);
            if (~var42 == -65536) {
               var42 = -1;
            }

            int var44 = arg4.method665(arg0);
            int var45 = var44 & 7;
            int var46 = (var44 & 121) >> 3;
            if (var46 == 15) {
               var46 = -1;
            }

            arg3.method3070(var45, (byte)40, 2, false, var46, var43, var42);
         }

         if (~(arg2 & 131072) != -1) {
            arg3.field5851 = arg4.method659(128);
            arg3.field5835 = arg4.method652(255);
            arg3.field5838 = arg4.method659(128);
            arg3.field5846 = (byte)arg4.method647((byte)115);
            arg3.field5847 = class51.field770 + arg4.method651(-1);
            arg3.field5852 = class51.field770 + arg4.method637(65535);
         }

         if ((8 & arg2) != 0) {
            int[] var47 = new int[4];
            int var48 = 0;
            if (var5) {
               var47[var48] = arg4.method651(-1);
               if (~var47[var48] == -65536) {
                  var47[var48] = -1;
               }

               ++var48;
            }

            while(true) {
               while(var48 < 4) {
                  var47[var48] = arg4.method651(-1);
                  if (~var47[var48] == -65536) {
                     var47[var48] = -1;
                  }

                  ++var48;
               }

               int var49 = arg4.method688(-19476);
               if (!var5) {
                  class44.method495(var49, false, arg3, (byte)115, var47);
                  break;
               }

               if (var49 == 0) {
                  var47[var48] = -1;
               }

               ++var48;
            }
         }

         if (arg3.field2397) {
            if (~var6 == -128) {
               arg3.method1504(arg3.field2417, arg3.field2412, -104);
            } else {
               byte var50;
               label174: {
                  if (~var6 == 0) {
                     var50 = class466.field6768[arg1];
                     if (!var5) {
                        break label174;
                     }
                  }

                  var50 = var6;
               }

               class631.method4624(var50, arg3, (byte)109);
               arg3.method1501(arg3.field2417, var50, (byte)-68, arg3.field2412);
            }
         }
      } catch (RuntimeException var52) {
         throw class612.method4503(var52, field1306[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1306[1] : field1306[2]) + ',' + (arg4 != null ? field1306[1] : field1306[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "b",
      descriptor = "(B)Lju;"
   )
   public static final class270 method892(byte arg0) {
      try {
         ++field1297;
         if (class651.field9217 != null && class74.field1187 != null) {
            class74.field1187.method5298(32, class651.field9217);
            class270 var1 = (class270)class74.field1187.method5299(120);
            if (arg0 != -69) {
               return null;
            } else if (var1 == null) {
               return null;
            } else {
               class541 var2 = class651.field9200.method1756(arg0 ^ -97, var1.field4134);
               return var2 != null && var2.field7633 && var2.method4032(class651.field9208, (byte)-95) ? var1 : class101.method994(arg0 + 68);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1306[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method893(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method894(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
