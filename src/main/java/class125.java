import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class125 extends class27 {

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    public static int[] field1744 = new int[2500];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/lang/String;")
    public String field1747;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 13)
    public static final void method973(int arg0) {
        field1745++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class135.field1930[var1] = true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILs;Ls;)V", line = 28)
    public static final void method974(int arg0, class381 arg1, class381 arg2) {
        if (arg1.field5348 != null) {
            arg1.method2367(5);
        }
        field1750++;
        if (arg0 <= -93) {
            arg1.field5346 = arg2;
            arg1.field5348 = arg2.field5348;
            arg1.field5348.field5346 = arg1;
            arg1.field5346.field5348 = arg1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 47)
    public static void method975(int arg0) {
        field1744 = null;
        if (arg0 != 30370) {
            field1748 = -72;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 59)
    public static final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 24610) {
            method975(-77);
        }
        class189.field2722 = arg2;
        class229.field3184 = arg0;
        class415.field5810 = arg3;
        class315.field4281 = arg5;
        class229.field3185 = arg4;
        class289.field3879 = arg1;
        field1753++;
    }
}
