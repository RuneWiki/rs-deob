import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field614 = -2;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Ljb;")
    public static class64 field613 = new class64(32);

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lpe;")
    private static class109 field620 = class141.method1120("Enter your username (V password)3", 0);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lpe;")
    public static class109 field618 = class141.method1120("Lade Texturen )2 ", 0);

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lpe;")
    private static class109 field619 = class141.method1120("Attack", 0);

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lpe;")
    public static class109 field615 = field620;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lpe;")
    public static class109 field621 = null;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lpe;")
    public static class109 field623 = field619;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Le;")
    public static class29 field617;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field610;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    public static int[] field616;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        field615 = null;
        field623 = null;
        field621 = null;
        field616 = null;
        field619 = null;
        field620 = null;
        field613 = null;
        field618 = null;
        if (arg0 == 676596801) {
            field617 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method233(int arg0) {
        field609++;
        class92.method770((byte) -70, false);
        boolean var1 = true;
        class91.field1967 = 0;
        for (int var2 = 0; var2 < class53.field1103.length; var2++) {
            if (class93.field2010[var2] != -1 && class53.field1103[var2] == null) {
                class53.field1103[var2] = class114.field2503.method742(0, 84, class93.field2010[var2]);
                if (class53.field1103[var2] == null) {
                    class91.field1967++;
                    var1 = false;
                }
            }
            if (class95.field2044[var2] != -1 && class17.field430[var2] == null) {
                class17.field430[var2] = class114.field2503.method759(class115.field2548[var2], 0, -3742, class95.field2044[var2]);
                if (class17.field430[var2] == null) {
                    class91.field1967++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class136.field2958 = 1;
            return;
        }
        class122.field2690 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class53.field1103.length; var4++) {
            byte[] var56 = class17.field430[var4];
            if (var56 != null) {
                int var57 = (class74.field1492[var4] & 0xFF) * 64 - class82.field1736;
                int var58 = (class74.field1492[var4] >> 8) * 64 - class43.field917;
                if (class84.field1791) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class123.method992(-103, var58, var57, var56);
            }
        }
        if (!var3) {
            class136.field2958 = 2;
            return;
        }
        if (arg0 <= 47) {
            field618 = null;
        }
        if (class136.field2958 != 0) {
            class23.method216(class44.method405(new class109[] { class46.field967, class138.field3004 }, (byte) -74), true, (byte) -35);
        }
        class147.method1148(false);
        class131.method1060(-25390);
        class147.method1148(false);
        class147.field3201.method682();
        class147.method1148(false);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class109.field2318[var5].method607((byte) 28);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class107.field2249[var6][var54][var55] = 0;
                }
            }
        }
        class147.method1148(false);
        class147.method1149(false);
        int var7 = class53.field1103.length;
        class11.method90(-128);
        class92.method770((byte) -70, true);
        if (!class84.field1791) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class74.field1492[var8] & 0xFF) * 64 - class82.field1736;
                int var18 = (class74.field1492[var8] >> 8) * 64 - class43.field917;
                byte[] var19 = class53.field1103[var8];
                if (var19 != null) {
                    class147.method1148(false);
                    class62.method496(var19, var18, 90, (class64.field1315 - 6) * 8, class52.field1079 * 8 - 48, class109.field2318, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class74.field1492[var9] >> 8) * 64 - class43.field917;
                int var15 = (class74.field1492[var9] & 0xFF) * 64 - class82.field1736;
                byte[] var16 = class53.field1103[var9];
                if (var16 == null && class64.field1315 < 800) {
                    class147.method1148(false);
                    class131.method1059(64, var14, (byte) -66, var15, 64);
                }
            }
            class92.method770((byte) -70, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class17.field430[var10];
                if (var11 != null) {
                    int var12 = (class74.field1492[var10] & 0xFF) * 64 - class82.field1736;
                    int var13 = (class74.field1492[var10] >> 8) * 64 - class43.field917;
                    class147.method1148(false);
                    class74.method587(var13, class147.field3201, class109.field2318, true, var12, var11);
                }
            }
        }
        if (class84.field1791) {
            for (int var20 = 0; var20 < 4; var20++) {
                class147.method1148(false);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class141.field3107[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 14 & 0x3FF;
                            int var42 = (var41 / 8 << 8) + (var40 / 8);
                            for (int var43 = 0; var43 < class74.field1492.length; var43++) {
                                if (class74.field1492[var43] == var42 && class53.field1103[var43] != null) {
                                    class78.method624(class109.field2318, var34 * 8, 7744, class53.field1103[var43], (var40 & 0x7) * 8, var20, var38, var35 * 8, var39, (var41 & 0x7) * 8);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class72.method580(var20, 1, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class141.field3107[0][var21][var32];
                    if (var33 == -1) {
                        class131.method1059(8, var21 * 8, (byte) -117, var32 * 8, 8);
                    }
                }
            }
            class92.method770((byte) -70, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class147.method1148(false);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class141.field3107[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 24 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class74.field1492.length; var31++) {
                                if (class74.field1492[var31] == var30 && class17.field430[var31] != null) {
                                    class114.method947((var29 & 0x7) * 8, class17.field430[var31], var27, class109.field2318, class147.field3201, 1, (var28 & 0x7) * 8, var26, var24 * 8, var22, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class92.method770((byte) -70, true);
        class131.method1060(-25390);
        class147.method1148(false);
        class18.method183(-27932, class109.field2318, class147.field3201);
        class92.method770((byte) -70, true);
        int var44 = class16.field407;
        if (class75.field1513 < var44) {
            var44 = class75.field1513;
        }
        if (class75.field1513 - 1 > var44) {
            int var45 = class75.field1513 - 1;
        }
        if (class62.field1269) {
            class147.field3201.method658(class16.field407);
        } else {
            class147.field3201.method658(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class68.method534(var46, var53, -1610612736);
            }
        }
        class147.method1148(false);
        class13.method130((byte) -80);
        class112.field2417.method92((byte) 103);
        if (class12.field278 != null) {
            class77.field1600++;
            class63.field1299.method535(192, -25013);
            class63.field1299.method123(1057001181, 1375221240);
        }
        if (!class84.field1791) {
            int var47 = (class52.field1079 - 6) / 8;
            int var48 = (class52.field1079 + 6) / 8;
            int var49 = (class64.field1315 + 6) / 8;
            int var50 = (class64.field1315 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var50 > var52 || var49 < var52) {
                        class114.field2503.method756(true, class44.method405(new class109[] { class144.field3166, class143.method1132(var51, 91), class12.field276, class143.method1132(var52, 85) }, (byte) -74));
                        class114.field2503.method756(true, class44.method405(new class109[] { class99.field2086, class143.method1132(var51, 126), class12.field276, class143.method1132(var52, 79) }, (byte) -74));
                    }
                }
            }
        }
        class118.method958(false, 30);
        class147.method1148(false);
        class136.method1081((byte) -73);
        class63.field1299.method535(6, -25013);
        class7.method70(125);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILfb;[B)V")
    public static final void method234(int arg0, int arg1, class38 arg2, byte[] arg3) {
        if (arg1 >= -67) {
            method233(96);
        }
        class134 var4 = new class134();
        var4.field267 = arg0;
        var4.field2925 = arg2;
        field608++;
        var4.field2915 = 0;
        var4.field2923 = arg3;
        class19 var5 = class11.field244;
        synchronized (class11.field244) {
            class11.field244.method188(-2, var4);
        }
        class44.method401(1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BLbe;I)V")
    public final void method235(byte[] arg0, class13 arg1, int arg2) {
        field611++;
        if (arg1.field279[arg1.field309] != 31 || arg1.field279[arg1.field309 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field610 == null) {
            this.field610 = new Inflater(true);
        }
        try {
            this.field610.setInput(arg1.field279, arg1.field309 + arg2, arg1.field279.length - 18 - arg1.field309);
            this.field610.inflate(arg0);
        } catch (Exception var4) {
            this.field610.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field610.reset();
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    private class25(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class25() {
        this(-1, 1000000, 1000000);
    }
}
