import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class58 extends class73 {

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field1015 = 0;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Lib;")
    public static class78 field1016 = new class78();

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lli;")
    public static class185 field1022 = class245.method1649("sch-Utteln:", 123);

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[I")
    public static int[] field1028 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lel;")
    public class100 field1007;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lel;")
    public class100 field1013;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lki;")
    public class135 field1018;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Lti;")
    public class188 field1024;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "Lhi;")
    public static class250 field1019;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lie;")
    public class71 field1012;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "Z")
    public boolean field1030;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    public int[] field1014;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method397(int arg0) {
        if (arg0 <= 119) {
            this.method397(-123);
        }
        field1031++;
        int var2 = this.field1029;
        if (this.field1018 != null) {
            class135 var5 = this.field1018.method964((byte) -96);
            if (var5 == null) {
                this.field1008 = 0;
                this.field1025 = 0;
                this.field1029 = -1;
                this.field1014 = null;
                this.field1006 = 0;
            } else {
                this.field1006 = var5.field2522;
                this.field1008 = var5.field2486 * 128;
                this.field1025 = var5.field2549;
                this.field1029 = var5.field2531;
                this.field1014 = var5.field2509;
            }
        } else if (this.field1012 != null) {
            int var3 = class212.method1486(this.field1012, -85);
            if (var2 != var3) {
                this.field1029 = var3;
                class81 var4 = this.field1012.field1236;
                if (var4.field1411 != null) {
                    var4 = var4.method525((byte) -88);
                }
                if (var4 == null) {
                    this.field1008 = 0;
                } else {
                    this.field1008 = var4.field1419 * 128;
                }
            }
        } else if (this.field1024 != null) {
            this.field1029 = class189.method1362(this.field1024, true);
            this.field1008 = this.field1024.field3508 * 128;
        }
        if (this.field1029 != var2 && this.field1007 != null) {
            class90.field1744.method802(this.field1007);
            this.field1007 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBII)Lnb;")
    public static final class271 method398(int arg0, byte arg1, int arg2, int arg3) {
        field1033++;
        class271 var4 = new class271();
        var4.field4811 = arg2;
        var4.field4810 = arg3;
        class87.field1715.method190(var4, (byte) -89, (long) arg0);
        class227.method1569(arg2, (byte) 15);
        class82 var5 = class116.method805(1, arg0);
        if (var5 != null) {
            class229.method1581(var5, false);
        }
        if (class225.field4118 != null) {
            class229.method1581(class225.field4118, false);
            class225.field4118 = null;
        }
        int var6 = class127.field2283;
        int var7 = -6 / ((arg1 - 64) / 47);
        for (int var8 = 0; var8 < var6; var8++) {
            if (class215.method1512(-42, class55.field936[var8])) {
                class265.method1808(var8, (byte) 127);
            }
        }
        if (class127.field2283 == 1) {
            class112.field2027 = false;
            class142.method1017(class199.field3651, class90.field1755, (byte) -107, class110.field1977, class97.field1815);
        } else {
            class142.method1017(class199.field3651, class90.field1755, (byte) -100, class110.field1977, class97.field1815);
            int var9 = class82.field1608.method1843(class157.field2973);
            for (int var10 = 0; var10 < class127.field2283; var10++) {
                int var11 = class82.field1608.method1843(class269.method1824((byte) -29, var10));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class110.field1977 = var9 + 8;
            class97.field1815 = (class176.field3218 ? 26 : 22) + class127.field2283 * 15;
        }
        if (var5 != null) {
            class116.method809(1815818576, var5, false);
        }
        class154.method1094(3, arg2);
        if (class275.field4877 != -1) {
            class151.method1071(1, true, class275.field4877);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method399(int arg0) {
        field1016 = null;
        field1028 = null;
        field1022 = null;
        if (arg0 <= 50) {
            field1022 = null;
        }
        field1019 = null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Ldd;")
    public static final class211 method400(int arg0) {
        field1021++;
        int var1 = class55.field940[0] * class258.field4591[0];
        byte[] var2 = class174.field3182[0];
        if (arg0 != 12101) {
            field1016 = null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class211.field3842[class220.method1526(255, var2[var4])];
        }
        class101 var5 = new class101(class87.field1716, class210.field3839, class145.field2766[0], class249.field4418[0], class55.field940[0], class258.field4591[0], var3);
        class269.method1827((byte) -96);
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    public static final int method401(int arg0, int arg1, int arg2) {
        field1026++;
        class18 var3 = (class18) class152.field2871.method195(35, (long) arg2);
        if (var3 == null) {
            return -1;
        } else {
            if (arg0 != -24378) {
                method401(25, 97, -66);
            }
            return arg1 >= 0 && arg1 < var3.field286.length ? var3.field286[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLnb;Z)V")
    public static final void method402(byte arg0, class271 arg1, boolean arg2) {
        field1020++;
        int var3 = (int) arg1.field1278;
        int var4 = arg1.field4811;
        arg1.method476(88);
        if (arg2) {
            class226.method1563(0, var4);
        }
        class205.method1456(var4, -94);
        class82 var5 = class116.method805(arg0 - 37, var3);
        if (var5 != null) {
            class229.method1581(var5, false);
        }
        int var6 = class127.field2283;
        int var7 = 0;
        if (arg0 != 38) {
            return;
        }
        while (var7 < var6) {
            if (class215.method1512(arg0 - 80, class55.field936[var7])) {
                class265.method1808(var7, (byte) 126);
            }
            var7++;
        }
        if (class127.field2283 == 1) {
            class112.field2027 = false;
            class142.method1017(class199.field3651, class90.field1755, (byte) -58, class110.field1977, class97.field1815);
        } else {
            class142.method1017(class199.field3651, class90.field1755, (byte) -91, class110.field1977, class97.field1815);
            int var8 = class82.field1608.method1843(class157.field2973);
            for (int var9 = 0; var9 < class127.field2283; var9++) {
                int var10 = class82.field1608.method1843(class269.method1824((byte) 121, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class110.field1977 = var8 + 8;
            class97.field1815 = (class176.field3218 ? 26 : 22) + class127.field2283 * 15;
        }
        if (class275.field4877 != -1) {
            class151.method1071(1, true, class275.field4877);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIILbb;IJ)Z")
    public static final boolean method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class75 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class122.method897(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
