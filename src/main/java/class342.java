import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class342 extends class51 implements Runnable {

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Z")
    private boolean field4729 = true;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public int field4734 = -1;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lib;")
    private class135 field4733;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    public static int[] field4728 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2094(boolean arg0) {
        field4727++;
        if (arg0) {
            this.field4729 = false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 23)
    public static void method2095(int arg0) {
        field4728 = null;
        if (arg0 != -31681) {
            method2095(126);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[FI)[F", line = 35)
    public static final float[] method2096(int arg0, float[] arg1, int arg2) {
        field4730++;
        float[] var3 = new float[arg0];
        class648.method3734(arg1, 0, var3, 0, arg0);
        int var4 = -25 / ((-arg2 - 49) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lib;)V", line = 79)
    public class342(class135 arg0) {
        this.field4733 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "run", descriptor = "()V", line = 51)
    public final void run() {
        field4732++;
        while (this.field4729) {
            this.field4733.method930(this, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 68)
    public final void method2097(boolean arg0) {
        field4736++;
        if (!arg0) {
            this.method2097(false);
        }
        (new Thread(this, "a")).start();
    }
}
