import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class687 extends class16 {

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "Lum;")
    private class479 field9716;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Lgq;")
    private class470 field9718;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lap;Lum;)V", line = 3)
    public class687(class435 arg0, class479 arg1) {
        super(arg0);
        this.field9716 = arg1;
        this.field9718 = new class470(arg0, 2);
        this.field9718.method2667(0, -30923);
        super.field141.method2380(1, (byte) -110);
        if (this.field9716.field7036) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field141.method2380(0, (byte) -84);
        this.field9718.method2668(1);
        this.field9718.method2667(1, -30923);
        super.field141.method2380(1, (byte) -75);
        if (this.field9716.field7036) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field141.method2380(0, (byte) -94);
        this.field9718.method2668(1);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 37)
    public static final long method3817(String arg0, byte arg1) {
        if (arg1 < 58) {
            field9712 = -14;
        }
        ++field9715;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z", line = 67)
    public final boolean method52(int arg0) {
        if (arg0 != 12733) {
            this.field9718 = null;
        }
        ++field9719;
        return true;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILuda;)V", line = 78)
    public final void method44(int arg0, int arg1, class412 arg2) {
        ++field9717;
        super.field141.method2388((byte) 97, arg2);
        super.field141.method2396(arg0, arg1);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(BZ)V", line = 87)
    public final void method46(byte arg0, boolean arg1) {
        ++field9711;
        if (arg0 != -61) {
            this.field9716 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V", line = 97)
    public static final void method3818(byte arg0) {
        if (arg0 != 17) {
            field9712 = 47;
        }
        ++field9708;
        class358.field4702.method3687((byte) -10);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIZ)V", line = 110)
    public final void method42(int arg0, int arg1, boolean arg2) {
        ++field9714;
        if (arg2) {
            this.field9716 = null;
        }
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 26) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field141.method2380(1, (byte) -80);
        boolean var7 = (arg0 & 128) != 0;
        if (!var7) {
            class598.field8499[3] = 0.0F;
            class598.field8499[1] = 0.0F;
            class598.field8499[0] = 0.0F;
            class598.field8499[2] = var6;
        } else {
            class598.field8499[3] = 0.0F;
            class598.field8499[0] = var6;
            class598.field8499[2] = 0.0F;
            class598.field8499[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class598.field8499, 0);
        class598.field8499[2] = 0.0F;
        class598.field8499[1] = var6;
        class598.field8499[3] = (float) super.field141.field5926 * var4 % 1.0F;
        class598.field8499[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class598.field8499, 0);
        if (!this.field9716.field7036) {
            int var8 = (int) ((float) super.field141.field5926 * var5 * 16.0F);
            super.field141.method2388((byte) 106, this.field9716.field7031[var8 % 16]);
        } else {
            class598.field8499[3] = (float) super.field141.field5926 * var5 % 1.0F;
            class598.field8499[1] = 0.0F;
            class598.field8499[2] = 0.0F;
            class598.field8499[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class598.field8499, 0);
        }
        super.field141.method2380(0, (byte) -112);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V", line = 167)
    public final void method48(byte arg0) {
        ++field9709;
        this.field9718.method2666('\u0001', (byte) 110);
        super.field141.method2380(1, (byte) -94);
        super.field141.method2388((byte) 80, (class412) null);
        super.field141.method2380(0, (byte) -112);
        int var2 = -58 / ((arg0 - -29) / 51);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZB)V", line = 182)
    public final void method50(boolean arg0, byte arg1) {
        ++field9710;
        if (arg1 != 42) {
            method3817((String) null, (byte) 29);
        }
        this.field9718.method2666('\u0000', (byte) 110);
        if (this.field9716.field7036) {
            super.field141.method2380(1, (byte) -91);
            super.field141.method2388((byte) 126, this.field9716.field7032);
            super.field141.method2380(0, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)I", line = 201)
    public static final int method3819(int arg0, byte arg1) {
        int var2 = -64 / ((31 - arg1) / 54);
        ++field9713;
        int var3 = arg0 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg0;
    }
}
