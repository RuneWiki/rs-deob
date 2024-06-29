import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class435 {

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field6430 = 16777215;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field6436 = 8;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[[Z")
    public static boolean[][] field6434 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[[I")
    public static int[][] field6435 = new int[6][];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field6425;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field6426;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field6431;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    public boolean field6428;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[I")
    public static int[] field6433;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lhp;I)V", line = 5)
    public final void method2693(class217 arg0, int arg1) {
        if (arg1 != -1) {
            this.method2696(false, null, -93);
        }
        while (true) {
            int var3 = arg0.method1515((byte) 123);
            if (var3 == 0) {
                field6432++;
                return;
            }
            this.method2696(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 26)
    public static void method2694(int arg0) {
        field6434 = null;
        if (arg0 > 83) {
            field6435 = null;
            field6433 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V", line = 39)
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class74 var7 = new class74();
        var7.field1048 = arg1 >> class163.field2415;
        var7.field1069 = arg2 >> class163.field2415;
        var7.field1063 = arg3 >> class163.field2415;
        var7.field1057 = arg4 >> class163.field2415;
        var7.field1058 = arg0;
        var7.field1051 = arg1;
        var7.field1053 = arg2;
        var7.field1055 = arg3;
        var7.field1065 = arg4;
        var7.field1060 = arg5;
        var7.field1062 = arg6;
        class506.field7399[class233.field3756++] = var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLhp;I)V", line = 76)
    private final void method2696(boolean arg0, class217 arg1, int arg2) {
        if (!arg0) {
            method2694(-3);
        }
        if (arg2 == 1) {
            this.field6436 = arg1.method1511(126);
        } else if (arg2 == 2) {
            this.field6428 = true;
        } else if (arg2 == 3) {
            this.field6437 = arg1.method1529((byte) 110);
            this.field6425 = arg1.method1529((byte) -60);
            this.field6431 = arg1.method1529((byte) 125);
        } else if (arg2 == 4) {
            this.field6426 = arg1.method1515((byte) 123);
        } else if (arg2 == 5) {
            this.field6427 = arg1.method1511(92);
        } else if (arg2 == 6) {
            this.field6430 = arg1.method1548(31529);
        }
        field6429++;
    }
}
