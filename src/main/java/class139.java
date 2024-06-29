import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class139 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lee;")
    public static class481[] field2328 = new class481[8];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Ls;")
    public static class186 field2327 = new class186(69, 0);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Ls;")
    public static class186 field2329 = new class186(96, -1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1043(int arg0, int arg1) {
        field2323++;
        class119.field2094 = arg0;
        class399 var2 = class522.field7581;
        synchronized (class522.field7581) {
            class522.field7581.method2475((byte) 67);
        }
        class399 var3 = class182.field2940;
        synchronized (class182.field2940) {
            class182.field2940.method2475((byte) 67);
        }
        if (arg1 <= 4) {
            method1045(97);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 25)
    public static final void method1044(byte arg0) {
        client.method1358(class262.field4006, (byte) -99, (long) class62.field1268);
        field2326++;
        if (class155.field2523 != -1) {
            class242.method1584(class155.field2523, false);
        }
        int var1 = -57 / ((arg0 + 62) / 49);
        for (int var2 = 0; var2 < class108.field1986; var2++) {
            if (class486.field7167[var2]) {
                class188.field3023[var2] = true;
            }
            class420.field6338[var2] = class486.field7167[var2];
            class486.field7167[var2] = false;
        }
        class186.field2987 = class62.field1268;
        if (class262.field4006.method421()) {
            class196.field3151 = true;
        }
        if (class155.field2523 != -1) {
            class108.field1986 = 0;
            class85.method793(true);
        }
        class262.field4006.method321();
        class223.method1485(class262.field4006, false);
        int var3 = class445.method2665(4);
        if (var3 == -1) {
            var3 = class271.field4116;
        }
        if (var3 == -1) {
            var3 = class3.field67;
        }
        class124.method989(var3, (byte) -55);
        class5.field97 = 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 76)
    public static final void method1045(int arg0) {
        for (int var1 = 0; var1 < class238.field3675; var1++) {
            int var2 = class403.field6093[var1];
            class163 var3 = ((class435) class209.field3337.method1622((long) var2, 53)).field6471;
            int var4 = class219.field3446.method1858(-3256);
            if ((var4 & 0x40) != 0) {
                var4 += class219.field3446.method1858(-3256) << 8;
            }
            if ((var4 & 0x1000) != 0) {
                int var5 = class219.field3446.method1842(72);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class219.field3446.method1827(arg0 + 126);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class219.field3446.method1839(123);
                    var8[var9] = class219.field3446.method1854(arg0 - 11427);
                }
                class316.method1997((byte) 97, var8, var6, var3, var7);
            }
            if ((var4 & 0x400) != 0) {
                int var11 = class219.field3446.method1827(123);
                int var12 = class219.field3446.method1815((byte) -53);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var13 = class219.field3446.method1859(arg0 + 256);
                var3.method3161(-32768, var11, var13, var12, true);
            }
            if ((var4 & 0x4) != 0) {
                int var14 = class219.field3446.method1876((byte) -123);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class219.field3446.method1842(-72);
                class239.method1569(var14, var3, arg0, var15);
            }
            if ((var4 & 0x1) != 0) {
                int var16 = class219.field3446.method1825((byte) -114);
                int var17 = class219.field3446.method1859(255);
                var3.method3158(false, class62.field1268, var16, var17);
                var3.field7818 = class62.field1268 + 300;
                var3.field7773 = class219.field3446.method1839(arg0 ^ 0xFFFFFF89);
            }
            if ((var4 & 0x8) != 0) {
                var3.field7804 = class219.field3446.method1876((byte) -103);
                if (var3.field7804 == 65535) {
                    var3.field7804 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field7777 = class219.field3446.method1834(-17823);
                var3.field7766 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class219.field3446.method1876((byte) -112);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class219.field3446.method1843((byte) 75);
                int var20 = class219.field3446.method1842(arg0 ^ 0x6B);
                var3.method3161(-32768, var18, var20, var19, false);
            }
            if ((var4 & 0x100) != 0) {
                int var21 = class219.field3446.method1876((byte) -99);
                var3.field7798 = class219.field3446.method1842(arg0 + 109);
                var3.field7833 = class219.field3446.method1859(255);
                var3.field7809 = (var21 & 0x8000) != 0;
                var3.field7801 = var21 & 0x7FFF;
                var3.field7817 = class62.field1268 + var3.field7801 + var3.field7798;
            }
            if ((var4 & 0x80) != 0) {
                int var22 = class219.field3446.method1825((byte) -114);
                int var23 = class219.field3446.method1839(120);
                var3.method3158(false, class62.field1268, var22, var23);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field2613.method482(74)) {
                    class432.method2593(var3, (byte) 78);
                }
                var3.method1159(arg0 + 1, class102.field1942.method847(class219.field3446.method1876((byte) -108), 0));
                var3.method3164(var3.field2613.field1050, arg0);
                var3.field7778 = var3.field2613.field1065 << 3;
                if (var3.field2613.method482(116)) {
                    class504.method3028(var3.field7870[0], (byte) 86, null, null, var3.field7866[0], 0, var3.field6084, var3);
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field7838 = class219.field3446.method1832(-29627);
                var3.field7820 = class219.field3446.method1837((byte) 102);
                var3.field7791 = class219.field3446.method1832(-29627);
                var3.field7851 = (byte) class219.field3446.method1842(-39);
                var3.field7776 = class62.field1268 + class219.field3446.method1827(125);
                var3.field7828 = class62.field1268 + class219.field3446.method1841((byte) 36);
            }
            if ((var4 & 0x200) != 0) {
                var3.field7854 = class219.field3446.method1832(-29627);
                var3.field7810 = class219.field3446.method1816(true);
                var3.field7824 = class219.field3446.method1832(-29627);
                var3.field7819 = class219.field3446.method1837((byte) 82);
                var3.field7856 = class219.field3446.method1841((byte) -117) + class62.field1268;
                var3.field7827 = class219.field3446.method1827(123) + class62.field1268;
                var3.field7821 = class219.field3446.method1859(255);
                var3.field7873 = 0;
                var3.field7824 += var3.field7866[0];
                var3.field7863 = 1;
                var3.field7810 += var3.field7870[0];
                var3.field7819 += var3.field7870[0];
                var3.field7854 += var3.field7866[0];
            }
            if ((var4 & 0x2000) != 0) {
                var3.field2604 = class219.field3446.method1827(127);
                var3.field2615 = class219.field3446.method1854(-11428);
            }
        }
        field2324++;
        if (arg0 != -1) {
            method1043(86, -23);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 277)
    public static void method1046(byte arg0) {
        field2328 = null;
        int var1 = 121 % ((16 - arg0) / 59);
        field2327 = null;
        field2329 = null;
    }
}
