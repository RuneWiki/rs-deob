import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class530 extends class203 {

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "Lsa;")
    private class780 field7308;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "Lup;")
    private class545 field7303;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field7304 = 0;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "[[[Lug;")
    public static class472[][][] field7302;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method3149(int arg0, String[] arg1) {
        ++field7306;
        int var2 = -54 / ((-58 - arg0) / 43);
        String[] var3 = new String[5];
        for (int var4 = 0; ~var4 > -6; ++var4) {
            var3[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var3[var4] = var3[var4] + arg1[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        if (arg0 != -12) {
            this.field7308 = null;
        }
        ++field7305;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        ++field7301;
        float var4 = (float) ((3 & arg1) - -1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 24) >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (arg1 & 128) != 0;
        super.field2843.method1262(1, 0);
        if (var7) {
            class689.field9610[1] = 0.0F;
            class689.field9610[2] = 0.0F;
            class689.field9610[0] = var6;
            class689.field9610[3] = 0.0F;
        } else {
            class689.field9610[3] = 0.0F;
            class689.field9610[1] = 0.0F;
            class689.field9610[0] = 0.0F;
            class689.field9610[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class689.field9610, 0);
        if (!arg2) {
            field7302 = null;
        }
        class689.field9610[0] = 0.0F;
        class689.field9610[3] = (float) super.field2843.field2614 * var4 % 1.0F;
        class689.field9610[2] = 0.0F;
        class689.field9610[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class689.field9610, 0);
        if (!this.field7308.field10723) {
            int var8 = (int) ((float) super.field2843.field2614 * var5 * 16.0F);
            super.field2843.method1219((byte) 108, this.field7308.field10721[var8 % 16]);
        } else {
            class689.field9610[1] = 0.0F;
            class689.field9610[2] = 0.0F;
            class689.field9610[3] = (float) super.field2843.field2614 * var5 % 1.0F;
            class689.field9610[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class689.field9610, 0);
        }
        super.field2843.method1262(0, 0);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        ++field7309;
        if (arg0 < 64) {
            this.field7303 = null;
        }
        this.field7303.method3226(6, '\u0001');
        super.field2843.method1262(1, 0);
        super.field2843.method1219((byte) 104, (class539) null);
        super.field2843.method1262(0, 0);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        ++field7300;
        if (arg1 < 0) {
            this.method681(false, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
    public static void method3150(int arg0) {
        field7302 = null;
        if (arg0 != 9216) {
            method3150(-23);
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lpq;Lsa;)V")
    public class530(class194 arg0, class780 arg1) {
        super(arg0);
        this.field7308 = arg1;
        this.field7303 = new class545(arg0, 2);
        this.field7303.method3227(0, (byte) -107);
        super.field2843.method1262(1, 0);
        if (this.field7308.field10723) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2843.method1262(0, 0);
        this.field7303.method3225(-97);
        this.field7303.method3227(1, (byte) -111);
        super.field2843.method1262(1, 0);
        if (this.field7308.field10723) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2843.method1262(0, 0);
        this.field7303.method3225(-87);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        this.field7303.method3226(6, '\u0000');
        if (arg0 >= -25) {
            field7302 = null;
        }
        ++field7299;
        if (this.field7308.field10723) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 127, this.field7308.field10725);
            super.field2843.method1262(0, 0);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        if (!arg1) {
            ++field7307;
            super.field2843.method1219((byte) 112, arg2);
            super.field2843.method1263(arg0, 116);
        }
    }
}
