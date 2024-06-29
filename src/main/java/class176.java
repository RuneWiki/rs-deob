import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class176 extends class59 {

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    private int field3328 = 0;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    private int field3329 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    private int field3337 = 1365;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field3333 = 20;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lsd;")
    public static class166 field3335 = class135.method935("Verbindung mit Update)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field3332;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field3329 = arg0.method405(2);
                    }
                } else {
                    this.field3328 = arg0.method405(2);
                }
            } else {
                this.field3333 = arg0.method405(2);
            }
        } else {
            this.field3337 = arg0.method405(2);
        }
        if (arg1 <= 18) {
            method1200((byte) 11, 82);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Z")
    public static final boolean method1200(byte arg0, int arg1) {
        if (arg0 != -36) {
            field3335 = null;
        }
        ++field3334;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class200.field3970[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1004;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3335 = null;
        if (arg0 != 65535) {
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field3330;
        if (arg1 >= -124) {
            return null;
        } else {
            int[] var3 = super.field1219.method721(arg0, -124);
            if (super.field1219.field1816) {
                for (int var4 = 0; ~class98.field1879 < ~var4; ++var4) {
                    int var5 = (class136.field2657[arg0] << 12) / this.field3337 + this.field3329;
                    int var6 = (class187.field3569[var4] << 12) / this.field3337 - -this.field3328;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var6;
                    int var10 = var6 * var6 >> 12;
                    int var11 = var5;
                    int var12 = var5 * var5 >> 12;
                    int var13 = 0;
                    while (~(var10 + var12) > -16385 && var13 < this.field3333) {
                        ++var13;
                        var11 = (var9 * var11 >> 12) * 2 + var7;
                        var9 = -var12 + var8 + var10;
                        var12 = var11 * var11 >> 12;
                        var10 = var9 * var9 >> 12;
                    }
                    var3[var4] = this.field3333 + -1 > var13 ? (var13 << 12) / this.field3333 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static final void method1202(int arg0) {
        for (int var1 = 0; class206.field4058 > var1; ++var1) {
            int var2 = class2.field11[var1];
            class154 var3 = class124.field2434[var2];
            int var4 = class179.field3377.method400(255);
            if (~(64 & var4) != -1) {
                var3.field3500 = class179.field3377.method427((byte) -90);
                var3.field3484 = class179.field3377.method405(2);
            }
            if (~(var4 & 4) != -1) {
                var3.field3497 = class179.field3377.method423((byte) -90);
                if (~var3.field3497 == -65536) {
                    var3.field3497 = -1;
                }
            }
            if (~(var4 & 32) != -1) {
                var3.field3501 = class179.field3377.method398((byte) 82);
                int var5 = class179.field3377.method395(-2);
                if (var3.field3501 == 65535) {
                    var3.field3501 = -1;
                }
                var3.field3533 = (65535 & var5) + class49.field910;
                var3.field3517 = 0;
                var3.field3511 = var5 >> 16;
                var3.field3550 = 0;
                if (class49.field910 < var3.field3533) {
                    var3.field3550 = -1;
                }
            }
            if ((var4 & 16) != 0) {
                var3.field2958 = class185.method1252(class179.field3377.method423((byte) -90), 24851);
                var3.field3507 = var3.field2958.field1603;
                var3.field3496 = var3.field2958.field1580;
                var3.field3492 = var3.field2958.field1574;
                var3.field3528 = var3.field2958.field1566;
                var3.field3508 = var3.field2958.field1576;
                var3.field3525 = var3.field2958.field1563;
                var3.field3490 = var3.field2958.field1562;
                var3.field3539 = var3.field2958.field1559;
                var3.field3516 = var3.field2958.field1571;
            }
            if (~(var4 & 1) != -1) {
                var3.field3495 = class179.field3377.method436((byte) -63);
                var3.field3527 = 100;
            }
            if ((8 & var4) != 0) {
                int var6 = class179.field3377.method427((byte) -115);
                int var7 = class179.field3377.method393((byte) 25);
                if (~var6 == -65536) {
                    var6 = -1;
                }
                if (~var3.field3543 == ~var6 && ~var6 != 0) {
                    int var8 = class110.method798(var6, 12).field1276;
                    if (var8 == 1) {
                        var3.field3547 = 0;
                        var3.field3519 = 0;
                        var3.field3530 = var7;
                        var3.field3529 = 0;
                    }
                    if (~var8 == -3) {
                        var3.field3547 = 0;
                    }
                } else if (var6 == -1 || ~var3.field3543 == 0 || class110.method798(var6, 12).field1282 >= class110.method798(var3.field3543, 12).field1282) {
                    var3.field3529 = 0;
                    var3.field3543 = var6;
                    var3.field3547 = 0;
                    var3.field3483 = var3.field3514;
                    var3.field3530 = var7;
                    var3.field3519 = 0;
                }
            }
            if (~(var4 & 2) != -1) {
                int var9 = class179.field3377.method424((byte) 126);
                int var10 = class179.field3377.method424((byte) -112);
                var3.method1240(var9, (byte) 127, var10, class49.field910);
                var3.field3487 = class49.field910 + 300;
                var3.field3545 = class179.field3377.method393((byte) 25);
                var3.field3503 = class179.field3377.method424((byte) 109);
            }
            if ((var4 & 128) != 0) {
                int var11 = class179.field3377.method433((byte) -97);
                int var12 = class179.field3377.method433((byte) -60);
                var3.method1240(var11, (byte) 127, var12, class49.field910);
                var3.field3487 = class49.field910 + 300;
                var3.field3545 = class179.field3377.method393((byte) 25);
                var3.field3503 = class179.field3377.method400(255);
            }
        }
        if (arg0 >= -107) {
            field3335 = null;
        }
        ++field3331;
    }
}
