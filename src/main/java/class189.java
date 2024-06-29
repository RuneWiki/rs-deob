import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class189 {

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
    private boolean field2793;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lqg;")
    public class321 field2795;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[BI)V")
    public final void method1302(boolean arg0, byte[] arg1, int arg2) {
        if (!arg0) {
            return;
        }
        field2794++;
        this.method761((byte) 82);
        if (arg2 > this.field2796) {
            OpenGL.glBufferDataARBub(this.field2801, arg2, arg1, 0, this.field2793 ? 35040 : 35044);
            this.field2795.field4797 += arg2 - this.field2796;
            this.field2796 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field2801, 0, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
    public abstract void method761(byte arg0);

    @OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2795.method2078((byte) -35, this.field2798, this.field2796);
        field2800++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)Loe;")
    public static final class133 method1303(int arg0, int arg1, int arg2) {
        field2799++;
        class133 var3 = new class133();
        var3.field2050 = -1;
        var3.field2052 = -1;
        var3.field2048 = arg1 + arg2 + 5;
        var3.field2044 = arg0 + 1 + 5;
        var3.field2047 = new int[var3.field2044][var3.field2048];
        var3.method982(arg1 ^ 0xFFFFFF8E);
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lqg;I[BIZ)V")
    public class189(class321 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2796 = arg3;
        this.field2793 = arg4;
        this.field2801 = arg1;
        this.field2795 = arg0;
        OpenGL.glGenBuffersARB(1, class109.field1724, 0);
        this.field2798 = class109.field1724[0];
        this.method761((byte) 68);
        OpenGL.glBufferDataARBub(arg1, this.field2796, arg2, 0, this.field2793 ? 35040 : 35044);
        this.field2795.field4797 += this.field2796;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lqg;ILjaggl/memory/NativeBuffer;IZ)V")
    public class189(class321 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field2795 = arg0;
        this.field2801 = arg1;
        this.field2796 = arg3;
        this.field2793 = arg4;
        OpenGL.glGenBuffersARB(1, class109.field1724, 0);
        this.field2798 = class109.field1724[0];
        this.method761((byte) 40);
        OpenGL.glBufferDataARBa(arg1, this.field2796, arg2.method2647(), this.field2793 ? 35040 : 35044);
        this.field2795.field4797 += this.field2796;
    }
}
