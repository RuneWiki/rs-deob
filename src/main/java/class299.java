import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class299 extends class223 {

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    private final int field4863;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    private final int field4856;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private final int field4864;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    private final int field4855;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "[I")
    public static int[] field4858 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[Lnf;")
    public static class16[] field4857 = new class16[50];

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Lph;")
    public static class229 field4861 = class266.method1858(":", 0);

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "Lo;")
    public static class227 field4866 = new class227();

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lph;")
    public static class229 field4868;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 4)
    public static void method2010(int arg0) {
        field4857 = null;
        field4866 = null;
        field4858 = null;
        field4861 = null;
        if (arg0 < 65) {
            method2010(38);
        }
        field4868 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([II)[I", line = 18)
    public static final int[] method2011(int[] arg0, int arg1) {
        field4860++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        if (arg1 == -27018) {
            class42.method316(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIIII)V", line = 43)
    public class299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4863 = arg3;
        this.field4856 = arg1;
        this.field4864 = arg2;
        this.field4855 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V", line = 62)
    public final void method1391(int arg0, int arg1, int arg2) {
        field4859++;
        int var4 = this.field4855 * arg2 >> 12;
        if (arg0 < 83) {
            field4866 = (class227) null;
        }
        int var5 = this.field4864 * arg2 >> 12;
        int var6 = this.field4856 * arg1 >> 12;
        int var7 = this.field4863 * arg1 >> 12;
        class53.method363(var6, this.field3665, var7, var5, 105, this.field3674, var4, this.field3669);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V", line = 87)
    public final void method1396(int arg0, int arg1, int arg2) {
        if (arg1 >= -66) {
            this.method1392(true, 48, -91);
        }
        field4853++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z", line = 107)
    public static final boolean method2012(int arg0, int arg1) {
        if (arg0 != 1) {
            method2013(23, true);
        }
        field4854++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V", line = 118)
    public static final void method2013(int arg0, boolean arg1) {
        field4865++;
        if (class217.field3561 == arg1) {
            return;
        }
        if (arg0 != 22893) {
            method2013(-60, false);
        }
        class217.field3561 = arg1;
        class74.method568(100);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII)V", line = 141)
    public final void method1392(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4855 * arg2 >> 12;
        field4862++;
        int var5 = this.field4864 * arg2 >> 12;
        int var6 = this.field4856 * arg1 >> 12;
        if (!arg0) {
            method2011((int[]) null, 28);
        }
        int var7 = this.field4863 * arg1 >> 12;
        class313.method2124(this.field3669, var7, var5, var6, -113, var4);
    }
}
