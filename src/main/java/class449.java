import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class449 extends class128 {

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public int field6527;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public int field6520;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public int field6524;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public int field6521;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field6523 = 0;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field6522 = 0;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field6530 = 0;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Z")
    public static boolean field6529 = false;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBII)V")
    public static final void method2768(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6519++;
        int var6 = (arg4 - 32) * arg4 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        class211.field2865[0].method93(arg5, arg0);
        int var7 = (arg4 - (var6 + 32)) * arg1 / (arg2 - arg4);
        class211.field2865[1].method93(arg5, arg4 + arg0 - 16);
        class88.field1003.method1860(arg0 + 16, -3272, 16, arg5, arg4 - 32, class77.field877);
        class88.field1003.method1860(arg0 + var7 + 16, -3272, 16, arg5, var6, class388.field5542);
        if (arg3 != -109) {
            return;
        }
        class88.field1003.method1861(arg0 + var7 + 16, class234.field3219, true, var6, arg5);
        class88.field1003.method1861(arg0 + var7 + 16, class234.field3219, true, var6, arg5 + 1);
        class88.field1003.method1857(arg0 + var7 + 16, class234.field3219, 53, 16, arg5);
        class88.field1003.method1857(var7 + arg0 + 17, class234.field3219, 96, 16, arg5);
        class88.field1003.method1861(var7 + arg0 + 16, class34.field339, true, var6, arg5 + 15);
        class88.field1003.method1861(arg0 + var7 + 17, class34.field339, true, var6 - 1, arg5 - -14);
        class88.field1003.method1857(arg0 + var7 + var6 + 15, class34.field339, -122, 16, arg5);
        class88.field1003.method1857(arg0 + 14 - (-var7 - var6), class34.field339, -120, 15, arg5 + 1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I")
    public static final int method2769(int arg0, byte arg1) {
        field6528++;
        if (arg1 != -13) {
            field6518 = 124;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([[II)V")
    public static final void method2770(int[][] arg0, int arg1) {
        if (arg1 != 32) {
            method2771(117);
        }
        field6531++;
        class153.field1932 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
    public static final void method2771(int arg0) {
        if (class414.field5973 != null) {
            class414.field5973.method2156(arg0 ^ 0xFFFFFF1F);
        }
        field6525++;
        if (class281.field3855 != null) {
            class281.field3855.method2156(255);
        }
        if (arg0 != -32) {
            field6523 = -91;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIII)V")
    public class449(int arg0, int arg1, int arg2, int arg3) {
        this.field6527 = arg1;
        this.field6520 = arg2;
        this.field6524 = arg3;
        this.field6521 = arg0;
    }
}
