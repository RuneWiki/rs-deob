import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class274 extends class71 {

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "Z")
    public static boolean field3972 = false;

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "[I")
    public static int[] field3974 = new int[1000];

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!uia", name = "s", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!uia", name = "t", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!uia", name = "u", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!uia", name = "v", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!uia", name = "w", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "Luu;")
    public static class237 field3969;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "[Luq;")
    public static class318[] field3967;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1836(byte arg0) {
        field3973++;
        if (arg0 < 106) {
            field3967 = null;
        }
        return (this.field3970 & 0x4C7D76) >> 22 != 0;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1837(int arg0, int arg1) {
        if (class618.field8298 == null || class618.field8298.length < arg0) {
            class618.field8298 = new int[arg0];
        }
        if (arg1 != -2) {
            field3967 = null;
        }
        field3979++;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)I", line = 33)
    public final int method1838(byte arg0) {
        field3968++;
        if (arg0 <= 94) {
            this.method1844(27);
        }
        return class736.method4100(127, this.field3970);
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(B)I", line = 44)
    public final int method1839(byte arg0) {
        field3977++;
        int var2 = 40 / ((26 - arg0) / 58);
        return this.field3970 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)Z", line = 57)
    public final boolean method1840(int arg0, byte arg1) {
        field3966++;
        int var3 = -106 % ((-arg1 - 19) / 63);
        return (this.field3970 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "(B)Z", line = 74)
    public final boolean method1841(byte arg0) {
        if (arg0 < 100) {
            return true;
        } else {
            field3975++;
            return (this.field3970 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "(B)V", line = 85)
    public static void method1842(byte arg0) {
        if (arg0 == 56) {
            field3969 = null;
            field3967 = null;
            field3974 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1843(int arg0) {
        if (class81.field1179 > 1) {
            class332.field4707.method2158(4, class332.field4707.field4771, -15);
        } else {
            class332.field4707.method2158(2, class332.field4707.field4771, arg0 - 20099);
        }
        field3976++;
        if (arg0 != 20084) {
            field3972 = true;
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(II)V", line = 124)
    public class274(int arg0, int arg1) {
        this.field3971 = arg1;
        this.field3970 = arg0;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)Z", line = 137)
    public final boolean method1844(int arg0) {
        field3978++;
        if (arg0 != 1000) {
            this.method1839((byte) 58);
        }
        return (this.field3970 & 0x1) != 0;
    }
}
