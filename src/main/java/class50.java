import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class50 extends class1 {

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    private int field1004 = 0;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    private int field1009 = 8192;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    private int field1012 = 4096;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    private int field1015 = 2048;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
    private int field1013 = 12288;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "I")
    private int field1021 = 2048;

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
    private int field1022 = 0;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Loc;")
    public static class151 field1007 = class137.method873(2, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "Loc;")
    private static class151 field1005 = class137.method873(2, "Close");

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "[I")
    public static int[] field1014 = new int[200];

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "Loc;")
    public static class151 field1016 = field1005;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "Loc;")
    public static class151 field1010 = class137.method873(2, "Benutzen");

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "[I")
    public static int[] field1003 = new int[100];

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "Lph;")
    public static class166 field1011;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field1008;
        if (arg0 != 0) {
            this.field1004 = -28;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1009 = arg2.method1490((byte) 73);
                                }
                            } else {
                                this.field1012 = arg2.method1490((byte) 73);
                            }
                        } else {
                            this.field1013 = arg2.method1490((byte) 73);
                        }
                    } else {
                        this.field1021 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field1022 = arg2.method1490((byte) 73);
                }
            } else {
                this.field1004 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1015 = arg2.method1490((byte) 73);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)Z")
    private final boolean method349(int arg0, int arg1, int arg2) {
        if (arg2 != 11984) {
            return false;
        } else {
            ++field1019;
            int var4 = (arg0 - -arg1) * this.field1013 >> 12;
            int var5 = class164.field2963[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field1013;
            int var7 = (var6 << 12) / this.field1009;
            int var8 = this.field1012 * var7 >> 12;
            return -arg1 + arg0 < var8 && ~(-arg1 + arg0) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        class182.method1146(false);
        ++field1002;
        if (arg0 != 3) {
            this.method2(-7);
        }
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static final void method350(int arg0) {
        if (!class225.field3917) {
            class185.field3316[0] = 1002;
            class117.field2108 = 1;
            class182.field3305[0] = class205.field3634;
            class225.field3916[0] = class134.field2441;
        }
        ++field1006;
        if (arg0 < 122) {
            method351((byte) 60);
        }
        if (class31.field652 != -1) {
            class175.method1121(class31.field652, (byte) -65);
        }
        for (int var1 = 0; ~var1 > ~class147.field2628; ++var1) {
            if (class224.field3911[var1]) {
                class63.field1234[var1] = true;
            }
            class48.field989[var1] = class224.field3911[var1];
            class224.field3911[var1] = false;
        }
        class182.field3300 = -1;
        class21.field458 = class200.field3541;
        class234.field4317 = -1;
        class194.field3464 = null;
        if (~class31.field652 != 0) {
            class147.field2628 = 0;
            class90.method575(0, class31.field652, class202.field3602, (byte) -77, -1, 0, 0, class36.field751, 0);
        }
        class221.method1387();
        class205.method1296(-1);
        if (!class225.field3917) {
            if (~class234.field4317 != 0) {
                class28.method212(2, class234.field4317, class182.field3300);
            }
        } else {
            class115.method693(true);
        }
        if (class169.field3081 == 3) {
            for (int var2 = 0; class147.field2628 > var2; ++var2) {
                if (class48.field989[var2]) {
                    class221.method1384(class222.field3858[var2], class192.field3407[var2], class121.field2176[var2], class210.field3679[var2], 16711935, 128);
                } else if (class63.field1234[var2]) {
                    class221.method1384(class222.field3858[var2], class192.field3407[var2], class121.field2176[var2], class210.field3679[var2], 16711680, 128);
                }
            }
        }
        class55.method379(class228.field3975.field3976, class234.field4325, class228.field3975.field4029, false, class181.field3273);
        class181.field3273 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V")
    public static void method351(byte arg0) {
        field1010 = null;
        field1007 = null;
        field1005 = null;
        field1016 = null;
        if (arg0 != 105) {
            field1016 = null;
        }
        field1014 = null;
        field1011 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(III)Z")
    private final boolean method352(int arg0, int arg1, int arg2) {
        ++field1018;
        if (arg2 != -10769) {
            this.method349(7, 120, -72);
        }
        int var4 = (-arg1 + arg0) * this.field1013 >> 12;
        int var5 = class164.field2963[(var4 * 255 & 1045691) >> 12];
        int var6 = (var5 << 12) / this.field1013;
        int var7 = (var6 << 12) / this.field1009;
        int var8 = this.field1012 * var7 >> 12;
        return var8 > arg0 + arg1 && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static final void method353(int arg0) {
        if (arg0 != 1) {
            method353(-43);
        }
        Object var1 = class224.field3898;
        synchronized (class224.field3898) {
            if (class237.field4412 != 0) {
                class237.field4412 = 1;
                try {
                    class224.field3898.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        ++field1020;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field1017;
        if (arg0 != 107) {
            this.method349(56, 121, 49);
        }
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class202.field3603; ++var5) {
                int var6 = class195.field3477[var5] + -2048;
                int var7 = this.field1022 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field1015 + var6;
                int var10 = var8 <= 2048 ? var8 : var8 + -4096;
                int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                int var12 = this.field1004 + var4;
                int var13 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var14 = var4 - -this.field1021;
                int var15 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var16 = ~var12 <= 2047 ? var12 : var12 + 4096;
                int var17 = var16 > 2048 ? var16 + -4096 : var16;
                int var18 = var15 > 2048 ? var15 + -4096 : var15;
                var3[var5] = !this.method352(var17, var13, -10769) && !this.method349(var18, var10, 11984) ? 0 : 4096;
            }
        }
        return var3;
    }
}
