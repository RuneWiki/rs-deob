import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class472 extends class11 {

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "Ljava/lang/String;")
    public String field6320;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "[C")
    public char[] field6316;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "[C")
    public char[] field6328;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "[I")
    public int[] field6323;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "[I")
    public int[] field6325;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(CI)I")
    public final int method2655(char arg0, int arg1) {
        field6326++;
        if (this.field6323 == null) {
            return -1;
        }
        if (arg1 != -1) {
            this.method2657((byte) -109);
        }
        for (int var3 = 0; var3 < this.field6323.length; var3++) {
            if (this.field6316[var3] == arg0) {
                return this.field6323[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Leh;Z)V")
    public final void method2656(class335 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                field6327++;
                return;
            }
            this.method2660(arg0, var3, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
    public final void method2657(byte arg0) {
        int var2 = 85 / ((arg0 + 39) / 32);
        field6322++;
        if (this.field6325 != null) {
            for (int var3 = 0; var3 < this.field6325.length; var3++) {
                this.field6325[var3] = class220.method1393(this.field6325[var3], 32768);
            }
        }
        if (this.field6323 != null) {
            for (int var4 = 0; var4 < this.field6323.length; var4++) {
                this.field6323[var4] = class220.method1393(this.field6323[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
    public static final void method2658(int arg0, int arg1) {
        field6324++;
        if (class32.field525 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class592.field7831 == null) {
                class654.method3581(arg0 - 19091, class509.field6793, class126.field2096, class449.field6163);
            } else {
                class62.method498(class126.field2096, -1);
            }
        }
        if (arg0 != 19093) {
            return;
        }
        if (arg1 != 13 && class334.field4580 != null) {
            class334.field4580.method633(9);
            class334.field4580 = null;
        }
        if (arg1 == 3) {
            class312.method1864(true, class568.field7548 != class251.field3463);
        }
        if (arg1 == 7) {
            class696.method3850(class251.field3463 != class10.field202, 99);
        }
        if (arg1 == 5) {
            if (class592.field7831 == null) {
                class676.method3774(class509.field6793, arg0 ^ 0xFFFFB56B, class449.field6163);
            } else {
                class100.method766(arg0 ^ 0x4AB6);
            }
        } else if (arg1 == 6) {
            if (class592.field7831 == null) {
                class654.method3581(2, class509.field6793, class126.field2096, class449.field6163);
            } else {
                class62.method498(class126.field2096, arg0 ^ 0xFFFFB56A);
            }
        } else if (arg1 == 9) {
            if (class592.field7831 == null) {
                class654.method3581(2, class509.field6793, class126.field2096, class449.field6163);
            } else {
                class62.method498(class126.field2096, -1);
            }
        } else if (arg1 == 12) {
            if (class592.field7831 == null) {
                class676.method3774(class509.field6793, -2, class449.field6163);
            } else {
                class100.method766(arg0 ^ 0x4AB6);
            }
        }
        if (class518.method2889(class32.field525, (byte) 0)) {
            class525.field6997.field6162 = 2;
            class46.field663.field6162 = 2;
            class696.field9774.field6162 = 2;
            class46.field665.field6162 = 2;
            class84.field1299.field6162 = 2;
            class602.field7989.field6162 = 2;
            class428.field5868.field6162 = 2;
        }
        if (class518.method2889(arg1, (byte) 0)) {
            class75.field1194 = 1;
            class236.field3324 = 1;
            class687.field9654 = 0;
            class525.field6998 = 0;
            class558.field7405 = 0;
            class148.method1065(arg0 ^ 0x4AD5, true);
            class525.field6997.field6162 = 1;
            class46.field663.field6162 = 1;
            class696.field9774.field6162 = 1;
            class46.field665.field6162 = 1;
            class84.field1299.field6162 = 1;
            class602.field7989.field6162 = 1;
            class428.field5868.field6162 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class27.method232((byte) 0);
        }
        boolean var2 = arg1 == 2 || class445.method2509(-7, arg1) || client.method1691(false, arg1);
        boolean var3 = class32.field525 == 2 || class445.method2509(-7, class32.field525) || client.method1691(false, class32.field525);
        if (var2 != var3) {
            if (var2) {
                class416.field5694 = class403.field5384;
                if (class344.field4718.field5417 == 0) {
                    class603.method3323((byte) -115, 2);
                } else {
                    class419.method2395(class344.field4718.field5417, 63, 2, class403.field5384, class603.field8016, false, 0);
                }
                class315.field4343.method791(false, (byte) 15);
            } else {
                class603.method3323((byte) 59, 2);
                class315.field4343.method791(true, (byte) 15);
            }
        }
        if (class518.method2889(arg1, (byte) 0) || arg1 == 13) {
            class10.field197.method76();
        }
        class32.field525 = arg1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static final void method2659(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field6321++;
        int var1 = class204.field2954.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class204.field2954[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class317.field4358; var4++) {
                    if (class376.field5072[var2] == class140.field2258[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class140.field2258[class317.field4358] = class376.field5072[var2];
                    var3 = class317.field4358++;
                }
                class335 var5 = new class335(class204.field2954[var2]);
                int var6 = 0;
                while (class204.field2954[var2].length > var5.field4619 && var6 < 511 && class92.field1396 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2001((byte) -83);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FBE) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class376.field5072[var2] >> 8) * 64 + var10 - class473.field6334;
                    int var13 = (class376.field5072[var2] & 0xFF) * 64 + var11 - class233.field3269;
                    class419 var14 = class239.field3369.method277(var5.method2001((byte) -83), (byte) -52);
                    class280 var15 = (class280) class616.field8143.method2918((long) var7, (byte) -19);
                    if (var15 == null && (var14.field5735 & 0x1) > 0 && class669.field9491 == var9 && var12 >= 0 && var14.field5738 + var12 < class34.field530 && var13 >= 0 && class34.field531 > (var14.field5738 + var13)) {
                        class287 var16 = new class287();
                        var16.field5633 = var7;
                        class280 var17 = new class280(var16);
                        class616.field8143.method2911((long) var7, var17, (byte) -28);
                        class51.field718[class176.field2705++] = var17;
                        class415.field5681[class92.field1396++] = var7;
                        var16.field5595 = class642.field8626;
                        var16.method1777((byte) -49, var14);
                        var16.method2354(-90, var16.field4052.field5738);
                        var16.field5614 = var16.field4052.field5796 << 3;
                        var16.method2359(var16.field4052.field5772 + 4 << 11 & 0x3F11, (byte) -126, true);
                        var16.method1768(var16.method2317((byte) 40), -99, var9, var12, true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Leh;IB)V")
    private final void method2660(class335 arg0, int arg1, byte arg2) {
        if (arg2 > -36) {
            return;
        }
        field6317++;
        if (arg1 == 1) {
            this.field6320 = arg0.method2029((byte) -67);
        } else if (arg1 == 2) {
            int var7 = arg0.method2034(255);
            this.field6323 = new int[var7];
            this.field6316 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6323[var8] = arg0.method2001((byte) -83);
                byte var9 = arg0.method2040(-91);
                this.field6316[var8] = var9 == 0 ? 0 : class697.method3859(var9, false);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2034(255);
            this.field6325 = new int[var4];
            this.field6328 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6325[var5] = arg0.method2001((byte) -83);
                byte var6 = arg0.method2040(-69);
                this.field6328[var5] = var6 == 0 ? 0 : class697.method3859(var6, false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(II)I")
    public static final int method2661(int arg0, int arg1) {
        if (arg1 == 255) {
            field6318++;
            return arg0 & 0xFF;
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(CB)I")
    public final int method2662(char arg0, byte arg1) {
        field6319++;
        if (this.field6325 == null) {
            return -1;
        } else if (arg1 == 120) {
            for (int var3 = 0; var3 < this.field6325.length; var3++) {
                if (this.field6328[var3] == arg0) {
                    return this.field6325[var3];
                }
            }
            return -1;
        } else {
            return -38;
        }
    }
}
