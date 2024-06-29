import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class117 extends class291 {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Z")
    public boolean field1745 = false;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Z")
    public boolean field1751 = false;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "[Lrs;")
    public static class461[] field1744 = new class461[30];

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1747 = 1401;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "F")
    public static float field1755;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Ldq;")
    public static class490 field1753;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[I")
    public static int[] field1750;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)V", line = 7)
    public static void method829(int arg0) {
        field1750 = null;
        field1753 = null;
        if (arg0 > 92) {
            field1744 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIZZ)V", line = 42)
    public class117(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1748 = arg1;
        this.field1752 = arg2;
        this.field1745 = arg3;
        this.field1751 = arg4;
        this.field1749 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 54)
    public static final void method830() {
        if (class485.field7086 != null) {
            for (int var0 = 0; var0 < class485.field7086.length; var0++) {
                for (int var1 = 0; var1 < class206.field2881; var1++) {
                    for (int var2 = 0; var2 < class371.field5427; var2++) {
                        if (class485.field7086[var0][var1][var2] != null) {
                            class485.field7086[var0][var1][var2].method2856(-5255);
                        }
                        class485.field7086[var0][var1][var2] = null;
                    }
                }
            }
        }
        class485.field7086 = null;
        class385.field5608 = null;
        if (class382.field5586 != null) {
            for (int var3 = 0; var3 < class382.field5586.length; var3++) {
                for (int var4 = 0; var4 < class206.field2881; var4++) {
                    for (int var5 = 0; var5 < class371.field5427; var5++) {
                        if (class382.field5586[var3][var4][var5] != null) {
                            class382.field5586[var3][var4][var5].method2856(-5255);
                        }
                        class382.field5586[var3][var4][var5] = null;
                    }
                }
            }
        }
        class382.field5586 = null;
        class89.field1302 = null;
        class89.field1305 = null;
        class211.field2950 = null;
        class273.field3759 = 0;
        if (class271.field3736 != null) {
            for (int var6 = 0; var6 < class273.field3759; var6++) {
                class271.field3736[var6] = null;
            }
        }
        if (class420.field6132 != null) {
            for (int var7 = 0; var7 < class304.field4159; var7++) {
                class420.field6132[var7] = null;
            }
            class304.field4159 = 0;
        }
        if (class94.field1451 != null) {
            for (int var8 = 0; var8 < class510.field7569; var8++) {
                class94.field1451[var8] = null;
            }
            for (int var9 = 0; var9 < class253.field3523; var9++) {
                for (int var10 = 0; var10 < class206.field2881; var10++) {
                    for (int var11 = 0; var11 < class371.field5427; var11++) {
                        class243.field3402[var9][var10][var11] = 0L;
                    }
                }
            }
            class510.field7569 = 0;
        }
        class371.field5429 = null;
        class348.method2057(true);
        class296.field4069.method2457(8165);
        class391.field5739 = null;
        class257.field3581 = null;
        class12.field192 = null;
        class361.field5270 = null;
        class258.field3593 = null;
        class449.field6615 = null;
    }

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "(I)V", line = 196)
    public static final void method831(int arg0) {
        for (int var1 = 0; var1 < class225.field3203; var1++) {
            int var2 = class435.field6374[var1];
            class502 var3 = class378.field5533[var2];
            int var4 = class179.field2631.method2348(-2);
            if ((var4 & 0x10) != 0) {
                var4 += class179.field2631.method2348(-2) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class179.field2631.method2332(2);
                int var6 = class179.field2631.method2348(-2);
                var3.method625(-105, var5, var6, class441.field6516);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1080 = class179.field2631.method2324(13486);
                var3.field1077 = class179.field2631.method2364(-124);
                var3.field1097 = class179.field2631.method2337(arg0 ^ 0xE93);
                var3.field1086 = class179.field2631.method2364(-104);
                var3.field1088 = class179.field2631.method2346((byte) 43) + class441.field6516;
                var3.field1090 = class179.field2631.method2313(255) + class441.field6516;
                var3.field1028 = class179.field2631.method2348(arg0 + 3730);
                var3.field1119 = 0;
                var3.field1086 += var3.field1117[0];
                var3.field1123 = 1;
                var3.field1097 += var3.field1127[0];
                var3.field1080 += var3.field1127[0];
                var3.field1077 += var3.field1117[0];
            }
            if ((var4 & 0x400) != 0) {
                int var7 = class179.field2631.method2317(0);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class179.field2631.method2345(2);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class179.field2631.method2352((byte) 8);
                    var10[var11] = class179.field2631.method2346((byte) 43);
                }
                class185.method1170(var9, var10, var3, var8, 1);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field7387.method643((byte) 123)) {
                    class347.method2052(var3, (byte) 64);
                }
                var3.method2939(67, class158.field2401.method2208(class179.field2631.method2313(arg0 + 3987), arg0 ^ 0xEDA));
                var3.method620(12, var3.field7387.field1168);
                var3.field1036 = var3.field7387.field1194 << 3;
                if (var3.field7387.method643((byte) 120)) {
                    class226.method1401(var3.field1127[0], null, var3.field1117[0], 0, arg0 ^ 0xFFFFF111, null, var3.field1738, var3);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var13 = class179.field2631.method2332(2);
                int var14 = class179.field2631.method2348(arg0 ^ 0xE92);
                var3.method625(-102, var13, var14, class441.field6516);
                var3.field1056 = class441.field6516 + 300;
                var3.field1079 = class179.field2631.method2352((byte) 8);
            }
            if ((var4 & 0x100) != 0) {
                int var15 = class179.field2631.method2353((byte) 86);
                var3.field1041 = class179.field2631.method2317(arg0 + 3732);
                var3.field1040 = class179.field2631.method2305(-126);
                var3.field1044 = var15 & 0x7FFF;
                var3.field1029 = (var15 & 0x8000) != 0;
                var3.field1039 = class441.field6516 + var3.field1044 + var3.field1041;
            }
            if ((var4 & 0x20) != 0) {
                int var16 = class179.field2631.method2345(2);
                int var17 = class179.field2631.method2358(arg0 ^ 0xFFFFF157);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var18 = class179.field2631.method2348(arg0 + 3730);
                var3.method615(var18, -109, false, var16, var17);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1069 = class179.field2631.method2346((byte) 43);
                if (var3.field1069 == 65535) {
                    var3.field1069 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1100 = class179.field2631.method2347((byte) -56);
                var3.field1050 = 100;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field7389 = class179.field2631.method2346((byte) 43);
                var3.field7403 = class179.field2631.method2345(2);
            }
            if ((var4 & 0x800) != 0) {
                int var19 = class179.field2631.method2353((byte) 68);
                int var20 = class179.field2631.method2325(-127);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var21 = class179.field2631.method2305(-124);
                var3.method615(var21, -117, true, var19, var20);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1068 = class179.field2631.method2337(-1);
                var3.field1092 = class179.field2631.method2337(-1);
                var3.field1075 = class179.field2631.method2364(-28);
                var3.field1103 = (byte) class179.field2631.method2352((byte) 8);
                var3.field1047 = class441.field6516 + class179.field2631.method2345(2);
                var3.field1030 = class441.field6516 + class179.field2631.method2313(255);
            }
            if ((var4 & 0x80) != 0) {
                int var22 = class179.field2631.method2353((byte) 77);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class179.field2631.method2317(0);
                class110.method799(var3, var23, (byte) -113, var22);
            }
        }
        field1746++;
        if (arg0 != -3732) {
            method830();
        }
    }
}
