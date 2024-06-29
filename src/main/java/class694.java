import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class694 extends class219 implements class670 {

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
    private int field9809 = -1;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
    private int field9820 = -1;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "Lkv;")
    private class280 field9806;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public int field9818;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
    public int field9810;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    private int field9817;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
    private int field9805;

    @OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
    private int field9815;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "[I")
    public static int[] field9819 = new int[1];

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "Lsfa;")
    public static class723 field9812;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method3911(int arg0, int arg1, int arg2) {
        field9811++;
        if (arg0 != -27935) {
            method3911(125, -18, -121);
        }
        return class333.method2154((byte) -62, arg1, arg2) | (arg1 & 0x800) != 0 || class777.method4273(arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V", line = 16)
    public final void method3912(int arg0) {
        if (this.field9805 > 0) {
            this.field9806.method1852(this.field9815, this.field9805, 32885);
            this.field9805 = 0;
        }
        field9813++;
        if (arg0 > -49) {
            method3917(121);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILwq;IZ)V", line = 33)
    public static final void method3913(int arg0, class176 arg1, int arg2, boolean arg3) {
        class723.field10144 = arg2;
        class366.field5281 = arg1;
        field9816++;
        class441.field6298 = arg0;
        if (!arg3) {
            field9819 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V", line = 48)
    public static void method3914(int arg0) {
        field9819 = null;
        field9812 = null;
        if (arg0 != -1967) {
            method3913(-38, null, 47, true);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V", line = 61)
    public final void method1255(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field9809, this.field9820, 36161, 0);
        field9814++;
        this.field9809 = -1;
        this.field9820 = -1;
        int var2 = 14 % ((-arg0 - 34) / 63);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lkv;III)V", line = 190)
    public class694(class280 arg0, int arg1, int arg2, int arg3) {
        this.field9806 = arg0;
        this.field9818 = arg2;
        this.field9810 = arg3;
        this.field9817 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class554.field7892, 0);
        this.field9805 = class554.field7892[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9805);
        OpenGL.glRenderbufferStorageEXT(36161, this.field9817, this.field9818, this.field9810);
        this.field9815 = this.field9818 * this.field9810 * this.field9806.method1843((byte) 91, this.field9817);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lkv;IIII)V", line = 208)
    public class694(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9818 = arg2;
        this.field9806 = arg0;
        this.field9810 = arg3;
        this.field9817 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class554.field7892, 0);
        this.field9805 = class554.field7892[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9805);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field9817, this.field9818, this.field9810);
        this.field9815 = this.field9818 * this.field9810 * this.field9806.method1843((byte) 91, this.field9817);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZB)Z", line = 79)
    public static final boolean method3915(boolean arg0, byte arg1) {
        field9807++;
        boolean var2 = class638.field8979.method448();
        int var3 = 79 % ((arg1 + 18) / 37);
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class638.field8979.method397();
        } else if (!class638.field8979.method454()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class145.field1852.method3632(class145.field1852.field8981, true, arg0 ? 1 : 0);
            class781.method4285(3);
            return true;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIB)V", line = 119)
    public final void method3916(int arg0, int arg1, byte arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field9805);
        field9821++;
        this.field9809 = arg0;
        if (arg2 >= -1) {
            this.method3916(-51, 92, (byte) 13);
        }
        this.field9820 = arg1;
    }

    @OriginalMember(owner = "client!gba", name = "finalize", descriptor = "()V", line = 134)
    protected final void finalize() throws Throwable {
        this.method3912(-128);
        field9808++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "(I)V", line = 147)
    public static final void method3917(int arg0) {
        field9822++;
        if (arg0 != 0) {
            field9819 = null;
        }
        if (!class640.field9022) {
            return;
        }
        while (true) {
            while (class194.field2859.length > class450.field6466) {
                class162 var1 = class194.field2859[class450.field6466];
                if (var1 != null && var1.field2382 == -1) {
                    if (class518.field7401 == null) {
                        class518.field7401 = class188.field2817.method4128(var1.field2387, arg0 ^ 0xFFFFFF9D);
                    }
                    int var2 = class518.field7401.field4738;
                    if (var2 == -1) {
                        return;
                    }
                    class450.field6466++;
                    var1.field2382 = var2;
                    class518.field7401 = null;
                } else {
                    class450.field6466++;
                }
            }
            return;
        }
    }
}
