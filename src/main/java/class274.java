import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class274 {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4608 = 0;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[Luf;")
    public static class168[] field4606 = new class168[500];

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Luf;")
    public static class168 field4612 = class148.method1019(-1720, "b12_full");

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[I")
    public static int[] field4611 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lej;")
    public static class204 field4615 = new class204(30);

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
    public static int[] field4617 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field4619 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Luf;")
    public class168 field4614;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Z")
    public boolean field4616;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 11)
    public static void method1892(byte arg0) {
        int var1 = 66 % ((arg0 + 3) / 35);
        field4617 = null;
        field4606 = null;
        field4612 = null;
        field4611 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 35)
    public static final void method1893(byte arg0) {
        int var1 = class166.field2671.method728(8, 20544);
        if (var1 < class167.field2676) {
            for (int var2 = var1; var2 < class167.field2676; var2++) {
                class300.field5084[class127.field1954++] = class281.field4719[var2];
            }
        }
        field4603++;
        if (var1 > class167.field2676) {
            throw new RuntimeException("gppov1");
        }
        class167.field2676 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class281.field4719[var3];
            class54 var5 = class9.field117[var4];
            int var6 = class166.field2671.method728(1, 20544);
            if (var6 == 0) {
                class281.field4719[class167.field2676++] = var4;
                var5.field3011 = class203.field3335;
            } else {
                int var7 = class166.field2671.method728(2, 20544);
                if (var7 == 0) {
                    class281.field4719[class167.field2676++] = var4;
                    var5.field3011 = class203.field3335;
                    class12.field136[class9.field120++] = var4;
                } else if (var7 == 1) {
                    class281.field4719[class167.field2676++] = var4;
                    var5.field3011 = class203.field3335;
                    int var8 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -108, false, var8);
                    int var9 = class166.field2671.method728(1, 20544);
                    if (var9 == 1) {
                        class12.field136[class9.field120++] = var4;
                    }
                } else if (var7 == 2) {
                    class281.field4719[class167.field2676++] = var4;
                    var5.field3011 = class203.field3335;
                    int var10 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -124, true, var10);
                    int var11 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -102, true, var11);
                    int var12 = class166.field2671.method728(1, 20544);
                    if (var12 == 1) {
                        class12.field136[class9.field120++] = var4;
                    }
                } else if (var7 == 3) {
                    class300.field5084[class127.field1954++] = var4;
                }
            }
        }
        if (arg0 > -59) {
            method1894(18);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 150)
    public static final void method1894(int arg0) {
        for (int var1 = 0; var1 < class36.field414; var1++) {
            int var10002 = class242.field4067[var1]--;
            if (class242.field4067[var1] >= -10) {
                class147 var3 = class135.field2114[var1];
                if (var3 == null) {
                    var3 = class147.method1014(class198.field3272, class271.field4554[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class242.field4067[var1] += var3.method1012();
                    class135.field2114[var1] = var3;
                }
                if (class242.field4067[var1] < 0) {
                    int var10;
                    if (class221.field3588[var1] == 0) {
                        var10 = class1.field1;
                    } else {
                        int var4 = (class221.field3588[var1] & 0xFF) * 128;
                        int var5 = class221.field3588[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class266.field4489.field3027;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class221.field3588[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class266.field4489.field3021;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class242.field4067[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class72.field968 / var4;
                    }
                    if (var10 > 0) {
                        class11 var11 = var3.method1015().method38(class20.field247);
                        class260 var12 = class260.method1790(var11, 100, var10);
                        var12.method1787(class295.field4996[var1] - 1);
                        client.field4933.method1527(var12);
                    }
                    class242.field4067[var1] = -100;
                }
            } else {
                class36.field414--;
                for (int var2 = var1; var2 < class36.field414; var2++) {
                    class271.field4554[var2] = class271.field4554[var2 + 1];
                    class135.field2114[var2] = class135.field2114[var2 + 1];
                    class295.field4996[var2] = class295.field4996[var2 + 1];
                    class242.field4067[var2] = class242.field4067[var2 + 1];
                    class221.field3588[var2] = class221.field3588[var2 + 1];
                }
                var1--;
            }
        }
        field4601++;
        if (class5.field55 && !class285.method1971((byte) 81)) {
            if (class48.field593 != 0 && class122.field1895 != -1) {
                class268.method1862((byte) 126, 0, false, class278.field4658, class122.field1895, class48.field593);
            }
            class5.field55 = false;
        } else if (class48.field593 != 0 && class122.field1895 != -1 && !class285.method1971((byte) 76)) {
            class224.field3621++;
            class249.field4262.method726(158, 2138389379);
            class249.field4262.method1045(class122.field1895, (byte) 107);
            class122.field1895 = -1;
        }
        int var13 = -74 / ((-arg0 - 13) / 49);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 282)
    public static final void method1895(int arg0) {
        class118.field1843 = null;
        class168.field2749 = (byte[][][]) null;
        field4618++;
        class272.field4579 = (byte[][][]) null;
        class287.field4846 = null;
        class171.field2793 = null;
        class128.field2004 = null;
        if (arg0 != 25002) {
            method1894(-55);
        }
        class105.field1614 = (byte[][][]) null;
        class298.field5050 = null;
        class58.field767 = (int[][][]) null;
        class153.field2389 = (byte[][][]) null;
        class291.field4912 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILdk;II)[Lwa;", line = 309)
    public static final class284[] method1896(int arg0, class241 arg1, int arg2, int arg3) {
        field4613++;
        if (class28.method148(arg2, arg1, arg3, -38)) {
            if (arg0 < 57) {
                field4612 = (class168) null;
            }
            return class86.method593(false);
        } else {
            return null;
        }
    }
}
