import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class74 extends class168 {

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    private final int field1457;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private final int field1442;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    private final int field1453;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    private final int field1448;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    private final int field1456;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    private final int field1444;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private final int field1452;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    private final int field1450;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lqe;")
    public static class179 field1443 = class206.method1380("Schrifts-=tze geladen)3", (byte) 106);

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "[I")
    public static int[] field1449 = new int[2048];

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Lqe;")
    public static class179 field1451 = class206.method1380("und haben es deaktiviert)3 Klicken Sie auf der", (byte) 56);

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lqe;")
    private static class179 field1460 = class206.method1380("Started 3d library", (byte) -126);

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Lqe;")
    public static class179 field1455 = field1460;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Leh;")
    public static class52 field1445;

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1457 = arg4;
        this.field1442 = arg6;
        this.field1453 = arg3;
        this.field1448 = arg5;
        this.field1456 = arg1;
        this.field1444 = arg7;
        this.field1452 = arg2;
        this.field1450 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILkd;)V")
    public static final void method468(int arg0, class112 arg1) {
        int var2 = -1;
        ++field1454;
        long var3 = 0L;
        if (arg1.field2095 == 0) {
            var3 = class239.method1551(arg1.field2099, arg1.field2104, arg1.field2102);
        }
        int var5 = 0;
        if (arg1.field2095 == 1) {
            var3 = class67.method435(arg1.field2099, arg1.field2104, arg1.field2102);
        }
        if (arg0 < 82) {
            field1445 = null;
        }
        int var6 = 0;
        if (arg1.field2095 == 2) {
            var3 = class199.method1324(arg1.field2099, arg1.field2104, arg1.field2102);
        }
        if (arg1.field2095 == 3) {
            var3 = class108.method707(arg1.field2099, arg1.field2104, arg1.field2102);
        }
        if (var3 != 0L) {
            var6 = (int) var3 >> 14 & 31;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var3 >> 20 & 3;
        }
        arg1.field2094 = var6;
        arg1.field2097 = var2;
        arg1.field2115 = var5;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V")
    public static final void method469(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3681 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static final void method470(byte arg0) {
        ++field1458;
        int var1 = class36.field789.method71(8, 128);
        if (~class22.field548 < ~var1) {
            for (int var2 = var1; var2 < class22.field548; ++var2) {
                class29.field640[class102.field1961++] = class10.field279[var2];
            }
        }
        if (arg0 == -80) {
            if (class22.field548 < var1) {
                throw new RuntimeException("gppov1");
            } else {
                class22.field548 = 0;
                for (int var3 = 0; var3 < var1; ++var3) {
                    int var4 = class10.field279[var3];
                    class115 var5 = class23.field554[var4];
                    int var6 = class36.field789.method71(1, arg0 + 208);
                    if (~var6 == -1) {
                        class10.field279[class22.field548++] = var4;
                        var5.field3152 = class13.field322;
                    } else {
                        int var7 = class36.field789.method71(2, 128);
                        if (~var7 == -1) {
                            class10.field279[class22.field548++] = var4;
                            var5.field3152 = class13.field322;
                            field1449[class202.field3742++] = var4;
                        } else if (var7 == 1) {
                            class10.field279[class22.field548++] = var4;
                            var5.field3152 = class13.field322;
                            int var8 = class36.field789.method71(3, arg0 + 208);
                            var5.method1106(var8, (byte) 7, false);
                            int var9 = class36.field789.method71(1, 128);
                            if (~var9 == -2) {
                                field1449[class202.field3742++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class10.field279[class22.field548++] = var4;
                            var5.field3152 = class13.field322;
                            int var10 = class36.field789.method71(3, arg0 + 208);
                            var5.method1106(var10, (byte) 7, true);
                            int var11 = class36.field789.method71(3, 128);
                            var5.method1106(var11, (byte) 7, true);
                            int var12 = class36.field789.method71(1, 128);
                            if (var12 == 1) {
                                field1449[class202.field3742++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class29.field640[class102.field1961++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)V")
    public final void method471(int arg0, int arg1, byte arg2) {
        ++field1446;
        int var4 = this.field1450 * arg1 >> 12;
        int var5 = this.field1456 * arg0 >> 12;
        int var6 = this.field1453 * arg0 >> 12;
        int var7 = this.field1452 * arg1 >> 12;
        int var8 = this.field1457 * arg1 >> 12;
        int var9 = this.field1448 * arg0 >> 12;
        int var10 = this.field1442 * arg1 >> 12;
        int var11 = this.field1444 * arg0 >> 12;
        class28.method185(var6, var4, var10, super.field3027, 26324, var9, var5, var11, var7, var8);
        int var12 = -77 / ((-55 - arg2) / 63);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1455 = null;
        field1443 = null;
        field1449 = null;
        field1451 = null;
        field1445 = null;
        field1460 = null;
        if (arg0 != 1153530668) {
            method469(-91, 1, 31);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
    public final void method473(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1451 = null;
        }
        ++field1447;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method474(int arg0, int arg1, int arg2) {
        ++field1459;
        if (arg0 != 24730) {
            this.method474(24, -96, -12);
        }
    }
}
