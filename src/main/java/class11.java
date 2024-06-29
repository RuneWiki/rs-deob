import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class460 {

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "Ldk;")
    private class477 field112;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "Lqda;")
    private class93 field111;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "[J")
    public static long[] field102 = new long[32];

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "Lsa;")
    public static class193 field110;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        if (arg1 == -32460) {
            this.field111.method688((byte) 106, '\u0000');
            ++field101;
            if (this.field112.field5943) {
                super.field5744.method3126(1, -43);
                super.field5744.method3194((byte) 75, this.field112.field5936);
                super.field5744.method3126(0, -106);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        super.field5744.method3194((byte) 75, arg2);
        int var4 = 100 / ((arg1 - 25) / 59);
        ++field108;
        super.field5744.method3134(-103, arg0);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        if (arg0 <= 100) {
            this.field111 = null;
        }
        ++field103;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        ++field107;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) ((arg0 >> 3 & 3) + 1) * 5.0E-4F;
        if (arg2 > -110) {
            this.field111 = null;
        }
        float var6 = ~(64 & arg0) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg0 & 128) != -1;
        super.field5744.method3126(1, -85);
        if (var7) {
            class347.field4466[0] = var6;
            class347.field4466[3] = 0.0F;
            class347.field4466[2] = 0.0F;
            class347.field4466[1] = 0.0F;
        } else {
            class347.field4466[0] = 0.0F;
            class347.field4466[2] = var6;
            class347.field4466[3] = 0.0F;
            class347.field4466[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class347.field4466, 0);
        class347.field4466[3] = (float) super.field5744.field7595 * var4 % 1.0F;
        class347.field4466[0] = 0.0F;
        class347.field4466[2] = 0.0F;
        class347.field4466[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class347.field4466, 0);
        if (this.field112.field5943) {
            class347.field4466[3] = (float) super.field5744.field7595 * var5 % 1.0F;
            class347.field4466[1] = 0.0F;
            class347.field4466[2] = 0.0F;
            class347.field4466[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class347.field4466, 0);
        } else {
            int var8 = (int) ((float) super.field5744.field7595 * var5 * 16.0F);
            super.field5744.method3194((byte) 75, this.field112.field5940[var8 % 16]);
        }
        super.field5744.method3126(0, -40);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([BB)[B")
    public static final byte[] method50(byte[] arg0, byte arg1) {
        ++field113;
        if (arg1 != -92) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class70.method557(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        this.field111.method688((byte) 126, '\u0001');
        ++field104;
        super.field5744.method3126(1, -36);
        super.field5744.method3194((byte) 75, (class185) null);
        super.field5744.method3126(arg0, -70);
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Ljaa;Ldk;)V")
    public class11(class576 arg0, class477 arg1) {
        super(arg0);
        this.field112 = arg1;
        this.field111 = new class93(arg0, 2);
        this.field111.method684(0, (byte) -128);
        super.field5744.method3126(1, -86);
        if (this.field112.field5943) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5744.method3126(0, -106);
        this.field111.method690(true);
        this.field111.method684(1, (byte) -125);
        super.field5744.method3126(1, -110);
        if (this.field112.field5943) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5744.method3126(0, -127);
        this.field111.method690(true);
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
    public static void method51(byte arg0) {
        field110 = null;
        field102 = null;
        int var1 = 120 / ((arg0 - 22) / 44);
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field109;
        if (arg0 != -24566) {
            this.field111 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIILpd;IIIIBIILtl;)V")
    public static final void method52(int arg0, int arg1, int arg2, class241 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, class580 arg11) {
        class160.field1886 = arg0;
        class151.field1798 = null;
        class409.field5262 = arg2;
        ++field105;
        class315.field3948 = arg9;
        class457.field5702 = arg1;
        class379.field4871 = null;
        class664.field9024 = arg10;
        class432.field5455 = arg5;
        class637.field8628 = arg4;
        class577.field7749 = arg3;
        class480.field5979 = arg11;
        class361.field4631 = arg7;
        int var12 = -32 % ((arg8 - -13) / 52);
        class221.field2567 = null;
        class95.field1237 = arg6;
        class242.method1452(-943154398);
        class647.field8755 = true;
    }
}
