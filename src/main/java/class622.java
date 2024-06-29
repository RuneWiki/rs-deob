import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class622 {

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    private int field9115;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[Lge;")
    private class551[] field9116;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[I")
    public static int[] field9106 = new int[1];

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    public static int[] field9112 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "J")
    private long field9108;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lge;")
    private class551 field9102;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
    public static int[] field9114;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3622(int arg0) {
        field9105++;
        class211 var1 = null;
        try {
            class286 var2 = class328.field4850.method2175("2", 95, true);
            while (var2.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (var2.field4208 == 1) {
                var1 = (class211) var2.field4213;
                class428 var3 = new class428(class178.field2706 * 6 + 3);
                var3.method2563(-13021, 1);
                var3.method2608(class178.field2706, (byte) 44);
                for (int var4 = 0; var4 < class526.field7774.length; var4++) {
                    if (class595.field8769[var4]) {
                        var3.method2608(var4, (byte) 57);
                        var3.method2576(true, class526.field7774[var4]);
                    }
                }
                var1.method1368((byte) 37, 0, var3.field6221, var3.field6162);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 < 94) {
                return;
            }
            if (var1 != null) {
                var1.method1367(0);
            }
        } catch (Exception var5) {
        }
        class516.field7684 = class450.method2719((byte) -88);
        class528.field7834 = false;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lge;JI)V", line = 65)
    public final void method3623(class551 arg0, long arg1, int arg2) {
        field9111++;
        if (arg0.field8203 != null) {
            arg0.method3225(-127);
        }
        class551 var5 = this.field9116[(int) (arg1 & (long) (this.field9115 - 1))];
        arg0.field8211 = var5;
        if (arg2 < 100) {
            this.field9108 = 77L;
        }
        arg0.field8203 = var5.field8203;
        arg0.field8203.field8211 = arg0;
        arg0.field8204 = arg1;
        arg0.field8211.field8203 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Lge;", line = 87)
    public final class551 method3624(boolean arg0) {
        field9109++;
        if (!arg0) {
            return null;
        } else if (this.field9102 == null) {
            return null;
        } else {
            class551 var2 = this.field9116[(int) ((long) (this.field9115 - 1) & this.field9108)];
            while (this.field9102 != var2) {
                if (this.field9102.field8204 == this.field9108) {
                    class551 var3 = this.field9102;
                    this.field9102 = this.field9102.field8211;
                    return var3;
                }
                this.field9102 = this.field9102.field8211;
            }
            this.field9102 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 117)
    public static void method3625(byte arg0) {
        if (arg0 <= 57) {
            field9114 = null;
        }
        field9114 = null;
        field9106 = null;
        field9112 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 129)
    public static final void method3626(int arg0) {
        if (class4.field43 != -1) {
            class444.method2699(-1, (byte) -125, -1, false, class4.field43);
            class4.field43 = -1;
        }
        field9104++;
        if (arg0 != -20123) {
            method3630(null, -106, true, 62, -27, -99, null, 55);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lqa;B)V", line = 150)
    public static final void method3627(class167 arg0, byte arg1) {
        field9103++;
        if (class554.field8234.method2491(-18626) == 0) {
            return;
        }
        if (class239.field3499 == 0) {
            for (class581 var4 = (class581) class554.field8234.method2496((byte) -103); var4 != null; var4 = (class581) class554.field8234.method2494(21)) {
                class216.field3204.method3359(arg0, var4.field8553, var4.field8550 ? class239.field3493.field2711 : null, 0, class463.field6700, false, var4.field8556, var4.field8552, arg0, var4.field8555, var4.field8551, false);
                var4.method2997(1);
            }
            class539.method3164(-118);
        } else {
            if (class133.field1758 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class133.field1758 = class167.method1062(0, 0, var2, class646.field9378, class39.field441, 0);
                class123.field1591 = class133.field1758.method998(class510.method3046(class94.field1171, class644.field9347, 0, -6724), class610.method3547(class371.field5368, class94.field1171, 0), true);
            }
            for (class581 var3 = (class581) class554.field8234.method2496((byte) -125); var3 != null; var3 = (class581) class554.field8234.method2494(123)) {
                class216.field3204.method3359(arg0, var3.field8553, var3.field8550 ? class239.field3493.field2711 : null, 0, class123.field1591, false, var3.field8556, var3.field8552, class133.field1758, var3.field8555, var3.field8551, false);
                var3.method2997(1);
            }
        }
        if (arg1 <= 79) {
            method3625((byte) 18);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IJ)Lge;", line = 201)
    public final class551 method3628(int arg0, long arg1) {
        field9101++;
        this.field9108 = arg1;
        class551 var4 = this.field9116[(int) (arg1 & (long) (this.field9115 - 1))];
        this.field9102 = var4.field8211;
        if (arg0 != 17660) {
            this.field9102 = null;
        }
        while (this.field9102 != var4) {
            if (this.field9102.field8204 == arg1) {
                class551 var5 = this.field9102;
                this.field9102 = this.field9102.field8211;
                return var5;
            }
            this.field9102 = this.field9102.field8211;
        }
        this.field9102 = null;
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)Z", line = 240)
    public static final boolean method3629(int arg0, byte arg1, int arg2) {
        int var3 = 118 / ((arg1 - 82) / 44);
        field9107++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIZIIILos;I)Lgg;", line = 250)
    public static final class273 method3630(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class468 arg6, int arg7) {
        if (arg3 > -87) {
            method3630(null, -74, false, 18, -44, -102, null, 104);
        }
        field9113++;
        if (!arg6.field7022 && (!class154.method899(arg7, 112) || !class154.method899(arg4, 70))) {
            return arg6.field7095 ? new class273(arg6, 34037, arg1, arg7, arg4, arg2, arg0, arg5) : new class273(arg6, arg1, arg7, arg4, class479.method2908((byte) -99, arg7), class479.method2908((byte) -99, arg4), arg0, arg5);
        } else {
            return new class273(arg6, 3553, arg1, arg7, arg4, arg2, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V", line = 283)
    public class622(int arg0) {
        this.field9115 = arg0;
        this.field9116 = new class551[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class551 var3 = this.field9116[var2] = new class551();
            var3.field8211 = var3;
            var3.field8203 = var3;
        }
    }
}
