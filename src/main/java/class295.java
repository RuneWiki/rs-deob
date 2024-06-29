import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class295 implements class221 {

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "Lub;")
    private class18 field3859 = new class18(128);

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
    public int[] field3856 = new int[class206.field2850.field944];

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "[I")
    private int[] field3851 = new int[class206.field2850.field944];

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lff;")
    public static class9 field3861 = new class9(25, 6);

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "F")
    public static float field3858;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
    public final void method1722(int arg0, int arg1, int arg2) {
        field3852++;
        this.field3856[arg2] = arg1;
        class240 var4 = (class240) this.field3859.method182((long) arg2, (byte) 81);
        if (var4 == null) {
            class240 var5 = new class240(class498.method2854(-119) + 500L);
            this.field3859.method173((long) arg2, var5, (byte) 121);
        } else {
            var4.field3204 = class498.method2854(-110) + 500L;
        }
        if (arg0 >= -67) {
            field3861 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public final void method1723(int arg0) {
        for (int var2 = 0; var2 < class206.field2850.field944; var2++) {
            class251 var3 = class206.field2850.method423(true, var2);
            if (var3 != null && var3.field3328 == 0) {
                this.field3851[var2] = 0;
                this.field3856[var2] = 0;
            }
        }
        field3854++;
        if (arg0 <= 0) {
            this.field3851 = null;
        }
        this.field3859 = new class18(128);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)V")
    public final void method1724(int arg0, byte arg1, int arg2) {
        field3853++;
        if (arg1 <= 31) {
            this.method1726((byte) 49, false);
        }
        this.field3851[arg0] = arg2;
        class240 var4 = (class240) this.field3859.method182((long) arg0, (byte) 83);
        if (var4 == null) {
            class240 var5 = new class240(4611686018427387905L);
            this.field3859.method173((long) arg0, var5, (byte) 115);
        } else if (var4.field3204 != 4611686018427387905L) {
            var4.field3204 = class498.method2854(-110) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(JI)V")
    public static final void method1725(long arg0, int arg1) {
        class193.field2708.field5173 = 0;
        field3855++;
        class193.field2708.method2200(7, class514.field7580.field1514);
        class193.field2708.method2193(arg0, -111);
        class4.field110 = 0;
        class225.field3043 = -3;
        class146.field2069 = 0;
        if (arg1 == 8425) {
            class314.field4116 = 1;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BZ)I")
    public final int method1726(byte arg0, boolean arg1) {
        field3864++;
        if (arg0 != 50) {
            return -52;
        }
        long var3 = class498.method2854(-125);
        for (class240 var5 = arg1 ? (class240) this.field3859.method181((byte) -70) : (class240) this.field3859.method179(1); var5 != null; var5 = (class240) this.field3859.method179(1)) {
            if (var3 > (var5.field3204 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field3204 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field622;
                    this.field3856[var6] = this.field3851[var6];
                    var5.method300(false);
                    return var6;
                }
                var5.method300(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLhq;)I")
    public static final int method1727(byte arg0, class108 arg1) {
        field3860++;
        if (arg0 <= 88) {
            return 79;
        }
        int var2 = arg1.method756(7, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method756(7, 5);
        } else if (var2 == 2) {
            var3 = arg1.method756(7, 8);
        } else {
            var3 = arg1.method756(7, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
    public final void method1728(int arg0, int arg1, int arg2) {
        field3850++;
        class76 var4 = class185.field2626.method2258((byte) 11, arg1);
        if (arg0 != 19511) {
            this.method1724(94, (byte) -55, -125);
        }
        int var5 = var4.field1130;
        int var6 = var4.field1128;
        int var7 = var4.field1129;
        int var8 = class153.field2224[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1724(var5, (byte) 82, ~var9 & this.field3851[var5] | arg2 << var6 & var9);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
    public final int method1394(int arg0, int arg1) {
        field3863++;
        if (arg0 < 77) {
            field3861 = null;
        }
        return this.field3856[arg1];
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(III)V")
    public final void method1729(int arg0, int arg1, int arg2) {
        if (arg2 >= -106) {
            return;
        }
        field3857++;
        class76 var4 = class185.field2626.method2258((byte) 120, arg0);
        int var5 = var4.field1130;
        int var6 = var4.field1128;
        int var7 = var4.field1129;
        int var8 = class153.field2224[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1722(-128, ~var9 & this.field3856[var5] | arg1 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)I")
    public final int method1395(int arg0, byte arg1) {
        field3862++;
        class76 var3 = class185.field2626.method2258((byte) -101, arg0);
        int var4 = var3.field1130;
        int var5 = var3.field1128;
        if (arg1 <= 51) {
            field3861 = null;
        }
        int var6 = var3.field1129;
        int var7 = class153.field2224[var6 - var5];
        return this.field3856[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static void method1730(boolean arg0) {
        field3861 = null;
        if (!arg0) {
            method1730(true);
        }
    }
}
