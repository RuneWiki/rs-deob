import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class267 extends class170 {

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field4721 = 0;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "Lqk;")
    public static class207 field4724 = class24.method212(255, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lqk;")
    public static class207 field4725 = class24.method212(255, "Mem:");

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lle;")
    public static class42 field4726;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public static void method1829(int arg0) {
        field4725 = null;
        field4724 = null;
        if (arg0 != -1025371828) {
            field4724 = null;
        }
        field4726 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -arg5 + arg3;
        int var9 = -arg5 + arg1;
        int var10 = arg5 + arg7;
        int var11 = arg2 + arg5;
        ++field4723;
        for (int var12 = arg2; ~var11 < ~var12; ++var12) {
            class215.method1544(arg7, arg1, class15.field238[var12], arg0, -87);
        }
        for (int var13 = arg3; var13 > var8; --var13) {
            class215.method1544(arg7, arg1, class15.field238[var13], arg0, 115);
        }
        if (arg6 != 0) {
            method1829(48);
        }
        for (int var14 = var11; var14 <= var8; ++var14) {
            int[] var15 = class15.field238[var14];
            class215.method1544(arg7, var10, var15, arg0, 88);
            class215.method1544(var10, var9, var15, arg4, 80);
            class215.method1544(var9, arg1, var15, arg0, 104);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class267() {
        this(4096);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            return null;
        } else {
            ++field4728;
            int[] var3 = super.field3001.method1538(122, arg1);
            if (super.field3001.field3835) {
                class274.method1862(var3, 0, class88.field1595, this.field4722);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4722 = (arg0.method1045((byte) -23) << 12) / 255;
        }
        if (arg1 != 5877) {
            field4725 = null;
        }
        ++field4727;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    private class267(int arg0) {
        super(0, true);
        this.field4722 = 4096;
        this.field4722 = arg0;
    }
}
