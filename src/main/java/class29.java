import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class29 extends class181 {

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    private final int field627;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    private final int field623;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    private final int field624;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    private final int field626;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Loc;")
    public static class151 field616 = class137.method873(2, "Freie Welt");

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Loc;")
    private static class151 field611 = class137.method873(2, "This world is full)3");

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Loc;")
    public static class151 field619 = class137.method873(2, "headicons_pk");

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[[[Lv;")
    public static class218[][][] field615 = new class218[4][104][104];

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Loc;")
    public static class151 field610 = field611;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Loc;")
    public static class151 field613 = null;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Loc;")
    public static class151 field625 = class137.method873(2, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Loc;")
    public static class151 field622 = class137.method873(2, "null");

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lfh;")
    public static class63 field612;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Lc;")
    public static final class23 method220(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1412;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method221(int arg0) {
        field625 = null;
        field611 = null;
        field610 = null;
        if (arg0 == 104) {
            field622 = null;
            field615 = null;
            field613 = null;
            field612 = null;
            field619 = null;
            field616 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
    public final void method47(byte arg0, int arg1, int arg2) {
        ++field618;
        int var4 = this.field623 * arg2 >> 12;
        int var5 = this.field626 * arg2 >> 12;
        int var6 = this.field627 * arg1 >> 12;
        int var7 = this.field624 * arg1 >> 12;
        class103.method629(arg0 + -3811, var6, super.field3275, var4, var5, var7);
        if (arg0 != -101) {
            this.method50(-112, -26, 99);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public static final int method222(int arg0, int arg1) {
        ++field617;
        if (class123.field2212 == 1) {
            return 7;
        } else if (arg0 != 77) {
            if (~arg0 != -39) {
                if (~arg0 != -17) {
                    if (~arg0 != -162) {
                        if (~arg0 != -192) {
                            if (~arg0 == -70) {
                                return 6;
                            } else {
                                if (arg1 <= 80) {
                                    method221(51);
                                }
                                return 0;
                            }
                        } else {
                            return 5;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIII)V")
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field627 = arg1;
        this.field623 = arg0;
        this.field624 = arg3;
        this.field626 = arg2;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BII)V")
    public final void method48(byte arg0, int arg1, int arg2) {
        if (arg0 != 125) {
            field612 = null;
        }
        ++field614;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method48((byte) -76, -70, -79);
        }
        ++field621;
        int var4 = this.field623 * arg0 >> 12;
        int var5 = this.field626 * arg0 >> 12;
        int var6 = this.field624 * arg2 >> 12;
        int var7 = this.field627 * arg2 >> 12;
        class189.method1169(super.field3279, super.field3274, var5, -1, var4, super.field3275, var7, var6);
    }
}
