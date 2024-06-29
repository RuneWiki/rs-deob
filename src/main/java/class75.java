import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class75 extends class218 {

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    private final int field1474;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    private final int field1471;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    private final int field1463;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private final int field1466;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Lvd;")
    public static class222 field1475 = class212.method1357(" )2> <col=ffffff>", 10731);

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "Lka;")
    public static class109 field1469 = new class109(8);

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "[J")
    public static long[] field1477 = new long[32];

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "Lnc;")
    public static class141 field1476;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        if (arg0 != 71) {
            this.method432(48, 115, 60);
        }
        int var4 = this.field1474 * arg2 >> 12;
        ++field1467;
        int var5 = this.field1466 * arg1 >> 12;
        int var6 = this.field1463 * arg1 >> 12;
        int var7 = this.field1471 * arg2 >> 12;
        class37.method301(super.field4046, 3, super.field4043, var5, var7, var4, var6, super.field4042);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)Lqh;")
    public static final class176 method504(boolean arg0, int arg1) {
        ++field1470;
        class176 var2 = (class176) class7.field115.method601((long) arg1, 45);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class159.field3038.method33(-29616, 27, arg1);
            class176 var4 = new class176();
            if (var3 != null) {
                var4.method1108((byte) -78, new class109(var3));
            }
            class7.field115.method593((long) arg1, var4, (byte) -12);
            return !arg0 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIIIII)V")
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1474 = arg2;
        this.field1471 = arg0;
        this.field1463 = arg3;
        this.field1466 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        if (arg2 == 59) {
            ++field1464;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BB)[B")
    public static final byte[] method505(byte[] arg0, byte arg1) {
        ++field1468;
        class109 var2 = new class109(arg0);
        int var3 = var2.method662((byte) -104);
        int var4 = 96 / ((-22 - arg1) / 61);
        int var5 = var2.method710(28908);
        if (var5 >= 0 && (class143.field2771 == 0 || class143.field2771 >= var5)) {
            if (~var3 == -1) {
                byte[] var6 = new byte[var5];
                var2.method669(0, 0, var5, var6);
                return var6;
            } else {
                int var7 = var2.method710(28908);
                if (~var7 > -1 || ~class143.field2771 != -1 && ~class143.field2771 > ~var7) {
                    throw new RuntimeException();
                } else {
                    byte[] var8 = new byte[var7];
                    if (~var3 != -2) {
                        class135.field2600.method982(var2, var8, 0);
                    } else {
                        class147.method932(var8, var7, arg0, var5, 9);
                    }
                    return var8;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1475 = null;
        field1476 = null;
        if (arg0 != -18524) {
            method505((byte[]) null, (byte) 17);
        }
        field1469 = null;
        field1477 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V")
    public final void method434(byte arg0, int arg1, int arg2) {
        int var4 = this.field1471 * arg1 >> 12;
        int var5 = this.field1474 * arg1 >> 12;
        if (arg0 <= 55) {
            field1469 = null;
        }
        int var6 = this.field1463 * arg2 >> 12;
        int var7 = this.field1466 * arg2 >> 12;
        ++field1465;
        class102.method631(super.field4043, var6, var7, var4, -33, var5);
    }
}
