import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class99 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[S")
    public static short[] field1763 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lke;")
    public static class256 field1765 = null;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[S")
    public static short[] field1770 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lng;")
    public static class138 field1762;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lng;")
    public static class138 field1769;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Z")
    public static boolean field1771;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILra;)V", line = 19)
    public static final void method707(int arg0, class41 arg1) {
        field1767++;
        int var2 = arg1.method354((byte) 13);
        class182.field3220 = new class264[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class182.field3220[var3] = new class264();
            class182.field3220[var3].field4537 = arg1.method354((byte) -1);
            class182.field3220[var3].field4536 = arg1.method334(0);
        }
        class163.field2891 = arg1.method354((byte) -126);
        class14.field190 = arg1.method354((byte) -125);
        class88.field1580 = arg1.method354((byte) 21);
        if (arg0 != 16835) {
            field1765 = (class256) null;
        }
        class316.field5448 = new class182[class14.field190 + 1 - class163.field2891];
        for (int var4 = 0; var4 < class88.field1580; var4++) {
            int var5 = arg1.method354((byte) -127);
            class182 var6 = class316.field5448[var5] = new class182();
            var6.field3637 = arg1.method357(false);
            var6.field3631 = arg1.method327(4);
            var6.field3226 = class163.field2891 + var5;
            var6.field3225 = arg1.method334(arg0 - 16835);
            var6.field3223 = arg1.method334(0);
        }
        class172.field3061 = arg1.method327(4);
        class303.field5241 = true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V", line = 73)
    public static final void method708(int arg0, int arg1, int arg2, int arg3) {
        class271 var4 = class41.field790[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class39 var5 = var4.field4643;
        if (var5 != null) {
            var5.field699 = var5.field699 * arg3 / 16;
            var5.field708 = var5.field708 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 96)
    public static final void method710(byte arg0) {
        class188.field3464++;
        class308.field5322.method1599(164, (byte) -96);
        field1764++;
        class308.field5322.method308(class35.method247(0), -2);
        class308.field5322.method366(class112.field1969, -111);
        if (arg0 == -56) {
            class308.field5322.method366(class124.field2200, arg0 - 57);
            class308.field5322.method308(class115.field2023, -2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Lke;", line = 113)
    public static final class256 method711(byte arg0, int arg1) {
        field1768++;
        class256 var2 = new class256();
        var2.field4384 = 0;
        var2.field4380 = new byte[arg1];
        if (arg0 != -122) {
            field1763 = (short[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIIII)V", line = 131)
    public static final void method712(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class96[] var7 = class38.field690;
        if (arg1 != 33) {
            method713((byte) 115);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class96 var9 = var7[var8];
            if (var9 != null && var9.field1733 == 2) {
                class170.method1239(arg2 >> 1, (var9.field1730 - class10.field147 << 7) + var9.field1708, arg4, arg3, var9.field1723 * 2, arg5 >> 1, (var9.field1709 - class134.field2336 << 7) + var9.field1715, arg1 + -161);
                if (class161.field2860 > -1 && class45.field840 % 20 < 10) {
                    class39.field713[var9.field1725].method637(class161.field2860 + arg0 - 12, class203.field3677 + arg6 + -28);
                }
            }
        }
        field1772++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 164)
    public static final void method713(byte arg0) {
        if (class246.field4196 == 2) {
            if (class244.field4156 == class104.field1862 && class318.field5479 == class193.field3534) {
                class246.field4196 = 0;
                if (class302.field5230 && class140.field2468[81] && class17.field244 > 2) {
                    class260.method1824(false, class17.field244 - 2);
                } else {
                    class260.method1824(false, class17.field244 - 1);
                }
            }
        } else if (class311.field5365 == class104.field1862 && class318.field5479 == class160.field2855) {
            class246.field4196 = 0;
            if (class302.field5230 && class140.field2468[81] && class17.field244 > 2) {
                class260.method1824(false, class17.field244 - 2);
            } else {
                class260.method1824(false, class17.field244 - 1);
            }
        } else {
            class193.field3534 = class160.field2855;
            class244.field4156 = class311.field5365;
            class246.field4196 = 2;
        }
        field1766++;
        if (arg0 != -27) {
            field1771 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 226)
    public static void method714(int arg0) {
        if (arg0 != 22971) {
            return;
        }
        field1763 = null;
        field1770 = null;
        field1762 = null;
        field1765 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method709(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)I")
    public abstract int method715(int arg0, byte arg1, int arg2);
}
