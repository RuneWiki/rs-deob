import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class642 {

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    private int field9203;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field9200;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    private int field9193;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    private int field9196;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    private int field9199;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    private int field9202;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    private int field9190;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    private int field9194;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    private int field9201;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    private int field9198;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[Lada;")
    public static class163[] field9188 = new class163[8];

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 3)
    public static void method3658(int arg0) {
        field9188 = null;
        if (arg0 != -15396) {
            field9188 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ltp;Z)V", line = 15)
    public static final void method3659(class532 arg0, boolean arg1) {
        if (arg0.field7543 == 5 && arg0.field7691 != -1) {
            class457.method2799(-22460, class275.field3370, arg0);
        }
        field9191++;
        if (!arg1) {
            field9188 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZII)Z", line = 31)
    public final boolean method3660(int arg0, boolean arg1, int arg2, int arg3) {
        field9197++;
        if (arg1) {
            method3662(-47, (byte) -19, -38, null, 90);
        }
        if (this.field9190 > arg0 || arg0 > this.field9202) {
            return false;
        } else if (arg3 < this.field9201 || arg3 > this.field9198) {
            return false;
        } else if (arg2 >= this.field9194 && arg2 <= this.field9199) {
            int var5 = arg0 - this.field9193;
            int var6 = arg2 - this.field9196;
            return this.field9203 > var5 * var5 + var6 * var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIIIII)V", line = 56)
    public final void method3661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 != 135678185) {
            method3658(27);
        }
        this.field9203 = arg4 * arg4;
        this.field9196 = arg8;
        this.field9200 = arg0;
        this.field9193 = arg10;
        field9192++;
        this.field9198 = this.field9200 + arg1;
        this.field9201 = this.field9200 + arg7;
        this.field9199 = this.field9196 + arg5;
        this.field9202 = this.field9193 + arg9;
        this.field9194 = this.field9196 + arg2;
        this.field9190 = this.field9193 + arg3;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBILvc;I)V", line = 90)
    public static final void method3662(int arg0, byte arg1, int arg2, class316 arg3, int arg4) {
        field9195++;
        class376 var5 = (class376) class1.field6.method1719(65280);
        int var6 = -113 / ((arg1 + 2) / 63);
        while (var5 != null) {
            if (var5.field4837 == arg4 && (arg0 << 9) == var5.field4852 && (arg2 << 9) == var5.field4858 && var5.field4828.field3962 == arg3.field3962) {
                if (var5.field4859 != null) {
                    class597.field8470.method1690(var5.field4859);
                    var5.field4859 = null;
                }
                if (var5.field4848 != null) {
                    class597.field8470.method1690(var5.field4848);
                    var5.field4848 = null;
                }
                var5.method864(12983);
                return;
            }
            var5 = (class376) class1.field6.method1723(-20665);
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 128)
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field9203 = arg3 * arg3;
        this.field9200 = arg1;
        this.field9193 = arg0;
        this.field9196 = arg2;
        this.field9199 = this.field9196 + arg9;
        this.field9202 = this.field9193 + arg5;
        this.field9190 = this.field9193 + arg4;
        this.field9194 = this.field9196 + arg8;
        this.field9201 = this.field9200 + arg6;
        this.field9198 = this.field9200 + arg7;
    }
}
