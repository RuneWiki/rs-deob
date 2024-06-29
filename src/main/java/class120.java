import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class120 extends class64 {

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    private int field2211 = 12288;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    private int field2215 = 2048;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
    private int field2217 = 2048;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    private int field2212 = 0;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    private int field2209 = 8192;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    private int field2213 = 0;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
    private int field2220 = 4096;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lsg;")
    public static class169 field2206 = class165.method1060("Lade Konfiguration )2 ", 1536);

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -38 % ((arg0 - -60) / 36);
        ++field2218;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2209 = arg1.method785(true);
                                }
                            } else {
                                this.field2220 = arg1.method785(true);
                            }
                        } else {
                            this.field2211 = arg1.method785(true);
                        }
                    } else {
                        this.field2217 = arg1.method785(true);
                    }
                } else {
                    this.field2212 = arg1.method785(true);
                }
            } else {
                this.field2213 = arg1.method785(true);
            }
        } else {
            this.field2215 = arg1.method785(true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            return null;
        } else {
            ++field2222;
            int[] var3 = super.field1192.method19((byte) 127, arg0);
            if (super.field1192.field75) {
                int var4 = class189.field3699[arg0] + -2048;
                for (int var5 = 0; ~class147.field2715 < ~var5; ++var5) {
                    int var6 = class185.field3607[var5] + -2048;
                    int var7 = this.field2215 + var6;
                    int var8 = this.field2213 + var4;
                    int var9 = var7 < -2048 ? var7 - -4096 : var7;
                    int var10 = var8 < -2048 ? var8 + 4096 : var8;
                    int var11 = this.field2212 + var6;
                    int var12 = ~var11 > 2047 ? var11 - -4096 : var11;
                    int var13 = var4 - -this.field2217;
                    int var14 = ~var9 < -2049 ? var9 + -4096 : var9;
                    int var15 = ~var10 >= -2049 ? var10 : var10 + -4096;
                    int var16 = var12 <= 2048 ? var12 : var12 + -4096;
                    int var17 = var13 >= -2048 ? var13 : var13 - -4096;
                    int var18 = var17 > 2048 ? var17 + -4096 : var17;
                    var3[var5] = !this.method747(var14, 100, var15) && !this.method748(class44.method277(arg1, 236), var18, var16) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)Z")
    private final boolean method747(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - arg0) * this.field2211 >> 12;
        int var5 = class125.field2292[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2211;
        if (arg1 < 34) {
            this.method17(true);
        }
        ++field2219;
        int var7 = (var6 << 12) / this.field2209;
        int var8 = this.field2220 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && ~(arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        ++field2221;
        class145.method956((byte) -10);
        if (arg0) {
            method751(80);
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(III)Z")
    private final boolean method748(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - -arg2) * this.field2211 >> 12;
        ++field2216;
        int var5 = class125.field2292[arg0 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2211;
        int var7 = (var6 << 12) / this.field2209;
        int var8 = this.field2220 * var7 >> 12;
        return ~(-arg2 + arg1) > ~var8 && -arg2 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lqf;I)V")
    public static final void method749(class150 arg0, int arg1) {
        int var2 = arg0.field2872;
        ++field2205;
        if (arg1 != 5) {
            field2206 = null;
        }
        if (~var2 == -325) {
            if (~class82.field1500 == 0) {
                class123.field2267 = arg0.field2884;
                class82.field1500 = arg0.field2856;
            }
            if (!class63.field1163.field8) {
                arg0.field2856 = class123.field2267;
            } else {
                arg0.field2856 = class82.field1500;
            }
        } else if (var2 == 325) {
            if (class82.field1500 == -1) {
                class123.field2267 = arg0.field2884;
                class82.field1500 = arg0.field2856;
            }
            if (class63.field1163.field8) {
                arg0.field2856 = class123.field2267;
            } else {
                arg0.field2856 = class82.field1500;
            }
        } else if (var2 == 327) {
            arg0.field2888 = 150;
            arg0.field2863 = (int) (Math.sin((double) class162.field3107 / 40.0D) * 256.0D) & 2047;
            arg0.field2803 = -1;
            arg0.field2808 = 5;
        } else if (var2 == 328) {
            arg0.field2888 = 150;
            arg0.field2863 = 2047 & (int) (256.0D * Math.sin((double) class162.field3107 / 40.0D));
            arg0.field2808 = 5;
            arg0.field2803 = ((int) class4.field79.field3856.method1133(false) << 11) - -2047;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
    public static void method750(int arg0) {
        field2206 = null;
        if (arg0 != 26358) {
            field2206 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)I")
    public static final int method751(int arg0) {
        if (arg0 != -26506) {
            method750(-90);
        }
        ++field2214;
        return class80.field1470++;
    }
}
