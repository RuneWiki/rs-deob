import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class292 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4418 = 3353893;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    public static int[] field4425 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lth;")
    public static class57 field4423 = new class57(5);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Z")
    public static boolean field4427 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIILei;II)Z", line = 8)
    public static final boolean method2097(int arg0, int arg1, int arg2, int arg3, class261 arg4, int arg5, int arg6) {
        field4424++;
        class329 var7 = class259.method1903(arg4.field3931, -4576);
        if (var7.field4950 == -1) {
            return true;
        }
        int var8;
        if (arg4.field3892) {
            int var9 = arg4.field3947 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class234 var10 = var7.method2278(true, arg4.field3930, var8);
        if (var10 == null) {
            return false;
        }
        if (arg6 != 26354) {
            field4428 = 23;
        }
        int var11 = arg4.field3962;
        int var12 = arg4.field3907;
        if ((var8 & 0x1) == 1) {
            var11 = arg4.field3907;
            var12 = arg4.field3962;
        }
        int var13 = var10.field3719;
        int var14 = var10.field3713;
        if (var7.field4945) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field4946 == 0) {
            var10.method1737(arg2 * 4 + 48, 48 - -((-var12 + 104 + -arg5) * 4), var13, var14);
        } else {
            var10.method1743(arg2 * 4 + 48, (-arg5 + -var12 + 104) * 4 + 48, var13, var14, var7.field4946);
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V", line = 63)
    public static final void method2098(int arg0, int arg1) {
        class299.field4473 = -1;
        class147.field2114 = arg0;
        if (arg1 < 19) {
            method2101((byte) 23);
        }
        class362.field5742 = -1;
        field4420++;
        class259.method1905(-101);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V", line = 83)
    public static final void method2099(byte arg0, int arg1, int arg2) {
        field4426++;
        class95 var3 = class227.method1699(5, -1855723168, arg2);
        if (arg0 != 108) {
            method2101((byte) -15);
        }
        var3.method738((byte) 12);
        var3.field1328 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 106)
    public static void method2100(int arg0) {
        field4425 = null;
        if (arg0 != 1) {
            method2099((byte) -112, 118, -12);
        }
        field4423 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 120)
    public static final void method2101(byte arg0) {
        field4417++;
        if (arg0 != 34) {
            return;
        }
        int var1 = class362.method2546(1);
        if (var1 == 0) {
            class170.field2456 = (byte[][][]) null;
            class294.method2102(12295, 0);
        } else if (var1 == 1) {
            class9.method56((byte) 0, -25773);
            class294.method2102(12295, 512);
            if (class230.field3491 != null) {
                class312.method2184(22326);
            }
        } else {
            class9.method56((byte) (class117.field1662 - 4 & 0xFF), -25773);
            class294.method2102(arg0 ^ 0x3025, 2);
        }
        class102.field1455 = class321.field4835;
    }
}
