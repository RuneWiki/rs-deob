import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public abstract class class559 implements class635 {

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "Z")
    private boolean field7772 = false;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Ldw;")
    public class664 field7765;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "Z")
    private boolean field7787;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public int field7777;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    private int field7782;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public int field7785;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field7775 = 0;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "[I")
    public static int[] field7778 = new int[14];

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "[I")
    public static int[] field7784 = new int[5];

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Lst;")
    public static class335 field7766 = new class335(3, -1);

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V")
    public final void method3285(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method3287((byte) 70);
        }
        if (arg1 != this.field7787) {
            int var3 = this.method3290((byte) 123);
            this.field7787 = true;
            this.method3287((byte) -15);
            this.method3293(var3, 117);
        }
        field7771++;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)I")
    public final int method3286(int arg0) {
        field7781++;
        return arg0 == -28451 ? this.field7785 : -29;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    private final void method3287(byte arg0) {
        this.field7765.method3681(this, 0);
        int var2 = -73 % ((arg0 + 79) / 35);
        field7776++;
        if (this.field7772) {
            OpenGL.glTexParameteri(this.field7768, 10241, this.field7787 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7768, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7768, 10241, this.field7787 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7768, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
    public final void method3288(int arg0) {
        field7773++;
        if (arg0 < -12 && this.field7785 > 0) {
            this.field7765.method3675(this.field7785, this.method3290((byte) 116), false);
            this.field7785 = 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
    public static void method3289(int arg0) {
        if (arg0 != 10240) {
            field7774 = -107;
        }
        field7766 = null;
        field7784 = null;
        field7778 = null;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I")
    private final int method3290(byte arg0) {
        field7767++;
        int var2 = this.field7765.method3677(this.field7777, 3283) * this.field7782;
        if (arg0 <= 113) {
            method3289(-25);
        }
        return this.field7787 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)Z")
    public final boolean method3291(int arg0) {
        field7779++;
        if (!this.field7765.field9108) {
            if (arg0 != -1) {
                this.method3288(-118);
            }
            return false;
        }
        int var2 = this.method3290((byte) 126);
        this.field7765.method3681(this, 0);
        OpenGL.glGenerateMipmapEXT(this.field7768);
        this.field7787 = true;
        this.method3287((byte) -44);
        this.method3293(var2, 104);
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3288(-63);
        field7780++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
    public final void method3292(int arg0, boolean arg1) {
        if (this.field7772 != arg1) {
            this.field7772 = arg1;
            this.method3287((byte) -16);
        }
        field7786++;
        if (arg0 != 3) {
            this.method3290((byte) 38);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    private final void method3293(int arg0, int arg1) {
        field7783++;
        int var3 = 119 % ((-arg1 - 38) / 40);
        this.field7765.field9024 -= arg0;
        this.field7765.field9024 += this.method3290((byte) 123);
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
    public static final void method3294(int arg0, int arg1) {
        field7770++;
        if (arg1 > 81) {
            class346 var2 = class299.method1976(0, 8, arg0);
            var2.method2208(-1719);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ldw;IIIZ)V")
    public class559(class664 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7768 = arg1;
        this.field7765 = arg0;
        this.field7787 = arg4;
        this.field7777 = arg2;
        this.field7782 = arg3;
        OpenGL.glGenTextures(1, class763.field10642, 0);
        this.field7785 = class763.field10642[0];
        this.method3293(0, -126);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public abstract void method2235(int arg0);
}
