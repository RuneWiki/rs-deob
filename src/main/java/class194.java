import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class194 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
    public boolean field2740 = false;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lh;")
    private class571 field2742 = new class571(64);

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lh;")
    public class571 field2758 = new class571(500);

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lh;")
    public class571 field2759 = new class571(30);

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Lh;")
    public class571 field2760 = new class571(50);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lan;")
    public class21 field2750;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
    public boolean field2755;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lan;")
    private class21 field2749;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ldv;")
    public static class566 field2753 = new class566(67, 3);

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
    public static boolean field2757 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[Lha;")
    public static class52[] field2752;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Lss;")
    public final class364 method1201(byte arg0, int arg1) {
        field2747++;
        class571 var3 = this.field2742;
        class364 var4;
        synchronized (this.field2742) {
            var4 = (class364) this.field2742.method3252((long) arg1, (byte) 61);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field2749;
        byte[] var6;
        synchronized (this.field2749) {
            var6 = this.field2749.method240(class522.method3012(arg1, true), class457.method2676(-1, arg1), (byte) -124);
            int var7 = -77 % ((arg0 + 24) / 61);
        }
        class364 var8 = new class364();
        var8.field4872 = this;
        var8.field4944 = arg1;
        if (var6 != null) {
            var8.method2186(13, new class11(var6));
        }
        var8.method2177(-1);
        if (var8.field4929) {
            var8.field4946 = false;
            var8.field4893 = 0;
        }
        if (!this.field2755 && var8.field4887) {
            var8.field4905 = null;
            var8.field4937 = null;
        }
        class571 var9 = this.field2742;
        synchronized (this.field2742) {
            this.field2742.method3243(var8, (long) arg1, 122);
            return var8;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public final void method1202(byte arg0) {
        class571 var2 = this.field2742;
        synchronized (this.field2742) {
            this.field2742.method3246(false);
        }
        field2741++;
        class571 var3 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method3246(false);
        }
        class571 var4 = this.field2759;
        synchronized (this.field2759) {
            this.field2759.method3246(false);
        }
        class571 var5 = this.field2760;
        synchronized (this.field2760) {
            this.field2760.method3246(false);
            if (arg0 != 124) {
                field2745 = -120;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lqa;Lra;BZIII)V")
    public static final void method1203(class207 arg0, class91 arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 17) {
            method1203(null, null, (byte) -20, true, 27, -4, 22);
        }
        if (arg3) {
            class175.field2512.method497((class387.field5196 - class175.field2512.method419()) / 2, (class134.field2128 - class175.field2512.method432()) / 2);
            class62.field1079.method497((class387.field5196 - class62.field1079.method419()) / 2, 18);
        }
        field2751++;
        String var7 = "";
        if (class245.field3415 == class163.field2363) {
            var7 = class506.field7054.method739(class173.field2491, arg2 - 98);
        } else if (class37.field767 == class163.field2363) {
            var7 = class117.field1921.method739(class173.field2491, arg2 + 55);
        }
        arg1.method666(class134.field2128 / 2 - 26, arg4, class387.field5196 / 2, -69, var7, -1);
        int var8 = class134.field2128 / 2 - 18;
        arg0.method1325(class387.field5196 / 2 - 152, var8, 304, 34, arg5, 0);
        arg0.method1325(class387.field5196 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg0.method1321(class387.field5196 / 2 - 150, var8 + 2, class6.field79 * 3, 30, arg6, 0);
        arg0.method1321(class387.field5196 / 2 + class6.field79 * 3 - 150, var8 + 2, 300 - (class6.field79 * 3), 30, 0, 0);
        arg1.method666(class134.field2128 / 2 + 4, arg4, class387.field5196 / 2, 66, class342.field4604, -1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method1204(int arg0) {
        class571 var2 = this.field2742;
        synchronized (this.field2742) {
            this.field2742.method3248(0);
        }
        field2744++;
        class571 var3 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method3248(0);
        }
        class571 var4 = this.field2759;
        synchronized (this.field2759) {
            this.field2759.method3248(0);
        }
        class571 var5 = this.field2760;
        synchronized (this.field2760) {
            this.field2760.method3248(0);
        }
        if (arg0 > -77) {
            this.method1207(67, 57);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method1205(int arg0, byte arg1) {
        this.field2742 = new class571(arg0);
        field2738++;
        if (arg1 >= -125) {
            method1203(null, null, (byte) -61, false, -49, -63, 118);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public final void method1206(int arg0, boolean arg1) {
        field2748++;
        if (this.field2740 == arg1) {
            return;
        }
        this.field2740 = arg1;
        if (arg0 != 0) {
            method1212(21);
        }
        this.method1202((byte) 124);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public final void method1207(int arg0, int arg1) {
        class571 var3 = this.field2742;
        synchronized (this.field2742) {
            this.field2742.method3253(arg1, -123);
        }
        field2737++;
        class571 var4 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method3253(arg1, -121);
        }
        if (arg0 != 15789) {
            field2757 = false;
        }
        class571 var5 = this.field2759;
        synchronized (this.field2759) {
            this.field2759.method3253(arg1, -125);
        }
        class571 var6 = this.field2760;
        synchronized (this.field2760) {
            this.field2760.method3253(arg1, -119);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public static final void method1208(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        if (var3 != null && var3.field8979 != null) {
            var3.field8979 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
    public final void method1209(boolean arg0, int arg1) {
        field2746++;
        if (arg1 != -12773) {
            this.field2755 = false;
        }
        if (this.field2755 != arg0) {
            this.field2755 = arg0;
            this.method1202((byte) 124);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Loe;")
    public static final class170 method1210(int arg0, int arg1) {
        field2739++;
        if (arg0 != 30) {
            method1208(-66, 103, 50);
        }
        return arg1 >= 0 && arg1 < 100 ? class11.field120[arg1] : null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ZI)V")
    public final void method1211(boolean arg0, int arg1) {
        field2754++;
        this.field2761 = arg1;
        class571 var3 = this.field2758;
        synchronized (this.field2758) {
            this.field2758.method3246(arg0);
        }
        class571 var4 = this.field2759;
        synchronized (this.field2759) {
            this.field2759.method3246(arg0);
        }
        class571 var5 = this.field2760;
        synchronized (this.field2760) {
            this.field2760.method3246(false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method1212(int arg0) {
        int var1 = 127 % ((40 - arg0) / 53);
        field2753 = null;
        field2752 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lhu;IZLan;Lan;)V")
    public class194(class111 arg0, int arg1, boolean arg2, class21 arg3, class21 arg4) {
        this.field2750 = arg4;
        this.field2755 = arg2;
        this.field2749 = arg3;
        if (this.field2749 != null) {
            int var6 = this.field2749.method239(-10) - 1;
            this.field2749.method231(var6, -117);
        }
    }
}
