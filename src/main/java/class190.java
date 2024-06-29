import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class190 {

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lha;")
    public static class46 field3391 = class271.method1828(" steht bereits auf Ihrer Freunde)2Liste(Q", -46);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lwg;")
    public static class22 field3384;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    public static int[] field3387;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[I")
    public static int[] field3393;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public static final void method1374(int arg0, int arg1) {
        field3385++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class147.field2657 += arg0 * 128;
        if (class60.field1006.length < class147.field2657) {
            int var3 = (int) (Math.random() * 12.0D);
            class147.field2657 -= class60.field1006.length;
            class213.method1501(client.field4682[var3], -946146713);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class158.field2808[var4 + var5] - (class60.field1006[class147.field2657 + var4 & class60.field1006.length - 1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class158.field2808[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class158.field2808[var23 + var24] = 255;
                } else {
                    class158.field2808[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg0; var9++) {
            class111.field2099[var9] = class111.field2099[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class111.field2099[var10] = (int) (Math.sin((double) class183.field3284 / 14.0D) * 16.0D + Math.sin((double) class183.field3284 / 15.0D) * 14.0D + Math.sin((double) class183.field3284 / 16.0D) * 12.0D);
            class183.field3284++;
        }
        int var11 = ((class157.field2803 & 0x1) + arg0) / 2;
        class118.field2206 += arg0;
        if (~var11 >= arg1) {
            return;
        }
        for (int var12 = 0; var12 < class118.field2206; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class158.field2808[(var21 << 7) + var22] = 192;
        }
        class118.field2206 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var18 += class158.field2808[var20 + var19 + var11];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class158.field2808[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class215.field3811[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > (var11 + var16)) {
                    var15 += class215.field3811[var11 * 128 + var14 + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class215.field3811[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class158.field2808[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method94(Component arg0, int arg1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public abstract int method95(int arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)I")
    public static final int method1375(int arg0, boolean arg1) {
        field3386++;
        double var2 = (double) ((arg0 & 0xFF1BE0) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFE0) >> 8) / 256.0D;
        double var6 = var2;
        if (var4 > var2) {
            var6 = var4;
        }
        double var8 = var2;
        double var10 = 0.0D;
        if (var4 < var2) {
            var8 = var4;
        }
        double var12 = (double) (arg0 & 0xFF) / 256.0D;
        if (!arg1) {
            return -7;
        }
        if (var12 < var8) {
            var8 = var12;
        }
        if (var6 < var12) {
            var6 = var12;
        }
        double var14 = 0.0D;
        double var16 = (var6 + var8) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var6 != var8) {
            if (var2 == var6) {
                var10 = (var4 - var12) / (var6 - var8);
            } else if (var4 == var6) {
                var10 = (var12 - var2) / (var6 - var8) + 2.0D;
            } else if (var6 == var12) {
                var10 = (var2 - var4) / (var6 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var6 - var8) / (var6 + var8);
            }
            if (var16 >= 0.5D) {
                var14 = (var6 - var8) / (2.0D - var6 - var8);
            }
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var21 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lhi;IB)Lha;")
    public static final class46 method1376(class24 arg0, int arg1, byte arg2) {
        field3389++;
        if (!class199.method1422(arg1, client.method1811(arg0), arg2 + 207) && arg0.field385 == null) {
            return null;
        } else if (arg2 != 48) {
            return null;
        } else if (arg0.field435 == null || arg1 >= arg0.field435.length || arg0.field435[arg1] == null || arg0.field435[arg1].method303(0).method314(119) == 0) {
            return class40.field701 ? class109.method855(arg2 ^ 0x30, new class46[] { class173.field3079, class115.method932(false, arg1) }) : null;
        } else {
            return arg0.field435[arg1];
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3391 = null;
        if (arg0 != 128) {
            field3387 = null;
        }
        field3393 = null;
        field3387 = null;
        field3384 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)Lha;")
    public static final class46 method1378(int arg0, int arg1) {
        field3388++;
        if (arg0 != 0) {
            field3393 = null;
        }
        return class109.method855(arg0, new class46[] { class115.method932(false, arg1 >> 24 & 0xFF), class259.field4518, class115.method932(false, (arg1 & 0xFFFF29) >> 16), class259.field4518, class115.method932(false, (arg1 & 0xFFC8) >> 8), class259.field4518, class115.method932(false, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([Lhi;II)V")
    public static final void method1379(class24[] arg0, int arg1, int arg2) {
        if (arg2 != 1789247784) {
            return;
        }
        field3390++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class24 var4 = arg0[var3];
            if (var4 != null && var4.field440 == arg1 && (!var4.field480 || !client.method1809(var4))) {
                if (var4.field485 == 0) {
                    if (!var4.field480 && client.method1809(var4) && class216.field3831 != var4) {
                        continue;
                    }
                    method1379(arg0, var4.field374, 1789247784);
                    if (var4.field503 != null) {
                        method1379(var4.field503, var4.field374, 1789247784);
                    }
                    class31 var5 = (class31) class93.field1727.method1601(102, (long) var4.field374);
                    if (var5 != null) {
                        class181.method1296(var5.field582, -1);
                    }
                }
                if (var4.field485 == 6) {
                    if (var4.field352 != -1 || var4.field457 != -1) {
                        boolean var6 = class269.method1799(var4, true);
                        int var7;
                        if (var6) {
                            var7 = var4.field457;
                        } else {
                            var7 = var4.field352;
                        }
                        if (var7 != -1) {
                            class170 var8 = class119.method951(arg2 - 1789247784, var7);
                            if (var8 != null) {
                                var4.field419 += class237.field4202;
                                while (var4.field419 > var8.field3040[var4.field434]) {
                                    var4.field419 -= var8.field3040[var4.field434];
                                    var4.field434++;
                                    if (var4.field434 >= var8.field3020.length) {
                                        var4.field434 -= var8.field3047;
                                        if (var4.field434 < 0 || var4.field434 >= var8.field3020.length) {
                                            var4.field434 = 0;
                                        }
                                    }
                                    class226.method1549(false, var4);
                                }
                            }
                        }
                    }
                    if (var4.field418 != 0 && !var4.field480) {
                        int var9 = var4.field418 >> 16;
                        int var10 = class237.field4202 * var9;
                        var4.field373 = var4.field373 + var10 & 0x7FF;
                        int var11 = var4.field418 << 16 >> 16;
                        int var12 = class237.field4202 * var11;
                        var4.field473 = var4.field473 + var12 & 0x7FF;
                        class226.method1549(false, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method1380(byte arg0) {
        field3383++;
        int var1 = class235.field4082.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class235.field4082[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class119.field2229; var4++) {
                    if (class92.field1717[var2] == class109.field2057[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class109.field2057[class119.field2229] = class92.field1717[var2];
                    var3 = class119.field2229++;
                }
                class75 var6 = new class75(class235.field4082[var2]);
                while (class235.field4082[var2].length > var6.field1380 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method545((byte) -89);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (class92.field1717[var2] & 0xFF) * 64 + var9 - class77.field1432;
                    int var12 = (var8 & 0x1FD9) >> 7;
                    int var13 = (class92.field1717[var2] >> 8) * 64 + var12 - class29.field567;
                    class78 var14 = class156.method1152(var6.method545((byte) 55), (byte) -117);
                    if (class2.field29[var7] == null && (var14.field1460 & 0x1) > 0 && class243.field4321 == var10 && var13 >= 0 && var13 + var14.field1440 < 104 && var11 >= 0 && var14.field1440 + var11 < 104) {
                        class2.field29[var7] = new class26();
                        class26 var15 = class2.field29[var7];
                        class33.field612[class51.field888++] = var7;
                        var15.field511 = var14;
                        var15.field2557 = class157.field2803;
                        var15.method1068(true, var15.field511.field1440);
                        var15.field2550 = var15.field511.field1499;
                        var15.field2561 = var15.field511.field1488;
                        var15.field2531 = var15.field511.field1471;
                        var15.field2529 = var15.field511.field1475;
                        var15.field2553 = var15.field511.field1439;
                        var15.field2559 = var15.field511.field1447;
                        var15.field2568 = var15.field511.field1455;
                        var15.field2541 = var15.field511.field1489;
                        if (var15.field2568 == 0) {
                            var15.field2535 = 0;
                        }
                        var15.method1069(var13, var15.method642(69), arg0 ^ 0x5A, var11, true);
                    }
                }
            }
        }
        if (arg0 != 90) {
            field3391 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method93(Component arg0, int arg1);
}
