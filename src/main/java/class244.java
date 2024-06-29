import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class244 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Z")
    public static boolean field3325 = true;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    public static boolean field3326 = false;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lam;")
    public static class286 field3322;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Lok;")
    public static class60 field3321;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Z", line = 12)
    public static final boolean method1307(int arg0) {
        if (arg0 > -46) {
            field3323 = 23;
        }
        field3327++;
        return field3323 > 0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([I[IIII)V", line = 32)
    public static final void method1308(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method1308(arg0, arg1, arg2, var6 - 1, 1);
            method1308(arg0, arg1, var6 + 1, arg3, 1);
        }
        field3324++;
        if (arg4 != 1) {
            field3320 = -55;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIILsn;Lsn;)V", line = 98)
    public static final void method1309(int arg0, int arg1, int arg2, class449 arg3, class449 arg4) {
        if (class176.field2209[arg0][arg1][arg2] == null) {
            class307.method1807(arg0, arg1, arg2);
        }
        class176.field2209[arg0][arg1][arg2].field1128 = arg3;
        class176.field2209[arg0][arg1][arg2].field1136 = arg4;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V", line = 106)
    public static void method1310(boolean arg0) {
        if (arg0) {
            method1309(-76, -54, -120, (class449) null, (class449) null);
        }
        field3321 = null;
        field3322 = null;
    }
}
