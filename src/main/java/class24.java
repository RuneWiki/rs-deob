import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field643 = -1;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lv;")
    private static class122 field647 = class55.method425(-118, "Offline");

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lv;")
    public static class122 field653 = field647;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lfc;")
    public static class34 field645 = new class34();

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lv;")
    public static class122 field659 = class55.method425(-97, "Anmelde)2Limit \u001c1berschritten)3");

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lv;")
    public static class122 field660 = class55.method425(-54, "mapscene");

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Z")
    public static boolean field664 = false;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lv;")
    private static class122 field667 = class55.method425(-56, "Off");

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Lv;")
    public static class122 field663 = field667;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lv;")
    public static class122 field661 = class55.method425(-76, "@gr3@");

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Lv;")
    private static class122 field669 = class55.method425(-74, "Unable to find ");

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Lv;")
    public static class122 field665 = field669;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "J")
    public long field644;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Lrd;")
    public static class106 field662;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lde;")
    public class24 field642;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lde;")
    public class24 field654;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lmb;")
    public static class74 field649;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "[Lvb;")
    public static class124[] field666;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 4)
    public final void method249(int arg0) {
        field639++;
        if (arg0 == 0 && this.field642 != null) {
            this.field642.field654 = this.field654;
            this.field654.field642 = this.field642;
            this.field654 = null;
            this.field642 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 25)
    public static final void method250(int arg0) {
        if (arg0 != -22998) {
            method252(0, 63L);
        }
        class64.field1634.method434((byte) -76);
        field650++;
        class93.field2380.method434((byte) -76);
        class26.field704.method434((byte) -76);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lbd;I)V", line = 44)
    public static final void method251(class11 arg0, int arg1) {
        arg0.field342 = 0;
        field648++;
        int var2 = arg0.field312 - class16.field396;
        if (arg0.field322 == 0) {
            arg0.field280 = 1024;
        }
        if (arg0.field322 == 1) {
            arg0.field280 = 1536;
        }
        if (arg0.field322 == 2) {
            arg0.field280 = 0;
        }
        if (arg0.field322 == 3) {
            arg0.field280 = 512;
        }
        int var3 = arg0.field348 * 128 + arg0.field317 * arg1;
        arg0.field343 += (var3 - arg0.field343) / var2;
        int var4 = arg0.field314 * 128 + arg0.field317 * 64;
        arg0.field349 += (var4 - arg0.field349) / var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)Lv;", line = 89)
    public static final class122 method252(int arg0, long arg1) {
        field651++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 40 / ((55 - arg0) / 57);
            int var4 = 0;
            for (long var5 = arg1; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            byte[] var7 = new byte[var4];
            while (arg1 != 0L) {
                long var9 = arg1;
                arg1 /= 37L;
                var4--;
                var7[var4] = class113.field2756[(int) (var9 - arg1 * 37L)];
            }
            class122 var8 = new class122();
            var8.field2923 = var7;
            var8.field2971 = var7.length;
            return var8;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII[BI[Lcc;IB)V", line = 134)
    public static final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class16[] arg7, int arg8, byte arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg4 + var15 > 0 && arg4 + var15 < 103) {
                    arg7[arg2].field388[arg3 + var10][arg4 + var15] = class30.method286(arg7[arg2].field388[arg3 + var10][arg4 + var15], -16777217);
                }
            }
        }
        field655++;
        class64 var11 = new class64(arg5);
        if (arg9 <= 33) {
            method254((byte) 30);
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg8 == var12 && var13 >= arg1 && var13 < arg1 + 8 && var14 >= arg0 && var14 < arg0 + 8) {
                        class64.method500(var11, arg3 + class45.method378(107, arg6, var14 & 0x7, var13 & 0x7), arg6, arg2, (byte) -120, 0, 0, class42.method363((byte) 50, arg6, var14 & 0x7, var13 & 0x7) + arg4);
                    } else {
                        class64.method500(var11, -1, 0, 0, (byte) 94, 0, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 199)
    public static final void method254(byte arg0) {
        field656++;
        if (arg0 != -44) {
            return;
        }
        for (class5 var1 = (class5) class129.field3126.method311((byte) 105); var1 != null; var1 = (class5) class129.field3126.method302((byte) -53)) {
            if (var1.field121 > 0) {
                var1.field121--;
            }
            if (var1.field121 != 0) {
                if (var1.field140 > 0) {
                    var1.field140--;
                }
                if (var1.field140 == 0 && var1.field118 >= 1 && var1.field137 >= 1 && var1.field118 <= 102 && var1.field137 <= 102 && (var1.field126 < 0 || client.method185(var1.field126, var1.field130, 4))) {
                    class92.method730(556131374, var1.field139, var1.field124, var1.field130, var1.field137, var1.field118, var1.field126, var1.field136);
                    var1.field140 = -1;
                    if (var1.field131 == var1.field126 && var1.field131 == -1) {
                        var1.method249(0);
                    } else if (var1.field131 == var1.field126 && var1.field124 == var1.field123 && var1.field130 == var1.field122) {
                        var1.method249(0);
                    }
                }
            } else if (var1.field131 < 0 || client.method185(var1.field131, var1.field122, 4)) {
                class92.method730(556131374, var1.field139, var1.field123, var1.field122, var1.field137, var1.field118, var1.field131, var1.field136);
                var1.method249(0);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z", line = 254)
    public final boolean method255(int arg0) {
        field646++;
        if (arg0 > -33) {
            method251(null, -117);
        }
        return this.field642 != null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLmb;Lmb;Lmb;)V", line = 275)
    public static final void method256(byte arg0, class74 arg1, class74 arg2, class74 arg3) {
        if (arg0 < 101) {
            return;
        }
        class75.field2016 = arg2;
        class54.field1410 = arg1;
        class70.field1833 = arg3;
        class76.field2039 = new class36[class75.field2016.method603(-1)][];
        class109.field2681 = new boolean[class75.field2016.method603(-1)];
        field652++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 295)
    public static void method257(int arg0) {
        field660 = null;
        field645 = null;
        field661 = null;
        field647 = null;
        field649 = null;
        field663 = null;
        field666 = null;
        field665 = null;
        field667 = null;
        field659 = null;
        field669 = null;
        field662 = null;
        field653 = null;
        if (arg0 != -1) {
            field669 = null;
        }
    }
}
