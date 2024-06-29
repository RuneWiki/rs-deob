import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class374 extends class151 {

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field5340;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "F")
    public float field5339;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "F")
    public float field5341;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    public boolean field5342;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIIIIIZ)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5340 = arg4;
        this.field5339 = (float) arg4 / (float) arg6;
        this.field5338 = arg3;
        this.field5341 = (float) arg3 / (float) arg5;
        this.field5342 = false;
        this.method733(false, false);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIIII[BI)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5340 = arg3;
        this.field5338 = arg2;
        this.method732(0, 0, arg2, arg3, arg6, arg7, 0, 0, true);
        this.field5342 = false;
        this.field5341 = (float) arg2 / (float) arg4;
        this.field5339 = (float) arg3 / (float) arg5;
        this.method733(false, false);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIII[I)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5338 = arg1;
        this.field5340 = arg2;
        this.method729(0, 0, arg1, arg2, arg5, 0, 0, true);
        this.field5341 = (float) arg1 / (float) arg3;
        this.field5342 = false;
        this.field5339 = (float) arg2 / (float) arg4;
        this.method733(false, false);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIIIZ[BI)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5340 = arg4;
        this.field5338 = arg3;
        if (this.field56 == 34037) {
            this.field5339 = (float) arg4;
            this.field5341 = (float) arg3;
            this.field5342 = false;
        } else {
            this.field5341 = this.field5339 = 1.0F;
            this.field5342 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIILic;I)Llm;")
    public static final class374 method2258(int arg0, int arg1, int arg2, int arg3, class246 arg4, int arg5) {
        if (arg2 != 34037) {
            return (class374) null;
        } else if (!arg4.field3422 && (!class234.method1292(arg2 ^ 0xD6F3, arg3) || !class234.method1292(20998, arg5))) {
            return arg4.field3386 ? new class374(arg4, 34037, arg1, arg0, arg3, arg5, true) : new class374(arg4, arg1, arg0, arg3, arg5, class93.method459(-719824240, arg3), class93.method459(-719824240, arg5), true);
        } else {
            return new class374(arg4, 3553, arg1, arg0, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIIZ[I)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5338 = arg2;
        this.field5340 = arg3;
        if (this.field56 == 34037) {
            this.field5339 = (float) arg3;
            this.field5341 = (float) arg2;
            this.field5342 = false;
        } else {
            this.field5342 = true;
            this.field5341 = this.field5339 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lic;IIIIIZ)V")
    private class374(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field5338 = arg4;
        this.field5340 = arg5;
        if (this.field56 == 34037) {
            this.field5342 = false;
            this.field5339 = (float) arg5;
            this.field5341 = (float) arg4;
        } else {
            this.field5341 = this.field5339 = 1.0F;
            this.field5342 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB[BLic;ZII)Llm;")
    public static final class374 method2259(int arg0, int arg1, byte arg2, byte[] arg3, class246 arg4, boolean arg5, int arg6, int arg7) {
        if (arg2 != -70) {
            method2260(-61, (class246) null, 93, (int[]) null, 65, true);
        }
        if (!arg4.field3422 && (!class234.method1292(arg2 ^ 0xFFFFADBC, arg1) || !class234.method1292(20998, arg7))) {
            return arg4.field3386 ? new class374(arg4, 34037, arg6, arg1, arg7, arg5, arg3, arg0) : new class374(arg4, arg6, arg1, arg7, class93.method459(-719824240, arg1), class93.method459(-719824240, arg7), arg3, arg0);
        } else {
            return new class374(arg4, 3553, arg6, arg1, arg7, arg5, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILic;I[IIZ)Llm;")
    public static final class374 method2260(int arg0, class246 arg1, int arg2, int[] arg3, int arg4, boolean arg5) {
        if (arg4 != -2026) {
            return (class374) null;
        } else if (!arg1.field3422 && (!class234.method1292(20998, arg2) || !class234.method1292(20998, arg0))) {
            return arg1.field3386 ? new class374(arg1, 34037, arg2, arg0, arg5, arg3) : new class374(arg1, arg2, arg0, class93.method459(-719824240, arg2), class93.method459(-719824240, arg0), arg3);
        } else {
            return new class374(arg1, 3553, arg2, arg0, arg5, arg3);
        }
    }
}
