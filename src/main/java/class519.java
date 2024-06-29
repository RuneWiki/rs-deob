import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class519 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lpg;")
    public class333 field7627;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    private int field7630;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    private int field7626;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
    private boolean field7624;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field7628;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field7633 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lrb;")
    public static class283 field7635 = new class283(58, -2);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "F")
    public static float field7629;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lpg;I[BIZ)V")
    public class519(class333 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7627 = arg0;
        this.field7630 = arg3;
        this.field7626 = arg1;
        this.field7624 = arg4;
        OpenGL.glGenBuffersARB(1, class195.field2854, 0);
        this.field7628 = class195.field2854[0];
        this.method1348((byte) 113);
        OpenGL.glBufferDataARBub(arg1, this.field7630, arg2, 0, this.field7624 ? 35040 : 35044);
        this.field7627.field4740 += this.field7630;
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7631++;
        this.field7627.method2005(this.field7628, this.field7630, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BB)V")
    public final void method3095(int arg0, byte[] arg1, byte arg2) {
        field7625++;
        if (arg2 <= 50) {
            this.method3095(-35, null, (byte) 126);
        }
        this.method1348((byte) 113);
        if (this.field7630 < arg0) {
            OpenGL.glBufferDataARBub(this.field7626, arg0, arg1, 0, this.field7624 ? 35040 : 35044);
            this.field7627.field4740 += arg0 - this.field7630;
            this.field7630 = arg0;
        } else {
            OpenGL.glBufferSubDataARB(this.field7626, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILvr;)Z")
    public static final boolean method3096(int arg0, class187 arg1) {
        if (arg0 < 71) {
            field7629 = 1.9900331F;
        }
        field7634++;
        return class478.field6908 == arg1 || class271.field3659 == arg1 || class270.field3637 == arg1 || class232.field3236 == arg1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static void method3097(byte arg0) {
        if (arg0 >= -48) {
            method3096(-90, null);
        }
        field7635 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lpg;ILjaggl/memory/NativeBuffer;IZ)V")
    public class519(class333 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field7630 = arg3;
        this.field7624 = arg4;
        this.field7626 = arg1;
        this.field7627 = arg0;
        OpenGL.glGenBuffersARB(1, class195.field2854, 0);
        this.field7628 = class195.field2854[0];
        this.method1348((byte) 113);
        OpenGL.glBufferDataARBa(arg1, this.field7630, arg2.method2841(), this.field7624 ? 35040 : 35044);
        this.field7627.field4740 += this.field7630;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public abstract void method1348(byte arg0);
}
