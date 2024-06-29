import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class577 extends class521 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Llba;")
    private class468 field8418;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ltm;")
    private class327 field8419;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Loi;")
    private class63 field8426;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
    public final void method449(int arg0, boolean arg1) {
        super.field7319.method2429(class402.field5281, class2.field7, 25);
        ++field8423;
        if (arg0 != 256) {
            this.field8418 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 34336) {
            method3362((class393) null, 19);
        }
        ++field8417;
        if (arg5 >= 1 && ~arg7 <= -2 && class106.field1289 + -2 >= arg5 && ~(class422.field5452 + -2) <= ~arg7) {
            int var9 = arg0;
            if (~arg0 > -4 && class150.method821(arg7, arg5, 0)) {
                var9 = arg0 + 1;
            }
            if (!class565.field8299.method3590(class529.field7429, arg1 + -34338) && !class566.method3298(arg5, var9, class13.field104, (byte) -121, arg7)) {
                return;
            }
            if (class383.field5070 == null) {
                return;
            }
            class103.field1258.method1703(arg5, -1, arg0, arg2, class210.field2560, class309.field3939[arg0], arg7);
            if (~arg6 <= -1) {
                boolean var10 = class565.field8299.field2187;
                class565.field8299.field2187 = true;
                class103.field1258.method1704(var9, arg8, arg0, arg5, arg7, class309.field3939[arg0], arg6, (byte) -123, class210.field2560, arg4, arg3);
                class565.field8299.field2187 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        if (!this.field8418.field6540) {
            int var4 = super.field7319.field5779 % 4000 * 16 / 4000;
            super.field7319.method2459(93, this.field8418.field6541[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field7319.field5779 % 4000) / 4000.0F;
            super.field7319.method2459(66, this.field8418.field6545);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        ++field8420;
        if (arg0 != 0) {
            this.field8426 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            this.field8419 = null;
        }
        ++field8422;
        return this.field8426 != null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ltm;Ldn;Llba;)V")
    public class577(class327 arg0, class438 arg1, class468 arg2) {
        super(arg0);
        this.field8418 = arg2;
        this.field8419 = arg0;
        if (this.field8418.method2729(false) && this.field8419.field4264) {
            this.field8426 = class272.method1520(this.field8419, (byte) 97, arg1.method2570((byte) 83, "transparent_water", "gl"), 34336);
        } else {
            this.field8426 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        ++field8421;
        super.field7319.method2435(0, 77, class289.field3751);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
        if (arg0) {
            this.method446(2, (class440) null, -104);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILhv;I)V")
    public final void method446(int arg0, class440 arg1, int arg2) {
        ++field8424;
        if (arg2 != 26440) {
            this.field8426 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
    public final void method454(byte arg0, boolean arg1) {
        ++field8427;
        if (arg0 != 21) {
            this.field8418 = null;
        }
        OpenGL.glBindProgramARB(34336, this.field8426.field629);
        OpenGL.glEnable(34336);
        super.field7319.method2435(0, 24, class99.field1226);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lbg;I)I")
    public static final int method3362(class393 arg0, int arg1) {
        ++field8425;
        if (class289.field3751 != arg0) {
            if (class167.field2044 == arg0) {
                return 34167;
            } else if (class99.field1226 == arg0) {
                return 34168;
            } else if (class264.field3445 == arg0) {
                return 34166;
            } else if (arg1 != 34167) {
                return 111;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 5890;
        }
    }
}
