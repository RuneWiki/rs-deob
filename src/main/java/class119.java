import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class119 extends class307 {
   @OriginalMember(
      owner = "client!qaa",
      name = "ub",
      descriptor = "[I"
   )
   private int[] field1867 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "G",
      descriptor = "[I"
   )
   private int[] field1860 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "Jb",
      descriptor = "I"
   )
   private int field1887 = 256;
   @OriginalMember(
      owner = "client!qaa",
      name = "n",
      descriptor = "[[Lhea;"
   )
   private class317[][] field1879 = new class317[16][128];
   @OriginalMember(
      owner = "client!qaa",
      name = "tb",
      descriptor = "[[Lhea;"
   )
   private class317[][] field1865 = new class317[16][128];
   @OriginalMember(
      owner = "client!qaa",
      name = "Eb",
      descriptor = "[I"
   )
   public int[] field1903 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "[I"
   )
   private int[] field1898 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "bb",
      descriptor = "[I"
   )
   private int[] field1910 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "hb",
      descriptor = "[I"
   )
   public int[] field1895 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "t",
      descriptor = "[I"
   )
   private int[] field1904 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "S",
      descriptor = "[I"
   )
   private int[] field1905 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "D",
      descriptor = "[I"
   )
   private int[] field1920 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "gb",
      descriptor = "[I"
   )
   public int[] field1922 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "P",
      descriptor = "I"
   )
   private int field1880 = 1000000;
   @OriginalMember(
      owner = "client!qaa",
      name = "xb",
      descriptor = "[I"
   )
   private int[] field1886 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "x",
      descriptor = "[I"
   )
   private int[] field1907 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "r",
      descriptor = "[I"
   )
   private int[] field1915 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "ib",
      descriptor = "[I"
   )
   private int[] field1913 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "Fb",
      descriptor = "[I"
   )
   private int[] field1924 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "C",
      descriptor = "[I"
   )
   private int[] field1906 = new int[16];
   @OriginalMember(
      owner = "client!qaa",
      name = "X",
      descriptor = "Lqi;"
   )
   private class35 field1908 = new class35();
   @OriginalMember(
      owner = "client!qaa",
      name = "T",
      descriptor = "Lmw;"
   )
   private class305 field1931 = new class305(this);
   @OriginalMember(
      owner = "client!qaa",
      name = "Bb",
      descriptor = "Lbga;"
   )
   private class398 field1892;
   @OriginalMember(
      owner = "client!qaa",
      name = "Kb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1935 = new String[]{method1188(method1187("Q\u0002%zbaK")), method1188(method1187("Q\u0002%z~aK")), method1188(method1187("Q\u0002%zzaK")), method1188(method1187("Q\u0002%z`aK")), method1188(method1187("[MjzR")), method1188(method1187("N\u0016(8")), method1188(method1187("Q\u0002%z}aK")), method1188(method1187("Q\u0002%zd\b")), method1188(method1187("Q\u0002%zgaK")), method1188(method1187("Q\u0002%zaaK")), method1188(method1187("Q\u0002%z}\b")), method1188(method1187("Q\u0002%zk\b")), method1188(method1187("Q\u0002%zi\b")), method1188(method1187("Q\u0002%z|aK")), method1188(method1187("Q\u0002%ziaK")), method1188(method1187("Q\u0002%z\u0013I\r- \u0011\b")), method1188(method1187("Q\u0002%zfaK")), method1188(method1187("Q\u0002%z{\b")), method1188(method1187("Q\u0002%zh\b")), method1188(method1187("Q\u0002%ze\b")), method1188(method1187("Q\u0002%zjaK")), method1188(method1187("Q\u0002%zlaK")), method1188(method1187("Q\u0002%zf\b")), method1188(method1187("Q\u0002%zmaK")), method1188(method1187("Q\u0002%znaK")), method1188(method1187("Q\u0002%zm\b")), method1188(method1187("Q\u0002%zg\b")), method1188(method1187("Q\u0002%zc\b")), method1188(method1187("Q\u0002%zb\b")), method1188(method1187("Q\u0002%zx\b")), method1188(method1187("Q\u0002%zn\b")), method1188(method1187("Q\u0002%z`\b")), method1188(method1187("Q\u0002%z|\b")), method1188(method1187("Q\u0002%za\b")), method1188(method1187("Q\u0002%z\u007faK")), method1188(method1187("Q\u0002%zy\b")), method1188(method1187("Q\u0002%zl\b")), method1188(method1187("Q\u0002%zz\b")), method1188(method1187("Q\u0002%zj\b")), method1188(method1187("Q\u0002%zeaK")), method1188(method1187("Q\u0002%z{aK")), method1188(method1187("Q\u0002%zkaK")), method1188(method1187("Q\u0002%z\u007f\b")), method1188(method1187("Q\u0002%z~\b")), method1188(method1187("Q\u0002%zcaK")), method1188(method1187("Q\u0002%zdaK")), method1188(method1187("Q\u0002%zhaK"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "vb",
      descriptor = "Lhha;"
   )
   public static class724 field1911 = new class724(77, 7);
   @OriginalMember(
      owner = "client!qaa",
      name = "N",
      descriptor = "I"
   )
   public static int field1861;
   @OriginalMember(
      owner = "client!qaa",
      name = "Q",
      descriptor = "I"
   )
   public static int field1862;
   @OriginalMember(
      owner = "client!qaa",
      name = "w",
      descriptor = "I"
   )
   public static int field1863;
   @OriginalMember(
      owner = "client!qaa",
      name = "y",
      descriptor = "I"
   )
   public static int field1864;
   @OriginalMember(
      owner = "client!qaa",
      name = "u",
      descriptor = "I"
   )
   public static int field1866;
   @OriginalMember(
      owner = "client!qaa",
      name = "L",
      descriptor = "I"
   )
   public static int field1868;
   @OriginalMember(
      owner = "client!qaa",
      name = "E",
      descriptor = "I"
   )
   public static int field1869;
   @OriginalMember(
      owner = "client!qaa",
      name = "U",
      descriptor = "I"
   )
   public static int field1870;
   @OriginalMember(
      owner = "client!qaa",
      name = "nb",
      descriptor = "I"
   )
   public static int field1871;
   @OriginalMember(
      owner = "client!qaa",
      name = "Db",
      descriptor = "I"
   )
   public static int field1872;
   @OriginalMember(
      owner = "client!qaa",
      name = "J",
      descriptor = "I"
   )
   public static int field1873;
   @OriginalMember(
      owner = "client!qaa",
      name = "pb",
      descriptor = "I"
   )
   public static int field1874;
   @OriginalMember(
      owner = "client!qaa",
      name = "qb",
      descriptor = "I"
   )
   public static int field1875;
   @OriginalMember(
      owner = "client!qaa",
      name = "rb",
      descriptor = "I"
   )
   public static int field1876;
   @OriginalMember(
      owner = "client!qaa",
      name = "wb",
      descriptor = "I"
   )
   public static int field1877;
   @OriginalMember(
      owner = "client!qaa",
      name = "mb",
      descriptor = "I"
   )
   public static int field1878;
   @OriginalMember(
      owner = "client!qaa",
      name = "F",
      descriptor = "I"
   )
   public static int field1881;
   @OriginalMember(
      owner = "client!qaa",
      name = "sb",
      descriptor = "I"
   )
   public static int field1882;
   @OriginalMember(
      owner = "client!qaa",
      name = "kb",
      descriptor = "I"
   )
   public static int field1883;
   @OriginalMember(
      owner = "client!qaa",
      name = "Gb",
      descriptor = "I"
   )
   public static int field1884;
   @OriginalMember(
      owner = "client!qaa",
      name = "Cb",
      descriptor = "I"
   )
   public static int field1885;
   @OriginalMember(
      owner = "client!qaa",
      name = "lb",
      descriptor = "I"
   )
   public static int field1888;
   @OriginalMember(
      owner = "client!qaa",
      name = "Hb",
      descriptor = "I"
   )
   public static int field1889;
   @OriginalMember(
      owner = "client!qaa",
      name = "Ib",
      descriptor = "I"
   )
   public static int field1890;
   @OriginalMember(
      owner = "client!qaa",
      name = "s",
      descriptor = "I"
   )
   public static int field1891;
   @OriginalMember(
      owner = "client!qaa",
      name = "O",
      descriptor = "I"
   )
   public static int field1893;
   @OriginalMember(
      owner = "client!qaa",
      name = "K",
      descriptor = "I"
   )
   public static int field1894;
   @OriginalMember(
      owner = "client!qaa",
      name = "cb",
      descriptor = "I"
   )
   public static int field1896;
   @OriginalMember(
      owner = "client!qaa",
      name = "I",
      descriptor = "I"
   )
   public static int field1897;
   @OriginalMember(
      owner = "client!qaa",
      name = "Y",
      descriptor = "I"
   )
   public static int field1899;
   @OriginalMember(
      owner = "client!qaa",
      name = "v",
      descriptor = "I"
   )
   public static int field1900;
   @OriginalMember(
      owner = "client!qaa",
      name = "B",
      descriptor = "I"
   )
   public static int field1901;
   @OriginalMember(
      owner = "client!qaa",
      name = "V",
      descriptor = "I"
   )
   public static int field1902;
   @OriginalMember(
      owner = "client!qaa",
      name = "zb",
      descriptor = "I"
   )
   public static int field1909;
   @OriginalMember(
      owner = "client!qaa",
      name = "ob",
      descriptor = "I"
   )
   public static int field1912;
   @OriginalMember(
      owner = "client!qaa",
      name = "ab",
      descriptor = "I"
   )
   public static int field1914;
   @OriginalMember(
      owner = "client!qaa",
      name = "jb",
      descriptor = "I"
   )
   public static int field1916;
   @OriginalMember(
      owner = "client!qaa",
      name = "Z",
      descriptor = "I"
   )
   public static int field1917;
   @OriginalMember(
      owner = "client!qaa",
      name = "yb",
      descriptor = "I"
   )
   public static int field1918;
   @OriginalMember(
      owner = "client!qaa",
      name = "H",
      descriptor = "I"
   )
   public static int field1919;
   @OriginalMember(
      owner = "client!qaa",
      name = "fb",
      descriptor = "I"
   )
   public static int field1921;
   @OriginalMember(
      owner = "client!qaa",
      name = "p",
      descriptor = "I"
   )
   public static int field1923;
   @OriginalMember(
      owner = "client!qaa",
      name = "W",
      descriptor = "I"
   )
   public static int field1925;
   @OriginalMember(
      owner = "client!qaa",
      name = "q",
      descriptor = "I"
   )
   private int field1928;
   @OriginalMember(
      owner = "client!qaa",
      name = "Ab",
      descriptor = "I"
   )
   private int field1930;
   @OriginalMember(
      owner = "client!qaa",
      name = "R",
      descriptor = "I"
   )
   private int field1934;
   @OriginalMember(
      owner = "client!qaa",
      name = "eb",
      descriptor = "J"
   )
   private long field1926;
   @OriginalMember(
      owner = "client!qaa",
      name = "o",
      descriptor = "J"
   )
   private long field1927;
   @OriginalMember(
      owner = "client!qaa",
      name = "db",
      descriptor = "Leda;"
   )
   private class551 field1933;
   @OriginalMember(
      owner = "client!qaa",
      name = "M",
      descriptor = "Z"
   )
   private boolean field1929;
   @OriginalMember(
      owner = "client!qaa",
      name = "A",
      descriptor = "Z"
   )
   private boolean field1932;

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ILhea;)Z"
   )
   public final boolean method1148(int arg0, class317 arg1) {
      try {
         if (arg0 != -31335) {
            this.method1177((byte)-65);
         }

         ++field1861;
         if (arg1.field4739 == null) {
            if (~arg1.field4749 <= -1) {
               arg1.method2140((byte)114);
               if (arg1.field4738 > 0 && this.field1879[arg1.field4752][arg1.field4738] == arg1) {
                  this.field1879[arg1.field4752][arg1.field4738] = null;
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[20] + arg0 + ',' + (arg1 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "(II)V"
   )
   private final void method1149(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1876;
         int var4 = 240 & arg0;
         if (var4 == 128) {
            int var5 = arg0 & 15;
            int var6 = (32613 & arg0) >> 8;
            int var7 = 127 & arg0 >> 16;
            this.method1170(var7, (byte)-61, var5, var6);
         } else if (~var4 == -145) {
            int var8 = 15 & arg0;
            int var9 = (arg0 & 32764) >> 8;
            int var10 = 127 & arg0 >> 16;
            if (~var10 < -1) {
               this.method1180(var8, -1, var10, var9);
            } else {
               this.method1170(64, (byte)-35, var8, var9);
            }
         } else if (~var4 == -161) {
            int var11 = 15 & arg0;
            int var12 = arg0 >> 8 & 127;
            int var13 = 127 & arg0 >> 16;
            this.method1150(var11, var13, var12, (byte)-20);
         } else if (var4 != 176) {
            if (~var4 == -193) {
               int var19 = 15 & arg0;
               int var20 = arg0 >> 8 & 127;
               this.method1164(this.field1906[var19] + var20, var19, 1126512737);
            } else if (var4 == 208) {
               int var21 = 15 & arg0;
               int var22 = (32627 & arg0) >> 8;
               this.method1155(var22, var21, -65);
            } else if (var4 == 224) {
               int var23 = 15 & arg0;
               int var24 = ((arg0 & 8323307) >> 9) + ((32686 & arg0) >> 8);
               this.method1162(var24, var23, (byte)-125);
            } else {
               int var25 = arg0 & 255;
               if (var25 == 255) {
                  this.method1160(true, true);
               } else if (arg1 != 32764) {
                  this.method1161(false, -87, (class317)null);
               }
            }
         } else {
            int var14 = arg0 & 15;
            int var15 = arg0 >> 8 & 127;
            int var16 = (arg0 & 8372579) >> 16;
            if (var15 == 0) {
               this.field1906[var14] = class697.method5101(-2080769, this.field1906[var14]) - -(var16 << 14);
            }

            if (~var15 == -33) {
               this.field1906[var14] = (var16 << 7) + class697.method5101(this.field1906[var14], -16257);
            }

            if (var15 == 1) {
               this.field1920[var14] = (var16 << 7) + class697.method5101(this.field1920[var14], -16257);
            }

            if (~var15 == -34) {
               this.field1920[var14] = var16 + class697.method5101(-128, this.field1920[var14]);
            }

            if (~var15 == -6) {
               this.field1913[var14] = class697.method5101(this.field1913[var14], -16257) + (var16 << 7);
            }

            if (var15 == 37) {
               this.field1913[var14] = var16 + class697.method5101(this.field1913[var14], -128);
            }

            if (var15 == 7) {
               this.field1905[var14] = class697.method5101(this.field1905[var14], -16257) - -(var16 << 7);
            }

            if (~var15 == -40) {
               this.field1905[var14] = class697.method5101(this.field1905[var14], -128) + var16;
            }

            if (var15 == 10) {
               this.field1904[var14] = class697.method5101(-16257, this.field1904[var14]) - -(var16 << 7);
            }

            if (var15 == 42) {
               this.field1904[var14] = class697.method5101(this.field1904[var14], -128) + var16;
            }

            if (var15 == 11) {
               this.field1860[var14] = (var16 << 7) + class697.method5101(-16257, this.field1860[var14]);
            }

            if (var15 == 43) {
               this.field1860[var14] = class697.method5101(this.field1860[var14], -128) - -var16;
            }

            if (var15 == 64) {
               label163: {
                  if (var16 >= 64) {
                     this.field1922[var14] = class91.method932(this.field1922[var14], 1);
                     if (!var3) {
                        break label163;
                     }
                  }

                  this.field1922[var14] = class697.method5101(this.field1922[var14], -2);
               }
            }

            if (~var15 == -66) {
               label157: {
                  if (var16 < 64) {
                     this.method1158(var14, 118);
                     this.field1922[var14] = class697.method5101(this.field1922[var14], -3);
                     if (!var3) {
                        break label157;
                     }
                  }

                  this.field1922[var14] = class91.method932(this.field1922[var14], 2);
               }
            }

            if (var15 == 99) {
               this.field1907[var14] = (var16 << 7) + class697.method5101(127, this.field1907[var14]);
            }

            if (~var15 == -99) {
               this.field1907[var14] = var16 + class697.method5101(16256, this.field1907[var14]);
            }

            if (~var15 == -102) {
               this.field1907[var14] = (var16 << 7) + class697.method5101(127, this.field1907[var14]) + 16384;
            }

            if (var15 == 100) {
               this.field1907[var14] = var16 + 16384 + class697.method5101(this.field1907[var14], 16256);
            }

            if (~var15 == -121) {
               this.method1176(100, var14);
            }

            if (var15 == 121) {
               this.method1168(var14, -17);
            }

            if (var15 == 123) {
               this.method1153(var14, -118);
            }

            if (var15 == 6) {
               int var17 = this.field1907[var14];
               if (var17 == 16384) {
                  this.field1924[var14] = (var16 << 7) + class697.method5101(-16257, this.field1924[var14]);
               }
            }

            if (~var15 == -39) {
               int var18 = this.field1907[var14];
               if (~var18 == -16385) {
                  this.field1924[var14] = var16 + class697.method5101(-128, this.field1924[var14]);
               }
            }

            if (var15 == 16) {
               this.field1903[var14] = (var16 << 7) + class697.method5101(this.field1903[var14], -16257);
            }

            if (var15 == 48) {
               this.field1903[var14] = class697.method5101(-128, this.field1903[var14]) - -var16;
            }

            if (var15 == 81) {
               label135: {
                  if (var16 < 64) {
                     this.method1173(arg1 + -32760, var14);
                     this.field1922[var14] = class697.method5101(this.field1922[var14], -5);
                     if (!var3) {
                        break label135;
                     }
                  }

                  this.field1922[var14] = class91.method932(this.field1922[var14], 4);
               }
            }

            if (var15 == 17) {
               this.method1182((var16 << 7) + (-16257 & this.field1915[var14]), var14, (byte)127);
            }

            if (var15 == 49) {
               this.method1182((this.field1915[var14] & -128) + var16, var14, (byte)-54);
            }

         }
      } catch (RuntimeException var27) {
         throw class612.method4503(var27, field1935[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IIIB)V"
   )
   private final void method1150(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field1889;
         if (arg3 != -20) {
            this.method1173(-68, -67);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1935[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lhea;Z)I"
   )
   private final int method1151(class317 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.field1904 = null;
         }

         ++field1872;
         if (this.field1898[arg0.field4752] == 0) {
            return 0;
         } else {
            class254 var3 = arg0.field4748;
            int var4 = this.field1905[arg0.field4752] * this.field1860[arg0.field4752] - -4096 >> 13;
            int var5 = var4 * var4 + 16384 >> 15;
            int var6 = arg0.field4732 * var5 + 16384 >> 15;
            int var7 = this.field1887 * var6 + 128 >> 8;
            int var8 = this.field1898[arg0.field4752] * var7 + 128 >> 8;
            if (var3.field3847 > 0) {
               var8 = (int)(Math.pow(0.5D, (double)arg0.field4737 * 1.953125E-5D * (double)var3.field3847) * (double)var8 + 0.5D);
            }

            if (var3.field3848 != null) {
               int var9 = arg0.field4747;
               int var10 = var3.field3848[arg0.field4754 + 1];
               if (var3.field3848.length + -2 > arg0.field4754) {
                  int var11 = (255 & var3.field3848[arg0.field4754]) << 8;
                  int var12 = 65280 & var3.field3848[arg0.field4754 + 2] << 8;
                  var10 += (var9 - var11) * (var3.field3848[arg0.field4754 - -3] + -var10) / (-var11 + var12);
               }

               var8 = var8 * var10 + 32 >> 6;
            }

            if (arg0.field4749 > 0 && var3.field3853 != null) {
               int var13 = arg0.field4749;
               int var14 = var3.field3853[arg0.field4733 + 1];
               if (~(var3.field3853.length + -2) < ~arg0.field4733) {
                  int var15 = (var3.field3853[arg0.field4733] & 255) << 8;
                  int var16 = var3.field3853[arg0.field4733 - -2] << 8 & 65280;
                  var14 += (var3.field3853[arg0.field4733 + 3] - var14) * (-var15 + var13) / (-var15 + var16);
               }

               var8 = var8 * var14 + 32 >> 6;
            }

            return var8;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field1935[19] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "e",
      descriptor = "(III)V"
   )
   public final synchronized void method1152(int arg0, int arg1, int arg2) {
      try {
         ++field1864;
         if (arg0 >= -16) {
            this.field1860 = null;
         }

         this.method1175(-109, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[42] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "e",
      descriptor = "(II)V"
   )
   private final void method1153(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(BJ)V"
   )
   private final void method1154(byte param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method1155(int arg0, int arg1, int arg2) {
      try {
         ++field1866;
         if (arg2 >= -41) {
            this.method1160(false, true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[44] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final synchronized void method1156(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.field1879 = null;
         }

         this.field1887 = arg0;
         ++field1894;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "d",
      descriptor = "()I"
   )
   public final synchronized int method563() {
      try {
         ++field1868;
         return 0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1935[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1157(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "d",
      descriptor = "(II)V"
   )
   private final void method1158(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if ((2 & this.field1922[arg0]) != 0) {
            class317 var4 = (class317)this.field1931.field4623.method2245((byte)-94);
            if (var3 || var4 != null) {
               do {
                  if (~var4.field4752 == ~arg0 && this.field1865[arg0][var4.field4745] == null && ~var4.field4749 > -1) {
                     var4.field4749 = 0;
                  }

                  var4 = (class317)this.field1931.field4623.method2239((byte)89);
               } while(var4 != null);
            }
         }

         int var5 = -124 % ((arg1 - -13) / 58);
         ++field1883;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1935[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "d",
      descriptor = "(III)Z"
   )
   public static final boolean method1159(int arg0, int arg1, int arg2) {
      try {
         ++field1896;
         return arg1 != 1 ? true : class405.method3152(arg0, arg2, true) & class68.method714(arg2, arg1 ^ 19091, arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[26] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ZZ)V"
   )
   private final void method1160(boolean param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ZILhea;)V"
   )
   public final void method1161(boolean arg0, int arg1, class317 arg2) {
      try {
         ++field1870;
         if (arg1 != 4204) {
            this.field1910 = null;
         }

         int var6;
         label31: {
            int var4 = arg2.field4736.field4493.length;
            if (arg0 && arg2.field4736.field4496) {
               int var5 = var4 + var4 + -arg2.field4736.field4495;
               var6 = (int)((long)this.field1903[arg2.field4752] * (long)var5 >> 6);
               var4 <<= 8;
               if (var4 > var6) {
                  break label31;
               }

               arg2.field4739.method2424(true);
               var6 = -1 - var6 + var4 + var4;
               if (!client.field10022) {
                  break label31;
               }
            }

            var6 = (int)((long)this.field1903[arg2.field4752] * (long)var4 >> 6);
         }

         arg2.field4739.method2433(var6);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1935[46] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "()Lnj;"
   )
   public final synchronized class307 method566() {
      try {
         ++field1888;
         return null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1935[31] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IIB)V"
   )
   private final void method1162(int arg0, int arg1, byte arg2) {
      try {
         ++field1885;
         if (arg2 > -124) {
            this.method1173(88, -31);
         }

         this.field1886[arg1] = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[28] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lsga;IILeda;Lsa;)Z"
   )
   public final synchronized boolean method1163(class106 arg0, int arg1, int arg2, class551 arg3, class39 arg4) {
      boolean var6 = client.field10022;

      try {
         if (arg1 != 256) {
            this.field1926 = 19L;
         }

         arg3.method4130();
         ++field1863;
         byte var7 = 1;
         int[] var8 = null;
         if (arg2 > 0) {
            var8 = new int[]{arg2};
         }

         class793 var9 = (class793)arg3.field7870.method3102(115);
         int var10000;
         if (var6) {
            var10000 = (int)var9.field3777;
         } else if (var9 == null) {
            var10000 = var7;
            if (!var6) {
               if (var7 != 0) {
                  arg3.method4131();
               }

               return (boolean)var7;
            }
         } else {
            var10000 = (int)var9.field3777;
         }

         while(true) {
            label91: {
               int var10 = var10000;
               class23 var11 = (class23)this.field1892.method3101(-1, (long)var10);
               if (var11 == null) {
                  var11 = class91.method931(var10, -123, arg4);
                  if (var11 == null) {
                     var7 = 0;
                     if (!var6) {
                        var9 = (class793)arg3.field7870.method3095((byte)-118);
                        break label91;
                     }

                     this.field1892.method3098((long)var10, var11, -1);
                  } else {
                     this.field1892.method3098((long)var10, var11, -1);
                  }
               }

               if (!var11.method308(0, var9.field11536, arg0, var8)) {
                  var7 = 0;
               }

               var9 = (class793)arg3.field7870.method3095((byte)-118);
            }

            if (var9 == null) {
               var10000 = var7;
               if (!var6) {
                  if (var7 != 0) {
                     arg3.method4131();
                  }

                  return (boolean)var7;
               }
            } else {
               var10000 = (int)var9.field3777;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1935[40] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1935[4] : field1935[5]) + ',' + (arg4 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method561(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (this.field1908.method410()) {
            int var3 = this.field1908.field521 * this.field1880 / class358.field5291;

            label27:
            while(true) {
               long var4 = this.field1926 - -((long)arg0 * (long)var3);
               if (this.field1927 - var4 >= 0L) {
                  this.field1926 = var4;
                  if (!var2) {
                     break;
                  }
               }

               int var6 = (int)(((long)var3 + this.field1927 + -this.field1926 + -1L) / (long)var3);
               this.field1926 += (long)var3 * (long)var6;
               arg0 -= var6;
               this.field1931.method561(var6);
               this.method1185(-109);

               while(!this.field1908.method410()) {
                  if (!var2) {
                     break label27;
                  }
               }
            }
         }

         ++field1925;
         this.field1931.method561(arg0);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1935[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(III)V"
   )
   private final void method1164(int arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (~this.field1867[arg1] != ~arg0) {
            this.field1867[arg1] = arg0;
            int var5 = 0;
            if (var4 || ~var5 > -129) {
               do {
                  this.field1879[arg1][var5] = null;
                  ++var5;
               } while(~var5 > -129);
            }
         }

         if (arg2 == 1126512737) {
            ++field1921;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1935[37] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final synchronized void method1165(int arg0, byte arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg1 < 43) {
            this.field1922 = null;
         }

         label45: {
            if (arg0 < 0) {
               int var5 = 0;
               if (var4) {
                  this.field1898[var5] = arg2;
                  ++var5;
               }

               while(true) {
                  while(~var5 > -17) {
                     this.field1898[var5] = arg2;
                     ++var5;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label45;
                     }
                     break;
                  }

                  ++var5;
               }
            }

            this.field1898[arg0] = arg2;
         }

         ++field1873;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1935[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method1166(int arg0) {
      try {
         int var2 = -110 / ((35 - arg0) / 35);
         ++field1891;
         return this.field1887;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method1167(int arg0) {
      try {
         field1911 = null;
         if (arg0 < 87) {
            field1911 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1935[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method1168(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1912;
         if (arg0 >= 0) {
            this.field1905[arg0] = 12800;
            this.field1904[arg0] = 8192;
            this.field1860[arg0] = 16383;
            this.field1886[arg0] = 8192;
            this.field1920[arg0] = 0;
            this.field1913[arg0] = 8192;
            this.method1158(arg0, 48);
            this.method1173(arg1 + 21, arg0);
            if (arg1 != -17) {
               this.field1924 = null;
            }

            this.field1922[arg0] = 0;
            this.field1907[arg0] = 32767;
            this.field1924[arg0] = 256;
            this.field1903[arg0] = 0;
            this.method1182(8192, arg0, (byte)60);
         } else {
            int var6 = 0;
            if (var3) {
               this.method1168(var6, -17);
               ++var6;
            }

            while(true) {
               while(~var6 > -17) {
                  this.method1168(var6, -17);
                  ++var6;
               }

               if (!var3) {
                  return;
               }

               ++var6;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Leda;ZZ)V"
   )
   public final synchronized void method1169(class551 arg0, boolean arg1, boolean arg2) {
      try {
         if (!arg1) {
            this.method1171(arg0, (byte)127, arg2, true);
            ++field1919;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[25] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IBII)V"
   )
   private final void method1170(int param1, byte param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Leda;BZZ)V"
   )
   private final synchronized void method1171(class551 param1, byte param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method1172(int arg0) {
      try {
         this.method1184(1, true);
         int var2 = -66 / ((-37 - arg0) / 62);
         ++field1877;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "()Lnj;"
   )
   public final synchronized class307 method558() {
      try {
         ++field1916;
         return this.field1931;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1935[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method1173(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Lhea;I)I"
   )
   private final int method1174(class317 arg0, int arg1) {
      try {
         ++field1923;
         int var3 = this.field1904[arg0.field4752];
         if (arg1 != -7786) {
            this.field1906 = null;
         }

         return var3 >= 8192 ? -((-arg0.field4731 + 128) * (-var3 + 16384) + 32 >> 6) + 16384 : arg0.field4731 * var3 + 32 >> 6;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1935[30] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "c",
      descriptor = "(III)V"
   )
   private final void method1175(int arg0, int arg1, int arg2) {
      try {
         ++field1917;
         this.field1910[arg2] = arg1;
         this.field1906[arg2] = class697.method5101(arg1, -128);
         int var4 = -106 % ((-10 - arg0) / 41);
         this.method1164(arg1, arg2, 1126512737);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1935[29] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "f",
      descriptor = "(II)V"
   )
   private final void method1176(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method564(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1871;
         if (this.field1908.method410()) {
            int var5 = this.field1908.field521 * this.field1880 / class358.field5291;

            label34:
            while(true) {
               long var6 = (long)arg2 * (long)var5 + this.field1926;
               if (this.field1927 - var6 >= 0L) {
                  this.field1926 = var6;
                  if (!var4) {
                     break;
                  }
               }

               int var8 = (int)(((long)var5 + -1L + -this.field1926 + this.field1927) / (long)var5);
               this.field1926 += (long)var5 * (long)var8;
               this.field1931.method564(arg0, arg1, var8);
               arg2 -= var8;
               this.method1185(-101);
               arg1 += var8;

               while(!this.field1908.method410()) {
                  if (!var4) {
                     break label34;
                  }
               }
            }
         }

         this.field1931.method564(arg0, arg1, arg2);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field1935[17] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final synchronized boolean method1177(byte arg0) {
      try {
         if (arg0 != 14) {
            return true;
         } else {
            ++field1869;
            return this.field1908.method410();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1935[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method1178(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IIILhea;[I)Z"
   )
   public final boolean method1179(int arg0, int arg1, int arg2, class317 arg3, int[] arg4) {
      boolean var6 = client.field10022;

      try {
         arg3.field4746 = class358.field5291 / 100;
         ++field1899;
         if (arg3.field4749 >= 0 && (arg3.field4739 == null || arg3.field4739.method2447())) {
            arg3.method2571((byte)-71);
            arg3.method2140((byte)-99);
            if (~arg3.field4738 < -1 && this.field1879[arg3.field4752][arg3.field4738] == arg3) {
               this.field1879[arg3.field4752][arg3.field4738] = null;
            }

            return true;
         } else {
            int var7 = arg3.field4743;
            if (var7 > 0) {
               int var8 = var7 - (int)(Math.pow(2.0D, (double)this.field1913[arg3.field4752] * 4.921259842519685E-4D) * 16.0D + 0.5D);
               if (~var8 > -1) {
                  var8 = 0;
               }

               arg3.field4743 = var8;
            }

            arg3.field4739.method2434(this.method1181((byte)93, arg3));
            class254 var9 = arg3.field4748;
            boolean var10 = false;
            ++arg3.field4729;
            arg3.field4735 += var9.field3857;
            double var11 = (double)((arg3.field4745 + -60 << 8) - -(arg3.field4750 * arg3.field4743 >> 12)) * 5.086263020833333E-6D;
            if (arg0 < var9.field3847) {
               label175: {
                  if (~var9.field3856 >= -1) {
                     arg3.field4737 += 128;
                     if (!var6) {
                        break label175;
                     }
                  }

                  arg3.field4737 += (int)(0.5D + Math.pow(2.0D, (double)var9.field3856 * var11) * 128.0D);
               }

               if (~(arg3.field4737 * var9.field3847) <= -819201) {
                  var10 = true;
               }
            }

            int var10000;
            int var10001;
            if (var9.field3848 != null) {
               label192: {
                  label166: {
                     if (var9.field3849 > 0) {
                        arg3.field4747 += (int)(0.5D + Math.pow(2.0D, (double)var9.field3849 * var11) * 128.0D);
                        if (!var6) {
                           break label166;
                        }
                     }

                     arg3.field4747 += 128;
                     if (var6) {
                        arg3.field4754 += 2;
                     }
                  }

                  while(~arg3.field4754 > ~(var9.field3848.length + -2)) {
                     var10000 = arg3.field4747;
                     var10001 = 65280 & var9.field3848[arg3.field4754 + 2] << 8;
                     if (var6) {
                        break label192;
                     }

                     if (var10000 <= var10001) {
                        break;
                     }

                     arg3.field4754 += 2;
                  }

                  var10000 = ~arg3.field4754;
                  var10001 = ~(var9.field3848.length + -2);
               }

               if (var10000 == var10001 && ~var9.field3848[arg3.field4754 + 1] == -1) {
                  var10 = true;
               }
            }

            if (~arg3.field4749 <= -1 && var9.field3853 != null && ~(this.field1922[arg3.field4752] & 1) == -1 && (~arg3.field4738 > -1 || this.field1879[arg3.field4752][arg3.field4738] != arg3)) {
               label195: {
                  label139: {
                     if (var9.field3855 > 0) {
                        arg3.field4749 += (int)(Math.pow(2.0D, (double)var9.field3855 * var11) * 128.0D + 0.5D);
                        if (!var6) {
                           break label139;
                        }
                     }

                     arg3.field4749 += 128;
                     if (var6) {
                        arg3.field4733 += 2;
                     }
                  }

                  while(~(var9.field3853.length - 2) < ~arg3.field4733) {
                     var10000 = 65280 & var9.field3853[arg3.field4733 + 2] << 8;
                     var10001 = arg3.field4749;
                     if (var6) {
                        break label195;
                     }

                     if (var10000 >= var10001) {
                        break;
                     }

                     arg3.field4733 += 2;
                  }

                  var10000 = arg3.field4733;
                  var10001 = var9.field3853.length - 2;
               }

               if (var10000 == var10001) {
                  var10 = true;
               }
            }

            if (!var10) {
               arg3.field4739.method2410(arg3.field4746, this.method1151(arg3, true), this.method1174(arg3, -7786));
               return false;
            } else {
               label121: {
                  arg3.field4739.method2438(arg3.field4746);
                  if (arg4 != null) {
                     arg3.field4739.method564(arg4, arg2, arg1);
                     if (!var6) {
                        break label121;
                     }
                  }

                  arg3.field4739.method561(arg1);
               }

               if (arg3.field4739.method2411()) {
                  this.field1931.field4631.method568(arg3.field4739);
               }

               arg3.method2571((byte)-71);
               if (arg3.field4749 >= 0) {
                  arg3.method2140((byte)82);
                  if (arg3.field4738 > 0 && this.field1879[arg3.field4752][arg3.field4738] == arg3) {
                     this.field1879[arg3.field4752][arg3.field4738] = null;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field1935[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1935[4] : field1935[5]) + ',' + (arg4 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method1180(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         this.method1170(64, (byte)-120, arg0, arg3);
         ++field1878;
         if ((this.field1922[arg0] & 2) != 0) {
            class317 var6 = (class317)this.field1931.field4623.method2243(122);
            if (var5 || var6 != null) {
               do {
                  if (var6.field4752 == arg0 && ~var6.field4749 > -1) {
                     this.field1865[arg0][var6.field4745] = null;
                     this.field1865[arg0][arg3] = var6;
                     int var7 = (var6.field4750 * var6.field4743 >> 12) + var6.field4751;
                     var6.field4751 += arg3 - var6.field4745 << 8;
                     var6.field4750 = -var6.field4751 + var7;
                     var6.field4745 = arg3;
                     var6.field4743 = 4096;
                     return;
                  }

                  var6 = (class317)this.field1931.field4623.method2246((byte)110);
               } while(var6 != null);
            }
         }

         class23 var8 = (class23)this.field1892.method3101(-1, (long)this.field1867[arg0]);
         if (var8 != null) {
            class301 var9 = var8.field336[arg3];
            if (var9 != null) {
               class317 var10;
               label75: {
                  var10 = new class317();
                  var10.field4736 = var9;
                  var10.field4740 = var8;
                  var10.field4752 = arg0;
                  var10.field4748 = var8.field333[arg3];
                  var10.field4738 = var8.field329[arg3];
                  var10.field4745 = arg3;
                  var10.field4732 = var8.field332[arg3] * arg2 * arg2 * var8.field340 + 1024 >> 11;
                  var10.field4731 = var8.field341[arg3] & 255;
                  var10.field4751 = (arg3 << 8) + -(var8.field338[arg3] & 32767);
                  var10.field4754 = 0;
                  var10.field4747 = 0;
                  var10.field4749 = -1;
                  var10.field4737 = 0;
                  var10.field4733 = 0;
                  if (~this.field1903[arg0] == arg1) {
                     var10.field4739 = class291.method2420(var9, this.method1181((byte)81, var10), this.method1151(var10, true), this.method1174(var10, -7786));
                     if (!var5) {
                        break label75;
                     }
                  }

                  var10.field4739 = class291.method2420(var9, this.method1181((byte)106, var10), 0, this.method1174(var10, arg1 + -7785));
                  this.method1161(~var8.field338[arg3] > -1, 4204, var10);
               }

               if (~var8.field338[arg3] > -1) {
                  var10.field4739.method2423(-1);
               }

               if (~var10.field4738 <= -1) {
                  class317 var11 = this.field1879[arg0][var10.field4738];
                  if (var11 != null && ~var11.field4749 > -1) {
                     this.field1865[arg0][var11.field4745] = null;
                     var11.field4749 = 0;
                  }

                  this.field1879[arg0][var10.field4738] = var10;
               }

               this.field1931.field4623.method2238(var10, 13);
               this.field1865[arg0][arg3] = var10;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1935[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(BLhea;)I"
   )
   private final int method1181(byte arg0, class317 arg1) {
      try {
         ++field1909;
         int var3 = (arg1.field4750 * arg1.field4743 >> 12) + arg1.field4751;
         if (arg0 <= 69) {
            return 28;
         } else {
            int var4 = ((this.field1886[arg1.field4752] + -8192) * this.field1924[arg1.field4752] >> 12) + var3;
            class254 var5 = arg1.field4748;
            if (~var5.field3857 < -1 && (var5.field3851 > 0 || this.field1920[arg1.field4752] > 0)) {
               int var6 = var5.field3851 << 2;
               int var7 = var5.field3854 << 1;
               if (~arg1.field4729 > ~var7) {
                  var6 = arg1.field4729 * var6 / var7;
               }

               int var8 = (this.field1920[arg1.field4752] >> 7) + var6;
               double var9 = Math.sin((double)(arg1.field4735 & 511) * 0.01227184630308513D);
               var4 += (int)((double)var8 * var9);
            }

            int var11 = (int)(0.5D + (double)(arg1.field4736.field4494 * 256) * Math.pow(2.0D, (double)var4 * 3.255208333333333E-4D) / (double)class358.field5291);
            return ~var11 <= -2 ? var11 : 1;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1935[24] + arg0 + ',' + (arg1 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(IIB)V"
   )
   private final void method1182(int arg0, int arg1, byte arg2) {
      try {
         ++field1893;
         this.field1915[arg1] = arg0;
         int var4 = 8 % ((3 - arg2) / 45);
         this.field1895[arg1] = (int)(0.5D + Math.pow(2.0D, (double)arg0 * 5.4931640625E-4D) * 2097152.0D);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1935[35] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IZJLeda;Z)V"
   )
   public final synchronized void method1183(int arg0, boolean arg1, long arg2, class551 arg3, boolean arg4) {
      try {
         ++field1881;
         if (arg0 >= 26) {
            this.method1171(arg3, (byte)102, arg4, arg1);
            this.method1154((byte)124, (long)this.field1908.field521 * arg2);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1935[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1935[4] : field1935[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(IZ)V"
   )
   private final synchronized void method1184(int arg0, boolean arg1) {
      try {
         ++field1902;
         this.field1908.method409();
         this.field1933 = null;
         if (arg0 != 1) {
            this.field1895 = null;
         }

         this.method1160(arg1, true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1935[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method1185(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1874;
         if (arg0 <= -84) {
            int var3 = this.field1930;
            int var4 = this.field1928;
            long var5 = this.field1927;
            if (this.field1933 != null && ~this.field1934 == ~var4) {
               this.method1171(this.field1933, (byte)99, this.field1929, this.field1932);
               this.method1185(-117);
            } else {
               label95:
               while(true) {
                  class35 var10000;
                  int var10001;
                  if (this.field1928 != var4) {
                     this.field1927 = var5;
                     this.field1928 = var4;
                     this.field1930 = var3;
                     if (!var2) {
                        if (this.field1933 != null && this.field1934 < var4) {
                           this.field1928 = this.field1934;
                           this.field1930 = -1;
                           this.field1927 = this.field1908.method401(this.field1928);
                           return;
                        }

                        return;
                     }

                     var10000 = this.field1908;
                     var10001 = var3;
                  } else if (~this.field1908.field520[var3] != ~var4) {
                     var3 = this.field1908.method405();
                     var4 = this.field1908.field520[var3];
                     var10000 = this.field1908;
                     var10001 = var4;
                     if (!var2) {
                        var5 = var10000.method401(var4);
                        continue;
                     }
                  } else {
                     this.field1908.method407(var3);
                     var10000 = this.field1908;
                     var10001 = var3;
                  }

                  do {
                     while(true) {
                        int var7 = var10000.method404(var10001);
                        if (var7 == 1) {
                           this.field1908.method403();
                           this.field1908.method402(var3);
                           if (this.field1908.method397()) {
                              if (this.field1933 != null) {
                                 this.method1169(this.field1933, false, this.field1929);
                                 this.method1185(-94);
                                 return;
                              }

                              if (!this.field1929 || var4 == 0) {
                                 break label95;
                              }

                              this.field1908.method406(var5);
                              if (var2) {
                                 break label95;
                              }
                           }

                           var3 = this.field1908.method405();
                           var4 = this.field1908.field520[var3];
                           var10000 = this.field1908;
                           var10001 = var4;
                           break;
                        }

                        if ((var7 & 128) != 0) {
                           this.method1149(var7, 32764);
                        }

                        this.field1908.method400(var3);
                        this.field1908.method402(var3);
                        if (~this.field1908.field520[var3] != ~var4) {
                           var3 = this.field1908.method405();
                           var4 = this.field1908.field520[var3];
                           var10000 = this.field1908;
                           var10001 = var4;
                           if (!var2) {
                              var5 = var10000.method401(var4);
                              continue label95;
                           }
                        } else {
                           this.field1908.method407(var3);
                           var10000 = this.field1908;
                           var10001 = var3;
                        }
                     }
                  } while(var2);

                  var5 = var10000.method401(var4);
               }

               this.method1160(true, true);
               this.field1908.method409();
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1935[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "([BI)Lma;"
   )
   public static final class148 method1186(byte[] arg0, int arg1) {
      try {
         if (arg1 < 84) {
            method1159(56, -78, -109);
         }

         ++field1897;
         if (arg0 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                  MediaTracker var3 = new MediaTracker(class183.field2683);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class183.field2683);
                  int var5 = var2.getHeight(class183.field2683);
                  if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class54.field794.method215(var4, var4, var6, var5, 0, 1);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field1935[12] + (arg0 != null ? field1935[4] : field1935[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "<init>",
      descriptor = "()V"
   )
   public class119() {
      try {
         this.field1892 = new class398(128);
         this.method1165(-1, (byte)93, 256);
         this.method1160(true, true);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1935[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "<init>",
      descriptor = "(Lqaa;)V"
   )
   public class119(class119 arg0) {
      try {
         this.field1892 = arg0.field1892;
         this.method1165(-1, (byte)50, 256);
         this.method1160(true, true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1935[15] + (arg0 != null ? field1935[4] : field1935[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1188(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
