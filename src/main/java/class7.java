import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class7 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Llb;")
    private class67 field170 = new class67();

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lmd;")
    private class76 field195 = new class76();

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lde;")
    private class24 field186;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lgd;")
    private static class40 field174 = class14.method90(false, "Loading friend list");

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lgd;")
    public static class40 field176 = field174;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lgd;")
    private static class40 field171 = class14.method90(false, "Please reload this page)3");

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lgd;")
    private static class40 field183 = class14.method90(false, "green:");

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lgd;")
    public static class40 field177 = class14.method90(false, "::clientdrop");

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[[I")
    public static int[][] field185 = new int[104][104];

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lgd;")
    public static class40 field188 = field183;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[Lgd;")
    public static class40[] field178 = new class40[200];

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lgd;")
    public static class40 field194 = field171;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Lgd;")
    public static class40 field196 = class14.method90(false, "@cr1@");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lgd;")
    private static class40 field193 = class14.method90(false, " from your ignore list first");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lgd;")
    public static class40 field189 = field193;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lbe;")
    public static class12 field179;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
    public static int[] field169;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIII)I", line = 3)
    public static final int method36(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = -75 % ((arg0 + 8) / 48);
        field173++;
        if ((class112.field2716[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class112.field2716[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BJ)V", line = 22)
    public final void method37(byte arg0, long arg1) {
        class67 var4 = (class67) this.field186.method142(arg1, 23056);
        if (var4 != null) {
            var4.method833(arg0 - 100);
            var4.method482(33);
            this.field190++;
        }
        field180++;
        if (arg0 != 104) {
            this.method40((byte) -103);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Llb;JZ)V", line = 43)
    public final void method38(class67 arg0, long arg1, boolean arg2) {
        field187++;
        if (this.field190 == 0) {
            class67 var5 = this.field195.method507(223);
            var5.method833(4);
            var5.method482(123);
            if (this.field170 == var5) {
                class67 var6 = this.field195.method507(223);
                var6.method833(4);
                var6.method482(27);
            }
        } else {
            this.field190--;
        }
        this.field186.method144(arg0, arg1, 17348);
        this.field195.method510(arg0, (byte) -106);
        if (!arg2) {
            field176 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Llb;", line = 85)
    public final class67 method39(int arg0, long arg1) {
        int var4 = 53 / ((-arg0 - 74) / 34);
        class67 var5 = (class67) this.field186.method142(arg1, 23056);
        if (var5 != null) {
            this.field195.method510(var5, (byte) -106);
        }
        field175++;
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 108)
    public final void method40(byte arg0) {
        field192++;
        while (true) {
            class67 var2 = this.field195.method507(223);
            if (var2 == null) {
                if (arg0 != -101) {
                    this.field186 = null;
                }
                this.field190 = this.field191;
                return;
            }
            var2.method833(arg0 + 105);
            var2.method482(-85);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 424)
    public class7(int arg0) {
        this.field191 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field190 = arg0;
        this.field186 = new class24(var2);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 178)
    public static void method41(int arg0) {
        field194 = null;
        field171 = null;
        field177 = null;
        field189 = null;
        field176 = null;
        field193 = null;
        field169 = null;
        field178 = null;
        field174 = null;
        field188 = null;
        field183 = null;
        field196 = null;
        field179 = null;
        field185 = null;
        if (arg0 != 24040) {
            method41(101);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIII)V", line = 204)
    public static final void method42(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field172++;
        if (class125.field2957 == arg5 && class135.field3275 == arg2 && (class74.field1733 == arg0 || !class8.field209)) {
            return;
        }
        class135.field3275 = arg2;
        class125.field2957 = arg5;
        class74.field1733 = arg0;
        if (!class8.field209) {
            class74.field1733 = 0;
        }
        class106.method822(true, 25);
        class100.method704(false, null, true, class69.field1668);
        int var6 = class125.field2961;
        int var7 = class128.field3022;
        if (arg1 > -49) {
            return;
        }
        class125.field2961 = (arg5 - 6) * 8;
        int var8 = class125.field2961 - var6;
        int var9 = class125.field2961;
        class128.field3022 = arg2 * 8 - 48;
        int var10 = class128.field3022 - var7;
        int var11 = class128.field3022;
        for (int var12 = 0; var12 < 32768; var12++) {
            class23 var28 = class130.field3142[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field803[var29] -= var8;
                    var28.field819[var29] -= var10;
                }
                var28.field838 -= var10 * 128;
                var28.field792 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class96 var26 = class90.field2044[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field803[var27] -= var8;
                    var26.field819[var27] -= var10;
                }
                var26.field838 -= var10 * 128;
                var26.field792 -= var8 * 128;
            }
        }
        class99.field2361 = arg0;
        class13.field332.method203(true, arg4, false, arg3);
        byte var14 = 0;
        byte var15 = 1;
        byte var16 = 104;
        if (var8 < 0) {
            var15 = -1;
            var16 = -1;
            var14 = 103;
        }
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var19 = -1;
            var17 = 103;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var20 + var8;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class59.field1494[var25][var20][var22] = class59.field1494[var25][var23][var24];
                    } else {
                        class59.field1494[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class93 var21 = (class93) class131.field3179.method593(0); var21 != null; var21 = (class93) class131.field3179.method582(false)) {
            var21.field2138 -= var10;
            var21.field2135 -= var8;
            if (var21.field2135 < 0 || var21.field2138 < 0 || var21.field2135 >= 104 || var21.field2138 >= 104) {
                var21.method833(4);
            }
        }
        class8.field198 = false;
        class129.field3090 = -1;
        class132.field3210 = 0;
        if (class48.field1221 != 0) {
            class31.field771 -= var10;
            class48.field1221 -= var8;
        }
        class88.field1991.method585((byte) 105);
        class23.field540.method585((byte) 80);
    }
}
