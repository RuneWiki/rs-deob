import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class100 extends class472 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Z")
    public static boolean field1278 = false;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Lij;")
    public static class266 field1282;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIII)V")
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1280 = arg2;
        this.field1287 = arg0;
        this.field1279 = arg1;
        this.field1283 = arg3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lb;B)I")
    public static final int method568(class201 arg0, byte arg1) {
        ++field1285;
        int var2 = 0;
        if (arg0.method1230(-119, class257.field3764)) {
            ++var2;
        }
        if (arg0.method1230(96, class467.field6580)) {
            ++var2;
        }
        if (arg0.method1230(-126, class236.field3548)) {
            ++var2;
        }
        if (arg0.method1230(109, class258.field3789)) {
            ++var2;
        }
        if (arg0.method1230(arg1 + 166, class329.field4758)) {
            ++var2;
        }
        if (arg0.method1230(-3, class15.field180)) {
            ++var2;
        }
        if (arg0.method1230(100, class124.field1560)) {
            ++var2;
        }
        if (arg0.method1230(-11, class222.field3380)) {
            ++var2;
        }
        if (arg1 != -60) {
            method568((class201) null, (byte) 78);
        }
        if (arg0.method1230(84, class124.field1564)) {
            ++var2;
        }
        if (arg0.method1230(84, class171.field2492)) {
            ++var2;
        }
        if (arg0.method1230(-118, class293.field4251)) {
            ++var2;
        }
        if (arg0.method1230(110, class306.field4361)) {
            ++var2;
        }
        if (arg0.method1230(-100, class153.field2263)) {
            ++var2;
        }
        if (arg0.method1230(arg1 + 170, class238.field3577)) {
            ++var2;
        }
        if (arg0.method1230(109, class37.field481)) {
            ++var2;
        }
        if (arg0.method1230(-94, class144.field1903)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZII)V")
    public final void method16(boolean arg0, int arg1, int arg2) {
        ++field1277;
        int var4 = this.field1287 * arg1 >> 12;
        int var5 = this.field1280 * arg1 >> 12;
        int var6 = this.field1279 * arg2 >> 12;
        int var7 = this.field1283 * arg2 >> 12;
        if (!arg0) {
            this.method16(true, 103, 16);
        }
        class264.method1627(var5, super.field6640, var6, var7, !arg0, var4);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)V")
    public final void method15(int arg0, byte arg1, int arg2) {
        if (arg1 >= -35) {
            this.field1279 = 12;
        }
        ++field1284;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lck;B)I")
    public static final int method569(class419 arg0, byte arg1) {
        ++field1276;
        int var2 = arg0.method2464(2, 0);
        int var3;
        if (~var2 == -1) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2464(5, 0);
        } else if (~var2 != -3) {
            var3 = arg0.method2464(11, 0);
        } else {
            var3 = arg0.method2464(8, 0);
        }
        return arg1 < 31 ? -121 : var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method570(int arg0) {
        field1282 = null;
        if (arg0 != -1) {
            field1286 = -22;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        ++field1281;
        if (arg2 != -6196) {
            method569((class419) null, (byte) 59);
        }
    }
}
