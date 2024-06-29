import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class200 {

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Lid;")
    public static class149 field58 = class60.method382("<br>(X", (byte) 53);

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "[I")
    public static int[] field50 = new int[128];

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "Lid;")
    public static class149 field53 = class60.method382(" )2> <col=ffffff>", (byte) 126);

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "[[[I")
    public static int[][][] field66;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIB)Lqd;")
    public static final class3 method22(int arg0, int arg1, int arg2, byte arg3) {
        ++field65;
        class3 var4 = new class3();
        var4.field37 = arg0;
        var4.field42 = arg1;
        if (arg3 < 78) {
            return null;
        } else {
            class34.field499.method638((byte) -89, var4, (long) arg2);
            class90.method660(arg1, 0);
            class47 var5 = class251.method1741((byte) 110, arg2);
            if (var5 != null) {
                class182.method1267(var5, 90);
            }
            if (class263.field4677 != null) {
                class182.method1267(class263.field4677, 123);
                class263.field4677 = null;
            }
            int var6 = class60.field1092;
            for (int var7 = 0; ~var7 > ~var6; ++var7) {
                if (class246.method1713(29050, class284.field5032[var7])) {
                    class35.method205(var7, false);
                }
            }
            if (~class60.field1092 != -2) {
                class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
                int var8 = class173.field3180.method1161(class198.field3603);
                for (int var9 = 0; ~class60.field1092 < ~var9; ++var9) {
                    int var10 = class173.field3180.method1161(class59.method365(var9, (byte) 116));
                    if (var8 < var10) {
                        var8 = var10;
                    }
                }
                class82.field1499 = var8 + 8;
                client.field2845 = class60.field1092 * 15 + (class23.field324 ? 26 : 22);
            } else {
                class32.field481 = false;
                class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
            }
            if (var5 != null) {
                class258.method1777(false, var5, 111);
            }
            class74.method501(arg1, (byte) -89);
            if (~class11.field161 != 0) {
                class275.method1901((byte) 89, class11.field161, 1);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V")
    private final void method23(int arg0, int arg1, byte arg2) {
        ++field54;
        int var4 = class73.field1263[arg0];
        int var5 = class93.field1644[arg1];
        if (arg2 >= -82) {
            field60 = -102;
        }
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class232.field4092 = arg0;
            class259.field4557 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class232.field4092 = arg1;
            class259.field4557 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class259.field4557 = arg0;
            class232.field4092 = class137.field2515 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class259.field4557 = -arg1 + class276.field4934;
            class232.field4092 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class232.field4092 = class137.field2515 - arg0;
            class259.field4557 = class276.field4934 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class232.field4092 = -arg1 + class137.field2515;
            class259.field4557 = -arg0 + class276.field4934;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class232.field4092 = arg1;
            class259.field4557 = -arg0 + class276.field4934;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class232.field4092 = -arg0 + class137.field2515;
            class259.field4557 = arg1;
        }
        class232.field4092 &= class261.field4667;
        class259.field4557 &= class191.field3436;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 98);
        ++field57;
        if (super.field3632.field2550) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class137.field2515; ++var7) {
                this.method23(var7, arg1, (byte) -117);
                int[][] var8 = this.method1366(class259.field4557, false, 0);
                var4[var7] = var8[0][class232.field4092];
                var6[var7] = var8[1][class232.field4092];
                var5[var7] = var8[2][class232.field4092];
            }
        }
        if (!arg0) {
            method29(16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)Lqk;")
    public static final class208 method25(byte arg0) {
        if (arg0 <= 12) {
            field53 = null;
        }
        class107.field1852 = 0;
        ++field56;
        return class155.method1097(-73);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field55;
        if (arg1 != 55) {
            field58 = null;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            for (int var4 = 0; var4 < class137.field2515; ++var4) {
                this.method23(var4, arg0, (byte) -83);
                int[] var5 = this.method1368(0, class259.field4557, false);
                var3[var4] = var5[class232.field4092];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public static final void method27(int arg0) {
        class124.field2189.method1290((byte) -100);
        class98.field1743.method1290((byte) 76);
        ++field61;
        class127.field2234.method1290((byte) 60);
        if (arg0 != -15068) {
            method27(57);
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public static final void method28(int arg0) {
        ++field62;
        boolean var1 = false;
        int var2 = -63 % ((25 - arg0) / 40);
        while (!var1) {
            var1 = true;
            for (int var3 = 0; ~(class60.field1092 + -1) < ~var3; ++var3) {
                if (~class284.field5032[var3] > -1001 && class284.field5032[var3 + 1] > 1000) {
                    var1 = false;
                    class149 var4 = class78.field1456[var3];
                    class78.field1456[var3] = class78.field1456[var3 + 1];
                    class78.field1456[var3 + 1] = var4;
                    class149 var5 = class138.field2517[var3];
                    class138.field2517[var3] = class138.field2517[var3 + 1];
                    class138.field2517[var3 + 1] = var5;
                    int var6 = class152.field2767[var3];
                    class152.field2767[var3] = class152.field2767[var3 + 1];
                    class152.field2767[var3 - -1] = var6;
                    int var7 = class287.field5097[var3];
                    class287.field5097[var3] = class287.field5097[var3 + 1];
                    class287.field5097[var3 - -1] = var7;
                    int var8 = class224.field3941[var3];
                    class224.field3941[var3] = class224.field3941[var3 + 1];
                    class224.field3941[var3 - -1] = var8;
                    short var9 = class284.field5032[var3];
                    class284.field5032[var3] = class284.field5032[var3 - -1];
                    class284.field5032[var3 - -1] = var9;
                    long var10 = class260.field4584[var3];
                    class260.field4584[var3] = class260.field4584[var3 + 1];
                    class260.field4584[var3 + 1] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method29(int arg0) {
        field66 = null;
        if (arg0 != 0) {
            field66 = null;
        }
        field50 = null;
        field58 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)I")
    public static final int method30(int arg0, int arg1) {
        ++field59;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 109) {
            field58 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3641 = arg0.method489((byte) 83) == 1;
        }
        if (!arg1) {
            method27(-11);
        }
        ++field51;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)V")
    public static final void method32(int arg0, int arg1) {
        ++field52;
        class216 var2 = class139.method972(arg1, false, 10);
        if (arg0 != 2174) {
            method32(116, -50);
        }
        var2.method1457(0);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }
}
