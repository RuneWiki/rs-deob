import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public abstract class class201 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "J")
    public static long field2992 = 0L;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "()V")
    public static final void method1413() {
        class28.method229(1, class169.field2565);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BJ)I")
    public abstract int method1289(byte arg0, long arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
    public abstract void method1286(boolean arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(JZ)I")
    public final int method1414(long arg0, boolean arg1) {
        field2991++;
        if (!arg1) {
            field2992 = -68L;
        }
        long var4 = this.method1288((byte) 81);
        if (var4 > 0L) {
            class579.method3405(var4, 10);
        }
        return this.method1289((byte) -48, arg0);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)J")
    public abstract long method1285(byte arg0);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([I[FIIIIIIII[FI[I)V")
    public static final void method1415(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11, int[] arg12) {
        field2993++;
        int var13 = arg2 * arg9 + arg11;
        int var14 = arg5 * arg6 + arg7;
        int var15 = arg9 - arg4;
        int var16 = arg6 - arg4;
        if (arg8 != 0) {
            return;
        }
        if (arg0 == null) {
            for (int var17 = 0; var17 < arg3; var17++) {
                int var18 = var13 + arg4;
                while (var13 < var18) {
                    arg1[var14++] = arg10[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else if (arg10 == null) {
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg4 + var13;
                while (var22 > var13) {
                    arg12[var14++] = arg0[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = arg4 + var13;
                while (var13 < var20) {
                    arg12[var14] = arg0[var13];
                    arg1[var14++] = arg10[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
    public static final int method1416(int arg0, int arg1) {
        if (arg0 != 127) {
            method1416(-1, 41);
        }
        field2990++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)J")
    public abstract long method1288(byte arg0);
}
