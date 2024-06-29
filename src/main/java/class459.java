import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class459 extends class403 {

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    private int field6578;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    private int field6575;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    private int field6572;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    private int field6569;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    private int field6577;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "Lkv;")
    private class280 field6573;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[Lva;")
    public static class520[] field6579 = new class520[14];

    @OriginalMember(owner = "client!io", name = "p", descriptor = "Lrh;")
    public static class275 field6571 = new class275(0, 2, 2, 1);

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Lmu;")
    private class314 field6574;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lmja;", line = 7)
    public static final class438 method2736(int arg0, int arg1, int arg2) {
        field6570++;
        class438 var3 = new class438();
        var3.field6261 = arg1 + 1 + 5;
        var3.field6262 = -1;
        var3.field6273 = arg0 + 1 + 5;
        var3.field6269 = -1;
        var3.field6279 = new int[var3.field6273][var3.field6261];
        var3.method2651(false);
        if (arg2 != 22204) {
            field6579 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 29)
    public static void method2737(byte arg0) {
        field6579 = null;
        field6571 = null;
        if (arg0 != 112) {
            field6580 = 30;
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 50)
    public static final void method2738(int arg0) {
        if (arg0 == 0) {
            class731.field10209.method506(((float) class145.field1852.field9019.method2930((byte) -83) * 0.1F + 0.7F) * class181.field2754);
            field6581++;
            class731.field10209.method499(class752.field10426, class788.field10828, class577.field8146, (float) (class230.field3335 << 2), (float) (class725.field10161 << 2), (float) (class411.field5801 << 2));
            class731.field10209.method484(class363.field5244);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B[BI)I", line = 68)
    public static final int method2739(byte arg0, byte[] arg1, int arg2) {
        field6584++;
        return arg0 <= 4 ? 67 : class474.method2797(-47, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Lmu;", line = 81)
    public final class314 method2433(int arg0) {
        field6583++;
        if (this.field6574 == null) {
            class427.field6010[5] = this.field6575;
            class427.field6010[2] = this.field6578;
            class159 var2 = this.field6573.field883;
            class427.field6010[3] = this.field6577;
            class427.field6010[1] = this.field6582;
            class427.field6010[4] = this.field6572;
            class427.field6010[0] = this.field6569;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1262(class427.field6010[var5], (byte) 57)) {
                    return null;
                }
                class181 var7 = var2.method1263(class427.field6010[var5], (byte) 118);
                int var8 = var7.field2742 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field2758 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class241.field3458[var6] = var2.method1261(class427.field6010[var6], var4, -13756, false, 1.0F, var4);
            }
            this.field6574 = new class314(this.field6573, 6407, var4, var3, class241.field3458);
        }
        int var9 = -12 / ((arg0 - 64) / 32);
        return this.field6574;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lkv;IIIIII)V", line = 138)
    public class459(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6578 = arg3;
        this.field6575 = arg6;
        this.field6572 = arg5;
        this.field6569 = arg1;
        this.field6577 = arg4;
        this.field6573 = arg0;
        this.field6582 = arg2;
    }
}
