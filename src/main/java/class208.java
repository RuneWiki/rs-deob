import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class208 extends class120 {

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lok;")
    private static class41 field3363 = class137.method956("level: ", 45);

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Lok;")
    public static class41 field3364 = field3363;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static volatile int field3366 = 0;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "Lok;")
    public static class41 field3369 = class137.method956("(Y<)4col>", 45);

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "[Lka;")
    public static class279[] field3362;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "[[I")
    public static int[][] field3365;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method14(int arg0, int arg1) {
        field3367++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 == -14959) {
            if (this.field1775.field1798) {
                class21.method143(var3, 0, class307.field5160, class16.field216[arg0]);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V", line = 40)
    public static void method1468(boolean arg0) {
        field3369 = null;
        field3364 = null;
        field3363 = null;
        field3362 = null;
        field3365 = (int[][]) null;
        if (arg0) {
            method1469(false, -4);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)V", line = 54)
    public static final void method1469(boolean arg0, int arg1) {
        field3370++;
        if (arg0) {
            method1469(false, -30);
        }
        class117.field1705 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 68)
    public class208() {
        super(0, true);
    }
}
