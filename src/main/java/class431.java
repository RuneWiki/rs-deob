import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class431 extends class152 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Z")
    private boolean field6447 = true;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field6445 = -1;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Ljl;")
    private class176 field6443;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[Z")
    public static boolean[] field6440 = new boolean[100];

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public static int[] field6441 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lri;")
    public static class73 field6444 = new class73(61, 14);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[I")
    public static int[] field6448 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lri;")
    public static class73 field6449 = new class73(33, 12);

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lwa;")
    public static class433 field6450 = new class433(8);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lbp;")
    public static class261 field6451;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method2567(int arg0) {
        if (arg0 != 1) {
            this.method2567(122);
        }
        field6446++;
        this.field6447 = false;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method2568(int arg0) {
        if (arg0 != 172) {
            this.run();
        }
        field6439++;
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6447) {
            this.field6443.method1199(11569, this);
        }
        field6442++;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method2569(int arg0) {
        field6441 = null;
        field6440 = null;
        int var1 = 39 / ((arg0 - 39) / 55);
        field6444 = null;
        field6450 = null;
        field6451 = null;
        field6448 = null;
        field6449 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljl;)V")
    public class431(class176 arg0) {
        this.field6443 = arg0;
    }
}
