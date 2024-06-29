import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class98 extends class34 {

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    private int field1544 = -1;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    private int field1553 = -32768;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Z")
    private boolean field1558 = false;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    private int field1555 = 0;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Z")
    public boolean field1547 = false;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lai;")
    private class91 field1549;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    public static int[] field1546 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1552 = "Examine";

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lga;")
    private class181 field1551;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public final void method697(int arg0, int arg1) {
        field1539++;
        if (this.field1547) {
            return;
        }
        this.field1555 += arg0;
        if (arg1 != -3553) {
            this.field1555 = -93;
        }
        while (this.field1549.field1452[this.field1554] < this.field1555) {
            this.field1555 -= this.field1549.field1452[this.field1554];
            this.field1554++;
            if (this.field1549.field1434.length <= this.field1554) {
                this.field1547 = true;
                break;
            }
        }
        if (!this.field1547) {
            class252.method1710(this.field1554, this.field1550, this.field1549, this.field1557, false, 60);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lha;")
    private final class32 method698(int arg0) {
        field1541++;
        int var2 = -33 / ((arg0 - 35) / 35);
        class156 var3 = class166.method1182(1, this.field1542);
        class32 var4;
        if (this.field1547) {
            var4 = var3.method1055(true, -1, 0, -1);
        } else {
            var4 = var3.method1055(true, this.field1554, this.field1555, this.field1544);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V")
    public static void method699(boolean arg0) {
        if (arg0) {
            method699(true);
        }
        field1552 = null;
        field1546 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
    public final int method22() {
        field1545++;
        return this.field1553;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public static final void method700(boolean arg0, int arg1) {
        field1540++;
        if (class81.field1304 != arg0 && arg1 <= -67) {
            class81.field1304 = arg0;
            class156.method1054(-111);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class181 arg10) {
        field1556++;
        class32 var13 = this.method698(-92);
        if (var13 != null) {
            this.method701(var13, 103);
            var13.method27(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1551);
            this.field1553 = var13.method22();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1561++;
        if (!this.field1558) {
            class32 var6 = this.method698(-53);
            if (var6 == null) {
                return;
            }
            this.method701(var6, 126);
        }
        if (this.field1551 != null) {
            this.field1551.method1275(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;I)V")
    private final void method701(class32 arg0, int arg1) {
        field1560++;
        class3 var3 = (class3) arg0;
        if ((this.field1551 == null || this.field1551.field2992) && (var3.field26 != null || var3.field17 != null)) {
            this.field1551 = new class181(class274.field4472, 1, 1);
        }
        if (arg1 < 24) {
            this.field1558 = false;
        }
        if (this.field1551 != null) {
            this.field1551.method1274(var3.field26, var3.field17, false, var3.field36, var3.field40, var3.field10);
        }
        this.field1558 = true;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIII)V")
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1550 = arg3;
        this.field1542 = arg0;
        this.field1548 = arg1;
        this.field1543 = arg4;
        this.field1562 = arg5 + arg6;
        this.field1557 = arg2;
        int var8 = class166.method1182(1, this.field1542).field2486;
        if (var8 == -1) {
            this.field1547 = true;
        } else {
            this.field1547 = false;
            this.field1549 = class159.method1085((byte) -63, var8);
        }
        if (this.field1562 == arg6) {
            class252.method1710(this.field1554, this.field1550, this.field1549, this.field1557, false, 71);
        }
    }
}
