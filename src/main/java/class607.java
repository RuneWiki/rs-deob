import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class607 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Z")
    public boolean field8610 = false;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public int field8613;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public int field8614;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Ltd;")
    public static class515 field8612;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lle;")
    public class734 field8609;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method3535(int arg0) {
        if (arg0 != -25068) {
            this.field8614 = 16;
        }
        field8611++;
        return this.field8609.field10295.method2609(0, this.field8614);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method3536(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class346.field4951 != null) {
            class346.field4951[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class167.field2372 != null) {
            class167.field2372[arg0][arg1] = (short) arg3;
        }
        if (class609.field8690 != null) {
            class609.field8690[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILsl;)V", line = 31)
    private final void method3537(int arg0, int arg1, class479 arg2) {
        field8608++;
        int var4 = -17 / ((arg0 + 16) / 35);
        if (arg1 == 1) {
            this.field8614 = arg2.method2882(-1);
        } else if (arg1 == 2) {
            this.field8613 = arg2.method2865(255);
        } else if (arg1 == 3) {
            this.field8610 = true;
        } else if (arg1 == 4) {
            this.field8614 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 61)
    public static void method3538(byte arg0) {
        if (arg0 <= 68) {
            field8612 = null;
        }
        field8612 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lsl;Z)V", line = 78)
    public final void method3539(class479 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                if (!arg1) {
                    this.field8609 = null;
                }
                field8615++;
                return;
            }
            this.method3537(-113, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIILha;)Ltd;", line = 98)
    public final class515 method3540(boolean arg0, int arg1, int arg2, class543 arg3) {
        if (arg1 <= 125) {
            return null;
        }
        field8607++;
        long var5 = (long) (arg2 << 16 | this.field8614 | (arg0 ? 262144 : 0) | arg3.field7874 << 19);
        class515 var7 = (class515) this.field8609.field10299.method2216(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field8609.field10295.method2609(0, this.field8614)) {
            class676 var8 = class676.method3850(this.field8609.field10295, this.field8614, 0);
            if (var8 != null) {
                var8.field9611 = var8.field9613 = var8.field9617 = var8.field9610 = 0;
                if (arg0) {
                    var8.method3838();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method3844();
                }
            }
            class515 var10 = arg3.method202(var8, true);
            if (var10 != null) {
                this.field8609.field10299.method2213((byte) -16, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }
}
