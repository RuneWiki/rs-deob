import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class627 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field8947 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field8956 = 0;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lbh;")
    private class538 field8955 = new class538(64);

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lph;")
    private class607 field8957 = null;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lwu;")
    private class557 field8952;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lwu;")
    private class557 field8948;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
    public static boolean field8949 = false;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Ljm;")
    public static class6 field8950;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lica;", line = 3)
    public final class391 method3658(byte arg0, int arg1) {
        field8951++;
        class391 var3 = (class391) this.field8955.method3200((long) arg1, -19983);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field8952.method3322(1, arg1 & 0x7FFF, (byte) 105);
        } else {
            var4 = this.field8948.method3322(1, arg1, (byte) 125);
        }
        class391 var5 = new class391();
        var5.field5448 = this;
        if (var4 != null) {
            var5.method2375(0, new class26(var4));
        }
        if (arg1 >= 32768) {
            var5.method2380(32768);
        }
        this.field8955.method3199((byte) 78, var5, (long) arg1);
        if (arg0 != -45) {
            this.field8947 = -54;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(J[ILmha;I)Ljava/lang/String;", line = 42)
    public final String method3659(long arg0, int[] arg1, class701 arg2, int arg3) {
        field8946++;
        if (arg3 <= 62) {
            return null;
        }
        if (this.field8957 != null) {
            String var6 = this.field8957.method734((byte) 54, arg2, arg1, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 65)
    public static void method3660(boolean arg0) {
        if (!arg0) {
            field8950 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILwu;Lwu;Lph;)V", line = 131)
    public class627(int arg0, class557 arg1, class557 arg2, class607 arg3) {
        this.field8952 = arg2;
        this.field8948 = arg1;
        this.field8957 = arg3;
        if (this.field8948 != null) {
            this.field8956 = this.field8948.method3333(1, 3443);
        }
        if (this.field8952 != null) {
            this.field8947 = this.field8952.method3333(1, 3443);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)I", line = 85)
    public static final int method3661(int arg0, byte arg1, int arg2) {
        field8953++;
        int var3 = 124 / ((35 - arg1) / 48);
        int var4 = class658.method3795(arg0 + 45365, arg2 + 91923, 4, (byte) -25) - (128 - (class658.method3795(arg0 + 10294, arg2 + 37821, 2, (byte) -25) - 128 >> 1)) + (class658.method3795(arg0, arg2, 1, (byte) -25) - 128 >> 2);
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BII)I", line = 105)
    public static final int method3662(byte[] arg0, int arg1, int arg2) {
        if (arg1 > -56) {
            field8950 = null;
        }
        field8954++;
        return class88.method530(arg0, 2, arg2, 0);
    }
}
