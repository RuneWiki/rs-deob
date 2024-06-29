import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class235 {

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    private int field3942 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[Ljm;")
    public class151[] field3922;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lbe;")
    public static class235 field3925 = new class235(16);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lbd;")
    private static class162 field3941 = class17.method142(0, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lbd;")
    public static class162 field3934 = field3941;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "J")
    private long field3936;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lda;")
    public static class143 field3929;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Ljm;")
    private class151 field3935;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Ljm;")
    private class151 field3940;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 11)
    public static void method1665(int arg0) {
        field3934 = null;
        field3929 = null;
        if (arg0 == -1) {
            field3941 = null;
            field3925 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Ljm;", line = 30)
    public final class151 method1666(byte arg0) {
        this.field3942 = 0;
        field3921++;
        int var2 = -20 % ((arg0 + 11) / 47);
        return this.method1673((byte) -122);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 48)
    public final void method1667(int arg0) {
        if (arg0 > -96) {
            this.field3942 = -102;
        }
        for (int var2 = 0; var2 < this.field3939; var2++) {
            class151 var3 = this.field3922[var2];
            while (true) {
                class151 var4 = var3.field2707;
                if (var3 == var4) {
                    break;
                }
                var4.method1183(false);
            }
        }
        field3926++;
        this.field3935 = null;
        this.field3940 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Ljm;", line = 84)
    public final class151 method1668(byte arg0) {
        field3923++;
        if (arg0 != 124) {
            return (class151) null;
        } else if (this.field3935 == null) {
            return null;
        } else {
            class151 var2 = this.field3922[(int) (this.field3936 & (long) (this.field3939 - 1))];
            while (this.field3935 != var2) {
                if (this.field3935.field2701 == this.field3936) {
                    class151 var3 = this.field3935;
                    this.field3935 = this.field3935.field2707;
                    return var3;
                }
                this.field3935 = this.field3935.field2707;
            }
            this.field3935 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)I", line = 119)
    public final int method1669(boolean arg0) {
        if (arg0) {
            field3934 = (class162) null;
        }
        field3933++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3939; var3++) {
            class151 var4 = this.field3922[var3];
            class151 var5 = var4.field2707;
            while (var4 != var5) {
                var5 = var5.field2707;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V", line = 153)
    public static final void method1670(byte arg0) {
        class80.field1388.method1529(false);
        if (arg0 == -18) {
            field3937++;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([Ljm;I)I", line = 164)
    public final int method1671(class151[] arg0, int arg1) {
        field3924++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field3939; var4++) {
            class151 var5 = this.field3922[var4];
            for (class151 var6 = var5.field2707; var6 != var5; var6 = var6.field2707) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)Ljm;", line = 192)
    public final class151 method1672(long arg0, int arg1) {
        this.field3936 = arg0;
        field3920++;
        class151 var4 = this.field3922[(int) (arg0 & (long) (this.field3939 - 1))];
        this.field3935 = var4.field2707;
        if (arg1 != 19760) {
            this.method1673((byte) -18);
        }
        while (this.field3935 != var4) {
            if (this.field3935.field2701 == arg0) {
                class151 var5 = this.field3935;
                this.field3935 = this.field3935.field2707;
                return var5;
            }
            this.field3935 = this.field3935.field2707;
        }
        this.field3935 = null;
        return null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)Ljm;", line = 224)
    public final class151 method1673(byte arg0) {
        field3930++;
        if (this.field3942 > 0 && this.field3922[this.field3942 - 1] != this.field3940) {
            class151 var2 = this.field3940;
            this.field3940 = var2.field2707;
            return var2;
        }
        class151 var3;
        do {
            if (this.field3942 >= this.field3939) {
                int var4 = -89 / ((-arg0 - 73) / 47);
                return null;
            }
            var3 = this.field3922[this.field3942++].field2707;
        } while (this.field3922[this.field3942 - 1] == var3);
        this.field3940 = var3.field2707;
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljm;ZJ)V", line = 267)
    public final void method1674(class151 arg0, boolean arg1, long arg2) {
        field3932++;
        if (arg0.field2691 != null) {
            arg0.method1183(false);
        }
        if (arg1) {
            return;
        }
        class151 var5 = this.field3922[(int) (arg2 & (long) (this.field3939 - 1))];
        arg0.field2691 = var5.field2691;
        arg0.field2701 = arg2;
        arg0.field2707 = var5;
        arg0.field2691.field2707 = arg0;
        arg0.field2707.field2691 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I", line = 292)
    public final int method1675(boolean arg0) {
        if (!arg0) {
            this.method1666((byte) -85);
        }
        field3927++;
        return this.field3939;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V", line = 304)
    public static final void method1676(byte arg0) {
        class190.field3244 = (byte[][][]) null;
        class206.field3474 = (int[][][]) null;
        class194.field3271 = (short[][][]) null;
        class123.field2234 = 0;
        class259.field4315 = (byte[][][]) null;
        class133.field2381 = (byte[][][]) null;
        class209.field3531 = (byte[][][]) null;
        field3928++;
        if (arg0 <= 60) {
            method1676((byte) -112);
        }
        class158.field2780 = (int[][][]) null;
        class222.field3713 = null;
        class180.field3101 = null;
        class269.field4503 = (byte[][][]) null;
        class314.field5304 = null;
        class106.field1924.method171(55);
        class162.field2849 = null;
        class91.field1613 = null;
        class116.field2064 = null;
        class200.field3410 = null;
        class229.field3806 = null;
        class218.field3638 = null;
        class7.field72 = null;
        class158.field2784 = null;
        class187.field3234 = null;
        class261.field4354 = null;
        class9.field112 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V", line = 338)
    public class235(int arg0) {
        this.field3922 = new class151[arg0];
        this.field3939 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class151 var3 = this.field3922[var2] = new class151();
            var3.field2691 = var3;
            var3.field2707 = var3;
        }
    }
}
