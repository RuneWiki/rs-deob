import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class660 {

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "Lnv;")
    private class417 field9421;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "J")
    public long field9424;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field9427 = 1;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "[I")
    public static int[] field9428 = new int[8];

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIII)V")
    public static final void method3757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9423++;
        float var5 = (float) class656.field9372 / (float) class656.field9373;
        int var6 = arg4;
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg4 - var6) / 2;
        int var9 = arg2 - (arg1 - var7) / 2;
        class469.field6702 = -1;
        class116.field1211 = class656.field9372 - (class656.field9372 * var9 / var7);
        class30.field352 = class656.field9373 * var8 / var6;
        class99.field1035 = arg3;
        class674.method3838(-1);
    }

    @OriginalMember(owner = "client!rda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field9421.method2595(128, this.field9424);
        field9422++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3758(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9425++;
        if (!arg4) {
            field9428 = null;
        }
        if (class338.field4355 <= arg3 && class744.field10385 >= arg3) {
            int var5 = class211.method1255(class224.field2571, arg0, false, class578.field8182);
            int var6 = class211.method1255(class224.field2571, arg1, !arg4, class578.field8182);
            class209.method1245(arg3, 8, arg2, var5, var6);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)S")
    public static final short method3759(byte arg0, int arg1) {
        field9419++;
        int var2 = (arg1 & 0xFF50) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        if (arg0 != -2) {
            field9427 = 9;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
    public static final boolean method3760(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method3757(97, -107, -32, 30, -71);
        }
        field9420++;
        boolean var3 = (arg2 & 0x37) == 0 ? class222.method1291(arg1, 93, arg2) : class139.method878(arg1, (byte) 0, arg2);
        return class688.method3889(80, arg1, arg2) | (arg1 & 0x10000) != 0 | var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method3761(int arg0) {
        field9428 = null;
        if (arg0 != -1978299030) {
            method3759((byte) 110, 51);
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lnv;J[Lw;)V")
    public class660(class417 arg0, long arg1, class299[] arg2) {
        this.field9421 = arg0;
        this.field9424 = arg1;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(JJ)J")
    public static long method3762(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
