import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class657 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field9266 = -1;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Ldaa;")
    public static class453 field9269 = new class453();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field9263;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field9264;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field9268;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public int field9271;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field9272;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field9275;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field9277;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lqb;")
    public static class67 field9274;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method3763(int arg0) {
        class571.field8023.method319(-77);
        int var1 = -6 / ((arg0 - 10) / 45);
        field9273++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[JII[I)V")
    public static final void method3764(int arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 != 1) {
            method3766(126, (byte) 78);
        }
        field9267++;
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        int var9 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (arg1[var11] < var7 + ((long) (var10 & var11))) {
                long var12 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6] = var12;
                int var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var9;
        method3764(arg0, arg1, var6 - 1, arg3, arg4);
        method3764(arg0, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
    public static final boolean method3765(byte arg0, int arg1) {
        field9265++;
        if (arg0 != 69) {
            method3766(64, (byte) -21);
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[I")
    public static final int[] method3766(int arg0, byte arg1) {
        field9276++;
        class324.method2052(-67, class116.method849(arg0, -11745));
        int[] var2 = new int[] { class448.field6277.get(5), class448.field6277.get(2), class448.field6277.get(1) };
        int var3 = -76 % ((-arg1 - 69) / 55);
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static void method3767(int arg0) {
        field9269 = null;
        if (arg0 != -26902) {
            method3766(-112, (byte) -83);
        }
        field9274 = null;
    }
}
