import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class652 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Lbga;")
    public static class324 field9167;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Lpu;")
    public static class522 field9171;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method3603(int arg0) {
        field9172++;
        if (arg0 != 0) {
            field9171 = null;
        }
        return class203.field2870 == this | class173.field2464 == this;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI[II[J)V", line = 16)
    public static final void method3604(boolean arg0, int arg1, int[] arg2, int arg3, long[] arg4) {
        if (arg0) {
            return;
        }
        field9169++;
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg1; var11++) {
            if ((long) (var10 & var11) + var7 > arg4[var11]) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                int var14 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6++] = var14;
            }
        }
        arg4[arg1] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var9;
        method3604(false, var6 - 1, arg2, arg3, arg4);
        method3604(arg0, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!no", name = "toString", descriptor = "()Ljava/lang/String;", line = 72)
    public final String toString() {
        field9173++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLpu;I)Luq;", line = 84)
    public static final class146 method3605(int arg0, byte arg1, class522 arg2, int arg3) {
        field9168++;
        if (arg1 == 88) {
            byte[] var4 = arg2.method3007(arg3, arg0, 5);
            return var4 == null ? null : new class146(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)I", line = 106)
    public static final int method3606(int arg0, String arg1) {
        if (arg0 == 12351) {
            field9170++;
            return arg1.length() + 1;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 117)
    public static void method3607(int arg0) {
        field9167 = null;
        if (arg0 <= 91) {
            field9171 = null;
        }
        field9171 = null;
    }
}
