import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class658 extends class392 {

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "[I")
    public static int[] field9281 = new int[14];

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lw;)V")
    public class658(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field9278;
        if (arg1 >= -124) {
            field9281 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            method3691(-11);
        }
        ++field9279;
        return 0;
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(ILw;)V")
    public class658(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (~super.field5452 > -1 || super.field5452 > 4) {
            super.field5452 = this.method292(true);
        }
        ++field9282;
        if (arg0) {
            this.method3690(-67);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZIIIII)V")
    public static final void method3689(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9280;
        long var6 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
        class393 var8 = (class393) class11.field139.method4253(var6, -1);
        if (var8 == null) {
            var8 = new class393();
            class11.field139.method4252(false, var8, var6);
        }
        int var9 = 0 % ((-34 - arg2) / 57);
        if (~var8.field5458.length >= ~arg1) {
            int[] var10 = new int[arg1 - -1];
            int[] var11 = new int[arg1 + 1];
            for (int var12 = 0; ~var8.field5458.length < ~var12; ++var12) {
                var10[var12] = var8.field5458[var12];
                var11[var12] = var8.field5460[var12];
            }
            for (int var13 = var8.field5458.length; arg1 > var13; ++var13) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var8.field5460 = var11;
            var8.field5458 = var10;
        }
        var8.field5458[arg1] = arg3;
        var8.field5460[arg1] = arg5;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)I")
    public final int method3690(int arg0) {
        ++field9283;
        return arg0 != 17539 ? 15 : super.field5452;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        ++field9277;
        int var3 = -4 % ((arg0 - -80) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
    public static void method3691(int arg0) {
        field9281 = null;
        if (arg0 != -18195) {
            method3691(-25);
        }
    }
}
