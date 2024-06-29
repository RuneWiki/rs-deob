import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class60 extends class114 implements class371 {

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    private int field864 = -1;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    private int field870 = -1;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "Lnq;")
    private class325 field859;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Lla;")
    public static class319 field863 = new class319(95, 3);

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
    public static boolean field865 = false;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)V", line = 8)
    public final void method432(boolean arg0) {
        field861++;
        if (!arg0 && this.field868 > 0) {
            this.field859.method2090(this.field868, (byte) -121, this.field860);
            this.field868 = 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() throws Throwable {
        field872++;
        this.method432(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lnq;III)V", line = 182)
    public class60(class325 arg0, int arg1, int arg2, int arg3) {
        this.field871 = arg3;
        this.field869 = arg1;
        this.field862 = arg2;
        this.field859 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class453.field6822, 0);
        this.field868 = class453.field6822[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field868);
        OpenGL.glRenderbufferStorageEXT(36161, this.field869, this.field862, this.field871);
        this.field860 = this.field871 * this.field862 * this.field859.method2077(this.field869, 34847);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lnq;IIII)V", line = 197)
    public class60(class325 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field871 = arg3;
        this.field862 = arg2;
        this.field869 = arg1;
        this.field859 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class453.field6822, 0);
        this.field868 = class453.field6822[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field868);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field869, this.field862, this.field871);
        this.field860 = this.field871 * this.field862 * this.field859.method2077(this.field869, 34847);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V", line = 48)
    public final void method433(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field868);
        field867++;
        this.field864 = arg1;
        this.field870 = arg2;
        if (arg0 > -112) {
            this.field864 = -90;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lqa;La;IIIII)V", line = 62)
    public static final void method434(class165 arg0, class444 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class141.field1892 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class533.field7842) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class475.field7051 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class452 var15 = class443.field6672[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class306.field4447[var12].method222(var13, var14) + class306.field4447[var12].method222(var13 + 1, var14) + class306.field4447[var12].method222(var13, var14 + 1) + class306.field4447[var12].method222(var13 + 1, var14 + 1)) / 4 - (class306.field4447[arg2].method222(arg3, arg4) + class306.field4447[arg2].method222(arg3 + 1, arg4) + class306.field4447[arg2].method222(arg3, arg4 + 1) + class306.field4447[arg2].method222(arg3 + 1, arg4 + 1)) / 4;
                                    class535 var17 = var15.field6812;
                                    class535 var18 = var15.field6797;
                                    if (var17 != null && var17.method176(true)) {
                                        arg1.method166(var16, var17, -44, (var13 - arg3) * class264.field3697 + (1 - arg5) * class251.field3501, (var14 - arg4) * class264.field3697 + (1 - arg6) * class251.field3501, arg0, var7);
                                    }
                                    if (var18 != null && var18.method176(true)) {
                                        arg1.method166(var16, var18, -96, (var13 - arg3) * class264.field3697 + (1 - arg5) * class251.field3501, (var14 - arg4) * class264.field3697 + (1 - arg6) * class251.field3501, arg0, var7);
                                    }
                                    for (class384 var19 = var15.field6814; var19 != null; var19 = var19.field5834) {
                                        class140 var20 = var19.field5832;
                                        if (var20 != null && var20.method176(true) && (var20.field1868 == var13 || var8 == var13) && (var20.field1863 == var14 || var10 == var14)) {
                                            int var21 = var20.field1871 + 1 - var20.field1868;
                                            int var22 = var20.field1874 + 1 - var20.field1863;
                                            arg1.method166(var16, var20, -31, (var20.field1868 - arg3) * class264.field3697 + (var21 - arg5) * class251.field3501, (var20.field1863 - arg4) * class264.field3697 + (var22 - arg6) * class251.field3501, arg0, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 154)
    public final void method2(boolean arg0) {
        field866++;
        OpenGL.glFramebufferRenderbufferEXT(this.field864, this.field870, 36161, 0);
        this.field864 = -1;
        if (arg0) {
            this.field862 = -82;
        }
        this.field870 = -1;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(Z)V", line = 169)
    public static void method435(boolean arg0) {
        field863 = null;
        if (!arg0) {
            field863 = null;
        }
    }
}
