import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class87 {

    @OriginalMember(owner = "client!km", name = "s", descriptor = "[I")
    private int[] field1490;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    private int[] field1475;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Lsg;")
    private class197 field1483;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Lsg;")
    private class197 field1488;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[Lsg;")
    private class197[] field1478;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Loh;")
    private static class258 field1476 = class153.method1046("Loaded config", 98);

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Loh;")
    public static class258 field1480 = class153.method1046(":chalreq:", 114);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Loh;")
    public static class258 field1479 = class153.method1046("leuchten1:", 122);

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Loh;")
    public static class258 field1489 = field1476;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "J")
    public static long field1486 = 0L;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lmi;")
    public static class12 field1484 = new class12();

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Ls;")
    public static class171 field1482;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Z")
    public static boolean field1474;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V", line = 31)
    public static final void method623(int arg0, int arg1) {
        field1477++;
        class41 var2;
        if (class257.field4390 || class139.field2368 == null) {
            var2 = new class41(512, 512);
        } else {
            var2 = (class41) class139.field2368;
        }
        int[] var3 = var2.field573;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        if (arg0 != 9048) {
            method623(-14, 101);
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 4 * 512 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class94.field1653[arg1][var8][var6] & 0x18) == 0) {
                    class172.method1160(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class94.field1653[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class172.method1160(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        int var9 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var10 = (int) (Math.random() * 20.0D) + 238 - (10 - ((((int) (Math.random() * 20.0D) - 10) + 238 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16)));
        var2.method333();
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class94.field1653[arg1][var12][var11] & 0x18) == 0) {
                    class125.method916(var10, var9, arg1, var11, var12, 24);
                }
                if (arg1 < 3 && (class94.field1653[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class125.method916(var10, var9, arg1 + 1, var11, var12, 24);
                }
            }
        }
        class88.field1493 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class293.method2055(class272.field4704, var13, var14);
                if (var15 != 0L) {
                    class101 var17 = class123.method898(arg0 - 9983, (int) (var15 >>> 32) & Integer.MAX_VALUE);
                    int var18 = var17.field1848;
                    if (var17.field1797 != null) {
                        for (int var19 = 0; var19 < var17.field1797.length; var19++) {
                            if (var17.field1797[var19] != -1) {
                                class101 var20 = class123.method898(-935, var17.field1797[var19]);
                                if (var20.field1848 >= 0) {
                                    var18 = var20.field1848;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class243.field4216[class272.field4704].field4255;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > var13 - 3 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && (var13 + 3) > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var14 - 3 < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && (var14 + 3) > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class103.field1879[class88.field1493] = var17.field1801;
                        class228.field3948[class88.field1493] = var21;
                        class294.field5052[class88.field1493] = var22;
                        class88.field1493++;
                    }
                }
            }
        }
        if (class257.field4390) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class139.field2368 = new class221(var2);
        } else {
            class139.field2368 = var2;
        }
        if (class257.field4390) {
            class211.field3640 = null;
        } else {
            class83.field1407.method1836(6932);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lgb;DILu;ZZIB)[I", line = 238)
    public final int[] method624(class213 arg0, double arg1, int arg2, class24 arg3, boolean arg4, boolean arg5, int arg6, byte arg7) {
        field1485++;
        class92.method688(arg1, 110);
        class114.field2034 = arg0;
        class265.field4627 = arg3;
        class301.method2115(arg2, arg6, (byte) 75);
        int[] var10 = new int[arg2 * arg6];
        if (arg7 > -91) {
            this.field1475 = (int[]) null;
        }
        for (int var11 = 0; var11 < this.field1478.length; var11++) {
            this.field1478[var11].method1325(arg2, 4987, arg6);
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var13 = -1;
            var14 = arg2 - 1;
        } else {
            var12 = arg2;
            var14 = 0;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg5) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1483.field3462) {
                int[] var21 = this.field1483.method96(-16221, var16);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1483.method101(var16, (byte) 125);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var14; var22 != var12; var22 += var13) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class188.field3331[var23];
                int var25 = var18[var22] >> 4;
                int var26 = var20[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class188.field3331[var26];
                int var28 = class188.field3331[var25];
                var10[var15++] = (var24 << 16) + (var28 << 8) + var27;
                if (arg5) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1478.length; var29++) {
            this.field1478[var29].method529((byte) 112);
        }
        return var10;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lgb;ILu;)Z", line = 396)
    public final boolean method625(class213 arg0, int arg1, class24 arg2) {
        field1472++;
        if (arg1 >= -94) {
            method626((class219) null);
        }
        for (int var4 = 0; var4 < this.field1475.length; var4++) {
            if (!arg0.method1433((byte) -118, this.field1475[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field1490.length; var5++) {
            if (!arg2.method190(this.field1490[var5], -4527)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lfb;)V", line = 433)
    public static final void method626(class219 arg0) {
        for (int var1 = arg0.field3793; var1 <= arg0.field3785; var1++) {
            for (int var2 = arg0.field3797; var2 <= arg0.field3789; var2++) {
                class228 var3 = class178.field3180[arg0.field3804][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3950; var4++) {
                        if (var3.field3932[var4] == arg0) {
                            var3.field3950--;
                            for (int var5 = var4; var5 < var3.field3950; var5++) {
                                var3.field3932[var5] = var3.field3932[var5 + 1];
                                var3.field3926[var5] = var3.field3926[var5 + 1];
                            }
                            var3.field3932[var3.field3950] = null;
                            break;
                        }
                    }
                    var3.field3922 = 0;
                    for (int var6 = 0; var6 < var3.field3950; var6++) {
                        var3.field3922 |= var3.field3926[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 492)
    public static void method627(byte arg0) {
        field1482 = null;
        field1479 = null;
        field1484 = null;
        if (arg0 != -85) {
            field1482 = (class171) null;
        }
        field1480 = null;
        field1476 = null;
        field1489 = null;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 521)
    public class87() {
        this.field1490 = new int[0];
        this.field1475 = new int[0];
        this.field1483 = new class301();
        this.field1483.field3454 = 1;
        this.field1488 = new class301();
        this.field1488.field3454 = 1;
        this.field1478 = new class197[] { this.field1483, this.field1488 };
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lgb;DIIIZLu;)[B", line = 536)
    public final byte[] method628(class213 arg0, double arg1, int arg2, int arg3, int arg4, boolean arg5, class24 arg6) {
        class92.method688(arg1, 116);
        class265.field4627 = arg6;
        class114.field2034 = arg0;
        byte[] var9 = new byte[arg4 * 4 * arg3];
        class301.method2115(arg3, arg4, (byte) 62);
        if (arg2 != 24629) {
            this.field1475 = (int[]) null;
        }
        for (int var10 = 0; var10 < this.field1478.length; var10++) {
            this.field1478[var10].method1325(arg3, arg2 - 19642, arg4);
        }
        field1487++;
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1483.field3462) {
                int[] var13 = this.field1483.method96(-16221, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1483.method101(var12, (byte) -81);
                var14 = var17[1];
                var15 = var17[0];
                var16 = var17[2];
            }
            int[] var18;
            if (this.field1488.field3462) {
                var18 = this.field1488.method96(-16221, var12);
            } else {
                var18 = this.field1488.method101(var12, (byte) 73)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class188.field3331[var20];
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class188.field3331[var22];
                int var24 = var16[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class188.field3331[var24];
                int var26;
                if (var21 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var21;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg5) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1478.length; var27++) {
            this.field1478[var27].method529((byte) 119);
        }
        return var9;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lva;)V", line = 680)
    public class87(class235 arg0) {
        int var2 = arg0.method1589(67);
        int var3 = 0;
        this.field1478 = new class197[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class197 var7 = class148.method1019(256, arg0);
            if (var7.method603((byte) -25) >= 0) {
                var3++;
            }
            if (var7.method527((byte) -103) >= 0) {
                var4++;
            }
            int var8 = var7.field3468.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1589(126);
            }
            this.field1478[var6] = var7;
        }
        this.field1490 = new int[var4];
        int var10 = 0;
        this.field1475 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class197 var13 = this.field1478[var12];
            int var14 = var13.field3468.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3468[var15] = this.field1478[var5[var12][var15]];
            }
            int var16 = var13.method603((byte) -25);
            int var17 = var13.method527((byte) -100);
            if (var16 > 0) {
                this.field1475[var11++] = var16;
            }
            if (var17 > 0) {
                this.field1490[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field1483 = this.field1478[arg0.method1589(120)];
        this.field1488 = this.field1478[arg0.method1589(91)];
    }
}
