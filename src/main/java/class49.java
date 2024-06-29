import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lhe;")
    public static class54 field1175 = class6.method58("Hidden)2", false);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "[I")
    public static int[] field1181 = new int[1000];

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[Lia;")
    public static class57[] field1174 = new class57[16];

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lhe;")
    public static class54 field1184 = class6.method58("AUS", false);

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
    public static int[] field1192 = new int[100];

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lhe;")
    private static class54 field1190 = class6.method58("Choose Option", false);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lhe;")
    public static class54 field1182 = class6.method58("0(U", false);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lhe;")
    private static class54 field1191 = class6.method58("Drop", false);

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lhe;")
    public static class54 field1187 = field1190;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lhe;")
    public static class54 field1188 = field1191;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lhe;")
    public static class54 field1189 = class6.method58(":assistreq:", false);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lce;")
    public static class20 field1173;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Leb;")
    public static class31 field1186;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method348(boolean arg0) {
        if (!class133.field3007) {
            class67.field1618[0] = class157.field3575;
            class157.field3574[0] = 1007;
            class67.field1641 = 1;
            class34.field842[0] = class24.field671;
        }
        if (class39.field1016 != -1) {
            class22.method178(class39.field1016, -20339);
        }
        for (int var1 = 0; var1 < class16.field476; var1++) {
            if (class85.field2114[var1]) {
                class32.field832[var1] = true;
            }
            class44.field1125[var1] = class85.field2114[var1];
            class85.field2114[var1] = false;
        }
        if (arg0) {
            field1173 = null;
        }
        class40.field1040 = class4.field138;
        class86.field2139 = -1;
        class79.field1946 = null;
        field1172++;
        class77.field1871 = -1;
        if (class39.field1016 != -1) {
            class16.field476 = 0;
            class4.method31(503, 0, 765, -1, 0, 0, 0, class39.field1016, (byte) 92);
        }
        class90.method721();
        class118.method889((byte) -43);
        if (class133.field3007) {
            class28.method213(105);
        } else if (class86.field2139 != -1) {
            class26.method203(class77.field1871, -14, class86.field2139);
        }
        if (class102.field2546 == 3) {
            for (int var2 = 0; var2 < class16.field476; var2++) {
                if (class44.field1125[var2]) {
                    class90.method720(field1192[var2], class79.field1943[var2], class150.field3390[var2], class38.field972[var2], 16711935, 128);
                } else if (class32.field832[var2]) {
                    class90.method720(field1192[var2], class79.field1943[var2], class150.field3390[var2], class38.field972[var2], 16711680, 128);
                }
            }
        }
        class31.method230(class157.field3573, class52.field1247, class108.field2639.field971, class108.field2639.field974, (byte) -44);
        class52.field1247 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class59.field1489 == 1) {
            class13.field359[class18.field533 / 100].method865(class111.field2683 - 8, class2.field37 + -8);
        }
        field1176++;
        if (class59.field1489 == 2) {
            class13.field359[class18.field533 / 100 + 4].method865(class111.field2683 - 8, class2.field37 + -8);
        }
        if (arg2 != 20) {
            return;
        }
        class26.method201((byte) -126);
        if (!class75.field1863) {
            return;
        }
        int var5 = arg1 + 512 - 5;
        int var6 = arg3 + 20;
        int var7 = 16776960;
        class108.field2626.method1170(class143.method1105(new class54[] { class157.field3579, class147.method1117(arg2 ^ 0xFFFFFFC5, class146.field3302) }, -842), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class118.field2768) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class118.field2768) {
            var7 = 16711680;
        }
        class108.field2626.method1170(class143.method1105(new class54[] { class82.field2009, class147.method1117(-123, var9), class34.field852 }, -842), var5, var10, var7, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method350(byte arg0) {
        field1177++;
        if (class114.field2707[98]) {
            class95.field2399 += (12 - class95.field2399) / 2;
        } else if (class114.field2707[99]) {
            class95.field2399 += (-class95.field2399 - 12) / 2;
        } else {
            class95.field2399 /= 2;
        }
        if (class114.field2707[96]) {
            class151.field3409 += (-class151.field3409 - 24) / 2;
        } else if (class114.field2707[97]) {
            class151.field3409 += (24 - class151.field3409) / 2;
        } else {
            class151.field3409 /= 2;
        }
        int var1 = class108.field2639.field971 + class44.field1137;
        class1.field11 += class95.field2399 / 2;
        if (class1.field11 < 128) {
            class1.field11 = 128;
        }
        class91.field2220 = class91.field2220 + class151.field3409 / 2 & 0x7FF;
        if (arg0 <= 77) {
            field1187 = null;
        }
        int var2 = class108.field2639.field974 + class141.field3207;
        if (class120.field2792 - var2 < -500 || class120.field2792 - var2 > 500 || class99.field2519 - var1 < -500 || class99.field2519 - var1 > 500) {
            class120.field2792 = var2;
            class99.field2519 = var1;
        }
        if (class99.field2519 != var1) {
            class99.field2519 += (var1 - class99.field2519) / 16;
        }
        if (class120.field2792 != var2) {
            class120.field2792 += (var2 - class120.field2792) / 16;
        }
        if (class1.field11 > 383) {
            class1.field11 = 383;
        }
        int var3 = 0;
        int var4 = class99.field2519 >> 7;
        int var5 = class120.field2792 >> 7;
        int var6 = class134.method1007(class120.field2792, class99.field2519, true, class157.field3573);
        if (var5 > 3 && var4 > 3 && var5 < 100 && var4 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class157.field3573;
                    if (var9 < 3 && (class87.field2152[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class141.field3211[var9][var7][var8];
                    if (var3 < var10) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class147.field3319) {
            class147.field3319 += (var11 - class147.field3319) / 24;
        } else if (class147.field3319 > var11) {
            class147.field3319 += (var11 - class147.field3319) / 80;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILuc;II)V")
    public static final void method351(int arg0, int arg1, class142 arg2, int arg3, int arg4) {
        field1171++;
        if (class8.field227 >= 50 || class139.field3190 == 0 || (arg2.field3246 == null || arg2.field3246.length <= arg1)) {
            return;
        }
        int var5 = arg2.field3246[arg1];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class39.field999[class8.field227] = var6;
        int var7 = var5 >> 4 & 0x7;
        int var8 = var5 & 0xF;
        class19.field544[class8.field227] = var7;
        class50.field1217[class8.field227] = 0;
        class89.field2188[class8.field227] = null;
        if (arg4 != 24) {
            method355(-54, null, 78);
        }
        int var9 = (arg0 - 64) / 128;
        int var10 = (arg3 - 64) / 128;
        class1.field19[class8.field227] = (var9 << 16) + (var10 << 8) + var8;
        class8.field227++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIZ)V")
    public static final void method352(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 18834) {
            return;
        }
        field1179++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class38.field922 = arg3;
        class86.field2136 = arg2;
        class134.field3037 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public static final void method353(byte arg0) {
        class12.field336 = null;
        class131.field2967 = null;
        field1180++;
        if (arg0 == -6) {
            class85.field2118 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method354(int arg0) {
        field1175 = null;
        field1189 = null;
        field1182 = null;
        field1186 = null;
        field1191 = null;
        field1174 = null;
        if (arg0 != 8421) {
            field1191 = null;
        }
        field1187 = null;
        field1192 = null;
        field1188 = null;
        field1173 = null;
        field1181 = null;
        field1190 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILfb;I)V")
    public static final void method355(int arg0, class38 arg1, int arg2) {
        class125.method955(arg1.field974, false, arg0, arg1.field971);
        field1185++;
        if (arg2 >= -125) {
            method351(89, -73, null, -120, -58);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIII)Lqa;")
    public static final class112 method356(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 59 / ((arg0 + 24) / 51);
        field1183++;
        class112 var5 = new class112();
        var5.field2691 = arg1;
        var5.field2686 = arg2;
        class63.field1530.method241(var5, (long) arg3, false);
        class131.method988(arg1, 0);
        class124.method950(false, arg1);
        class93 var6 = class121.method938(true, arg3);
        if (var6 != null) {
            class134.method1005(var6, 0);
        }
        if (class93.field2242 != null) {
            class134.method1005(class93.field2242, 0);
            class93.field2242 = null;
        }
        class67.field1641 = 0;
        class133.field3007 = false;
        class142.method1101(class7.field212, 16052, class125.field2870, class142.field3242, class82.field2017);
        if (class39.field1016 != -1) {
            class115.method877(0, 1, class39.field1016);
        }
        return var5;
    }
}
