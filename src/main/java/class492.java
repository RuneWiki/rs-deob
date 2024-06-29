import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class492 extends class83 {

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "Lud;")
    private class123 field7145;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "Lffa;")
    private class394 field7137;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Lwp;")
    public static class452 field7138 = null;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "[I")
    public static int[] field7134 = new int[2048];

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field7141 = 0;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "Leaa;")
    private class43 field7143;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
    private final void method2853(boolean arg0) {
        this.field7143 = new class43(super.field855, 2);
        ++field7142;
        this.field7143.method219(24427, 0);
        super.field855.method2431((byte) -45, 1);
        super.field855.method2412((byte) -49, 7681, 260);
        super.field855.method2428(768, 34168, 0, -4);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field855.method2431((byte) -48, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7145.field1373) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7143.method223(1);
        this.field7143.method219(24427, 1);
        super.field855.method2431((byte) -105, 1);
        super.field855.method2412((byte) -49, 8448, 8448);
        super.field855.method2428(768, 5890, 0, -4);
        OpenGL.glDisable(3168);
        super.field855.method2431((byte) -27, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7145.field1373) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7143.method223(1);
        if (arg0) {
            this.field7143 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        super.field855.method2412((byte) -49, 260, 8448);
        if (arg1 < -123) {
            ++field7140;
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
    public static void method2854(int arg0) {
        field7134 = null;
        field7138 = null;
        if (arg0 != -23190) {
            field7141 = -39;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        ++field7135;
        int var4 = -67 % ((arg2 - -60) / 33);
        if (~(arg1 & 1) != -2) {
            if (!this.field7145.field1373) {
                super.field855.method2396((byte) 36, this.field7145.field1374[0]);
            } else {
                super.field855.method2396((byte) 36, this.field7145.field1372);
                class480.field6909[1] = 0.0F;
                class480.field6909[3] = 0.0F;
                class480.field6909[2] = 0.0F;
                class480.field6909[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class480.field6909, 0);
            }
        } else if (!this.field7145.field1373) {
            int var5 = super.field855.field5817 % 4000 * 16 / 4000;
            super.field855.method2396((byte) 36, this.field7145.field1374[var5]);
        } else {
            super.field855.method2396((byte) 36, this.field7145.field1372);
            class480.field6909[3] = (float) (super.field855.field5817 % 4000) / 4000.0F;
            class480.field6909[2] = 0.0F;
            class480.field6909[1] = 0.0F;
            class480.field6909[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class480.field6909, 0);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        ++field7139;
        if (arg0 > -100) {
            method2856((class241) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IILav;)V")
    public final void method441(int arg0, int arg1, class325 arg2) {
        ++field7136;
        if (arg0 != -29092) {
            this.field7143 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2855(boolean arg0, long arg1) {
        ++field7144;
        class541.field7594.setTime(new Date(arg1));
        int var3 = class541.field7594.get(7);
        int var4 = class541.field7594.get(5);
        int var5 = class541.field7594.get(2);
        int var6 = class541.field7594.get(1);
        if (arg0) {
            method2854(-78);
        }
        int var7 = class541.field7594.get(11);
        int var8 = class541.field7594.get(12);
        int var9 = class541.field7594.get(13);
        return class197.field2271[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class651.field9148[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lhga;)V")
    public static final void method2856(class241 arg0) {
        if (class137.field1501 < 65535) {
            class670 var1 = arg0.field2980;
            class85.field860[class137.field1501] = arg0;
            class652.field9154[class137.field1501] = false;
            ++class137.field1501;
            int var2 = arg0.field2983;
            if (arg0.field2993) {
                var2 = 0;
            }
            int var3 = arg0.field2983;
            if (arg0.field2979) {
                var3 = class612.field8618 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3706((byte) 118) - var1.method3708((byte) 83) + class291.field3640 >> class559.field7984;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3706((byte) 125) + var1.method3708((byte) 83) - class291.field3640 >> class559.field7984;
                if (var7 >= class247.field3058) {
                    var7 = class247.field3058 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field2987[var5++];
                    int var10 = (var1.method3711(1795643394) - var1.method3708((byte) 83) + class291.field3640 >> class559.field7984) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class122.field1369) {
                        var11 = class122.field1369 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class312.field3882[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class312.field3882[var4][var12][var8] = var13 | (long) class137.field1501;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class312.field3882[var4][var12][var8] = var13 | (long) class137.field1501 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class312.field3882[var4][var12][var8] = var13 | (long) class137.field1501 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class312.field3882[var4][var12][var8] = var13 | (long) class137.field1501 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        if (arg0 == -48) {
            ++field7146;
            if (~super.field855.field5954 < -1) {
                float var3 = -0.5F / (float) super.field855.field5954;
                super.field855.method2431((byte) -123, 1);
                class480.field6909[0] = 0.0F;
                class480.field6909[1] = 0.0F;
                class480.field6909[2] = var3;
                class480.field6909[3] = super.field855.field5902 * var3 + 0.25F;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class480.field6909, 0);
                OpenGL.glPopMatrix();
                super.field855.method2394((byte) -116, (float) super.field855.field5954, 0.5F);
                super.field855.method2396((byte) 36, this.field7137);
                super.field855.method2431((byte) -66, 0);
            }
            this.field7143.method222('\u0000', (byte) -53);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lvj;Lud;)V")
    public class492(class422 arg0, class123 arg1) {
        super(arg0);
        this.field7145 = arg1;
        this.method2853(false);
        this.field7137 = new class394(super.field855, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7137.method2236(-47, false);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        this.field7143.method222('\u0001', (byte) -78);
        ++field7147;
        if (super.field855.field5954 > 0) {
            super.field855.method2431((byte) -82, 1);
            super.field855.method2396((byte) 36, (class325) null);
            super.field855.method2394((byte) -125, 0.0F, 1.0F);
            super.field855.method2431((byte) -74, 0);
        }
        super.field855.method2412((byte) -49, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 == 18610) {
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }
}
