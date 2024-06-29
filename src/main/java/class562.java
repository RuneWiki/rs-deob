import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class562 extends class418 {

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field7790 = -1;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    private int field7793 = -1;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public int field7788;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public int field7783;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public int field7789;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Lcba;")
    public static class471 field7786 = new class471(30, -2);

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
    public static final void method3204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7791;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg0 * arg0;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        if (arg3 == 0) {
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg4 << 1) + -3) * var11;
            int var19 = (var6 + 1) * var16;
            class266.method1742(26844, class182.field2580[arg2], arg0 + arg1, arg5, -arg0 + arg1);
            int var20 = (arg4 - 1) * var15;
            while (var7 > 0) {
                if (var13 < 0) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        ++var6;
                        var19 += var16;
                        var17 += var16;
                    }
                }
                if (var14 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
                var13 += -var20;
                var14 += -var18;
                --var7;
                var18 -= var15;
                var20 -= var15;
                int var21 = -var7 + arg2;
                int var22 = arg2 + var7;
                int var23 = arg1 - -var6;
                int var24 = -var6 + arg1;
                class266.method1742(arg3 + 26844, class182.field2580[var21], var23, arg5, var24);
                class266.method1742(26844, class182.field2580[var22], var23, arg5, var24);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lgi;IIII)V")
    public class562(class583 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7788 = arg4;
        this.field7783 = arg3;
        this.field7789 = arg2;
        super.field5883.method3358(32886, this);
        OpenGL.glTexImage3Dub(super.field5882, 0, super.field5889, this.field7789, this.field7783, this.field7788, 0, class92.method678(-24501, super.field5889), 5121, (byte[]) null, 0);
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
    public static final int method3205(int arg0, byte arg1) {
        ++field7785;
        if (~arg0 > -97) {
            return 0;
        } else {
            if (arg1 < 112) {
                field7786 = null;
            }
            return ~arg0 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
    public static final void method3206(int arg0, boolean arg1) {
        ++field7792;
        if (class500.field6966 != arg0) {
            class32.field513 = class611.field8786 = class32.field518[arg0];
            class75.method582(50);
            class104.field1573 = new int[4][class32.field513 >> 3][class611.field8786 >> 3];
            class264.field3691 = new int[class32.field513][class611.field8786];
            class280.field3890 = new int[class32.field513][class611.field8786];
            for (int var2 = 0; var2 < 4; ++var2) {
                class428.field6075[var2] = class80.method621(class611.field8786, class32.field513, !arg1);
            }
            if (!arg1) {
                method3205(63, (byte) 90);
            }
            class485.field6824 = new byte[4][class32.field513][class611.field8786];
            class187.method1162(class611.field8786, 4, 0, class32.field513);
            class342.method2074(class69.field1165, class611.field8786 >> 3, (byte) 21, class32.field513 >> 3);
            class500.field6966 = arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public final void method1220(byte arg0) {
        ++field7784;
        OpenGL.glFramebufferTexture3DEXT(this.field7793, this.field7790, super.field5882, 0, 0, 0);
        this.field7793 = -1;
        this.field7790 = -1;
        if (arg0 != 73) {
            method3209((byte) -54);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= class326.field4387 && arg2 <= class596.field8621 && arg4 >= class264.field3687 && class591.field8435 >= arg0) {
            class524.method3024(arg3, arg6, arg4, arg7, arg5, 97, arg0, arg2);
        } else {
            class251.method1565((byte) -112, arg6, arg3, arg0, arg7, arg4, arg5, arg2);
        }
        ++field7787;
        if (arg1 <= 41) {
            field7786 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZIII)V")
    public final void method3208(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        super.field5883.method3358(32886, this);
        ++field7782;
        OpenGL.glCopyTexSubImage3D(super.field5882, 0, arg0, arg3, arg1, arg2, arg6, arg7, arg5);
        OpenGL.glFlush();
        if (!arg4) {
            this.method3208(70, -102, -118, 29, false, 108, 123, -20);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lgi;IIII[BI)V")
    public class562(class583 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7789 = arg2;
        this.field7788 = arg4;
        this.field7783 = arg3;
        super.field5883.method3358(32886, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5882, 0, super.field5889, this.field7789, this.field7783, this.field7788, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2513(false, true);
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
    public static void method3209(byte arg0) {
        field7786 = null;
        if (arg0 < 42) {
            field7786 = null;
        }
    }
}
