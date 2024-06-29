import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class158 {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "Lft;")
    public static class285 field1979 = new class285(2, 14);

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Lra;")
    public static class361 field1981 = new class361(47, -1);

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "[[I")
    public static int[][] field1982 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "J")
    public static long field1980;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V", line = 7)
    public static void method1126(byte arg0) {
        field1982 = null;
        field1979 = null;
        field1981 = null;
        if (arg0 <= 22) {
            method1127((byte) -108);
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V", line = 19)
    public static final void method1127(byte arg0) {
        if (arg0 > -54) {
            field1981 = null;
        }
        field1978++;
        int var1 = class260.field3508;
        int[] var2 = class135.field1779;
        for (int var3 = 0; var3 < var1; var3++) {
            class193 var4 = class592.field8019[var2[var3]];
            if (var4 != null) {
                class377.method2156(var4, var4.method1265(91), true);
            }
        }
    }
}
