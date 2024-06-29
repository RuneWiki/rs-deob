import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class278 {

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "Lae;")
    public static class235 field3532 = new class235(0, 0);

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field3538 = 0;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field3536 = 0;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 9)
    public static void method1676(int arg0) {
        if (arg0 >= -22) {
            method1677(95, -125, 68, -101, -29, 32, -22);
        }
        field3532 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIII)I", line = 23)
    public static final int method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        field3533++;
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else {
            int var9 = 55 % ((83 - arg4) / 37);
            return var8 == 2 ? 7 - arg3 - (arg2 + -1) : 7 - arg6 + 1 + -arg1;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lwv;B)V", line = 64)
    public static final void method1678(class32 arg0, byte arg1) {
        if (arg0 instanceof class506) {
            class506 var2 = (class506) arg0;
            if (var2.field6326 != null) {
                class612.method3428(var2, 25555, class67.field815.field8010 != var2.field8010);
            }
        } else if (arg0 instanceof class365) {
            class365 var3 = (class365) arg0;
            class189.method1123(-126, var3, class67.field815.field8010 != var3.field8010);
        }
        field3534++;
        int var4 = -27 / ((-arg1 - 39) / 54);
    }

    @OriginalMember(owner = "client!nba", name = "toString", descriptor = "()Ljava/lang/String;", line = 91)
    public final String toString() {
        field3537++;
        throw new IllegalStateException();
    }
}
