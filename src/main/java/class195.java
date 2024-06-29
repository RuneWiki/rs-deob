import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class195 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field2642 = 1;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    public boolean field2646 = false;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
    public boolean field2643 = false;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field2641 = 64;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field2650 = 64;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field2638 = -1;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public int field2651 = 2;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lkca;")
    public static class73 field2640 = new class73(64, 6);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lkea;")
    public static class203 field2647;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lkea;")
    public static class203 field2652;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lvba;Lvba;I)V")
    public static final void method1242(class36 arg0, class36 arg1, int arg2) {
        if (arg1.field402 != null) {
            arg1.method199(-59);
        }
        field2639++;
        if (arg2 < 51) {
            method1244((byte) 89);
        }
        arg1.field399 = arg0.field399;
        arg1.field402 = arg0;
        arg1.field402.field399 = arg1;
        arg1.field399.field402 = arg1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method1243(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        class636.field9156 = arg1;
        field2648++;
        class277 var2 = class229.field3231;
        synchronized (class229.field3231) {
            class229.field3231.method1810(false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1244(byte arg0) {
        if (arg0 == 56) {
            field2640 = null;
            field2647 = null;
            field2652 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method1245(int arg0) {
        field2645++;
        if (class133.field1673 == 6) {
            class177.method1007((byte) -50, false);
            return;
        }
        class34.field387 = class170.field2077;
        if (arg0 != -31856) {
            field2640 = null;
        }
        class170.field2077 = null;
        class353.method2235(12, 1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILrt;I)V")
    private final void method1246(int arg0, int arg1, class194 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2638 = arg2.method1220(125);
            if (this.field2638 == 65535) {
                this.field2638 = -1;
            }
        } else if (arg0 == 2) {
            this.field2650 = arg2.method1220(124) + 1;
            this.field2641 = arg2.method1220(119) + 1;
        } else if (arg0 == 3) {
            arg2.method1213((byte) 89);
        } else if (arg0 == 4) {
            this.field2651 = arg2.method1177(255);
        } else if (arg0 == 5) {
            this.field2642 = arg2.method1177(255);
        } else if (arg0 == 6) {
            this.field2646 = true;
        } else if (arg0 == 7) {
            this.field2643 = true;
        }
        field2649++;
        if (arg3 < 116) {
            method1244((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILrt;)V")
    public final void method1247(int arg0, int arg1, class194 arg2) {
        field2644++;
        while (true) {
            int var4 = arg2.method1177(255);
            if (var4 == 0) {
                if (arg0 == 20309) {
                    return;
                } else {
                    field2647 = null;
                    return;
                }
            }
            this.method1246(var4, arg1, arg2, 125);
        }
    }
}
