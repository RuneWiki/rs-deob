import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class368 extends class694 {

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Loj;")
    public static class346 field5262 = new class346(8);

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    private int field5263;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
    public static boolean field5268;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "[[[Lhl;")
    public static class486[][][] field5264;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
    public static void method2164(int arg0) {
        if (arg0 != 16711680) {
            field5264 = null;
        }
        field5264 = null;
        field5262 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static final void method2165(byte arg0) {
        ++field5265;
        int var1 = -116 % ((12 - arg0) / 57);
        class223.method1427();
        for (int var2 = 0; ~var2 > -5; ++var2) {
            class480.field6696[var2].method2612((byte) 24);
        }
        class690.method3799(20445);
        class658.method3646(14344);
        System.gc();
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        if (arg0 != -22151) {
            this.field5258 = 57;
        }
        ++field5259;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class465.field6544; ++var7) {
                var4[var7] = this.field5263;
                var5[var7] = this.field5267;
                var6[var7] = this.field5258;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class368() {
        this(0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field5266;
        int var4 = 37 / ((58 - arg2) / 63);
        if (~arg0 == -1) {
            this.method2166(arg1.method736(-121), (byte) -10);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
    private class368(int arg0) {
        super(0, false);
        this.method2166(arg0, (byte) -104);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
    private final void method2166(int arg0, byte arg1) {
        this.field5267 = 4080 & arg0 >> 4;
        this.field5263 = (arg0 & 16711680) >> 12;
        int var3 = -29 / ((-58 - arg1) / 34);
        ++field5261;
        this.field5258 = arg0 << 4 & 4080;
    }
}
