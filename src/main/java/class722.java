import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class722 {

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public int field10122;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "Z")
    public static boolean field10120 = false;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "Ldr;")
    public static class718 field10125;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "Lhda;")
    public static class747 field10123;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([I[JI)V", line = 4)
    public static final void method4024(int[] arg0, long[] arg1, int arg2) {
        class392.method2414(arg1, (byte) -59, arg2, arg1.length - 1, arg0);
        field10124++;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[BI[BIBIII)V", line = 18)
    public static final void method4025(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 >= -110) {
            field10125 = null;
        }
        field10126++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg3[var10001] += arg1[arg2++];
                int var14 = arg7++;
                arg3[var14] += arg1[arg2++];
                int var15 = arg7++;
                arg3[var15] += arg1[arg2++];
                int var16 = arg7++;
                arg3[var16] += arg1[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg3[var10001] += arg1[arg2++];
            }
            arg7 += arg6;
            arg2 += arg0;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V", line = 63)
    public static void method4026(int arg0) {
        field10123 = null;
        field10125 = null;
        int var1 = 48 % ((arg0 - 10) / 45);
    }

    @OriginalMember(owner = "client!pea", name = "toString", descriptor = "()Ljava/lang/String;", line = 76)
    public final String toString() {
        field10121++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(I)V", line = 84)
    public class722(int arg0) {
        this.field10122 = arg0;
    }
}
