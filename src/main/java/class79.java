import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class79 extends class598 implements class269 {

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Lgn;")
    public class598 field921;

    @OriginalMember(owner = "client!ps", name = "X", descriptor = "Ljava/lang/String;")
    public static String field941 = null;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!ps", name = "S", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ps", name = "T", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ps", name = "U", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ps", name = "V", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ps", name = "W", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            this.method339((byte) 125);
        }
        field933++;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILdn;)V", line = 14)
    public static final void method457(int arg0, class438 arg1) {
        field924++;
        class478.field6708 = arg1.method2579(-1, "p11_full");
        class99.field1236 = arg1.method2579(arg0 ^ 0x496, "p12_full");
        class205.field2463 = arg1.method2579(arg0 + 1174, "b12_full");
        class70.field679 = arg1.method2579(-1, "hitmarks");
        class598.field8665 = arg1.method2579(-1, "hitbar_default");
        class371.field4886 = arg1.method2579(arg0 ^ 0x496, "timerbar_default");
        class11.field87 = arg1.method2579(-1, "headicons_pk");
        class389.field5146 = arg1.method2579(-1, "headicons_prayer");
        if (arg0 != -1175) {
            method458(-30, (byte) -108);
        }
        class155.field1892 = arg1.method2579(arg0 ^ 0x496, "hint_headicons");
        class351.field4526 = arg1.method2579(-1, "hint_mapmarkers");
        class51.field434 = arg1.method2579(-1, "mapflag");
        class195.field2364 = arg1.method2579(-1, "cross");
        class543.field7959 = arg1.method2579(-1, "mapdots");
        class191.field2303 = arg1.method2579(-1, "scrollbar");
        class434.field5893 = arg1.method2579(-1, "name_icons");
        class116.field1457 = arg1.method2579(-1, "floorshadows");
        class470.field6586 = arg1.method2579(-1, "compass");
        class613.field8889 = arg1.method2579(-1, "otherlevel");
        class236.field2893 = arg1.method2579(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I", line = 43)
    public final int method342(int arg0) {
        if (arg0 == -2329) {
            field922++;
            return 0;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLoe;ILqa;III)V", line = 57)
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        field940++;
        if (arg5 != 13915) {
            this.method332(47);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILqa;Z)Lr;", line = 69)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (arg2) {
            field934++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(ILqa;)Loj;", line = 80)
    public final class318 method320(int arg0, class206 arg1) {
        field930++;
        return arg0 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V", line = 93)
    public final void method339(byte arg0) {
        field938++;
        if (arg0 >= -114) {
            this.method337(false);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I", line = 105)
    public final int method333(byte arg0) {
        field935++;
        return arg0 == 70 ? 0 : 61;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lqa;Z)V", line = 116)
    public final void method341(class206 arg0, boolean arg1) {
        field939++;
        if (arg1) {
            method457(27, null);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)V", line = 126)
    public final void method314(byte arg0) {
        if (arg0 >= 23) {
            field936++;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Z", line = 137)
    public final boolean method332(int arg0) {
        int var2 = 6 / ((1 - arg0) / 49);
        field926++;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(ILqa;)Lso;", line = 147)
    public final class398 method328(int arg0, class206 arg1) {
        if (arg0 == 12) {
            field931++;
            return this.field921.method328(12, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)I", line = 158)
    public final int method337(boolean arg0) {
        field937++;
        if (!arg0) {
            this.method312(true, null, 62, null, 39, -34, -21);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIIIIIILgn;)V", line = 169)
    public class79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class598 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class82.method484(arg1, arg0, 94));
        this.field921 = arg10;
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)I", line = 179)
    public final int method322(int arg0) {
        if (arg0 == 64) {
            field925++;
            return 0;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILqa;)V", line = 190)
    public final void method326(int arg0, class206 arg1) {
        field932++;
        if (arg0 != 29657) {
            field923 = 115;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V", line = 201)
    public static final void method458(int arg0, byte arg1) {
        class62.field619 = -1;
        if (arg0 == 37) {
            class353.field4605 = 3.0F;
        } else if (arg0 == 50) {
            class353.field4605 = 4.0F;
        } else if (arg0 == 75) {
            class353.field4605 = 6.0F;
        } else if (arg0 == 100) {
            class353.field4605 = 8.0F;
        } else if (arg0 == 200) {
            class353.field4605 = 16.0F;
        }
        if (arg1 > -83) {
            method459((byte) -6);
        }
        field927++;
        class62.field619 = -1;
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(B)V", line = 234)
    public static void method459(byte arg0) {
        field941 = null;
        if (arg0 >= -11) {
            field941 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILqa;II)Z", line = 245)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 != -21851) {
            this.method312(false, null, 65, null, -26, -44, 121);
        }
        field928++;
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLqa;)V", line = 258)
    public final void method336(boolean arg0, class206 arg1) {
        field920++;
        if (arg0) {
            this.field921 = null;
        }
    }
}
