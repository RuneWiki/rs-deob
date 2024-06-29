import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public abstract class class245 {

    @OriginalMember(owner = "client!uha", name = "k", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "[Lae;")
    public static class253[] field3566 = new class253[14];

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!uha", name = "h", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!uha", name = "i", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!uha", name = "j", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)V")
    public abstract void method161(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(III)V")
    public static final void method1630(int arg0, int arg1, int arg2) {
        class22.method118((byte) 99, arg2, arg0);
        int var3 = -52 % ((-arg1 - 56) / 52);
        field3568++;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Z")
    public static final boolean method1631(int arg0, int arg1) {
        if (arg0 != -10) {
            method1631(-87, -126);
        }
        field3573++;
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)Z")
    public static final boolean method1632(int arg0, int arg1) {
        field3571++;
        if (class408.field6161[arg1]) {
            return true;
        } else if (class673.field9387.method219(2, arg1)) {
            if (arg0 != 816183856) {
                field3566 = null;
            }
            int var2 = class673.field9387.method229(arg1, 0);
            if (var2 == 0) {
                class408.field6161[arg1] = true;
                return true;
            }
            if (class86.field1229[arg1] == null) {
                class86.field1229[arg1] = new class46[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class86.field1229[arg1][var3] == null) {
                    byte[] var4 = class673.field9387.method211(true, arg1, var3);
                    if (var4 != null) {
                        class46 var5 = class86.field1229[arg1][var3] = new class46();
                        var5.field610 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method335(new class645(var4), arg0 - 816183848);
                    }
                }
            }
            class408.field6161[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(II)Z")
    public static final boolean method1633(int arg0, int arg1) {
        if (arg1 != 695) {
            field3566 = null;
        }
        field3572++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(III)V")
    public abstract void method159(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "(III)Lica;")
    public static final class665 method1634(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2835;
    }

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "(III)V")
    public abstract void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "(III)I")
    public static final int method1635(int arg0, int arg1, int arg2) {
        field3565++;
        if (arg2 < 26) {
            field3566 = null;
        }
        return arg0 == 1 || arg0 == 3 ? class78.field1088[arg1 & 0x3] : class702.field9795[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "([[II)V")
    public static final void method1636(int[][] arg0, int arg1) {
        class664.field9322 = arg0;
        field3564++;
        if (arg1 >= -79) {
            method1637(-93);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public static void method1637(int arg0) {
        if (arg0 == 4) {
            field3566 = null;
        }
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(III)V")
    public class245(int arg0, int arg1, int arg2) {
        this.field3574 = arg1;
        this.field3570 = arg2;
        this.field3567 = arg0;
    }
}
