import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public abstract class class377 implements class200 {

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "Z")
    private boolean field5287 = false;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "Llea;")
    public class573 field5288;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "Z")
    private boolean field5292;

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!fga", name = "k", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "S")
    public static short field5279 = 256;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
    public static int field5281 = 0;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
    public final void method2266(int arg0, boolean arg1) {
        field5280++;
        if (arg0 >= 1 && arg1 != this.field5287) {
            this.field5287 = arg1;
            this.method2276((byte) 85);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
    private final void method2267(int arg0, int arg1) {
        field5293++;
        this.field5288.field8149 -= arg1;
        this.field5288.field8149 += this.method2268(arg0 + 30608);
        if (arg0 != -30608) {
            this.field5292 = false;
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)I")
    private final int method2268(int arg0) {
        if (arg0 == 0) {
            field5285++;
            int var2 = this.field5288.method3315(this.field5289, arg0 + 30626) * this.field5294;
            return this.field5292 ? var2 * 4 / 3 : var2;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)I")
    public static final int method2269(byte arg0) {
        if (arg0 != 53) {
            field5279 = -29;
        }
        field5299++;
        return class406.method2405(false, (byte) -117);
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)I")
    public final int method2270(int arg0) {
        if (arg0 > -92) {
            this.field5298 = 84;
        }
        field5295++;
        return this.field5284;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BZ)V")
    public final void method2271(byte arg0, boolean arg1) {
        field5282++;
        if (arg0 != 59) {
            this.method2270(101);
        }
        if (arg1 != this.field5292) {
            int var3 = this.method2268(0);
            this.field5292 = true;
            this.method2276((byte) -94);
            this.method2267(-30608, var3);
        }
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(B)V")
    public final void method2272(byte arg0) {
        if (this.field5284 > 0) {
            this.field5288.method3349(this.method2268(0), (byte) -110, this.field5284);
            this.field5284 = 0;
        }
        field5291++;
        if (arg0 != 27) {
            this.field5292 = true;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
    public static final boolean method2273(int arg0, int arg1, int arg2) {
        field5283++;
        int var3 = 49 / ((78 - arg0) / 37);
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)Z")
    public final boolean method2274(boolean arg0) {
        if (arg0) {
            return true;
        }
        field5290++;
        if (!this.field5288.field8207) {
            return false;
        }
        int var2 = this.method2268(0);
        this.field5288.method3384(this, (byte) 74);
        OpenGL.glGenerateMipmapEXT(this.field5298);
        this.field5292 = true;
        this.method2276((byte) 110);
        this.method2267(-30608, var2);
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lgga;IZ)Lkia;")
    public static final class94 method2275(class513 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2275(null, -78, false);
        }
        field5286++;
        byte[] var3 = arg0.method2988(arg1, 0);
        return var3 == null ? null : new class94(var3);
    }

    @OriginalMember(owner = "client!fga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2272((byte) 27);
        field5297++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(B)V")
    private final void method2276(byte arg0) {
        this.field5288.method3384(this, (byte) 99);
        field5296++;
        int var2 = -76 / ((arg0 + 25) / 59);
        if (this.field5287) {
            OpenGL.glTexParameteri(this.field5298, 10241, this.field5292 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5298, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5298, 10241, this.field5292 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5298, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Llea;IIIZ)V")
    public class377(class573 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5288 = arg0;
        this.field5292 = arg4;
        this.field5298 = arg1;
        this.field5289 = arg2;
        this.field5294 = arg3;
        OpenGL.glGenTextures(1, class190.field2848, 0);
        this.field5284 = class190.field2848[0];
        this.method2267(-30608, 0);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
    public abstract void method1359(int arg0);
}
