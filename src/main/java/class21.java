import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class21 {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "B")
    private byte field461;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field458 = -2;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Loc;")
    public static class151 field471 = class137.method873(2, "(U1");

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
    public static int[] field470 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Loc;")
    public static class151 field474 = class137.method873(2, "Registrierter Benutzer");

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Luf;")
    public static class214 field467;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILwd;III)V")
    public static final void method177(int arg0, int arg1, int arg2, class232 arg3, int arg4, int arg5, int arg6) {
        field456++;
        int var7 = arg4 * arg4 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        if (arg1 != 5238) {
            method180(-91, (byte) 62);
        }
        int var8 = Math.min(arg3.field4215 / 2, arg3.field4216 / 2);
        if (var8 * var8 >= var7) {
            class138.method887(arg4, -110, arg3, arg5, class110.field1944[arg0], arg2, arg6);
            return;
        }
        var8 -= 10;
        int var9 = class94.field1761 + class121.field2178 & 0x7FF;
        int var10 = class61.field1191[var9];
        int var11 = class61.field1208[var9];
        int var12 = var11 * 256 / (class151.field2693 + 256);
        int var13 = var10 * 256 / (class151.field2693 + 256);
        int var14 = arg4 * var13 + arg6 * var12 >> 16;
        int var15 = arg4 * var12 - arg6 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        class224.field3910[arg0].method549(arg2 + arg3.field4215 / 2 + var18 - 10, arg5 - 10 + arg3.field4216 / 2 + -var19, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
    public final int method178(int arg0) {
        field454++;
        if (arg0 >= -116) {
            field474 = null;
        }
        return (this.field461 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method179(byte arg0) {
        for (int var1 = 0; var1 < class182.field3299; var1++) {
            int var10002 = class155.field2800[var1]--;
            if (class155.field2800[var1] >= -10) {
                class199 var3 = class141.field2561[var1];
                if (var3 == null) {
                    var3 = class199.method1246(class56.field1126, class128.field2305[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class155.field2800[var1] += var3.method1249();
                    class141.field2561[var1] = var3;
                }
                if (class155.field2800[var1] < 0) {
                    int var10;
                    if (class57.field1154[var1] == 0) {
                        var10 = class7.field104;
                    } else {
                        int var4 = (class57.field1154[var1] & 0xFF) * 128;
                        int var5 = class57.field1154[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class228.field3975.field3976;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class57.field1154[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class228.field3975.field4029;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class155.field2800[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class57.field1139 / var4;
                    }
                    if (var10 > 0) {
                        class135 var11 = var3.method1247().method827(class195.field3480);
                        class136 var12 = class136.method847(var11, 100, var10);
                        var12.method828(class120.field2168[var1] - 1);
                        class109.field1937.method752(var12);
                    }
                    class155.field2800[var1] = -100;
                }
            } else {
                class182.field3299--;
                for (int var2 = var1; var2 < class182.field3299; var2++) {
                    class128.field2305[var2] = class128.field2305[var2 + 1];
                    class141.field2561[var2] = class141.field2561[var2 + 1];
                    class120.field2168[var2] = class120.field2168[var2 + 1];
                    class155.field2800[var2] = class155.field2800[var2 + 1];
                    class57.field1154[var2] = class57.field1154[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -46) {
            field467 = null;
        }
        field465++;
        if (class149.field2669 && !class193.method1216(0)) {
            if (class156.field2825 != 0 && class12.field247 != -1) {
                class189.method1168(false, class16.field363, 0, class156.field2825, class12.field247, (byte) -111);
            }
            class149.field2669 = false;
        } else if (class156.field2825 != 0 && class12.field247 != -1 && !class193.method1216(0)) {
            class48.field984.method650(arg0 ^ 0x35B5, 166);
            class48.field984.method1461(class12.field247, (byte) 40);
            class132.field2421++;
            class12.field247 = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)I")
    public static final int method180(int arg0, byte arg1) {
        if (arg1 <= 39) {
            return 33;
        } else {
            field466++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method181(int arg0) {
        field471 = null;
        if (arg0 <= 38) {
            field467 = null;
        }
        field470 = null;
        field474 = null;
        field467 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class21() {
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLsd;)V")
    public static final void method182(byte arg0, class192 arg1) {
        class56.field1132 = arg1;
        if (arg0 <= -111) {
            field469++;
            class208.field3659 = class56.field1132.method1210(true, 4);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
    public final int method183(int arg0) {
        field460++;
        if (arg0 < 36) {
            this.field461 = -19;
        }
        return this.field461 & 0x7;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lwa;)V")
    public class21(class229 arg0) {
        this.field461 = arg0.method1457(-2);
        this.field464 = arg0.method1490((byte) 73);
        this.field457 = arg0.method1437(425528536);
        this.field468 = arg0.method1437(425528536);
        this.field463 = arg0.method1437(425528536);
        this.field455 = arg0.method1437(425528536);
    }
}
