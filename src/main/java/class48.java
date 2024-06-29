import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class48 extends class751 {

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    private int field680 = -1;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "[I")
    public static int[] field685 = new int[2];

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "Ljo;")
    public static class351 field672 = new class351(76, -1);

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "Lua;")
    public static class692 field689;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "[I")
    private int[] field677;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field684;
        if (~arg2 == -1) {
            this.field680 = arg1.method898((byte) -106);
        }
        int var4 = -59 % ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
    public static final void method310(int arg0, int arg1) {
        ++field675;
        if (class420.method2512((byte) 43, arg0)) {
            class321.method2084(5555, class110.field1382[arg0], -1);
            if (arg1 >= -43) {
                method312(27, -6, true, -70);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field687;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            this.field674 = 40;
        }
        if (super.field10409.field8481) {
            int var4 = this.field678 * (~class152.field2253 == ~this.field674 ? arg0 : this.field674 * arg0 / class152.field2253);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class673.field9452 != ~this.field678) {
                for (int var8 = 0; var8 < class673.field9452; ++var8) {
                    int var9 = this.field678 * var8 / class673.field9452;
                    int var10 = this.field677[var4 - -var9];
                    var7[var8] = class111.method773(var10, 255) << 4;
                    var6[var8] = class111.method773(65280, var10) >> 4;
                    var5[var8] = class111.method773(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class673.field9452 > var11; ++var11) {
                    int var12 = this.field677[var4++];
                    var7[var11] = class111.method773(4080, var12 << 4);
                    var6[var11] = class111.method773(4080, var12 >> 4);
                    var5[var11] = class111.method773(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
    public final void method311(int arg0, int arg1, int arg2) {
        super.method311(arg0, 57, arg2);
        ++field681;
        if (this.field680 >= 0 && class190.field2833 != null) {
            int var4 = class190.field2833.method1263(this.field680, (byte) 127).field2742 ? 64 : 128;
            this.field677 = class190.field2833.method1261(this.field680, var4, -13756, false, 1.0F, var4);
            this.field674 = var4;
            this.field678 = var4;
        }
        int var5 = 77 / ((arg1 - 13) / 35);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZI)V")
    public static final void method312(int arg0, int arg1, boolean arg2, int arg3) {
        ++field686;
        int var4 = class103.field1295 + arg0;
        int var5 = class175.field2496 + arg1;
        if (class378.field5427 != null && ~arg0 <= -1 && ~arg1 <= -1 && class109.field1314 > arg0 && ~arg1 > ~class760.field10479) {
            if (~class145.field1852.field9018.method2757((byte) -46) != -1 || ~class251.field3549.field7710 == ~arg3) {
                long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
                class541 var8 = (class541) class70.field959.method380((byte) -3, var6);
                if (var8 == null) {
                    class278.method1804(arg3, arg0, arg1);
                } else {
                    class6 var9 = (class6) var8.field7586.method2508((byte) 121);
                    if (var9 == null) {
                        class278.method1804(arg3, arg0, arg1);
                    } else {
                        class230 var10 = (class230) class278.method1804(arg3, arg0, arg1);
                        if (var10 == null) {
                            var10 = new class230(arg0 << 9, class622.field8777[arg3].method1976(arg0, -1, arg1), arg1 << 9, arg3, arg3);
                        } else {
                            var10.field3345 = var10.field3348 = -1;
                        }
                        var10.field3332 = var9.field62;
                        var10.field3343 = var9.field64;
                        label61: while (true) {
                            class6 var11 = (class6) var8.field7586.method2505((byte) -55);
                            if (var11 == null) {
                                break;
                            }
                            if (var10.field3332 != var11.field62) {
                                var10.field3345 = var11.field62;
                                var10.field3334 = var11.field64;
                                while (true) {
                                    class6 var12 = (class6) var8.field7586.method2505((byte) -55);
                                    if (var12 == null) {
                                        break label61;
                                    }
                                    if (~var10.field3332 != ~var12.field62 && ~var10.field3345 != ~var12.field62) {
                                        var10.field3351 = var12.field64;
                                        var10.field3348 = var12.field62;
                                    }
                                }
                            }
                        }
                        if (arg2) {
                            int var13 = class580.method3366(arg3, (byte) -95, (arg1 << 9) - -256, (arg0 << 9) + 256);
                            var10.field3338 = 0;
                            var10.field7710 = (byte) arg3;
                            var10.field7711 = (byte) arg3;
                            var10.field7718 = arg0 << 9;
                            var10.field7723 = var13;
                            var10.field7719 = arg1 << 9;
                            if (class627.method3593(arg0, (byte) -122, arg1)) {
                                ++var10.field7711;
                            }
                            class746.method4163(arg3, arg0, arg1, var13, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public final void method313(int arg0) {
        ++field683;
        super.method313(arg0);
        this.field677 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method314(String arg0, int arg1) {
        ++field676;
        class422.method2520(0, arg1, arg0, "", "", -117, "");
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILli;)I")
    public static final int method315(int arg0, class449 arg1) {
        ++field682;
        if (~arg1.field6370 == -1) {
            return 0;
        } else {
            if (~arg1.field6343 != 0) {
                class449 var2 = null;
                if (arg1.field6343 >= 32768) {
                    if (~arg1.field6343 <= -32769) {
                        var2 = class581.field8250[arg1.field6343 + -32768];
                    }
                } else {
                    class14 var3 = (class14) class543.field7606.method380((byte) -3, (long) arg1.field6343);
                    if (var3 != null) {
                        var2 = var3.field262;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field7718 + arg1.field7718;
                    int var5 = -var2.field7719 + arg1.field7719;
                    if (var4 != 0 || var5 != 0) {
                        arg1.method2690(16383 & (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D), true);
                    }
                }
            }
            if (arg0 >= -9) {
                field672 = null;
            }
            if (!(arg1 instanceof class559)) {
                if (arg1 instanceof class645) {
                    class645 var6 = (class645) arg1;
                    if (var6.field9076 != -1 && (~var6.field6443 == -1 || var6.field6440 > 0)) {
                        int var7 = -((-class103.field1295 + var6.field9076 - class103.field1295) * 256) + var6.field7718;
                        int var8 = -((-class175.field2496 + -class175.field2496 + var6.field9072) * 256) + var6.field7719;
                        if (var7 != 0 || var8 != 0) {
                            var6.method2690(16383 & (int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)), true);
                        }
                        var6.field9076 = -1;
                    }
                }
            } else {
                class559 var9 = (class559) arg1;
                if (~var9.field7960 != 0 && (~var9.field6443 == -1 || var9.field6440 > 0)) {
                    var9.method2690(var9.field7960, true);
                    var9.field7960 = -1;
                }
            }
            return arg1.method2701(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)V")
    public static void method316(byte arg0) {
        field685 = null;
        field672 = null;
        if (arg0 >= 60) {
            field689 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        if (arg0 != -1) {
            method315(74, (class449) null);
        }
        ++field679;
        return this.field680;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class48() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZILcb;IBIJ)V")
    public static final void method318(boolean arg0, int arg1, class544 arg2, int arg3, byte arg4, int arg5, long arg6) {
        class332.method2147(arg2, arg6, arg5, arg0, arg3, 0, -54, arg1);
        ++field673;
        if (arg4 != -114) {
            field689 = null;
        }
    }
}
