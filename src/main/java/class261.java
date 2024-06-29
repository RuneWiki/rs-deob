import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class261 extends class203 {

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Lsa;")
    private class780 field3829;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "Lcia;")
    private class440 field3821;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "Lqk;")
    public static class1 field3822 = new class1(40, 4);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Lup;")
    private class545 field3824;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method687(int arg0) {
        ++field3820;
        return arg0 != -12 ? true : true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 16)
    public final void method686(int arg0) {
        ++field3831;
        this.field3824.method3226(6, '\u0001');
        if (arg0 < 64) {
            this.method686(-101);
        }
        if (~super.field2843.field2651 < -1) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 109, (class539) null);
            super.field2843.method1238(1.0F, 0.0F, 0);
            super.field2843.method1262(0, 0);
        }
        super.field2843.method1230(8448, 8448, false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 40)
    public static final boolean method1718(int arg0, String arg1) {
        ++field3817;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != -28054) {
                method1722((class511) null, 61);
            }
            for (int var2 = 0; class688.field9600 > var2; ++var2) {
                if (arg1.equalsIgnoreCase(class396.field5622[var2])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(class724.field10031.field9965);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIII)I", line = 72)
    public static final int method1719(int arg0, int arg1, int arg2, int arg3) {
        ++field3830;
        if (~class130.field1678 > -101) {
            return -2;
        } else {
            int var4 = arg2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class46.field503 + arg3;
            int var7 = arg0 - class46.field511;
            for (class226 var8 = (class226) class46.field490.method1041(arg2 + 1048834); var8 != null; var8 = (class226) class46.field490.method1033(-1)) {
                if (~var8.field3433 == ~arg1) {
                    int var9 = var8.field3424;
                    int var10 = var8.field3434;
                    int var11 = class46.field503 + var9 << 14 | class46.field511 + var10;
                    int var12 = (var6 - var9) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (var4 < 0 || var12 < var5) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZ)V", line = 116)
    public final void method688(byte arg0, boolean arg1) {
        if (~super.field2843.field2651 < -1) {
            float var3 = -0.5F / (float) super.field2843.field2651;
            super.field2843.method1262(1, 0);
            class50.field603[0] = 0.0F;
            class50.field603[3] = super.field2843.field2716 * var3 + 0.25F;
            class50.field603[1] = 0.0F;
            class50.field603[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class50.field603, 0);
            OpenGL.glPopMatrix();
            super.field2843.method1238(0.5F, (float) super.field2843.field2651, 0);
            super.field2843.method1219((byte) 72, this.field3821);
            super.field2843.method1262(0, 0);
        }
        if (arg0 <= -25) {
            ++field3828;
            this.field3824.method3226(6, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V", line = 150)
    public static final void method1720(int arg0) {
        ++field3818;
        if (class175.field2216 != null) {
            if (~class175.field2216.field4970 == -2) {
                class175.field2216 = null;
                return;
            }
            if (~class175.field2216.field4970 == -3) {
                class457.method2751(class323.field4567, class140.field1790, 2, -58);
                class175.field2216 = null;
                return;
            }
        }
        if (arg0 != 5888) {
            field3822 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V", line = 184)
    private final void method1721(int arg0) {
        this.field3824 = new class545(super.field2843, 2);
        ++field3825;
        this.field3824.method3227(0, (byte) -98);
        super.field2843.method1262(1, 0);
        super.field2843.method1230(260, 7681, false);
        super.field2843.method1223(0, 54, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2843.method1262(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3829.field10723) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field3824.method3225(86);
        this.field3824.method3227(1, (byte) -110);
        super.field2843.method1262(1, 0);
        super.field2843.method1230(8448, 8448, false);
        super.field2843.method1223(0, 118, 768, 5890);
        if (arg0 >= 96) {
            OpenGL.glDisable(3168);
            super.field2843.method1262(0, 0);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field3829.field10723) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field3824.method3225(-80);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V", line = 228)
    public final void method681(boolean arg0, byte arg1) {
        super.field2843.method1230(8448, 260, false);
        ++field3819;
        if (arg1 <= 0) {
            this.method1721(21);
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lpq;Lsa;)V", line = 240)
    public class261(class194 arg0, class780 arg1) {
        super(arg0);
        this.field3829 = arg1;
        this.method1721(101);
        this.field3821 = new class440(super.field2843, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3821.method2634(false, -92);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZLwha;)V", line = 254)
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        ++field3827;
        if (arg1) {
            this.method686(-119);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lgga;I)Luba;", line = 265)
    public static final class330 method1722(class511 arg0, int arg1) {
        arg0.method3013(-98);
        ++field3823;
        int var2 = arg0.method3013(74);
        class330 var3 = class275.method1794(false, var2);
        var3.field4632 = arg0.method3013(-115);
        int var4 = arg0.method3013(arg1 ^ -101);
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            int var6 = arg0.method3013(-98);
            var3.method466(arg0, var6, (byte) -122);
        }
        var3.method653((byte) 106);
        if (arg1 != 1) {
            field3822 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V", line = 304)
    public static void method1723(boolean arg0) {
        field3822 = null;
        if (arg0) {
            method1720(-121);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V", line = 315)
    public final void method682(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1720(-11);
        }
        if (~(arg1 & 1) != -2) {
            if (!this.field3829.field10723) {
                super.field2843.method1219((byte) 68, this.field3829.field10718[0]);
            } else {
                super.field2843.method1219((byte) 87, this.field3829.field10720);
                class50.field603[0] = 0.0F;
                class50.field603[1] = 0.0F;
                class50.field603[3] = 0.0F;
                class50.field603[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class50.field603, 0);
            }
        } else if (!this.field3829.field10723) {
            int var4 = super.field2843.field2614 % 4000 * 16 / 4000;
            super.field2843.method1219((byte) 103, this.field3829.field10718[var4]);
        } else {
            super.field2843.method1219((byte) 79, this.field3829.field10720);
            class50.field603[3] = (float) (super.field2843.field2614 % 4000) / 4000.0F;
            class50.field603[1] = 0.0F;
            class50.field603[2] = 0.0F;
            class50.field603[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class50.field603, 0);
        }
        ++field3816;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Lsu;Loaa;)Lpt;", line = 363)
    public static final class582 method1724(int arg0, class544[] arg1, class556 arg2) {
        ++field3826;
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            if (arg1[var3] == null || arg1[var3].field7572 <= 0L) {
                return null;
            }
        }
        if (arg0 != 3171) {
            return null;
        } else {
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; arg1.length > var6; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg1[var6].field7572);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class70.field771, 0);
            if (~class70.field771[0] == -1) {
                if (class70.field771[0] == 0) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class70.field771, 1);
                if (class70.field771[1] > 1) {
                    byte[] var7 = new byte[class70.field771[1]];
                    OpenGL.glGetInfoLogARB(var4, class70.field771[1], class70.field771, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (~class70.field771[0] == -1) {
                    for (int var8 = 0; arg1.length > var8; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg1[var8].field7572);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class582(arg2, var4, arg1);
        }
    }
}
