import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class247 extends class106 {

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Z")
    private boolean field3569 = false;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Lsc;")
    private class229 field3565;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[F")
    public static float[] field3567 = new float[16];

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Lef;")
    public static class335 field3562 = new class335(15, 0, 1, 0);

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method348(int arg0) {
        ++field3564;
        if (arg0 != -22884) {
            this.field3565 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lvj;)V", line = 16)
    public class247(class303 arg0) {
        super(arg0);
        if (arg0.field4515) {
            this.field3565 = new class229(arg0, 2);
            this.field3565.method1495(0, (byte) -115);
            super.field1770.method1929(1, (byte) 112);
            super.field1770.method1951((byte) -40, 34165, 7681);
            super.field1770.method1921(770, 34168, (byte) 21, 2);
            super.field1770.method1952(770, 34167, 123, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1770.method1929(0, (byte) 70);
            this.field3565.method1493((byte) -92);
            this.field3565.method1495(1, (byte) -115);
            super.field1770.method1929(1, (byte) 122);
            super.field1770.method1951((byte) -19, 8448, 8448);
            super.field1770.method1921(770, 34166, (byte) -123, 2);
            super.field1770.method1952(770, 5890, 116, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1770.method1929(0, (byte) 104);
            this.field3565.method1493((byte) -103);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)V", line = 54)
    public static final void method1602(byte arg0, boolean arg1) {
        while (true) {
            if (class92.field1573.method2696(class34.field666, (byte) 61) >= 15) {
                int var2 = class92.field1573.method2700((byte) 87, 15);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    if (class34.field668[var2] == null) {
                        class34.field668[var2] = new class255();
                        var3 = true;
                        class34.field668[var2].field7669 = var2;
                    }
                    class255 var4 = class34.field668[var2];
                    class148.field2363[class510.field7529++] = var2;
                    var4.field7632 = class531.field7821;
                    if (var4.field3677 != null && var4.field3677.method416(-24707)) {
                        class66.method553(var4, arg0 + -867418618);
                    }
                    int var5;
                    if (arg1) {
                        var5 = class92.field1573.method2700((byte) 87, 8);
                        if (~var5 < -128) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = class92.field1573.method2700((byte) 87, 5);
                        if (~var5 < -16) {
                            var5 -= 32;
                        }
                    }
                    int var6 = class92.field1573.method2700((byte) 87, 1);
                    if (~var6 == -2) {
                        class88.field1543[class452.field6759++] = var2;
                    }
                    var4.method1648(-83, class61.field1070.method502(class92.field1573.method2700((byte) 87, 14), -44));
                    int var7 = 4 + class92.field1573.method2700((byte) 87, 3) << 11 & 15714;
                    int var8 = class92.field1573.method2700((byte) 87, 1);
                    int var9;
                    if (arg1) {
                        var9 = class92.field1573.method2700((byte) 87, 8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class92.field1573.method2700((byte) 87, 5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10 = class92.field1573.method2700((byte) 87, 2);
                    var4.method3095(var4.field3677.field807, (byte) -110);
                    var4.field7638 = var4.field3677.field768 << 3;
                    if (var4.field7638 != 0) {
                        if (var3) {
                            var4.method3085(var7, 2090249552);
                        }
                    } else {
                        var4.method3085(0, 2090249552);
                    }
                    var4.method1652((byte) -86, var4.method1654(115), var10, var8 == 1, class139.field2224.field7694[0] + var9, class139.field2224.field7692[0] + var5);
                    if (var4.field3677.method416(-24707)) {
                        class228.method1490(var4.field6232, 0, (byte) 117, (class79) null, var4.field7694[0], (class256) null, var4, var4.field7692[0]);
                    }
                    continue;
                }
            }
            ++field3571;
            if (arg0 != -31) {
                method1602((byte) -27, false);
            }
            class92.field1573.method2702(10492);
            return;
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 156)
    public static void method1603(int arg0) {
        if (arg0 != 31793) {
            field3562 = null;
        }
        field3562 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZB)V", line = 167)
    public final void method344(boolean arg0, byte arg1) {
        super.field1770.method1951((byte) -52, 8448, 7681);
        ++field3566;
        if (arg1 <= 102) {
            this.field3569 = true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V", line = 182)
    public final void method343(boolean arg0, int arg1) {
        ++field3572;
        if (arg1 == 1) {
            class221 var3 = super.field1770.method1914((byte) -59);
            if (this.field3565 != null && var3 != null && arg0) {
                this.field3565.method1494('\u0000', false);
                super.field1770.method1929(1, (byte) 122);
                super.field1770.method1990(var3, 11864);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field1770.field4541.method1596(29), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field1770.method1929(0, (byte) 66);
                this.field3569 = true;
            } else {
                super.field1770.method1952(770, 34168, 125, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)V", line = 210)
    public final void method347(int arg0, byte arg1, int arg2) {
        if (arg1 == 43) {
            ++field3570;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILih;)V", line = 222)
    public final void method346(int arg0, int arg1, class492 arg2) {
        super.field1770.method1990(arg2, 11864);
        if (arg0 != 128) {
            this.method347(53, (byte) 95, -68);
        }
        ++field3568;
        super.field1770.method1989(-24145, arg1);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 234)
    public final void method342(int arg0) {
        ++field3563;
        if (arg0 == 3) {
            if (!this.field3569) {
                super.field1770.method1952(770, 5890, 115, 0);
            } else {
                this.field3565.method1494('\u0001', false);
                super.field1770.method1929(1, (byte) 64);
                super.field1770.method1990((class492) null, 11864);
                super.field1770.method1929(0, (byte) 101);
            }
            super.field1770.method1951((byte) 125, 8448, 8448);
            this.field3569 = false;
        }
    }
}
