import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class211 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3373 = "Loading title screen - ";

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    public static int[] field3379 = new int[1000];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "[B")
    public byte[] field3378;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[B")
    public byte[] field3382;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[[[Lci;")
    public static class327[][][] field3372;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 13)
    public static void method1590(int arg0) {
        field3379 = null;
        if (arg0 != 24) {
            method1591((int[][]) ((int[][]) null), -13);
        }
        field3372 = (class327[][][]) null;
        field3373 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([[II)V", line = 29)
    public static final void method1591(int[][] arg0, int arg1) {
        field3371++;
        if (arg1 != 1000) {
            field3372 = (class327[][][]) ((class327[][][]) null);
        }
        class353.field5599 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1592(byte arg0) {
        class221.field3595 = null;
        class121.field2026 = null;
        class189.field3035 = null;
        class322.field5132 = null;
        field3383++;
        class19.field211 = null;
        if (arg0 == 41) {
            class163.field2578 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 68)
    public static final void method1593(byte arg0) {
        class221.field3587.method2326(-4);
        field3374++;
        if (arg0 != 39) {
            field3379 = (int[]) null;
        }
    }
}
