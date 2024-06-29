import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class33 extends class683 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    public static int[] field401 = new int[3];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "F")
    public static float field405;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V", line = 3)
    public final void method267(int arg0, int arg1, int arg2) {
        ++field398;
        int var4 = this.field407 * arg2 >> 12;
        int var5 = this.field409 * arg0 >> 12;
        if (arg1 != 1) {
            this.field400 = 73;
        }
        int var6 = this.field411 * arg2 >> 12;
        int var7 = this.field399 * arg0 >> 12;
        int var8 = this.field400 * arg2 >> 12;
        int var9 = this.field396 * arg0 >> 12;
        int var10 = this.field403 * arg2 >> 12;
        int var11 = this.field408 * arg0 >> 12;
        class546.method3161(var4, super.field9679, var5, var11, var6, var9, -67, var8, var7, var10);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 33)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field403 = arg6;
        this.field396 = arg5;
        this.field411 = arg2;
        this.field399 = arg3;
        this.field409 = arg1;
        this.field400 = arg4;
        this.field408 = arg7;
        this.field407 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)V", line = 58)
    public final void method268(boolean arg0, int arg1, int arg2) {
        ++field406;
        if (!arg0) {
            this.method269(-8, true, -5);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V", line = 72)
    public final void method269(int arg0, boolean arg1, int arg2) {
        ++field397;
        if (!arg1) {
            this.method267(97, -110, -23);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIII)V", line = 82)
    public static final void method270(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field404;
        int var5 = 48 / ((arg1 - -56) / 40);
        class371 var6 = class490.method2867((byte) -106, 10, (long) arg0);
        var6.method2212(-101);
        var6.field5225 = arg4;
        var6.field5232 = arg2;
        var6.field5233 = arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIBI)Lcv;", line = 100)
    public static final class27 method271(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        ++field402;
        class27 var5 = new class27();
        var5.field285 = arg2;
        var5.field284 = arg0;
        class37.field437.method4252(false, var5, (long) arg4);
        class654.method3678(-11954, arg0);
        class519 var6 = class604.method3506(arg4, 255);
        if (var6 != null) {
            class172.method1268(var6, -77);
        }
        if (class284.field4182 != null) {
            class172.method1268(class284.field4182, -112);
            class284.field4182 = null;
        }
        class313.method1910((byte) 100);
        if (var6 != null) {
            class597.method3483(false, !arg1, var6);
        }
        if (!arg1) {
            class46.method354(arg0);
        }
        if (arg3 != -104) {
            method272(-92);
        }
        if (!arg1 && class379.field5314 != -1) {
            class411.method2416(class379.field5314, 1, (byte) -49);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 139)
    public static void method272(int arg0) {
        if (arg0 == -7549) {
            field401 = null;
        }
    }
}
