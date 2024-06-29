import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 extends class4 {

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Ljava/lang/String;")
    private String field1339 = "null";

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1347 = "Loading interfaces - ";

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Laf;")
    public static class68 field1331 = new class68(64);

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field1354 = 1;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "[I")
    public static int[] field1356 = new int[32];

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "J")
    public static long field1353 = 0L;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static volatile int field1357 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "C")
    public char field1330;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "C")
    public char field1343;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Lkd;")
    private class204 field1341;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lkd;")
    public class204 field1350;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "[I")
    public static int[] field1351;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZB)I")
    public static final int method612(boolean arg0, byte arg1) {
        field1345++;
        long var2 = class276.method1861((byte) 122);
        if (arg1 != -4) {
            method612(false, (byte) -27);
        }
        for (class117 var4 = arg0 ? (class117) class148.field2357.method1404(-42) : (class117) class148.field2357.method1412(-67); var4 != null; var4 = (class117) class148.field2357.method1412(-64)) {
            if (var2 > (var4.field1933 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1933 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3247;
                    class82.field1289[var5] = class43.field794[var5];
                    var4.method1388(89);
                    return var5;
                }
                var4.method1388(-118);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Log;IZ)V")
    private final void method613(class221 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1331 = null;
        }
        field1348++;
        if (arg1 == 1) {
            this.field1330 = class61.method439(-123, arg0.method1535((byte) -102));
        } else if (arg1 == 2) {
            this.field1343 = class61.method439(-113, arg0.method1535((byte) -110));
        } else if (arg1 == 3) {
            this.field1339 = arg0.method1539(-110);
        } else if (arg1 == 4) {
            this.field1344 = arg0.method1526(-16777216);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1521((byte) 113);
            this.field1350 = new class204(class120.method871(var4, -621722364));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1526(-16777216);
                class202 var7;
                if (arg1 == 5) {
                    var7 = new class261(arg0.method1539(-120));
                } else {
                    var7 = new class10(arg0.method1526(-16777216));
                }
                this.field1350.method1399(7292, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLwe;II)V")
    public static final void method614(byte arg0, class15 arg1, int arg2, int arg3) {
        int var4 = -16 / ((arg0 + 3) / 35);
        field1342++;
        if (arg1.field3378 == arg3 && arg3 != -1) {
            class181 var5 = class49.method384(arg3, -89);
            int var6 = var5.field2847;
            if (var6 == 1) {
                arg1.field3406 = arg2;
                arg1.field3354 = 0;
                arg1.field3334 = 1;
                arg1.field3386 = 0;
                arg1.field3312 = 0;
                class132.method934((byte) 112, var5, arg1.field3389, arg1.field3341, arg1.field3386, false);
            }
            if (var6 == 2) {
                arg1.field3312 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field3378 == -1 || class49.method384(arg3, -125).field2855 >= class49.method384(arg1.field3378, -110).field2855) {
            arg1.field3354 = 0;
            arg1.field3378 = arg3;
            arg1.field3312 = 0;
            arg1.field3334 = 1;
            arg1.field3346 = arg1.field3399;
            arg1.field3406 = arg2;
            arg1.field3386 = 0;
            if (arg1.field3378 == -1) {
                return;
            }
            class132.method934((byte) 112, class49.method384(arg1.field3378, -91), arg1.field3389, arg1.field3341, arg1.field3386, false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
    private final void method615(boolean arg0) {
        this.field1341 = new class204(this.field1350.method1407((byte) 76));
        class261 var2 = (class261) this.field1350.method1404(103);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            class127 var3 = new class127(var2.field4146, (int) var2.field3247);
            this.field1341.method1399(7292, var3, class177.method1207(108, var2.field4146));
            var2 = (class261) this.field1350.method1412(-116);
        }
        field1333++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    private final void method616(byte arg0) {
        field1336++;
        int var2 = -74 / ((arg0 - 43) / 45);
        this.field1341 = new class204(this.field1350.method1407((byte) 76));
        for (class10 var3 = (class10) this.field1350.method1404(-36); var3 != null; var3 = (class10) this.field1350.method1412(-127)) {
            class10 var4 = new class10((int) var3.field3247);
            this.field1341.method1399(7292, var4, (long) var3.field143);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z")
    public final boolean method617(int arg0, int arg1) {
        field1340++;
        if (this.field1350 == null) {
            return false;
        }
        if (this.field1341 == null) {
            this.method616((byte) 114);
        }
        class10 var3 = (class10) this.field1341.method1400((long) arg0, true);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 15612) {
                this.method618(-38, (byte) -98);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method618(int arg0, byte arg1) {
        field1335++;
        if (this.field1350 == null) {
            return this.field1339;
        } else {
            int var3 = 76 % ((83 - arg1) / 35);
            class261 var4 = (class261) this.field1350.method1400((long) arg0, true);
            return var4 == null ? this.field1339 : var4.field4146;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method619(int arg0, String arg1) {
        if (arg0 != 5406) {
            this.field1350 = null;
        }
        field1334++;
        if (this.field1350 == null) {
            return false;
        }
        if (this.field1341 == null) {
            this.method615(false);
        }
        for (class127 var3 = (class127) this.field1341.method1400(class177.method1207(99, arg1), true); var3 != null; var3 = (class127) this.field1341.method1405((byte) 61)) {
            if (var3.field2049.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static void method620(int arg0) {
        if (arg0 != -26415) {
            method623((class201) null, -24, (String) null);
        }
        field1347 = null;
        field1331 = null;
        field1356 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg7 != 11027) {
            return true;
        }
        field1355++;
        if (class167.field2655.method278(0) == 2) {
            return class33.method282(arg0, arg8, arg3, arg11, arg2, arg9, arg10, arg5, arg4, arg1, 101, arg6);
        } else if (class167.field2655.method278(0) > 2) {
            return class284.method1913(arg1, arg0, -1, arg5, arg8, class167.field2655.method278(arg7 - 11027), arg2, arg4, arg11, arg3, arg9, arg10, arg6);
        } else {
            return class128.method911(arg6, arg0, arg2, arg3, arg11, arg8, arg4, arg9, -1, arg5, arg10, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILog;)V")
    public final void method622(int arg0, class221 arg1) {
        field1337++;
        if (arg0 != 0) {
            this.method616((byte) 41);
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method613(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lqh;ILjava/lang/String;)Ln;")
    public static final class16 method623(class201 arg0, int arg1, String arg2) {
        field1332++;
        int var3 = arg0.method1373(67, arg2);
        if (var3 == -1) {
            return new class16(0);
        }
        int[] var4 = arg0.method1360(1, var3);
        class16 var5 = new class16(var4.length);
        for (int var6 = arg1; var6 < var5.field275; var6++) {
            class221 var7 = new class221(arg0.method1357(var4[var6], var3, -1));
            var5.field266[var6] = var7.method1539(39);
            var5.field270[var6] = var7.method1535((byte) -118);
            var5.field276[var6] = (short) var7.method1521((byte) 113);
            var5.field264[var6] = (short) var7.method1521((byte) 113);
            var5.field278[var6] = var7.method1526(-16777216);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)I")
    public final int method624(int arg0, int arg1) {
        if (arg1 != -1) {
            return -51;
        }
        field1338++;
        if (this.field1350 == null) {
            return this.field1344;
        } else {
            class10 var3 = (class10) this.field1350.method1400((long) arg0, true);
            return var3 == null ? this.field1344 : var3.field143;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(Z)V")
    public static final void method625(boolean arg0) {
        field1346++;
        int var1 = class67.field1103.method540(8, 882786883);
        if (class155.field2514 > var1) {
            for (int var2 = var1; var2 < class155.field2514; var2++) {
                class33.field522[class149.field2394++] = class57.field973[var2];
            }
        }
        if (class155.field2514 < var1) {
            throw new RuntimeException("gppov1");
        }
        class155.field2514 = 0;
        if (!arg0) {
            field1352 = -12;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class57.field973[var3];
            class33 var5 = class35.field548[var4];
            int var6 = class67.field1103.method540(1, 882786883);
            if (var6 == 0) {
                class57.field973[class155.field2514++] = var4;
                var5.field3376 = class222.field3682;
            } else {
                int var7 = class67.field1103.method540(2, 882786883);
                if (var7 == 0) {
                    class57.field973[class155.field2514++] = var4;
                    var5.field3376 = class222.field3682;
                    class106.field1701[class43.field802++] = var4;
                } else if (var7 == 1) {
                    class57.field973[class155.field2514++] = var4;
                    var5.field3376 = class222.field3682;
                    int var8 = class67.field1103.method540(3, 882786883);
                    var5.method1426(1, var8, -1);
                    int var9 = class67.field1103.method540(1, 882786883);
                    if (var9 == 1) {
                        class106.field1701[class43.field802++] = var4;
                    }
                } else if (var7 == 2) {
                    class57.field973[class155.field2514++] = var4;
                    var5.field3376 = class222.field3682;
                    if (class67.field1103.method540(1, 882786883) == 1) {
                        int var10 = class67.field1103.method540(3, 882786883);
                        var5.method1426(2, var10, -1);
                        int var11 = class67.field1103.method540(3, 882786883);
                        var5.method1426(2, var11, -1);
                    } else {
                        int var12 = class67.field1103.method540(3, 882786883);
                        var5.method1426(0, var12, -1);
                    }
                    int var13 = class67.field1103.method540(1, 882786883);
                    if (var13 == 1) {
                        class106.field1701[class43.field802++] = var4;
                    }
                } else if (var7 == 3) {
                    class33.field522[class149.field2394++] = var4;
                }
            }
        }
    }
}
