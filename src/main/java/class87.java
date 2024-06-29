import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class87 extends class369 {

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Llc;")
    private class648 field1549;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Lwha;")
    private class284 field1556;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[I")
    public static int[] field1561 = new int[2048];

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Ljv;")
    private class80 field1555;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "Lin;")
    public static class91 field1548;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Z")
    public static boolean field1560;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 3)
    public static final void method825(boolean arg0, String arg1) {
        ++field1558;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class115.method1015(2, arg1);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class443.field6289; ++var3) {
                    String var4 = class648.field8912[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class115.method1015(2, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class443.field6289;
                        for (int var6 = var3; var6 < class443.field6289; ++var6) {
                            class648.field8912[var6] = class648.field8912[var6 - -1];
                            class128.field2162[var6] = class128.field2162[var6 + 1];
                            class59.field1169[var6] = class59.field1169[var6 - -1];
                            class539.field7456[var6] = class539.field7456[var6 + 1];
                            class584.field7987[var6] = class584.field7987[var6 - -1];
                            class514.field7145[var6] = class514.field7145[var6 + 1];
                        }
                        class646.field8887 = class253.field3660;
                        ++class71.field1293;
                        class564 var7 = class227.method1594(class384.field5565, class72.field1320, -99);
                        var7.field7778.method1526(false, class621.method3541(arg1, -65));
                        var7.field7778.method1481((byte) -5, arg1);
                        class167.method1260(117, var7);
                        break;
                    }
                }
                if (!arg0) {
                    field1560 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIB)V", line = 66)
    public final void method372(int arg0, int arg1, byte arg2) {
        if (arg2 >= -42) {
            this.field1556 = null;
        }
        if ((1 & arg0) == 1) {
            if (!this.field1549.field8913) {
                int var4 = super.field5255.field557 % 4000 * 16 / 4000;
                super.field5255.method256((byte) -95, this.field1549.field8915[var4]);
            } else {
                super.field5255.method256((byte) -83, this.field1549.field8911);
                class371.field5286[2] = 0.0F;
                class371.field5286[3] = (float) (super.field5255.field557 % 4000) / 4000.0F;
                class371.field5286[0] = 0.0F;
                class371.field5286[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class371.field5286, 0);
            }
        } else if (!this.field1549.field8913) {
            super.field5255.method256((byte) -110, this.field1549.field8915[0]);
        } else {
            super.field5255.method256((byte) -126, this.field1549.field8911);
            class371.field5286[0] = 0.0F;
            class371.field5286[2] = 0.0F;
            class371.field5286[1] = 0.0F;
            class371.field5286[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class371.field5286, 0);
        }
        ++field1562;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZZ)V", line = 114)
    public final void method369(boolean arg0, boolean arg1) {
        if (super.field5255.field604 > 0) {
            float var3 = -0.5F / (float) super.field5255.field604;
            super.field5255.method190(-15039, 1);
            class371.field5286[3] = super.field5255.field614 * var3 + 0.25F;
            class371.field5286[0] = 0.0F;
            class371.field5286[2] = var3;
            class371.field5286[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class371.field5286, 0);
            OpenGL.glPopMatrix();
            super.field5255.method200((float) super.field5255.field604, 770, 0.5F);
            super.field5255.method256((byte) -99, this.field1556);
            super.field5255.method190(-15039, 0);
        }
        ++field1557;
        this.field1555.method740('\u0000', 28666);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        if (!arg1) {
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V", line = 148)
    public static void method826(int arg0) {
        if (arg0 == 6336) {
            field1548 = null;
            field1561 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)V", line = 164)
    private final void method827(int arg0) {
        this.field1555 = new class80(super.field5255, 2);
        ++field1554;
        this.field1555.method741((byte) 109, 0);
        super.field5255.method190(arg0 + 6366, 1);
        super.field5255.method175(7681, (byte) 98, 260);
        super.field5255.method239(34168, 768, (byte) -87, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field5255.method190(-15039, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field1549.field8913) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field1555.method737(-1);
        this.field1555.method741((byte) 117, 1);
        super.field5255.method190(-15039, 1);
        if (arg0 != -21405) {
            this.method368(-18);
        }
        super.field5255.method175(8448, (byte) -115, 8448);
        super.field5255.method239(5890, 768, (byte) -87, 0);
        OpenGL.glDisable(3168);
        super.field5255.method190(-15039, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field1549.field8913) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field1555.method737(arg0 + 21404);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lqo;Llc;)V", line = 208)
    public class87(class22 arg0, class648 arg1) {
        super(arg0);
        this.field1549 = arg1;
        this.method827(-21405);
        this.field1556 = new class284(super.field5255, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field1556.method1861((byte) -91, false);
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z", line = 220)
    public final boolean method368(int arg0) {
        ++field1559;
        return arg0 > -5 ? true : true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 232)
    public static final void method828(int arg0, int arg1, int arg2) {
        class384 var3 = class649.field8928[arg0][arg1][arg2];
        if (var3 != null) {
            class468.method2749(var3.field5566);
            class468.method2749(var3.field5578);
            if (var3.field5566 != null) {
                var3.field5566 = null;
            }
            if (var3.field5578 != null) {
                var3.field5578 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 247)
    public final void method371(int arg0) {
        this.field1555.method740('\u0001', 28666);
        ++field1553;
        if (~super.field5255.field604 < -1) {
            super.field5255.method190(-15039, 1);
            super.field5255.method256((byte) -115, (class36) null);
            super.field5255.method200(0.0F, 770, 1.0F);
            super.field5255.method190(-15039, 0);
        }
        if (arg0 > -75) {
            this.field1556 = null;
        }
        super.field5255.method175(8448, (byte) 102, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lud;BI)V", line = 279)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        if (arg1 < -89) {
            ++field1551;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIIIIIZ)Z", line = 296)
    public static final boolean method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        ++field1552;
        if (!class387.method2439(arg7, arg2, arg0, -7596)) {
            return false;
        } else {
            int var10 = class705.field9567[1];
            int var11 = class705.field9567[0];
            int var12 = class705.field9567[2];
            if (!class387.method2439(arg6, arg8, arg1, -7596)) {
                return false;
            } else {
                int var13 = class705.field9567[0];
                int var14 = class705.field9567[2];
                int var15 = class705.field9567[1];
                if (!class387.method2439(arg5, arg4, arg3, -7596)) {
                    return false;
                } else {
                    int var16 = class705.field9567[2];
                    if (arg9) {
                        return false;
                    } else {
                        int var17 = class705.field9567[1];
                        int var18 = class705.field9567[0];
                        return class153.method1186(var18, var10, var13, var16, var14, (byte) -76, var15, var12, var11, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZB)V", line = 327)
    public final void method366(boolean arg0, byte arg1) {
        super.field5255.method175(260, (byte) -94, 8448);
        ++field1550;
        int var3 = 107 % ((-60 - arg1) / 38);
    }
}
