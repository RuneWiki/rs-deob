import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class557 extends class9 {

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field8210 = 2;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "Lvj;")
    public static class373 field8204 = new class373(64, 5);

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public int field8201;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public int field8207;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public int field8211;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "Ljava/lang/Object;")
    public static Object field8215;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "Ljava/lang/String;")
    public String field8216;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V", line = 3)
    public final void method3257(int arg0) {
        super.field67 |= Long.MIN_VALUE;
        if (arg0 == 1948) {
            ++field8214;
            if (~this.method3266(-6013) == -1L) {
                class316.field4044.method2070(this, 85);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLdn;)V", line = 18)
    public static final void method3258(byte arg0, class438 arg1) {
        ++field8209;
        class561.field8251 = arg1;
        if (arg0 != 118) {
            field8204 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V", line = 29)
    public static void method3259(int arg0) {
        if (arg0 <= 31) {
            method3258((byte) -32, (class438) null);
        }
        field8215 = null;
        field8204 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIII)V", line = 41)
    public static final void method3260(byte arg0, int arg1, int arg2, int arg3) {
        ++field8203;
        class557 var4 = class93.method564(11, -14073, arg1);
        var4.method3257(1948);
        var4.field8207 = arg3;
        int var5 = 124 / ((arg0 - 67) / 48);
        var4.field8201 = arg2;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)Z", line = 55)
    public static final boolean method3261(int arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            return false;
        } else {
            ++field8205;
            return (32768 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)I", line = 68)
    public final int method3262(int arg0) {
        if (arg0 != 11) {
            return 93;
        } else {
            ++field8208;
            return (int) super.field7967;
        }
    }

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)I", line = 83)
    public final int method3263(int arg0) {
        if (arg0 != 65535) {
            method3259(10);
        }
        ++field8202;
        return (int) (255L & super.field7967 >>> 32);
    }

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "(I)V", line = 99)
    public final void method3264(int arg0) {
        if (arg0 == -1037624096) {
            ++field8213;
            super.field67 = class190.method1030(false) - -500L | super.field67 & Long.MIN_VALUE;
            class520.field7307.method2070(this, -96);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILet;)V", line = 112)
    public static final void method3265(int arg0, int arg1, int arg2, class509 arg3) {
        ++field8206;
        class309 var4 = arg3.method2930(0, class210.field2560);
        if (arg1 >= -27) {
            method3261(44, 43, 73);
        }
        if (var4 != null) {
            class210.field2560.method1107(arg0, arg2, arg3.field7094 + arg0, arg3.field7059 + arg2);
            if (~class275.field3625 > -4) {
                class199.field2399.method288((float) arg3.field7094 / 2.0F + (float) arg0, (float) arg3.field7059 / 2.0F + (float) arg2, 4096, (int) (-class558.field8223) << 2 & 65532, var4, arg0, arg2);
            } else {
                class210.field2560.method1180(-16777216, var4, arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)J", line = 137)
    public final long method3266(int arg0) {
        if (arg0 != -6013) {
            field8215 = null;
        }
        ++field8212;
        return super.field67 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I", line = 148)
    public static final int method3267(int arg0, int arg1) {
        return class597.field8645 != null ? class597.field8645[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(II)V", line = 153)
    public class557(int arg0, int arg1) {
        super.field7967 = (long) arg1 | (long) arg0 << 32;
    }
}
