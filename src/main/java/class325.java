import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class325 implements class657 {

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Z")
    private boolean field3987 = false;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lvj;")
    public class422 field3991;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "Z")
    private boolean field4003;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Lib;")
    public static class14 field3998 = new class14(8, 1);

    @OriginalMember(owner = "client!av", name = "s", descriptor = "Lsb;")
    public static class305 field4004 = new class305(57, 4);

    @OriginalMember(owner = "client!av", name = "t", descriptor = "Lqg;")
    public static class216 field4005 = new class216("LOCAL", 4);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
    public final void method1830(boolean arg0, int arg1) {
        if (arg1 != 3595) {
            this.method1839(false, (byte) -37);
        }
        field3999++;
        if (this.field4003 != arg0) {
            int var3 = this.method1835(arg1 ^ 0xFFFFF1E6);
            this.field4003 = true;
            this.method1837(-123);
            this.method1832(var3, 0);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
    public final int method1831(byte arg0) {
        if (arg0 > -116) {
            field4005 = null;
        }
        field3986++;
        return this.field3996;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    private final void method1832(int arg0, int arg1) {
        field3989++;
        this.field3991.field5837 -= arg0;
        this.field3991.field5837 += this.method1835(-75);
        if (arg1 != 0) {
            this.method1832(5, 30);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIB)I")
    public static final int method1833(boolean arg0, int arg1, byte arg2) {
        field4001++;
        if (arg0) {
            return 0;
        }
        class628 var3 = class555.method3150(arg1, 0, arg0);
        if (var3 == null) {
            return class552.field7888.method2886(arg1, arg2 ^ 0xFFFFFF8D).field2431;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2 != 14) {
            field4004 = null;
        }
        while (var3.field8858.length > var5) {
            if (var3.field8858[var5] == -1) {
                var4++;
            }
            var5++;
        }
        return var4 + (class552.field7888.method2886(arg1, -53).field2431 - var3.field8858.length);
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
    public final void method1834(byte arg0) {
        int var2 = -99 / ((arg0 - 53) / 61);
        field3995++;
        if (this.field3996 > 0) {
            this.field3991.method2439(this.field3996, this.method1835(-45), 4318);
            this.field3996 = 0;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I")
    private final int method1835(int arg0) {
        if (arg0 > -15) {
            this.method1832(-128, -117);
        }
        field3997++;
        int var2 = this.field3991.method2417(this.field4000, 3553) * this.field4002;
        return this.field4003 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)Z")
    public final boolean method1836(int arg0) {
        field3994++;
        if (!this.field3991.field5948) {
            if (arg0 != 4983) {
                this.field4000 = 77;
            }
            return false;
        }
        int var2 = this.method1835(-30);
        this.field3991.method2396((byte) 36, this);
        OpenGL.glGenerateMipmapEXT(this.field3988);
        this.field4003 = true;
        this.method1837(-111);
        this.method1832(var2, 0);
        return true;
    }

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)V")
    private final void method1837(int arg0) {
        if (arg0 >= -100) {
            this.field4003 = false;
        }
        field3990++;
        this.field3991.method2396((byte) 36, this);
        if (this.field3987) {
            OpenGL.glTexParameteri(this.field3988, 10241, this.field4003 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3988, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3988, 10241, this.field4003 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3988, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)V")
    public static void method1838(int arg0) {
        if (arg0 > -89) {
            method1838(-91);
        }
        field4005 = null;
        field4004 = null;
        field3998 = null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lvj;IIIZ)V")
    public class325(class422 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3991 = arg0;
        this.field4000 = arg2;
        this.field3988 = arg1;
        this.field4003 = arg4;
        this.field4002 = arg3;
        OpenGL.glGenTextures(1, class237.field2951, 0);
        this.field3996 = class237.field2951[0];
        this.method1832(0, 0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZB)V")
    public final void method1839(boolean arg0, byte arg1) {
        if (this.field3987 != arg0) {
            this.field3987 = arg0;
            this.method1837(-104);
        }
        field3993++;
        if (arg1 < 30) {
            method1833(true, 18, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3992++;
        this.method1834((byte) -55);
        super.finalize();
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public abstract void method459(int arg0);
}
