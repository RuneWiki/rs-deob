import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class555 extends class460 {

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "Lul;")
    private class440 field8115;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "Luq;")
    private class458 field8122;

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "Lvh;")
    public static class125 field8114 = new class125(63, 0);

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "Lis;")
    public static class101 field8123 = null;

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method1168(int arg0) {
        ++field8124;
        return arg0 != 2048 ? true : true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIII)V", line = 25)
    public static final void method3249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8119;
        if (arg0 != 3) {
            method3249(-16, 8, -103, 55, 62, -113, -81);
        }
        for (class211 var7 = (class211) class539.field7921.method3313((byte) 68); var7 != null; var7 = (class211) class539.field7921.method3308(arg0 + -127)) {
            if (class148.field2508 >= var7.field3222) {
                var7.method3421(arg0);
            } else {
                class466.method2756(var7.field3225 * 2, (byte) -99, (var7.field3230 << 9) + 256, var7.field3224, arg3, arg4 >> 1, arg6 >> 1, arg2, (var7.field3226 << 9) + 256);
                class148.field2503.method2399(var7.field3221 | -16777216, class166.field2737[0] + arg1, class166.field2737[1] + arg5, 0, var7.field3231, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILjo;I)V", line = 52)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        ++field8118;
        super.field6621.method2295((byte) -117, arg1);
        super.field6621.method2270(arg0, (byte) 110);
        int var4 = -9 / ((arg2 - 65) / 53);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 63)
    public final void method1174(byte arg0) {
        ++field8120;
        this.field8122.method2658(0, '\u0001');
        super.field6621.method2308(1, -15115);
        if (arg0 >= -56) {
            this.field8122 = null;
        }
        super.field6621.method2295((byte) 38, (class337) null);
        super.field6621.method2308(0, -15115);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BZ)V", line = 77)
    public final void method1177(byte arg0, boolean arg1) {
        ++field8117;
        int var3 = -83 % ((arg0 - -85) / 38);
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V", line = 87)
    public static void method3250(int arg0) {
        int var1 = 104 / ((-70 - arg0) / 51);
        field8114 = null;
        field8123 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V", line = 97)
    public static final void method3251(boolean arg0) {
        class305.field4259 = null;
        class541.field7948 = null;
        class688.field9762 = null;
        class346.field4895 = null;
        class60.field882 = null;
        class530.field7812 = null;
        class148.field2503 = null;
        class514.field7628 = null;
        if (arg0) {
            field8123 = null;
        }
        class149.field2517 = null;
        class99.field1480 = null;
        class399.field5770 = null;
        class160.field2601 = null;
        ++field8125;
        class424.field6054 = null;
        class335.field4670 = null;
        class44.field593 = null;
        class623.field8874 = null;
        class168.field2748 = null;
        class243.field3567 = null;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)V", line = 125)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field8126;
        float var4 = (float) ((arg1 & 3) + arg2) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = ~(arg1 & 128) != -1;
        super.field6621.method2308(1, -15115);
        if (var7) {
            class511.field7606[2] = 0.0F;
            class511.field7606[1] = 0.0F;
            class511.field7606[3] = 0.0F;
            class511.field7606[0] = var6;
        } else {
            class511.field7606[3] = 0.0F;
            class511.field7606[0] = 0.0F;
            class511.field7606[1] = 0.0F;
            class511.field7606[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class511.field7606, 0);
        class511.field7606[0] = 0.0F;
        class511.field7606[3] = (float) super.field6621.field5456 * var4 % 1.0F;
        class511.field7606[2] = 0.0F;
        class511.field7606[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class511.field7606, 0);
        if (!this.field8115.field6360) {
            int var8 = (int) ((float) super.field6621.field5456 * var5 * 16.0F);
            super.field6621.method2295((byte) -111, this.field8115.field6361[var8 % 16]);
        } else {
            class511.field7606[3] = (float) super.field6621.field5456 * var5 % 1.0F;
            class511.field7606[1] = 0.0F;
            class511.field7606[0] = 0.0F;
            class511.field7606[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class511.field7606, 0);
        }
        super.field6621.method2308(0, -15115);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lkfa;Lul;)V", line = 178)
    public class555(class382 arg0, class440 arg1) {
        super(arg0);
        this.field8115 = arg1;
        this.field8122 = new class458(arg0, 2);
        this.field8122.method2656(0, (byte) 76);
        super.field6621.method2308(1, -15115);
        if (this.field8115.field6360) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6621.method2308(0, -15115);
        this.field8122.method2657(0);
        this.field8122.method2656(1, (byte) 76);
        super.field6621.method2308(1, -15115);
        if (this.field8115.field6360) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6621.method2308(0, -15115);
        this.field8122.method2657(0);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V", line = 215)
    public final void method1175(boolean arg0, int arg1) {
        ++field8121;
        this.field8122.method2658(arg1 ^ arg1, '\u0000');
        if (this.field8115.field6360) {
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) 103, this.field8115.field6369);
            super.field6621.method2308(0, -15115);
        }
    }
}
