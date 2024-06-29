import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class225 extends class296 {

    @OriginalMember(owner = "client!dea", name = "O", descriptor = "F")
    public float field3371;

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "Z")
    public boolean field3366;

    @OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "F")
    public float field3365;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!dea", name = "M", descriptor = "Lsb;")
    public static class266 field3369 = new class266(62, 4);

    @OriginalMember(owner = "client!dea", name = "Q", descriptor = "Llk;")
    public static class545 field3373 = null;

    @OriginalMember(owner = "client!dea", name = "P", descriptor = "Lqfa;")
    public static class85 field3372 = new class85(114, 9);

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!dea", name = "L", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        field3373 = null;
        if (arg0 == 113) {
            field3369 = null;
            field3372 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIII)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3371 = (float) arg2 / (float) arg4;
        this.field3366 = false;
        this.field3370 = arg2;
        this.field3365 = (float) arg3 / (float) arg5;
        this.field3363 = arg3;
        this.method1971(false, -108, false);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIIIIZ)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3365 = (float) arg4 / (float) arg6;
        this.field3370 = arg3;
        this.field3371 = (float) arg3 / (float) arg5;
        this.field3363 = arg4;
        this.field3366 = false;
        this.method1971(false, -128, false);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lqu;Z)Z")
    public static final boolean method1537(class83 arg0, boolean arg1) {
        ++field3367;
        class56 var2 = class237.field3521.method3515(arg0.method841((byte) 52), 50);
        if (var2.field1233 == -1) {
            return true;
        } else {
            if (arg1) {
                method1538((Throwable) null, (String) null);
            }
            class661 var3 = class597.field8568.method2803(var2.field1233, -28997);
            return var3.field9526 == -1 ? true : var3.method3765((byte) -126);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIIIZ)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3370 = arg4;
        this.field3363 = arg5;
        if (super.field6979 != 34037) {
            this.field3371 = this.field3365 = 1.0F;
            this.field3366 = true;
        } else {
            this.field3366 = false;
            this.field3365 = (float) arg5;
            this.field3371 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIII[BI)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3363 = arg3;
        this.field3370 = arg2;
        this.method1970(-3159, 0, 0, 0, arg7, 0, arg3, arg2, true, arg6);
        this.field3371 = (float) arg2 / (float) arg4;
        this.field3365 = (float) arg3 / (float) arg5;
        this.field3366 = false;
        this.method1971(false, -127, false);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIII)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3370 = arg3;
        this.field3363 = arg4;
        if (~super.field6979 == -34038) {
            this.field3366 = false;
            this.field3365 = (float) arg4;
            this.field3371 = (float) arg3;
        } else {
            this.field3371 = this.field3365 = 1.0F;
            this.field3366 = true;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIZ[I)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field3370 = arg2;
        this.field3363 = arg3;
        if (~super.field6979 == -34038) {
            this.field3371 = (float) arg2;
            this.field3366 = false;
            this.field3365 = (float) arg3;
        } else {
            this.field3371 = this.field3365 = 1.0F;
            this.field3366 = true;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIIIZ[BI)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3370 = arg3;
        if (super.field6979 != 34037) {
            this.field3371 = this.field3365 = 1.0F;
            this.field3366 = true;
        } else {
            this.field3371 = (float) arg3;
            this.field3366 = false;
            this.field3365 = (float) arg4;
        }
        this.field3363 = arg4;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ldi;")
    public static final class112 method1538(Throwable arg0, String arg1) {
        ++field3368;
        class112 var2;
        if (arg0 instanceof class112) {
            var2 = (class112) arg0;
            var2.field2016 = var2.field2016 + ' ' + arg1;
        } else {
            var2 = new class112(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(II)Z")
    public static final boolean method1539(int arg0, int arg1) {
        ++field3364;
        if (class553.field7840[arg0]) {
            return true;
        } else if (!class38.field1055.method2221(arg0, true)) {
            return false;
        } else {
            int var2 = class38.field1055.method2236(arg0, 0);
            if (arg1 != 4) {
                method1537((class83) null, false);
            }
            if (~var2 == -1) {
                class553.field7840[arg0] = true;
                return true;
            } else {
                if (class156.field2667[arg0] == null) {
                    class156.field2667[arg0] = new class545[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class156.field2667[arg0][var3] == null) {
                        byte[] var4 = class38.field1055.method2216(arg0, var3, true);
                        if (var4 != null) {
                            class545 var5 = class156.field2667[arg0][var3] = new class545();
                            var5.field7755 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method3138(arg1 ^ 5, new class61(var4));
                        }
                    }
                }
                class553.field7840[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lus;IIII[I)V")
    public class225(class1 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3370 = arg1;
        this.field3363 = arg2;
        this.method1968(0, arg5, arg1, 0, true, arg2, 0, 0, -1);
        this.field3366 = false;
        this.field3371 = (float) arg1 / (float) arg3;
        this.field3365 = (float) arg2 / (float) arg4;
        this.method1971(false, -109, false);
    }
}
