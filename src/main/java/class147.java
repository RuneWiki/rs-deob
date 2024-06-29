import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class147 extends class196 {

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    private int field2283;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    private int field2292;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private int field2279;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field2285 = 0;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[Z")
    public static boolean[] field2286 = new boolean[8];

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field2287 = -1;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[Lbf;")
    public static class58[] field2288;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2282++;
        if (class232.field3690) {
            class75.method506(arg0, arg4, arg0 + arg2, arg3 + arg4);
            class75.method505(arg0, arg4, arg2, arg3, 0);
        } else {
            class59.method389(arg0, arg4, arg0 + arg2, arg3 + arg4);
            class59.method382(arg0, arg4, arg2, arg3, 0);
        }
        if (class52.field738 < 100) {
            return;
        }
        if (class199.field3236 == null || class199.field3236.field825 != arg2 || class199.field3236.field816 != arg3) {
            class220 var5 = new class220(arg2, arg3);
            class59.method401(var5.field3545, arg2, arg3);
            class273.method1980(0, 0, 0, (byte) -112, 0, class111.field1650, arg2, arg3, class74.field1048);
            if (class232.field3690) {
                class199.field3236 = new class314(var5);
            } else {
                class199.field3236 = var5;
            }
            if (class232.field3690) {
                class59.field833 = null;
            } else {
                class8.field120.method2345((byte) -118);
            }
        }
        if (arg1 != -11) {
            field2286 = (boolean[]) null;
        }
        class199.field3236.method379(arg0, arg4);
        int var6 = class202.field3281 * arg3 / class74.field1048;
        int var7 = 16711680;
        if (class15.field169 == 1) {
            var7 = 16777215;
        }
        int var8 = class307.field4785 * arg2 / class111.field1650;
        int var9 = class234.field3751 * arg2 / class111.field1650 + arg0;
        int var10 = arg4 + (class173.field2867 * arg3 / class74.field1048);
        if (class232.field3690) {
            class75.method510(var9, var10, var8, var6, var7, 128);
            class75.method507(var9, var10, var8, var6, var7);
        } else {
            class59.method394(var9, var10, var8, var6, var7, 128);
            class59.method390(var9, var10, var8, var6, var7);
        }
        if (class69.field969 <= 0) {
            return;
        }
        int var11;
        if (class165.field2743 > 10) {
            var11 = (20 - class165.field2743) * 25;
        } else {
            var11 = class165.field2743 * 25;
        }
        for (class280 var12 = (class280) class97.field1324.method1240(3); var12 != null; var12 = (class280) class97.field1324.method1235(false)) {
            if (class304.field4758 == var12.field4517) {
                int var13 = var12.field4521 * arg2 / class111.field1650 + arg0;
                int var14 = var12.field4513 * arg3 / class74.field1048 + arg4;
                if (class232.field3690) {
                    class75.method510(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                } else {
                    class59.method394(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 109)
    public final void method1080(int arg0, int arg1, int arg2) {
        field2284++;
        int var4 = this.field2278 * arg0 >> 12;
        int var5 = this.field2279 * arg0 >> 12;
        int var6 = this.field2283 * arg2 >> 12;
        if (arg1 == -6577) {
            int var7 = this.field2292 * arg2 >> 12;
            class25.method144(var4, arg1 ^ 0xFFFF8BD3, var7, var5, this.field3196, var6);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V", line = 133)
    public final void method1081(int arg0, int arg1, int arg2) {
        if (arg2 != 31947) {
            method1082(79);
        }
        field2290++;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIII)V", line = 143)
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2283 = arg1;
        this.field2292 = arg3;
        this.field2279 = arg2;
        this.field2278 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lin;", line = 157)
    public static final class344 method1082(int arg0) {
        field2280++;
        if (arg0 != 0) {
            return (class344) null;
        }
        class344 var1 = (class344) class42.field529.method1419(200);
        if (var1 != null) {
            var1.method1212((byte) 89);
            var1.method42((byte) -114);
            return var1;
        }
        class344 var2;
        do {
            var2 = (class344) class172.field2853.method1419(200);
            if (var2 == null) {
                return null;
            }
            if (var2.method2391((byte) 52) > class283.method2038((byte) 124)) {
                return null;
            }
            var2.method1212((byte) 121);
            var2.method42((byte) -122);
        } while ((Long.MIN_VALUE & var2.field109) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V", line = 209)
    public final void method1083(int arg0, int arg1, boolean arg2) {
        field2291++;
        if (!arg2) {
            this.field2279 = 84;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 224)
    public static void method1084(boolean arg0) {
        field2286 = null;
        if (arg0) {
            field2286 = (boolean[]) null;
        }
        field2288 = null;
    }
}
