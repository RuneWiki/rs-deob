import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class451 extends class42 {

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public int field6130;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "F")
    public float field6136;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    private int field6133;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    private int field6129;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Lff;")
    public static class9 field6138 = new class9(105, 28);

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method2576(int arg0, int arg1, String arg2) {
        field6135++;
        if (arg0 <= 35) {
            field6138 = null;
        }
        return class364.method2122(arg2, (byte) -105, arg1, true);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
    public final int method2577(byte arg0) {
        if (arg0 > -47) {
            this.method170(-43, 0.8381895F);
        }
        field6137++;
        return this.field6132;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
    public final int method2578(int arg0) {
        field6141++;
        if (arg0 != 22477) {
            this.method2582((byte) -43);
        }
        return this.field6129;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I")
    public final int method2579(int arg0) {
        field6140++;
        if (arg0 != 105) {
            this.method2581(42);
        }
        return this.field6133;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)F")
    public final float method2580(byte arg0) {
        field6134++;
        if (arg0 > -107) {
            this.method2579(-38);
        }
        return this.field6136;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IF)V")
    public abstract void method170(int arg0, float arg1);

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)I")
    public final int method2581(int arg0) {
        field6139++;
        if (arg0 != 28) {
            this.field6131 = 126;
        }
        return this.field6130;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)I")
    public final int method2582(byte arg0) {
        if (arg0 != 70) {
            this.method2577((byte) -103);
        }
        field6128++;
        return this.field6131;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BIII)V")
    public abstract void method169(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
    public static void method2583(int arg0) {
        if (arg0 != 28) {
            field6138 = null;
        }
        field6138 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIF)V")
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6130 = arg1;
        this.field6136 = arg5;
        this.field6133 = arg4;
        this.field6132 = arg0;
        this.field6129 = arg3;
        this.field6131 = arg2;
    }
}
