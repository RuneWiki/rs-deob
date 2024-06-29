import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class571 extends class617 {

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public int field8105;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "Lvj;")
    private class422 field8107;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "J")
    private long field8112;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "F")
    public static float field8108;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "Lhb;")
    public static class347 field8109;

    @OriginalMember(owner = "client!gr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3231(0);
        field8111++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static final void method3226(int arg0) {
        field8117++;
        for (class336 var1 = (class336) class694.field9730.method3434((byte) 2); var1 != null; var1 = (class336) class694.field9730.method3430(true)) {
            if (class266.method1566(var1.field4231, false)) {
                class696.method3827((byte) -103, var1);
            }
        }
        if (class661.field9266 == 1) {
            class45.method239((byte) -68);
        } else {
            class556.method3151(class598.field8426, class376.field5112, class200.field2357, 0, class361.field4841);
            int var2 = class488.field7097.method2657((byte) 62, class198.field2309.method1195((byte) 62, class504.field7267));
            for (class336 var3 = (class336) class694.field9730.method3434((byte) 2); var3 != null; var3 = (class336) class694.field9730.method3430(true)) {
                int var4 = class254.method1495(-28583, var3);
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            class361.field4841 = (class213.field2597 ? 26 : 22) + class661.field9266 * 16;
            class598.field8426 = var2 + 8;
        }
        int var5 = -53 % ((-arg0 - 82) / 35);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
    public static void method3227(byte arg0) {
        field8109 = null;
        if (arg0 != -91) {
            field8108 = 0.42165476F;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILsf;I)Z")
    public static final boolean method3228(int arg0, class603 arg1, int arg2) {
        class414.field5560.method19(arg1.field8486[arg2], arg1.field8478[arg2], arg1.field8476[arg2], class404.field5403);
        field8106++;
        int var3 = class404.field5403[2];
        if (var3 < 50) {
            return false;
        }
        arg1.field8480[arg2] = (short) (class404.field5403[0] * class701.field9830 / var3 + class14.field122);
        if (arg0 != 2029) {
            field8114 = 119;
        }
        arg1.field8481[arg2] = (short) (class404.field5403[1] * class73.field765 / var3 + class412.field5530);
        arg1.field8475[arg2] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)J")
    public final long method3229(byte arg0) {
        if (arg0 > -9) {
            return -106L;
        } else {
            field8115++;
            return this.field8112;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lvj;II)V")
    public class571(class422 arg0, int arg1, int arg2) {
        this.field8105 = arg1 * arg2;
        this.field8107 = arg0;
        this.field8112 = this.field8107.field5794.createPbuffer(arg1, arg2);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[BIIIIII[B)V")
    public static final void method3230(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field8113++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg8[var10001] += arg1[arg4++];
                int var14 = arg5++;
                arg8[var14] += arg1[arg4++];
                int var15 = arg5++;
                arg8[var15] += arg1[arg4++];
                int var16 = arg5++;
                arg8[var16] += arg1[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg8[var10001] += arg1[arg4++];
            }
            arg4 += arg3;
            arg5 += arg6;
        }
        if (arg2 != -1) {
            method3230(-25, null, -35, 127, 13, -124, 22, -119, null);
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
    private final void method3231(int arg0) {
        field8116++;
        if ((long) arg0 < this.field8112) {
            this.field8107.field5794.releasePbuffer(this.field8112);
            this.field8112 = 0L;
        }
    }
}
