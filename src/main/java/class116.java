import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class116 extends class230 {

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "Ltn;")
    public static class60 field1568 = new class60(7, 8);

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[Lo;")
    public static class24[] field1567;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 5)
    public static final void method776(byte arg0) {
        int var1 = -101 / ((arg0 - -60) / 32);
        for (class214 var2 = (class214) class363.field5190.method2655(15152); var2 != null; var2 = (class214) class363.field5190.method2660((byte) 67)) {
            if (class338.method2018(true, var2.field3094)) {
                class440.method2578(-69, var2);
            }
        }
        ++field1575;
        if (~class37.field408 == -2) {
            class343.method2047(true);
        } else {
            class108.method738(class250.field3725, class123.field1679, (byte) 112, class2.field56, class388.field5445);
            int var3 = class113.field1536.method2430(class362.field5170.method3116(class149.field1979, (byte) 120), (byte) -117);
            for (class214 var4 = (class214) class363.field5190.method2655(15152); var4 != null; var4 = (class214) class363.field5190.method2660((byte) 67)) {
                int var5 = class531.method3118(0, var4);
                if (~var5 < ~var3) {
                    var3 = var5;
                }
            }
            class2.field56 = (class328.field4784 ? 26 : 22) + class37.field408 * 16;
            class388.field5445 = var3 + 8;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 50)
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1571 = arg1;
        this.field1576 = arg5;
        this.field1570 = arg4;
        this.field1569 = arg6;
        this.field1574 = arg0;
        this.field1573 = arg3;
        this.field1565 = arg2;
        this.field1578 = arg7;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Z", line = 70)
    public static final boolean method777(byte arg0) {
        ++field1564;
        int var1 = -83 % ((arg0 - -25) / 63);
        return ~class15.field189 != -1 ? true : class22.field267.method568((byte) 32);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V", line = 90)
    public final void method409(int arg0, int arg1, byte arg2) {
        if (arg2 == -85) {
            ++field1563;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V", line = 102)
    public final void method406(int arg0, int arg1, int arg2) {
        ++field1577;
        if (arg0 != 0) {
            this.field1576 = -60;
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)I", line = 114)
    public static final int method778(int arg0, int arg1, int arg2) {
        ++field1572;
        int var3 = -128 + (class246.method1561(arg0 + 45365, arg1 - -91923, 4, false) + (-128 + class246.method1561(arg0 + 10294, arg1 + 37821, 2, false) >> 1) - -(-128 + class246.method1561(arg0, arg1, 1, false) >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + arg2;
        if (var4 < 10) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V", line = 133)
    public final void method408(int arg0, int arg1, int arg2) {
        ++field1566;
        int var4 = this.field1574 * arg1 >> 12;
        int var5 = this.field1571 * arg0 >> 12;
        int var6 = this.field1565 * arg1 >> 12;
        int var7 = this.field1573 * arg0 >> 12;
        int var8 = this.field1570 * arg1 >> 12;
        int var9 = this.field1576 * arg0 >> 12;
        if (arg2 != 0) {
            this.field1573 = -65;
        }
        int var10 = this.field1569 * arg1 >> 12;
        int var11 = this.field1578 * arg0 >> 12;
        class539.method3166(var6, var4, var5, var7, var10, var9, var11, arg2 + -138859848, super.field3389, var8);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 160)
    public static void method779(int arg0) {
        field1568 = null;
        field1567 = null;
        if (arg0 != 1) {
            method778(-84, 13, -61);
        }
    }
}
