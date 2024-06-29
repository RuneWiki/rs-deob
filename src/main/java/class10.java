import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class10 extends class92 {

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
    public static boolean field135 = false;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "Lja;")
    public static class60 field138;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[I")
    public static int[] field139;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[[B")
    public static byte[][] field129;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
    public final void method45(int arg0, byte arg1, int arg2) {
        ++field137;
        int var4 = this.field128 * arg2 >> 12;
        int var5 = this.field134 * arg2 >> 12;
        int var6 = this.field127 * arg0 >> 12;
        if (arg1 != 124) {
            method46(true, (String[]) null);
        }
        int var7 = this.field132 * arg0 >> 12;
        class287.method1886(106, var5, var7, var6, super.field1454, super.field1460, var4, super.field1457);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method46(boolean arg0, String[] arg1) {
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg0) {
            field129 = null;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
            ++var3;
        }
        ++field131;
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)V")
    public static final void method47(int arg0, long arg1) {
        int var3 = class165.field2537.field2234 - -class134.field1957;
        if (!class195.field2970) {
            class84.field1336 += (float) arg1 * class252.field3828 / 40.0F;
            class83.field1327 += (float) arg1 * class278.field4187 / 40.0F;
        }
        int var4 = class110.field1701 + class165.field2537.field2251;
        ++field126;
        if (~(class295.field4678 - var4) > 499 || class295.field4678 - var4 > 500 || class124.field1879 - var3 < -500 || ~(-var3 + class124.field1879) < -501) {
            class124.field1879 = var3;
            class295.field4678 = var4;
        }
        if (class295.field4678 != var4) {
            int var5 = var4 - class295.field4678;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 != 0) {
                    if (var6 < var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (~var6 == -1) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class295.field4678 += var6;
        }
        if (~class124.field1879 != ~var3) {
            int var7 = -class124.field1879 + var3;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (~var7 < ~var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class124.field1879 += var8;
        }
        class75.method503(false);
        if (arg0 != 0) {
            method48(100);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field128 = arg0;
        this.field134 = arg2;
        this.field132 = arg3;
        this.field127 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method48(int arg0) {
        field138 = null;
        field129 = null;
        if (arg0 != 14070) {
            method48(-26);
        }
        field139 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZ)V")
    public final void method49(int arg0, int arg1, boolean arg2) {
        ++field130;
        if (!arg2) {
            this.method49(-27, -44, true);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        ++field125;
        int var4 = this.field128 * arg0 >> 12;
        int var5 = this.field134 * arg0 >> 12;
        int var6 = this.field127 * arg1 >> 12;
        if (arg2 != -7368) {
            this.method49(-25, 9, false);
        }
        int var7 = this.field132 * arg1 >> 12;
        class195.method1215(var6, var5, var4, super.field1457, var7, (byte) -113);
    }
}
