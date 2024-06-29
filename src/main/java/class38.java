import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 extends class37 {

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "[[I")
    public int[][] field750;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field737 = 0;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lo;")
    public static class84 field744 = class15.method124("red:", 255);

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Lo;")
    public static class84 field741 = class15.method124("To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3", 255);

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lo;")
    public static class84 field743 = class15.method124("@whi@", 255);

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "Lba;")
    public static class8 field752;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lqb;")
    public static class96 field739;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lqb;")
    public static class96 field751;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lcb;")
    public static class15[] field736;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "[[[I")
    public static int[][][] field745;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lud;ILud;)V", line = 4)
    public static final void method336(class118 arg0, int arg1, class118 arg2) {
        field735++;
        class84.field1898 = arg0;
        if (arg1 == 3) {
            class80.field1718 = arg2;
            class123.field2760 = class80.field1718.method917(3, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 22)
    public static final int method337(int arg0, int arg1, int arg2) {
        field742++;
        long var3 = (long) ((arg0 << arg2) + arg1);
        return class109.field2373 != null && class109.field2373.field731 == var3 ? class35.field693.field482 * 99 / (class35.field693.field502.length - class109.field2373.field1002) + 1 : 0;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I[B)V", line = 64)
    public class38(int arg0, byte[] arg1) {
        this.field740 = arg0;
        class27 var3 = new class27(arg1);
        this.field749 = var3.method231(255);
        this.field738 = new int[this.field749];
        this.field750 = new int[this.field749][];
        for (int var4 = 0; var4 < this.field749; var4++) {
            this.field738[var4] = var3.method231(255);
        }
        for (int var5 = 0; var5 < this.field749; var5++) {
            this.field750[var5] = new int[var3.method231(255)];
        }
        for (int var6 = 0; var6 < this.field749; var6++) {
            for (int var7 = 0; var7 < this.field750[var6].length; var7++) {
                this.field750[var6][var7] = var3.method231(255);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 107)
    public static void method338(byte arg0) {
        field736 = null;
        field739 = null;
        field752 = null;
        field743 = null;
        field745 = null;
        field744 = null;
        field751 = null;
        field741 = null;
        if (arg0 != 35) {
            field743 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 131)
    public static final void method339(int arg0, Graphics arg1) {
        field747++;
        if (arg0 != 4) {
            field745 = null;
        }
        class14.field259.method705(0, arg1, 550, 4);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 152)
    public static final void method340(int arg0, int arg1) {
        field746++;
        class80.method589(false, (byte) -92, null, 0, arg0);
        if (arg1 != -16877) {
            field743 = null;
        }
    }
}
