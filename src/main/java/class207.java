import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class207 extends class264 {

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field3711 = 0;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
    public static boolean field3717 = true;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Lcf;")
    public static class93 field3716 = class147.method1066("gr-Un:", -48);

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)V")
    private final void method1460(int arg0, boolean arg1) {
        this.field3710 = arg0 << 4 & 4080;
        this.field3718 = (65280 & arg0) >> 4;
        if (arg1) {
            ++field3715;
            this.field3709 = arg0 >> 12 & 4080;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            method1464(-65, 18, -10, 113L);
        }
        ++field3713;
        int[][] var3 = super.field4705.method1089(arg0, 53);
        if (super.field4705.field2670) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; class176.field3060 > var7; ++var7) {
                var4[var7] = this.field3709;
                var6[var7] = this.field3718;
                var5[var7] = this.field3710;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static void method1461(boolean arg0) {
        field3716 = null;
        if (!arg0) {
            method1462((byte) -108, 38, 56);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)V")
    public static final void method1462(byte arg0, int arg1, int arg2) {
        ++field3714;
        class212 var3 = class123.method905(-1205364448, 5, arg1);
        var3.method1493(13);
        var3.field3883 = arg2;
        if (arg0 <= 11) {
            field3716 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field3708;
        if (~arg1 == -1) {
            this.method1460(arg2.method1893((byte) -119), true);
        }
        if (arg0 <= 11) {
            method1461(true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBIII)V")
    public static final void method1463(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 84) {
            method1461(false);
        }
        for (int var6 = arg5; arg1 >= var6; ++var6) {
            class58.method337(arg0, class76.field1406[var6], arg4, arg3, false);
        }
        ++field3712;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    private class207(int arg0) {
        super(0, false);
        this.method1460(arg0, true);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1464(int arg0, int arg1, int arg2, long arg3) {
        class41 var5 = class232.field4138[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field643 != null && var5.field643.field1276 == arg3) {
            return true;
        } else if (var5.field641 != null && var5.field641.field303 == arg3) {
            return true;
        } else if (var5.field652 != null && var5.field652.field440 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field645; ++var6) {
                if (var5.field637[var6].field4094 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class207() {
        this(0);
    }
}
