import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class257 {

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public int field4498 = -1;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field4494 = 0;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field4500 = -1;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Z")
    public boolean field4488 = true;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lid;")
    private static class149 field4492 = class60.method382("flash1:", (byte) 45);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lid;")
    public static class149 field4495 = field4492;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[I")
    public static int[] field4501 = new int[25];

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lid;")
    public static class149 field4503 = class60.method382(",Mcran)2titre ouvert", (byte) 75);

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lid;")
    public static class149 field4502 = field4492;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Lid;")
    public static class149 field4505 = class60.method382("(U3", (byte) 91);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[Lvc;")
    public static class190[] field4487;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static void method1771(boolean arg0) {
        field4505 = null;
        field4501 = null;
        if (!arg0) {
            field4495 = null;
        }
        field4487 = null;
        field4502 = null;
        field4495 = null;
        field4503 = null;
        field4492 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lgd;BI)V")
    public final void method1772(class74 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method489((byte) -32);
            if (var4 == 0) {
                field4490++;
                int var5 = -37 / ((arg1 + 57) / 52);
                return;
            }
            this.method1774(arg2, arg0, var4, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILal;)V")
    public static final void method1773(int arg0, class230 arg1) {
        field4491++;
        if (arg0 < 43) {
            method1771(false);
        }
        class173.field3197 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILgd;IB)V")
    private final void method1774(int arg0, class74 arg1, int arg2, byte arg3) {
        field4499++;
        if (arg2 == 1) {
            this.field4494 = class23.method132(arg3 - 193, arg1.method525(65280));
        } else if (arg2 == 2) {
            this.field4498 = arg1.method489((byte) 81);
        } else if (arg2 == 3) {
            this.field4498 = arg1.method485(-2386);
            if (this.field4498 == 65535) {
                this.field4498 = -1;
            }
        } else if (arg2 == 5) {
            this.field4488 = false;
        } else if (arg2 == 7) {
            this.field4500 = class23.method132(-110, arg1.method525(arg3 ^ 0xFF42));
        } else if (arg2 == 8) {
            class35.field519 = arg0;
        } else if (arg2 == 9) {
            arg1.method485(arg3 ^ 0xFFFFF6EC);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg1.method489((byte) 120);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg1.method525(65280);
                } else if (arg2 == 14) {
                    arg1.method489((byte) -55);
                }
            }
        }
        if (arg3 != 66) {
            method1771(true);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Laj;ILvc;ZIII)V")
    public static final void method1775(class47 arg0, int arg1, class190 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field4504++;
        if (arg2 == null) {
            return;
        }
        int var7 = class55.field985 + class184.field3320 & 0x7FF;
        int var8 = arg4 * arg4 + arg6 * arg6;
        int var9 = Math.max(arg0.field722 / 2, arg0.field727 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class235.field4123[var7];
        if (!arg3) {
            return;
        }
        int var11 = class235.field4118[var7];
        int var12 = var10 * 256 / (class232.field4093 + 256);
        int var13 = var11 * 256 / (class232.field4093 + 256);
        int var14 = arg4 * var13 + arg6 * var12 >> 16;
        int var15 = arg6 * var13 - arg4 * var12 >> 16;
        ((class46) arg2).method286(arg0.field722 / 2 + var14 + arg1 - arg2.field3411 / 2, arg0.field727 / 2 + -var15 + arg5 - arg2.field3401 / 2, arg0.field712, arg0.field870);
    }
}
