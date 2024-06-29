import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class170 {

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field2092 = -32768;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    private int field2078 = -1;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Z")
    private boolean field2080 = false;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    private boolean field2073 = false;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    private int field2094 = -1;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    private int field2099 = -1;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "B")
    private byte field2086;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "B")
    private byte field2102;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    private boolean field2069;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "Lhi;")
    private class177 field2100;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lkw;")
    public class211 field2075;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lw;")
    private class252 field2071;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lrd;")
    public static class285 field2077;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lba;")
    private class327 field2067;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
    public static int[] field2090;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "[Z")
    private boolean[] field2088;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 5)
    private final void method971(int arg0, int arg1) {
        field2101++;
        int var3 = arg1;
        boolean var4 = false;
        if (~arg1 == arg0) {
            class385 var5 = class575.field8301.method1499(-7532, this.field2079);
            class385 var6 = var5;
            if (var5.field5793 != null) {
                var5 = var5.method2453(class23.field243, 0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5816 != null) {
                if (this.field2100 != null && var5.method2465(this.field2100.field2166, (byte) -32)) {
                    return;
                }
                var3 = var5.method2457((byte) 113);
                if (this.field2099 != var5.field5810) {
                    var4 = var5.field5795;
                }
            } else if (var5.field5843 == -1) {
                if (var6 != null && var6.field5816 != null) {
                    if (this.field2100 != null && var6.method2465(this.field2100.field2166, (byte) -32)) {
                        return;
                    }
                    var3 = var6.method2457((byte) -48);
                    if (this.field2099 != var6.field5810) {
                        var4 = var6.field5795;
                    }
                } else if (var6 != null && var6.field5843 != -1 && this.field2099 != var6.field5810) {
                    var3 = var6.field5843;
                    var4 = var6.field5795;
                }
            } else if (this.field2099 != var5.field5810) {
                var4 = var5.field5795;
                var3 = var5.field5843;
            }
        }
        if (var3 == -1) {
            this.field2100 = null;
            return;
        }
        this.field2067 = null;
        if (this.field2100 == null || this.field2100.field2166 != var3) {
            this.field2100 = class259.field3686.method2961(var3, 8);
        } else if (this.field2100.field2160 == 0) {
            return;
        }
        if (this.field2100.field2181 == null) {
            this.field2100 = null;
            return;
        }
        if (var4) {
            this.field2065 = (int) ((double) this.field2100.field2181.length * Math.random());
            this.field2089 = (int) (Math.random() * (double) this.field2100.field2150[this.field2065]) + 1;
        } else {
            this.field2089 = 1;
            this.field2065 = 0;
        }
        this.field2097 = this.field2065 + 1;
        if (this.field2097 < 0 || this.field2097 >= this.field2100.field2181.length) {
            this.field2097 = -1;
        }
        this.field2068 = class287.field3982 - this.field2089;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Loa;I)V", line = 129)
    public final void method972(class605 arg0, int arg1) {
        field2083++;
        if (arg1 != -22979) {
            this.field2073 = false;
        }
        this.method981(this.field2093, true, this.field2096, 84, 262144, arg0, true);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 144)
    public final void method973(int arg0, int arg1) {
        field2070++;
        if (arg1 == -1) {
            this.field2080 = true;
            this.method971(0, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 161)
    public static void method974(boolean arg0) {
        field2090 = null;
        if (arg0) {
            method974(false);
        }
        field2077 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILoa;)V", line = 173)
    public final void method975(int arg0, class605 arg1) {
        field2081++;
        if (this.field2071 != null) {
            class240.method1600(this.field2071, this.field2086, this.field2093, this.field2096, this.field2088);
            this.field2071 = null;
            this.field2088 = null;
        }
        if (arg0 != 262144) {
            method980(89, 81, -96, -114, -108, 95, -67, 77, 16);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lq;BLba;IZIILoa;I)V", line = 201)
    public final void method976(class364 arg0, byte arg1, class327 arg2, int arg3, boolean arg4, int arg5, int arg6, class605 arg7, int arg8) {
        field2066++;
        class75[] var10 = arg2.method1353();
        class522[] var11 = arg2.method1348();
        if (arg1 < 27) {
            this.field2086 = 50;
        }
        if ((this.field2075 == null || this.field2075.field2798) && (var10 != null || var11 != null)) {
            class385 var12 = class575.field8301.method1499(-7532, this.field2079);
            if (var12.field5793 != null) {
                var12 = var12.method2453(class23.field243, 0);
            }
            if (var12 != null) {
                this.field2075 = class211.method1337(class287.field3982, true);
            }
        }
        if (this.field2075 == null) {
            return;
        }
        arg2.method1371(arg0);
        if (arg4) {
            this.field2075.method1343(arg7, (long) class287.field3982, var10, var11, false);
        } else {
            this.field2075.method1345((long) class287.field3982);
        }
        this.field2075.method1332(this.field2102, arg3, arg6, arg8, arg5);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Loa;Lqd;IIIIIIZI)V", line = 593)
    public class170(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2079 = arg1.field5810;
        this.field2086 = (byte) arg5;
        this.field2073 = arg8;
        this.field2087 = arg3;
        this.field2093 = arg6;
        this.field2096 = arg7;
        this.field2102 = (byte) arg4;
        this.field2098 = arg2;
        this.field2069 = arg0.method325() && arg1.field5855 && !this.field2073;
        if (arg9 != -1) {
            this.field2080 = true;
        }
        this.method971(0, arg9);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 250)
    private final void method977(int arg0, int arg1, int arg2) {
        int var4 = -47 % ((arg0 + 38) / 53);
        field2074++;
        label88: while (true) {
            if (this.field2100 == null) {
                if (this.field2080) {
                    return;
                }
                this.method971(0, -1);
                if (this.field2100 == null) {
                    return;
                }
            }
            int var5 = class287.field3982 - this.field2068;
            if (var5 > 100 && this.field2100.field2168 > 0) {
                int var6 = this.field2100.field2181.length - this.field2100.field2168;
                while (this.field2065 < var6 && this.field2100.field2150[this.field2065] < var5) {
                    var5 -= this.field2100.field2150[this.field2065];
                    this.field2065++;
                }
                if (var6 <= this.field2065) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field2100.field2181.length; var8++) {
                        var7 += this.field2100.field2150[var8];
                    }
                    var5 %= var7;
                }
                this.field2097 = this.field2065 + 1;
                if (this.field2097 >= this.field2100.field2181.length) {
                    this.field2097 -= this.field2100.field2168;
                    if (this.field2097 < 0 || this.field2097 >= this.field2100.field2181.length) {
                        this.field2097 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var5 <= this.field2100.field2150[this.field2065]) {
                            this.field2068 = class287.field3982 - var5;
                            this.field2089 = var5;
                            return;
                        }
                        class405.method2571(false, arg1, 86, arg2, this.field2102, this.field2100, this.field2065);
                        var5 -= this.field2100.field2150[this.field2065];
                        this.field2065++;
                        if (this.field2065 >= this.field2100.field2181.length) {
                            this.field2065 -= this.field2100.field2168;
                            if (this.field2065 < 0 || this.field2065 >= this.field2100.field2181.length) {
                                this.field2100 = null;
                                continue label88;
                            }
                        }
                        this.field2097 = this.field2065 + 1;
                    } while (this.field2097 < this.field2100.field2181.length);
                    this.field2097 -= this.field2100.field2168;
                } while (this.field2097 >= 0 && this.field2100.field2181.length > this.field2097);
                this.field2097 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I", line = 350)
    public final int method978(int arg0) {
        if (arg0 != 26895) {
            this.field2078 = -80;
        }
        field2072++;
        return this.field2092;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Z", line = 364)
    public final boolean method979(int arg0) {
        field2076++;
        if (arg0 != 1597) {
            this.field2079 = 26;
        }
        return this.field2069;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIII)Z", line = 383)
    public static final boolean method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2084++;
        if (arg6 >= (arg0 + arg7) || arg0 >= arg2 + arg6) {
            return false;
        } else if (arg1 == 10) {
            return arg3 < arg4 + arg5 && arg5 < (arg3 + arg8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIILoa;Z)Lba;", line = 401)
    public final class327 method981(int arg0, boolean arg1, int arg2, int arg3, int arg4, class605 arg5, boolean arg6) {
        field2085++;
        class385 var8 = class575.field8301.method1499(-7532, this.field2079);
        if (arg3 <= 83) {
            method980(32, -7, 74, -10, 74, -52, 98, 62, 62);
        }
        if (var8.field5793 != null) {
            var8 = var8.method2453(class23.field243, 0);
        }
        if (var8 == null) {
            this.method975(262144, arg5);
            this.field2078 = -1;
            this.field2094 = -1;
            this.field2099 = -1;
            return null;
        }
        if (!this.field2080 && this.field2099 != var8.field5810) {
            this.field2067 = null;
            this.method971(0, -1);
        }
        this.method977(46, arg0, arg2);
        if (arg1) {
            boolean var9 = arg1 & this.field2069 & class595.field8694.method2735((byte) -128, class81.field908) != 0;
            arg1 = var9 & (this.field2078 != var8.field5810 || this.field2100 != null && class595.field8694.method2735((byte) -128, class81.field908) >= 2 && (this.field2094 != this.field2065 || (this.field2100.field2164 || class233.field3267) && this.field2097 != this.field2065));
        }
        if (arg6 && !arg1) {
            this.field2099 = var8.field5810;
            return null;
        }
        if (arg1) {
            class240.method1600(this.field2071, this.field2086, this.field2093, this.field2096, this.field2088);
            this.field2078 = -1;
            this.field2094 = -1;
        }
        class132 var10 = class435.field6449[this.field2086];
        class132 var11;
        if (this.field2073) {
            var11 = class544.field7780[0];
        } else {
            var11 = this.field2086 >= 3 ? null : class435.field6449[this.field2086 + 1];
        }
        class327 var12 = null;
        if (this.field2100 != null) {
            if (arg1) {
                arg4 |= 0x40000;
            }
            var12 = var8.method2460(this.field2093, var11, this.field2065, var10.method249(this.field2093, this.field2096), this.field2089, (byte) 108, this.field2098 == 11 ? 10 : this.field2098, this.field2096, this.field2098 == 11 ? this.field2087 + 4 : this.field2087, this.field2100, arg4, var10, arg5, this.field2097);
            if (var12 == null) {
                this.field2092 = 0;
                this.field2071 = null;
                this.field2088 = null;
            } else {
                if (arg1) {
                    if (this.field2088 == null) {
                        this.field2088 = new boolean[4];
                    }
                    this.field2071 = var12.method1387(this.field2071);
                    class172.method990(this.field2071, this.field2086, arg0, arg2, this.field2088);
                    this.field2078 = var8.field5810;
                    this.field2094 = this.field2065;
                }
                this.field2092 = var12.method1379();
            }
            this.field2067 = null;
        } else if (this.field2067 != null && arg4 == (arg4 & this.field2067.method1375()) && this.field2099 == var8.field5810) {
            var12 = this.field2067;
        } else {
            if (this.field2067 != null) {
                arg4 |= this.field2067.method1375();
            }
            class651 var13 = var8.method2459(this.field2093, arg4, this.field2098 == 11 ? this.field2087 + 4 : this.field2087, arg5, var10.method249(this.field2093, this.field2096), arg1, this.field2098 == 11 ? 10 : this.field2098, var11, -115, this.field2096, var10);
            if (var13 == null) {
                this.field2088 = null;
                this.field2092 = 0;
                this.field2071 = null;
                this.field2067 = null;
            } else {
                var12 = var13.field9389;
                this.field2067 = var13.field9389;
                if (arg1) {
                    this.field2088 = null;
                    this.field2071 = var13.field9386;
                    class172.method990(this.field2071, this.field2086, arg0, arg2, null);
                    this.field2078 = var8.field5810;
                    this.field2094 = -1;
                }
                this.field2092 = var12.method1379();
            }
        }
        this.field2096 = arg2;
        this.field2099 = var8.field5810;
        this.field2093 = arg0;
        return var12;
    }

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V", line = 546)
    protected final void finalize() {
        field2091++;
        if (this.field2075 != null) {
            this.field2075.method1344();
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 557)
    public static final void method982(int arg0) {
        field2082++;
        int var1 = 0;
        if (arg0 != 17526) {
            field2090 = null;
        }
        if (class595.field8694.method2732(class81.field908, (byte) -120)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class595.field8694.field6539) {
            var1 |= 0x40;
        }
        class20.method127(120, var1);
        class575.field8301.method1503(23099, var1);
        class622.field8999.method15((byte) 106, var1);
        class224.field3151.method1818(29348, var1);
        class141.field1735.method3664((byte) 116, var1);
        class580.method3368(-94, var1);
        class195.method1243(true, var1);
        class13.method78((byte) 86, var1);
        class232.method1495(var1, arg0 ^ 0xBB89);
        class251.method1656(true);
    }
}
