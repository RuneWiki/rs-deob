import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 extends class286 {

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "F")
    public float field718;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "F")
    public float field722;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "Z")
    public boolean field719;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "Lpi;")
    public static class342 field721 = new class342("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V", line = 6)
    public static void method404(byte arg0) {
        if (arg0 != 5) {
            method405();
        }
        field721 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIII[I)V", line = 17)
    public class39(class303 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field723 = arg1;
        this.field720 = arg2;
        this.method1822(arg5, 0, 0, 0, 10590, arg1, true, arg2, 0);
        this.field718 = (float) arg1 / (float) arg3;
        this.field722 = (float) arg2 / (float) arg4;
        this.field719 = false;
        this.method1818(false, (byte) 105, false);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIIIZ[BI)V", line = 31)
    public class39(class303 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field723 = arg3;
        this.field720 = arg4;
        if (super.field7272 != 34037) {
            this.field719 = true;
            this.field718 = this.field722 = 1.0F;
        } else {
            this.field719 = false;
            this.field722 = (float) arg4;
            this.field718 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIIZ[I)V", line = 52)
    public class39(class303 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field723 = arg2;
        this.field720 = arg3;
        if (super.field7272 != 34037) {
            this.field719 = true;
            this.field718 = this.field722 = 1.0F;
        } else {
            this.field718 = (float) arg2;
            this.field722 = (float) arg3;
            this.field719 = false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIIII[BI)V", line = 74)
    public class39(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field723 = arg2;
        this.field720 = arg3;
        this.method1821(true, arg2, -120, arg3, 0, 0, 0, arg6, arg7, 0);
        this.field718 = (float) arg2 / (float) arg4;
        this.field719 = false;
        this.field722 = (float) arg3 / (float) arg5;
        this.method1818(false, (byte) 126, false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 89)
    public static final void method405() {
        if (class40.field733 != null) {
            for (int var0 = 0; var0 < class40.field733.length; ++var0) {
                for (int var1 = 0; var1 < class151.field2408; ++var1) {
                    for (int var2 = 0; var2 < class261.field3792; ++var2) {
                        if (class40.field733[var0][var1][var2] != null) {
                            class40.field733[var0][var1][var2].method2571(-1012);
                        }
                        class40.field733[var0][var1][var2] = null;
                    }
                }
            }
        }
        class40.field733 = null;
        class43.field829 = null;
        if (class268.field3870 != null) {
            for (int var3 = 0; var3 < class268.field3870.length; ++var3) {
                for (int var4 = 0; var4 < class151.field2408; ++var4) {
                    for (int var5 = 0; var5 < class261.field3792; ++var5) {
                        if (class268.field3870[var3][var4][var5] != null) {
                            class268.field3870[var3][var4][var5].method2571(-1012);
                        }
                        class268.field3870[var3][var4][var5] = null;
                    }
                }
            }
        }
        class268.field3870 = null;
        class335.field5061 = null;
        class380.field5761 = null;
        class88.field1546 = null;
        class441.field6585 = 0;
        if (class85.field1468 != null) {
            for (int var6 = 0; var6 < class441.field6585; ++var6) {
                class85.field1468[var6] = null;
            }
        }
        if (class123.field1993 != null) {
            for (int var7 = 0; var7 < class256.field3696; ++var7) {
                class123.field1993[var7] = null;
            }
            class256.field3696 = 0;
        }
        if (class448.field6723 != null) {
            for (int var8 = 0; var8 < class161.field2494; ++var8) {
                class448.field6723[var8] = null;
            }
            for (int var9 = 0; var9 < class190.field2830; ++var9) {
                for (int var10 = 0; var10 < class151.field2408; ++var10) {
                    for (int var11 = 0; var11 < class261.field3792; ++var11) {
                        class217.field3128[var9][var10][var11] = 0L;
                    }
                }
            }
            class161.field2494 = 0;
        }
        class504.field7445 = null;
        class489.method2910((byte) -120);
        class221.field3167.method1637(25831);
        class407.field6111 = null;
        class98.field1633 = null;
        class360.field5465 = null;
        class318.field4777 = null;
        class65.field1126 = null;
        class95.field1609 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIIIIZ)V", line = 232)
    public class39(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field720 = arg5;
        this.field723 = arg4;
        if (super.field7272 != 34037) {
            this.field719 = true;
            this.field718 = this.field722 = 1.0F;
        } else {
            this.field722 = (float) arg5;
            this.field719 = false;
            this.field718 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lvj;IIIIIIZ)V", line = 258)
    public class39(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field723 = arg3;
        this.field719 = false;
        this.field718 = (float) arg3 / (float) arg5;
        this.field722 = (float) arg4 / (float) arg6;
        this.field720 = arg4;
        this.method1818(false, (byte) 113, false);
    }
}
