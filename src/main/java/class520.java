import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class520 extends class146 implements class176 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private int field7701;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field7708 = 0;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[I")
    public static int[] field7705 = new int[2048];

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "[S")
    public static short[] field7710 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public static void method3094(int arg0) {
        if (arg0 != 9593) {
            method3094(-63);
        }
        field7710 = null;
        field7705 = null;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
    public final int method1269(int arg0) {
        int var2 = 30 / ((-36 - arg0) / 34);
        ++field7704;
        return this.field7701;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)J")
    public final long method1268(int arg0) {
        ++field7702;
        if (arg0 != 32127) {
            method3095(16, true, 99, -105, 61, 86);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIIII)V")
    public static final void method3095(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= class158.field2302 && class410.field6176 <= arg5) {
            boolean var6;
            if (~arg2 <= ~class396.field6021) {
                if (arg2 <= class443.field6591) {
                    var6 = true;
                } else {
                    var6 = false;
                    arg2 = class443.field6591;
                }
            } else {
                arg2 = class396.field6021;
                var6 = false;
            }
            boolean var7;
            if (class396.field6021 > arg4) {
                arg4 = class396.field6021;
                var7 = false;
            } else if (class443.field6591 < arg4) {
                var7 = false;
                arg4 = class443.field6591;
            } else {
                var7 = true;
            }
            if (class410.field6176 > arg0) {
                arg0 = class410.field6176;
            } else {
                class271.method1736(arg4, arg3, arg2, -11, class23.field356[arg0++]);
            }
            if (class158.field2302 < arg5) {
                arg5 = class158.field2302;
            } else {
                class271.method1736(arg4, arg3, arg2, -11, class23.field356[arg5--]);
            }
            if (var6 && var7) {
                for (int var8 = arg0; arg5 >= var8; ++var8) {
                    int[] var9 = class23.field356[var8];
                    var9[arg2] = var9[arg4] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg5; ++var10) {
                    class23.field356[var10][arg2] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg0; arg5 >= var11; ++var11) {
                    class23.field356[var11][arg4] = arg3;
                }
            }
        }
        ++field7709;
        if (!arg1) {
            field7710 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
    public final void method971(boolean arg0) {
        super.field2098.method1821(-71, this);
        ++field7706;
        if (arg0) {
            field7708 = 80;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lbv;I[BIZ)V")
    public class520(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7701 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[B)V")
    public final void method1270(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method969(false, arg3, arg0);
        int var5 = 124 / ((-65 - arg1) / 49);
        ++field7703;
        this.field7701 = arg2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
    public final int method1267(int arg0) {
        if (arg0 != 32675) {
            this.method971(false);
        }
        ++field7711;
        return super.field2096;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lns;Lns;Lqa;B)V")
    public static final void method3096(class438 arg0, class438 arg1, class496 arg2, byte arg3) {
        ++field7707;
        class326.field4997 = class392.method2411(class394.field5989, (byte) -110, arg0, 0);
        class23.field349 = arg2.method1095(class326.field4997, class476.method2847(arg1, class394.field5989, 0), true);
        class34.field532 = class392.method2411(class66.field917, (byte) -119, arg0, 0);
        if (arg3 != 104) {
            field7705 = null;
        }
        class84.field1153 = arg2.method1095(class34.field532, class476.method2847(arg1, class66.field917, 0), true);
        class472.field6901 = class392.method2411(class14.field238, (byte) -114, arg0, 0);
        class104.field1497 = arg2.method1095(class472.field6901, class476.method2847(arg1, class14.field238, 0), true);
    }
}
