import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class121 extends class62 {

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[I")
    public static int[] field2038 = new int[128];

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Leg;")
    public static class37 field2044 = class174.method1167("Mem:", -92);

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[Lrk;")
    public static class14[] field2041;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public static final void method853(int arg0, int arg1) {
        field2042++;
        class100 var2 = (class100) class166.field2750.method992((byte) 125, (long) arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 != 3) {
            method858(33, 79, (class237) null);
        }
        for (int var3 = 0; var3 < var2.field1552.length; var3++) {
            var2.field1552[var3] = -1;
            var2.field1553[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class96.field1507 >= arg1 && arg5 >= class286.field5050) {
            boolean var6;
            if (arg3 < class178.field2972) {
                arg3 = class178.field2972;
                var6 = false;
            } else if (arg3 <= class217.field3741) {
                var6 = true;
            } else {
                var6 = false;
                arg3 = class217.field3741;
            }
            boolean var7;
            if (class178.field2972 > arg0) {
                arg0 = class178.field2972;
                var7 = false;
            } else if (class217.field3741 < arg0) {
                arg0 = class217.field3741;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class286.field5050 > arg1) {
                arg1 = class286.field5050;
            } else {
                class145.method1010(arg0, arg3, -25086, arg2, class210.field3617[arg1++]);
            }
            if (class96.field1507 < arg5) {
                arg5 = class96.field1507;
            } else {
                class145.method1010(arg0, arg3, -25086, arg2, class210.field3617[arg5--]);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    int[] var9 = class210.field3617[var8];
                    var9[arg3] = var9[arg0] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg1; var11 <= arg5; var11++) {
                    class210.field3617[var11][arg3] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg1; var10 <= arg5; var10++) {
                    class210.field3617[var10][arg0] = arg2;
                }
            }
        }
        field2043++;
        int var12 = -32 % ((arg4 + 27) / 61);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljl;B)V")
    public static final void method855(class101 arg0, byte arg1) {
        class96.field1497 = class234.method1610(class132.field2217, 0, arg0, 10);
        field2036++;
        class288.field5080 = new class14[class96.field1497.length];
        class182.field3043 = new class14[class96.field1497.length];
        class104.field1621 = new class14[class96.field1497.length];
        for (int var2 = 0; var2 < class96.field1497.length; var2++) {
            class96.field1497[var2].method108();
            class288.field5080[var2] = class96.field1497[var2].method102();
            class96.field1497[var2].method108();
            class182.field3043[var2] = class96.field1497[var2].method102();
            class96.field1497[var2].method108();
            class104.field1621[var2] = class96.field1497[var2].method102();
            class96.field1497[var2].method108();
        }
        class139.field2370 = class69.method475(class275.field4859, 1024, arg0, 0);
        class200.field3395 = class69.method474(class67.field1062, arg0, -4, 0);
        class153.field2563 = class69.method474(class124.field2084, arg0, -4, 0);
        class178.field2965 = class69.method474(class282.field4985, arg0, -4, 0);
        class197.field3353 = class69.method474(class291.field5127, arg0, arg1 + 97, 0);
        class89.field1425 = class81.method548(arg1 + 104, class126.field2122, 0, arg0);
        class107.field1671 = class81.method548(3, class260.field4606, 0, arg0);
        class58.field931 = class115.method820(arg0, arg1 + 3922, 0, class84.field1323);
        class120.field2025 = class81.method548(3, class129.field2146, 0, arg0);
        class277.field4911 = class81.method548(3, class284.field5016, 0, arg0);
        class254.field4520 = class190.method1314((byte) -53, arg0, 0, class232.field4002);
        class165.field2748 = class190.method1314((byte) -53, arg0, 0, class267.field4670);
        class92.field1431.method1218(class165.field2748, (int[]) null);
        class109.field1810.method1218(class165.field2748, (int[]) null);
        class180.field3002.method1218(class165.field2748, (int[]) null);
        class195 var3 = class263.method1780(class29.field428, (byte) -51, 0, arg0);
        if (arg1 != -101) {
            return;
        }
        var3.method1359();
        class45.field710 = var3;
        class195[] var4 = class69.method475(class94.field1480, 1024, arg0, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1359();
        }
        class167.field2776 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class139.field2370.length; var10++) {
            class139.field2370[var10].method1351(var6 + var9, var8 + var9, var7 + var9);
        }
        class96.field1497[0].method107(var6 + var9, var8 + var9, var7 + var9);
        class171.field2878 = class139.field2370;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
    public class121(int arg0, int arg1) {
        this.field2039 = arg0;
        this.field2035 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILpe;)V")
    public static final void method856(int arg0, class237 arg1) {
        field2046++;
        if (class28.field404 == arg1.field4108) {
            class154.field2597[arg1.field4156] = true;
        }
        if (arg0 != 24665) {
            field2041 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method857(int arg0) {
        field2044 = null;
        if (arg0 != -9) {
            method853(49, -41);
        }
        field2038 = null;
        field2041 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILpe;)I")
    public static final int method858(int arg0, int arg1, class237 arg2) {
        field2040++;
        if (arg2.field4154 == null || arg0 >= arg2.field4154.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field4154[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class158.field2628[var3[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class264.field4640[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class148.field2508[var3[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class237 var12 = class156.method1066(-116, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class9.method52(true, var13).field4350 || class146.field2483)) {
                        for (int var14 = 0; var14 < var12.field4094.length; var14++) {
                            if (var13 + 1 == var12.field4094[var14]) {
                                var9 += var12.field4123[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class153.field2571[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class123.field2065[class264.field4640[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class153.field2571[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class82.field1285.field3241;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class222.field3817[var15]) {
                            var9 += class264.field4640[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class237 var18 = class156.method1066(-118, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class9.method52(true, var19).field4350 || class146.field2483)) {
                        for (int var20 = 0; var20 < var18.field4094.length; var20++) {
                            if (var19 + 1 == var18.field4094[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class243.field4370;
                }
                if (var7 == 12) {
                    var9 = class230.field3943;
                }
                if (var7 == 13) {
                    int var21 = class153.field2571[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class83.method556(1522, var23);
                }
                if (var7 == 18) {
                    var9 = (class82.field1285.field1799 >> 7) + class40.field642;
                }
                if (var7 == 19) {
                    var9 = (class82.field1285.field1793 >> 7) + class144.field2456;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            if (arg1 > -14) {
                method856(-60, (class237) null);
            }
            return -1;
        }
    }
}
