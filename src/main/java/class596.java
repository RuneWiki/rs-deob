import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class596 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[S")
    public short[] field8124;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "J")
    public long field8123;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
    public int[] field8128;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[S")
    public short[] field8121;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lvl;")
    public static class15 field8125 = new class15();

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Ljw;")
    public static class581 field8127 = new class581(57, -2);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method3320(int arg0) {
        if (arg0 != -2) {
            field8129 = 73;
        }
        field8127 = null;
        field8125 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static final void method3321(int arg0) {
        class89.field1236.method600((byte) -91);
        field8126++;
        for (int var1 = 0; var1 < 32; var1++) {
            class516.field7060[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class535.field7290[var2] = 0L;
        }
        if (arg0 != -33) {
            method3321(-24);
        }
        class79.field1126 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static final void method3322(byte arg0) {
        class243.field3267 = true;
        field8122++;
        if (arg0 < 21) {
            field8129 = -97;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(J[I[S[S)V")
    public class596(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field8124 = arg2;
        this.field8123 = arg0;
        this.field8128 = arg1;
        this.field8121 = arg3;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    protected class596() {
    }
}
