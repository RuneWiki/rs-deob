import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class113 extends class183 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[I")
    public int[] field1541 = new int[] { -1 };

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[I")
    public int[] field1546 = new int[] { 0 };

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Z")
    public static boolean field1540 = false;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[I")
    public static int[] field1542 = new int[64];

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field1549 = 1;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "[Z")
    public static boolean[] field1551 = new boolean[100];

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1553 = "Loading...";

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[[[Lpi;")
    public static class202[][][] field1545;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 8)
    public static void method829(int arg0) {
        field1553 = null;
        field1545 = (class202[][][]) null;
        field1551 = null;
        field1542 = null;
        if (arg0 <= 102) {
            method830(125, -103, 39, false, 39, -17, -48, 77, 3.5566602F);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZIIIIF)[[I", line = 22)
    public static final int[][] method830(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        field1548++;
        int[][] var9 = new int[arg5][arg7];
        class116 var10 = new class116();
        var10.field1579 = arg1;
        var10.field1570 = arg3;
        var10.field1575 = arg4;
        var10.field1584 = arg6;
        var10.field1582 = (int) (arg8 * 4096.0F);
        var10.method546(arg2 - 21522);
        class111.method810(arg7, arg5, -1);
        for (int var11 = arg2; var11 < arg5; var11++) {
            var10.method861((byte) 116, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lfa;", line = 50)
    public static final class259 method831(int arg0) {
        class208.field2994 = 0;
        field1552++;
        if (arg0 != -1) {
            field1553 = (String) null;
        }
        return class310.method2127(-82);
    }
}
