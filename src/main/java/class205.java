import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public abstract class class205 implements class745 {

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Z")
    private boolean field2642 = false;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Z")
    private boolean field2648;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    private int field2651;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Llf;")
    public class250 field2640;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lqw;")
    public static class84 field2641 = new class84();

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field2652 = 100;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public static void method1339(int arg0) {
        field2641 = null;
        if (arg0 != 0) {
            method1348(55);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
    public final void method1340(boolean arg0, int arg1) {
        if (this.field2648 != arg0) {
            int var3 = this.method1347((byte) 65);
            this.field2648 = true;
            this.method1345(-1);
            this.method1342(var3, -1);
        }
        field2643++;
        if (arg1 != -2692) {
            this.field2644 = -44;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public final void method1341(boolean arg0) {
        field2650++;
        if (arg0 && this.field2637 > 0) {
            this.field2640.method1643(this.method1347((byte) 122), this.field2637, -36);
            this.field2637 = 0;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
    private final void method1342(int arg0, int arg1) {
        this.field2640.field3534 -= arg0;
        field2638++;
        this.field2640.field3534 += this.method1347((byte) 23);
        if (arg1 != -1) {
            this.method1344(-126, true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z")
    public final boolean method1343(int arg0) {
        field2645++;
        if (arg0 != 0) {
            return false;
        } else if (this.field2640.field3652) {
            int var2 = this.method1347((byte) 72);
            this.field2640.method1595((byte) 86, this);
            OpenGL.glGenerateMipmapEXT(this.field2649);
            this.field2648 = true;
            this.method1345(-1);
            this.method1342(var2, ~arg0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)V")
    public final void method1344(int arg0, boolean arg1) {
        if (arg1 != this.field2642) {
            this.field2642 = arg1;
            this.method1345(-1);
        }
        field2647++;
        if (arg0 != -15578) {
            this.field2651 = 70;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
    private final void method1345(int arg0) {
        field2653++;
        this.field2640.method1595((byte) 92, this);
        if (this.field2642) {
            OpenGL.glTexParameteri(this.field2649, 10241, this.field2648 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2649, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2649, 10241, this.field2648 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2649, 10240, 9728);
        }
        if (arg0 != -1) {
            this.method1340(true, 53);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
    public final int method1346(byte arg0) {
        if (arg0 != 86) {
            field2641 = null;
        }
        field2636++;
        return this.field2637;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I")
    private final int method1347(byte arg0) {
        field2639++;
        int var2 = this.field2640.method1590(-125, this.field2644) * this.field2651;
        if (arg0 <= 10) {
            method1348(96);
        }
        return this.field2648 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        class289.field4127 = arg0;
    }

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2646++;
        this.method1341(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Llf;IIIZ)V")
    public class205(class250 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2644 = arg2;
        this.field2648 = arg4;
        this.field2649 = arg1;
        this.field2651 = arg3;
        this.field2640 = arg0;
        OpenGL.glGenTextures(1, class221.field2866, 0);
        this.field2637 = class221.field2866[0];
        this.method1342(0, -1);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public abstract void method804(int arg0);
}
