import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class205 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    public static int[] field3489 = new int[32];

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lub;")
    public static class227 field3493 = class257.method1749(" )2> <col=ffff00>", 17263);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lub;")
    public static class227 field3491 = class257.method1749("::tele 0)1", 17263);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[[S")
    public static short[][] field3487;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILn;BIIZ)V")
    public static final void method1312(int arg0, class138 arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        class148.field2587 = arg3;
        class252.field4359 = arg1;
        class12.field239 = 10000;
        class22.field387 = arg0;
        class235.field4076 = arg5;
        if (arg2 > 36) {
            field3494++;
            class140.field2419 = 1;
            class72.field1257 = arg4;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLqa;II)V")
    public static final void method1313(byte arg0, class225 arg1, int arg2, int arg3) {
        if ((arg3 & 0x8) != 0) {
            int var4 = class32.field512.method1481(false);
            int var5 = class32.field512.method1456(-9944);
            int var6 = class32.field512.method1439(-123);
            int var7 = class32.field512.field3879;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg1.field3819 != null && arg1.field3820 != null) {
                long var9 = arg1.field3819.method1485(arg0 + 239);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var8 && class252.field4363 == 1 || class49.field858 == 1) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class86.field1485; var12++) {
                            if (class230.field4031[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class251.field4348 == 0) {
                    class77.field1355.field3879 = 0;
                    class32.field512.method1477(0, var6, (byte) 94, class77.field1355.field3901);
                    int var13 = -1;
                    class77.field1355.field3879 = 0;
                    class227 var15;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class58 var14 = class122.method754(class77.field1355, false);
                        var13 = var14.field1062;
                        var15 = var14.field1078.method797(class77.field1355, -48);
                    } else {
                        var15 = class196.method1249(class67.method419(class77.field1355, -27885).method1490(true));
                    }
                    arg1.field88 = var15.method1519(-19150);
                    arg1.field40 = var4 >> 8;
                    arg1.field71 = 150;
                    arg1.field43 = var4 & 0xFF;
                    if (var5 == 2) {
                        class181.method1160(class76.method445((byte) 82, new class227[] { class105.field1897, arg1.field3819 }), 0, var13, var15, var8 ? 17 : 1, (class227) null);
                    } else if (var5 == 1) {
                        class181.method1160(class76.method445((byte) 87, new class227[] { class88.field1531, arg1.field3819 }), 0, var13, var15, var8 ? 17 : 1, (class227) null);
                    } else {
                        class181.method1160(arg1.field3819, 0, var13, var15, var8 ? 17 : 2, (class227) null);
                    }
                }
            }
            class32.field512.field3879 = var6 + var7;
        }
        field3486++;
        if (arg0 != -117) {
            return;
        }
        if ((arg3 & 0x10) != 0) {
            int var16 = class32.field512.method1482(-128);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class32.field512.method1471(arg0 + 372);
            class151.method954(arg0 ^ 0xFFFFFF88, arg1, var17, var16);
        }
        if ((arg3 & 0x200) != 0) {
            int var18 = class32.field512.method1426(false);
            int var19 = class32.field512.method1471(255);
            arg1.method15((byte) 90, class253.field4393, var19, var18);
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field48 = class32.field512.method1456(-9944);
            arg1.field93 = class32.field512.method1456(-9944);
            arg1.field90 = class32.field512.method1456(-9944);
            arg1.field80 = class32.field512.method1426(false);
            arg1.field66 = class32.field512.method1482(-128) + class253.field4393;
            arg1.field65 = class32.field512.method1472(0) + class253.field4393;
            arg1.field98 = class32.field512.method1456(-9944);
            arg1.field111 = 1;
            arg1.field76 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            int var20 = class32.field512.method1456(-9944);
            int var21 = class32.field512.method1456(arg0 - 9827);
            arg1.method15((byte) 68, class253.field4393, var21, var20);
            arg1.field104 = class253.field4393 + 300;
            arg1.field77 = class32.field512.method1471(255);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field88 = class32.field512.method1480(arg0 ^ 0xFFFFFFFB);
            if (arg1.field88.method1533((byte) 39, 0) == 126) {
                arg1.field88 = arg1.field88.method1517((byte) -102, 1);
                class130.method799(1403, 2, arg1.field3819, arg1.field88);
            } else if (class216.field3639 == arg1) {
                class130.method799(1403, 2, arg1.field3819, arg1.field88);
            }
            arg1.field40 = 0;
            arg1.field71 = 150;
            arg1.field43 = 0;
        }
        if ((arg3 & 0x80) != 0) {
            arg1.field54 = class32.field512.method1482(-128);
            arg1.field87 = class32.field512.method1481(false);
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field69 = class32.field512.method1482(-128);
            int var22 = class32.field512.method1441(arg0 - 2);
            arg1.field109 = 0;
            arg1.field97 = class253.field4393 + (var22 & 0xFFFF);
            arg1.field46 = var22 >> 16;
            if (arg1.field69 == 65535) {
                arg1.field69 = -1;
            }
            arg1.field110 = 0;
            if (arg1.field97 > class253.field4393) {
                arg1.field109 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg1.field108 = class32.field512.method1447(0);
            if (arg1.field108 == 65535) {
                arg1.field108 = -1;
            }
        }
        if ((arg3 & 0x1) == 0) {
            return;
        }
        int var23 = class32.field512.method1426(false);
        byte[] var24 = new byte[var23];
        class226 var25 = new class226(var24);
        class32.field512.method1435(var24, var23, (byte) -13, 0);
        class42.field684[arg2] = var25;
        arg1.method1419((byte) 17, var25);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method1314(boolean arg0) {
        if (!arg0) {
            method1314(false);
        }
        field3491 = null;
        field3487 = null;
        field3489 = null;
        field3493 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ln;BLn;)I")
    public static final int method1315(class138 arg0, byte arg1, class138 arg2) {
        field3492++;
        int var3 = 0;
        if (arg0.method876(true, class44.field734)) {
            var3++;
        }
        if (arg0.method876(true, class67.field1212)) {
            var3++;
        }
        if (arg1 != -82) {
            method1312(-120, (class138) null, (byte) -16, -83, 50, true);
        }
        if (arg0.method876(true, class172.field2871)) {
            var3++;
        }
        if (arg2.method876(true, class44.field734)) {
            var3++;
        }
        if (arg2.method876(true, class67.field1212)) {
            var3++;
        }
        if (arg2.method876(true, class172.field2871)) {
            var3++;
        }
        return var3;
    }
}
