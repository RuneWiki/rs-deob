import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class53 extends class117 {

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    private int field879 = 4096;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    private int field888 = 0;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "B")
    public static byte field883 = 0;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "Ljava/lang/String;")
    public static String field891 = "Loading textures - ";

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Loa;")
    public static class101 field887 = new class101(64);

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field898 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field897 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "Lqd;")
    public static class173 field896 = new class173(30);

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
    public static final void method365(int arg0) {
        ++field894;
        if (arg0 >= -31) {
            method367(-57, 67);
        }
        class49.field817 = null;
        class136.method955(0, class22.field284, 0, -1, 0, 0, true, class294.field4709, class310.field4964);
        if (class49.field817 != null) {
            class227.method1541(class294.field4709, class310.field4964, class49.field817, class277.field4446.field3406, 29, -1412584499, class162.field2584, 0, 0, class46.field766);
            class49.field817 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)I")
    public static final int method366(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 3;
        if (arg2 < 88) {
            return -125;
        } else {
            ++field884;
            if (var4 == 0) {
                return arg3;
            } else if (var4 == 1) {
                return 7 - arg1;
            } else {
                return ~var4 == -3 ? -arg3 + 7 : arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field889;
        int[] var3 = super.field1883.method531(arg1, (byte) 127);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(arg0 ^ 2, 0, arg1);
            for (int var5 = 0; class168.field2737 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field888 && ~this.field879 <= ~var6 ? 4096 : 0;
            }
        }
        return arg0 != 2 ? null : var3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
    public static final void method367(int arg0, int arg1) {
        class212.field3508.method1262(arg1, arg0 + 2736);
        ++field880;
        if (arg0 != 0) {
            method372(123);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIILaa;)V")
    public static final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class43 arg6) {
        if (arg1 > -24) {
            field898 = null;
        }
        class207.method1449(arg0, 13056, arg5, arg3, arg6.field710, 0, arg4, arg2, arg6.field637);
        ++field885;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLdk;Ldk;)V")
    public static final void method369(boolean arg0, class251 arg1, class251 arg2) {
        class109.field1739 = arg1;
        ++field892;
        class22.field274 = arg2;
        class198.field3187 = class22.field274.method1678((byte) 51, 3);
        if (arg0) {
            method368(116, -81, 33, -83, 104, -128, (class43) null);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field879 = arg0.method1142(-18970);
            }
        } else {
            this.field888 = arg0.method1142(arg1 + -19225);
        }
        ++field882;
        if (arg1 != 255) {
            this.method44((class162) null, 115, -22);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
    public static final void method370(int arg0, int arg1) {
        if (arg0 != 1) {
            method368(56, -53, 117, 106, 61, 84, (class43) null);
        }
        ++field886;
        if (arg1 != -1) {
            if (class251.field3983[arg1]) {
                class126.field1988.method1676(arg1, (byte) -60);
                if (class34.field519[arg1] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~class34.field519[arg1].length < ~var3; ++var3) {
                        if (class34.field519[arg1][var3] != null) {
                            if (~class34.field519[arg1][var3].field3385 == -3) {
                                var2 = false;
                            } else {
                                class34.field519[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class34.field519[arg1] = null;
                    }
                    class251.field3983[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILdk;)V")
    public static final void method371(int arg0, class251 arg1) {
        class163.field2634 = arg1.method1699(0, "runes");
        ++field893;
        if (arg0 < 20) {
            method372(72);
        }
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)V")
    public static void method372(int arg0) {
        if (arg0 == 22118) {
            field891 = null;
            field896 = null;
            field887 = null;
            field898 = null;
            field897 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZIII)V")
    public static final void method373(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field881;
        class185.method1329(false, false);
        class5.field52 = arg2;
        class98.field1567 = arg0;
        if (arg4 != 7) {
            method373(28, true, -23, -122, 14);
        }
        class144.field2271 = arg1;
        class275.method1853(arg3);
        class48.field802 = new class155(8);
        class240.field3835 = new class155(8);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, true);
    }
}
