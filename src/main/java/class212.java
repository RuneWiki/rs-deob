import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class212 extends class479 {

    @OriginalMember(owner = "client!ag", name = "zb", descriptor = "Z")
    public static boolean field3169 = false;

    @OriginalMember(owner = "client!ag", name = "Bb", descriptor = "Z")
    public static boolean field3171 = false;

    @OriginalMember(owner = "client!ag", name = "Eb", descriptor = "Lgr;")
    public static class530 field3174 = new class530(80, 8);

    @OriginalMember(owner = "client!ag", name = "Ab", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ag", name = "Cb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ag", name = "Db", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ag", name = "Fb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3170;
        int var5 = class479.field6850;
        int var6 = class424.field6145;
        if (class416.field5919) {
            var5 += class352.method2243(89);
            var6 += class695.method3915((byte) 86);
        }
        if (~class133.field1842 == -2) {
            class515 var7 = class703.field9911[class568.field8210 / 100];
            var7.method3128(var5 + -8, var6 + -8);
            class545.method3277(var5 - 8, var6 + -8, var5 - (8 + -var7.method784()), -43, var7.method780() + var6 + -8);
        }
        if (class133.field1842 == arg2) {
            class515 var8 = class703.field9911[4 - -(class568.field8210 / 100)];
            var8.method3128(var5 - 8, var6 + -8);
            class545.method3277(var5 + -8, var6 + -8, -8 + var5 + var8.method784(), -95, -8 + var6 + var8.method780());
        }
        class701.method3939(false);
    }

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3174 = null;
        int var1 = -78 / ((38 - arg0) / 53);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Laa;IIJLqk;IIBI)V")
    public static final void method1500(class569 arg0, int arg1, int arg2, long arg3, class146 arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field3175;
        int var10 = arg8 * arg8 - -(arg1 * arg1);
        if ((long) var10 <= arg3) {
            if (arg7 != -105) {
                method1500((class569) null, 115, 10, 10L, (class146) null, 39, 45, (byte) -10, -86);
            }
            int var11 = Math.min(arg4.field2016 / 2, arg4.field1997 / 2);
            if (~var10 < ~(var11 * var11)) {
                var11 -= 10;
                int var12;
                if (~class165.field2351 != -5) {
                    var12 = 16383 & (int) class680.field9668 + class225.field3350;
                } else {
                    var12 = (int) class680.field9668 & 16383;
                }
                int var13 = class125.field1736[var12];
                int var14 = class125.field1729[var12];
                if (class165.field2351 != 4) {
                    var13 = var13 * 256 / (class17.field162 + 256);
                    var14 = var14 * 256 / (class17.field162 - -256);
                }
                int var15 = arg1 * var13 + arg8 * var14 >> 14;
                int var16 = arg1 * var14 + -(arg8 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var11);
                int var20 = (int) (Math.cos(var17) * (double) var11);
                class357.field5267[arg6].method3134((float) arg4.field2016 / 2.0F + (float) arg5 + (float) var19, (float) arg4.field1997 / 2.0F + (float) arg2 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class438.method2678(arg5, class121.field1650[arg6], arg0, arg8, arg1, arg2, arg4, -84);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
    public class212(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(FB)V")
    public final void method1501(float arg0, byte arg1) {
        ++field3172;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6800[super.field6864++] = (byte) var3;
        if (arg1 < -33) {
            super.field6800[super.field6864++] = (byte) (var3 >> 8);
            super.field6800[super.field6864++] = (byte) (var3 >> 16);
            super.field6800[super.field6864++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(FB)V")
    public final void method1502(float arg0, byte arg1) {
        ++field3173;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6800[super.field6864++] = (byte) (var3 >> 24);
        if (arg1 <= 71) {
            this.method1501(-0.7945188F, (byte) -36);
        }
        super.field6800[super.field6864++] = (byte) (var3 >> 16);
        super.field6800[super.field6864++] = (byte) (var3 >> 8);
        super.field6800[super.field6864++] = (byte) var3;
    }
}
