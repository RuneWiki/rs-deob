import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class679 extends class458 implements class26 {

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    private int field9456;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field9453 = -1;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lkh;")
    public static class17 field9452 = null;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field9451;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZI)Z", line = 4)
    public static final boolean method3825(int arg0, boolean arg1, int arg2) {
        ++field9450;
        if (!arg1) {
            return false;
        } else {
            return class637.method3558(arg0, (byte) 78, arg2) || class645.method3593((byte) 66, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[BII)V", line = 17)
    public final void method175(boolean arg0, byte[] arg1, int arg2, int arg3) {
        this.method2637(arg1, arg2);
        if (arg0) {
            field9453 = 83;
        }
        ++field9455;
        this.field9456 = arg3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([IIIII)V", line = 31)
    public static final void method3826(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9451;
        --arg3;
        if (arg2 == 11) {
            int var6 = arg1 - 1;
            int var5 = -7 + var6;
            while (arg3 < var5) {
                int var7 = arg3 + 1;
                arg0[var7] = arg4;
                int var8 = var7 + 1;
                arg0[var8] = arg4;
                int var9 = var8 + 1;
                arg0[var9] = arg4;
                int var10 = var9 + 1;
                arg0[var10] = arg4;
                int var11 = var10 + 1;
                arg0[var11] = arg4;
                int var12 = var11 + 1;
                arg0[var12] = arg4;
                int var13 = var12 + 1;
                arg0[var13] = arg4;
                arg3 = var13 + 1;
                arg0[arg3] = arg4;
            }
            while (var6 > arg3) {
                ++arg3;
                arg0[arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I", line = 59)
    public final int method176(int arg0) {
        if (arg0 <= 97) {
            this.field9456 = -70;
        }
        ++field9457;
        return this.field9456;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V", line = 72)
    public static final void method3827(int arg0, int arg1, int arg2, int arg3) {
        ++field9448;
        class281 var4 = class54.method395((byte) -53, (long) arg0, arg1);
        var4.method1821((byte) -124);
        var4.field3901 = arg3;
        var4.field3910 = arg2;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lhk;I[BI)V", line = 84)
    public class679(class111 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9456 = arg1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)J", line = 92)
    public final long method173(int arg0) {
        ++field9449;
        int var2 = 115 / ((arg0 - 47) / 57);
        return super.field6229.getAddress();
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I", line = 102)
    public final int method174(int arg0) {
        ++field9454;
        if (arg0 != -2163) {
            field9453 = 6;
        }
        return 0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 124)
    public static void method3828(byte arg0) {
        if (arg0 != -89) {
            method3825(-11, true, 7);
        }
        field9452 = null;
    }
}
