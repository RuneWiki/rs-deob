import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class466 {

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "Lgw;")
    private class690 field6476 = new class690(256);

    @OriginalMember(owner = "client!fja", name = "f", descriptor = "Lrl;")
    private class232 field6478;

    @OriginalMember(owner = "client!fja", name = "e", descriptor = "Ld;")
    private class270 field6477;

    @OriginalMember(owner = "client!fja", name = "i", descriptor = "I")
    public static int field6481 = -1;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!fja", name = "g", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!fja", name = "h", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)V", line = 8)
    public final void method2846(byte arg0) {
        this.field6476.method3906(-98);
        if (arg0 != -112) {
            field6481 = 91;
        }
        field6474++;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V", line = 21)
    public final void method2847(int arg0) {
        this.field6476.method3896(1, arg0);
        field6473++;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(II)Ldg;", line = 30)
    public final class19 method2848(int arg0, int arg1) {
        field6475++;
        Object var3 = this.field6476.method3898((byte) -42, (long) arg0);
        if (var3 != null) {
            return (class19) var3;
        } else if (this.field6477.method517(arg0, true)) {
            if (arg1 != 0) {
                this.field6476 = null;
            }
            class239 var4 = this.field6477.method521(arg0, 123);
            int var5 = var4.field3556 ? 64 : this.field6478.field3383;
            class19 var7;
            if (var4.field3572 && this.field6478.method289()) {
                float[] var6 = this.field6477.method518(0.7F, arg0, arg1 + 8606, var5, false, var5);
                var7 = this.field6478.method1393(class623.field8394, var6, var5, var4.field3575 != 0, var5, (byte) -113);
            } else {
                int[] var8;
                if (var4.field3557 != 2 && class416.method2592(var4.field3561, 2780)) {
                    var8 = this.field6477.method519(arg1 ^ 0xFFFFE549, arg0, 0.7F, var5, var5, true);
                } else {
                    var8 = this.field6477.method520(var5, (byte) 77, var5, false, arg0, 0.7F);
                }
                var7 = this.field6478.method1520(var8, var5, var4.field3575 != 0, var5, (byte) -108);
            }
            var7.method100(var4.field3576, var4.field3569, 52);
            this.field6476.method3899(arg1 ^ 0xFFFFFF9B, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljt;I)I", line = 78)
    public static final int method2849(class38 arg0, int arg1) {
        if (arg1 != -11595) {
            field6481 = 96;
        }
        field6480++;
        if (class38.field469 == arg0) {
            return 5120;
        } else if (class38.field470 == arg0) {
            return 5122;
        } else if (class38.field471 == arg0) {
            return 5124;
        } else if (class38.field472 == arg0) {
            return 5121;
        } else if (class38.field473 == arg0) {
            return 5123;
        } else if (class38.field474 == arg0) {
            return 5125;
        } else if (class38.field475 == arg0) {
            return 5131;
        } else if (class38.field476 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lrl;Ld;)V", line = 123)
    public class466(class232 arg0, class270 arg1) {
        this.field6478 = arg0;
        this.field6477 = arg1;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI[BIII)V", line = 137)
    public static final void method2850(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6479++;
        if (arg3 <= arg1) {
            return;
        }
        int var6 = arg3 - arg1 >> 2;
        int var7 = arg1 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg0 < 120) {
                            field6481 = 21;
                            return;
                        } else {
                            return;
                        }
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }
}
