import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class139 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljb;")
    private class256 field2643 = new class256();

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljd;")
    private static class86 field2648 = class122.method868("Allocated memory", true);

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2646 = 255;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ljd;")
    public static class86 field2650 = field2648;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2641 = 128;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljd;")
    private static class86 field2654 = class122.method868("RuneScape is loading )2 please wait)3)3)3", true);

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Ljd;")
    public static class86 field2655 = field2654;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Ljb;")
    private class256 field2647;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method989(int arg0) {
        if (arg0 == 128) {
            field2654 = null;
            field2655 = null;
            field2648 = null;
            field2650 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Ljb;")
    public final class256 method990(int arg0) {
        class256 var2 = this.field2643.field4545;
        field2649++;
        if (arg0 != 0) {
            field2650 = null;
        }
        if (this.field2643 == var2) {
            return null;
        } else {
            var2.method1728(arg0 ^ 0x3E8);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljb;Z)V")
    public final void method991(class256 arg0, boolean arg1) {
        if (arg0.field4546 != null) {
            arg0.method1728(1000);
        }
        arg0.field4545 = this.field2643;
        if (!arg1) {
            this.method991((class256) null, false);
        }
        arg0.field4546 = this.field2643.field4546;
        arg0.field4546.field4545 = arg0;
        field2642++;
        arg0.field4545.field4546 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
    public final int method992(boolean arg0) {
        field2652++;
        if (arg0) {
            this.field2643 = null;
        }
        int var2 = 0;
        for (class256 var3 = this.field2643.field4545; var3 != this.field2643; var3 = var3.field4545) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)J")
    public static final long method993(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        return var3 == null || var3.field4433 == null ? 0L : var3.field4433.field4576;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public final void method994(int arg0) {
        while (true) {
            class256 var2 = this.field2643.field4545;
            if (this.field2643 == var2) {
                if (arg0 != 8) {
                    this.method991((class256) null, true);
                }
                field2656++;
                this.field2647 = null;
                return;
            }
            var2.method1728(1000);
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Ljb;")
    public final class256 method995(int arg0) {
        if (arg0 != 26386) {
            this.method996(-16);
        }
        field2653++;
        class256 var2 = this.field2643.field4545;
        if (this.field2643 == var2) {
            this.field2647 = null;
            return null;
        } else {
            this.field2647 = var2.field4545;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)Ljb;")
    public final class256 method996(int arg0) {
        class256 var2 = this.field2647;
        if (arg0 > -68) {
            this.method995(-125);
        }
        field2644++;
        if (this.field2643 == var2) {
            this.field2647 = null;
            return null;
        } else {
            this.field2647 = var2.field4545;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public static final void method997(int arg0, boolean arg1) {
        if (arg1) {
            if (class178.field3225 != -1) {
                class161.method1172(0, class178.field3225);
            }
            for (class1 var2 = (class1) class1.field15.method1709(-38); var2 != null; var2 = (class1) class1.field15.method1704(-93)) {
                class233.method1616(true, var2, true);
            }
            class178.field3225 = -1;
            class1.field15 = new class252(8);
            class100.method722((byte) -72);
            class178.field3225 = class55.field1131;
            class241.method1651(false, (byte) -122);
            class273.method1857((byte) -106);
            class244.method1663(false, class178.field3225);
        }
        field2645++;
        class124.field2412 = new class224();
        class124.field2412.field685 = 3000;
        class124.field2412.field676 = 3000;
        class22.method167(true, class56.field1141);
        class138.method983(10, (byte) 102);
        if (arg0 != 5604) {
            field2641 = -128;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class139() {
        this.field2643.field4545 = this.field2643;
        this.field2643.field4546 = this.field2643;
    }
}
