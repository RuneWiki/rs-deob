import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class292 implements class457 {

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    private int field4283 = -1;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "[Lhj;")
    private class250[] field4291 = new class250[9];

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    private int field4294 = 0;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Los;")
    private class468 field4293;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lqu;")
    public static class364 field4275 = new class364(37, 5);

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    public static int[] field4280 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    private int field4272;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    private int field4276;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lbj;")
    public static class440 field4277;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Ldda;")
    public static class597 field4288;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILbo;B)V", line = 4)
    public final void method1801(int arg0, int arg1, class227 arg2, byte arg3) {
        this.method1806(arg1, arg0, 27661, 0, arg2);
        if (arg3 >= -120) {
            this.field4272 = -4;
        }
        field4287++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 16)
    public static final void method1802(int arg0) {
        if (arg0 != -30146) {
            return;
        }
        for (int var1 = 0; var1 < class468.field6812.length; var1++) {
            for (int var2 = 0; var2 < class468.field6812[var1].length; var2++) {
                class468.field6812[var1][var2] = class136.field1806;
            }
        }
        field4265++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 43)
    public final void method1803(boolean arg0) {
        field4284++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field4294 &= 0xFFFFFFFE;
        this.field4283 = this.method1805(!arg0);
        if (!arg0) {
            field4280 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V", line = 56)
    public final void method1804(byte arg0, int arg1) {
        field4286++;
        if (this.field4283 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class566.field8400[arg1]);
        int var3 = 119 % ((51 - arg0) / 46);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)I", line = 71)
    private final int method1805(boolean arg0) {
        field4267++;
        if ((this.field4294 & 0x4) != 0) {
            return 36160;
        }
        if (arg0) {
            this.method1814(true);
        }
        if ((this.field4294 & 0x2) == 0) {
            return (this.field4294 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIILbo;)V", line = 92)
    private final void method1806(int arg0, int arg1, int arg2, int arg3, class227 arg4) {
        field4289++;
        if (this.field4283 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field4276) == 0) {
            this.field4274 = arg4.field3336;
            this.field4272 = arg4.field3336;
        } else if (this.field4272 != arg4.field3336 || this.field4274 != arg4.field3336) {
            throw new RuntimeException();
        }
        arg4.method1486(arg2 ^ 0x1EA0, arg0, class566.field8400[arg1], this.field4283, arg3);
        if (arg2 == 27661) {
            this.field4291[arg1] = arg4;
            this.field4276 |= var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILlk;)V", line = 124)
    public static final void method1807(int arg0, class383 arg1) {
        if (arg0 != 9107) {
            field4288 = null;
        }
        field4282++;
        for (class434 var2 = (class434) class255.field3733.method2496((byte) -123); var2 != null; var2 = (class434) class255.field3733.method2494(arg0 - 8980)) {
            if (var2.field6353 == arg1) {
                if (var2.field6356 != null) {
                    class105.field1321.method2085(var2.field6356);
                    var2.field6356 = null;
                }
                var2.method2997(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 161)
    public final void method1808(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field4281);
        field4278++;
        this.field4294 |= 0x1;
        if (arg0 <= 44) {
            this.field4272 = 11;
        }
        this.field4283 = this.method1805(false);
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I", line = 175)
    public final int method1809(int arg0) {
        if (arg0 != 32092) {
            this.field4291 = null;
        }
        field4268++;
        return this.field4274;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILot;I)V", line = 186)
    private final void method1810(int arg0, int arg1, class210 arg2, int arg3) {
        field4285++;
        if (this.field4283 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field4276) == 0) {
            this.field4272 = arg2.field3100;
            this.field4274 = arg2.field3099;
        } else if (this.field4272 != arg2.field3100 || this.field4274 != arg2.field3099) {
            throw new RuntimeException();
        }
        if (arg3 != 256) {
            this.method1808((byte) -67);
        }
        arg2.method1361(this.field4283, arg0, 24456, class566.field8400[arg1]);
        this.field4291[arg1] = arg2;
        this.field4276 |= var5;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 220)
    public final void method1811(int arg0, int arg1) {
        if (this.field4291[arg1] != null) {
            this.field4291[arg1].method1363((byte) -19);
        }
        field4279++;
        this.field4276 &= ~(0x1 << arg1);
        if (arg0 > -107) {
            this.field4293 = null;
        }
        this.field4291[arg1] = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 236)
    public final void method1812(byte arg0) {
        field4297++;
        OpenGL.glBindFramebufferEXT(36009, this.field4281);
        this.field4294 |= 0x2;
        this.field4283 = this.method1805(false);
        if (arg0 < 17) {
            this.field4283 = 39;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 249)
    public final void method1813(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field4266++;
        this.field4294 &= 0xFFFFFFFB;
        this.field4283 = this.method1805(false);
        if (arg0 != -15450) {
            field4280 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)Z", line = 270)
    public final boolean method1814(boolean arg0) {
        if (arg0) {
            field4275 = null;
        }
        field4273++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4283);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)[B", line = 293)
    public static final byte[] method1815(byte[] arg0, byte arg1) {
        field4270++;
        int var2 = arg0.length;
        if (arg1 == -85) {
            byte[] var3 = new byte[var2];
            class473.method2883(arg0, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V", line = 312)
    public final void method1816(int arg0, int arg1) {
        field4271++;
        if (arg1 <= 21) {
            field4288 = null;
        }
        if (this.field4283 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class566.field8400[arg0]);
    }

    @OriginalMember(owner = "client!vb", name = "finalize", descriptor = "()V", line = 328)
    protected final void finalize() throws Throwable {
        this.field4293.method2835((byte) 89, this.field4281);
        field4269++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lkh;II)V", line = 338)
    public final void method1817(class480 arg0, int arg1, int arg2) {
        int var4 = 92 / ((23 - arg2) / 41);
        field4295++;
        if (this.field4283 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field4276 & ~var5) == 0) {
            this.field4274 = arg0.field7285;
            this.field4272 = arg0.field7281;
        } else if (this.field4272 != arg0.field7281 || this.field4274 != arg0.field7285) {
            throw new RuntimeException();
        }
        arg0.method2914(this.field4283, class566.field8400[arg1], true);
        this.field4291[arg1] = arg0;
        this.field4276 |= var5;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lot;IB)V", line = 368)
    public final void method1818(class210 arg0, int arg1, byte arg2) {
        if (arg2 < -31) {
            field4296++;
            this.method1810(0, arg1, arg0, 256);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Los;)V", line = 522)
    public class292(class468 arg0) {
        if (!arg0.field6993) {
            throw new IllegalStateException("");
        }
        this.field4293 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class118.field1540, 0);
        this.field4281 = class118.field1540[0];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Luf;ILjava/awt/Component;II)Llr;", line = 382)
    public static final class261 method1819(class353 arg0, int arg1, Component arg2, int arg3, int arg4) {
        field4290++;
        if (class36.field419 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg3 < arg4) {
                arg3 = 256;
            }
            try {
                class261 var5 = (class261) Class.forName("go").getDeclaredConstructor().newInstance();
                var5.field3845 = new int[(class614.field9002 ? 2 : 1) * 256];
                var5.field3862 = arg3;
                var5.method1657(arg2);
                var5.field3856 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3856 > 16384) {
                    var5.field3856 = 16384;
                }
                var5.method1662(var5.field3856);
                if (class555.field8241 > 0 && class459.field6656 == null) {
                    class459.field6656 = new class631();
                    class459.field6656.field9229 = arg0;
                    arg0.method2159(class555.field8241, (byte) 26, class459.field6656);
                }
                if (class459.field6656 != null) {
                    if (class459.field6656.field9228[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class459.field6656.field9228[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class592 var6 = new class592(arg0, arg1);
                    var6.field3845 = new int[(class614.field9002 ? 2 : 1) * 256];
                    var6.field3862 = arg3;
                    var6.method1657(arg2);
                    var6.field3856 = 16384;
                    var6.method1662(var6.field3856);
                    if (class555.field8241 > 0 && class459.field6656 == null) {
                        class459.field6656 = new class631();
                        class459.field6656.field9229 = arg0;
                        arg0.method2159(class555.field8241, (byte) 26, class459.field6656);
                    }
                    if (class459.field6656 != null) {
                        if (class459.field6656.field9228[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class459.field6656.field9228[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class261();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V", line = 466)
    public static void method1820(int arg0) {
        field4288 = null;
        if (arg0 == -3) {
            field4277 = null;
            field4280 = null;
            field4275 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 496)
    public final void method1821(int arg0) {
        field4292++;
        OpenGL.glBindFramebufferEXT(36160, this.field4281);
        this.field4294 |= 0x4;
        if (arg0 != -16741) {
            this.method1808((byte) -5);
        }
        this.field4283 = this.method1805(false);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 510)
    public final void method1822(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field4264++;
        if (arg0 == -75) {
            this.field4294 &= 0xFFFFFFFD;
            this.field4283 = this.method1805(false);
        }
    }
}
