import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class51 extends class59 {

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    private int field925 = 4096;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    private int field926 = 0;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "Lsc;")
    public static class165 field921 = new class165();

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Lsd;")
    public static class166 field931 = class135.method935(")4slr)3ws?order=LPWM", 0);

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lsd;")
    public static class166 field930 = class135.method935(" (X", 0);

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lsd;")
    private static class166 field933 = class135.method935("glow2:", 0);

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "Lsd;")
    public static class166 field935 = field933;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lsd;")
    public static class166 field928 = field933;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lsd;")
    public static class166 field927 = class135.method935("Bitte wenden Sie sich an den Kundendienst)3", 0);

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "Lsd;")
    public static class166 field937 = class135.method935("::qa_op_test", 0);

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lsd;")
    private static class166 field936 = class135.method935("To create a new account you need to", 0);

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lsd;")
    public static class166 field932 = field936;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Z")
    public static boolean field934;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field1207.method528(85, arg1);
            if (super.field1207.field1320) {
                int[][] var4 = this.method498(arg1, 0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var4[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; ~class98.field1879 < ~var11; ++var11) {
                    int var12 = var8[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (~var12 > ~this.field926) {
                        var7[var11] = this.field926;
                    } else if (~var12 >= ~this.field925) {
                        var7[var11] = var12;
                    } else {
                        var7[var11] = this.field925;
                    }
                    if (var13 < this.field926) {
                        var10[var11] = this.field926;
                    } else if (var13 <= this.field925) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field925;
                    }
                    if (this.field926 <= var14) {
                        if (this.field925 >= var14) {
                            var9[var11] = var14;
                        } else {
                            var9[var11] = this.field925;
                        }
                    } else {
                        var9[var11] = this.field926;
                    }
                }
            }
            ++field923;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)I")
    public static final int method379(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 16711935) {
            return -47;
        } else {
            int var4 = -arg3 + 256;
            ++field922;
            return (16711680 & (arg0 & 65280) * arg3 + (arg2 & 65280) * var4) + (-16711936 & (arg0 & 16711935) * arg3 + (arg2 & 16711935) * var4) >> 8;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBLf;Lf;)V")
    public static final void method380(boolean arg0, byte arg1, class47 arg2, class47 arg3) {
        class35.field658 = arg3;
        client.field508 = arg2;
        ++field919;
        class143.field2780 = arg0;
        if (arg1 != 78) {
            method379(39, 124, 78, -45);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public static void method381(byte arg0) {
        field932 = null;
        field921 = null;
        field928 = null;
        field927 = null;
        field931 = null;
        if (arg0 < 95) {
            method381((byte) 11);
        }
        field936 = null;
        field933 = null;
        field930 = null;
        field937 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 >= -124) {
            return null;
        } else {
            int[] var3 = super.field1219.method721(arg0, -127);
            ++field918;
            if (super.field1219.field1816) {
                int[] var4 = this.method499(0, arg0, 0);
                for (int var5 = 0; class98.field1879 > var5; ++var5) {
                    int var6 = var4[var5];
                    if (this.field926 <= var6) {
                        if (~var6 < ~this.field925) {
                            var3[var5] = this.field925;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field926;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class51() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field920;
        if (arg1 < 18) {
            field921 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1216 = ~arg0.method400(255) == -2;
                }
            } else {
                this.field925 = arg0.method405(2);
            }
        } else {
            this.field926 = arg0.method405(2);
        }
    }
}
