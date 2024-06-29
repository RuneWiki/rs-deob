import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class9 extends class425 {

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "F")
    public float field549;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
    public static int[] field543 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field546 = 0;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lqfa;")
    public static class85 field544 = new class85(62, -1);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(FB)V")
    public abstract void method268(float arg0, byte arg1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
    public final int method269(boolean arg0) {
        field540++;
        if (!arg0) {
            this.method270(34);
        }
        return this.field539;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
    public final int method270(int arg0) {
        int var2 = -2 % ((2 - arg0) / 50);
        field534++;
        return this.field547;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Canvas;Lfa;B)Lr;")
    public static final class167 method271(Canvas arg0, class214 arg1, byte arg2) {
        field550++;
        if (arg2 != 104) {
            method275(-123);
        }
        return new class18(arg0, arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V")
    public abstract void method272(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I")
    public final int method273(boolean arg0) {
        if (arg0) {
            method271(null, null, (byte) -127);
        }
        field535++;
        return this.field541;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
    public final int method274(byte arg0) {
        field545++;
        if (arg0 != 34) {
            this.method270(127);
        }
        return this.field537;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public static void method275(int arg0) {
        if (arg0 != -1) {
            method271(null, null, (byte) -67);
        }
        field544 = null;
        field543 = null;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I")
    public final int method276(int arg0) {
        field536++;
        return arg0 == -1 ? this.field542 : -81;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIF)V")
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field541 = arg1;
        this.field549 = arg5;
        this.field542 = arg0;
        this.field537 = arg3;
        this.field547 = arg2;
        this.field539 = arg4;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)F")
    public final float method277(int arg0) {
        field548++;
        return arg0 == -1 ? this.field549 : -0.08803166F;
    }
}
