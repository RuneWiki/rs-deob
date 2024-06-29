import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class481 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Z")
    private boolean field6710;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lqo;")
    public class22 field6714;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    private int field6717;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    private int field6708;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field6716;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6715 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2820(int arg0, int arg1) {
        field6712++;
        class594 var2 = class692.method3869(arg0, (byte) 105, arg1);
        var2.method3383(arg1 ^ 0xFFFFC140);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 17)
    public static void method2821(int arg0) {
        int var1 = -90 / ((-arg0 - 50) / 37);
        field6715 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BII)V", line = 27)
    public final void method2822(byte[] arg0, int arg1, int arg2) {
        field6713++;
        if (arg1 != 0) {
            method2820(-47, 124);
        }
        this.method548(arg1 ^ 0xFFFFFF8B);
        if (this.field6708 >= arg2) {
            OpenGL.glBufferSubDataARBub(this.field6717, 0, arg2, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6717, arg2, arg0, 0, this.field6710 ? 35040 : 35044);
            this.field6714.field569 += arg2 - this.field6708;
            this.field6708 = arg2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V", line = 54)
    protected final void finalize() throws Throwable {
        field6709++;
        this.field6714.method284(this.field6708, -1, this.field6716);
        super.finalize();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILha;I)Loea;", line = 67)
    public static final class597 method2823(int arg0, class59 arg1, int arg2) {
        field6711++;
        if (arg0 == -25411) {
            class547 var3 = class615.method3491(arg2, arg1, (byte) -81, true);
            return var3 == null ? null : var3.field7538;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lqo;I[BIZ)V", line = 84)
    public class481(class22 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6710 = arg4;
        this.field6714 = arg0;
        this.field6717 = arg1;
        this.field6708 = arg3;
        OpenGL.glGenBuffersARB(1, class261.field3745, 0);
        this.field6716 = class261.field3745[0];
        this.method548(-111);
        OpenGL.glBufferDataARBub(arg1, this.field6708, arg2, 0, this.field6710 ? 35040 : 35044);
        this.field6714.field569 += this.field6708;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lqo;ILjaclib/memory/Buffer;IZ)V", line = 103)
    public class481(class22 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6717 = arg1;
        this.field6708 = arg3;
        this.field6714 = arg0;
        this.field6710 = arg4;
        OpenGL.glGenBuffersARB(1, class261.field3745, 0);
        this.field6716 = class261.field3745[0];
        this.method548(-126);
        OpenGL.glBufferDataARBa(arg1, this.field6708, arg2.getAddress(), this.field6710 ? 35040 : 35044);
        this.field6714.field569 += this.field6708;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public abstract void method548(int arg0);
}
