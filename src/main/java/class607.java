import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class607 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Lce;")
    private class283 field8633 = new class283();

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    private int field8636;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    private int field8631;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lsba;")
    private class200 field8629;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field8632 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Lkw;I)V")
    public final void method3532(Object arg0, class228 arg1, int arg2) {
        this.method3538(arg0, arg1, arg2, (byte) -116);
        field8635++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lkw;B)Ljava/lang/Object;")
    public final Object method3533(class228 arg0, byte arg1) {
        field8628++;
        long var3 = arg0.method1678(9640);
        if (arg1 >= -118) {
            return null;
        }
        for (class312 var5 = (class312) this.field8629.method1558(var3, (byte) -93); var5 != null; var5 = (class312) this.field8629.method1565((byte) 44)) {
            if (var5.field4912.method1677((byte) -11, arg0)) {
                Object var6 = var5.method2137((byte) 110);
                if (var6 != null) {
                    if (var5.method2136(-20065)) {
                        class315 var7 = new class315(arg0, var6, var5.field4907);
                        this.field8629.method1564(var5.field844, var7, (byte) 125);
                        this.field8633.method2015(var7, -72);
                        var7.field1586 = 0L;
                        var5.method707((byte) -76);
                        var5.method958((byte) 69);
                    } else {
                        this.field8633.method2015(var5, -113);
                        var5.field1586 = 0L;
                    }
                    return var6;
                }
                var5.method707((byte) -91);
                var5.method958((byte) 69);
                this.field8636 += var5.field4907;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
    public final int method3534(int arg0) {
        field8637++;
        int var2 = 36 / ((arg0 + 63) / 45);
        return this.field8636;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public final void method3535(byte arg0) {
        field8634++;
        int var2 = -6 / ((arg0 + 77) / 34);
        for (class312 var3 = (class312) this.field8633.method2008(-3717); var3 != null; var3 = (class312) this.field8633.method2011(35)) {
            if (var3.method2136(-20065)) {
                var3.method707((byte) -59);
                var3.method958((byte) 69);
                this.field8636 += var3.field4907;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8623++;
        if (!class185.field3114) {
            return false;
        } else if (class504.field7375 < 100) {
            return false;
        } else if (class640.method3715(arg3 ^ 0x3E, arg2, arg0, arg4)) {
            if (arg3 != 0) {
                field8632 = 113;
            }
            int var5 = arg2 << class439.field6699;
            int var6 = arg0 << class439.field6699;
            if (class332.method2247(class134.field2203, class134.field2203, var5, var6, -13766, class587.field8346[arg4].method479(arg0, arg2, -99), arg1)) {
                class544.field7915++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lgd;I)V")
    private final void method3537(class312 arg0, int arg1) {
        if (arg1 != 1) {
            this.method3533(null, (byte) 113);
        }
        field8625++;
        if (arg0 != null) {
            arg0.method707((byte) -37);
            arg0.method958((byte) 69);
            this.field8636 += arg0.field4907;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/Object;Lkw;IB)V")
    private final void method3538(Object arg0, class228 arg1, int arg2, byte arg3) {
        field8627++;
        if (arg3 >= -98) {
            return;
        }
        if (this.field8631 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method3539(arg1, (byte) -115);
        this.field8636 -= arg2;
        while (this.field8636 < 0) {
            class312 var6 = (class312) this.field8633.method2012(false);
            this.method3537(var6, 1);
        }
        class315 var5 = new class315(arg1, arg0, arg2);
        this.field8629.method1564(arg1.method1678(9640), var5, (byte) 95);
        this.field8633.method2015(var5, -89);
        var5.field1586 = 0L;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lkw;B)V")
    private final void method3539(class228 arg0, byte arg1) {
        field8639++;
        long var3 = arg0.method1678(9640);
        if (arg1 != -115) {
            this.method3540(true);
        }
        for (class312 var5 = (class312) this.field8629.method1558(var3, (byte) -93); var5 != null; var5 = (class312) this.field8629.method1565((byte) 44)) {
            if (var5.field4912.method1677((byte) -11, arg0)) {
                this.method3537(var5, 1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)I")
    public final int method3540(boolean arg0) {
        if (arg0) {
            return 25;
        } else {
            field8626++;
            return this.field8631;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public final void method3541(int arg0, int arg1) {
        field8630++;
        if (class85.field1046 != null) {
            for (class312 var3 = (class312) this.field8633.method2008(arg0 ^ 0x5FD5); var3 != null; var3 = (class312) this.field8633.method2011(35)) {
                if (var3.method2136(arg0 + 753)) {
                    if (var3.method2137((byte) 31) == null) {
                        var3.method707((byte) -15);
                        var3.method958((byte) 69);
                        this.field8636 += var3.field4907;
                    }
                } else if (++var3.field1586 > (long) arg1) {
                    class312 var4 = class85.field1046.method2802((byte) 68, var3);
                    this.field8629.method1564(var3.field844, var4, (byte) 120);
                    class46.method548(arg0 ^ 0xDC1F39C8, var3, var4);
                    var3.method707((byte) -89);
                    var3.method958((byte) 69);
                }
            }
        }
        if (arg0 != -20818) {
            this.method3534(99);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public final void method3542(byte arg0) {
        this.field8633.method2010(-39);
        field8640++;
        this.field8629.method1562((byte) -30);
        this.field8636 = this.field8631;
        if (arg0 > -55) {
            method3536(-43, -103, -113, 56, -75);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class607(int arg0) {
        this.field8636 = arg0;
        this.field8631 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field8629 = new class200(var2);
    }
}
