import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class400 extends class156 implements Runnable {

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Z")
    private boolean field5714 = true;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public int field5722 = -1;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lkr;")
    private class447 field5715;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[J")
    public static long[] field5716 = new long[32];

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Z")
    public static boolean field5721 = false;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field5714) {
            this.field5715.method2773(-6334, this);
        }
        field5720++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method2548(int arg0) {
        field5723++;
        if (arg0 < 21) {
            this.field5714 = false;
        }
        this.field5714 = false;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method2549(int arg0) {
        if (arg0 < 48) {
            method2549(106);
        }
        field5716 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILtq;Ltq;)V")
    public static final void method2550(int arg0, class376 arg1, class376 arg2) {
        class129.field1571 = arg2;
        class41.field498 = arg1;
        field5719++;
        class429.field6200 = class41.field498.method2415(3, (byte) 56);
        if (arg0 > -5) {
            field5716 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
    public static final int method2551(int arg0, int arg1, int arg2) {
        if (arg0 != 13497) {
            return -106;
        }
        field5717++;
        int var3 = class404.method2574(arg2 - 1, (byte) -106, arg1 - 1) + class404.method2574(arg2 + 1, (byte) 124, arg1 - 1) + (class404.method2574(arg2 + -1, (byte) -63, arg1 + 1) - -class404.method2574(arg2 + 1, (byte) 127, arg1 + 1));
        int var4 = class404.method2574(arg2 - 1, (byte) 127, arg1) + class404.method2574(arg2 + 1, (byte) -14, arg1) + (class404.method2574(arg2, (byte) -122, arg1 - 1) - -class404.method2574(arg2, (byte) 126, arg1 + 1));
        int var5 = class404.method2574(arg2, (byte) 17, arg1);
        return var3 / 16 + (var4 / 8) + (var5 / 4);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public final void method2552(int arg0) {
        field5718++;
        if (arg0 != -23491) {
            method2549(101);
        }
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lkr;)V")
    public class400(class447 arg0) {
        this.field5715 = arg0;
    }
}
