import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class399 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "J")
    private long field5898;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lnea;")
    public static class664 field5892 = new class664(8, 3);

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ldg;")
    public static class376 field5896 = new class376(5, 4);

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field5900 = 0;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z")
    public static final boolean method2443(int arg0, int arg1, int arg2) {
        field5894++;
        return arg2 < 109 ? false : class321.method2006(arg0, (byte) 44, arg1) & (class272.method1797(544, arg0, arg1) | (arg1 & 0x2000) != 0 | class310.method1973(arg1, -18974, arg0));
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    private final int method2444(int arg0, int arg1) {
        int var3 = -120 % ((-arg1 - 22) / 36);
        field5893++;
        return (int) (this.field5898 >> class342.field5022 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILku;)V")
    private final void method2445(int arg0, class342 arg1) {
        field5899++;
        if (arg0 > -87) {
            this.field5902 = 27;
        }
        this.field5898 |= (arg1.field5010 << class342.field5022 * this.field5902++);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Lku;")
    public final class342 method2446(int arg0, int arg1) {
        if (arg1 <= 46) {
            this.method2446(-7, -127);
        }
        field5897++;
        return class342.method2133(this.method2444(arg0, 124), (byte) 31);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B[FI)[F")
    public static final float[] method2447(byte arg0, float[] arg1, int arg2) {
        if (arg0 <= 80) {
            method2443(39, 20, 85);
        }
        field5895++;
        float[] var3 = new float[arg2];
        class476.method2795(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method2448(byte arg0) {
        field5896 = null;
        field5892 = null;
        if (arg0 <= 92) {
            field5900 = 125;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method2449(int arg0) {
        field5901++;
        return arg0 == 0 ? this.field5902 : 73;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lku;)V")
    public class399(class342 arg0) {
        this.field5898 = arg0.field5010;
        this.field5902 = 1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "([Lku;)V")
    public class399(class342[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2445(-127, arg0[var2]);
        }
    }
}
