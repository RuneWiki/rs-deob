import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class296 extends class424 {

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "F")
    public float field3873;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "F")
    public static float field3884;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1750(int arg0, int arg1, int arg2) {
        field3879++;
        if (arg1 < 92) {
            method1750(-69, -127, 84);
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I", line = 21)
    public final int method1751(int arg0) {
        if (arg0 <= 108) {
            this.method1755(-69);
        }
        field3881++;
        return this.field3885;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I", line = 35)
    public final int method1752(int arg0) {
        field3872++;
        return arg0 < 24 ? -101 : this.field3875;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I", line = 52)
    public final int method1753(byte arg0) {
        if (arg0 < 126) {
            this.method1756((byte) -13);
        }
        field3883++;
        return this.field3880;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)I", line = 63)
    public final int method1754(int arg0) {
        field3877++;
        return arg0 < 11 ? 18 : this.field3876;
    }

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)I", line = 79)
    public final int method1755(int arg0) {
        field3874++;
        return arg0 < 76 ? -92 : this.field3878;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)F", line = 93)
    public final float method1756(byte arg0) {
        field3882++;
        return arg0 == 124 ? this.field3873 : 1.6464003F;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIF)V", line = 103)
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3873 = arg5;
        this.field3875 = arg3;
        this.field3880 = arg1;
        this.field3885 = arg4;
        this.field3878 = arg2;
        this.field3876 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FI)V")
    public abstract void method1308(float arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BIII)V")
    public abstract void method1309(byte arg0, int arg1, int arg2, int arg3);
}
