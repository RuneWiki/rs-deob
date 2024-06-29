import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class274 extends class202 {

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Ltl;")
    public static class59 field4720 = class85.method639("null", 9588);

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Z")
    public static boolean field4719 = false;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "[I")
    public static int[] field4721 = new int[4096];

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[[Z")
    public static boolean[][] field4717 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Lml;")
    public static class15 field4722 = null;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Ltl;")
    public static class59 field4725 = class85.method639("Versteckt", 9588);

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Z")
    public static boolean field4723;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLme;)V", line = 11)
    public static final void method1917(byte arg0, class295 arg1) {
        class280.field4814 = arg1;
        field4724++;
        int var2 = -103 % ((33 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBIFIZIII)[[I", line = 27)
    public static final int[][] method1918(int arg0, byte arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field4718++;
        int[][] var9 = new int[arg2][arg7];
        class100 var10 = new class100();
        var10.field1604 = arg4;
        var10.field1607 = (int) (arg3 * 4096.0F);
        var10.field1601 = arg8;
        var10.field1620 = arg5;
        var10.field1628 = arg0;
        var10.method319((byte) -52);
        class133.method973(arg7, arg2, 117);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method762(var11, var9[var11], 2048);
        }
        int var12 = 108 / ((arg1 + 5) / 62);
        return var9;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 93)
    public static void method1919(int arg0) {
        field4721 = null;
        field4720 = null;
        if (arg0 != 4096) {
            field4719 = false;
        }
        field4725 = null;
        field4722 = null;
        field4717 = (boolean[][]) null;
    }
}
