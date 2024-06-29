import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class268 extends class216 {

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lbd;")
    public static class162 field4486 = class17.method142(0, "<br>(X");

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field4483 = 0;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lbd;")
    private static class162 field4488 = class17.method142(0, "Opened title screen");

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lbd;")
    public static class162 field4474 = field4488;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lbd;")
    public static class162 field4489 = class17.method142(0, "Null");

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field4482 = 0;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "[J")
    public static long[] field4491 = new long[32];

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lbe;")
    private class235 field4476;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lbj;")
    public static class276 field4487;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "Lrb;")
    public static class66 field4484;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lb;IZ)V", line = 5)
    private final void method1833(class94 arg0, int arg1, boolean arg2) {
        field4477++;
        if (arg1 == 249) {
            int var4 = arg0.method756(915905888);
            if (this.field4476 == null) {
                int var5 = class237.method1678(var4, -31981);
                this.field4476 = new class235(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method756(915905888) == 1;
                int var8 = arg0.method732(-1);
                class151 var9;
                if (var7) {
                    var9 = new class93(arg0.method744((byte) 56));
                } else {
                    var9 = new class188(arg0.method747(false));
                }
                this.field4476.method1674(var9, false, (long) var8);
            }
        }
        if (!arg2) {
            this.method1834((class94) null, true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lb;Z)V", line = 50)
    public final void method1834(class94 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field4485++;
        while (true) {
            int var3 = arg0.method756(915905888);
            if (var3 == 0) {
                return;
            }
            this.method1833(arg0, var3, !arg1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLbd;I)Lbd;", line = 86)
    public final class162 method1835(byte arg0, class162 arg1, int arg2) {
        field4481++;
        if (this.field4476 == null) {
            return arg1;
        }
        class93 var4 = (class93) this.field4476.method1672((long) arg2, 19760);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 != -122) {
                this.method1834((class94) null, false);
            }
            return var4.field1649;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V", line = 109)
    public static void method1836(byte arg0) {
        field4488 = null;
        field4484 = null;
        field4491 = null;
        field4489 = null;
        field4487 = null;
        if (arg0 == 58) {
            field4474 = null;
            field4486 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZI)V", line = 127)
    public static final void method1837(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 < arg1) {
            class3.method14(arg2, arg0, arg1, class184.field3180[arg4], -123);
        } else {
            class3.method14(arg2, arg1, arg0, class184.field3180[arg4], -113);
        }
        if (arg3) {
            field4480++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)I", line = 146)
    public final int method1838(int arg0, byte arg1, int arg2) {
        field4479++;
        if (this.field4476 == null) {
            return arg2;
        }
        class188 var4 = (class188) this.field4476.method1672((long) arg0, arg1 ^ 0xFFFFB2B5);
        if (arg1 != -123) {
            method1836((byte) 66);
        }
        return var4 == null ? arg2 : var4.field3237;
    }
}
