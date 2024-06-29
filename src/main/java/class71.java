import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class class71 {

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Loj;")
    public static class211 field996 = class204.method1362(-115);

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "Lrq;")
    public static class482 field998 = new class482();

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "[I")
    public static int[] field993;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method449(int arg0, int arg1, boolean arg2) {
        field994++;
        if (arg2) {
            method453((byte) 121);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 16)
    public static final void method450(byte arg0) {
        field997++;
        class498.method2983(-13464);
        int var1 = -55 % ((24 - arg0) / 44);
        class264.field3595 = false;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLkp;)Ljava/lang/String;", line = 29)
    public static final String method451(byte arg0, class480 arg1) {
        field995++;
        return arg0 == -17 ? arg1.field6518 + " <col=ffffff>>" : null;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V", line = 48)
    public static void method453(byte arg0) {
        field998 = null;
        field993 = null;
        int var1 = -119 / ((52 - arg0) / 57);
        field996 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BFFFIIFII[FI)V")
    public abstract void method452(byte arg0, float arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10);
}
