import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class268 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field4713 = -1;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    private int field4721 = 0;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Lb;")
    private class48 field4728 = new class48();

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Z")
    public boolean field4729 = false;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field4714;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[[I")
    private int[][] field4717;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[Lib;")
    private class76[] field4718;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Lsg;")
    public static class30 field4730 = class167.method1221((byte) 33, " weitere Optionen");

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "[I")
    public static int[] field4731 = new int[1000];

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lmc;")
    public static class151 field4719;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lbj;")
    public static class44 field4715;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[Lgj;")
    public static class192[] field4720;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public final void method1835(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            this.field4729 = true;
        }
        while (this.field4714 > var2) {
            this.field4717[var2] = null;
            var2++;
        }
        field4722++;
        this.field4718 = null;
        this.field4717 = null;
        this.field4728.method480(70);
        this.field4728 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)[[I")
    public final int[][] method1836(int arg0) {
        field4726++;
        if (this.field4716 != this.field4714) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4714; var2++) {
            this.field4718[var2] = class183.field3356;
        }
        return this.field4717;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        if (arg0 > -15) {
            return;
        }
        field4719 = null;
        field4720 = null;
        field4731 = null;
        field4715 = null;
        field4730 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILsg;Lsg;)V")
    public static final void method1838(int arg0, int arg1, class30 arg2, class30 arg3) {
        class52.method515(arg3, arg1, false, (class30) null, arg2, arg0);
        field4725++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ldl;III)V")
    public static final void method1839(class31 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field720 == 0) {
            arg0.field755 = arg0.field804;
        } else if (arg0.field720 == 1) {
            arg0.field755 = (arg2 - arg0.field728) / 2 + arg0.field804;
        } else if (arg0.field720 == 2) {
            arg0.field755 = arg2 - arg0.field728 - arg0.field804;
        } else if (arg0.field720 == 3) {
            arg0.field755 = arg0.field804 * arg2 >> 14;
        } else if (arg0.field720 == 4) {
            arg0.field755 = (arg2 - arg0.field728) / 2 + (arg0.field804 * arg2 >> 14);
        } else {
            arg0.field755 = arg2 - (arg0.field804 * arg2 >> 14) - arg0.field728;
        }
        if (arg3 != -2398) {
            field4715 = null;
        }
        if (arg0.field689 == 0) {
            arg0.field665 = arg0.field749;
        } else if (arg0.field689 == 1) {
            arg0.field665 = (arg1 - arg0.field670) / 2 + arg0.field749;
        } else if (arg0.field689 == 2) {
            arg0.field665 = arg1 - arg0.field749 - arg0.field670;
        } else if (arg0.field689 == 3) {
            arg0.field665 = arg0.field749 * arg1 >> 14;
        } else if (arg0.field689 == 4) {
            arg0.field665 = (arg1 - arg0.field670) / 2 + (arg0.field749 * arg1 >> 14);
        } else {
            arg0.field665 = arg1 - arg0.field670 - (arg0.field749 * arg1 >> 14);
        }
        field4712++;
        if (!class96.field1959 || client.method1498(arg0) == 0 && arg0.field655 != 0) {
            return;
        }
        if (arg0.field755 < 0) {
            arg0.field755 = 0;
        } else if ((arg0.field755 + arg0.field728) > arg2) {
            arg0.field755 = arg2 - arg0.field728;
        }
        if (arg0.field665 < 0) {
            arg0.field665 = 0;
        } else if ((arg0.field670 + arg0.field665) > arg1) {
            arg0.field665 = arg1 - arg0.field670;
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lmc;Z)V")
    public static final void method1840(class151 arg0, boolean arg1) {
        field4724++;
        if (class160.field3017) {
            return;
        }
        class188.method1353();
        class172.field3218 = class219.method1589(arg0, class210.field3766, (byte) -16);
        int var2 = class238.field4238;
        int var3 = var2 * 956 / 503;
        class172.field3218.method449((class15.field324 - var3) / 2, 0, var3, var2);
        class75.field1669 = class15.method158(arg0, class30.field603, arg1);
        class75.field1669.method1387(class15.field324 / 2 - (class75.field1669.field4679 / 2), 18);
        class160.field3017 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method1841(int arg0, int arg1) {
        field4727++;
        if (arg0 != 18) {
            this.method1836(-4);
        }
        if (this.field4716 == this.field4714) {
            this.field4729 = this.field4718[arg1] == null;
            this.field4718[arg1] = class183.field3356;
            return this.field4717[arg1];
        } else if (this.field4714 == 1) {
            this.field4729 = this.field4713 != arg1;
            this.field4713 = arg1;
            return this.field4717[0];
        } else {
            class76 var3 = this.field4718[arg1];
            if (var3 == null) {
                this.field4729 = true;
                if (this.field4714 > this.field4721) {
                    var3 = new class76(arg1, this.field4721);
                    this.field4721++;
                } else {
                    class76 var4 = (class76) this.field4728.method472((byte) 123);
                    var3 = new class76(arg1, var4.field1672);
                    this.field4718[var4.field1673] = null;
                    var4.method1681(false);
                }
                this.field4718[arg1] = var3;
            } else {
                this.field4729 = false;
            }
            this.field4728.method475(var3, true);
            return this.field4717[var3.field1672];
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public static final void method1842(int arg0, int arg1) {
        class146.field2802.method1642(arg0, 89);
        class3.field47.method1642(arg0, 117);
        if (arg1 != 2) {
            field4731 = null;
        }
        field4723++;
        class14.field303.method1642(arg0, arg1 ^ 0x5B);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(III)V")
    public class268(int arg0, int arg1, int arg2) {
        this.field4714 = arg0;
        this.field4717 = new int[this.field4714][arg2];
        this.field4716 = arg1;
        this.field4718 = new class76[this.field4716];
    }
}
