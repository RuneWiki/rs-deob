import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class470 {

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field7016 = 0;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "[B")
    public byte[] field7011;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7013;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "[S")
    public short[] field7008;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "[S")
    public short[] field7009;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "[S")
    public short[] field7014;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static void method2817(int arg0) {
        field7013 = null;
        if (arg0 != -1) {
            field7016 = 97;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static final void method2818(byte arg0) {
        field7015++;
        int[] var1 = new int[class103.field1489.field3419];
        int var2 = 0;
        for (int var3 = 0; var3 < class103.field1489.field3419; var3++) {
            class74 var5 = class103.field1489.method1603((byte) -99, var3);
            if (var5.field1048 >= 0 || var5.field1018 >= 0) {
                var1[var2++] = var3;
            }
        }
        class151.field1975 = new int[var2];
        if (arg0 > -41) {
            method2818((byte) 126);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class151.field1975[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLga;)Ljava/lang/String;")
    public static final String method2819(byte arg0, class282 arg1) {
        field7012++;
        if (arg0 < 122) {
            return null;
        } else if (client.method1348(arg1).method2699(1661101682) == 0) {
            return null;
        } else if (arg1.field4114 == null || arg1.field4114.trim().length() == 0) {
            return class215.field3038 ? "Hidden-use" : null;
        } else {
            return arg1.field4114;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[[[Lsn;IIZI)Z")
    public static final boolean method2820(int arg0, class452[][][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field7010++;
        byte var6 = arg4 ? 1 : (byte) (class206.field2765 & 0xFF);
        if (class304.field4438[class367.field5618][arg3][arg2] == var6) {
            return false;
        } else if ((class178.field2382[class367.field5618][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class419.field6382[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class397.field6059[var7] = arg2;
            class304.field4438[class367.field5618][arg3][arg2] = var6;
            while (var35 != var8) {
                int var9 = class419.field6382[var8] & 0xFFFF;
                int var10 = class419.field6382[var8] >> 16 & 0xFF;
                int var11 = class419.field6382[var8] >> 24 & 0xFF;
                int var12 = class397.field6059[var8] & 0xFFFF;
                int var13 = class397.field6059[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class178.field2382[class367.field5618][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class367.field5618 + 1; var16 <= 3; var16++) {
                    if ((class178.field2382[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field6812 != null) {
                                int var20 = class451.method2747((byte) 81, var10);
                                if (arg1[var16][var9][var12].field6812.field7854 == var20 || arg1[var16][var9][var12].field6797 != null && arg1[var16][var9][var12].field6797.field7854 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class451.method2747((byte) 81, var11);
                                    if (arg1[var16][var9][var12].field6812.field7854 == var21 || arg1[var16][var9][var12].field6797 != null && arg1[var16][var9][var12].field6797.field7854 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class451.method2747((byte) 81, var13);
                                    if (arg1[var16][var9][var12].field6812.field7854 == var22 || arg1[var16][var9][var12].field6797 != null && arg1[var16][var9][var12].field6797.field7854 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class452 var23 = arg1[var16][var9][var12];
                            if (var23.field6814 != null) {
                                for (class384 var24 = var23.field6814; var24 != null; var24 = var24.field5834) {
                                    class140 var25 = var24.field5832;
                                    if (var25 instanceof class68) {
                                        class68 var26 = (class68) var25;
                                        int var27 = var26.method336(-6130);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method332(6359);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class452 var30 = arg1[var16][var9][var12];
                        if (var30 != null && var30.field6814 != null) {
                            for (class384 var31 = var30.field6814; var31 != null; var31 = var31.field5834) {
                                class140 var32 = var31.field5832;
                                if (var32.field1871 != var32.field1868 || var32.field1874 != var32.field1863) {
                                    for (int var33 = var32.field1868; var33 <= var32.field1871; var33++) {
                                        for (int var34 = var32.field1863; var34 <= var32.field1874; var34++) {
                                            class304.field4438[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class304.field4438[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class306.field4447[class367.field5618 + 1].method222(var9, var12);
                    if (var17 > class394.field6021[arg0]) {
                        class394.field6021[arg0] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class282.field4153[arg0] > var18) {
                        class282.field4153[arg0] = var18;
                    } else if (var18 > class78.field1127[arg0]) {
                        class78.field1127[arg0] = var18;
                    }
                    if (class390.field5958[arg0] > var19) {
                        class390.field5958[arg0] = var19;
                    } else if (class102.field1476[arg0] < var19) {
                        class102.field1476[arg0] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class304.field4438[class367.field5618][var9 - 1][var12] != var6) {
                        class419.field6382[var35] = class311.method1956(-754974720, class311.method1956(1179648, var9 - 1));
                        class397.field6059[var35] = class311.method1956(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class304.field4438[class367.field5618][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class528.field7734 > var12) {
                        if ((var9 - 1) >= 0 && class304.field4438[class367.field5618][var9 - 1][var12] != var6 && (class178.field2382[class367.field5618][var9][var12] & 0x4) == 0 && (class178.field2382[class367.field5618][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class419.field6382[var35] = class311.method1956(class311.method1956(1179648, var9 - 1), 1375731712);
                            class397.field6059[var35] = class311.method1956(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class304.field4438[class367.field5618][var9 - 1][var12] = var6;
                        }
                        if (class304.field4438[class367.field5618][var9][var12] != var6) {
                            class419.field6382[var35] = class311.method1956(318767104, class311.method1956(var9, 5373952));
                            class397.field6059[var35] = class311.method1956(5439488, var12);
                            class304.field4438[class367.field5618][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class398.field6071 && class304.field4438[class367.field5618][var9 + 1][var12] != var6 && (class178.field2382[class367.field5618][var9][var12] & 0x4) == 0 && (class178.field2382[class367.field5618][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class419.field6382[var35] = class311.method1956(class311.method1956(var9 + 1, 5373952), -1845493760);
                            class397.field6059[var35] = class311.method1956(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class304.field4438[class367.field5618][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class398.field6071 && class304.field4438[class367.field5618][var9 + 1][var12] != var6) {
                        class419.field6382[var35] = class311.method1956(class311.method1956(var9 + 1, 9568256), 1392508928);
                        class397.field6059[var35] = class311.method1956(var12, 9633792);
                        class304.field4438[class367.field5618][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class304.field4438[class367.field5618][var9 - 1][var12] != var6 && (class178.field2382[class367.field5618][var9][var12] & 0x4) == 0 && (class178.field2382[class367.field5618][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class419.field6382[var35] = class311.method1956(class311.method1956(var9 - 1, 13762560), 301989888);
                            class397.field6059[var35] = class311.method1956(13828096, var12);
                            class304.field4438[class367.field5618][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class304.field4438[class367.field5618][var9][var12] != var6) {
                            class419.field6382[var35] = class311.method1956(-1828716544, class311.method1956(13762560, var9));
                            class397.field6059[var35] = class311.method1956(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class304.field4438[class367.field5618][var9][var12] = var6;
                        }
                        if (class398.field6071 > (var9 + 1) && class304.field4438[class367.field5618][var9 + 1][var12] != var6 && (class178.field2382[class367.field5618][var9][var12] & 0x4) == 0 && (class178.field2382[class367.field5618][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class419.field6382[var35] = class311.method1956(class311.method1956(var9 + 1, 9568256), -771751936);
                            class397.field6059[var35] = class311.method1956(var12, 9633792);
                            class304.field4438[class367.field5618][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class394.field6021[arg0] != -1000000) {
                class394.field6021[arg0] += 10;
                class282.field4153[arg0] -= 50;
                class78.field1127[arg0] += 50;
                class102.field1476[arg0] += 50;
                class390.field5958[arg0] -= 50;
            }
            if (arg5 != -14646) {
                method2819((byte) 69, null);
            }
            return true;
        }
    }
}
