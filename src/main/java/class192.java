import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class192 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field2558 = -1;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field2562 = 0;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field2563 = -1;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2559 = 64;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Z")
    public boolean field2557 = true;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field2567 = 8;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field2554 = 512;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public int field2573 = 127;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public boolean field2570 = true;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field2569 = 1190717;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Z")
    public boolean field2574 = false;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2561 = 765;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
    public static boolean field2572 = false;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lri;")
    public class111 field2571;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ldga;")
    public static class204 field2564;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lcl;")
    public static class265 field2560;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lcaa;")
    public static class302 field2556;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1191(int arg0) {
        if (arg0 != -29278) {
            field2564 = null;
        }
        field2556 = null;
        field2564 = null;
        field2560 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public final void method1192(byte arg0) {
        if (arg0 <= 113) {
            method1191(-49);
        }
        this.field2567 = this.field2568 | this.field2567 << 8;
        field2555++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lee;II)V")
    private final void method1193(class675 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2562 = class603.method3389(arg0.method3756(false), (byte) 79);
        } else if (arg1 == 2) {
            this.field2563 = arg0.method3750((byte) 35);
        } else if (arg1 == 3) {
            this.field2563 = arg0.method3757((byte) -65);
            if (this.field2563 == 65535) {
                this.field2563 = -1;
            }
        } else if (arg1 == 5) {
            this.field2570 = false;
        } else if (arg1 == 7) {
            this.field2558 = class603.method3389(arg0.method3756(false), (byte) -97);
        } else if (arg1 == 8) {
            this.field2571.field1369 = this.field2568;
        } else if (arg1 == 9) {
            this.field2554 = arg0.method3757((byte) -65) << 2;
        } else if (arg1 == 10) {
            this.field2557 = false;
        } else if (arg1 == 11) {
            this.field2567 = arg0.method3750((byte) 35);
        } else if (arg1 == 12) {
            this.field2574 = true;
        } else if (arg1 == 13) {
            this.field2569 = arg0.method3756(false);
        } else if (arg1 == 14) {
            this.field2559 = arg0.method3750((byte) 35) << 2;
        } else if (arg1 == 16) {
            this.field2573 = arg0.method3750((byte) 35);
        }
        field2566++;
        if (arg2 != -11) {
            this.method1193(null, -70, 126);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1194(byte arg0, String arg1) {
        if (arg0 <= 79) {
            method1191(-12);
        }
        class336.method2182(-83, arg1, "", 0, "", "", 0);
        field2575++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lee;I)V")
    public final void method1195(class675 arg0, int arg1) {
        field2565++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                if (arg1 >= -18) {
                    this.field2563 = 96;
                    return;
                } else {
                    return;
                }
            }
            this.method1193(arg0, var3, -11);
        }
    }
}
