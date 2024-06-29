import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public abstract class class214 extends class65 {

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "Z")
    public boolean field3540;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "[Lfw;")
    public class214[] field3543;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "Lew;")
    public static class685 field3531 = new class685("", 18);

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public static int field3547 = -1;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "Liga;")
    public class493 field3545;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "Lws;")
    public class693 field3544;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I", line = 6)
    public int method1538(boolean arg0) {
        if (arg0) {
            field3530++;
            return -1;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZII)[[I", line = 18)
    public final int[][] method1539(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return null;
        }
        field3532++;
        if (this.field3543[arg1].field3540) {
            int[] var4 = this.field3543[arg1].method64(arg2, (byte) 5);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3543[arg1].method62(arg2, -256);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)[I", line = 56)
    public int[] method64(int arg0, byte arg1) {
        field3538++;
        if (arg1 != 5) {
            this.field3534 = -76;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BII)Z", line = 67)
    public static final boolean method1540(byte arg0, int arg1, int arg2) {
        if (arg0 >= -92) {
            method1541(-84);
        }
        field3541++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 78)
    public static void method1541(int arg0) {
        int var1 = -119 / ((arg0 + 21) / 56);
        field3531 = null;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(II)[[I", line = 87)
    public int[][] method62(int arg0, int arg1) {
        if (arg1 == -256) {
            field3539++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V", line = 101)
    public void method1542(int arg0) {
        if (arg0 != 0) {
            this.method65(-74);
        }
        if (this.field3540) {
            this.field3544.method3868(0);
            this.field3544 = null;
        } else {
            this.field3545.method2997((byte) -111);
            this.field3545 = null;
        }
        field3535++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I", line = 132)
    public int method1543(byte arg0) {
        if (arg0 != 121) {
            this.method1543((byte) -64);
        }
        field3533++;
        return -1;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILofa;I)V", line = 145)
    public void method59(int arg0, class301 arg1, int arg2) {
        field3537++;
        if (arg0 <= 92) {
            this.method64(127, (byte) 42);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)I", line = 157)
    public static final int method1544(boolean arg0, int arg1, int arg2, int arg3) {
        field3542++;
        class33 var4 = class446.method2724(arg2, 9, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= ~arg1 && var4.field311.length > arg1) {
            return var4.field311[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)[I", line = 181)
    public final int[] method1545(int arg0, int arg1, int arg2) {
        field3536++;
        if (arg2 != -1) {
            this.field3545 = null;
        }
        return this.field3543[arg1].field3540 ? this.field3543[arg1].method64(arg0, (byte) 5) : this.field3543[arg1].method62(arg0, -256)[0];
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(BII)V", line = 203)
    public void method1546(byte arg0, int arg1, int arg2) {
        field3546++;
        int var4 = this.field3534 == 255 ? arg2 : this.field3534;
        if (this.field3540) {
            this.field3544 = new class693(var4, arg2, arg1);
        } else {
            this.field3545 = new class493(var4, arg2, arg1);
        }
        if (arg0 != -106) {
            this.method65(49);
        }
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V", line = 228)
    public void method65(int arg0) {
        field3548++;
        if (arg0 < 48) {
            field3547 = 108;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IZ)V", line = 237)
    public class214(int arg0, boolean arg1) {
        this.field3540 = arg1;
        this.field3543 = new class214[arg0];
    }
}
