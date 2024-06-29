import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class192 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
    private boolean field2495;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lug;")
    public class395 field2494;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static final void method1187(boolean arg0) {
        if (arg0) {
            return;
        }
        class449 var1 = class512.field7423;
        synchronized (class512.field7423) {
            class512.field7423.method2642(0);
        }
        field2488++;
        class449 var2 = class363.field4723;
        synchronized (class363.field4723) {
            class363.field4723.method2642(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2494.method2286(this.field2493, -6957, this.field2492);
        field2487++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public abstract void method1188(int arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[B)V")
    public final void method1189(int arg0, int arg1, byte[] arg2) {
        field2489++;
        this.method1188(32299);
        if (arg1 <= this.field2492) {
            OpenGL.glBufferSubDataARB(this.field2490, 0, arg1, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field2490, arg1, arg2, 0, this.field2495 ? 35040 : 35044);
            this.field2494.field5513 += arg1 - this.field2492;
            this.field2492 = arg1;
        }
        if (arg0 != -29783) {
            this.field2492 = -42;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method1190(int arg0, short[] arg1, int arg2) {
        field2491++;
        short[] var3 = new short[arg0];
        class318.method1877(arg1, 0, var3, arg2, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lug;I[BIZ)V")
    public class192(class395 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2495 = arg4;
        this.field2494 = arg0;
        this.field2490 = arg1;
        this.field2492 = arg3;
        OpenGL.glGenBuffersARB(1, class284.field3613, 0);
        this.field2493 = class284.field3613[0];
        this.method1188(32299);
        OpenGL.glBufferDataARBub(arg1, this.field2492, arg2, 0, this.field2495 ? 35040 : 35044);
        this.field2494.field5513 += this.field2492;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lug;ILjaggl/memory/NativeBuffer;IZ)V")
    public class192(class395 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field2495 = arg4;
        this.field2492 = arg3;
        this.field2490 = arg1;
        this.field2494 = arg0;
        OpenGL.glGenBuffersARB(1, class284.field3613, 0);
        this.field2493 = class284.field3613[0];
        this.method1188(32299);
        OpenGL.glBufferDataARBa(arg1, this.field2492, arg2.method2593(), this.field2495 ? 35040 : 35044);
        this.field2494.field5513 += this.field2492;
    }
}
