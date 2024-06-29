import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class104 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lvf;")
    public static class265 field1841 = class87.method582(-46, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1846 = -1;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
    public static int[] field1845 = new int[100];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method695(int arg0) {
        field1847++;
        class219.field3945 = 0;
        int var1 = (class214.field3827.field2600 >> 7) + class64.field1248;
        int var2 = (class214.field3827.field2564 >> 7) + class231.field4073;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class219.field3945 = 1;
        }
        if (arg0 != 18058) {
            return;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class219.field3945 = 1;
        }
        if (class219.field3945 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class219.field3945 = 0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
    public static final int method696(int arg0, int arg1) {
        field1842++;
        if (arg0 != 255) {
            field1846 = 86;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method697(byte arg0) {
        int var1 = -60 % ((-arg0 - 22) / 49);
        field1845 = null;
        field1841 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Lvj;")
    public static final class88 method698(byte arg0) {
        int var1 = class6.field127[0] * class190.field3417[0];
        field1843++;
        byte[] var2 = class6.field230[0];
        class88 var5;
        if (class102.field1812[0]) {
            byte[] var6 = class54.field1116[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class144.method992(class268.field4715[class203.method1395(var2[var8], 255)], class203.method1395(-16777216, var6[var8] << 24));
            }
            var5 = new class215(class203.field3643, class14.field429, class207.field3737[0], class269.field4810[0], class190.field3417[0], class6.field127[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class268.field4715[class203.method1395(var2[var4], 255)];
            }
            var5 = new class88(class203.field3643, class14.field429, class207.field3737[0], class269.field4810[0], class190.field3417[0], class6.field127[0], var3);
        }
        if (arg0 != 42) {
            field1846 = -51;
        }
        class261.method1739(26);
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static final void method699(int arg0) {
        class205.field3694 = class12.field391;
        class257.field4389 = class239.field4183;
        class212.field3801 = class153.field2842;
        class164.field2977 = class97.field1716;
        class72.field1379 = class245.field4274;
        class55.field1126 = class143.field2654;
        class193.field3469 = class252.field4338;
        class158.field2909 = class126.field2253;
        class261.field4523 = class227.field4039;
        class45.field1013 = class72.field1381;
        class174.field3120 = class1.field19;
        class170.field3071 = class279.field4930;
        class19.field507 = class200.field3570;
        class21.field598 = class203.field3637;
        class103.field1831 = class80.field1511;
        class230.field4065 = class98.field1727;
        class97.field1712 = class26.field711;
        class14.field426 = class228.field4042;
        class195.field3499 = class36.field849;
        class81.field1530 = class59.field1198;
        class19.field517 = class253.field4350;
        class171.field3093 = class70.field1355;
        class265.field4611 = class147.field2741;
        class131.field2386 = class195.field3501;
        class55.field1130 = class143.field2654;
        class39.field893 = class133.field2406;
        class142.field2630 = class174.field3128;
        class93.field1658 = class150.field2780;
        class106.field1873 = class102.field1803;
        class1.field18 = class113.field1980;
        class211.field3789 = class9.field293;
        class19.field513 = class278.field4916;
        class43.field952 = class52.field1092;
        class123.field2220 = class61.field1212;
        class81.field1527 = class218.field3934;
        class57.field1169 = class17.field479;
        class78.field1479 = class229.field4052;
        class57.field1156 = class167.field3038;
        class5.field76 = class272.field4834;
        class236.field4116 = class59.field1190;
        class103.field1833 = class202.field3618;
        class102.field1822 = class118.field2081;
        class257.field4417 = class239.field4183;
        class21.field586 = class10.field344;
        class248.field4310 = class11.field369;
        class77.field1470 = class106.field1882;
        class176.field3145 = class269.field4811;
        class210.field3779 = class51.field1071;
        class36.field845 = class211.field3788;
        class238.field4158 = class248.field4312;
        class36.field848 = class9.field282;
        class45.field1009 = class197.field3517;
        class189.field3397 = class77.field1473;
        class237.field4144 = class216.field3896;
        class190.field3408 = class137.field2495;
        class232.field4097 = class15.field434;
        class61.field1211 = class91.field1636;
        class5.field74 = class77.field1468;
        class57.field1175 = class181.field3220;
        class134.field2412 = class101.field1790;
        field1840++;
        class254.field4370 = class116.field2047;
        class98.field1721 = class79.field1504;
        class257.field4395 = class169.field3057;
        class8.field276 = class203.field3629;
        class259.field4467 = class249.field4319;
        class263.field4587 = class210.field3783;
        class177.field3158 = class273.field4847;
        class238.field4160 = class83.field1556;
        class206.field3710 = class25.field693;
        class119.field2103 = class2.field31;
        class57.field1167 = class17.field479;
        class202.field3617 = class212.field3816;
        class198.field3539 = class218.field3928;
        class68.field1291 = class98.field1741;
        class179.field3188 = class84.field1577;
        class281.field4960 = class91.field1633;
        class111.field1934 = class105.field1852;
        class237.field4129 = class73.field1402;
        class75.field1440 = class142.field2628;
        class275.field4851 = class258.field4442;
        class53.field1109 = class242.field4228;
        class10.field348 = class190.field3412;
        class135.field2429 = class253.field4348;
        class22.field664 = class202.field3612;
        class72.field1384 = class124.field2228;
        class166.field2999 = class154.field2852;
        if (arg0 > -116) {
            field1846 = 123;
        }
        class40.field922 = class87.field1591;
        class176.field3137 = class277.field4895;
        class134.field2418 = class79.field1508;
        class130.field2290 = class78.field1488;
    }
}
