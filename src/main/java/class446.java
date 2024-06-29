import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class446 implements class452 {

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
    private boolean field6647 = false;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Lod;")
    public class349 field6637;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    private int field6632;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Z")
    private boolean field6644;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field6646;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field6641 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field6645;

    static {
        new class475("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method2676(int arg0) {
        field6635++;
        if (!this.field6637.field5318) {
            if (arg0 != -13523) {
                this.field6633 = 7;
            }
            return false;
        }
        int var2 = this.method2678(9728);
        this.field6637.method2200(this, (byte) 113);
        OpenGL.glGenerateMipmapEXT(this.field6633);
        this.field6644 = true;
        this.method2679(1);
        this.method2680(119, var2);
        return true;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I", line = 34)
    public final int method2677(int arg0) {
        if (arg0 == -17229) {
            field6636++;
            return this.field6640;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)I", line = 45)
    private final int method2678(int arg0) {
        field6642++;
        if (arg0 != 9728) {
            this.field6644 = true;
        }
        int var2 = this.field6637.method2129(this.field6646, arg0 - 9842) * this.field6632;
        return this.field6644 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() throws Throwable {
        field6638++;
        this.method2681(67);
        super.finalize();
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 70)
    private final void method2679(int arg0) {
        this.field6637.method2200(this, (byte) 123);
        field6645++;
        if (this.field6647) {
            OpenGL.glTexParameteri(this.field6633, 10241, this.field6644 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6633, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6633, 10241, this.field6644 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6633, 10240, 9728);
        }
        if (arg0 != 1) {
            this.field6632 = 8;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 97)
    private final void method2680(int arg0, int arg1) {
        if (arg0 <= 4) {
            this.method2676(87);
        }
        field6631++;
        this.field6637.field5241 -= arg1;
        this.field6637.field5241 += this.method2678(9728);
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 112)
    public final void method2681(int arg0) {
        if (this.field6640 > 0) {
            this.field6637.method2191(this.method2678(9728), this.field6640, false);
            this.field6640 = 0;
        }
        if (arg0 <= 48) {
            this.method2683(true, -25);
        }
        field6643++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)V", line = 130)
    public final void method2682(int arg0, boolean arg1) {
        if (arg1 != this.field6644) {
            int var3 = this.method2678(9728);
            this.field6644 = true;
            this.method2679(arg0 - 9983);
            this.method2680(22, var3);
        }
        if (arg0 == 9984) {
            field6639++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V", line = 150)
    public final void method2683(boolean arg0, int arg1) {
        if (this.field6647 != arg0) {
            this.field6647 = arg0;
            this.method2679(1);
        }
        if (arg1 != 0) {
            this.method2677(93);
        }
        field6634++;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lod;IIIZ)V", line = 184)
    public class446(class349 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6637 = arg0;
        this.field6632 = arg3;
        this.field6644 = arg4;
        this.field6633 = arg1;
        this.field6646 = arg2;
        OpenGL.glGenTextures(1, class257.field3792, 0);
        this.field6640 = class257.field3792[0];
        this.method2680(100, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public abstract void method1726(int arg0);
}
