import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public abstract class class475 {

    @OriginalMember(owner = "client!via", name = "f", descriptor = "I")
    private int field6619;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "Ldw;")
    public class664 field6615;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "Z")
    private boolean field6618;

    @OriginalMember(owner = "client!via", name = "g", descriptor = "I")
    private int field6620;

    @OriginalMember(owner = "client!via", name = "h", descriptor = "I")
    public int field6621;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
    public abstract void method2894(boolean arg0);

    @OriginalMember(owner = "client!via", name = "a", descriptor = "([BII)V")
    public final void method2895(byte[] arg0, int arg1, int arg2) {
        this.method2894(true);
        if (arg2 < 48) {
            this.field6620 = -108;
        }
        field6616++;
        if (this.field6620 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field6619, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6619, arg1, arg0, 0, this.field6618 ? 35040 : 35044);
            this.field6615.field9025 += arg1 - this.field6620;
            this.field6620 = arg1;
        }
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(I)Z")
    public static final boolean method2896(int arg0) {
        if (arg0 != 0) {
            return true;
        }
        field6614++;
        if (class258.field3740) {
            try {
                class69.method540("showVideoAd", class320.field4445, arg0 ^ 0xFFFFFF82);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!via", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6615.method3749((byte) -101, this.field6621, this.field6620);
        field6617++;
        super.finalize();
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ldw;I[BIZ)V")
    public class475(class664 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6619 = arg1;
        this.field6615 = arg0;
        this.field6618 = arg4;
        this.field6620 = arg3;
        OpenGL.glGenBuffersARB(1, class449.field6215, 0);
        this.field6621 = class449.field6215[0];
        this.method2894(true);
        OpenGL.glBufferDataARBub(arg1, this.field6620, arg2, 0, this.field6618 ? 35040 : 35044);
        this.field6615.field9025 += this.field6620;
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ldw;ILjaclib/memory/Buffer;IZ)V")
    public class475(class664 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6619 = arg1;
        this.field6620 = arg3;
        this.field6615 = arg0;
        this.field6618 = arg4;
        OpenGL.glGenBuffersARB(1, class449.field6215, 0);
        this.field6621 = class449.field6215[0];
        this.method2894(true);
        OpenGL.glBufferDataARBa(arg1, this.field6620, arg2.getAddress(), this.field6618 ? 35040 : 35044);
        this.field6615.field9025 += this.field6620;
    }
}
