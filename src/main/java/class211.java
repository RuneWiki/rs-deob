import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class211 extends class273 {

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    private int field3379 = 204;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field3388 = 1;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field3385 = 1;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lf;")
    public static class227 field3386 = new class227(64);

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Lic;")
    public static class160 field3389 = new class160(2);

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3390 = "Select";

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class211() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1402(String arg0, byte arg1) {
        ++field3381;
        if (class143.field2358 != null && ~arg0.length() != -1) {
            if (arg1 != 125) {
                return -53;
            } else {
                for (int var2 = 0; class143.field2358.field4048 > var2; ++var2) {
                    if (class189.method1303("<br>", " ", (byte) -102, class143.field2358.field4057[var2]).equals(arg0)) {
                        return var2;
                    }
                }
                return -1;
            }
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
    public static final void method1403(byte arg0, int arg1) {
        ++field3384;
        if (class279.method1878(0, arg1)) {
            class20.method167(class128.field2119[arg1], -1, arg0 + 1968);
            if (arg0 != 79) {
                field3382 = -118;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lig;I)Lgl;")
    public static final class273 method1404(class136 arg0, int arg1) {
        ++field3380;
        arg0.method1012(4);
        int var2 = arg0.method1012(4);
        class273 var3 = class164.method1181((byte) 125, var2);
        var3.field4363 = arg0.method1012(4);
        int var4 = arg0.method1012(4);
        for (int var5 = arg1; var4 > var5; ++var5) {
            int var6 = arg0.method1012(arg1 ^ 4);
            var3.method2(arg0, var6, 5);
        }
        var3.method108(-115);
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field3387;
        int[] var3 = super.field4359.method387((byte) 126, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field4359.field833) {
                for (int var4 = 0; class26.field458 > var4; ++var4) {
                    int var5 = class255.field4068[arg1];
                    int var6 = class265.field4234[var4];
                    int var7 = this.field3385 * var5 >> 12;
                    int var8 = this.field3388 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3385) * this.field3385;
                    int var10 = var6 % (4096 / this.field3388) * this.field3388;
                    if (var9 < this.field3379) {
                        for (var8 -= var7; var8 < 0; var8 += 4) {
                        }
                        while (~var8 < -4) {
                            var8 -= 4;
                        }
                        if (var8 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var10 > ~this.field3379) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var10 < this.field3379) {
                        int var11;
                        for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
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
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3390 = null;
        int var1 = 115 % ((arg0 - 65) / 52);
        field3386 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3379 = arg0.method996(65280);
                }
            } else {
                this.field3385 = arg0.method1012(4);
            }
        } else {
            this.field3388 = arg0.method1012(4);
        }
        if (arg2 != 5) {
            this.method4(true, 75);
        }
        ++field3383;
    }
}
