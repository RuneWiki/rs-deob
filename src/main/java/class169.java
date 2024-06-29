import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class169 extends class179 {

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lkh;")
    public class345 field1980;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Lti;")
    public class208 field1976;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
    public static int[] field1983 = new int[13];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 4)
    public static void method1073(int arg0) {
        field1983 = null;
        if (arg0 >= -102) {
            field1983 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V", line = 15)
    public static final void method1074(boolean arg0, int arg1) {
        if (arg0) {
            if (class366.field4983 != -1) {
                class244.method1604(class366.field4983, 2);
            }
            for (class244 var2 = (class244) class282.field3678.method2222(0); var2 != null; var2 = (class244) class282.field3678.method2215(false)) {
                if (!var2.method262((byte) 55)) {
                    var2 = (class244) class282.field3678.method2222(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class277.method1741(true, false, var2, 1);
            }
            class366.field4983 = -1;
            class282.field3678 = new class349(8);
            class276.method1734((byte) 92);
            class366.field4983 = class72.field889;
            class18.method106(false, (byte) 67);
            class11.method53(16026);
            class93.method582(class366.field4983);
        }
        if (arg1 >= -45) {
            return;
        }
        field1978++;
        class141.method904(-121);
        class46.field530 = -1;
        class396.method2451(class72.field891, -1);
        class143.field1684 = new class131();
        class143.field1684.field2480[0] = 52;
        class143.field1684.field1514 = 6656;
        class143.field1684.field1516 = 6656;
        class143.field1684.field2482[0] = 52;
        class80.field979 = 0;
        class287.field3784 = 0;
        if (class320.field4294 == 2) {
            class80.field979 = class152.field1776 << 7;
            class287.field3784 = class387.field5289 << 7;
        } else {
            class307.method1953(false);
        }
        class370.method2328((byte) 69);
        if (class287.field3784 == 0 || class80.field979 == 0) {
            class259.method1637(10, (byte) 79);
        } else {
            class208.method1280(68);
            class259.method1637(28, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 91)
    public static final void method1075(int arg0, int arg1) {
        field1973++;
        if (arg1 != -3) {
            field1983 = null;
        }
        class40.field477 = arg0;
        class365 var2 = class264.field3384;
        synchronized (class264.field3384) {
            class264.field3384.method2298(arg1 + 3);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIII)V", line = 108)
    public static final void method1076(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1974++;
        float var5 = (float) class224.field2833 / (float) class224.field2816;
        int var6 = arg3;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg1 - (arg2 - var7) / 2;
        int var9 = arg4 - (arg3 - var6) / 2;
        class157.field1832 = -1;
        if (arg0 == 96) {
            class419.field5717 = -1;
            class54.field633 = class224.field2816 * var9 / var6;
            class394.field5366 = class224.field2833 - (class224.field2833 * var8 / var7);
            class211.method1291(131072);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lwo;IBI)Lal;", line = 143)
    public static final class195 method1077(class285 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -18) {
            return null;
        }
        field1979++;
        class242 var4 = new class242(arg0.method1794(arg2 ^ 0xFFFFE90A, arg3, arg1));
        class195 var5 = new class195(arg1, var4.method1565(-43), var4.method1565(arg2 - 109), var4.method1576((byte) 123), var4.method1576((byte) 124), var4.method1563(-128) == 1, var4.method1563(-128), var4.method1563(-128));
        int var6 = var4.method1563(-128);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2315.method1696(false, new class406(var4.method1563(-128), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102), var4.method1587((byte) -102)));
        }
        var5.method1213((byte) 13);
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V", line = 174)
    public final void method1078(byte arg0) {
        this.field1975 = this.field1980.field4688;
        field1969++;
        this.field1970 = this.field1980.field4685;
        this.field1971 = this.field1980.field4681;
        if (this.field1980.field4690 != null) {
            this.field1980.field4690.method924(this.field1976.field2526, this.field1976.field2522, this.field1976.field2521, class432.field5907);
        }
        this.field1981 = class432.field5907[2];
        this.field1982 = class432.field5907[0];
        if (arg0 > -113) {
            this.field1971 = -26;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[I)[I", line = 197)
    public static final int[] method1079(int arg0, byte arg1, int[] arg2) {
        field1972++;
        int[] var3 = new int[1152];
        int var4 = 0;
        int var5 = 0;
        int var6 = -120 % ((arg1 + 28) / 56);
        while (var5 < 32) {
            for (int var7 = 0; var7 < 36; var7++) {
                int var8 = arg2[var4];
                if (var8 == 0) {
                    if (var7 > 0 && arg2[var4 - 1] != 0) {
                        var8 = arg0;
                    } else if (var5 > 0 && arg2[var4 - 36] != 0) {
                        var8 = arg0;
                    } else if (var7 < 35 && arg2[var4 + 1] != 0) {
                        var8 = arg0;
                    } else if (var5 < 31 && arg2[var4 + 36] != 0) {
                        var8 = arg0;
                    }
                }
                var3[var4++] = var8;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lkh;Lkq;)V", line = 252)
    public class169(class345 arg0, class69 arg1) {
        this.field1980 = arg0;
        this.field1976 = class104.method619(arg0.field4692, (byte) -126);
        this.method1078((byte) -114);
    }
}
