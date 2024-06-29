import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class416 {

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "S")
    public short field6136;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "S")
    public short field6128;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "B")
    public byte field6131;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "Z")
    public boolean field6133;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "S")
    public short field6126;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "B")
    public byte field6130;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "[F")
    public static float[] field6127 = new float[4];

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "[I")
    public static int[] field6124 = new int[6];

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lgp;")
    public static class561 field6129;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)Lfw;", line = 7)
    public final class416 method2508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6132++;
        if (arg1 != -5302) {
            method2511((byte) 85);
        }
        return new class416(arg2, arg3, arg4, arg0, this.field6128, this.field6126, this.field6136, this.field6130, this.field6131, this.field6133);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lvt;I)I", line = 20)
    public static final int method2509(class343 arg0, int arg1) {
        field6138++;
        if (class343.field4919 == arg0) {
            return 5120;
        } else if (class343.field4920 == arg0) {
            return 5122;
        } else if (class343.field4921 == arg0) {
            return 5124;
        } else if (class343.field4922 == arg0) {
            return 5121;
        } else if (class343.field4923 == arg0) {
            return 5123;
        } else if (class343.field4924 == arg0) {
            return 5125;
        } else if (class343.field4925 == arg0) {
            return 5131;
        } else if (class343.field4926 == arg0) {
            return 5126;
        } else if (arg1 <= 71) {
            return -117;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([SZ)[S", line = 68)
    public static final short[] method2510(short[] arg0, boolean arg1) {
        field6135++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1) {
            field6125 = -70;
        }
        class164.method1147(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 95)
    public class416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field6136 = (short) arg6;
        this.field6128 = (short) arg4;
        this.field6137 = arg0;
        this.field6131 = (byte) arg8;
        this.field6133 = arg9;
        this.field6126 = (short) arg5;
        this.field6130 = (byte) arg7;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V", line = 120)
    public static void method2511(byte arg0) {
        field6129 = null;
        field6127 = null;
        if (arg0 <= 73) {
            field6124 = null;
        }
        field6124 = null;
    }
}
