import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class212 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Llh;")
    public class59 field3413 = new class59();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lok;")
    private static class41 field3406 = class137.method956("Members object", 45);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lok;")
    public static class41 field3407 = class137.method956("document)3cookie=(R", 45);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lok;")
    public static class41 field3417 = class137.method956("W-=hlen Sie eine Option", 45);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lok;")
    public static class41 field3416 = field3406;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
    public static int[] field3411 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!da", name = "r", descriptor = "F")
    public static float field3422;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Llh;")
    private class59 field3425;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lmh;")
    public static class65 field3408;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lmh;")
    public static class65 field3423;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lok;I)V", line = 15)
    public static final void method1493(class41 arg0, int arg1) {
        field3405++;
        if (arg1 != 27565) {
            return;
        }
        for (class161 var2 = (class161) class88.field1284.method1495(-312); var2 != null; var2 = (class161) class88.field1284.method1501(arg1 - 27667)) {
            if (var2.field2565.method268(arg0, 1631)) {
                class169.field2676 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)Lvd;", line = 40)
    public static final class161 method1494(int arg0, int arg1, byte arg2) {
        field3426++;
        for (class161 var3 = (class161) class88.field1284.method1495(-312); var3 != null; var3 = (class161) class88.field1284.method1501(80)) {
            if (var3.field2557 && var3.method1135((byte) 94, arg0, arg1)) {
                return var3;
            }
        }
        if (arg2 >= -69) {
            field3423 = (class65) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Llh;", line = 64)
    public final class59 method1495(int arg0) {
        field3424++;
        class59 var2 = this.field3413.field841;
        if (arg0 != -312) {
            this.method1495(82);
        }
        if (this.field3413 == var2) {
            this.field3425 = null;
            return null;
        } else {
            this.field3425 = var2.field841;
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 86)
    public static final void method1496(int arg0, int arg1) {
        field3415++;
        if (class207.field3354 == null || class207.field3354.length < arg1) {
            class207.field3354 = new int[arg1];
        }
        if (arg0 >= -71) {
            method1494(-32, 91, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Llh;", line = 112)
    public final class59 method1497(byte arg0) {
        if (arg0 < 101) {
            return (class59) null;
        }
        field3410++;
        class59 var2 = this.field3413.field841;
        if (this.field3413 == var2) {
            return null;
        } else {
            var2.method418(6971);
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Llh;B)V", line = 133)
    public final void method1498(class59 arg0, byte arg1) {
        if (arg1 < 47) {
            this.method1504((byte) 127);
        }
        field3418++;
        if (arg0.field856 != null) {
            arg0.method418(6971);
        }
        arg0.field841 = this.field3413.field841;
        arg0.field856 = this.field3413;
        arg0.field856.field841 = arg0;
        arg0.field841.field856 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 156)
    public final void method1499(int arg0) {
        if (arg0 != -3868) {
            field3416 = (class41) null;
        }
        while (true) {
            class59 var2 = this.field3413.field841;
            if (this.field3413 == var2) {
                field3419++;
                this.field3425 = null;
                return;
            }
            var2.method418(arg0 ^ 0xFFFFEBDF);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 188)
    public static void method1500(int arg0) {
        field3416 = null;
        if (arg0 != 4) {
            return;
        }
        field3406 = null;
        field3408 = null;
        field3417 = null;
        field3407 = null;
        field3411 = null;
        field3423 = null;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Llh;", line = 206)
    public final class59 method1501(int arg0) {
        int var2 = -103 / ((arg0 + 19) / 55);
        field3412++;
        class59 var3 = this.field3425;
        if (this.field3413 == var3) {
            this.field3425 = null;
            return null;
        } else {
            this.field3425 = var3.field841;
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Llh;", line = 235)
    public final class59 method1502(int arg0) {
        field3421++;
        if (arg0 != 15469) {
            field3406 = (class41) null;
        }
        class59 var2 = this.field3425;
        if (this.field3413 == var2) {
            this.field3425 = null;
            return null;
        } else {
            this.field3425 = var2.field856;
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Llh;B)V", line = 255)
    public final void method1503(class59 arg0, byte arg1) {
        if (arg0.field856 != null) {
            arg0.method418(6971);
        }
        arg0.field841 = this.field3413;
        arg0.field856 = this.field3413.field856;
        field3420++;
        arg0.field856.field841 = arg0;
        arg0.field841.field856 = arg0;
        if (arg1 > -62) {
            field3416 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 304)
    public class212() {
        this.field3413.field856 = this.field3413;
        this.field3413.field841 = this.field3413;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)Llh;", line = 283)
    public final class59 method1504(byte arg0) {
        field3409++;
        class59 var2 = this.field3413.field856;
        if (this.field3413 == var2) {
            this.field3425 = null;
            return null;
        }
        this.field3425 = var2.field856;
        if (arg0 < 71) {
            this.method1502(73);
        }
        return var2;
    }
}
