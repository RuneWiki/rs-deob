import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class98 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lcm;")
    private class192 field1406;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lo;")
    private class206 field1407;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lpg;")
    private class201 field1417;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "J")
    public static long field1409 = 0L;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lhi;")
    private class291 field1414;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Z")
    public static boolean field1408;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[Lbg;")
    public static class203[] field1404;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[Lii;")
    private class212[] field1418;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lfe;", line = 15)
    public static final class242 method659(int arg0, int arg1) {
        class242 var2 = (class242) class254.field4394.method1620(true, (long) arg1);
        field1420++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class313.field5421.method1381(class107.method714(arg1, (byte) 100), class227.method1566(arg1, 127), 0);
        class242 var4 = new class242();
        var4.field3988 = arg1;
        if (var3 != null) {
            var4.method1652(0, new class291(var3));
        }
        var4.method1657((byte) -80);
        if (arg0 != 255) {
            method659(-25, 98);
        }
        class254.field4394.method1614(var4, (long) arg1, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 45)
    public static void method660(int arg0) {
        field1404 = null;
        int var1 = -63 / ((arg0 + 34) / 55);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lsd;Lsd;ZBI)Lii;", line = 55)
    private final class212 method661(class27 arg0, class27 arg1, boolean arg2, byte arg3, int arg4) {
        field1413++;
        if (this.field1414 == null) {
            throw new RuntimeException();
        }
        this.field1414.field4946 = arg4 * 8 + 5;
        if (this.field1414.field4950.length <= this.field1414.field4946) {
            throw new RuntimeException();
        } else if (this.field1418[arg4] == null) {
            int var6 = this.field1414.method1969((byte) -16);
            int var7 = this.field1414.method1969((byte) -16);
            class212 var8 = new class212(arg4, arg1, arg0, this.field1406, this.field1407, var6, var7, arg2);
            if (arg3 <= 58) {
                field1408 = false;
            }
            this.field1418[arg4] = var8;
            return var8;
        } else {
            return this.field1418[arg4];
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLwm;)Z", line = 95)
    public static final boolean method662(boolean arg0, class152 arg1) {
        field1410++;
        if (arg0) {
            field1408 = true;
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class299.field5190; var2++) {
            if (arg1.method995(-104, class123.field1733[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lsd;BLsd;I)Lii;", line = 120)
    public final class212 method663(class27 arg0, byte arg1, class27 arg2, int arg3) {
        if (arg1 == 0) {
            field1415++;
            return this.method661(arg0, arg2, true, (byte) 70, arg3);
        } else {
            return (class212) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V", line = 131)
    public static final void method664(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 26) {
            return;
        }
        class303 var4 = class90.method589(false, arg0, 9);
        var4.method2117((byte) 45);
        field1416++;
        var4.field5219 = arg2;
        var4.field5208 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Z", line = 149)
    public final boolean method665(byte arg0) {
        field1405++;
        if (arg0 != -15) {
            this.field1417 = (class201) null;
        }
        if (this.field1414 != null) {
            return true;
        }
        if (this.field1417 == null) {
            if (this.field1406.method1269((byte) -89)) {
                return false;
            }
            this.field1417 = this.field1406.method1278(true, (byte) 0, 255, 255, (byte) 99);
        }
        if (this.field1417.field4823) {
            return false;
        } else {
            this.field1414 = new class291(this.field1417.method510((byte) -128));
            this.field1418 = new class212[(this.field1414.field4950.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIII)Lld;", line = 179)
    public static final class122 method666(int arg0, int arg1, int arg2, int arg3) {
        field1419++;
        class122 var4 = new class122();
        if (arg1 <= 125) {
            field1412 = 74;
        }
        var4.field1724 = arg2;
        var4.field1725 = arg0;
        class107.field1519.method1593((long) arg3, var4, 27497);
        class298.method2087(arg2, -1);
        class127 var5 = class11.method54(false, arg3);
        if (var5 != null) {
            class272.method1868(22889, var5);
        }
        if (class127.field1858 != null) {
            class272.method1868(22889, class127.field1858);
            class127.field1858 = null;
        }
        int var6 = class160.field2556;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class289.method1945(class273.field4688[var7], (byte) 84)) {
                class194.method1299(var7, (byte) 60);
            }
        }
        if (class160.field2556 == 1) {
            class70.field1016 = false;
            class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
        } else {
            class265.method1821(class267.field4503, class258.field4429, class128.field1957, class17.field232, (byte) -104);
            int var8 = class316.field5485.method1123(class48.field741);
            for (int var9 = 0; var9 < class160.field2556; var9++) {
                int var10 = class316.field5485.method1123(class6.method27(var9, -55));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class258.field4429 = (class180.field2874 ? 26 : 22) + class160.field2556 * 15;
            class17.field232 = var8 + 8;
        }
        if (var5 != null) {
            class193.method1288(123, false, var5);
        }
        class159.method1071(arg2, 1416);
        if (class253.field4387 != -1) {
            class157.method1058(1, -123, class253.field4387);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 262)
    public final void method667(boolean arg0) {
        field1421++;
        if (this.field1418 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1418.length; var2++) {
            if (this.field1418[var2] != null) {
                this.field1418[var2].method1424(true);
            }
        }
        if (!arg0) {
            this.method661((class27) null, (class27) null, true, (byte) 125, 116);
        }
        for (int var3 = 0; var3 < this.field1418.length; var3++) {
            if (this.field1418[var3] != null) {
                this.field1418[var3].method1428((byte) -111);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lcm;Lo;)V", line = 309)
    public class98(class192 arg0, class206 arg1) {
        this.field1406 = arg0;
        this.field1407 = arg1;
        if (!this.field1406.method1269((byte) -106)) {
            this.field1417 = this.field1406.method1278(true, (byte) 0, 255, 255, (byte) 99);
        }
    }
}
