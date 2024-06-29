import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class290 extends class363 {

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Lqh;")
    private class48 field4164;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "Lbw;")
    private class483 field4168;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
    public static boolean field4167 = false;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "Lwt;")
    public static class202 field4171;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Lrs;")
    public static class461 field4170;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        int var2 = 91 % ((37 - arg0) / 48);
        ++field4160;
        return true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        ++field4165;
        this.field4168.method2863(arg0, '\u0001');
        super.field5564.method2176(1, 99);
        super.field5564.method2200((class446) null, (byte) 127);
        super.field5564.method2176(0, 60);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public static void method1859(byte arg0) {
        field4171 = null;
        if (arg0 != -16) {
            field4170 = null;
        }
        field4170 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lod;Lqh;)V")
    public class290(class349 arg0, class48 arg1) {
        super(arg0);
        this.field4164 = arg1;
        this.field4168 = new class483(arg0, 2);
        this.field4168.method2869(0, 24);
        super.field5564.method2176(1, 70);
        if (this.field4164.field778) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5564.method2176(0, 56);
        this.field4168.method2870(1952872654);
        this.field4168.method2869(1, -126);
        super.field5564.method2176(1, 89);
        if (this.field4164.field778) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5564.method2176(0, 62);
        this.field4168.method2870(1952872654);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljk;IB)V")
    public final void method121(class446 arg0, int arg1, byte arg2) {
        ++field4166;
        super.field5564.method2200(arg0, (byte) 114);
        if (arg2 >= -69) {
            field4170 = null;
        }
        super.field5564.method2186(arg1, -63);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V")
    public final void method122(boolean arg0, byte arg1) {
        if (arg1 == 52) {
            ++field4161;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)V")
    public final void method125(boolean arg0, int arg1) {
        if (arg1 <= -69) {
            this.field4168.method2863(false, '\u0000');
            ++field4162;
            if (this.field4164.field778) {
                super.field5564.method2176(1, 69);
                super.field5564.method2200(this.field4164.field773, (byte) 120);
                super.field5564.method2176(0, 58);
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1860(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class228.field3379 = arg4;
        class38.field558 = arg1;
        class390.field5876 = arg2;
        if (arg0) {
            method1859((byte) 69);
        }
        class267.field3906 = arg5;
        class227.field3328 = arg3;
        ++field4169;
        if (~class228.field3379 <= -101) {
            int var6 = class267.field3906 * 128 + 64;
            int var7 = class38.field558 * 128 - -64;
            int var8 = class377.method2316(var7, arg0, var6, class79.field1192) - class390.field5876;
            int var9 = -class24.field258 + var6;
            int var10 = -class291.field4175 + var8;
            int var11 = -class260.field3827 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class18.field195 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 16383;
            class259.field3812 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 16383;
            class296.field4216 = 0;
            if (~class18.field195 > -1025) {
                class18.field195 = 1024;
            }
            if (class18.field195 > 3072) {
                class18.field195 = 3072;
            }
        }
        class140.field2103 = 2;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        ++field4163;
        float var4 = (float) ((3 & arg2) + 1) * -5.0E-4F;
        if (arg1 >= -13) {
            this.method128(-126, -109, -75);
        }
        float var5 = (float) (((26 & arg2) >> 3) + 1) * 5.0E-4F;
        float var6 = (arg2 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (arg2 & 128) != 0;
        super.field5564.method2176(1, 68);
        if (var7) {
            client.field2843[3] = 0.0F;
            client.field2843[0] = var6;
            client.field2843[1] = 0.0F;
            client.field2843[2] = 0.0F;
        } else {
            client.field2843[1] = 0.0F;
            client.field2843[2] = var6;
            client.field2843[0] = 0.0F;
            client.field2843[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, client.field2843, 0);
        client.field2843[3] = (float) super.field5564.field5228 * var4 % 1.0F;
        client.field2843[0] = 0.0F;
        client.field2843[2] = 0.0F;
        client.field2843[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, client.field2843, 0);
        if (!this.field4164.field778) {
            int var8 = (int) ((float) super.field5564.field5228 * var5 * 16.0F);
            super.field5564.method2200(this.field4164.field776[var8 % 16], (byte) 112);
        } else {
            client.field2843[2] = 0.0F;
            client.field2843[3] = (float) super.field5564.field5228 * var5 % 1.0F;
            client.field2843[1] = 0.0F;
            client.field2843[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, client.field2843, 0);
        }
        super.field5564.method2176(0, 40);
    }

    static {
        new class475("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field4171 = new class202("", 12);
    }
}
