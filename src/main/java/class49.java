import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 implements class334 {

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Lww;")
    private class761 field493;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "[Lku;")
    private class396[] field499;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Ljb;")
    public static class519 field485 = new class519(63, 1);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field494 = 0;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "F")
    public static float field495 = 0.0F;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "F")
    public static float field491;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Lha;")
    private class66 field490;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Z")
    private boolean field487;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)I")
    public final int method305(int arg0) {
        field496++;
        int var2 = 0;
        int var3 = -49 % ((arg0 + 62) / 42);
        class396[] var4 = this.field499;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class396 var6 = var4[var5];
            if (var6 == null || var6.method210(16125)) {
                var2++;
            }
        }
        return var2 * 100 / this.field499.length;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public final void method306(int arg0) {
        field489++;
        if (class375.field5490 != this.field490) {
            this.field490 = class375.field5490;
            this.field487 = true;
        }
        this.field490.method493(0);
        class396[] var2 = this.field499;
        int var3 = 0;
        if (arg0 != 11133) {
            this.field499 = null;
        }
        while (var3 < var2.length) {
            class396 var4 = var2[var3];
            if (var4 != null) {
                var4.method211((byte) -114);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public final void method307(int arg0) {
        field501++;
        if (arg0 != 8883) {
            field497 = -117;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method308(boolean arg0) {
        if (arg0) {
            field494 = 67;
        }
        field485 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BJ)Z")
    public final boolean method309(byte arg0, long arg1) {
        field492++;
        if (arg0 > -73) {
            return false;
        } else {
            return (long) this.field493.field10461 + arg1 <= class401.method2440(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)Z")
    public static final boolean method310(int arg0, int arg1, byte arg2) {
        field500++;
        if (arg2 < 28) {
            method312((byte) -126);
        }
        if (arg0 >= 0 && arg1 >= 0 && arg0 < class328.field4667[1].length && class328.field4667[1][arg0].length > arg1) {
            return (class328.field4667[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)I")
    public final int method311(byte arg0) {
        if (arg0 != 14) {
            this.field499 = null;
        }
        field498++;
        return this.field493.field10455;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public static final void method312(byte arg0) {
        class408.field5772.method3103(-11294);
        field488++;
        if (arg0 < 121) {
            method312((byte) -34);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lww;Lhq;)V")
    public class49(class761 arg0, class169 arg1) {
        this.field493 = arg0;
        this.field499 = new class396[this.field493.field10463.length];
        for (int var3 = 0; var3 < this.field499.length; var3++) {
            this.field499[var3] = arg1.method1145(-12631, this.field493.field10463[var3]);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZB)V")
    public final void method313(boolean arg0, byte arg1) {
        field486++;
        boolean var3 = true;
        class396[] var4 = this.field499;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class396 var6 = var4[var5];
            if (var6 != null) {
                var6.method209(var3 || this.field487, 7582);
            }
        }
        if (arg1 != 2) {
            this.field499 = null;
        }
        this.field487 = false;
    }
}
