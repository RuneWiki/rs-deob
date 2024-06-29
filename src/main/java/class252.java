import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class252 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field4351 = 0;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public int field4353 = 0;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Z")
    private boolean field4369 = false;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lml;")
    public static class290 field4358 = new class290();

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4368 = 0;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4364 = Calendar.getInstance();

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "J")
    public long field4356;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Log;")
    public static class222 field4360;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLik;)V")
    public final void method1632(byte arg0, class261 arg1) {
        if (arg0 < 115) {
            return;
        }
        while (true) {
            int var3 = arg1.method1693((byte) -87);
            if (var3 == 0) {
                field4357++;
                return;
            }
            this.method1636(arg1, (byte) -75, var3);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lhk;ZLhk;)V")
    public static final void method1633(class125 arg0, boolean arg1, class125 arg2) {
        if (arg0.field2192 != null) {
            arg0.method828((byte) -20);
        }
        arg0.field2192 = arg2.field2192;
        arg0.field2184 = arg2;
        field4352++;
        arg0.field2192.field2184 = arg0;
        if (!arg1) {
            method1634((byte) -14);
        }
        arg0.field2184.field2192 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1634(byte arg0) {
        field4358 = null;
        field4360 = null;
        if (arg0 <= 49) {
            method1634((byte) 114);
        }
        field4364 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public final void method1635(byte arg0) {
        field4349++;
        this.field4350 = class134.field2344[this.field4355];
        this.field4359 = (int) Math.sqrt((double) (this.field4365 * this.field4365 + (this.field4363 * this.field4363 + (this.field4366 * this.field4366))));
        if (arg0 >= -29) {
            return;
        }
        if (this.field4354 == 0) {
            this.field4354 = 1;
        }
        if (this.field4362 == 0) {
            this.field4356 = 2147483647L;
        } else if (this.field4362 == 1) {
            this.field4356 = (long) (this.field4359 * 8 / this.field4354);
            this.field4356 *= this.field4356;
        } else if (this.field4362 == 2) {
            this.field4356 = (long) (this.field4359 * 8 / this.field4354);
        }
        if (this.field4369) {
            this.field4359 *= -1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lik;BI)V")
    private final void method1636(class261 arg0, byte arg1, int arg2) {
        if (arg1 != -75) {
            field4368 = -13;
        }
        if (arg2 == 1) {
            this.field4355 = arg0.method1740((byte) 105);
        } else if (arg2 == 2) {
            arg0.method1693((byte) -128);
        } else if (arg2 == 3) {
            this.field4363 = arg0.method1712(-4);
            this.field4365 = arg0.method1712(-4);
            this.field4366 = arg0.method1712(-4);
        } else if (arg2 == 4) {
            this.field4362 = arg0.method1693((byte) -108);
            this.field4354 = arg0.method1712(-4);
        } else if (arg2 == 6) {
            this.field4367 = arg0.method1693((byte) -111);
        } else if (arg2 == 8) {
            this.field4351 = 1;
        } else if (arg2 == 9) {
            this.field4353 = 1;
        } else if (arg2 == 10) {
            this.field4369 = true;
        }
        field4370++;
    }
}
