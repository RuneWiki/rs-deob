import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class184 extends class202 {

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Z")
    public boolean field3326 = true;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public int field3328 = -1;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public int field3325 = 12800;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public int field3333 = 0;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public int field3336 = 12800;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public int field3337 = 0;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Loh;")
    public class263 field3321;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "Loh;")
    public class263 field3339;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lli;")
    public class277 field3329;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lti;")
    public static class5 field3327 = new class5(32);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Loh;")
    public static class263 field3330 = class253.method1681(-127, "Untersuchen");

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Loh;")
    public static class263 field3340 = class253.method1681(-124, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public final void method1216(byte arg0) {
        field3334++;
        this.field3333 = 0;
        if (arg0 != -55) {
            return;
        }
        this.field3325 = 12800;
        this.field3337 = 0;
        this.field3336 = 12800;
        for (class106 var2 = (class106) this.field3329.method1878(true); var2 != null; var2 = (class106) this.field3329.method1881(109)) {
            if (this.field3325 > var2.field2012) {
                this.field3325 = var2.field2012;
            }
            if (var2.field1994 > this.field3333) {
                this.field3333 = var2.field1994;
            }
            if (this.field3336 > var2.field1997) {
                this.field3336 = var2.field1997;
            }
            if (var2.field1995 > this.field3337) {
                this.field3337 = var2.field1995;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public static final void method1217(int arg0, int arg1, int arg2) {
        field3323++;
        class277 var3 = class107.field2020[class12.field321][arg1][arg2];
        if (var3 == null) {
            class75.method494(class12.field321, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class109 var5 = null;
        for (class109 var6 = (class109) var3.method1878(true); var6 != null; var6 = (class109) var3.method1881(105)) {
            class72 var13 = class92.method649(-32508, var6.field2050.field342);
            int var14 = var13.field1460;
            if (var13.field1487 == 1) {
                var14 = (var6.field2050.field350 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class75.method494(class12.field321, arg1, arg2);
            return;
        }
        class13 var7 = null;
        var3.method1880((byte) -92, var5);
        class109 var8 = (class109) var3.method1878(true);
        class13 var9 = null;
        while (var8 != null) {
            class13 var12 = var8.field2050;
            if (var5.field2050.field342 != var12.field342) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field342 != var12.field342 && var7 == null) {
                    var7 = var12;
                }
            }
            var8 = (class109) var3.method1881(-123);
        }
        long var10 = (long) ((arg2 << 7) + arg1 + arg0);
        class3.method18(class12.field321, arg1, arg2, class120.method781(class12.field321, arg1 * 128 + 64, false, arg2 * 128 + 64), var5.field2050, var10, var9, var7);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field3327 = null;
        if (arg0 > 126) {
            field3330 = null;
            field3340 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1219(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field3331 = -36;
        }
        field3320++;
        if (this.field3336 > arg1 || arg1 > this.field3337 || arg0 < this.field3325 || this.field3333 < arg0) {
            return false;
        }
        for (class106 var4 = (class106) this.field3329.method1878(arg2); var4 != null; var4 = (class106) this.field3329.method1881(66)) {
            if (var4.method712(arg0, arg1, true)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lsi;Z)V")
    public static final void method1220(class194 arg0, boolean arg1) {
        field3322++;
        while (true) {
            while (arg0.field3497 < arg0.field3469.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1301(-8317) == 1) {
                    var4 = arg0.method1301(-8317);
                    var2 = true;
                    var3 = arg0.method1301(-8317);
                }
                int var5 = arg0.method1301(-8317);
                int var6 = arg0.method1301(-8317);
                int var7 = class116.field2163 - (var6 * 64 - (class112.field2110 - 1));
                int var8 = var5 * 64 - class54.field1146;
                if (var8 >= 0 && (var7 - 63) >= 0 && class8.field149 > var8 + 63 && class112.field2110 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && var11 < (var4 * 8 + 8) && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method1281((byte) -72);
                                if (var13 != 0) {
                                    if (class77.field1575[var10][var9] == null) {
                                        class77.field1575[var10][var9] = new byte[4096];
                                    }
                                    class77.field1575[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1281((byte) 127);
                                    if (class122.field2274[var10][var9] == null) {
                                        class122.field2274[var10][var9] = new byte[4096];
                                    }
                                    class122.field2274[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1281((byte) -13);
                        if (var16 != 0) {
                            arg0.field3497++;
                        }
                    }
                }
            }
            if (!arg1) {
                field3330 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Loh;Loh;IIIZ)V")
    public class184(class263 arg0, class263 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3321 = arg0;
        this.field3339 = arg1;
        this.field3328 = arg4;
        this.field3326 = arg5;
        this.field3324 = arg2;
        this.field3331 = arg3;
        this.field3329 = new class277();
    }
}
