import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class291 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field4417 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Z")
    private boolean field4422 = false;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public int field4425 = 0;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lpf;")
    public static class425 field4427 = new class425(41, 3);

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lpf;")
    public static class425 field4432 = new class425(14, -1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "J")
    public long field4424;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLef;)V")
    private final void method1800(int arg0, boolean arg1, class385 arg2) {
        field4415++;
        if (!arg1) {
            this.field4426 = 32;
        }
        if (arg0 == 1) {
            this.field4431 = arg2.method2323(-95);
        } else if (arg0 == 2) {
            arg2.method2343(255);
        } else if (arg0 == 3) {
            this.field4434 = arg2.method2354(255);
            this.field4423 = arg2.method2354(255);
            this.field4426 = arg2.method2354(255);
        } else if (arg0 == 4) {
            this.field4428 = arg2.method2343(255);
            this.field4418 = arg2.method2354(255);
            return;
        } else if (arg0 == 6) {
            this.field4429 = arg2.method2343(255);
            return;
        } else if (arg0 == 8) {
            this.field4425 = 1;
            return;
        } else if (arg0 == 9) {
            this.field4417 = 1;
            return;
        } else if (arg0 == 10) {
            this.field4422 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lef;I)V")
    public final void method1801(class385 arg0, int arg1) {
        field4421++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2343(255);
            if (var3 == 0) {
                return;
            }
            this.method1800(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method1802(byte arg0) {
        int var1 = -16 / ((arg0 - 82) / 42);
        field4419++;
        if (class351.field5206) {
            return;
        }
        class351.field5206 = true;
        if (class212.field3193) {
            class462.field6810 = (float) ((int) class462.field6810 - 65 & 0xFFFFFF80);
        } else {
            class1.field16 += (-24.0F - class1.field16) / 2.0F;
        }
        class424.field6235 = true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1803(int arg0) {
        field4427 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field4432 = null;
        }
        field4432 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1804(int arg0) {
        int var2 = 121 % ((-arg0 - 24) / 51);
        this.field4420 = class110.field1452[this.field4431 << 3];
        field4430++;
        this.field4433 = (int) Math.sqrt((double) (this.field4434 * this.field4434 + this.field4423 * this.field4423 + (this.field4426 * this.field4426)));
        if (this.field4418 == 0) {
            this.field4418 = 1;
        }
        if (this.field4428 == 0) {
            this.field4424 = 2147483647L;
        } else if (this.field4428 == 1) {
            this.field4424 = (long) (this.field4433 * 8 / this.field4418);
            this.field4424 *= this.field4424;
        } else if (this.field4428 == 2) {
            this.field4424 = (long) (this.field4433 * 8 / this.field4418);
        }
        if (this.field4422) {
            this.field4433 *= -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLiq;Liq;)V")
    public static final void method1805(byte arg0, class134 arg1, class134 arg2) {
        class280.field4294 = arg1;
        if (arg0 <= 46) {
            field4427 = null;
        }
        field4416++;
        class251.field3761 = arg2;
    }
}
