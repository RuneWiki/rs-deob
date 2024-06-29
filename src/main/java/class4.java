import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lic;")
    private static class59 field78 = class59.method433(0, "Invalid username or password)3");

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field85 = 50;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
    public static int[] field91 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
    public static int[] field86 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    public static int[] field88 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lic;")
    public static class59[] field77 = new class59[field85];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lic;")
    public static class59 field83 = field78;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    public static int[] field92 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lic;")
    public static class59 field90 = class59.method433(0, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[Lod;")
    public static class101[] field81 = new class101[50];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public static int[] field80 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field79 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
    public static int[] field82 = new int[field85];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lic;")
    public static class59 field84 = class59.method433(0, ":assist:");

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lic;")
    public static class59 field95 = class59.method433(0, "<col=ffff00>");

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field98 = 1;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Ldd;")
    public static class26 field93;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method19(byte arg0) {
        field92 = null;
        field80 = null;
        field82 = null;
        field84 = null;
        field78 = null;
        field81 = null;
        field77 = null;
        field88 = null;
        field86 = null;
        field93 = null;
        field91 = null;
        field90 = null;
        field79 = null;
        field83 = null;
        int var1 = 50 / ((-arg0 - 72) / 54);
        field95 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static final void method20(boolean arg0) {
        if (!arg0) {
            method23((byte) 77, 79, 25);
        }
        field76++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class107.field2557 - 1; var2++) {
                if (class53.field1324[var2] < 1000 && class53.field1324[var2 + 1] > 1000) {
                    var1 = false;
                    class59 var3 = class6.field120[var2];
                    class6.field120[var2] = class6.field120[var2 + 1];
                    class6.field120[var2 + 1] = var3;
                    class59 var4 = class64.field1632[var2];
                    class64.field1632[var2] = class64.field1632[var2 + 1];
                    class64.field1632[var2 + 1] = var4;
                    int var5 = class53.field1324[var2];
                    class53.field1324[var2] = class53.field1324[var2 + 1];
                    class53.field1324[var2 + 1] = var5;
                    int var6 = class120.field2772[var2];
                    class120.field2772[var2] = class120.field2772[var2 + 1];
                    class120.field2772[var2 + 1] = var6;
                    int var7 = class23.field546[var2];
                    class23.field546[var2] = class23.field546[var2 + 1];
                    class23.field546[var2 + 1] = var7;
                    int var8 = class138.field3084[var2];
                    class138.field3084[var2] = class138.field3084[var2 + 1];
                    class138.field3084[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static final void method21(byte arg0) {
        class68.field1699 = new class7(32);
        field96++;
        if (arg0 < 105) {
            method20(false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)Lic;")
    public static final class59 method22(int arg0, boolean arg1) {
        field89++;
        if (arg1) {
            method22(127, true);
        }
        return class6.field120[arg0].method437((byte) 52) > 0 ? class46.method358(new class59[] { class64.field1632[arg0], class3.field55, class6.field120[arg0] }, (byte) -75) : class64.field1632[arg0];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public static final void method23(byte arg0, int arg1, int arg2) {
        field87++;
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg2;
        var3[0] = arg1;
        if (arg0 < 11) {
            field78 = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class75.field1857[var6] != arg2) {
                var5[var4] = class75.field1857[var6];
                var3[var4] = class115.field2714[var6];
                var4++;
            }
        }
        class115.field2714 = var3;
        class75.field1857 = var5;
        class136.method1041((byte) 86, 0, class99.field2463, class99.field2463.length - 1, class115.field2714, class75.field1857);
    }
}
