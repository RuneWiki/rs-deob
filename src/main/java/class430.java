import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class430 extends class477 {

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Lwl;")
    private class511 field5928;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Lbf;")
    private class181 field5923;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Loi;")
    public static class169 field5933 = new class169("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 3)
    public static void method2548(int arg0) {
        if (arg0 <= 79) {
            method2548(-8);
        }
        field5933 = null;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V", line = 16)
    public static final void method2549(int arg0) {
        ++field5929;
        if (class142.method976(0)) {
            if (class99.field1384 == null) {
                class4.method21((byte) -4);
            }
            class458.field6395 = true;
            class342.field4357 = 0;
            try {
                class338.field4326 = class396.field5266.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 != 9474) {
            field5935 = 28;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V", line = 43)
    public final void method271(boolean arg0, int arg1) {
        ++field5934;
        if (arg1 != -13) {
            method2551((class88) null, 57);
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lgk;Lwl;)V", line = 55)
    public class430(class463 arg0, class511 arg1) {
        super(arg0);
        this.field5928 = arg1;
        this.field5923 = new class181(arg0, 2);
        this.field5923.method1188(0, (byte) -94);
        super.field6964.method2741((byte) -38, 1);
        if (this.field5928.field7523) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6964.method2741((byte) -38, 0);
        this.field5923.method1193(-127);
        this.field5923.method1188(1, (byte) 62);
        super.field6964.method2741((byte) -38, 1);
        if (this.field5928.field7523) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6964.method2741((byte) -38, 0);
        this.field5923.method1193(20);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Z", line = 89)
    public final boolean method264(byte arg0) {
        if (arg0 <= 45) {
            this.field5928 = null;
        }
        ++field5925;
        return true;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)V", line = 100)
    public final void method270(boolean arg0, boolean arg1) {
        ++field5931;
        this.field5923.method1190((byte) -116, '\u0000');
        if (this.field5928.field7523) {
            super.field6964.method2741((byte) -38, 1);
            super.field6964.method2771(this.field5928.field7528, -16785);
            super.field6964.method2741((byte) -38, 0);
        }
        if (!arg0) {
            field5933 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lbt;I)Lpf;", line = 118)
    public static final class482 method2550(class88 arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field5927;
            return new class482(arg0.method603((byte) -33), arg0.method603((byte) -85), arg0.method603((byte) 109), arg0.method603((byte) 106), arg0.method584(255), arg0.method617(arg1 + 2));
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lrh;II)V", line = 129)
    public final void method266(class31 arg0, int arg1, int arg2) {
        super.field6964.method2771(arg0, -16785);
        ++field5932;
        super.field6964.method2739(arg2, 0);
        if (arg1 != -11) {
            this.method270(false, true);
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lbt;I)Lsh;", line = 143)
    public static final class506 method2551(class88 arg0, int arg1) {
        if (arg1 != 31208) {
            return null;
        } else {
            ++field5930;
            return new class506(arg0.method603((byte) -93), arg0.method603((byte) -61), arg0.method603((byte) 127), arg0.method603((byte) 111), arg0.method584(255), arg0.method584(255), arg0.method617(2));
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V", line = 159)
    public final void method272(byte arg0, int arg1, int arg2) {
        ++field5926;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (128 & arg1) != 0;
        super.field6964.method2741((byte) -38, 1);
        if (var7) {
            class375.field4881[0] = var6;
            class375.field4881[2] = 0.0F;
            class375.field4881[1] = 0.0F;
            class375.field4881[3] = 0.0F;
        } else {
            class375.field4881[0] = 0.0F;
            class375.field4881[1] = 0.0F;
            class375.field4881[2] = var6;
            class375.field4881[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class375.field4881, 0);
        class375.field4881[3] = (float) super.field6964.field6690 * var4 % 1.0F;
        class375.field4881[2] = 0.0F;
        class375.field4881[0] = 0.0F;
        class375.field4881[1] = var6;
        if (arg0 < 33) {
            method2549(-5);
        }
        OpenGL.glTexGenfv(8193, 9474, class375.field4881, 0);
        if (!this.field5928.field7523) {
            int var8 = (int) ((float) super.field6964.field6690 * var5 * 16.0F);
            super.field6964.method2771(this.field5928.field7527[var8 % 16], -16785);
        } else {
            class375.field4881[3] = (float) super.field6964.field6690 * var5 % 1.0F;
            class375.field4881[0] = 0.0F;
            class375.field4881[2] = 0.0F;
            class375.field4881[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class375.field4881, 0);
        }
        super.field6964.method2741((byte) -38, 0);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V", line = 216)
    public final void method269(byte arg0) {
        this.field5923.method1190((byte) 73, '\u0001');
        ++field5924;
        super.field6964.method2741((byte) -38, 1);
        if (arg0 != 126) {
            method2549(-56);
        }
        super.field6964.method2771((class31) null, -16785);
        super.field6964.method2741((byte) -38, 0);
    }
}
