import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class459 {

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public int field6391 = 128;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public int field6395 = 128;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field6390;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public int field6394;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public int field6393;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lkfa;")
    public static class549 field6387 = new class549(29, -1);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lis;")
    public final class459 method2616(int arg0) {
        if (arg0 != 15512) {
            this.method2620(null, (byte) 107);
        }
        field6396++;
        return new class459(this.field6390, this.field6395, this.field6391, this.field6389, this.field6394, this.field6393);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([B[BIIIIIII)V")
    public static final void method2617(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6386++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg0[var10001] += arg1[arg4++];
                int var14 = arg8++;
                arg0[var14] += arg1[arg4++];
                int var15 = arg8++;
                arg0[var15] += arg1[arg4++];
                int var16 = arg8++;
                arg0[var16] += arg1[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg0[var10001] += arg1[arg4++];
            }
            arg8 += arg7;
            arg4 += arg2;
        }
        if (arg5 != 500) {
            field6387 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZIILjava/lang/String;IZIJLjava/lang/String;II)V")
    public static final void method2618(boolean arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6, long arg7, String arg8, int arg9, int arg10) {
        field6388++;
        if (class215.field2615 || class145.field1625 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class378.field4915 : arg10;
        if (arg1 != 500) {
            field6387 = null;
        }
        class208 var13 = new class208(arg8, arg3, var12, arg9, arg2, arg7, arg4, arg6, arg5, arg0);
        class530.field7597.method3164(var13, 256);
        class145.field1625++;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static void method2619(int arg0) {
        field6387 = null;
        if (arg0 != 3041) {
            method2619(-113);
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
    public class459(int arg0) {
        this.field6390 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lis;B)V")
    public final void method2620(class459 arg0, byte arg1) {
        if (arg1 >= -41) {
            field6387 = null;
        }
        this.field6391 = arg0.field6391;
        this.field6389 = arg0.field6389;
        field6392++;
        this.field6395 = arg0.field6395;
        this.field6394 = arg0.field6394;
        this.field6393 = arg0.field6393;
        this.field6390 = arg0.field6390;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IIIIII)V")
    private class459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6391 = arg2;
        this.field6395 = arg1;
        this.field6389 = arg3;
        this.field6390 = arg0;
        this.field6394 = arg4;
        this.field6393 = arg5;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)I")
    public static final int method2621(byte arg0, int arg1) {
        if (arg0 <= 53) {
            field6387 = null;
        }
        field6385++;
        return arg1 & 0xFF;
    }
}
