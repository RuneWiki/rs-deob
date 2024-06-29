import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class56 extends class28 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public int field1375 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Z")
    public static boolean field1379 = false;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Z")
    public static boolean field1383 = false;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lja;")
    private static class62 field1382 = class30.method243(43, "Loaded wordpack");

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "Lja;")
    public static class62 field1378 = field1382;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Lja;")
    public static class62 field1387 = class30.method243(43, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method380(int arg0) {
        if (arg0 != -9) {
            method385(29, 0);
        }
        field1382 = null;
        field1378 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ls;Z)V")
    public final void method381(class128 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1025(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field1385++;
                return;
            }
            this.method382((byte) -108, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILs;)V")
    private final void method382(byte arg0, int arg1, class128 arg2) {
        if (arg0 > -73) {
            this.method381(null, false);
        }
        if (arg1 == 5) {
            this.field1375 = arg2.method1041(212464720);
        }
        field1376++;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static final void method383(int arg0) {
        field1377++;
        if (arg0 <= -75) {
            class6.field202.method127((byte) -113);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILs;I)Lja;")
    public static final class62 method384(int arg0, class128 arg1, int arg2) {
        field1384++;
        try {
            class62 var3 = new class62();
            if (arg0 != -3) {
                return null;
            }
            var3.field1538 = arg1.method1001((byte) -67);
            if (var3.field1538 > arg2) {
                var3.field1538 = arg2;
            }
            var3.field1504 = new byte[var3.field1538];
            arg1.field2873 += class120.field2756.method593(var3.field1538, arg1.field2874, 0, 0, var3.field1504, arg1.field2873);
            return var3;
        } catch (Exception var4) {
            return class85.field2046;
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
    public static final void method385(int arg0, int arg1) {
        field1381++;
        if (arg1 == -1 || !class27.field670[arg1]) {
            return;
        }
        class128.field2898.method881(arg1, -716);
        if (class131.field2990[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < class131.field2990[arg1].length; var3++) {
            if (class131.field2990[arg1][var3] != null) {
                if (class131.field2990[arg1][var3].field1279 == 2) {
                    var2 = false;
                } else {
                    class131.field2990[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class131.field2990[arg1] = null;
        }
        class27.field670[arg1] = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BII)Lja;")
    public static final class62 method386(byte arg0, int arg1, int arg2) {
        field1386++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class96.field2243;
        } else if (var3 < -6) {
            return class50.field1163;
        } else if (var3 < -3) {
            return class16.field376;
        } else if (var3 < 0) {
            return class86.field2057;
        } else {
            if (arg0 != 51) {
                field1380 = 104;
            }
            if (var3 > 9) {
                return class29.field709;
            } else if (var3 > 6) {
                return class90.field2157;
            } else if (var3 > 3) {
                return class40.field935;
            } else if (var3 > 0) {
                return class17.field398;
            } else {
                return class135.field3117;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpd;ILpd;)V")
    public static final void method387(class108 arg0, int arg1, class108 arg2) {
        field1374++;
        if (arg1 != -7) {
            method386((byte) -122, 34, -32);
        }
        class151.field3543 = arg0;
        client.field505 = arg2;
    }
}
