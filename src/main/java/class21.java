import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class30 {

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
    private int field494 = 0;

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "I")
    private int field489 = 0;

    @OriginalMember(owner = "client!c", name = "Ob", descriptor = "Z")
    public boolean field499 = false;

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!c", name = "Tb", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!c", name = "Pb", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!c", name = "Rb", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!c", name = "Mb", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!c", name = "Xb", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "client!c", name = "Ub", descriptor = "Lah;")
    private class9 field505;

    @OriginalMember(owner = "client!c", name = "Nb", descriptor = "[I")
    public static int[] field498 = new int[50];

    @OriginalMember(owner = "client!c", name = "Qb", descriptor = "Lgg;")
    public static class63 field501 = class116.method911(43, "mapscene");

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!c", name = "Wb", descriptor = "Lgg;")
    private static class63 field507 = class116.method911(43, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!c", name = "Vb", descriptor = "Lgg;")
    public static class63 field506 = field507;

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!c", name = "Sb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!c", name = "Yb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!c", name = "Zb", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!c", name = "Kb", descriptor = "Ljc;")
    public static class85 field495;

    @OriginalMember(owner = "client!c", name = "Lb", descriptor = "[I")
    public static int[] field496;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Ldf;")
    public final class36 method220(int arg0) {
        field503++;
        class46 var2 = class19.method198(89, this.field504);
        class36 var3;
        if (this.field499) {
            var3 = var2.method464(-129, -1);
        } else {
            var3 = var2.method464(-129, this.field494);
        }
        if (var3 == null) {
            return null;
        } else if (arg0 == 0) {
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)J")
    public static final long method221(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null || var3.field2294 == null ? 0L : var3.field2294.field961;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
    public final void method222(int arg0, byte arg1) {
        field510++;
        if (this.field499) {
            return;
        }
        this.field489 += arg0;
        while (this.field505.field201[this.field494] < this.field489) {
            this.field489 -= this.field505.field201[this.field494];
            this.field494++;
            if (this.field494 >= this.field505.field219.length) {
                this.field499 = true;
                break;
            }
        }
        if (arg1 > -52) {
            this.field494 = 57;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILgg;)Z")
    public static final boolean method223(int arg0, class63 arg1) {
        field493++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < class37.field868; var2++) {
                if (arg1.method601(13117, class140.field3022[var2])) {
                    return true;
                }
            }
            return arg1.method601(13117, class3.field72.field1552);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public static void method224(int arg0) {
        field506 = null;
        if (arg0 != 0) {
            method221(5, 109, -114);
        }
        field498 = null;
        field501 = null;
        field495 = null;
        field507 = null;
        field496 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIIII)V")
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field490 = arg1;
        this.field504 = arg0;
        this.field500 = arg4;
        this.field502 = arg2;
        this.field497 = arg3;
        this.field508 = arg5 + arg6;
        int var8 = class19.method198(35, this.field504).field1076;
        if (var8 == -1) {
            this.field499 = true;
        } else {
            this.field499 = false;
            this.field505 = class49.method480(1000, var8);
        }
    }
}
