import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class169 extends class766 {

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "Laq;")
    public static class494 field2563 = new class494(64);

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)Z")
    public final boolean method1248(int arg0, boolean arg1) {
        if (arg1) {
            field2561++;
            return (this.field2564 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
    public final int method1249(int arg0) {
        if (arg0 != 11511) {
            this.method1255((byte) -87);
        }
        field2554++;
        return this.field2564 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V")
    public static final void method1250(int arg0, int arg1, int arg2) {
        field2557++;
        class371 var3 = class490.method2867((byte) -40, 15, (long) arg2);
        var3.method2212(-122);
        var3.field5233 = arg1;
        var3.field5225 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        if (arg0 == -16566) {
            field2566++;
            return (this.field2564 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)Z")
    public final boolean method1252(int arg0) {
        field2560++;
        if (arg0 != -30978) {
            this.method1254(false);
        }
        return ((this.field2564 & 0x29D6FB) >> 21) != 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lol;I)Ldn;")
    public static final class610 method1253(class431 arg0, int arg1) {
        if (arg1 == 64) {
            field2562++;
            return new class610(arg0.method2528((byte) 89), arg0.method2528((byte) 89), arg0.method2528((byte) 89), arg0.method2528((byte) 89), arg0.method2515(arg1 ^ 0x19), arg0.method2515(95), arg0.method2557(arg1 ^ 0x3A11));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)Z")
    public final boolean method1254(boolean arg0) {
        if (arg0) {
            field2563 = null;
        }
        field2556++;
        return (this.field2564 & 0x48773D) >> 22 != 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I")
    public final int method1255(byte arg0) {
        if (arg0 <= 67) {
            this.method1251(-97);
        }
        field2559++;
        return class323.method1953(this.field2564, false);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        field2563 = null;
        int var1 = -104 / ((arg0 + 20) / 53);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(II)V")
    public class169(int arg0, int arg1) {
        this.field2555 = arg1;
        this.field2564 = arg0;
    }
}
