import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class31 extends class248 {

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Lij;")
    public static class50 field625 = class78.method578(122, "sch-Utteln:");

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Lij;")
    private static class50 field621 = class78.method578(125, "Type");

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lij;")
    public static class50 field626 = field621;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "J")
    public static long field633;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lij;")
    public class50 field624;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    public int[] field618;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "[I")
    public int[] field634;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[Lij;")
    public class50[] field630;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[Lkj;")
    public class56[] field622;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "[[B")
    public static byte[][] field628;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BJ)V")
    public static final void method264(byte arg0, long arg1) {
        field627++;
        if (arg1 == 0L) {
            return;
        }
        class184.field3020++;
        class190.field3141.method1598((byte) -115, 28);
        if (arg0 < -87) {
            class190.field3141.method1464(arg1, 867341416);
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static void method265(int arg0) {
        field621 = null;
        field625 = null;
        field628 = null;
        field626 = null;
        if (arg0 <= 59) {
            method264((byte) -52, -111L);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIIII)V")
    public static final void method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class65 var6 = class59.field1089[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class70 var7 = var6.field1234;
        if (var7 != null) {
            int var8 = var7.field1335;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class128 var10 = var6.field1247;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2235;
        int var12 = var10.field2247;
        int var13 = var10.field2246;
        int var14 = var10.field2244;
        int[] var15 = class62.field1152[var11];
        int[] var16 = class1.field5[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
