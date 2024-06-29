import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class244 {

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
    public static int[] field3406 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Loq;IIIII)V")
    public static final void method1502(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1611 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class38.field612[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class413 var11 = class74.field997[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field1611; var12++) {
                            if (arg0.field1610[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field1610[arg0.field1611++] = var11;
                        if (arg0.field1611 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field1611; var13 < 4; var13++) {
            arg0.field1610[var13] = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILil;)V")
    public static final void method1503(int arg0, class265 arg1) {
        field3407++;
        if (arg1.field3879.length - arg1.field3915 < 1) {
            return;
        }
        if (arg0 <= 102) {
            field3409 = -52;
        }
        int var2 = arg1.method1697(90);
        if (var2 < 0 || var2 > 1 || arg1.field3879.length - arg1.field3915 < 2) {
            return;
        }
        int var3 = arg1.method1685(8104);
        if (var3 * 6 != arg1.field3879.length - arg1.field3915) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3915 >= arg1.field3879.length) {
                            return;
                        }
                        var4 = arg1.method1685(8104);
                        var5 = arg1.method1666(-2);
                    } while (var4 >= class320.field4575.length);
                } while (!class87.field1215[var4]);
            } while (class57.method385(var4, 122).field911 == '1' && (var5 < -1 || var5 > 1));
            class320.field4575[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lqj;ILqj;Lnr;)V")
    public static final void method1504(class238 arg0, int arg1, class238 arg2, class437 arg3) {
        class70.field968 = class85.method527(arg2, (byte) -35, 0, class27.field483);
        field3403++;
        class318.field4547 = arg3.method2179(class70.field968, class25.method222(arg0, class27.field483, 0), true);
        class231.field3262 = class85.method527(arg2, (byte) -35, 0, class247.field3443);
        if (arg1 == -22073) {
            class311.field4456 = arg3.method2179(class231.field3262, class25.method222(arg0, class247.field3443, 0), true);
            class272.field3986 = class85.method527(arg2, (byte) -35, 0, class81.field1132);
            class232.field3275 = arg3.method2179(class272.field3986, class25.method222(arg0, class81.field1132, 0), true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method1505(byte arg0) {
        field3406 = null;
        if (arg0 >= -9) {
            method1505((byte) -42);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
    public static final void method1506(int arg0, int[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg4 <= 103) {
            return;
        }
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if ((var9 & 0x1) + var7 > arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method1506(var6 - 1, arg1, arg2, arg3, 109);
            method1506(arg0, arg1, arg2, var6 + 1, 117);
        }
        field3404++;
    }
}
