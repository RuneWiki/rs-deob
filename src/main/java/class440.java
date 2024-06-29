import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class440 implements class463 {

    @OriginalMember(owner = "client!go", name = "p", descriptor = "Z")
    private boolean field6423 = false;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Z")
    private boolean field6414;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public int field6424;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "Lqg;")
    public class321 field6421;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public int field6422;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[Llo;")
    public static class527[] field6410 = new class527[4];

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field6419 = -50;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lgf;")
    public static class180 field6417 = new class180("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method2666(int arg0) {
        field6426++;
        if (!this.field6421.field4836) {
            if (arg0 != -6454) {
                this.method2676(78);
            }
            return false;
        }
        int var2 = this.method2675(0);
        this.field6421.method2042(this, arg0 ^ 0xFFFFE6CA);
        OpenGL.glGenerateMipmapEXT(this.field6424);
        this.field6414 = true;
        this.method2672(arg0 + 6328);
        this.method2671(var2, 30673);
        return true;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 32)
    public static void method2667(int arg0) {
        field6410 = null;
        field6417 = null;
        if (arg0 <= 121) {
            field6417 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIII[ILqg;)Lls;", line = 43)
    public static final class92 method2668(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, class321 arg5) {
        if (arg3 != 3553) {
            return null;
        }
        field6428++;
        if (!arg5.field4816 && (!class390.method2453(-2628, arg1) || !class390.method2453(arg3 ^ 0xFFFFF85D, arg2))) {
            return arg5.field4921 ? new class92(arg5, 34037, arg1, arg2, arg0, arg4) : new class92(arg5, arg1, arg2, class159.method1146(false, arg1), class159.method1146(false, arg2), arg4);
        } else {
            return new class92(arg5, 3553, arg1, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() throws Throwable {
        this.method2670(2957);
        field6416++;
        super.finalize();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBILtn;)V", line = 74)
    public static final void method2669(int arg0, byte arg1, int arg2, class58 arg3) {
        field6415++;
        class229.field3352 = arg0;
        class371.field5566 = arg2;
        if (arg1 < -75) {
            class443.field6496 = arg3;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 91)
    public final void method2670(int arg0) {
        if (this.field6422 > 0) {
            this.field6421.method2007(this.field6422, false, this.method2675(0));
            this.field6422 = 0;
        }
        if (arg0 != 2957) {
            this.method2676(100);
        }
        field6413++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V", line = 108)
    private final void method2671(int arg0, int arg1) {
        field6420++;
        if (arg1 == 30673) {
            this.field6421.field4798 -= arg0;
            this.field6421.field4798 += this.method2675(0);
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V", line = 124)
    private final void method2672(int arg0) {
        this.field6421.method2042(this, 0);
        if (arg0 > -107) {
            return;
        }
        field6418++;
        if (this.field6423) {
            OpenGL.glTexParameteri(this.field6424, 10241, this.field6414 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field6424, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field6424, 10241, this.field6414 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field6424, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V", line = 146)
    public final void method2673(int arg0, boolean arg1) {
        if (this.field6423 != arg1) {
            this.field6423 = arg1;
            this.method2672(-115);
        }
        field6409++;
        int var3 = -17 % ((-arg0 - 8) / 63);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V", line = 170)
    public final void method2674(byte arg0, boolean arg1) {
        field6408++;
        if (arg0 > -109) {
            this.field6412 = 6;
        }
        if (this.field6414 != arg1) {
            int var3 = this.method2675(0);
            this.field6414 = true;
            this.method2672(-128);
            this.method2671(var3, 30673);
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)I", line = 195)
    private final int method2675(int arg0) {
        field6411++;
        if (arg0 != 0) {
            this.field6414 = false;
        }
        int var2 = this.field6421.method2025(this.field6412, 1) * this.field6425;
        return this.field6414 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lqg;IIIZ)V", line = 228)
    public class440(class321 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6414 = arg4;
        this.field6424 = arg1;
        this.field6412 = arg2;
        this.field6421 = arg0;
        this.field6425 = arg3;
        OpenGL.glGenTextures(1, class33.field520, 0);
        this.field6422 = class33.field520[0];
        this.method2671(0, 30673);
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I", line = 216)
    public final int method2676(int arg0) {
        field6427++;
        return arg0 == 27180 ? this.field6422 : 81;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public abstract void method329(boolean arg0);
}
