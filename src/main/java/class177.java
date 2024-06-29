import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class177 extends class251 implements class192 {

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    private int field2768 = -1;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    private int field2781 = -1;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Lbl;")
    private class442 field2780;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    private int field2782;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Loe;")
    public static class127 field2771 = new class127(27, 12);

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lbg;")
    public static class310 field2773 = new class310(17, -1);

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lft;")
    public static class4 field2772;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class413.field5993; var5++) {
            Rectangle var6 = class331.field4950[var5];
            if (var6.x + var6.width > arg1 && var6.x < (arg1 + arg3) && arg2 < (var6.y + var6.height) && var6.y < (arg0 + arg2)) {
                class400.field5832[var5] = true;
            }
        }
        field2770++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field2768, this.field2781, 36161, 0);
        field2769++;
        this.field2768 = -1;
        if (arg0 <= -104) {
            this.field2781 = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
    public final void method1112(int arg0, boolean arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field2782);
        field2774++;
        this.field2768 = arg0;
        if (arg1) {
            this.field2776 = -124;
        }
        this.field2781 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lll;")
    public static final class235 method1113(int arg0, int arg1) {
        field2764++;
        if (arg1 <= 71) {
            field2767 = -8;
        }
        if (arg0 == 0) {
            if ((double) class492.field7480 == 3.0D) {
                return class369.field5428;
            }
            if ((double) class492.field7480 == 4.0D) {
                return class222.field3426;
            }
            if ((double) class492.field7480 == 6.0D) {
                return class7.field87;
            }
            if ((double) class492.field7480 >= 8.0D) {
                return class410.field5951;
            }
        } else if (arg0 == 1) {
            if ((double) class492.field7480 == 3.0D) {
                return class7.field87;
            }
            if ((double) class492.field7480 == 4.0D) {
                return class410.field5951;
            }
            if ((double) class492.field7480 == 6.0D) {
                return class433.field6361;
            }
            if ((double) class492.field7480 >= 8.0D) {
                return class291.field4413;
            }
        } else if (arg0 == 2) {
            if ((double) class492.field7480 == 3.0D) {
                return class433.field6361;
            }
            if ((double) class492.field7480 == 4.0D) {
                return class291.field4413;
            }
            if ((double) class492.field7480 == 6.0D) {
                return class142.field2312;
            }
            if ((double) class492.field7480 >= 8.0D) {
                return class119.field1976;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1116(0);
        field2777++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public static final void method1114(int arg0, int arg1) {
        class273.field4150 = 3;
        class102.field1822 = 100;
        class462.field7107 = -1;
        if (arg0 < 126) {
            method1110(71, 42, 75, 58, 92);
        }
        class28.field358 = arg1;
        field2762++;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public static void method1115(byte arg0) {
        int var1 = -64 / ((arg0 + 37) / 58);
        field2773 = null;
        field2771 = null;
        field2772 = null;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public final void method1116(int arg0) {
        field2766++;
        if (this.field2782 > arg0) {
            this.field2780.method2631(this.field2782, this.field2763, false);
            this.field2782 = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;IZ)V")
    public static final void method1117(class40 arg0, int arg1, boolean arg2) {
        if (class215.field3333 != null) {
            try {
                class215.field3333.method1543(0L, (byte) -91);
                class215.field3333.method1534(-15020, 24, arg0.field536, arg1);
            } catch (Exception var3) {
            }
        }
        if (!arg2) {
            method1117(null, 57, false);
        }
        field2765++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbl;III)V")
    public class177(class442 arg0, int arg1, int arg2, int arg3) {
        this.field2779 = arg3;
        this.field2776 = arg1;
        this.field2780 = arg0;
        this.field2778 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class173.field2672, 0);
        this.field2782 = class173.field2672[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2782);
        OpenGL.glRenderbufferStorageEXT(36161, this.field2776, this.field2778, this.field2779);
        this.field2763 = this.field2779 * this.field2778 * this.field2780.method2583(this.field2776, 52);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbl;IIII)V")
    public class177(class442 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2780 = arg0;
        this.field2776 = arg1;
        this.field2778 = arg2;
        this.field2779 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class173.field2672, 0);
        this.field2782 = class173.field2672[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field2782);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field2776, this.field2778, this.field2779);
        this.field2763 = this.field2778 * this.field2779 * this.field2780.method2583(this.field2776, -84);
    }
}
