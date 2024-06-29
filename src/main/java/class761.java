import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class class761 {

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "Lkv;")
    public class280 field10488;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
    private boolean field10495;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    private int field10489;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    private int field10491;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public int field10486;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "[I")
    private static int[] field10494 = new int[1];

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "[I")
    public static int[] field10493;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method4193(byte arg0, int arg1, String arg2) {
        field10485++;
        if (arg0 > 78) {
            class678 var3 = class630.method3597(29636, 3, (long) arg1);
            var3.method3834((byte) 89);
            var3.field9641 = arg2;
        }
    }

    @OriginalMember(owner = "client!ww", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10488.method1824(this.field10486, this.field10491, false);
        field10484++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(Z)V")
    public static void method4194(boolean arg0) {
        field10493 = null;
        if (arg0) {
            method4194(true);
        }
        field10494 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[BZ)V")
    public final void method4195(int arg0, byte[] arg1, boolean arg2) {
        this.method2013(59838567);
        field10490++;
        if (!arg2) {
            return;
        }
        if (this.field10491 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field10489, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field10489, arg0, arg1, 0, this.field10495 ? 35040 : 35044);
            this.field10488.field4183 += arg0 - this.field10491;
            this.field10491 = arg0;
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
    public abstract void method2013(int arg0);

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lkv;I[BIZ)V")
    public class761(class280 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field10488 = arg0;
        this.field10495 = arg4;
        this.field10489 = arg1;
        this.field10491 = arg3;
        OpenGL.glGenBuffersARB(1, field10494, 0);
        this.field10486 = field10494[0];
        this.method2013(59838567);
        OpenGL.glBufferDataARBub(arg1, this.field10491, arg2, 0, this.field10495 ? 35040 : 35044);
        this.field10488.field4183 += this.field10491;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lkv;ILjaclib/memory/Buffer;IZ)V")
    public class761(class280 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field10488 = arg0;
        this.field10491 = arg3;
        this.field10489 = arg1;
        this.field10495 = arg4;
        OpenGL.glGenBuffersARB(1, field10494, 0);
        this.field10486 = field10494[0];
        this.method2013(59838567);
        OpenGL.glBufferDataARBa(arg1, this.field10491, arg2.getAddress(), this.field10495 ? 35040 : 35044);
        this.field10488.field4183 += this.field10491;
    }
}
