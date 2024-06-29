import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class191 extends class94 {

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    private final int field3340;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    private final int field3348;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    private final int field3345;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    private final int field3343;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lma;")
    public static class187 field3338;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "Lal;")
    public static class227 field3347;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "[Lbl;")
    public static class33[] field3350;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[Lti;")
    public static class5[] field3346;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V")
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3340 = arg2;
        this.field3348 = arg3;
        this.field3345 = arg0;
        this.field3343 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
    public static final void method1322(int arg0, boolean arg1) {
        ++field3341;
        class157 var2 = class257.method1740(arg0, (byte) -79, 1);
        if (arg1) {
            method1325(false, -110, -21, (class2) null, -97, true, (class2) null);
        }
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Z")
    public static final boolean method1323(int arg0, int arg1) {
        if (arg0 != 2891) {
            field3346 = null;
        }
        ++field3339;
        return (arg1 & 1) != 0;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1324(int arg0) {
        field3347 = null;
        if (arg0 >= 113) {
            field3338 = null;
            field3346 = null;
            field3350 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIILud;IZLud;)I")
    public static final int method1325(boolean arg0, int arg1, int arg2, class2 arg3, int arg4, boolean arg5, class2 arg6) {
        ++field3335;
        int var7 = class45.method342(arg3, (byte) -71, arg0, arg6, arg4);
        if (~var7 != arg1) {
            return !arg0 ? var7 : -var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class45.method342(arg3, (byte) -71, arg5, arg6, arg2);
            return !arg5 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)V")
    public final void method602(byte arg0, int arg1, int arg2) {
        ++field3337;
        int var4 = this.field3345 * arg2 >> 12;
        int var5 = this.field3343 * arg1 >> 12;
        int var6 = 19 % ((arg0 - 12) / 45);
        int var7 = this.field3340 * arg2 >> 12;
        int var8 = this.field3348 * arg1 >> 12;
        class7.method79(var8, var4, 0, super.field1521, var7, var5);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)V")
    public final void method601(int arg0, byte arg1, int arg2) {
        if (arg1 != 77) {
            field3350 = null;
        }
        ++field3344;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)V")
    public final void method597(int arg0, int arg1, byte arg2) {
        ++field3336;
        int var4 = this.field3345 * arg1 >> 12;
        int var5 = this.field3343 * arg0 >> 12;
        int var6 = this.field3348 * arg0 >> 12;
        int var7 = this.field3340 * arg1 >> 12;
        class159.method1135(2, super.field1521, super.field1528, super.field1520, var5, var7, var4, var6);
        int var8 = 30 / ((arg2 - -53) / 60);
    }
}
