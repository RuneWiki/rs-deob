import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class579 extends class623 implements class686 {

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    private int field8057 = -1;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    private int field8059 = -1;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public int field8060;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    private int field8055;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Leq;")
    private class357 field8056;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public int field8052;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    private int field8061;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    private int field8053;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        if (!arg0) {
            method3233(-26, -29, 39, 66, null, null, null, null, null, null, -118, (byte) 104, 95, -126, true, false, -128, 24, false);
        }
        field8050++;
        OpenGL.glFramebufferRenderbufferEXT(this.field8057, this.field8059, 36161, 0);
        this.field8059 = -1;
        this.field8057 = -1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public final void method3232(boolean arg0) {
        field8058++;
        if (this.field8061 > 0) {
            this.field8056.method2127(this.field8061, this.field8053, -120);
            this.field8061 = 0;
        }
        if (!arg0) {
            this.field8056 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method3233(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class379.field5297 = true;
        class659.field9052 = class618.field8660.method115() > 0;
        class742.field10373 = arg15;
        class337.field4349 = arg1 >> class455.field6383;
        class561.field7852 = arg3 >> class455.field6383;
        class88.field1121 = arg1;
        class590.field8229 = arg3;
        class508.field7180 = arg2;
        class487.field6934 = class337.field4349 - class267.field3381;
        if (class487.field6934 < 0) {
            class172.field2260 = -class487.field6934;
            class487.field6934 = 0;
        } else {
            class172.field2260 = 0;
        }
        class689.field9801 = class561.field7852 - class267.field3381;
        if (class689.field9801 < 0) {
            class452.field6333 = -class689.field9801;
            class689.field9801 = 0;
        } else {
            class452.field6333 = 0;
        }
        class33.field512 = class337.field4349 + class267.field3381;
        if (class33.field512 > class90.field1142) {
            class33.field512 = class90.field1142;
        }
        class211.field2700 = class561.field7852 + class267.field3381;
        if (class211.field2700 > class665.field9107) {
            class211.field2700 = class665.field9107;
        }
        boolean[][] var19 = class376.field5266;
        boolean[][] var20 = class160.field2047;
        if (class742.field10373) {
            for (int var21 = 0; var21 < class267.field3381 + class267.field3381 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class267.field3381 + class267.field3381 + 2; var24++) {
                    if (var24 > 1) {
                        class582.field8081[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class337.field4349 + var21 - class267.field3381;
                    int var26 = class561.field7852 + var24 - class267.field3381;
                    if (var25 >= 0 && var26 >= 0 && var25 < class90.field1142 && var26 < class665.field9107) {
                        int var27 = var25 << class455.field6383;
                        int var28 = var26 << class455.field6383;
                        int var29 = class716.field10106[class716.field10106.length - 1].method2381(-107, var25, var26) - (0x3E8 << class455.field6383 - 7);
                        int var30 = class109.field1341 == null ? class716.field10106[0].method2381(-94, var25, var26) + class431.field6109 : class109.field1341[0].method2381(-100, var25, var26) + class431.field6109;
                        var23 = arg16 >= 0 ? class618.field8660.method180(var27, var29, var28, var27, var30, var28, arg16) : class618.field8660.method168(var27, var29, var28, var27, var30, var28);
                        class160.field2047[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class160.field2047[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class582.field8081[var24 - 1] & class582.field8081[var24] & var22 & var23;
                        class376.field5266[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class582.field8081[class267.field3381 + class267.field3381] = var22;
                class582.field8081[class267.field3381 + class267.field3381 + 1] = var23;
            }
            if (arg16 >= 0) {
                class379.field5297 = false;
            } else {
                class335.field4305 = arg5;
                class86.field1098 = arg6;
                class340.field4398 = arg7;
                class140.field1674 = arg8;
                class65.field871 = arg9;
                class499.method2894(class618.field8660, arg10, (byte) -114);
            }
        } else {
            if (class635.field8798 == null) {
                class635.field8798 = new boolean[class90.field1142 + class90.field1142 + 1][class90.field1142 + class665.field9107 + 1];
            }
            for (int var32 = 0; var32 < class635.field8798.length; var32++) {
                for (int var42 = 0; var42 < class635.field8798[0].length; var42++) {
                    class635.field8798[var32][var42] = true;
                }
            }
            class160.field2047 = class635.field8798;
            class376.field5266 = class635.field8798;
            class487.field6934 = 0;
            class689.field9801 = 0;
            class33.field512 = class90.field1142;
            class211.field2700 = class665.field9107;
            class379.field5297 = false;
        }
        class714.method3959(class618.field8660, 34037);
        if (!class469.field6740.field8628) {
            class314 var33 = class469.field6740.field8623;
            for (class607 var34 = (class607) var33.method1839(64); var34 != null; var34 = (class607) var33.method1836((byte) -26)) {
                var34.method3869(true);
                class87.method610(var34, 0);
            }
        }
        if (class659.field9052) {
            for (int var35 = 0; var35 < class150.field1824; var35++) {
                class708.field9968[var35].method3378(arg0, 2, arg14);
            }
        }
        if (class6.field68) {
            class741.field10371 = class618.field8660.method71();
            class618.field8660.method76(class485.field6888);
            int var36 = (class485.field6888[2] - class485.field6888[0]) / class86.field1097;
            for (int var37 = 0; var37 < class86.field1097 - 1; var37++) {
                class529.field7463[var37] = (var37 + 1) * var36 + class237.field3063[var37];
            }
            for (int var38 = 0; var38 < class573.field7997.length; var38++) {
                class573.field7997[var38].method2446();
            }
        }
        if (class618.field8658 != null) {
            if (class6.field68) {
                class745.method4166(0);
            }
            class611.method3342(true);
            class618.field8660.method104(-1, 1583160, 40, 127);
            class447.method2640(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class6.field68) {
                class228.method1459();
            }
            class618.field8660.method179();
            class611.method3342(false);
        }
        class447.method2640(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class6.field68) {
            for (int var39 = 0; var39 < class126.field1511; var39++) {
                class49.field722[var39] = class228.field2986[var39];
            }
            class745.method4166(0);
            for (int var40 = 0; var40 < class573.field7997.length; var40++) {
                class573.field7997[var40].method2446();
            }
        }
        if (class6.field68) {
            class228.method1459();
            for (int var41 = 0; var41 < class126.field1511; var41++) {
                class228.field2986[var41] = class49.field722[var41];
            }
            if (class303.field3891 == 2) {
                int var10002;
                if (class288.field3664[0] < class288.field3664[1]) {
                    if (class529.field7463[0] + class237.field3063[0] > class485.field6888[0]) {
                        var10002 = class237.field3063[0]++;
                    }
                } else if (class288.field3664[0] > class288.field3664[1] && class529.field7463[0] + class237.field3063[0] < class485.field6888[2]) {
                    var10002 = class237.field3063[0]--;
                }
            }
        }
        if (!class742.field10373) {
            class376.field5266 = var19;
            class160.field2047 = var20;
        }
        class300.method1770();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public final void method3234(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, arg0, this.field8061);
        field8051++;
        this.field8057 = arg2;
        this.field8059 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8049++;
        this.method3232(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Leq;III)V")
    public class579(class357 arg0, int arg1, int arg2, int arg3) {
        this.field8060 = arg3;
        this.field8055 = arg1;
        this.field8056 = arg0;
        this.field8052 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class530.field7472, 0);
        this.field8061 = class530.field7472[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8061);
        OpenGL.glRenderbufferStorageEXT(36161, this.field8055, this.field8052, this.field8060);
        this.field8053 = this.field8052 * this.field8060 * this.field8056.method2179(this.field8055, (byte) -61);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Leq;IIII)V")
    public class579(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8055 = arg1;
        this.field8056 = arg0;
        this.field8052 = arg2;
        this.field8060 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class530.field7472, 0);
        this.field8061 = class530.field7472[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8061);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field8055, this.field8052, this.field8060);
        this.field8053 = this.field8060 * this.field8052 * this.field8056.method2179(this.field8055, (byte) 109);
    }
}
