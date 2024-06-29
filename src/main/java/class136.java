import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class136 implements class279 {

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    private int field1936 = -1;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Lhd;")
    private class17 field1939;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    private int field1938;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[I")
    private static int[] field1935 = new int[1];

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
    public final void method889() {
        this.field1939.field198.glFramebufferRenderbufferEXT(36160, this.field1936, 36161, 0);
        this.field1936 = -1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public final void method1078(int arg0) {
        this.field1939.field198.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field1938);
        this.field1936 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1079();
        super.finalize();
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lhd;III)V")
    public class136(class17 arg0, int arg1, int arg2, int arg3) {
        this.field1939 = arg0;
        this.field1933 = arg2;
        this.field1937 = arg3;
        this.field1940 = arg1;
        opengl var5 = this.field1939.field198;
        var5.glGenRenderbuffersEXT(1, field1935, 0);
        this.field1938 = field1935[0];
        var5.glBindRenderbufferEXT(36161, this.field1938);
        var5.glRenderbufferStorageEXT(36161, this.field1940, this.field1933, this.field1937);
        this.field1934 = this.field1937 * this.field1933 * this.field1939.method126(this.field1940);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "()V")
    public final void method1079() {
        if (this.field1938 > 0) {
            this.field1939.method136(this.field1938, this.field1934);
            this.field1938 = 0;
        }
    }
}
