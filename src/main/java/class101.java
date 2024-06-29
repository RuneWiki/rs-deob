import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class101 extends class270 {

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    private int field1657 = 585;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lmh;")
    public static class62 field1656 = class201.method1405(true, ":duelstake:");

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field1659 = 128;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "Lmh;")
    private static class62 field1658 = class201.method1405(true, "Started 3d library");

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "Lmh;")
    public static class62 field1667 = class201.method1405(true, "(Y");

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "Lmh;")
    public static class62 field1665 = field1658;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "Lud;")
    public static class52 field1663 = new class52();

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "[[Lmk;")
    public static class224[][] field1662;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Z", line = 4)
    public static final boolean method800(int arg0, int arg1) {
        field1660++;
        if (arg0 > -84) {
            method805(false);
        }
        if (class221.field3803 != arg1) {
            return false;
        }
        class221.field3803++;
        class204.field3436 = true;
        if (class221.field3803 > 65535) {
            class221.field3803 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lmi;II)V", line = 30)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field1664++;
        if (arg1 == 0) {
            this.field1657 = arg0.method721(20);
        }
        int var5 = -113 / ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)Lka;", line = 59)
    public static final class274 method801(int arg0, int arg1, int arg2) {
        field1661++;
        class274 var3 = (class274) class204.field3440.method334(-18673);
        if (arg1 != -1322541556) {
            field1665 = (class62) null;
        }
        while (var3 != null) {
            if (var3.field4643 && var3.method1871((byte) 27, arg2, arg0)) {
                return var3;
            }
            var3 = (class274) class204.field3440.method335((byte) 113);
        }
        return null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 81)
    public static void method802(boolean arg0) {
        field1658 = null;
        field1656 = null;
        field1662 = (class224[][]) null;
        field1667 = null;
        field1665 = null;
        field1663 = null;
        if (!arg0) {
            field1659 = 72;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method6(int arg0, int arg1) {
        field1653++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1];
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                int var6 = class283.field4840[var5];
                if (var6 > this.field1657 && var6 < 4096 - this.field1657 && var4 > 2048 - this.field1657 && var4 < this.field1657 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1657);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field1657) < var6 && var6 < (this.field1657 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1657;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1657);
                } else if (this.field1657 > var4 || 4096 - this.field1657 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1657;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1657);
                } else if (var6 >= this.field1657 && var6 <= 4096 - this.field1657) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1657);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        if (arg0 != 18693) {
            this.method8((class92) null, 69, 91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 196)
    public static final void method803(int arg0) {
        if (arg0 != -1) {
            method802(false);
        }
        field1668++;
        for (class281 var1 = (class281) class38.field580.method334(-18673); var1 != null; var1 = (class281) class38.field580.method335((byte) 123)) {
            class125 var2 = var1.field4798;
            if (class7.field85 != var2.field2081 || class199.field3367 > var2.field2090) {
                var1.method1444((byte) 89);
            } else if (class199.field3367 >= var2.field2062) {
                if (var2.field2074 > 0) {
                    class204 var3 = class301.field5186[var2.field2074 - 1];
                    if (var3 != null && var3.field3821 >= 0 && var3.field3821 < 13312 && var3.field3814 >= 0 && var3.field3814 < 13312) {
                        var2.method949((byte) -124, var3.field3821, class165.method1186((byte) -58, var3.field3814, var3.field3821, var2.field2081) - var2.field2063, var3.field3814, class199.field3367);
                    }
                }
                if (var2.field2074 < 0) {
                    int var4 = -var2.field2074 - 1;
                    class153 var5;
                    if (class156.field2523 == var4) {
                        var5 = class268.field4551;
                    } else {
                        var5 = class5.field50[var4];
                    }
                    if (var5 != null && var5.field3821 >= 0 && var5.field3821 < 13312 && var5.field3814 >= 0 && var5.field3814 < 13312) {
                        var2.method949((byte) -126, var5.field3821, class165.method1186((byte) -58, var5.field3814, var5.field3821, var2.field2081) - var2.field2063, var5.field3814, class199.field3367);
                    }
                }
                var2.method950(arg0 + 1, class277.field4757);
                class80.method618(class7.field85, (int) var2.field2073, (int) var2.field2069, (int) var2.field2075, 60, var2, var2.field2071, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)V", line = 251)
    public static final void method804(int arg0, int arg1) {
        int var2 = 44 / ((arg0 + 79) / 44);
        field1654++;
        class151 var3 = class165.method1194((byte) 1, 4, arg1);
        var3.method1081(128);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 319)
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)Lkb;", line = 271)
    public static final class82 method805(boolean arg0) {
        field1655++;
        if (!arg0) {
            method802(true);
        }
        int var1 = class184.field2940[0] * class15.field132[0];
        byte[] var2 = class42.field645[0];
        class82 var6;
        if (class218.field3759[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class54.field802[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class270.method1854(class235.field4048[class234.method1648(255, var2[var5])], class234.method1648(-16777216, var4[var5] << 24));
            }
            var6 = new class303(class41.field626, class189.field3005, class183.field2931[0], class113.field1878[0], class15.field132[0], class184.field2940[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class235.field4048[class234.method1648(255, var2[var8])];
            }
            var6 = new class82(class41.field626, class189.field3005, class183.field2931[0], class113.field1878[0], class15.field132[0], class184.field2940[0], var7);
        }
        class135.method1020(-113);
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBIII)V", line = 335)
    public static final void method806(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1666++;
        int var6 = arg3 - arg5;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class272.method1863(arg0, arg5, arg4, 94, arg1);
            }
        } else if (var7 == 0) {
            class71.method514(arg5, (byte) 99, arg0, arg3, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class176.field2819 > arg5) {
                var11 = (class176.field2819 * var8 >> 12) + var9;
                var10 = class176.field2819;
            } else if (arg5 <= class52.field755) {
                var10 = arg5;
                var11 = arg1;
            } else {
                var11 = (class52.field755 * var8 >> 12) + var9;
                var10 = class52.field755;
            }
            int var12;
            int var13;
            if (class176.field2819 > arg3) {
                var12 = (class176.field2819 * var8 >> 12) + var9;
                var13 = class176.field2819;
            } else if (class52.field755 >= arg3) {
                var13 = arg3;
                var12 = arg4;
            } else {
                var12 = var9 + (class52.field755 * var8 >> 12);
                var13 = class52.field755;
            }
            if (arg2 >= 54) {
                if (var11 < class99.field1630) {
                    var10 = (class99.field1630 - var9 << 12) / var8;
                    var11 = class99.field1630;
                } else if (var11 > class81.field1348) {
                    var11 = class81.field1348;
                    var10 = (class81.field1348 - var9 << 12) / var8;
                }
                if (class99.field1630 > var12) {
                    var13 = (class99.field1630 - var9 << 12) / var8;
                    var12 = class99.field1630;
                } else if (var12 > class81.field1348) {
                    var12 = class81.field1348;
                    var13 = (class81.field1348 - var9 << 12) / var8;
                }
                class247.method1721((byte) 82, var10, arg0, var12, var13, var11);
            }
        }
    }
}
