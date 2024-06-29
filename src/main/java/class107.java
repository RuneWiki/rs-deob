import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class107 extends class196 {

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public int field1984 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[I")
    public static int[] field1986 = new int[32];

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Lai;")
    public static class10 field1987 = class44.method278("auf einer freien Welt zu spielen)3", 118);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "Lai;")
    public static class10 field1985 = class44.method278("null", 100);

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[I")
    public static int[] field1991;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[[I")
    public static int[][] field1992;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Lc;")
    public static class21 field1989;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lai;I)Z")
    public static final boolean method689(class10 arg0, int arg1) {
        field1980++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class124.field2380; var2++) {
            if (arg0.method70((byte) 104, class131.field2480[var2])) {
                return true;
            }
        }
        if (arg0.method70((byte) 101, class145.field2767.field602)) {
            return true;
        } else {
            if (arg1 != -1) {
                field1990 = 33;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1985 = null;
        field1989 = null;
        field1986 = null;
        field1987 = null;
        if (arg0 != 32) {
            field1987 = null;
        }
        field1991 = null;
        field1992 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lme;B)V")
    public final void method691(class114 arg0, byte arg1) {
        if (arg1 <= 109) {
            return;
        }
        field1988++;
        while (true) {
            int var3 = arg0.method767(true);
            if (var3 == 0) {
                return;
            }
            this.method693(arg0, var3, -122);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lai;IIIILai;I)V")
    public static final void method692(class10 arg0, int arg1, int arg2, int arg3, int arg4, class10 arg5, int arg6) {
        if (arg6 >= -115) {
            return;
        }
        field1983++;
        if (class180.field3415 || class53.field946 >= 500) {
            return;
        }
        class116.field2235[class53.field946] = arg5;
        class148.field2845[class53.field946] = arg0;
        class75.field1308[class53.field946] = arg1;
        class130.field2472[class53.field946] = arg3;
        class36.field561[class53.field946] = arg4;
        class148.field2848[class53.field946] = arg2;
        class53.field946++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lme;II)V")
    private final void method693(class114 arg0, int arg1, int arg2) {
        if (arg2 > -115) {
            this.field1984 = 125;
        }
        if (arg1 == 2) {
            this.field1984 = arg0.method762((byte) 100);
        }
        field1982++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1986[var1] = var0 - 1;
            var0 += var0;
        }
        field1990 = -1;
        field1991 = new int[25];
        field1992 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };
    }
}
