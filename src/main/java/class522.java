import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class522 extends class314 {

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Lui;")
    public static class210 field7571 = new class210(10, 2, 2, 0);

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "Luca;")
    public static class474 field7578;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Lps;")
    public static class82 field7574;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "[[[Z")
    public static boolean[][][] field7576;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method6(int arg0, int arg1) {
        ++field7570;
        int[] var3 = super.field4928.method534((byte) -48, arg0);
        if (arg1 < 109) {
            method3142(60, 43, (long[]) null, (Object[]) null, 96);
        }
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0, -128);
            for (int var5 = 0; var5 < class81.field1009; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 41)
    public class522() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I", line = 45)
    public final int[][] method4(int arg0, byte arg1) {
        ++field7577;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (arg1 <= 68) {
            field7574 = null;
        }
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class81.field1009 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLie;I)V", line = 92)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field7572;
        if (~arg2 == -1) {
            super.field4936 = arg1.method70(-9059) == 1;
        }
        if (arg0 >= -1) {
            this.method5((byte) 111, (class6) null, -96);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V", line = 106)
    public static final void method3142(int arg0, int arg1, long[] arg2, Object[] arg3, int arg4) {
        if (arg4 != 2) {
            method3142(-123, -43, (long[]) null, (Object[]) null, 38);
        }
        if (~arg0 > ~arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg1; ++var11) {
                if ((long) (var10 & var11) + var7 > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method3142(arg0, var6 + -1, arg2, arg3, arg4);
            method3142(var6 + 1, arg1, arg2, arg3, 2);
        }
        ++field7575;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V", line = 163)
    public static void method3143(int arg0) {
        field7576 = null;
        if (arg0 >= -11) {
            field7576 = null;
        }
        field7574 = null;
        field7578 = null;
        field7571 = null;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V", line = 178)
    public static final void method3144(int arg0) {
        class661.field9216.method569(0);
        ++field7573;
        if (arg0 < 70) {
            field7574 = null;
        }
    }
}
