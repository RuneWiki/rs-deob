import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class504 extends class503 {

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lha;")
    private class40 field7690;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Lfc;")
    private class162 field7689;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "[I")
    public static int[] field7691 = new int[256];

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Lce;")
    public static class193 field7695;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "[Lcu;")
    public static class139[] field7697;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Lhu;")
    private class81 field7700;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field7691[var0] = var1;
        }
        field7695 = new class193();
        new class194("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field7697 = new class139[32768];
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V", line = 3)
    public final void method625(boolean arg0, boolean arg1) {
        ++field7694;
        super.field7679.method2919(8448, 260, arg0);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lrl;Lha;)V", line = 12)
    public class504(class487 arg0, class40 arg1) {
        super(arg0);
        this.field7690 = arg1;
        this.method3032(true);
        this.field7689 = new class162(super.field7679, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field7689.method1022(false, (byte) 116);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V", line = 23)
    public final void method627(boolean arg0, int arg1) {
        if (super.field7679.field7441 > 0) {
            float var3 = -0.5F / (float) super.field7679.field7441;
            super.field7679.method2849(1, (byte) -109);
            class312.field4541[2] = var3;
            class312.field4541[0] = 0.0F;
            class312.field4541[3] = super.field7679.field7360 * var3 + 0.25F;
            class312.field4541[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class312.field4541, 0);
            OpenGL.glPopMatrix();
            super.field7679.method2858((float) super.field7679.field7441, 47, 0.5F);
            super.field7679.method2883(this.field7689, arg1 ^ 1893);
            super.field7679.method2849(0, (byte) -109);
        }
        if (arg1 == -1805) {
            ++field7693;
            this.field7700.method523((byte) -28, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 63)
    private final void method3032(boolean arg0) {
        if (!arg0) {
            this.method629((byte) 66);
        }
        ++field7699;
        this.field7700 = new class81(super.field7679, 2);
        this.field7700.method520(122, 0);
        super.field7679.method2849(1, (byte) -109);
        super.field7679.method2919(260, 7681, false);
        super.field7679.method2855(0, (byte) 50, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field7679.method2849(0, (byte) -109);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7690.field615) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7700.method522(false);
        this.field7700.method520(109, 1);
        super.field7679.method2849(1, (byte) -109);
        super.field7679.method2919(8448, 8448, false);
        super.field7679.method2855(0, (byte) 50, 5890, 768);
        OpenGL.glDisable(3168);
        super.field7679.method2849(0, (byte) -109);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7690.field615) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7700.method522(false);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lbn;I)V", line = 107)
    public static final void method3033(class294 arg0, int arg1) {
        if (arg1 == 31737) {
            ++field7698;
            if (arg0 instanceof class139) {
                class139 var2 = (class139) arg0;
                if (var2.field1825 != null) {
                    class56.method421(arg1 ^ -31648, ~class415.field6145.field2956 != ~var2.field2956, var2);
                    return;
                }
            } else {
                if (!(arg0 instanceof class313)) {
                    return;
                }
                class313 var3 = (class313) arg0;
                class330.method1985((byte) 67, var3, ~class415.field6145.field2956 != ~var3.field2956);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z", line = 134)
    public final boolean method623(byte arg0) {
        ++field7687;
        if (arg0 < 45) {
            this.method623((byte) 90);
        }
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V", line = 145)
    public final void method624(int arg0, int arg1, int arg2) {
        int var4 = 90 % (arg0 / 59);
        ++field7688;
        if (~(arg2 & 1) != -2) {
            if (!this.field7690.field615) {
                super.field7679.method2883(this.field7690.field610[0], 65);
            } else {
                super.field7679.method2883(this.field7690.field621, 62);
                class312.field4541[1] = 0.0F;
                class312.field4541[0] = 0.0F;
                class312.field4541[2] = 0.0F;
                class312.field4541[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class312.field4541, 0);
            }
        } else if (!this.field7690.field615) {
            int var5 = super.field7679.field7316 % 4000 * 16 / 4000;
            super.field7679.method2883(this.field7690.field610[var5], -109);
        } else {
            super.field7679.method2883(this.field7690.field621, 69);
            class312.field4541[1] = 0.0F;
            class312.field4541[2] = 0.0F;
            class312.field4541[0] = 0.0F;
            class312.field4541[3] = (float) (super.field7679.field7316 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, class312.field4541, 0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 189)
    public final void method629(byte arg0) {
        ++field7686;
        this.field7700.method523((byte) -56, '\u0001');
        if (arg0 != -122) {
            field7695 = null;
        }
        if (~super.field7679.field7441 < -1) {
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, 35);
            super.field7679.method2858(0.0F, 47, 1.0F);
            super.field7679.method2849(0, (byte) -109);
        }
        super.field7679.method2919(8448, 8448, false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLtu;)V", line = 213)
    public final void method626(int arg0, byte arg1, class221 arg2) {
        if (arg1 >= -21) {
            field7696 = -30;
        }
        ++field7692;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V", line = 254)
    public static void method3034(int arg0) {
        field7691 = null;
        field7695 = null;
        if (arg0 != -995) {
            method3034(-63);
        }
        field7697 = null;
    }
}
