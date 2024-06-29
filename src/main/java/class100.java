import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class100 extends class51 {

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    private int field2222 = 4;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    private int field2228 = 0;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
    private int field2225 = 1638;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    private int field2221 = 4;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
    private int[] field2220 = new int[512];

    @OriginalMember(owner = "client!lb", name = "ob", descriptor = "I")
    private int field2233 = 4;

    @OriginalMember(owner = "client!lb", name = "xb", descriptor = "Z")
    private boolean field2242 = true;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "Lea;")
    public static class38 field2226 = class9.method46((byte) 101, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!lb", name = "nb", descriptor = "Lea;")
    public static class38 field2232 = class9.method46((byte) 117, "Angreifen");

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lea;")
    public static class38 field2230 = class9.method46((byte) 107, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!lb", name = "rb", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!lb", name = "ub", descriptor = "Lea;")
    public static class38 field2239 = class9.method46((byte) 115, "null");

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!lb", name = "wb", descriptor = "Lea;")
    public static class38 field2241 = class9.method46((byte) 117, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!lb", name = "yb", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lb", name = "mb", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!lb", name = "qb", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!lb", name = "tb", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!lb", name = "vb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!lb", name = "zb", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!lb", name = "sb", descriptor = "Lk;")
    public static class89 field2237;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "[I")
    private int[] field2223;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "[I")
    private int[] field2224;

    @OriginalMember(owner = "client!lb", name = "pb", descriptor = "[I")
    public static int[] field2234;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2229;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = this.field2233 << 12;
            int var5 = this.field2222 << 12;
            int var6 = class170.field3490[arg1] * this.field2222;
            for (int var7 = 0; ~var7 > ~class86.field2008; ++var7) {
                int var8 = class196.field3854[var7] * this.field2233;
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~this.field2221; ++var10) {
                    int var11 = this.field2224[var10];
                    int var12 = this.field2223[var10];
                    int var13 = this.method822((byte) -74, var5 * var11 >> 12, var6 * var11 >> 12, var4 * var11 >> 12, var8 * var11 >> 12);
                    var9 += var12 * var13 >> 12;
                }
                if (this.field2242) {
                    var9 = 2048 - -(var9 >> 1);
                }
                var3[var7] = var9;
            }
        }
        if (arg0 >= -125) {
            this.field2228 = -16;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        ++field2235;
        this.method825(-1484813940);
        this.method824(arg0 ^ -28);
        if (arg0 != -2) {
            this.method822((byte) -76, -6, -32, 104, -59);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static final void method820(boolean arg0) {
        if (!arg0) {
            method820(true);
        }
        ++field2231;
        class111.field2483.method169(-1494101117, 163);
        ++class99.field2212;
        class111.field2483.method480(0L, (byte) -108);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2218;
        if (arg2 < 45) {
            method820(false);
        }
        if (arg7 >= 1 && ~arg4 <= -2 && ~arg7 >= -103 && arg4 <= 102) {
            if (class31.field610 && ~class10.field224 != ~arg5) {
                return;
            }
            int var8 = 0;
            if (arg3 == 0) {
                var8 = class101.field2268.method1127(arg5, arg7, arg4);
            }
            boolean var9 = true;
            boolean var10 = false;
            if (arg3 == 1) {
                var8 = class101.field2268.method1099(arg5, arg7, arg4);
            }
            boolean var11 = false;
            if (~arg3 == -3) {
                var8 = class101.field2268.method1125(arg5, arg7, arg4);
            }
            if (arg3 == 3) {
                var8 = class101.field2268.method1096(arg5, arg7, arg4);
            }
            if (var8 != 0) {
                int var12 = var8 >> 14 & 32767;
                int var13 = class101.field2268.method1136(arg5, arg7, arg4, var8);
                int var14 = var13 >> 6 & 3;
                int var15 = var13 & 31;
                if (~arg3 == -1) {
                    class101.field2268.method1117(arg5, arg7, arg4);
                    class106 var16 = class70.method553(var12, 28067);
                    if (var16.field2402 != 0) {
                        class160.field3337[arg5].method398(var15, arg4, var14, arg7, var16.field2362, 106);
                    }
                }
                if (arg3 == 1) {
                    class101.field2268.method1119(arg5, arg7, arg4);
                }
                if (arg3 == 2) {
                    class101.field2268.method1091(arg5, arg7, arg4);
                    class106 var17 = class70.method553(var12, 28067);
                    if (~(var17.field2393 + arg7) < -104 || var17.field2393 + arg4 > 103 || ~(var17.field2405 + arg7) < -104 || var17.field2405 + arg4 > 103) {
                        return;
                    }
                    if (var17.field2402 != 0) {
                        class160.field3337[arg5].method403(arg7, var17.field2362, var14, var17.field2393, var17.field2405, (byte) -73, arg4);
                    }
                }
                if (arg3 == 3) {
                    class101.field2268.method1106(arg5, arg7, arg4);
                    class106 var18 = class70.method553(var12, 28067);
                    if (var18.field2402 == 1) {
                        class160.field3337[arg5].method391(arg7, arg4, 123);
                    }
                }
            }
            if (~arg1 <= -1) {
                int var19 = arg5;
                if (~arg5 > -4 && (class3.field104[1][arg7][arg4] & 2) == 2) {
                    var19 = arg5 + 1;
                }
                class203.method1334(arg5, arg0, -116, var19, class160.field3337[arg5], arg6, arg4, arg1, arg7, class101.field2268);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)I")
    private final int method822(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2240;
        int var6 = -87 % ((-1 - arg0) / 54);
        int var7 = -4096 & arg2;
        int var8 = arg3 & -4096;
        int var9 = arg2 - var7;
        int var10 = arg4 & -4096;
        int var11 = arg1 & -4096;
        int var12 = var7 >> 12;
        int var13 = arg4 - var10;
        int var14 = var12 + 1;
        int var15 = var10 >> 12;
        if (~(var11 >> 12) >= ~var14) {
            var14 = 0;
        }
        int var16 = var14 & 255;
        int var17 = var12 & 255;
        int var18 = var15 + 1;
        int var19 = var15 & 255;
        int var20 = this.field2220[this.field2220[var16] + var19] % 4;
        if (var18 >= var8 >> 12) {
            var18 = 0;
        }
        int var21 = this.field2220[this.field2220[var17] + var19] % 4;
        int var22 = var18 & 255;
        int var23 = this.field2220[this.field2220[var16] + var22] % 4;
        int var24 = this.field2220[var22 - -this.field2220[var17]] % 4;
        int var25 = class21.method129(class113.field2518[var21], false, var9, var13);
        int var26 = class21.method129(class113.field2518[var24], false, var9, var13 + -4096);
        int var27 = class21.method129(class113.field2518[var20], false, var9 - 4096, var13);
        int var28 = class21.method129(class113.field2518[var23], false, var9 + -4096, var13 + -4096);
        int var29 = class200.method1313(var13, true);
        int var30 = class200.method1313(var9, true);
        int var31 = class40.method300(var26, true, var29, var25);
        int var32 = class40.method300(var28, true, var29, var27);
        return class40.method300(var32, true, var30, var31);
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
    public static void method823(int arg0) {
        field2241 = null;
        field2226 = null;
        if (arg0 != -13207) {
            method821(8, -100, -126, 63, 52, 88, -64, -107);
        }
        field2239 = null;
        field2234 = null;
        field2232 = null;
        field2230 = null;
        field2237 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "(I)V")
    private final void method824(int arg0) {
        if (arg0 < 11) {
            this.method824(-70);
        }
        if (this.field2225 <= 0) {
            if (this.field2223 != null && ~this.field2223.length == ~this.field2221) {
                this.field2224 = new int[this.field2221];
                for (int var2 = 0; ~var2 > ~this.field2221; ++var2) {
                    this.field2224[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
                }
            }
        } else {
            this.field2224 = new int[this.field2221];
            this.field2223 = new int[this.field2221];
            for (int var3 = 0; var3 < this.field2221; ++var3) {
                this.field2223[var3] = (int) (Math.pow((double) (this.field2225 / 4096), (double) var3) * 4096.0D);
                this.field2224[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        ++field2244;
    }

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "(I)V")
    private final void method825(int arg0) {
        ++field2238;
        Random var2 = new Random((long) this.field2228);
        for (int var3 = 0; ~var3 > -256; ++var3) {
            this.field2220[var3] = -1;
        }
        if (arg0 != -1484813940) {
            method821(-40, 73, 27, 19, 84, -42, -91, -36);
        }
        for (int var4 = 0; ~var4 > -256; ++var4) {
            int var5;
            do {
                var5 = class54.method393(255, var2, (byte) -117);
            } while (this.field2220[var5] != -1);
            this.field2220[var5 + 255] = this.field2220[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2222 = arg0.method509(119);
                                }
                            } else {
                                this.field2233 = arg0.method509(122);
                            }
                        } else {
                            this.field2228 = arg0.method509(125);
                        }
                    } else {
                        this.field2233 = this.field2222 = arg0.method509(122);
                    }
                } else {
                    this.field2225 = arg0.method462((byte) 101);
                    if (~this.field2225 > -1) {
                        this.field2223 = new int[this.field2221];
                        for (int var5 = 0; ~this.field2221 < ~var5; ++var5) {
                            this.field2223[var5] = arg0.method462((byte) 110);
                        }
                    }
                }
            } else {
                this.field2221 = arg0.method509(117);
            }
        } else {
            this.field2242 = arg0.method509(125) == 1;
        }
        ++field2219;
        if (!arg2) {
            this.field2242 = false;
        }
    }
}
