import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class371 extends class216 {

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field5139;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Lsm;")
    public static class159 field5142 = new class159(5000);

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
    public static int[] field5147 = new int[25];

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[[I")
    public static int[][] field5145 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Lhc;")
    public static class368 field5150 = new class368("purple:", "", "", "");

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 3)
    public static final void method2323(byte arg0) {
        field5136++;
        for (int var1 = 0; var1 < 5; var1++) {
            class1.field3[var1] = false;
        }
        class284.field3865 = 0;
        if (arg0 != 40) {
            method2325(-70, 2, -36);
        }
        class116.field1765 = class389.field5410;
        class147.field2139 = -1;
        class26.field337 = 5;
        class204.field2904 = class86.field1208;
        class366.field5055 = class375.field5213;
        class444.field6225 = class104.field1433;
        class305.field4154 = class63.field874;
        class397.field5501 = -1;
        class18.field240 = class246.field3467;
        class46.field590 = 0;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)Z", line = 33)
    public final boolean method697(int arg0) {
        field5149++;
        return arg0 < 115;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 44)
    public final void method702(byte arg0) {
        field5133++;
        if (arg0 == 46) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 61)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 22546) {
            field5140++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 72)
    public static void method2324(int arg0) {
        field5147 = null;
        field5145 = null;
        field5150 = null;
        if (arg0 == 0) {
            field5142 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 85)
    public static final void method2325(int arg0, int arg1, int arg2) {
        field5134++;
        if (arg0 < 121) {
            field5142 = null;
        }
        class26 var3 = class217.method1445(true, arg1, 14);
        var3.method158(28194);
        var3.field341 = arg2;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIII)V", line = 112)
    public class371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5141 = arg3;
        this.field5143 = arg5;
        this.field5139 = arg4;
        this.field5135 = arg0;
        this.field5137 = arg2;
        this.field5144 = arg1;
        this.field5138 = arg6;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
    public abstract int method807(byte arg0);
}
