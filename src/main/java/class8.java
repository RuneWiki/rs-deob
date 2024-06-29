import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class56 {

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    private int field133 = 585;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "Lei;")
    public static class191 field135 = new class191();

    @OriginalMember(owner = "client!to", name = "H", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Lbt;")
    public static class48 field138;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I", line = 3)
    public static final int method142(int arg0, byte arg1, int arg2, int arg3) {
        ++field134;
        if (arg0 == arg3) {
            return arg0;
        } else {
            int var4 = -arg2 + 128;
            int var5 = (arg0 & 127) * var4 + (127 & arg3) * arg2 >> 7;
            int var6 = (arg0 & 896) * var4 - -((896 & arg3) * arg2) >> 7;
            if (arg1 != 107) {
                return -44;
            } else {
                int var7 = (arg0 & 64512) * var4 + (arg3 & 64512) * arg2 >> 7;
                return var5 & 127 | var7 & 64512 | 896 & var6;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 27)
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 36)
    public static void method143(int arg0) {
        field135 = null;
        field138 = null;
        if (arg0 > -22) {
            method143(-88);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BILes;)V", line = 47)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field137;
        if (~arg1 == -1) {
            this.field133 = arg2.method2390((byte) 46);
        }
        if (arg0 >= -44) {
            field135 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[I", line = 82)
    public final int[] method145(int arg0, int arg1) {
        ++field132;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = class349.field4354[arg1];
            for (int var5 = 0; ~class642.field8759 < ~var5; ++var5) {
                int var6 = class648.field8837[var5];
                if (~this.field133 > ~var6 && -this.field133 + 4096 > var6 && ~(-this.field133 + 2048) > ~var4 && var4 < this.field133 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field133 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field133) && ~var6 > ~(this.field133 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field133;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field133 + 2048);
                } else if (~var4 <= ~this.field133 && -this.field133 + 4096 >= var4) {
                    if (~var6 <= ~this.field133 && -this.field133 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field133);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field133;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field133);
                }
            }
        }
        if (arg0 != 0) {
            field136 = -37;
        }
        return var3;
    }
}
