import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class134 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lhi;")
    public static class82 field2316 = class95.method664((byte) -81, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "S")
    public static short field2319 = 1;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2321 = 127;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method915(boolean arg0) {
        if (arg0) {
            method918(35);
        }
        int var1 = class107.field1902.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class107.field1902[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class222.field3870; var4++) {
                    if (class93.field1664[var2] == class157.field2681[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class157.field2681[class222.field3870] = class93.field1664[var2];
                    var3 = class222.field3870++;
                }
                int var5 = 0;
                class153 var6 = new class153(class107.field1902[var2]);
                while (var6.field2611 < class107.field1902[var2].length && var5 < 511) {
                    int var7 = var6.method1090(false);
                    int var8 = var7 >> 7 & 0x3F;
                    int var9 = var7 & 0x3F;
                    int var10 = (class93.field1664[var2] >> 8) * 64 + var8 - class230.field3976;
                    int var11 = var7 >> 14;
                    int var12 = var5++ << 6 | var3;
                    int var13 = (class93.field1664[var2] & 0xFF) * 64 + var9 - class226.field3916;
                    class233 var14 = class222.method1574(true, var6.method1090(arg0));
                    if (class99.field1777[var12] == null && (var14.field4078 & 0x1) > 0 && class287.field4826 == var11 && var10 >= 0 && (var14.field4052 + var10) < 104 && var13 >= 0 && (var14.field4052 + var13) < 104) {
                        class99.field1777[var12] = new class275();
                        class275 var15 = class99.field1777[var12];
                        class43.field749[class25.field333++] = var12;
                        var15.field1680 = class212.field3708;
                        var15.method1918(57, var14);
                        var15.method656(-107, var15.field4628.field4052);
                        var15.field1673 = var15.field1704 = class281.field4727[var15.field4628.field4064];
                        var15.field1702 = var15.field4628.field4035;
                        var15.field1710 = var15.field4628.field4054;
                        var15.field1694 = var15.field4628.field4037;
                        if (var15.field1710 == 0) {
                            var15.field1704 = 0;
                        }
                        var15.field1675 = var15.field4628.field4067;
                        var15.field1703 = var15.field4628.field4038;
                        var15.field1717 = var15.field4628.field4072;
                        var15.field1663 = var15.field4628.field4018;
                        var15.field1654 = var15.field4628.field4059;
                        var15.method653(var15.method520(true), 7, var10, var13, true);
                    }
                }
            }
        }
        field2320++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lum;I)V", line = 110)
    public static final void method916(class222 arg0, int arg1) {
        field2325++;
        class21.field290 = arg0.method1594(class32.field476, arg1 ^ 0xFFFFFFCF);
        class87.field1556 = arg0.method1594(class236.field4104, -22);
        class21.field280 = arg0.method1594(class327.field5594, arg1 ^ 0xFFFFFFD8);
        class129.field2251 = arg0.method1594(class262.field4473, arg1 ^ 0xFFFFFF91);
        class294.field4925 = arg0.method1594(class279.field4680, -35);
        class124.field2170 = arg0.method1594(class292.field4904, -49);
        class34.field525 = arg0.method1594(class292.field4899, arg1 ^ 0xFFFFFFE4);
        class214.field3736 = arg0.method1594(class302.field5129, arg1 - 138);
        class79.field1338 = arg0.method1594(class95.field1754, -128);
        class139.field2385 = arg0.method1594(class106.field1882, -125);
        class129.field2250 = arg0.method1594(class42.field740, arg1 ^ 0xFFFFFF9E);
        class149.field2530 = arg0.method1594(class34.field528, arg1 - 187);
        class236.field4103 = arg0.method1594(class150.field2554, -91);
        class55.field879 = arg0.method1594(class273.field4601, -56);
        class9.field69 = arg0.method1594(class50.field812, -82);
        field2324 = arg0.method1594(class265.field4527, -28);
        class243.field4230 = arg0.method1594(class312.field5375, -66);
        if (arg1 == 64) {
            class83.field1489 = arg0.method1594(class56.field910, -92);
            class93.field1700 = arg0.method1594(class65.field1022, -19);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIFIIBII)[I", line = 142)
    public static final int[] method917(boolean arg0, int arg1, float arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2315++;
        int[] var8 = new int[arg3];
        class323 var9 = new class323();
        var9.field5555 = arg6;
        var9.field5559 = arg1;
        if (arg5 != 76) {
            method916((class222) null, 13);
        }
        var9.field5554 = (int) (arg2 * 4096.0F);
        var9.field5542 = arg0;
        var9.field5543 = arg4;
        var9.field5551 = arg7;
        var9.method144(93);
        class219.method1553(1, arg3, (byte) 115);
        var9.method2233(var8, true, 0);
        return var8;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 168)
    public static void method918(int arg0) {
        field2316 = null;
        if (arg0 != 236) {
            field2319 = 69;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI)V", line = 182)
    public static final void method919(int arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            field2322 = 12;
        }
        class130 var3 = class290.method2002(arg0, (byte) -79);
        int var4 = var3.field2260;
        field2317++;
        int var5 = var3.field2262;
        int var6 = var3.field2269;
        int var7 = class98.field1772[var5 - var6];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class327.method2241(var4, ~var8 & class312.field5398[var4] | arg2 << var6 & var8, arg1 + 94);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lhi;II)V", line = 209)
    public static final void method920(class82 arg0, int arg1, int arg2) {
        field2318++;
        int var3 = -91 % ((46 - arg1) / 58);
        class82 var4 = arg0.method557(118).method553((byte) -60);
        boolean var5 = false;
        for (int var6 = 0; var6 < class297.field5054; var6++) {
            class81 var7 = class29.field405[class310.field5292[var6]];
            if (var7 != null && var7.field1409 != null && var7.field1409.method543(var4, (byte) -89)) {
                var5 = true;
                class55.method384(0, 2, 0, false, 1, var7.field1720[0], (byte) -109, 0, var7.field1723[0], class168.field2932.field1723[0], class168.field2932.field1720[0], 1);
                if (arg2 == 1) {
                    class83.field1480++;
                    class61.field957.method1504(157, -1);
                    class61.field957.method1069(class310.field5292[var6], 877369544);
                } else if (arg2 == 4) {
                    class90.field1628++;
                    class61.field957.method1504(114, -1);
                    class61.field957.method1070(class310.field5292[var6], (byte) 38);
                } else if (arg2 == 5) {
                    class273.field4592++;
                    class61.field957.method1504(236, -1);
                    class61.field957.method1102((byte) -73, class310.field5292[var6]);
                } else if (arg2 == 6) {
                    class199.field3410++;
                    class61.field957.method1504(190, -1);
                    class61.field957.method1070(class310.field5292[var6], (byte) -83);
                } else if (arg2 == 7) {
                    class61.field957.method1504(56, -1);
                    class61.field957.method1102((byte) -16, class310.field5292[var6]);
                    class233.field4050++;
                }
                break;
            }
        }
        if (!var5) {
            class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { class119.field2102, var4 }), 4);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BIIIII)V", line = 295)
    public static final void method921(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -76) {
            method916((class222) null, 16);
        }
        field2326++;
        int var6 = class163.method1179(arg3, class29.field399, class60.field931, (byte) -114);
        int var7 = class163.method1179(arg1, class29.field399, class60.field931, (byte) -76);
        int var8 = class163.method1179(arg4, class207.field3623, class200.field3443, (byte) -83);
        int var9 = class163.method1179(arg5, class207.field3623, class200.field3443, (byte) -78);
        for (int var10 = var6; var10 <= var7; var10++) {
            class114.method780(88, var8, var9, arg2, class73.field1117[var10]);
        }
    }
}
