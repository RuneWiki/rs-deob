import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class598 extends class601 {

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "Lgp;")
    public static class576 field7611 = new class576(7, 2);

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    private int field7607;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "Z")
    public static boolean field7609;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "[I")
    public static int[] field7608;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "[[Luaa;")
    public static class391[][] field7612;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class598() {
        this(0);
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V")
    public static void method3231(int arg0) {
        field7612 = null;
        field7608 = null;
        if (arg0 == -12) {
            field7611 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
    private class598(int arg0) {
        super(0, false);
        this.method3233(arg0, (byte) 97);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
    public static final void method3232(byte arg0) {
        ++field7614;
        if (arg0 <= 70) {
            field7608 = null;
        }
        class690.method3685();
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IB)V")
    private final void method3233(int arg0, byte arg1) {
        if (arg1 != 97) {
            method3231(102);
        }
        this.field7607 = (255 & arg0) << 4;
        ++field7603;
        this.field7610 = arg0 >> 12 & 4080;
        this.field7604 = (arg0 & 65280) >> 4;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.method3233(arg0.method1500((byte) -97), (byte) 97);
        }
        int var5 = 29 / ((arg2 - 40) / 52);
        ++field7605;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIZIII)V")
    public static final void method3234(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (!arg3) {
            field7612 = null;
        }
        ++field7606;
        class28[] var7 = class589.field7475;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class28 var9 = var7[var8];
            if (var9 != null && ~var9.field250 == -3) {
                class122.method726(false, var9.field240, var9.field249, var9.field248 * 2, arg2, arg1, arg6 >> 1, var9.field246, arg5 >> 1);
                if (class128.field1716[0] > -1 && ~(class693.field8900 % 20) > -11) {
                    class772 var10 = class689.field8854[var9.field244];
                    int var11 = class128.field1716[0] + arg0 + -12;
                    int var12 = arg4 - -class128.field1716[1] - 28;
                    var10.method4203(var11, var12);
                    class548.method2967(var11, var12 + var10.method628(), var12, (byte) -126, var10.method623() + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        ++field7613;
        if (arg0 != 2017) {
            return null;
        } else {
            int[][] var3 = super.field7647.method3510((byte) -51, arg1);
            if (super.field7647.field8306) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class418.field5518 < ~var7; ++var7) {
                    var4[var7] = this.field7610;
                    var5[var7] = this.field7604;
                    var6[var7] = this.field7607;
                }
            }
            return var3;
        }
    }
}
