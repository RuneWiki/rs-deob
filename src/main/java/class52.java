import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class52 extends class123 {

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "[I")
    public static int[] field894 = new int[256];

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Leb;")
    public static class230 field899 = class68.method589(0, "Cache:");

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lpb;")
    public static class124 field892 = new class124(5000);

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Leb;")
    private static class230 field902 = class68.method589(0, "shake:");

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "Leb;")
    public static class230 field903 = field902;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "Leb;")
    public static class230 field901 = field902;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lla;")
    public static class94 field900 = null;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "Leb;")
    public static class230 field904 = class68.method589(0, "blinken1:");

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public static void method414(int arg0) {
        field901 = null;
        field900 = null;
        field904 = null;
        field902 = null;
        if (arg0 != 1376312589) {
            method417((byte) -33, -40L);
        }
        field903 = null;
        field892 = null;
        field899 = null;
        field894 = null;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field898;
        if (arg1 != 26080) {
            return null;
        } else {
            int[][] var3 = super.field2152.method1106(arg0, -7034);
            if (super.field2152.field2616) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                for (int var7 = 0; class140.field2505 > var7; ++var7) {
                    var4[var7] = this.field891;
                    var6[var7] = this.field888;
                    var5[var7] = this.field889;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)I")
    public static final int method415(int arg0, int arg1) {
        ++field890;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != -13538) {
            method417((byte) 1, 29L);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class52() {
        this(0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 == 0) {
            this.method418(arg1.method190(arg2 ^ -1876171647), 57);
        }
        ++field896;
        if (arg2 != 1876195788) {
            this.method418(15, 111);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIB)I")
    public static final int method416(int arg0, int arg1, byte arg2) {
        ++field895;
        if (arg2 < 118) {
            return -15;
        } else {
            int var3 = arg1 * 57 + arg0;
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 133868298) >> 19;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
    private class52(int arg0) {
        super(0, false);
        this.method418(arg0, 57);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BJ)V")
    public static final void method417(byte arg0, long arg1) {
        ++field893;
        if (~arg1 < -1L) {
            if (arg1 % 10L != 0L) {
                class218.method1501(arg1, 49);
            } else {
                class218.method1501(arg1 + -1L, 8);
                class218.method1501(1L, 12);
            }
            if (arg0 != -115) {
                field904 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(II)V")
    private final void method418(int arg0, int arg1) {
        ++field887;
        this.field888 = (arg0 & 65280) >> 4;
        if (arg1 != 57) {
            field899 = null;
        }
        this.field891 = (16711680 & arg0) >> 12;
        this.field889 = arg0 << 4 & 4080;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLth;II)V")
    public static final void method419(boolean arg0, class109 arg1, int arg2, int arg3) {
        if (arg1.field2303 == arg2 && ~arg2 != 0) {
            class249 var4 = class237.method1667(arg2, -119);
            int var5 = var4.field4428;
            if (~var5 == -2) {
                arg1.field2297 = 0;
                arg1.field2246 = arg3;
                arg1.field2247 = 0;
                arg1.field2273 = 0;
                class27.method263(var4, arg1.field2300, true, arg1.field2274, false, arg1.field2273);
            }
            if (~var5 == -3) {
                arg1.field2297 = 0;
            }
        } else if (~arg2 == 0 || ~arg1.field2303 == 0 || class237.method1667(arg2, -14).field4429 >= class237.method1667(arg1.field2303, 15).field4429) {
            arg1.field2299 = arg1.field2287;
            arg1.field2247 = 0;
            arg1.field2297 = 0;
            arg1.field2303 = arg2;
            arg1.field2246 = arg3;
            arg1.field2273 = 0;
            if (~arg1.field2303 != 0) {
                class27.method263(class237.method1667(arg1.field2303, 0), arg1.field2300, arg0, arg1.field2274, false, arg1.field2273);
            }
        }
        if (!arg0) {
            field900 = null;
        }
        ++field897;
    }
}
