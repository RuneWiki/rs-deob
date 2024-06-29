import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class33 extends class160 {

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    private final int field540;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    private final int field539;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    private final int field532;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private final int field533;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Lve;")
    private static class255 field528 = class87.method607(90, "Use");

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field529 = 0;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lve;")
    public static class255 field527 = field528;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lve;")
    public static class255 field535 = class87.method607(32, "hint_headicons");

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Lrg;")
    public static class88 field531;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Lrg;")
    public static class88 field538;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Z")
    public static boolean field537;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 17)
    public final void method160(int arg0, int arg1, int arg2) {
        field536++;
        int var4 = this.field533 * arg2 >> 12;
        int var5 = this.field532 * arg2 >> 12;
        int var6 = this.field539 * arg1 >> 12;
        if (arg0 != 0) {
            field531 = (class88) null;
        }
        int var7 = this.field540 * arg1 >> 12;
        class209.method1507(var5, var4, var6, (byte) -119, this.field2695, var7);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([BIIZ)Lve;", line = 38)
    public static final class255 method185(byte[] arg0, int arg1, int arg2, boolean arg3) {
        class255 var4 = new class255();
        var4.field4343 = 0;
        var4.field4297 = new byte[arg1];
        if (arg3) {
            return (class255) null;
        }
        field530++;
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            if (arg0[var5] != 0) {
                var4.field4297[var4.field4343++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIII)V", line = 65)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field540 = arg3;
        this.field539 = arg1;
        this.field532 = arg2;
        this.field533 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)V", line = 77)
    public final void method158(int arg0, int arg1, int arg2) {
        if (arg0 != -30729) {
            field535 = (class255) null;
        }
        field526++;
        int var4 = this.field532 * arg1 >> 12;
        int var5 = this.field533 * arg1 >> 12;
        int var6 = this.field539 * arg2 >> 12;
        int var7 = this.field540 * arg2 >> 12;
        class74.method533(this.field2695, var6, arg0 + 30730, var7, this.field2693, var5, var4, this.field2699);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)V", line = 96)
    public final void method163(byte arg0, int arg1, int arg2) {
        field534++;
        int var4 = this.field532 * arg2 >> 12;
        int var5 = this.field533 * arg2 >> 12;
        int var6 = this.field540 * arg1 >> 12;
        int var7 = this.field539 * arg1 >> 12;
        int var8 = 8 / ((28 - arg0) / 63);
        class3.method15(var5, (byte) 76, var4, var6, this.field2693, this.field2699, var7);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 128)
    public static void method186(int arg0) {
        field527 = null;
        field528 = null;
        if (arg0 != -1760702484) {
            method185((byte[]) null, -30, 28, true);
        }
        field535 = null;
        field531 = null;
        field538 = null;
    }
}
