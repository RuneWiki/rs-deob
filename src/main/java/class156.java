import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class156 extends class271 {

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "Lwa;")
    public static class75 field2666 = class66.method560("Benutzen", false);

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Z")
    public static boolean field2682 = false;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Lwa;")
    public static class75 field2681 = class66.method560("Welt", false);

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "Lcb;")
    public static class267 field2668;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "Lwa;")
    public class75 field2685;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "[Z")
    public static boolean[] field2673;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[[[I")
    public static int[][][] field2669;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I", line = 16)
    public final int method1180(byte arg0) {
        int var2 = 21 / ((-arg0 - 23) / 43);
        field2672++;
        return (int) this.field3488;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 25)
    public static void method1181(byte arg0) {
        field2669 = (int[][][]) null;
        int var1 = 62 / ((arg0 - 33) / 35);
        field2668 = null;
        field2681 = null;
        field2673 = null;
        field2666 = null;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)I", line = 46)
    public final int method1182(int arg0) {
        if (arg0 != -892555168) {
            this.method1180((byte) -45);
        }
        field2677++;
        return (int) (this.field3488 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 66)
    public final void method1183(boolean arg0) {
        this.field4682 |= Long.MIN_VALUE;
        if (this.method1185(1) == 0L) {
            class217.field3712.method854(arg0, this);
        }
        if (!arg0) {
            field2668 = (class267) null;
        }
        field2676++;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V", line = 81)
    public final void method1184(byte arg0) {
        field2667++;
        if (arg0 != 87) {
            method1181((byte) -92);
        }
        this.field4682 = this.field4682 & Long.MIN_VALUE | class78.method669(2047) + 500L;
        class7.field96.method854(true, this);
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)J", line = 94)
    public final long method1185(int arg0) {
        field2684++;
        if (arg0 != 1) {
            method1187(-105, (byte) 72);
        }
        return Long.MAX_VALUE & this.field4682;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[Lre;)V", line = 108)
    public static final void method1186(int arg0, int arg1, class262[] arg2) {
        field2679++;
        if (arg0 < 76) {
            method1188(63);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class262 var4 = arg2[var3];
            if (var4 != null && var4.field4446 == arg1 && (!var4.field4540 || !client.method1737(var4))) {
                if (var4.field4441 == 0) {
                    if (!var4.field4540 && client.method1737(var4) && class61.field1065 != var4) {
                        continue;
                    }
                    method1186(117, var4.field4418, arg2);
                    if (var4.field4532 != null) {
                        method1186(126, var4.field4418, var4.field4532);
                    }
                    class93 var5 = (class93) class73.field1224.method1007((long) var4.field4418, -17004);
                    if (var5 != null) {
                        class153.method1173(var5.field1518, false);
                    }
                }
                if (var4.field4441 == 6) {
                    if (var4.field4447 != -1 || var4.field4493 != -1) {
                        boolean var6 = class133.method1032(var4, 4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4493;
                        } else {
                            var7 = var4.field4447;
                        }
                        if (var7 != -1) {
                            class28 var8 = class302.method2082(var7, 118);
                            if (var8 != null) {
                                var4.field4406 += class250.field4208;
                                while (var8.field361[var4.field4505] < var4.field4406) {
                                    var4.field4406 -= var8.field361[var4.field4505];
                                    var4.field4505++;
                                    if (var4.field4505 >= var8.field368.length) {
                                        var4.field4505 -= var8.field384;
                                        if (var4.field4505 < 0 || var4.field4505 >= var8.field368.length) {
                                            var4.field4505 = 0;
                                        }
                                    }
                                    class291.method2027(var4, 14580);
                                }
                            }
                        }
                    }
                    if (var4.field4436 != 0 && !var4.field4540) {
                        int var9 = var4.field4436 << 16 >> 16;
                        int var10 = class250.field4208 * var9;
                        int var11 = var4.field4436 >> 16;
                        int var12 = class250.field4208 * var11;
                        var4.field4477 = var4.field4477 + var12 & 0x7FF;
                        var4.field4390 = var4.field4390 + var10 & 0x7FF;
                        class291.method2027(var4, 14580);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)V", line = 221)
    public static final void method1187(int arg0, byte arg1) {
        field2670++;
        class181 var2 = new class181(512, 512);
        int[] var3 = var2.field3029;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 4 * 512 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class204.field3459[arg0][var8][var6] & 0x18) == 0) {
                    class233.method1700(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class204.field3459[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class233.method1700(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D)) + 238 - 10;
        if (arg1 != -108) {
            return;
        }
        var2.method1336();
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class204.field3459[arg0][var12][var11] & 0x18) == 0) {
                    class306.method2101(var9, var10, 512, arg0, var12, var11);
                }
                if (arg0 < 3 && (class204.field3459[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class306.method2101(var9, var10, arg1 ^ 0xFFFFFD94, arg0 + 1, var12, var11);
                }
            }
        }
        class267.field4634 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class196.method1463(class67.field1174, var13, var14);
                if (var15 != 0L) {
                    class108 var17 = class3.method14((byte) 83, (int) (var15 >>> 32) & Integer.MAX_VALUE);
                    int var18 = var17.field1855;
                    if (var17.field1812 != null) {
                        for (int var19 = 0; var19 < var17.field1812.length; var19++) {
                            if (var17.field1812[var19] != -1) {
                                class108 var20 = class3.method14((byte) 83, var17.field1812[var19]);
                                if (var20.field1855 >= 0) {
                                    var18 = var20.field1855;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class286.field4931[class67.field1174].field1766;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && (var13 - 3) < var21 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < (var13 + 3) && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var14 - 3 < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var14 + 3 > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class54.field898[class267.field4634] = var17.field1823;
                        class166.field2791[class267.field4634] = var21;
                        class7.field97[class267.field4634] = var22;
                        class267.field4634++;
                    }
                }
            }
        }
        for (int var26 = 0; var26 < var4; var26++) {
            if (var3[var26] == 0) {
                var3[var26] = 1;
            }
        }
        class63.field1098 = new class277(var2);
        class44.field721 = null;
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V", line = 434)
    public static final void method1188(int arg0) {
        class302.field5164 = null;
        field2675++;
        class225.method1655();
        if (arg0 != 3) {
            method1181((byte) -92);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 444)
    public class156(int arg0, int arg1) {
        this.field3488 = (long) arg0 << 32 | (long) arg1;
    }
}
