import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class478 implements class233 {

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Z")
    private boolean field6652 = false;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    private int field6658;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
    private boolean field6663;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Lih;")
    public class503 field6649;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public int field6651;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Z")
    public static boolean field6656 = false;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field6653 = 0;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "[I")
    public static int[] field6655 = new int[64];

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Lud;")
    public static class27 field6660;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Loi;")
    public static class53 field6666;

    @OriginalMember(owner = "client!sv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2757(-10909);
        field6659++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)I")
    private final int method2755(int arg0) {
        field6657++;
        int var2 = 118 / ((arg0 + 52) / 49);
        int var3 = this.field6649.method2922(this.field6670, 1319) * this.field6658;
        return this.field6663 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method2756(byte arg0) {
        field6660 = null;
        if (arg0 != 30) {
            field6655 = null;
        }
        field6666 = null;
        field6655 = null;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
    public final void method2757(int arg0) {
        if (this.field6651 > 0) {
            this.field6649.method2932(this.field6651, (byte) 102, this.method2755(arg0 + 11010));
            this.field6651 = 0;
        }
        if (arg0 != -10909) {
            this.field6651 = 44;
        }
        field6669++;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
    public final void method2758(boolean arg0, int arg1) {
        if (arg0 != this.field6663) {
            int var3 = this.method2755(-114);
            this.field6663 = true;
            this.method2763(9984);
            this.method2759(var3, 9729);
        }
        field6661++;
        if (arg1 <= 114) {
            this.field6663 = false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    private final void method2759(int arg0, int arg1) {
        this.field6649.field7326 -= arg0;
        field6668++;
        this.field6649.field7326 += this.method2755(arg1 - 9853);
        if (arg1 != 9729) {
            this.method2763(79);
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(I)I")
    public final int method2760(int arg0) {
        field6650++;
        if (arg0 < 78) {
            this.field6652 = false;
        }
        return this.field6651;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)Z")
    public final boolean method2761(byte arg0) {
        field6665++;
        if (this.field6649.field7432) {
            int var2 = this.method2755(arg0 - 233);
            this.field6649.method2968(this, -76);
            OpenGL.glGenerateMipmapEXT(this.field6667);
            this.field6663 = true;
            this.method2763(9984);
            this.method2759(var2, 9729);
            return true;
        } else if (arg0 == 121) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
    public final void method2762(int arg0, boolean arg1) {
        field6662++;
        if (arg0 != 9728) {
            this.field6651 = 82;
        }
        if (arg1 != this.field6652) {
            this.field6652 = arg1;
            this.method2763(9984);
        }
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(I)V")
    private final void method2763(int arg0) {
        field6664++;
        this.field6649.method2968(this, arg0 ^ 0xFFFFD89B);
        if (arg0 != 9984) {
            method2756((byte) -57);
        }
        if (this.field6652) {
            OpenGL.glTexParameteri(this.field6667, 10241, this.field6663 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6667, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6667, 10241, this.field6663 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6667, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lih;IIIZ)V")
    public class478(class503 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6658 = arg3;
        this.field6667 = arg1;
        this.field6663 = arg4;
        this.field6670 = arg2;
        this.field6649 = arg0;
        OpenGL.glGenTextures(1, class61.field769, 0);
        this.field6651 = class61.field769[0];
        this.method2759(0, 9729);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public abstract void method462(int arg0);
}
