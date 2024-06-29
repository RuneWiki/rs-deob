import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class296 extends class472 implements class513 {

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    private int field4555 = -1;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    private int field4557 = -1;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "Ltt;")
    private class249 field4550;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    private int field4554;

    @OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    private int field4560;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    private int field4559;

    @OriginalMember(owner = "client!dr", name = "N", descriptor = "Ljp;")
    public static class55 field4562 = new class55(74, -1);

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!dr", name = "O", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!dr", name = "Q", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(BI)V")
    public static final void method1969(byte arg0, int arg1) {
        field4565++;
        if (class164.field2484 == arg1) {
            return;
        }
        class338.field5076 = class250.field4077 = class495.field7223[arg1];
        class129.method944(0);
        class349.field5201 = new int[4][class338.field5076 >> 3][class250.field4077 >> 3];
        class118.field1823 = new int[class338.field5076][class250.field4077];
        class456.field6783 = new int[class338.field5076][class250.field4077];
        for (int var2 = 0; var2 < 4; var2++) {
            class463.field6857[var2] = class141.method1019(class338.field5076, (byte) -127, class250.field4077);
        }
        class107.field1627 = new byte[4][class338.field5076][class250.field4077];
        class407.method2560(4, false, class338.field5076, class250.field4077);
        class114.method873((byte) 96, class338.field5076 >> 3, class376.field5542, class250.field4077 >> 3);
        if (arg0 < 16) {
            method1972(true, null);
        }
        class164.field2484 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method192(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field4557, this.field4555, 36161, 0);
        int var2 = -27 % ((arg0 + 44) / 56);
        field4556++;
        this.field4555 = -1;
        this.field4557 = -1;
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)V")
    public final void method1970(int arg0) {
        if (this.field4560 > 0) {
            this.field4550.method1717(this.field4560, this.field4559, (byte) -70);
            this.field4560 = 0;
        }
        if (arg0 != -17889) {
            this.method1970(1);
        }
        field4563++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public static void method1971(boolean arg0) {
        if (arg0) {
            field4562 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1970(-17889);
        field4553++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLum;)V")
    public static final void method1972(boolean arg0, class83 arg1) {
        field4558++;
        class186.field2862 = arg1;
        if (!arg0) {
            field4562 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
    public static final int method1973(int arg0, int arg1) {
        field4549++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 > -53) {
            return -26;
        } else {
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(DB)V")
    public static final void method1974(double arg0, byte arg1) {
        field4551++;
        if (class112.field1667 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class346.field5153[var3] = var4 > 255 ? 255 : var4;
            }
            class112.field1667 = arg0;
        }
        if (arg1 != 90) {
            field4562 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)V")
    public final void method1975(byte arg0, int arg1, int arg2) {
        field4561++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field4560);
        int var4 = -54 / ((4 - arg0) / 48);
        this.field4557 = arg1;
        this.field4555 = arg2;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ltt;III)V")
    public class296(class249 arg0, int arg1, int arg2, int arg3) {
        this.field4550 = arg0;
        this.field4552 = arg3;
        this.field4554 = arg1;
        this.field4564 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class225.field3427, 0);
        this.field4560 = class225.field3427[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4560);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4554, this.field4564, this.field4552);
        this.field4559 = this.field4564 * this.field4552 * this.field4550.method1744(this.field4554, (byte) -27);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ltt;IIII)V")
    public class296(class249 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4552 = arg3;
        this.field4564 = arg2;
        this.field4554 = arg1;
        this.field4550 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class225.field3427, 0);
        this.field4560 = class225.field3427[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4560);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4554, this.field4564, this.field4552);
        this.field4559 = this.field4564 * this.field4552 * this.field4550.method1744(this.field4554, (byte) -27);
    }
}
