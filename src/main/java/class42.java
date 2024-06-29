import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class42 extends class240 {

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lsa;")
    public static class110 field748 = new class110(32);

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Z")
    public static boolean field751 = false;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method335(byte arg0) {
        int var2 = 60 / ((-arg0 - 72) / 32);
        field740++;
        return (this.field738 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z", line = 17)
    public final boolean method336(byte arg0) {
        field747++;
        if (arg0 != 56) {
            method346(101);
        }
        return ((this.field738 & 0x16933E8F) >> 28) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Z", line = 29)
    public final boolean method337(int arg0) {
        if (arg0 == -20818) {
            field737++;
            return ((this.field738 & 0x247E484D) >> 29) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I", line = 41)
    public final int method338(byte arg0) {
        field753++;
        if (arg0 != 112) {
            this.method335((byte) 57);
        }
        return this.field738 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 54)
    public static final void method339(int arg0, int arg1) {
        for (class240 var2 = class269.field4170.method841(0); var2 != null; var2 = class269.field4170.method842((byte) -40)) {
            if (((long) arg1) == (var2.field3734 >> 48 & 0xFFFFL)) {
                var2.method1701(arg0 ^ 0xFFFFFE0B);
            }
        }
        field741++;
        if (arg0 != 412) {
            field754 = -21;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLja;)V", line = 78)
    public static final void method340(byte arg0, class64 arg1) {
        class210.field3354 = arg1;
        field742++;
        class222.field3565 = class210.field3354.method465(4, 0);
        if (arg0 != 29) {
            field754 = 71;
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)Z", line = 95)
    public final boolean method341(int arg0) {
        field745++;
        if (arg0 == 281102591) {
            return (this.field738 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Z", line = 106)
    public final boolean method342(int arg0, int arg1) {
        field744++;
        if (arg1 != 1) {
            field748 = (class110) null;
        }
        return (this.field738 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)Z", line = 118)
    public final boolean method343(int arg0) {
        if (arg0 <= 63) {
            field754 = 122;
        }
        field743++;
        return (this.field738 & 0x4595736E) >> 30 != 0;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Z", line = 129)
    public final boolean method344(byte arg0) {
        if (arg0 < 23) {
            return true;
        } else {
            field755++;
            return (this.field738 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)I", line = 140)
    public final int method345(int arg0) {
        if (arg0 != 0) {
            this.field746 = -72;
        }
        field752++;
        return class203.method1479(this.field738, 261782);
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V", line = 152)
    public static void method346(int arg0) {
        field748 = null;
        if (arg0 >= -32) {
            field748 = (class110) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[JI)V", line = 162)
    public static final void method347(int[] arg0, long[] arg1, int arg2) {
        class229.method1660(arg0, arg1.length - 1, arg1, arg2, -67);
        field750++;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V", line = 173)
    public class42(int arg0, int arg1) {
        this.field738 = arg0;
        this.field746 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)Z", line = 193)
    public final boolean method348(int arg0) {
        field749++;
        if (arg0 != 0) {
            field754 = -34;
        }
        return (this.field738 >> 21 & 0x1) != 0;
    }
}
