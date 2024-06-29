import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class320 extends class213 {

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Z")
    private boolean field4712 = false;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4711 = new String[200];

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 3)
    public final void method28(int arg0, int arg1, int arg2) {
        ++field4705;
        if (arg0 != -16595) {
            method2074(94);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V", line = 14)
    public static void method2073(int arg0) {
        int var1 = 28 / ((arg0 - 53) / 47);
        field4711 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILaw;)V", line = 24)
    public final void method19(int arg0, int arg1, class619 arg2) {
        if (arg1 == 8) {
            super.field2766.method1884(arg2, -2);
            ++field4709;
            super.field2766.method1995(arg0, arg1 ^ 9);
        }
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V", line = 36)
    public static final void method2074(int arg0) {
        class331.field4843 = arg0;
        for (int var1 = 0; var1 < class149.field1872; ++var1) {
            for (int var2 = 0; var2 < class334.field4887; ++var2) {
                if (class145.field1841[arg0][var1][var2] == null) {
                    class145.field1841[arg0][var1][var2] = new class651(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lsv;)V", line = 58)
    public class320(class312 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(ZI)V", line = 62)
    public final void method17(boolean arg0, int arg1) {
        ++field4706;
        class64 var3 = super.field2766.method1964(2);
        if (arg1 <= 37) {
            this.field4712 = false;
        }
        if (var3 != null && arg0) {
            super.field2766.method1969(1, -26328);
            super.field2766.method1884(var3, -2);
            super.field2766.method788(14433, class394.field5646);
            super.field2766.method1969(1, -26328);
            super.field2766.method1917(false, class66.field868, class75.field948);
            super.field2766.method807(true, 2, false, -21480, class668.field9495);
            super.field2766.method1914(class275.field3735, 0, (byte) 115);
            class492 var4 = super.field2766.method1993((byte) -26);
            var4.method2768(super.field2766.method2023(true), 21226);
            super.field2766.method1896(class480.field6468, (byte) -6);
            super.field2766.method1969(0, -26328);
            this.field4712 = true;
        } else {
            super.field2766.method1914(class275.field3735, 0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 94)
    public final void method20(int arg0) {
        if (arg0 > 32) {
            if (this.field4712) {
                super.field2766.method1969(1, -26328);
                super.field2766.method788(14433, class179.field2239);
                super.field2766.method1917(false, class594.field8145, class594.field8145);
                super.field2766.method1997(class577.field7974, 2, -85);
                super.field2766.method1914(class322.field4722, 0, (byte) 115);
                super.field2766.method1928(-9396);
                super.field2766.method1884((class619) null, -2);
                super.field2766.method1969(0, -26328);
                this.field4712 = false;
            } else {
                super.field2766.method1914(class322.field4722, 0, (byte) 115);
            }
            ++field4707;
            super.field2766.method1917(false, class594.field8145, class594.field8145);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Z", line = 121)
    public final boolean method22(byte arg0) {
        ++field4710;
        return arg0 == 75;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(ZI)V", line = 133)
    public final void method23(boolean arg0, int arg1) {
        if (arg1 != -18) {
            field4711 = null;
        }
        super.field2766.method1917(false, class66.field868, class594.field8145);
        ++field4704;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI)Z", line = 145)
    public static final boolean method2075(int arg0, byte arg1, int arg2) {
        int var3 = 103 / ((arg1 - -38) / 60);
        ++field4708;
        return class169.method1124((byte) -113, arg2, arg0) || class648.method3599(false, arg2, arg0);
    }
}
