import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class163 extends class436 {

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "[I")
    public static int[] field2281 = new int[2];

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2289 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!eo", name = "X", descriptor = "I")
    public static int field2296 = -2;

    @OriginalMember(owner = "client!eo", name = "Z", descriptor = "I")
    public static int field2298 = 0;

    @OriginalMember(owner = "client!eo", name = "Y", descriptor = "[I")
    public static int[] field2297 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    private int field2288;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "Lqj;")
    public static class296 field2282;

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "Lqj;")
    public static class296 field2292;

    @OriginalMember(owner = "client!eo", name = "V", descriptor = "Lqj;")
    public static class296 field2294;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method85(int arg0, int arg1) {
        if (arg0 != -13348) {
            this.field2290 = 84;
        }
        ++field2280;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class43.field653 > var7; ++var7) {
                var4[var7] = this.field2290;
                var5[var7] = this.field2288;
                var6[var7] = this.field2283;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 47)
    public class163() {
        this(0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 52)
    public static final int method1080(String arg0, byte arg1) {
        ++field2293;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = 52 / ((arg1 - 24) / 46);
            for (int var3 = 0; class97.field1482 > var3; ++var3) {
                if (arg0.equalsIgnoreCase(class40.field609[var3])) {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)I", line = 81)
    public static final int method1081(byte arg0, int arg1) {
        ++field2295;
        int var2 = 63 & arg1;
        if (arg0 < 108) {
            field2282 = null;
        }
        int var3 = (221 & arg1) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (~var3 == -3) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (~var2 == -20 || var2 == 21) {
            if (~var3 == -1) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILeb;)V", line = 133)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field2286;
        if (arg1 == 0) {
            this.method1087(arg0 ^ 59, arg2.method2425(arg0 ^ -77));
        }
        if (arg0 != 34) {
            field2298 = 126;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V", line = 160)
    private class163(int arg0) {
        super(0, false);
        this.method1087(121, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(B)V", line = 168)
    public static void method1082(byte arg0) {
        field2282 = null;
        field2294 = null;
        if (arg0 > 10) {
            field2281 = null;
            field2289 = null;
            field2297 = null;
            field2292 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(II)V", line = 183)
    public static final void method1083(int arg0, int arg1) {
        ++field2291;
        if (arg1 != -20687) {
            method1080((String) null, (byte) -109);
        }
        class124 var2 = (class124) class71.field1103.method1412((byte) -54, (long) arg0);
        if (var2 != null) {
            var2.method2459(198);
        }
    }

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V", line = 200)
    public static final void method1084(int arg0) {
        ++field2284;
        class272 var1 = class362.field5075;
        synchronized (class362.field5075) {
            class362.field5075.method1674((byte) -64);
        }
        if (arg0 <= 28) {
            field2282 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V", line = 213)
    public static final void method1085(int arg0, int arg1, int arg2, int arg3) {
        if (class270.field3683 != null) {
            class270.field3683[arg0][arg1] = (arg3 & 2040) << 21 | arg2 & 16777215;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V", line = 222)
    public static final void method1086(int arg0, byte arg1) {
        if (arg1 >= -92) {
            method1086(-67, (byte) 89);
        }
        ++field2287;
        class399 var2 = class269.method1655(2, arg0, -76);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(II)V", line = 239)
    private final void method1087(int arg0, int arg1) {
        this.field2288 = 4080 & arg1 >> 4;
        if (arg0 <= 8) {
            method1081((byte) -96, -98);
        }
        this.field2290 = (arg1 & 16711680) >> 12;
        this.field2283 = 4080 & arg1 << 4;
        ++field2285;
    }
}
