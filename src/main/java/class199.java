import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class199 extends class117 {

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "[I")
    public static int[] field2897 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[I")
    public static int[] field2896;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method1441(int arg0) {
        if (arg0 > -79) {
            field2900 = 69;
        }
        field2899++;
        return (this.field2901 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I", line = 17)
    public final int method1442(boolean arg0) {
        if (!arg0) {
            this.method1447(true);
        }
        field2898++;
        return class206.method1510(this.field2901, arg0);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)Z", line = 38)
    public final boolean method1443(boolean arg0) {
        field2893++;
        if (!arg0) {
            this.field2904 = 2;
        }
        return (this.field2901 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)Z", line = 51)
    public final boolean method1444(int arg0) {
        if (arg0 != 163461855) {
            this.method1444(39);
        }
        field2892++;
        return ((this.field2901 & 0x5DC802) >> 22) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)Z", line = 64)
    public final boolean method1445(int arg0) {
        int var2 = 51 / ((arg0 + 15) / 62);
        field2895++;
        return (this.field2901 & 0x18340CF7) >> 28 != 0;
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V", line = 73)
    public static void method1446(int arg0) {
        field2896 = null;
        field2897 = null;
        if (arg0 != 0) {
            method1446(117);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)Z", line = 87)
    public final boolean method1447(boolean arg0) {
        if (!arg0) {
            field2897 = (int[]) null;
        }
        field2889++;
        return (this.field2901 & 0x37B632) >> 21 != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Ljava/lang/Object;B[J)V", line = 98)
    public static final void method1448(Object[] arg0, byte arg1, long[] arg2) {
        class314.method2196(0, 51, arg2.length - 1, arg2, arg0);
        field2903++;
        int var3 = 115 / ((arg1 + 61) / 58);
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)I", line = 108)
    public final int method1449(int arg0) {
        if (arg0 == 7) {
            field2891++;
            return this.field2901 >> 18 & 0x7;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z", line = 119)
    public final boolean method1450(byte arg0) {
        if (arg0 > -123) {
            this.method1442(true);
        }
        field2890++;
        return (this.field2901 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)Z", line = 133)
    public final boolean method1451(byte arg0) {
        if (arg0 >= -86) {
            field2897 = (int[]) null;
        }
        field2894++;
        return (this.field2901 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Z", line = 147)
    public final boolean method1452(boolean arg0, int arg1) {
        if (arg0) {
            this.field2901 = 4;
        }
        field2902++;
        return (this.field2901 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V", line = 159)
    public class199(int arg0, int arg1) {
        this.field2901 = arg0;
        this.field2904 = arg1;
    }
}
