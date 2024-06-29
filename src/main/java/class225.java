import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class225 extends class53 implements class180 {

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Lsb;")
    private class280 field2871;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Lvt;")
    public static class344 field2872 = new class344("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Lbv;")
    public static class568 field2879 = new class568();

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "[I")
    public static int[] field2880;

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lph;Lsb;Z)V")
    public class225(class442 arg0, class280 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2871 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Lsb;")
    public final class280 method1108(int arg0) {
        field2869++;
        return arg0 > -123 ? null : this.field2871;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method297(byte arg0, boolean arg1) {
        field2876++;
        return arg0 == 52 ? super.method297((byte) 52, arg1) : null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public final void method296(byte arg0) {
        super.method296(arg0);
        field2873++;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field2872 = null;
        field2880 = null;
        if (arg0 <= 88) {
            method1432(false, 1.2886136F, 1.0546094F, 0.7243585F);
        }
        field2879 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lph;B[BI)Lob;")
    public static final class385 method1431(class442 arg0, byte arg1, byte[] arg2, int arg3) {
        field2877++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class567.field7931, 0);
        if (class567.field7931[0] != -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        } else if (arg1 <= 91) {
            return null;
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class385(arg0, arg3, var4);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public final void method292(boolean arg0, int arg1) {
        field2870++;
        super.method292(arg0, this.field2871.field3654 * arg1);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        if (arg0 != 7224) {
            this.method296((byte) 47);
        }
        field2874++;
        return super.method288(7224);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        field2875++;
        if (super.method290(arg0)) {
            return true;
        } else {
            if (arg0 != 22526) {
                this.method1108(-25);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZFFF)I")
    public static final int method1432(boolean arg0, float arg1, float arg2, float arg3) {
        field2878++;
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (!arg0) {
            field2872 = null;
        }
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var5 > var4 && var6 < var5) {
            return (arg3 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
