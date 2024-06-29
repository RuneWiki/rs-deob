import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class class292 implements class419 {

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "Z")
    private boolean field3604 = false;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "Z")
    private boolean field3598;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "Lnv;")
    public class417 field3603;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "Z")
    public static boolean field3592;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)I")
    public final int method1734(byte arg0) {
        if (arg0 == -34) {
            field3599++;
            return this.field3589;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)I")
    private final int method1735(int arg0) {
        field3586++;
        if (arg0 > -94) {
            return 118;
        } else {
            int var2 = this.field3603.method2548(-92, this.field3593) * this.field3588;
            return this.field3598 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V")
    public final void method1736(int arg0) {
        if (this.field3589 > 0) {
            this.field3603.method2554(this.field3589, (byte) -9, this.method1735(-102));
            this.field3589 = 0;
        }
        if (arg0 != -30119) {
            this.method1740(-89, (byte) -26);
        }
        field3595++;
    }

    @OriginalMember(owner = "client!tha", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3596++;
        this.method1736(-30119);
        super.finalize();
    }

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)V")
    private final void method1737(int arg0) {
        this.field3603.method2621(-2, this);
        field3597++;
        if (this.field3604) {
            OpenGL.glTexParameteri(this.field3591, 10241, this.field3598 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3591, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3591, 10241, this.field3598 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3591, 10240, 9728);
        }
        if (arg0 != 26050) {
            this.field3604 = true;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZB)V")
    public final void method1738(boolean arg0, byte arg1) {
        if (arg1 != -51) {
            return;
        }
        field3590++;
        if (this.field3598 != arg0) {
            int var3 = this.method1735(-99);
            this.field3598 = true;
            this.method1737(arg1 ^ 0xFFFF9A0F);
            this.method1740(var3, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(II[BIIB)V")
    public static final void method1739(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field3602++;
        if (arg4 <= arg3) {
            return;
        }
        if (arg5 != 91) {
            method1739(8, -28, null, 40, 38, (byte) -43);
        }
        int var6 = arg1 + arg3;
        int var7 = arg4 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)V")
    private final void method1740(int arg0, byte arg1) {
        field3594++;
        this.field3603.field5934 -= arg0;
        int var3 = -69 / ((arg1 + 44) / 59);
        this.field3603.field5934 += this.method1735(-113);
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)Z")
    public final boolean method1741(byte arg0) {
        field3600++;
        if (!this.field3603.field6033) {
            int var3 = 109 / ((-arg0 - 6) / 59);
            return false;
        }
        int var2 = this.method1735(-100);
        this.field3603.method2621(-2, this);
        OpenGL.glGenerateMipmapEXT(this.field3591);
        this.field3598 = true;
        this.method1737(26050);
        this.method1740(var2, (byte) -116);
        return true;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V")
    public final void method1742(boolean arg0, int arg1) {
        field3587++;
        if (arg0 != this.field3604) {
            this.field3604 = arg0;
            this.method1737(26050);
        }
        if (arg1 != 29646) {
            this.field3589 = 56;
        }
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lnv;IIIZ)V")
    public class292(class417 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3598 = arg4;
        this.field3588 = arg3;
        this.field3591 = arg1;
        this.field3593 = arg2;
        this.field3603 = arg0;
        OpenGL.glGenTextures(1, class492.field6997, 0);
        this.field3589 = class492.field6997[0];
        this.method1740(0, (byte) 79);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V")
    public abstract void method66(int arg0);
}
