import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class256 extends class675 {

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "Z")
    private boolean field3603 = false;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "Lee;")
    private class703 field3596;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "Lpb;")
    public static class680 field3599;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(B)V", line = 6)
    public static void method1684(byte arg0) {
        field3599 = null;
        if (arg0 >= -66) {
            field3599 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZZ)V", line = 17)
    public final void method1350(boolean arg0, boolean arg1) {
        ++field3601;
        if (arg1) {
            field3599 = null;
        }
        super.field9618.method1835(arg1, 8448, 7681);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)V", line = 29)
    public final void method1351(int arg0, int arg1, int arg2) {
        ++field3600;
        if (arg1 != 8865) {
            this.method1351(72, 84, -112);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V", line = 44)
    public final void method1354(boolean arg0, int arg1) {
        ++field3602;
        if (arg1 != -24765) {
            this.field3603 = false;
        }
        class314 var3 = super.field9618.method1848((byte) 121);
        if (this.field3596 != null && var3 != null && arg0) {
            this.field3596.method3982((byte) -120, '\u0000');
            super.field9618.method1825(1, -34);
            super.field9618.method1840(var3, 2205);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field9618.field4200.method4027(-125), 0);
            OpenGL.glMatrixMode(5888);
            super.field9618.method1825(0, 114);
            this.field3603 = true;
        } else {
            super.field9618.method1828((byte) -12, 34168, 770, 0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 71)
    public final void method1353(byte arg0) {
        ++field3594;
        if (arg0 == 52) {
            if (this.field3603) {
                this.field3596.method3982((byte) -120, '\u0001');
                super.field9618.method1825(1, 114);
                super.field9618.method1840((class599) null, 2205);
                super.field9618.method1825(0, -90);
            } else {
                super.field9618.method1828((byte) -110, 5890, 770, 0);
            }
            super.field9618.method1835(false, 8448, 8448);
            this.field3603 = false;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLcb;I)Lsja;", line = 94)
    public static final class11 method1685(boolean arg0, class544 arg1, int arg2) {
        ++field3598;
        if (!arg0) {
            return null;
        } else {
            byte[] var3 = arg1.method3149(arg2, -99);
            return var3 == null ? null : new class11(var3);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lkv;)V", line = 111)
    public class256(class280 arg0) {
        super(arg0);
        if (arg0.field4258) {
            this.field3596 = new class703(arg0, 2);
            this.field3596.method3980(0, -27400);
            super.field9618.method1825(1, 107);
            super.field9618.method1835(false, 34165, 7681);
            super.field9618.method1842(770, -128, 2, 34168);
            super.field9618.method1828((byte) -58, 34167, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field9618.method1825(0, 112);
            this.field3596.method3978(0);
            this.field3596.method3980(1, -27400);
            super.field9618.method1825(1, 117);
            super.field9618.method1835(false, 8448, 8448);
            super.field9618.method1842(770, -103, 2, 34166);
            super.field9618.method1828((byte) -24, 5890, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field9618.method1825(0, -115);
            this.field3596.method3978(0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lfia;IZ)V", line = 150)
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        super.field9618.method1840(arg0, 2205);
        ++field3595;
        super.field9618.method1889(false, arg1);
        if (!arg2) {
            field3599 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)Z", line = 162)
    public final boolean method1347(byte arg0) {
        if (arg0 < 105) {
            method1686(-61, -119, (byte) -14, -45, true, -17, 12);
        }
        ++field3604;
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIBIZII)V", line = 173)
    public static final void method1686(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if ((!arg4 ? class145.field1852.field9029.method978((byte) -79) : class145.field1852.field9009.method978((byte) -115)) != 0 && arg5 != 0 && ~class636.field8961 > -51 && arg3 != -1) {
            class458.field6558[class636.field8961++] = new class472((byte) (arg4 ? 3 : 2), arg3, arg5, arg1, arg6, 0, arg0, (class547) null);
        }
        ++field3593;
        if (arg2 < 80) {
            field3599 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BZ)V", line = 191)
    public static final void method1687(byte arg0, boolean arg1) {
        if (arg0 != 60) {
            method1686(-24, -1, (byte) -62, -125, true, 48, 0);
        }
        ++field3597;
        for (class315 var2 = (class315) class686.field9727.method2508((byte) 113); var2 != null; var2 = (class315) class686.field9727.method2505((byte) -55)) {
            if (var2.field4688 != null) {
                class229.field3307.method3439(var2.field4688);
                var2.field4688 = null;
            }
            if (var2.field4678 != null) {
                class229.field3307.method3439(var2.field4678);
                var2.field4678 = null;
            }
            var2.method3117((byte) -121);
        }
        if (arg1) {
            for (class315 var3 = (class315) class751.field10412.method2508((byte) 111); var3 != null; var3 = (class315) class751.field10412.method2505((byte) -55)) {
                if (var3.field4688 != null) {
                    class229.field3307.method3439(var3.field4688);
                    var3.field4688 = null;
                }
                var3.method3117((byte) 87);
            }
            for (class315 var4 = (class315) class649.field9134.method382(0); var4 != null; var4 = (class315) class649.field9134.method391(arg0 ^ 25)) {
                if (var4.field4688 != null) {
                    class229.field3307.method3439(var4.field4688);
                    var4.field4688 = null;
                }
                var4.method3117((byte) 102);
            }
        }
    }
}
