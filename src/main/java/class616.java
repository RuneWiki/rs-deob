import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class616 {

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lpq;")
    public class194 field8655;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Z")
    private boolean field8654;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    private int field8650;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    private int field8652;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field8648;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field8645 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Leaa;")
    public static class394 field8649;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field8646;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method3554(byte arg0) {
        field8649 = null;
        if (arg0 >= -20) {
            method3555(null, (byte) 55);
        }
        field8646 = null;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
    public abstract void method1594(int arg0);

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8655.method1264(this.field8648, -2617, this.field8650);
        field8647++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method3555(String arg0, byte arg1) {
        field8653++;
        int var2 = arg0.length();
        if (arg1 != 40) {
            method3555(null, (byte) -124);
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BBI)V")
    public final void method3556(byte[] arg0, byte arg1, int arg2) {
        field8651++;
        this.method1594(arg1 + 47);
        if (this.field8650 < arg2) {
            OpenGL.glBufferDataARBub(this.field8652, arg2, arg0, 0, this.field8654 ? 35040 : 35044);
            this.field8655.field2627 += arg2 - this.field8650;
            this.field8650 = arg2;
        } else {
            OpenGL.glBufferSubDataARBub(this.field8652, 0, arg2, arg0, 0);
        }
        if (arg1 != -56) {
            this.field8655 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lpq;I[BIZ)V")
    public class616(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field8655 = arg0;
        this.field8654 = arg4;
        this.field8650 = arg3;
        this.field8652 = arg1;
        OpenGL.glGenBuffersARB(1, class771.field10611, 0);
        this.field8648 = class771.field10611[0];
        this.method1594(-9);
        OpenGL.glBufferDataARBub(arg1, this.field8650, arg2, 0, this.field8654 ? 35040 : 35044);
        this.field8655.field2627 += this.field8650;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lpq;ILjaclib/memory/Buffer;IZ)V")
    public class616(class194 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field8652 = arg1;
        this.field8655 = arg0;
        this.field8650 = arg3;
        this.field8654 = arg4;
        OpenGL.glGenBuffersARB(1, class771.field10611, 0);
        this.field8648 = class771.field10611[0];
        this.method1594(-9);
        OpenGL.glBufferDataARBa(arg1, this.field8650, arg2.getAddress(), this.field8654 ? 35040 : 35044);
        this.field8655.field2627 += this.field8650;
    }
}
