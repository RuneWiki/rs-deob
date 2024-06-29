import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class class539 implements class720 {

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
    private boolean field7454 = false;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Z")
    private boolean field7452;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public int field7453;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    private int field7448;

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "Lpq;")
    public class194 field7457;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "I")
    public int field7461;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "Lgca;")
    public static class705 field7451;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "Lgca;")
    public static class705 field7444 = field7451 = new class705(false);

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "Lqk;")
    public static class1 field7460 = new class1(33, 3);

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "I")
    public static int field7463 = 0;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "Lae;")
    public static class283 field7458;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V", line = 7)
    private final void method3199(boolean arg0) {
        field7442++;
        if (arg0) {
            return;
        }
        this.field7457.method1219((byte) 76, this);
        if (this.field7454) {
            OpenGL.glTexParameteri(this.field7453, 10241, this.field7452 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7453, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7453, 10241, this.field7452 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7453, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!wha", name = "finalize", descriptor = "()V", line = 29)
    protected final void finalize() throws Throwable {
        this.method3206(false);
        field7455++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)I", line = 39)
    private final int method3200(byte arg0) {
        field7459++;
        if (arg0 <= 4) {
            this.field7453 = -111;
        }
        int var2 = this.field7457.method1257((byte) -74, this.field7461) * this.field7448;
        return this.field7452 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZZ)V", line = 52)
    public final void method3201(boolean arg0, boolean arg1) {
        if (arg1 != this.field7454) {
            this.field7454 = arg1;
            this.method3199(false);
        }
        field7443++;
        if (!arg0) {
            this.method3199(false);
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)Z", line = 70)
    public final boolean method3202(byte arg0) {
        field7441++;
        if (!this.field7457.field2695) {
            if (arg0 != -83) {
                this.field7457 = null;
            }
            return false;
        }
        int var2 = this.method3200((byte) 36);
        this.field7457.method1219((byte) 96, this);
        OpenGL.glGenerateMipmapEXT(this.field7453);
        this.field7452 = true;
        this.method3199(false);
        this.method3208((byte) -99, var2);
        return true;
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V", line = 95)
    public static void method3203(int arg0) {
        field7458 = null;
        field7451 = null;
        int var1 = -27 % ((19 - arg0) / 48);
        field7444 = null;
        field7460 = null;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V", line = 116)
    public static final void method3204(int arg0, int arg1) {
        field7450++;
        if (class718.method4015(arg1, 73) && arg0 == 0) {
            class133.method900(class609.field8594[arg1], -1, false);
        }
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)I", line = 130)
    public final int method3205(int arg0) {
        if (arg0 >= -27) {
            this.field7452 = false;
        }
        field7445++;
        return this.field7456;
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)V", line = 143)
    public final void method3206(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field7456 > 0) {
            this.field7457.method1256(this.field7456, (byte) -92, this.method3200((byte) 105));
            this.field7456 = 0;
        }
        field7449++;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IZ)V", line = 162)
    public final void method3207(int arg0, boolean arg1) {
        field7446++;
        if (this.field7452 != arg1) {
            int var3 = this.method3200((byte) 110);
            this.field7452 = true;
            this.method3199(false);
            this.method3208((byte) -101, var3);
        }
        if (arg0 != 0) {
            field7463 = -36;
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lpq;IIIZ)V", line = 197)
    public class539(class194 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7452 = arg4;
        this.field7453 = arg1;
        this.field7448 = arg3;
        this.field7457 = arg0;
        this.field7461 = arg2;
        OpenGL.glGenTextures(1, class764.field10477, 0);
        this.field7456 = class764.field10477[0];
        this.method3208((byte) -49, 0);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V", line = 215)
    private final void method3208(byte arg0, int arg1) {
        this.field7457.field2626 -= arg1;
        field7447++;
        int var3 = 94 % ((19 - arg0) / 47);
        this.field7457.field2626 += this.method3200((byte) 35);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public abstract void method1737(int arg0);
}
