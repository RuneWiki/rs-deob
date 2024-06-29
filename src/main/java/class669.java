import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class669 extends class362 {

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field9119;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field9124;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private int field9125;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "F")
    public float field9121;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    private int field9116;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public int field9133;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
    public static int[] field9118 = null;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Z")
    public static boolean field9129 = false;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Lat;")
    public static class378 field9132 = null;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Lqf;")
    public static class681 field9130;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)V")
    public abstract void method1436(int arg0, float arg1);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
    public final int method3752(byte arg0) {
        if (arg0 <= 69) {
            method3754(74);
        }
        field9120++;
        return this.field9124;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method3753(int arg0) {
        if (arg0 >= -95) {
            method3754(90);
        }
        field9131++;
        if (class644.field8865 != -1) {
            class477.method2801(false, -1, -1, class644.field8865, -67);
            class644.field8865 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method3754(int arg0) {
        if (arg0 != 11339) {
            method3754(87);
        }
        field9132 = null;
        field9118 = null;
        field9130 = null;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)I")
    public final int method3755(int arg0) {
        if (arg0 != -1) {
            this.field9133 = -97;
        }
        field9123++;
        return this.field9116;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)F")
    public final float method3756(int arg0) {
        if (arg0 >= -7) {
            return 0.08188432F;
        } else {
            field9128++;
            return this.field9121;
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)I")
    public final int method3757(int arg0) {
        if (arg0 <= 119) {
            return -23;
        } else {
            field9127++;
            return this.field9119;
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)I")
    public final int method3758(int arg0) {
        if (arg0 == -1) {
            field9117++;
            return this.field9125;
        } else {
            return -46;
        }
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)I")
    public final int method3759(int arg0) {
        if (arg0 != -1) {
            this.method1432(53, (byte) -84, -7, -12);
        }
        field9134++;
        return this.field9133;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)V")
    public abstract void method1432(int arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIF)V")
    public class669(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9119 = arg1;
        this.field9124 = arg2;
        this.field9125 = arg3;
        this.field9121 = arg5;
        this.field9116 = arg4;
        this.field9133 = arg0;
    }
}
