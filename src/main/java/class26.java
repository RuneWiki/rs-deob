import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class26 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lce;")
    private static class126 field371 = class206.method1445(-7923, "wave2:");

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lce;")
    public static class126 field374 = class206.method1445(-7923, "rot:");

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lce;")
    public static class126 field373 = class206.method1445(-7923, "l");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lce;")
    public static class126 field370 = field371;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lce;")
    public static class126 field365 = field371;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field372 = -1;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lcc;")
    public static class313 field362;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[[[I")
    public static int[][][] field369;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 20)
    public static void method124(boolean arg0) {
        field371 = null;
        field370 = null;
        if (arg0) {
            return;
        }
        field373 = null;
        field362 = null;
        field374 = null;
        field369 = (int[][][]) null;
        field365 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 38)
    public static final int method125(int arg0, int arg1) {
        if (arg0 != 14319) {
            method126(-72, -79);
        }
        field364++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V", line = 73)
    public static final void method126(int arg0, int arg1) {
        class300.field4973 = new int[arg1];
        class22.field310 = new int[arg1];
        field361++;
        if (arg0 != -10340) {
            method126(56, 28);
        }
        class174.field3073 = new int[arg1];
        class253.field4253 = new int[arg1];
        class305.field5127 = new int[arg1];
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public abstract void method11(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method10(int arg0, int arg1);
}
