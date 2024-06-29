import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class58 {

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    private int field903 = 65000;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Luj;")
    private class157 field909 = null;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Luj;")
    private class157 field906 = null;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lce;")
    private static class126 field913 = class206.method1445(-7923, "M");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lce;")
    public static class126 field902 = field913;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lce;")
    public static class126 field910 = field913;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lwd;")
    public static class112 field898;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[Lwd;")
    public static class112[] field908;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZI[B)Z", line = 5)
    private final boolean method396(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field901++;
        class157 var6 = this.field909;
        synchronized (this.field909) {
            try {
                int var7;
                boolean var10000;
                if (arg2) {
                    if (((long) (arg3 * 6 + 6)) > this.field906.method1153(3783)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field906.method1151((long) (arg3 * 6), 0);
                    this.field906.method1150(21153, 0, class55.field827, 6);
                    var7 = (class55.field827[4] & 0xFF << 8) + (((class55.field827[3] & 0xFF) << 16) + (class55.field827[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field909.method1153(arg0 ^ 0xFFFFF330) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field909.method1153(3783) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class55.field827[5] = (byte) var7;
                class55.field827[0] = (byte) (arg1 >> 16);
                class55.field827[4] = (byte) (var7 >> 8);
                class55.field827[2] = (byte) arg1;
                class55.field827[1] = (byte) (arg1 >> 8);
                class55.field827[3] = (byte) (var7 >> 16);
                int var8 = 0;
                int var9 = 0;
                this.field906.method1151((long) (arg3 * 6), 0);
                if (arg0 != -521) {
                    this.field906 = (class157) null;
                }
                this.field906.method1148(class55.field827, -128, 0, 6);
                while (true) {
                    if (var8 < arg1) {
                        label142: {
                            int var10 = 0;
                            if (arg2) {
                                this.field909.method1151((long) (var7 * 520), 0);
                                try {
                                    this.field909.method1150(21153, 0, class55.field827, 8);
                                } catch (EOFException var18) {
                                    break label142;
                                }
                                var10 = (class55.field827[6] & 0xFF) + ((class55.field827[4] & 0xFF) << 16) + (class55.field827[5] & 0xFF << 8);
                                int var12 = ((class55.field827[0] & 0xFF) << 8) + (class55.field827[1] & 0xFF);
                                int var13 = ((class55.field827[2] & 0xFF) << 8) + (class55.field827[3] & 0xFF);
                                int var14 = class55.field827[7] & 0xFF;
                                if (arg3 != var12 || var9 != var13 || this.field904 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field909.method1153(3783) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field909.method1153(3783) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg2 = false;
                            }
                            if ((arg1 - var8) <= 512) {
                                var10 = 0;
                            }
                            class55.field827[6] = (byte) var10;
                            class55.field827[7] = (byte) this.field904;
                            class55.field827[3] = (byte) var9;
                            class55.field827[4] = (byte) (var10 >> 16);
                            class55.field827[0] = (byte) (arg3 >> 8);
                            class55.field827[1] = (byte) arg3;
                            class55.field827[2] = (byte) (var9 >> 8);
                            class55.field827[5] = (byte) (var10 >> 8);
                            var9++;
                            this.field909.method1151((long) (var7 * 520), 0);
                            this.field909.method1148(class55.field827, -128, 0, 8);
                            var7 = var10;
                            int var15 = arg1 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            this.field909.method1148(arg4, -128, var8, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 132)
    public static final void method397(int arg0) {
        field905++;
        int var1 = class105.field1657;
        if (arg0 > -122) {
            method399(45, 23, -103);
        }
        int var2 = class228.field3850;
        int var3 = class301.field5009;
        int var4 = class17.field236;
        if (class78.field1271 == null || class241.field4063 == null) {
            if (class127.field2170.method2166(-28257, class313.field5341) && class127.field2170.method2166(-28257, class285.field4728)) {
                class78.field1271 = class214.method1483(-5048, class313.field5341, class127.field2170, 0);
                class241.field4063 = class214.method1483(-5048, class285.field4728, class127.field2170, 0);
                if (class56.field846) {
                    if ((class78.field1271 instanceof class311)) {
                        class78.field1271 = new class6((class184) class78.field1271);
                    } else {
                        class78.field1271 = new class198((class184) class78.field1271);
                    }
                    if ((class241.field4063 instanceof class311)) {
                        class241.field4063 = new class6((class184) class241.field4063);
                    } else {
                        class241.field4063 = new class198((class184) class241.field4063);
                    }
                }
            } else if (class56.field846) {
                class101.method695(var1, var2, var3, 20, class74.field1199, 256 - class31.field428);
            } else {
                class276.method1853(var1, var2, var3, 20, class74.field1199, 256 - class31.field428);
            }
        }
        if (class78.field1271 != null && class241.field4063 != null) {
            int var5 = var3 / class78.field1271.field4595;
            for (int var6 = 0; var6 < var5; var6++) {
                class78.field1271.method1333(class78.field1271.field4595 * var6 + var1, var2);
            }
            class241.field4063.method1333(var1, var2);
            class241.field4063.method1313(var1 + var3 - class241.field4063.field4595, var2);
        }
        class200.field3414.method2135(class166.field2961, var1 + 3, var2 + 14, class24.field341, -1);
        if (class56.field846) {
            class101.method695(var1, var2 + 20, var3, var4 - 20, class74.field1199, 256 - class31.field428);
        } else {
            class276.method1853(var1, var2 + 20, var3, var4 - 20, class74.field1199, 256 - class31.field428);
        }
        int var7 = class260.field4366;
        int var8 = class138.field2493;
        for (int var9 = 0; var9 < class173.field3067; var9++) {
            int var10 = (class173.field3067 - var9 - 1) * 15 + var2 + 35;
            if (var1 < var8 && var8 < var1 + var3 && (var10 - 13) < var7 && var10 + 3 > var7) {
                if (class56.field846) {
                    class101.method695(var1, var10 - 13, var3, 16, class264.field4413, 256 - class192.field3284);
                } else {
                    class276.method1853(var1, var10 - 13, var3, 16, class264.field4413, 256 - class192.field3284);
                }
            }
        }
        if ((class131.field2244 == null || class186.field3225 == null || class41.field652 == null) && class127.field2170.method2166(-28257, class182.field3179) && class127.field2170.method2166(-28257, class138.field2470) && class127.field2170.method2166(-28257, class100.field1625)) {
            class131.field2244 = class214.method1483(-5048, class182.field3179, class127.field2170, 0);
            class186.field3225 = class214.method1483(-5048, class138.field2470, class127.field2170, 0);
            class41.field652 = class214.method1483(-5048, class100.field1625, class127.field2170, 0);
            if (class56.field846) {
                if (class131.field2244 instanceof class311) {
                    class131.field2244 = new class6((class184) class131.field2244);
                } else {
                    class131.field2244 = new class198((class184) class131.field2244);
                }
                if (class186.field3225 instanceof class311) {
                    class186.field3225 = new class6((class184) class186.field3225);
                } else {
                    class186.field3225 = new class198((class184) class186.field3225);
                }
                if ((class41.field652 instanceof class311)) {
                    class41.field652 = new class6((class184) class41.field652);
                } else {
                    class41.field652 = new class198((class184) class41.field652);
                }
            }
        }
        if (class131.field2244 != null && class186.field3225 != null && class41.field652 != null) {
            int var11 = var3 / class131.field2244.field4595;
            for (int var12 = 0; var12 < var11; var12++) {
                class131.field2244.method1333(class131.field2244.field4595 * var12 + var1, var2 - -var4 + -class131.field2244.field4601);
            }
            int var13 = (var4 - 20) / class186.field3225.field4601;
            for (int var14 = 0; var14 < var13; var14++) {
                class186.field3225.method1333(var1, class186.field3225.field4601 * var14 + var2 + 20);
                class186.field3225.method1313(var1 + var3 - class186.field3225.field4595, var2 + 20 - -(class186.field3225.field4601 * var14));
            }
            class41.field652.method1333(var1, var2 + var4 - class41.field652.field4601);
            class41.field652.method1313(var1 - (class41.field652.field4595 - var3), var2 + var4 + -class41.field652.field4601);
        }
        for (int var15 = 0; var15 < class173.field3067; var15++) {
            int var16 = (class173.field3067 - var15 - 1) * 15 + var2 + 35;
            int var17 = class24.field341;
            if (var1 < var8 && (var1 + var3) > var8 && var7 > (var16 - 13) && var16 + 3 > var7) {
                var17 = class102.field1642;
            }
            class200.field3414.method2135(class202.method1426(22247, var15), var1 + 3, var16, var17, 0);
        }
        class182.method1307(class228.field3850, class105.field1657, class301.field5009, 127, class17.field236);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIII)V", line = 311)
    public static final void method398(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field907++;
        class167.field2970++;
        if (!arg0) {
            class227.method1544(true, 25);
            class116.method759(false, true);
            class227.method1544(false, arg1 ^ 0xFFFF92B8);
        }
        class116.method759(false, false);
        if (!arg0) {
            class245.method1685((byte) -58);
        }
        class175.method1270(-1);
        if (class56.field846) {
            class46.method283((byte) 126, arg5, arg4, arg2, true, arg3);
            arg3 = class212.field3614;
            arg4 = class255.field4291;
            arg2 = class157.field2823;
            arg5 = class292.field4837;
        }
        if (class254.field4261 == 1) {
            int var6 = class292.field4832;
            if (var6 < (class195.field3353 / 256)) {
                var6 = class195.field3353 / 256;
            }
            if (class195.field3355[4] && var6 < (class242.field4106[4] + 128)) {
                var6 = class242.field4106[4] + 128;
            }
            int var7 = class189.field3247 + class144.field2618 & 0x7FF;
            class117.method769(class119.field1999, var6, (byte) 37, class174.method1265(class286.field4744.field2487, 8100, class131.field2250, class286.field4744.field2461) - 50, arg4, var7, var6 * 3 + 600, class317.field5430);
        }
        int var8 = class152.field2780;
        int var9 = class143.field2600;
        int var10 = class223.field3755;
        int var11 = class29.field404;
        int var12 = class102.field1640;
        if (arg1 != -27913) {
            return;
        }
        for (int var13 = 0; var13 < 5; var13++) {
            if (class195.field3355[var13]) {
                int var14 = (int) ((double) (-class207.field3543[var13]) + (double) (class207.field3543[var13] * 2 + 1) * Math.random() + Math.sin((double) class315.field5419[var13] / 100.0D * (double) class106.field1670[var13]) * (double) class242.field4106[var13]);
                if (var13 == 4) {
                    class102.field1640 += var14;
                    if (class102.field1640 < 128) {
                        class102.field1640 = 128;
                    }
                    if (class102.field1640 > 383) {
                        class102.field1640 = 383;
                    }
                }
                if (var13 == 2) {
                    class223.field3755 += var14;
                }
                if (var13 == 0) {
                    class152.field2780 += var14;
                }
                if (var13 == 3) {
                    class29.field404 = class29.field404 + var14 & 0x7FF;
                }
                if (var13 == 1) {
                    class143.field2600 += var14;
                }
            }
        }
        class37.method201((byte) -102);
        if (class56.field846) {
            class101.method687(arg3, arg5, arg3 + arg2, arg4 + arg5);
            float var15 = (float) class29.field404 * 0.17578125F;
            float var16 = (float) class102.field1640 * 0.17578125F;
            if (class254.field4261 == 3) {
                var15 = class74.field1194 * 360.0F / 6.2831855F;
                var16 = class259.field4350 * 360.0F / 6.2831855F;
            }
            class56.method359(arg3, arg5, arg2, arg4, arg2 / 2 + arg3, arg4 / 2 + arg5, var16, var15, class24.field350, class24.field350);
        } else {
            class276.method1862(arg3, arg5, arg2 + arg3, arg4 + arg5);
            class236.method1619();
        }
        if (class51.field783 || class322.field5496 < arg3 || (arg2 + arg3) <= class322.field5496 || arg5 > class128.field2198 || arg4 + arg5 <= class128.field2198) {
            class70.field1147 = false;
            class1.field8 = 0;
        } else {
            class1.field8 = 0;
            class70.field1147 = true;
            int var17 = class265.field4492;
            int var18 = field915;
            class85.field1355 = (var18 - var17) * (class322.field5496 - arg3) / arg2 + var17;
            int var19 = class87.field1370;
            int var20 = class269.field4551;
            class5.field56 = (class128.field2198 - arg5) * (var20 - var19) / arg4 + var19;
        }
        class181.method1294(true);
        byte var21 = class114.method755(2) == 2 ? (byte) class167.field2970 : 1;
        if (class56.field846) {
            boolean var22 = false;
            class56.method368();
            class56.method369(true);
            class56.method361(true);
            int var23;
            if (class280.field4662 == 10) {
                var23 = class73.method528(class303.field5038, true, class152.field2780 >> 10, class287.field4776, class223.field3755 >> 10);
            } else {
                var23 = class73.method528(class303.field5038, true, class286.field4744.field2460[0] >> 3, class287.field4776, class286.field4744.field2471[0] >> 3);
            }
            class256.method1733(class249.field4174, !class74.field1200);
            class56.method352(var23);
            class159.method1170(class223.field3755, class143.field2600, class102.field1640, class29.field404, 48, class152.field2780);
            class56.field871 = class249.field4174;
            class52.method330(class152.field2780, class143.field2600, class223.field3755, class102.field1640, class29.field404, class214.field3639, class174.field3073, class305.field5127, class253.field4253, class300.field4973, class22.field310, class131.field2250 + 1, var21, class286.field4744.field2461 >> 7, class286.field4744.field2487 >> 7);
            class59.field923 = true;
            class256.method1731();
            class159.method1170(0, 0, 0, 0, 48, 0);
            class181.method1294(true);
            class174.method1267();
            class14.method81(arg5, (byte) 103, arg4, class24.field350, class24.field350, arg3, arg2);
            class129.method903(arg5, class24.field350, arg2, arg1 + 27931, arg3, arg4, class24.field350);
        } else {
            class276.method1844(arg3, arg5, arg2, arg4, 0);
            class52.method330(class152.field2780, class143.field2600, class223.field3755, class102.field1640, class29.field404, class214.field3639, class174.field3073, class305.field5127, class253.field4253, class300.field4973, class22.field310, class131.field2250 + 1, var21, class286.field4744.field2461 >> 7, class286.field4744.field2487 >> 7);
            class181.method1294(true);
            class174.method1267();
            class14.method81(arg5, (byte) 103, arg4, 256, 256, arg3, arg2);
            class129.method903(arg5, 256, arg2, -73, arg3, arg4, 256);
        }
        ((class232) class236.field3987).method1583((byte) -114, class303.field5038);
        class283.method1890(arg2, arg3, 56, arg4, arg5);
        class29.field404 = var11;
        class102.field1640 = var12;
        class152.field2780 = var8;
        class143.field2600 = var9;
        class223.field3755 = var10;
        if (class81.field1315 && class200.field3405.method459(true) == 0) {
            class81.field1315 = false;
        }
        if (class81.field1315) {
            if (class56.field846) {
                class101.method689(arg3, arg5, arg2, arg4, 0);
            } else {
                class276.method1844(arg3, arg5, arg2, arg4, 0);
            }
            class250.method1693(false, class302.field5036, true);
        }
        if (!arg0 && !class81.field1315 && !class51.field783 && class322.field5496 >= arg3 && (arg2 + arg3) > class322.field5496 && class128.field2198 >= arg5 && (arg4 + arg5) > class128.field2198) {
            class242.method1669(class322.field5496, class128.field2198, arg4, arg3, (byte) -101, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lce;", line = 524)
    public static final class126 method399(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field912++;
        if (var3 < -9) {
            return class17.field230;
        }
        if (arg0 != 14609) {
            method401(0);
        }
        if (var3 < -6) {
            return class313.field5357;
        } else if (var3 < -3) {
            return class68.field1127;
        } else if (var3 < 0) {
            return class14.field194;
        } else if (var3 > 9) {
            return class21.field281;
        } else if (var3 > 6) {
            return class27.field385;
        } else if (var3 > 3) {
            return class114.field1934;
        } else if (var3 > 0) {
            return class85.field1358;
        } else {
            return class305.field5129;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(ILuj;Luj;I)V", line = 727)
    public class58(int arg0, class157 arg1, class157 arg2, int arg3) {
        this.field909 = arg1;
        this.field906 = arg2;
        this.field903 = arg3;
        this.field904 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[B)Z", line = 575)
    public final boolean method400(int arg0, int arg1, int arg2, byte[] arg3) {
        field897++;
        class157 var5 = this.field909;
        synchronized (this.field909) {
            if (arg2 < 0 || arg2 > this.field903) {
                throw new IllegalArgumentException();
            } else if (arg1 == -4) {
                boolean var6 = this.method396(-521, arg2, true, arg0, arg3);
                if (!var6) {
                    var6 = this.method396(-521, arg2, false, arg0, arg3);
                }
                return var6;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 600)
    public static void method401(int arg0) {
        field902 = null;
        if (arg0 == 65280) {
            field913 = null;
            field898 = null;
            field910 = null;
            field908 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[B", line = 625)
    public final byte[] method402(int arg0, int arg1) {
        field916++;
        class157 var3 = this.field909;
        synchronized (this.field909) {
            try {
                Object var10000;
                if (this.field906.method1153(3783) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field906.method1151((long) (arg1 * 6), 0);
                int var4 = -10 / ((-arg0 - 1) / 62);
                this.field906.method1150(21153, 0, class55.field827, 6);
                int var5 = (class55.field827[1] & 0xFF << 8) + (class55.field827[0] & 0xFF << 16) + (class55.field827[2] & 0xFF);
                int var6 = (class55.field827[4] & 0xFF << 8) + ((class55.field827[3] & 0xFF) << 16) + (class55.field827[5] & 0xFF);
                if (var5 < 0 || var5 > this.field903) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var6 <= 0 || (this.field909.method1153(3783) / 520L) < ((long) var6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var7 = 0;
                    int var8 = 0;
                    byte[] var9 = new byte[var5];
                    while (var7 < var5) {
                        if (var6 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field909.method1151((long) (var6 * 520), 0);
                        int var10 = var5 - var7;
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field909.method1150(21153, 0, class55.field827, var10 + 8);
                        int var11 = ((class55.field827[0] & 0xFF) << 8) + (class55.field827[1] & 0xFF);
                        int var12 = class55.field827[7] & 0xFF;
                        int var13 = ((class55.field827[5] & 0xFF) << 8) + (class55.field827[4] & 0xFF << 16) + (class55.field827[6] & 0xFF);
                        int var14 = (class55.field827[2] & 0xFF << 8) + (class55.field827[3] & 0xFF);
                        if (arg1 != var11 || var8 != var14 || this.field904 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var13 < 0 || this.field909.method1153(3783) / 520L < (long) var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var6 = var13;
                        for (int var15 = 0; var15 < var10; var15++) {
                            var9[var7++] = class55.field827[var15 + 8];
                        }
                        var8++;
                    }
                    byte[] var20 = var9;
                    return var20;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;", line = 715)
    public final String toString() {
        field911++;
        return "Cache:" + this.field904;
    }
}
