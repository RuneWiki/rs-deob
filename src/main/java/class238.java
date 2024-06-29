import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class238 extends class273 {

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    private int field4283 = 0;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    private int field4288 = 0;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    private int field4291 = 1365;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    private int field4298 = 20;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "[[[Lrk;")
    public static class257[][][] field4284 = new class257[4][104][104];

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "Ljd;")
    public static class86 field4293 = class122.method868("::serverjs5drop", true);

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Z")
    public static boolean field4285 = false;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "Ljd;")
    private static class86 field4292 = class122.method868("Loaded wordpack", true);

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "Ljd;")
    public static class86 field4287 = field4292;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
    public static int[] field4295;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "[Lqc;")
    public static class62[] field4294;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field4296;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field4288 = arg1.method1410(-68);
                    }
                } else {
                    this.field4283 = arg1.method1410(-114);
                }
            } else {
                this.field4298 = arg1.method1410(-109);
            }
        } else {
            this.field4291 = arg1.method1410(-89);
        }
        if (arg2 > -16) {
            method1639(74, (class151) null, -30, 54);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class106 var7 = new class106();
        var7.field2025 = arg1 / 128;
        var7.field2047 = arg2 / 128;
        var7.field2033 = arg3 / 128;
        var7.field2024 = arg4 / 128;
        var7.field2043 = arg0;
        var7.field2046 = arg1;
        var7.field2044 = arg2;
        var7.field2041 = arg3;
        var7.field2026 = arg4;
        var7.field2031 = arg5;
        var7.field2020 = arg6;
        class247.field4396[class113.field2151++] = var7;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4286;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            this.method31(74, 64);
        }
        if (super.field4800.field3160) {
            for (int var4 = 0; class176.field3200 > var4; ++var4) {
                int var5 = (class114.field2184[var4] << 12) / this.field4291 - -this.field4283;
                int var6 = (class143.field2711[arg1] << 12) / this.field4291 - -this.field4288;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6 * var6 >> 12;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var5;
                while (var10 + var11 < 16384 && this.field4298 > var12) {
                    var9 = (var8 * var9 >> 12) * 2 + var7;
                    ++var12;
                    var8 = -var10 + var13 + var11;
                    var10 = var9 * var9 >> 12;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = var12 < this.field4298 + -1 ? (var12 << 12) / this.field4298 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILbj;II)Lei;")
    public static final class167 method1639(int arg0, class151 arg1, int arg2, int arg3) {
        ++field4297;
        if (!class163.method1181(arg1, arg0, arg2 ^ 10347, arg3)) {
            return null;
        } else {
            return arg2 != 128 ? null : class130.method916(128);
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public static void method1640(int arg0) {
        field4292 = null;
        field4295 = null;
        field4287 = null;
        field4294 = null;
        if (arg0 != -1806144756) {
            method1638(5, -128, -79, 78, 39, 104, -119);
        }
        field4293 = null;
        field4284 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }
}
