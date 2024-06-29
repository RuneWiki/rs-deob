import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 extends class147 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field1561 = -1;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lna;")
    private static class26 field1563 = class69.method505("Started 3d Library", (byte) -128);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[Lna;")
    public static class26[] field1560 = new class26[200];

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[I")
    public static int[] field1569 = new int[14];

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Lna;")
    public static class26 field1573 = field1563;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "J")
    public long field1564;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lve;")
    public static class266 field1568;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lrg;")
    public class96 field1565;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lrg;")
    public class96 field1575;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Le;I)V", line = 7)
    public static final void method716(class159 arg0, int arg1) {
        field1572++;
        class224 var2 = (class224) class94.field1538.method1827(arg0.field2495.method209(-121), 0);
        if (arg1 >= -85) {
            method721(40, -17, -52, -32, 9, -51, -85, -84, -19);
        }
        if (var2 == null) {
            class267.method1903(arg0.field3890[0], false, (class78) null, 0, (class324) null, arg0.field3904[0], class279.field4651, arg0);
        } else {
            var2.method1493(1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZII)I", line = 52)
    public static final int method717(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1558++;
        if (!arg1) {
            method718((byte) -89);
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)Lbn;", line = 87)
    public static final class66 method718(byte arg0) {
        field1559++;
        int var1 = -122 % ((arg0 + 48) / 33);
        return class82.field1328;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 101)
    public static void method719(int arg0) {
        field1568 = null;
        if (arg0 == -3) {
            field1560 = null;
            field1563 = null;
            field1569 = null;
            field1573 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lme;", line = 120)
    public static final class187 method720(int arg0, int arg1) {
        field1576++;
        class187 var2 = (class187) class94.field1533.method1989((long) arg0, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class167.field2587.method1889(class11.method71(arg0, 2), (byte) -122, class127.method867(arg0, false));
        class187 var4 = new class187();
        if (arg1 != 27112) {
            field1567 = -67;
        }
        var4.field2943 = arg0;
        if (var3 != null) {
            var4.method1280(new class82(var3), 74);
        }
        var4.method1283(98);
        class94.field1533.method1978((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V", line = 159)
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1570++;
        int var9 = arg3 - arg8;
        int var10 = (arg0 - arg5 << 16) / var9;
        int var11 = arg6 - arg4;
        int var12 = (arg7 - arg1 << 16) / var11;
        class243.method1676(arg1, 0, arg6, arg4, arg3, arg5, arg8, var12, var10, arg2, -12541);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V", line = 177)
    public final void method722(byte arg0) {
        field1562++;
        if (this.field1565 == null) {
            return;
        }
        this.field1565.field1575 = this.field1575;
        this.field1575.field1565 = this.field1565;
        this.field1575 = null;
        this.field1565 = null;
        if (arg0 != -107) {
            this.field1575 = (class96) null;
        }
    }
}
