import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class237 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Llk;")
    public static class189 field3805 = class69.method480((byte) -5);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3806 = "Select";

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3807 = "flash3:";

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Loj;")
    public static class246 field3809 = new class246();

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field3805 = null;
        if (arg0 <= -93) {
            field3806 = null;
            field3807 = null;
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method1606(int arg0) {
        field3803++;
        class32.method204(-31, false);
        boolean var1 = true;
        class214.field3535 = 0;
        for (int var2 = 0; var2 < class57.field956.length; var2++) {
            if (class65.field1080[var2] != -1 && class57.field956[var2] == null) {
                class57.field956[var2] = class84.field1393.method1680(0, class65.field1080[var2], -64);
                if (class57.field956[var2] == null) {
                    class214.field3535++;
                    var1 = false;
                }
            }
            if (class249.field3946[var2] != -1 && class117.field1893[var2] == null) {
                class117.field1893[var2] = class84.field1393.method1692(0, -105, class249.field3946[var2], class153.field2382[var2]);
                if (class117.field1893[var2] == null) {
                    class214.field3535++;
                    var1 = false;
                }
            }
            if (class115.field1856 != null && class180.field2944[var2] == null && class115.field1856[var2] != -1) {
                class180.field2944[var2] = class84.field1393.method1692(0, -108, class115.field1856[var2], class153.field2382[var2]);
                if (class180.field2944[var2] == null) {
                    var1 = false;
                    class214.field3535++;
                }
            }
        }
        if (class287.field4602 == null) {
            if (class205.field3266 == null || !class32.field496.method1687(class205.field3266.field1276 + "_labels", (byte) -45)) {
                class287.field4602 = new class292(0);
            } else if (class32.field496.method1695(class205.field3266.field1276 + "_labels", -31451)) {
                class287.field4602 = class239.method1612(class249.field3950, 71, class32.field496, class205.field3266.field1276 + "_labels");
            } else {
                class214.field3535++;
                var1 = false;
            }
        }
        if (!var1) {
            class165.field2667 = 1;
            return;
        }
        class150.field2337 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class57.field956.length; var4++) {
            byte[] var20 = class117.field1893[var4];
            if (var20 != null) {
                int var21 = (class120.field1914[var4] >> 8) * 64 - class276.field4438;
                int var22 = (class120.field1914[var4] & 0xFF) * 64 - class108.field1732;
                if (class292.field4683) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class40.method260(var22, var21, var20, arg0 ^ 0x58);
            }
        }
        if (!var3) {
            class165.field2667 = 2;
            return;
        }
        if (class165.field2667 != 0) {
            class249.method1660(class47.field797 + "<br>(100%)", false, true);
        }
        class276.method1859((byte) 116);
        class201.method1407(7311);
        boolean var5 = false;
        class220.method1516(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class131.field2065[var6].method305(true);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class301.field4818[var7][var18][var19] = 0;
                }
            }
        }
        class119.method845(false, -116);
        class276.method1859((byte) 102);
        System.gc();
        class32.method204(-31, true);
        class220.method1513(false, true);
        if (!class292.field4683) {
            class63.method432(false, (byte) 56);
            class32.method204(-31, true);
            class20.method108((byte) 16, false);
            if (class180.field2944 != null) {
                class77.method521(arg0 - 813656689);
            }
        }
        if (class292.field4683) {
            class277.method1867(false, -11375);
            class32.method204(arg0 - 30, true);
            class125.method873(0, false);
        }
        class201.method1407(7311);
        class32.method204(-31, true);
        class49.method348(class131.field2065, (byte) 88, false, class292.field4683 ? class83.field1379 : null);
        class32.method204(-31, true);
        int var8 = class55.field905;
        if (class56.field941 < var8) {
            var8 = class56.field941;
        }
        if (class56.field941 + arg0 > var8) {
            int var9 = class56.field941 - 1;
        }
        if (class129.method918(false)) {
            class78.method537(0);
        } else {
            class78.method537(class55.field905);
        }
        class52.method361(92);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class247.method1652(var10, 64, var17);
            }
        }
        class287.method1914(true);
        class276.method1859((byte) 102);
        class107.method763(arg0 ^ 0xFFFFFFA9);
        class201.method1407(7311);
        if (class92.field1494 != null && class208.field3298 != null && class153.field2385 == 25) {
            class161.field2555++;
            class314.field5061.method828(107, 104);
            class314.field5061.method1125(1057001181, 255);
        }
        if (!class292.field4683) {
            int var11 = (class19.field226 - 6) / 8;
            int var12 = (class19.field226 + 6) / 8;
            int var13 = (class48.field801 + 6) / 8;
            int var14 = (class48.field801 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var14 - 1; var16 <= (var13 + 1); var16++) {
                    if (var11 > var15 || var12 < var15 || var14 > var16 || var16 > var13) {
                        class84.field1393.method1675("m" + var15 + "_" + var16, (byte) -117);
                        class84.field1393.method1675("l" + var15 + "_" + var16, (byte) -104);
                    }
                }
            }
        }
        if (class153.field2385 == 28) {
            class262.method1760(10, -57);
        } else {
            class262.method1760(30, -42);
            if (class208.field3298 != null) {
                class314.field5061.method828(101, 48);
            }
        }
        class250.method1665((byte) 81);
        class276.method1859((byte) 124);
        class293.method1953(-108);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Ldd;")
    public static final class77 method1607(int arg0) {
        if (arg0 != 0) {
            method1605(78);
        }
        field3802++;
        return class275.field4417;
    }
}
