import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class521 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[S")
    public short[] field7439;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "J")
    public long field7444;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[S")
    public short[] field7445;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    public int[] field7438;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBIZII)V", line = 6)
    public static final void method3035(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field7443++;
        int var6 = -110 / ((36 - arg1) / 40);
        long var7 = (long) (arg2 | (arg3 ? Integer.MIN_VALUE : 0));
        class685 var9 = (class685) class203.field2970.method380((byte) -3, var7);
        if (var9 == null) {
            var9 = new class685();
            class203.field2970.method384(var7, var9, false);
        }
        if (var9.field9723.length <= arg5) {
            int[] var10 = new int[arg5 + 1];
            int[] var11 = new int[arg5 + 1];
            for (int var12 = 0; var12 < var9.field9723.length; var12++) {
                var10[var12] = var9.field9723[var12];
                var11[var12] = var9.field9721[var12];
            }
            for (int var13 = var9.field9723.length; var13 < arg5; var13++) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var9.field9723 = var10;
            var9.field9721 = var11;
        }
        var9.field9723[arg5] = arg0;
        var9.field9721[arg5] = arg4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILrv;)Lck;", line = 59)
    public static final class666 method3036(int arg0, class120 arg1) {
        field7440++;
        if (arg0 == 2) {
            int var2 = arg1.method898((byte) -89);
            return new class666(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IFFIF)F", line = 77)
    public static final float method3037(int arg0, float arg1, float arg2, int arg3, float arg4) {
        field7441++;
        float[] var5 = class358.field5209[arg0];
        if (arg3 != 0) {
            field7442 = 32;
        }
        return var5[2] * arg4 + var5[0] * arg2 + var5[1] * arg1;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(J[I[S[S)V", line = 89)
    public class521(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field7439 = arg2;
        this.field7444 = arg0;
        this.field7445 = arg3;
        this.field7438 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 99)
    protected class521() {
    }
}
