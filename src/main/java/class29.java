import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class29 {

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public int field602 = 3;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
    public boolean field598 = true;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Z")
    public boolean field593 = true;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field599 = 0;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field611 = 0;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    public boolean field596 = true;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Z")
    public boolean field609 = true;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public int field615 = 0;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public int field604 = 2;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field594 = 255;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
    public boolean field616 = false;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
    public boolean field612 = true;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Z")
    public boolean field618 = true;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public boolean field617 = true;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field595 = 1;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Z")
    public boolean field623 = false;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public int field620 = 0;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field625 = 2;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field597 = 0;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field607 = 127;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public int field628 = 0;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Z")
    public boolean field629 = true;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public int field619 = 2;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Z")
    public boolean field631 = true;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public int field630 = 127;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public int field626 = 2;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Z")
    public boolean field621 = true;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
    public boolean field603 = true;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
    public boolean field632 = true;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public int field610 = 0;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Z")
    public boolean field608 = false;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[I")
    public static int[] field622 = new int[14];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lgr;")
    public static class296 field614 = new class296(7, 3);

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field633 = 0;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "[I")
    public static int[] field634 = new int[32];

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
    public boolean field601;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Z")
    public boolean field605;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Z")
    public boolean field613;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
    public final void method334(byte arg0, int arg1, int arg2) {
        if (arg0 <= 93) {
            this.method338(56, -1);
        }
        if (arg2 == 1 || arg2 == 3) {
            this.field625 = arg1;
        } else {
            this.field597 = arg1;
        }
        field600++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIB)V")
    public final void method335(boolean arg0, int arg1, byte arg2) {
        field627++;
        if (arg1 == 1 || arg1 == 3) {
            this.field613 = arg0;
        } else {
            this.field605 = arg0;
        }
        if (arg2 != -97) {
            this.method338(-8, 84);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method336(int arg0) {
        field622 = null;
        int var1 = 99 % ((42 - arg0) / 36);
        field634 = null;
        field614 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Z")
    public final boolean method337(int arg0, byte arg1) {
        field624++;
        if (arg1 <= 112) {
            field633 = 17;
        }
        return arg0 == 1 || arg0 == 3 ? this.field613 : this.field605;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public final int method338(int arg0, int arg1) {
        field606++;
        if (arg0 != -4) {
            field633 = 87;
        }
        return arg1 == 1 || arg1 == 3 ? this.field625 : this.field597;
    }

    static {
        new class342("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
