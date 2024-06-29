import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class548 implements class409 {

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public int field7961;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public int field7957;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Lcga;")
    public class141 field7955;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Leda;")
    public class14 field7959;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public int field7956;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "[J")
    public static long[] field7952 = new long[32];

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field7953 = -1;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "Lae;")
    public static class351 field7963 = new class351();

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "Lla;")
    public static class423 field7958;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[IBIIIII)V")
    public static final void method3296(int arg0, int[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7960++;
        if (arg5 > 0 && !class211.method1496(0, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class211.method1496(0, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var8 = 0;
            int var9 = arg6 > arg5 ? arg5 : arg6;
            int var10 = -9 / ((22 - arg2) / 39);
            int var11 = arg5 >> 1;
            int var12 = arg6 >> 1;
            int[] var13 = arg1;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg3, arg5, arg6, 0, arg4, arg0, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg5 + var16;
                for (int var18 = 0; var18 < var12; var18++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = (var21 & 0xFFD651) >> 16;
                        int var25 = var21 >> 24 & 0xFF;
                        int var26 = (var21 & 0xFF3D) >> 8;
                        int var27 = var21 & 0xFF;
                        int var28 = var13[var17++];
                        int var29 = (var22 & 0xFF) + var27;
                        int var30 = (var22 >> 16 & 0xFF) + var24;
                        int var31 = ((var22 & 0xFFDE) >> 8) + var26;
                        int var32 = (var22 >> 24 & 0xFF) + var25;
                        int var33 = (var23 >> 24 & 0xFF) + var32;
                        int var34 = ((var23 & 0xFFE20D) >> 16) + var30;
                        int var35 = (var23 & 0xFF) + var29;
                        int var36 = ((var23 & 0xFFC3) >> 8) + var31;
                        int var37 = (var28 & 0xFF) + var35;
                        int var38 = (var28 >> 24 & 0xFF) + var33;
                        int var39 = ((var28 & 0xFFEB94) >> 16) + var34;
                        int var40 = (var28 >> 8 & 0xFF) + var36;
                        var14[var15++] = class430.method2658(class368.method2314(255, var37 >> 2), class430.method2658(class368.method2314(65280, var40 << 6), class430.method2658(class368.method2314(var38, 1020) << 22, class368.method2314(1020, var39) << 14)));
                    }
                    var17 += arg5;
                    var16 += arg5;
                }
                int[] var19 = var14;
                var14 = var13;
                arg5 = var11;
                var13 = var19;
                arg6 = var12;
                var12 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Lhr;")
    public class57 method478(int arg0) {
        field7954++;
        return arg0 < 30 ? null : class153.field2228;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    public static void method3297(int arg0) {
        field7958 = null;
        field7963 = null;
        field7952 = null;
        if (arg0 != 12477) {
            method3297(-127);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7962++;
        if (class416.method2507(arg6, -2113733296)) {
            int var10 = 0;
            int var11 = 0;
            if (arg8 != -864930360) {
                method3298(123, -97, -13, 62, 1, -29, -34, 119, 41);
            }
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class416.field5919) {
                var12 = class713.field10043;
                var14 = class188.field2634;
                var11 = class603.field8551;
                var10 = class562.field8141;
                var13 = class4.field26;
                class188.field2634 = 1;
            }
            if (class313.field4239[arg6] == null) {
                class530.method3212(arg3, arg7, arg1, arg0 < 0, class600.field8524[arg6], arg4, arg5, 20028, arg2, arg0, -1);
            } else {
                class530.method3212(arg3, arg7, arg1, arg0 < 0, class313.field4239[arg6], arg4, arg5, 20028, arg2, arg0, -1);
            }
            if (class416.field5919) {
                if (arg0 >= 0 && class188.field2634 == 2) {
                    class545.method3277(class562.field8141, class603.field8551, class713.field10043, arg8 ^ 0x338DCA6E, class4.field26);
                }
                class4.field26 = var13;
                class188.field2634 = var14;
                class603.field8551 = var11;
                class713.field10043 = var12;
                class562.field8141 = var10;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class108.field1545[var9] = true;
            }
        } else {
            class108.field1545[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ILeda;Lcga;II)V")
    public class548(int arg0, class14 arg1, class141 arg2, int arg3, int arg4) {
        this.field7961 = arg3;
        this.field7957 = arg0;
        this.field7955 = arg2;
        this.field7959 = arg1;
        this.field7956 = arg4;
    }
}
