import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class246 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lub;")
    public static class227 field4295 = class257.method1749(":trade:", 17263);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    public static int[] field4299;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1639(int arg0, int arg1, int arg2, int arg3) {
        if (class235.method1569(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class204.method1304(var4 + 1, class98.field1717[arg0][arg1][arg2] + arg3, var5 + 1) && class204.method1304(var4 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class204.method1304(var4 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class204.method1304(var4 + 1, class98.field1717[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
    public static int method1640(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JB)V")
    public static final void method1641(long arg0, byte arg1) {
        field4298++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class86.field1485; var3++) {
            if (class230.field4031[var3] == arg0) {
                class71.field1251++;
                class86.field1485--;
                for (int var4 = var3; var4 < class86.field1485; var4++) {
                    class230.field4031[var4] = class230.field4031[var4 + 1];
                    class249.field4321[var4] = class249.field4321[var4 + 1];
                }
                class152.field2645 = class77.field1356;
                class176.field2935.method664((byte) -113, 149);
                class176.field2935.method1457(arg0, 29);
                break;
            }
        }
        if (arg1 > -94) {
            field4295 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Lub;I[S)V")
    public static final void method1642(class227[] arg0, int arg1, short[] arg2) {
        class94.method578(arg0, arg0.length - 1, 0, arg2, (byte) 120);
        if (arg1 != 1) {
            method1642((class227[]) null, 32, (short[]) null);
        }
        field4297++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
    public static final void method1643(int arg0, int arg1) {
        class168.field2806.method1727(true, arg1);
        if (arg0 != 0) {
            field4299 = null;
        }
        field4300++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[IIII)V")
    public static final void method1644(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field4296++;
        if (arg4 != 1) {
            return;
        }
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        arg3--;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg3 = var13 + 1;
            arg1[arg3] = arg0;
        }
        while (arg3 < var6) {
            arg3++;
            arg1[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
    public static final void method1645(byte arg0, int arg1) {
        class98.field1712.method1727(true, arg1);
        field4294++;
        if (arg0 >= -65) {
            method1644(62, (int[]) null, -88, 122, 55);
        }
        class131.field2292.method1727(true, arg1);
        class31.field498.method1727(true, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1646(int arg0) {
        if (arg0 == -28093) {
            field4295 = null;
            field4299 = null;
        }
    }
}
