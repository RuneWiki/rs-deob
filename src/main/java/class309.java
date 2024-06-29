import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class309 extends class348 {

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Lwc;")
    private class273 field4832;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lkp;")
    private class292 field4826;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Lbi;")
    public static class104 field4831 = new class104(14, 12);

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Lgi;")
    public static class437 field4834 = null;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public static int field4836 = 0;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Z")
    public static boolean field4835;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public final void method265(int arg0) {
        ++field4833;
        int var2 = -6 / ((arg0 - 61) / 63);
        this.field4826.method1963(true, '\u0001');
        super.field5398.method1507(1, 0);
        super.field5398.method1540(85, (class427) null);
        super.field5398.method1507(0, 0);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lna;Lwc;)V")
    public class309(class211 arg0, class273 arg1) {
        super(arg0);
        this.field4832 = arg1;
        this.field4826 = new class292(arg0, 2);
        this.field4826.method1965(0, (byte) -48);
        super.field5398.method1507(1, 0);
        if (this.field4832.field4346) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field5398.method1507(0, 0);
        this.field4826.method1962(-6635);
        this.field4826.method1965(1, (byte) -121);
        super.field5398.method1507(1, 0);
        if (this.field4832.field4346) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field5398.method1507(0, 0);
        this.field4826.method1962(-6635);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z")
    public final boolean method267(int arg0) {
        ++field4823;
        return arg0 == -233;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(ZB)V")
    public final void method261(boolean arg0, byte arg1) {
        ++field4824;
        this.field4826.method1963(true, '\u0000');
        if (this.field4832.field4346) {
            super.field5398.method1507(1, 0);
            super.field5398.method1540(102, this.field4832.field4350);
            super.field5398.method1507(0, 0);
        }
        if (arg1 > -30) {
            this.method264(55, 46, (class427) null);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method2072(byte arg0) {
        if (arg0 >= -94) {
            field4834 = null;
        }
        field4831 = null;
        field4834 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[B")
    public static final byte[] method2073(int arg0, int arg1) {
        ++field4828;
        class59 var2 = (class59) class305.field4798.method2130(false, (long) arg1);
        if (arg0 != 0) {
            method2072((byte) 66);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class167.method1057(-3481, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class59(var3);
            class305.field4798.method2132(var2, (long) arg1, 21826);
        }
        return var2.field944;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)V")
    public final void method263(int arg0, int arg1, byte arg2) {
        ++field4830;
        float var4 = (float) ((arg1 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((29 & arg1) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(64 & arg1) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field5398.method1507(1, 0);
        if (arg2 > -51) {
            field4831 = null;
        }
        boolean var7 = ~(128 & arg1) != -1;
        if (!var7) {
            class6.field75[0] = 0.0F;
            class6.field75[2] = var6;
            class6.field75[3] = 0.0F;
            class6.field75[1] = 0.0F;
        } else {
            class6.field75[1] = 0.0F;
            class6.field75[2] = 0.0F;
            class6.field75[0] = var6;
            class6.field75[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class6.field75, 0);
        class6.field75[3] = (float) super.field5398.field3484 * var4 % 1.0F;
        class6.field75[2] = 0.0F;
        class6.field75[0] = 0.0F;
        class6.field75[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class6.field75, 0);
        if (this.field4832.field4346) {
            class6.field75[1] = 0.0F;
            class6.field75[3] = (float) super.field5398.field3484 * var5 % 1.0F;
            class6.field75[2] = 0.0F;
            class6.field75[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class6.field75, 0);
        } else {
            int var8 = (int) ((float) super.field5398.field3484 * var5 * 16.0F);
            super.field5398.method1540(103, this.field4832.field4347[var8 % 16]);
        }
        super.field5398.method1507(0, 0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILed;)V")
    public final void method264(int arg0, int arg1, class427 arg2) {
        super.field5398.method1540(74, arg2);
        ++field4827;
        int var4 = -73 % ((-49 - arg1) / 44);
        super.field5398.method1494(arg0, -25951);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZB)V")
    public final void method262(boolean arg0, byte arg1) {
        int var3 = -38 % ((arg1 - -23) / 41);
        ++field4825;
    }
}
