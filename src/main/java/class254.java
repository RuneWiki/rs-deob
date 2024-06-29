import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public abstract class class254 implements class387 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
    private boolean field3496 = false;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Z")
    private boolean field3503;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "Lpea;")
    public class641 field3510;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field3506 = 0;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field3512 = -1;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "[S")
    public static short[] field3508 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lvi;")
    public static class560 field3498 = new class560(4);

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)I")
    public final int method1587(int arg0) {
        field3505++;
        int var2 = -35 / ((arg0 - 64) / 48);
        return this.field3513;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public final void method1588(byte arg0) {
        field3504++;
        if (this.field3513 > 0) {
            this.field3510.method3563(this.method1594((byte) 105), 1, this.field3513);
            this.field3513 = 0;
        }
        if (arg0 != -122) {
            method1589((byte) 91);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 < -119) {
            field3508 = null;
            field3498 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BZ)V")
    public final void method1590(byte arg0, boolean arg1) {
        if (arg0 != 106) {
            return;
        }
        field3514++;
        if (this.field3503 != arg1) {
            int var3 = this.method1594((byte) 83);
            this.field3503 = true;
            this.method1593((byte) 62);
            this.method1591(98, var3);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
    private final void method1591(int arg0, int arg1) {
        this.field3510.field8955 -= arg1;
        if (arg0 < 8) {
            field3498 = null;
        }
        field3509++;
        this.field3510.field8955 += this.method1594((byte) 116);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V")
    public final void method1592(int arg0, boolean arg1) {
        if (this.field3496 != arg1) {
            this.field3496 = arg1;
            this.method1593((byte) 62);
        }
        int var3 = -12 % ((arg0 - 25) / 57);
        field3499++;
    }

    @OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1588((byte) -122);
        field3497++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)V")
    private final void method1593(byte arg0) {
        field3507++;
        this.field3510.method3553((byte) 79, this);
        if (arg0 != 62) {
            this.field3500 = -15;
        }
        if (this.field3496) {
            OpenGL.glTexParameteri(this.field3500, 10241, this.field3503 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3500, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3500, 10241, this.field3503 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3500, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)I")
    private final int method1594(byte arg0) {
        field3501++;
        int var2 = -44 / ((arg0 + 32) / 51);
        int var3 = this.field3510.method3555(7745, this.field3502) * this.field3511;
        return this.field3503 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lpea;IIIZ)V")
    public class254(class641 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3500 = arg1;
        this.field3503 = arg4;
        this.field3510 = arg0;
        this.field3502 = arg2;
        this.field3511 = arg3;
        OpenGL.glGenTextures(1, class140.field1792, 0);
        this.field3513 = class140.field1792[0];
        this.method1591(62, 0);
    }

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "(B)Z")
    public final boolean method1595(byte arg0) {
        if (arg0 != -99) {
            return true;
        }
        field3495++;
        if (!this.field3510.field9013) {
            return false;
        }
        int var2 = this.method1594((byte) 79);
        this.field3510.method3553((byte) 72, this);
        OpenGL.glGenerateMipmapEXT(this.field3500);
        this.field3503 = true;
        this.method1593((byte) 62);
        this.method1591(arg0 ^ 0xFFFFFFD8, var2);
        return true;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public abstract void method545(int arg0);
}
