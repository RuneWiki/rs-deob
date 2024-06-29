import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class186 extends class200 {

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Z")
    private boolean field3347 = true;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Z")
    private boolean field3348 = true;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "[I")
    public static int[] field3345 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static void method1280(int arg0) {
        field3345 = null;
        if (arg0 != 0) {
            method1280(86);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)V")
    public static final void method1281(int arg0, int arg1) {
        ++field3355;
        if (~arg1 <= -1) {
            int var2 = class152.field2767[arg1];
            int var3 = class287.field5097[arg1];
            long var4 = class260.field4584[arg1];
            int var6 = (int) class260.field4584[arg1];
            int var7 = class284.field5032[arg1];
            if (var7 >= 2000) {
                var7 -= 2000;
            }
            if (~var7 == -51) {
                ++class19.field288;
                class208.field3720.method162(arg0, 206);
                class208.field3720.method504(var6, arg0 + -12198);
                class208.field3720.method509(var2, 1608904784);
                class208.field3720.method513((byte) -94, var3);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (var7 == 16) {
                class127 var8 = class107.field1851[var6];
                if (var8 != null) {
                    ++class73.field1274;
                    class71.method445(1, var8.field2400[0], var8.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class223.field3925 = class260.field4582;
                    class283.field5011 = 0;
                    class136.field2506 = class159.field2921;
                    class55.field993 = 2;
                    class208.field3720.method162(2, 195);
                    class208.field3720.method504(class24.field368, -12196);
                    class208.field3720.method513((byte) 85, class97.field1717);
                    class208.field3720.method516((byte) -117, var6);
                }
            }
            if (~var7 == -46) {
                ++class43.field659;
                class277.method1914((byte) 119, var4, var2, var3);
                class208.field3720.method162(2, 247);
                class208.field3720.method509(class115.field1969 + var3, 1608904784);
                class208.field3720.method516((byte) 68, class125.field2199 + var2);
                class208.field3720.method518(arg0 ^ 16711682, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            }
            if (~var7 == -36) {
                ++class168.field3124;
                if (class245.field4306 == 1) {
                    class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                } else {
                    boolean var9 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var9) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                }
                class136.field2506 = class159.field2921;
                class283.field5011 = 0;
                class55.field993 = 2;
                class223.field3925 = class260.field4582;
                class208.field3720.method162(arg0, 33);
                class208.field3720.method518(16711680, var6);
                class208.field3720.method518(arg0 + 16711678, class125.field2199 + var2);
                class208.field3720.method509(class115.field1969 + var3, arg0 ^ 1608904786);
            }
            if (~var7 == -15) {
                class20 var11 = class38.field572[var6];
                if (var11 != null) {
                    ++class175.field3216;
                    class71.method445(1, var11.field2400[0], var11.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class283.field5011 = 0;
                    class223.field3925 = class260.field4582;
                    class136.field2506 = class159.field2921;
                    class55.field993 = 2;
                    class208.field3720.method162(2, 148);
                    class208.field3720.method504(var6, -12196);
                }
            }
            if (~var7 == -12) {
                ++class49.field888;
                class277.method1914((byte) 116, var4, var2, var3);
                class208.field3720.method162(2, 194);
                class208.field3720.method516((byte) 47, class115.field1969 + var3);
                class208.field3720.method509(class125.field2199 + var2, 1608904784);
                class208.field3720.method518(16711680, Integer.MAX_VALUE & (int) (var4 >>> 32));
            }
            if (var7 == 30) {
                ++class219.field3864;
                class208.field3720.method162(2, 156);
                class208.field3720.method516((byte) -99, var2);
                class208.field3720.method504(var6, arg0 ^ -12194);
                class208.field3720.method513((byte) -126, var3);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (var7 == 1) {
                class208.field3720.method162(2, 85);
                ++class242.field4251;
                class208.field3720.method481(var3, 23);
                class208.field3720.method518(16711680, var2);
                class208.field3720.method504(var6, -12196);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (~var7 == -29 && class277.method1914((byte) 119, var4, var2, var3)) {
                class208.field3720.method162(arg0, 233);
                class208.field3720.method516((byte) 117, class115.field1969 + var3);
                ++class150.field2735;
                class208.field3720.method504(class125.field2199 + var2, -12196);
                class208.field3720.method516((byte) 122, class24.field368);
                class208.field3720.method481(class97.field1717, 44);
                class208.field3720.method504(Integer.MAX_VALUE & (int) (var4 >>> 32), -12196);
            }
            if (~var7 == -44) {
                if (~class245.field4306 == -2) {
                    class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                } else {
                    boolean var12 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var12) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                }
                class136.field2506 = class159.field2921;
                class223.field3925 = class260.field4582;
                ++class109.field1887;
                class55.field993 = 2;
                class283.field5011 = 0;
                class208.field3720.method162(2, 48);
                class208.field3720.method504(class125.field2199 + var2, arg0 ^ -12194);
                class208.field3720.method516((byte) 93, var6);
                class208.field3720.method509(class115.field1969 + var3, 1608904784);
            }
            if (var7 == 2) {
                class208.field3720.method162(2, 6);
                ++class254.field4445;
                class208.field3720.method517(var3, 126);
                class208.field3720.method504(var2, -12196);
                class208.field3720.method509(var6, 1608904784);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (var7 == 10) {
                ++class226.field3972;
                class208.field3720.method162(arg0, 10);
                class208.field3720.method517(var3, 126);
                class47 var14 = class251.method1741((byte) 110, var3);
                if (var14.field793 != null && var14.field793[0][0] == 5) {
                    int var15 = var14.field793[0][1];
                    if (~class115.field1953[var15] != ~var14.field750[0]) {
                        class115.field1953[var15] = var14.field750[0];
                        class134.method938(var15, -39);
                    }
                }
            }
            if (var7 == 44) {
                class208.field3720.method162(2, 153);
                ++class197.field3555;
                class208.field3720.method513((byte) -104, var3);
                class208.field3720.method509(var2, 1608904784);
                class208.field3720.method509(var6, 1608904784);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (~var7 == -27) {
                ++class256.field4476;
                class208.field3720.method162(2, 161);
                class208.field3720.method513((byte) 116, var3);
                class208.field3720.method516((byte) -126, var6);
                class208.field3720.method516((byte) -128, var2);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (var7 == 20) {
                ++class150.field2734;
                class277.method1914((byte) 120, var4, var2, var3);
                class208.field3720.method162(2, 254);
                class208.field3720.method509(class125.field2199 + var2, 1608904784);
                class208.field3720.method504(Integer.MAX_VALUE & (int) (var4 >>> 32), -12196);
                class208.field3720.method518(16711680, class115.field1969 + var3);
            }
            if (~var7 == -59) {
                class277.method1914((byte) 111, var4, var2, var3);
                class208.field3720.method162(arg0, 84);
                class208.field3720.method516((byte) 71, Integer.MAX_VALUE & (int) (var4 >>> 32));
                class208.field3720.method516((byte) -89, var3 - -class115.field1969);
                ++class269.field4842;
                class208.field3720.method509(class125.field2199 + var2, 1608904784);
            }
            if (~var7 == -35) {
                class127 var16 = class107.field1851[var6];
                if (var16 != null) {
                    ++class20.field300;
                    class71.method445(1, var16.field2400[0], var16.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class223.field3925 = class260.field4582;
                    class136.field2506 = class159.field2921;
                    class55.field993 = 2;
                    class283.field5011 = 0;
                    class208.field3720.method162(2, 114);
                    class208.field3720.method516((byte) -110, var6);
                }
            }
            if (~var7 == -23) {
                ++class141.field2599;
                class208.field3720.method162(arg0, 82);
                class208.field3720.method518(16711680, class24.field368);
                class208.field3720.method481(var3, 127);
                class208.field3720.method517(class97.field1717, 119);
                class208.field3720.method516((byte) 119, var2);
            }
            if (var7 == 5) {
                if (~var6 != -1) {
                    if (~class258.field4519 < -1 && class131.field2312[82] && class131.field2312[81]) {
                        class101.method723(class125.field2199 + var2, class115.field1969 + var3, class277.field4948, 2074796454);
                    } else {
                        ++field3346;
                        class208.field3720.method162(2, 179);
                        class208.field3720.method518(16711680, class115.field1969 + var3);
                        class208.field3720.method518(16711680, class125.field2199 + var2);
                    }
                } else {
                    class286.field5076 = 1;
                    class248.method1726(class277.field4948, var2, var3);
                }
            }
            if (var7 == 38 && class263.field4677 == null) {
                class68.method422((byte) 92, var2, var3);
                class263.field4677 = class247.method1720(var2, arg0 + 18060, var3);
                class182.method1267(class263.field4677, 109);
            }
            if (arg0 != 2) {
                method1281(-106, -103);
            }
            if (var7 == 3) {
                class48.method308((byte) 10);
            }
            if (~var7 == -58) {
                if (~var6 == -1) {
                    class248.method1726(class277.field4948, var2, var3);
                } else if (var6 == 1) {
                    if (~class258.field4519 < -1 && class131.field2312[82] && class131.field2312[81]) {
                        class101.method723(class125.field2199 - -var2, class115.field1969 + var3, class277.field4948, 2074796454);
                    } else if (class71.method445(0, var3, var2, 0, (byte) -6, true, 0, 0, class77.field1449.field2400[0], 0, 1, class77.field1449.field2333[0])) {
                        class208.field3720.method494((byte) 4, class48.field877);
                        class208.field3720.method494((byte) 4, class263.field4684);
                        class208.field3720.method518(arg0 + 16711678, class55.field985);
                        class208.field3720.method494((byte) 4, 57);
                        class208.field3720.method494((byte) 4, class184.field3320);
                        class208.field3720.method494((byte) 4, class232.field4093);
                        class208.field3720.method494((byte) 4, 89);
                        class208.field3720.method518(16711680, class77.field1449.field2347);
                        class208.field3720.method518(16711680, class77.field1449.field2340);
                        class208.field3720.method494((byte) 4, class167.field3092);
                        class208.field3720.method494((byte) 4, 63);
                    }
                }
            }
            if (var7 == 9) {
                class127 var17 = class107.field1851[var6];
                if (var17 != null) {
                    class71.method445(1, var17.field2400[0], var17.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class136.field2506 = class159.field2921;
                    ++class1.field20;
                    class55.field993 = 2;
                    class223.field3925 = class260.field4582;
                    class283.field5011 = 0;
                    class208.field3720.method162(2, 180);
                    class208.field3720.method516((byte) -128, var6);
                }
            }
            if (~var7 == -1007) {
                class136.field2506 = class159.field2921;
                class283.field5011 = 0;
                class55.field993 = 2;
                ++class170.field3141;
                class223.field3925 = class260.field4582;
                class208.field3720.method162(2, 92);
                class208.field3720.method516((byte) -85, var6);
            }
            if (~var7 == -32) {
                class127 var18 = class107.field1851[var6];
                if (var18 != null) {
                    ++class176.field3219;
                    class71.method445(1, var18.field2400[0], var18.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class223.field3925 = class260.field4582;
                    class136.field2506 = class159.field2921;
                    class55.field993 = 2;
                    class283.field5011 = 0;
                    class208.field3720.method162(2, 4);
                    class208.field3720.method509(var6, 1608904784);
                }
            }
            if (~var7 == -20) {
                class20 var19 = class38.field572[var6];
                if (var19 != null) {
                    class71.method445(1, var19.field2400[0], var19.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class136.field2506 = class159.field2921;
                    class223.field3925 = class260.field4582;
                    class55.field993 = 2;
                    ++class236.field4141;
                    class283.field5011 = 0;
                    class208.field3720.method162(arg0, 3);
                    class208.field3720.method516((byte) 94, var6);
                }
            }
            if (~var7 == -1004) {
                ++class267.field4755;
                class277.method1914((byte) 110, var4, var2, var3);
                class208.field3720.method162(arg0, 170);
                class208.field3720.method516((byte) 88, (int) (var4 >>> 32) & Integer.MAX_VALUE);
                class208.field3720.method516((byte) 109, var2 - -class125.field2199);
                class208.field3720.method516((byte) 122, var3 - -class115.field1969);
            }
            if (~var7 == -26) {
                if (~class245.field4306 == -2) {
                    class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                } else {
                    boolean var20 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var20) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                }
                class136.field2506 = class159.field2921;
                ++class222.field3923;
                class55.field993 = 2;
                class223.field3925 = class260.field4582;
                class283.field5011 = 0;
                class208.field3720.method162(2, 109);
                class208.field3720.method509(class115.field1969 + var3, 1608904784);
                class208.field3720.method518(arg0 + 16711678, class125.field2199 + var2);
                class208.field3720.method516((byte) -107, var6);
            }
            if (~var7 == -19) {
                ++class143.field2602;
                class208.field3720.method162(2, 55);
                class208.field3720.method509(var6, 1608904784);
                class208.field3720.method504(var2, arg0 ^ -12194);
                class208.field3720.method481(var3, 86);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (~var7 == -38) {
                ++class166.field3084;
                class208.field3720.method162(arg0, 154);
                class208.field3720.method509(var2, 1608904784);
                class208.field3720.method481(var3, 113);
                class208.field3720.method516((byte) -107, var6);
                class119.field2047 = 0;
                class116.field1979 = class251.method1741((byte) 110, var3);
                class62.field1107 = var2;
            }
            if (var7 == 13) {
                class208.field3720.method162(2, 10);
                ++class226.field3972;
                class208.field3720.method517(var3, 122);
                class47 var22 = class251.method1741((byte) 110, var3);
                if (var22.field793 != null && var22.field793[0][0] == 5) {
                    int var23 = var22.field793[0][1];
                    class115.field1953[var23] = -class115.field1953[var23] + 1;
                    class134.method938(var23, -73);
                }
            }
            if (var7 == 32) {
                class20 var24 = class38.field572[var6];
                if (var24 != null) {
                    class71.method445(1, var24.field2400[0], var24.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class283.field5011 = 0;
                    class55.field993 = 2;
                    class136.field2506 = class159.field2921;
                    class223.field3925 = class260.field4582;
                    ++class108.field1857;
                    class208.field3720.method162(2, 239);
                    class208.field3720.method513((byte) 98, class97.field1717);
                    class208.field3720.method504(class24.field368, arg0 + -12198);
                    class208.field3720.method516((byte) -101, var6);
                }
            }
            if (~var7 == -8) {
                if (~class245.field4306 != -2) {
                    boolean var25 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var25) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                } else {
                    class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                }
                class136.field2506 = class159.field2921;
                class223.field3925 = class260.field4582;
                ++class258.field4512;
                class55.field993 = 2;
                class283.field5011 = 0;
                class208.field3720.method162(2, 66);
                class208.field3720.method509(var2 - -class125.field2199, 1608904784);
                class208.field3720.method518(arg0 ^ 16711682, var6);
                class208.field3720.method516((byte) 79, class115.field1969 + var3);
            }
            if (~var7 == -60 || var7 == 1001) {
                method1283(class78.field1456[arg1], 10, var2, var3, var6);
            }
            if (~var7 == -34) {
                class127 var27 = class107.field1851[var6];
                if (var27 != null) {
                    class71.method445(1, var27.field2400[0], var27.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    class55.field993 = 2;
                    class223.field3925 = class260.field4582;
                    ++class276.field4925;
                    class283.field5011 = 0;
                    class136.field2506 = class159.field2921;
                    class208.field3720.method162(2, 68);
                    class208.field3720.method516((byte) 68, var6);
                }
            }
            if (var7 == 12) {
                class261.method1816(5197);
                class47 var28 = class251.method1741((byte) 110, var3);
                class210.field3749 = var6;
                class43.field657 = 1;
                class78.field1459 = var2;
                class5.field60 = var3;
                class182.method1267(var28, 107);
                class70.field1237 = class237.method1603(new class149[] { class36.field541, class226.method1516(var6, -28322).field4604, class38.field567 }, -94);
                if (class70.field1237 == null) {
                    class70.field1237 = class165.field3074;
                }
            } else {
                if (var7 == 1007) {
                    class55.field993 = 2;
                    class136.field2506 = class159.field2921;
                    class223.field3925 = class260.field4582;
                    class283.field5011 = 0;
                    class20 var29 = class38.field572[var6];
                    if (var29 != null) {
                        class59 var30 = var29.field296;
                        if (var30.field1046 != null) {
                            var30 = var30.method374(-1);
                        }
                        if (var30 != null) {
                            class208.field3720.method162(arg0, 72);
                            ++class76.field1385;
                            class208.field3720.method518(16711680, var30.field1043);
                        }
                    }
                }
                if (var7 == 48 && class277.method1914((byte) 104, var4, var2, var3)) {
                    class208.field3720.method162(2, 134);
                    ++class90.field1604;
                    class208.field3720.method504(class125.field2199 + var2, -12196);
                    class208.field3720.method518(arg0 + 16711678, class210.field3749);
                    class208.field3720.method509(class115.field1969 + var3, 1608904784);
                    class208.field3720.method518(16711680, class78.field1459);
                    class208.field3720.method479(class5.field60, arg0 + -93);
                    class208.field3720.method504((int) (var4 >>> 32) & Integer.MAX_VALUE, -12196);
                }
                if (~var7 == -37) {
                    ++class237.field4158;
                    boolean var31 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var31) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                    class55.field993 = 2;
                    class283.field5011 = 0;
                    class223.field3925 = class260.field4582;
                    class136.field2506 = class159.field2921;
                    class208.field3720.method162(2, 101);
                    class208.field3720.method516((byte) 96, class125.field2199 + var2);
                    class208.field3720.method509(class78.field1459, 1608904784);
                    class208.field3720.method509(class210.field3749, 1608904784);
                    class208.field3720.method509(var6, 1608904784);
                    class208.field3720.method516((byte) -90, class115.field1969 + var3);
                    class208.field3720.method479(class5.field60, -109);
                }
                if (var7 == 51) {
                    class127 var33 = class107.field1851[var6];
                    if (var33 != null) {
                        class71.method445(1, var33.field2400[0], var33.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class223.field3925 = class260.field4582;
                        class136.field2506 = class159.field2921;
                        ++class242.field4262;
                        class55.field993 = 2;
                        class283.field5011 = 0;
                        class208.field3720.method162(2, 71);
                        class208.field3720.method516((byte) 67, var6);
                    }
                }
                if (var7 == 17) {
                    class127 var34 = class107.field1851[var6];
                    if (var34 != null) {
                        class71.method445(1, var34.field2400[0], var34.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class136.field2506 = class159.field2921;
                        ++class20.field302;
                        class283.field5011 = 0;
                        class223.field3925 = class260.field4582;
                        class55.field993 = 2;
                        class208.field3720.method162(2, 175);
                        class208.field3720.method504(var6, -12196);
                    }
                }
                if (var7 == 29) {
                    class20 var35 = class38.field572[var6];
                    if (var35 != null) {
                        class71.method445(1, var35.field2400[0], var35.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class223.field3925 = class260.field4582;
                        ++class148.field2662;
                        class283.field5011 = 0;
                        class136.field2506 = class159.field2921;
                        class55.field993 = 2;
                        class208.field3720.method162(arg0, 30);
                        class208.field3720.method518(16711680, var6);
                    }
                }
                if (~var7 == -47) {
                    boolean var36 = true;
                    class47 var37 = class251.method1741((byte) 110, var3);
                    if (~var37.field820 < -1) {
                        var36 = class261.method1817(var37, arg0 ^ -127);
                    }
                    if (var36) {
                        class208.field3720.method162(2, 10);
                        class208.field3720.method517(var3, 123);
                        ++class226.field3972;
                    }
                }
                if (~var7 == -40) {
                    ++class107.field1849;
                    class208.field3720.method162(arg0, 27);
                    class208.field3720.method518(16711680, class78.field1459);
                    class208.field3720.method513((byte) 110, var3);
                    class208.field3720.method509(var2, 1608904784);
                    class208.field3720.method513((byte) 94, class5.field60);
                    class208.field3720.method516((byte) -90, class210.field3749);
                    class208.field3720.method516((byte) -115, var6);
                    class119.field2047 = 0;
                    class116.field1979 = class251.method1741((byte) 110, var3);
                    class62.field1107 = var2;
                }
                if (~var7 == -16) {
                    class208.field3720.method162(2, 253);
                    class208.field3720.method513((byte) -81, class97.field1717);
                    ++class243.field4275;
                    class208.field3720.method516((byte) 118, var2);
                    class208.field3720.method513((byte) 36, var3);
                    class208.field3720.method504(var6, -12196);
                    class208.field3720.method509(class24.field368, 1608904784);
                    class119.field2047 = 0;
                    class116.field1979 = class251.method1741((byte) 110, var3);
                    class62.field1107 = var2;
                }
                if (~var7 == -61) {
                    class20 var38 = class38.field572[var6];
                    if (var38 != null) {
                        ++class70.field1226;
                        class71.method445(1, var38.field2400[0], var38.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class136.field2506 = class159.field2921;
                        class283.field5011 = 0;
                        class223.field3925 = class260.field4582;
                        class55.field993 = 2;
                        class208.field3720.method162(2, 115);
                        class208.field3720.method479(class5.field60, -97);
                        class208.field3720.method509(class78.field1459, arg0 + 1608904782);
                        class208.field3720.method509(var6, 1608904784);
                        class208.field3720.method516((byte) -99, class210.field3749);
                    }
                }
                if (~var7 == -50) {
                    class20 var39 = class38.field572[var6];
                    if (var39 != null) {
                        class71.method445(1, var39.field2400[0], var39.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class55.field993 = 2;
                        class283.field5011 = 0;
                        ++class249.field4365;
                        class136.field2506 = class159.field2921;
                        class223.field3925 = class260.field4582;
                        class208.field3720.method162(2, 78);
                        class208.field3720.method509(var6, 1608904784);
                    }
                }
                if (var7 == 41) {
                    if (var6 == 0) {
                        class191.field3421 = 1;
                        class248.method1726(class277.field4948, var2, var3);
                    } else if (~var6 == -2) {
                        class208.field3720.method162(2, 131);
                        ++class62.field1116;
                        class208.field3720.method479(class97.field1717, -119);
                        class208.field3720.method504(class125.field2199 - -var2, arg0 + -12198);
                        class208.field3720.method516((byte) 48, class24.field368);
                        class208.field3720.method504(class115.field1969 + var3, arg0 + -12198);
                    }
                }
                if (~var7 == -22) {
                    ++class140.field2570;
                    if (~class245.field4306 == -2) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    } else {
                        boolean var40 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        if (!var40) {
                            class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        }
                    }
                    class136.field2506 = class159.field2921;
                    class223.field3925 = class260.field4582;
                    class55.field993 = 2;
                    class283.field5011 = 0;
                    class208.field3720.method162(2, 228);
                    class208.field3720.method518(arg0 + 16711678, var6);
                    class208.field3720.method509(class125.field2199 + var2, 1608904784);
                    class208.field3720.method516((byte) 60, class115.field1969 + var3);
                }
                if (~var7 == -1005) {
                    class283.field5011 = 0;
                    class55.field993 = 2;
                    class136.field2506 = class159.field2921;
                    ++class11.field153;
                    class223.field3925 = class260.field4582;
                    class208.field3720.method162(2, 94);
                    class208.field3720.method516((byte) 97, var6);
                }
                if (var7 == 24) {
                    ++class50.field918;
                    boolean var42 = class71.method445(0, var3, var2, 0, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    if (!var42) {
                        class71.method445(1, var3, var2, 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                    }
                    class223.field3925 = class260.field4582;
                    class55.field993 = 2;
                    class283.field5011 = 0;
                    class136.field2506 = class159.field2921;
                    class208.field3720.method162(2, 73);
                    class208.field3720.method481(class97.field1717, 103);
                    class208.field3720.method518(16711680, class115.field1969 + var3);
                    class208.field3720.method516((byte) -125, var6);
                    class208.field3720.method516((byte) -89, class125.field2199 + var2);
                    class208.field3720.method509(class24.field368, 1608904784);
                }
                if (~var7 == -24) {
                    ++class261.field4608;
                    class208.field3720.method162(arg0, 135);
                    class208.field3720.method504(var6, -12196);
                    class208.field3720.method504(var2, arg0 + -12198);
                    class208.field3720.method479(var3, -91);
                    class119.field2047 = 0;
                    class116.field1979 = class251.method1741((byte) 110, var3);
                    class62.field1107 = var2;
                }
                if (var7 == 42) {
                    class208.field3720.method162(2, 81);
                    class208.field3720.method504(var2, -12196);
                    class208.field3720.method518(16711680, var6);
                    class208.field3720.method481(var3, 28);
                    class119.field2047 = 0;
                    ++class256.field4483;
                    class116.field1979 = class251.method1741((byte) 110, var3);
                    class62.field1107 = var2;
                }
                if (~var7 == -48) {
                    class127 var44 = class107.field1851[var6];
                    if (var44 != null) {
                        class71.method445(1, var44.field2400[0], var44.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        ++class22.field310;
                        class283.field5011 = 0;
                        class136.field2506 = class159.field2921;
                        class223.field3925 = class260.field4582;
                        class55.field993 = 2;
                        class208.field3720.method162(2, 248);
                        class208.field3720.method516((byte) -127, var6);
                        class208.field3720.method518(16711680, class210.field3749);
                        class208.field3720.method518(16711680, class78.field1459);
                        class208.field3720.method479(class5.field60, -97);
                    }
                }
                if (~var7 == -1006) {
                    class47 var45 = class251.method1741((byte) 110, var3);
                    if (var45 != null && ~var45.field786[var2] <= -100001) {
                        class264.method1841(true, class237.method1603(new class149[] { class211.method1434(var45.field786[var2], true), class68.field1183, class226.method1516(var6, -28322).field4604 }, -107), class171.field3158, 0);
                    } else {
                        class208.field3720.method162(2, 92);
                        class208.field3720.method516((byte) 54, var6);
                        ++class170.field3141;
                    }
                    class119.field2047 = 0;
                    class116.field1979 = class251.method1741((byte) 110, var3);
                    class62.field1107 = var2;
                }
                if (~var7 == -41) {
                    class127 var46 = class107.field1851[var6];
                    if (var46 != null) {
                        class71.method445(1, var46.field2400[0], var46.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class283.field5011 = 0;
                        class55.field993 = 2;
                        class223.field3925 = class260.field4582;
                        ++class270.field4862;
                        class136.field2506 = class159.field2921;
                        class208.field3720.method162(2, 133);
                        class208.field3720.method509(var6, arg0 + 1608904782);
                    }
                }
                if (~var7 == -9) {
                    class127 var47 = class107.field1851[var6];
                    if (var47 != null) {
                        class71.method445(1, var47.field2400[0], var47.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                        class136.field2506 = class159.field2921;
                        class283.field5011 = 0;
                        ++class197.field3571;
                        class55.field993 = 2;
                        class223.field3925 = class260.field4582;
                        class208.field3720.method162(2, 106);
                        class208.field3720.method518(arg0 ^ 16711682, var6);
                    }
                }
                if (~var7 == -7) {
                    class47 var48 = class247.method1720(var2, arg0 + 18060, var3);
                    if (var48 != null) {
                        class261.method1816(5197);
                        class161 var49 = client.method1104(var48);
                        class221.method1489(var48.field865, (byte) -50, var2, var48.field768, var3, var49.field2985, var49.method1178(arg0 ^ -3));
                        class43.field657 = 0;
                        class197.field3581 = class156.method1123(320, var48);
                        if (class197.field3581 == null) {
                            class197.field3581 = class95.field1674;
                        }
                        if (!var48.field718) {
                            class230.field4017 = class237.method1603(new class149[] { class128.field2251, var48.field791, class38.field567 }, -111);
                            return;
                        }
                        class230.field4017 = class237.method1603(new class149[] { var48.field711, class38.field567 }, -125);
                    }
                } else {
                    if (var7 == 4) {
                        class20 var50 = class38.field572[var6];
                        if (var50 != null) {
                            class71.method445(1, var50.field2400[0], var50.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                            class223.field3925 = class260.field4582;
                            class283.field5011 = 0;
                            class55.field993 = 2;
                            ++class106.field1835;
                            class136.field2506 = class159.field2921;
                            class208.field3720.method162(2, 218);
                            class208.field3720.method509(var6, 1608904784);
                        }
                    }
                    if (~class43.field657 != -1) {
                        class43.field657 = 0;
                        class182.method1267(class251.method1741((byte) 110, class5.field60), 99);
                    }
                    if (class40.field621) {
                        class261.method1816(5197);
                    }
                    if (class116.field1979 != null && class119.field2047 == 0) {
                        class182.method1267(class116.field1979, arg0 + 122);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lid;B)I")
    public static final int method1282(class149 arg0, byte arg1) {
        ++field3344;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~var2 > ~class49.field892; ++var2) {
                if (arg0.method1048(-85, class217.field3822[var2])) {
                    return var2;
                }
            }
            if (arg1 != 109) {
                method1280(72);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lid;IIII)V")
    public static final void method1283(class149 arg0, int arg1, int arg2, int arg3, int arg4) {
        class47 var5 = class247.method1720(arg2, arg1 + 18052, arg3);
        ++field3356;
        if (var5 != null) {
            if (var5.field733 != null) {
                class1 var6 = new class1();
                var6.field17 = var5.field733;
                var6.field13 = var5;
                var6.field10 = arg0;
                var6.field9 = arg4;
                class288.method1973(var6, arg1 ^ 77);
            }
            boolean var7 = true;
            if (~var5.field820 < -1) {
                var7 = class261.method1817(var5, 89);
            }
            if (var7) {
                if (client.method1104(var5).method1182((byte) -86, arg4 + -1)) {
                    if (arg4 == 1) {
                        class208.field3720.method162(2, 155);
                        class208.field3720.method517(arg3, 118);
                        class208.field3720.method518(16711680, arg2);
                        ++class228.field3990;
                    }
                    if (~arg4 == -3) {
                        class208.field3720.method162(2, 196);
                        ++class208.field3719;
                        class208.field3720.method517(arg3, 124);
                        class208.field3720.method518(arg1 + 16711670, arg2);
                    }
                    if (~arg4 == -4) {
                        ++class14.field198;
                        class208.field3720.method162(2, 124);
                        class208.field3720.method517(arg3, 120);
                        class208.field3720.method518(16711680, arg2);
                    }
                    if (~arg4 == -5) {
                        ++class194.field3473;
                        class208.field3720.method162(2, 199);
                        class208.field3720.method517(arg3, 118);
                        class208.field3720.method518(16711680, arg2);
                    }
                    if (~arg4 == -6) {
                        ++class276.field4930;
                        class208.field3720.method162(2, 234);
                        class208.field3720.method517(arg3, 123);
                        class208.field3720.method518(arg1 + 16711670, arg2);
                    }
                    if (arg4 == 6) {
                        ++class194.field3464;
                        class208.field3720.method162(2, 168);
                        class208.field3720.method517(arg3, 122);
                        class208.field3720.method518(arg1 + 16711670, arg2);
                    }
                    if (arg4 == 7) {
                        class208.field3720.method162(2, 166);
                        ++class245.field4311;
                        class208.field3720.method517(arg3, 118);
                        class208.field3720.method518(16711680, arg2);
                    }
                    if (arg4 == 8) {
                        class208.field3720.method162(2, 64);
                        ++class69.field1211;
                        class208.field3720.method517(arg3, 126);
                        class208.field3720.method518(16711680, arg2);
                    }
                    if (arg4 == 9) {
                        ++class286.field5079;
                        class208.field3720.method162(arg1 + -8, 53);
                        class208.field3720.method517(arg3, 121);
                        class208.field3720.method518(16711680, arg2);
                    }
                    if (arg1 == arg4) {
                        class208.field3720.method162(2, 9);
                        class208.field3720.method517(arg3, 118);
                        ++class201.field3646;
                        class208.field3720.method518(16711680, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        if (!arg0) {
            method1281(111, 37);
        }
        int[][] var3 = super.field3632.method965(arg1, 93);
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(this.field3347 ? -arg1 + class191.field3436 : arg1, false, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field3348) {
                for (int var11 = 0; ~var11 > ~class137.field2515; ++var11) {
                    var9[var11] = var6[-var11 + class261.field4667];
                    var8[var11] = var5[-var11 + class261.field4667];
                    var10[var11] = var7[-var11 + class261.field4667];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class137.field2515; ++var12) {
                    var9[var12] = var6[var12];
                    var8[var12] = var5[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        ++field3352;
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lec;)V")
    public static final void method1284(class23 arg0) {
        for (int var1 = arg0.field318; var1 <= arg0.field331; ++var1) {
            for (int var2 = arg0.field330; var2 <= arg0.field342; ++var2) {
                class231 var3 = class261.field4664[arg0.field340][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4047; ++var4) {
                        if (var3.field4061[var4] == arg0) {
                            --var3.field4047;
                            for (int var5 = var4; var5 < var3.field4047; ++var5) {
                                var3.field4061[var5] = var3.field4061[var5 + 1];
                                var3.field4054[var5] = var3.field4054[var5 + 1];
                            }
                            var3.field4061[var3.field4047] = null;
                            break;
                        }
                    }
                    var3.field4068 = 0;
                    for (int var6 = 0; var6 < var3.field4047; ++var6) {
                        var3.field4068 |= var3.field4054[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            field3354 = -70;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        ++field3351;
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, !this.field3347 ? arg0 : -arg0 + class191.field3436, false);
            if (!this.field3348) {
                class209.method1424(var4, 0, var3, 0, class137.field2515);
            } else {
                for (int var5 = 0; class137.field2515 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class261.field4667];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3641 = arg0.method489((byte) 89) == 1;
                }
            } else {
                this.field3347 = ~arg0.method489((byte) -71) == -2;
            }
        } else {
            this.field3348 = ~arg0.method489((byte) 87) == -2;
        }
        ++field3350;
        if (!arg1) {
            field3349 = -85;
        }
    }
}
