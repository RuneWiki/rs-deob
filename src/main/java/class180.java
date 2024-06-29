import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class180 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field2714 = 16;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field2716 = 0;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public int field2720 = 8;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field2722 = -1;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
    public boolean field2724 = true;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field2719 = 1190717;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field2723 = -1;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
    public boolean field2721 = true;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field2717 = 127;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field2715 = -1;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public int field2725 = 128;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
    public boolean field2726 = false;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Liv;")
    public static class64 field2727 = new class64(36, -2);

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lrn;")
    public static class174 field2728 = new class174(43, -1);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lsg;")
    public class272 field2711;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public final void method1272(byte arg0) {
        this.field2720 = this.field2720 << 8 | this.field2713;
        field2729++;
        if (arg0 > -41) {
            this.method1273(98, null);
        }
        if (this.field2722 == -1) {
            this.field2722 = this.field2723;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILcu;)V")
    public final void method1273(int arg0, class145 arg1) {
        field2712++;
        while (true) {
            int var3 = arg1.method1063((byte) 112);
            if (var3 == 0) {
                if (arg0 == 9) {
                    return;
                } else {
                    this.field2716 = -60;
                    return;
                }
            }
            this.method1274(arg1, var3, 2);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lcu;II)V")
    private final void method1274(class145 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2716 = class494.method2974(arg2 ^ 0xFF00FF02, arg0.method1085(115));
        } else if (arg1 == 2) {
            this.field2723 = arg0.method1063((byte) 126);
        } else if (arg1 == 3) {
            this.field2723 = arg0.method1069((byte) -119);
            if (this.field2723 == 65535) {
                this.field2723 = -1;
            }
        } else if (arg1 == 5) {
            this.field2721 = false;
        } else if (arg1 == 7) {
            this.field2715 = class494.method2974(arg2 - 16711938, arg0.method1085(arg2 ^ 0xFFFFFF9D));
        } else if (arg1 == 8) {
            this.field2711.field3930 = this.field2713;
        } else if (arg1 == 9) {
            this.field2725 = arg0.method1069((byte) -115) << 0;
        } else if (arg1 == 10) {
            this.field2724 = false;
        } else if (arg1 == 11) {
            this.field2720 = arg0.method1063((byte) -39);
        } else if (arg1 == 12) {
            this.field2726 = true;
        } else if (arg1 == 13) {
            this.field2719 = arg0.method1085(-51);
        } else if (arg1 == 14) {
            this.field2714 = arg0.method1063((byte) 123);
        } else if (arg1 == 15) {
            this.field2722 = arg0.method1069((byte) -84);
            if (this.field2722 == 65535) {
                this.field2722 = -1;
            }
        } else if (arg1 == 16) {
            this.field2717 = arg0.method1063((byte) 102);
        }
        if (arg2 != 2) {
            this.field2716 = -36;
        }
        field2718++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field2727 = null;
        if (arg0 == 2145578080) {
            field2728 = null;
        }
    }
}
