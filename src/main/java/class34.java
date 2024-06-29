import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class34 extends class95 {

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "Z")
    public boolean field457 = true;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "Lsf;")
    public static class108 field468 = class140.method973(255, ":");

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!hn", name = "ab", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!hn", name = "bb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!hn", name = "cb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!hn", name = "db", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!hn", name = "eb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "Lik;")
    public static class262 field469;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "[I")
    public int[] field458;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "[I")
    public static int[] field459;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "[I")
    private int[] field464;

    @OriginalMember(owner = "client!hn", name = "Z", descriptor = "[Lsf;")
    private class108[] field473;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "[[I")
    private int[][] field463;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z[B)Z", line = 5)
    public static final boolean method226(boolean arg0, byte[] arg1) {
        field476++;
        if (arg0) {
            method229((byte) 12, -35, -81);
        }
        class249 var2 = new class249(arg1);
        int var3 = var2.method1731(true);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1731(true) == 1;
        if (var4) {
            class123.method857(var2, true);
        }
        class2.method18(var2, 0);
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lrm;I)Lsf;", line = 42)
    public final class108 method227(class249 arg0, int arg1) {
        class108 var3 = class219.method1510(80, true);
        if (this.field464 != null) {
            for (int var4 = 0; var4 < this.field464.length; var4++) {
                var3.method759(this.field473[var4], false);
                var3.method759(class259.method1839(arg0.method1706(346586784, class178.field3231[this.field464[var4]]), this.field464[var4], 116, this.field463[var4]), false);
            }
        }
        var3.method759(this.field473[this.field473.length - 1], false);
        int var5 = 97 % ((arg1 + 57) / 51);
        field456++;
        return var3.method745(0);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Lsf;", line = 70)
    public final class108 method228(int arg0) {
        field478++;
        class108 var2 = class219.method1510(80, true);
        if (this.field473 == null) {
            return class326.field5548;
        }
        var2.method759(this.field473[0], false);
        if (arg0 < 16) {
            this.method235((int[]) null, (class249) null, (byte) -55);
        }
        for (int var3 = 1; var3 < this.field473.length; var3++) {
            var2.method759(class183.field3361, false);
            var2.method759(this.field473[var3], false);
        }
        return var2.method745(0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BII)V", line = 100)
    public static final void method229(byte arg0, int arg1, int arg2) {
        field462++;
        class120 var3 = class248.method1704(6, 105, arg2);
        var3.method844(arg0);
        var3.field2066 = arg1;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 117)
    public final void method230(int arg0) {
        int var2 = -64 / ((-arg0 - 15) / 34);
        field461++;
        if (this.field458 != null) {
            for (int var3 = 0; var3 < this.field458.length; var3++) {
                this.field458[var3] = class242.method1674(this.field458[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILrm;)V", line = 146)
    public final void method231(int arg0, class249 arg1) {
        field477++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method238(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lsf;B)V", line = 169)
    public static final void method232(class108 arg0, byte arg1) {
        field474++;
        if (arg1 != 79) {
            field459 = (int[]) null;
        }
        int var2 = class163.method1126(arg0, 22430);
        if (var2 != -1) {
            class270.method1952(class42.field559.field5058[var2], arg1 ^ 0xFFFFCB58, class42.field559.field5063[var2]);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I", line = 186)
    public final int method233(int arg0, boolean arg1) {
        if (arg1) {
            this.field473 = (class108[]) null;
        }
        field465++;
        return this.field464 == null || arg0 < 0 || arg0 > this.field464.length ? -1 : this.field464[arg0];
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 201)
    public static void method234(int arg0) {
        field469 = null;
        if (arg0 != 30470) {
            method226(true, (byte[]) null);
        }
        field468 = null;
        field459 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([ILrm;B)V", line = 213)
    public final void method235(int[] arg0, class249 arg1, byte arg2) {
        field472++;
        if (this.field464 == null) {
            return;
        }
        if (arg2 <= 6) {
            method239((byte) 21, (class249) null);
        }
        for (int var4 = 0; var4 < this.field464.length && var4 < arg0.length; var4++) {
            int var5 = class274.field4818[this.method233(var4, false)];
            if (var5 > 0) {
                arg1.method1750(25672, (long) arg0[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V", line = 245)
    public static final void method236(byte arg0) {
        for (int var1 = 0; var1 < class312.field5400; var1++) {
            int var2 = class283.field4947[var1];
            class45 var3 = class159.field2863[var2];
            int var4 = class293.field5127.method1731(true);
            if ((var4 & 0x10) != 0) {
                int var5 = class293.field5127.method1755(true);
                int var6 = class293.field5127.method1733(arg0 + 72);
                var3.method1803(var6, (byte) -126, var5, class116.field2000);
            }
            if ((var4 & 0x40) != 0) {
                var3.field4500 = class293.field5127.method1725(-103);
                int var7 = class293.field5127.method1737(-666233712);
                var3.field4517 = var7 >> 16;
                var3.field4460 = (var7 & 0xFFFF) + class116.field2000;
                var3.field4450 = 0;
                if (var3.field4460 > class116.field2000) {
                    var3.field4450 = -1;
                }
                if (var3.field4500 == 65535) {
                    var3.field4500 = -1;
                }
                var3.field4506 = 0;
                if (var3.field4500 != -1 && class116.field2000 == var3.field4460) {
                    int var8 = class152.method1074((byte) 116, var3.field4500).field5308;
                    if (var8 != -1) {
                        class272 var9 = class149.method1063(var8, -18767);
                        if (var9 != null && var9.field4774 != null) {
                            class172.method1226(var9, var3.field4457, -21329, 0, false, var3.field4452);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field4448 = class293.field5127.method1752((byte) 17);
                var3.field4508 = class293.field5127.method1725(-98);
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class293.field5127.method1755(true);
                int var11 = class293.field5127.method1733(128);
                var3.method1803(var11, (byte) -125, var10, class116.field2000);
                var3.field4491 = class116.field2000 + 300;
                var3.field4489 = class293.field5127.method1755(true);
            }
            if ((var4 & 0x4) != 0) {
                var3.field4522 = class293.field5127.method1752((byte) 48);
                if (var3.field4522 == 65535) {
                    var3.field4522 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var12 = class293.field5127.method1752((byte) 30);
                int var13 = class293.field5127.method1755(true);
                if (var12 == 65535) {
                    var12 = -1;
                }
                class166.method1164(var12, var3, var13, 5422);
            }
            if ((var4 & 0x1) != 0) {
                var3.field4467 = class293.field5127.method1740(true);
                var3.field4524 = 100;
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field646.method935((byte) 89)) {
                    class320.method2218(var3, (byte) 124);
                }
                var3.method317(arg0 ^ 0x38, class57.method397(0, class293.field5127.method1752((byte) 38)));
                var3.method1810(var3.field646.field2381, arg0 ^ 0xFFFFFFAA);
                var3.field4496 = var3.field646.field2377;
                var3.field4455 = var3.field646.field2401;
                var3.field4449 = var3.field646.field2370;
                var3.field4465 = var3.field646.field2353;
                var3.field4510 = var3.field646.field2398;
                var3.field4490 = var3.field646.field2404;
                var3.field4470 = var3.field646.field2371;
                var3.field4497 = var3.field646.field2409;
                if (var3.field646.method935((byte) 79)) {
                    class290.method2072(var3.field4482[0], 0, (class60) null, class295.field5159, (class51) null, 128, var3.field4498[0], var3);
                }
            }
        }
        if (arg0 != 56) {
            field468 = (class108) null;
        }
        field470++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)I", line = 384)
    public final int method237(int arg0, int arg1, int arg2) {
        field467++;
        if (arg1 <= 97) {
            return 90;
        } else if (this.field464 == null || arg0 < 0 || this.field464.length < arg0) {
            return -1;
        } else if (this.field463[arg0] == null || arg2 < 0 || this.field463[arg0].length < arg2) {
            return -1;
        } else {
            return this.field463[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lrm;II)V", line = 408)
    private final void method238(class249 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method239((byte) 87, (class249) null);
        }
        field471++;
        if (arg2 == 1) {
            this.field473 = arg0.method1740(true).method774(60, (byte) -108);
        } else if (arg2 == 2) {
            int var8 = arg0.method1731(true);
            this.field458 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field458[var9] = arg0.method1712(-1);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1731(true);
            this.field464 = new int[var4];
            this.field463 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1712(-1);
                this.field464[var5] = var6;
                this.field463[var5] = new int[class249.field4308[var6]];
                for (int var7 = 0; var7 < class249.field4308[var6]; var7++) {
                    this.field463[var5][var7] = arg0.method1712(-1);
                }
            }
        } else if (arg2 == 4) {
            this.field457 = false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLrm;)V", line = 477)
    public static final void method239(byte arg0, class249 arg1) {
        int var2 = 44 % ((55 - arg0) / 49);
        field475++;
        while (true) {
            while (arg1.field4314 < arg1.field4338.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method1731(true) == 1) {
                    var3 = true;
                    var4 = arg1.method1731(true);
                    var5 = arg1.method1731(true);
                }
                int var6 = arg1.method1731(true);
                int var7 = arg1.method1731(true);
                int var8 = var6 * 64 - class144.field2546;
                int var9 = class152.field2757 - (var7 * 64 - class83.field1288) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && class74.field1113 > (var8 + 63) && class152.field2757 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var4 * 8 <= var12 && var12 < (var4 * 8 + 8) && var13 >= var5 * 8 && (var5 * 8 + 8) > var13) {
                                int var14 = arg1.method1731(true);
                                if (var14 != 0) {
                                    if ((var14 & 0x1) == 1) {
                                        int var15 = arg1.method1731(true);
                                        if (class202.field3650[var10][var11] == null) {
                                            class202.field3650[var10][var11] = new byte[4096];
                                        }
                                        class202.field3650[var10][var11][(63 - var13 << 6) + var12] = (byte) var15;
                                    }
                                    if ((var14 & 0x2) == 2) {
                                        int var16 = arg1.method1712(-1);
                                        if (class143.field2517[var10][var11] == null) {
                                            class143.field2517[var10][var11] = new short[4096];
                                        }
                                        class143.field2517[var10][var11][(63 - var13 << 6) + var12] = (short) var16;
                                    }
                                    if ((var14 & 0x4) == 4) {
                                        int var17 = ((arg1.method1731(true) & 0xFF) << 16) + (arg1.method1731(true) & 0xFF << 8) + (arg1.method1731(true) & 0xFF);
                                        if (class280.field4905[var10][var11] == null) {
                                            class280.field4905[var10][var11] = new int[4096];
                                        }
                                        var17--;
                                        class60 var18 = class201.method1424(var17, (byte) 111);
                                        if (var18.field912 != null) {
                                            var18 = var18.method409(0);
                                            if (var18 == null || var18.field933 == -1) {
                                                continue;
                                            }
                                        }
                                        class280.field4905[var10][var11][(63 - var13 << 6) + var12] = var18.field902 + 1;
                                        class176 var19 = new class176();
                                        var19.field3201 = var18.field933;
                                        var19.field3199 = var8;
                                        var19.field3208 = var9;
                                        class249.field4372.method5(var19, (byte) -127);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var20 = 0; var20 < (var3 ? 64 : 4096); var20++) {
                        int var21 = arg1.method1731(true);
                        if (var21 != 0) {
                            if ((var21 & 0x1) == 1) {
                                arg1.field4314++;
                            }
                            if ((var21 & 0x2) == 2) {
                                arg1.field4314 += 2;
                            }
                            if ((var21 & 0x4) == 4) {
                                arg1.field4314 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILca;)Z", line = 636)
    public static final boolean method240(int arg0, class98 arg1) {
        field466++;
        if (arg0 != 250) {
            field469 = (class262) null;
        }
        if (arg1.field1698 == 205) {
            class16.field205 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)I", line = 657)
    public final int method241(int arg0) {
        if (arg0 >= -124) {
            this.method227((class249) null, -106);
        }
        field455++;
        return this.field464 == null ? 0 : this.field464.length;
    }
}
