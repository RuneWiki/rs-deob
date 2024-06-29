import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class212 implements class658 {

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "Lqea;")
    private class139 field2504;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "[Lg;")
    private class167[] field2496;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
    public static int[] field2500 = new int[14];

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "[I")
    public static int[] field2508 = new int[4];

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "Lcr;")
    public static class600 field2505;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "Lha;")
    private class66 field2509;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
    private boolean field2499;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 4)
    public final void method290(int arg0) {
        field2501++;
        if (arg0 >= -84) {
            this.method281(false);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)V", line = 15)
    public static void method1336(byte arg0) {
        field2508 = null;
        field2500 = null;
        field2505 = null;
        if (arg0 < 96) {
            field2500 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)I", line = 27)
    public final int method291(byte arg0) {
        if (arg0 <= 86) {
            this.field2499 = false;
        }
        field2507++;
        return this.field2504.field1735;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V", line = 40)
    public final void method293(boolean arg0, boolean arg1) {
        boolean var3 = true;
        field2497++;
        class167[] var4 = this.field2496;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class167 var6 = var4[var5];
            if (var6 != null) {
                var6.method821(-79, var3 || this.field2499);
            }
        }
        this.field2499 = arg1;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(JI)Z", line = 69)
    public final boolean method286(long arg0, int arg1) {
        int var4 = 28 / ((arg1 - 83) / 36);
        field2506++;
        return class349.method2069(true) >= (arg0 + ((long) this.field2504.field1736));
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V", line = 79)
    public final void method285(int arg0) {
        if (class363.field4526 != this.field2509) {
            this.field2499 = true;
            this.field2509 = class363.field4526;
        }
        field2502++;
        if (arg0 != 4088) {
            this.field2504 = null;
        }
        this.field2509.method13(0);
        class167[] var2 = this.field2496;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            if (var4 != null) {
                var4.method684(30573);
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIIII)V", line = 113)
    public static final void method1337(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2503++;
        if (arg0) {
            return;
        }
        for (class96 var5 = (class96) class477.field6625.method2725(37); var5 != null; var5 = (class96) class477.field6625.method2726(-120)) {
            class396.method2319(arg3, arg2, var5, arg4, arg1, -8193);
        }
        for (class96 var6 = (class96) class599.field8109.method2725(37); var6 != null; var6 = (class96) class599.field8109.method2726(-120)) {
            byte var12 = 1;
            class15 var13 = var6.field1281.method1676(0);
            if (var6.field1281.field3399 == -1 || var6.field1281.field3426) {
                var12 = 0;
            } else if (var6.field1281.field3399 == var13.field245 || var6.field1281.field3399 == var13.field241 || var6.field1281.field3399 == var13.field258 || var6.field1281.field3399 == var13.field270) {
                var12 = 2;
            } else if (var6.field1281.field3399 == var13.field271 || var6.field1281.field3399 == var13.field276 || var6.field1281.field3399 == var13.field261 || var6.field1281.field3399 == var13.field251) {
                var12 = 3;
            }
            if (var6.field1275 != var12) {
                int var14 = class136.method1002(var6.field1281, (byte) 49);
                class479 var15 = var6.field1281.field5003;
                if (var15.field6636 != null) {
                    var15 = var15.method2843(class2.field30, 228);
                }
                if (var15 == null || var14 == -1) {
                    var6.field1256 = false;
                    var6.field1275 = var12;
                    var6.field1274 = -1;
                } else if (var6.field1274 == var14 && var6.field1256 == var15.field6686) {
                    var6.field1278 = var15.field6660;
                    var6.field1275 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field1260 == null) {
                        var16 = true;
                    } else {
                        var6.field1278 -= 512;
                        if (var6.field1278 <= 0) {
                            class783.field10811.method3257(var6.field1260);
                            var6.field1260 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field1278 = var15.field6660;
                        var6.field1277 = null;
                        var6.field1279 = null;
                        var6.field1256 = var15.field6686;
                        var6.field1274 = var14;
                        var6.field1275 = var12;
                    }
                }
            }
            var6.field1258 = var6.field1281.field823;
            var6.field1270 = var6.field1281.field823 + (var6.field1281.method1665(1720746760) << 8);
            var6.field1267 = var6.field1281.field813;
            var6.field1271 = var6.field1281.field813 + (var6.field1281.method1665(1720746760) << 8);
            class396.method2319(arg3, arg2, var6, arg4, arg1, -8193);
        }
        for (class96 var7 = (class96) class118.field1501.method2119(-59); var7 != null; var7 = (class96) class118.field1501.method2111((byte) -116)) {
            byte var8 = 1;
            class15 var9 = var7.field1283.method1676(0);
            if (var7.field1283.field3399 == -1 || var7.field1283.field3426) {
                var8 = 0;
            } else if (var7.field1283.field3399 == var9.field245 || var7.field1283.field3399 == var9.field241 || var7.field1283.field3399 == var9.field258 || var7.field1283.field3399 == var9.field270) {
                var8 = 2;
            } else if (var7.field1283.field3399 == var9.field271 || var7.field1283.field3399 == var9.field276 || var7.field1283.field3399 == var9.field261 || var7.field1283.field3399 == var9.field251) {
                var8 = 3;
            }
            if (var7.field1275 != var8) {
                int var10 = class427.method2544(-4293, var7.field1283);
                if (var7.field1274 == var10 && var7.field1256 == var7.field1283.field7382) {
                    var7.field1275 = var8;
                    var7.field1278 = var7.field1283.field7376;
                } else {
                    boolean var11 = false;
                    if (var7.field1260 == null) {
                        var11 = true;
                    } else {
                        var7.field1278 -= 512;
                        if (var7.field1278 <= 0) {
                            class783.field10811.method3257(var7.field1260);
                            var11 = true;
                            var7.field1260 = null;
                        }
                    }
                    if (var11) {
                        var7.field1274 = var10;
                        var7.field1256 = var7.field1283.field7382;
                        var7.field1279 = null;
                        var7.field1275 = var8;
                        var7.field1278 = var7.field1283.field7376;
                        var7.field1277 = null;
                    }
                }
            }
            var7.field1258 = var7.field1283.field823;
            var7.field1270 = var7.field1283.field823 + (var7.field1283.method1665(1720746760) << 8);
            var7.field1267 = var7.field1283.field813;
            var7.field1271 = var7.field1283.field813 + (var7.field1283.method1665(1720746760) << 8);
            class396.method2319(arg3, arg2, var7, arg4, arg1, -8193);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lqea;Lfb;)V", line = 294)
    public class212(class139 arg0, class704 arg1) {
        this.field2504 = arg0;
        this.field2496 = new class167[this.field2504.field1732.length];
        for (int var3 = 0; var3 < this.field2496.length; var3++) {
            this.field2496[var3] = arg1.method4006(this.field2504.field1732[var3], 1972392713);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)I", line = 312)
    public final int method281(boolean arg0) {
        if (arg0) {
            field2505 = null;
        }
        field2498++;
        int var2 = 0;
        class167[] var3 = this.field2496;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class167 var5 = var3[var4];
            if (var5 == null || var5.method685(-18299)) {
                var2++;
            }
        }
        return var2 * 100 / this.field2496.length;
    }
}
