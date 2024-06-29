import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class314 extends class205 implements class619 {

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    private int field4714 = -1;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    private int field4727 = -1;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "Lrs;")
    private class166 field4715;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public static int field4720 = 104;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "[[[Z")
    public static boolean[][][] field4726;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
    public final void method2065(int arg0) {
        if (arg0 != -1) {
            this.method2068(-18, false, 54);
        }
        field4731++;
        if (this.field4728 > 0) {
            this.field4715.method1282(this.field4716, (byte) -122, this.field4728);
            this.field4728 = 0;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2066(int arg0, int arg1, byte arg2) {
        int var3 = -28 % ((arg2 + 11) / 48);
        field4722++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2065(-1);
        field4729++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z[S)[S")
    public static final short[] method2067(boolean arg0, short[] arg1) {
        field4717++;
        if (!arg0) {
            method2071((byte) -81);
        }
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class571.method3312(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZI)V")
    public final void method2068(int arg0, boolean arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field4728);
        field4721++;
        this.field4714 = arg2;
        this.field4727 = arg0;
        if (arg1) {
            this.method2069((byte) 79);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field4727, this.field4714, 36161, 0);
        field4719++;
        this.field4714 = -1;
        if (arg0 != -31) {
            field4726 = null;
        }
        this.field4727 = -1;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(II)V")
    public static final void method2070(int arg0, int arg1) {
        field4724++;
        class120.field1849 = -1;
        class271.field4161 = arg0;
        class120.field1849 = -1;
        int var2 = 62 / ((arg1 + 74) / 49);
        class481.method2912((byte) 73);
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lrs;III)V")
    public class314(class166 arg0, int arg1, int arg2, int arg3) {
        this.field4715 = arg0;
        this.field4718 = arg3;
        this.field4723 = arg1;
        this.field4730 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class477.field6931, 0);
        this.field4728 = class477.field6931[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4728);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4723, this.field4730, this.field4718);
        this.field4716 = this.field4718 * this.field4730 * this.field4715.method1313(127, this.field4723);
    }

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "(B)V")
    public static void method2071(byte arg0) {
        if (arg0 == 45) {
            field4726 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lrs;IIII)V")
    public class314(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4730 = arg2;
        this.field4715 = arg0;
        this.field4723 = arg1;
        this.field4718 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class477.field6931, 0);
        this.field4728 = class477.field6931[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4728);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4723, this.field4730, this.field4718);
        this.field4716 = this.field4730 * this.field4718 * this.field4715.method1313(127, this.field4723);
    }
}
