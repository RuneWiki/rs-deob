import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class class65 {

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "Z")
    private boolean field892;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    private int field883;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "Lqj;")
    public class548 field885;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
    public static boolean field881 = false;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field884 = -1;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Lla;")
    public static class413 field889;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILvda;)Z")
    public static final boolean method386(int arg0, class339 arg1) {
        field887++;
        class441 var2 = class428.field5352.method3138((byte) 34, arg1.method65((byte) 127));
        if (~var2.field5519 == arg0) {
            return true;
        } else {
            class542 var3 = class48.field671.method3753(var2.field5519, (byte) 65);
            return var3.field7239 == -1 ? true : var3.method2926((byte) -127);
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
    public static void method387(int arg0) {
        field889 = null;
        if (arg0 < 103) {
            field889 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B[BI)V")
    public final void method388(byte arg0, byte[] arg1, int arg2) {
        this.method389((byte) -54);
        field888++;
        if (this.field891 >= arg2) {
            OpenGL.glBufferSubDataARBub(this.field883, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field883, arg2, arg1, 0, this.field892 ? 35040 : 35044);
            this.field885.field7497 += arg2 - this.field891;
            this.field891 = arg2;
        }
        int var4 = -8 % ((arg0 - 77) / 38);
    }

    @OriginalMember(owner = "client!pv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field882++;
        this.field885.method2990(8448, this.field886, this.field891);
        super.finalize();
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
    public abstract void method389(byte arg0);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
    public static final boolean method390(int arg0, int arg1, int arg2) {
        if (arg0 != 35044) {
            method387(-43);
        }
        field880++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lqj;I[BIZ)V")
    public class65(class548 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field891 = arg3;
        this.field892 = arg4;
        this.field883 = arg1;
        this.field885 = arg0;
        OpenGL.glGenBuffersARB(1, class241.field3008, 0);
        this.field886 = class241.field3008[0];
        this.method389((byte) -54);
        OpenGL.glBufferDataARBub(arg1, this.field891, arg2, 0, this.field892 ? 35040 : 35044);
        this.field885.field7497 += this.field891;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lqj;ILjaclib/memory/Buffer;IZ)V")
    public class65(class548 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field892 = arg4;
        this.field891 = arg3;
        this.field883 = arg1;
        this.field885 = arg0;
        OpenGL.glGenBuffersARB(1, class241.field3008, 0);
        this.field886 = class241.field3008[0];
        this.method389((byte) -54);
        OpenGL.glBufferDataARBa(arg1, this.field891, arg2.getAddress(), this.field892 ? 35040 : 35044);
        this.field885.field7497 += this.field891;
    }
}
