import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class50 extends class208 {

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lve;")
    public class255 field751;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Lve;")
    private static class255 field749 = class87.method607(62, "Loaded config");

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lve;")
    public static class255 field748 = field749;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field755 = -1;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lve;")
    public static class255 field757 = class87.method607(120, "Texturen geladen)3");

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lrg;")
    public static class88 field747;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[I")
    public static int[] field752;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[I")
    public static int[] field756;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)Z", line = 11)
    public static final boolean method293(int arg0, byte arg1) {
        field754++;
        if (arg1 != 120) {
            field748 = (class255) null;
        }
        return (arg0 & 0x52EA67) >> 22 != 0;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 27)
    public static void method294(int arg0) {
        field749 = null;
        field752 = null;
        field756 = null;
        if (arg0 != 1) {
            method296(true);
        }
        field747 = null;
        field757 = null;
        field748 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)Ldd;", line = 56)
    public static final class238 method295(int arg0) {
        field753++;
        class116.field1972 = arg0;
        return class97.method766(4);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 72)
    public class50() {
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lve;)V", line = 75)
    public class50(class255 arg0) {
        this.field751 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 92)
    public static final void method296(boolean arg0) {
        if (!class156.field2651) {
            class136.field2272 = 1;
            class264.field4466[0] = 1007;
            class203.field3509[0] = class84.field1349;
            class44.field684[0] = class49.field728;
            if (class166.field2795 != 0) {
                class251.field4239 = class9.field126;
                class197.field3306 = class196.field3236;
            } else if (class119.field1994 == 0) {
                class197.field3306 = class67.field994;
                class251.field4239 = class2.field31;
            } else {
                class197.field3306 = class115.field1953;
                class251.field4239 = class184.field2973;
            }
        }
        field750++;
        if (arg0) {
            return;
        }
        if (class264.field4459 != -1) {
            class205.method1489(class264.field4459, (byte) 123);
        }
        for (int var1 = 0; var1 < class279.field4784; var1++) {
            if (class187.field3008[var1]) {
                class236.field3931[var1] = true;
            }
            class4.field62[var1] = class187.field3008[var1];
            class187.field3008[var1] = false;
        }
        class102.field1713 = null;
        class239.field3984 = -1;
        class6.field95 = class277.field4768;
        class276.field4740 = -1;
        if (class281.field4827) {
            class141.field2340 = true;
        }
        if (class264.field4459 != -1) {
            class279.field4784 = 0;
            class16.method77(0, class201.field3479, 0, (byte) 127, -1, class264.field4459, class210.field3589, 0, 0);
        }
        if (class281.field4827) {
            class126.method927();
        } else {
            class175.method1252();
        }
        class63.method385(-59);
        if (class156.field2651) {
            class264.method1839((byte) -98);
        } else if (class239.field3984 != -1) {
            class314.method2170(class239.field3984, class276.field4740, 104);
        }
        if (class239.field3995 == 3) {
            for (int var2 = 0; var2 < class279.field4784; var2++) {
                if (class4.field62[var2]) {
                    if (class281.field4827) {
                        class126.method932(class247.field4147[var2], class271.field4679[var2], class49.field745[var2], class10.field146[var2], 16711935, 128);
                    } else {
                        class175.method1241(class247.field4147[var2], class271.field4679[var2], class49.field745[var2], class10.field146[var2], 16711935, 128);
                    }
                } else if (class236.field3931[var2]) {
                    if (class281.field4827) {
                        class126.method932(class247.field4147[var2], class271.field4679[var2], class49.field745[var2], class10.field146[var2], 16711680, 128);
                    } else {
                        class175.method1241(class247.field4147[var2], class271.field4679[var2], class49.field745[var2], class10.field146[var2], 16711680, 128);
                    }
                }
            }
        }
        class79.method549(class276.field4742.field5173, class122.field2036, client.field4039, class276.field4742.field5130, true);
        class122.field2036 = 0;
    }
}
