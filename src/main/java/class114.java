import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class114 extends class68 {

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    private int field1639 = 204;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    private int field1642 = 1;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    private int field1641 = 1;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[I")
    public static int[] field1638 = new int[5];

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            method771(false, (byte) 10);
        }
        ++field1637;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            for (int var4 = 0; ~class89.field1248 < ~var4; ++var4) {
                int var5 = class215.field3231[var4];
                int var6 = class127.field1794[arg0];
                int var7 = this.field1641 * var5 >> 12;
                int var8 = this.field1642 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1641) * this.field1641;
                int var10 = var6 % (4096 / this.field1642) * this.field1642;
                if (~this.field1639 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1639 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1639 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
    public static void method770(int arg0) {
        field1638 = null;
        if (arg0 != 11452) {
            method771(true, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZB)V")
    public static final void method771(boolean arg0, byte arg1) {
        ++field1643;
        if (class125.field1749 == !arg0) {
            class125.field1749 = arg0;
            class155.method1031((byte) -124);
            if (arg1 <= 35) {
                field1638 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1639 = arg0.method1445(false);
                }
            } else {
                this.field1642 = arg0.method1453((byte) -128);
            }
        } else {
            this.field1641 = arg0.method1453((byte) -128);
        }
        ++field1640;
        if (!arg2) {
            this.field1642 = 51;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLgf;I)V")
    public static final void method772(boolean arg0, class126 arg1, int arg2) {
        ++field1636;
        if (arg0) {
            int var3 = class197.field2739;
            int var4 = var3 * 956 / 503;
            class219.field3292.method705((class275.field4263 - var4) / 2, 0, var4, var3);
            class229.field3476.method452(class275.field4263 / 2 + -(class229.field3476.field2611 / 2), 18);
        }
        arg1.method825(class277.field4291, class275.field4263 / 2, class197.field2739 / 2 + -26, 16777215, -1);
        int var5 = class197.field2739 / arg2 + -18;
        class64.method393(class275.field4263 / 2 - 152, var5, 304, 34, 9179409);
        class64.method393(class275.field4263 / 2 + -151, var5 + 1, 302, 32, 0);
        class64.method401(class275.field4263 / 2 + -150, var5 - -2, class92.field1276 * 3, 30, 9179409);
        class64.method401(class92.field1276 * 3 + class275.field4263 / 2 + -150, var5 + 2, 300 - class92.field1276 * 3, 30, 0);
        arg1.method825(class215.field3250, class275.field4263 / 2, class197.field2739 / 2 + 4, 16777215, -1);
    }
}
