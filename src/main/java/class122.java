import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class122 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field1389 = new int[14];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lwo;")
    public static class285 field1386;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 45) {
            field1386 = null;
        }
        field1385++;
        if (arg2 > arg3) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class228.field2877[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class228.field2877[var6][arg4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[II)V")
    public static final void method803(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 < 64) {
            field1386 = null;
        }
        field1390++;
        if (arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var7 + (var9 & 0x1) > arg3[var9]) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method803(arg0, var6 - 1, arg2, arg3, 67);
        method803(var6 + 1, arg1, arg2, arg3, 108);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field1386 = null;
        if (arg0 < -121) {
            field1389 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjj;)Ljj;")
    public abstract class41 method805(int arg0, class41 arg1);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method806(int arg0, int arg1) {
        if (arg0 != 1) {
            field1389 = null;
        }
        class276.field3570.method2286(arg1, (byte) 36);
        field1387++;
    }
}
