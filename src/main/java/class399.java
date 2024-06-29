import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class399 extends class445 implements class695 {

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    private int field6019;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    private int field6017;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    private int field6012;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Lsn;")
    public static class656 field6014 = new class656();

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "Z")
    public static boolean field6015 = true;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field6018 = 0;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Ldba;", line = 3)
    public static final class416 method2475(byte arg0) {
        if (arg0 >= -69) {
            return null;
        } else {
            ++field6011;
            try {
                return new class213();
            } catch (Throwable var2) {
                try {
                    return (class416) Class.forName("as").newInstance();
                } catch (Throwable var1) {
                    return new class511();
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V", line = 31)
    public static void method2476(byte arg0) {
        if (arg0 >= -69) {
            field6018 = 36;
        }
        field6014 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)Z", line = 47)
    public static final boolean method2477(int arg0, int arg1, byte arg2) {
        ++field6010;
        if (arg2 <= 77) {
            return false;
        } else {
            return class574.method3304(arg0, 116, arg1) || class115.method855(arg1, arg0, -1148);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lkd;Lwu;III[B)V", line = 58)
    public class399(class700 arg0, class149 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class106.field1573, arg2 * arg3 * arg4, false);
        this.field6019 = arg3;
        this.field6017 = arg4;
        this.field6012 = arg2;
        super.field6476.method3011(-128, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6467, 0, this.method2630(9536), this.field6012, this.field6019, this.field6017, 0, class362.method2224(super.field6458, 6406), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IJ)V", line = 72)
    public static final void method2478(int arg0, long arg1) {
        ++field6013;
        class654 var3 = class149.method1067(99);
        var3.field9358.method3110(class196.field2684.field9823, 111);
        var3.field9358.method3144(-68, arg1);
        var3.field9358.method3110(class262.field3401, 50);
        class444.method2623(arg0 + 30623, var3);
        class622.field8997 = 0;
        class43.field622 = -3;
        class175.field2458 = 1;
        if (arg0 == -30499) {
            field6018 = 0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)S", line = 99)
    public static final short method2479(int arg0, boolean arg1) {
        ++field6016;
        int var2 = 63 & arg0 >> 10;
        int var3 = arg0 >> 3 & 112;
        int var4 = arg0 & 127;
        int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
        if (arg1) {
            method2477(14, 66, (byte) 110);
        }
        int var6 = var4 - -var5;
        int var7;
        if (~var6 == -1) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }
}
