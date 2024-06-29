import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class280 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ltb;")
    public class280 field4177;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Ln;")
    public class15 field4171;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
    public static int[] field4170 = new int[32];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lqv;")
    public static class316 field4167 = new class316(78, 7);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[Z")
    public static boolean[] field4179 = new boolean[8];

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lqt;")
    public static class459 field4180 = new class459(15, 7);

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[[I")
    public static int[][] field4181 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lul;")
    public static class411 field4173;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Llr;", line = 9)
    public final class539 method1801(byte arg0) {
        if (arg0 < 59) {
            method1803(27);
        }
        field4176++;
        return class28.method167((byte) -127, this.field4169);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Ltb;", line = 23)
    public final class280 method1802(byte arg0, int arg1) {
        field4168++;
        if (arg0 != -49) {
            field4173 = null;
        }
        return new class280(this.field4169, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 35)
    public static void method1803(int arg0) {
        field4179 = null;
        field4180 = null;
        field4170 = null;
        field4181 = null;
        if (arg0 != 7) {
            field4179 = null;
        }
        field4167 = null;
        field4173 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V", line = 57)
    public class280(int arg0, int arg1) {
        this.field4169 = arg0;
        this.field4175 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ltb;I)V", line = 65)
    public class280(class280 arg0, int arg1) {
        this.field4177 = arg0;
        this.field4175 = this.field4177.field4175 + arg1;
        this.field4169 = this.field4177.field4169;
        this.field4171 = this.field4177.field4171;
    }
}
