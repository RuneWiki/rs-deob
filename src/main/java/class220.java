import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class220 extends class298 implements class151 {

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    private int field3462 = 50;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Z")
    private boolean field3471 = false;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lgi;")
    private class164 field3454;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lgi;")
    private class164 field3459;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lti;")
    private class5 field3463;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lti;")
    private class5 field3466;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field3456 = 0;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3472 = null;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3468 = "Connection lost.";

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    public static int[] field3473 = new int[5];

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[Ljg;")
    public static class177[] field3465;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lfj;")
    public static final class274 method1494(int arg0) {
        class274 var1 = new class274(34);
        field3455++;
        if (arg0 > -9) {
            method1501(22);
        }
        var1.method1865(11, -120);
        var1.method1865(class288.field4664, 71);
        var1.method1865(class24.field442 ? 1 : 0, 83);
        var1.method1865(class33.field545 ? 1 : 0, 123);
        var1.method1865(class296.field4835 ? 1 : 0, -121);
        var1.method1865(class236.field3701 ? 1 : 0, 76);
        var1.method1865(class101.field1586 ? 1 : 0, 52);
        var1.method1865(class117.field1804 ? 1 : 0, 42);
        var1.method1865(class4.field95 ? 1 : 0, -92);
        var1.method1865(class277.field4524 ? 1 : 0, -95);
        var1.method1865(class240.field3761, -107);
        var1.method1865(class244.field3867 ? 1 : 0, -103);
        var1.method1865(class131.field2101 ? 1 : 0, -100);
        var1.method1865(class143.field2314 ? 1 : 0, 26);
        var1.method1865(class46.field689, 111);
        var1.method1865(class127.field2032 ? 1 : 0, 115);
        var1.method1865(class129.field2066, 56);
        var1.method1865(class44.field654, -108);
        var1.method1865(class66.field1067, 54);
        var1.method1824(field3456, 28357);
        var1.method1824(class8.field173, 28357);
        var1.method1865(class181.method1272(), 23);
        var1.method1831(class57.field827, 119690440);
        var1.method1865(class147.field2352, -111);
        var1.method1865(class156.field2485 ? 1 : 0, -100);
        var1.method1865(class184.field3053 ? 1 : 0, 58);
        var1.method1865(class265.field4313, 102);
        var1.method1865(class91.field1432 ? 1 : 0, 126);
        var1.method1865(class186.field3077 ? 1 : 0, 74);
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIFII)Le;")
    public final class67 method1024(boolean arg0, int arg1, float arg2, int arg3, int arg4) {
        field3467++;
        class276 var6 = this.method1496(arg1, true);
        if (var6 != null && var6.method1887(this, this.field3459)) {
            if (arg4 != -27729) {
                this.method1500(-71, (byte) 42);
            }
            return arg0 ? var6.field4516.method1414(this.field3459, arg3, (double) arg2, true, arg3, this, false) : var6.field4516.method1415(this.field3459, (double) arg2, arg3, false, (byte) -24, this, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(BI)I")
    public final int method1027(byte arg0, int arg1) {
        field3470++;
        if (arg0 <= 29) {
            field3468 = null;
        }
        return this.method746(arg1, -8213).field1045 & 0xFFFF;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
    public final void method1495(int arg0, boolean arg1) {
        field3464++;
        this.field3471 = arg1;
        this.method1499(-65);
        if (arg0 < 34) {
            this.field3471 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Ljk;")
    private final class276 method1496(int arg0, boolean arg1) {
        field3475++;
        if (!arg1) {
            return null;
        }
        class276 var3 = (class276) this.field3463.method61(117, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3454.method1156(arg0, 0, (byte) -16);
        if (var4 == null) {
            return null;
        } else {
            class276 var5 = new class276(new class274(var4));
            this.field3463.method59(var5, (long) arg0, 5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lma;")
    public final class202 method1497(int arg0, byte arg1) {
        field3451++;
        if (arg1 > -75) {
            this.method1026(0.5113338F, -59, -57);
        }
        class276 var3 = this.method1496(arg0, true);
        return var3 == null ? null : var3.field4516;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIII)V")
    public static final void method1498(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class62.field945++;
            class311.field5027.method2081(false, 152);
        }
        field3461++;
        if (arg2 == 1) {
            class17.field311++;
            class311.field5027.method2081(arg0, 189);
        }
        class311.field5027.method1860(class8.field170[82] ? 1 : 0, 8239);
        if (arg0) {
            field3472 = null;
        }
        class311.field5027.method1844(-1, arg1 + class75.field1211);
        class311.field5027.method1814(++class130.field2071, (byte) -12);
        class311.field5027.method1844(-1, class145.field2327 + arg3);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)Z")
    public final boolean method1025(byte arg0, int arg1) {
        field3458++;
        if (arg0 != -123) {
            method1498(true, 0, 90, 75);
        }
        return !this.method746(arg1, -8213).field1050;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FII)[I")
    public final int[] method1026(float arg0, int arg1, int arg2) {
        field3469++;
        class276 var4 = this.method1496(arg2, true);
        if (var4 == null) {
            return null;
        }
        if (arg1 != 1234) {
            this.field3463 = null;
        }
        var4.field4515 = true;
        return var4.method1885(this, this.field3459, arg0, this.field3471 || this.method746(arg2, -8213).field1057);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Z")
    public final boolean method1022(int arg0, int arg1) {
        if (arg0 == 1) {
            field3452++;
            return this.method746(arg1, -8213).field1049;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Z")
    public final boolean method1023(byte arg0, int arg1) {
        if (arg0 != 73) {
            this.field3463 = null;
        }
        field3460++;
        return this.field3471 || this.method746(arg1, arg0 ^ 0xFFFFDFA2).field1057;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method1499(int arg0) {
        int var2 = -33 / ((-arg0 - 11) / 38);
        this.field3463.method58(false);
        field3474++;
        if (this.field3466 != null) {
            this.field3466.method58(false);
        }
        class276.field4513 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
    public final void method1500(int arg0, byte arg1) {
        for (class276 var3 = (class276) this.field3463.method63(256); var3 != null; var3 = (class276) this.field3463.method62(75)) {
            if (var3.field4515) {
                var3.method1886(arg0);
                var3.field4515 = false;
            }
        }
        if (arg1 != 66) {
            method1501(26);
        }
        field3453++;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static void method1501(int arg0) {
        field3473 = null;
        if (arg0 <= 12) {
            field3465 = null;
        }
        field3465 = null;
        field3468 = null;
        field3472 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lgi;Lgi;Lgi;IZ)V")
    public class220(class164 arg0, class164 arg1, class164 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field3462 = arg3;
        this.field3454 = arg0;
        this.field3459 = arg2;
        this.field3471 = arg4;
        this.field3463 = new class5(this.field3462);
        this.field3466 = null;
    }
}
