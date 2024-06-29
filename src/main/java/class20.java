import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class20 extends class132 {

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Ltg;")
    public static class184 field377 = class135.method812("Sichtbare Karte vorbereitet)3", 3);

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ltg;")
    public static class184 field379 = class135.method812("(U2", 3);

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field383 = -1;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
    public static int[] field381 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ltg;")
    private static class184 field387 = class135.method812("red:", 3);

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field382 = 0;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Ltg;")
    public static class184 field378 = field387;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Ltg;")
    public static class184 field388 = field387;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field386 = 0;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lvb;")
    public static class197 field380;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static void method125(boolean arg0) {
        field381 = null;
        field388 = null;
        if (!arg0) {
            return;
        }
        field380 = null;
        field379 = null;
        field377 = null;
        field387 = null;
        field378 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class20(int arg0) {
        this.field384 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lde;B)V")
    public static final void method126(class35 arg0, byte arg1) {
        if (arg1 >= -68) {
            field377 = null;
        }
        field385++;
        if (arg0.field636 == 0) {
            return;
        }
        if (arg0.field653 != -1 && arg0.field653 < 32768) {
            class158 var2 = class52.field948[arg0.field653];
            if (var2 != null) {
                int var3 = arg0.field614 - var2.field614;
                int var4 = arg0.field635 - var2.field635;
                if (var4 != 0 || var3 != 0) {
                    arg0.field649 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field653 >= 32768) {
            int var5 = arg0.field653 - 32768;
            if (class125.field2260 == var5) {
                var5 = 2047;
            }
            class67 var6 = class57.field1024[var5];
            if (var6 != null) {
                int var7 = arg0.field635 - var6.field635;
                int var8 = arg0.field614 - var6.field614;
                if (var7 != 0 || var8 != 0) {
                    arg0.field649 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field605 != 0 || arg0.field654 != 0) && (arg0.field598 == 0 || arg0.field664 > 0)) {
            int var9 = arg0.field635 - (arg0.field605 - class57.field1020 - class57.field1020) * 64;
            int var10 = arg0.field614 - (arg0.field654 - class129.field2331 - class129.field2331) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field649 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field654 = 0;
            arg0.field605 = 0;
        }
        int var11 = arg0.field649 - arg0.field647 & 0x7FF;
        if (var11 == 0) {
            arg0.field646 = 0;
            return;
        }
        arg0.field646++;
        if (var11 > 1024) {
            arg0.field647 -= arg0.field636;
            boolean var12 = true;
            if (var11 < arg0.field636 || 2048 - arg0.field636 < var11) {
                arg0.field647 = arg0.field649;
                var12 = false;
            }
            if (arg0.field655 == arg0.field596 && (arg0.field646 > 25 || var12)) {
                if (arg0.field663 == -1) {
                    arg0.field655 = arg0.field627;
                } else {
                    arg0.field655 = arg0.field663;
                }
            }
        } else {
            arg0.field647 += arg0.field636;
            boolean var13 = true;
            if (arg0.field636 > var11 || var11 > 2048 - arg0.field636) {
                var13 = false;
                arg0.field647 = arg0.field649;
            }
            if (arg0.field655 == arg0.field596 && (arg0.field646 > 25 || var13)) {
                if (arg0.field656 == -1) {
                    arg0.field655 = arg0.field627;
                } else {
                    arg0.field655 = arg0.field656;
                }
            }
        }
        arg0.field647 &= 0x7FF;
    }
}
