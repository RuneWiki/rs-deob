import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class152 implements class5 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    private int field1915 = -1;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lse;")
    private class282 field1917;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "[I")
    private static int[] field1911 = new int[1];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V", line = 3)
    public final void method1033() {
        if (this.field1912 > 0) {
            this.field1917.method1865(this.field1912, this.field1918);
            this.field1912 = 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V", line = 12)
    protected final void finalize() throws Throwable {
        this.method1033();
        super.finalize();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 16)
    public final void method1034(int arg0) {
        this.field1917.field4140.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field1912);
        this.field1915 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V", line = 24)
    public final void method28() {
        this.field1917.field4140.glFramebufferRenderbufferEXT(36160, this.field1915, 36161, 0);
        this.field1915 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lse;III)V", line = 39)
    public class152(class282 arg0, int arg1, int arg2, int arg3) {
        this.field1917 = arg0;
        this.field1916 = arg2;
        this.field1914 = arg3;
        this.field1913 = arg1;
        opengl var5 = this.field1917.field4140;
        var5.glGenRenderbuffersEXT(1, field1911, 0);
        this.field1912 = field1911[0];
        var5.glBindRenderbufferEXT(36161, this.field1912);
        var5.glRenderbufferStorageEXT(36161, this.field1913, this.field1916, this.field1914);
        this.field1918 = this.field1916 * this.field1914 * this.field1917.method1890(this.field1913);
    }
}
