import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class99 {

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public int field702 = -1;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    private int field708 = 0;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field695 = 0;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[S")
    private short[] field701 = new short[6];

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
    private int field719 = 0;

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
    private int field723 = 128;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    private int field724 = 128;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "[S")
    private short[] field700 = new short[6];

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "Laf;")
    public static class7 field710 = class48.method406(40, "<img=1>");

    @OriginalMember(owner = "client!de", name = "X", descriptor = "Laf;")
    public static class7 field698 = class48.method406(40, "Benutzen");

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "Laf;")
    private static class7 field718 = class48.method406(40, "cyan:");

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "I")
    public static int field720 = 127;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "Laf;")
    public static class7 field703 = field718;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "Laf;")
    public static class7 field713 = class48.method406(40, "hel");

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "Laf;")
    private static class7 field716 = class48.method406(40, "Members object");

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "Laf;")
    public static class7 field712 = field718;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Laf;")
    public static class7 field704 = field716;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "Lkb;")
    public static class71 field699;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "Z")
    public static boolean field717;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "[I")
    public static int[] field697;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Leb;")
    public final class31 method241(int arg0, int arg1) {
        int var3 = 3 % ((arg0 - 59) / 34);
        field709++;
        class31 var4 = (class31) class52.field1248.method395(126, (long) this.field714);
        if (var4 == null) {
            class15 var5 = class15.method152(class155.field3598, this.field693, 0);
            if (var5 == null) {
                return null;
            }
            for (int var6 = 0; var6 < 6; var6++) {
                if (this.field700[0] != 0) {
                    var5.method142(this.field700[var6], this.field701[var6]);
                }
            }
            var4 = var5.method151(this.field708 + 64, this.field719 + 850, -30, -50, -30);
            class52.field1248.method388(var4, (long) this.field714, 2047);
        }
        class31 var7;
        if (this.field702 == -1 || arg1 == -1) {
            var7 = var4.method268(true);
        } else {
            var7 = class87.method710(this.field702, 6491).method753(arg1, 5896, var4);
        }
        if (this.field723 != 128 || this.field724 != 128) {
            var7.method263(this.field723, this.field724, this.field723);
        }
        if (this.field695 != 0) {
            if (this.field695 == 90) {
                var7.method260();
            }
            if (this.field695 == 180) {
                var7.method260();
                var7.method260();
            }
            if (this.field695 == 270) {
                var7.method260();
                var7.method260();
                var7.method260();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
    public static final void method242(byte arg0) {
        field706++;
        class58.field1381.method391((byte) -73);
        int var1 = 127 / ((-arg0 - 15) / 42);
        class30.field766.method391((byte) -73);
        class143.field3380.method391((byte) -73);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIB)I")
    public static final int method243(int arg0, int arg1, byte arg2) {
        field722++;
        if (arg2 == -50) {
            long var3 = (long) ((arg0 << 16) + arg1);
            return class54.field1323 != null && class54.field1323.field3261 == var3 ? class116.field2772.field2903 * 99 / (class116.field2772.field2895.length - class54.field1323.field2663) + 1 : 0;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
    public static final int method244(int arg0, int arg1, int arg2) {
        int var3 = 6 % ((arg1 - 18) / 37);
        field721++;
        class2 var4 = (class2) class68.field1479.method126((long) arg0, (byte) -107);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field18.length) {
            return var4.field18[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lrd;II)V")
    private final void method245(class122 arg0, int arg1, int arg2) {
        if (arg1 <= 59) {
            this.method245(null, 103, -120);
        }
        field696++;
        if (arg2 == 1) {
            this.field693 = arg0.method965(false);
        } else if (arg2 == 2) {
            this.field702 = arg0.method965(false);
        } else if (arg2 == 4) {
            this.field723 = arg0.method965(false);
        } else if (arg2 == 5) {
            this.field724 = arg0.method965(false);
        } else if (arg2 == 6) {
            this.field695 = arg0.method965(false);
        } else if (arg2 == 7) {
            this.field708 = arg0.method931((byte) 124);
        } else if (arg2 == 8) {
            this.field719 = arg0.method931((byte) 124);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field700[arg2 - 40] = (short) arg0.method965(false);
            return;
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field701[arg2 - 50] = (short) arg0.method965(false);
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
    public static final void method246(int arg0, int arg1) {
        field715++;
        if (!class9.method106(arg1, (byte) 99)) {
            return;
        }
        class103[] var2 = class52.field1251[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (var4 != null) {
                var4.field2477 = 0;
                var4.field2459 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method247(int arg0) {
        field716 = null;
        field713 = null;
        if (arg0 != 850) {
            method244(-58, -29, -124);
        }
        field703 = null;
        field718 = null;
        field710 = null;
        field698 = null;
        field697 = null;
        field704 = null;
        field699 = null;
        field712 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lrd;I)V")
    public final void method248(class122 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method931((byte) 124);
            if (var3 == 0) {
                if (arg1 >= -110) {
                    method242((byte) 26);
                }
                field694++;
                return;
            }
            this.method245(arg0, 122, var3);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLkb;Laf;Laf;)[Lfd;")
    public static final class40[] method249(byte arg0, class71 arg1, class7 arg2, class7 arg3) {
        if (arg0 == -86) {
            field692++;
            int var4 = arg1.method586(arg2, -4795);
            int var5 = arg1.method560(arg3, var4, arg0 + 5);
            return class148.method1191(var5, arg0 ^ 0xFFFFFFEA, var4, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkb;Lkb;Lkb;B)V")
    public static final void method250(class71 arg0, class71 arg1, class71 arg2, byte arg3) {
        class144.field3407 = arg0;
        field707++;
        if (arg3 != -88) {
            method244(98, 72, -18);
        }
        class108.field2640 = arg2;
        class24.field657 = arg1;
        class52.field1251 = new class103[class144.field3407.method582(true)][];
        class101.field2389 = new boolean[class144.field3407.method582(true)];
    }
}
