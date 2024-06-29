import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class130 extends class484 implements class434 {
   @OriginalMember(
      owner = "client!b",
      name = "P",
      descriptor = "B"
   )
   private byte field1866;
   @OriginalMember(
      owner = "client!b",
      name = "bb",
      descriptor = "B"
   )
   private byte field1879;
   @OriginalMember(
      owner = "client!b",
      name = "nb",
      descriptor = "S"
   )
   private short field1880;
   @OriginalMember(
      owner = "client!b",
      name = "T",
      descriptor = "Z"
   )
   private boolean field1864;
   @OriginalMember(
      owner = "client!b",
      name = "W",
      descriptor = "Z"
   )
   private boolean field1861;
   @OriginalMember(
      owner = "client!b",
      name = "ib",
      descriptor = "Z"
   )
   private boolean field1871;
   @OriginalMember(
      owner = "client!b",
      name = "N",
      descriptor = "Lka;"
   )
   private class91 field1873;
   @OriginalMember(
      owner = "client!b",
      name = "U",
      descriptor = "Lr;"
   )
   private class273 field1868;
   @OriginalMember(
      owner = "client!b",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1883 = new String[]{method1232(method1231("]\u0002a%")), method1232(method1231("]\u0002y%")), method1232(method1231("QYYa")), method1232(method1231("D\u0002\u001b#\u0000")), method1232(method1231("]\u0002\u007f%")), method1232(method1231("]\u0002\td\u0013VX\u000b%")), method1232(method1231("]\u0002}%")), method1232(method1231("]\u0002d%")), method1232(method1231("]\u0002e%")), method1232(method1231("]\u0002|%")), method1232(method1231("]\u0002z%")), method1232(method1231("]\u0002x%")), method1232(method1231("]\u0002~%")), method1232(method1231("]\u0002r%")), method1232(method1231("]\u0002f%")), method1232(method1231("]\u0002s%")), method1232(method1231("]\u0002c%")), method1232(method1231("]\u0002{%")), method1232(method1231("]\u0002q%")), method1232(method1231("]\u0002w%")), method1232(method1231("\u001f\u0001\u000b-")), method1232(method1231("]\u0002`%"))};
   @OriginalMember(
      owner = "client!b",
      name = "Y",
      descriptor = "I"
   )
   public static int field1878 = -1;
   @OriginalMember(
      owner = "client!b",
      name = "lb",
      descriptor = "I"
   )
   public static int field1855;
   @OriginalMember(
      owner = "client!b",
      name = "S",
      descriptor = "I"
   )
   public static int field1856;
   @OriginalMember(
      owner = "client!b",
      name = "jb",
      descriptor = "I"
   )
   public static int field1857;
   @OriginalMember(
      owner = "client!b",
      name = "kb",
      descriptor = "I"
   )
   public static int field1858;
   @OriginalMember(
      owner = "client!b",
      name = "Q",
      descriptor = "I"
   )
   public static int field1859;
   @OriginalMember(
      owner = "client!b",
      name = "eb",
      descriptor = "I"
   )
   public static int field1860;
   @OriginalMember(
      owner = "client!b",
      name = "cb",
      descriptor = "I"
   )
   public static int field1862;
   @OriginalMember(
      owner = "client!b",
      name = "mb",
      descriptor = "I"
   )
   public static int field1863;
   @OriginalMember(
      owner = "client!b",
      name = "O",
      descriptor = "I"
   )
   public static int field1865;
   @OriginalMember(
      owner = "client!b",
      name = "pb",
      descriptor = "I"
   )
   public static int field1867;
   @OriginalMember(
      owner = "client!b",
      name = "hb",
      descriptor = "I"
   )
   public static int field1869;
   @OriginalMember(
      owner = "client!b",
      name = "db",
      descriptor = "I"
   )
   public static int field1870;
   @OriginalMember(
      owner = "client!b",
      name = "Z",
      descriptor = "I"
   )
   public static int field1872;
   @OriginalMember(
      owner = "client!b",
      name = "R",
      descriptor = "I"
   )
   public static int field1874;
   @OriginalMember(
      owner = "client!b",
      name = "ob",
      descriptor = "I"
   )
   public static int field1875;
   @OriginalMember(
      owner = "client!b",
      name = "ab",
      descriptor = "I"
   )
   public static int field1876;
   @OriginalMember(
      owner = "client!b",
      name = "gb",
      descriptor = "I"
   )
   public static int field1877;
   @OriginalMember(
      owner = "client!b",
      name = "X",
      descriptor = "I"
   )
   public static int field1882;
   @OriginalMember(
      owner = "client!b",
      name = "fb",
      descriptor = "Lil;"
   )
   private class680 field1881;

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(BLha;)Lpga;",
      line = 6
   )
   public final class788 method56(byte arg0, class610 arg1) {
      try {
         ++field1870;
         if (this.field1873 == null) {
            return null;
         } else if (arg0 != -20) {
            return null;
         } else {
            class401 var3 = arg1.method640();
            var3.method1542(super.field7364 + super.field1505, super.field1495, super.field7372 + super.field1494);
            class788 var4 = class333.method2708((byte)116, 1, this.field1861);
            if (class334.field5143) {
               this.field1873.method905(var3, var4.field11545[0], class591.field8709, 0);
               if (!client.field1786) {
                  return var4;
               }
            }

            this.field1873.method897(var3, var4.field11545[0], 0);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1883[18] + arg0 + ',' + (arg1 != null ? field1883[3] : field1883[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(I)Z",
      line = 35
   )
   public final boolean method241(int arg0) {
      try {
         if (arg0 != -18128) {
            this.field1861 = false;
         }

         ++field1855;
         return this.field1871;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(Lha;I)V",
      line = 54
   )
   public final void method49(class610 arg0, int arg1) {
      try {
         if (arg1 != -16) {
            this.field1880 = -32;
         }

         ++field1863;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1883[1] + (arg0 != null ? field1883[3] : field1883[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(I)V",
      line = 68
   )
   public final void method232(int arg0) {
      try {
         int var2 = 79 / ((arg0 - 54) / 59);
         ++field1875;
         if (this.field1873 != null) {
            this.field1873.method903();
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1883[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(B)I",
      line = 80
   )
   public final int method236(byte arg0) {
      try {
         if (arg0 != -11) {
            this.method236((byte)-3);
         }

         ++field1882;
         return this.field1880 & 65535;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Lha;IIZ)Z",
      line = 92
   )
   public final boolean method43(class610 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field1860;
         class91 var5 = this.method1230(-122, 131072, arg0);
         if (var5 != null) {
            class401 var6 = arg0.method640();
            var6.method1542(super.field1505, super.field1495, super.field1494);
            return !class334.field5143 ? var5.method886(arg2, arg1, var6, false, 0) : var5.method912(arg2, arg1, var6, false, 0, class591.field8709);
         } else {
            if (arg3) {
               this.field1871 = true;
            }

            return false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1883[8] + (arg0 != null ? field1883[3] : field1883[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "c",
      descriptor = "(I)I",
      line = 114
   )
   public final int method237(int arg0) {
      try {
         ++field1856;
         if (arg0 != 28440) {
            this.method227((class610)null, (byte)-22);
         }

         return this.field1866;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(B)I",
      line = 126
   )
   public final int method231(byte arg0) {
      try {
         if (arg0 != -42) {
            this.field1861 = false;
         }

         ++field1867;
         return this.field1879;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "g",
      descriptor = "(I)Z",
      line = 143
   )
   public final boolean method228(int arg0) {
      try {
         if (arg0 != 0) {
            this.method228(-40);
         }

         ++field1877;
         return this.field1873 == null ? false : this.field1873.method892();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Lha;I)V",
      line = 159
   )
   public final void method238(class610 arg0, int arg1) {
      try {
         ++field1862;
         int var3 = 89 / ((-20 - arg1) / 62);
         Object var4 = null;
         class273 var5;
         if (this.field1868 == null && this.field1871) {
            class690 var6 = this.method1229(262144, true, arg0, 1);
            var5 = var6 == null ? null : var6.field10248;
         } else {
            var5 = this.field1868;
            this.field1868 = null;
         }

         if (var5 != null) {
            class32.method235(var5, super.field1500, super.field1505, super.field1494, (boolean[])null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1883[14] + (arg0 != null ? field1883[3] : field1883[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "<init>",
      descriptor = "(Lha;Lru;IIIIIZIIII)V",
      line = 185
   )
   public class130(class610 arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field1866 = (byte)arg10;
         this.field1879 = (byte)arg11;
         super.field1494 = arg6;
         this.field1880 = (short)arg1.field5099;
         super.field1505 = arg4;
         this.field1864 = arg7;
         this.field1861 = ~arg1.field5071 != -1 && !arg7;
         this.field1871 = arg0.method702() && arg1.field5102 && !this.field1864 && ~class687.field10213.field498.method5540(480102311) != -1;
         class690 var13 = this.method1229(2048, this.field1871, arg0, 1);
         if (var13 != null) {
            this.field1873 = var13.field10250;
            this.field1868 = var13.field10248;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field1883[5] + (arg0 != null ? field1883[3] : field1883[2]) + ',' + (arg1 != null ? field1883[3] : field1883[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "h",
      descriptor = "(I)I",
      line = 209
   )
   public final int method230(int arg0) {
      try {
         ++field1859;
         if (arg0 != 2) {
            return 111;
         } else {
            return this.field1873 != null ? this.field1873.method911() : 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(ILfq;II)V",
      line = 220
   )
   public static final void method1228(int arg0, class374 arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field1872;
         if (class552.field8264) {
            class58 var5 = ~class593.field8730 == 0 ? null : class610.field8879.method179(-1572, class593.field8730);
            if (client.method1148(arg1).method524(1696813014) && (class441.field6793 & 32) != 0 && (var5 == null || ~arg1.method3057((byte)-59, class593.field8730, var5.field710) != ~var5.field710)) {
               class91.method921(arg1.field5927, true, 0L, arg1.field5848, true, false, false, class698.field10378, class443.field6803, class65.field860 + field1883[20] + arg1.field5826, arg1.field5840, (long)(arg1.field5840 | arg1.field5848 << 0), 46);
               ++class269.field4364;
            }
         }

         int var6 = 9;
         String var7;
         if (var4) {
            var7 = class431.method3410(var6, 5, arg1);
            if (var7 != null) {
               ++class704.field10597;
               class91.method921(arg1.field5927, true, (long)(var6 + 1), arg1.field5848, true, false, false, class149.method1367(4000, var6, arg1), var7, arg1.field5826, arg1.field5840, (long)(arg1.field5848 << 0 | arg1.field5840), 1004);
            }

            --var6;
         }

         while(true) {
            int var10000;
            byte var10001;
            if (var6 < 5) {
               var10000 = arg0;
               var10001 = 1;
               if (!var4) {
                  if (arg0 != 1) {
                     field1878 = -7;
                  }

                  String var8 = class593.method4418(arg0 ^ -127, arg1);
                  if (var8 != null) {
                     ++class93.field1331;
                     class91.method921(arg1.field5927, true, 0L, arg1.field5848, true, false, false, arg1.field5906, var8, arg1.field5826, arg1.field5840, (long)(arg1.field5848 << 0 | arg1.field5840), 20);
                  }

                  int var9 = 4;
                  String var10;
                  if (var4) {
                     var10 = class431.method3410(var9, 5, arg1);
                     if (var10 != null) {
                        ++class704.field10597;
                        class91.method921(arg1.field5927, true, (long)(var9 + 1), arg1.field5848, true, false, false, class149.method1367(arg0 ^ 4001, var9, arg1), var10, arg1.field5826, arg1.field5840, (long)(arg1.field5840 | arg1.field5848 << 0), 4);
                     }

                     --var9;
                  }

                  while(true) {
                     if (~var9 > -1) {
                        var10000 = client.method1148(arg1).method527((byte)63);
                        if (!var4) {
                           if (var10000 == 0) {
                              return;
                           }

                           label67: {
                              if (arg1.field5781 == null) {
                                 class91.method921(arg1.field5927, true, 0L, arg1.field5848, true, false, false, -1, class499.field7598.method3875(class493.field7455, 94), "", arg1.field5840, (long)(arg1.field5848 << 0 | arg1.field5840), 50);
                                 if (!var4) {
                                    break label67;
                                 }
                              }

                              class91.method921(arg1.field5927, true, 0L, arg1.field5848, true, false, false, -1, arg1.field5781, "", arg1.field5840, (long)(arg1.field5840 | arg1.field5848 << 0), 50);
                           }

                           ++class183.field2887;
                           return;
                        }
                     } else {
                        var10000 = var9;
                     }

                     var10 = class431.method3410(var10000, 5, arg1);
                     if (var10 != null) {
                        ++class704.field10597;
                        class91.method921(arg1.field5927, true, (long)(var9 + 1), arg1.field5848, true, false, false, class149.method1367(arg0 ^ 4001, var9, arg1), var10, arg1.field5826, arg1.field5840, (long)(arg1.field5840 | arg1.field5848 << 0), 4);
                     }

                     --var9;
                  }
               }
            } else {
               var10000 = var6;
               var10001 = 5;
            }

            var7 = class431.method3410(var10000, var10001, arg1);
            if (var7 != null) {
               ++class704.field10597;
               class91.method921(arg1.field5927, true, (long)(var6 + 1), arg1.field5848, true, false, false, class149.method1367(4000, var6, arg1), var7, arg1.field5826, arg1.field5840, (long)(arg1.field5848 << 0 | arg1.field5840), 1004);
            }

            --var6;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1883[19] + arg0 + ',' + (arg1 != null ? field1883[3] : field1883[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IZLha;I)Lla;",
      line = 294
   )
   private final class690 method1229(int arg0, boolean arg1, class610 arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field1858;
         if (arg3 != 1) {
            return null;
         } else {
            class333 var6 = class102.field1434.method1411(65535 & this.field1880, -99);
            class271 var7;
            class271 var8;
            if (!this.field1864) {
               label31: {
                  if (~super.field1500 <= -4) {
                     var7 = null;
                     if (!var5) {
                        break label31;
                     }
                  }

                  var7 = class96.field1355[super.field1500 + 1];
               }

               var8 = class96.field1355[super.field1500];
               if (!var5) {
                  return var6.method2719(arg1, (byte)125, arg0, var7, this.field1879, super.field1505, (class752)null, arg2, this.field1866, var8, super.field1494, super.field1495);
               }
            }

            var7 = class96.field1355[0];
            var8 = class190.field2949[super.field1500];
            return var6.method2719(arg1, (byte)125, arg0, var7, this.field1879, super.field1505, (class752)null, arg2, this.field1866, var8, super.field1494, super.field1495);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1883[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1883[3] : field1883[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(Lha;B)V",
      line = 330
   )
   public final void method227(class610 arg0, byte arg1) {
      try {
         ++field1876;
         int var3 = 45 % ((30 - arg1) / 34);
         Object var4 = null;
         class273 var6;
         if (this.field1868 == null && this.field1871) {
            class690 var5 = this.method1229(262144, true, arg0, 1);
            var6 = var5 != null ? var5.field10248 : null;
         } else {
            var6 = this.field1868;
            this.field1868 = null;
         }

         if (var6 != null) {
            class453.method3553(var6, super.field1500, super.field1505, super.field1494, (boolean[])null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1883[16] + (arg0 != null ? field1883[3] : field1883[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "(Z)Z",
      line = 356
   )
   public final boolean method233(boolean arg0) {
      try {
         ++field1857;
         if (arg0) {
            this.field1871 = false;
         }

         if (this.field1873 != null) {
            return !this.field1873.method895();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1883[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(IILha;)Lka;",
      line = 372
   )
   private final class91 method1230(int arg0, int arg1, class610 arg2) {
      try {
         ++field1874;
         if (this.field1873 != null && ~arg2.method690(this.field1873.method906(), arg1) == -1) {
            return this.field1873;
         } else {
            if (arg0 >= -119) {
               this.field1861 = true;
            }

            class690 var4 = this.method1229(arg1, false, arg2, 1);
            return var4 != null ? var4.field10250 : null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1883[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1883[3] : field1883[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "(ILha;)Lil;",
      line = 392
   )
   public final class680 method41(int arg0, class610 arg1) {
      try {
         ++field1865;
         if (this.field1881 == null) {
            this.field1881 = class404.method3254(100, super.field1494, super.field1495, this.method1230(-120, 0, arg1), super.field1505);
         }

         if (arg0 != 4058) {
            this.method230(-51);
         }

         return this.field1881;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1883[6] + arg0 + ',' + (arg1 != null ? field1883[3] : field1883[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "k",
      descriptor = "(I)I",
      line = 406
   )
   public final int method239(int arg0) {
      try {
         ++field1869;
         int var2 = 121 % ((-44 - arg0) / 39);
         return this.field1873 == null ? 0 : this.field1873.method919();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1883[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1231(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!b",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1232(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
