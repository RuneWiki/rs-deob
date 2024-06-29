import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Llga;")
    private class663 field403 = new class663(64);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lsea;")
    private class648 field402;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Lqs;", line = 3)
    public final class560 method303(int arg0, int arg1) {
        field405++;
        class663 var3 = this.field403;
        class560 var4;
        synchronized (this.field403) {
            var4 = (class560) this.field403.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field402;
        byte[] var6;
        synchronized (this.field402) {
            var6 = this.field402.method3654(-15615, 5, arg0);
            if (arg1 != 16264) {
                this.field403 = null;
            }
        }
        class560 var7 = new class560();
        if (var6 != null) {
            var7.method3128(-115, new class501(var6));
        }
        class663 var8 = this.field403;
        synchronized (this.field403) {
            this.field403.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 39)
    public static final void method304(int arg0) {
        for (class499 var1 = (class499) class588.field8265.method1436(28964); var1 != null; var1 = (class499) class588.field8265.method1443((byte) 6)) {
            if (class483.method2713(arg0 ^ 0x710E, var1.field6780)) {
                class597.method3371(-8257, var1);
            }
        }
        if (arg0 != 8) {
            return;
        }
        field406++;
        if (class137.field1948 == 1) {
            class592.method3352(-15934);
            return;
        }
        class48.method384(class627.field8692, 1, class426.field5970, class603.field8403, class568.field8040);
        int var2 = class377.field5030.method1736(arg0 + 17038, class65.field812.method555(class697.field9900, true));
        for (class499 var3 = (class499) class588.field8265.method1436(28964); var3 != null; var3 = (class499) class588.field8265.method1443((byte) 6)) {
            int var4 = class384.method2277(var3, (byte) 113);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class568.field8040 = var2 + 8;
        class426.field5970 = (class287.field3951 ? 26 : 22) + class137.field1948 * 16;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)I", line = 87)
    public static final int method305(int arg0, int arg1, int arg2, int arg3) {
        field404++;
        int var4 = ((arg3 & 0xFF00) * arg1 & 0xFF0000 | (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        if (arg2 != 7589) {
            method305(-108, -118, 82, 45);
        }
        int var5 = 255 - arg1;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 182)
    public class32(class414 arg0, int arg1, class648 arg2) {
        this.field402 = arg2;
        this.field402.method3653(5, true);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V", line = 112)
    public static final void method306(int arg0) {
        if (arg0 == 0) {
            if (class152.field2223 == 2) {
                class494.field6736[0].method1133(class672.field9424[0]);
                class494.field6736[1].method1133(class672.field9424[1]);
            } else if (class152.field2223 == 3) {
                class494.field6736[0].method1133(class672.field9424[0]);
                class494.field6736[1].method1133(class672.field9424[1]);
                class494.field6736[2].method1133(class672.field9424[2]);
            } else {
                class494.field6736[0].method1133(class672.field9424[0]);
                class494.field6736[1].method1133(class672.field9424[1]);
                class494.field6736[2].method1133(class672.field9424[2]);
                class494.field6736[3].method1133(class672.field9424[3]);
            }
        } else if (arg0 == 1) {
            if (class152.field2223 == 2) {
                class494.field6736[0].method1133(class672.field9424[2]);
            } else if (class152.field2223 == 3) {
                class494.field6736[0].method1133(class672.field9424[3]);
                class494.field6736[1].method1133(class672.field9424[4]);
            } else {
                class494.field6736[0].method1133(class672.field9424[4]);
                class494.field6736[1].method1133(class672.field9424[5]);
                class494.field6736[2].method1133(class672.field9424[6]);
            }
        } else if (arg0 == 2) {
            if (class152.field2223 == 2) {
                class494.field6736[0].method1133(class672.field9424[3]);
                return;
            }
            if (class152.field2223 == 3) {
                class494.field6736[0].method1133(class672.field9424[5]);
                return;
            }
            class494.field6736[0].method1133(class672.field9424[7]);
        }
    }
}
