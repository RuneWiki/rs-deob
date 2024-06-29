import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class41 {

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Z")
    private boolean field680;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Lok;")
    public class228 field679;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Lga;")
    public static class367 field682;

    @OriginalMember(owner = "client!gs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field679.method1549(this.field683, this.field677, (byte) -38);
        field674++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method459(int arg0, int arg1, int arg2, byte[] arg3) {
        field675++;
        if (arg0 < 27) {
            method462(-54, 83, -3, 36);
        }
        byte[] var4 = new byte[arg2];
        class476.method2792(arg3, arg1, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
    public static void method460(int arg0) {
        field682 = null;
        if (arg0 >= -4) {
            method459(-20, -109, 111, null);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB[B)V")
    public final void method461(int arg0, byte arg1, byte[] arg2) {
        this.method463((byte) -3);
        int var4 = 31 / ((60 - arg1) / 59);
        field678++;
        if (arg0 <= this.field683) {
            OpenGL.glBufferSubDataARBub(this.field684, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field684, arg0, arg2, 0, this.field680 ? 35040 : 35044);
            this.field679.field3423 += arg0 - this.field683;
            this.field683 = arg0;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lok;I[BIZ)V")
    public class41(class228 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field680 = arg4;
        this.field679 = arg0;
        this.field684 = arg1;
        this.field683 = arg3;
        OpenGL.glGenBuffersARB(1, class37.field628, 0);
        this.field677 = class37.field628[0];
        this.method463((byte) -3);
        OpenGL.glBufferDataARBub(arg1, this.field683, arg2, 0, this.field680 ? 35040 : 35044);
        this.field679.field3423 += this.field683;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I")
    public static final int method462(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 24638) {
            return 12;
        }
        field681++;
        int var4 = arg3 / arg0;
        int var5 = arg0 - 1 & arg3;
        int var6 = arg2 / arg0;
        int var7 = arg2 & arg0 - 1;
        int var8 = class182.method1229(var4, var6, (byte) 108);
        int var9 = class182.method1229(var4 + 1, var6, (byte) 108);
        int var10 = class182.method1229(var4, var6 + 1, (byte) 108);
        int var11 = class182.method1229(var4 + 1, var6 + 1, (byte) 108);
        int var12 = class67.method676(var5, arg0, 770344752, var8, var9);
        int var13 = class67.method676(var5, arg0, 770344752, var10, var11);
        return class67.method676(var7, arg0, 770344752, var12, var13);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public abstract void method463(byte arg0);

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lok;ILjaclib/memory/Buffer;IZ)V")
    public class41(class228 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field683 = arg3;
        this.field679 = arg0;
        this.field684 = arg1;
        this.field680 = arg4;
        OpenGL.glGenBuffersARB(1, class37.field628, 0);
        this.field677 = class37.field628[0];
        this.method463((byte) -3);
        OpenGL.glBufferDataARBa(arg1, this.field683, arg2.getAddress(), this.field680 ? 35040 : 35044);
        this.field679.field3423 += this.field683;
    }
}
