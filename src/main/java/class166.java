import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class166 extends class87 {

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Ljava/awt/Font;")
    public static Font field2544;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class166() {
        this(4096);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public static final void method1187(byte arg0) {
        if (arg0 >= -127) {
            method1187((byte) 110);
        }
        ++field2545;
        for (int var1 = 0; class43.field571 > var1; ++var1) {
            int var10002 = class252.field3798[var1]--;
            if (class252.field3798[var1] >= -10) {
                class178 var3 = class261.field4035[var1];
                if (var3 == null) {
                    var3 = class178.method1266(class222.field3255, class158.field2463[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class252.field3798[var1] += var3.method1265();
                    class261.field4035[var1] = var3;
                }
                if (~class252.field3798[var1] > -1) {
                    int var10;
                    if (~class101.field1714[var1] != -1) {
                        int var4 = (class101.field1714[var1] & 255) * 128;
                        int var5 = (class101.field1714[var1] & 16748261) >> 16;
                        int var6 = var5 * 128 + 64 - class213.field3139.field3660;
                        int var7 = 255 & class101.field1714[var1] >> 8;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 + -class213.field3139.field3753;
                        if (~var8 > -1) {
                            var8 = -var8;
                        }
                        int var9 = var8 + -128 + var6;
                        if (var9 > var4) {
                            class252.field3798[var1] = -100;
                            continue;
                        }
                        if (~var9 > -1) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class171.field2582 * class125.field2117[var1] / var4 >> 8;
                    } else {
                        var10 = class125.field2117[var1] * class208.field3085 >> 8;
                    }
                    if (var10 > 0) {
                        class105 var11 = var3.method1264().method818(class264.field4236);
                        class184 var12 = class184.method1308(var11, 100, var10);
                        var12.method1320(class55.field810[var1] + -1);
                        class241.field3543.method1249(var12);
                    }
                    class252.field3798[var1] = -100;
                }
            } else {
                --class43.field571;
                for (int var2 = var1; ~class43.field571 < ~var2; ++var2) {
                    class158.field2463[var2] = class158.field2463[var2 + 1];
                    class261.field4035[var2] = class261.field4035[var2 - -1];
                    class55.field810[var2] = class55.field810[var2 + 1];
                    class252.field3798[var2] = class252.field3798[var2 + 1];
                    class101.field1714[var2] = class101.field1714[var2 + 1];
                    class125.field2117[var2] = class125.field2117[var2 + 1];
                }
                --var1;
            }
        }
        if (class101.field1710 && !class86.method638(true)) {
            if (~class99.field1688 != -1 && ~class48.field667 != 0) {
                class120.method889(class300.field4850, class48.field667, false, 0, (byte) -125, class99.field1688);
            }
            class101.field1710 = false;
        } else if (~class99.field1688 != -1 && ~class48.field667 != 0 && !class86.method638(true)) {
            class144.field2338.method683(true, 250);
            ++class204.field3012;
            class144.field2338.method385(class48.field667, 455748840);
            class48.field667 = -1;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field2546;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            class117.method875(var3, 0, class206.field3032, this.field2547);
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field2549;
        if (~arg1 == -1) {
            this.field2547 = (arg0.method366(-16505) << 12) / 255;
        }
        if (arg2 != 25645) {
            this.field2547 = -11;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static void method1188(boolean arg0) {
        if (!arg0) {
            field2544 = null;
        }
        field2544 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
    public class166(int arg0) {
        super(0, true);
        this.field2547 = 4096;
        this.field2547 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IZ)V")
    public static final void method1189(int arg0, boolean arg1) {
        class46.field643 = null;
        class46.field644 = null;
        class101.field1715 = null;
        class46.field637 = null;
        ++field2548;
        class46.field631 = null;
        class46.field632 = null;
        if (arg1 && class46.field628 != null) {
            class214.field3149 = class46.field628.field3562;
        } else {
            class214.field3149 = -1;
        }
        class73.field1141 = null;
        class46.field639 = null;
        if (arg0 <= 49) {
            method1188(true);
        }
        class46.field635 = null;
        class89.field1439 = 0;
        class46.field628 = null;
        class46.field636 = null;
        class46.field625.method1449(-12452);
        class63.field964 = null;
        class231.field3396 = null;
        class220.field3214 = null;
        class270.field4342 = -1;
        class190.field2816 = null;
        class13.field154 = null;
        class46.field626 = null;
        class172.field2601 = null;
        class260.field4029 = null;
        class303.field4908 = null;
        class155.field2414 = null;
        class39.field521 = -1;
        class151.method1122(-1);
        class221.field3225 = null;
        class171.field2584 = null;
        class312.field4998 = null;
        class294.method1997((byte) 118, 128, 64);
        class243.method1663(64, (byte) 78);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIZI)I")
    public static final int method1190(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2543;
        class101 var4 = (class101) class142.field2308.method1073(-1, (long) arg1);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = arg3;
            for (int var6 = 0; var4.field1717.length > var6; ++var6) {
                if (var4.field1717[var6] >= 0 && var4.field1717[var6] < class32.field402) {
                    class31 var7 = class12.method88(var4.field1717[var6], arg3 ^ 27838);
                    if (var7.field372 != null) {
                        class108 var8 = (class108) var7.field372.method1073(-1, (long) arg0);
                        if (var8 != null) {
                            if (!arg2) {
                                var5 += var8.field1828;
                            } else {
                                var5 += var4.field1713[var6] * var8.field1828;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }
}
