import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class class332 extends class329 {

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "F")
    public float field4239;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "[J")
    public static long[] field4233 = new long[100];

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[BII[BIIII)V")
    public static final void method1880(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field4240++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        int var11 = -arg6;
        if (arg5 != -1) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg4[var10001] += arg1[arg3++];
                int var14 = arg7++;
                arg4[var14] += arg1[arg3++];
                int var15 = arg7++;
                arg4[var15] += arg1[arg3++];
                int var16 = arg7++;
                arg4[var16] += arg1[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg4[var10001] += arg1[arg3++];
            }
            arg7 += arg2;
            arg3 += arg8;
            var11++;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
    public final int method1881(int arg0) {
        field4243++;
        return arg0 <= 30 ? 44 : this.field4245;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IF)V")
    public abstract void method1(int arg0, float arg1);

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)F")
    public final float method1882(int arg0) {
        if (arg0 == 100) {
            field4232++;
            return this.field4239;
        } else {
            return 1.2685008F;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIBI)V")
    public abstract void method2(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)I")
    public final int method1883(byte arg0) {
        int var2 = 122 % ((arg0 + 5) / 38);
        field4246++;
        return this.field4237;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIII)V")
    public static final void method1884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 13616) {
            method1880(-67, null, -89, -119, null, -45, 91, 121, -124);
        }
        field4244++;
        if (class263.field3294 <= arg3 && class314.field4052 >= arg5 && class289.field3595 <= arg2 && class159.field2063 >= arg1) {
            class530.method2879(arg3, arg2, arg4 ^ 0xFFFFCAA6, arg1, arg0, arg5);
        } else {
            class476.method2517(arg3, arg1, arg5, arg0, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)I")
    public final int method1885(byte arg0) {
        field4234++;
        if (arg0 != 119) {
            this.method2(73, 52, (byte) 52, 124);
        }
        return this.field4236;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I")
    public final int method1886(boolean arg0) {
        if (!arg0) {
            this.method1885((byte) 118);
        }
        field4241++;
        return this.field4247;
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)V")
    public static void method1887(int arg0) {
        field4233 = null;
        if (arg0 != 100) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "(I)I")
    public final int method1888(int arg0) {
        if (arg0 > -24) {
            return 44;
        } else {
            field4242++;
            return this.field4235;
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(IIIIIF)V")
    public class332(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field4247 = arg0;
        this.field4235 = arg1;
        this.field4239 = arg5;
        this.field4237 = arg3;
        this.field4245 = arg4;
        this.field4236 = arg2;
    }
}
