import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class175 extends class297 {

    @OriginalMember(owner = "client!hga", name = "N", descriptor = "I")
    private int field2709 = 4096;

    @OriginalMember(owner = "client!hga", name = "K", descriptor = "I")
    private int field2706 = 0;

    @OriginalMember(owner = "client!hga", name = "J", descriptor = "Z")
    public static boolean field2705 = false;

    @OriginalMember(owner = "client!hga", name = "P", descriptor = "I")
    public static int field2711 = 104;

    @OriginalMember(owner = "client!hga", name = "I", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!hga", name = "L", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!hga", name = "M", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!hga", name = "O", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!hga", name = "Q", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2709 = arg0.method1478(842397944);
            }
        } else {
            this.field2706 = arg0.method1478(842397944);
        }
        ++field2704;
        if (arg2 != 31015) {
            method1311(-75, 18, 53);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZII)V")
    public static final void method1309(boolean arg0, int arg1, int arg2) {
        ++field2707;
        if (arg2 < -127) {
            class6 var3 = class284.method1863((byte) -122, arg1, arg0);
            if (var3 != null) {
                var3.method2314((byte) 97);
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
    public class175() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILwq;)I")
    public static final int method1310(int arg0, class169 arg1) {
        ++field2708;
        if (arg0 < 94) {
            method1309(false, -98, -116);
        }
        if (class19.field290 != arg1) {
            if (class746.field10332 == arg1) {
                return 6408;
            } else if (class556.field7676 == arg1) {
                return 6406;
            } else if (class459.field6480 != arg1) {
                if (class16.field267 == arg1) {
                    return 6410;
                } else if (class726.field9831 == arg1) {
                    return 6145;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                return 6409;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field2712;
        if (arg1 != 255) {
            this.field2709 = -121;
        }
        int[] var3 = super.field4165.method127(arg1 + -255, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, 633706337, 0);
            for (int var5 = 0; ~var5 > ~class525.field7275; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field2706 && ~this.field2709 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "(III)Z")
    public static final boolean method1311(int arg0, int arg1, int arg2) {
        if (arg0 < 0) {
            field2711 = 114;
        }
        ++field2710;
        return (34 & arg1) != 0;
    }
}
