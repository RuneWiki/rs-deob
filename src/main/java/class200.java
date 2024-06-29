import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class200 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public int field2663 = 1190717;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public int field2672 = -1;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public int field2675 = 16;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
    public boolean field2668 = false;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Z")
    public boolean field2677 = true;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public int field2676 = -1;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public int field2673 = 127;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public int field2674 = 128;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public int field2671 = 0;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public int field2679 = 8;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Z")
    public boolean field2680 = true;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public int field2681 = -1;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "[I")
    public static int[] field2667 = new int[14];

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Ltv;")
    public static class395 field2662;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Lua;")
    public class474 field2678;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method1288(byte arg0) {
        field2667 = null;
        field2662 = null;
        int var1 = -61 / ((arg0 - 17) / 58);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public final void method1289(boolean arg0) {
        field2664++;
        if (this.field2681 == -1) {
            this.field2681 = this.field2672;
        }
        this.field2679 = this.field2666 | this.field2679 << 8;
        if (!arg0) {
            this.field2671 = 80;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILug;)V")
    public final void method1290(int arg0, class396 arg1) {
        if (arg0 != 22355) {
            return;
        }
        while (true) {
            int var3 = arg1.method2388((byte) -117);
            if (var3 == 0) {
                field2669++;
                return;
            }
            this.method1291((byte) 109, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BILug;)V")
    private final void method1291(byte arg0, int arg1, class396 arg2) {
        field2670++;
        if (arg1 == 1) {
            this.field2671 = class479.method2927(arg2.method2396((byte) -68), false);
        } else if (arg1 == 2) {
            this.field2672 = arg2.method2388((byte) -112);
        } else if (arg1 == 3) {
            this.field2672 = arg2.method2386(-23648);
            if (this.field2672 == 65535) {
                this.field2672 = -1;
            }
        } else if (arg1 == 5) {
            this.field2677 = false;
        } else if (arg1 == 7) {
            this.field2676 = class479.method2927(arg2.method2396((byte) 99), false);
        } else if (arg1 == 8) {
            this.field2678.field7026 = this.field2666;
        } else if (arg1 == 9) {
            this.field2674 = arg2.method2386(-23648) << 0;
        } else if (arg1 == 10) {
            this.field2680 = false;
        } else if (arg1 == 11) {
            this.field2679 = arg2.method2388((byte) -128);
        } else if (arg1 == 12) {
            this.field2668 = true;
        } else if (arg1 == 13) {
            this.field2663 = arg2.method2396((byte) 45);
        } else if (arg1 == 14) {
            this.field2675 = arg2.method2388((byte) -119) << 0;
        } else if (arg1 == 15) {
            this.field2681 = arg2.method2386(-23648);
            if (this.field2681 == 65535) {
                this.field2681 = -1;
            }
        } else if (arg1 == 16) {
            this.field2673 = arg2.method2388((byte) -125);
        }
        if (arg0 <= 107) {
            this.field2668 = true;
        }
    }
}
