import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class309 extends class435 {

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "F")
    public float field4134;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "Lhn;")
    public static class509 field4140 = new class509(8);

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "Lho;")
    public static class103 field4146 = new class103(12, 4);

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "Lkf;")
    public static class168 field4144;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
    public final int method1840(byte arg0) {
        field4138++;
        int var2 = 75 % ((arg0 + 23) / 41);
        return this.field4142;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)I")
    public final int method1841(int arg0) {
        field4148++;
        if (arg0 != 0) {
            this.method1847(30);
        }
        return this.field4143;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIZ)V")
    public abstract void method365(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IF)V")
    public abstract void method362(int arg0, float arg1);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
    public final int method1842(byte arg0) {
        if (arg0 < 95) {
            this.field4143 = -76;
        }
        field4137++;
        return this.field4136;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        int var1 = 115 / ((arg0 + 3) / 60);
        field4146 = null;
        field4140 = null;
        field4144 = null;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)V")
    public static final void method1844(byte arg0) {
        field4139++;
        class46 var1 = (class46) class508.field7360.method290(-1);
        if (arg0 != 19) {
            field4144 = null;
        }
        while (var1 != null) {
            var1.method258();
            var1 = (class46) class508.field7360.method284(arg0 + 10729);
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)I")
    public final int method1845(byte arg0) {
        if (arg0 == -98) {
            field4145++;
            return this.field4131;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4133++;
        if (arg2 != 14216) {
            field4140 = null;
        }
        class184 var5 = class277.method1682(arg3, 10, arg2 ^ 0xFFFFC84E);
        var5.method1069(true);
        var5.field2392 = arg0;
        var5.field2393 = arg4;
        var5.field2388 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)I")
    public final int method1847(int arg0) {
        field4132++;
        if (arg0 != 8) {
            this.field4131 = -19;
        }
        return this.field4149;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
    public static final void method1848(byte arg0) {
        class366.field5009 = false;
        class155.field2033 = null;
        if (arg0 >= 7) {
            field4141++;
            class104.method628(-102);
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIF)V")
    public class309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4136 = arg2;
        this.field4149 = arg4;
        this.field4143 = arg1;
        this.field4142 = arg0;
        this.field4134 = arg5;
        this.field4131 = arg3;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)F")
    public final float method1849(int arg0) {
        if (arg0 < 102) {
            return -0.64113736F;
        } else {
            field4135++;
            return this.field4134;
        }
    }
}
