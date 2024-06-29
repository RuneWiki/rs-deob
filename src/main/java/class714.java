import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class714 extends class475 implements class399 {

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field9969;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)J")
    public final long method2488(int arg0) {
        if (arg0 != -6566) {
            this.method2894(true);
        }
        ++field9967;
        return 0L;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lsba;I)V")
    public static final void method4011(class558 arg0, int arg1) {
        ++field9963;
        if (arg0 != null) {
            class290.field4161.method3610(9289, arg0);
            if (arg1 == 20132) {
                ++class284.field4103;
                Object var2 = null;
                class272 var5;
                if (!arg0.field7751 && !"".equals(arg0.field7759)) {
                    long var3 = arg0.field7758;
                    for (var5 = (class272) class560.field7789.method812(102, var3); var5 != null && !var5.field3946.equals(arg0.field7759); var5 = (class272) class560.field7789.method815((byte) 85)) {
                    }
                    if (var5 == null) {
                        var5 = (class272) class522.field7265.method3898((byte) -42, var3);
                        if (var5 != null && !var5.field3946.equals(arg0.field7759)) {
                            var5 = null;
                        }
                        if (var5 == null) {
                            var5 = new class272(arg0.field7759);
                        }
                        class560.field7789.method820(var3, (byte) -42, var5);
                        ++class569.field7865;
                    }
                } else {
                    var5 = new class272(arg0.field7759);
                    ++class569.field7865;
                }
                if (var5.method1828(arg0, 0)) {
                    class752.method4178(var5, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method2485(int arg0) {
        if (arg0 != 22162) {
            field9962 = 51;
        }
        ++field9965;
        return super.field6621;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILni;I)V")
    public static final void method4012(int arg0, class515 arg1, int arg2) {
        if (arg2 == 12309) {
            ++field9966;
            int var3 = -1;
            int var4 = 0;
            if (arg1.field7107 > class483.field6741) {
                class688.method3878((byte) -50, arg1);
            } else if (class483.field6741 <= arg1.field7173) {
                class231.method1375(65, arg1);
            } else {
                class145.method944(arg2 + -27945, false, arg1);
                var4 = class657.field8769;
                var3 = class219.field2861;
            }
            if (~arg1.field4410 > -513 || arg1.field4418 < 512 || arg1.field4410 >= class277.field4036 * 512 + -512 || ~arg1.field4418 <= ~(class667.field9202 * 512 + -512)) {
                arg1.field7132 = -1;
                arg1.field7105 = null;
                arg1.field7107 = 0;
                arg1.field7173 = 0;
                var3 = -1;
                var4 = 0;
                arg1.field4410 = arg1.field7197[0] * 512 - -(arg1.method662((byte) 15) * 256);
                arg1.field4418 = arg1.field7198[0] * 512 - -(arg1.method662((byte) 15) * 256);
                arg1.method3082(true);
                for (int var5 = 0; arg1.field7190.length > var5; ++var5) {
                    arg1.field7190[var5].field7339 = -1;
                }
            }
            if (class388.field5601 == arg1 && (~arg1.field4410 > -6145 || ~arg1.field4418 > -6145 || ~(class277.field4036 * 512 + -6144) >= ~arg1.field4410 || ~(class667.field9202 * 512 - 6144) >= ~arg1.field4418)) {
                arg1.field7107 = 0;
                var4 = 0;
                arg1.field7105 = null;
                var3 = -1;
                arg1.field7173 = 0;
                arg1.field7132 = -1;
                arg1.field4410 = arg1.field7197[0] * 512 - -(256 * arg1.method662((byte) 15));
                arg1.field4418 = arg1.field7198[0] * 512 + 256 * arg1.method662((byte) 15);
                arg1.method3082(true);
                for (int var6 = 0; ~arg1.field7190.length < ~var6; ++var6) {
                    arg1.field7190[var6].field7339 = -1;
                }
            }
            int var7 = class119.method746(-19527, arg1);
            class292.method1937(arg1, true);
            class379.method2378((byte) 127, arg1, var4, var3, var7);
            class728.method4062(arg1, var3, (byte) 21);
            class239.method1613((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II[BI)V")
    public final void method2486(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2895(arg2, arg1, 59);
        ++field9968;
        this.field9969 = arg3;
        if (arg0 <= 109) {
            method4012(-4, (class515) null, -114);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
    public final int method2487(int arg0) {
        ++field9964;
        if (arg0 <= 57) {
            method4011((class558) null, 69);
        }
        return this.field9969;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Laea;IZ)V")
    public static final void method4013(class261 arg0, int arg1, boolean arg2) {
        if (arg1 == 512) {
            class221.field2991.method3157(arg0, 256);
            ++field9970;
            if (arg2) {
                class484.method2947(class425.field5962, class648.field8694, class656.field8765, class221.field2991, false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ldw;I[BIZ)V")
    public class714(class664 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9969 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public final void method2894(boolean arg0) {
        ++field9971;
        if (arg0) {
            super.field6615.method3705(this, (byte) -102);
        }
    }
}
