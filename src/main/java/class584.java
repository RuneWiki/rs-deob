import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class584 extends class642 {

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
    private int field8487 = 1365;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
    private int field8485 = 20;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "I")
    private int field8490 = 0;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
    private int field8489 = 0;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public static int field8482 = 0;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "Lefa;")
    public static class322 field8483 = new class322(512);

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "Lrba;")
    public static class102 field8491;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V")
    public static void method3345(byte arg0) {
        if (arg0 != -27) {
            field8482 = 85;
        }
        field8483 = null;
        field8491 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lr;B)V")
    public static final void method3346(class98 arg0, byte arg1) {
        class153.field2157 = new class374[class148.field2097.length];
        ++field8481;
        for (int var2 = 0; var2 < class148.field2097.length; ++var2) {
            int var3 = class148.field2097[var2];
            class606 var4 = class40.method230(class235.field3097, var3, 113);
            class393 var5 = arg0.method684(var4, class616.method3518(class109.field1625, var3), true);
            class153.field2157[var2] = new class374(var5, var4);
        }
        if (arg1 < 124) {
            method3346((class98) null, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
    public class584() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field8486;
        if (arg1 != -9) {
            method3345((byte) -15);
        }
        int[] var3 = super.field9216.method1185(arg0, arg1 ^ 108);
        if (super.field9216.field2418) {
            for (int var4 = 0; var4 < class338.field4909; ++var4) {
                int var5 = (class542.field8026[var4] << 12) / this.field8487 + this.field8489;
                int var6 = (class400.field6026[arg0] << 12) / this.field8487 - -this.field8490;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field8485 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 - -var7;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field8485 - 1 <= var13 ? 0 : (var13 << 12) / this.field8485;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field8490 = arg1.method3169(26488);
                    }
                } else {
                    this.field8489 = arg1.method3169(26488);
                }
            } else {
                this.field8485 = arg1.method3169(26488);
            }
        } else {
            this.field8487 = arg1.method3169(26488);
        }
        ++field8484;
        if (arg2 <= 29) {
            method3345((byte) -32);
        }
    }
}
