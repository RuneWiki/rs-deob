import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class247 extends class297 {

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Lwn;")
    public static class30 field3675 = new class30();

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "Lgd;")
    public static class325 field3680 = new class325(64);

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "[I")
    public static int[] field3683 = new int[500];

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)[I", line = 10)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            field3682 = -19;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            class330.method2313(var3, 0, class31.field491, class264.field3901[arg0]);
        }
        field3684++;
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)I", line = 38)
    public static final int method1730(byte arg0, int arg1) {
        int var2 = arg1 * 6 - 61440;
        int var3 = -98 % ((arg0 - 6) / 40);
        int var4 = (arg1 * var2 >> 12) + 40960;
        field3678++;
        int var5 = (arg1 * arg1 >> 12) * arg1 >> 12;
        return var4 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIBIIII)V", line = 64)
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field3679++;
        class83 var13 = new class83();
        var13.field1293 = arg9;
        var13.field1291 = arg12;
        if (arg8 < 45) {
            method1731(89, -128, -122, 101, 58, -75, -5, 86, (byte) -53, -8, -43, 100, -123);
        }
        var13.field1297 = arg11;
        var13.field1282 = arg7;
        var13.field1286 = arg2;
        var13.field1300 = arg5;
        var13.field1299 = arg1;
        var13.field1296 = arg6;
        var13.field1301 = arg10;
        var13.field1292 = arg3;
        var13.field1283 = arg4;
        var13.field1289 = arg0;
        class146.field2361.method277(var13, (byte) -119);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 89)
    public class247() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V", line = 93)
    public static void method1732(byte arg0) {
        field3683 = null;
        field3680 = null;
        field3675 = null;
        if (arg0 <= 117) {
            method1732((byte) -40);
        }
    }
}
