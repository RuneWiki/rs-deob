import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class710 implements class241 {

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Z")
    private boolean field9931 = false;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Lji;")
    public class622 field9933;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public int field9923;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public int field9928;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "Z")
    private boolean field9932;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    private int field9917;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public int field9924;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field9922 = 0;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "F")
    public static float field9918 = 1024.0F;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Lnj;")
    public static class415 field9935 = new class415(57, 2);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method3898(int arg0, boolean arg1) {
        field9927++;
        if (arg1 != this.field9932) {
            int var3 = this.method3900(true);
            this.field9932 = true;
            this.method3902(-101);
            this.method3899(9984, var3);
        }
        if (arg0 <= 20) {
            this.field9928 = -103;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    private final void method3899(int arg0, int arg1) {
        if (arg0 != 9984) {
            this.field9931 = true;
        }
        this.field9933.field8588 -= arg1;
        field9921++;
        this.field9933.field8588 += this.method3900(true);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)I")
    private final int method3900(boolean arg0) {
        if (arg0) {
            field9929++;
            int var2 = this.field9933.method3401(this.field9923, 6) * this.field9917;
            return this.field9932 ? var2 * 4 / 3 : var2;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
    public static void method3901(byte arg0) {
        field9935 = null;
        int var1 = -94 % ((arg0 + 3) / 46);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    private final void method3902(int arg0) {
        this.field9933.method3388(this, false);
        int var2 = 29 / ((arg0 - 6) / 48);
        field9925++;
        if (this.field9931) {
            OpenGL.glTexParameteri(this.field9928, 10241, this.field9932 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9928, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9928, 10241, this.field9932 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9928, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I")
    public final int method3903(int arg0) {
        field9934++;
        return arg0 == 7124 ? this.field9924 : -44;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V")
    public final void method3904(byte arg0) {
        if (this.field9924 > 0) {
            this.field9933.method3396(this.method3900(true), this.field9924, 34842);
            this.field9924 = 0;
        }
        if (arg0 <= -65) {
            field9916++;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
    public final void method3905(boolean arg0, boolean arg1) {
        if (!arg1) {
            field9918 = 1.0437429F;
        }
        field9919++;
        if (arg0 != this.field9931) {
            this.field9931 = arg0;
            this.method3902(89);
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
    public final boolean method3906(int arg0) {
        field9920++;
        if (arg0 != -26150) {
            return false;
        } else if (this.field9933.field8640) {
            int var2 = this.method3900(true);
            this.field9933.method3388(this, false);
            OpenGL.glGenerateMipmapEXT(this.field9928);
            this.field9932 = true;
            this.method3902(-57);
            this.method3899(9984, var2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lji;IIIZ)V")
    public class710(class622 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field9933 = arg0;
        this.field9923 = arg2;
        this.field9928 = arg1;
        this.field9932 = arg4;
        this.field9917 = arg3;
        OpenGL.glGenTextures(1, class32.field480, 0);
        this.field9924 = class32.field480[0];
        this.method3899(9984, 0);
    }

    @OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3904((byte) -108);
        field9926++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public abstract void method1502(byte arg0);
}
