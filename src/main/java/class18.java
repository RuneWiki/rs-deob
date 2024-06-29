import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class18 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
    private boolean field355;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Luca;")
    public class287 field353;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lvg;")
    public static class622 field358 = new class622(96, 2);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lmv;")
    public static class295 field360;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lnk;")
    public static class430 field362;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method124(int arg0) {
        field358 = null;
        if (arg0 == -12081) {
            field362 = null;
            field360 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BII)V")
    public final void method125(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 36) {
            field362 = null;
        }
        field359++;
        this.method126((byte) 33);
        if (this.field361 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field356, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field356, arg1, arg0, 0, this.field355 ? 35040 : 35044);
            this.field353.field4040 += arg1 - this.field361;
            this.field361 = arg1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field354++;
        this.field353.method1688(this.field361, 1, this.field357);
        super.finalize();
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public abstract void method126(byte arg0);

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Luca;I[BIZ)V")
    public class18(class287 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field356 = arg1;
        this.field355 = arg4;
        this.field353 = arg0;
        this.field361 = arg3;
        OpenGL.glGenBuffersARB(1, class2.field20, 0);
        this.field357 = class2.field20[0];
        this.method126((byte) 33);
        OpenGL.glBufferDataARBub(arg1, this.field361, arg2, 0, this.field355 ? 35040 : 35044);
        this.field353.field4040 += this.field361;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Luca;ILjaclib/memory/Buffer;IZ)V")
    public class18(class287 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field355 = arg4;
        this.field353 = arg0;
        this.field356 = arg1;
        this.field361 = arg3;
        OpenGL.glGenBuffersARB(1, class2.field20, 0);
        this.field357 = class2.field20[0];
        this.method126((byte) 33);
        OpenGL.glBufferDataARBa(arg1, this.field361, arg2.getAddress(), this.field355 ? 35040 : 35044);
        this.field353.field4040 += this.field361;
    }
}
