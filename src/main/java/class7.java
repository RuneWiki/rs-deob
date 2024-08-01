import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("af")
public class class7 extends class71 {

    @OriginalMember(owner = "af", name = "n", descriptor = "Llf;")
    public static class109 field98 = class35.method275("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 2);

    @OriginalMember(owner = "af", name = "t", descriptor = "Z")
    public static boolean field104 = false;

    @OriginalMember(owner = "af", name = "s", descriptor = "Lrc;")
    public static class160 field103 = new class160(5);

    @OriginalMember(owner = "af", name = "x", descriptor = "[Z")
    public static boolean[] field108 = new boolean[8];

    @OriginalMember(owner = "af", name = "p", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "af", name = "r", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "af", name = "o", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "af", name = "q", descriptor = "Llf;")
    public class109 field101;

    @OriginalMember(owner = "af", name = "w", descriptor = "Lpa;")
    public static class140 field107;

    @OriginalMember(owner = "af", name = "u", descriptor = "Lbg;")
    public static class18 field105;

    @OriginalMember(owner = "af", name = "v", descriptor = "Lvg;")
    public static class200 field106;

    @OriginalMember(owner = "af", name = "a", descriptor = "(BI)Llf;")
    public static final class109 method32(byte arg0, int arg1) {
        field102++;
        if (arg0 > -3) {
            method34((byte) -114, -60);
        }
        return arg1 < 999999999 ? class52.method345((byte) 85, arg1) : class46.field962;
    }

    @OriginalMember(owner = "af", name = "c", descriptor = "(B)V")
    public static void method33(byte arg0) {
        field107 = null;
        if (arg0 > -26) {
            return;
        }
        field105 = null;
        field103 = null;
        field98 = null;
        field106 = null;
        field108 = null;
    }

    @OriginalMember(owner = "af", name = "b", descriptor = "(BI)V")
    public static final void method34(byte arg0, int arg1) {
        field99++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class146.field2823[arg1];
        int var3 = class31.field726[arg1];
        int var4 = class201.field3966[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = (int) class72.field1392[arg1];
        long var6 = class72.field1392[arg1];
        if (var3 == 2) {
            boolean var8 = class55.method358(0, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var8) {
                class55.method358(0, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class192.field3669++;
            class199.field3812 = 2;
            class145.field2801 = class67.field1310;
            class60.field1185 = class129.field2511;
            class90.field1858 = 0;
            class200.field3850.method1339((byte) 98, 77);
            class200.field3850.method557(9698, class42.field880 + var4);
            class200.field3850.method557(arg0 ^ 0x2596, var5);
            class200.field3850.method557(arg0 ^ 0x2596, class53.field1079 + var2);
        }
        if (var3 == 1) {
            class184 var10 = class202.field3975[var5];
            if (var10 != null) {
                class55.method358(0, 1, 1, var10.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var10.field3567[0], 0, 0);
                class90.field1858 = 0;
                class45.field930++;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class200.field3850.method1339((byte) 124, 86);
                class200.field3850.method600(class72.field1401, 128);
                class200.field3850.method588((byte) 105, class96.field1959);
                class200.field3850.method600(var5, 128);
                class200.field3850.method557(9698, class47.field973);
            }
        }
        if (var3 == 9) {
            class139 var11 = class183.field3444[var5];
            if (var11 != null) {
                class55.method358(arg0 ^ 0x74, 1, 1, var11.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var11.field3567[0], 0, 0);
                class145.field2801 = class67.field1310;
                class156.field2931++;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class200.field3850.method1339((byte) 119, 97);
                class200.field3850.method557(9698, var5);
            }
        }
        if (var3 == 42) {
            class200.field3850.method1339((byte) 104, 173);
            class65.field1244++;
            class200.field3850.method574(1174839336, var2);
            class200.field3850.method588((byte) 109, var4);
            class200.field3850.method600(var5, arg0 ^ 0xF4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 114);
            class77.field1495 = var2;
        }
        if (var3 == 45) {
            class200.field3850.method1339((byte) 125, 168);
            class200.field3850.method574(1174839336, var2);
            class164.field3095++;
            class200.field3850.method603(var5, true);
            class200.field3850.method588((byte) 121, var4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 122);
            class77.field1495 = var2;
        }
        if (var3 == 39) {
            class106.field2099++;
            class200.field3850.method1339((byte) 118, 204);
            class200.field3850.method588((byte) 123, var4);
            class200.field3850.method600(var5, arg0 + 12);
            class200.field3850.method557(9698, var2);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 126);
            class77.field1495 = var2;
        }
        if (var3 == 3) {
            class200.field3850.method1339((byte) 113, 226);
            class200.field3850.method557(9698, var2);
            class200.field3850.method554(false, var4);
            class106.field2105++;
            class200.field3850.method600(var5, 128);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 112);
            class77.field1495 = var2;
        }
        if (var3 == 40) {
            class57.method374(var4, false, var6, var2);
            class200.field3850.method1339((byte) 86, 162);
            class200.field3850.method603(Integer.MAX_VALUE & (int) (var6 >>> 32), true);
            class148.field2862++;
            class200.field3850.method600(class53.field1079 + var2, 128);
            class200.field3850.method574(1174839336, class42.field880 + var4);
        }
        if (var3 == 33) {
            class184 var12 = class202.field3975[var5];
            if (var12 != null) {
                class55.method358(0, 1, 1, var12.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var12.field3567[0], 0, 0);
                class199.field3803++;
                class90.field1858 = 0;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class200.field3850.method1339((byte) 118, 222);
                class200.field3850.method557(9698, var5);
            }
        }
        if (var3 == 29) {
            class29.field632++;
            class200.field3850.method1339((byte) 86, 251);
            class200.field3850.method603(var2, true);
            class200.field3850.method554(false, var4);
            class200.field3850.method600(var5, 128);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 125);
            class77.field1495 = var2;
        }
        if (var3 == 47) {
            class168.field3119++;
            boolean var13 = class55.method358(arg0 - 116, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var13) {
                class55.method358(0, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class199.field3812 = 2;
            class90.field1858 = 0;
            class145.field2801 = class67.field1310;
            class60.field1185 = class129.field2511;
            class200.field3850.method1339((byte) 124, 139);
            class200.field3850.method600(var4 + class42.field880, 128);
            class200.field3850.method557(9698, class53.field1079 + var2);
            class200.field3850.method600(var5, 128);
        }
        if (var3 == 8) {
            class165.field3103++;
            boolean var15 = class55.method358(arg0 ^ 0x74, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var15) {
                class55.method358(arg0 ^ 0x74, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class199.field3812 = 2;
            class145.field2801 = class67.field1310;
            class90.field1858 = 0;
            class60.field1185 = class129.field2511;
            class200.field3850.method1339((byte) 96, 207);
            class200.field3850.method574(1174839336, var5);
            class200.field3850.method554(false, class96.field1959);
            class200.field3850.method603(class42.field880 + var4, true);
            class200.field3850.method574(1174839336, class72.field1401);
            class200.field3850.method603(class47.field973, true);
            class200.field3850.method574(1174839336, class53.field1079 + var2);
        }
        if (var3 == 31 && class57.method374(var4, false, var6, var2)) {
            class200.field3850.method1339((byte) 99, 216);
            class68.field1324++;
            class200.field3850.method604((byte) -98, class96.field1959);
            class200.field3850.method574(1174839336, class72.field1401);
            class200.field3850.method557(arg0 + 9582, class47.field973);
            class200.field3850.method574(1174839336, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class200.field3850.method603(var4 + class42.field880, true);
            class200.field3850.method603(var2 + class53.field1079, true);
        }
        if (var3 == 13) {
            class191.field3650++;
            boolean var17 = class55.method358(0, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var17) {
                class55.method358(0, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class60.field1185 = class129.field2511;
            class90.field1858 = 0;
            class145.field2801 = class67.field1310;
            class199.field3812 = 2;
            class200.field3850.method1339((byte) 100, 110);
            class200.field3850.method603(class53.field1079 + var2, true);
            class200.field3850.method557(arg0 ^ 0x2596, var5);
            class200.field3850.method603(class42.field880 + var4, true);
        }
        if (var3 == 24) {
            class82.field1620++;
            class200.field3850.method1339((byte) 86, 155);
            class200.field3850.method574(1174839336, var2);
            class200.field3850.method556(var4, -2125511736);
            class200.field3850.method600(var5, arg0 ^ 0xF4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 116);
            class77.field1495 = var2;
        }
        if (var3 == 1005) {
            class200 var19 = class158.method1078(var4, (byte) 113);
            if (var19 == null || var19.field3913[var2] < 100000) {
                class53.field1078++;
                class200.field3850.method1339((byte) 107, 123);
                class200.field3850.method557(arg0 ^ 0x2596, var5);
            } else {
                class98.method690(class174.field3306, false, class36.method279(new class109[] { class52.method345((byte) 85, var19.field3913[var2]), class1.field7, class128.method926(var5, arg0 - 120).field1644 }, arg0 ^ 0xF), 0);
            }
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 118);
            class77.field1495 = var2;
        }
        if (var3 == 46) {
            class137.field2648++;
            class200.field3850.method1339((byte) 111, 241);
            class200.field3850.method603(var5, true);
            class200.field3850.method557(9698, var2);
            class200.field3850.method603(class8.field119, true);
            class200.field3850.method604((byte) -98, class168.field3115);
            class200.field3850.method588((byte) 109, var4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 119);
            class77.field1495 = var2;
        }
        if (var3 == 37) {
            class139 var20 = class183.field3444[var5];
            if (var20 != null) {
                class55.method358(0, 1, 1, var20.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var20.field3567[0], 0, 0);
                class191.field3649++;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class200.field3850.method1339((byte) 88, 19);
                class200.field3850.method557(arg0 + 9582, var5);
            }
        }
        if (var3 == 50 && class57.method374(var4, false, var6, var2)) {
            class21.field492++;
            class200.field3850.method1339((byte) 99, 134);
            class200.field3850.method574(arg0 ^ 0x4606A05C, class8.field119);
            class200.field3850.method574(1174839336, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class200.field3850.method556(class168.field3115, -2125511736);
            class200.field3850.method600(class53.field1079 + var2, 128);
            class200.field3850.method574(1174839336, class42.field880 + var4);
        }
        if (var3 == 21) {
            class95.field1936++;
            class200.field3850.method1339((byte) 105, 186);
            class200.field3850.method588((byte) 114, var4);
            class200 var21 = class158.method1078(var4, (byte) 121);
            if (var21.field3833 != null && var21.field3833[0][0] == 5) {
                int var22 = var21.field3833[0][1];
                class187.field3564[var22] = 1 - class187.field3564[var22];
                class186.method1264(118, var22);
            }
        }
        if (var3 == 17) {
            class62.method406(21504);
            class200 var23 = class158.method1078(var4, (byte) 127);
            class140.field2725 = 1;
            class47.field973 = var2;
            class96.field1959 = var4;
            class72.field1401 = var5;
            class115.method851(var23, -23101);
            class204.field4001 = class36.method279(new class109[] { class79.field1559, class128.method926(var5, arg0 - 120).field1644, class116.field2305 }, arg0 - 207);
            if (class204.field4001 == null) {
                class204.field4001 = class34.field760;
            }
            return;
        }
        if (var3 == 51) {
            class139 var24 = class183.field3444[var5];
            if (var24 != null) {
                class18.field403++;
                class55.method358(0, 1, 1, var24.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var24.field3567[0], 0, 0);
                class145.field2801 = class67.field1310;
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class200.field3850.method1339((byte) 116, 176);
                class200.field3850.method574(1174839336, var5);
                class200.field3850.method604((byte) -98, class168.field3115);
                class200.field3850.method574(arg0 + 1174839220, class8.field119);
            }
        }
        if (var3 == 1003) {
            class53.field1078++;
            class199.field3812 = 2;
            class145.field2801 = class67.field1310;
            class90.field1858 = 0;
            class60.field1185 = class129.field2511;
            class200.field3850.method1339((byte) 91, 123);
            class200.field3850.method557(9698, var5);
        }
        if (var3 == 57) {
            class184 var25 = class202.field3975[var5];
            if (var25 != null) {
                class55.method358(0, 1, 1, var25.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var25.field3567[0], 0, 0);
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class41.field868++;
                class199.field3812 = 2;
                class145.field2801 = class67.field1310;
                class200.field3850.method1339((byte) 99, 59);
                class200.field3850.method557(arg0 ^ 0x2596, var5);
            }
        }
        if (var3 == 1007) {
            class83.field1650++;
            class57.method374(var4, false, var6, var2);
            class200.field3850.method1339((byte) 124, 160);
            class200.field3850.method557(arg0 ^ 0x2596, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class200.field3850.method603(class42.field880 + var4, true);
            class200.field3850.method574(1174839336, class53.field1079 + var2);
        }
        if (var3 == 36 && class159.field2980 == null) {
            class14.method94(var4, 180, var2);
            class159.field2980 = class129.method932(var4, -1, var2);
            class115.method851(class159.field2980, -23101);
        }
        if (var3 == 12) {
            class184 var26 = class202.field3975[var5];
            if (var26 != null) {
                class146.field2821++;
                class55.method358(arg0 - 116, 1, 1, var26.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var26.field3567[0], 0, 0);
                class90.field1858 = 0;
                class199.field3812 = 2;
                class60.field1185 = class129.field2511;
                class145.field2801 = class67.field1310;
                class200.field3850.method1339((byte) 90, 116);
                class200.field3850.method556(class168.field3115, -2125511736);
                class200.field3850.method600(var5, 128);
                class200.field3850.method557(arg0 + 9582, class8.field119);
            }
        }
        if (var3 == 18) {
            class184 var27 = class202.field3975[var5];
            if (var27 != null) {
                class55.method358(0, 1, 1, var27.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var27.field3567[0], 0, 0);
                class90.field1858 = 0;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class199.field3812 = 2;
                class67.field1296++;
                class200.field3850.method1339((byte) 108, 8);
                class200.field3850.method600(var5, 128);
            }
        }
        if (var3 == 11) {
            class184 var28 = class202.field3975[var5];
            if (var28 != null) {
                class55.method358(arg0 - 116, 1, 1, var28.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var28.field3567[0], 0, 0);
                class177.field3339++;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class145.field2801 = class67.field1310;
                class200.field3850.method1339((byte) 106, 246);
                class200.field3850.method574(arg0 + 1174839220, var5);
            }
        }
        if (var3 == 6) {
            class139 var29 = class183.field3444[var5];
            if (var29 != null) {
                class55.method358(arg0 ^ 0x74, 1, 1, var29.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var29.field3567[0], 0, 0);
                class199.field3812 = 2;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class90.field1858 = 0;
                class200.field3850.method1339((byte) 86, 235);
                class65.field1246++;
                class200.field3850.method557(9698, var5);
            }
        }
        if (var3 == 48) {
            class184 var30 = class202.field3975[var5];
            if (var30 != null) {
                class49.field1004++;
                class55.method358(arg0 ^ 0x74, 1, 1, var30.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var30.field3567[0], 0, 0);
                class199.field3812 = 2;
                class145.field2801 = class67.field1310;
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class200.field3850.method1339((byte) 126, 121);
                class200.field3850.method603(var5, true);
            }
        }
        if (var3 == 35) {
            class139 var31 = class183.field3444[var5];
            if (var31 != null) {
                class121.field2359++;
                class55.method358(0, 1, 1, var31.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var31.field3567[0], 0, 0);
                class90.field1858 = 0;
                class199.field3812 = 2;
                class145.field2801 = class67.field1310;
                class60.field1185 = class129.field2511;
                class200.field3850.method1339((byte) 93, 55);
                class200.field3850.method557(arg0 ^ 0x2596, var5);
            }
        }
        if (var3 == 22) {
            class184 var32 = class202.field3975[var5];
            if (var32 != null) {
                class55.method358(0, 1, 1, var32.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var32.field3567[0], 0, 0);
                class145.field2801 = class67.field1310;
                class128.field2469++;
                class60.field1185 = class129.field2511;
                class90.field1858 = 0;
                class199.field3812 = 2;
                class200.field3850.method1339((byte) 95, 2);
                class200.field3850.method603(var5, true);
            }
        }
        if (var3 == 1004) {
            class90.field1858 = 0;
            class60.field1185 = class129.field2511;
            class145.field2801 = class67.field1310;
            class199.field3812 = 2;
            class139 var33 = class183.field3444[var5];
            if (var33 != null) {
                class170 var34 = var33.field2691;
                if (var34.field3170 != null) {
                    var34 = var34.method1137(-1);
                }
                if (var34 != null) {
                    class85.field1725++;
                    class200.field3850.method1339((byte) 127, 87);
                    class200.field3850.method574(arg0 + 1174839220, var34.field3193);
                }
            }
        }
        if (var3 == 41) {
            class18.field378++;
            class200.field3850.method1339((byte) 89, 169);
            class200.field3850.method604((byte) -98, var4);
            class200.field3850.method574(arg0 + 1174839220, var2);
            class200.field3850.method557(9698, var5);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 118);
            class77.field1495 = var2;
        }
        if (var3 == 20) {
            class156.field2944++;
            class200.field3850.method1339((byte) 125, 67);
            class200.field3850.method603(var2, true);
            class200.field3850.method574(arg0 ^ 0x4606A05C, var5);
            class200.field3850.method554(false, var4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 113);
            class77.field1495 = var2;
        }
        if (var3 == 14 || var3 == 1002) {
            class164.method1111(var2, class183.field3438[arg1], var4, true, var5);
        }
        if (var3 == 15) {
            class20.field447++;
            class200.field3850.method1339((byte) 111, 100);
            class200.field3850.method604((byte) -98, var4);
            class200.field3850.method603(var5, true);
            class200.field3850.method557(9698, var2);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 118);
            class77.field1495 = var2;
        }
        if (var3 == 34) {
            class200 var35 = class158.method1078(var4, (byte) 115);
            boolean var36 = true;
            if (var35.field3916 > 0) {
                var36 = class113.method838(var35, (byte) -59);
            }
            if (var36) {
                class95.field1936++;
                class200.field3850.method1339((byte) 109, 186);
                class200.field3850.method588((byte) 108, var4);
            }
        }
        if (var3 == 4) {
            class200.field3850.method1339((byte) 125, 61);
            class162.field3038++;
            class200.field3850.method604((byte) -98, var4);
            class200.field3850.method588((byte) 112, class96.field1959);
            class200.field3850.method574(1174839336, class72.field1401);
            class200.field3850.method574(1174839336, var2);
            class200.field3850.method557(arg0 + 9582, var5);
            class200.field3850.method603(class47.field973, true);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 120);
            class77.field1495 = var2;
        }
        if (var3 == 49) {
            class203.field3989++;
            boolean var37 = class55.method358(arg0 ^ 0x74, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var37) {
                class55.method358(0, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class145.field2801 = class67.field1310;
            class60.field1185 = class129.field2511;
            class90.field1858 = 0;
            class199.field3812 = 2;
            class200.field3850.method1339((byte) 120, 9);
            class200.field3850.method557(9698, class42.field880 + var4);
            class200.field3850.method557(9698, var5);
            class200.field3850.method600(var2 + class53.field1079, 128);
        }
        if (var3 == 23) {
            class57.method374(var4, false, var6, var2);
            class107.field2122++;
            class200.field3850.method1339((byte) 100, 174);
            class200.field3850.method574(1174839336, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class200.field3850.method574(1174839336, var4 + class42.field880);
            class200.field3850.method557(9698, class53.field1079 + var2);
        }
        if (var3 == 10) {
            class200.field3850.method1339((byte) 110, 186);
            class200.field3850.method588((byte) 108, var4);
            class200 var39 = class158.method1078(var4, (byte) 117);
            if (var39.field3833 != null && var39.field3833[0][0] == 5) {
                int var40 = var39.field3833[0][1];
                if (class187.field3564[var40] != var39.field3819[0]) {
                    class187.field3564[var40] = var39.field3819[0];
                    class186.method1264(70, var40);
                }
            }
            class95.field1936++;
        }
        if (var3 == 32) {
            class139 var41 = class183.field3444[var5];
            if (var41 != null) {
                class55.method358(0, 1, 1, var41.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var41.field3567[0], 0, 0);
                class180.field3397++;
                class145.field2801 = class67.field1310;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class200.field3850.method1339((byte) 84, 30);
                class200.field3850.method574(1174839336, var5);
            }
        }
        if (var3 == 28) {
            class200 var42 = class129.method932(var4, arg0 - 117, var2);
            if (var42 != null) {
                class62.method406(arg0 ^ 0x5474);
                class95.method681(var4, class30.method243(68, class126.method918(var42, 111)), -118, var2);
                class140.field2725 = 0;
                class116.field2296 = class8.method37(arg0 - 116, var42);
                if (class116.field2296 == null) {
                    class116.field2296 = class132.field2550;
                }
                if (var42.field3946) {
                    class170.field3161 = class36.method279(new class109[] { var42.field3821, class116.field2305 }, -79);
                    return;
                }
                class170.field3161 = class36.method279(new class109[] { class40.field840, var42.field3923, class116.field2305 }, 116);
            }
            return;
        }
        if (var3 == 5) {
            class184 var43 = class202.field3975[var5];
            if (var43 != null) {
                class55.method358(arg0 ^ 0x74, 1, 1, var43.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var43.field3567[0], 0, 0);
                class146.field2815++;
                class145.field2801 = class67.field1310;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class60.field1185 = class129.field2511;
                class200.field3850.method1339((byte) 119, 25);
                class200.field3850.method600(var5, 128);
            }
        }
        if (var3 == 38) {
            class184 var44 = class202.field3975[var5];
            if (var44 != null) {
                class209.field4071++;
                class55.method358(0, 1, 1, var44.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var44.field3567[0], 0, 0);
                class60.field1185 = class129.field2511;
                class145.field2801 = class67.field1310;
                class199.field3812 = 2;
                class90.field1858 = 0;
                class200.field3850.method1339((byte) 88, 12);
                class200.field3850.method574(arg0 ^ 0x4606A05C, var5);
            }
        }
        if (var3 == 30) {
            class35.field787++;
            boolean var45 = class55.method358(0, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var45) {
                class55.method358(arg0 ^ 0x74, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class145.field2801 = class67.field1310;
            class199.field3812 = 2;
            class60.field1185 = class129.field2511;
            class90.field1858 = 0;
            class200.field3850.method1339((byte) 87, 148);
            class200.field3850.method603(var5, true);
            class200.field3850.method574(1174839336, class53.field1079 + var2);
            class200.field3850.method600(class42.field880 + var4, arg0 + 12);
        }
        if (var3 == 25) {
            class132.method945(class72.field1405, var2, var4);
        }
        if (var3 == 19) {
            class36.field789++;
            class57.method374(var4, false, var6, var2);
            class200.field3850.method1339((byte) 102, 107);
            class200.field3850.method557(arg0 + 9582, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class200.field3850.method600(class42.field880 + var4, 128);
            class200.field3850.method600(class53.field1079 + var2, arg0 + 12);
        }
        if (var3 == 26) {
            class139 var47 = class183.field3444[var5];
            if (var47 != null) {
                class55.method358(0, 1, 1, var47.field3547[0], 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var47.field3567[0], 0, 0);
                class145.field2801 = class67.field1310;
                class90.field1858 = 0;
                class159.field2987++;
                class199.field3812 = 2;
                class60.field1185 = class129.field2511;
                class200.field3850.method1339((byte) 103, 151);
                class200.field3850.method600(class72.field1401, 128);
                class200.field3850.method600(var5, 128);
                class200.field3850.method600(class47.field973, 128);
                class200.field3850.method588((byte) 109, class96.field1959);
            }
        }
        if (var3 == 16) {
            class145.method1017(126);
        }
        if (var3 == 7) {
            class200.field3850.method1339((byte) 121, 125);
            class200.field3850.method574(arg0 ^ 0x4606A05C, var5);
            class200.field3850.method557(9698, var2);
            class192.field3670++;
            class200.field3850.method604((byte) -98, var4);
            class184.field3480 = 0;
            class106.field2107 = class158.method1078(var4, (byte) 119);
            class77.field1495 = var2;
        }
        if (var3 == 58) {
            class139.field2690++;
            class57.method374(var4, false, var6, var2);
            class200.field3850.method1339((byte) 115, 191);
            class200.field3850.method600(var4 + class42.field880, 128);
            class200.field3850.method574(1174839336, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class200.field3850.method574(1174839336, var2 + class53.field1079);
        }
        if (var3 == 44) {
            class200.field3850.method1339((byte) 94, 224);
            class200.field3850.method603(class8.field119, true);
            class92.field1897++;
            class200.field3850.method556(class168.field3115, arg0 ^ 0x814F43BC);
            class200.field3850.method557(arg0 + 9582, var2);
            class200.field3850.method556(var4, -2125511736);
        }
        if (var3 == 43) {
            boolean var48 = class55.method358(0, 0, 0, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            if (!var48) {
                class55.method358(arg0 - 116, 1, 1, var2, 0, 2, class157.field2955.field3567[0], class157.field2955.field3547[0], false, var4, 0, 0);
            }
            class145.field2801 = class67.field1310;
            class60.field1185 = class129.field2511;
            class184.field3478++;
            class199.field3812 = 2;
            class90.field1858 = 0;
            class200.field3850.method1339((byte) 118, 88);
            class200.field3850.method554(false, class168.field3115);
            class200.field3850.method574(arg0 ^ 0x4606A05C, var5);
            class200.field3850.method574(1174839336, class42.field880 + var4);
            class200.field3850.method574(1174839336, var2 + class53.field1079);
            class200.field3850.method603(class8.field119, true);
        }
        if (var3 == 1006) {
            class144.field2775++;
            class60.field1185 = class129.field2511;
            class145.field2801 = class67.field1310;
            class199.field3812 = 2;
            class90.field1858 = 0;
            class200.field3850.method1339((byte) 100, 193);
            class200.field3850.method600(var5, 128);
        }
        if (class140.field2725 != 0) {
            class140.field2725 = 0;
            class115.method851(class158.method1078(class96.field1959, (byte) 115), -23101);
        }
        if (class123.field2360) {
            class62.method406(21504);
        }
        if (arg0 != 116) {
            method35((byte) -66, -8);
        }
        if (class106.field2107 != null && class184.field3480 == 0) {
            class115.method851(class106.field2107, -23101);
        }
    }

    @OriginalMember(owner = "af", name = "c", descriptor = "(BI)Lhh;")
    public static final class77 method35(byte arg0, int arg1) {
        field100++;
        class77 var2 = (class77) class147.field2840.method1086((long) arg1, -97);
        if (var2 != null) {
            return var2;
        }
        int var3 = 48 / ((-arg0 - 44) / 40);
        byte[] var4 = class52.field1065.method147(0, arg1, 3);
        class77 var5 = new class77();
        if (var4 != null) {
            var5.method490(60, new class86(var4));
        }
        class147.field2840.method1082((long) arg1, -112, var5);
        return var5;
    }
}
