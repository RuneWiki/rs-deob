import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class488 implements class306 {

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    private int field6923 = -1;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Lic;")
    private class246 field6918;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    private int field6919;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
    private static int[] field6924 = new int[1];

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "()V", line = 3)
    public final void method2881() {
        if (this.field6922 > 0) {
            this.field6918.method1493(this.field6922, this.field6921);
            this.field6922 = 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 12)
    public final void method2882(int arg0) {
        this.field6918.field3342.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field6922);
        this.field6923 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "()V", line = 19)
    public final void method47() {
        this.field6918.field3342.glFramebufferRenderbufferEXT(36160, this.field6923, 36161, 0);
        this.field6923 = -1;
    }

    @OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        this.method2881();
        super.finalize();
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lic;III)V", line = 39)
    public class488(class246 arg0, int arg1, int arg2, int arg3) {
        this.field6918 = arg0;
        this.field6920 = arg2;
        this.field6917 = arg3;
        this.field6919 = arg1;
        opengl var5 = this.field6918.field3342;
        var5.glGenRenderbuffersEXT(1, field6924, 0);
        this.field6922 = field6924[0];
        var5.glBindRenderbufferEXT(36161, this.field6922);
        var5.glRenderbufferStorageEXT(36161, this.field6919, this.field6920, this.field6917);
        this.field6921 = this.field6920 * this.field6917 * this.field6918.method1419(this.field6919);
    }
}
