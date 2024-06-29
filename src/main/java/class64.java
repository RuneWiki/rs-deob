import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    private int field1324 = 0;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[Lbd;")
    private class12[] field1323;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public static int[] field1313 = new int[128];

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lpe;")
    public static class109 field1309 = class141.method1120("Willkommen auf RuneScape", 0);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lpe;")
    private static class109 field1307 = class141.method1120("Please check your message)2centre for details)3", 0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public static int[] field1304 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[B")
    public static byte[] field1308 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lpe;")
    public static class109 field1322 = field1307;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[[I")
    public static int[][] field1314 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "J")
    private long field1311;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lbd;")
    private class12 field1305;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lbd;")
    private class12 field1325;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILbd;J)V")
    public final void method503(int arg0, class12 arg1, long arg2) {
        field1316++;
        if (arg1.field266 != null) {
            arg1.method101((byte) 90);
        }
        class12 var5 = this.field1323[(int) ((long) (this.field1310 + arg0) & arg2)];
        arg1.field263 = var5;
        arg1.field267 = arg2;
        arg1.field266 = var5.field266;
        arg1.field266.field263 = arg1;
        arg1.field263.field266 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Lbd;")
    public final class12 method504(byte arg0) {
        field1317++;
        if (this.field1305 == null) {
            return null;
        }
        class12 var2 = this.field1323[(int) (this.field1311 & (long) (this.field1310 - 1))];
        if (arg0 != 109) {
            this.field1305 = null;
        }
        while (this.field1305 != var2) {
            if (this.field1305.field267 == this.field1311) {
                class12 var3 = this.field1305;
                this.field1305 = this.field1305.field263;
                return var3;
            }
            this.field1305 = this.field1305.field263;
        }
        this.field1305 = null;
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)Lbd;")
    public final class12 method505(byte arg0, long arg1) {
        field1318++;
        this.field1311 = arg1;
        if (arg0 != -46) {
            return null;
        }
        class12 var4 = this.field1323[(int) ((long) (this.field1310 - 1) & arg1)];
        for (this.field1305 = var4.field263; this.field1305 != var4; this.field1305 = this.field1305.field263) {
            if (this.field1305.field267 == arg1) {
                class12 var5 = this.field1305;
                this.field1305 = this.field1305.field263;
                return var5;
            }
        }
        this.field1305 = null;
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Lbd;")
    public final class12 method506(byte arg0) {
        if (arg0 <= 126) {
            field1322 = null;
        }
        field1312++;
        if (this.field1324 > 0 && this.field1323[this.field1324 - 1] != this.field1325) {
            class12 var2 = this.field1325;
            this.field1325 = var2.field263;
            return var2;
        }
        while (this.field1324 < this.field1310) {
            class12 var3 = this.field1323[this.field1324++].field263;
            if (this.field1323[this.field1324 - 1] != var3) {
                this.field1325 = var3.field263;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    public static void method507(byte arg0) {
        field1309 = null;
        field1322 = null;
        if (arg0 <= 40) {
            field1307 = null;
        }
        field1313 = null;
        field1308 = null;
        field1307 = null;
        field1304 = null;
        field1314 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lbd;")
    public final class12 method508(int arg0) {
        int var2 = -126 / ((arg0 - 9) / 45);
        this.field1324 = 0;
        field1306++;
        return this.method506((byte) 127);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
    public class64(int arg0) {
        this.field1310 = arg0;
        this.field1323 = new class12[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class12 var3 = this.field1323[var2] = new class12();
            var3.field266 = var3;
            var3.field263 = var3;
        }
    }
}
