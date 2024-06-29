import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class340 {
   @OriginalMember(
      owner = "client!db",
      name = "k",
      descriptor = "I"
   )
   public int field4838 = 0;
   @OriginalMember(
      owner = "client!db",
      name = "g",
      descriptor = "I"
   )
   public int field4845 = 0;
   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "Lgw;"
   )
   private class179 field4844 = new class179(64);
   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "Lhba;"
   )
   private class10 field4849 = null;
   @OriginalMember(
      owner = "client!db",
      name = "l",
      descriptor = "Lhw;"
   )
   private class141 field4839;
   @OriginalMember(
      owner = "client!db",
      name = "i",
      descriptor = "Lhw;"
   )
   private class141 field4848;
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4850 = new String[]{method2636(method2635("\u0005f\u000b\u0014-")), method2636(method2635("\u000fqI:")), method2636(method2635("\u001a*\u000bxx")), method2636(method2635("\u0005f\u000b\u0012-")), method2636(method2635(">wQ7q\bg@:`\faK\"v")), method2636(method2635("\u0005f\u000b\u0015-")), method2636(method2635("\u0005f\u000b\u0017-")), method2636(method2635("\u0005f\u000bjl\u000fmQh-")), method2636(method2635("\u0005f\u000b\u0013-"))};
   @OriginalMember(
      owner = "client!db",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4847 = new String[8];
   @OriginalMember(
      owner = "client!db",
      name = "e",
      descriptor = "F"
   )
   public static float field4840;
   @OriginalMember(
      owner = "client!db",
      name = "j",
      descriptor = "I"
   )
   public static int field4841;
   @OriginalMember(
      owner = "client!db",
      name = "c",
      descriptor = "I"
   )
   public static int field4842;
   @OriginalMember(
      owner = "client!db",
      name = "h",
      descriptor = "I"
   )
   public static int field4843;
   @OriginalMember(
      owner = "client!db",
      name = "d",
      descriptor = "I"
   )
   public static int field4846;

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Lhm;JI[I)Ljava/lang/String;"
   )
   public final String method2630(class230 arg0, long arg1, int arg2, int[] arg3) {
      try {
         if (arg2 != 1) {
            method2632((class160)null, (class65)null, -114);
         }

         ++field4842;
         if (this.field4849 != null) {
            String var6 = this.field4849.method64(arg2 ^ 1, arg0, arg3, arg1);
            if (var6 != null) {
               return var6;
            }
         }

         return Long.toString(arg1);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4850[8] + (arg0 != null ? field4850[2] : field4850[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4850[2] : field4850[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2631(byte arg0) {
      try {
         if (arg0 != -108) {
            field4847 = null;
         }

         field4847 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4850[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Ld;Lha;I)V"
   )
   public static final void method2632(class160 arg0, class65 arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field4846;
         if (class370.field5477 != null) {
            if (~class661.field9617 > -11) {
               if (!class370.field5479.method1320(class370.field5477.field434, 84)) {
                  class661.field9617 = class392.field5783.method1350(class370.field5477.field434, (byte)-58) / 10;
                  return;
               }

               class601.method4438(-28198);
               class661.field9617 = 10;
            }

            if (class661.field9617 == 10) {
               class370.field5494 = class370.field5477.field428 >> 6 << 6;
               class370.field5513 = class370.field5477.field424 >> 6 << 6;
               class370.field5496 = (class370.field5477.field431 >> 6 << 6) + -class370.field5513 - -64;
               class370.field5506 = (class370.field5477.field414 >> 6 << 6) + -class370.field5494 + 64;
               int[] var4 = new int[3];
               int var5 = -1;
               int var6 = -1;
               if (class370.field5477.method201((class304.field4398.field4101 >> 9) + class347.field4939, class304.field4398.field4090, class753.field10887 - -(class304.field4398.field4096 >> 9), (byte)-119, var4)) {
                  var6 = var4[2] - class370.field5494;
                  var5 = var4[1] - class370.field5513;
               }

               label215: {
                  if (class101.field1675 || ~var5 > -1 || ~class370.field5496 >= ~var5 || ~var6 > -1 || var6 >= class370.field5506) {
                     if (class368.field5466 == -1 || ~class396.field5815 == 0) {
                        class370.field5477.method200(class370.field5477.field417 & 16383, class370.field5477.field417 >> 14 & 16383, (byte)-1, var4);
                        class755.field10968 = var4[1] + -class370.field5513;
                        class48.field1043 = var4[2] + -class370.field5494;
                        if (!var3) {
                           break label215;
                        }
                     }

                     class370.field5477.method200(class396.field5815, class368.field5466, (byte)-102, var4);
                     if (var4 != null) {
                        class48.field1043 = var4[2] - class370.field5494;
                        class755.field10968 = var4[1] + -class370.field5513;
                     }

                     class396.field5815 = -1;
                     class368.field5466 = -1;
                     class101.field1675 = false;
                     if (!var3) {
                        break label215;
                     }
                  }

                  int var7 = var6 + -5 + (int)(10.0D * Math.random());
                  int var8 = var5 + -5 + (int)(Math.random() * 10.0D);
                  class755.field10968 = var8;
                  class48.field1043 = var7;
               }

               label153: {
                  if (class370.field5477.field418 != 37) {
                     if (class370.field5477.field418 == 50) {
                        class370.field5488 = 4.0F;
                        class370.field5484 = 4.0F;
                        if (!var3) {
                           break label153;
                        }
                     }

                     if (class370.field5477.field418 != 75) {
                        if (~class370.field5477.field418 == -101) {
                           class370.field5488 = 8.0F;
                           class370.field5484 = 8.0F;
                           if (!var3) {
                              break label153;
                           }
                        }

                        if (~class370.field5477.field418 == -201) {
                           class370.field5488 = 16.0F;
                           class370.field5484 = 16.0F;
                           if (!var3) {
                              break label153;
                           }
                        }

                        class370.field5488 = 8.0F;
                        class370.field5484 = 8.0F;
                        if (!var3) {
                           break label153;
                        }
                     }

                     class370.field5488 = 6.0F;
                     class370.field5484 = 6.0F;
                     if (!var3) {
                        break label153;
                     }
                  }

                  class370.field5488 = 3.0F;
                  class370.field5484 = 3.0F;
               }

               class370.field5493 = (int)class370.field5488 >> 1;
               class370.field5485 = class759.method5491(0, class370.field5493);
               class632.method4645(91);
               class370.method2890();
               class791.field11560 = new class332();
               class370.field5491 += (int)(Math.random() * 5.0D) + -2;
               if (class370.field5491 < -8) {
                  class370.field5491 = -8;
               }

               class370.field5486 += -2 + (int)(Math.random() * 5.0D);
               if (~class370.field5491 < -9) {
                  class370.field5491 = 8;
               }

               if (class370.field5486 < -16) {
                  class370.field5486 = -16;
               }

               if (class370.field5486 > 16) {
                  class370.field5486 = 16;
               }

               class370.method2895(arg0, class370.field5491 >> 2 << 10, class370.field5486 >> 1);
               class370.field5480.method3212(256, 1024, 36);
               class370.field5475.method5062(256, -128, 256);
               class370.field5478.method2560((byte)65, 4096);
               class440.field6431.method2069(256, false);
               class661.field9617 = 20;
            } else {
               if (arg2 != 20685) {
                  method2632((class160)null, (class65)null, -12);
               }

               if (~class661.field9617 == -21) {
                  class442.method3327(true, true);
                  class370.method2900(arg1, class370.field5491, class370.field5486);
                  class661.field9617 = 60;
                  class442.method3327(true, true);
                  class179.method1590((byte)123);
               } else if (class661.field9617 != 60) {
                  if (~class661.field9617 == -71) {
                     class519.field7570 = new class297(arg1, 11, true, class386.field5692);
                     class661.field9617 = 73;
                     class442.method3327(true, true);
                     class179.method1590((byte)127);
                  } else if (~class661.field9617 == -74) {
                     class129.field2160 = new class297(arg1, 12, true, class386.field5692);
                     class661.field9617 = 76;
                     class442.method3327(true, true);
                     class179.method1590((byte)118);
                  } else if (~class661.field9617 == -77) {
                     class215.field3234 = new class297(arg1, 14, true, class386.field5692);
                     class661.field9617 = 79;
                     class442.method3327(true, true);
                     class179.method1590((byte)127);
                  } else if (~class661.field9617 == -80) {
                     class205.field3061 = new class297(arg1, 17, true, class386.field5692);
                     class661.field9617 = 82;
                     class442.method3327(true, true);
                     class179.method1590((byte)119);
                  } else if (~class661.field9617 == -83) {
                     class713.field10345 = new class297(arg1, 19, true, class386.field5692);
                     class661.field9617 = 85;
                     class442.method3327(true, true);
                     class179.method1590((byte)118);
                  } else if (class661.field9617 == 85) {
                     class559.field8134 = new class297(arg1, 22, true, class386.field5692);
                     class661.field9617 = 88;
                     class442.method3327(true, true);
                     class179.method1590((byte)127);
                  } else if (class661.field9617 == 88) {
                     class251.field3593 = new class297(arg1, 26, true, class386.field5692);
                     class661.field9617 = 91;
                     class442.method3327(true, true);
                     class179.method1590((byte)125);
                  } else {
                     class281.field3932 = new class297(arg1, 30, true, class386.field5692);
                     class661.field9617 = 100;
                     class442.method3327(true, true);
                     class179.method1590((byte)125);
                     System.gc();
                  }
               } else {
                  label178: {
                     if (class370.field5479.method1316(class370.field5477.field434 + field4850[4], (byte)-33)) {
                        if (!class370.field5479.method1320(class370.field5477.field434 + field4850[4], 126)) {
                           return;
                        }

                        class370.field5487 = class485.method3666(class370.field5477.field434 + field4850[4], class370.field5479, -2, class116.field1905);
                        if (!var3) {
                           break label178;
                        }
                     }

                     class370.field5487 = new class360(0);
                  }

                  class370.method2886();
                  class661.field9617 = 70;
                  class442.method3327(true, true);
                  class179.method1590((byte)119);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4850[3] + (arg0 != null ? field4850[2] : field4850[1]) + ',' + (arg1 != null ? field4850[2] : field4850[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(II)Lqaa;"
   )
   public final class29 method2633(int arg0, int arg1) {
      try {
         ++field4841;
         class29 var3 = (class29)this.field4844.method1584((long)arg0, arg1);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label25: {
               if (arg0 < 32768) {
                  var4 = this.field4848.method1347((byte)126, 1, arg0);
                  if (!client.field4564) {
                     break label25;
                  }
               }

               var4 = this.field4839.method1347((byte)126, 1, 32767 & arg0);
            }

            class29 var5 = new class29();
            var5.field452 = this;
            if (var4 != null) {
               var5.method216((byte)21, new class473(var4));
            }

            if (~arg0 <= -32769) {
               var5.method209(true);
            }

            this.field4844.method1581((long)arg0, 0, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4850[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2634(int arg0, int arg1, int arg2) {
      try {
         if (arg2 >= -33) {
            method2632((class160)null, (class65)null, 50);
         }

         ++field4843;
         return (arg1 & 52) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4850[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(ILhw;Lhw;Lhba;)V"
   )
   public class340(int arg0, class141 arg1, class141 arg2, class10 arg3) {
      try {
         this.field4839 = arg2;
         this.field4848 = arg1;
         this.field4849 = arg3;
         if (this.field4848 != null) {
            this.field4838 = this.field4848.method1346(1, 0);
         }

         if (this.field4839 != null) {
            this.field4845 = this.field4839.method1346(1, 0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4850[7] + arg0 + ',' + (arg1 != null ? field4850[2] : field4850[1]) + ',' + (arg2 != null ? field4850[2] : field4850[1]) + ',' + (arg3 != null ? field4850[2] : field4850[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2635(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2636(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
