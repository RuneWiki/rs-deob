import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[Z")
    public static boolean[] field1719 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Laf;")
    public static class7 field1722 = class48.method406(40, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Laf;")
    private static class7 field1725 = class48.method406(40, " more options");

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Laf;")
    public static class7 field1727 = field1725;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lgd;")
    public static class46 field1724 = new class46(260);

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[[B")
    public static byte[][] field1728 = new byte[250][];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Loc;")
    public static class100 field1717;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lva;")
    public static class145 field1720;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method633(byte arg0) {
        if (arg0 > -57) {
            method633((byte) -127);
        }
        class143.field3380.method391((byte) -73);
        field1712++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BII)I")
    public static final int method634(byte arg0, int arg1, int arg2) {
        field1713++;
        if (arg0 > -94) {
            return -53;
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method635(boolean arg0) {
        field1720 = null;
        field1725 = null;
        field1719 = null;
        if (!arg0) {
            method633((byte) -25);
        }
        field1728 = null;
        field1724 = null;
        field1717 = null;
        field1722 = null;
        field1727 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILkb;)V")
    public static final void method636(int arg0, class71 arg1) {
        class55.field1343 = arg1;
        if (arg0 != -21894) {
            method633((byte) 100);
        }
        class123.field2937 = class55.field1343.method562((byte) -128, 16);
        field1711++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public final int method637(int arg0, int arg1) {
        field1715++;
        int var3 = this.field1714.length - 2;
        if (arg0 != 0) {
            method633((byte) -3);
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field1714[var4];
            if (arg1 == var5) {
                return this.field1714[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([I)V")
    public class74(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1714 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1714[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1714[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1714[var5 + var5] = arg0[var4];
            this.field1714[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILkb;Lkb;)V")
    public static final void method638(int arg0, class71 arg1, class71 arg2) {
        if (arg0 != -534549599) {
            method634((byte) 15, -38, -56);
        }
        field1721++;
        class68.field1480 = arg2;
        class155.field3598 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILrd;BIIII)V")
    public static final void method639(int arg0, int arg1, class122 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -76) {
            return;
        }
        if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
            class25.field670[arg7][arg4][arg6] = 0;
            while (true) {
                int var8 = arg2.method931((byte) 124);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class108.field2636[0][arg4][arg6] = -class20.method192(arg0 + arg4 + 932731, arg5 + arg6 + 556238, class96.method785(arg3, 17)) * 8;
                    } else {
                        class108.field2636[arg7][arg4][arg6] = class108.field2636[arg7 - 1][arg4][arg6] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method931((byte) 124);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class108.field2636[0][arg4][arg6] = -var9 * 8;
                    } else {
                        class108.field2636[arg7][arg4][arg6] = class108.field2636[arg7 - 1][arg4][arg6] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class53.field1278[arg7][arg4][arg6] = arg2.method977(true);
                    class91.field2104[arg7][arg4][arg6] = (byte) ((var8 - 2) / 4);
                    class145.field3422[arg7][arg4][arg6] = (byte) class84.method705(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class25.field670[arg7][arg4][arg6] = (byte) (var8 - 49);
                } else {
                    class108.field2643[arg7][arg4][arg6] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method931((byte) 124);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method931((byte) 124);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method931((byte) 124);
                }
            }
        }
        field1718++;
    }
}
