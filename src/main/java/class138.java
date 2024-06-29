import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class138 extends class121 {

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field3440 = 0;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "Lr;")
    public static class118 field3443 = new class118(30);

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static volatile int field3445 = 0;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "Loc;")
    public static class99 field3446 = class48.method402((byte) -104, "@yel@*V");

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "Loc;")
    public static class99 field3447 = class48.method402((byte) -104, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field3449 = -1;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "Loc;")
    public static class99 field3452 = class48.method402((byte) -104, "Von:");

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Lpc;")
    public static class105 field3444;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lrd;")
    public static class119 field3450;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "Lef;")
    public static class35 field3451;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lib;II)V")
    private final void method1147(class57 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field3440 = arg0.method506(-1);
        }
        field3442++;
        if (arg1 != 15565) {
            method1150(114);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)V")
    public static final void method1148(int arg0, int arg1, byte arg2, int arg3) {
        field3439++;
        if (class100.field2441 != 0 && arg3 != 0 && class31.field748 < 50) {
            class2.field41[class31.field748] = arg0;
            class53.field1262[class31.field748] = arg3;
            class67.field1709[class31.field748] = arg1;
            class59.field1561[class31.field748] = null;
            class79.field1953[class31.field748] = 0;
            class31.field748++;
        }
        if (arg2 != -22) {
            method1150(28);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILib;)V")
    public final void method1149(int arg0, class57 arg1) {
        while (true) {
            int var3 = arg1.method510(-111);
            if (var3 == 0) {
                field3441++;
                if (arg0 != -1) {
                    method1151(6, -63, 115, -56, null, 18, -82, 77, -83, 26);
                    return;
                }
                return;
            }
            this.method1147(arg1, arg0 ^ 0xFFFFC332, var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static void method1150(int arg0) {
        field3446 = null;
        field3447 = null;
        field3450 = null;
        field3452 = null;
        field3444 = null;
        field3451 = null;
        if (arg0 == 256) {
            field3443 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII[Lhe;IIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, class54[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3438++;
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class54 var12 = arg4[var10];
            if (var12 != null && (var12.field1341 == 0 || var12.field1315) && var12 != null && var12.field1292 == arg7 && !class11.method123((byte) 94, var12)) {
                int var13 = var12.field1324 + arg5 - arg0;
                int var14 = var12.field1356 + arg2 - arg6;
                int var15 = var12.field1383 + var13;
                int var16 = arg5 >= var13 ? arg5 : var13;
                int var17 = var12.field1403 + var14;
                int var18 = var14 <= arg2 ? arg2 : var14;
                int var19 = arg9 > var17 ? var17 : arg9;
                int var20 = arg8 <= var15 ? arg8 : var15;
                if (var12.field1341 == 0) {
                    method1151(var16 + var12.field1296 - var13, 95, var18, arg3, arg4, var16, var18 + var12.field1378 - var14, var12.field1293, var20, var19);
                    if (var12.field1344 != null) {
                        method1151(var12.field1296 + var16 - var13, -40, var18, arg3, var12.field1344, var16, var18 + var12.field1378 - var14, var12.field1293, var20, var19);
                    }
                }
                if (var12.field1315) {
                    boolean var21;
                    if (var16 <= class148.field3656 && var18 <= class80.field1969 && var20 > class148.field3656 && class80.field1969 < var19) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    boolean var23 = false;
                    if (class49.field1179 == 1 && var16 <= class23.field540 && var18 <= class4.field75 && var20 > class23.field540 && var19 > class4.field75) {
                        var22 = true;
                    }
                    if (class43.field1057 == 1 && var21) {
                        var23 = true;
                    }
                    if (var22 && class60.field1619 == null && (arg3 & 0x200) != 0 && !class55.field1432 && class136.method1140(-118, var12) != null) {
                        class86.field2145 = false;
                        class12.field273 = 0;
                        class91.field2238 = class80.field1969;
                        class60.field1619 = var12;
                        class37.field945 = class148.field3656;
                    }
                    if (class60.field1619 != null || class55.field1432) {
                        var21 = false;
                        var22 = false;
                        var23 = false;
                    }
                    if (!var12.field1334 && var22 && (arg3 & 0x1) != 0) {
                        var12.field1334 = true;
                        if (var12.field1406 != null) {
                            class39.method321(var12, (byte) -54, class4.field75 - var14, null, 0, var12.field1406, class23.field540 - var13);
                        }
                    }
                    if (var12.field1334 && var23 && (arg3 & 0x4) != 0 && var12.field1347 != null) {
                        class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1347, class148.field3656 - var13);
                    }
                    if (var12.field1334 && !var23 && (arg3 & 0x2) != 0) {
                        var12.field1334 = false;
                        if (var12.field1310 != null) {
                            class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1310, class148.field3656 - var13);
                        }
                    }
                    if (var23 && (arg3 & 0x8) != 0 && var12.field1388 != null) {
                        class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1388, class148.field3656 - var13);
                    }
                    if (!var12.field1360 && var21 && (arg3 & 0x10) != 0) {
                        var12.field1360 = true;
                        if (var12.field1322 != null) {
                            class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1322, class148.field3656 - var13);
                        }
                    }
                    if (var12.field1360 && var21 && (arg3 & 0x40) != 0 && var12.field1328 != null) {
                        class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1328, class148.field3656 - var13);
                    }
                    if (var12.field1360 && !var21 && (arg3 & 0x20) != 0) {
                        var12.field1360 = false;
                        if (var12.field1320 != null) {
                            class39.method321(var12, (byte) -54, class80.field1969 - var14, null, 0, var12.field1320, class148.field3656 - var13);
                        }
                    }
                    if (var12.field1353 != null && (arg3 & 0x80) != 0) {
                        class39.method321(var12, (byte) -54, 0, null, 0, var12.field1353, 0);
                    }
                    if (var21 && class33.field802 != 0 && var12.field1283 != null && (arg3 & 0x400) != 0) {
                        class39.method321(var12, (byte) -54, class33.field802, null, 0, var12.field1283, 0);
                    }
                    if ((arg3 & 0x100) != 0) {
                        if (var12.field1305 < class82.field2043 && var12.field1369 != null) {
                            class39.method321(var12, (byte) -54, 0, null, 0, var12.field1369, 0);
                        }
                        if (class111.field2771 > var12.field1305 && var12.field1298 != null) {
                            class39.method321(var12, (byte) -54, 0, null, 0, var12.field1298, 0);
                        }
                        if (var12.field1305 < class52.field1252 && var12.field1358 != null) {
                            class39.method321(var12, (byte) -54, 0, null, 0, var12.field1358, 0);
                        }
                        var12.field1305 = class101.field2444;
                    }
                }
            }
        }
        int var11 = -26 / ((arg1 - 44) / 40);
    }
}
