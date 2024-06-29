import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class12 {

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Lt;")
    public static class31 field91 = class14.method84(121, "Furnace");

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lt;")
    public static class31 field94 = class14.method84(119, "100(U");

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Lt;")
    public static class31 field95 = class14.method84(119, "75(U");

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "Lt;")
    public static class31 field96 = class14.method84(123, "Agility Training");

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field90;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[I")
    public static int[] field92;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "[I")
    public static int[] field93;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)[B", line = 24)
    public static final synchronized byte[] method73(int arg0, int arg1) {
        if (arg1 == 100 && class25.field284 > 0) {
            byte[] var2 = class31.field338[--class25.field284];
            class31.field338[class25.field284] = null;
            return var2;
        } else if (arg1 == 5000 && class4.field23 > 0) {
            byte[] var3 = class33.field353[--class4.field23];
            class33.field353[class4.field23] = null;
            return var3;
        } else if (arg1 == 30000 && class20.field176 > 0) {
            byte[] var4 = class24.field203[--class20.field176];
            class24.field203[class20.field176] = null;
            return var4;
        } else {
            if (arg0 > -75) {
                field96 = null;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 94)
    public static void method74(int arg0) {
        field93 = null;
        int var1 = 109 / ((arg0 + 49) / 61);
        field95 = null;
        field90 = null;
        field91 = null;
        field94 = null;
        field92 = null;
        field96 = null;
    }
}
