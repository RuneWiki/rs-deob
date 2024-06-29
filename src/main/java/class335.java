import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class335 extends class477 implements class387 {

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    private int field4926 = -1;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    private int field4928 = -1;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "Lpea;")
    private class641 field4929;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    private int field4932;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    private int field4938;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
    public static int[] field4931 = new int[14];

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field4936 = 0;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lsaa;")
    public static class507 field4924 = new class507("WTWIP", 3);

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field4941 = 0;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Ldi;")
    public static class98 field4940;

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2143((byte) 81);
        field4927++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method2137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (!arg6) {
            field4940 = null;
        }
        field4935++;
        if (class42.method251(arg1, 0)) {
            if (class421.field5864[arg1] == null) {
                class465.method2633(arg8, arg2, arg7, class328.field4799[arg1], -126, -1, arg5, arg4, arg3, arg0);
            } else {
                class465.method2633(arg8, arg2, arg7, class421.field5864[arg1], -125, -1, arg5, arg4, arg3, arg0);
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class200.field2630[var9] = true;
            }
        } else {
            class200.field2630[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
    public static final int method2138(int arg0, int arg1) {
        if (arg1 != 36161) {
            field4924 = null;
        }
        field4921++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public static void method2139(int arg0) {
        field4924 = null;
        field4940 = null;
        if (arg0 != 36161) {
            method2138(-17, -120);
        }
        field4931 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final void method2140(int arg0, int arg1, int arg2) {
        field4937++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field4938);
        this.field4928 = arg1;
        if (arg0 != 2) {
            this.field4928 = 95;
        }
        this.field4926 = arg2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -257) {
            field4940 = null;
        }
        field4933++;
        int var8 = class191.method1226(arg4, class609.field8313, class19.field169, arg6 + 273);
        int var9 = class191.method1226(arg1, class609.field8313, class19.field169, 16);
        int var10 = class191.method1226(arg3, class398.field5676, class298.field3995, arg6 + 273);
        int var11 = class191.method1226(arg2, class398.field5676, class298.field3995, arg6 + 273);
        int var12 = class191.method1226(arg4 + arg7, class609.field8313, class19.field169, 16);
        int var13 = class191.method1226(arg1 - arg7, class609.field8313, class19.field169, arg6 + 273);
        for (int var14 = var8; var14 < var12; var14++) {
            class653.method3620(var11, var10, false, arg5, class319.field4673[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class653.method3620(var11, var10, false, arg5, class319.field4673[var15]);
        }
        int var16 = class191.method1226(arg3 + arg7, class398.field5676, class298.field3995, 16);
        int var17 = class191.method1226(arg2 - arg7, class398.field5676, class298.field3995, 16);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class319.field4673[var18];
            class653.method3620(var16, var10, false, arg5, var19);
            class653.method3620(var17, var16, false, arg0, var19);
            class653.method3620(var11, var17, false, arg5, var19);
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public static final void method2142(int arg0) {
        if (arg0 < 69) {
            return;
        }
        for (int var1 = 0; var1 < class306.field4106; var1++) {
            int var2 = class690.field9742[var1];
            class637 var3 = (class637) class77.field955.method2506(104, (long) var2);
            if (var3 != null) {
                class676 var4 = var3.field8702;
                class531.method3014(var4.field9594.field2591, -28385, var4);
            }
        }
        field4930++;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public final void method2143(byte arg0) {
        int var2 = 41 % ((arg0 + 46) / 63);
        if (this.field4938 > 0) {
            this.field4929.method3491(this.field4922, this.field4938, false);
            this.field4938 = 0;
        }
        field4934++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method545(int arg0) {
        field4923++;
        OpenGL.glFramebufferRenderbufferEXT(this.field4928, this.field4926, 36161, 0);
        this.field4928 = -1;
        this.field4926 = -1;
        int var2 = 84 / ((arg0 + 59) / 52);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpea;III)V")
    public class335(class641 arg0, int arg1, int arg2, int arg3) {
        this.field4939 = arg2;
        this.field4929 = arg0;
        this.field4932 = arg1;
        this.field4925 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class676.field9589, 0);
        this.field4938 = class676.field9589[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4938);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4932, this.field4939, this.field4925);
        this.field4922 = this.field4939 * this.field4925 * this.field4929.method3555(7745, this.field4932);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpea;IIII)V")
    public class335(class641 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4932 = arg1;
        this.field4939 = arg2;
        this.field4925 = arg3;
        this.field4929 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class676.field9589, 0);
        this.field4938 = class676.field9589[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4938);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4932, this.field4939, this.field4925);
        this.field4922 = this.field4939 * this.field4925 * this.field4929.method3555(7745, this.field4932);
    }
}
