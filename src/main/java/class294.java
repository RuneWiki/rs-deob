import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class294 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lqr;")
    private class65 field4206 = new class65(256);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lrv;")
    private class111 field4212;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ld;")
    private class152 field4208;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lvfa;")
    public static class672 field4214 = null;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lmha;")
    public static class419 field4215 = new class419(1, 2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(DZ)V")
    public static final void method1817(double arg0, boolean arg1) {
        if (class305.field4393 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class730.field10133[var3] = var4 <= 255 ? var4 : 255;
            }
            class305.field4393 = arg0;
        }
        if (arg1) {
            method1817(-1.0597081502259316D, true);
        }
        field4211++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field4215 = null;
        field4214 = null;
        if (arg0 != 29281) {
            field4215 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZZII)I")
    public static final int method1819(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 <= 121) {
            field4215 = null;
        }
        field4213++;
        class287 var5 = class271.method1629(arg2, arg3, (byte) -60);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field4061.length; var7++) {
            if (var5.field4061[var7] >= 0 && var5.field4061[var7] < class77.field948.field2463) {
                class597 var8 = class77.field948.method1165((byte) 117, var5.field4061[var7]);
                int var9 = var8.method3259(class505.field6754.method4149(-6119, arg4).field761, -1, arg4);
                if (arg1) {
                    var6 += var5.field4063[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1820(int arg0, byte arg1) {
        int var2 = 73 % ((56 - arg1) / 53);
        field4205++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lfb;Z)Z")
    public static final boolean method1821(class675 arg0, boolean arg1) {
        boolean var2 = class588.field7675 == class507.field6771;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method794((byte) -127);
        if (arg0.field9367 < 0 || arg0.field9354 < 0 || arg0.field9361 >= class735.field10163 || arg0.field9360 >= class143.field2290) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field9367; var7 <= arg0.field9361; var7++) {
            for (int var11 = arg0.field9354; var11 <= arg0.field9360; var11++) {
                class701 var12 = class229.method1455(arg0.field3508, var7, var11);
                if (var12 != null) {
                    class10 var13 = class691.method3900(31296, arg0);
                    class10 var14 = var12.field9742;
                    if (var14 == null) {
                        var12.field9742 = var13;
                    } else {
                        while (var14.field174 != null) {
                            var14 = var14.field174;
                        }
                        var14.field174 = var13;
                    }
                    if (var2 && (class363.field5106[var7][var11] & 0xFF000000) != 0) {
                        var3 = class363.field5106[var7][var11];
                        var4 = class649.field8625[var7][var11];
                        var5 = class671.field9152[var7][var11];
                    }
                    if (!arg1 && var12.field9738 != null && var12.field9738.field7274 > var6) {
                        var6 = var12.field9738.field7274;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field9367; var8 <= arg0.field9361; var8++) {
                for (int var9 = arg0.field9354; var9 <= arg0.field9360; var9++) {
                    if ((class363.field5106[var8][var9] & 0xFF000000) == 0) {
                        class363.field5106[var8][var9] = var3;
                        class649.field8625[var8][var9] = var4;
                        class671.field9152[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class43.field572[class197.field2980++] = arg0;
        } else {
            int var10 = class588.field7675 == class507.field6771 ? 1 : 0;
            if (!arg0.method806((byte) 114)) {
                arg0.field3513 = class15.field214[var10];
                class15.field214[var10] = arg0;
            } else if (arg0.method801(false)) {
                arg0.field3513 = class8.field162[var10];
                class8.field162[var10] = arg0;
            } else {
                arg0.field3513 = class496.field6694[var10];
                class496.field6694[var10] = arg0;
                class302.field4291 = true;
            }
        }
        if (arg1) {
            arg0.field3510 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
    public static final boolean method1822(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field4214 = null;
        }
        field4207++;
        if (arg2 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg2 >= 1000 || arg0 >= 1000) {
            return arg2 >= 1000 && arg0 >= 1000;
        } else if (class425.method2455(arg0, -22)) {
            return true;
        } else {
            return !class425.method2455(arg2, -102);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)Ltr;")
    public final class297 method1823(int arg0, byte arg1) {
        field4216++;
        Object var3 = this.field4206.method552(4, (long) arg0);
        if (var3 != null) {
            return (class297) var3;
        } else if (this.field4208.method85(arg0, -32345)) {
            class758 var4 = this.field4208.method91(arg0, (byte) 125);
            int var5 = var4.field10548 ? 64 : this.field4212.field1725;
            class297 var7;
            if (var4.field10538 && this.field4212.method459()) {
                float[] var6 = this.field4208.method87(var5, false, var5, arg0, 0.7F, -2202);
                var7 = this.field4212.method826(var6, var5, var4.field10535 != 0, class315.field4498, -117, var5);
            } else {
                int[] var8;
                if (var4.field10541 != 2 && class620.method3416(var4.field10536, (byte) -14)) {
                    var8 = this.field4208.method86(-119, var5, 0.7F, true, arg0, var5);
                } else {
                    var8 = this.field4208.method92(false, (byte) 115, var5, var5, 0.7F, arg0);
                }
                var7 = this.field4212.method927(var5, var8, (byte) -54, var4.field10535 != 0, var5);
            }
            var7.method595(1645, var4.field10551, var4.field10544);
            if (arg1 != -125) {
                this.field4208 = null;
            }
            this.field4206.method556((byte) 0, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrv;Ld;)V")
    public class294(class111 arg0, class152 arg1) {
        this.field4212 = arg0;
        this.field4208 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public final void method1824(int arg0) {
        this.field4206.method553(arg0, arg0 ^ 0xFFFFC25F);
        field4209++;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method1825(int arg0) {
        field4210++;
        if (arg0 != 1000) {
            method1818(82);
        }
        this.field4206.method561((byte) -78);
    }
}
