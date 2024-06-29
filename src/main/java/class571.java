import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class571 extends class136 {

    @OriginalMember(owner = "client!ica", name = "Vc", descriptor = "I")
    public int field8416 = -1;

    @OriginalMember(owner = "client!ica", name = "Hc", descriptor = "I")
    public int field8402 = -1;

    @OriginalMember(owner = "client!ica", name = "Oc", descriptor = "[S")
    public static short[] field8409 = new short[] { 44, 8, 48, 51, 50, 57, 17, 23 };

    @OriginalMember(owner = "client!ica", name = "Gc", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!ica", name = "Ic", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!ica", name = "Jc", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!ica", name = "Lc", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ica", name = "Mc", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ica", name = "Nc", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!ica", name = "Pc", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ica", name = "Qc", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ica", name = "Rc", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!ica", name = "Sc", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ica", name = "Tc", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ica", name = "Uc", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!ica", name = "Wc", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!ica", name = "Xc", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ica", name = "Yc", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!ica", name = "Zc", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!ica", name = "ad", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!ica", name = "bd", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!ica", name = "cd", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!ica", name = "dd", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!ica", name = "Kc", descriptor = "Lqda;")
    public class87 field8405;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
    public final int method945(int arg0) {
        ++field8411;
        if (this.field8405.field1314 != null) {
            class87 var2 = this.field8405.method655((byte) 108, class556.field8280);
            if (var2 != null && var2.field1270 != -1) {
                return var2.field1270;
            }
        }
        if (arg0 != -1) {
            this.method3404(-79, -54, -24, true, 63, 125);
        }
        return this.field8405.field1270;
    }

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "(I)V")
    public static final void method3398(int arg0) {
        ++field8424;
        class375.method2244(-61);
        class539.method3268(5);
        if (arg0 != 8150) {
            method3400(64, -33);
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field8418;
        if (this.field8405 != null && this.method3401(arg1, 4378, 2048)) {
            if (arg0 <= 0) {
                this.method3401((class208) null, 123, 110);
            }
            class165 var3 = arg1.method428();
            int var4 = super.field1927.method1318(16383);
            var3.method344(var4);
            var3.method338(super.field8496, super.field8502, super.field8500);
            class226 var5 = this.method947(false);
            class87 var6 = this.field8405.field1314 != null ? this.field8405.method655((byte) 108, class556.field8280) : this.field8405;
            if (class56.field668.field6868 && var6.field1260 && var5.field3280) {
                class78 var7 = super.field1872 != -1 && ~super.field1882 == -1 ? class463.field6521.method2983(super.field1872, -109) : null;
                class78 var8 = super.field1898 == -1 || super.field1921 && var7 != null ? null : class463.field6521.method2983(super.field1898, -110);
                int var9 = 0;
                if (super.field1856 != 0) {
                    var9 = this.method946((byte) -8);
                }
                class159 var10 = class518.method3066(var8 != null ? super.field1876 : super.field1858, super.field1951[0], var9, var8 != null ? var8 : var7, 255 & this.field8405.field1251, 255 & this.field8405.field1239, super.field1942, var4, 65535 & this.field8405.field1297, super.field1943, this.field8405.field1237, arg1, this.field8405.field1279 & 65535, true, super.field1899);
                if (var10 != null) {
                    float var11 = arg1.method450();
                    float var12 = arg1.method472();
                    arg1.method460(false);
                    arg1.method422(var11, var12 + -150.0F);
                    var10.method93(var3, (class381) null, 0);
                    arg1.method422(var11, var12);
                    arg1.method460(true);
                }
            }
            class77 var13 = null;
            if (this.method3407(false)) {
                var13 = class450.method2725(super.field1951.length, 26728);
            }
            if (super.field1954 == null) {
                arg1.method507(super.field1951, var3, var13 == null ? null : var13.field1022, 0);
            } else {
                class283 var14 = super.field1954.method1356();
                arg1.method452(super.field1951, var14, var3, var13 != null ? var13.field1022 : null, 0);
            }
            this.method959(false, super.field1951, 65535, arg1);
            super.field1862 = class84.field1205;
            super.field1951[0] = super.field1951[1] = super.field1951[2] = super.field1951[3] = null;
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "(I)V")
    public static void method3399(int arg0) {
        field8409 = null;
        if (arg0 != 0) {
            field8409 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(II)Z")
    public static final boolean method3400(int arg0, int arg1) {
        if (arg1 != 25323) {
            method3400(71, -28);
        }
        ++field8417;
        return ~arg0 == -3 || ~arg0 == -5 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lqa;II)Z")
    private final boolean method3401(class208 arg0, int arg1, int arg2) {
        ++field8410;
        int var4 = arg2;
        class226 var5 = this.method947(false);
        class78 var6 = ~super.field1872 != 0 && super.field1882 == 0 ? class463.field6521.method2983(super.field1872, -117) : null;
        class78 var7 = ~super.field1898 == 0 || super.field1921 && var6 != null ? null : class463.field6521.method2983(super.field1898, -106);
        if (arg1 != 4378) {
            field8409 = null;
        }
        int var8 = var5.field3303;
        int var9 = var5.field3269;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field3298 != -1 || var5.field3301 != 0) {
            arg2 |= 7;
        }
        boolean var10 = super.field1855 != 0 && ~class617.field9123 <= ~super.field1944 && ~class617.field9123 > ~super.field1892;
        if (var10) {
            arg2 |= 524288;
        }
        class159 var11 = super.field1951[0] = this.field8405.method647(arg2, super.field1876, super.field1917, super.field1926, var6, super.field1914, class105.field1514, super.field1939, var7, super.field1858, -17811, class463.field6521, arg0, super.field1900, class556.field8280);
        if (var11 == null) {
            return false;
        } else {
            super.field1879 = var11.method86();
            this.method951(var11, 0);
            int var12 = super.field1927.method1318(16383);
            if (~var8 == -1 && var9 == 0) {
                this.method944(true, 0, var12, this.method940(-1) << 7, 0, this.method940(-1) << 7);
            } else {
                this.method944(true, var5.field3274, var12, var8, var5.field3278, var9);
                if (~super.field1899 != -1) {
                    super.field1951[0].method84(super.field1899);
                }
                if (~super.field1942 != -1) {
                    super.field1951[0].method77(super.field1942);
                }
                if (super.field1943 != 0) {
                    super.field1951[0].method82(0, super.field1943, 0);
                }
            }
            if (var10) {
                var11.method70(super.field1905, super.field1881, super.field1875, super.field1855 & 255);
            }
            if (~super.field1912 != 0 && super.field1863 != -1) {
                class389 var13 = class59.field742.method863(super.field1912, (byte) -118);
                boolean var14 = ~var13.field5371 == -4 && (~var8 != -1 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field1884 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field1941 != -1) {
                        var15 |= 2;
                    }
                }
                class159 var16 = super.field1951[1] = var13.method2320(super.field1861, class463.field6521, super.field1863, super.field1854, var15, (byte) 0, arg0);
                if (var16 != null) {
                    if (super.field1941 != 0) {
                        var16.method82(0, -super.field1941 << 0, 0);
                    }
                    if (super.field1884 != 0) {
                        var16.method61(super.field1884 * 2048);
                    }
                    if (var14) {
                        if (super.field1899 != 0) {
                            var16.method84(super.field1899);
                        }
                        if (~super.field1942 != -1) {
                            var16.method77(super.field1942);
                        }
                        if (~super.field1943 != -1) {
                            var16.method82(0, super.field1943, 0);
                        }
                    }
                }
            } else {
                super.field1951[1] = null;
            }
            if (super.field1935 != -1 && super.field1877 != -1) {
                class389 var17 = class59.field742.method863(super.field1935, (byte) -125);
                boolean var18 = ~var17.field5371 == -4 && (var8 != 0 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field1936 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field1873 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class159 var20 = super.field1951[3] = var17.method2325(class463.field6521, arg0, super.field1877, class354.method2138(arg1, 4457), super.field1903, super.field1860, var19);
                if (var20 != null) {
                    if (super.field1873 != 0) {
                        var20.method82(0, -super.field1873 << 0, 0);
                    }
                    if (~super.field1936 != -1) {
                        var20.method61(super.field1936 * 2048);
                    }
                    if (var18) {
                        if (~super.field1899 != -1) {
                            var20.method84(super.field1899);
                        }
                        if (super.field1942 != 0) {
                            var20.method77(super.field1942);
                        }
                        if (~super.field1943 != -1) {
                            var20.method82(0, super.field1943, 0);
                        }
                    }
                }
            } else {
                super.field1951[3] = null;
            }
            super.field1951[2] = null;
            if (super.field1949 != null) {
                if (class617.field9123 < super.field1949.field6464) {
                    if (class617.field9123 >= super.field1949.field6466) {
                        class159 var21 = super.field1949.method2774((byte) -125, arg0, var4 | 7);
                        if (var21 != null) {
                            var21.method82(-super.field8496 + super.field1949.field6458, super.field1949.field6461 - super.field8502, super.field1949.field6453 - super.field8500);
                            if (var12 != 0) {
                                var21.method61(var12);
                            }
                            super.field1951[2] = var21;
                        }
                    }
                } else {
                    super.field1949 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(III)V")
    public final void method3402(int arg0, int arg1, int arg2) {
        if (arg1 <= 29) {
            method3400(120, 97);
        }
        ++field8412;
        int var4 = super.field1957[0];
        int var5 = super.field1955[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (~arg2 == -4) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        if (~super.field1872 != 0 && ~class463.field6521.method2983(super.field1872, -114).field1060 == -2) {
            super.field1872 = -1;
        }
        if (super.field1912 != -1) {
            class389 var6 = class59.field742.method863(super.field1912, (byte) -126);
            if (var6.field5352 && ~var6.field5357 != 0 && ~class463.field6521.method2983(var6.field5357, -120).field1060 == -2) {
                super.field1912 = -1;
            }
        }
        if (super.field1935 != -1) {
            class389 var7 = class59.field742.method863(super.field1935, (byte) -126);
            if (var7.field5352 && var7.field5357 != -1 && class463.field6521.method2983(var7.field5357, -127).field1060 == 1) {
                super.field1935 = -1;
            }
        }
        if (~super.field1953 > -10) {
            ++super.field1953;
        }
        for (int var8 = super.field1953; ~var8 < -1; --var8) {
            super.field1957[var8] = super.field1957[var8 - 1];
            super.field1955[var8] = super.field1955[var8 - 1];
            super.field1948[var8] = super.field1948[var8 + -1];
        }
        super.field1957[0] = var4;
        super.field1948[0] = (byte) arg0;
        super.field1955[0] = var5;
    }

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "(I)Z")
    public final boolean method3403(int arg0) {
        if (arg0 != 0) {
            this.field8416 = 46;
        }
        ++field8423;
        return this.field8405 != null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field8408;
        if (arg3 < 44) {
            this.method181(12, (class208) null);
        }
        if (this.field8405 != null && this.method3401(arg1, 4378, 131072)) {
            class165 var5 = arg1.method428();
            int var6 = super.field1927.method1318(16383);
            var5.method344(var6);
            var5.method338(super.field8496, super.field8502, super.field8500);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field1951.length; ++var8) {
                if (super.field1951[var8] != null && super.field1951[var8].method72(arg2, arg0, var5, this.field8405.field1237 == 1)) {
                    var7 = true;
                    break;
                }
            }
            super.field1951[0] = super.field1951[1] = super.field1951[2] = super.field1951[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIZII)V")
    public final void method3404(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field8401;
        super.field8501 = (byte) arg4;
        if (super.field1872 != -1 && class463.field6521.method2983(super.field1872, -103).field1060 == 1) {
            super.field1872 = -1;
        }
        if (super.field1912 != -1) {
            class389 var7 = class59.field742.method863(super.field1912, (byte) -119);
            if (var7.field5352 && ~var7.field5357 != 0 && class463.field6521.method2983(var7.field5357, -115).field1060 == 1) {
                super.field1912 = -1;
            }
        }
        if (~super.field1935 != 0) {
            class389 var8 = class59.field742.method863(super.field1935, (byte) -120);
            if (var8.field5352 && var8.field5357 != -1 && ~class463.field6521.method2983(var8.field5357, -125).field1060 == -2) {
                super.field1935 = -1;
            }
        }
        if (!arg3) {
            int var9 = -super.field1957[0] + arg5;
            int var10 = arg1 - super.field1955[0];
            if (~var9 <= 7 && var9 <= 8 && ~var10 <= 7 && var10 <= 8) {
                if (~super.field1953 > -10) {
                    ++super.field1953;
                }
                for (int var11 = super.field1953; var11 > 0; --var11) {
                    super.field1957[var11] = super.field1957[var11 + -1];
                    super.field1955[var11] = super.field1955[var11 - 1];
                    super.field1948[var11] = super.field1948[var11 - 1];
                }
                super.field1957[0] = arg5;
                super.field1948[0] = 1;
                super.field1955[0] = arg1;
                return;
            }
        }
        super.field1952 = 0;
        super.field1957[0] = arg5;
        super.field1947 = 0;
        int var12 = -78 / ((45 - arg0) / 48);
        super.field1953 = 0;
        super.field1955[0] = arg1;
        super.field8500 = (super.field1955[0] << 7) - -(arg2 << 6);
        super.field8496 = (super.field1957[0] << 7) + (arg2 << 6);
        if (super.field1954 != null) {
            super.field1954.method1369();
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != 1) {
            this.method945(-102);
        }
        ++field8403;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(B)I")
    public final int method177(byte arg0) {
        ++field8406;
        if (arg0 != 40) {
            this.field8402 = 67;
        }
        return super.field1879;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        ++field8404;
        if (this.field8405 != null) {
            if (super.field1950 || this.method3401(arg1, 4378, 0)) {
                this.method959(super.field1950, super.field1951, arg0 + 65535, arg1);
                super.field1951[arg0] = super.field1951[1] = super.field1951[2] = super.field1951[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lqda;I)V")
    public final void method3405(class87 arg0, int arg1) {
        if (arg1 == 44) {
            ++field8422;
            this.field8405 = arg0;
            if (super.field1954 != null) {
                super.field1954.method1369();
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLqa;)V")
    public static final void method3406(byte arg0, class208 arg1) {
        ++field8413;
        if (class446.field6245) {
            class246.method1561(arg1, (byte) -125);
        } else {
            class155.method1124(2, arg1);
        }
        if (arg0 != 62) {
            field8409 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        if (arg1 != 31733) {
            method3399(-27);
        }
        ++field8415;
        return null;
    }

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "(I)I")
    public final int method957(int arg0) {
        ++field8407;
        if (arg0 != -31391) {
            return -110;
        } else {
            if (this.field8405.field1314 != null) {
                class87 var2 = this.field8405.method655((byte) 108, class556.field8280);
                if (var2 != null && var2.field1285 != -1) {
                    return var2.field1285;
                }
            }
            return this.field8405.field1285;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field8421;
        if (arg6 == 21130) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)Z")
    private final boolean method3407(boolean arg0) {
        if (arg0) {
            method3400(-96, 80);
        }
        ++field8420;
        return this.field8405.field1294;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            return true;
        } else {
            ++field8419;
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
    public final int method949(byte arg0) {
        ++field8414;
        if (arg0 <= 125) {
            field8409 = null;
        }
        if (this.field8405.field1314 != null) {
            class87 var2 = this.field8405.method655((byte) 108, class556.field8280);
            if (var2 != null && ~var2.field1262 != 0) {
                return var2.field1262;
            }
        }
        return ~this.field8405.field1262 != 0 ? this.field8405.field1262 : super.method949((byte) 126);
    }
}
