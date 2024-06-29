import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class317 extends class78 {

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Z")
    public volatile boolean field4940 = true;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field4933 = 0;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "[I")
    public static int[] field4936 = new int[128];

    @OriginalMember(owner = "client!si", name = "O", descriptor = "[Lbl;")
    public static class312[] field4941 = new class312[14];

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4938 = "Loaded config";

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[[S")
    public static short[][] field4942 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Lik;")
    public static class259 field4934 = new class259(64);

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Z")
    public boolean field4935;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "Z")
    public boolean field4937;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class94 var7 = new class94();
        var7.field1532 = arg1 / 128;
        var7.field1557 = arg2 / 128;
        var7.field1536 = arg3 / 128;
        var7.field1528 = arg4 / 128;
        var7.field1542 = arg0;
        var7.field1548 = arg1;
        var7.field1549 = arg2;
        var7.field1547 = arg3;
        var7.field1537 = arg4;
        var7.field1540 = arg5;
        var7.field1550 = arg6;
        class311.field4891[class159.field2508++] = var7;
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 27)
    public static void method2179(int arg0) {
        if (arg0 <= 50) {
            method2178(-5, -69, -5, -96, 107, 108, -29);
        }
        field4938 = null;
        field4941 = null;
        field4934 = null;
        field4936 = null;
        field4942 = (short[][]) null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)[B")
    public abstract byte[] method402(byte arg0);

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)I")
    public abstract int method406(byte arg0);
}
