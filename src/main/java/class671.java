import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class671 extends class362 {

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Z")
    public static boolean field9317 = false;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field9320 = 1405;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Lafa;")
    public static class365 field9318 = new class365();

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
    public static int[] field9321 = new int[4096];

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field9319;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field9321[var0] = class157.method1216(var0, true);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 3)
    public static final void method3789(byte arg0) {
        if (class572.field8145 != -1) {
            class270.method1752(class572.field8145, -1, 110, false, -1);
            class572.field8145 = -1;
        }
        ++field9319;
        int var1 = -43 % ((arg0 - 36) / 34);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)I", line = 18)
    private final int method3790(int arg0, int arg1, byte arg2) {
        ++field9315;
        int var4 = arg0 * 57 + arg1;
        if (arg2 != -73) {
            this.method3790(-4, -111, (byte) -61);
        }
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 35)
    public final int[] method156(int arg0, int arg1) {
        ++field9316;
        int[] var3 = super.field4927.method808(arg0 ^ 2026769377, arg1);
        if (super.field4927.field1471) {
            int var4 = class135.field2287[arg1];
            for (int var5 = 0; var5 < class769.field10597; ++var5) {
                var3[var5] = this.method3790(var4, class172.field2750[var5], (byte) -73) % 4096;
            }
        }
        if (arg0 != -2026769311) {
            field9318 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 68)
    public static void method3791(int arg0) {
        field9321 = null;
        if (arg0 != -1) {
            method3791(11);
        }
        field9318 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 83)
    public class671() {
        super(0, true);
    }
}
