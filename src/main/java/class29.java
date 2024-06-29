import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class29 {

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lu;")
    public static class38 field365 = class28.method177("Gem Shop", (byte) -84);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lu;")
    public static class38 field361 = class28.method177("50(U", (byte) -84);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Lf;")
    public static class11 field364 = new class11();

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "Lu;")
    public static class38 field371 = class28.method177("Food Shop", (byte) -84);

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "[I")
    public static int[] field369 = new int[128];

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "Lu;")
    public static class38 field372 = class28.method177(" )2 ", (byte) -84);

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "Lua;")
    public static class39 field370;

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Ld;")
    public static class7 field368;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field366;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "[B")
    public static byte[] field367;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)I", line = 19)
    public static final int method179(byte arg0) {
        if (arg0 < 125) {
            field365 = null;
        }
        return class38.field493 == null ? 0 : class38.field493[class22.field213];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Lu;ILb;Lu;Lb;)Lk;", line = 47)
    public static final class21 method180(class38 arg0, int arg1, class3 arg2, class38 arg3, class3 arg4) {
        if (arg1 > -54) {
            return (class21) null;
        } else {
            int var5 = arg4.method20(arg0, (byte) 88);
            int var6 = arg4.method22(var5, -128, arg3);
            return class38.method235(arg2, var5, -49, var6, arg4);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(B)V", line = 81)
    public static void method181(byte arg0) {
        field369 = null;
        field371 = null;
        field368 = null;
        field365 = null;
        field370 = null;
        field361 = null;
        field366 = null;
        field372 = null;
        if (arg0 <= 62) {
            method180(null, 20, null, null, null);
        }
        field364 = null;
        field367 = null;
    }
}
