import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class285 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "J")
    public static long field4488;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Luf;")
    public static class176 field4487;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1918(int arg0) {
        if (arg0 < 96) {
            field4488 = -66L;
        }
        field4487 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
    public static final boolean method1919(byte arg0) {
        field4491++;
        if (arg0 < 7) {
            field4486 = 31;
        }
        if (class76.field1278) {
            try {
                if ((Boolean) class138.method959("showingVideoAd", (byte) -92, class22.field329.field934)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method1920(int arg0) {
        field4489++;
        class293.method1968(false, (byte) 97);
        class57.field889 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class259.field3987.length; var2++) {
            if (class100.field1589[var2] != -1 && class259.field3987[var2] == null) {
                class259.field3987[var2] = client.field2408.method1163(class100.field1589[var2], 0, 48);
                if (class259.field3987[var2] == null) {
                    class57.field889++;
                    var1 = false;
                }
            }
            if (class187.field2823[var2] != -1 && class86.field1417[var2] == null) {
                class86.field1417[var2] = client.field2408.method1159(0, class187.field2823[var2], class94.field1521[var2], (byte) -85);
                if (class86.field1417[var2] == null) {
                    class57.field889++;
                    var1 = false;
                }
            }
            if (class230.field3588 != null && class197.field3101[var2] == null && class230.field3588[var2] != -1) {
                class197.field3101[var2] = client.field2408.method1159(0, class230.field3588[var2], class94.field1521[var2], (byte) -120);
                if (class197.field3101[var2] == null) {
                    class57.field889++;
                    var1 = false;
                }
            }
        }
        if (class210.field3256 == null) {
            if (class223.field3495 == null || !class211.field3271.method1170(0, class223.field3495.field4689 + "_labels")) {
                class210.field3256 = new class288(0);
            } else if (class211.field3271.method1158(27772, class223.field3495.field4689 + "_labels")) {
                class210.field3256 = class25.method204(class223.field3495.field4689 + "_labels", 117, class211.field3271);
            } else {
                class57.field889++;
                var1 = false;
            }
        }
        if (!var1) {
            class261.field4048 = 1;
            return;
        }
        boolean var3 = true;
        class244.field3788 = 0;
        for (int var4 = 0; var4 < class259.field3987.length; var4++) {
            byte[] var20 = class86.field1417[var4];
            if (var20 != null) {
                int var21 = (class221.field3454[var4] >> 8) * 64 - class118.field1828;
                int var22 = (class221.field3454[var4] & 0xFF) * 64 - class129.field2008;
                if (class187.field2824) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class215.method1434(var20, (byte) -50, var21, var22);
            }
        }
        if (!var3) {
            class261.field4048 = 2;
            return;
        }
        if (class261.field4048 != 0) {
            class263.method1789((byte) 64, true, class55.field848 + "<br>(100%)");
        }
        class130.method916(-117);
        class238.method1600(64);
        if (arg0 < 119) {
            method1920(12);
        }
        boolean var5 = false;
        class74.method593(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class72.field1142[var6].method612(2359552);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class191.field3041[var7][var18][var19] = 0;
                }
            }
        }
        class202.method1357((byte) 28, false);
        class130.method916(-119);
        System.gc();
        class293.method1968(true, (byte) 97);
        class231.method1527(-75, false);
        if (!class187.field2824) {
            class140.method969(false, false);
            class293.method1968(true, (byte) 97);
            class238.method1601((byte) 63, false);
            if (class197.field3101 != null) {
                class149.method1017(2);
            }
        }
        if (class187.field2824) {
            class196.method1313((byte) 82, false);
            class293.method1968(true, (byte) 97);
            class88.method710(0, false);
        }
        class238.method1600(64);
        class293.method1968(true, (byte) 97);
        class129.method915(class187.field2824 ? class290.field4566 : null, class72.field1142, false, 127);
        class293.method1968(true, (byte) 97);
        int var8 = class273.field4308;
        if (class274.field4318 < var8) {
            var8 = class274.field4318;
        }
        if (class274.field4318 - 1 > var8) {
            int var9 = class274.field4318 - 1;
        }
        if (class223.method1487(-117)) {
            class124.method891(0);
        } else {
            class124.method891(class273.field4308);
        }
        class278.method1862(22333);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class195.method1307(-127, var17, var10);
            }
        }
        class121.method865(-118);
        class130.method916(-121);
        class66.method518(0);
        class238.method1600(64);
        if (class239.field3716 != null && class118.field1829 != null && class239.field3715 == 25) {
            class292.field4607.method1251(81, (byte) -57);
            class292.field4607.method289(1057001181, -128);
            class206.field3200++;
        }
        if (!class187.field2824) {
            int var11 = (class147.field2279 - 6) / 8;
            int var12 = (class147.field2279 + 6) / 8;
            int var13 = (class272.field4298 - 6) / 8;
            int var14 = (class272.field4298 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var16 < var13 || var16 > var14) {
                        client.field2408.method1169("m" + var15 + "_" + var16, -118);
                        client.field2408.method1169("l" + var15 + "_" + var16, -93);
                    }
                }
            }
        }
        if (class239.field3715 == 28) {
            class77.method609(10, 10);
        } else {
            class77.method609(10, 30);
            if (class118.field1829 != null) {
                class292.field4607.method1251(75, (byte) -94);
            }
        }
        class42.method361(true);
        class130.method916(-113);
        class151.method1022((byte) 94);
    }
}
