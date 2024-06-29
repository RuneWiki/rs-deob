import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class152 extends class383 {

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "Lkd;")
    public class186 field1914;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Ljc;")
    public class305 field1910;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "Lmq;")
    public class353 field1912;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "Lsi;")
    public class393 field1913;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BILjava/lang/String;)Z", line = 12)
    public static final boolean method994(byte arg0, int arg1, String arg2) {
        field1915++;
        if (class476.field6902 != 3) {
            class64.field834 = new class25();
            class64.field834.field355 = arg1;
            class64.field834.field363 = arg2;
            if (class324.field4107 != class218.field2784) {
                class64.field834.field362 = class64.field834.field355 + 40000;
                class64.field834.field360 = class64.field834.field355 + 50000;
            }
            return true;
        } else if (arg0 >= -73) {
            return true;
        } else {
            String var3 = "";
            if (class324.field4107 != class218.field2784) {
                var3 = ":" + (arg1 + 7000);
            }
            String var4 = "";
            if (class301.field3873 != null) {
                var4 = "/p=" + class301.field3873;
            }
            String var5 = "http://" + arg2 + var3 + "/l=" + class11.field177 + "/a=" + class18.field276 + var4 + "/j" + (class295.field3780 ? "1" : "0") + ",o" + (class57.field749 ? "1" : "0") + ",a2";
            try {
                class349.field4492.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLya;)V", line = 60)
    public static final void method995(byte arg0, class38 arg1) {
        field1922++;
        if (arg0 != 32) {
            return;
        }
        int var2 = class325.field4128;
        int var3 = class14.field229;
        int var4 = class117.field1580;
        int var5 = class337.field4242 - 3;
        byte var6 = 20;
        if (class170.field2184 == null || class251.field3212 == null) {
            if (class448.field6413.method486(false, class196.field2541) && class448.field6413.method486(false, class390.field5241)) {
                class170.field2184 = arg1.method345(class311.method1816(class448.field6413, class196.field2541, 0), true);
                class311 var7 = class311.method1816(class448.field6413, class390.field5241, 0);
                class251.field3212 = arg1.method345(var7, true);
                var7.method1827();
                class168.field2161 = arg1.method345(var7, true);
            } else {
                arg1.method308(var2, var3, var4, var6, class46.field562 | 255 - class98.field1193 << 24, 1);
            }
        }
        if (class170.field2184 != null && class251.field3212 != null) {
            int var8 = (var4 - (class251.field3212.method134() * 2)) / class170.field2184.method134();
            for (int var9 = 0; var9 < var8; var9++) {
                class170.field2184.method130(var2 - (-class251.field3212.method134() - (class170.field2184.method134() * var9)), var3);
            }
            class251.field3212.method130(var2, var3);
            class168.field2161.method130(var4 + var2 - class168.field2161.method134(), var3);
        }
        class91.field1116.method1849(var2 + 3, class293.field3746 | 0xFF000000, false, class128.field1699.method1936(-26539, class11.field177), -1, var3 + 14);
        arg1.method308(var2, var3 + var6, var4, var5 - var6, class46.field562 | -class98.field1193 + 255 << 24, 1);
        int var10 = class204.field2664.method1333(7);
        int var11 = class204.field2664.method1337(69);
        int var12 = 0;
        for (class520 var13 = (class520) class201.field2616.method153(0); var13 != null; var13 = (class520) class201.field2616.method161(arg0 - 111)) {
            int var30 = var3 + ((-var12 + class2.field24 - 1) * 16) - (-var6 - 13);
            var12++;
            if (var2 < var10 && var10 < var2 + var4 && (var30 - 13) < var11 && (var30 + 4) > var11 && var13.field7518) {
                arg1.method308(var2, var30 - 12, var4, 16, 255 - class48.field611 << 24 | class165.field2106, 1);
            }
        }
        if ((class441.field6315 == null || class483.field7061 == null || class467.field6747 == null) && class448.field6413.method486(false, class139.field1782) && class448.field6413.method486(false, class471.field6833) && class448.field6413.method486(false, class290.field3699)) {
            class311 var14 = class311.method1816(class448.field6413, class471.field6833, 0);
            class483.field7061 = arg1.method345(var14, true);
            var14.method1827();
            class3.field34 = arg1.method345(var14, true);
            class441.field6315 = arg1.method345(class311.method1816(class448.field6413, class139.field1782, 0), true);
            class311 var15 = class311.method1816(class448.field6413, class290.field3699, 0);
            class467.field6747 = arg1.method345(var15, true);
            var15.method1827();
            class46.field560 = arg1.method345(var15, true);
        }
        int var16 = 0;
        if (class441.field6315 != null && class483.field7061 != null && class467.field6747 != null) {
            int var17 = (var4 - (class467.field6747.method134() * 2)) / class441.field6315.method134();
            for (int var18 = 0; var18 < var17; var18++) {
                class441.field6315.method130(var2 - (-class467.field6747.method134() - (var18 * class441.field6315.method134())), var3 - (-var5 + class441.field6315.method137()));
            }
            int var19 = (var5 - class467.field6747.method137() - var6) / class483.field7061.method137();
            for (int var20 = 0; var20 < var19; var20++) {
                class483.field7061.method130(var2, var3 + (var6 + (class483.field7061.method137() * var20)));
                class3.field34.method130(var2 + var4 - class3.field34.method134(), class483.field7061.method137() * var20 + var6 + var3);
            }
            class467.field6747.method130(var2, var3 + var5 - class467.field6747.method137());
            class46.field560.method130(var2 + var4 - class467.field6747.method134(), -class467.field6747.method137() + var3 + var5);
        }
        for (class520 var21 = (class520) class201.field2616.method153(0); var21 != null; var21 = (class520) class201.field2616.method161(-71)) {
            int var22 = (class2.field24 - var16 - 1) * 16 + var3 + var6 + 13;
            int var23 = class293.field3746 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && (var22 - 13) < var11 && var22 + 4 > var11 && var21.field7518) {
                var23 = class473.field6848 | 0xFF000000;
            }
            int[] var24 = null;
            if (class409.method2429(-121, var21.field7508)) {
                var24 = class376.field4949.method624((byte) -118, (int) var21.field7517).field104;
            } else if (var21.field7515 != -1) {
                var24 = class376.field4949.method624((byte) -115, var21.field7515).field104;
            } else if (class189.method1181(var21.field7508, 10916)) {
                class295 var25 = class187.field2446[(int) var21.field7517];
                if (var25 != null) {
                    class477 var26 = var25.field3773;
                    if (var26.field6922 != null) {
                        var26 = var26.method2903(-1, class491.field7160);
                    }
                    if (var26 != null) {
                        var24 = var26.field6923;
                    }
                }
            } else if (class490.method2973((byte) 0, var21.field7508)) {
                Object var27 = null;
                class102 var28;
                if (var21.field7508 == 1004) {
                    var28 = class315.field4017.method1958(-10091, (int) var21.field7517);
                } else {
                    var28 = class315.field4017.method1958(-10091, (int) (var21.field7517 >>> 32 & 0x7FFFFFFFL));
                }
                if (var28.field1291 != null) {
                    var28 = var28.method761(120, class491.field7160);
                }
                if (var28 != null) {
                    var24 = var28.field1271;
                }
            }
            String var29 = class216.method1331(var21, -61);
            if (var24 != null) {
                var29 = var29 + class219.method1344((byte) 63, var24);
            }
            class91.field1116.method1856(127, class347.field4459, 0, class101.field1219, var22, var2 + 3, var29, var23);
            if (var21.field7516) {
                class264.field3333.method130(var2 - (-class274.field3437.method1757((byte) -127, var29) - 5), var22 + -12);
            }
            var16++;
        }
        class410.method2435((byte) -127, class325.field4128, class117.field1580, class337.field4242, class14.field229);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 264)
    public final void method996(int arg0) {
        if (arg0 != -11658) {
            return;
        }
        this.field1912 = null;
        this.field1910 = null;
        this.field1913 = null;
        field1920++;
        this.field1914 = null;
    }
}
