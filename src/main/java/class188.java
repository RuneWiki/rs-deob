import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class188 {

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "B")
    private byte field3395;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lvf;")
    public static class265 field3390 = class87.method582(-46, "b12_full");

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lvf;")
    public static class265 field3381 = class87.method582(-46, " <col=ffffff>");

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[Loe;")
    public static class108[] field3388;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)I")
    public final int method1281(byte arg0) {
        field3382++;
        if (arg0 <= 109) {
            this.field3389 = -32;
        }
        return this.field3395 & 0x7;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Llb;")
    public static final class178 method1282(int arg0, int arg1, int arg2) {
        class178 var3 = (class178) class64.field1243.method1842(-1, (long) arg1 << 32 | (long) arg0);
        field3393++;
        if (arg2 != 261360480) {
            field3381 = null;
        }
        if (var3 == null) {
            var3 = new class178(arg1, arg0);
            class64.field1243.method1838(var3.field393, var3, (byte) 8);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)I")
    public static final int method1283(int arg0, boolean arg1) {
        field3392++;
        return arg1 ? -35 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)I")
    public final int method1284(byte arg0) {
        if (arg0 >= -25) {
            this.field3386 = 98;
        }
        field3380++;
        return (this.field3395 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field3390 = null;
        field3388 = null;
        if (arg0 < -18) {
            field3381 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static final void method1286(boolean arg0) {
        if (!arg0) {
            method1287(-54);
        }
        field3385++;
        class183.field3246.method1893(-28);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        class178.field3168 = -1;
        class120.field2129 = 0;
        class50.field1049 = false;
        class278.field4915 = -1;
        class263.field4585 = 0;
        class93.field1650 = -1;
        class55.field1133.field2449 = 0;
        class207.field3730.field2449 = 0;
        class279.field4931 = -1;
        class161.field2936 = 0;
        field3384++;
        class221.field3966 = 0;
        class198.field3545 = 0;
        class112.field1957 = 0;
        for (int var1 = 0; var1 < class209.field3766.length; var1++) {
            if (class209.field3766[var1] != null) {
                class209.field3766[var1].field2584 = -1;
            }
        }
        for (int var2 = 0; var2 < class4.field67.length; var2++) {
            if (class4.field67[var2] != null) {
                class4.field67[var2].field2584 = -1;
            }
        }
        class32.method262((byte) 84);
        class254.field4361 = 1;
        if (arg0 > -21) {
            method1282(91, 41, 98);
        }
        class70.method497(70, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class135.field2481[var3] = true;
        }
        class213.method1451((byte) 82);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class188() {
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lng;)V")
    public class188(class135 arg0) {
        this.field3395 = arg0.method929((byte) -3);
        this.field3389 = arg0.method927(125);
        this.field3394 = arg0.method949(3933);
        this.field3387 = arg0.method949(3933);
        this.field3391 = arg0.method949(3933);
        this.field3386 = arg0.method949(3933);
    }
}
