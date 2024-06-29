import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class314 extends class219 {

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field5296 = 500;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "[I")
    public static int[] field5301 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field5300 = 0;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "Lob;")
    public static class78 field5304;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Z")
    public static boolean field5297;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
    public static int[] field5293;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)[I", line = 15)
    public final int[] method41(boolean arg0, int arg1) {
        if (!arg0) {
            this.method41(false, 39);
        }
        int[] var3 = this.field3654.method2032(3, arg1);
        field5302++;
        if (this.field3654.field4967) {
            class161.method1230(var3, 0, class128.field2326, this.field5299);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 37)
    public class314() {
        this(4096);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V", line = 40)
    private class314(int arg0) {
        super(0, true);
        this.field5299 = 4096;
        this.field5299 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILb;)V", line = 65)
    public final void method42(int arg0, int arg1, class94 arg2) {
        if (arg1 != 0) {
            field5296 = 18;
        }
        field5298++;
        if (arg0 == 0) {
            this.field5299 = (arg2.method756(915905888) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(Z)V", line = 101)
    public static void method2143(boolean arg0) {
        field5304 = null;
        field5301 = null;
        field5293 = null;
        if (!arg0) {
            method2145(82, 123, -33, (byte) 56, 22);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Z", line = 126)
    public static final boolean method2144(byte arg0, int arg1) {
        field5303++;
        int var2 = -24 / ((-arg0 - 21) / 58);
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBI)V", line = 136)
    public static final void method2145(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class59.field922 = -1;
        field5294++;
        if (arg3 != -31) {
            method2145(1, 119, -126, (byte) -94, 69);
        }
        class278.field4682 = class9.field114 * arg1 / arg0;
        class86.field1527 = -1;
        class136.field2420 = class304.field5132 * arg4 / arg2;
        class273.method1853(62);
    }
}
