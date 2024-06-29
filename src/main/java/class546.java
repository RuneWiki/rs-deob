import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class546 {

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    private int field7620;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
    private boolean field7618;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lbi;")
    public class483 field7616;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field7606;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lkg;")
    public static class275 field7608 = null;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7617 = new String[100];

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
    public static boolean field7614 = false;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field7619 = 0;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "F")
    public static float field7612;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 3)
    public static final void method3147(byte arg0) {
        field7615++;
        if (arg0 != -108) {
            field7608 = null;
        }
        class174.field2414.method1161(false);
        class605.field8409.method113(arg0 + 208);
        class236.field3083.method113(arg0 ^ 0xFFFFFFF1);
    }

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        field7613++;
        this.field7616.method2832(this.field7606, this.field7610, 81);
        super.finalize();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BII)V", line = 50)
    public final void method3148(byte[] arg0, int arg1, int arg2) {
        this.method2165(34963);
        field7607++;
        if (arg2 != 35044) {
            this.method3148(null, 112, 54);
        }
        if (arg1 > this.field7610) {
            OpenGL.glBufferDataARBub(this.field7620, arg1, arg0, 0, this.field7618 ? 35040 : 35044);
            this.field7616.field6792 += arg1 - this.field7610;
            this.field7610 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field7620, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V", line = 78)
    public static void method3149(byte arg0) {
        if (arg0 > -90) {
            field7614 = false;
        }
        field7608 = null;
        field7617 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V", line = 89)
    public static final void method3150(int arg0, int arg1, int arg2) {
        field7609++;
        class37 var3 = class636.method3571(arg2, arg0, -82);
        var3.method232(-3);
        var3.field579 = arg1;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lbi;I[BIZ)V", line = 99)
    public class546(class483 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7620 = arg1;
        this.field7618 = arg4;
        this.field7610 = arg3;
        this.field7616 = arg0;
        OpenGL.glGenBuffersARB(1, class453.field5999, 0);
        this.field7606 = class453.field5999[0];
        this.method2165(34963);
        OpenGL.glBufferDataARBub(arg1, this.field7610, arg2, 0, this.field7618 ? 35040 : 35044);
        this.field7616.field6792 += this.field7610;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lbi;ILjaclib/memory/Buffer;IZ)V", line = 118)
    public class546(class483 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field7618 = arg4;
        this.field7620 = arg1;
        this.field7610 = arg3;
        this.field7616 = arg0;
        OpenGL.glGenBuffersARB(1, class453.field5999, 0);
        this.field7606 = class453.field5999[0];
        this.method2165(34963);
        OpenGL.glBufferDataARBa(arg1, this.field7610, arg2.getAddress(), this.field7618 ? 35040 : 35044);
        this.field7616.field6792 += this.field7610;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public abstract void method2165(int arg0);
}
