import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class134 extends class58 {

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[I")
    private int[] field2050 = new int[this.field954];

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lna;")
    public static class26 field2039 = class69.method505("hitbar_default", (byte) -127);

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Lna;")
    public static class26 field2049 = class69.method505("0", (byte) -128);

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "[S")
    public static short[] field2045 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Lvk;")
    public static class170 field2040;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[B")
    private byte[] field2051;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V", line = 10)
    public final void method377(int arg0, int arg1, int arg2) {
        field2043++;
        this.field2041 += this.field2050[arg1] * arg0 >> 12;
        if (arg2 != -20975) {
            method907(-22, -68, -14, 89);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIBI)V", line = 23)
    public static final void method906(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class222.field3517 = arg2;
        class107.field1682 = arg1;
        field2038++;
        class252.field4131 = arg5;
        class305.field5256 = arg3;
        class300.field5153 = arg0;
        if (arg4 != -21) {
            field2049 = (class26) null;
        }
        if (class252.field4131 >= 100) {
            int var6 = class305.field5256 * 128 + 64;
            int var7 = class107.field1682 * 128 + 64;
            int var8 = class17.method118(class279.field4651, 1, var6, var7) - class300.field5153;
            int var9 = var8 - class178.field2793;
            int var10 = var6 - class324.field5589;
            int var11 = var7 - class14.field231;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class312.field5335 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class230.field3660 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class312.field5335 < 128) {
                class312.field5335 = 128;
            }
            if (class312.field5335 > 383) {
                class312.field5335 = 383;
            }
        }
        class37.field614 = 2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)Z", line = 68)
    public static final boolean method907(int arg0, int arg1, int arg2, int arg3) {
        if (!class321.method2239(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class229.field3635[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class50.field794) {
                    if (!class144.method959(var4, var6, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class144.method959(var4, var7, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class144.method959(var4, var8, var5)) {
                    return false;
                }
                if (!class144.method959(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class18.field255) {
                    if (!class144.method959(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class144.method959(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class144.method959(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class144.method959(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class50.field794) {
                    if (!class144.method959(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class144.method959(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class144.method959(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class144.method959(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class18.field255) {
                    if (!class144.method959(var4, var6, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class144.method959(var4, var7, var5)) {
                        return false;
                    }
                    if (!class144.method959(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class144.method959(var4, var8, var5)) {
                    return false;
                }
                if (!class144.method959(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class144.method959(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class144.method959(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class144.method959(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class144.method959(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class144.method959(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 255)
    public static void method908(int arg0) {
        field2039 = null;
        field2045 = null;
        field2049 = null;
        if (arg0 == 128) {
            field2040 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)V", line = 279)
    public static final void method909(byte arg0, boolean arg1) {
        int var2 = -47 / ((arg0 - 5) / 49);
        for (class224 var3 = (class224) class147.field2306.method264(-123); var3 != null; var3 = (class224) class147.field2306.method263(4)) {
            if (var3.field3537 != null) {
                class301.field5195.method1313(var3.field3537);
                var3.field3537 = null;
            }
            if (var3.field3540 != null) {
                class301.field5195.method1313(var3.field3540);
                var3.field3540 = null;
            }
            var3.method1006(-1024);
        }
        field2047++;
        if (!arg1) {
            return;
        }
        for (class224 var4 = (class224) class285.field4793.method264(-119); var4 != null; var4 = (class224) class285.field4793.method263(4)) {
            if (var4.field3537 != null) {
                class301.field5195.method1313(var4.field3537);
                var4.field3537 = null;
            }
            var4.method1006(-1024);
        }
        for (class224 var5 = (class224) class94.field1538.method1823(68); var5 != null; var5 = (class224) class94.field1538.method1825(-66)) {
            if (var5.field3537 != null) {
                class301.field5195.method1313(var5.field3537);
                var5.field3537 = null;
            }
            var5.method1006(-1024);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 345)
    public final void method378(int arg0) {
        if (arg0 == -949697716) {
            field2044++;
            this.field2052 = 0;
            this.field2041 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIF)V", line = 357)
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field954; var7++) {
            this.field2050[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V", line = 390)
    public void method780(int arg0, byte arg1) {
        field2042++;
        this.field2051[this.field2052++] = (byte) ((class4.method23(arg1, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 403)
    public final void method371(byte arg0) {
        this.field2041 = Math.abs(this.field2041);
        field2048++;
        if (arg0 != -92) {
            this.method371((byte) -112);
        }
        if (this.field2041 >= 4096) {
            this.field2041 = 4095;
        }
        this.method780(this.field2052++, (byte) (this.field2041 >> 4));
        this.field2041 = 0;
    }
}
