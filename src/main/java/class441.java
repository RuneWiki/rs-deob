import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class441 extends class509 {

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "F")
    private float field6448 = 0.0F;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Lui;")
    private class588 field6447;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "Lqu;")
    public static class364 field6451 = new class364(17, -1);

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "Lrb;")
    public static class352 field6454 = new class352(8, 0, 4, 1);

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V", line = 10)
    public static void method2688(int arg0) {
        if (arg0 == 0) {
            field6451 = null;
            field6454 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V", line = 21)
    public static final void method2689(int arg0) {
        class636.field9264.method2345(4);
        ++field6444;
        class264.field3924.method17(0);
        class42.field507.method65(false);
        class312.field4690.method2008((byte) -117);
        class369.field5329.method1788(50);
        class216.field3204.method3358(27740);
        class470.field7205.method3503(-14292);
        class138.field1821.method2254(255);
        class23.field200.method2979(-66);
        class239.field3501.method3653(true);
        class345.field5023.method523(114);
        class402.field5766.method1714((byte) -43);
        class540.field8011.method1216((byte) 12);
        class247.field3618.method2894(114);
        class8.field74.method3291(64);
        class28.field255.method2312((byte) -117);
        class458.field6652.method3718(30907);
        class191.field2897.method2915(79);
        class271.field4008.method1354((byte) -38);
        class77.field888.method3199(1003);
        class537.method3157(-85);
        class89.method522((byte) -115);
        class480.method2912(1);
        if (arg0 >= -105) {
            method2689(89);
        }
        class143.method857((byte) 42);
        class606.field8927.method2024((byte) -126);
        class296.field4337.method2024((byte) -116);
        class120.field1560.method2024((byte) -101);
        class605.field8916.method2024((byte) -108);
        class330.field4901.method2024((byte) -103);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V", line = 61)
    public final void method38(byte arg0) {
        super.field7558.method1159(1, false);
        ++field6449;
        super.field7558.method1102(class609.field8962, class609.field8962, -77);
        if (arg0 != 59) {
            this.field6447 = null;
        }
        super.field7558.method1160(0, (byte) -113, class248.field3625);
        super.field7558.method1097(-14186, class248.field3625, 0);
        super.field7558.method348(1, true);
        super.field7558.method1152((class60) null, true);
        super.field7558.method1159(0, false);
        super.field7558.method1097(-14186, class248.field3625, 0);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z", line = 79)
    public final boolean method40(int arg0) {
        ++field6453;
        return arg0 <= 44 ? true : this.field6447.method3432(true);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V", line = 90)
    public final void method35(boolean arg0, byte arg1) {
        ++field6442;
        int var3 = 40 / ((arg1 - 40) / 36);
        super.field7558.method1159(1, false);
        super.field7558.method1102(class308.field4477, class43.field527, -121);
        super.field7558.method319(class248.field3625, 0, false, 0, true);
        super.field7558.method1097(-14186, class352.field5118, 0);
        super.field7558.method348(0, true);
        super.field7558.method1159(0, false);
        super.field7558.method1168(-16777216, (byte) -126);
        super.field7558.method1097(-14186, class455.field6635, 0);
        this.method381((byte) -48);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V", line = 109)
    public final void method39(int arg0, boolean arg1) {
        ++field6443;
        if (arg0 != 0) {
            this.field6448 = -2.0054002F;
        }
        super.field7558.method1102(class609.field8962, class43.field527, arg0 + 127);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)V", line = 121)
    public final void method43(int arg0, byte arg1, int arg2) {
        super.field7558.method1159(1, false);
        if (arg1 != -60) {
            this.field6447 = null;
        }
        ++field6450;
        if ((arg2 & 128) != 0) {
            super.field7558.method1152((class60) null, true);
        } else if ((1 & arg0) != 1) {
            if (!this.field6447.field8722) {
                super.field7558.method1152(this.field6447.field8728[0], true);
            } else {
                super.field7558.method1152(this.field6447.field8721, true);
            }
        } else if (this.field6447.field8722) {
            this.field6448 = (float) (super.field7558.field2599 % 4000) / 4000.0F;
            super.field7558.method1152(this.field6447.field8721, true);
        } else {
            int var4 = super.field7558.field2599 % 4000 * 16 / 4000;
            super.field7558.method1152(this.field6447.field8728[var4], true);
        }
        super.field7558.method1159(0, false);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZILmn;)V", line = 166)
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        ++field6446;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V", line = 174)
    public static final void method2690(byte arg0, int arg1) {
        if (arg0 > -98) {
            method2689(-69);
        }
        for (class496 var2 = class125.field1642.method1331(-1925); var2 != null; var2 = class125.field1642.method1340((byte) -96)) {
            if ((long) arg1 == (65535L & var2.field7465 >> 48)) {
                var2.method2997(1);
            }
        }
        ++field6452;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 195)
    public final void method381(byte arg0) {
        if (arg0 == -48) {
            if (~super.field7558.method1149(83) == -1) {
                class124 var2 = super.field7558.method1113(arg0 ^ -76);
                super.field7558.method1159(1, false);
                class124 var3 = super.field7558.method1122((byte) 65);
                var3.method618(var2);
                var3.method751(0.125F, true, 1.0F, 0.125F);
                var3.method759(0.0F, 0.0F, arg0 + -31237, this.field6448);
                super.field7558.method1100(class648.field9396, -1);
                super.field7558.method1159(0, false);
            }
            ++field6445;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lkw;Lui;)V", line = 229)
    public class441(class174 arg0, class588 arg1) {
        super(arg0);
        this.field6447 = arg1;
    }
}
