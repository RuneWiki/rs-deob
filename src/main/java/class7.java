import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    private int field151 = 0;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[Lqe;")
    private class116[] field134;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lic;")
    private static class59 field137 = class59.method433(0, "Please reload this page)3");

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lic;")
    public static class59 field139 = class59.method433(0, "weiss:");

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lic;")
    public static class59 field135 = field137;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lic;")
    private static class59 field131 = class59.method433(0, "Loaded title screen");

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lic;")
    public static class59 field144 = field131;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lic;")
    private static class59 field145 = class59.method433(0, "Prepared visibility map");

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lic;")
    public static class59 field147 = field145;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "J")
    private long field140;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lqe;")
    private class116 field149;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lqe;")
    private class116 field153;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lbe;")
    public static class13 field138;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lie;")
    public static class61 field133;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[Lt;")
    public static class132[] field142;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static final void method33(byte arg0) {
        class155.field3367 = new int[105][105];
        class134.field2986 = new byte[4][104][104];
        class21.field460 = new int[104];
        class43.field1107 = 99;
        class126.field2868 = new byte[4][105][105];
        class1.field12 = new int[104];
        class84.field2075 = new int[104];
        class108.field2605 = new int[4][105][105];
        class56.field1382 = new byte[4][104][104];
        if (arg0 < 104) {
            return;
        }
        field143++;
        class63.field1628 = new byte[4][104][104];
        class155.field3355 = new int[104];
        class6.field124 = new byte[4][104][104];
        class115.field2716 = new int[104];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method34(int arg0) {
        field135 = null;
        field142 = null;
        field139 = null;
        if (arg0 != -25462) {
            field145 = null;
        }
        field133 = null;
        field145 = null;
        field137 = null;
        field138 = null;
        field144 = null;
        field147 = null;
        field131 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)Lqe;")
    public final class116 method35(long arg0, int arg1) {
        if (arg1 != 105) {
            method39(-4, -59);
        }
        this.field140 = arg0;
        field141++;
        class116 var4 = this.field134[(int) ((long) (this.field150 - 1) & arg0)];
        for (this.field149 = var4.field2733; this.field149 != var4; this.field149 = this.field149.field2733) {
            if (this.field149.field2736 == arg0) {
                class116 var5 = this.field149;
                this.field149 = this.field149.field2733;
                return var5;
            }
        }
        this.field149 = null;
        return null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lqe;")
    public final class116 method36(int arg0) {
        field136++;
        if (arg0 > ~this.field151 && this.field134[this.field151 - 1] != this.field153) {
            class116 var2 = this.field153;
            this.field153 = var2.field2733;
            return var2;
        }
        while (this.field150 > this.field151) {
            class116 var3 = this.field134[this.field151++].field2733;
            if (this.field134[this.field151 - 1] != var3) {
                this.field153 = var3.field2733;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lqe;")
    public final class116 method37(int arg0) {
        this.field151 = 0;
        field148++;
        return arg0 == -1 ? this.method36(-1) : null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqe;BJ)V")
    public final void method38(class116 arg0, byte arg1, long arg2) {
        if (arg0.field2731 != null) {
            arg0.method929(127);
        }
        field152++;
        class116 var5 = this.field134[(int) (arg2 & (long) (this.field150 - 1))];
        arg0.field2736 = arg2;
        arg0.field2733 = var5;
        arg0.field2731 = var5.field2731;
        arg0.field2731.field2733 = arg0;
        if (arg1 <= 89) {
            this.method35(-86L, -18);
        }
        arg0.field2733.field2731 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Llc;")
    public static final class79 method39(int arg0, int arg1) {
        field132++;
        class79 var2 = (class79) class75.field1842.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field3127.method193(false, arg1, 10);
        class79 var4 = new class79();
        var4.field1938 = arg1;
        if (var3 != null) {
            var4.method653(new class157(var3), (byte) -93);
        }
        var4.method657(-4);
        if (var4.field1934 != -1) {
            var4.method650(method39(30996, var4.field1934), method39(30996, var4.field1935), 128);
        }
        if (arg0 != 30996) {
            field145 = null;
        }
        if (!class89.field2256 && var4.field1926) {
            var4.field1968 = 0;
            var4.field1930 = null;
            var4.field1966 = null;
            var4.field1936 = class21.field450;
        }
        class75.field1842.method672(arg0 ^ 0xFFFFF014, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Lqe;")
    public final class116 method40(int arg0) {
        field146++;
        if (this.field149 == null) {
            return null;
        }
        class116 var2 = this.field134[(int) ((long) (this.field150 + arg0) & this.field140)];
        while (this.field149 != var2) {
            if (this.field149.field2736 == this.field140) {
                class116 var3 = this.field149;
                this.field149 = this.field149.field2733;
                return var3;
            }
            this.field149 = this.field149.field2733;
        }
        this.field149 = null;
        return null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class7(int arg0) {
        this.field134 = new class116[arg0];
        this.field150 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class116 var3 = this.field134[var2] = new class116();
            var3.field2731 = var3;
            var3.field2733 = var3;
        }
    }
}
