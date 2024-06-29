import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class318 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lev;")
    private class144 field4112;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lmc;")
    public static class318 field4117 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lmc;")
    public static class318 field4123 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lmc;")
    public static class318 field4124 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lmc;")
    public static class318 field4125 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lmc;")
    public static class318 field4126 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lmc;")
    public static class318 field4127 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lmc;")
    public static class318 field4128 = new class318(class144.field1888);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lmc;")
    public static class318 field4129 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lmc;")
    public static class318 field4130 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lmc;")
    public static class318 field4131 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lmc;")
    public static class318 field4132 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lmc;")
    public static class318 field4133 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lmc;")
    public static class318 field4134 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lmc;")
    public static class318 field4135 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lmc;")
    public static class318 field4136 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lmc;")
    public static class318 field4137 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lmc;")
    public static class318 field4138 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lmc;")
    public static class318 field4139 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lmc;")
    public static class318 field4140 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lmc;")
    public static class318 field4141 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lmc;")
    public static class318 field4142 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lmc;")
    public static class318 field4143 = new class318(class144.field1885);

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Lmc;")
    public static class318 field4144 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lmc;")
    public static class318 field4145 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lmc;")
    public static class318 field4146 = new class318(class144.field1882);

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lmc;")
    public static class318 field4147 = new class318(class144.field1887);

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[F")
    public static float[] field4149 = new float[16384];

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[F")
    public static float[] field4148 = new float[16384];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ltl;")
    private class121 field4114;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4148[var2] = (float) Math.sin((double) var2 * var0);
            field4149[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)[Lmc;", line = 3)
    public static final class318[] method1850(byte arg0) {
        field4119++;
        if (arg0 > -63) {
            method1855((byte) -32);
        }
        return new class318[] { field4117, field4123, field4124, field4125, field4126, field4127, field4128, field4129, field4130, field4131, field4132, field4133, field4134, field4135, field4136, field4137, field4138, field4139, field4140, field4141, field4142, field4143, field4144, field4145, field4146, field4147 };
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 16)
    public final void method1851(int arg0, int arg1) {
        this.field4116 = arg1;
        field4115++;
        if (arg0 != 260348) {
            field4141 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ltl;B)V", line = 27)
    public final void method1852(class121 arg0, byte arg1) {
        if (arg1 <= 13) {
            field4124 = null;
        }
        field4118++;
        if (arg0.method900(74) != this.field4112) {
            throw new IllegalArgumentException();
        }
        this.field4114 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)I", line = 42)
    public static final int method1853(int arg0, boolean arg1) {
        field4113++;
        if (arg1) {
            method1850((byte) 43);
        }
        return (arg0 & 0x3F8FC) >> 11;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I", line = 58)
    public final int method1854(int arg0) {
        field4122++;
        return arg0 == 16384 ? this.field4116 : -63;
    }

    @OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;", line = 71)
    public final String toString() {
        field4121++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lev;)V", line = 78)
    private class318(class144 arg0) {
        this.field4112 = arg0;
        this.field4116 = 1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 94)
    public static void method1855(byte arg0) {
        field4124 = null;
        field4123 = null;
        field4146 = null;
        field4138 = null;
        field4130 = null;
        if (arg0 > -46) {
            method1855((byte) 99);
        }
        field4136 = null;
        field4142 = null;
        field4147 = null;
        field4129 = null;
        field4133 = null;
        field4144 = null;
        field4128 = null;
        field4148 = null;
        field4131 = null;
        field4145 = null;
        field4134 = null;
        field4125 = null;
        field4135 = null;
        field4140 = null;
        field4141 = null;
        field4117 = null;
        field4132 = null;
        field4139 = null;
        field4127 = null;
        field4137 = null;
        field4143 = null;
        field4126 = null;
        field4149 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ltl;", line = 135)
    public final class121 method1856(int arg0) {
        int var2 = -118 % ((arg0 + 16) / 39);
        field4120++;
        return this.field4114;
    }
}
