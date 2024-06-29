import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class227 extends class170 {

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "[I")
    public static int[] field3907 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "Lsc;")
    private static class181 field3905 = class149.method967(255, "Cancel");

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lsc;")
    public static class181 field3901 = field3905;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[I")
    public int[] field3893;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    private int[] field3895;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "[Lsc;")
    private class181[] field3899;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "[[I")
    private int[][] field3902;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILvf;)V")
    public final void method1484(int arg0, class230 arg1) {
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                field3909++;
                if (arg0 != -4) {
                    field3901 = null;
                    return;
                }
                return;
            }
            this.method1494(arg1, var3, arg0 - 108);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static void method1485(int arg0) {
        field3905 = null;
        field3907 = null;
        if (arg0 != 0) {
            field3905 = null;
        }
        field3901 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public static final void method1486(boolean arg0) {
        field3900++;
        Object var1 = class159.field2715;
        synchronized (class159.field2715) {
            if (class115.field1880 == 0) {
                class224.field3870.method918(5, 0, new class66());
            }
            if (arg0) {
                class115.field1880 = 600;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public final void method1487(int arg0) {
        if (this.field3893 != null) {
            for (int var2 = 0; var2 < this.field3893.length; var2++) {
                this.field3893[var2] = class185.method1291(this.field3893[var2], 32768);
            }
        }
        field3896++;
        if (arg0 != 0) {
            this.method1490(-60, (class230) null);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIB)I")
    public final int method1488(int arg0, int arg1, byte arg2) {
        field3904++;
        if (this.field3895 == null || arg1 < 0 || arg1 > this.field3895.length) {
            return -1;
        } else if (this.field3902[arg1] == null || arg0 < 0 || arg0 > this.field3902[arg1].length) {
            return -1;
        } else if (arg2 <= 113) {
            return -87;
        } else {
            return this.field3902[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Lsc;")
    public final class181 method1489(byte arg0) {
        field3903++;
        class181 var2 = class232.method1602(80, (byte) 61);
        if (this.field3899 == null) {
            return class253.field4419;
        }
        var2.method1239(this.field3899[0], 0);
        if (arg0 < 74) {
            field3901 = null;
        }
        for (int var3 = 1; var3 < this.field3899.length; var3++) {
            var2.method1239(class213.field3668, 0);
            var2.method1239(this.field3899[var3], 0);
        }
        return var2.method1221(1);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ILvf;)Lsc;")
    public final class181 method1490(int arg0, class230 arg1) {
        int var3 = 5 % ((-arg0 - 47) / 59);
        field3894++;
        class181 var4 = class232.method1602(80, (byte) 61);
        if (this.field3895 != null) {
            for (int var5 = 0; var5 < this.field3895.length; var5++) {
                var4.method1239(this.field3899[var5], 0);
                var4.method1239(class137.method885(this.field3895[var5], true, arg1.method1540(class219.field3775[this.field3895[var5]], (byte) -53), this.field3902[var5]), 0);
            }
        }
        var4.method1239(this.field3899[this.field3899.length - 1], 0);
        return var4.method1221(1);
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public static final void method1491(int arg0) {
        if (!class33.field534) {
            class161.field2749[0] = field3901;
            class63.field970[0] = class241.field4187;
            class131.field2177 = 1;
            class172.field2873[0] = 1003;
        }
        if (class94.field1492 != 0) {
            class58.field878 = class263.field4578;
            class26.field458 = class162.field2775;
        } else if (class146.field2406 == 0) {
            class58.field878 = class79.field1279;
            class26.field458 = class183.field3215;
        } else {
            class26.field458 = class93.field1478;
            class58.field878 = class235.field4093;
        }
        field3906++;
        if (class243.field4227 != -1) {
            class61.method441(class243.field4227, (byte) 116);
        }
        for (int var1 = 0; var1 < class207.field3551; var1++) {
            if (class61.field943[var1]) {
                class114.field1849[var1] = true;
            }
            class235.field4092[var1] = class61.field943[var1];
            class61.field943[var1] = false;
        }
        class63.field979 = -1;
        class47.field740 = -1;
        class185.field3291 = null;
        class100.field1669 = class237.field4125;
        if (class243.field4227 != -1) {
            class207.field3551 = 0;
            class240.method1638(-1, -21307, 0, 0, 0, class243.field4227, class41.field620, 0, class143.field2321);
        }
        class17.method147();
        class30.method240((byte) 123);
        if (class33.field534) {
            class110.method736(-61);
        } else if (class63.field979 != -1) {
            class250.method1704(109, class47.field740, class63.field979);
        }
        if (class239.field4161 == 3) {
            for (int var2 = 0; var2 < class207.field3551; var2++) {
                if (class235.field4092[var2]) {
                    class17.method164(class25.field434[var2], class137.field2252[var2], class62.field957[var2], class258.field4508[var2], 16711935, 128);
                } else if (class114.field1849[var2]) {
                    class17.method164(class25.field434[var2], class137.field2252[var2], class62.field957[var2], class258.field4508[var2], 16711680, 128);
                }
            }
        }
        class78.method547(class38.field581, class258.field4507.field2654, class258.field4507.field2681, 0, class258.field4504);
        if (arg0 != -20797) {
            field3907 = null;
        }
        class258.field4504 = 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lvf;[IB)V")
    public final void method1492(class230 arg0, int[] arg1, byte arg2) {
        field3908++;
        int var4 = 100 / ((24 - arg2) / 32);
        if (this.field3895 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3895.length; var5++) {
            if (arg1.length <= var5) {
                return;
            }
            int var6 = class91.field1453[this.method1493((byte) -82, var5)];
            if (var6 > 0) {
                arg0.method1542(var6, (long) arg1[var5], 4873);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
    public final int method1493(byte arg0, int arg1) {
        if (arg0 == -82) {
            field3897++;
            return this.field3895 == null || arg1 < 0 || this.field3895.length < arg1 ? -1 : this.field3895[arg1];
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lvf;II)V")
    private final void method1494(class230 arg0, int arg1, int arg2) {
        int var4 = -73 % ((-arg2 - 11) / 43);
        if (arg1 == 1) {
            this.field3899 = arg0.method1549(36).method1248(60, false);
        } else if (arg1 == 2) {
            int var9 = arg0.method1516((byte) 82);
            this.field3893 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3893[var10] = arg0.method1535(2);
            }
        } else if (arg1 == 3) {
            int var5 = arg0.method1516((byte) 82);
            this.field3895 = new int[var5];
            this.field3902 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method1535(2);
                this.field3895[var6] = var7;
                this.field3902[var6] = new int[class121.field1993[var7]];
                for (int var8 = 0; var8 < class121.field1993[var7]; var8++) {
                    this.field3902[var6][var8] = arg0.method1535(2);
                }
            }
        }
        field3898++;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
    public final int method1495(byte arg0) {
        field3892++;
        if (this.field3895 == null) {
            return 0;
        } else {
            int var2 = 90 % ((-arg0 - 90) / 36);
            return this.field3895.length;
        }
    }
}
