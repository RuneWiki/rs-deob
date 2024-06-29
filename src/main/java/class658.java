import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class658 extends class125 {

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "[I")
    public static int[] field9418 = new int[1000];

    @OriginalMember(owner = "client!mia", name = "o", descriptor = "I")
    public static int field9423 = 0;

    @OriginalMember(owner = "client!mia", name = "r", descriptor = "I")
    public static int field9426 = 0;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!mia", name = "m", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!mia", name = "n", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!mia", name = "p", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!mia", name = "s", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "[[B")
    public static byte[][] field9419;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)V")
    public static void method3757(int arg0) {
        field9418 = null;
        field9419 = null;
        if (arg0 != 18401) {
            method3759((byte) -51, -58, 45, -73);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field9422;
        if (super.field1733.method3308(-72)) {
            return 3;
        } else if (!arg0) {
            return 115;
        } else {
            return ~arg1 != -1 && super.field1733.field7972.method1587(!arg0) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)Z")
    public final boolean method3758(int arg0) {
        if (arg0 != -7558) {
            return false;
        } else {
            ++field9425;
            return !super.field1733.method3308(-81);
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (super.field1733.method3308(-95)) {
            super.field1732 = 0;
        }
        if (arg0) {
            ++field9421;
            if (super.field1732 < 0 && super.field1732 > 2) {
                super.field1732 = this.method158((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BIII)I")
    public static final int method3759(byte arg0, int arg1, int arg2, int arg3) {
        ++field9427;
        int var4 = arg2 / arg3;
        if (arg0 < 55) {
            method3760(36, 11, 22, false);
        }
        int var5 = arg2 & arg3 - 1;
        int var6 = arg1 / arg3;
        int var7 = arg3 + -1 & arg1;
        int var8 = class541.method3256(var6, var4, true);
        int var9 = class541.method3256(var6, var4 + 1, true);
        int var10 = class541.method3256(var6 + 1, var4, true);
        int var11 = class541.method3256(var6 + 1, var4 + 1, true);
        int var12 = class537.method3242(arg3, var8, var5, var9, false);
        int var13 = class537.method3242(arg3, var10, var5, var11, false);
        return class537.method3242(arg3, var12, var7, var13, false);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        int var2 = 4 % ((arg0 - -63) / 49);
        ++field9417;
        return 1;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(ILgp;)V")
    public class658(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        ++field9420;
        if (arg0 > -32) {
            this.method156(false);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIZ)I")
    public static final int method3760(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return -74;
        } else {
            ++field9424;
            int var4 = 255 - arg1;
            int var5 = (16711680 & (arg0 & 65280) * arg1 | -16711936 & (arg0 & 16711935) * arg1) >>> 8;
            return (((arg2 & 16711935) * var4 & -16711936 | 16711680 & (arg2 & 65280) * var4) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lgp;)V")
    public class658(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(Z)I")
    public final int method3761(boolean arg0) {
        if (arg0) {
            field9426 = -62;
        }
        ++field9428;
        return super.field1732;
    }
}
