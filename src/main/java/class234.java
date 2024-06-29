import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class234 extends class56 {

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Z")
    private boolean field3321 = false;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "Lgs;")
    private class288 field3323;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "Lpg;")
    public static class492 field3320 = new class492(72, 8);

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field3324 = 1407;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
    public final void method380(boolean arg0, int arg1) {
        super.field752.method1776(-30, 7681, 8448);
        if (arg1 < 42) {
            this.field3323 = null;
        }
        ++field3318;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (arg0 > -50) {
            this.field3321 = false;
        }
        if (!this.field3321) {
            super.field752.method1825((byte) 90, 0, 770, 5890);
        } else {
            this.field3323.method1866(13, '\u0001');
            super.field752.method1819(1, (byte) 109);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1819(0, (byte) 120);
        }
        ++field3315;
        super.field752.method1776(-30, 8448, 8448);
        this.field3321 = false;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
    public static void method1586(byte arg0) {
        if (arg0 >= 22) {
            field3320 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lbv;)V")
    public class234(class282 arg0) {
        super(arg0);
        if (arg0.field4199) {
            this.field3323 = new class288(arg0, 2);
            this.field3323.method1864((byte) 117, 0);
            super.field752.method1819(1, (byte) 123);
            super.field752.method1776(-30, 7681, 34165);
            super.field752.method1828(34168, 770, 2, (byte) -122);
            super.field752.method1825((byte) 82, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field752.method1819(0, (byte) 100);
            this.field3323.method1865(-51);
            this.field3323.method1864((byte) 78, 1);
            super.field752.method1819(1, (byte) 95);
            super.field752.method1776(-30, 8448, 8448);
            super.field752.method1828(34166, 770, 2, (byte) -74);
            super.field752.method1825((byte) 108, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field752.method1819(0, (byte) 116);
            this.field3323.method1865(-104);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILjb;)V")
    public static final void method1587(int arg0, int arg1, int arg2, class499 arg3) {
        ++field3316;
        if (arg3 != null) {
            if (arg3.field7362 != null) {
                class199 var4 = new class199();
                var4.field2813 = arg3.field7362;
                var4.field2817 = arg3;
                class291.method1886(var4);
            }
            class57.field764 = arg1;
            if (arg2 < 31) {
                field3320 = null;
            }
            class261.field3635 = arg3.field7440;
            class500.field7455 = true;
            class479.field7008 = arg3.field7340;
            class186.field2616 = arg3.field7312;
            class303.field4468 = arg0;
            class126.field1798 = arg3.field7304;
            class91.field1336 = arg3.field7310;
            class338.method2189((byte) 122, arg3);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
    public final void method382(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method383(true, 40);
        }
        ++field3317;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
    public final boolean method377(byte arg0) {
        ++field3319;
        if (arg0 > -8) {
            this.field3321 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(ZI)V")
    public final void method383(boolean arg0, int arg1) {
        if (arg1 >= -77) {
            this.field3321 = false;
        }
        ++field3322;
        class237 var3 = super.field752.method1805(1365);
        if (this.field3323 != null && var3 != null && arg0) {
            this.field3323.method1866(13, '\u0000');
            super.field752.method1819(1, (byte) 124);
            super.field752.method1787(var3, (byte) 121);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field752.field4122.method774((byte) -55), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field752.method1819(0, (byte) 101);
            this.field3321 = true;
        } else {
            super.field752.method1825((byte) 110, 0, 770, 34168);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILkv;)V")
    public final void method379(int arg0, int arg1, class14 arg2) {
        super.field752.method1787(arg2, (byte) 121);
        ++field3314;
        int var4 = -53 % ((arg1 - 81) / 39);
        super.field752.method1794(arg0, 54);
    }
}
