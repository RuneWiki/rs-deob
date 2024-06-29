import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class406 {

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "[Z")
    public static boolean[] field5409 = new boolean[100];

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
    public static int[] field5416 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "[I")
    public static int[] field5417 = new int[2];

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lxa;IILfa;IIILep;)V", line = 14)
    public static final void method2206(class458 arg0, int arg1, int arg2, class213 arg3, int arg4, int arg5, int arg6, class382 arg7) {
        field5412++;
        if (arg0 == null) {
            return;
        }
        int var8;
        if (class5.field41 == 4) {
            var8 = (int) class90.field1041 & 0x3FFF;
        } else {
            var8 = (int) class90.field1041 + class628.field8908 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field5035 / 2, arg7.field4958 / 2) + 10;
        int var10 = arg4 * arg4 + arg6 * arg6;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class285.field3655[var8];
        int var12 = class285.field3656[var8];
        if (class5.field41 != 4) {
            var11 = var11 * 256 / (class599.field8520 + 256);
            var12 = var12 * 256 / (class599.field8520 + 256);
        }
        if (arg5 == 16383) {
            int var13 = arg4 * var11 + arg6 * var12 >> 14;
            int var14 = arg4 * var12 - arg6 * var11 >> 14;
            arg0.method410(arg2 - (arg0.method418() / 2 - (arg7.field5035 / 2) - var13), arg7.field4958 / 2 + -var14 + arg1 - arg0.method408() / 2, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V", line = 61)
    public class406(int arg0, int arg1) {
        this.field5411 = arg1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V", line = 71)
    public static void method2207(boolean arg0) {
        field5416 = null;
        field5409 = null;
        if (!arg0) {
            field5417 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II[J[II)V", line = 83)
    public static final void method2208(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg4 != -1) {
            return;
        }
        field5410++;
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg0; var11 < arg1; var11++) {
            if (var7 + ((long) (var11 & var10)) > arg2[var11]) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var9;
        method2208(arg0, var6 - 1, arg2, arg3, -1);
        method2208(var6 + 1, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qv", name = "toString", descriptor = "()Ljava/lang/String;", line = 143)
    public final String toString() {
        field5415++;
        throw new IllegalStateException();
    }
}
