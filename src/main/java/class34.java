import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class34 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public int field492 = 1190717;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public int field493 = 128;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
    public boolean field495 = true;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Z")
    public boolean field496 = false;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public int field498 = 8;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field494 = -1;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field504 = 16;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Z")
    public boolean field506 = true;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field508 = -1;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public int field500 = 0;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[I")
    public static int[] field501 = new int[200];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
    public static int[] field503 = new int[50];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lme;")
    public static class295 field502;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 17)
    public static void method228(boolean arg0) {
        field502 = null;
        field501 = null;
        field503 = null;
        if (arg0) {
            method229(false);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)I", line = 29)
    public static final int method229(boolean arg0) {
        if (arg0) {
            field503 = (int[]) null;
        }
        field491++;
        return class37.field550;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILs;I)V", line = 48)
    public final void method230(int arg0, class170 arg1, int arg2) {
        field497++;
        while (true) {
            int var4 = arg1.method1221(97);
            if (var4 == 0) {
                if (arg2 != 22143) {
                    field501 = (int[]) null;
                }
                return;
            }
            this.method231(arg1, arg0, var4, true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ls;IIZ)V", line = 69)
    private final void method231(class170 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field507++;
        if (arg2 == 1) {
            this.field500 = class18.method114(arg0.method1208((byte) -111), 16711935);
        } else if (arg2 == 2) {
            this.field508 = arg0.method1221(102);
        } else if (arg2 == 3) {
            this.field508 = arg0.method1214(-18254);
            if (this.field508 == 65535) {
                this.field508 = -1;
            }
        } else if (arg2 == 5) {
            this.field506 = false;
        } else if (arg2 == 7) {
            this.field494 = class18.method114(arg0.method1208((byte) -99), 16711935);
        } else if (arg2 == 8) {
            class236.field3922 = arg1;
        } else if (arg2 == 9) {
            this.field493 = arg0.method1214(-18254);
        } else if (arg2 == 10) {
            this.field495 = false;
        } else if (arg2 == 11) {
            this.field498 = arg0.method1221(102);
        } else if (arg2 == 12) {
            this.field496 = true;
        } else if (arg2 == 13) {
            this.field492 = arg0.method1208((byte) -104);
        } else if (arg2 == 14) {
            this.field504 = arg0.method1221(124);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILme;)Llj;", line = 173)
    public static final class5 method232(int arg0, int arg1, int arg2, class295 arg3) {
        if (arg1 < 112) {
            method228(true);
        }
        field505++;
        return class33.method222(6, arg2, arg0, arg3) ? class287.method1998(101) : null;
    }
}
