import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class219 {

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public int field3084 = -1;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[[Z")
    public static boolean[][] field3072 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3078 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "F")
    public static float field3073;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 32)
    public static void method1505(boolean arg0) {
        if (arg0) {
            method1506(false, (class175) null, (class175) null, (class175) null, (class175) null);
        }
        field3072 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLlc;Llc;Llc;Llc;)V", line = 42)
    public static final void method1506(boolean arg0, class175 arg1, class175 arg2, class175 arg3, class175 arg4) {
        class149.field2065 = arg2;
        class261.field3950 = arg3;
        class253.field3851 = arg4;
        class285.field4490 = arg1;
        class175.field2535 = new class263[class285.field4490.method1183(8321)][];
        field3087++;
        class328.field5016 = new boolean[class285.field4490.method1183(8321)];
        if (!arg0) {
            method1505(false);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ[I[Ljava/lang/Object;)V", line = 58)
    public static final void method1507(int arg0, int arg1, boolean arg2, int[] arg3, Object[] arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (((var9 & 0x1) + var7) > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method1507(arg0, var6 - 1, arg2, arg3, arg4);
            method1507(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (!arg2) {
            field3085++;
        }
    }
}
