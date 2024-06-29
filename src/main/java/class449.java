import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class449 extends class299 {

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "[I")
    private int[] field6608 = new int[this.field4522];

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "[Lek;")
    public static class375[] field6599 = new class375[4];

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "J")
    public static long field6613 = 0L;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[[I")
    public static int[][] field6612 = new int[128][128];

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lpf;")
    public static class425 field6610 = new class425(53, 6);

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    private int field6603;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    private int field6615;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "[B")
    private byte[] field6611;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "[[[B")
    public static byte[][][] field6614;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public final void method71(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field6599 = null;
        }
        ++field6601;
        this.field6603 += this.field6608[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public void method226(int arg0, byte arg1) {
        ++field6600;
        this.field6611[this.field6615++] = (byte) (127 + (class406.method2552(arg1, 255) >> 1));
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
    public static final void method2764(int arg0, int arg1, boolean arg2) {
        ++field6607;
        class32 var3 = class136.method854(6, (byte) 110, arg1);
        var3.method194(false);
        var3.field404 = arg0;
        if (!arg2) {
            field6614 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method2765(int arg0) {
        field6612 = null;
        int var1 = -80 % ((-8 - arg0) / 34);
        field6614 = null;
        field6610 = null;
        field6599 = null;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method2766(int arg0) {
        ++field6606;
        class241 var1 = class136.field1828;
        synchronized (class136.field1828) {
            class136.field1828.method1485(-22032);
            if (arg0 != 128) {
                field6599 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;IB)I")
    public static final int method2767(String arg0, int arg1, byte arg2) {
        ++field6605;
        if (arg2 != 6) {
            field6610 = null;
        }
        return class145.method893(arg0, arg1, (byte) 118, true);
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static final void method2768(int arg0) {
        if (arg0 != 128) {
            method2766(34);
        }
        ++field6602;
        class310.field4664.method1485(-22032);
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 != 15535) {
            this.method226(-19, (byte) -58);
        }
        ++field6604;
        this.field6603 = Math.abs(this.field6603);
        if (this.field6603 >= 4096) {
            this.field6603 = 4095;
        }
        this.method226(this.field6615++, (byte) (this.field6603 >> 4));
        this.field6603 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method75(int arg0) {
        ++field6616;
        this.field6603 = arg0;
        this.field6615 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBIII)V")
    public static final void method2769(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 7 % ((22 - arg1) / 58);
        ++field6609;
        class32 var6 = class136.method854(8, (byte) 88, arg4);
        var6.method194(false);
        var6.field400 = arg2;
        var6.field404 = arg3;
        var6.field412 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIF)V")
    public class449(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field4522; ++var7) {
            this.field6608[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
