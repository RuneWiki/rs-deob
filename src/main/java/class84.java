import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class84 extends class513 {

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "[I")
    private int[] field892 = new int[this.field7348];

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    public static int field894 = -50;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "Lpr;")
    public static class407 field889 = new class407(25, 10);

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "Lpca;")
    public static class653 field896 = new class653(260);

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "Lkfa;")
    public static class549 field897 = new class549(57, -1);

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "Lob;")
    public static class672 field893;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "[B")
    private byte[] field891;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
    public final void method530(int arg0, int arg1, int arg2) {
        this.field887 += this.field892[arg2] * arg0 >> 12;
        if (arg1 != 0) {
            this.method530(-105, 62, -87);
        }
        ++field886;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public final void method531(int arg0) {
        int var2 = 66 / ((3 - arg0) / 41);
        this.field887 = 0;
        ++field890;
        this.field888 = 0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method532(int arg0) {
        this.field887 = Math.abs(this.field887);
        ++field885;
        if (~this.field887 <= -4097) {
            this.field887 = 4095;
        }
        this.method77(this.field888++, (byte) -114, (byte) (this.field887 >> 4));
        this.field887 = 0;
        if (arg0 != 16859) {
            field893 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
    public static void method533(int arg0) {
        field893 = null;
        int var1 = -90 / ((arg0 - 64) / 32);
        field889 = null;
        field896 = null;
        field897 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBB)V")
    public void method77(int arg0, byte arg1, byte arg2) {
        this.field891[this.field888++] = (byte) (127 + class203.method1246(arg2 >> 1, 127));
        if (arg1 != -114) {
            this.method531(-8);
        }
        ++field895;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIF)V")
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field7348 < ~var7; ++var7) {
            this.field892[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIBI)V")
    public static final void method534(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class626.field8895 = arg2;
        class662.field9408 = arg1;
        class190.field2302 = arg4;
        class77.field791 = arg0;
        ++field884;
        if (arg3 != 22) {
            field896 = null;
        }
    }
}
