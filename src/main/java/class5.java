import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class120 {

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Lok;")
    private static class41 field55 = class137.method956("scroll:", 45);

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "Lok;")
    public static class41 field53 = class137.method956(" weitere Optionen", 45);

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "Lok;")
    public static class41 field52 = class137.method956("gleiten:", 45);

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "Lok;")
    public static class41 field59 = field55;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Lok;")
    public static class41 field51 = field55;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lok;")
    public static class41 field63 = class137.method956("welle:", 45);

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lmh;")
    public static class65 field60;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 13)
    public static final void method13(int arg0) {
        int var1 = -23 / ((arg0 + 19) / 56);
        field47++;
        class236.field3787 = class149.method1030(4, -24807, 35, 0.4F, 2048, true, 8, 8);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method14(int arg0, int arg1) {
        field48++;
        if (arg1 != -14959) {
            method18((byte) 103);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[][] var4 = this.method858(0, arg0, arg1 + 15084);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class307.field5160; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IZ)Lwc;", line = 71)
    public static final class222 method15(int arg0, boolean arg1) {
        field57++;
        class222 var2 = (class222) class107.field1512.method136((long) arg0, true);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return (class222) null;
        } else {
            byte[] var3 = class300.field4862.method454(class165.method1155(-125679832, arg0), 0, class143.method993(127, arg0));
            class222 var4 = new class222();
            var4.field3533 = arg0;
            if (var3 != null) {
                var4.method1592((byte) -18, new class112(var3));
            }
            class107.field1512.method132((long) arg0, var4, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V", line = 107)
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 - arg5;
        field54++;
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class66.method487(arg5, arg4, arg0, (byte) 119, arg2);
            }
        } else if (var7 == 0) {
            class226.method1626(arg5, (byte) -75, arg0, arg4, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class273.field4449) {
                var10 = (class273.field4449 * var8 >> 12) + var9;
                var11 = class273.field4449;
            } else if (class153.field2439 < arg5) {
                var10 = var9 + (class153.field2439 * var8 >> 12);
                var11 = class153.field2439;
            } else {
                var11 = arg5;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (arg1 < class273.field4449) {
                var13 = (class273.field4449 * var8 >> 12) + var9;
                var12 = class273.field4449;
            } else if (arg1 <= class153.field2439) {
                var12 = arg1;
                var13 = arg2;
            } else {
                var12 = class153.field2439;
                var13 = var9 + (class153.field2439 * var8 >> 12);
            }
            if (var10 < class15.field192) {
                var10 = class15.field192;
                var11 = (class15.field192 - var9 << 12) / var8;
            } else if (class237.field3801 < var10) {
                var10 = class237.field3801;
                var11 = (class237.field3801 - var9 << 12) / var8;
            }
            if (arg3 < 40) {
                field55 = (class41) null;
            }
            if (var13 < class15.field192) {
                var13 = class15.field192;
                var12 = (class15.field192 - var9 << 12) / var8;
            } else if (class237.field3801 < var13) {
                var13 = class237.field3801;
                var12 = (class237.field3801 - var9 << 12) / var8;
            }
            class164.method1152(var13, var10, var11, var12, false, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llb;B)V", line = 207)
    public static final void method17(class112 arg0, byte arg1) {
        field62++;
        if (arg1 >= -124) {
            field63 = (class41) null;
        }
        while (true) {
            while (arg0.field1607.length > arg0.field1640) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method792(2) == 1) {
                    var2 = true;
                    var4 = arg0.method792(2);
                    var3 = arg0.method792(2);
                }
                int var5 = arg0.method792(2);
                int var6 = arg0.method792(2);
                int var7 = var5 * 64 - class120.field1773;
                int var8 = class212.field3414 + class177.field2876 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class66.field1004 && class212.field3414 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && var4 * 8 + 8 > var11 && var12 >= (var3 * 8) && var12 < var3 * 8 + 8) {
                                int var13 = arg0.method792(2);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method792(2);
                                        if (class244.field3891[var10][var9] == null) {
                                            class244.field3891[var10][var9] = new byte[4096];
                                        }
                                        class244.field3891[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method759((byte) -36);
                                        if (class307.field5164[var10][var9] == null) {
                                            class307.field5164[var10][var9] = new short[4096];
                                        }
                                        class307.field5164[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method792(2) & 0xFF << 16) + ((arg0.method792(2) & 0xFF) << 8) + (arg0.method792(2) & 0xFF);
                                        if (class281.field4571[var10][var9] == null) {
                                            class281.field4571[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class171 var17 = class234.method1684(-2441, var16);
                                        if (var17.field2745 != null) {
                                            var17 = var17.method1230(false);
                                            if (var17 == null || var17.field2774 == -1) {
                                                continue;
                                            }
                                        }
                                        class281.field4571[var10][var9][(63 - var12 << 6) + var11] = var17.field2733 + 1;
                                        class176 var18 = new class176();
                                        var18.field2852 = var8;
                                        var18.field2854 = var7;
                                        var18.field2866 = var17.field2774;
                                        class133.field1993.method1503(var18, (byte) -69);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method792(2);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1640++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1640 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1640 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V", line = 357)
    public static void method18(byte arg0) {
        field53 = null;
        field51 = null;
        field59 = null;
        field60 = null;
        field63 = null;
        field52 = null;
        field55 = null;
        if (arg0 != -53) {
            field60 = (class65) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V", line = 391)
    public static final void method19(int arg0) {
        class35.field519 = false;
        class164.field2606 = -1;
        class38.field596 = 0;
        class62.field909 = 0;
        class259.field4132 = 1;
        field56++;
        class134.field2001 = -3;
        class178.field2883 = 0;
        if (arg0 <= 87) {
            field49 = -45;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 426)
    public class5() {
        super(1, true);
    }
}
