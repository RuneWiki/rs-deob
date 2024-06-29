import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class396 implements class249 {

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Z")
    private boolean field5809 = false;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    private int field5812;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Z")
    private boolean field5814;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lfd;")
    public class365 field5800;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public int field5811;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lbg;")
    public static class324 field5797;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lla;")
    public static class314 field5802;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
    private final void method2419(byte arg0, int arg1) {
        this.field5800.field5318 -= arg1;
        if (arg0 != -19) {
            this.field5814 = false;
        }
        field5799++;
        this.field5800.field5318 += this.method2424(3);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    private final void method2420(byte arg0) {
        int var2 = -123 % ((-arg0 - 49) / 53);
        this.field5800.method2188((byte) 78, this);
        field5810++;
        if (this.field5809) {
            OpenGL.glTexParameteri(this.field5801, 10241, this.field5814 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5801, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5801, 10241, this.field5814 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5801, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZ)V")
    public final void method2421(int arg0, boolean arg1) {
        field5813++;
        int var3 = -117 % ((48 - arg0) / 32);
        if (this.field5809 != arg1) {
            this.field5809 = arg1;
            this.method2420((byte) -118);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Luu;I)V")
    public static final void method2422(class188 arg0, int arg1) {
        field5806++;
        if (!class453.field6671) {
            return;
        }
        if (arg0.field2649 != null) {
            class188 var2 = class274.method1766(class404.field5977, class219.field3149, (byte) 126);
            if (var2 != null) {
                class125 var3 = new class125();
                var3.field1825 = var2;
                var3.field1830 = arg0;
                var3.field1833 = arg0.field2649;
                class41.method409(var3);
            }
        }
        class479.field7049++;
        class32.method258(-76, class433.field6357);
        class472.field6970.method618(arg0.field2678, (byte) -100);
        class472.field6970.method581(class219.field3149, (byte) 91);
        if (arg1 != 27254) {
            method2427(-89);
        }
        class472.field6970.method611((byte) 67, arg0.field2773);
        class472.field6970.method618(class404.field5977, (byte) 105);
        class472.field6970.method581(arg0.field2617, (byte) 117);
        class472.field6970.method611((byte) 67, class412.field6116);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public final void method2423(int arg0) {
        if (this.field5811 > 0) {
            this.field5800.method2261(this.field5811, (byte) 112, this.method2424(3));
            this.field5811 = 0;
        }
        int var2 = -3 / ((-arg0 - 51) / 47);
        field5808++;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)I")
    private final int method2424(int arg0) {
        field5796++;
        int var2 = this.field5800.method2203(this.field5804, 2) * this.field5812;
        if (arg0 != 3) {
            this.method2426(true);
        }
        return this.field5814 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZZ)V")
    public final void method2425(boolean arg0, boolean arg1) {
        field5805++;
        if (arg0) {
            this.field5804 = 99;
        }
        if (this.field5814 != arg1) {
            int var3 = this.method2424(3);
            this.field5814 = true;
            this.method2420((byte) -119);
            this.method2419((byte) -19, var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)I")
    public final int method2426(boolean arg0) {
        field5803++;
        return arg0 ? this.field5811 : -27;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public static void method2427(int arg0) {
        if (arg0 != 10241) {
            field5797 = null;
        }
        field5802 = null;
        field5797 = null;
    }

    @OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5807++;
        this.method2423(-115);
        super.finalize();
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)Z")
    public static final boolean method2428(boolean arg0) {
        field5798++;
        try {
            return arg0 ? false : class345.method2084(1);
        } catch (IOException var4) {
            class290.method1832((byte) 86);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class169.field2395 == null ? -1 : class169.field2395.method2001(-106)) + "," + (class434.field6366 == null ? -1 : class434.field6366.method2001(-128)) + "," + (class393.field5780 == null ? -1 : class393.field5780.method2001(-119)) + " - " + class26.field314 + "," + (class435.field6375.field1777[0] + class340.field4713) + "," + (class435.field6375.field1778[0] + class476.field7013) + " - ";
            for (int var3 = 0; var3 < class26.field314 && var3 < 50; var3++) {
                var2 = var2 + class85.field1163.field783[var3] + ",";
            }
            class194.method1362(var5, var2, 98);
            class531.method3135(2700);
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
    public final boolean method2429(int arg0) {
        if (arg0 >= -91) {
            return true;
        }
        field5795++;
        if (!this.field5800.field5328) {
            return false;
        }
        int var2 = this.method2424(3);
        this.field5800.method2188((byte) 78, this);
        OpenGL.glGenerateMipmapEXT(this.field5801);
        this.field5814 = true;
        this.method2420((byte) -116);
        this.method2419((byte) -19, var2);
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lfd;IIIZ)V")
    public class396(class365 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5801 = arg1;
        this.field5812 = arg3;
        this.field5804 = arg2;
        this.field5814 = arg4;
        this.field5800 = arg0;
        OpenGL.glGenTextures(1, class17.field200, 0);
        this.field5811 = class17.field200[0];
        this.method2419((byte) -19, 0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public abstract void method1628(int arg0);

    static {
        new class331("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field5815 = -1;
        field5797 = new class324(83, 3);
        field5816 = -1;
    }
}
