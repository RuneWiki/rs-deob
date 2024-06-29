import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class673 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    private int field9366;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
    private boolean field9367;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    private int field9365;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lvj;")
    public class422 field9371;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field9361;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[S")
    public static short[] field9363 = new short[256];

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9364 = new Hashtable();

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field9369 = 0;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lsb;")
    public static class305 field9370 = new class305(9, 7);

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field9372 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[B)V", line = 10)
    public final void method3716(int arg0, int arg1, byte[] arg2) {
        this.method605(55);
        field9362++;
        if (this.field9365 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field9366, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field9366, arg0, arg2, 0, this.field9367 ? 35040 : 35044);
            this.field9371.field5840 += arg0 - this.field9365;
            this.field9365 = arg0;
        }
        if (arg1 != 0) {
            field9370 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 43)
    public static void method3717(byte arg0) {
        int var1 = -69 / ((66 - arg0) / 43);
        field9363 = null;
        field9364 = null;
        field9370 = null;
    }

    @OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() throws Throwable {
        field9368++;
        this.field9371.method2399(60, this.field9365, this.field9361);
        super.finalize();
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lvj;I[BIZ)V", line = 69)
    public class673(class422 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field9366 = arg1;
        this.field9367 = arg4;
        this.field9365 = arg3;
        this.field9371 = arg0;
        OpenGL.glGenBuffersARB(1, class165.field1848, 0);
        this.field9361 = class165.field1848[0];
        this.method605(63);
        OpenGL.glBufferDataARBub(arg1, this.field9365, arg2, 0, this.field9367 ? 35040 : 35044);
        this.field9371.field5840 += this.field9365;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lvj;ILjaclib/memory/Buffer;IZ)V", line = 96)
    public class673(class422 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field9365 = arg3;
        this.field9366 = arg1;
        this.field9371 = arg0;
        this.field9367 = arg4;
        OpenGL.glGenBuffersARB(1, class165.field1848, 0);
        this.field9361 = class165.field1848[0];
        this.method605(112);
        OpenGL.glBufferDataARBa(arg1, this.field9365, arg2.getAddress(), this.field9367 ? 35040 : 35044);
        this.field9371.field5840 += this.field9365;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public abstract void method605(int arg0);
}
