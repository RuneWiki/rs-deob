import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class145 {

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Len;")
    public class289 field2159;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Z")
    private boolean field2154;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lkf;")
    public static class229 field2161 = new class229(3);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    public static int[] field2153;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)Lpd;", line = 4)
    public static final class233 method1016(byte arg0, int arg1) {
        field2152++;
        if (arg0 == -118) {
            return class206.field3049 && arg1 >= class535.field7286 && class271.field3830 >= arg1 ? class558.field7545[arg1 - class535.field7286] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method1017(int arg0, int arg1, int arg2) {
        if (arg1 == 35040) {
            field2155++;
            return (arg2 & 0x60000) != 0 | class264.method1602(arg2, 55, arg0) || class253.method1564(arg0, arg2, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V", line = 35)
    public static void method1018(byte arg0) {
        field2161 = null;
        if (arg0 != -38) {
            method1018((byte) -100);
        }
        field2153 = null;
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        this.field2159.method1807(this.field2160, 1, this.field2156);
        field2157++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Len;I[BIZ)V", line = 63)
    public class145(class289 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2159 = arg0;
        this.field2156 = arg3;
        this.field2154 = arg4;
        this.field2158 = arg1;
        OpenGL.glGenBuffersARB(1, class35.field420, 0);
        this.field2160 = class35.field420[0];
        this.method1019(true);
        OpenGL.glBufferDataARBub(arg1, this.field2156, arg2, 0, this.field2154 ? 35040 : 35044);
        this.field2159.field4235 += this.field2156;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Len;ILjaclib/memory/Buffer;IZ)V", line = 82)
    public class145(class289 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field2159 = arg0;
        this.field2156 = arg3;
        this.field2154 = arg4;
        this.field2158 = arg1;
        OpenGL.glGenBuffersARB(1, class35.field420, 0);
        this.field2160 = class35.field420[0];
        this.method1019(true);
        OpenGL.glBufferDataARBa(arg1, this.field2156, arg2.getAddress(), this.field2154 ? 35040 : 35044);
        this.field2159.field4235 += this.field2156;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[BI)V", line = 105)
    public final void method1020(int arg0, byte[] arg1, int arg2) {
        field2151++;
        this.method1019(true);
        if (arg0 != 35040) {
            field2153 = null;
        }
        if (arg2 > this.field2156) {
            OpenGL.glBufferDataARBub(this.field2158, arg2, arg1, 0, this.field2154 ? 35040 : 35044);
            this.field2159.field4235 += arg2 - this.field2156;
            this.field2156 = arg2;
        } else {
            OpenGL.glBufferSubDataARBub(this.field2158, 0, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
    public abstract void method1019(boolean arg0);
}
