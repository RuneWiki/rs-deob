import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class123 {

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public int field1722 = 0;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "[I")
    public static int[] field1724 = new int[128];

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "[[[I")
    public static int[][][] field1726;

    static {
        for (int var0 = 0; var0 < field1724.length; var0++) {
            field1724[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field1724[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field1724[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field1724[var3] = var3 + 52 - 48;
        }
        field1724[45] = field1724[47] = 63;
        field1724[42] = field1724[43] = 62;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZILgw;)V", line = 4)
    private final void method872(boolean arg0, int arg1, class148 arg2) {
        if (!arg0) {
            method873(-25);
        }
        if (arg1 == 5) {
            this.field1722 = arg2.method1045(arg0);
        }
        field1725++;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 23)
    public static void method873(int arg0) {
        if (arg0 > 85) {
            field1724 = null;
            field1726 = null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lgw;I)V", line = 35)
    public final void method874(class148 arg0, int arg1) {
        field1723++;
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                if (arg1 == 65) {
                    return;
                } else {
                    method875(-75, 101, 7, 27, false, 21, 31, -116, 104, 27);
                    return;
                }
            }
            this.method872(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZIIIII)V", line = 55)
    public static final void method875(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4) {
            return;
        }
        field1721++;
        if (!class325.method1953(arg3, (byte) 86)) {
            return;
        }
        if (class484.field6903[arg3] == null) {
            client.method1620(class302.field4135[arg3], -1, arg0, arg5, arg2, arg1, arg7, arg8, arg6, arg9);
        } else {
            client.method1620(class484.field6903[arg3], -1, arg0, arg5, arg2, arg1, arg7, arg8, arg6, arg9);
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V", line = 74)
    public static final void method876(int arg0) {
        field1720++;
        class58.field738.method489(class149.field2211, class56.field668.field6842 ? class115.field1625 + 256 << 0 : -1, arg0);
    }
}
