import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class386 extends class392 {

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "Lhk;")
    public static class153 field5402 = new class153(9, 0, 4, 1);

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(ILw;)V")
    public class386(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lw;)V")
    public class386(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2323(int arg0, byte arg1, int arg2) {
        ++field5403;
        if (arg1 != -86) {
            field5402 = null;
        }
        return ~(arg0 & 458752) != -1 | class289.method1825(arg0, arg2, -121) || class692.method3890(arg0, arg2, (byte) 126);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            return 124;
        } else {
            ++field5408;
            return 1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IJ)I")
    public static final int method2324(int arg0, long arg1) {
        ++field5409;
        if (arg0 != 1) {
            field5402 = null;
        }
        class724.method4017((byte) 126, arg1);
        return class99.field1449.get(1);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field5406;
        if (arg1 >= -124) {
            return -125;
        } else if (super.field5454.method3782((byte) 84)) {
            return 3;
        } else {
            return ~arg0 != -1 && ~super.field5454.field9454.method4010(17539) != -2 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (!arg0) {
            if (super.field5454.method3782((byte) -14)) {
                super.field5452 = 0;
            }
            ++field5404;
            if (~super.field5452 > -1 && super.field5452 > 2) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        int var3 = -22 % ((-80 - arg0) / 38);
        ++field5400;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZIZIZ)I")
    public static final int method2325(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        ++field5401;
        class393 var5 = class275.method1745(arg4, (byte) -116, arg1);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            int var7 = 0;
            if (arg2) {
                field5402 = null;
            }
            while (var5.field5458.length > var7) {
                if (~var5.field5458[var7] <= -1 && class422.field5873.field6908 > var5.field5458[var7]) {
                    class42 var8 = class422.field5873.method2937((byte) -97, var5.field5458[var7]);
                    int var9 = var8.method308(arg3, (byte) 91, class498.field6854.method3434(arg3, 10549).field1331);
                    if (!arg0) {
                        var6 += var9;
                    } else {
                        var6 += var5.field5460[var7] * var9;
                    }
                }
                ++var7;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)I")
    public final int method2326(int arg0) {
        ++field5407;
        return arg0 != 17539 ? -82 : super.field5452;
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)V")
    public static void method2327(boolean arg0) {
        field5402 = null;
        if (!arg0) {
            field5402 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)Z")
    public final boolean method2328(int arg0) {
        ++field5405;
        if (arg0 != 0) {
            return true;
        } else {
            return !super.field5454.method3782((byte) -31);
        }
    }
}
