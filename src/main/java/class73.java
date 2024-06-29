import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class73 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lvl;")
    public static class73 field1223 = class296.method2055(12);

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1226 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lvd;")
    public static class126 field1224 = new class126(8);

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[[Z")
    public static boolean[][] field1230 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "[S")
    public static short[] field1229 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Z")
    public static boolean field1228 = false;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
    public static int[] field1232 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)I", line = 31)
    public static final int method603(int arg0, int arg1, int arg2) {
        int var3 = arg1 - 1 & arg2 >> 31;
        field1225++;
        int var4 = -38 % ((-arg0 - 28) / 44);
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 51)
    public static void method604(int arg0) {
        field1223 = null;
        field1229 = null;
        field1232 = null;
        field1230 = (boolean[][]) null;
        if (arg0 != 38) {
            method603(29, -124, 89);
        }
        field1224 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILac;)Lac;")
    public abstract class152 method21(int arg0, class152 arg1);
}
