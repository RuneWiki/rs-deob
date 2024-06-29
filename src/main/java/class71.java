import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class71 {

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lqg;")
    private class182 field1372 = new class182();

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Ljh;")
    private class106 field1374 = new class106();

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lff;")
    private class62 field1373;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    public static int[] field1358 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lkh;")
    public static class117 field1357 = class224.method1450((byte) 113, "k");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[S")
    public static short[] field1355 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lkh;")
    public static class117 field1363 = class224.method1450((byte) -16, "(U5");

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lff;")
    public static class62 field1364 = new class62(4096);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ls;")
    public static class197 field1365;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lvb;")
    public static class232 field1376;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JLqg;I)V")
    public final void method497(long arg0, class182 arg1, int arg2) {
        if (arg2 >= -88) {
            this.field1374 = null;
        }
        if (this.field1375 == 0) {
            class182 var5 = this.field1374.method714((byte) -103);
            var5.method123((byte) -126);
            var5.method1254(false);
            if (this.field1372 == var5) {
                class182 var6 = this.field1374.method714((byte) -103);
                var6.method123((byte) -126);
                var6.method1254(false);
            }
        } else {
            this.field1375--;
        }
        field1356++;
        this.field1373.method461(arg0, (byte) -117, arg1);
        this.field1374.method707(31164, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lb;")
    public final class12 method498(byte arg0) {
        field1370++;
        if (arg0 != -3) {
            method502(null, 62, (byte) -108);
        }
        return this.field1373.method459((byte) -87);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)Lkh;")
    public static final class117 method499(boolean arg0, int arg1, int arg2) {
        if (arg1 != -8259) {
            method508(null, 11);
        }
        field1369++;
        return class125.method868((byte) -125, arg0, arg2, 10);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Lb;")
    public final class12 method500(boolean arg0) {
        if (arg0) {
            this.method500(true);
        }
        field1367++;
        return this.field1373.method456((byte) 123);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method501(int arg0) {
        field1363 = null;
        field1357 = null;
        field1355 = null;
        field1358 = null;
        if (arg0 != 1) {
            method508(null, 56);
        }
        field1364 = null;
        field1376 = null;
        field1365 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lai;IB)Z")
    public static final boolean method502(class10 arg0, int arg1, byte arg2) {
        field1366++;
        byte[] var3 = arg0.method88(98, arg1);
        if (arg2 != 26) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            class200.method1335((byte) 94, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method503(int arg0) {
        while (true) {
            class182 var2 = this.field1374.method714((byte) -103);
            if (var2 == null) {
                field1361++;
                if (arg0 != 10) {
                    this.field1374 = null;
                }
                this.field1375 = this.field1377;
                return;
            }
            var2.method123((byte) -126);
            var2.method1254(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
    public static final void method504(boolean arg0, int arg1) {
        field1362++;
        if (arg1 != 24744) {
            method502(null, -15, (byte) 18);
        }
        class6.method45(arg0, (byte) -128, class97.field1793, class92.field1697, class124.field2324);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lai;Lkh;Lkh;B)[Lr;")
    public static final class186[] method505(class10 arg0, class117 arg1, class117 arg2, byte arg3) {
        if (arg3 != 104) {
            method508(null, -97);
        }
        field1368++;
        int var4 = arg0.method84(arg1, 1491);
        int var5 = arg0.method102(false, arg2, var4);
        return class221.method1436(arg0, var5, var4, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lqg;")
    public final class182 method506(int arg0, long arg1) {
        field1360++;
        class182 var4 = (class182) this.field1373.method460(arg1, arg0);
        if (var4 != null) {
            this.field1374.method707(31164, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IJ)V")
    public final void method507(int arg0, long arg1) {
        if (arg0 > -68) {
            this.method503(-73);
        }
        field1371++;
        class182 var4 = (class182) this.field1373.method460(arg1, 1);
        if (var4 != null) {
            var4.method123((byte) -126);
            var4.method1254(false);
            this.field1375++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lnc;I)Lkj;")
    public static final class119 method508(class145 arg0, int arg1) {
        if (arg1 != 4096) {
            method502(null, -12, (byte) -95);
        }
        field1359++;
        return new class119(arg0.method1035(arg1 ^ 0xFFFFEF9D), arg0.method1035(-110), arg0.method1035(-93), arg0.method1035(-100), arg0.method1035(-111), arg0.method1035(-127), arg0.method1035(-97), arg0.method1035(arg1 - 4194), arg0.method1023(arg1 ^ 0xFFF0A308), arg0.method998(118));
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class71(int arg0) {
        this.field1377 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1375 = arg0;
        this.field1373 = new class62(var2);
    }
}
