import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class360 extends class362 {

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field5708;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    private int field5709;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    private int field5710;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    private int field5703;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Ljl;")
    public static class332 field5702 = new class332(50);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lth;")
    public static class57 field5704;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)V", line = 4)
    public final void method642(byte arg0, int arg1, int arg2) {
        if (arg0 <= 12) {
            this.method644(false, -86, 92);
        }
        field5705++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I", line = 22)
    public static final int method2530(int arg0, int arg1) {
        if (arg0 == -1166911924) {
            field5706++;
            return arg1 & 0x7F;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)V", line = 35)
    public final void method644(boolean arg0, int arg1, int arg2) {
        int var4 = this.field5709 * arg2 >> 12;
        field5711++;
        if (!arg0) {
            this.method643(-109, false, 49);
        }
        int var5 = this.field5710 * arg2 >> 12;
        int var6 = this.field5703 * arg1 >> 12;
        int var7 = this.field5708 * arg1 >> 12;
        class164.method1270(this.field5744, (byte) 99, var5, var4, var7, var6);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI)V", line = 53)
    public final void method643(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method644(false, 38, 29);
        }
        field5707++;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIII)V", line = 69)
    public class360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5708 = arg1;
        this.field5709 = arg0;
        this.field5710 = arg2;
        this.field5703 = arg3;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 81)
    public static void method2531(int arg0) {
        field5702 = null;
        field5704 = null;
        if (arg0 > -6) {
            field5702 = (class332) null;
        }
    }
}
