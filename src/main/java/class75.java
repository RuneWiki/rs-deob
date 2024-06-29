import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Llc;")
    public static class69 field1679 = class69.method470((byte) -112, ":tradereq:");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Llc;")
    public static class69 field1686 = class69.method470((byte) -103, "(U2");

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    public static boolean field1685 = false;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Llc;")
    public static class69 field1680 = class69.method470((byte) -103, "Yesterday");

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lnb;")
    public static class80 field1689 = new class80();

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lje;")
    public static class59 field1692;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Loa;")
    public static class85 field1690;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method529(int arg0) {
        while (true) {
            if (class3.field22.method174(false, class103.field2224) >= 26) {
                int var1 = class3.field22.method181(14, arg0 + 8);
                if (var1 != 16383) {
                    if (class112.field2434[var1] == null) {
                        class112.field2434[var1] = new class72();
                    }
                    class72 var2 = class112.field2434[var1];
                    class70.field1569[class62.field1284++] = var1;
                    var2.field1088 = class62.field1282;
                    int var3 = class3.field22.method181(5, 8);
                    int var4 = class3.field22.method181(1, arg0 ^ 0x8);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    var2.field1616 = class93.method661(arg0 ^ 0x9, class3.field22.method181(13, 8));
                    int var5 = class3.field22.method181(5, arg0 + 8);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class3.field22.method181(1, 8);
                    if (var6 == 1) {
                        class108.field2410[class77.field1746++] = var1;
                    }
                    var2.field1053 = var2.field1616.field1455;
                    var2.field1099 = var2.field1616.field1441;
                    var2.field1079 = var2.field1616.field1442;
                    var2.field1029 = var2.field1616.field1456;
                    var2.field1087 = var2.field1616.field1477;
                    var2.field1060 = var2.field1616.field1478;
                    var2.field1042 = var2.field1616.field1471;
                    var2.method335(var4 == 1, true, class46.field974.field1097[0] + var5, class46.field974.field1041[0] + var3);
                    continue;
                }
            }
            class3.field22.method176((byte) -71);
            if (arg0 != 0) {
                return;
            }
            field1693++;
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1686 = null;
        field1679 = null;
        field1689 = null;
        field1692 = null;
        field1680 = null;
        field1690 = null;
        if (arg0 != 13682) {
            field1685 = true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
    public static final void method531(long arg0, int arg1) {
        field1682++;
        if (arg0 == 0L) {
            return;
        }
        if (class43.field852 >= 100 && class17.field339 != 1) {
            class87.method619(class6.field114, true, 0, class49.field992);
        } else if (class43.field852 >= 200) {
            class87.method619(class6.field114, true, 0, class49.field992);
        } else {
            class69 var3 = class49.method322(arg1 ^ 0x64, arg0).method460(false);
            for (int var4 = arg1; var4 < class43.field852; var4++) {
                if (class56.field1186[var4] == arg0) {
                    class87.method619(class46.method305(20025, new class69[] { var3, class35.field689 }), true, 0, class49.field992);
                    return;
                }
            }
            for (int var5 = 0; var5 < class104.field2271; var5++) {
                if (class22.field470[var5] == arg0) {
                    class87.method619(class46.method305(arg1 ^ 0x4E39, new class69[] { class66.field1385, var3, class102.field2215 }), true, 0, class49.field992);
                    return;
                }
            }
            if (!var3.method463((byte) -122, class46.field974.field1222)) {
                class62.field1274++;
                class64.field1356[class43.field852] = var3;
                class56.field1186[class43.field852] = arg0;
                class51.field1122[class43.field852] = 0;
                class110.field2418 = true;
                class43.field852++;
                class26.field557.method178(-5, 98);
                class26.field557.method664(arg0, 84);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[B[Lvb;III)V")
    public static final void method532(int arg0, int arg1, byte[] arg2, class122[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 + var13 > 0 && arg6 + var13 < 103 && arg0 + var14 > 0 && arg0 + var14 < 103) {
                        arg3[var7].field2662[arg6 + var13][arg0 + var14] = class23.method151(arg3[var7].field2662[arg6 + var13][arg0 + var14], -16777217);
                    }
                }
            }
        }
        class94 var8 = new class94(arg2);
        field1684++;
        int var9 = -33 / ((-arg1 - 12) / 62);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    class60.method361(arg5, var8, arg4, 110, arg6 + var11, 0, var10, arg0 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method533(byte arg0) {
        field1683++;
        class93.field2020.method606(-2);
        class83.field1870.method80(0, 0);
        class3.field25 = class117.method848(class3.field25);
        int var1 = 62 / ((-arg0 - 20) / 63);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)[Lda;")
    public static final class20[] method534(int arg0) {
        field1681++;
        class20[] var1 = new class20[class51.field1119];
        for (int var2 = 0; var2 < class51.field1119; var2++) {
            class20 var3 = var1[var2] = new class20();
            var3.field434 = class19.field426;
            var3.field436 = class71.field1595;
            var3.field438 = class114.field2472[var2];
            var3.field435 = class90.field1952[var2];
            var3.field437 = class63.field1336[var2];
            var3.field433 = class108.field2343[var2];
            byte[] var4 = class91.field1994[var2];
            int var5 = var3.field437 * var3.field433;
            var3.field439 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field439[var6] = class80.field1829[class23.method151(255, var4[var6])];
            }
        }
        class4.method21(-110);
        if (arg0 != 255) {
            field1692 = null;
        }
        return var1;
    }
}
