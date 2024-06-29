import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class317 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lem;")
    public static class206 field4358 = new class206(78, 12);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
    public static final int method1913(int arg0) {
        if (arg0 != 1) {
            method1916(-118, -112, 13);
        }
        field4355++;
        if (class54.field613 == null) {
            return class279.field3824 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[JZ[II)V")
    public static final void method1914(int arg0, long[] arg1, boolean arg2, int[] arg3, int arg4) {
        if (!arg2) {
            return;
        }
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if (((long) (var11 & var10) + var7) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var9;
            method1914(arg0, arg1, true, arg3, var6 - 1);
            method1914(var6 + 1, arg1, true, arg3, arg4);
        }
        field4356++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILrv;)Lrv;")
    public abstract class95 method1915(int arg0, class95 arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public static final void method1916(int arg0, int arg1, int arg2) {
        class321.method1928(arg2, arg0, (byte) 123);
        if (arg1 == -16042) {
            field4354++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static void method1917(int arg0) {
        field4358 = null;
        if (arg0 != 3) {
            field4358 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILr;I)V")
    public static final void method1918(int arg0, int arg1, class166 arg2, int arg3) {
        class187.field2718 = new class689[arg3][arg1];
        class610.field8463 = arg2;
        field4357++;
        if (class114.field1578 != null) {
            class405.field5678 = class531.method3019(class114.field1578[3], class114.field1578[0], class114.field1578[1], 13924, class114.field1578[2], class114.field1578[5], class114.field1578[4]);
        }
        if (arg0 >= 81) {
            class589.field8268 = new class689();
            class606.method3406((byte) 102);
        }
    }
}
