import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ee")
public class class46 extends class85 {

    @OriginalMember(owner = "ee", name = "U", descriptor = "I")
    private int field959 = 1;

    @OriginalMember(owner = "ee", name = "Z", descriptor = "I")
    private int field964 = 204;

    @OriginalMember(owner = "ee", name = "bb", descriptor = "I")
    private int field966 = 1;

    @OriginalMember(owner = "ee", name = "V", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "ee", name = "Q", descriptor = "Lvg;")
    public static class200 field955 = null;

    @OriginalMember(owner = "ee", name = "X", descriptor = "Llf;")
    public static class109 field962 = class35.method275("(Z", 2);

    @OriginalMember(owner = "ee", name = "Y", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "ee", name = "R", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "ee", name = "T", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "ee", name = "W", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "ee", name = "cb", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "ee", name = "ab", descriptor = "Loh;")
    public static class138 field965;

    @OriginalMember(owner = "ee", name = "S", descriptor = "Ldb;")
    public static class33 field957;

    @OriginalMember(owner = "ee", name = "<init>", descriptor = "()V")
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "ee", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 > -120) {
            method320(62, (class86) null);
        }
        ++field961;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field964 = arg2.method569(true);
                }
            } else {
                this.field966 = arg2.method598((byte) 94);
            }
        } else {
            this.field959 = arg2.method598((byte) 115);
        }
    }

    @OriginalMember(owner = "ee", name = "e", descriptor = "(I)V")
    public static void method319(int arg0) {
        field965 = null;
        field962 = null;
        field955 = null;
        field957 = null;
        if (arg0 != 1) {
            method320(81, (class86) null);
        }
    }

    @OriginalMember(owner = "ee", name = "a", descriptor = "(ILja;)V")
    public static final void method320(int arg0, class86 arg1) {
        ++field967;
        if (arg0 <= 68) {
            method320(-76, (class86) null);
        }
        if (client.field683 != null) {
            try {
                client.field683.method477(0L, false);
                client.field683.method474(arg1.field1808, arg1.field1773, (byte) 19, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field1773 += 24;
    }

    @OriginalMember(owner = "ee", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field956;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 >= -49) {
            return null;
        } else {
            if (super.field1736.field2253) {
                for (int var4 = 0; var4 < class57.field1152; ++var4) {
                    int var5 = class47.field980[var4];
                    int var6 = class54.field1083[arg1];
                    int var7 = this.field959 * var5 >> 12;
                    int var8 = this.field966 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field959) * this.field959;
                    int var10 = var6 % (4096 / this.field966) * this.field966;
                    if (~this.field964 < ~var10) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field964 < ~var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field964 > var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
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
}
