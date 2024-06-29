import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class456 extends InputStream {

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6318 = -50;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[ILac;I[IB)Lnc;", line = 3)
    public static final class24 method2547(int arg0, int[] arg1, class541 arg2, int arg3, int[] arg4, byte arg5) {
        if (arg5 != 111) {
            field6318 = -5;
        }
        field6315++;
        byte[] var6 = new byte[arg0 * arg3];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg3 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class24(arg2, arg3, arg0, var6);
    }

    @OriginalMember(owner = "client!rca", name = "read", descriptor = "()I", line = 33)
    public final int read() {
        class267.method1599(0, 30000L);
        field6317++;
        return -1;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2548(int arg0) {
        class480.field6631 = null;
        int var1 = -24 / ((-arg0 - 12) / 63);
        class445.field6185 = -1;
        field6316++;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIIII)V", line = 58)
    public static final void method2549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6319++;
        int var6 = arg0 - arg4;
        if (arg5 != 21597) {
            field6318 = 22;
        }
        int var7 = arg2 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class677.method3847(arg4, (byte) 0, arg3, arg2, arg1);
            }
        } else if (var7 == 0) {
            class347.method2027(arg1, arg4, (byte) 85, arg0, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class122.field1604) {
                var10 = (class122.field1604 * var8 >> 12) + var9;
                var11 = class122.field1604;
            } else if (arg0 > class165.field2070) {
                var11 = class165.field2070;
                var10 = (class165.field2070 * var8 >> 12) + var9;
            } else {
                var11 = arg0;
                var10 = arg2;
            }
            int var12;
            int var13;
            if (class122.field1604 > arg4) {
                var12 = var9 + (class122.field1604 * var8 >> 12);
                var13 = class122.field1604;
            } else if (arg4 > class165.field2070) {
                var12 = (class165.field2070 * var8 >> 12) + var9;
                var13 = class165.field2070;
            } else {
                var12 = arg3;
                var13 = arg4;
            }
            if (class759.field10576 > var10) {
                var10 = class759.field10576;
                var11 = (class759.field10576 - var9 << 12) / var8;
            } else if (class29.field238 < var10) {
                var11 = (class29.field238 - var9 << 12) / var8;
                var10 = class29.field238;
            }
            if (class759.field10576 > var12) {
                var12 = class759.field10576;
                var13 = (class759.field10576 - var9 << 12) / var8;
            } else if (var12 > class29.field238) {
                var12 = class29.field238;
                var13 = (class29.field238 - var9 << 12) / var8;
            }
            class518.method2855(arg1, var12, var10, var11, (byte) -126, var13);
        }
    }
}
