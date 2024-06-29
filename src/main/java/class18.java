import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class18 extends class487 {

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lcu;")
    public static class206 field295 = new class206(32, -1);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Ldb;")
    public static class298 field308 = new class298(54, 3);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Ldb;")
    public static class298 field310 = new class298(7, 5);

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[Lae;")
    public static class233[] field294;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V")
    public static final void method185(byte arg0) {
        field306++;
        class135 var1 = (class135) class94.field1444.method3257(-82);
        if (arg0 > -114) {
            method185((byte) -16);
        }
        while (var1 != null) {
            if (var1.field2205 > 0) {
                var1.field2205--;
            }
            if (var1.field2205 != 0) {
                if (var1.field2202 > 0) {
                    var1.field2202--;
                }
                if (var1.field2202 == 0 && var1.field2195 >= 1 && var1.field2198 >= 1 && var1.field2195 <= class34.field530 - 2 && var1.field2198 <= class34.field531 - 2 && (var1.field2208 < 0 || class382.method2227(13, var1.field2208, var1.field2206))) {
                    class585.method3217(var1.field2201, -1, var1.field2206, var1.field2198, var1.field2194, -79, var1.field2209, var1.field2208, var1.field2195);
                    var1.field2202 = -1;
                    if (var1.field2208 == var1.field2203 && var1.field2203 == -1) {
                        var1.method2797(-110);
                    } else if (var1.field2208 == var1.field2203 && var1.field2209 == var1.field2207 && var1.field2206 == var1.field2204) {
                        var1.method2797(122);
                    }
                }
            } else if (var1.field2203 < 0 || class382.method2227(13, var1.field2203, var1.field2204)) {
                class585.method3217(var1.field2201, -1, var1.field2204, var1.field2198, var1.field2194, -91, var1.field2207, var1.field2203, var1.field2195);
                var1.method2797(-97);
            }
            var1 = (class135) class94.field1444.method3263((byte) -94);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Z")
    public final boolean method139(int arg0) {
        field298++;
        if (arg0 != 2) {
            field308 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        field307++;
        if (arg0 != -77) {
            method185((byte) 31);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Z")
    public static final boolean method186(int arg0) {
        field296++;
        boolean var1 = true;
        if (class24.field418 == null) {
            if (class658.field9155.method2549(class540.field7120, 3015)) {
                class24.field418 = class500.method2780(class658.field9155, class540.field7120);
            } else {
                var1 = false;
            }
        }
        if (arg0 != -2) {
            field308 = null;
        }
        if (class642.field8625 == null) {
            if (class658.field9155.method2549(class360.field4870, 3015)) {
                class642.field8625 = class500.method2780(class658.field9155, class360.field4870);
            } else {
                var1 = false;
            }
        }
        if (class62.field929 == null) {
            if (class658.field9155.method2549(class441.field6052, 3015)) {
                class62.field929 = class500.method2780(class658.field9155, class441.field6052);
            } else {
                var1 = false;
            }
        }
        if (class301.field4201 == null) {
            if (class68.field1035.method2549(class524.field6988, 3015)) {
                class301.field4201 = class154.method1084(class68.field1035, (byte) 40, class524.field6988);
            } else {
                var1 = false;
            }
        }
        if (class273.field3799 == null) {
            if (class658.field9155.method2549(class524.field6988, arg0 ^ 0xFFFFF439)) {
                class273.field3799 = class500.method2769(class658.field9155, class524.field6988);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field294 = null;
        field310 = null;
        field308 = null;
        if (arg0 < -45) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILoa;ILni;ZZI)V")
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg5) {
            field301++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(B)I")
    public abstract int method188(byte arg0);

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field309 = arg1;
        this.field299 = arg6;
        this.field304 = arg3;
        this.field300 = arg0;
        this.field305 = arg2;
        this.field303 = arg4;
        this.field297 = arg5;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[FB)[F")
    public static final float[] method189(int arg0, float[] arg1, byte arg2) {
        field302++;
        float[] var3 = new float[arg0];
        if (arg2 != 125) {
            method186(-24);
        }
        class83.method687(arg1, 0, var3, 0, arg0);
        return var3;
    }
}
