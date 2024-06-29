import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class445 extends class11 {

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Lme;")
    private class168 field6659;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Lub;")
    private class19 field6658;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Lig;")
    public static class206 field6661 = new class206(7, -2);

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Lkca;")
    public static class73 field6663 = new class73(10, 3);

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lig;")
    public static class206 field6664 = new class206(106, 2);

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "Lta;")
    public static class181 field6665;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
    public static void method2775(int arg0) {
        field6665 = null;
        field6664 = null;
        field6663 = null;
        if (arg0 != -16568) {
            field6663 = null;
        }
        field6661 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        ++field6662;
        return arg0 != 95 ? true : true;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lad;Lme;)V")
    public class445(class362 arg0, class168 arg1) {
        super(arg0);
        this.field6659 = arg1;
        this.field6658 = new class19(arg0, 2);
        this.field6658.method121((byte) -18, 0);
        super.field95.method2269((byte) 82, 1);
        if (this.field6659.field2048) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field95.method2269((byte) -98, 0);
        this.field6658.method124(7);
        this.field6658.method121((byte) -18, 1);
        super.field95.method2269((byte) 110, 1);
        if (this.field6659.field2048) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field95.method2269((byte) 97, 0);
        this.field6658.method124(7);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        this.field6658.method122('\u0001', (byte) 91);
        ++field6654;
        int var2 = -119 / ((arg0 - -61) / 40);
        super.field95.method2269((byte) -115, 1);
        super.field95.method2295(-49, (class507) null);
        super.field95.method2269((byte) -114, 0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        if (arg0 <= 115) {
            this.method63(-50);
        }
        ++field6657;
        this.field6658.method122('\u0000', (byte) 20);
        if (this.field6659.field2048) {
            super.field95.method2269((byte) -111, 1);
            super.field95.method2295(-88, this.field6659.field2058);
            super.field95.method2269((byte) -104, 0);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        ++field6653;
        super.field95.method2295(arg1 + -65, arg2);
        super.field95.method2288(arg0, 7681);
        if (arg1 != -1) {
            this.field6658 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field6655;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2776(int arg0, byte arg1, int arg2) {
        ++field6660;
        if (arg1 > -33) {
            method2776(18, (byte) -88, -106);
        }
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        ++field6656;
        if (arg2 < 124) {
            field6663 = null;
        }
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field95.method2269((byte) -127, 1);
        boolean var7 = (128 & arg0) != 0;
        if (!var7) {
            class266.field3753[1] = 0.0F;
            class266.field3753[0] = 0.0F;
            class266.field3753[2] = var6;
            class266.field3753[3] = 0.0F;
        } else {
            class266.field3753[3] = 0.0F;
            class266.field3753[0] = var6;
            class266.field3753[2] = 0.0F;
            class266.field3753[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class266.field3753, 0);
        class266.field3753[3] = (float) super.field95.field5351 * var4 % 1.0F;
        class266.field3753[1] = var6;
        class266.field3753[2] = 0.0F;
        class266.field3753[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class266.field3753, 0);
        if (this.field6659.field2048) {
            class266.field3753[1] = 0.0F;
            class266.field3753[3] = (float) super.field95.field5351 * var5 % 1.0F;
            class266.field3753[0] = 0.0F;
            class266.field3753[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class266.field3753, 0);
        } else {
            int var8 = (int) ((float) super.field95.field5351 * var5 * 16.0F);
            super.field95.method2295(-72, this.field6659.field2051[var8 % 16]);
        }
        super.field95.method2269((byte) 101, 0);
    }
}
