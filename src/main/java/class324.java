import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class324 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field4449 = new int[4];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field4451 = new int[2];

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field4452 = new int[13];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
    public abstract long method281(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)I")
    public final int method2007(long arg0, byte arg1) {
        field4448++;
        long var4 = this.method280(-100);
        int var6 = -94 / ((-arg1 - 5) / 34);
        if (var4 > 0L) {
            class353.method2204(var4, 7806);
        }
        return this.method278(108, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public abstract void method282(int arg0);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public static void method2008(int arg0) {
        field4452 = null;
        if (arg0 == -1) {
            field4449 = null;
            field4451 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)J")
    public abstract long method280(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
    public static final void method2009(byte arg0, int arg1) {
        if (arg0 < 23) {
            method2009((byte) 47, -7);
        }
        field4450++;
        if (class134.method708(-100, arg1)) {
            class478.method2709(-1, class508.field7087[arg1], 6);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)I")
    public abstract int method278(int arg0, long arg1);
}
