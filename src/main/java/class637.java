import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public abstract class class637 extends class108 {

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public int field9249;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    private int field9250;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public int field9251;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    private int field9241;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public int field9253;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "F")
    public float field9252;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "[Lld;")
    public static class560[] field9240 = new class560[4];

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "Lpp;")
    public static class464 field9247 = new class464(63, -1);

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    public static int field9254 = 0;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method3676(byte arg0) {
        field9240 = null;
        if (arg0 > 94) {
            field9247 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I")
    public final int method3677(int arg0) {
        if (arg0 == -26984) {
            field9242++;
            return this.field9251;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)F")
    public final float method3678(int arg0) {
        if (arg0 != -23151) {
            this.field9249 = 19;
        }
        field9246++;
        return this.field9252;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)I")
    public final int method3679(int arg0) {
        if (arg0 != 1705) {
            this.method3679(124);
        }
        field9239++;
        return this.field9250;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BI)[B")
    public static final byte[] method3680(int arg0, byte[] arg1, int arg2) {
        field9243++;
        if (arg2 >= -101) {
            return null;
        } else {
            byte[] var3 = new byte[arg0];
            class164.method1151(arg1, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IF)V")
    public abstract void method450(int arg0, float arg1);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIB)V")
    public abstract void method448(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "(I)I")
    public final int method3681(int arg0) {
        field9248++;
        return arg0 == -27102 ? this.field9253 : 66;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIF)V")
    public class637(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9249 = arg1;
        this.field9250 = arg4;
        this.field9251 = arg2;
        this.field9241 = arg3;
        this.field9253 = arg0;
        this.field9252 = arg5;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I")
    public final int method3682(boolean arg0) {
        field9245++;
        if (arg0) {
            this.field9253 = -79;
        }
        return this.field9249;
    }

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "(I)I")
    public final int method3683(int arg0) {
        if (arg0 != 0) {
            field9247 = null;
        }
        field9244++;
        return this.field9241;
    }
}
