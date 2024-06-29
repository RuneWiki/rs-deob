import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class296 {
   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "[I"
   )
   private int[] field4394 = new int[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4413 = new String[]{method2475(method2474(")w5uZu")), method2475(method2474(")w5uXu")), method2475(method2474("3j87")), method2475(method2474(")w5u\\u")), method2475(method2474("&1zuc")), method2475(method2474(")w5uVu")), method2475(method2474(")w5u_u")), method2475(method2474(")w5u[u")), method2475(method2474("\u0002l :j4|17{0z:/m")), method2475(method2474(")w5uYu")), method2475(method2474(")w5u]u")), method2475(method2474(")w5uWu"))};
   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field4396 = new class164(31, 3);
   @OriginalMember(
      owner = "client!tha",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field4405 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!tha",
      name = "g",
      descriptor = "I"
   )
   public static int field4397;
   @OriginalMember(
      owner = "client!tha",
      name = "e",
      descriptor = "I"
   )
   public static int field4398;
   @OriginalMember(
      owner = "client!tha",
      name = "o",
      descriptor = "I"
   )
   public static int field4399;
   @OriginalMember(
      owner = "client!tha",
      name = "f",
      descriptor = "I"
   )
   public static int field4400;
   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "I"
   )
   public static int field4402;
   @OriginalMember(
      owner = "client!tha",
      name = "l",
      descriptor = "I"
   )
   public static int field4403;
   @OriginalMember(
      owner = "client!tha",
      name = "r",
      descriptor = "I"
   )
   public static int field4404;
   @OriginalMember(
      owner = "client!tha",
      name = "q",
      descriptor = "I"
   )
   public static int field4406;
   @OriginalMember(
      owner = "client!tha",
      name = "i",
      descriptor = "I"
   )
   public static int field4407;
   @OriginalMember(
      owner = "client!tha",
      name = "m",
      descriptor = "I"
   )
   public static int field4411;
   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "Lgm;"
   )
   public class438 field4410;
   @OriginalMember(
      owner = "client!tha",
      name = "j",
      descriptor = "[I"
   )
   private int[] field4412;
   @OriginalMember(
      owner = "client!tha",
      name = "s",
      descriptor = "[S"
   )
   private short[] field4395;
   @OriginalMember(
      owner = "client!tha",
      name = "k",
      descriptor = "[S"
   )
   private short[] field4401;
   @OriginalMember(
      owner = "client!tha",
      name = "h",
      descriptor = "[S"
   )
   private short[] field4408;
   @OriginalMember(
      owner = "client!tha",
      name = "p",
      descriptor = "[S"
   )
   private short[] field4409;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method2465(boolean arg0, int arg1) {
      try {
         ++field4407;
         class196.field2827.method1048(arg1, -8543);
         class564.field8028.method1048(arg1, -8543);
         class571.field8093.method1048(arg1, -8543);
         if (arg0) {
            method2465(false, -102);
         }

         class744.field10581.method1048(arg1, -8543);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4413[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method2466(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method2467(class65 arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg2 <= 100) {
            this.method2466(91);
         }

         label128: {
            if (arg1 == 1) {
               arg0.method665(false);
               if (!var4) {
                  break label128;
               }
            }

            if (arg1 == 2) {
               int var5 = arg0.method665(false);
               this.field4412 = new int[var5];
               int var6 = 0;
               if (var4) {
                  this.field4412[var6] = arg0.method685(-2);
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~var5) {
                     this.field4412[var6] = arg0.method685(-2);
                     ++var6;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label128;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            if (arg1 != 3) {
               label132: {
                  if (arg1 != 40) {
                     if (arg1 != 41) {
                        if (arg1 < 60 || arg1 >= 70) {
                           break label132;
                        }

                        this.field4394[arg1 + -60] = arg0.method685(-2);
                        if (!var4) {
                           break label132;
                        }
                     }

                     int var7 = arg0.method665(false);
                     this.field4409 = new short[var7];
                     this.field4395 = new short[var7];
                     int var8 = 0;
                     if (var4) {
                        this.field4395[var8] = (short)arg0.method685(-2);
                        this.field4409[var8] = (short)arg0.method685(-2);
                        ++var8;
                     }

                     while(true) {
                        while(var7 > var8) {
                           this.field4395[var8] = (short)arg0.method685(-2);
                           this.field4409[var8] = (short)arg0.method685(-2);
                           ++var8;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label132;
                           }
                           break;
                        }

                        ++var8;
                     }
                  }

                  int var9 = arg0.method665(false);
                  this.field4401 = new short[var9];
                  this.field4408 = new short[var9];
                  int var10 = 0;
                  if (var4 || ~var9 < ~var10) {
                     do {
                        this.field4408[var10] = (short)arg0.method685(-2);
                        this.field4401[var10] = (short)arg0.method685(-2);
                        ++var10;
                     } while(~var9 < ~var10);
                  }
               }
            }
         }

         ++field4399;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field4413[3] + (arg0 != null ? field4413[4] : field4413[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2468(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)Leca;"
   )
   public final class590 method2469(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "(I)Leca;"
   )
   public final class590 method2470(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method2471(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field4402;
         if (arg1 != 0) {
            this.method2470(116);
         }

         do {
            int var4 = arg0.method665(false);
            if (var4 == 0) {
               break;
            }

            this.method2467(arg0, var4, (byte)106);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4413[11] + (arg0 != null ? field4413[4] : field4413[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(ILd;Lha;)V"
   )
   public static final void method2472(int arg0, class672 arg1, class17 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field4397;
         if (class651.field9204 != null) {
            if (class484.field6932 < 10) {
               if (!class651.field9205.method463((byte)-127, class651.field9204.field831)) {
                  class484.field6932 = class254.field3858.method464(class651.field9204.field831, (byte)-59) / 10;
                  return;
               }

               class129.method1313(2);
               class484.field6932 = 10;
            }

            if (class484.field6932 == 10) {
               class651.field9223 = class651.field9204.field840 >> 6 << 6;
               class651.field9220 = class651.field9204.field834 >> 6 << 6;
               class651.field9235 = (class651.field9204.field836 >> 6 << 6) - class651.field9223 + 64;
               class651.field9225 = (class651.field9204.field824 >> 6 << 6) + -class651.field9220 + 64;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class651.field9204.method598(class480.field6903 - -(class117.field1849.field6833 >> 9), var4, (class117.field1849.field6832 >> 9) + class115.field1824, (byte)116, class117.field1849.field6824)) {
                  var6 = var4[2] + -class651.field9223;
                  var5 = var4[1] + -class651.field9220;
               }

               label192: {
                  if (!class299.field4438 && var5 >= 0 && var5 < class651.field9225 && ~var6 <= -1 && ~var6 > ~class651.field9235) {
                     int var7 = var6 + -5 + (int)(Math.random() * 10.0D);
                     int var8 = var5 + (int)(10.0D * Math.random()) + -5;
                     class784.field11423 = var8;
                     class535.field7521 = var7;
                     if (!var3) {
                        break label192;
                     }
                  }

                  if (class662.field9326 != -1 && ~class29.field429 != 0) {
                     class651.field9204.method600(var4, class29.field429, arg0 + 12914, class662.field9326);
                     class29.field429 = -1;
                     class662.field9326 = -1;
                     if (var4 != null) {
                        class535.field7521 = var4[2] + -class651.field9223;
                        class784.field11423 = var4[1] + -class651.field9220;
                     }

                     class299.field4438 = false;
                     if (!var3) {
                        break label192;
                     }
                  }

                  class651.field9204.method600(var4, 16383 & class651.field9204.field826, arg0 + 12897, (class651.field9204.field826 & 268425679) >> 14);
                  class784.field11423 = var4[1] + -class651.field9220;
                  class535.field7521 = var4[2] + -class651.field9223;
               }

               label193: {
                  if (~class651.field9204.field833 == -38) {
                     class651.field9216 = 3.0F;
                     class651.field9212 = 3.0F;
                     if (!var3) {
                        break label193;
                     }
                  }

                  if (class651.field9204.field833 == 50) {
                     class651.field9216 = 4.0F;
                     class651.field9212 = 4.0F;
                     if (!var3) {
                        break label193;
                     }
                  }

                  if (class651.field9204.field833 != 75) {
                     if (~class651.field9204.field833 == -101) {
                        class651.field9216 = 8.0F;
                        class651.field9212 = 8.0F;
                        if (!var3) {
                           break label193;
                        }
                     }

                     if (~class651.field9204.field833 == -201) {
                        class651.field9216 = 16.0F;
                        class651.field9212 = 16.0F;
                        if (!var3) {
                           break label193;
                        }
                     }

                     class651.field9216 = 8.0F;
                     class651.field9212 = 8.0F;
                     if (!var3) {
                        break label193;
                     }
                  }

                  class651.field9216 = 6.0F;
                  class651.field9212 = 6.0F;
               }

               class651.field9209 = (int)class651.field9216 >> 1;
               class651.field9214 = class686.method4993(true, class651.field9209);
               class111.method1082(0);
               class651.method4763();
               class418.field6115 = new class261();
               class651.field9218 += -2 + (int)(Math.random() * 5.0D);
               if (~class651.field9218 > 7) {
                  class651.field9218 = -8;
               }

               if (~class651.field9218 < -9) {
                  class651.field9218 = 8;
               }

               class651.field9215 += (int)(5.0D * Math.random()) + -2;
               if (class651.field9215 < -16) {
                  class651.field9215 = -16;
               }

               if (~class651.field9215 < -17) {
                  class651.field9215 = 16;
               }

               class651.method4757(arg1, class651.field9218 >> 2 << 10, class651.field9215 >> 1);
               class651.field9200.method1754(true, 256, 1024);
               class651.field9202.method2364(256, 256, (byte)65);
               class651.field9206.method3851(4096, -9431);
               class225.field3194.method2715(256, 120);
               class484.field6932 = 20;
            } else if (~class484.field6932 == -21) {
               class223.method1916(false, true);
               class651.method4751(arg2, class651.field9218, class651.field9215);
               class484.field6932 = 60;
               class223.method1916(false, true);
               class102.method1002((byte)-85);
            } else if (class484.field6932 != 60) {
               if (~class484.field6932 == -71) {
                  class274.field4173 = new class569(arg2, 11, true, class729.field10389);
                  class484.field6932 = 73;
                  class223.method1916(false, true);
                  class102.method1002((byte)-24);
               } else if (~class484.field6932 == -74) {
                  class168.field2518 = new class569(arg2, 12, true, class729.field10389);
                  class484.field6932 = 76;
                  class223.method1916(false, true);
                  class102.method1002((byte)-103);
               } else if (class484.field6932 == 76) {
                  class84.field1304 = new class569(arg2, 14, true, class729.field10389);
                  class484.field6932 = 79;
                  class223.method1916(false, true);
                  class102.method1002((byte)-29);
               } else if (~class484.field6932 == -80) {
                  class598.field8417 = new class569(arg2, 17, true, class729.field10389);
                  class484.field6932 = 82;
                  class223.method1916(false, true);
                  class102.method1002((byte)-61);
               } else if (~class484.field6932 == -83) {
                  class365.field5414 = new class569(arg2, 19, true, class729.field10389);
                  class484.field6932 = 85;
                  class223.method1916(false, true);
                  class102.method1002((byte)-91);
               } else if (~class484.field6932 == -86) {
                  class227.field3527 = new class569(arg2, 22, true, class729.field10389);
                  class484.field6932 = 88;
                  class223.method1916(false, true);
                  class102.method1002((byte)-87);
               } else if (class484.field6932 == 88) {
                  class259.field3963 = new class569(arg2, 26, true, class729.field10389);
                  class484.field6932 = 91;
                  class223.method1916(false, true);
                  class102.method1002((byte)-73);
               } else {
                  if (arg0 != -13022) {
                     method2472(105, (class672)null, (class17)null);
                  }

                  class768.field11027 = new class569(arg2, 30, true, class729.field10389);
                  class484.field6932 = 100;
                  class223.method1916(false, true);
                  class102.method1002((byte)-55);
                  System.gc();
               }
            } else {
               label196: {
                  if (!class651.field9205.method447(class651.field9204.field831 + field4413[8], 7004)) {
                     class651.field9211 = new class790(0);
                     if (!var3) {
                        break label196;
                     }
                  }

                  if (!class651.field9205.method463((byte)-127, class651.field9204.field831 + field4413[8])) {
                     return;
                  }

                  class651.field9211 = class462.method3564(27812, class651.field9205, class521.field7329, class651.field9204.field831 + field4413[8]);
               }

               class651.method4752();
               class484.field6932 = 70;
               class223.method1916(false, true);
               class102.method1002((byte)-102);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field4413[9] + arg0 + ',' + (arg1 != null ? field4413[4] : field4413[2]) + ',' + (arg2 != null ? field4413[4] : field4413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2473(int arg0) {
      try {
         if (arg0 != 7828) {
            field4396 = null;
         }

         field4405 = null;
         field4396 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4413[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2474(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2475(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
