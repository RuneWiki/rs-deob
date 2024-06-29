import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class572 {

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    private int field8129 = 0;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field8117;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "[Lmu;")
    public class270[] field8123;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "J")
    private long field8121;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lmu;")
    private class270 field8116;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lmu;")
    private class270 field8128;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method3227(byte arg0) {
        for (int var2 = 0; var2 < this.field8117; var2++) {
            class270 var4 = this.field8123[var2];
            while (true) {
                class270 var5 = var4.field3394;
                if (var4 == var5) {
                    break;
                }
                var5.method1519((byte) 121);
            }
        }
        field8120++;
        this.field8116 = null;
        int var3 = 80 / ((arg0 + 30) / 60);
        this.field8128 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
    public final int method3228(int arg0) {
        if (arg0 >= -102) {
            this.method3228(75);
        }
        field8119++;
        return this.field8117;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lmu;I)I")
    public final int method3229(class270[] arg0, int arg1) {
        if (arg1 != 20028) {
            return 95;
        }
        field8115++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field8117; var4++) {
            class270 var5 = this.field8123[var4];
            for (class270 var6 = var5.field3394; var6 != var5; var6 = var6.field3394) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
    public final int method3230(boolean arg0) {
        field8126++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field8117; var3++) {
            class270 var4 = this.field8123[var3];
            for (class270 var5 = var4.field3394; var5 != var4; var5 = var5.field3394) {
                var2++;
            }
        }
        if (arg0) {
            this.field8129 = 37;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBII)V")
    public static final void method3231(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = class601.field8530.field2866 * arg0 >> 8;
        field8114++;
        if (arg3 == -1 && !class548.field7834) {
            class24.method120((byte) 61);
        } else if (arg3 != -1 && (class80.field832 != arg3 || !class210.method1265(0)) && var4 != 0 && !class548.field7834) {
            class671.method3763(class403.field5364, arg3, (byte) -44, var4, 0, false, arg2);
        }
        if (arg1 == 30) {
            class80.field832 = arg3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lmu;")
    public final class270 method3232(int arg0) {
        if (arg0 != -1) {
            this.field8123 = null;
        }
        this.field8129 = 0;
        field8127++;
        return this.method3236(-27646);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)Lmu;")
    public final class270 method3233(int arg0) {
        field8124++;
        if (this.field8116 == null) {
            return null;
        }
        if (arg0 <= 105) {
            this.field8128 = null;
        }
        class270 var2 = this.field8123[(int) ((long) (this.field8117 - 1) & this.field8121)];
        while (this.field8116 != var2) {
            if (this.field8116.field3405 == this.field8121) {
                class270 var3 = this.field8116;
                this.field8116 = this.field8116.field3394;
                return var3;
            }
            this.field8116 = this.field8116.field3394;
        }
        this.field8116 = null;
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJ)Lmu;")
    public final class270 method3234(byte arg0, long arg1) {
        field8122++;
        this.field8121 = arg1;
        class270 var4 = this.field8123[(int) ((long) (this.field8117 - 1) & arg1)];
        for (this.field8116 = var4.field3394; this.field8116 != var4; this.field8116 = this.field8116.field3394) {
            if (this.field8116.field3405 == arg1) {
                class270 var5 = this.field8116;
                this.field8116 = this.field8116.field3394;
                return var5;
            }
        }
        this.field8116 = null;
        return arg0 >= -30 ? null : null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(JILmu;)V")
    public final void method3235(long arg0, int arg1, class270 arg2) {
        if (arg2.field3404 != null) {
            arg2.method1519((byte) 121);
        }
        field8130++;
        class270 var5 = this.field8123[(int) ((long) (this.field8117 + arg1) & arg0)];
        arg2.field3394 = var5;
        arg2.field3404 = var5.field3404;
        arg2.field3404.field3394 = arg2;
        arg2.field3394.field3404 = arg2;
        arg2.field3405 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Lmu;")
    public final class270 method3236(int arg0) {
        field8125++;
        if (this.field8129 > 0 && this.field8123[this.field8129 - 1] != this.field8128) {
            class270 var2 = this.field8128;
            this.field8128 = var2.field3394;
            return var2;
        }
        while (this.field8117 > this.field8129) {
            class270 var3 = this.field8123[this.field8129++].field3394;
            if (this.field8123[this.field8129 - 1] != var3) {
                this.field8128 = var3.field3394;
                return var3;
            }
        }
        if (arg0 != -27646) {
            this.field8129 = 87;
        }
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBI)V")
    public static final void method3237(int arg0, int arg1, byte arg2, int arg3) {
        field8118++;
        class515 var4 = class337.field4413[arg1][arg0];
        if (arg2 == -70) {
            class416.method2250(0, arg3, var4 == null ? class587.field8341 : var4);
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
    public class572(int arg0) {
        this.field8117 = arg0;
        this.field8123 = new class270[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class270 var3 = this.field8123[var2] = new class270();
            var3.field3404 = var3;
            var3.field3394 = var3;
        }
    }
}
