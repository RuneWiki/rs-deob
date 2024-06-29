import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lv;")
    public static class146 field1152 = class159.method1226((byte) -37, "<br>(X");

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[Z")
    public static boolean[] field1150 = new boolean[112];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lv;")
    public static class146 field1154 = class159.method1226((byte) -37, "::noclip");

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static volatile int field1160 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lgf;")
    public static class48 field1159 = new class48(8);

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field1162 = -1;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lv;")
    public static class146 field1163 = class159.method1226((byte) -37, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lue;")
    public static class144 field1157;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ldd;")
    public static class26 field1153;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lue;")
    public static class144[] field1156;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method344(int arg0) {
        field1152 = null;
        field1157 = null;
        field1150 = null;
        field1163 = null;
        field1154 = null;
        field1159 = null;
        field1153 = null;
        field1156 = null;
        if (arg0 != 0) {
            field1159 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)J")
    public static final synchronized long method345(byte arg0) {
        if (arg0 != -1) {
            method344(72);
        }
        field1151++;
        long var1 = System.currentTimeMillis();
        if (class28.field589 > var1) {
            class5.field109 += class28.field589 - var1;
        }
        class28.field589 = var1;
        return class5.field109 + var1;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method346(byte arg0) {
        field1149++;
        for (int var1 = 0; var1 < class76.field1806; var1++) {
            int var10002 = class77.field1859[var1]--;
            if (class77.field1859[var1] >= -10) {
                class128 var3 = class81.field1967[var1];
                if (var3 == null) {
                    var3 = class128.method945(class15.field251, class81.field1964[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class77.field1859[var1] += var3.method948();
                    class81.field1967[var1] = var3;
                }
                if (class77.field1859[var1] < 0) {
                    int var10;
                    if (class60.field1406[var1] == 0) {
                        var10 = class54.field1255;
                    } else {
                        int var4 = (class60.field1406[var1] & 0xFF) * 128;
                        int var5 = class60.field1406[var1] >> 16 & 0xFF;
                        int var6 = class60.field1406[var1] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - class116.field2696.field790;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 * 128 + 64 - class116.field2696.field757;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var4) {
                            class77.field1859[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class44.field1001 / var4;
                    }
                    if (var10 > 0) {
                        class109 var11 = var3.method946().method866(class57.field1282);
                        class84 var12 = class84.method662(var11, 100, var10);
                        var12.method644(class98.field2381[var1] - 1);
                        class18.field286.method997(var12);
                    }
                    class77.field1859[var1] = -100;
                }
            } else {
                class76.field1806--;
                for (int var2 = var1; var2 < class76.field1806; var2++) {
                    class81.field1964[var2] = class81.field1964[var2 + 1];
                    class81.field1967[var2] = class81.field1967[var2 + 1];
                    class98.field2381[var2] = class98.field2381[var2 + 1];
                    class77.field1859[var2] = class77.field1859[var2 + 1];
                    class60.field1406[var2] = class60.field1406[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 30) {
            field1157 = null;
        }
        if (class22.field375 && !class87.method694(-117)) {
            if (class38.field852 != 0 && class141.field3222 != -1) {
                class119.method908(class141.field3222, 1, class38.field852, 0, class60.field1377, false);
            }
            class22.field375 = false;
        }
    }
}
