import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class484 extends class277 {

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Lpea;")
    private class222 field6426;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Lgs;")
    private class580 field6429;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field6422 = 0;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "Lwea;")
    public static class259 field6425 = new class259(4, 1);

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Lfb;")
    private class52 field6427;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "[Lhv;")
    public static class199[] field6435;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V", line = 3)
    public final void method277(int arg0, boolean arg1) {
        if (~super.field3475.field7521 < -1) {
            float var3 = -0.5F / (float) super.field3475.field7521;
            super.field3475.method3027(1, true);
            class179.field2314[3] = super.field3475.field7525 * var3 + 0.25F;
            class179.field2314[2] = var3;
            class179.field2314[0] = 0.0F;
            class179.field2314[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class179.field2314, 0);
            OpenGL.glPopMatrix();
            super.field3475.method2969(1, 0.5F, (float) super.field3475.field7521);
            super.field3475.method2960(this.field6429, -2);
            super.field3475.method3027(0, true);
        }
        ++field6424;
        this.field6427.method333(-29240, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        int var4 = -14 / ((65 - arg0) / 60);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 36)
    private final void method2628(int arg0) {
        ++field6423;
        this.field6427 = new class52(super.field3475, 2);
        this.field6427.method331(0, 0);
        super.field3475.method3027(1, true);
        super.field3475.method2983(7681, -465309136, 260);
        super.field3475.method2966(0, 768, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3475.method3027(0, true);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6426.field2714) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6427.method332((byte) 80);
        this.field6427.method331(1, arg0);
        super.field3475.method3027(1, true);
        super.field3475.method2983(8448, -465309136, 8448);
        super.field3475.method2966(arg0, 768, 768, 5890);
        OpenGL.glDisable(3168);
        super.field3475.method3027(0, true);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6426.field2714) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6427.method332((byte) 120);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILrg;)V", line = 78)
    public final void method279(int arg0, int arg1, class615 arg2) {
        if (arg1 == 7) {
            ++field6433;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIBI)Ltt;", line = 90)
    public static final class340 method2629(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field6430;
        class340 var5 = new class340();
        var5.field4391 = arg1;
        int var6 = 67 / ((71 - arg3) / 44);
        var5.field4392 = arg4;
        class138.field1797.method402(var5, (byte) -28, (long) arg2);
        class206.method1243(-122, arg4);
        class507 var7 = class156.method894(-1018745488, arg2);
        if (var7 != null) {
            class572.method3158(var7, 1023);
        }
        if (class461.field5873 != null) {
            class572.method3158(class461.field5873, 1023);
            class461.field5873 = null;
        }
        class225.method1354((byte) -121);
        if (var7 != null) {
            class285.method1605(var7, false, !arg0);
        }
        if (!arg0) {
            class197.method1189(arg4);
        }
        if (!arg0 && class316.field4063 != -1) {
            class106.method603(-1630137275, class316.field4063, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 130)
    public final void method278(int arg0) {
        ++field6432;
        this.field6427.method333(-29240, '\u0001');
        if (arg0 == 1268) {
            if (super.field3475.field7521 > 0) {
                super.field3475.method3027(1, true);
                super.field3475.method2960((class615) null, -2);
                super.field3475.method2969(1, 1.0F, 0.0F);
                super.field3475.method3027(0, true);
            }
            super.field3475.method2983(8448, -465309136, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lqj;Lpea;)V", line = 156)
    public class484(class548 arg0, class222 arg1) {
        super(arg0);
        this.field6426 = arg1;
        this.method2628(0);
        this.field6429 = new class580(super.field3475, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6429.method3203(-40, false);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z", line = 168)
    public final boolean method284(byte arg0) {
        ++field6428;
        if (arg0 >= -93) {
            this.method280(-2, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Z", line = 185)
    public static final boolean method2630(int arg0) {
        ++field6431;
        if (arg0 != 3171) {
            return true;
        } else {
            boolean var1 = true;
            if (class294.field3639 == null) {
                if (class631.field8846.method3368(1912, class30.field434)) {
                    class294.field3639 = class661.method3721(class631.field8846, class30.field434);
                } else {
                    var1 = false;
                }
            }
            if (class462.field5893 == null) {
                if (!class631.field8846.method3368(1912, class551.field7680)) {
                    var1 = false;
                } else {
                    class462.field5893 = class661.method3721(class631.field8846, class551.field7680);
                }
            }
            if (class556.field7732 == null) {
                if (!class631.field8846.method3368(1912, class702.field9927)) {
                    var1 = false;
                } else {
                    class556.field7732 = class661.method3721(class631.field8846, class702.field9927);
                }
            }
            if (class30.field435 == null) {
                if (class301.field3700.method3368(1912, class155.field2014)) {
                    class30.field435 = class280.method1588(class301.field3700, class155.field2014, (byte) 32);
                } else {
                    var1 = false;
                }
            }
            if (class477.field6045 == null) {
                if (!class631.field8846.method3368(arg0 ^ 2843, class155.field2014)) {
                    var1 = false;
                } else {
                    class477.field6045 = class661.method3716(class631.field8846, class155.field2014);
                }
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V", line = 259)
    public final void method276(int arg0, int arg1, int arg2) {
        if (arg1 != 50) {
            method2630(-126);
        }
        ++field6421;
        if (~(arg0 & 1) == -2) {
            if (!this.field6426.field2714) {
                int var4 = super.field3475.field7477 % 4000 * 16 / 4000;
                super.field3475.method2960(this.field6426.field2718[var4], -2);
            } else {
                super.field3475.method2960(this.field6426.field2722, -2);
                class179.field2314[2] = 0.0F;
                class179.field2314[3] = (float) (super.field3475.field7477 % 4000) / 4000.0F;
                class179.field2314[1] = 0.0F;
                class179.field2314[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class179.field2314, 0);
            }
        } else if (!this.field6426.field2714) {
            super.field3475.method2960(this.field6426.field2718[0], -2);
        } else {
            super.field3475.method2960(this.field6426.field2722, arg1 + -52);
            class179.field2314[3] = 0.0F;
            class179.field2314[1] = 0.0F;
            class179.field2314[2] = 0.0F;
            class179.field2314[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class179.field2314, 0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V", line = 304)
    public final void method280(int arg0, boolean arg1) {
        if (arg0 > -64) {
            this.method2628(-65);
        }
        super.field3475.method2983(260, -465309136, 8448);
        ++field6434;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V", line = 322)
    public static void method2631(int arg0) {
        field6435 = null;
        field6425 = null;
        if (arg0 != 8194) {
            method2629(false, 62, -120, (byte) 56, -33);
        }
    }
}
