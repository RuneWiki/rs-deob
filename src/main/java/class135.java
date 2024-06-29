import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class135 extends class626 {

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[J")
    public static long[] field2105 = new long[32];

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "[I")
    public static int[] field2113 = new int[2];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Lqaa;")
    public class27 field2106;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Lrca;")
    public class452 field2109;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method1067(int arg0) {
        if (arg0 >= 8) {
            field2105 = null;
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILeq;)I")
    public static final int method1068(int arg0, class209 arg1) {
        field2108++;
        int var2 = arg0;
        if (arg1.method1472(-25711, class25.field363)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1472(-25711, class281.field4005)) {
            var2++;
        }
        if (arg1.method1472(-25711, class121.field1874)) {
            var2++;
        }
        if (arg1.method1472(-25711, class623.field8969)) {
            var2++;
        }
        if (arg1.method1472(-25711, class80.field1496)) {
            var2++;
        }
        if (arg1.method1472(-25711, class202.field2887)) {
            var2++;
        }
        if (arg1.method1472(-25711, class705.field9870)) {
            var2++;
        }
        if (arg1.method1472(-25711, class435.field6083)) {
            var2++;
        }
        if (arg1.method1472(-25711, class423.field5922)) {
            var2++;
        }
        if (arg1.method1472(-25711, class56.field1054)) {
            var2++;
        }
        if (arg1.method1472(-25711, class144.field2208)) {
            var2++;
        }
        if (arg1.method1472(arg0 - 25711, class561.field7958)) {
            var2++;
        }
        if (arg1.method1472(-25711, class337.field4762)) {
            var2++;
        }
        if (arg1.method1472(arg0 - 25711, class144.field2219)) {
            var2++;
        }
        if (arg1.method1472(-25711, class512.field7308)) {
            var2++;
        }
        if (arg1.method1472(-25711, class172.field2500)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public final void method1069(int arg0) {
        field2107++;
        if (arg0 == -30078 && class436.field6093 < class312.field4406.length) {
            class312.field4406[class436.field6093++] = this;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z")
    public static final boolean method1070(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1070(-110, 121, 108);
        }
        field2111++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1071(String arg0, byte arg1) {
        field2110++;
        if (arg1 != 68) {
            return;
        }
        class135 var2 = class59.method663(123);
        var2.field2109.method263((byte) -128, class433.field6067.field4035);
        var2.field2109.method223(1493807496, 0);
        int var3 = var2.field2109.field469;
        var2.field2109.method223(arg1 ^ 0x5909B1CC, 629);
        int[] var4 = class307.method1993(var2, 100);
        int var5 = var2.field2109.field469;
        var2.field2109.method287((byte) 0, arg0);
        var2.field2109.method263((byte) -101, class744.field10426);
        var2.field2109.field469 += 7;
        var2.field2109.method261(var2.field2109.field469, (byte) 41, var4, var5);
        var2.field2109.method231(var2.field2109.field469 - var3, (byte) 110);
        class539.method3178(var2, -18925);
        class611.field8842 = 1;
        class120.field1873 = 0;
        class229.field3272 = 0;
        class582.field8223 = -3;
    }
}
