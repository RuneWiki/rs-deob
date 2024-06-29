import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class238 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field3852 = -1;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field3853 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field3864 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Z")
    public boolean field3866 = false;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Z")
    public boolean field3855 = false;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    private int field3868 = 0;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field3872 = 128;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    private int field3875 = 128;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[I")
    public static int[] field3857 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "S")
    public static short field3861 = 256;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[S")
    public static short[] field3865 = new short[] { 39, 50, 58, 21, 23, 30, 34, 28 };

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[S")
    private short[] field3851;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[S")
    private short[] field3858;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[S")
    private short[] field3859;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[S")
    private short[] field3860;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V")
    public static final void method1633(byte arg0, long arg1) {
        field3876++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class166.field2604 < 100 || class83.field1398) || class166.field2604 >= 200) {
            class81.method579(-1, "", 0, class135.field2102);
            return;
        }
        String var3 = class28.method222(-256, arg1);
        for (int var4 = 0; var4 < class166.field2604; var4++) {
            if (class173.field2718[var4] == arg1) {
                class81.method579(-1, "", 0, var3 + class297.field4697);
                return;
            }
        }
        int var5 = 0;
        if (arg0 != -32) {
            return;
        }
        while (var5 < class268.field4284) {
            if (class106.field1766[var5] == arg1) {
                class81.method579(-1, "", 0, class26.field339 + var3 + class214.field3345);
                return;
            }
            var5++;
        }
        if (var3.equals(class283.field4473.field3803)) {
            class81.method579(-1, "", 0, class104.field1735);
            return;
        }
        class232.field3702++;
        class129.field2024[class166.field2604] = var3;
        class173.field2718[class166.field2604] = arg1;
        class295.field4659[class166.field2604] = 0;
        class272.field4363[class166.field2604] = "";
        class152.field2386[class166.field2604] = 0;
        class52.field786[class166.field2604] = false;
        class166.field2604++;
        class15.field235 = class275.field4392;
        client.field2435.method536((byte) -104, 100);
        client.field2435.method638(arg1, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1634(int arg0) {
        field3865 = null;
        field3857 = null;
        if (arg0 < 68) {
            field3862 = 28;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILhc;B)Lul;")
    public static final class192 method1635(int arg0, class235 arg1, byte arg2) {
        field3867++;
        if (arg2 <= 117) {
            method1634(-109);
        }
        return class277.method1867(-1, arg0, arg1) ? class256.method1739((byte) 92) : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lai;II)V")
    private final void method1636(class88 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3850 = arg0.method645(11596);
        } else if (arg2 == 2) {
            this.field3852 = arg0.method645(11596);
        } else if (arg2 == 4) {
            this.field3875 = arg0.method645(11596);
        } else if (arg2 == 5) {
            this.field3872 = arg0.method645(11596);
        } else if (arg2 == 6) {
            this.field3853 = arg0.method645(11596);
        } else if (arg2 == 7) {
            this.field3868 = arg0.method633(91);
        } else if (arg2 == 8) {
            this.field3864 = arg0.method633(77);
        } else if (arg2 == 9) {
            this.field3855 = true;
        } else if (arg2 == 10) {
            this.field3866 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method633(126);
            this.field3858 = new short[var6];
            this.field3859 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3859[var7] = (short) arg0.method645(11596);
                this.field3858[var7] = (short) arg0.method645(11596);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method633(74);
            this.field3851 = new short[var4];
            this.field3860 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3860[var5] = (short) arg0.method645(11596);
                this.field3851[var5] = (short) arg0.method645(11596);
            }
        }
        if (arg1 > -52) {
            this.method1638((byte) 79, -67, 63, -120);
        }
        field3873++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lai;B)V")
    public final void method1637(class88 arg0, byte arg1) {
        if (arg1 >= -94) {
            this.method1637((class88) null, (byte) -63);
        }
        field3877++;
        while (true) {
            int var3 = arg0.method633(78);
            if (var3 == 0) {
                return;
            }
            this.method1636(arg0, -63, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIII)Lig;")
    public final class9 method1638(byte arg0, int arg1, int arg2, int arg3) {
        field3871++;
        class9 var5 = (class9) class47.field677.method1887(0, (long) this.field3856);
        if (var5 == null) {
            class234 var6 = class234.method1575(class291.field4582, this.field3850, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3859 != null) {
                for (int var7 = 0; var7 < this.field3859.length; var7++) {
                    var6.method1565(this.field3859[var7], this.field3858[var7]);
                }
            }
            if (this.field3860 != null) {
                for (int var8 = 0; var8 < this.field3860.length; var8++) {
                    var6.method1571(this.field3860[var8], this.field3851[var8]);
                }
            }
            var5 = var6.method1560(this.field3868 + 64, this.field3864 + 850, -30, -50, -30);
            class47.field677.method1886(-85, (long) this.field3856, var5);
        }
        if (arg0 != 74) {
            this.method1638((byte) 92, -123, -87, 43);
        }
        class9 var9;
        if (this.field3852 == -1 || arg2 == -1) {
            var9 = var5.method72(true, true, true);
        } else {
            var9 = class148.method996(-91, this.field3852).method232(var5, arg3, -1, arg1, arg2);
        }
        if (this.field3875 != 128 || this.field3872 != 128) {
            var9.method98(this.field3875, this.field3872, this.field3875);
        }
        if (this.field3853 != 0) {
            if (this.field3853 == 90) {
                var9.method76();
            }
            if (this.field3853 == 180) {
                var9.method103();
            }
            if (this.field3853 == 270) {
                var9.method85();
            }
        }
        return var9;
    }
}
