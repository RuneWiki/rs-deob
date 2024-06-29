import java.awt.Frame;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class220 implements class163 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[F")
    private float[] field3283 = new float[4];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lph;")
    public static class361 field3288;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 8)
    public final void method288() {
        field3282++;
        GL var1 = class141.field2025;
        var1.glCallList(this.field3278 + 1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 205)
    public class220() {
        this.method1606(-102);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 27)
    public static final void method1603(int arg0) {
        int var1 = -127 / ((-arg0 - 31) / 45);
        class71.field1030 = null;
        class19.field302 = -1;
        field3280++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lnf;Ljava/awt/Frame;I)V", line = 39)
    public static final void method1604(class61 arg0, Frame arg1, int arg2) {
        if (arg2 < 49) {
            field3285 = -110;
        }
        while (true) {
            class210 var3 = arg0.method488(arg1, -10584);
            while (var3.field3056 == 0) {
                class184.method1283(10L, 10);
            }
            if (var3.field3056 == 1) {
                field3281++;
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class184.method1283(100L, 10);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 64)
    public static void method1605(int arg0) {
        if (arg0 != -25519) {
            field3285 = -33;
        }
        field3288 = null;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V", line = 76)
    public final void method283() {
        GL var1 = class141.field2025;
        var1.glCallList(this.field3278);
        field3287++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 92)
    public final void method286(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        field3291++;
        GL var3 = class141.field2025;
        float var4 = (float) (((arg0 & 0x1A) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3283[2] = 0.0F;
            this.field3283[3] = 0.0F;
            this.field3283[1] = 0.0F;
            this.field3283[0] = var5;
        } else {
            this.field3283[0] = 0.0F;
            this.field3283[3] = 0.0F;
            this.field3283[1] = 0.0F;
            this.field3283[2] = var5;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class303.field4530 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class126.field1829 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class112.field1630), (float) (-class59.field872), (float) (-class145.field2094));
        var3.glTexGenfv(8192, 9474, this.field3283, 0);
        this.field3283[1] = var5;
        this.field3283[0] = 0.0F;
        this.field3283[3] = (float) class141.field2045 * var2;
        this.field3283[2] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field3283, 0);
        var3.glPopMatrix();
        if (class245.field3647) {
            this.field3283[3] = (float) class141.field2045 * var4;
            this.field3283[2] = 0.0F;
            this.field3283[0] = 0.0F;
            this.field3283[1] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field3283, 0);
        } else {
            int var7 = (int) ((float) class141.field2045 * var4 * 64.0F);
            var3.glBindTexture(3553, class245.field3651[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 154)
    private final void method1606(int arg0) {
        field3279++;
        GL var2 = class141.field2025;
        this.field3278 = var2.glGenLists(2);
        var2.glNewList(this.field3278, 4864);
        var2.glActiveTexture(33985);
        if (class245.field3647) {
            var2.glBindTexture(32879, class245.field3648);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3278 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class245.field3647) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        int var3 = -116 / ((arg0 + 22) / 58);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()I", line = 198)
    public final int method281() {
        field3290++;
        return 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Lgm;", line = 214)
    public static final class262 method1607(byte arg0, int arg1) {
        field3284++;
        class262 var2 = (class262) class117.field1661.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 > -60) {
            field3285 = 58;
        }
        byte[] var3 = class89.field1244.method2520(3, arg1, (byte) -25);
        class262 var4 = new class262();
        if (var3 != null) {
            var4.method1941(new class190(var3), -1);
        }
        class117.field1661.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILgj;)V", line = 239)
    public static final void method1608(int arg0, class333 arg1) {
        arg1.field5187 = false;
        if (arg1.field5096 != -1) {
            class248 var2 = class119.method893(arg1.field5096, (byte) -41);
            if (var2 == null || var2.field3667 == null) {
                arg1.field5096 = -1;
            } else {
                arg1.field5108++;
                if (var2.field3667.length > arg1.field5180 && var2.field3694[arg1.field5180] < arg1.field5108) {
                    arg1.field5151++;
                    arg1.field5108 = 1;
                    arg1.field5180++;
                    class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5180, var2, arg1.field5165);
                }
                if (var2.field3667.length <= arg1.field5180) {
                    arg1.field5108 = 0;
                    arg1.field5180 = 0;
                    class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5180, var2, arg1.field5165);
                }
                arg1.field5151 = arg1.field5180 + 1;
                if (arg1.field5151 >= var2.field3667.length) {
                    arg1.field5151 = 0;
                }
            }
        }
        if (arg1.field5090 != -1 && arg1.field5107 <= class304.field4560) {
            class107 var3 = class81.method669(32, arg1.field5090);
            int var4 = var3.field1540;
            if (var4 == -1) {
                arg1.field5090 = -1;
            } else {
                label312: {
                    class248 var5 = class119.method893(var4, (byte) -41);
                    if (var3.field1543) {
                        if (var5.field3676 == 3) {
                            if (arg1.field5122 > 0 && arg1.field5136 <= class304.field4560 && arg1.field5119 < class304.field4560) {
                                arg1.field5090 = -1;
                                break label312;
                            }
                        } else if (var5.field3676 == 1 && arg1.field5122 > 0 && arg1.field5136 <= class304.field4560 && arg1.field5119 < class304.field4560) {
                            arg1.field5107 = class304.field4560 + 1;
                            break label312;
                        }
                    }
                    if (var5 == null || var5.field3667 == null) {
                        arg1.field5090 = -1;
                    } else {
                        if (arg1.field5159 < 0) {
                            arg1.field5159 = 0;
                            class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, 0, var5, arg1.field5165);
                        }
                        arg1.field5131++;
                        if (var5.field3667.length > arg1.field5159 && var5.field3694[arg1.field5159] < arg1.field5131) {
                            arg1.field5159++;
                            arg1.field5131 = 1;
                            class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5159, var5, arg1.field5165);
                        }
                        if (arg1.field5159 >= var5.field3667.length) {
                            if (var3.field1543) {
                                arg1.field5159 -= var5.field3677;
                                arg1.field5143++;
                                if (arg1.field5143 >= var5.field3683) {
                                    arg1.field5090 = -1;
                                } else if (arg1.field5159 >= 0 && var5.field3667.length > arg1.field5159) {
                                    class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5159, var5, arg1.field5165);
                                } else {
                                    arg1.field5090 = -1;
                                }
                            } else {
                                arg1.field5090 = -1;
                            }
                        }
                        arg1.field5144 = arg1.field5159 + 1;
                        if (arg1.field5144 >= var5.field3667.length) {
                            if (var3.field1543) {
                                arg1.field5144 -= var5.field3677;
                                if (arg1.field5143 + 1 >= var5.field3683) {
                                    arg1.field5144 = -1;
                                } else if (arg1.field5144 < 0 || var5.field3667.length <= arg1.field5144) {
                                    arg1.field5144 = -1;
                                }
                            } else {
                                arg1.field5144 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5190 != -1 && arg1.field5177 <= 1) {
            class248 var6 = class119.method893(arg1.field5190, (byte) -41);
            if (var6.field3676 == 3) {
                if (arg1.field5122 > 0 && arg1.field5136 <= class304.field4560 && arg1.field5119 < class304.field4560) {
                    arg1.field5190 = -1;
                }
            } else if (var6.field3676 == 1 && arg1.field5122 > 0 && arg1.field5136 <= class304.field4560 && arg1.field5119 < class304.field4560) {
                arg1.field5177 = 2;
            }
        }
        int var7 = -103 / ((arg0 - 51) / 49);
        field3289++;
        if (arg1.field5190 != -1 && arg1.field5177 == 0) {
            class248 var8 = class119.method893(arg1.field5190, (byte) -41);
            if (var8 == null || var8.field3667 == null) {
                arg1.field5190 = -1;
            } else {
                arg1.field5194++;
                if (var8.field3667.length > arg1.field5132 && arg1.field5194 > var8.field3694[arg1.field5132]) {
                    arg1.field5132++;
                    arg1.field5194 = 1;
                    class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5132, var8, arg1.field5165);
                }
                if (var8.field3667.length <= arg1.field5132) {
                    arg1.field5132 -= var8.field3677;
                    arg1.field5097++;
                    if (var8.field3683 <= arg1.field5097) {
                        arg1.field5190 = -1;
                    } else if (arg1.field5132 >= 0 && var8.field3667.length > arg1.field5132) {
                        class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, arg1.field5132, var8, arg1.field5165);
                    } else {
                        arg1.field5190 = -1;
                    }
                }
                arg1.field5146 = arg1.field5132 + 1;
                if (arg1.field5146 >= var8.field3667.length) {
                    arg1.field5146 -= var8.field3677;
                    if (var8.field3683 <= arg1.field5097 + 1) {
                        arg1.field5146 = -1;
                    } else if (arg1.field5146 < 0 || var8.field3667.length <= arg1.field5146) {
                        arg1.field5146 = -1;
                    }
                }
                arg1.field5187 = var8.field3669;
            }
        }
        if (arg1.field5177 > 0) {
            arg1.field5177--;
        }
        for (int var9 = 0; var9 < arg1.field5185.length; var9++) {
            class124 var10 = arg1.field5185[var9];
            if (var10 != null) {
                if (var10.field1804 > 0) {
                    var10.field1804--;
                } else {
                    class248 var11 = class119.method893(var10.field1796, (byte) -41);
                    if (var11 == null || var11.field3667 == null) {
                        arg1.field5185[var9] = null;
                    } else {
                        var10.field1802++;
                        if (var11.field3667.length > var10.field1799 && var11.field3694[var10.field1799] < var10.field1802) {
                            var10.field1799++;
                            var10.field1802 = 1;
                            class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, var10.field1799, var11, arg1.field5165);
                        }
                        if (var11.field3667.length <= var10.field1799) {
                            var10.field1799 -= var11.field3677;
                            var10.field1800++;
                            if (var11.field3683 <= var10.field1800) {
                                arg1.field5185[var9] = null;
                            } else if (var10.field1799 >= 0 && var11.field3667.length > var10.field1799) {
                                class361.method2512(-29521, arg1.field5137, class1.field55 == arg1, var10.field1799, var11, arg1.field5165);
                            } else {
                                arg1.field5185[var9] = null;
                            }
                        }
                        var10.field1798 = var10.field1799 + 1;
                        if (var10.field1798 >= var11.field3667.length) {
                            var10.field1798 -= var11.field3677;
                            if (var11.field3683 <= (var10.field1800 + 1)) {
                                var10.field1798 = -1;
                            } else if (var10.field1798 < 0 || var11.field3667.length <= var10.field1798) {
                                var10.field1798 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
