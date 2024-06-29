import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lpe;")
    private static class109 field1333 = class141.method1120("shake:", 0);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lpe;")
    public static class109 field1329 = field1333;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
    public static int[] field1328 = new int[32];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lwa;")
    public static class154 field1334 = null;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lpe;")
    public static class109 field1340 = class141.method1120("swe", 0);

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lpe;")
    public static class109 field1336 = field1333;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lre;")
    public static class123 field1330;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[Lk;")
    public static class69[] field1335;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method510(int arg0, int arg1) {
        field1342++;
        if (arg0 != 3) {
            return null;
        } else if (arg1 == 100 && class93.field2020 > 0) {
            byte[] var2 = class52.field1070[--class93.field2020];
            class52.field1070[class93.field2020] = null;
            return var2;
        } else if (arg1 == 5000 && class125.field2766 > 0) {
            byte[] var3 = class149.field3307[--class125.field2766];
            class149.field3307[class125.field2766] = null;
            return var3;
        } else if (arg1 == 30000 && class86.field1825 > 0) {
            byte[] var4 = class139.field3038[--class86.field1825];
            class139.field3038[class86.field1825] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
    public static final int method511(byte arg0, int arg1) {
        field1337++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 <= 89) {
            method512(10);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1336 = null;
        field1334 = null;
        field1335 = null;
        field1328 = null;
        field1333 = null;
        field1329 = null;
        field1330 = null;
        field1340 = null;
        if (arg0 != 11590) {
            method512(-95);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLta;)V")
    public static final void method513(byte arg0, class133 arg1) {
        int var2 = 0;
        if (arg1.field2914 == 0) {
            var2 = class147.field3201.method677(arg1.field2905, arg1.field2908, arg1.field2910);
        }
        if (arg1.field2914 == 1) {
            var2 = class147.field3201.method654(arg1.field2905, arg1.field2908, arg1.field2910);
        }
        if (arg1.field2914 == 2) {
            var2 = class147.field3201.method678(arg1.field2905, arg1.field2908, arg1.field2910);
        }
        field1339++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field2914 == 3) {
            var2 = class147.field3201.method672(arg1.field2905, arg1.field2908, arg1.field2910);
        }
        int var5 = 0;
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class147.field3201.method661(arg1.field2905, arg1.field2908, arg1.field2910, var2);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg1.field2903 = var3;
        arg1.field2900 = var5;
        arg1.field2906 = var4;
        int var7 = -107 / ((arg0 + 86) / 40);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIII)I")
    public static final int method514(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1331++;
        int var5 = 65536 - class105.field2210[arg2 * 1024 / arg4] >> 1;
        return arg0 == -78 ? ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16) : 67;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method515(int arg0) {
        field1332++;
        try {
            if (class1.field21 == arg0) {
                if (class153.field3363 != null) {
                    class153.field3363.method83((byte) -114);
                    class153.field3363 = null;
                }
                class14.field374 = 0;
                class1.field21 = 1;
                class94.field2024 = null;
                class153.field3370 = false;
            }
            if (class1.field21 == 1) {
                if (class94.field2024 == null) {
                    class94.field2024 = class35.field755.method249(class136.field2971, (byte) -128, class53.field1093);
                }
                if (class94.field2024.field513 == 2) {
                    throw new IOException();
                }
                if (class94.field2024.field513 == 1) {
                    class153.field3363 = new class9((Socket) class94.field2024.field514, class35.field755);
                    class1.field21 = 2;
                    class94.field2024 = null;
                }
            }
            if (class1.field21 == 2) {
                long var1 = class131.field2877 = class72.field1468.method889(true);
                class63.field1299.field309 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class63.field1299.method135(14, (byte) -50);
                class63.field1299.method135(var3, (byte) -50);
                class153.field3363.method87(arg0 - 94, class63.field1299.field279, 2, 0);
                class82.field1733.field309 = 0;
                class1.field21 = 3;
            }
            if (class1.field21 == 3) {
                if (class49.field1013 != null) {
                    class49.field1013.method33(-29103);
                }
                if (class147.field3210 != null) {
                    class147.field3210.method33(-29103);
                }
                int var4 = class153.field3363.method86(arg0 - 106);
                if (class49.field1013 != null) {
                    class49.field1013.method33(-29103);
                }
                if (class147.field3210 != null) {
                    class147.field3210.method33(arg0 ^ 0xFFFF8E51);
                }
                if (var4 != 0) {
                    class85.method717(arg0 + 128, var4);
                    return;
                }
                class1.field21 = 4;
                class82.field1733.field309 = 0;
            }
            if (class1.field21 == 4) {
                if (class82.field1733.field309 < 8) {
                    int var5 = class153.field3363.method81((byte) -62);
                    if (8 - class82.field1733.field309 < var5) {
                        var5 = 8 - class82.field1733.field309;
                    }
                    if (var5 > 0) {
                        class153.field3363.method80((byte) 121, class82.field1733.field309, var5, class82.field1733.field279);
                        class82.field1733.field309 += var5;
                    }
                }
                if (class82.field1733.field309 == 8) {
                    class82.field1733.field309 = 0;
                    class16.field409 = class82.field1733.method116(0);
                    class1.field21 = 5;
                }
            }
            if (class1.field21 == 5) {
                class63.field1299.field309 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class16.field409 >> 32), (int) class16.field409 };
                class63.field1299.method135(10, (byte) -50);
                class63.field1299.method123(var6[0], arg0 ^ 0x51F835F8);
                class63.field1299.method123(var6[1], arg0 ^ 0x51F835F8);
                class63.field1299.method123(var6[2], 1375221240);
                class63.field1299.method123(var6[3], 1375221240);
                class63.field1299.method157((byte) 19, class72.field1468.method889(true));
                class63.field1299.method152(9166, class72.field1478);
                class63.field1299.method121(class119.field2643, -3, class147.field3207);
                class89.field1881.field309 = 0;
                if (class153.field3373 == 40) {
                    class89.field1881.method135(18, (byte) -50);
                } else {
                    class89.field1881.method135(16, (byte) -50);
                }
                class89.field1881.method135(class63.field1299.field309 + 93, (byte) -50);
                class89.field1881.method123(466, 1375221240);
                class89.field1881.method135(class62.field1269 ? 1 : 0, (byte) -50);
                class93.method778(0, class89.field1881);
                class89.field1881.method123(class17.field434.field1944, 1375221240);
                class89.field1881.method123(class84.field1788.field1944, 1375221240);
                class89.field1881.method123(field1330.field1944, 1375221240);
                class89.field1881.method123(class109.field2293.field1944, 1375221240);
                class89.field1881.method123(class18.field456.field1944, 1375221240);
                class89.field1881.method123(class114.field2503.field1944, 1375221240);
                class89.field1881.method123(class107.field2241.field1944, arg0 + 1375221240);
                class89.field1881.method123(class72.field1459.field1944, 1375221240);
                class89.field1881.method123(class18.field453.field1944, 1375221240);
                class89.field1881.method123(class50.field1036.field1944, arg0 ^ 0x51F835F8);
                class89.field1881.method123(class19.field481.field1944, 1375221240);
                class89.field1881.method123(class101.field2105.field1944, 1375221240);
                class89.field1881.method123(class44.field935.field1944, 1375221240);
                class89.field1881.method123(class104.field2207.field1944, 1375221240);
                class89.field1881.method123(class125.field2775.field1944, 1375221240);
                class89.field1881.method123(class137.field2984.field1944, arg0 ^ 0x51F835F8);
                class89.field1881.method145(0, class63.field1299.field309, 0, class63.field1299.field279);
                class153.field3363.method87(arg0 - 89, class89.field1881.field279, class89.field1881.field309, 0);
                class63.field1299.method531(7225, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class82.field1733.method531(7225, var6);
                class1.field21 = 6;
            }
            if (class1.field21 == 6 && class153.field3363.method81((byte) -66) > 0) {
                int var8 = class153.field3363.method86(-80);
                if (var8 == 21 && class153.field3373 == 20) {
                    class1.field21 = 7;
                } else if (var8 == 2) {
                    class1.field21 = 9;
                } else if (var8 == 15 && class153.field3373 == 40) {
                    class102.method820((byte) -95);
                    return;
                } else if (var8 == 23 && class154.field3516 < 1) {
                    class154.field3516++;
                    class1.field21 = 0;
                } else {
                    class85.method717(arg0 ^ 0x80, var8);
                    return;
                }
            }
            if (class1.field21 == 7 && class153.field3363.method81((byte) -20) > 0) {
                class83.field1772 = class153.field3363.method86(-60) * 60 + 180;
                class1.field21 = 8;
            }
            if (class1.field21 == 8) {
                class14.field374 = 0;
                class49.method421(class77.field1626, arg0 - 8453, class44.method405(new class109[] { class143.method1132(class83.field1772 / 60, 98), class125.field2759 }, (byte) -74), class72.field1474);
                if (--class83.field1772 <= 0) {
                    class1.field21 = 0;
                }
            } else {
                if (class1.field21 == 9 && class153.field3363.method81((byte) -66) >= 8) {
                    class4.field87 = class153.field3363.method86(arg0 - 85);
                    class146.field3192 = class153.field3363.method86(-48) == 1;
                    class112.field2436 = class153.field3363.method86(-74);
                    class112.field2436 <<= 0x8;
                    class112.field2436 += class153.field3363.method86(arg0 ^ 0xFFFFFF83);
                    field1338 = class153.field3363.method86(arg0 - 66);
                    class153.field3363.method80((byte) 122, 0, 1, class82.field1733.field279);
                    class82.field1733.field309 = 0;
                    class17.field423 = class82.field1733.method524(true);
                    class153.field3363.method80((byte) 98, 0, 2, class82.field1733.field279);
                    class82.field1733.field309 = 0;
                    class109.field2286 = class82.field1733.method105(1375221240);
                    class1.field21 = 10;
                }
                if (class1.field21 != 10) {
                    class14.field374++;
                    if (class14.field374 > 2000) {
                        if (class154.field3516 < 1) {
                            class1.field21 = 0;
                            if (class72.field1458 == class136.field2971) {
                                class136.field2971 = class89.field1888;
                            } else {
                                class136.field2971 = class72.field1458;
                            }
                            class154.field3516++;
                        } else {
                            class85.method717(128, -3);
                        }
                    }
                } else if (class153.field3363.method81((byte) -9) >= class109.field2286) {
                    class82.field1733.field309 = 0;
                    class153.field3363.method80((byte) 118, 0, class109.field2286, class82.field1733.field279);
                    class89.method733(25778);
                    class52.field1079 = -1;
                    class149.method1168(arg0 + 4, false);
                    class17.field423 = -1;
                }
            }
        } catch (IOException var9) {
            if (class154.field3516 < 1) {
                class1.field21 = 0;
                class154.field3516++;
                if (class72.field1458 == class136.field2971) {
                    class136.field2971 = class89.field1888;
                } else {
                    class136.field2971 = class72.field1458;
                }
            } else {
                class85.method717(arg0 ^ 0x80, -2);
            }
        }
    }
}
