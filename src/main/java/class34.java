import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class34 extends class181 {

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Z")
    public boolean field604;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[Lje;")
    public class34[] field612;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Ljk;")
    public static class297 field619 = null;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "Z")
    public static boolean field620 = false;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "B")
    public static byte field606;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lia;")
    public class14 field618;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Lki;")
    public static class158 field605;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lpk;")
    public static class237 field603;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lqe;")
    public class33 field610;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)[I")
    public int[] method43(int arg0, int arg1) {
        field615++;
        if (arg0 <= 75) {
            this.method220(true);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)V")
    public final void method229(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field620 = true;
        }
        int var4 = this.field614 == 255 ? arg0 : this.field614;
        if (this.field604) {
            this.field610 = new class33(var4, arg0, arg2);
        } else {
            this.field618 = new class14(var4, arg0, arg2);
        }
        field616++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILca;)V")
    public void method50(int arg0, int arg1, class54 arg2) {
        field609++;
        if (arg0 != 6) {
            field605 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)[I")
    public final int[] method230(int arg0, int arg1, int arg2) {
        field601++;
        if (arg1 != -15337) {
            this.method220(true);
        }
        return this.field612[arg2].field604 ? this.field612[arg2].method43(arg1 ^ 0xFFFFC477, arg0) : this.field612[arg2].method52((byte) -113, arg0)[0];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method231(int arg0, byte arg1, int arg2) {
        field607++;
        if (arg1 < 67) {
            this.method230(95, 127, -81);
        }
        if (this.field612[arg2].field604) {
            int[] var4 = this.field612[arg2].method43(108, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field612[arg2].method52((byte) 78, arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lkc;IIIIII)V")
    public static final void method232(class25 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class249.method1702(arg1, arg0.field455, arg6, arg3, 18602, arg2, arg5, arg0.field425);
        field602++;
        if (arg4 != -28348) {
            method232((class25) null, 43, 109, 65, -43, -88, 11);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
    public int method233(int arg0) {
        if (arg0 != -1) {
            field619 = null;
        }
        field617++;
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I")
    public int method220(boolean arg0) {
        if (arg0) {
            this.method52((byte) -104, 114);
        }
        field608++;
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public void method217(int arg0) {
        if (this.field604) {
            this.field610.method227(82);
            this.field610 = null;
        } else {
            this.field618.method92(126);
            this.field618 = null;
        }
        field598++;
        if (arg0 != 0) {
            field603 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field605 = null;
        field619 = null;
        if (arg0 != 52) {
            field619 = null;
        }
        field603 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IZ)V")
    public class34(int arg0, boolean arg1) {
        this.field604 = arg1;
        this.field612 = new class34[arg0];
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public void method62(int arg0) {
        int var2 = -73 % ((-arg0 - 2) / 43);
        field599++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)[[I")
    public int[][] method52(byte arg0, int arg1) {
        field613++;
        int var3 = -90 / ((-arg0 - 54) / 44);
        throw new IllegalStateException("This operation does not have a colour output");
    }
}
