import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class64 {

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    private int field126 = -1;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Lcd;")
    private static class23 field118 = class54.method414("Loading)3)3)3", -1);

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "[S")
    public static short[] field129 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Lcd;")
    private static class23 field132 = class54.method414("glow2:", -1);

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lcd;")
    public static class23 field123 = field118;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "Lcd;")
    public static class23 field134 = field132;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "[Lv;")
    public static class188[] field127 = new class188[4];

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "[Lgd;")
    public static class58[] field140 = new class58[256];

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "Lcd;")
    public static class23 field139 = class54.method414("Hidden)2use", -1);

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Lcd;")
    private static class23 field138 = class54.method414("No response from server)3", -1);

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Lcd;")
    public static class23 field128 = field138;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lcd;")
    public static class23 field130 = field132;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Lcg;")
    public static class26 field122;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Lgd;")
    public static class58 field125;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field121;
        if (!arg1) {
            method40(-119);
        }
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (super.field1508.field2757 && this.method39(-23265)) {
            int var4 = this.field141 * (class2.field24 != this.field131 ? this.field131 * arg0 / class2.field24 : arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (~class168.field3367 != ~this.field141) {
                for (int var8 = 0; class168.field3367 > var8; ++var8) {
                    int var9 = this.field141 * var8 / class168.field3367;
                    int var10 = this.field135[var4 + var9];
                    var7[var8] = class27.method198(4080, var10 << 4);
                    var5[var8] = class27.method198(var10, 65280) >> 4;
                    var6[var8] = class27.method198(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class168.field3367 < ~var11; ++var11) {
                    int var12 = this.field135[var4++];
                    var7[var11] = class27.method198(4080, var12 << 4);
                    var5[var11] = class27.method198(65280, var12) >> 4;
                    var6[var11] = class27.method198(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 82 / ((arg0 - 7) / 43);
        if (arg1 == 0) {
            this.field126 = arg2.method1197(-1);
        }
        ++field119;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, false);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field118 = null;
        field128 = null;
        if (arg0 <= 93) {
            field118 = null;
        }
        field129 = null;
        field122 = null;
        field125 = null;
        field132 = null;
        field134 = null;
        field130 = null;
        field127 = null;
        field140 = null;
        field139 = null;
        field138 = null;
        field123 = null;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)Z")
    private final boolean method39(int arg0) {
        ++field133;
        if (this.field135 != null) {
            return true;
        } else {
            if (arg0 != -23265) {
                field129 = null;
            }
            if (~this.field126 <= -1) {
                int var2 = !class159.field3185.method101(arg0 + 23199, this.field126) ? 128 : 64;
                this.field135 = class159.field3185.method102((byte) 10, this.field126);
                this.field141 = var2;
                this.field131 = var2;
                return this.field135 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static final void method40(int arg0) {
        class153 var1 = (class153) class178.field3534.method188((byte) 54);
        ++field137;
        if (arg0 > 11) {
            while (var1 != null) {
                if (var1.field3054 > 0) {
                    --var1.field3054;
                }
                if (var1.field3054 != 0) {
                    if (var1.field3048 > 0) {
                        --var1.field3048;
                    }
                    if (var1.field3048 == 0 && ~var1.field3053 <= -2 && var1.field3059 >= 1 && var1.field3053 <= 102 && ~var1.field3059 >= -103 && (var1.field3051 < 0 || class43.method341(var1.field3051, var1.field3066, -38))) {
                        class81.method551(var1.field3063, var1.field3056, var1.field3059, var1.field3062, var1.field3066, -5021, var1.field3051, var1.field3053);
                        var1.field3048 = -1;
                        if (~var1.field3069 == ~var1.field3051 && ~var1.field3069 == 0) {
                            var1.method1018(15789);
                        } else if (~var1.field3069 == ~var1.field3051 && var1.field3057 == var1.field3056 && ~var1.field3066 == ~var1.field3064) {
                            var1.method1018(15789);
                        }
                    }
                } else if (~var1.field3069 > -1 || class43.method341(var1.field3069, var1.field3064, -111)) {
                    class81.method551(var1.field3063, var1.field3057, var1.field3059, var1.field3062, var1.field3064, -5021, var1.field3069, var1.field3053);
                    var1.method1018(15789);
                }
                var1 = (class153) class178.field3534.method185((byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
    public final int method41(int arg0) {
        ++field124;
        if (arg0 != -1) {
            this.method39(-114);
        }
        return this.field126;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)I")
    public static final int method42(int arg0, int arg1, int arg2) {
        int var3 = arg1 - 1 & arg0 >> 31;
        ++field120;
        int var4 = -17 / ((arg2 - 54) / 61);
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
