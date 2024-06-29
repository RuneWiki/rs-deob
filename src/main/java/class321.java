import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class321 extends class583 implements class264 {

    @OriginalMember(owner = "client!nha", name = "D", descriptor = "I")
    private int field4443 = -1;

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "I")
    private int field4439 = -1;

    @OriginalMember(owner = "client!nha", name = "F", descriptor = "Leea;")
    private class131 field4445;

    @OriginalMember(owner = "client!nha", name = "C", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!nha", name = "B", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!nha", name = "A", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!nha", name = "y", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!nha", name = "x", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!nha", name = "E", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "[Lkba;")
    public static class105[] field4433;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IBI)V")
    public final void method2068(int arg0, byte arg1, int arg2) {
        if (arg1 <= 123) {
            this.field4431 = -32;
        }
        field4437++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field4441);
        this.field4443 = arg2;
        this.field4439 = arg0;
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(B)V")
    public static void method2069(byte arg0) {
        field4433 = null;
        if (arg0 <= 39) {
            method2070(-64, -107, 47, -104, -33, 50);
        }
    }

    @OriginalMember(owner = "client!nha", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4444++;
        this.method2071((byte) 108);
        super.finalize();
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public final void method1299(int arg0) {
        if (arg0 > -38) {
            this.method2071((byte) -40);
        }
        field4432++;
        OpenGL.glFramebufferRenderbufferEXT(this.field4439, this.field4443, 36161, 0);
        this.field4439 = -1;
        this.field4443 = -1;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIII)I")
    public static final int method2070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4434++;
        if (class459.field6474 == null) {
            return 0;
        }
        if (arg1 != 18016) {
            method2070(83, 50, 74, 76, -8, 60);
        }
        if (arg0 < 3) {
            int var6 = arg4 >> 9;
            int var7 = arg5 >> 9;
            if (arg3 < 0 || arg2 < 0 || arg3 > class336.field4683 - 1 || (class700.field9768 - 1) < arg2) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class336.field4683 - 1) < var6 || (class700.field9768 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class651.field8948[1][arg4 >> 9][arg5 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var9 = (class651.field8948[1][var6 - 1][arg5 >> 9] & 0x2) != 0;
                boolean var10 = (class651.field8948[1][var6][arg5 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class651.field8948[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x1FF) == 0) {
                boolean var11 = (class651.field8948[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class651.field8948[1][arg4 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class651.field8948[1][arg3][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class459.field6474[arg0].method1815(arg5, arg4, arg1 - 18016);
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;III)V")
    public class321(class131 arg0, int arg1, int arg2, int arg3) {
        this.field4445 = arg0;
        this.field4442 = arg3;
        this.field4435 = arg2;
        this.field4431 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class129.field1541, 0);
        this.field4441 = class129.field1541[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4441);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4431, this.field4435, this.field4442);
        this.field4440 = this.field4442 * this.field4435 * this.field4445.method880(-22330, this.field4431);
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "(B)V")
    public final void method2071(byte arg0) {
        if (this.field4441 > 0) {
            this.field4445.method896(this.field4440, (byte) -53, this.field4441);
            this.field4441 = 0;
        }
        field4430++;
        int var2 = 108 % ((arg0 - 32) / 49);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4436++;
        class299.field4209 = arg1;
        class443.field6306 = arg3;
        class9.field134 = arg5;
        int var7 = 49 / ((53 - arg6) / 49);
        class368.field5208 = arg0;
        class157.field2188 = arg4;
        class534.field7516 = arg2;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Leea;IIII)V")
    public class321(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4445 = arg0;
        this.field4435 = arg2;
        this.field4431 = arg1;
        this.field4442 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class129.field1541, 0);
        this.field4441 = class129.field1541[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4441);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4431, this.field4435, this.field4442);
        this.field4440 = this.field4442 * this.field4435 * this.field4445.method880(-22330, this.field4431);
    }
}
