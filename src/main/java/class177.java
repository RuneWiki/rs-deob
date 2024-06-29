import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class177 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    private int field2128 = -1;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Z")
    private boolean field2129 = false;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    private int field2144 = -1;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "Z")
    private boolean field2156 = false;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    private int field2147 = -32768;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    private int field2161 = -1;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "B")
    private byte field2152;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "B")
    private byte field2134;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "Z")
    private boolean field2154;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lhm;")
    public class202 field2126;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "Lw;")
    private class269 field2157;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "Lba;")
    private class350 field2142;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "Lam;")
    private class576 field2155;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "[I")
    public static int[] field2162;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[Z")
    private boolean[] field2132;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
    public final boolean method1032(int arg0) {
        if (arg0 == -28959) {
            field2127++;
            return this.field2154;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Loa;B)V")
    public final void method1033(class635 arg0, byte arg1) {
        if (this.field2157 != null) {
            class533.method3038(this.field2157, this.field2152, this.field2141, this.field2150, this.field2132);
            this.field2157 = null;
            this.field2132 = null;
        }
        field2160++;
        if (arg1 <= 85) {
            this.field2150 = 80;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILq;ILoa;ILba;Z)V")
    public final void method1034(int arg0, int arg1, int arg2, class389 arg3, int arg4, class635 arg5, int arg6, class350 arg7, boolean arg8) {
        if (arg6 <= 121) {
            this.field2157 = null;
        }
        field2146++;
        class375[] var10 = arg7.method886();
        class73[] var11 = arg7.method882();
        if ((this.field2126 == null || this.field2126.field2467) && (var10 != null || var11 != null)) {
            class335 var12 = class195.field2339.method3729(this.field2153, (byte) 109);
            if (var12.field4342 != null) {
                var12 = var12.method1889(1, class491.field7127);
            }
            if (var12 != null) {
                this.field2126 = class202.method1229(class469.field6549, true);
            }
        }
        if (this.field2126 == null) {
            return;
        }
        arg7.method866(arg3);
        if (arg8) {
            this.field2126.method1236(arg5, (long) class469.field6549, var10, var11, false);
        } else {
            this.field2126.method1238((long) class469.field6549);
        }
        this.field2126.method1242(this.field2134, arg2, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFFZ)I")
    public static final int method1035(float arg0, float arg1, float arg2, boolean arg3) {
        field2148++;
        if (arg3) {
            return -74;
        }
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg0 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2162 = null;
        if (arg0 >= -89) {
            field2162 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
    public final int method1037(byte arg0) {
        if (arg0 == 8) {
            field2130++;
            return this.field2147;
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)V")
    public static final void method1038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class214.field2600 = arg0;
        class19.field167 = arg3;
        class422.field5624 = arg2;
        field2135++;
        class566.field8023 = arg1;
        if (arg4 > -109) {
            method1042(-98, (byte) -93, -127, -49, 53);
        }
        class399.field5335 = arg5;
        if (class214.field2600 >= 100) {
            int var6 = class399.field5335 * 512 + 256;
            int var7 = class566.field8023 * 512 + 256;
            int var8 = class363.method1995(class353.field4625, var7, -1327568407, var6) - class422.field5624;
            int var9 = var6 - class345.field4493;
            int var10 = var8 - class150.field1707;
            int var11 = var7 - class662.field9411;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class654.field9344 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class587.field8342 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class654.field9344 < 1024) {
                class654.field9344 = 1024;
            }
            class352.field4616 = 0;
            if (class654.field9344 > 3072) {
                class654.field9344 = 3072;
            }
        }
        class5.field41 = 2;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V")
    public final void method1039(byte arg0, int arg1) {
        int var3 = -9 % ((-arg0 - 37) / 54);
        field2149++;
        this.field2156 = true;
        this.method1044(arg1, 31472);
    }

    @OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field2126 != null) {
            this.field2126.method1243();
        }
        field2138++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILoa;)V")
    public final void method1040(int arg0, class635 arg1) {
        this.method1041(this.field2150, true, arg1, true, arg0, this.field2141, true);
        field2137++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZLoa;ZIIZ)Lba;")
    public final class350 method1041(int arg0, boolean arg1, class635 arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (!arg3) {
            this.method1044(-88, 97);
        }
        field2133++;
        class335 var8 = class195.field2339.method3729(this.field2153, (byte) 109);
        if (var8.field4342 != null) {
            var8 = var8.method1889(1, class491.field7127);
        }
        if (var8 == null) {
            this.method1033(arg2, (byte) 100);
            this.field2161 = -1;
            this.field2144 = -1;
            this.field2128 = -1;
            return null;
        }
        if (!this.field2156 && this.field2144 != var8.field4324) {
            this.field2142 = null;
            this.method1044(-1, 31472);
        }
        this.method1043(41, arg5, arg0);
        if (arg6) {
            boolean var9 = arg6 & this.field2154 & class601.field8530.method1317((byte) -96, class150.field1711) != 0;
            arg6 = var9 & (this.field2128 != var8.field4324 || this.field2155 != null && class601.field8530.method1317((byte) -99, class150.field1711) >= 2 && (this.field2161 != this.field2131 || (this.field2155.field8219 || class504.field7259) && this.field2158 != this.field2131));
        }
        if (arg1 && !arg6) {
            this.field2144 = var8.field4324;
            return null;
        }
        if (arg6) {
            class533.method3038(this.field2157, this.field2152, this.field2141, this.field2150, this.field2132);
            this.field2161 = -1;
            this.field2128 = -1;
        }
        class137 var10 = class628.field8912[this.field2152];
        class137 var11;
        if (this.field2129) {
            var11 = class275.field3477[0];
        } else {
            var11 = this.field2152 < 3 ? class628.field8912[this.field2152 + 1] : null;
        }
        class350 var12 = null;
        if (this.field2155 != null) {
            if (arg6) {
                arg4 |= 0x40000;
            }
            var12 = var8.method1891(var11, -29293, this.field2141, var10, arg4, this.field2139 == 11 ? this.field2145 + 4 : this.field2145, var10.method242(this.field2141, this.field2150), this.field2158, this.field2150, this.field2155, this.field2139 == 11 ? 10 : this.field2139, arg2, this.field2143, this.field2131);
            if (var12 == null) {
                this.field2147 = 0;
                this.field2132 = null;
                this.field2157 = null;
            } else {
                if (arg6) {
                    if (this.field2132 == null) {
                        this.field2132 = new boolean[4];
                    }
                    this.field2157 = var12.method883(this.field2157);
                    class461.method2625(this.field2157, this.field2152, arg5, arg0, this.field2132);
                    this.field2161 = this.field2131;
                    this.field2128 = var8.field4324;
                }
                this.field2147 = var12.method864();
            }
            this.field2142 = null;
        } else if (this.field2142 != null && (arg4 & this.field2142.method902()) == arg4 && this.field2144 == var8.field4324) {
            var12 = this.field2142;
        } else {
            if (this.field2142 != null) {
                arg4 |= this.field2142.method902();
            }
            class671 var13 = var8.method1882(arg2, var10, this.field2150, var10.method242(this.field2141, this.field2150), this.field2139 == 11 ? this.field2145 + 4 : this.field2145, this.field2141, arg6, arg4, this.field2139 == 11 ? 10 : this.field2139, (byte) -85, var11);
            if (var13 == null) {
                this.field2147 = 0;
                this.field2157 = null;
                this.field2132 = null;
                this.field2142 = null;
            } else {
                var12 = var13.field9536;
                this.field2142 = var13.field9536;
                if (arg6) {
                    this.field2157 = var13.field9533;
                    this.field2132 = null;
                    class461.method2625(this.field2157, this.field2152, arg5, arg0, null);
                    this.field2161 = -1;
                    this.field2128 = var8.field4324;
                }
                this.field2147 = var12.method864();
            }
        }
        this.field2141 = arg5;
        this.field2144 = var8.field4324;
        this.field2150 = arg0;
        return var12;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIII)Z")
    public static final boolean method1042(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2151++;
        int var5 = 111 / ((arg1 - 9) / 40);
        if ((class379.field4922[0][arg2][arg0] & 0x2) != 0) {
            return true;
        } else if ((class379.field4922[arg3][arg2][arg0] & 0x10) == 0) {
            return arg4 == class101.method614(arg0, arg3, arg2, -123);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
    private final void method1043(int arg0, int arg1, int arg2) {
        field2136++;
        int var4 = -120 / ((arg0 + 33) / 46);
        label88: while (true) {
            if (this.field2155 == null) {
                if (this.field2156) {
                    return;
                }
                this.method1044(-1, 31472);
                if (this.field2155 == null) {
                    return;
                }
            }
            int var5 = class469.field6549 - this.field2159;
            if (var5 > 100 && this.field2155.field8227 > 0) {
                int var6 = this.field2155.field8216.length - this.field2155.field8227;
                while (this.field2131 < var6 && var5 > this.field2155.field8208[this.field2131]) {
                    var5 -= this.field2155.field8208[this.field2131];
                    this.field2131++;
                }
                if (this.field2131 >= var6) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field2155.field8216.length; var8++) {
                        var7 += this.field2155.field8208[var8];
                    }
                    var5 %= var7;
                }
                this.field2158 = this.field2131 + 1;
                if (this.field2155.field8216.length <= this.field2158) {
                    this.field2158 -= this.field2155.field8227;
                    if (this.field2158 < 0 || this.field2158 >= this.field2155.field8216.length) {
                        this.field2158 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field2155.field8208[this.field2131] >= var5) {
                            this.field2143 = var5;
                            this.field2159 = class469.field6549 - var5;
                            return;
                        }
                        class259.method1473(arg1, (byte) 1, this.field2155, arg2, this.field2134, this.field2131, false);
                        var5 -= this.field2155.field8208[this.field2131];
                        this.field2131++;
                        if (this.field2155.field8216.length <= this.field2131) {
                            this.field2131 -= this.field2155.field8227;
                            if (this.field2131 < 0 || this.field2131 >= this.field2155.field8216.length) {
                                this.field2155 = null;
                                continue label88;
                            }
                        }
                        this.field2158 = this.field2131 + 1;
                    } while (this.field2158 < this.field2155.field8216.length);
                    this.field2158 -= this.field2155.field8227;
                } while (this.field2158 >= 0 && this.field2158 < this.field2155.field8216.length);
                this.field2158 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
    private final void method1044(int arg0, int arg1) {
        field2140++;
        int var3 = arg0;
        if (arg1 != 31472) {
            this.field2139 = 125;
        }
        boolean var4 = false;
        if (arg0 == -1) {
            class335 var5 = class195.field2339.method3729(this.field2153, (byte) 109);
            class335 var6 = var5;
            if (var5.field4342 != null) {
                var5 = var5.method1889(1, class491.field7127);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4401 != null) {
                if (this.field2155 != null && var5.method1895(-59, this.field2155.field8229)) {
                    return;
                }
                var3 = var5.method1888(0);
                if (this.field2144 != var5.field4324) {
                    var4 = var5.field4343;
                }
            } else if (var5.field4399 == -1) {
                if (var6 != null && var6.field4401 != null) {
                    if (this.field2155 != null && var6.method1895(41, this.field2155.field8229)) {
                        return;
                    }
                    var3 = var6.method1888(arg1 - 31472);
                    if (this.field2144 != var6.field4324) {
                        var4 = var6.field4343;
                    }
                } else if (var6 != null && var6.field4399 != -1 && this.field2144 != var6.field4324) {
                    var4 = var6.field4343;
                    var3 = var6.field4399;
                }
            } else if (this.field2144 != var5.field4324) {
                var3 = var5.field4399;
                var4 = var5.field4343;
            }
        }
        if (var3 == -1) {
            this.field2155 = null;
            return;
        }
        this.field2142 = null;
        if (this.field2155 == null || this.field2155.field8229 != var3) {
            this.field2155 = class618.field8696.method124(24006, var3);
        } else if (this.field2155.field8217 == 0) {
            return;
        }
        if (this.field2155.field8216 == null) {
            this.field2155 = null;
            return;
        }
        if (var4) {
            this.field2131 = (int) ((double) this.field2155.field8216.length * Math.random());
            this.field2143 = (int) ((double) this.field2155.field8208[this.field2131] * Math.random()) + 1;
        } else {
            this.field2131 = 0;
            this.field2143 = 1;
        }
        this.field2158 = this.field2131 + 1;
        if (this.field2158 < 0 || this.field2158 >= this.field2155.field8216.length) {
            this.field2158 = -1;
        }
        this.field2159 = class469.field6549 - this.field2143;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIIZI)V")
    public class177(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2150 = arg7;
        this.field2145 = arg3;
        this.field2152 = (byte) arg5;
        this.field2141 = arg6;
        this.field2134 = (byte) arg4;
        this.field2153 = arg1.field4324;
        this.field2139 = arg2;
        this.field2129 = arg8;
        this.field2154 = arg0.method316() && arg1.field4349 && !this.field2129;
        if (arg9 != -1) {
            this.field2156 = true;
        }
        this.method1044(arg9, 31472);
    }
}
