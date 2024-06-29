import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class71 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1097 = -1;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "[[I")
    public static int[][] field1100 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Lng;")
    public static class190 field1101 = new class190(256);

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
    public static int[] field1104 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Lbr;")
    public static class223 field1103 = new class223(32);

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[Llf;")
    public static class130[] field1099;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
    public static void method481(boolean arg0) {
        field1100 = null;
        field1104 = null;
        field1103 = null;
        if (arg0) {
            method481(false);
        }
        field1101 = null;
        field1099 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)I")
    public static final int method482(int arg0) {
        if (arg0 != 1506) {
            return -2;
        }
        field1098++;
        if ((double) class42.field629 == 3.0D) {
            return 37;
        } else if ((double) class42.field629 == 4.0D) {
            return 50;
        } else if ((double) class42.field629 == 6.0D) {
            return 75;
        } else if ((double) class42.field629 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
