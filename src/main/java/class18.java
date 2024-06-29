import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class18 implements class233 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Lhk;")
    public class111 field434;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
    private boolean field436;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[Lwaa;")
    public static class732[] field426 = new class732[0];

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "J")
    public static long field429 = -1L;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[Lnf;")
    public static class604[] field424;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "[Lia;")
    public static class616[] field437;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Z")
    public final boolean method119(byte arg0) {
        field419++;
        if (!this.field434.field2041) {
            int var3 = 89 / ((-arg0 - 19) / 35);
            return false;
        }
        int var2 = this.method122(3);
        this.field434.method939(this, 8448);
        OpenGL.glGenerateMipmapEXT(this.field430);
        this.field436 = true;
        this.method124((byte) 101);
        this.method123(var2, 9729);
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZB)V")
    public final void method120(boolean arg0, byte arg1) {
        field439++;
        if (arg1 != 2) {
            this.method121(47);
        }
        if (this.field436 != arg0) {
            int var3 = this.method122(3);
            this.field436 = true;
            this.method124((byte) 101);
            this.method123(var3, 9729);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)I")
    public final int method121(int arg0) {
        field425++;
        return arg0 >= -118 ? 9 : this.field433;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)I")
    private final int method122(int arg0) {
        if (arg0 == 3) {
            field420++;
            int var2 = this.field434.method969(this.field427, arg0 ^ 0x52) * this.field435;
            return this.field436 ? var2 * 4 / 3 : var2;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field422++;
        this.method128((byte) 118);
        super.finalize();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    private final void method123(int arg0, int arg1) {
        field438++;
        this.field434.field1952 -= arg0;
        this.field434.field1952 += this.method122(3);
        if (arg1 != 9729) {
            this.field430 = 127;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
    private final void method124(byte arg0) {
        this.field434.method939(this, arg0 + 8347);
        if (arg0 != 101) {
            return;
        }
        field421++;
        if (this.field423) {
            OpenGL.glTexParameteri(this.field430, 10241, this.field436 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field430, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field430, 10241, this.field436 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field430, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)I")
    public static int method125(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
    public final void method126(boolean arg0, int arg1) {
        if (arg0 != this.field423) {
            this.field423 = arg0;
            this.method124((byte) 101);
        }
        if (arg1 != -22513) {
            field424 = null;
        }
        field432++;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static void method127(int arg0) {
        field437 = null;
        field426 = null;
        if (arg0 > -61) {
            method127(24);
        }
        field424 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lhk;IIIZ)V")
    public class18(class111 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field427 = arg2;
        this.field434 = arg0;
        this.field430 = arg1;
        this.field435 = arg3;
        this.field436 = arg4;
        OpenGL.glGenTextures(1, class330.field4481, 0);
        this.field433 = class330.field4481[0];
        this.method123(0, 9729);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
    public final void method128(byte arg0) {
        if (this.field433 > 0) {
            this.field434.method981(this.field433, this.method122(3), -104);
            this.field433 = 0;
        }
        field428++;
        if (arg0 != 118) {
            this.field427 = 2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public abstract void method129(int arg0);
}
