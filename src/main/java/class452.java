import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class452 extends class256 {

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
    public static int field6526 = 104;

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
    public static int field6531 = 0;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "Lal;")
    public static class66 field6528;

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIF)V")
    public class452(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V")
    public static final void method2694(byte arg0) {
        class282.method1669(class512.field7429, false);
        if (arg0 == 74) {
            ++class446.field6393;
            ++field6532;
            class40.field511.method2729(0, false);
        }
    }

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "(I)V")
    public static void method2695(int arg0) {
        if (arg0 != 22462) {
            field6531 = 127;
        }
        field6528 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZI)I")
    public static final int method2696(int arg0, int arg1, boolean arg2, int arg3) {
        ++field6533;
        if (arg2) {
            method2694((byte) 30);
        }
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else {
            return ~var4 == -3 ? -arg3 + 1023 : -arg1 + 1023;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)V")
    public final void method1532(int arg0, int arg1, int arg2, int arg3) {
        ++field6527;
        super.field3259 = arg3;
        super.field3267 = arg2;
        super.field3260 = arg1;
        if (arg0 != 2) {
            field6531 = 89;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZZ)V")
    public static final void method2697(boolean arg0, boolean arg1) {
        ++field6530;
        if (!arg0) {
            method2694((byte) 21);
        }
        for (class433 var2 = (class433) class144.field1850.method153(0); var2 != null; var2 = (class433) class144.field1850.method161(-105)) {
            if (var2.field6148 != null) {
                class113.field1506.method2532(var2.field6148);
                var2.field6148 = null;
            }
            if (var2.field6150 != null) {
                class113.field1506.method2532(var2.field6150);
                var2.field6150 = null;
            }
            var2.method2165(16225);
        }
        if (arg1) {
            for (class433 var3 = (class433) class149.field1884.method153(0); var3 != null; var3 = (class433) class149.field1884.method161(-91)) {
                if (var3.field6148 != null) {
                    class113.field1506.method2532(var3.field6148);
                    var3.field6148 = null;
                }
                var3.method2165(16225);
            }
            for (class433 var4 = (class433) class437.field6263.method2021(122); var4 != null; var4 = (class433) class437.field6263.method2017(-59)) {
                if (var4.field6148 != null) {
                    class113.field1506.method2532(var4.field6148);
                    var4.field6148 = null;
                }
                var4.method2165(16225);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(FI)V")
    public final void method1541(float arg0, int arg1) {
        ++field6534;
        super.field3255 = arg0;
        if (arg1 >= -87) {
            this.method1541(0.5104798F, -117);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)Z")
    public static final boolean method2698(int arg0, int arg1, int arg2) {
        int var3 = class194.field2517[arg0][arg1][arg2];
        if (-class144.field1852 == var3) {
            return false;
        } else if (class144.field1852 == var3) {
            return true;
        } else {
            int var4 = arg1 << class94.field1144;
            int var5 = arg2 << class94.field1144;
            if (class145.method973(var4 + 1, class520.field7520[arg0].method399(arg1, arg2), var5 + 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1 + 1, arg2), var5 + 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1 + 1, arg2 + 1), class376.field4951 + var5 - 1) && class145.method973(var4 + 1, class520.field7520[arg0].method399(arg1, arg2 + 1), class376.field4951 + var5 - 1) && class145.method973(class59.field772 + var4, class520.field7520[arg0].method399(arg1, arg2), var5 + 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1 + 1, arg2), class59.field772 + var5) && class145.method973(class59.field772 + var4, class520.field7520[arg0].method399(arg1, arg2 + 1), class376.field4951 + var5 - 1) && class145.method973(class376.field4951 + var4 - 1, class520.field7520[arg0].method399(arg1, arg2), class59.field772 + var5) && class145.method973(class59.field772 + var4, class520.field7520[arg0].method399(arg1, arg2), class59.field772 + var5)) {
                class194.field2517[arg0][arg1][arg2] = class144.field1852;
                return true;
            } else {
                class194.field2517[arg0][arg1][arg2] = -class144.field1852;
                return false;
            }
        }
    }
}
