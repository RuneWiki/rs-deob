import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class417 extends class45 {

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "Lm;")
    private class127 field6163;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "Lct;")
    private class98 field6154;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public static int field6159 = 0;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field6164;

    static {
        new class331("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new class331("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2545(int arg0) {
        ++field6160;
        try {
            if (~class372.field5534 == -2) {
                int var1 = class77.field1041.method2807(0);
                if (~var1 < -1 && class77.field1041.method2804((byte) -125)) {
                    int var2 = var1 - class206.field2999;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class77.field1041.method2798(true, var2);
                    return;
                }
                class77.field1041.method2810(2);
                class77.field1041.method2811((byte) -113);
                class346.field4814 = null;
                if (class127.field1852 != null) {
                    class372.field5534 = 2;
                } else {
                    class372.field5534 = 0;
                }
                class250.field3687 = null;
            }
            if (arg0 >= -43) {
                method2546(-66, 98);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class77.field1041.method2810(2);
            class127.field1852 = null;
            class372.field5534 = 0;
            class346.field4814 = null;
            class250.field3687 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILkj;Z)V", line = 52)
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        ++field6161;
        if (!arg2) {
            this.field6154 = null;
        }
        super.field506.method2188((byte) 78, arg1);
        super.field506.method2183(7681, arg0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 65)
    public final void method287(int arg0) {
        this.field6154.method832('\u0001', -1);
        ++field6162;
        super.field506.method2219(1, -119);
        super.field506.method2188((byte) 78, (class396) null);
        super.field506.method2219(arg0, -120);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V", line = 76)
    public final void method286(int arg0, int arg1, int arg2) {
        ++field6155;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field506.method2219(1, -125);
        boolean var7 = (128 & arg0) != 0;
        if (!var7) {
            class144.field2024[2] = var6;
            class144.field2024[0] = 0.0F;
            class144.field2024[1] = 0.0F;
            class144.field2024[3] = 0.0F;
        } else {
            class144.field2024[3] = 0.0F;
            class144.field2024[2] = 0.0F;
            class144.field2024[1] = 0.0F;
            class144.field2024[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class144.field2024, 0);
        class144.field2024[3] = (float) super.field506.field5306 * var4 % 1.0F;
        class144.field2024[0] = 0.0F;
        class144.field2024[1] = var6;
        class144.field2024[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class144.field2024, 0);
        if (this.field6163.field1845) {
            class144.field2024[3] = (float) super.field506.field5306 * var5 % 1.0F;
            class144.field2024[1] = 0.0F;
            class144.field2024[2] = 0.0F;
            class144.field2024[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class144.field2024, 0);
        } else {
            int var8 = (int) ((float) super.field506.field5306 * var5 * 16.0F);
            super.field506.method2188((byte) 78, this.field6163.field1847[var8 % 16]);
        }
        super.field506.method2219(0, -128);
        if (arg1 < 76) {
            method2546(-89, 5);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZB)V", line = 134)
    public final void method279(boolean arg0, byte arg1) {
        if (arg1 <= 115) {
            field6164 = 122;
        }
        ++field6157;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z", line = 145)
    public final boolean method280(boolean arg0) {
        ++field6153;
        if (!arg0) {
            this.field6154 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)V", line = 156)
    public final void method281(int arg0, boolean arg1) {
        ++field6158;
        if (arg0 == 0) {
            this.field6154.method832('\u0000', -1);
            if (this.field6163.field1845) {
                super.field506.method2219(1, -125);
                super.field506.method2188((byte) 78, this.field6163.field1844);
                super.field506.method2219(0, -120);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Ljv;", line = 174)
    public static final class56 method2546(int arg0, int arg1) {
        ++field6156;
        class56 var2 = (class56) class230.field3367.method1115((long) arg1, (byte) 58);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class85.field1164.method2363(arg1, 0, 106);
            if (arg0 <= 42) {
                field6159 = 50;
            }
            class56 var4 = new class56();
            if (var3 != null) {
                var4.method522(new class65(var3), 28201);
            }
            var4.method523(-116);
            class230.field3367.method1107(1, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lfd;Lm;)V", line = 204)
    public class417(class365 arg0, class127 arg1) {
        super(arg0);
        this.field6163 = arg1;
        this.field6154 = new class98(arg0, 2);
        this.field6154.method833(0, true);
        super.field506.method2219(1, -119);
        if (this.field6163.field1845) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field506.method2219(0, -118);
        this.field6154.method834((byte) 39);
        this.field6154.method833(1, true);
        super.field506.method2219(1, -121);
        if (this.field6163.field1845) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field506.method2219(0, -128);
        this.field6154.method834((byte) 39);
    }
}
