import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class353 extends class320 {

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public int field5397 = -1;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "Z")
    public boolean field5399 = false;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Liv;")
    public static class64 field5401 = new class64(50, 8);

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "[I")
    public static int[] field5406 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field5404 = 0;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public static int[] field5403 = new int[4096];

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "[I")
    public static int[] field5408 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public int field5396;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Lbu;")
    public static class17 field5405;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2241(byte arg0) {
        field5401 = null;
        field5403 = null;
        if (arg0 == 59) {
            field5408 = null;
            field5406 = null;
            field5405 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class531 var7 = new class531();
        var7.field7814 = arg1 >> class426.field6345;
        var7.field7819 = arg2 >> class426.field6345;
        var7.field7813 = arg3 >> class426.field6345;
        var7.field7812 = arg4 >> class426.field6345;
        var7.field7817 = arg0;
        var7.field7810 = arg1;
        var7.field7822 = arg2;
        var7.field7807 = arg3;
        var7.field7818 = arg4;
        var7.field7815 = arg5;
        var7.field7820 = arg6;
        class85.field1468[class441.field6585++] = var7;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(I)V")
    public class353(int arg0) {
        this.field5397 = arg0;
    }
}
