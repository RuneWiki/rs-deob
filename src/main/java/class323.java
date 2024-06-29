import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class323 extends class102 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public int field4446;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field4452;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "[F")
    public static float[] field4445 = new float[16384];

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[F")
    public static float[] field4454 = new float[16384];

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field4456;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4445[var2] = (float) Math.sin((double) var2 * var0);
            field4454[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lqa;IZIILco;I)V", line = 15)
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        field4450++;
        if (arg6 != 21130) {
            this.method179(29);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIZ)V", line = 27)
    public static final void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4451++;
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        if (arg7) {
            return;
        }
        int var9 = (class629.field9244 - class304.field4184) * var8 / 100 + class304.field4184;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16384 - arg1 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class589.field8742[var11] * -var10 >> 15;
            var15 = class589.field8735[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class589.field8742[var12] * var15 >> 15;
            var15 = class589.field8735[var12] * var15 >> 15;
        }
        class222.field3222 = arg3;
        class118.field1665 = arg6 - var14;
        class125.field1760 = arg2 - var13;
        class214.field3161 = arg4 - var15;
        class234.field3396 = 0;
        class517.field7371 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 82)
    public static void method1940(int arg0) {
        field4454 = null;
        field4445 = null;
        if (arg0 != 87101263) {
            field4445 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIIII)V", line = 93)
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4447 = arg5;
        this.field4448 = arg4;
        this.field4446 = arg0;
        this.field4455 = arg6;
        this.field4452 = arg3;
        this.field4457 = arg2;
        this.field4449 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Z", line = 110)
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            method1940(-96);
        }
        field4453++;
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 121)
    public final void method179(int arg0) {
        field4456++;
        if (arg0 != 1) {
            this.field4447 = 89;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)I")
    public abstract int method1941(boolean arg0);
}
