import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class171 {

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "[I")
    public int[] field2339;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "[[F")
    public float[][] field2335;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "[I")
    public int[] field2341;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "[I")
    public int[] field2333;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "[S")
    private static short[] field2332 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "[S")
    private static short[] field2334 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "[S")
    private static short[] field2337 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "[[S")
    public static short[][] field2331 = new short[][] { field2332, field2334, field2337 };

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lfp;")
    public static class323 field2340;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)I", line = 3)
    public static final int method1102(int arg0) {
        field2336++;
        if (arg0 != 5467) {
            method1102(-127);
        }
        return class221.field2883 == 1 ? class143.field2043 : 0;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V", line = 19)
    public static void method1103(int arg0) {
        field2331 = null;
        field2337 = null;
        field2332 = null;
        field2334 = null;
        field2340 = null;
        if (arg0 >= -95) {
            field2334 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lha;IIIIIII)V", line = 37)
    public static final void method1104(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2338++;
        class263.field3799 = arg0;
        class210.field2759 = class263.field3799.method427();
        class363.field5149 = class263.field3799.method427();
        class274.field3912 = class263.field3799.method427();
        class233.field3144 = 0;
        class584.field8213 = 0;
        class47.field555 = arg4;
        class499.field7162 = arg6;
        class587.field8277 = arg5;
        class338.field4700 = arg1;
        class643.field8815 = null;
        int var8 = 19 / ((57 - arg3) / 38);
        class221.field2883 = 1;
        class492.method2930(arg7, 0, arg2);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "([I[I[I[[F)V", line = 70)
    public class171(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field2339 = arg1;
        this.field2335 = arg3;
        this.field2341 = arg2;
        this.field2333 = arg0;
    }
}
