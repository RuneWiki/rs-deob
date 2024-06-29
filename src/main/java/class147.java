import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class147 extends class428 {
   @OriginalMember(
      owner = "client!wf",
      name = "n",
      descriptor = "I"
   )
   public int field1856;
   @OriginalMember(
      owner = "client!wf",
      name = "ib",
      descriptor = "[B"
   )
   public byte[] field1889;
   @OriginalMember(
      owner = "client!wf",
      name = "Mb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1934 = new String[]{method1214(method1213("u\\<a-")), method1214(method1213("u\\<pG*")), method1214(method1213("u\\<eG*")), method1214(method1213("u\\<}-")), method1214(method1213("u\\<wF*")), method1214(method1213("u\\<vG*")), method1214(method1213("u\\<wD*")), method1214(method1213("u\\<b-")), method1214(method1213("y\u0014<\u001fx")), method1214(method1213("lO~]")), method1214(method1213("u\\<d-")), method1214(method1213("u\\<bD*")), method1214(method1213("u\\<|D*")), method1214(method1213("u\\<{F*")), method1214(method1213("u\\<rF*")), method1214(method1213("u\\<xF*")), method1214(method1213("u\\<`-")), method1214(method1213("u\\<\rllSf\u000f-")), method1214(method1213("u\\<{D*")), method1214(method1213("u\\<rD*")), method1214(method1213("u\\<g-")), method1214(method1213("u\\<gD*")), method1214(method1213("u\\<xG*")), method1214(method1213("u\\<yF*")), method1214(method1213("u\\<}D*")), method1214(method1213("u\\<tD*")), method1214(method1213("\"\u00172RdlT}E%rPaEw0")), method1214(method1213("u\\<dG*")), method1214(method1213("Lo^\u0011fj[`Pfv_`\u0011dv\u001a")), method1214(method1213("u\\<xD*")), method1214(method1213("u\\<~G*")), method1214(method1213("u\\<uG*")), method1214(method1213("u\\<sG*")), method1214(method1213("u\\<gG*")), method1214(method1213("u\\<{G*")), method1214(method1213("u\\<c-")), method1214(method1213("u\\<fG*")), method1214(method1213("u\\<cD*")), method1214(method1213("u\\<rG*")), method1214(method1213("u\\<fD*")), method1214(method1213("u\\<`D*")), method1214(method1213("u\\<aG*")), method1214(method1213("u\\<|-")), method1214(method1213("u\\<}F*")), method1214(method1213("u\\<zF*")), method1214(method1213("u\\<tF*")), method1214(method1213("u\\<tG*")), method1214(method1213("u\\<sD*")), method1214(method1213("@[v\u0011sgHaXjl\u001a|Dh`_`\u0011ll\u001au[vvH ")), method1214(method1213("u\\<uF*")), method1214(method1213("u\\<}G*")), method1214(method1213("u\\<dD*")), method1214(method1213("u\\<yD*")), method1214(method1213("u\\<zG*")), method1214(method1213("u\\<vF*")), method1214(method1213("u\\<\u007fG*")), method1214(method1213("u\\<zD*")), method1214(method1213("u\\<\u007fF*")), method1214(method1213("u\\<|G*")), method1214(method1213("u\\<aD*")), method1214(method1213("\"\u00172RdlT}E%rPaEw")), method1214(method1213("u\\<~D*")), method1214(method1213("u\\<pF*")), method1214(method1213("u\\<vD*")), method1214(method1213("u\\<yG*")), method1214(method1213("u\\<pD*")), method1214(method1213("u\\<`G*")), method1214(method1213("u\\<sF*")), method1214(method1213("u\\<\u007fD*")), method1214(method1213("u\\<\u007f-")), method1214(method1213("u\\<wG*")), method1214(method1213("u\\<f-")), method1214(method1213("u\\<eD*")), method1214(method1213("u\\<~-")), method1214(method1213("u\\<e-")), method1214(method1213("u\\<uD*")), method1214(method1213("u\\<cG*")), method1214(method1213("u\\<|F*")), method1214(method1213("u\\<bG*"))};
   @OriginalMember(
      owner = "client!wf",
      name = "W",
      descriptor = "[C"
   )
   private static char[] field1905 = new char[64];
   @OriginalMember(
      owner = "client!wf",
      name = "Db",
      descriptor = "F"
   )
   public static float field1883;
   @OriginalMember(
      owner = "client!wf",
      name = "qb",
      descriptor = "I"
   )
   public static int field1857;
   @OriginalMember(
      owner = "client!wf",
      name = "ob",
      descriptor = "I"
   )
   public static int field1858;
   @OriginalMember(
      owner = "client!wf",
      name = "y",
      descriptor = "I"
   )
   public static int field1859;
   @OriginalMember(
      owner = "client!wf",
      name = "v",
      descriptor = "I"
   )
   public static int field1860;
   @OriginalMember(
      owner = "client!wf",
      name = "tb",
      descriptor = "I"
   )
   public static int field1861;
   @OriginalMember(
      owner = "client!wf",
      name = "S",
      descriptor = "I"
   )
   public static int field1862;
   @OriginalMember(
      owner = "client!wf",
      name = "A",
      descriptor = "I"
   )
   public static int field1863;
   @OriginalMember(
      owner = "client!wf",
      name = "pb",
      descriptor = "I"
   )
   public static int field1864;
   @OriginalMember(
      owner = "client!wf",
      name = "U",
      descriptor = "I"
   )
   public static int field1865;
   @OriginalMember(
      owner = "client!wf",
      name = "t",
      descriptor = "I"
   )
   public static int field1866;
   @OriginalMember(
      owner = "client!wf",
      name = "N",
      descriptor = "I"
   )
   public static int field1867;
   @OriginalMember(
      owner = "client!wf",
      name = "M",
      descriptor = "I"
   )
   public static int field1868;
   @OriginalMember(
      owner = "client!wf",
      name = "Z",
      descriptor = "I"
   )
   public static int field1869;
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "I"
   )
   public static int field1870;
   @OriginalMember(
      owner = "client!wf",
      name = "O",
      descriptor = "I"
   )
   public static int field1871;
   @OriginalMember(
      owner = "client!wf",
      name = "J",
      descriptor = "I"
   )
   public static int field1872;
   @OriginalMember(
      owner = "client!wf",
      name = "fb",
      descriptor = "I"
   )
   public static int field1873;
   @OriginalMember(
      owner = "client!wf",
      name = "Lb",
      descriptor = "I"
   )
   public static int field1875;
   @OriginalMember(
      owner = "client!wf",
      name = "sb",
      descriptor = "I"
   )
   public static int field1876;
   @OriginalMember(
      owner = "client!wf",
      name = "D",
      descriptor = "I"
   )
   public static int field1877;
   @OriginalMember(
      owner = "client!wf",
      name = "s",
      descriptor = "I"
   )
   public static int field1878;
   @OriginalMember(
      owner = "client!wf",
      name = "Ib",
      descriptor = "I"
   )
   public static int field1879;
   @OriginalMember(
      owner = "client!wf",
      name = "wb",
      descriptor = "I"
   )
   public static int field1880;
   @OriginalMember(
      owner = "client!wf",
      name = "bb",
      descriptor = "I"
   )
   public static int field1881;
   @OriginalMember(
      owner = "client!wf",
      name = "cb",
      descriptor = "I"
   )
   public static int field1882;
   @OriginalMember(
      owner = "client!wf",
      name = "K",
      descriptor = "I"
   )
   public static int field1884;
   @OriginalMember(
      owner = "client!wf",
      name = "Gb",
      descriptor = "I"
   )
   public static int field1885;
   @OriginalMember(
      owner = "client!wf",
      name = "Bb",
      descriptor = "I"
   )
   public static int field1886;
   @OriginalMember(
      owner = "client!wf",
      name = "o",
      descriptor = "I"
   )
   public static int field1887;
   @OriginalMember(
      owner = "client!wf",
      name = "V",
      descriptor = "I"
   )
   public static int field1888;
   @OriginalMember(
      owner = "client!wf",
      name = "Hb",
      descriptor = "I"
   )
   public static int field1890;
   @OriginalMember(
      owner = "client!wf",
      name = "ab",
      descriptor = "I"
   )
   public static int field1891;
   @OriginalMember(
      owner = "client!wf",
      name = "X",
      descriptor = "I"
   )
   public static int field1892;
   @OriginalMember(
      owner = "client!wf",
      name = "r",
      descriptor = "I"
   )
   public static int field1893;
   @OriginalMember(
      owner = "client!wf",
      name = "nb",
      descriptor = "I"
   )
   public static int field1894;
   @OriginalMember(
      owner = "client!wf",
      name = "ub",
      descriptor = "I"
   )
   public static int field1895;
   @OriginalMember(
      owner = "client!wf",
      name = "F",
      descriptor = "I"
   )
   public static int field1896;
   @OriginalMember(
      owner = "client!wf",
      name = "kb",
      descriptor = "I"
   )
   public static int field1897;
   @OriginalMember(
      owner = "client!wf",
      name = "rb",
      descriptor = "I"
   )
   public static int field1898;
   @OriginalMember(
      owner = "client!wf",
      name = "xb",
      descriptor = "I"
   )
   public static int field1899;
   @OriginalMember(
      owner = "client!wf",
      name = "u",
      descriptor = "I"
   )
   public static int field1900;
   @OriginalMember(
      owner = "client!wf",
      name = "T",
      descriptor = "I"
   )
   public static int field1901;
   @OriginalMember(
      owner = "client!wf",
      name = "yb",
      descriptor = "I"
   )
   public static int field1902;
   @OriginalMember(
      owner = "client!wf",
      name = "I",
      descriptor = "I"
   )
   public static int field1903;
   @OriginalMember(
      owner = "client!wf",
      name = "R",
      descriptor = "I"
   )
   public static int field1904;
   @OriginalMember(
      owner = "client!wf",
      name = "m",
      descriptor = "I"
   )
   public static int field1906;
   @OriginalMember(
      owner = "client!wf",
      name = "gb",
      descriptor = "I"
   )
   public static int field1907;
   @OriginalMember(
      owner = "client!wf",
      name = "mb",
      descriptor = "I"
   )
   public static int field1908;
   @OriginalMember(
      owner = "client!wf",
      name = "lb",
      descriptor = "I"
   )
   public static int field1909;
   @OriginalMember(
      owner = "client!wf",
      name = "x",
      descriptor = "I"
   )
   public static int field1910;
   @OriginalMember(
      owner = "client!wf",
      name = "zb",
      descriptor = "I"
   )
   public static int field1911;
   @OriginalMember(
      owner = "client!wf",
      name = "db",
      descriptor = "I"
   )
   public static int field1912;
   @OriginalMember(
      owner = "client!wf",
      name = "H",
      descriptor = "I"
   )
   public static int field1913;
   @OriginalMember(
      owner = "client!wf",
      name = "C",
      descriptor = "I"
   )
   public static int field1914;
   @OriginalMember(
      owner = "client!wf",
      name = "Q",
      descriptor = "I"
   )
   public static int field1915;
   @OriginalMember(
      owner = "client!wf",
      name = "Kb",
      descriptor = "I"
   )
   public static int field1916;
   @OriginalMember(
      owner = "client!wf",
      name = "vb",
      descriptor = "I"
   )
   public static int field1917;
   @OriginalMember(
      owner = "client!wf",
      name = "eb",
      descriptor = "I"
   )
   public static int field1918;
   @OriginalMember(
      owner = "client!wf",
      name = "Ab",
      descriptor = "I"
   )
   public static int field1919;
   @OriginalMember(
      owner = "client!wf",
      name = "p",
      descriptor = "I"
   )
   public static int field1920;
   @OriginalMember(
      owner = "client!wf",
      name = "Cb",
      descriptor = "I"
   )
   public static int field1922;
   @OriginalMember(
      owner = "client!wf",
      name = "q",
      descriptor = "I"
   )
   public static int field1923;
   @OriginalMember(
      owner = "client!wf",
      name = "hb",
      descriptor = "I"
   )
   public static int field1924;
   @OriginalMember(
      owner = "client!wf",
      name = "Jb",
      descriptor = "I"
   )
   public static int field1925;
   @OriginalMember(
      owner = "client!wf",
      name = "G",
      descriptor = "I"
   )
   public static int field1926;
   @OriginalMember(
      owner = "client!wf",
      name = "Fb",
      descriptor = "I"
   )
   public static int field1927;
   @OriginalMember(
      owner = "client!wf",
      name = "jb",
      descriptor = "I"
   )
   public static int field1928;
   @OriginalMember(
      owner = "client!wf",
      name = "Eb",
      descriptor = "I"
   )
   public static int field1930;
   @OriginalMember(
      owner = "client!wf",
      name = "E",
      descriptor = "I"
   )
   public static int field1931;
   @OriginalMember(
      owner = "client!wf",
      name = "P",
      descriptor = "I"
   )
   public static int field1932;
   @OriginalMember(
      owner = "client!wf",
      name = "B",
      descriptor = "I"
   )
   public static int field1933;
   @OriginalMember(
      owner = "client!wf",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field1874;
   @OriginalMember(
      owner = "client!wf",
      name = "w",
      descriptor = "[Lqu;"
   )
   public static class106[] field1921;
   @OriginalMember(
      owner = "client!wf",
      name = "Y",
      descriptor = "[[[I"
   )
   public static int[][][] field1929;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1141(int arg0, int arg1) {
      try {
         if (arg0 == -16271) {
            this.field1889[this.field1856++] = (byte)arg1;
            ++field1928;
            this.field1889[this.field1856++] = (byte)(arg1 >> 8);
            this.field1889[this.field1856++] = (byte)(arg1 >> 16);
            this.field1889[this.field1856++] = (byte)(arg1 >> 24);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[66] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method1142(int arg0, int arg1) {
      try {
         this.field1889[this.field1856 - 1 + -arg0] = (byte)arg0;
         if (arg1 <= 86) {
            field1883 = 1.2957563F;
         }

         ++field1930;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[54] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "t",
      descriptor = "(I)I"
   )
   public final int method1143(int arg0) {
      try {
         if (arg0 != -15465) {
            return 38;
         } else {
            ++field1901;
            return this.field1889[this.field1856++] & 255;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "o",
      descriptor = "(B)I"
   )
   public final int method1144(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field1906;
         int var3 = 0;
         int var4 = this.method1145((byte)30);
         if (var2) {
            var3 += 32767;
            var4 = this.method1145((byte)70);
         }

         while(true) {
            while(~var4 == -32768) {
               var3 += 32767;
               var4 = this.method1145((byte)70);
            }

            if (!var2) {
               if (arg0 >= -87) {
                  this.field1856 = 72;
               }

               return var3 + var4;
            }

            var4 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1934[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1145(byte arg0) {
      try {
         ++field1863;
         if (arg0 < 21) {
            return -121;
         } else {
            int var2 = 255 & this.field1889[this.field1856];
            return ~var2 <= -129 ? this.method1211(-26166) - 32768 : this.method1143(-15465);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method1146(int arg0, int arg1) {
      try {
         if (arg1 != 851057944) {
            field1874 = null;
         }

         ++field1903;
         if (~(-128 & arg0) != -1) {
            if (~(arg0 & -16384) != -1) {
               if (~(arg0 & -2097152) != -1) {
                  if ((arg0 & -268435456) != 0) {
                     this.method1186(arg0 >>> 28 | 128, 0);
                  }

                  this.method1186(arg0 >>> 21 | 128, 0);
               }

               this.method1186((2104613 | arg0) >>> 14, 0);
            }

            this.method1186((arg0 | 16405) >>> 7, arg1 ^ 851057944);
         }

         this.method1186(arg0 & 127, 0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[37] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1147(int arg0) {
      try {
         if (arg0 != -64) {
            field1929 = null;
         }

         ++field1881;
         int var2 = 255 & this.field1889[this.field1856];
         return ~var2 > -129 ? this.method1143(-15465) + -64 : this.method1211(-26166) + -49152;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(JZI)V"
   )
   public final void method1148(long param1, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method1149(boolean arg0, int arg1) {
      try {
         ++field1861;
         if (!arg0) {
            this.method1162(-18);
         }

         this.field1889[this.field1856++] = (byte)arg1;
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
         this.field1889[this.field1856++] = (byte)(arg1 >> 16);
         this.field1889[this.field1856++] = (byte)(arg1 >> 24);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[52] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method1150(int arg0, int arg1) {
      try {
         if (arg0 >= -13) {
            field1905 = null;
         }

         ++field1877;
         int var3 = class514.method3739(this.field1889, this.field1856, arg1, -61);
         this.method1160(85, var3);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "l",
      descriptor = "(II)J"
   )
   public final long method1151(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1900;
         int var9 = arg1 - 1;
         if (arg0 <= var9 && ~var9 >= -8) {
            int var4 = var9 * 8;
            long var5 = 0L;
            if (var3) {
               var5 |= ((long)this.field1889[this.field1856++] & 255L) << var4;
               var4 -= 8;
            }

            while(true) {
               while(~var4 <= -1) {
                  var5 |= ((long)this.field1889[this.field1856++] & 255L) << var4;
                  var4 -= 8;
               }

               if (!var3) {
                  return var5;
               }

               var5 = var5;
               var4 -= 8;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1934[22] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V"
   )
   public final void method1152(BigInteger arg0, BigInteger arg1, int arg2) {
      try {
         ++field1880;
         int var4 = this.field1856;
         this.field1856 = 0;
         byte[] var5 = new byte[var4];
         this.method1191(-5766, var4, var5, 0);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(arg0, arg1);
         byte[] var8 = var7.toByteArray();
         this.field1856 = 0;
         this.method1185(var8.length, true);
         this.method1193((byte)-113, var8, arg2, var8.length);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1934[70] + (arg0 != null ? field1934[8] : field1934[9]) + ',' + (arg1 != null ? field1934[8] : field1934[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "p",
      descriptor = "(I)I"
   )
   public final int method1153(int arg0) {
      try {
         this.field1856 += 4;
         ++field1917;
         if (arg0 != 32) {
            this.method1175(55);
         }

         return (this.field1889[this.field1856 + -1] << 24 & -16777216) + ((this.field1889[this.field1856 - 3] & 255) << 8) + (this.field1889[this.field1856 - 4] & 255) - -(16711680 & this.field1889[this.field1856 + -2] << 16);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[72] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1154(boolean arg0) {
      try {
         if (!arg0) {
            return 21;
         } else {
            this.field1856 += 2;
            ++field1927;
            return (65280 & this.field1889[this.field1856 + -2] << 8) + (this.field1889[this.field1856 - 1] + -128 & 255);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1155(int arg0, byte arg1) {
      try {
         ++field1888;
         this.field1889[this.field1856++] = (byte)arg0;
         int var3 = 124 / ((-68 - arg1) / 45);
         this.field1889[this.field1856++] = (byte)(arg0 >> 8);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[67] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "m",
      descriptor = "(I)Z"
   )
   public final boolean method1156(int arg0) {
      try {
         this.field1856 -= 4;
         ++field1869;
         if (arg0 != 7617) {
            field1874 = null;
         }

         int var2 = class514.method3739(this.field1889, this.field1856, 0, 111);
         int var3 = this.method1164(arg0 + 12076);
         return var2 == var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public final void method1157(int arg0, String arg1) {
      try {
         ++field1893;
         if (arg0 == 255) {
            int var3 = arg1.indexOf(0);
            if (~var3 <= -1) {
               throw new IllegalArgumentException(field1934[28] + var3 + field1934[26]);
            } else {
               this.field1889[this.field1856++] = 0;
               this.field1856 += class713.method5180(arg1.length(), arg1, this.field1889, false, this.field1856, 0);
               this.field1889[this.field1856++] = 0;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[27] + arg0 + ',' + (arg1 != null ? field1934[8] : field1934[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(I[III)V"
   )
   public final void method1158(int arg0, int[] arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field1932;
         int var6 = this.field1856;
         this.field1856 = arg3;
         int var7 = (-arg3 + arg0) / 8;
         if (arg2 > -123) {
            field1921 = null;
         }

         int var8 = 0;
         class147 var10000;
         int var10001;
         if (var5) {
            var10000 = this;
            var10001 = 19693;
         } else if (var7 <= var8) {
            var10000 = this;
            var10001 = var6;
            if (!var5) {
               this.field1856 = var6;
               return;
            }
         } else {
            var10000 = this;
            var10001 = 19693;
         }

         while(true) {
            int var9 = var10000.method1164(var10001);
            int var10 = this.method1164(19693);
            int var11 = 0;
            int var12 = -1640531527;
            int var13 = 32;
            if (var5) {
               var9 += (var10 >>> 5 ^ var10 << 4) + var10 ^ arg1[3 & var11] + var11;
               var11 += var12;
               var10 += (var9 >>> 5 ^ var9 << 4) - -var9 ^ var11 - -arg1[(7232 & var11) >>> 11];
            }

            while(true) {
               while(~(var13--) < -1) {
                  var9 += (var10 >>> 5 ^ var10 << 4) + var10 ^ arg1[3 & var11] + var11;
                  var11 += var12;
                  var10 += (var9 >>> 5 ^ var9 << 4) - -var9 ^ var11 - -arg1[(7232 & var11) >>> 11];
               }

               this.field1856 -= 8;
               this.method1160(91, var9);
               this.method1160(103, var10);
               if (!var5) {
                  ++var8;
                  if (var7 <= var8) {
                     var10000 = this;
                     var10001 = var6;
                     if (!var5) {
                        this.field1856 = var6;
                        return;
                     }
                  } else {
                     var10000 = this;
                     var10001 = 19693;
                  }
                  break;
               }

               var10 += (var9 >>> 5 ^ var9 << 4) - -var9 ^ var11 - -arg1[(7232 & var11) >>> 11];
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field1934[55] + arg0 + ',' + (arg1 != null ? field1934[8] : field1934[9]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg4 == -29877) {
            ++field1896;
            if (arg7 >= class457.field6528 && class348.field4702 >= arg6 && ~class245.field3374 >= ~arg2 && ~class699.field10237 <= ~arg0) {
               class223.method1750(arg7, arg3, arg0, arg1, arg6, false, arg5, arg2);
            } else {
               class140.method1113(arg0, arg7, arg2, arg3, 16, arg5, arg1, arg6);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1934[69] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "n",
      descriptor = "(II)V"
   )
   public final void method1160(int arg0, int arg1) {
      try {
         this.field1889[this.field1856++] = (byte)(arg1 >> 24);
         ++field1876;
         this.field1889[this.field1856++] = (byte)(arg1 >> 16);
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
         this.field1889[this.field1856++] = (byte)arg1;
         if (arg0 < 76) {
            field1883 = -1.2209804F;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method1161(int arg0, int arg1) {
      try {
         ++field1862;
         if (arg0 != -639922104) {
            this.method1156(89);
         }

         this.field1889[-arg1 + -2 + this.field1856] = (byte)(arg1 >> 8);
         this.field1889[-arg1 + this.field1856 + -1] = (byte)arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[68] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "i",
      descriptor = "(I)B"
   )
   public final byte method1162(int arg0) {
      try {
         ++field1859;
         return arg0 != 4 ? -5 : this.field1889[this.field1856++];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method1163(byte arg0, int arg1) {
      try {
         ++field1909;
         int var3 = -126 / ((-30 - arg0) / 63);
         this.field1889[this.field1856++] = (byte)(arg1 + 128);
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[44] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method1164(int arg0) {
      try {
         this.field1856 += 4;
         ++field1878;
         if (arg0 != 19693) {
            this.method1165(26, 12);
         }

         return (this.field1889[this.field1856 + -4] << 24 & -16777216) + (this.field1889[this.field1856 - 2] << 8 & 65280) + (255 & this.field1889[this.field1856 + -1]) - -(16711680 & this.field1889[this.field1856 + -3] << 16);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "p",
      descriptor = "(II)V"
   )
   public final void method1165(int arg0, int arg1) {
      try {
         this.field1889[this.field1856++] = (byte)(arg0 + arg1);
         ++field1879;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[78] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "f",
      descriptor = "(B)I"
   )
   public final int method1166(byte arg0) {
      try {
         ++field1860;
         this.field1856 += 3;
         return arg0 > -21 ? 29 : (255 & this.field1889[this.field1856 + -1]) + ((this.field1889[this.field1856 + -3] & 255) << 16) + (this.field1889[this.field1856 + -2] << 8 & 65280);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class147(int arg0) {
      try {
         this.field1856 = 0;
         this.field1889 = class262.method2000(arg0, 2449);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "h",
      descriptor = "(B)I"
   )
   public final int method1167(byte arg0) {
      try {
         if (arg0 <= 27) {
            this.method1173(62, 22, (byte)-22, (byte[])null);
         }

         this.field1856 += 4;
         ++field1870;
         return (this.field1889[this.field1856 + -1] << 24 & -16777216) - -(this.field1889[this.field1856 + -4] & 255) + ((this.field1889[this.field1856 + -2] & 255) << 16) + (this.field1889[this.field1856 + -3] << 8 & 65280);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "(I)B"
   )
   public final byte method1168(int arg0) {
      try {
         ++field1920;
         if (arg0 != 128) {
            field1921 = null;
         }

         return (byte)(-this.field1889[this.field1856++] + 128);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[58] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final void method1169(int arg0, long arg1) {
      try {
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 56));
         if (arg0 != 11065) {
            this.method1177(-104);
         }

         ++field1924;
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 48));
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 40));
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 32));
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 24));
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 16));
         this.field1889[this.field1856++] = (byte)((int)(arg1 >> 8));
         this.field1889[this.field1856++] = (byte)((int)arg1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[63] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method1170(int arg0) {
      try {
         ++field1916;
         long var2 = (long)this.method1143(-15465) & 4294967295L;
         if (arg0 < 78) {
            return -124L;
         } else {
            long var4 = 4294967295L & (long)this.method1164(19693);
            return (var2 << 32) + var4;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1934[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "s",
      descriptor = "(I)B"
   )
   public final byte method1171(int arg0) {
      try {
         if (arg0 != -128) {
            return -34;
         } else {
            ++field1867;
            return (byte)(this.field1889[this.field1856++] + -128);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method1172(int arg0, int arg1) {
      try {
         this.field1889[this.field1856++] = (byte)(arg1 >> 16);
         ++field1887;
         this.field1889[this.field1856++] = (byte)(arg1 >> 24);
         if (arg0 != -29898) {
            field1921 = null;
         }

         this.field1889[this.field1856++] = (byte)arg1;
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[30] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IIB[B)V"
   )
   public final void method1173(int arg0, int arg1, byte arg2, byte[] arg3) {
      boolean var5 = client.field4360;

      try {
         int var6 = arg1 + -1 + arg0;
         if (var5) {
            arg3[var6] = this.field1889[this.field1856++];
            --var6;
         }

         while(true) {
            while(~var6 <= ~arg0) {
               arg3[var6] = this.field1889[this.field1856++];
               --var6;
            }

            if (!var5) {
               if (arg2 != -86) {
                  this.field1856 = -95;
               }

               ++field1858;
               return;
            }

            --var6;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1934[43] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1934[8] : field1934[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1174(byte arg0) {
      try {
         ++field1884;
         int var2 = -93 % ((76 - arg0) / 45);
         return 255 & -this.field1889[this.field1856++];
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "k",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method1175(int arg0) {
      try {
         ++field1923;
         if (arg0 != 6781) {
            field1874 = null;
         }

         if (~this.field1889[this.field1856] == -1) {
            ++this.field1856;
            return null;
         } else {
            return this.method1204(arg0 ^ 2119557085);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "o",
      descriptor = "(I)I"
   )
   public final int method1176(int arg0) {
      try {
         this.field1856 += 2;
         if (arg0 != -32768) {
            this.method1184(-47, (byte)58, (int[])null, 1);
         }

         ++field1857;
         return ((255 & this.field1889[this.field1856 + -1]) << 8) - -(this.field1889[this.field1856 - 2] + -128 & 255);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "u",
      descriptor = "(I)I"
   )
   public final int method1177(int arg0) {
      try {
         ++field1890;
         this.field1856 += arg0;
         return (-16777216 & this.field1889[this.field1856 + -3] << 24) - -(16711680 & this.field1889[this.field1856 - 4] << 16) - -((255 & this.field1889[this.field1856 + -1]) << 8) - -(255 & this.field1889[this.field1856 + -2]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1178(byte arg0, int arg1) {
      try {
         ++field1873;
         this.field1889[this.field1856++] = (byte)(arg1 >> 16);
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
         this.field1889[this.field1856++] = (byte)arg1;
         if (arg0 >= -120) {
            this.method1194(14);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1179(boolean arg0, int arg1) {
      try {
         this.field1889[-arg1 + this.field1856 + -4] = (byte)(arg1 >> 24);
         ++field1925;
         if (arg0) {
            field1929 = null;
         }

         this.field1889[-arg1 + -3 + this.field1856] = (byte)(arg1 >> 16);
         this.field1889[-arg1 + this.field1856 + -2] = (byte)(arg1 >> 8);
         this.field1889[this.field1856 - 1 + -arg1] = (byte)arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[40] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "g",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method1180(byte arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 < 50) {
            this.method1161(-76, -100);
         }

         ++field1895;
         byte var3 = this.field1889[this.field1856++];
         if (var3 != 0) {
            throw new IllegalStateException(field1934[48]);
         } else {
            int var4 = this.field1856;

            while(true) {
               int var10000 = this.field1889[this.field1856++];

               while(var10000 == 0) {
                  int var5 = -var4 + -1 + this.field1856;
                  var10000 = ~var5;
                  if (!var2) {
                     if (var10000 == -1) {
                        return "";
                     }

                     return class405.method3054(var4, var5, 73, this.field1889);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1934[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "([II)V"
   )
   public final void method1181(int[] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1918;
         int var4 = this.field1856 / 8;
         this.field1856 = 0;
         if (arg1 == -2042076373) {
            int var5 = 0;
            if (var3 || ~var4 < ~var5) {
               do {
                  int var6 = this.method1164(19693);
                  int var7 = this.method1164(19693);
                  int var8 = -957401312;
                  int var9 = -1640531527;
                  int var10 = 32;
                  if (var3) {
                     var7 -= (var6 >>> 5 ^ var6 << 4) + var6 ^ arg0[-165675005 & var8 >>> 11] + var8;
                     var8 -= var9;
                     var6 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[3 & var8] + var8;
                  }

                  while(true) {
                     while(~(var10--) < -1) {
                        var7 -= (var6 >>> 5 ^ var6 << 4) + var6 ^ arg0[-165675005 & var8 >>> 11] + var8;
                        var8 -= var9;
                        var6 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[3 & var8] + var8;
                     }

                     this.field1856 -= 8;
                     this.method1160(79, var6);
                     this.method1160(99, var7);
                     if (!var3) {
                        ++var5;
                        break;
                     }

                     var6 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[3 & var8] + var8;
                  }
               } while(~var4 < ~var5);

            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1934[50] + (arg0 != null ? field1934[8] : field1934[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "l",
      descriptor = "(I)J"
   )
   public final long method1182(int arg0) {
      try {
         ++field1910;
         if (arg0 >= -64) {
            field1921 = null;
         }

         long var2 = 4294967295L & (long)this.method1153(32);
         long var4 = 4294967295L & (long)this.method1153(32);
         return (var4 << 32) - -var2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1934[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "o",
      descriptor = "(II)V"
   )
   public final void method1183(int arg0, int arg1) {
      try {
         this.field1889[this.field1856++] = (byte)(-arg1);
         ++field1891;
         if (arg0 != -637822779) {
            field1905 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[74] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IB[II)V"
   )
   public final void method1184(int arg0, byte arg1, int[] arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field1908;
         int var6 = this.field1856;
         if (arg1 == -9) {
            this.field1856 = arg3;
            int var7 = (-arg3 + arg0) / 8;
            int var8 = 0;
            class147 var10000;
            int var10001;
            if (var5) {
               var10000 = this;
               var10001 = 19693;
            } else if (~var8 <= ~var7) {
               var10000 = this;
               var10001 = var6;
               if (!var5) {
                  this.field1856 = var6;
                  return;
               }
            } else {
               var10000 = this;
               var10001 = 19693;
            }

            while(true) {
               int var9 = var10000.method1164(var10001);
               int var10 = this.method1164(19693);
               int var11 = -957401312;
               int var12 = -1640531527;
               int var13 = 32;
               if (var5) {
                  var10 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var11 - -arg2[var11 >>> 11 & 98566147];
                  var11 -= var12;
                  var9 -= arg2[3 & var11] + var11 ^ (var10 << 4 ^ var10 >>> 5) - -var10;
               }

               while(true) {
                  while(var13-- > 0) {
                     var10 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var11 - -arg2[var11 >>> 11 & 98566147];
                     var11 -= var12;
                     var9 -= arg2[3 & var11] + var11 ^ (var10 << 4 ^ var10 >>> 5) - -var10;
                  }

                  this.field1856 -= 8;
                  this.method1160(84, var9);
                  this.method1160(94, var10);
                  if (!var5) {
                     ++var8;
                     if (~var8 <= ~var7) {
                        var10000 = this;
                        var10001 = var6;
                        if (!var5) {
                           this.field1856 = var6;
                           return;
                        }
                     } else {
                        var10000 = this;
                        var10001 = 19693;
                     }
                     break;
                  }

                  var9 -= arg2[3 & var11] + var11 ^ (var10 << 4 ^ var10 >>> 5) - -var10;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field1934[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1934[8] : field1934[9]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1185(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field1921 = null;
         }

         this.field1889[this.field1856++] = (byte)(arg0 >> 8);
         ++field1931;
         this.field1889[this.field1856++] = (byte)arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "(II)V"
   )
   public final void method1186(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field1856 = 105;
         }

         ++field1864;
         this.field1889[this.field1856++] = (byte)arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[57] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method1187(byte arg0) {
      try {
         int var2 = -70 % ((-2 - arg0) / 61);
         this.field1856 += 2;
         ++field1933;
         int var3 = (this.field1889[this.field1856 + -2] << 8 & 65280) + (255 & this.field1889[this.field1856 + -1]);
         if (var3 > 32767) {
            var3 -= 65536;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1188(byte arg0) {
      try {
         ++field1886;
         if (arg0 > -79) {
            this.field1889 = null;
         }

         this.field1856 += 2;
         int var2 = ((255 & this.field1889[this.field1856 - 2]) << 8) - -(this.field1889[this.field1856 + -1] + -128 & 255);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "n",
      descriptor = "(I)I"
   )
   public final int method1189(int arg0) {
      try {
         if (arg0 != 0) {
            field1883 = -1.0947591F;
         }

         ++field1926;
         return 255 & -this.field1889[this.field1856++] + 128;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class147(byte[] arg0) {
      try {
         this.field1889 = arg0;
         this.field1856 = 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[17] + (arg0 != null ? field1934[8] : field1934[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "m",
      descriptor = "(II)V"
   )
   public final void method1190(int arg0, int arg1) {
      try {
         if (arg0 == -9720) {
            this.field1889[this.field1856++] = (byte)(arg1 >> 8);
            ++field1902;
            this.field1889[this.field1856++] = (byte)(arg1 + 128);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method1191(int param1, int param2, byte[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "n",
      descriptor = "(B)I"
   )
   public final int method1192(byte arg0) {
      try {
         this.field1856 += 4;
         if (arg0 != 38) {
            method1159(102, 24, -128, -81, 30, -86, 53, -94);
         }

         ++field1868;
         return (255 & this.field1889[this.field1856 + -3]) + ((this.field1889[this.field1856 - 2] & 255) << 24) + ((255 & this.field1889[this.field1856 + -4]) << 8) + (16711680 & this.field1889[this.field1856 + -1] << 16);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(B[BII)V"
   )
   public final void method1193(byte param1, byte[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1194(int arg0) {
      try {
         ++field1875;
         if (arg0 != 14623) {
            field1921 = null;
         }

         return -128 + this.field1889[this.field1856++] & 255;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public final void method1195(byte arg0, String arg1) {
      try {
         if (arg0 <= 21) {
            this.method1168(83);
         }

         ++field1866;
         int var3 = arg1.indexOf(0);
         if (var3 >= 0) {
            throw new IllegalArgumentException(field1934[28] + var3 + field1934[60]);
         } else {
            this.field1856 += class713.method5180(arg1.length(), arg1, this.field1889, false, this.field1856, 0);
            this.field1889[this.field1856++] = 0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[59] + arg0 + ',' + (arg1 != null ? field1934[8] : field1934[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "r",
      descriptor = "(I)I"
   )
   public final int method1196(int arg0) {
      try {
         this.field1856 += arg0;
         ++field1915;
         return (16711680 & this.field1889[this.field1856 - 3] << 16) + (this.field1889[this.field1856 + -1] << 8 & 65280) - -(255 & this.field1889[this.field1856 + -2]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method1197(int arg0, int arg1) {
      try {
         ++field1922;
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
         if (arg0 != -431142104) {
            this.method1199((byte)74);
         }

         this.field1889[this.field1856++] = (byte)arg1;
         this.field1889[this.field1856++] = (byte)(arg1 >> 24);
         this.field1889[this.field1856++] = (byte)(arg1 >> 16);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[71] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method1198(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field1885;
         if (arg0 < 92) {
            return -46;
         } else {
            int var3 = this.field1889[this.field1856++];
            int var4 = 0;
            if (var2) {
               var4 = (127 & var3 | var4) << 7;
               var3 = this.field1889[this.field1856++];
            }

            while(true) {
               while(~var3 > -1) {
                  var4 = (127 & var3 | var4) << 7;
                  var3 = this.field1889[this.field1856++];
               }

               int var10000 = var3 | var4;
               if (!var2) {
                  return var10000;
               }

               var3 = var10000;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1934[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "k",
      descriptor = "(B)I"
   )
   public final int method1199(byte arg0) {
      try {
         ++field1898;
         this.field1856 += 2;
         int var2 = ((255 & this.field1889[this.field1856 + -1]) << 8) + (this.field1889[this.field1856 - 2] + -128 & 255);
         if (arg0 > -56) {
            field1874 = null;
         }

         if (~var2 < -32768) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "j",
      descriptor = "(II)V"
   )
   public final void method1200(int arg0, int arg1) {
      try {
         if (arg1 != -12649) {
            field1921 = null;
         }

         this.field1889[this.field1856++] = (byte)(-arg0 + 128);
         ++field1907;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method1201(byte arg0) {
      try {
         ++field1892;
         int var2 = -65 / ((arg0 - -20) / 58);
         this.field1856 += 3;
         int var3 = (255 & this.field1889[this.field1856 + -1]) + ((this.field1889[this.field1856 - 2] & 255) << 8) + ((255 & this.field1889[this.field1856 + -3]) << 16);
         if (var3 > 8388607) {
            var3 -= 16777216;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1934[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method1202(byte arg0) {
      try {
         ++field1872;
         if (this.field1889 != null) {
            class262.method2002((byte)-71, this.field1889);
         }

         this.field1889 = null;
         if (arg0 != 3) {
            this.field1889 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(BLjava/lang/String;ZILjava/lang/String;IZ)V"
   )
   public static final void method1203(byte param0, String param1, boolean param2, int param3, String param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wf",
      name = "q",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method1204(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field1882;
         int var3 = this.field1856;

         while(true) {
            int var10000 = ~this.field1889[this.field1856++];
            int var10001 = -1;

            while(var10000 == var10001) {
               var10000 = arg0;
               var10001 = 2119550368;
               if (!var2) {
                  if (arg0 != 2119550368) {
                     field1905 = null;
                  }

                  int var4 = this.field1856 + -1 + -var3;
                  if (var4 == 0) {
                     return "";
                  }

                  return class405.method3054(var3, var4, 99, this.field1889);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1934[75] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method1205(int arg0, int arg1) {
      try {
         if (arg0 <= 115) {
            field1921 = null;
         }

         this.field1889[this.field1856++] = (byte)arg1;
         ++field1904;
         this.field1889[this.field1856++] = (byte)(arg1 >> 8);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "l",
      descriptor = "(B)B"
   )
   public final byte method1206(byte arg0) {
      try {
         if (arg0 > -90) {
            this.field1889 = null;
         }

         ++field1894;
         return (byte)(-this.field1889[this.field1856++]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(Z)J"
   )
   public final long method1207(boolean arg0) {
      try {
         ++field1899;
         long var2 = (long)this.method1164(19693) & 4294967295L;
         long var4 = 4294967295L & (long)this.method1164(19693);
         return arg0 ? 96L : (var2 << 32) + var4;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1934[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "j",
      descriptor = "(B)V"
   )
   public static void method1208(byte arg0) {
      try {
         field1905 = null;
         field1929 = null;
         field1874 = null;
         if (arg0 == 98) {
            field1921 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1934[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method1209(int arg0, int arg1) {
      try {
         ++field1913;
         if (arg1 >= 0 && arg1 < 128) {
            this.method1186(arg1, 0);
         } else if (arg1 >= 0 && arg1 < 32768) {
            this.method1185(32768 - -arg1, true);
         } else {
            if (arg0 != 128) {
               this.method1180((byte)-96);
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1934[77] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "i",
      descriptor = "(B)I"
   )
   public final int method1210(byte arg0) {
      try {
         ++field1865;
         if (arg0 != 126) {
            return 71;
         } else {
            this.field1856 += 2;
            return ((this.field1889[this.field1856 + -1] & 255) << 8) + (255 & this.field1889[this.field1856 + -2]);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method1211(int arg0) {
      try {
         this.field1856 += 2;
         ++field1911;
         return arg0 != -26166 ? 63 : ((this.field1889[this.field1856 - 2] & 255) << 8) + (this.field1889[this.field1856 + -1] & 255);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1934[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1212(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field1905[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field1905[var1] = (char)(var1 + 97 + -26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field1905[var2] = (char)(var2 + -4);
      }

      field1905[62] = '*';
      field1905[63] = '-';
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1213(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1214(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
