import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 extends class75 {

    @OriginalMember(owner = "client!dl", name = "ub", descriptor = "Lha;")
    public static class46 field727 = class271.method1828("", -46);

    @OriginalMember(owner = "client!dl", name = "qb", descriptor = "[I")
    public static int[] field723 = new int[100];

    @OriginalMember(owner = "client!dl", name = "Ab", descriptor = "I")
    public static int field733 = 0;

    @OriginalMember(owner = "client!dl", name = "rb", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!dl", name = "tb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dl", name = "vb", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dl", name = "wb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dl", name = "xb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dl", name = "yb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dl", name = "zb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!dl", name = "Bb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!dl", name = "Cb", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!dl", name = "Db", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dl", name = "Eb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dl", name = "Fb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dl", name = "Gb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!dl", name = "Hb", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!dl", name = "Ib", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!dl", name = "sb", descriptor = "Loe;")
    private class50 field725;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZIII)V")
    public static final void method282(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field733 = -120;
        }
        if (~class135.field2445 >= ~arg4 && arg4 <= class73.field1309) {
            int var5 = class15.method77(arg0, class4.field70, class70.field1205, -84);
            int var6 = class15.method77(arg2, class4.field70, class70.field1205, -74);
            class102.method774(arg3, arg4, var6, 1, var5);
        }
        ++field741;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(BI)I")
    public final int method283(byte arg0, int arg1) {
        if (arg0 != 0) {
            field727 = null;
        }
        ++field738;
        int var3 = 8 - (7 & this.field735);
        int var4 = this.field735 >> 3;
        int var5 = 0;
        this.field735 += arg1;
        while (var3 < arg1) {
            var5 += (class199.field3568[var3] & super.field1368[var4++]) << arg1 - var3;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg1 != var3) {
            var6 = (super.field1368[var4] >> var3 - arg1 & class199.field3568[arg1]) + var5;
        } else {
            var6 = (super.field1368[var4] & class199.field3568[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[I)V")
    public final void method284(int arg0, int[] arg1) {
        ++field728;
        this.field725 = new class50(arg1);
        if (arg0 <= 90) {
            this.method283((byte) 67, -43);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
    public class43(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(BI)V")
    public final void method285(byte arg0, int arg1) {
        ++field737;
        if (arg0 != -90) {
            field723 = null;
        }
        super.field1368[super.field1380++] = (byte) (arg1 + this.field725.method375(14));
    }

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "(B)I")
    public final int method286(byte arg0) {
        int var2 = -16 % ((arg0 - -60) / 56);
        ++field739;
        return super.field1368[super.field1380++] + -this.field725.method375(42) & 255;
    }

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.field735 = super.field1380 * arg0;
        ++field732;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([Lha;[SI)V")
    public static final void method288(class46[] arg0, short[] arg1, int arg2) {
        ++field734;
        class60.method402(arg0, arg1, (byte) -86, 0, arg0.length - 1);
        if (arg2 != -2) {
            field723 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "(I)V")
    public final void method289(int arg0) {
        if (arg0 <= -77) {
            super.field1380 = (this.field735 + 7) / 8;
            ++field726;
        }
    }

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "(II)Z")
    public static final boolean method290(int arg0, int arg1) {
        ++field736;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class215.field3807[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            if (arg0 != 8) {
                field724 = 31;
            }
            return var2 == 1005;
        }
    }

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "(I)V")
    public static final void method291(int arg0) {
        ++field729;
        class147.field2651.method287(8);
        int var1 = class147.field2651.method283((byte) 0, 8);
        if (arg0 != 7) {
            field723 = null;
        }
        if (var1 < class51.field888) {
            for (int var2 = var1; class51.field888 > var2; ++var2) {
                class60.field1012[class175.field3149++] = class33.field612[var2];
            }
        }
        if (~var1 < ~class51.field888) {
            throw new RuntimeException("gnpov1");
        } else {
            class51.field888 = 0;
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class33.field612[var3];
                class26 var5 = class2.field29[var4];
                int var6 = class147.field2651.method283((byte) 0, 1);
                if (var6 == 0) {
                    class33.field612[class51.field888++] = var4;
                    var5.field2557 = class157.field2803;
                } else {
                    int var7 = class147.field2651.method283((byte) 0, 2);
                    if (var7 == 0) {
                        class33.field612[class51.field888++] = var4;
                        var5.field2557 = class157.field2803;
                        class93.field1758[class111.field2082++] = var4;
                    } else if (~var7 == -2) {
                        class33.field612[class51.field888++] = var4;
                        var5.field2557 = class157.field2803;
                        int var8 = class147.field2651.method283((byte) 0, 3);
                        var5.method1062(false, false, var8);
                        int var9 = class147.field2651.method283((byte) 0, 1);
                        if (var9 == 1) {
                            class93.field1758[class111.field2082++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class33.field612[class51.field888++] = var4;
                        var5.field2557 = class157.field2803;
                        int var10 = class147.field2651.method283((byte) 0, 3);
                        var5.method1062(true, false, var10);
                        int var11 = class147.field2651.method283((byte) 0, 3);
                        var5.method1062(true, false, var11);
                        int var12 = class147.field2651.method283((byte) 0, 1);
                        if (~var12 == -2) {
                            class93.field1758[class111.field2082++] = var4;
                        }
                    } else if (var7 == 3) {
                        class60.field1012[class175.field3149++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "(B)V")
    public static void method292(byte arg0) {
        if (arg0 > 83) {
            field727 = null;
            field723 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II[BI)V")
    public final void method293(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            arg2[arg3 + var5] = (byte) (super.field1368[super.field1380++] + -this.field725.method375(90));
        }
        ++field731;
        int var6 = -77 / ((60 - arg0) / 34);
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(BI)I")
    public final int method294(byte arg0, int arg1) {
        if (arg0 < 116) {
            return 49;
        } else {
            ++field730;
            return arg1 * 8 + -this.field735;
        }
    }
}
