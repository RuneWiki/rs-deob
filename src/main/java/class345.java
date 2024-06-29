import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class345 {

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5532 = null;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[[I")
    public static int[][] field5534 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field5538 = -1;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "F")
    public static float field5529;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lnm;")
    public static class221 field5528;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5535;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBII)I", line = 20)
    public static final int method2430(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -122) {
            return -8;
        }
        field5536++;
        if (arg0 == arg3) {
            return arg0;
        } else {
            int var4 = 128 - arg2;
            int var5 = ((arg0 & 0xFF00FF00) >>> 7) * var4 + (((arg3 & 0xFF00FF00) >>> 7) * arg2) & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg2) & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLnm;)V", line = 41)
    public static final void method2431(boolean arg0, class221 arg1) {
        field5537++;
        class276.field4548 = arg1;
        if (!arg0) {
            field5529 = 0.8627315F;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 53)
    public static void method2432(int arg0) {
        int var1 = -38 / ((-arg0 - 26) / 58);
        field5528 = null;
        field5535 = null;
        field5532 = null;
        field5534 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLsi;)Ljava/lang/String;", line = 65)
    public static final String method2433(byte arg0, class264 arg1) {
        if (arg0 > -108) {
            method2430(-5, (byte) 12, -14, 46);
        }
        field5531++;
        if (client.method898(arg1).method525(-21845) == 0) {
            return null;
        } else if (arg1.field4184 == null || arg1.field4184.trim().length() == 0) {
            return class172.field2693 ? "Hidden-use" : null;
        } else {
            return arg1.field4184;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 91)
    public static final void method2434(byte arg0) {
        class195.field2992.method250(21066, 134);
        class195.field2992.method2228(0L, true);
        class276.field4553++;
        if (arg0 > -71) {
            method2431(false, (class221) null);
        }
        field5533++;
    }
}
