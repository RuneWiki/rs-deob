import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class82 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Laj;")
    private class46 field1468 = new class46(256);

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Laj;")
    private class46 field1485 = new class46(256);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lkk;")
    private class223 field1483;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lkk;")
    private class223 field1478;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Leb;")
    public static class230 field1471 = class68.method589(0, "hint_mapedge");

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Leb;")
    public static class230 field1469 = class68.method589(0, "Untersuchen");

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[Leb;")
    public static class230[] field1480 = new class230[1000];

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Leb;")
    private static class230 field1482 = class68.method589(0, " is already on your friend list)3");

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Leb;")
    public static class230 field1481 = field1482;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Leb;")
    public static class230 field1484 = class68.method589(0, "(Z");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Leb;I)I")
    public static final int method662(class230 arg0, int arg1) {
        field1477++;
        if (arg1 != -3) {
            return -33;
        }
        for (int var2 = 0; var2 < class252.field4516.length; var2++) {
            if (class252.field4516[var2].method1612((byte) 15, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIZIII)V")
    public static final void method663(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1474++;
        int var7 = class106.method882(class15.field345, 1, class259.field4587, arg1);
        int var8 = class106.method882(class15.field345, 1, class259.field4587, arg5);
        int var9 = class106.method882(class78.field1404, 1, class42.field769, arg0);
        int var10 = class106.method882(class78.field1404, 1, class42.field769, arg2);
        int var11 = class106.method882(class15.field345, 1, class259.field4587, arg1 + arg6);
        if (arg3) {
            method668((class230) null, (byte) 53, 113, (class230) null);
        }
        int var12 = class106.method882(class15.field345, 1, class259.field4587, arg5 - arg6);
        for (int var13 = var7; var13 < var11; var13++) {
            class182.method1311(arg4, var10, true, class66.field1254[var13], var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class182.method1311(arg4, var10, true, class66.field1254[var14], var9);
        }
        int var15 = class106.method882(class78.field1404, 1, class42.field769, arg0 + arg6);
        int var16 = class106.method882(class78.field1404, 1, class42.field769, arg2 - arg6);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class66.field1254[var17];
            class182.method1311(arg4, var15, true, var18, var9);
            class182.method1311(arg4, var10, true, var18, var16);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[IB)Lqa;")
    public final class148 method664(int arg0, int[] arg1, byte arg2) {
        field1476++;
        if (this.field1483.method1522(-127) == 1) {
            return this.method670(arg0, false, 0, arg1);
        }
        int var4 = 98 % ((35 - arg2) / 33);
        if (this.field1483.method1533((byte) 83, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method670(0, false, arg0, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method665(byte arg0) {
        field1469 = null;
        field1482 = null;
        field1481 = null;
        if (arg0 > -118) {
            method662((class230) null, -5);
        }
        field1484 = null;
        field1471 = null;
        field1480 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([III)Lqa;")
    public final class148 method666(int[] arg0, int arg1, int arg2) {
        field1479++;
        if (this.field1478.method1522(-125) == 1) {
            return this.method667(arg0, 0, 65524, arg1);
        } else if (arg2 > -50) {
            return null;
        } else if (this.field1478.method1533((byte) 93, arg1) == 1) {
            return this.method667(arg0, arg1, 65524, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([IIII)Lqa;")
    private final class148 method667(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 ^ (arg1 >>> 12 | arg1 << 4 & arg2);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field1475++;
        class148 var9 = (class148) this.field1485.method394(var7, -21083);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class188 var10 = (class188) this.field1468.method394(var7, -21083);
            if (var10 == null) {
                var10 = class188.method1344(this.field1478, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1468.method388(-1, var7, var10);
            }
            class148 var11 = var10.method1339(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method518(116);
                this.field1485.method388(-1, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Leb;BILeb;)V")
    public static final void method668(class230 arg0, byte arg1, int arg2, class230 arg3) {
        field1472++;
        class89.field1579 = arg0;
        if (arg1 != 69) {
            method671((byte) 67);
        }
        class89.field1545 = arg3;
        class214.field3712 = arg2;
        if (class89.field1579.method1585(class89.field1580, arg1 + 47) || class89.field1545.method1585(class89.field1580, -73)) {
            class159.field2831 = 3;
        } else if (class7.field92 == -1) {
            class159.field2831 = -3;
            class231.field4018 = 1;
            class37.field698 = 0;
            class14 var4 = new class14(128);
            var4.method170((byte) 127, 10);
            var4.method181(-20053, (int) (Math.random() * 99999.0D));
            var4.method181(-20053, 516);
            var4.method148(class89.field1579.method1587(61), (byte) 119);
            var4.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
            var4.method197(arg1 - 69, class89.field1545);
            var4.method165((int) (Math.random() * 9.9999999E7D), 1380186760);
            var4.method163(class75.field1368, false, class75.field1363);
            class153.field2747.field318 = 0;
            class153.field2747.method170((byte) 125, 34);
            class153.field2747.method170((byte) 121, var4.field318);
            class153.field2747.method159(var4.field269, 0, false, var4.field318);
        } else {
            class92.method779(true);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method669(int arg0) {
        field1467++;
        class216.field3736 = 0;
        class105.field1911 = 0;
        class255.method1793(-16696);
        if (arg0 != -14444) {
            method668((class230) null, (byte) 20, -27, (class230) null);
        }
        class66.method580(8);
        class107.method884((byte) -103);
        class112.method900(arg0 + 9805);
        for (int var1 = 0; var1 < class216.field3736; var1++) {
            int var3 = class234.field4080[var1];
            if (class259.field4584 != class230.field4011[var3].field2256) {
                if (class230.field4011[var3].field4589 > 0) {
                    class178.method1295((byte) 49, class230.field4011[var3]);
                }
                class230.field4011[var3] = null;
            }
        }
        if (class16.field368 != class183.field3182.field318) {
            throw new RuntimeException("gpp1 pos:" + class183.field3182.field318 + " psize:" + class16.field368);
        }
        for (int var2 = 0; var2 < class169.field2984; var2++) {
            if (class230.field4011[class233.field4042[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class169.field2984);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZI[I)Lqa;")
    private final class148 method670(int arg0, boolean arg1, int arg2, int[] arg3) {
        field1470++;
        int var5 = ((arg2 & 0xE0000FFF) << 4 | arg2 >>> 12) ^ arg0;
        if (arg1) {
            return null;
        }
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class148 var9 = (class148) this.field1485.method394(var7, -21083);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class137 var10 = class137.method1056(this.field1483, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class148 var11 = var10.method1059();
            this.field1485.method388(-1, var7, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field2660.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method671(byte arg0) {
        for (class66 var1 = (class66) class230.field3972.method839(128); var1 != null; var1 = (class66) class230.field3972.method834((byte) 82)) {
            if (var1.field1245) {
                var1.method582(false);
            }
        }
        field1473++;
        for (class66 var2 = (class66) class201.field3563.method839(128); var2 != null; var2 = (class66) class201.field3563.method834((byte) 82)) {
            if (var2.field1245) {
                var2.method582(false);
            }
        }
        if (arg0 >= -50) {
            field1481 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkk;Lkk;)V")
    public class82(class223 arg0, class223 arg1) {
        this.field1483 = arg0;
        this.field1478 = arg1;
    }
}
