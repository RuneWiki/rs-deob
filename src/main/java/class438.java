import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class438 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field6515 = 0;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lsd;")
    private class80 field6517;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
    public static boolean field6510 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Luj;")
    private class324 field6509;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Z")
    public static boolean field6508;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Luj;", line = 4)
    public final class324 method2727(byte arg0) {
        field6507++;
        this.field6515 = 0;
        int var2 = 24 / ((arg0 - 10) / 55);
        return this.method2728((byte) 67);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Luj;", line = 15)
    public final class324 method2728(byte arg0) {
        if (arg0 <= 5) {
            field6510 = false;
        }
        field6513++;
        if (this.field6515 > 0 && this.field6517.field887[this.field6515 - 1] != this.field6509) {
            class324 var2 = this.field6509;
            this.field6509 = var2.field4681;
            return var2;
        }
        while (this.field6517.field884 > this.field6515) {
            class324 var3 = this.field6517.field887[this.field6515++].field4681;
            if (this.field6517.field887[this.field6515 - 1] != var3) {
                this.field6509 = var3.field4681;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V", line = 47)
    public static final void method2729(int arg0, int arg1, Object[] arg2, int[] arg3, int arg4) {
        field6514++;
        if (arg4 < 34 || arg0 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg0) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if ((var9 & var10) + var7 > arg3[var10]) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg3[arg0] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method2729(var6 - 1, arg1, arg2, arg3, 43);
        method2729(arg0, var6 + 1, arg2, arg3, 95);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIIFIII)[I", line = 113)
    public static final int[] method2730(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        field6512++;
        int[] var8 = new int[arg7];
        class363 var9 = new class363();
        var9.field5499 = arg3;
        var9.field5503 = (int) (arg4 * 4096.0F);
        var9.field5511 = arg5;
        var9.field5508 = arg6;
        var9.field5502 = arg2;
        if (arg1 <= 90) {
            field6510 = true;
        }
        var9.field5509 = arg0;
        var9.method145(-91);
        class39.method205(arg7, 1, 119);
        var9.method2341((byte) -106, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 143)
    public class438() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lsd;)V", line = 147)
    public class438(class80 arg0) {
        this.field6517 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JJ)J", line = 155)
    public static long method2731(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
