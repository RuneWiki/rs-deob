import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class172 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field2413 = 1;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lfba;")
    public static class348 field2412 = new class348(3000000, 200);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "C")
    public char field2411;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method1216(int arg0) {
        class654 var1 = (class654) class451.field6446.method3565(-25);
        if (arg0 != 50560) {
            field2414 = 57;
        }
        while (var1 != null) {
            if (var1.field9367) {
                var1.method3752(1024);
            }
            var1 = (class654) class451.field6446.method3561((byte) 22);
        }
        field2416++;
        for (class654 var2 = (class654) class337.field4661.method3565(arg0 - 50459); var2 != null; var2 = (class654) class337.field4661.method3561((byte) 16)) {
            if (var2.field9367) {
                var2.method3752(1024);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lsl;ZI)V")
    private final void method1217(class479 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field2411 = class520.method3162(-19480, arg0.method2915(-110));
        } else if (arg2 == 2) {
            this.field2413 = 0;
        }
        field2417++;
        if (!arg1) {
            field2412 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
    public static final boolean method1218(int arg0, int arg1, int arg2) {
        field2410++;
        if (arg2 != -1) {
            field2414 = 47;
        }
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public static void method1219(int arg0) {
        if (arg0 != 1) {
            field2412 = null;
        }
        field2412 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lsl;Z)V")
    public final void method1220(class479 arg0, boolean arg1) {
        if (!arg1) {
            this.field2413 = 63;
        }
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                field2415++;
                return;
            }
            this.method1217(arg0, true, var3);
        }
    }
}
